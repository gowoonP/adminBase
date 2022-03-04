package com.example.project.model.entity11;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(
        name = "seq_coupon",
        sequenceName = "seq_coupon",
        initialValue = 1,
        allocationSize = 1
)
@Builder
@EntityListeners(AuditingEntityListener.class)
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_coupon")
    private BigInteger id;
    private BigInteger userid;
    private BigInteger discount;
    private BigInteger name;
    private LocalDateTime regdate;
    private LocalDateTime startdate;
    private LocalDateTime enddate;
    private String limitprice;
    private String status;
}
