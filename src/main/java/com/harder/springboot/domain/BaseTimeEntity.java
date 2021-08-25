package com.harder.springboot.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
// JPA Entity 클래스들이 BaseTimeEntity를 상속할 경우 필드들(createdDate, modifiedDate)도 컬럼으로 인식하도록 해준다
@EntityListeners(AuditingEntityListener.class)
// BaseTimeEntity 클래스에 Auditing 기능을 포함시켜준다
public class BaseTimeEntity {

    @CreatedDate
    // Entity가 생성되어 저장될 때 시간을 자동으로 저장해준다
    private LocalDateTime createdDate;

    @LastModifiedDate
    // 조회한 Entity의 값을 변경할 때 시간을 자동으로 저장해준다
    private LocalDateTime modifiedDate;
}
