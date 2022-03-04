package com.example.project.model.enumclass;

public enum OrderType {
    ALL(0, "묶음", "모든 상품을 묶어 배송"),
    EACH(1, "개별", "모든 상품을 각각 준비되는대로 발송");

    private Integer id;
    private String title;
    private String description;

    private OrderType(final Integer id, final String title, final String description) {
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
