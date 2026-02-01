package com.google.android.gms.measurement.internal;

@com.google.android.gms.common.util.D
/* renamed from: com.google.android.gms.measurement.internal.f1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1637f1 {

    /* renamed from: h, reason: collision with root package name */
    private static final Object f30613h = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final String f30614a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1613b1 f30615b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f30616c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f30617d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f30618e = new Object();

    /* renamed from: f, reason: collision with root package name */
    @androidx.annotation.B("overrideLock")
    private volatile Object f30619f = null;

    /* renamed from: g, reason: collision with root package name */
    @androidx.annotation.B("cachingLock")
    private volatile Object f30620g = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1637f1(String str, Object obj, Object obj2, InterfaceC1613b1 interfaceC1613b1, C1625d1 c1625d1) {
        this.f30614a = str;
        this.f30616c = obj;
        this.f30617d = obj2;
        this.f30615b = interfaceC1613b1;
    }

    public final Object a(Object obj) {
        Object obj2;
        synchronized (this.f30618e) {
        }
        if (obj != null) {
            return obj;
        }
        if (C1619c1.f30557a == null) {
            return this.f30616c;
        }
        synchronized (f30613h) {
            try {
                if (C1617c.a()) {
                    if (this.f30620g == null) {
                        obj2 = this.f30616c;
                    } else {
                        obj2 = this.f30620g;
                    }
                    return obj2;
                }
                try {
                    for (C1637f1 c1637f1 : C1643g1.b()) {
                        if (!C1617c.a()) {
                            Object obj3 = null;
                            try {
                                InterfaceC1613b1 interfaceC1613b1 = c1637f1.f30615b;
                                if (interfaceC1613b1 != null) {
                                    obj3 = interfaceC1613b1.zza();
                                }
                            } catch (IllegalStateException unused) {
                            }
                            synchronized (f30613h) {
                                c1637f1.f30620g = obj3;
                            }
                        } else {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                    }
                } catch (SecurityException unused2) {
                }
                InterfaceC1613b1 interfaceC1613b12 = this.f30615b;
                if (interfaceC1613b12 == null) {
                    return this.f30616c;
                }
                try {
                    return interfaceC1613b12.zza();
                } catch (IllegalStateException unused3) {
                    return this.f30616c;
                } catch (SecurityException unused4) {
                    return this.f30616c;
                }
            } finally {
            }
        }
    }

    public final String b() {
        return this.f30614a;
    }
}
