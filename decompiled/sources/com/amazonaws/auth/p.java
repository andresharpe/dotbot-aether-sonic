package com.amazonaws.auth;

/* loaded from: classes.dex */
public class p implements InterfaceC1029g {

    /* renamed from: a, reason: collision with root package name */
    private final String f23445a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23446b;

    public p(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                this.f23445a = str;
                this.f23446b = str2;
                return;
            }
            throw new IllegalArgumentException("Secret key cannot be null.");
        }
        throw new IllegalArgumentException("Access key cannot be null.");
    }

    @Override // com.amazonaws.auth.InterfaceC1029g
    public String a() {
        return this.f23445a;
    }

    @Override // com.amazonaws.auth.InterfaceC1029g
    public String c() {
        return this.f23446b;
    }
}
