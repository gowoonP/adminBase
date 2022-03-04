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
        name="seq_dpoint",
        sequenceName = "seq_dpoint",
        initialValue = 1,
        allocationSize = 1
)
@Builder
@EntityListeners(AuditingEntityListener.class)
public class Dpoint {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_dpoint")
    private BigInteger id;
    private LocalDateTime regdate;
    private String content;
    private BigInteger pp;
    private BigInteger enddate;
    private BigInteger mp;
}
