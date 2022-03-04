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
        name="seq_zzim",
        sequenceName = "seq_zzim",
        initialValue = 1,
        allocationSize = 1
)
@Builder
@EntityListeners(AuditingEntityListener.class)
public class Zzim {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_zzim")
    private BigInteger id;
    private BigInteger userid;
    private BigInteger goodsid;
    private String goodsname;
    private Integer goodsprice;
    private String goodssaleprice;
    private String goodsimg;
}
