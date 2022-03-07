package com.example.project.model.entity2;

import com.example.project.model.enumclass.GoodsStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
@Table(name="tb_goods")
public class Goods {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_goods")
    private Long gdIdx;
    private String gdName;
    private Integer gdPrice;
    private Long gdCount;
    private String gdBrand;
    @CreatedDate
    private LocalDateTime gdRegdate;
    private String gdCategory;
    private Integer gdSaleprice;
    private Integer gdSalepercent;
    private Integer gdHit;
    private String gdImg;
    private String gdOption;
    private String gdContent;
    private String gdDetailimg;
    @Enumerated(EnumType.STRING)
    private GoodsStatus gdStatus;

    @OneToMany(mappedBy = "goods")
    private List<Cart> cartList = new ArrayList<>();
}
