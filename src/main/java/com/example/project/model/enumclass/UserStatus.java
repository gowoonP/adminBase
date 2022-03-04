package com.example.project.model.enumclass;

public enum UserStatus {
    REGISTERED(0, "등록", "사용자 가입상태"),
    UNREGISTERED(1, "탈퇴", "사용자 탈퇴상태");

    private Integer id;
    private String title;
    private String description;

    private UserStatus(final Integer id, final String title, final String description) {
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
