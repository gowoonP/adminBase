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
        name="seq_detail",
        sequenceName = "seq_detail",
        initialValue = 1,
        allocationSize = 1
)
@Builder
@EntityListeners(AuditingEntityListener.class)
public class GoodsDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_detail")
    private BigInteger id;
    private BigInteger quantity;
    private Integer price;
    private Integer goodssaleprice;
    private String status;
    private LocalDateTime regdate;
    private String content;
    private String img;
    private BigInteger ordernum;
    private String option;
    private String detailimg;
    private BigInteger goodsid;
}
