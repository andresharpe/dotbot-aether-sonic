package com.amazonaws.auth;

import com.amazonaws.regions.Regions;

/* renamed from: com.amazonaws.auth.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1025c extends AbstractC1026d {
    @Deprecated
    public AbstractC1025c(String str, String str2) {
        this(str, str2, new com.amazonaws.d());
    }

    @Override // com.amazonaws.auth.AbstractC1026d
    public abstract String m();

    public AbstractC1025c(String str, String str2, Regions regions) {
        this(str, str2, new com.amazonaws.d(), regions);
    }

    @Deprecated
    public AbstractC1025c(String str, String str2, com.amazonaws.d dVar) {
        this(str, str2, new com.amazonaws.services.cognitoidentity.b(new o(), dVar));
    }

    public AbstractC1025c(String str, String str2, com.amazonaws.d dVar, Regions regions) {
        this(str, str2, new com.amazonaws.services.cognitoidentity.b(new o(), dVar));
        this.f23429a.a(com.amazonaws.regions.a.f(regions));
    }

    public AbstractC1025c(String str, String str2, com.amazonaws.services.cognitoidentity.a aVar) {
        super(str, str2, aVar);
    }
}
