package com.fastercamp.springboot.web;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
// 테스트 진행 시 JUnit 내장 실행자 외 다른 실행자도 실행
@WebMvcTest(controllers = HelloController.class)
// 여러 Spring 테스트 어노테이션 중 Web(Spring MVC)에 집중할 수 있는 어노테이션으로, @Controller, @ControllerAdvice 등을 사용가능
public class HelloControllerTest {

    @Autowired
    // Spring이 관리하는 Bean을 주입받음
    private MockMvc mvc;
    // Spring MVC 테스트의 시작점이며, HTTP(Web)의 다양한 메소드들을 테스트 가능

    @Test
    public void hello가_리턴된다() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
        // MockMvc를 통해 /hello 주소로 HTTP GET 요청이 가능하며, chaining이 지원됨
        // 이에 따라 .andExpect()를 통해 이 mvc.perform의 결과를 다양하게 검증 가능
    }
}
