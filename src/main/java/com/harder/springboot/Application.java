package com.harder.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
// JPA Auditing 활성화
@SpringBootApplication
// SpringBoot 자동 설정, Spring Bean 읽기/생성 자동 설정
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
