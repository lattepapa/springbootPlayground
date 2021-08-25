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
    // @RequestBody 어노테이션은 해당 클래스를 객체로 생성해준다. 대신, 각 변수별로 데이터를 저장하는 것은 불가능하다
    // @RequestParam 어노테이션은 반면에 각 변수별로 데이터를 저장할 수 있게 해주는 대신, 클래스를 객체로 생성하는 것은 불가능하다
}
