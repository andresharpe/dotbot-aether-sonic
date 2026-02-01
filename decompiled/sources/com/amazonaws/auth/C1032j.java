package com.amazonaws.auth;

/* renamed from: com.amazonaws.auth.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1032j extends AbstractC1026d {
    public C1032j(String str, String str2) {
        this(str, str2, new com.amazonaws.d());
    }

    @Override // com.amazonaws.auth.AbstractC1026d
    public String m() {
        return "Cognito";
    }

    @Override // com.amazonaws.auth.AbstractC1026d, com.amazonaws.auth.InterfaceC1033k
    public String refresh() {
        i();
        return null;
    }

    public C1032j(String str, String str2, com.amazonaws.d dVar) {
        this(str, str2, new com.amazonaws.services.cognitoidentity.b(new o(), dVar));
    }

    public C1032j(String str, String str2, com.amazonaws.services.cognitoidentity.a aVar) {
        super(str, str2, aVar);
    }
}
