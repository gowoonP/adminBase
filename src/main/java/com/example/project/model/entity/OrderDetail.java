package com.example.project.model.entity;

import com.example.project.model.enumclass.OrderType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SequenceGenerator(
        name = "seq_detail",
        sequenceName = "seq_detail",
        initialValue = 1,
        allocationSize = 1
)
@Builder
@EntityListeners(AuditingEntityListener.class)
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_detail")
    private Long id;
    private LocalDateTime arrivalDate;
    @Enumerated(EnumType.STRING)
    private OrderType status;
    private Integer quantity;
    private BigDecimal totalPrice;
    @CreatedDate
    private LocalDateTime regDate;

    @ManyToOne
    private Item item;
    // private Long itemId;

   // private Long orderGroupId;
    @ManyToOne
    private OrderGroup orderGroup;



}