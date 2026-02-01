package com.amazonaws.auth;

import android.content.Context;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitoidentity.model.NotAuthorizedException;
import java.util.Date;
import java.util.Map;

/* loaded from: classes.dex */
public class s extends t {

    /* renamed from: r, reason: collision with root package name */
    volatile boolean f23506r;

    /* renamed from: s, reason: collision with root package name */
    com.amazonaws.internal.keyvaluestore.a f23507s;

    /* renamed from: t, reason: collision with root package name */
    private String f23508t;

    /* renamed from: u, reason: collision with root package name */
    private final v f23509u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f23510v;

    /* renamed from: w, reason: collision with root package name */
    private static final String f23502w = s.class.getName() + "/" + com.amazonaws.util.B.c();

    /* renamed from: x, reason: collision with root package name */
    private static final com.amazonaws.logging.c f23503x = LogFactory.c(s.class);

    /* renamed from: y, reason: collision with root package name */
    private static final String f23504y = "com.amazonaws.android.auth";

    /* renamed from: z, reason: collision with root package name */
    private static final String f23505z = "identityId";

    /* renamed from: A, reason: collision with root package name */
    private static final String f23498A = "accessKey";

    /* renamed from: B, reason: collision with root package name */
    private static final String f23499B = "secretKey";

    /* renamed from: C, reason: collision with root package name */
    private static final String f23500C = "sessionToken";

    /* renamed from: D, reason: collision with root package name */
    private static final String f23501D = "expirationDate";

    /* loaded from: classes.dex */
    class a implements v {
        a() {
        }

        @Override // com.amazonaws.auth.v
        public void a(String str, String str2) {
            s.f23503x.a("Identity id is changed");
            s.this.U(str2);
            s.this.d();
        }
    }

    public s(Context context, String str, String str2, String str3, String str4, Regions regions) {
        super(str, str2, str3, str4, regions);
        this.f23506r = false;
        this.f23509u = new a();
        this.f23510v = true;
        if (context != null) {
            Q(context);
            return;
        }
        throw new IllegalArgumentException("context can't be null");
    }

    private void N() {
        com.amazonaws.internal.keyvaluestore.a aVar = this.f23507s;
        String str = f23505z;
        if (aVar.b(str)) {
            f23503x.i("Identity id without namespace is detected. It will be saved under new namespace.");
            String g4 = this.f23507s.g(str);
            this.f23507s.a();
            this.f23507s.o(S(str), g4);
        }
    }

    private boolean P() {
        boolean b4 = this.f23507s.b(S(f23498A));
        boolean b5 = this.f23507s.b(S(f23499B));
        boolean b6 = this.f23507s.b(S(f23500C));
        if (!b4 && !b5 && !b6) {
            return false;
        }
        f23503x.a("No valid credentials found in SharedPreferences");
        return true;
    }

    private void Q(Context context) {
        this.f23507s = new com.amazonaws.internal.keyvaluestore.a(context, f23504y, this.f23510v);
        N();
        this.f23508t = O();
        R();
        x(this.f23509u);
    }

    private void R() {
        com.amazonaws.logging.c cVar = f23503x;
        cVar.a("Loading credentials from SharedPreferences");
        String g4 = this.f23507s.g(S(f23501D));
        if (g4 != null) {
            try {
                this.f23519e = new Date(Long.parseLong(g4));
                if (!P()) {
                    this.f23519e = null;
                    return;
                }
                String g5 = this.f23507s.g(S(f23498A));
                String g6 = this.f23507s.g(S(f23499B));
                String g7 = this.f23507s.g(S(f23500C));
                if (g5 != null && g6 != null && g7 != null) {
                    this.f23518d = new q(g5, g6, g7);
                    return;
                } else {
                    cVar.a("No valid credentials found in SharedPreferences");
                    this.f23519e = null;
                    return;
                }
            } catch (NumberFormatException unused) {
                this.f23519e = null;
                return;
            }
        }
        this.f23519e = null;
    }

    private String S(String str) {
        return j() + "." + str;
    }

