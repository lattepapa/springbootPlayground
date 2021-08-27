package com.harder.springboot.config.auth;

import com.harder.springboot.domain.user.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@RequiredArgsConstructor
@EnableWebSecurity
// SpringSecurity 설정들을 활성화해준다
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final CustomOAuth2UserService customOAuth2UserService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .headers().frameOptions().disable() // h2-console 화면을 사용하기 위해 해당 옵션들은 disable 처리
                .and()
                    .authorizeRequests()
                    // authorizeRequests() : url별 권한 관리를 설정하는 옵션의 시작점으로, antMatchers 옵션을 사용하게 해준다
                    .antMatchers("/", "/css/**", "/images/**", "/js/**", "/h2-console/**").permitAll()
                    .antMatchers("/api/v1/**").hasRole(Role.USER.name())
                    // antMatchers() : 권한관리 대상을 지정하는 옵션
                    .anyRequest().authenticated()
                    // anyRequest() : 설정값들 이외에 나머지 url을 지정하는 옵션
                .and()
                    .logout().logoutSuccessUrl("/")
                .and()
                    .oauth2Login().userInfoEndpoint().userService(customOAuth2UserService);
                    // userService() : OAuth 2 로그인 성공 후 후속 조치할 UserService 인터페이스의 구현체를 등록
    }
}
