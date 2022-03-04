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
        name="seq_raddress",
        sequenceName = "seq_raddress",
        initialValue = 1,
        allocationSize = 1
)
@Builder
@EntityListeners(AuditingEntityListener.class)
public class RegistAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_raddress")
    private BigInteger id;
    private String userid;
    private String revname;
    private String zipcode;
    private String userhp;
    private String address1;
    private String address2;
    private String revaddname;
}
