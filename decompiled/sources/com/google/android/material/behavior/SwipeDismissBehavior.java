package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0823k0;
import androidx.core.view.accessibility.M;
import androidx.core.view.accessibility.U;
import androidx.customview.widget.d;

/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: k, reason: collision with root package name */
    public static final int f31446k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final int f31447l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static final int f31448m = 2;

    /* renamed from: n, reason: collision with root package name */
    public static final int f31449n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static final int f31450o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f31451p = 2;

    /* renamed from: q, reason: collision with root package name */
    private static final float f31452q = 0.5f;

    /* renamed from: r, reason: collision with root package name */
    private static final float f31453r = 0.0f;

    /* renamed from: s, reason: collision with root package name */
    private static final float f31454s = 0.5f;

    /* renamed from: a, reason: collision with root package name */
    androidx.customview.widget.d f31455a;

    /* renamed from: b, reason: collision with root package name */
    c f31456b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f31457c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f31459e;

    /* renamed from: d, reason: collision with root package name */
    private float f31458d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    int f31460f = 2;

    /* renamed from: g, reason: collision with root package name */
    float f31461g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    float f31462h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    float f31463i = 0.5f;

    /* renamed from: j, reason: collision with root package name */
    private final d.c f31464j = new a();

    /* loaded from: classes2.dex */
    class a extends d.c {

        /* renamed from: d, reason: collision with root package name */
        private static final int f31465d = -1;

        /* renamed from: a, reason: collision with root package name */
        private int f31466a;

        /* renamed from: b, reason: collision with root package name */
        private int f31467b = -1;

        a() {
        }

        private boolean n(@N View view, float f4) {
            boolean z3;
            if (f4 != 0.0f) {
                if (C0823k0.Z(view) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int i4 = SwipeDismissBehavior.this.f31460f;
                if (i4 == 2) {
                    return true;
                }
                if (i4 == 0) {
                    if (z3) {
                        if (f4 >= 0.0f) {
                            return false;
                        }
                    } else if (f4 <= 0.0f) {
                        return false;
                    }
                    return true;
                }
                if (i4 != 1) {
                    return false;
                }
                if (z3) {
                    if (f4 <= 0.0f) {
                        return false;
                    }
                } else if (f4 >= 0.0f) {
                    return false;
                }
                return true;
            }
            if (Math.abs(view.getLeft() - this.f31466a) < Math.round(view.getWidth() * SwipeDismissBehavior.this.f31461g)) {
                return false;
            }
            return true;
        }

        @Override // androidx.customview.widget.d.c
        public int a(@N View view, int i4, int i5) {
            boolean z3;
            int width;
            int width2;
            int width3;
            if (C0823k0.Z(view) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i6 = SwipeDismissBehavior.this.f31460f;
            if (i6 == 0) {
                if (z3) {
                    width = this.f31466a - view.getWidth();
                    width2 = this.f31466a;
                } else {
                    width = this.f31466a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i6 == 1) {
                if (z3) {
                    width = this.f31466a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                } else {
                    width = this.f31466a - view.getWidth();
                    width2 = this.f31466a;
                }
            } else {
                width = this.f31466a - view.getWidth();
                width2 = view.getWidth() + this.f31466a;
            }
            return SwipeDismissBehavior.I(width, i4, width2);
        }

        @Override // androidx.customview.widget.d.c
        public int b(@N View view, int i4, int i5) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.d.c
        public int d(@N View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.d.c
        public void i(@N View view, int i4) {
            this.f31467b = i4;
            this.f31466a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // androidx.customview.widget.d.c
        public void j(int i4) {
            c cVar = SwipeDismissBehavior.this.f31456b;
            if (cVar != null) {
                cVar.b(i4);
            }
        }

        @Override // androidx.customview.widget.d.c
        public void k(@N View view, int i4, int i5, int i6, int i7) {
            float width = this.f31466a + (view.getWidth() * SwipeDismissBehavior.this.f31462h);
            float width2 = this.f31466a + (view.getWidth() * SwipeDismissBehavior.this.f31463i);
            float f4 = i4;
            if (f4 <= width) {
                view.setAlpha(1.0f);
            } else if (f4 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.H(0.0f, 1.0f - SwipeDismissBehavior.K(width, width2, f4), 1.0f));
            }
        }

        @Override // androidx.customview.widget.d.c
        public void l(@N View view, float f4, float f5) {
            int i4;
            boolean z3;
            c cVar;
            this.f31467b = -1;
            int width = view.getWidth();
            if (n(view, f4)) {
                int left = view.getLeft();
                int i5 = this.f31466a;
                if (left < i5) {
                    i4 = i5 - width;
                } else {
                    i4 = i5 + width;
                }
                z3 = true;
            } else {
                i4 = this.f31466a;
                z3 = false;
            }
            if (SwipeDismissBehavior.this.f31455a.V(i4, view.getTop())) {
                C0823k0.p1(view, new d(view, z3));
            } else if (z3 && (cVar = SwipeDismissBehavior.this.f31456b) != null) {
                cVar.a(view);
            }
        }

        @Override // androidx.customview.widget.d.c
        public boolean m(View view, int i4) {
            int i5 = this.f31467b;
            if ((i5 == -1 || i5 == i4) && SwipeDismissBehavior.this.G(view)) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements U {
        b() {
        }

        @Override // androidx.core.view.accessibility.U
        public boolean a(@N View view, @P U.a aVar) {
            int width;
            boolean z3 = false;
            if (!SwipeDismissBehavior.this.G(view)) {
                return false;
            }
            if (C0823k0.Z(view) == 1) {
                z3 = true;
            }
            int i4 = SwipeDismissBehavior.this.f31460f;
            if ((i4 == 0 && z3) || (i4 == 1 && !z3)) {
                width = -view.getWidth();
            } else {
                width = view.getWidth();
            }
            C0823k0.e1(view, width);
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.f31456b;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a(View view);

        void b(int i4);
    }

    /* loaded from: classes2.dex */
    private class d implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        private final View f31470E;

        /* renamed from: F, reason: collision with root package name */
        private final boolean f31471F;

        d(View view, boolean z3) {
            this.f31470E = view;
            this.f31471F = z3;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            androidx.customview.widget.d dVar = SwipeDismissBehavior.this.f31455a;
            if (dVar != null && dVar.o(true)) {
                C0823k0.p1(this.f31470E, this);
            } else if (this.f31471F && (cVar = SwipeDismissBehavior.this.f31456b) != null) {
                cVar.a(this.f31470E);
            }
        }
    }

    static float H(float f4, float f5, float f6) {
        return Math.min(Math.max(f4, f5), f6);
    }

    static int I(int i4, int i5, int i6) {
        return Math.min(Math.max(i4, i5), i6);
    }

    private void J(ViewGroup viewGroup) {
        androidx.customview.widget.d q4;
        if (this.f31455a == null) {
            if (this.f31459e) {
                q4 = androidx.customview.widget.d.p(viewGroup, this.f31458d, this.f31464j);
            } else {
                q4 = androidx.customview.widget.d.q(viewGroup, this.f31464j);
            }
            this.f31455a = q4;
        }
    }

    static float K(float f4, float f5, float f6) {
        return (f6 - f4) / (f5 - f4);
    }

    private void T(View view) {
        C0823k0.r1(view, 1048576);
        if (G(view)) {
            C0823k0.u1(view, M.a.f13391z, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
        androidx.customview.widget.d dVar = this.f31455a;
        if (dVar != null) {
            dVar.M(motionEvent);
            return true;
        }
        return false;
    }

    public boolean G(@N View view) {
        return true;
    }

    public int L() {
        androidx.customview.widget.d dVar = this.f31455a;
        if (dVar != null) {
            return dVar.F();
        }
        return 0;
    }

    @P
    @i0
    public c M() {
        return this.f31456b;
    }

    public void N(float f4) {
        this.f31461g = H(0.0f, f4, 1.0f);
    }

    public void O(float f4) {
        this.f31463i = H(0.0f, f4, 1.0f);
    }

    public void P(@P c cVar) {
        this.f31456b = cVar;
    }

    public void Q(float f4) {
        this.f31458d = f4;
        this.f31459e = true;
    }

    public void R(float f4) {
        this.f31462h = H(0.0f, f4, 1.0f);
    }

    public void S(int i4) {
        this.f31460f = i4;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(@N CoordinatorLayout coordinatorLayout, @N V v3, @N MotionEvent motionEvent) {
        boolean z3 = this.f31457c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f31457c = false;
            }
        } else {
            z3 = coordinatorLayout.H(v3, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f31457c = z3;
        }
        if (!z3) {
            return false;
        }
        J(coordinatorLayout);
        return this.f31455a.W(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(@N CoordinatorLayout coordinatorLayout, @N V v3, int i4) {
        boolean m4 = super.m(coordinatorLayout, v3, i4);
        if (C0823k0.V(v3) == 0) {
            C0823k0.R1(v3, 1);
            T(v3);
        }
        return m4;
    }
}
