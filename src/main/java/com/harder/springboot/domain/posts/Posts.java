package com.harder.springboot.domain.posts;
import com.harder.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
// 롬복 어노테이션으로, 클래스 내 모든 필드의 Getter 메소드를 자동으로 생성해준다
@NoArgsConstructor
// 롬복 어노테이션으로, 기본 생성자를 자동으로 추가해준다 -> 여기선 public Posts() {} 를 자동 추가해준다
@Entity
// JPA 어노테이션으로, 아래 클래스가 테이블과 링크될 클래스(즉, Entity 클래스)임을 명시해준다
// CamelCase인 이름은 underscore_case(_)로 테이블 이름을 매칭해준다
// Entity 클래스에서는 절대로 Setter 메소드를 만들지 않는다. -> Bean 규약으로 인한 Getter/Setter 남발을 억제해주는 기능
public class Posts extends BaseTimeEntity {

    @Id
    // 해당 테이블의 PK 필드를 나타내준다
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // PK 생성 규칙을 내타내준다
    private Long id;

    @Column(length = 500, nullable = false)
    // @Column 어노테이션을 명시하지 않아도 테이블 컬럼으로 매칭되나, 디폴트값 외 추가 변경이 있는 경우 어노테이션 사용
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    // 해당 클래스의 빌더 패턴 클래스를 생성해준다 -> 만약 생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
