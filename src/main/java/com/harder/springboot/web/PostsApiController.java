package com.harder.springboot.web;
import com.harder.springboot.domain.posts.PostsRepository;
import com.harder.springboot.service.posts.PostsService;
import com.harder.springboot.web.dto.PostsResponseDto;
import com.harder.springboot.web.dto.PostsSaveRequestDto;
import com.harder.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
// 생성자를 직접 안쓰고 @RequiredArgsConstructor 어노테이션으로 떼우는 이유 :
// 해당 클래스의 의존성 관계가 변경될 때마다 생성자 코드를 계속 수정하지 않고 final이 선언된 모든 필드를 인자값으로 하는 생성자를 자동생성
@RestController
public class PostsApiController {

    private final PostsService postsService;

    // 1. 데이터 등록기능
    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }
    // @RequestBody 어노테이션은 해당 클래스를 객체로 생성해준다. 대신, 각 변수별로 데이터를 저장하는 것은 불가능하다
    // 반면에 @RequestParam 어노테이션은 각 변수별로 데이터를 저장할 수 있게 해주는 대신, 클래스를 객체로 생성하는 것은 불가능하다
    // 또한, @RequestParam 어노테이션은 http://localhost?index=1&page=2 와 같이 게시판에서 페이지 및 검색 정보를 함께 전달하는데 활용된다

    // 2. 데이터 수정기능
    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }
    // @PathVariable 어노테이션은 http://localhost/index/1 과 같이 RESTAPI에서의 값 호출과 활용에 활용된다

    // 3. 데이터 조회기능
    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById (@PathVariable Long id) {
        return postsService.findById(id);
    }

    // 4. 데이터 삭제기능
    @DeleteMapping("/api/v1/posts/{id}")
    public Long delete(@PathVariable Long id) {
        postsService.delete(id);
        return id;
    }
}
