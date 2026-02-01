package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import androidx.core.view.C0850t0;
import androidx.core.view.C0854v0;
import androidx.core.view.InterfaceC0852u0;
import java.util.ArrayList;
import java.util.Iterator;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    private Interpolator f5188c;

    /* renamed from: d, reason: collision with root package name */
    InterfaceC0852u0 f5189d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5190e;

    /* renamed from: b, reason: collision with root package name */
    private long f5187b = -1;

    /* renamed from: f, reason: collision with root package name */
    private final C0854v0 f5191f = new a();

    /* renamed from: a, reason: collision with root package name */
    final ArrayList<C0850t0> f5186a = new ArrayList<>();

    /* loaded from: classes.dex */
    class a extends C0854v0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f5192a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f5193b = 0;

        a() {
        }

        @Override // androidx.core.view.C0854v0, androidx.core.view.InterfaceC0852u0
        public void b(View view) {
            int i4 = this.f5193b + 1;
            this.f5193b = i4;
            if (i4 == h.this.f5186a.size()) {
                InterfaceC0852u0 interfaceC0852u0 = h.this.f5189d;
                if (interfaceC0852u0 != null) {
                    interfaceC0852u0.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.C0854v0, androidx.core.view.InterfaceC0852u0
        public void c(View view) {
            if (this.f5192a) {
                return;
            }
            this.f5192a = true;
            InterfaceC0852u0 interfaceC0852u0 = h.this.f5189d;
            if (interfaceC0852u0 != null) {
                interfaceC0852u0.c(null);
            }
        }

        void d() {
            this.f5193b = 0;
            this.f5192a = false;
            h.this.b();
        }
    }

    public void a() {
        if (!this.f5190e) {
            return;
        }
        Iterator<C0850t0> it = this.f5186a.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        this.f5190e = false;
    }

    void b() {
        this.f5190e = false;
    }

    public h c(C0850t0 c0850t0) {
        if (!this.f5190e) {
            this.f5186a.add(c0850t0);
        }
        return this;
    }

    public h d(C0850t0 c0850t0, C0850t0 c0850t02) {
        this.f5186a.add(c0850t0);
        c0850t02.w(c0850t0.e());
        this.f5186a.add(c0850t02);
        return this;
    }

    public h e(long j4) {
        if (!this.f5190e) {
            this.f5187b = j4;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f5190e) {
            this.f5188c = interpolator;
        }
        return this;
    }

    public h g(InterfaceC0852u0 interfaceC0852u0) {
        if (!this.f5190e) {
            this.f5189d = interfaceC0852u0;
        }
        return this;
    }

    public void h() {
        if (this.f5190e) {
            return;
        }
        Iterator<C0850t0> it = this.f5186a.iterator();
        while (it.hasNext()) {
            C0850t0 next = it.next();
            long j4 = this.f5187b;
            if (j4 >= 0) {
                next.s(j4);
            }
            Interpolator interpolator = this.f5188c;
            if (interpolator != null) {
                next.t(interpolator);
            }
            if (this.f5189d != null) {
                next.u(this.f5191f);
            }
            next.y();
        }
        this.f5190e = true;
    }
}
