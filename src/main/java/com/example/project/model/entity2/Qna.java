package com.example.project.model.entity2;

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
        name="seq_qna",
        sequenceName = "seq_qna",
        initialValue = 1,
        allocationSize = 1
)
@Builder
@EntityListeners(AuditingEntityListener.class)
@Table(name="tb_qna")
public class Qna {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_qna")
    private Long qIdx;
    @ManyToOne
    private User user;
    private String qTitle;
    private LocalDateTime qRegdate;
    private String qContent;
    private String qAnswer;
    private Long qNumber;
    private String qCategory;
    private String qStatus;
}