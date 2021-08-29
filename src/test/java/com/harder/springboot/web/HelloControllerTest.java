package com.harder.springboot.web;
import com.harder.springboot.config.auth.SecurityConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
// 테스트 진행 시 JUnit 내장 실행자 외 다른 실행자도 실행
@WebMvcTest(controllers = HelloController.class,
excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = SecurityConfig.class)
})
// 여러 Spring 테스트 어노테이션 중 Web(Spring MVC)에 집중할 수 있는 어노테이션으로, @Controller, @ControllerAdvice 등을 사용가능
public class HelloControllerTest {

    @Autowired
    // Spring이 관리하는 Bean을 주입받음
    private MockMvc mvc;
    // Spring MVC 테스트의 시작점이며, HTTP(Web)의 다양한 메소드들을 테스트 가능

    @WithMockUser(roles = "USER")
    @Test
    public void hello가_리턴된다() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
        // MockMvc를 통해 /hello 주소로 HTTP GET 요청이 가능하며, chaining이 지원됨
        // 이에 따라 .andExpect()를 통해 이 mvc.perform의 결과를 다양하게 검증 가능
    }

    @WithMockUser(roles = "USER")
    @Test
    public void helloDto가_리턴된다() throws Exception {
        String name = "hello";
        int amount = 1000;

        mvc.perform(get("/hello/dto")
                .param("name", name)
                .param("amount", String.valueOf(amount)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is(name)))
                .andExpect(jsonPath("$.amount", is(amount)));
        // .param()은 API 테스트 시 사용될 요청 파라미터를 설정해주며, 값은 String만 허용한다
        // jsonPath()는 JSON 응답값을 필드별로 검증할 수 있는 메소드로, $를 기준으로 필드명을 명시한다
    }
}
