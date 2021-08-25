package com.harder.springboot.web;
import com.harder.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/hello/dto")
    // 롬복 라이브러리가 적용된 ResponseDto를 사용
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
    // @RequestParam은 외부에서 API로 넘긴 파라미터를 가져오는 어노테이션
    // 즉, 외부에서 johndoe(@RequestParam("name")) 라고 넘긴 파라미터를 johndoe (String name) 에 저장해준다
}