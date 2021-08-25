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