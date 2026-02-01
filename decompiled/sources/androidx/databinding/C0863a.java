package androidx.databinding;

import androidx.annotation.N;
import androidx.databinding.u;

/* renamed from: androidx.databinding.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0863a implements u {

    /* renamed from: E, reason: collision with root package name */
    private transient A f14020E;

    @Override // androidx.databinding.u
    public void a(@N u.a aVar) {
        synchronized (this) {
            try {
                if (this.f14020E == null) {
                    this.f14020E = new A();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f14020E.a(aVar);
    }

    @Override // androidx.databinding.u
    public void c(@N u.a aVar) {
        synchronized (this) {
            try {
                A a4 = this.f14020E;
                if (a4 == null) {
                    return;
                }
                a4.o(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        synchronized (this) {
            try {
                A a4 = this.f14020E;
                if (a4 == null) {
                    return;
                }
                a4.i(this, 0, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g(int i4) {
        synchronized (this) {
            try {
                A a4 = this.f14020E;
                if (a4 == null) {
                    return;
                }
                a4.i(this, i4, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
