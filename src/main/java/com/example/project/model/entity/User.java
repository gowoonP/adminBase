package com.example.project.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

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
@Table(name="tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_user")
    @Column(name="user_idx")
    private Long userIdx;
    private String userUserid;
    private String userUserpw;
    private String userName;
    private String userHp;
    private String userEmail;
    @CreatedDate
    private LocalDateTime userRegdate;
    private String userSns;
    private String userZipcode;
    private String userAddress1;
    private String userAddress2;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Cart> cartList2;

    @OneToMany(mappedBy = "user" , fetch = FetchType.LAZY)
    private List<Order> orderList;

    @OneToMany(mappedBy = "user" , fetch = FetchType.LAZY)
    private List<Zzim> zzimList;

    @OneToMany(mappedBy = "user" , fetch = FetchType.LAZY)
    private List<Qna> qnaList;

    @OneToMany(mappedBy = "user" , fetch = FetchType.LAZY)
    private List<Dpoint> dpointList;

    @OneToMany(mappedBy = "user" , fetch = FetchType.LAZY)
    private List<Coupon> couponList;

    @OneToMany(mappedBy = "user" , fetch = FetchType.LAZY)
    private List<Recent> recentList;

    @OneToMany(mappedBy = "user" , fetch = FetchType.LAZY)
    private List<Review> reviewList;

    @OneToMany(mappedBy = "user" , fetch = FetchType.LAZY)
    private List<RegistAddress> registAddressList;








}
