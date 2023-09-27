package com.morenike.ew_ardrobe.model.enums;

public enum Role {
    ADMIN("ROLE_ADMIN"),
    CUSTOMER("ROLE_CUSTOMER");
    // Other roles...

    private final String roleName;

    Role(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}
