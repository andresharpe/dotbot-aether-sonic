package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.C0823k0;
import d.C2042a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0593f {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.N
    private final View f6192a;

    /* renamed from: d, reason: collision with root package name */
    private e0 f6195d;

    /* renamed from: e, reason: collision with root package name */
    private e0 f6196e;

    /* renamed from: f, reason: collision with root package name */
    private e0 f6197f;

    /* renamed from: c, reason: collision with root package name */
    private int f6194c = -1;

    /* renamed from: b, reason: collision with root package name */
    private final C0599l f6193b = C0599l.b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0593f(@androidx.annotation.N View view) {
        this.f6192a = view;
    }

    private boolean a(@androidx.annotation.N Drawable drawable) {
        if (this.f6197f == null) {
            this.f6197f = new e0();
        }
        e0 e0Var = this.f6197f;
        e0Var.a();
        ColorStateList N3 = C0823k0.N(this.f6192a);
        if (N3 != null) {
            e0Var.f6191d = true;
            e0Var.f6188a = N3;
        }
        PorterDuff.Mode O3 = C0823k0.O(this.f6192a);
        if (O3 != null) {
            e0Var.f6190c = true;
            e0Var.f6189b = O3;
        }
        if (!e0Var.f6191d && !e0Var.f6190c) {
            return false;
        }
        C0599l.j(drawable, e0Var, this.f6192a.getDrawableState());
        return true;
    }

    private boolean k() {
        if (this.f6195d != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Drawable background = this.f6192a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            e0 e0Var = this.f6196e;
            if (e0Var != null) {
                C0599l.j(background, e0Var, this.f6192a.getDrawableState());
                return;
            }
            e0 e0Var2 = this.f6195d;
            if (e0Var2 != null) {
                C0599l.j(background, e0Var2, this.f6192a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList c() {
        e0 e0Var = this.f6196e;
        if (e0Var != null) {
            return e0Var.f6188a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        e0 e0Var = this.f6196e;
        if (e0Var != null) {
            return e0Var.f6189b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(@androidx.annotation.P AttributeSet attributeSet, int i4) {
        g0 G3 = g0.G(this.f6192a.getContext(), attributeSet, C2042a.m.Q6, i4, 0);
        View view = this.f6192a;
        C0823k0.z1(view, view.getContext(), C2042a.m.Q6, attributeSet, G3.B(), i4, 0);
        try {
            if (G3.C(C2042a.m.R6)) {
                this.f6194c = G3.u(C2042a.m.R6, -1);
                ColorStateList f4 = this.f6193b.f(this.f6192a.getContext(), this.f6194c);
                if (f4 != null) {
                    h(f4);
                }
            }
            if (G3.C(C2042a.m.S6)) {
                C0823k0.J1(this.f6192a, G3.d(C2042a.m.S6));
            }
            if (G3.C(C2042a.m.T6)) {
                C0823k0.K1(this.f6192a, L.e(G3.o(C2042a.m.T6, -1), null));
            }
            G3.I();
        } catch (Throwable th) {
            G3.I();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Drawable drawable) {
        this.f6194c = -1;
        h(null);
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(int i4) {
        ColorStateList colorStateList;
        this.f6194c = i4;
        C0599l c0599l = this.f6193b;
        if (c0599l != null) {
            colorStateList = c0599l.f(this.f6192a.getContext(), i4);
        } else {
            colorStateList = null;
        }
        h(colorStateList);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f6195d == null) {
                this.f6195d = new e0();
            }
            e0 e0Var = this.f6195d;
            e0Var.f6188a = colorStateList;
            e0Var.f6191d = true;
        } else {
            this.f6195d = null;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(ColorStateList colorStateList) {
        if (this.f6196e == null) {
            this.f6196e = new e0();
        }
        e0 e0Var = this.f6196e;
        e0Var.f6188a = colorStateList;
        e0Var.f6191d = true;
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(PorterDuff.Mode mode) {
        if (this.f6196e == null) {
            this.f6196e = new e0();
        }
        e0 e0Var = this.f6196e;
        e0Var.f6189b = mode;
        e0Var.f6190c = true;
        b();
    }
}
