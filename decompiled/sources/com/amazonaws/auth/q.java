package com.amazonaws.auth;

/* loaded from: classes.dex */
public class q implements m {

    /* renamed from: a, reason: collision with root package name */
    private final String f23493a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23494b;

    /* renamed from: c, reason: collision with root package name */
    private final String f23495c;

    public q(String str, String str2, String str3) {
        this.f23493a = str;
        this.f23494b = str2;
        this.f23495c = str3;
    }

    @Override // com.amazonaws.auth.InterfaceC1029g
    public String a() {
        return this.f23493a;
    }

    @Override // com.amazonaws.auth.m
    public String b() {
        return this.f23495c;
    }

    @Override // com.amazonaws.auth.InterfaceC1029g
    public String c() {
        return this.f23494b;
    }
}
