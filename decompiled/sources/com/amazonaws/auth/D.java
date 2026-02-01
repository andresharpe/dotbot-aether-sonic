package com.amazonaws.auth;

import com.amazonaws.services.securitytoken.model.AssumeRoleRequest;
import com.amazonaws.services.securitytoken.model.Credentials;
import java.util.Date;

/* loaded from: classes.dex */
public class D implements InterfaceC1030h {

    /* renamed from: f, reason: collision with root package name */
    public static final int f23372f = 900;

    /* renamed from: g, reason: collision with root package name */
    private static final int f23373g = 60000;

    /* renamed from: a, reason: collision with root package name */
    private final com.amazonaws.services.securitytoken.a f23374a;

    /* renamed from: b, reason: collision with root package name */
    private m f23375b;

    /* renamed from: c, reason: collision with root package name */
    private Date f23376c;

    /* renamed from: d, reason: collision with root package name */
    private String f23377d;

    /* renamed from: e, reason: collision with root package name */
    private String f23378e;

    public D(String str, String str2) {
        this.f23377d = str;
        this.f23378e = str2;
        this.f23374a = new com.amazonaws.services.securitytoken.b();
    }

    private boolean b() {
        if (this.f23375b == null || this.f23376c.getTime() - System.currentTimeMillis() < com.harman.jbl.partybox.ui.party.b.f44883c) {
            return true;
        }
        return false;
    }

    private void d() {
        Credentials b4 = this.f23374a.z(new AssumeRoleRequest().R(this.f23377d).M(900).S(this.f23378e)).b();
        this.f23375b = new q(b4.a(), b4.c(), b4.d());
        this.f23376c = b4.b();
    }

    @Override // com.amazonaws.auth.InterfaceC1030h
    public InterfaceC1029g a() {
        if (b()) {
            d();
        }
        return this.f23375b;
    }

    public void c(String str) {
        this.f23374a.d(str);
        this.f23375b = null;
    }

    @Override // com.amazonaws.auth.InterfaceC1030h
    public void refresh() {
        d();
    }

    public D(InterfaceC1029g interfaceC1029g, String str, String str2) {
        this(interfaceC1029g, str, str2, new com.amazonaws.d());
    }

    public D(InterfaceC1029g interfaceC1029g, String str, String str2, com.amazonaws.d dVar) {
        this.f23377d = str;
        this.f23378e = str2;
        this.f23374a = new com.amazonaws.services.securitytoken.b(interfaceC1029g, dVar);
    }

    public D(InterfaceC1030h interfaceC1030h, String str, String str2) {
        this.f23377d = str;
        this.f23378e = str2;
        this.f23374a = new com.amazonaws.services.securitytoken.b(interfaceC1030h);
    }

    public D(InterfaceC1030h interfaceC1030h, String str, String str2, com.amazonaws.d dVar) {
        this.f23377d = str;
        this.f23378e = str2;
        this.f23374a = new com.amazonaws.services.securitytoken.b(interfaceC1030h, dVar);
    }
}
