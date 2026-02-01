package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.v4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1519v4 {

    /* renamed from: c, reason: collision with root package name */
    private static final X3 f29815c = X3.f29553d;

    /* renamed from: a, reason: collision with root package name */
    protected volatile P4 f29816a;

    /* renamed from: b, reason: collision with root package name */
    private volatile zzjd f29817b;

    public final int a() {
        if (this.f29817b != null) {
            return ((J3) this.f29817b).f29368I.length;
        }
        if (this.f29816a != null) {
            return this.f29816a.f();
        }
        return 0;
    }

    public final zzjd b() {
        if (this.f29817b != null) {
            return this.f29817b;
        }
        synchronized (this) {
            try {
                if (this.f29817b != null) {
                    return this.f29817b;
                }
                if (this.f29816a == null) {
                    this.f29817b = zzjd.f29849F;
                } else {
                    this.f29817b = this.f29816a.a();
                }
                return this.f29817b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final void c(P4 p4) {
        if (this.f29816a != null) {
            return;
        }
        synchronized (this) {
            if (this.f29816a == null) {
                try {
                    this.f29816a = p4;
                    this.f29817b = zzjd.f29849F;
                } catch (zzko unused) {
                    this.f29816a = p4;
                    this.f29817b = zzjd.f29849F;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1519v4)) {
            return false;
        }
        C1519v4 c1519v4 = (C1519v4) obj;
        P4 p4 = this.f29816a;
        P4 p42 = c1519v4.f29816a;
        if (p4 == null && p42 == null) {
            return b().equals(c1519v4.b());
        }
        if (p4 != null && p42 != null) {
            return p4.equals(p42);
        }
        if (p4 != null) {
            c1519v4.c(p4.b());
            return p4.equals(c1519v4.f29816a);
        }
        c(p42.b());
        return this.f29816a.equals(p42);
    }

    public int hashCode() {
        return 1;
    }
}
