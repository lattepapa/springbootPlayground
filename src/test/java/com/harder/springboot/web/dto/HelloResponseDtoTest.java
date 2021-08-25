package com.harder.springboot.web.dto;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() {
        // given
        String name = "test";
        int amount = 1000;

        // when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
        // assertThat()은 테스트 검증 라이브러리인 assertj에서 제공하는 검증 메소드로, 검증대상을 인자로 받을 수 있으며 chaining 가능
        // isEqualTo()는 assertj에서 제공하는 동등 비교 메소드로, assertThat()에 있는 값과 isEqualTo()의 값이 동등할 때만 성공으로 간주
    }
}