package androidx.customview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.collection.m;
import androidx.core.view.C0771a;
import androidx.core.view.C0823k0;
import androidx.core.view.accessibility.C0775b;
import androidx.core.view.accessibility.M;
import androidx.core.view.accessibility.S;
import androidx.core.view.accessibility.T;
import androidx.customview.widget.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a extends C0771a {

    /* renamed from: n, reason: collision with root package name */
    public static final int f13868n = Integer.MIN_VALUE;

    /* renamed from: o, reason: collision with root package name */
    public static final int f13869o = -1;

    /* renamed from: p, reason: collision with root package name */
    private static final String f13870p = "android.view.View";

    /* renamed from: q, reason: collision with root package name */
    private static final Rect f13871q = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: r, reason: collision with root package name */
    private static final b.a<M> f13872r = new C0115a();

    /* renamed from: s, reason: collision with root package name */
    private static final b.InterfaceC0116b<m<M>, M> f13873s = new b();

    /* renamed from: h, reason: collision with root package name */
    private final AccessibilityManager f13878h;

    /* renamed from: i, reason: collision with root package name */
    private final View f13879i;

    /* renamed from: j, reason: collision with root package name */
    private c f13880j;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f13874d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    private final Rect f13875e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    private final Rect f13876f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    private final int[] f13877g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    int f13881k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    int f13882l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    private int f13883m = Integer.MIN_VALUE;

    /* renamed from: androidx.customview.widget.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0115a implements b.a<M> {
        C0115a() {
        }

        @Override // androidx.customview.widget.b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(M m4, Rect rect) {
            m4.s(rect);
        }
    }

    /* loaded from: classes.dex */
    class b implements b.InterfaceC0116b<m<M>, M> {
        b() {
        }

        @Override // androidx.customview.widget.b.InterfaceC0116b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public M a(m<M> mVar, int i4) {
            return mVar.C(i4);
        }

        @Override // androidx.customview.widget.b.InterfaceC0116b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(m<M> mVar) {
            return mVar.B();
        }
    }

    /* loaded from: classes.dex */
    private class c extends S {
        c() {
        }

        @Override // androidx.core.view.accessibility.S
        public M b(int i4) {
            return M.I0(a.this.L(i4));
        }

        @Override // androidx.core.view.accessibility.S
        public M d(int i4) {
            int i5;
            if (i4 == 2) {
                i5 = a.this.f13881k;
            } else {
                i5 = a.this.f13882l;
            }
            if (i5 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i5);
        }

        @Override // androidx.core.view.accessibility.S
        public boolean f(int i4, int i5, Bundle bundle) {
            return a.this.T(i4, i5, bundle);
        }
    }

    public a(@N View view) {
        if (view != null) {
            this.f13879i = view;
            this.f13878h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (C0823k0.V(view) == 0) {
                C0823k0.R1(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private static Rect E(@N View view, int i4, @N Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 == 130) {
                        rect.set(0, -1, width, -1);
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    rect.set(-1, 0, -1, height);
                }
            } else {
                rect.set(0, height, width, height);
            }
        } else {
            rect.set(width, 0, width, height);
        }
        return rect;
    }

    private boolean I(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f13879i.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f13879i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent == null) {
            return false;
        }
        return true;
    }

    private static int J(int i4) {
        if (i4 == 19) {
            return 33;
        }
        if (i4 != 21) {
            return i4 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean K(int i4, @P Rect rect) {
        M i5;
        boolean z3;
        M m4;
        m<M> y3 = y();
        int i6 = this.f13882l;
        int i7 = Integer.MIN_VALUE;
        if (i6 == Integer.MIN_VALUE) {
            i5 = null;
        } else {
            i5 = y3.i(i6);
        }
        M m5 = i5;
        if (i4 != 1 && i4 != 2) {
            if (i4 != 17 && i4 != 33 && i4 != 66 && i4 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i8 = this.f13882l;
            if (i8 != Integer.MIN_VALUE) {
                z(i8, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                E(this.f13879i, i4, rect2);
            }
            m4 = (M) androidx.customview.widget.b.c(y3, f13873s, f13872r, m5, rect2, i4);
        } else {
            if (C0823k0.Z(this.f13879i) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            m4 = (M) androidx.customview.widget.b.d(y3, f13873s, f13872r, m5, i4, z3, false);
        }
        if (m4 != null) {
            i7 = y3.o(y3.l(m4));
        }
        return X(i7);
    }

    private boolean U(int i4, int i5, Bundle bundle) {
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 64) {
                    if (i5 != 128) {
                        return N(i4, i5, bundle);
                    }
                    return n(i4);
                }
                return W(i4);
            }
            return o(i4);
        }
        return X(i4);
    }

    private boolean V(int i4, Bundle bundle) {
        return C0823k0.l1(this.f13879i, i4, bundle);
    }

    private boolean W(int i4) {
        int i5;
        if (!this.f13878h.isEnabled() || !this.f13878h.isTouchExplorationEnabled() || (i5 = this.f13881k) == i4) {
            return false;
        }
        if (i5 != Integer.MIN_VALUE) {
            n(i5);
        }
        this.f13881k = i4;
        this.f13879i.invalidate();
        Y(i4, 32768);
        return true;
    }

    private void Z(int i4) {
        int i5 = this.f13883m;
        if (i5 == i4) {
            return;
        }
        this.f13883m = i4;
        Y(i4, 128);
        Y(i5, 256);
    }

    private boolean n(int i4) {
        if (this.f13881k == i4) {
            this.f13881k = Integer.MIN_VALUE;
            this.f13879i.invalidate();
            Y(i4, 65536);
            return true;
        }
        return false;
    }

    private boolean p() {
        int i4 = this.f13882l;
        if (i4 != Integer.MIN_VALUE && N(i4, 16, null)) {
            return true;
        }
        return false;
    }

    private AccessibilityEvent q(int i4, int i5) {
        if (i4 != -1) {
            return r(i4, i5);
        }
        return s(i5);
    }

    private AccessibilityEvent r(int i4, int i5) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i5);
        M L3 = L(i4);
        obtain.getText().add(L3.V());
        obtain.setContentDescription(L3.A());
        obtain.setScrollable(L3.z0());
        obtain.setPassword(L3.x0());
        obtain.setEnabled(L3.q0());
        obtain.setChecked(L3.k0());
        P(i4, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(L3.w());
        T.Y(obtain, this.f13879i, i4);
        obtain.setPackageName(this.f13879i.getContext().getPackageName());
        return obtain;
    }

    private AccessibilityEvent s(int i4) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i4);
        this.f13879i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    @N
    private M t(int i4) {
        boolean z3;
        M F02 = M.F0();
        F02.j1(true);
        F02.l1(true);
        F02.Z0(f13870p);
        Rect rect = f13871q;
        F02.U0(rect);
        F02.V0(rect);
        F02.C1(this.f13879i);
        R(i4, F02);
        if (F02.V() == null && F02.A() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        F02.s(this.f13875e);
        if (!this.f13875e.equals(rect)) {
            int p4 = F02.p();
            if ((p4 & 64) == 0) {
                if ((p4 & 128) == 0) {
                    F02.A1(this.f13879i.getContext().getPackageName());
                    F02.M1(this.f13879i, i4);
                    if (this.f13881k == i4) {
                        F02.R0(true);
                        F02.a(128);
                    } else {
                        F02.R0(false);
                        F02.a(64);
                    }
                    if (this.f13882l == i4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        F02.a(2);
                    } else if (F02.r0()) {
                        F02.a(1);
                    }
                    F02.m1(z3);
                    this.f13879i.getLocationOnScreen(this.f13877g);
                    F02.t(this.f13874d);
                    if (this.f13874d.equals(rect)) {
                        F02.s(this.f13874d);
                        if (F02.f13346b != -1) {
                            M F03 = M.F0();
                            for (int i5 = F02.f13346b; i5 != -1; i5 = F03.f13346b) {
                                F03.D1(this.f13879i, -1);
                                F03.U0(f13871q);
                                R(i5, F03);
                                F03.s(this.f13875e);
                                Rect rect2 = this.f13874d;
                                Rect rect3 = this.f13875e;
                                rect2.offset(rect3.left, rect3.top);
                            }
                            F03.L0();
                        }
                        this.f13874d.offset(this.f13877g[0] - this.f13879i.getScrollX(), this.f13877g[1] - this.f13879i.getScrollY());
                    }
                    if (this.f13879i.getLocalVisibleRect(this.f13876f)) {
                        this.f13876f.offset(this.f13877g[0] - this.f13879i.getScrollX(), this.f13877g[1] - this.f13879i.getScrollY());
                        if (this.f13874d.intersect(this.f13876f)) {
                            F02.V0(this.f13874d);
                            if (I(this.f13874d)) {
                                F02.a2(true);
                            }
                        }
                    }
                    return F02;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    @N
    private M u() {
        M G02 = M.G0(this.f13879i);
        C0823k0.i1(this.f13879i, G02);
        ArrayList arrayList = new ArrayList();
        D(arrayList);
        if (G02.v() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            G02.d(this.f13879i, ((Integer) arrayList.get(i4)).intValue());
        }
        return G02;
    }

    private m<M> y() {
        ArrayList arrayList = new ArrayList();
        D(arrayList);
        m<M> mVar = new m<>();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            mVar.p(arrayList.get(i4).intValue(), t(arrayList.get(i4).intValue()));
        }
        return mVar;
    }

    private void z(int i4, Rect rect) {
        L(i4).s(rect);
    }

    @Deprecated
    public int A() {
        return x();
    }

    public final int B() {
        return this.f13882l;
    }

    protected abstract int C(float f4, float f5);

    protected abstract void D(List<Integer> list);

    public final void F() {
        H(-1, 1);
    }

    public final void G(int i4) {
        H(i4, 0);
    }

    public final void H(int i4, int i5) {
        ViewParent parent;
        if (i4 != Integer.MIN_VALUE && this.f13878h.isEnabled() && (parent = this.f13879i.getParent()) != null) {
            AccessibilityEvent q4 = q(i4, 2048);
            C0775b.i(q4, i5);
            parent.requestSendAccessibilityEvent(this.f13879i, q4);
        }
    }

    @N
    M L(int i4) {
        if (i4 == -1) {
            return u();
        }
        return t(i4);
    }

    public final void M(boolean z3, int i4, @P Rect rect) {
        int i5 = this.f13882l;
        if (i5 != Integer.MIN_VALUE) {
            o(i5);
        }
        if (z3) {
            K(i4, rect);
        }
    }

    protected abstract boolean N(int i4, int i5, @P Bundle bundle);

    protected void O(@N AccessibilityEvent accessibilityEvent) {
    }

    protected void P(int i4, @N AccessibilityEvent accessibilityEvent) {
    }

    protected void Q(@N M m4) {
    }

    protected abstract void R(int i4, @N M m4);

    protected void S(int i4, boolean z3) {
    }

    boolean T(int i4, int i5, Bundle bundle) {
        if (i4 != -1) {
            return U(i4, i5, bundle);
        }
        return V(i5, bundle);
    }

    public final boolean X(int i4) {
        int i5;
        if ((!this.f13879i.isFocused() && !this.f13879i.requestFocus()) || (i5 = this.f13882l) == i4) {
            return false;
        }
        if (i5 != Integer.MIN_VALUE) {
            o(i5);
        }
        if (i4 == Integer.MIN_VALUE) {
            return false;
        }
        this.f13882l = i4;
        S(i4, true);
        Y(i4, 8);
        return true;
    }

    public final boolean Y(int i4, int i5) {
        ViewParent parent;
        if (i4 == Integer.MIN_VALUE || !this.f13878h.isEnabled() || (parent = this.f13879i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f13879i, q(i4, i5));
    }

    @Override // androidx.core.view.C0771a
    public S b(View view) {
        if (this.f13880j == null) {
            this.f13880j = new c();
        }
        return this.f13880j;
    }

    @Override // androidx.core.view.C0771a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        O(accessibilityEvent);
    }

    @Override // androidx.core.view.C0771a
    public void g(View view, M m4) {
        super.g(view, m4);
        Q(m4);
    }

    public final boolean o(int i4) {
        if (this.f13882l != i4) {
            return false;
        }
        this.f13882l = Integer.MIN_VALUE;
        S(i4, false);
        Y(i4, 8);
        return true;
    }

    public final boolean v(@N MotionEvent motionEvent) {
        if (!this.f13878h.isEnabled() || !this.f13878h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7 && action != 9) {
            if (action != 10 || this.f13883m == Integer.MIN_VALUE) {
                return false;
            }
            Z(Integer.MIN_VALUE);
            return true;
        }
        int C3 = C(motionEvent.getX(), motionEvent.getY());
        Z(C3);
        if (C3 == Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public final boolean w(@N KeyEvent keyEvent) {
        int i4 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int J3 = J(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z3 = false;
                        while (i4 < repeatCount && K(J3, null)) {
                            i4++;
                            z3 = true;
                        }
                        return z3;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            p();
            return true;
        }
        if (keyEvent.hasNoModifiers()) {
            return K(2, null);
        }
        if (!keyEvent.hasModifiers(1)) {
            return false;
        }
        return K(1, null);
    }

    public final int x() {
        return this.f13881k;
    }
}
