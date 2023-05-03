package idusw.springboot3.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(value = {AuditingEntityListener.class})
//EntityListeners를 사용하면 데이터베이스 지켜봄
@Getter
public abstract class BaseEntity {

    @CreatedDate
    //생성일자
    @Column(name = "regdate", updatable = false)
    private LocalDateTime regDate;

    @LastModifiedDate
    //수정일자
    @Column(name = "moddate")
    private LocalDateTime modDate;
}
