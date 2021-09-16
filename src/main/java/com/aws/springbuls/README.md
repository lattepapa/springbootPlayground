# Learning Java SpringBoot

## 아키텍처

(1) Java 8

(2) Gradle 4.10.2
- [Preferences] Build and run using: IntelliJ IDEA
- [Preferences] Run tests using: IntelliJ IDEA
- [Shell] ./gradle wrapper --gradle-version 4.10.2

(3) Lombok 1.18.8
- [build.gradle] dependencies { compile('org.projectlombok:lombok') }
- [Plugins] lombok install

## 요구사항 분석

(1) 게시판 기능
- 게시글 조회
- 게시글 등록
- 게시글 수정
- 게시글 삭제

(2) 회원 기능
- 구글/네이버 로그인
- 로그인한 사용자 글 작성 권한
- 본인 작성 글에 대한 권한 관리

## 스프링 웹 계층 구조

### API를 만들기 위해서는 총 3개의 클래스가 필요
- Request 데이터를 받을 Dto
- API 요청을 받을 Controller
- 트랜잭션, 도메인(주문,구매 등등 서비스기능) 간 순서를 보장하는 Service

### 이에 따른 스프링 웹 계층 구분
![spring-web-app-architecture](https://user-images.githubusercontent.com/67884699/130718994-901ab8d2-2c66-4885-b437-2ceb6b0b682f.png)

- Web Layer : @Controller와 JSP/Freemaker, @Filter, @ControllerAdvice 등의 뷰 템플릿 영역
- Service Layer : @Service, @Transactional 등의 서비스 영억(Controller와 Dao의 중간 영역)
- Repository Layer : DB에 접근하는 영역(Data Access Object, 즉, Dao 영역)

### 스프링 웹 계층에 중첩된 영역
- Dto : Data Transfer Object는 계층간 데이터 교환을 위한 객체이며, Web과 Service Layer에 중첩
- Domain Model : 개발대상을 모든 사람이 동일한 관점에서 이해할 수 있도록 단순화된 것(즉, Entity)이며, Service와 Repository Layer에 중첩 -> 비즈니스 로직 처리

## 프로젝트에서의 계층 구조
### Repository Layer(첫번째로 만든다)
- 경로 : src > main > java > {package} > domain > posts > Posts.java(class) 및 PostsRepository.java(interface)
- 내용 :  
** Entity가 형성되는 곳이다.  
** 여기서는 "Posts"라는 클래스를 만들어서 궁극적으로 DB에 "posts"라는 Entity로 링크해준다.  

```java
// Posts.java (클래스)

import ...

@Getter
// 롬복 어노테이션으로, 클래스 내 모든 필드의 Getter 메소드를 자동으로 생성해준다
@NoArgsConstructor
// 롬복 어노테이션으로, 기본 생성자를 자동으로 추가해준다 -> 여기선 public Posts() {} 를 자동 추가해준다
@Entity
// JPA 어노테이션으로, 아래 클래스가 테이블과 링크될 클래스(즉, Entity 클래스)임을 명시해준다
// CamelCase인 이름은 underscore_case(_)로 테이블 이름을 매칭해준다
// Entity 클래스에서는 절대로 Setter 메소드를 만들지 않는다. -> Bean 규약으로 인한 Getter/Setter 남발을 억제해주는 기능
public class Posts {

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
}
```

```java
// PostsRepository.java (인터페이스)

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {}
// JpaRepository는 MyBatis에서의 Dao와 같은 DB Layer 접근자(interface)이다
// 즉, Posts 클래스로 DB 접근할 수 있게 해준다
// 인터페이스 선언 속에 extends JpaRepository<Entity 클래스 이름, 해당 Entity의 PK의 타입> 를 삽입하면 CRUD 메소드가 자동 생성된다
...
```

### Web Layer(두번째로 만든다)
- 경로 : src > main > java > {package} > web > dto > PostsApiController.java
- 내용 :  
** 컨트롤러가 세팅되는 곳이다. 컨트롤러는 뷰 템플릿과 서비스를 중개한다.  
** 여기서는 DB에 데이터를 다룰 수 있는 각종 CRUD용 API가 정의된다.  
&nbsp;&nbsp;&nbsp; ➡ "requestDto"라는 클래스를 객체로 만들어, "postsService"라는 서비스가 이 객체를 Entity에 반영하게 해준다.

```java
import ...

@RequiredArgsConstructor
// PostsApiController 클래스의 의존성 관계가 변경될 때마다 생성자 코드를 수정하지 않고,
// final이 선언된 모든 필드를 인자값으로 하는 생성자를 자동 생성하기 위해 사용
// 컨트롤러는 Service layer의 내용을 인자값으로 해야하므로 final을 통해 postsService 선언
@RestController
// PostsApiController 클래스의 컨트롤러가 JSON을 반환할 수 있도록 만들어준다
public class PostsApiController {
	private final PostsService postsService;
	@PostMapping("/api/v1/posts")
	public Long save(@RequestBody PostsSaveRequestDto requestDto) {
		// @RequestBody 어노테이션은 requestDto 클래스를 객체로 생성해준다
		return postsService.save(requestDto);
	}
}
...
```

### Service Layer(세번째로 만든다)
- 경로 : src > main > java > {package} > service > posts > PostsService.java
- 내용 :  
** 서비스가 세팅되는 곳이다. 서비스는 컨트롤러와 도메인을 중개한다.  
** 여기서는 "PostsService"라는 클래스로 만들어지는 서비스가 "requestDto"라는 Entity에 컨트롤러의 CRUD API를 적용해준다.  

```java
import ...

@RequiredArgsConstructor
// 서비스는 Domain layer의 내용을 인자값으로 해야하므로 final을 통해 postsRepository 선언
@Service
// 
public class PostsService {
	private final PostsRepository postsRepository;
	@Transactional
	public Long save(PostsSaveRequestDto requestDto) {
		return postsService.save(requestDto.toEntity()).getId();
	}
}
...
```

### Dto(마지막으로 만든다)
- 경로 : src > main > java > {package} > web > dto > PostsSaveRequestDto.java
- 내용 :  
** Data Transfer Object란 계층 간 데이터 교환을 위한 객체(Java Beans)를 의미한다.  
** DB에서 꺼낸 값을 임의로 변경할 필요가 없으므로, 일반적으로 Dto는 Getter 이외의 내부 로직이나 메서드를 갖지 않는다.  
** 특히, 롬복에서 제공하는 @Builder 어노테이션을 활용하여 Entity의 각 필드들을 변수 순서에 맞게 저장 및 운반한다.  

```java
import ...

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {

    private String title;
    private String content;
    private String author;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
...
```
