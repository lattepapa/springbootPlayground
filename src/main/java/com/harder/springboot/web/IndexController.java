package com.harder.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
        // mustache 템플릿 엔진에 의해 String 값의 뒤에 .mustache 확장자가 붙어서
        // src > main > resources > templates 경로에 파일로 전환 및 저장되고, 이것을 View Resolver가 처리
    }
}
