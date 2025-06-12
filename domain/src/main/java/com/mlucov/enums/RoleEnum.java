package com.mlucov.enums;

public enum RoleEnum {
    ADMIN("ADMIN"),
    DEALER("DEALER"),
    CUSTOMER ("CUSTOMER");

    private String role;

    RoleEnum(String store) {
        this.role = store;
    }
}

