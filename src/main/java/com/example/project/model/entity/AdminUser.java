package com.example.project.model.entity;

import com.example.project.model.enumclass.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SequenceGenerator(
        name="seq_user",            // DB이름
        sequenceName = "seq_user",  // 표출할 이름
        initialValue = 1,           // 시작값
        allocationSize = 1          // 증감값
)
@Builder
@EntityListeners(AuditingEntityListener.class)
public class AdminUser {
    // 연결 시  + 카멜표기법 !!!

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_user")
    private Long id;
    private String userid;
    private String userpw;
    private String name;
    @Enumerated(EnumType.STRING)
    private UserStatus status;  // REGISTERED, UNREGISTERED
    private LocalDateTime lastLoginAt;
    @CreatedDate
    private LocalDateTime regDate;
    @CreatedBy
    private String createBy;


}
