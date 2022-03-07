package com.example.project.model.entity2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SequenceGenerator(
        name="seq_cartGoods",
        sequenceName = "seq_cartGoods",
        initialValue = 1,
        allocationSize = 1
)
@Builder
@EntityListeners(AuditingEntityListener.class)
@Table(name="tb_cartgoods")
public class CartGoods {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cartGoods")
    private Long cartgoodsIdx;

    @ManyToOne(fetch = FetchType.LAZY)
    private Cart cart;

    @ManyToOne(fetch = FetchType.LAZY)
    private Goods goods;
}
