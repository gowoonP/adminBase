package com.example.project.model.entity11;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SequenceGenerator(
        name="cart",
        sequenceName = "cart",
        initialValue = 1,
        allocationSize = 1
)
@Builder
@EntityListeners(AuditingEntityListener.class)
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cart")
    private BigInteger idx;
    private BigInteger goodsid;
    private BigInteger userid;
    private String goodsname;
    private String goodsprice;
    private String option;
    private BigInteger saleprice;
    private BigInteger goodssalepercent;
}
