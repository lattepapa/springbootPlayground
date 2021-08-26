package com.harder.springboot.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    // 소셜 로그인으로 반환되는 값들 중 email을 확인하여, 기존 유저인지 판단하기 위한 메소드
}
