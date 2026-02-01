package com.amazonaws.auth;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitoidentity.model.GetIdRequest;
import com.amazonaws.services.cognitoidentity.model.GetIdResult;
import com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenRequest;
import com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.amazonaws.auth.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1026d implements InterfaceC1028f {

    /* renamed from: a, reason: collision with root package name */
    protected final com.amazonaws.services.cognitoidentity.a f23429a;

    /* renamed from: b, reason: collision with root package name */
    protected String f23430b;

    /* renamed from: c, reason: collision with root package name */
    private final String f23431c;

    /* renamed from: d, reason: collision with root package name */
    private final String f23432d;

    /* renamed from: e, reason: collision with root package name */
    protected String f23433e;

    /* renamed from: f, reason: collision with root package name */
    protected List<v> f23434f;

    /* renamed from: g, reason: collision with root package name */
    protected Map<String, String> f23435g;

    public AbstractC1026d(String str, String str2, com.amazonaws.services.cognitoidentity.a aVar) {
        this.f23431c = str;
        this.f23432d = str2;
        this.f23435g = new HashMap();
        this.f23434f = new ArrayList();
        this.f23429a = aVar;
    }

    @Override // com.amazonaws.auth.InterfaceC1033k
    public String a() {
        if (this.f23433e == null) {
            GetOpenIdTokenRequest y3 = new GetOpenIdTokenRequest().x(i()).y(this.f23435g);
            k(y3, n());
            GetOpenIdTokenResult A3 = this.f23429a.A(y3);
            if (!A3.a().equals(i())) {
                f(A3.a());
            }
            this.f23433e = A3.b();
        }
        return this.f23433e;
    }

    @Override // com.amazonaws.auth.InterfaceC1028f
    public void b(v vVar) {
        this.f23434f.add(vVar);
    }

    @Override // com.amazonaws.auth.InterfaceC1028f
    public void c() {
        this.f23434f.clear();
    }

    @Override // com.amazonaws.auth.InterfaceC1028f
    public void d(v vVar) {
        this.f23434f.remove(vVar);
    }

    @Override // com.amazonaws.auth.InterfaceC1028f
    public boolean e() {
        Map<String, String> map = this.f23435g;
        if (map != null && map.size() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.amazonaws.auth.InterfaceC1028f
    public void f(String str) {
        String str2 = this.f23430b;
        if (str2 != null && str2.equals(str)) {
            return;
        }
        String str3 = this.f23430b;
        this.f23430b = str;
        Iterator<v> it = this.f23434f.iterator();
        while (it.hasNext()) {
            it.next().a(str3, this.f23430b);
        }
    }

    @Override // com.amazonaws.auth.InterfaceC1028f
    public void g(Map<String, String> map) {
        this.f23435g = map;
    }

    @Override // com.amazonaws.auth.InterfaceC1028f
    public String h() {
        return this.f23432d;
    }

    @Override // com.amazonaws.auth.InterfaceC1028f
    public String i() {
        if (this.f23430b == null) {
            GetIdRequest C3 = new GetIdRequest().A(l()).B(h()).C(this.f23435g);
            k(C3, n());
            GetIdResult i4 = this.f23429a.i(C3);
            if (i4.a() != null) {
                f(i4.a());
            }
        }
        return this.f23430b;
    }

    @Override // com.amazonaws.auth.InterfaceC1028f
    public Map<String, String> j() {
        return this.f23435g;
    }

    protected void k(com.amazonaws.b bVar, String str) {
        bVar.g().b(str);
    }

    public String l() {
        return this.f23431c;
    }

    public abstract String m();

    protected String n() {
        return "";
    }

    protected void o(String str) {
        this.f23430b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p(String str) {
        this.f23433e = str;
    }

    protected void q(String str, String str2) {
        String str3 = this.f23430b;
        if (str3 == null || !str3.equals(str)) {
            f(str);
        }
        String str4 = this.f23433e;
        if (str4 == null || !str4.equals(str2)) {
            this.f23433e = str2;
        }
    }

    @Override // com.amazonaws.auth.InterfaceC1033k
    public String refresh() {
        i();
        String a4 = a();
        q(i(), a4);
        return a4;
    }

    @Deprecated
    public AbstractC1026d(String str, String str2, com.amazonaws.d dVar) {
        this(str, str2, new com.amazonaws.services.cognitoidentity.b(new o(), dVar));
    }

    public AbstractC1026d(String str, String str2, com.amazonaws.d dVar, Regions regions) {
        this(str, str2, new com.amazonaws.services.cognitoidentity.b(new o(), dVar));
        this.f23429a.a(com.amazonaws.regions.a.f(regions));
    }

    @Deprecated
    public AbstractC1026d(String str, String str2) {
        this(str, str2, new com.amazonaws.d());
    }

    public AbstractC1026d(String str, String str2, Regions regions) {
        this(str, str2, new com.amazonaws.d(), regions);
    }
}
