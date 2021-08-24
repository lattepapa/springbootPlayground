package com.fastercamp.springboot.web;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// 컨트롤러를 "JSON 반환 컨트롤러"로 만들어 준다
// Polyfill: @ResponseBody를 각 메소드마다 선언
public class HelloController {

    @GetMapping("/hello")
    // HTTP GET request를 받을 수 있는 API를 만들어 준다
    // Polyfill: @RequestMapping(method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }
}
