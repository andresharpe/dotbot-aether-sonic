package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.c0;
import androidx.appcompat.view.b;
import androidx.fragment.app.F;
import d.C2042a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: androidx.appcompat.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0583a {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f4808a = 0;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f4809b = 1;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f4810c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f4811d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f4812e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f4813f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f4814g = 8;

    /* renamed from: h, reason: collision with root package name */
    public static final int f4815h = 16;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public @interface InterfaceC0041a {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.appcompat.app.a$c */
    /* loaded from: classes.dex */
    public @interface c {
    }

    /* renamed from: androidx.appcompat.app.a$d */
    /* loaded from: classes.dex */
    public interface d {
        void a(boolean z3);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.a$e */
    /* loaded from: classes.dex */
    public interface e {
        boolean a(int i4, long j4);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.a$f */
    /* loaded from: classes.dex */
    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        public static final int f4817a = -1;

        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract int d();

        public abstract Object e();

        public abstract CharSequence f();

        public abstract void g();

        public abstract f h(@c0 int i4);

        public abstract f i(CharSequence charSequence);

        public abstract f j(int i4);

        public abstract f k(View view);

        public abstract f l(@InterfaceC0578v int i4);

        public abstract f m(Drawable drawable);

        public abstract f n(g gVar);

        public abstract f o(Object obj);

        public abstract f p(int i4);

        public abstract f q(CharSequence charSequence);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.a$g */
    /* loaded from: classes.dex */
    public interface g {
        void a(f fVar, F f4);

        void b(f fVar, F f4);

        void c(f fVar, F f4);
    }

    public Context A() {
        return null;
    }

    public abstract void A0(CharSequence charSequence);

    @P
    public abstract CharSequence B();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void B0(CharSequence charSequence) {
    }

    public abstract void C();

    public abstract void C0();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean D() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public androidx.appcompat.view.b D0(b.a aVar) {
        return null;
    }

    public boolean E() {
        return false;
    }

    public abstract boolean F();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean G() {
        return false;
    }

    @Deprecated
    public abstract f H();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void I(Configuration configuration) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean K(int i4, KeyEvent keyEvent) {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean L(KeyEvent keyEvent) {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean M() {
        return false;
    }

    @Deprecated
    public abstract void N();

    public abstract void O(d dVar);

    @Deprecated
    public abstract void P(f fVar);

    @Deprecated
    public abstract void Q(int i4);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    boolean R() {
        return false;
    }

    @Deprecated
    public abstract void S(f fVar);

    public abstract void T(@P Drawable drawable);

    public abstract void U(int i4);

    public abstract void V(View view);

    public abstract void W(View view, b bVar);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void X(boolean z3) {
    }

    public abstract void Y(boolean z3);

    public abstract void Z(int i4);

    public abstract void a0(int i4, int i5);

    public abstract void b0(boolean z3);

    public abstract void c0(boolean z3);

    public abstract void d0(boolean z3);

    public abstract void e0(boolean z3);

    public void f0(float f4) {
        if (f4 == 0.0f) {
        } else {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    public abstract void g(d dVar);

    public void g0(int i4) {
        if (i4 == 0) {
        } else {
            throw new UnsupportedOperationException("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
        }
    }

    @Deprecated
    public abstract void h(f fVar);

    public void h0(boolean z3) {
        if (!z3) {
        } else {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    @Deprecated
    public abstract void i(f fVar, int i4);

    public void i0(@c0 int i4) {
    }

    @Deprecated
    public abstract void j(f fVar, int i4, boolean z3);

    public void j0(@P CharSequence charSequence) {
    }

    @Deprecated
    public abstract void k(f fVar, boolean z3);

    public void k0(@InterfaceC0578v int i4) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean l() {
        return false;
    }

    public void l0(@P Drawable drawable) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean m() {
        return false;
    }

    public void m0(boolean z3) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void n(boolean z3) {
    }

    public abstract void n0(@InterfaceC0578v int i4);

    public abstract View o();

    public abstract void o0(Drawable drawable);

    public abstract int p();

    @Deprecated
    public abstract void p0(SpinnerAdapter spinnerAdapter, e eVar);

    public float q() {
        return 0.0f;
    }

    public abstract void q0(@InterfaceC0578v int i4);

    public abstract int r();

    public abstract void r0(Drawable drawable);

    public int s() {
        return 0;
    }

    @Deprecated
    public abstract void s0(int i4);

    @Deprecated
    public abstract int t();

    @Deprecated
    public abstract void t0(int i4);

    @Deprecated
    public abstract int u();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void u0(boolean z3) {
    }

    @Deprecated
    public abstract int v();

    public void v0(Drawable drawable) {
    }

    @P
    @Deprecated
    public abstract f w();

    public void w0(Drawable drawable) {
    }

    @P
    public abstract CharSequence x();

    public abstract void x0(int i4);

    @Deprecated
    public abstract f y(int i4);

    public abstract void y0(CharSequence charSequence);

    @Deprecated
    public abstract int z();

    public abstract void z0(@c0 int i4);

    /* renamed from: androidx.appcompat.app.a$b */
    /* loaded from: classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f4816a;

        public b(@N Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4816a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042a.m.f49982E);
            this.f4816a = obtainStyledAttributes.getInt(C2042a.m.f49986F, 0);
            obtainStyledAttributes.recycle();
        }

        public b(int i4, int i5) {
            super(i4, i5);
            this.f4816a = 8388627;
        }

        public b(int i4, int i5, int i6) {
            super(i4, i5);
            this.f4816a = i6;
        }

        public b(int i4) {
            this(-2, -1, i4);
        }

        public b(b bVar) {
            super((ViewGroup.MarginLayoutParams) bVar);
            this.f4816a = 0;
            this.f4816a = bVar.f4816a;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4816a = 0;
        }
    }
}
