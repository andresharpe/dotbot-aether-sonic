package com.amazonaws.auth.policy.actions;

import com.amazonaws.auth.policy.a;

/* loaded from: classes.dex */
public enum SecurityTokenServiceActions implements a {
    AllSecurityTokenServiceActions("sts:*"),
    AssumeRole("sts:AssumeRole"),
    AssumeRoleWithSAML("sts:AssumeRoleWithSAML"),
    AssumeRoleWithWebIdentity("sts:AssumeRoleWithWebIdentity"),
    DecodeAuthorizationMessage("sts:DecodeAuthorizationMessage"),
    GetAccessKeyInfo("sts:GetAccessKeyInfo"),
    GetCallerIdentity("sts:GetCallerIdentity"),
    GetFederationToken("sts:GetFederationToken"),
    GetSessionToken("sts:GetSessionToken");

    private final String action;

    SecurityTokenServiceActions(String str) {
        this.action = str;
    }

    @Override // com.amazonaws.auth.policy.a
    public String b() {
        return this.action;
    }
}
