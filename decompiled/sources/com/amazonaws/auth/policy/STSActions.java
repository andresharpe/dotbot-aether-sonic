package com.amazonaws.auth.policy;

@Deprecated
/* loaded from: classes.dex */
public enum STSActions implements a {
    AssumeRole("sts:AssumeRole"),
    AssumeRoleWithWebIdentity("sts:AssumeRoleWithWebIdentity");

    private final String action;

    STSActions(String str) {
        this.action = str;
    }

    @Override // com.amazonaws.auth.policy.a
    public String b() {
        return this.action;
    }
}
