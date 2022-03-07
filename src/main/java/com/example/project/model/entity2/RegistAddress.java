package com.example.project.model.entity2;

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
        name="seq_regist_address",
        sequenceName = "seq_regist_address",
        initialValue = 1,
        allocationSize = 1
)
@Builder
@EntityListeners(AuditingEntityListener.class)
@Table(name="tb_regist_address")
public class RegistAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_regist_address")
    private Long rgaIdx;
    @ManyToOne
    private User user;
    private String rgaRevname;
    private String rgaZipcode;
    private String rgaUserhp;
    private String rgaAddress1;
    private String rgaAddress2;
    private String rgaRevaddname;
}
