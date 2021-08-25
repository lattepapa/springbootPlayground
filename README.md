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

## Spring Web Hierarchy

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
- Dtos : Data Transfer Object는 계층간 데이터 교환을 위한 객체이며, Web과 Service Layer에 중첩
- Domain Model : 개발대상을 모든 사람이 동일한 관점에서 이해할 수 있도록 단순화된 것(즉, Entity)이며, Service와 Repository Layer에 중첩 -> 비즈니스 로직 처리