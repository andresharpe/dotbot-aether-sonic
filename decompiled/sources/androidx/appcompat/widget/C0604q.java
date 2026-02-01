package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.RestrictTo;
import androidx.core.view.C0823k0;
import d.C2042a;
import e.C2046a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0604q {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.N
    private final ImageView f6304a;

    /* renamed from: b, reason: collision with root package name */
    private e0 f6305b;

    /* renamed from: c, reason: collision with root package name */
    private e0 f6306c;

    /* renamed from: d, reason: collision with root package name */
    private e0 f6307d;

    /* renamed from: e, reason: collision with root package name */
    private int f6308e = 0;

    public C0604q(@androidx.annotation.N ImageView imageView) {
        this.f6304a = imageView;
    }

    private boolean a(@androidx.annotation.N Drawable drawable) {
        if (this.f6307d == null) {
            this.f6307d = new e0();
        }
        e0 e0Var = this.f6307d;
        e0Var.a();
        ColorStateList a4 = androidx.core.widget.k.a(this.f6304a);
        if (a4 != null) {
            e0Var.f6191d = true;
            e0Var.f6188a = a4;
        }
        PorterDuff.Mode b4 = androidx.core.widget.k.b(this.f6304a);
        if (b4 != null) {
            e0Var.f6190c = true;
            e0Var.f6189b = b4;
        }
        if (!e0Var.f6191d && !e0Var.f6190c) {
            return false;
        }
        C0599l.j(drawable, e0Var, this.f6304a.getDrawableState());
        return true;
    }

    private boolean m() {
        if (this.f6305b != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (this.f6304a.getDrawable() != null) {
            this.f6304a.getDrawable().setLevel(this.f6308e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        Drawable drawable = this.f6304a.getDrawable();
        if (drawable != null) {
            L.b(drawable);
        }
        if (drawable != null) {
            if (m() && a(drawable)) {
                return;
            }
            e0 e0Var = this.f6306c;
            if (e0Var != null) {
                C0599l.j(drawable, e0Var, this.f6304a.getDrawableState());
                return;
            }
            e0 e0Var2 = this.f6305b;
            if (e0Var2 != null) {
                C0599l.j(drawable, e0Var2, this.f6304a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList d() {
        e0 e0Var = this.f6306c;
        if (e0Var != null) {
            return e0Var.f6188a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode e() {
        e0 e0Var = this.f6306c;
        if (e0Var != null) {
            return e0Var.f6189b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        if (this.f6304a.getBackground() instanceof RippleDrawable) {
            return false;
        }
        return true;
    }

    public void g(AttributeSet attributeSet, int i4) {
        int u3;
        g0 G3 = g0.G(this.f6304a.getContext(), attributeSet, C2042a.m.f50086d0, i4, 0);
        ImageView imageView = this.f6304a;
        C0823k0.z1(imageView, imageView.getContext(), C2042a.m.f50086d0, attributeSet, G3.B(), i4, 0);
        try {
            Drawable drawable = this.f6304a.getDrawable();
            if (drawable == null && (u3 = G3.u(C2042a.m.f50096f0, -1)) != -1 && (drawable = C2046a.b(this.f6304a.getContext(), u3)) != null) {
                this.f6304a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                L.b(drawable);
            }
            if (G3.C(C2042a.m.f50101g0)) {
                androidx.core.widget.k.c(this.f6304a, G3.d(C2042a.m.f50101g0));
            }
            if (G3.C(C2042a.m.f50106h0)) {
                androidx.core.widget.k.d(this.f6304a, L.e(G3.o(C2042a.m.f50106h0, -1), null));
            }
            G3.I();
        } catch (Throwable th) {
            G3.I();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(@androidx.annotation.N Drawable drawable) {
        this.f6308e = drawable.getLevel();
    }

    public void i(int i4) {
        if (i4 != 0) {
            Drawable b4 = C2046a.b(this.f6304a.getContext(), i4);
            if (b4 != null) {
                L.b(b4);
            }
            this.f6304a.setImageDrawable(b4);
        } else {
            this.f6304a.setImageDrawable(null);
        }
        c();
    }

    void j(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f6305b == null) {
                this.f6305b = new e0();
            }
            e0 e0Var = this.f6305b;
            e0Var.f6188a = colorStateList;
            e0Var.f6191d = true;
        } else {
            this.f6305b = null;
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(ColorStateList colorStateList) {
        if (this.f6306c == null) {
            this.f6306c = new e0();
        }
        e0 e0Var = this.f6306c;
        e0Var.f6188a = colorStateList;
        e0Var.f6191d = true;
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(PorterDuff.Mode mode) {
        if (this.f6306c == null) {
            this.f6306c = new e0();
        }
        e0 e0Var = this.f6306c;
        e0Var.f6189b = mode;
        e0Var.f6190c = true;
        c();
    }
}
