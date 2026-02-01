package com.google.android.gms.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.internal.C1172b;
import com.google.android.gms.common.api.internal.C1205n;
import com.google.android.gms.common.api.internal.C1207o;
import com.google.android.gms.common.api.internal.C1218u;
import com.google.android.gms.common.api.internal.InterfaceC1220v;
import com.google.android.gms.common.api.internal.InterfaceC1226y;
import com.google.android.gms.tasks.AbstractC1760a;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1771l;
import com.google.android.gms.tasks.InterfaceC1762c;
import com.google.android.gms.tasks.InterfaceC1767h;

/* renamed from: com.google.android.gms.location.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1572j extends com.google.android.gms.common.api.h<C1164a.d.C0267d> {

    /* renamed from: k, reason: collision with root package name */
    @androidx.annotation.N
    public static final String f30010k = "mockLocation";

    /* renamed from: l, reason: collision with root package name */
    @androidx.annotation.N
    public static final String f30011l = "verticalAccuracy";

    @androidx.annotation.i0(otherwise = 3)
    public C1572j(@androidx.annotation.N Activity activity) {
        super(activity, C1589s.f30052a, C1164a.d.f28041g, (InterfaceC1226y) new C1172b());
    }

    private final AbstractC1770k<Void> O(final com.google.android.gms.internal.location.C c4, final AbstractC1586q abstractC1586q, Looper looper, final U u3, int i4) {
        final C1205n a4 = C1207o.a(abstractC1586q, com.google.android.gms.internal.location.L.a(looper), AbstractC1586q.class.getSimpleName());
        final Q q4 = new Q(this, a4);
        return k(C1218u.a().c(new InterfaceC1220v(this, q4, abstractC1586q, u3, c4, a4) { // from class: com.google.android.gms.location.K

            /* renamed from: a, reason: collision with root package name */
            private final C1572j f29904a;

            /* renamed from: b, reason: collision with root package name */
            private final W f29905b;

            /* renamed from: c, reason: collision with root package name */
            private final AbstractC1586q f29906c;

            /* renamed from: d, reason: collision with root package name */
            private final U f29907d;

            /* renamed from: e, reason: collision with root package name */
            private final com.google.android.gms.internal.location.C f29908e;

            /* renamed from: f, reason: collision with root package name */
            private final C1205n f29909f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f29904a = this;
                this.f29905b = q4;
                this.f29906c = abstractC1586q;
                this.f29907d = u3;
                this.f29908e = c4;
                this.f29909f = a4;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC1220v
            public final void a(Object obj, Object obj2) {
                this.f29904a.L(this.f29905b, this.f29906c, this.f29907d, this.f29908e, this.f29909f, (com.google.android.gms.internal.location.A) obj, (C1771l) obj2);
            }
        }).g(q4).h(a4).f(i4).a());
    }

    @androidx.annotation.N
    public AbstractC1770k<Void> A() {
        return o(com.google.android.gms.common.api.internal.A.a().c(b1.f29972a).f(2422).a());
    }

    @androidx.annotation.Y(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @androidx.annotation.N
    public AbstractC1770k<Location> B(int i4, @androidx.annotation.N final AbstractC1760a abstractC1760a) {
        LocationRequest c02 = LocationRequest.c0();
        c02.j1(i4);
        c02.f1(0L);
        c02.a1(0L);
        c02.M0(30000L);
        final com.google.android.gms.internal.location.C c03 = com.google.android.gms.internal.location.C.c0(null, c02);
        c03.u0(true);
        c03.e0(10000L);
        AbstractC1770k i5 = i(com.google.android.gms.common.api.internal.A.a().c(new InterfaceC1220v(this, abstractC1760a, c03) { // from class: com.google.android.gms.location.H

            /* renamed from: a, reason: collision with root package name */
            private final C1572j f29893a;

            /* renamed from: b, reason: collision with root package name */
            private final AbstractC1760a f29894b;

            /* renamed from: c, reason: collision with root package name */
            private final com.google.android.gms.internal.location.C f29895c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f29893a = this;
                this.f29894b = abstractC1760a;
                this.f29895c = c03;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC1220v
            public final void a(Object obj, Object obj2) {
                this.f29893a.M(this.f29894b, this.f29895c, (com.google.android.gms.internal.location.A) obj, (C1771l) obj2);
            }
        }).e(Z0.f29962d).f(2415).a());
        if (abstractC1760a != null) {
            final C1771l c1771l = new C1771l(abstractC1760a);
            i5.o(new InterfaceC1762c(c1771l) { // from class: com.google.android.gms.location.I

                /* renamed from: a, reason: collision with root package name */
                private final C1771l f29898a;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f29898a = c1771l;
                }

                @Override // com.google.android.gms.tasks.InterfaceC1762c
                public final Object a(AbstractC1770k abstractC1770k) {
                    C1771l c1771l2 = this.f29898a;
                    if (abstractC1770k.v()) {
                        c1771l2.e((Location) abstractC1770k.r());
                    } else {
                        Exception q4 = abstractC1770k.q();
                        if (q4 != null) {
                            c1771l2.b(q4);
                        }
                    }
                    return c1771l2.a();
                }
            });
            return c1771l.a();
        }
        return i5;
    }

    @androidx.annotation.Y(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @androidx.annotation.N
    public AbstractC1770k<Location> C() {
        return i(com.google.android.gms.common.api.internal.A.a().c(new InterfaceC1220v(this) { // from class: com.google.android.gms.location.a1

            /* renamed from: a, reason: collision with root package name */
            private final C1572j f29971a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f29971a = this;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC1220v
            public final void a(Object obj, Object obj2) {
                this.f29971a.N((com.google.android.gms.internal.location.A) obj, (C1771l) obj2);
            }
        }).f(2414).a());
    }

    @androidx.annotation.Y(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @androidx.annotation.N
    public AbstractC1770k<LocationAvailability> D() {
        return i(com.google.android.gms.common.api.internal.A.a().c(J.f29902a).f(2416).a());
    }

    @androidx.annotation.N
    public AbstractC1770k<Void> E(@androidx.annotation.N final PendingIntent pendingIntent) {
        return o(com.google.android.gms.common.api.internal.A.a().c(new InterfaceC1220v(pendingIntent) { // from class: com.google.android.gms.location.M

            /* renamed from: a, reason: collision with root package name */
            private final PendingIntent f29936a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f29936a = pendingIntent;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC1220v
            public final void a(Object obj, Object obj2) {
                ((com.google.android.gms.internal.location.A) obj).B0(this.f29936a, new V((C1771l) obj2));
            }
        }).f(2418).a());
    }

    @androidx.annotation.N
    public AbstractC1770k<Void> F(@androidx.annotation.N AbstractC1586q abstractC1586q) {
        return com.google.android.gms.common.api.internal.B.c(l(C1207o.c(abstractC1586q, AbstractC1586q.class.getSimpleName())));
    }

    @androidx.annotation.Y(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @androidx.annotation.N
    public AbstractC1770k<Void> G(@androidx.annotation.N LocationRequest locationRequest, @androidx.annotation.N final PendingIntent pendingIntent) {
        final com.google.android.gms.internal.location.C c02 = com.google.android.gms.internal.location.C.c0(null, locationRequest);
        return o(com.google.android.gms.common.api.internal.A.a().c(new InterfaceC1220v(this, c02, pendingIntent) { // from class: com.google.android.gms.location.L

            /* renamed from: a, reason: collision with root package name */
            private final C1572j f29912a;

            /* renamed from: b, reason: collision with root package name */
            private final com.google.android.gms.internal.location.C f29913b;

            /* renamed from: c, reason: collision with root package name */
            private final PendingIntent f29914c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f29912a = this;
                this.f29913b = c02;
                this.f29914c = pendingIntent;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC1220v
            public final void a(Object obj, Object obj2) {
                this.f29912a.K(this.f29913b, this.f29914c, (com.google.android.gms.internal.location.A) obj, (C1771l) obj2);
            }
        }).f(2417).a());
    }

    @androidx.annotation.Y(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @androidx.annotation.N
    public AbstractC1770k<Void> H(@androidx.annotation.N LocationRequest locationRequest, @androidx.annotation.N AbstractC1586q abstractC1586q, @androidx.annotation.N Looper looper) {
        return O(com.google.android.gms.internal.location.C.c0(null, locationRequest), abstractC1586q, looper, null, 2436);
    }

    @androidx.annotation.Y(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @androidx.annotation.N
    public AbstractC1770k<Void> I(@androidx.annotation.N final Location location) {
        return o(com.google.android.gms.common.api.internal.A.a().c(new InterfaceC1220v(location) { // from class: com.google.android.gms.location.O

            /* renamed from: a, reason: collision with root package name */
            private final Location f29940a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f29940a = location;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC1220v
            public final void a(Object obj, Object obj2) {
                ((com.google.android.gms.internal.location.A) obj).E0(this.f29940a);
                ((C1771l) obj2).c(null);
            }
        }).f(2421).a());
    }

    @androidx.annotation.Y(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @androidx.annotation.N
    public AbstractC1770k<Void> J(final boolean z3) {
        return o(com.google.android.gms.common.api.internal.A.a().c(new InterfaceC1220v(z3) { // from class: com.google.android.gms.location.N

            /* renamed from: a, reason: collision with root package name */
            private final boolean f29938a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f29938a = z3;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC1220v
            public final void a(Object obj, Object obj2) {
                ((com.google.android.gms.internal.location.A) obj).D0(this.f29938a);
                ((C1771l) obj2).c(null);
            }
        }).f(2420).a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void K(com.google.android.gms.internal.location.C c4, PendingIntent pendingIntent, com.google.android.gms.internal.location.A a4, C1771l c1771l) throws RemoteException {
        V v3 = new V(c1771l);
        c4.i0(r());
        a4.y0(c4, pendingIntent, v3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void L(final W w3, final AbstractC1586q abstractC1586q, final U u3, com.google.android.gms.internal.location.C c4, C1205n c1205n, com.google.android.gms.internal.location.A a4, C1771l c1771l) throws RemoteException {
        T t3 = new T(c1771l, new U(this, w3, abstractC1586q, u3) { // from class: com.google.android.gms.location.c1

            /* renamed from: a, reason: collision with root package name */
            private final C1572j f29974a;

            /* renamed from: b, reason: collision with root package name */
            private final W f29975b;

            /* renamed from: c, reason: collision with root package name */
            private final AbstractC1586q f29976c;

            /* renamed from: d, reason: collision with root package name */
            private final U f29977d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f29974a = this;
                this.f29975b = w3;
                this.f29976c = abstractC1586q;
                this.f29977d = u3;
            }

            @Override // com.google.android.gms.location.U
            public final void zza() {
                C1572j c1572j = this.f29974a;
                W w4 = this.f29975b;
                AbstractC1586q abstractC1586q2 = this.f29976c;
                U u4 = this.f29977d;
                w4.c(false);
                c1572j.F(abstractC1586q2);
                if (u4 != null) {
                    u4.zza();
                }
            }
        });
        c4.i0(r());
        a4.w0(c4, c1205n, t3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void M(AbstractC1760a abstractC1760a, com.google.android.gms.internal.location.C c4, com.google.android.gms.internal.location.A a4, final C1771l c1771l) throws RemoteException {
        final P p4 = new P(this, c1771l);
        if (abstractC1760a != null) {
            abstractC1760a.b(new InterfaceC1767h(this, p4) { // from class: com.google.android.gms.location.d1

                /* renamed from: a, reason: collision with root package name */
                private final C1572j f29984a;

                /* renamed from: b, reason: collision with root package name */
                private final AbstractC1586q f29985b;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f29984a = this;
                    this.f29985b = p4;
                }

                @Override // com.google.android.gms.tasks.InterfaceC1767h
                public final void a() {
                    this.f29984a.F(this.f29985b);
                }
            });
        }
        O(c4, p4, Looper.getMainLooper(), new U(c1771l) { // from class: com.google.android.gms.location.e1

            /* renamed from: a, reason: collision with root package name */
            private final C1771l f29989a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f29989a = c1771l;
            }

            @Override // com.google.android.gms.location.U
            public final void zza() {
                this.f29989a.e(null);
            }
        }, 2437).o(new InterfaceC1762c(c1771l) { // from class: com.google.android.gms.location.G

            /* renamed from: a, reason: collision with root package name */
            private final C1771l f29892a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f29892a = c1771l;
            }

            @Override // com.google.android.gms.tasks.InterfaceC1762c
            public final Object a(AbstractC1770k abstractC1770k) {
                C1771l c1771l2 = this.f29892a;
                if (!abstractC1770k.v()) {
                    if (abstractC1770k.q() != null) {
                        Exception q4 = abstractC1770k.q();
                        if (q4 != null) {
                            c1771l2.b(q4);
                        }
                    } else {
                        c1771l2.e(null);
                    }
                }
                return c1771l2.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void N(com.google.android.gms.internal.location.A a4, C1771l c1771l) throws RemoteException {
        c1771l.c(a4.Q0(r()));
    }

    @androidx.annotation.i0(otherwise = 3)
    public C1572j(@androidx.annotation.N Context context) {
        super(context, C1589s.f30052a, C1164a.d.f28041g, new C1172b());
    }
}
