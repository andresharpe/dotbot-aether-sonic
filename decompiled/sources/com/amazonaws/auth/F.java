package com.amazonaws.auth;

import com.amazonaws.services.securitytoken.model.Credentials;
import com.amazonaws.services.securitytoken.model.GetSessionTokenRequest;
import java.util.Date;

/* loaded from: classes.dex */
public class F implements InterfaceC1030h {

    /* renamed from: d, reason: collision with root package name */
    public static final int f23383d = 3600;

    /* renamed from: a, reason: collision with root package name */
    private final com.amazonaws.services.securitytoken.a f23384a;

    /* renamed from: b, reason: collision with root package name */
    private m f23385b;

    /* renamed from: c, reason: collision with root package name */
    private Date f23386c;

    public F(InterfaceC1029g interfaceC1029g) {
        this(interfaceC1029g, new com.amazonaws.d());
    }

    private boolean b() {
        if (this.f23385b == null || this.f23386c.getTime() - System.currentTimeMillis() < com.harman.jbl.partybox.ui.party.b.f44883c) {
            return true;
        }
        return false;
    }

    private void d() {
        Credentials a4 = this.f23384a.s(new GetSessionTokenRequest().x(3600)).a();
        this.f23385b = new q(a4.a(), a4.c(), a4.d());
        this.f23386c = a4.b();
    }

    @Override // com.amazonaws.auth.InterfaceC1030h
    public InterfaceC1029g a() {
        if (b()) {
            d();
        }
        return this.f23385b;
    }

    public void c(String str) {
        this.f23384a.d(str);
        this.f23385b = null;
    }

    @Override // com.amazonaws.auth.InterfaceC1030h
    public void refresh() {
        d();
    }

    public F(InterfaceC1029g interfaceC1029g, com.amazonaws.d dVar) {
        this.f23384a = new com.amazonaws.services.securitytoken.b(interfaceC1029g, dVar);
    }

    public F(InterfaceC1030h interfaceC1030h) {
        this.f23384a = new com.amazonaws.services.securitytoken.b(interfaceC1030h);
    }

    public F(InterfaceC1030h interfaceC1030h, com.amazonaws.d dVar) {
        this.f23384a = new com.amazonaws.services.securitytoken.b(interfaceC1030h, dVar);
    }
}
