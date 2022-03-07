package com.example.project.model.enumclass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum OrderStatus {
    PAY(0, "결제완료", "fin"),
    READY(1, "배송준비중", "mypage_order"),
    SEND(2, "배송중", "mypage_order"),
    FINISH(3, "배송완료", "mypage_order"),
    CANCLED(4, "취소완료", "mypage_cancle"),
    RETURNING(5, "교환/반품중", "mypage_cancle"),
    RETURNED(6, "교환/반품완료", "mypage_return");

    private Integer id;
    private String title;
    private String description;
}
