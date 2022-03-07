package com.example.project.model.entity2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SequenceGenerator(
        name="seq_order",
        sequenceName = "seq_order",
        initialValue = 1,
        allocationSize = 1
)
@Builder
@EntityListeners(AuditingEntityListener.class)
@Table(name="tb_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_order")
    private Long orderIdx;
    @ManyToOne
    @JoinColumn(name="user_userIdx")
    private User user;
    private Long orderNum;
    private LocalDateTime orderRegdate;
    private String orderSeller;
    private String orderStatus;

    @ManyToOne
    private Goods goods;
}
