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
        name="seq_dgoods",
        sequenceName = "seq_dgoods",
        initialValue = 1,
        allocationSize = 1
)
@Builder
@EntityListeners(AuditingEntityListener.class)
public class DpointGoods {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_dgoods")
    private BigInteger id;
    private BigInteger name;
    private BigInteger price;
    private BigInteger count;
    private LocalDateTime enddate;
    private String category;
    private BigInteger hit;
    private String img;
    private String userid;
    private String userpw;
}
