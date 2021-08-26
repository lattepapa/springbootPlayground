package com.harder.springboot.service.posts;
import com.harder.springboot.domain.posts.Posts;
import com.harder.springboot.domain.posts.PostsRepository;
import com.harder.springboot.web.dto.PostsResponseDto;
import com.harder.springboot.web.dto.PostsSaveRequestDto;
import com.harder.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto) {
        Posts posts = postsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));

        posts.update(requestDto.getTitle(), requestDto.getContent());

        return id;
    }

    public PostsResponseDto findById (Long id) {
        Posts entity = postsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));

        return new PostsResponseDto(entity);
    }

    @Transactional(readOnly = true)
    // readOnly = true 옵션은 트랜잭션 범위는 유지하되, 조회 기능만 활용하게 하여 조회 속도를 개선시켜준다
    public List<PostsListResponseDto> findAllDesc() {
        return postsRepository.findAllDesc().stream().map(PostsListResponseDto::new).collect(Collectors.toList());
        // .map(PostsListResponseDto::new)는 사실 .map(posts -> new PostsListResponseDto(posts))와 같다
        // 즉, postsRepository 결과로 넘어온 Posts의 Stream을, map을 통해 PostsListResponseDto 변환 및 List로 반환해준다
    }
}