    private void T(m mVar, long j4) {
        f23503x.a("Saving credentials to SharedPreferences");
        if (mVar != null) {
            this.f23507s.o(S(f23498A), mVar.a());
            this.f23507s.o(S(f23499B), mVar.c());
            this.f23507s.o(S(f23500C), mVar.b());
            this.f23507s.o(S(f23501D), String.valueOf(j4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(String str) {
        f23503x.a("Saving identity id to SharedPreferences");
        this.f23508t = str;
        this.f23507s.o(S(f23505z), str);
    }

    @Override // com.amazonaws.auth.t
    public void C(Map<String, String> map) {
        this.f23528n.writeLock().lock();
        try {
            super.C(map);
            this.f23506r = true;
            d();
        } finally {
            this.f23528n.writeLock().unlock();
        }
    }

    public String O() {
        String g4 = this.f23507s.g(S(f23505z));
        if (g4 != null && this.f23508t == null) {
            super.B(g4);
        }
        return g4;
    }

    public void V(boolean z3) {
        this.f23510v = z3;
        this.f23507s.r(z3);
    }

    @Override // com.amazonaws.auth.t
    public void c() {
        super.c();
        com.amazonaws.internal.keyvaluestore.a aVar = this.f23507s;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.amazonaws.auth.t
    public void d() {
        this.f23528n.writeLock().lock();
        try {
            super.d();
            f23503x.a("Clearing credentials from SharedPreferences");
            this.f23507s.p(S(f23498A));
            this.f23507s.p(S(f23499B));
            this.f23507s.p(S(f23500C));
            this.f23507s.p(S(f23501D));
        } finally {
            this.f23528n.writeLock().unlock();
        }
    }

    @Override // com.amazonaws.auth.t, com.amazonaws.auth.InterfaceC1030h
    /* renamed from: g */
    public m a() {
        m mVar;
        this.f23528n.writeLock().lock();
        try {
            try {
                if (this.f23518d == null) {
                    R();
                }
                if (this.f23519e != null && !u()) {
                    mVar = this.f23518d;
                } else {
                    f23503x.a("Making a network call to fetch credentials.");
                    super.a();
                    Date date = this.f23519e;
                    if (date != null) {
                        T(this.f23518d, date.getTime());
                    }
                    mVar = this.f23518d;
                }
            } catch (NotAuthorizedException e4) {
                f23503x.l("Failure to get credentials", e4);
                if (m() != null) {
                    super.B(null);
                    super.a();
                    mVar = this.f23518d;
                } else {
                    throw e4;
                }
            }
            this.f23528n.writeLock().unlock();
            return mVar;
        } catch (Throwable th) {
            this.f23528n.writeLock().unlock();
            throw th;
        }
    }

    @Override // com.amazonaws.auth.t
    public String i() {
        if (this.f23506r) {
            this.f23506r = false;
            refresh();
            String i4 = super.i();
            this.f23508t = i4;
            U(i4);
        }
        String O3 = O();
        this.f23508t = O3;
        if (O3 == null) {
            String i5 = super.i();
            this.f23508t = i5;
            U(i5);
        }
        return this.f23508t;
    }

    @Override // com.amazonaws.auth.t, com.amazonaws.auth.InterfaceC1030h
    public void refresh() {
        this.f23528n.writeLock().lock();
        try {
            super.refresh();
            Date date = this.f23519e;
            if (date != null) {
                T(this.f23518d, date.getTime());
            }
        } finally {
            this.f23528n.writeLock().unlock();
        }
    }

    @Override // com.amazonaws.auth.t
    protected String t() {
        return f23502w;
    }

    public s(Context context, String str, String str2, String str3, String str4, Regions regions, com.amazonaws.d dVar) {
        super(str, str2, str3, str4, regions, dVar);
        this.f23506r = false;
        this.f23509u = new a();
        this.f23510v = true;
        if (context != null) {
            Q(context);
            return;
        }
        throw new IllegalArgumentException("context can't be null");
    }

    public s(Context context, String str, Regions regions) {
        super(str, regions);
        this.f23506r = false;
        this.f23509u = new a();
        this.f23510v = true;
        if (context != null) {
            Q(context);
            return;
        }
        throw new IllegalArgumentException("context can't be null");
    }

    public s(Context context, o0.b bVar) {
        super(bVar);
        this.f23506r = false;
        this.f23509u = new a();
        this.f23510v = true;
        if (context != null) {
            Q(context);
            return;
        }
        throw new IllegalArgumentException("context can't be null");
    }

    public s(Context context, String str, Regions regions, com.amazonaws.d dVar) {
        super(str, regions, dVar);
        this.f23506r = false;
        this.f23509u = new a();
        this.f23510v = true;
        if (context != null) {
            Q(context);
            return;
        }
        throw new IllegalArgumentException("context can't be null");
    }

    public s(Context context, String str, String str2, String str3, String str4, com.amazonaws.services.cognitoidentity.b bVar, com.amazonaws.services.securitytoken.a aVar) {
        super(str, str2, str3, str4, bVar, aVar);
        this.f23506r = false;
        this.f23509u = new a();
        this.f23510v = true;
        if (context != null) {
            Q(context);
            return;
        }
        throw new IllegalArgumentException("context can't be null");
    }

    public s(Context context, InterfaceC1028f interfaceC1028f, String str, String str2) {
        super(interfaceC1028f, str, str2);
        this.f23506r = false;
        this.f23509u = new a();
        this.f23510v = true;
        if (context != null) {
            Q(context);
            return;
        }
        throw new IllegalArgumentException("context can't be null");
    }

    public s(Context context, InterfaceC1028f interfaceC1028f, String str, String str2, com.amazonaws.services.securitytoken.a aVar) {
        super(interfaceC1028f, str, str2, aVar);
        this.f23506r = false;
        this.f23509u = new a();
        this.f23510v = true;
        if (context != null) {
            Q(context);
            return;
        }
        throw new IllegalArgumentException("context can't be null");
    }

    public s(Context context, InterfaceC1028f interfaceC1028f, Regions regions) {
        super(interfaceC1028f, regions);
        this.f23506r = false;
        this.f23509u = new a();
        this.f23510v = true;
        if (context != null) {
            Q(context);
            return;
        }
        throw new IllegalArgumentException("context can't be null");
    }

    public s(Context context, InterfaceC1028f interfaceC1028f, Regions regions, com.amazonaws.d dVar) {
        super(interfaceC1028f, regions, dVar);
        this.f23506r = false;
        this.f23509u = new a();
        this.f23510v = true;
        if (context != null) {
            Q(context);
            return;
        }
        throw new IllegalArgumentException("context can't be null");
    }
}
