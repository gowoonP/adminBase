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
@Entity
@SequenceGenerator(
        name="seq_goods",
        sequenceName = "seq_goods",
        initialValue = 1,
        allocationSize = 1
)
@Builder
@EntityListeners(AuditingEntityListener.class)
public class Goods {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_goods")
    private BigInteger id;
    private BigInteger name;
    private BigInteger price;
    private BigInteger count;
    private String brand;
    private LocalDateTime regdate;
    private String category;
    private BigInteger saleprice;
    private BigInteger salepercent;
    private BigInteger hit;
    private String img;
    private String option;
}
