package com.example.project.model.entity;

import com.example.project.model.enumclass.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SequenceGenerator(
        name="seq_user",
        sequenceName = "seq_user",
        initialValue = 1,
        allocationSize = 1
)
@Builder
@EntityListeners(AuditingEntityListener.class)
public class AdminUser {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_user")
    private Long id;
    private String userid;
    private String userpw;
    private String name;
    @Enumerated(EnumType.STRING)
    private UserStatus status;  // REGISTERED, UNREGISTERED
    @LastModifiedDate
    private LocalDateTime lastLoginAt;
    @CreatedDate
    private LocalDateTime regDate;
    @CreatedBy
    private String createBy;
}
