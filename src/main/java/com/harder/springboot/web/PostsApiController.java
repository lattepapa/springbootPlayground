package com.harder.springboot.web;
import com.harder.springboot.service.posts.PostsService;
import com.harder.springboot.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
// 생성자를 직접 안쓰고 @RequiredArgsConstructor 어노테이션으로 떼우는 이유 :
// 해당 클래스의 의존성 관계가 변경될 때마다 생성자 코드를 계속 수정하지 않고 final이 선언된 모든 필드를 인자값으로 하는 생성자를 자동생성
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }
}
