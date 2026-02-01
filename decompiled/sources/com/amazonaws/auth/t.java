package com.amazonaws.auth;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitoidentity.model.Credentials;
import com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityRequest;
import com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityResult;
import com.amazonaws.services.cognitoidentity.model.ResourceNotFoundException;
import com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public class t implements InterfaceC1030h {

    /* renamed from: o, reason: collision with root package name */
    private static final com.amazonaws.logging.c f23512o = LogFactory.c(C1031i.class);

    /* renamed from: p, reason: collision with root package name */
    public static final int f23513p = 3600;

    /* renamed from: q, reason: collision with root package name */
    public static final int f23514q = 500;

    /* renamed from: a, reason: collision with root package name */
    private final String f23515a;

    /* renamed from: b, reason: collision with root package name */
    private com.amazonaws.services.cognitoidentity.a f23516b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1028f f23517c;

    /* renamed from: d, reason: collision with root package name */
    protected m f23518d;

    /* renamed from: e, reason: collision with root package name */
    protected Date f23519e;

    /* renamed from: f, reason: collision with root package name */
    protected String f23520f;

    /* renamed from: g, reason: collision with root package name */
    protected com.amazonaws.services.securitytoken.a f23521g;

    /* renamed from: h, reason: collision with root package name */
    protected int f23522h;

    /* renamed from: i, reason: collision with root package name */
    protected int f23523i;

    /* renamed from: j, reason: collision with root package name */
    protected String f23524j;

    /* renamed from: k, reason: collision with root package name */
    protected String f23525k;

    /* renamed from: l, reason: collision with root package name */
    protected String f23526l;

    /* renamed from: m, reason: collision with root package name */
    protected final boolean f23527m;

    /* renamed from: n, reason: collision with root package name */
    protected final ReentrantReadWriteLock f23528n;

    public t(o0.b bVar) {
        this((String) null, k(bVar), (String) null, (String) null, p(bVar), f(bVar));
    }

    private void b(com.amazonaws.b bVar, String str) {
        bVar.g().b(str);
    }

    private static com.amazonaws.services.cognitoidentity.b e(com.amazonaws.d dVar, Regions regions) {
        com.amazonaws.services.cognitoidentity.b bVar = new com.amazonaws.services.cognitoidentity.b(new o(), dVar);
        bVar.a(com.amazonaws.regions.a.f(regions));
        return bVar;
    }

    private static com.amazonaws.d f(o0.b bVar) {
        com.amazonaws.d dVar = new com.amazonaws.d();
        dVar.O(bVar.c());
        return dVar;
    }

    private static String k(o0.b bVar) {
        try {
            return bVar.d("CredentialsProvider").optJSONObject("CognitoIdentity").getJSONObject(bVar.b()).getString("PoolId");
        } catch (Exception e4) {
            throw new IllegalArgumentException("Failed to read CognitoIdentity please check your setup or awsconfiguration.json file", e4);
        }
    }

    private static Regions p(o0.b bVar) {
        try {
            return Regions.b(bVar.d("CredentialsProvider").optJSONObject("CognitoIdentity").getJSONObject(bVar.b()).getString("Region"));
        } catch (Exception e4) {
            throw new IllegalArgumentException("Failed to read CognitoIdentity please check your setup or awsconfiguration.json file", e4);
        }
    }

    private void v(String str) {
        Map<String, String> m4;
        GetCredentialsForIdentityResult y3;
        if (str != null && !str.isEmpty()) {
            m4 = new HashMap<>();
            m4.put(n(), str);
        } else {
            m4 = m();
        }
        try {
            y3 = this.f23516b.l(new GetCredentialsForIdentityRequest().B(i()).C(m4).A(this.f23526l));
        } catch (ResourceNotFoundException unused) {
            y3 = y();
        } catch (AmazonServiceException e4) {
            if (e4.b().equals("ValidationException")) {
                y3 = y();
            } else {
                throw e4;
            }
        }
        Credentials a4 = y3.a();
        this.f23518d = new q(a4.a(), a4.c(), a4.d());
        E(a4.b());
        if (!y3.b().equals(i())) {
            B(y3.b());
        }
    }

    private void w(String str) {
        String str2;
        if (this.f23517c.e()) {
            str2 = this.f23525k;
        } else {
            str2 = this.f23524j;
        }
        AssumeRoleWithWebIdentityRequest G3 = new AssumeRoleWithWebIdentityRequest().N(str).L(str2).M("ProviderSession").G(Integer.valueOf(this.f23522h));
        b(G3, t());
        com.amazonaws.services.securitytoken.model.Credentials c4 = this.f23521g.j(G3).c();
        this.f23518d = new q(c4.a(), c4.c(), c4.d());
        E(c4.b());
    }

    private GetCredentialsForIdentityResult y() {
        Map<String, String> m4;
        String z3 = z();
        this.f23520f = z3;
        if (z3 != null && !z3.isEmpty()) {
            m4 = new HashMap<>();
            m4.put(n(), this.f23520f);
        } else {
            m4 = m();
        }
        return this.f23516b.l(new GetCredentialsForIdentityRequest().B(i()).C(m4).A(this.f23526l));
    }

    private String z() {
        B(null);
        String refresh = this.f23517c.refresh();
        this.f23520f = refresh;
        return refresh;
    }

    public void A(String str) {
        this.f23526l = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void B(String str) {
        this.f23517c.f(str);
    }

    public void C(Map<String, String> map) {
        this.f23528n.writeLock().lock();
        try {
            this.f23517c.g(map);
            d();
        } finally {
            this.f23528n.writeLock().unlock();
        }
    }

    public void D(int i4) {
        this.f23523i = i4;
    }

    public void E(Date date) {
        this.f23528n.writeLock().lock();
        try {
            this.f23519e = date;
        } finally {
            this.f23528n.writeLock().unlock();
        }
    }

    public void F(int i4) {
        this.f23522h = i4;
    }

    protected void G() {
        try {
            this.f23520f = this.f23517c.refresh();
        } catch (ResourceNotFoundException unused) {
            this.f23520f = z();
        } catch (AmazonServiceException e4) {
            if (e4.b().equals("ValidationException")) {
                this.f23520f = z();
            } else {
                throw e4;
            }
        }
        if (this.f23527m) {
            v(this.f23520f);
        } else {
            w(this.f23520f);
        }
    }

    public void H(v vVar) {
        this.f23517c.d(vVar);
    }

    public InterfaceC1030h I(Map<String, String> map) {
        C(map);
        return this;
    }

    public t J(int i4) {
        D(i4);
        return this;
    }

    public t K(int i4) {
        F(i4);
        return this;
    }

    public void c() {
        this.f23528n.writeLock().lock();
        try {
            d();
            B(null);
            this.f23517c.g(new HashMap());
        } finally {
            this.f23528n.writeLock().unlock();
        }
    }

    public void d() {
        this.f23528n.writeLock().lock();
        try {
            this.f23518d = null;
            this.f23519e = null;
        } finally {
            this.f23528n.writeLock().unlock();
        }
    }

    @Override // com.amazonaws.auth.InterfaceC1030h
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public m a() {
        this.f23528n.writeLock().lock();
        try {
            if (u()) {
                G();
            }
            m mVar = this.f23518d;
            this.f23528n.writeLock().unlock();
            return mVar;
        } catch (Throwable th) {
            this.f23528n.writeLock().unlock();
            throw th;
        }
    }

    public String h() {
        return this.f23526l;
    }

    public String i() {
        return this.f23517c.i();
    }

    public String j() {
        return this.f23517c.h();
    }

    public InterfaceC1033k l() {
        return this.f23517c;
    }

    public Map<String, String> m() {
        return this.f23517c.j();
    }

    protected String n() {
        if (Regions.CN_NORTH_1.e().equals(this.f23515a)) {
            return "cognito-identity.cn-north-1.amazonaws.com.cn";
        }
        return "cognito-identity.amazonaws.com";
    }

    public int o() {
        return this.f23523i;
    }

    public Date q() {
        this.f23528n.readLock().lock();
        try {
            return this.f23519e;
        } finally {
            this.f23528n.readLock().unlock();
        }
    }

    public int r() {
        return this.f23522h;
    }

    @Override // com.amazonaws.auth.InterfaceC1030h
    public void refresh() {
        this.f23528n.writeLock().lock();
        try {
            G();
        } finally {
            this.f23528n.writeLock().unlock();
        }
    }

    public String s() {
        return this.f23517c.a();
    }

    protected String t() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean u() {
        if (this.f23518d == null) {
            return true;
        }
        if (this.f23519e.getTime() - (System.currentTimeMillis() - (com.amazonaws.i.a() * 1000)) < this.f23523i * 1000) {
            return true;
        }
        return false;
    }

    public void x(v vVar) {
        this.f23517c.b(vVar);
    }

    public t(String str, String str2, String str3, String str4, Regions regions) {
        this(str, str2, str3, str4, regions, new com.amazonaws.d());
    }

    public t(String str, String str2, String str3, String str4, Regions regions, com.amazonaws.d dVar) {
        this(str, str2, str3, str4, e(dVar, regions), (str3 == null && str4 == null) ? null : new com.amazonaws.services.securitytoken.b(new o(), dVar));
    }

    public t(String str, Regions regions) {
        this((String) null, str, (String) null, (String) null, regions, new com.amazonaws.d());
    }

    public t(String str, Regions regions, com.amazonaws.d dVar) {
        this((String) null, str, (String) null, (String) null, regions, dVar);
    }

    public t(String str, String str2, String str3, String str4, com.amazonaws.services.cognitoidentity.b bVar, com.amazonaws.services.securitytoken.a aVar) {
        this.f23516b = bVar;
        this.f23515a = bVar.X().e();
        this.f23521g = aVar;
        this.f23524j = str3;
        this.f23525k = str4;
        this.f23522h = 3600;
        this.f23523i = 500;
        boolean z3 = str3 == null && str4 == null;
        this.f23527m = z3;
        if (z3) {
            this.f23517c = new C1032j(str, str2, bVar);
        } else {
            this.f23517c = new C1027e(str, str2, bVar);
        }
        this.f23528n = new ReentrantReadWriteLock(true);
    }

    public t(InterfaceC1028f interfaceC1028f, String str, String str2) {
        this(interfaceC1028f, str, str2, new com.amazonaws.services.securitytoken.b(new o(), new com.amazonaws.d()));
    }

    public t(InterfaceC1028f interfaceC1028f, String str, String str2, com.amazonaws.services.securitytoken.a aVar) {
        this.f23517c = interfaceC1028f;
        if (interfaceC1028f instanceof AbstractC1026d) {
            AbstractC1026d abstractC1026d = (AbstractC1026d) interfaceC1028f;
            Object obj = abstractC1026d.f23429a;
            if ((obj instanceof com.amazonaws.a) && ((com.amazonaws.a) obj).X() != null) {
                this.f23515a = ((com.amazonaws.a) abstractC1026d.f23429a).X().e();
                this.f23524j = str;
                this.f23525k = str2;
                this.f23521g = aVar;
                this.f23522h = 3600;
                this.f23523i = 500;
                this.f23527m = false;
                this.f23528n = new ReentrantReadWriteLock(true);
            }
        }
        f23512o.m("Could not determine region of the Cognito Identity client, using default us-east-1");
        this.f23515a = Regions.US_EAST_1.e();
        this.f23524j = str;
        this.f23525k = str2;
        this.f23521g = aVar;
        this.f23522h = 3600;
        this.f23523i = 500;
        this.f23527m = false;
        this.f23528n = new ReentrantReadWriteLock(true);
    }

    public t(InterfaceC1028f interfaceC1028f, Regions regions) {
        this(interfaceC1028f, regions, new com.amazonaws.d());
    }

    public t(InterfaceC1028f interfaceC1028f, Regions regions, com.amazonaws.d dVar) {
        this(interfaceC1028f, e(dVar, regions));
    }

    public t(InterfaceC1028f interfaceC1028f, com.amazonaws.services.cognitoidentity.b bVar) {
        this.f23516b = bVar;
        this.f23515a = bVar.X().e();
        this.f23517c = interfaceC1028f;
        this.f23524j = null;
        this.f23525k = null;
        this.f23521g = null;
        this.f23522h = 3600;
        this.f23523i = 500;
        this.f23527m = true;
        this.f23528n = new ReentrantReadWriteLock(true);
    }
}
