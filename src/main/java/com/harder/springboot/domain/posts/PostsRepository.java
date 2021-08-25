package com.harder.springboot.domain.posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}

// JpaRepository는 MyBatis에서의 Dao와 같은 DB Layer 접근자(interface)이다 -> Posts 클래스로 DB 접근할 수 있게 해준다
// 인터페이스 선언 속에 extends JpaRepository<Entity 클래스 이름, 해당 Entity의 PK의 타입> 를 삽입하면 CRUD 메소드가 자동 생성된다
