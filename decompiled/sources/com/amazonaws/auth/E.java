package com.amazonaws.auth;

import com.amazonaws.services.securitytoken.model.Credentials;
import com.amazonaws.services.securitytoken.model.GetSessionTokenRequest;

@Deprecated
/* loaded from: classes.dex */
public class E implements InterfaceC1034l {

    /* renamed from: d, reason: collision with root package name */
    public static final int f23379d = 3600;

    /* renamed from: a, reason: collision with root package name */
    private final com.amazonaws.services.securitytoken.a f23380a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23381b;

    /* renamed from: c, reason: collision with root package name */
    private Credentials f23382c;

    public E(InterfaceC1029g interfaceC1029g) {
        this(interfaceC1029g, 3600);
    }

    private synchronized Credentials f() {
        try {
            if (g()) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f23382c;
    }

    private boolean g() {
        Credentials credentials = this.f23382c;
        if (credentials == null || credentials.b().getTime() - System.currentTimeMillis() < com.harman.jbl.partybox.ui.party.b.f44883c) {
            return true;
        }
        return false;
    }

    @Override // com.amazonaws.auth.InterfaceC1029g
    public synchronized String a() {
        return f().a();
    }

    @Override // com.amazonaws.auth.m
    public synchronized String b() {
        return f().d();
    }

    @Override // com.amazonaws.auth.InterfaceC1029g
    public synchronized String c() {
        return f().c();
    }

    @Override // com.amazonaws.auth.InterfaceC1034l
    public synchronized void d() {
        this.f23382c = this.f23380a.s(new GetSessionTokenRequest().x(Integer.valueOf(this.f23381b))).a();
    }

    public synchronized m e() {
        Credentials f4;
        f4 = f();
        return new q(f4.a(), f4.c(), f4.d());
    }

    public E(InterfaceC1029g interfaceC1029g, int i4) {
        this.f23380a = new com.amazonaws.services.securitytoken.b(interfaceC1029g);
        this.f23381b = i4;
    }

    public E(com.amazonaws.services.securitytoken.a aVar) {
        this(aVar, 3600);
    }

    public E(com.amazonaws.services.securitytoken.a aVar, int i4) {
        this.f23380a = aVar;
        this.f23381b = i4;
    }
}
