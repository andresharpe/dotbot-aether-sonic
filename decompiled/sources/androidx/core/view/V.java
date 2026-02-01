package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public class V {

    /* renamed from: a, reason: collision with root package name */
    private ViewParent f13224a;

    /* renamed from: b, reason: collision with root package name */
    private ViewParent f13225b;

    /* renamed from: c, reason: collision with root package name */
    private final View f13226c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13227d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f13228e;

    public V(@androidx.annotation.N View view) {
        this.f13226c = view;
    }

    private boolean h(int i4, int i5, int i6, int i7, @androidx.annotation.P int[] iArr, int i8, @androidx.annotation.P int[] iArr2) {
        ViewParent i9;
        int i10;
        int i11;
        int[] iArr3;
        if (!m() || (i9 = i(i8)) == null) {
            return false;
        }
        if (i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f13226c.getLocationInWindow(iArr);
            i10 = iArr[0];
            i11 = iArr[1];
        } else {
            i10 = 0;
            i11 = 0;
        }
        if (iArr2 == null) {
            int[] j4 = j();
            j4[0] = 0;
            j4[1] = 0;
            iArr3 = j4;
        } else {
            iArr3 = iArr2;
        }
        C0846r0.i(i9, this.f13226c, i4, i5, i6, i7, i8, iArr3);
        if (iArr != null) {
            this.f13226c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i10;
            iArr[1] = iArr[1] - i11;
        }
        return true;
    }

    private ViewParent i(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                return null;
            }
            return this.f13225b;
        }
        return this.f13224a;
    }

    private int[] j() {
        if (this.f13228e == null) {
            this.f13228e = new int[2];
        }
        return this.f13228e;
    }

    private void q(int i4, ViewParent viewParent) {
        if (i4 != 0) {
            if (i4 == 1) {
                this.f13225b = viewParent;
                return;
            }
            return;
        }
        this.f13224a = viewParent;
    }

    public boolean a(float f4, float f5, boolean z3) {
        ViewParent i4;
        if (!m() || (i4 = i(0)) == null) {
            return false;
        }
        return C0846r0.c(i4, this.f13226c, f4, f5, z3);
    }

    public boolean b(float f4, float f5) {
        ViewParent i4;
        if (!m() || (i4 = i(0)) == null) {
            return false;
        }
        return C0846r0.d(i4, this.f13226c, f4, f5);
    }

    public boolean c(int i4, int i5, @androidx.annotation.P int[] iArr, @androidx.annotation.P int[] iArr2) {
        return d(i4, i5, iArr, iArr2, 0);
    }

    public boolean d(int i4, int i5, @androidx.annotation.P int[] iArr, @androidx.annotation.P int[] iArr2, int i6) {
        ViewParent i7;
        int i8;
        int i9;
        if (!m() || (i7 = i(i6)) == null) {
            return false;
        }
        if (i4 == 0 && i5 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f13226c.getLocationInWindow(iArr2);
            i8 = iArr2[0];
            i9 = iArr2[1];
        } else {
            i8 = 0;
            i9 = 0;
        }
        if (iArr == null) {
            iArr = j();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        C0846r0.f(i7, this.f13226c, i4, i5, iArr, i6);
        if (iArr2 != null) {
            this.f13226c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i8;
            iArr2[1] = iArr2[1] - i9;
        }
        if (iArr[0] == 0 && iArr[1] == 0) {
            return false;
        }
        return true;
    }

    public void e(int i4, int i5, int i6, int i7, @androidx.annotation.P int[] iArr, int i8, @androidx.annotation.P int[] iArr2) {
        h(i4, i5, i6, i7, iArr, i8, iArr2);
    }

    public boolean f(int i4, int i5, int i6, int i7, @androidx.annotation.P int[] iArr) {
        return h(i4, i5, i6, i7, iArr, 0, null);
    }

    public boolean g(int i4, int i5, int i6, int i7, @androidx.annotation.P int[] iArr, int i8) {
        return h(i4, i5, i6, i7, iArr, i8, null);
    }

    public boolean k() {
        return l(0);
    }

    public boolean l(int i4) {
        if (i(i4) != null) {
            return true;
        }
        return false;
    }

    public boolean m() {
        return this.f13227d;
    }

    public void n() {
        C0823k0.G2(this.f13226c);
    }

    public void o(@androidx.annotation.N View view) {
        C0823k0.G2(this.f13226c);
    }

    public void p(boolean z3) {
        if (this.f13227d) {
            C0823k0.G2(this.f13226c);
        }
        this.f13227d = z3;
    }

    public boolean r(int i4) {
        return s(i4, 0);
    }

    public boolean s(int i4, int i5) {
        if (l(i5)) {
            return true;
        }
        if (m()) {
            View view = this.f13226c;
            for (ViewParent parent = this.f13226c.getParent(); parent != null; parent = parent.getParent()) {
                if (C0846r0.m(parent, view, this.f13226c, i4, i5)) {
                    q(i5, parent);
                    C0846r0.k(parent, view, this.f13226c, i4, i5);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return false;
        }
        return false;
    }

    public void t() {
        u(0);
    }

    public void u(int i4) {
        ViewParent i5 = i(i4);
        if (i5 != null) {
            C0846r0.o(i5, this.f13226c, i4);
            q(i4, null);
        }
    }
}
