package com.example.project.model.enumclass;

public enum ItemStatus {
    REGISTERED(0, "등록", "상품 등록 상태"),
    UNREGISTERED(1, "중지", "상품 판매 중지 상태"),
    WAITING(2, "대기", "상품 검수 상태");

    private Integer id;
    private String title;
    private String description;

    private ItemStatus(final Integer id, final String title, final String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Integer getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }
}
