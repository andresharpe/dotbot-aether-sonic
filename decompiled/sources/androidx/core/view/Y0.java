package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public class Y0 {

    /* renamed from: b, reason: collision with root package name */
    private static final String f13231b = "WindowInsetsCompat";

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.N
    public static final Y0 f13232c;

    /* renamed from: a, reason: collision with root package name */
    private final l f13233a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    @androidx.annotation.W(21)
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static Field f13234a;

        /* renamed from: b, reason: collision with root package name */
        private static Field f13235b;

        /* renamed from: c, reason: collision with root package name */
        private static Field f13236c;

        /* renamed from: d, reason: collision with root package name */
        private static boolean f13237d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f13234a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f13235b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f13236c = declaredField3;
                declaredField3.setAccessible(true);
                f13237d = true;
            } catch (ReflectiveOperationException e4) {
                Log.w(Y0.f13231b, "Failed to get visible insets from AttachInfo " + e4.getMessage(), e4);
            }
        }

        private a() {
        }

        @androidx.annotation.P
        public static Y0 a(@androidx.annotation.N View view) {
            if (f13237d && view.isAttachedToWindow()) {
                try {
                    Object obj = f13234a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f13235b.get(obj);
                        Rect rect2 = (Rect) f13236c.get(obj);
                        if (rect != null && rect2 != null) {
                            Y0 a4 = new b().f(androidx.core.graphics.E.e(rect)).h(androidx.core.graphics.E.e(rect2)).a();
                            a4.H(a4);
                            a4.d(view.getRootView());
                            return a4;
                        }
                    }
                } catch (IllegalAccessException e4) {
                    Log.w(Y0.f13231b, "Failed to get insets from AttachInfo. " + e4.getMessage(), e4);
                }
            }
            return null;
        }
    }

    @androidx.annotation.W(30)
    /* loaded from: classes.dex */
    private static class e extends d {
        e() {
        }

        @Override // androidx.core.view.Y0.f
        void d(int i4, @androidx.annotation.N androidx.core.graphics.E e4) {
            this.f13245c.setInsets(n.a(i4), e4.h());
        }

        @Override // androidx.core.view.Y0.f
        void e(int i4, @androidx.annotation.N androidx.core.graphics.E e4) {
            this.f13245c.setInsetsIgnoringVisibility(n.a(i4), e4.h());
        }

        @Override // androidx.core.view.Y0.f
        void k(int i4, boolean z3) {
            this.f13245c.setVisible(n.a(i4), z3);
        }

        e(@androidx.annotation.N Y0 y02) {
            super(y02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        private final Y0 f13246a;

        /* renamed from: b, reason: collision with root package name */
        androidx.core.graphics.E[] f13247b;

        f() {
            this(new Y0((Y0) null));
        }

        protected final void a() {
            androidx.core.graphics.E[] eArr = this.f13247b;
            if (eArr != null) {
                androidx.core.graphics.E e4 = eArr[m.e(1)];
                androidx.core.graphics.E e5 = this.f13247b[m.e(2)];
                if (e5 == null) {
                    e5 = this.f13246a.f(2);
                }
                if (e4 == null) {
                    e4 = this.f13246a.f(1);
                }
                i(androidx.core.graphics.E.b(e4, e5));
                androidx.core.graphics.E e6 = this.f13247b[m.e(16)];
                if (e6 != null) {
                    h(e6);
                }
                androidx.core.graphics.E e7 = this.f13247b[m.e(32)];
                if (e7 != null) {
                    f(e7);
                }
                androidx.core.graphics.E e8 = this.f13247b[m.e(64)];
                if (e8 != null) {
                    j(e8);
                }
            }
        }

        @androidx.annotation.N
        Y0 b() {
            a();
            return this.f13246a;
        }

        void c(@androidx.annotation.P C0855w c0855w) {
        }

        void d(int i4, @androidx.annotation.N androidx.core.graphics.E e4) {
            if (this.f13247b == null) {
                this.f13247b = new androidx.core.graphics.E[9];
            }
            for (int i5 = 1; i5 <= 256; i5 <<= 1) {
                if ((i4 & i5) != 0) {
                    this.f13247b[m.e(i5)] = e4;
                }
            }
        }

        void e(int i4, @androidx.annotation.N androidx.core.graphics.E e4) {
            if (i4 != 8) {
            } else {
                throw new IllegalArgumentException("Ignoring visibility inset not available for IME");
            }
        }

        void f(@androidx.annotation.N androidx.core.graphics.E e4) {
        }

        void g(@androidx.annotation.N androidx.core.graphics.E e4) {
        }

        void h(@androidx.annotation.N androidx.core.graphics.E e4) {
        }

        void i(@androidx.annotation.N androidx.core.graphics.E e4) {
        }

        void j(@androidx.annotation.N androidx.core.graphics.E e4) {
        }

        void k(int i4, boolean z3) {
        }

        f(@androidx.annotation.N Y0 y02) {
            this.f13246a = y02;
        }
    }

    @androidx.annotation.W(28)
    /* loaded from: classes.dex */
    private static class i extends h {
        i(@androidx.annotation.N Y0 y02, @androidx.annotation.N WindowInsets windowInsets) {
            super(y02, windowInsets);
        }

        @Override // androidx.core.view.Y0.l
        @androidx.annotation.N
        Y0 a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f13253c.consumeDisplayCutout();
            return Y0.K(consumeDisplayCutout);
        }

        @Override // androidx.core.view.Y0.g, androidx.core.view.Y0.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (Objects.equals(this.f13253c, iVar.f13253c) && Objects.equals(this.f13257g, iVar.f13257g)) {
                return true;
            }
            return false;
        }

        @Override // androidx.core.view.Y0.l
        @androidx.annotation.P
        C0855w f() {
            DisplayCutout displayCutout;
            displayCutout = this.f13253c.getDisplayCutout();
            return C0855w.i(displayCutout);
        }

        @Override // androidx.core.view.Y0.l
        public int hashCode() {
            return this.f13253c.hashCode();
        }

        i(@androidx.annotation.N Y0 y02, @androidx.annotation.N i iVar) {
            super(y02, iVar);
        }
    }

    @androidx.annotation.W(30)
    /* loaded from: classes.dex */
    private static class k extends j {

        /* renamed from: q, reason: collision with root package name */
        @androidx.annotation.N
        static final Y0 f13262q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            f13262q = Y0.K(windowInsets);
        }

        k(@androidx.annotation.N Y0 y02, @androidx.annotation.N WindowInsets windowInsets) {
            super(y02, windowInsets);
        }

        @Override // androidx.core.view.Y0.g, androidx.core.view.Y0.l
        final void d(@androidx.annotation.N View view) {
        }

        @Override // androidx.core.view.Y0.g, androidx.core.view.Y0.l
        @androidx.annotation.N
        public androidx.core.graphics.E g(int i4) {
            Insets insets;
            insets = this.f13253c.getInsets(n.a(i4));
            return androidx.core.graphics.E.g(insets);
        }

        @Override // androidx.core.view.Y0.g, androidx.core.view.Y0.l
        @androidx.annotation.N
        public androidx.core.graphics.E h(int i4) {
            Insets insetsIgnoringVisibility;
            insetsIgnoringVisibility = this.f13253c.getInsetsIgnoringVisibility(n.a(i4));
            return androidx.core.graphics.E.g(insetsIgnoringVisibility);
        }

        @Override // androidx.core.view.Y0.g, androidx.core.view.Y0.l
        public boolean q(int i4) {
            boolean isVisible;
            isVisible = this.f13253c.isVisible(n.a(i4));
            return isVisible;
        }

        k(@androidx.annotation.N Y0 y02, @androidx.annotation.N k kVar) {
            super(y02, kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.N
        static final Y0 f13263b = new b().a().a().b().c();

        /* renamed from: a, reason: collision with root package name */
        final Y0 f13264a;

        l(@androidx.annotation.N Y0 y02) {
            this.f13264a = y02;
        }

        @androidx.annotation.N
        Y0 a() {
            return this.f13264a;
        }

        @androidx.annotation.N
        Y0 b() {
            return this.f13264a;
        }

        @androidx.annotation.N
        Y0 c() {
            return this.f13264a;
        }

        void d(@androidx.annotation.N View view) {
        }

        void e(@androidx.annotation.N Y0 y02) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            if (p() == lVar.p() && o() == lVar.o() && androidx.core.util.p.a(l(), lVar.l()) && androidx.core.util.p.a(j(), lVar.j()) && androidx.core.util.p.a(f(), lVar.f())) {
                return true;
            }
            return false;
        }

        @androidx.annotation.P
        C0855w f() {
            return null;
        }

        @androidx.annotation.N
        androidx.core.graphics.E g(int i4) {
            return androidx.core.graphics.E.f12398e;
        }

        @androidx.annotation.N
        androidx.core.graphics.E h(int i4) {
            if ((i4 & 8) == 0) {
                return androidx.core.graphics.E.f12398e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return androidx.core.util.p.b(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        @androidx.annotation.N
        androidx.core.graphics.E i() {
            return l();
        }

        @androidx.annotation.N
        androidx.core.graphics.E j() {
            return androidx.core.graphics.E.f12398e;
        }

        @androidx.annotation.N
        androidx.core.graphics.E k() {
            return l();
        }

        @androidx.annotation.N
        androidx.core.graphics.E l() {
            return androidx.core.graphics.E.f12398e;
        }

        @androidx.annotation.N
        androidx.core.graphics.E m() {
            return l();
        }

        @androidx.annotation.N
        Y0 n(int i4, int i5, int i6, int i7) {
            return f13263b;
        }

        boolean o() {
            return false;
        }

        boolean p() {
            return false;
        }

        boolean q(int i4) {
            return true;
        }

        public void r(androidx.core.graphics.E[] eArr) {
        }

        void s(@androidx.annotation.N androidx.core.graphics.E e4) {
        }

        void t(@androidx.annotation.P Y0 y02) {
        }

        public void u(androidx.core.graphics.E e4) {
        }
    }

    /* loaded from: classes.dex */
    public static final class m {

        /* renamed from: a, reason: collision with root package name */
        static final int f13265a = 1;

        /* renamed from: b, reason: collision with root package name */
        static final int f13266b = 1;

        /* renamed from: c, reason: collision with root package name */
        static final int f13267c = 2;

        /* renamed from: d, reason: collision with root package name */
        static final int f13268d = 4;

        /* renamed from: e, reason: collision with root package name */
        static final int f13269e = 8;

        /* renamed from: f, reason: collision with root package name */
        static final int f13270f = 16;

        /* renamed from: g, reason: collision with root package name */
        static final int f13271g = 32;

        /* renamed from: h, reason: collision with root package name */
        static final int f13272h = 64;

        /* renamed from: i, reason: collision with root package name */
        static final int f13273i = 128;

        /* renamed from: j, reason: collision with root package name */
        static final int f13274j = 256;

        /* renamed from: k, reason: collision with root package name */
        static final int f13275k = 9;

        /* renamed from: l, reason: collision with root package name */
        static final int f13276l = 256;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* loaded from: classes.dex */
        public @interface a {
        }

        private m() {
        }

        @SuppressLint({"WrongConstant"})
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        static int a() {
            return -1;
        }

        public static int b() {
            return 4;
        }

        public static int c() {
            return 128;
        }

        public static int d() {
            return 8;
        }

        static int e(int i4) {
            if (i4 != 1) {
                if (i4 == 2) {
                    return 1;
                }
                if (i4 == 4) {
                    return 2;
                }
                if (i4 != 8) {
                    if (i4 == 16) {
                        return 4;
                    }
                    if (i4 != 32) {
                        if (i4 != 64) {
                            if (i4 != 128) {
                                if (i4 == 256) {
                                    return 8;
                                }
                                throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i4);
                            }
                            return 7;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 3;
            }
            return 0;
        }

        public static int f() {
            return 32;
        }

        public static int g() {
            return 2;
        }

        public static int h() {
            return 1;
        }

        public static int i() {
            return 7;
        }

        public static int j() {
            return 16;
        }

        public static int k() {
            return 64;
        }
    }

    @androidx.annotation.W(30)
    /* loaded from: classes.dex */
    private static final class n {
        private n() {
        }

        static int a(int i4) {
            int statusBars;
            int i5 = 0;
            for (int i6 = 1; i6 <= 256; i6 <<= 1) {
                if ((i4 & i6) != 0) {
                    if (i6 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i6 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i6 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i6 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i6 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i6 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i6 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i6 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i5 |= statusBars;
                }
            }
            return i5;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f13232c = k.f13262q;
        } else {
            f13232c = l.f13263b;
        }
    }

    @androidx.annotation.W(20)
    private Y0(@androidx.annotation.N WindowInsets windowInsets) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            this.f13233a = new k(this, windowInsets);
            return;
        }
        if (i4 >= 29) {
            this.f13233a = new j(this, windowInsets);
        } else if (i4 >= 28) {
            this.f13233a = new i(this, windowInsets);
        } else {
            this.f13233a = new h(this, windowInsets);
        }
    }

    @androidx.annotation.N
    @androidx.annotation.W(20)
    public static Y0 K(@androidx.annotation.N WindowInsets windowInsets) {
        return L(windowInsets, null);
    }

    @androidx.annotation.N
    @androidx.annotation.W(20)
    public static Y0 L(@androidx.annotation.N WindowInsets windowInsets, @androidx.annotation.P View view) {
        Y0 y02 = new Y0((WindowInsets) androidx.core.util.u.l(windowInsets));
        if (view != null && C0823k0.O0(view)) {
            y02.H(C0823k0.o0(view));
            y02.d(view.getRootView());
        }
        return y02;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static androidx.core.graphics.E z(@androidx.annotation.N androidx.core.graphics.E e4, int i4, int i5, int i6, int i7) {
        int max = Math.max(0, e4.f12399a - i4);
        int max2 = Math.max(0, e4.f12400b - i5);
        int max3 = Math.max(0, e4.f12401c - i6);
        int max4 = Math.max(0, e4.f12402d - i7);
        if (max == i4 && max2 == i5 && max3 == i6 && max4 == i7) {
            return e4;
        }
        return androidx.core.graphics.E.d(max, max2, max3, max4);
    }

    public boolean A() {
        return this.f13233a.o();
    }

    public boolean B() {
        return this.f13233a.p();
    }

    public boolean C(int i4) {
        return this.f13233a.q(i4);
    }

    @androidx.annotation.N
    @Deprecated
    public Y0 D(int i4, int i5, int i6, int i7) {
        return new b(this).h(androidx.core.graphics.E.d(i4, i5, i6, i7)).a();
    }

    @androidx.annotation.N
    @Deprecated
    public Y0 E(@androidx.annotation.N Rect rect) {
        return new b(this).h(androidx.core.graphics.E.e(rect)).a();
    }

    void F(androidx.core.graphics.E[] eArr) {
        this.f13233a.r(eArr);
    }

    void G(@androidx.annotation.N androidx.core.graphics.E e4) {
        this.f13233a.s(e4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H(@androidx.annotation.P Y0 y02) {
        this.f13233a.t(y02);
    }

    void I(@androidx.annotation.P androidx.core.graphics.E e4) {
        this.f13233a.u(e4);
    }

    @androidx.annotation.P
    @androidx.annotation.W(20)
    public WindowInsets J() {
        l lVar = this.f13233a;
        if (lVar instanceof g) {
            return ((g) lVar).f13253c;
        }
        return null;
    }

    @androidx.annotation.N
    @Deprecated
    public Y0 a() {
        return this.f13233a.a();
    }

    @androidx.annotation.N
    @Deprecated
    public Y0 b() {
        return this.f13233a.b();
    }

    @androidx.annotation.N
    @Deprecated
    public Y0 c() {
        return this.f13233a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(@androidx.annotation.N View view) {
        this.f13233a.d(view);
    }

    @androidx.annotation.P
    public C0855w e() {
        return this.f13233a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y0)) {
            return false;
        }
        return androidx.core.util.p.a(this.f13233a, ((Y0) obj).f13233a);
    }

    @androidx.annotation.N
    public androidx.core.graphics.E f(int i4) {
        return this.f13233a.g(i4);
    }

    @androidx.annotation.N
    public androidx.core.graphics.E g(int i4) {
        return this.f13233a.h(i4);
    }

    @androidx.annotation.N
    @Deprecated
    public androidx.core.graphics.E h() {
        return this.f13233a.i();
    }

    public int hashCode() {
        l lVar = this.f13233a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f13233a.j().f12402d;
    }

    @Deprecated
    public int j() {
        return this.f13233a.j().f12399a;
    }

    @Deprecated
    public int k() {
        return this.f13233a.j().f12401c;
    }

    @Deprecated
    public int l() {
        return this.f13233a.j().f12400b;
    }

    @androidx.annotation.N
    @Deprecated
    public androidx.core.graphics.E m() {
        return this.f13233a.j();
    }

    @androidx.annotation.N
    @Deprecated
    public androidx.core.graphics.E n() {
        return this.f13233a.k();
    }

    @Deprecated
    public int o() {
        return this.f13233a.l().f12402d;
    }

    @Deprecated
    public int p() {
        return this.f13233a.l().f12399a;
    }

    @Deprecated
    public int q() {
        return this.f13233a.l().f12401c;
    }

    @Deprecated
    public int r() {
        return this.f13233a.l().f12400b;
    }

    @androidx.annotation.N
    @Deprecated
    public androidx.core.graphics.E s() {
        return this.f13233a.l();
    }

    @androidx.annotation.N
    @Deprecated
    public androidx.core.graphics.E t() {
        return this.f13233a.m();
    }

    public boolean u() {
        androidx.core.graphics.E f4 = f(m.a());
        androidx.core.graphics.E e4 = androidx.core.graphics.E.f12398e;
        if (f4.equals(e4) && g(m.a() ^ m.d()).equals(e4) && e() == null) {
            return false;
        }
        return true;
    }

    @Deprecated
    public boolean v() {
        return !this.f13233a.j().equals(androidx.core.graphics.E.f12398e);
    }

    @Deprecated
    public boolean w() {
        return !this.f13233a.l().equals(androidx.core.graphics.E.f12398e);
    }

    @androidx.annotation.N
    public Y0 x(@androidx.annotation.F(from = 0) int i4, @androidx.annotation.F(from = 0) int i5, @androidx.annotation.F(from = 0) int i6, @androidx.annotation.F(from = 0) int i7) {
        return this.f13233a.n(i4, i5, i6, i7);
    }

    @androidx.annotation.N
    public Y0 y(@androidx.annotation.N androidx.core.graphics.E e4) {
        return x(e4.f12399a, e4.f12400b, e4.f12401c, e4.f12402d);
    }

    @androidx.annotation.W(api = 20)
    /* loaded from: classes.dex */
    private static class c extends f {

        /* renamed from: e, reason: collision with root package name */
        private static Field f13239e = null;

        /* renamed from: f, reason: collision with root package name */
        private static boolean f13240f = false;

        /* renamed from: g, reason: collision with root package name */
        private static Constructor<WindowInsets> f13241g = null;

        /* renamed from: h, reason: collision with root package name */
        private static boolean f13242h = false;

        /* renamed from: c, reason: collision with root package name */
        private WindowInsets f13243c;

        /* renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.E f13244d;

        c() {
            this.f13243c = l();
        }

        @androidx.annotation.P
        private static WindowInsets l() {
            if (!f13240f) {
                try {
                    f13239e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e4) {
                    Log.i(Y0.f13231b, "Could not retrieve WindowInsets.CONSUMED field", e4);
                }
                f13240f = true;
            }
            Field field = f13239e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e5) {
                    Log.i(Y0.f13231b, "Could not get value from WindowInsets.CONSUMED field", e5);
                }
            }
            if (!f13242h) {
                try {
                    f13241g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e6) {
                    Log.i(Y0.f13231b, "Could not retrieve WindowInsets(Rect) constructor", e6);
                }
                f13242h = true;
            }
            Constructor<WindowInsets> constructor = f13241g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e7) {
                    Log.i(Y0.f13231b, "Could not invoke WindowInsets(Rect) constructor", e7);
                }
            }
            return null;
        }

        @Override // androidx.core.view.Y0.f
        @androidx.annotation.N
        Y0 b() {
            a();
            Y0 K3 = Y0.K(this.f13243c);
            K3.F(this.f13247b);
            K3.I(this.f13244d);
            return K3;
        }

        @Override // androidx.core.view.Y0.f
        void g(@androidx.annotation.P androidx.core.graphics.E e4) {
            this.f13244d = e4;
        }

        @Override // androidx.core.view.Y0.f
        void i(@androidx.annotation.N androidx.core.graphics.E e4) {
            WindowInsets windowInsets = this.f13243c;
            if (windowInsets != null) {
                this.f13243c = windowInsets.replaceSystemWindowInsets(e4.f12399a, e4.f12400b, e4.f12401c, e4.f12402d);
            }
        }

        c(@androidx.annotation.N Y0 y02) {
            super(y02);
            this.f13243c = y02.J();
        }
    }

    @androidx.annotation.W(api = ConstraintLayout.b.a.f9571D)
    /* loaded from: classes.dex */
    private static class d extends f {

        /* renamed from: c, reason: collision with root package name */
        final WindowInsets.Builder f13245c;

        d() {
            this.f13245c = C0812g1.a();
        }

        @Override // androidx.core.view.Y0.f
        @androidx.annotation.N
        Y0 b() {
            WindowInsets build;
            a();
            build = this.f13245c.build();
            Y0 K3 = Y0.K(build);
            K3.F(this.f13247b);
            return K3;
        }

        @Override // androidx.core.view.Y0.f
        void c(@androidx.annotation.P C0855w c0855w) {
            DisplayCutout displayCutout;
            WindowInsets.Builder builder = this.f13245c;
            if (c0855w != null) {
                displayCutout = c0855w.h();
            } else {
                displayCutout = null;
            }
            builder.setDisplayCutout(displayCutout);
        }

        @Override // androidx.core.view.Y0.f
        void f(@androidx.annotation.N androidx.core.graphics.E e4) {
            this.f13245c.setMandatorySystemGestureInsets(e4.h());
        }

        @Override // androidx.core.view.Y0.f
        void g(@androidx.annotation.N androidx.core.graphics.E e4) {
            this.f13245c.setStableInsets(e4.h());
        }

        @Override // androidx.core.view.Y0.f
        void h(@androidx.annotation.N androidx.core.graphics.E e4) {
            this.f13245c.setSystemGestureInsets(e4.h());
        }

        @Override // androidx.core.view.Y0.f
        void i(@androidx.annotation.N androidx.core.graphics.E e4) {
            this.f13245c.setSystemWindowInsets(e4.h());
        }

        @Override // androidx.core.view.Y0.f
        void j(@androidx.annotation.N androidx.core.graphics.E e4) {
            this.f13245c.setTappableElementInsets(e4.h());
        }

        d(@androidx.annotation.N Y0 y02) {
            super(y02);
            WindowInsets.Builder a4;
            WindowInsets J3 = y02.J();
            if (J3 != null) {
                a4 = C0815h1.a(J3);
            } else {
                a4 = C0812g1.a();
            }
            this.f13245c = a4;
        }
    }

    @androidx.annotation.W(21)
    /* loaded from: classes.dex */
    private static class h extends g {

        /* renamed from: m, reason: collision with root package name */
        private androidx.core.graphics.E f13258m;

        h(@androidx.annotation.N Y0 y02, @androidx.annotation.N WindowInsets windowInsets) {
            super(y02, windowInsets);
            this.f13258m = null;
        }

        @Override // androidx.core.view.Y0.l
        @androidx.annotation.N
        Y0 b() {
            return Y0.K(this.f13253c.consumeStableInsets());
        }

        @Override // androidx.core.view.Y0.l
        @androidx.annotation.N
        Y0 c() {
            return Y0.K(this.f13253c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.Y0.l
        @androidx.annotation.N
        final androidx.core.graphics.E j() {
            if (this.f13258m == null) {
                this.f13258m = androidx.core.graphics.E.d(this.f13253c.getStableInsetLeft(), this.f13253c.getStableInsetTop(), this.f13253c.getStableInsetRight(), this.f13253c.getStableInsetBottom());
            }
            return this.f13258m;
        }

        @Override // androidx.core.view.Y0.l
        boolean o() {
            return this.f13253c.isConsumed();
        }

        @Override // androidx.core.view.Y0.l
        public void u(@androidx.annotation.P androidx.core.graphics.E e4) {
            this.f13258m = e4;
        }

        h(@androidx.annotation.N Y0 y02, @androidx.annotation.N h hVar) {
            super(y02, hVar);
            this.f13258m = null;
            this.f13258m = hVar.f13258m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.W(20)
    /* loaded from: classes.dex */
    public static class g extends l {

        /* renamed from: h, reason: collision with root package name */
        private static boolean f13248h = false;

        /* renamed from: i, reason: collision with root package name */
        private static Method f13249i;

        /* renamed from: j, reason: collision with root package name */
        private static Class<?> f13250j;

        /* renamed from: k, reason: collision with root package name */
        private static Field f13251k;

        /* renamed from: l, reason: collision with root package name */
        private static Field f13252l;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.N
        final WindowInsets f13253c;

        /* renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.E[] f13254d;

        /* renamed from: e, reason: collision with root package name */
        private androidx.core.graphics.E f13255e;

        /* renamed from: f, reason: collision with root package name */
        private Y0 f13256f;

        /* renamed from: g, reason: collision with root package name */
        androidx.core.graphics.E f13257g;

        g(@androidx.annotation.N Y0 y02, @androidx.annotation.N WindowInsets windowInsets) {
            super(y02);
            this.f13255e = null;
            this.f13253c = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        private static void A() {
            try {
                f13249i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f13250j = cls;
                f13251k = cls.getDeclaredField("mVisibleInsets");
                f13252l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f13251k.setAccessible(true);
                f13252l.setAccessible(true);
            } catch (ReflectiveOperationException e4) {
                Log.e(Y0.f13231b, "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
            }
            f13248h = true;
        }

        @androidx.annotation.N
        @SuppressLint({"WrongConstant"})
        private androidx.core.graphics.E v(int i4, boolean z3) {
            androidx.core.graphics.E e4 = androidx.core.graphics.E.f12398e;
            for (int i5 = 1; i5 <= 256; i5 <<= 1) {
                if ((i4 & i5) != 0) {
                    e4 = androidx.core.graphics.E.b(e4, w(i5, z3));
                }
            }
            return e4;
        }

        private androidx.core.graphics.E x() {
            Y0 y02 = this.f13256f;
            if (y02 != null) {
                return y02.m();
            }
            return androidx.core.graphics.E.f12398e;
        }

        @androidx.annotation.P
        private androidx.core.graphics.E y(@androidx.annotation.N View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f13248h) {
                    A();
                }
                Method method = f13249i;
                if (method != null && f13250j != null && f13251k != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w(Y0.f13231b, "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f13251k.get(f13252l.get(invoke));
                        if (rect == null) {
                            return null;
                        }
                        return androidx.core.graphics.E.e(rect);
                    } catch (ReflectiveOperationException e4) {
                        Log.e(Y0.f13231b, "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @Override // androidx.core.view.Y0.l
        void d(@androidx.annotation.N View view) {
            androidx.core.graphics.E y3 = y(view);
            if (y3 == null) {
                y3 = androidx.core.graphics.E.f12398e;
            }
            s(y3);
        }

        @Override // androidx.core.view.Y0.l
        void e(@androidx.annotation.N Y0 y02) {
            y02.H(this.f13256f);
            y02.G(this.f13257g);
        }

        @Override // androidx.core.view.Y0.l
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f13257g, ((g) obj).f13257g);
        }

        @Override // androidx.core.view.Y0.l
        @androidx.annotation.N
        public androidx.core.graphics.E g(int i4) {
            return v(i4, false);
        }

        @Override // androidx.core.view.Y0.l
        @androidx.annotation.N
        public androidx.core.graphics.E h(int i4) {
            return v(i4, true);
        }

        @Override // androidx.core.view.Y0.l
        @androidx.annotation.N
        final androidx.core.graphics.E l() {
            if (this.f13255e == null) {
                this.f13255e = androidx.core.graphics.E.d(this.f13253c.getSystemWindowInsetLeft(), this.f13253c.getSystemWindowInsetTop(), this.f13253c.getSystemWindowInsetRight(), this.f13253c.getSystemWindowInsetBottom());
            }
            return this.f13255e;
        }

        @Override // androidx.core.view.Y0.l
        @androidx.annotation.N
        Y0 n(int i4, int i5, int i6, int i7) {
            b bVar = new b(Y0.K(this.f13253c));
            bVar.h(Y0.z(l(), i4, i5, i6, i7));
            bVar.f(Y0.z(j(), i4, i5, i6, i7));
            return bVar.a();
        }

        @Override // androidx.core.view.Y0.l
        boolean p() {
            return this.f13253c.isRound();
        }

        @Override // androidx.core.view.Y0.l
        @SuppressLint({"WrongConstant"})
        boolean q(int i4) {
            for (int i5 = 1; i5 <= 256; i5 <<= 1) {
                if ((i4 & i5) != 0 && !z(i5)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.Y0.l
        public void r(androidx.core.graphics.E[] eArr) {
            this.f13254d = eArr;
        }

        @Override // androidx.core.view.Y0.l
        void s(@androidx.annotation.N androidx.core.graphics.E e4) {
            this.f13257g = e4;
        }

        @Override // androidx.core.view.Y0.l
        void t(@androidx.annotation.P Y0 y02) {
            this.f13256f = y02;
        }

        @androidx.annotation.N
        protected androidx.core.graphics.E w(int i4, boolean z3) {
            int i5;
            C0855w f4;
            if (i4 != 1) {
                androidx.core.graphics.E e4 = null;
                if (i4 != 2) {
                    if (i4 != 8) {
                        if (i4 != 16) {
                            if (i4 != 32) {
                                if (i4 != 64) {
                                    if (i4 != 128) {
                                        return androidx.core.graphics.E.f12398e;
                                    }
                                    Y0 y02 = this.f13256f;
                                    if (y02 != null) {
                                        f4 = y02.e();
                                    } else {
                                        f4 = f();
                                    }
                                    if (f4 != null) {
                                        return androidx.core.graphics.E.d(f4.d(), f4.f(), f4.e(), f4.c());
                                    }
                                    return androidx.core.graphics.E.f12398e;
                                }
                                return m();
                            }
                            return i();
                        }
                        return k();
                    }
                    androidx.core.graphics.E[] eArr = this.f13254d;
                    if (eArr != null) {
                        e4 = eArr[m.e(8)];
                    }
                    if (e4 != null) {
                        return e4;
                    }
                    androidx.core.graphics.E l4 = l();
                    androidx.core.graphics.E x3 = x();
                    int i6 = l4.f12402d;
                    if (i6 > x3.f12402d) {
                        return androidx.core.graphics.E.d(0, 0, 0, i6);
                    }
                    androidx.core.graphics.E e5 = this.f13257g;
                    if (e5 != null && !e5.equals(androidx.core.graphics.E.f12398e) && (i5 = this.f13257g.f12402d) > x3.f12402d) {
                        return androidx.core.graphics.E.d(0, 0, 0, i5);
                    }
                    return androidx.core.graphics.E.f12398e;
                }
                if (z3) {
                    androidx.core.graphics.E x4 = x();
                    androidx.core.graphics.E j4 = j();
                    return androidx.core.graphics.E.d(Math.max(x4.f12399a, j4.f12399a), 0, Math.max(x4.f12401c, j4.f12401c), Math.max(x4.f12402d, j4.f12402d));
                }
                androidx.core.graphics.E l5 = l();
                Y0 y03 = this.f13256f;
                if (y03 != null) {
                    e4 = y03.m();
                }
                int i7 = l5.f12402d;
                if (e4 != null) {
                    i7 = Math.min(i7, e4.f12402d);
                }
                return androidx.core.graphics.E.d(l5.f12399a, 0, l5.f12401c, i7);
            }
            if (z3) {
                return androidx.core.graphics.E.d(0, Math.max(x().f12400b, l().f12400b), 0, 0);
            }
            return androidx.core.graphics.E.d(0, l().f12400b, 0, 0);
        }

        protected boolean z(int i4) {
            if (i4 != 1 && i4 != 2) {
                if (i4 == 4) {
                    return false;
                }
                if (i4 != 8 && i4 != 128) {
                    return true;
                }
            }
            return !w(i4, false).equals(androidx.core.graphics.E.f12398e);
        }

        g(@androidx.annotation.N Y0 y02, @androidx.annotation.N g gVar) {
            this(y02, new WindowInsets(gVar.f13253c));
        }
    }

    @androidx.annotation.W(ConstraintLayout.b.a.f9571D)
    /* loaded from: classes.dex */
    private static class j extends i {

        /* renamed from: n, reason: collision with root package name */
        private androidx.core.graphics.E f13259n;

        /* renamed from: o, reason: collision with root package name */
        private androidx.core.graphics.E f13260o;

        /* renamed from: p, reason: collision with root package name */
        private androidx.core.graphics.E f13261p;

        j(@androidx.annotation.N Y0 y02, @androidx.annotation.N WindowInsets windowInsets) {
            super(y02, windowInsets);
            this.f13259n = null;
            this.f13260o = null;
            this.f13261p = null;
        }

        @Override // androidx.core.view.Y0.l
        @androidx.annotation.N
        androidx.core.graphics.E i() {
            Insets mandatorySystemGestureInsets;
            if (this.f13260o == null) {
                mandatorySystemGestureInsets = this.f13253c.getMandatorySystemGestureInsets();
                this.f13260o = androidx.core.graphics.E.g(mandatorySystemGestureInsets);
            }
            return this.f13260o;
        }

        @Override // androidx.core.view.Y0.l
        @androidx.annotation.N
        androidx.core.graphics.E k() {
            Insets systemGestureInsets;
            if (this.f13259n == null) {
                systemGestureInsets = this.f13253c.getSystemGestureInsets();
                this.f13259n = androidx.core.graphics.E.g(systemGestureInsets);
            }
            return this.f13259n;
        }

        @Override // androidx.core.view.Y0.l
        @androidx.annotation.N
        androidx.core.graphics.E m() {
            Insets tappableElementInsets;
            if (this.f13261p == null) {
                tappableElementInsets = this.f13253c.getTappableElementInsets();
                this.f13261p = androidx.core.graphics.E.g(tappableElementInsets);
            }
            return this.f13261p;
        }

        @Override // androidx.core.view.Y0.g, androidx.core.view.Y0.l
        @androidx.annotation.N
        Y0 n(int i4, int i5, int i6, int i7) {
            WindowInsets inset;
            inset = this.f13253c.inset(i4, i5, i6, i7);
            return Y0.K(inset);
        }

        @Override // androidx.core.view.Y0.h, androidx.core.view.Y0.l
        public void u(@androidx.annotation.P androidx.core.graphics.E e4) {
        }

        j(@androidx.annotation.N Y0 y02, @androidx.annotation.N j jVar) {
            super(y02, jVar);
            this.f13259n = null;
            this.f13260o = null;
            this.f13261p = null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final f f13238a;

        public b() {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                this.f13238a = new e();
            } else if (i4 >= 29) {
                this.f13238a = new d();
            } else {
                this.f13238a = new c();
            }
        }

        @androidx.annotation.N
        public Y0 a() {
            return this.f13238a.b();
        }

        @androidx.annotation.N
        public b b(@androidx.annotation.P C0855w c0855w) {
            this.f13238a.c(c0855w);
            return this;
        }

        @androidx.annotation.N
        public b c(int i4, @androidx.annotation.N androidx.core.graphics.E e4) {
            this.f13238a.d(i4, e4);
            return this;
        }

        @androidx.annotation.N
        public b d(int i4, @androidx.annotation.N androidx.core.graphics.E e4) {
            this.f13238a.e(i4, e4);
            return this;
        }

        @androidx.annotation.N
        @Deprecated
        public b e(@androidx.annotation.N androidx.core.graphics.E e4) {
            this.f13238a.f(e4);
            return this;
        }

        @androidx.annotation.N
        @Deprecated
        public b f(@androidx.annotation.N androidx.core.graphics.E e4) {
            this.f13238a.g(e4);
            return this;
        }

        @androidx.annotation.N
        @Deprecated
        public b g(@androidx.annotation.N androidx.core.graphics.E e4) {
            this.f13238a.h(e4);
            return this;
        }

        @androidx.annotation.N
        @Deprecated
        public b h(@androidx.annotation.N androidx.core.graphics.E e4) {
            this.f13238a.i(e4);
            return this;
        }

        @androidx.annotation.N
        @Deprecated
        public b i(@androidx.annotation.N androidx.core.graphics.E e4) {
            this.f13238a.j(e4);
            return this;
        }

        @androidx.annotation.N
        public b j(int i4, boolean z3) {
            this.f13238a.k(i4, z3);
            return this;
        }

        public b(@androidx.annotation.N Y0 y02) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                this.f13238a = new e(y02);
            } else if (i4 >= 29) {
                this.f13238a = new d(y02);
            } else {
                this.f13238a = new c(y02);
            }
        }
    }

    public Y0(@androidx.annotation.P Y0 y02) {
        if (y02 != null) {
            l lVar = y02.f13233a;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30 && (lVar instanceof k)) {
                this.f13233a = new k(this, (k) lVar);
            } else if (i4 >= 29 && (lVar instanceof j)) {
                this.f13233a = new j(this, (j) lVar);
            } else if (i4 >= 28 && (lVar instanceof i)) {
                this.f13233a = new i(this, (i) lVar);
            } else if (lVar instanceof h) {
                this.f13233a = new h(this, (h) lVar);
            } else if (lVar instanceof g) {
                this.f13233a = new g(this, (g) lVar);
            } else {
                this.f13233a = new l(this);
            }
            lVar.e(this);
            return;
        }
        this.f13233a = new l(this);
    }
}
