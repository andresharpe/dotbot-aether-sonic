package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.i;
import androidx.core.view.C0823k0;
import d.C2042a;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class A {

    /* renamed from: n, reason: collision with root package name */
    private static final int f5459n = -1;

    /* renamed from: o, reason: collision with root package name */
    private static final int f5460o = 1;

    /* renamed from: p, reason: collision with root package name */
    private static final int f5461p = 2;

    /* renamed from: q, reason: collision with root package name */
    private static final int f5462q = 3;

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.N
    private final TextView f5463a;

    /* renamed from: b, reason: collision with root package name */
    private e0 f5464b;

    /* renamed from: c, reason: collision with root package name */
    private e0 f5465c;

    /* renamed from: d, reason: collision with root package name */
    private e0 f5466d;

    /* renamed from: e, reason: collision with root package name */
    private e0 f5467e;

    /* renamed from: f, reason: collision with root package name */
    private e0 f5468f;

    /* renamed from: g, reason: collision with root package name */
    private e0 f5469g;

    /* renamed from: h, reason: collision with root package name */
    private e0 f5470h;

    /* renamed from: i, reason: collision with root package name */
    @androidx.annotation.N
    private final B f5471i;

    /* renamed from: j, reason: collision with root package name */
    private int f5472j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f5473k = -1;

    /* renamed from: l, reason: collision with root package name */
    private Typeface f5474l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f5475m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends i.g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f5476a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f5477b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f5478c;

        a(int i4, int i5, WeakReference weakReference) {
            this.f5476a = i4;
            this.f5477b = i5;
            this.f5478c = weakReference;
        }

        @Override // androidx.core.content.res.i.g
        /* renamed from: h */
        public void f(int i4) {
        }

        @Override // androidx.core.content.res.i.g
        /* renamed from: i */
        public void g(@androidx.annotation.N Typeface typeface) {
            int i4;
            boolean z3;
            if (Build.VERSION.SDK_INT >= 28 && (i4 = this.f5476a) != -1) {
                if ((this.f5477b & 2) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                typeface = g.a(typeface, i4, z3);
            }
            A.this.n(this.f5478c, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ TextView f5480E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Typeface f5481F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f5482G;

        b(TextView textView, Typeface typeface, int i4) {
            this.f5480E = textView;
            this.f5481F = typeface;
            this.f5482G = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5480E.setTypeface(this.f5481F, this.f5482G);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(17)
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        @InterfaceC0577u
        static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        @InterfaceC0577u
        static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        @InterfaceC0577u
        static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    @androidx.annotation.W(21)
    /* loaded from: classes.dex */
    static class d {
        private d() {
        }

        @InterfaceC0577u
        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(24)
    /* loaded from: classes.dex */
    public static class e {
        private e() {
        }

        @InterfaceC0577u
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        @InterfaceC0577u
        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(26)
    /* loaded from: classes.dex */
    public static class f {
        private f() {
        }

        @InterfaceC0577u
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @InterfaceC0577u
        static void b(TextView textView, int i4, int i5, int i6, int i7) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
        }

        @InterfaceC0577u
        static void c(TextView textView, int[] iArr, int i4) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
        }

        @InterfaceC0577u
        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(28)
    /* loaded from: classes.dex */
    public static class g {
        private g() {
        }

        @InterfaceC0577u
        static Typeface a(Typeface typeface, int i4, boolean z3) {
            return Typeface.create(typeface, i4, z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(@androidx.annotation.N TextView textView) {
        this.f5463a = textView;
        this.f5471i = new B(textView);
    }

    private void B(int i4, float f4) {
        this.f5471i.w(i4, f4);
    }

    private void C(Context context, g0 g0Var) {
        int i4;
        String w3;
        boolean z3;
        boolean z4;
        this.f5472j = g0Var.o(C2042a.m.R5, this.f5472j);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 28) {
            int o4 = g0Var.o(C2042a.m.a6, -1);
            this.f5473k = o4;
            if (o4 != -1) {
                this.f5472j &= 2;
            }
        }
        boolean z5 = true;
        if (!g0Var.C(C2042a.m.Z5) && !g0Var.C(C2042a.m.b6)) {
            if (g0Var.C(C2042a.m.Q5)) {
                this.f5475m = false;
                int o5 = g0Var.o(C2042a.m.Q5, 1);
                if (o5 != 1) {
                    if (o5 != 2) {
                        if (o5 == 3) {
                            this.f5474l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.f5474l = Typeface.SERIF;
                    return;
                }
                this.f5474l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.f5474l = null;
        if (g0Var.C(C2042a.m.b6)) {
            i4 = C2042a.m.b6;
        } else {
            i4 = C2042a.m.Z5;
        }
        int i6 = this.f5473k;
        int i7 = this.f5472j;
        if (!context.isRestricted()) {
            try {
                Typeface k4 = g0Var.k(i4, this.f5472j, new a(i6, i7, new WeakReference(this.f5463a)));
                if (k4 != null) {
                    if (i5 >= 28 && this.f5473k != -1) {
                        Typeface create = Typeface.create(k4, 0);
                        int i8 = this.f5473k;
                        if ((this.f5472j & 2) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        this.f5474l = g.a(create, i8, z4);
                    } else {
                        this.f5474l = k4;
                    }
                }
                if (this.f5474l == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f5475m = z3;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f5474l == null && (w3 = g0Var.w(i4)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f5473k != -1) {
                Typeface create2 = Typeface.create(w3, 0);
                int i9 = this.f5473k;
                if ((this.f5472j & 2) == 0) {
                    z5 = false;
                }
                this.f5474l = g.a(create2, i9, z5);
                return;
            }
            this.f5474l = Typeface.create(w3, this.f5472j);
        }
    }

    private void a(Drawable drawable, e0 e0Var) {
        if (drawable != null && e0Var != null) {
            C0599l.j(drawable, e0Var, this.f5463a.getDrawableState());
        }
    }

    private static e0 d(Context context, C0599l c0599l, int i4) {
        ColorStateList f4 = c0599l.f(context, i4);
        if (f4 != null) {
            e0 e0Var = new e0();
            e0Var.f6191d = true;
            e0Var.f6188a = f4;
            return e0Var;
        }
        return null;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] a4 = c.a(this.f5463a);
                Drawable drawable7 = a4[0];
                if (drawable7 == null && a4[2] == null) {
                    Drawable[] compoundDrawables = this.f5463a.getCompoundDrawables();
                    TextView textView = this.f5463a;
                    if (drawable == null) {
                        drawable = compoundDrawables[0];
                    }
                    if (drawable2 == null) {
                        drawable2 = compoundDrawables[1];
                    }
                    if (drawable3 == null) {
                        drawable3 = compoundDrawables[2];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawables[3];
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                    return;
                }
                TextView textView2 = this.f5463a;
                if (drawable2 == null) {
                    drawable2 = a4[1];
                }
                Drawable drawable8 = a4[2];
                if (drawable4 == null) {
                    drawable4 = a4[3];
                }
                c.b(textView2, drawable7, drawable2, drawable8, drawable4);
                return;
            }
            return;
        }
        Drawable[] a5 = c.a(this.f5463a);
        TextView textView3 = this.f5463a;
        if (drawable5 == null) {
            drawable5 = a5[0];
        }
        if (drawable2 == null) {
            drawable2 = a5[1];
        }
        if (drawable6 == null) {
            drawable6 = a5[2];
        }
        if (drawable4 == null) {
            drawable4 = a5[3];
        }
        c.b(textView3, drawable5, drawable2, drawable6, drawable4);
    }

    private void z() {
        e0 e0Var = this.f5470h;
        this.f5464b = e0Var;
        this.f5465c = e0Var;
        this.f5466d = e0Var;
        this.f5467e = e0Var;
        this.f5468f = e0Var;
        this.f5469g = e0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void A(int i4, float f4) {
        if (!q0.f6311c && !l()) {
            B(i4, f4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (this.f5464b != null || this.f5465c != null || this.f5466d != null || this.f5467e != null) {
            Drawable[] compoundDrawables = this.f5463a.getCompoundDrawables();
            a(compoundDrawables[0], this.f5464b);
            a(compoundDrawables[1], this.f5465c);
            a(compoundDrawables[2], this.f5466d);
            a(compoundDrawables[3], this.f5467e);
        }
        if (this.f5468f != null || this.f5469g != null) {
            Drawable[] a4 = c.a(this.f5463a);
            a(a4[0], this.f5468f);
            a(a4[2], this.f5469g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void c() {
        this.f5471i.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f5471i.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f5471i.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f5471i.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] h() {
        return this.f5471i.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return this.f5471i.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public ColorStateList j() {
        e0 e0Var = this.f5470h;
        if (e0Var != null) {
            return e0Var.f6188a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public PorterDuff.Mode k() {
        e0 e0Var = this.f5470h;
        if (e0Var != null) {
            return e0Var.f6189b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean l() {
        return this.f5471i.q();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    public void m(@androidx.annotation.P AttributeSet attributeSet, int i4) {
        boolean z3;
        boolean z4;
        String str;
        String str2;
        boolean z5;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        Context context = this.f5463a.getContext();
        C0599l b4 = C0599l.b();
        g0 G3 = g0.G(context, attributeSet, C2042a.m.f50136n0, i4, 0);
        TextView textView = this.f5463a;
        C0823k0.z1(textView, textView.getContext(), C2042a.m.f50136n0, attributeSet, G3.B(), i4, 0);
        int u3 = G3.u(C2042a.m.f50141o0, -1);
        if (G3.C(C2042a.m.f50156r0)) {
            this.f5464b = d(context, b4, G3.u(C2042a.m.f50156r0, 0));
        }
        if (G3.C(C2042a.m.f50146p0)) {
            this.f5465c = d(context, b4, G3.u(C2042a.m.f50146p0, 0));
        }
        if (G3.C(C2042a.m.f50161s0)) {
            this.f5466d = d(context, b4, G3.u(C2042a.m.f50161s0, 0));
        }
        if (G3.C(C2042a.m.f50151q0)) {
            this.f5467e = d(context, b4, G3.u(C2042a.m.f50151q0, 0));
        }
        int i5 = Build.VERSION.SDK_INT;
        if (G3.C(C2042a.m.f50166t0)) {
            this.f5468f = d(context, b4, G3.u(C2042a.m.f50166t0, 0));
        }
        if (G3.C(C2042a.m.f50170u0)) {
            this.f5469g = d(context, b4, G3.u(C2042a.m.f50170u0, 0));
        }
        G3.I();
        boolean z6 = this.f5463a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (u3 != -1) {
            g0 E3 = g0.E(context, u3, C2042a.m.O5);
            if (!z6 && E3.C(C2042a.m.d6)) {
                z3 = E3.a(C2042a.m.d6, false);
                z4 = true;
            } else {
                z3 = false;
                z4 = false;
            }
            C(context, E3);
            if (E3.C(C2042a.m.e6)) {
                str2 = E3.w(C2042a.m.e6);
            } else {
                str2 = null;
            }
            if (i5 >= 26 && E3.C(C2042a.m.c6)) {
                str = E3.w(C2042a.m.c6);
            } else {
                str = null;
            }
            E3.I();
        } else {
            z3 = false;
            z4 = false;
            str = null;
            str2 = null;
        }
        g0 G4 = g0.G(context, attributeSet, C2042a.m.O5, i4, 0);
        if (!z6 && G4.C(C2042a.m.d6)) {
            z3 = G4.a(C2042a.m.d6, false);
            z5 = true;
        } else {
            z5 = z4;
        }
        if (G4.C(C2042a.m.e6)) {
            str2 = G4.w(C2042a.m.e6);
        }
        if (i5 >= 26 && G4.C(C2042a.m.c6)) {
            str = G4.w(C2042a.m.c6);
        }
        if (i5 >= 28 && G4.C(C2042a.m.P5) && G4.g(C2042a.m.P5, -1) == 0) {
            this.f5463a.setTextSize(0, 0.0f);
        }
        C(context, G4);
        G4.I();
        if (!z6 && z5) {
            s(z3);
        }
        Typeface typeface = this.f5474l;
        if (typeface != null) {
            if (this.f5473k == -1) {
                this.f5463a.setTypeface(typeface, this.f5472j);
            } else {
                this.f5463a.setTypeface(typeface);
            }
        }
        if (str != null) {
            f.d(this.f5463a, str);
        }
        if (str2 != null) {
            e.b(this.f5463a, e.a(str2));
        }
        this.f5471i.r(attributeSet, i4);
        if (q0.f6311c && this.f5471i.l() != 0) {
            int[] k4 = this.f5471i.k();
            if (k4.length > 0) {
                if (f.a(this.f5463a) != -1.0f) {
                    f.b(this.f5463a, this.f5471i.i(), this.f5471i.h(), this.f5471i.j(), 0);
                } else {
                    f.c(this.f5463a, k4, 0);
                }
            }
        }
        g0 F3 = g0.F(context, attributeSet, C2042a.m.f50174v0);
        int u4 = F3.u(C2042a.m.f49983E0, -1);
        if (u4 != -1) {
            drawable = b4.c(context, u4);
        } else {
            drawable = null;
        }
        int u5 = F3.u(C2042a.m.f50003J0, -1);
        if (u5 != -1) {
            drawable2 = b4.c(context, u5);
        } else {
            drawable2 = null;
        }
        int u6 = F3.u(C2042a.m.f49987F0, -1);
        if (u6 != -1) {
            drawable3 = b4.c(context, u6);
        } else {
            drawable3 = null;
        }
        int u7 = F3.u(C2042a.m.f49975C0, -1);
        if (u7 != -1) {
            drawable4 = b4.c(context, u7);
        } else {
            drawable4 = null;
        }
        int u8 = F3.u(C2042a.m.f49991G0, -1);
        if (u8 != -1) {
            drawable5 = b4.c(context, u8);
        } else {
            drawable5 = null;
        }
        int u9 = F3.u(C2042a.m.f49979D0, -1);
        if (u9 != -1) {
            drawable6 = b4.c(context, u9);
        } else {
            drawable6 = null;
        }
        y(drawable, drawable2, drawable3, drawable4, drawable5, drawable6);
        if (F3.C(C2042a.m.f49995H0)) {
            androidx.core.widget.r.u(this.f5463a, F3.d(C2042a.m.f49995H0));
        }
        if (F3.C(C2042a.m.f49999I0)) {
            androidx.core.widget.r.v(this.f5463a, L.e(F3.o(C2042a.m.f49999I0, -1), null));
        }
        int g4 = F3.g(C2042a.m.f50011L0, -1);
        int g5 = F3.g(C2042a.m.f50023O0, -1);
        int g6 = F3.g(C2042a.m.f50027P0, -1);
        F3.I();
        if (g4 != -1) {
            androidx.core.widget.r.A(this.f5463a, g4);
        }
        if (g5 != -1) {
            androidx.core.widget.r.B(this.f5463a, g5);
        }
        if (g6 != -1) {
            androidx.core.widget.r.C(this.f5463a, g6);
        }
    }

    void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f5475m) {
            this.f5474l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (C0823k0.O0(textView)) {
                    textView.post(new b(textView, typeface, this.f5472j));
                } else {
                    textView.setTypeface(typeface, this.f5472j);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void o(boolean z3, int i4, int i5, int i6, int i7) {
        if (!q0.f6311c) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(Context context, int i4) {
        String w3;
        g0 E3 = g0.E(context, i4, C2042a.m.O5);
        if (E3.C(C2042a.m.d6)) {
            s(E3.a(C2042a.m.d6, false));
        }
        int i5 = Build.VERSION.SDK_INT;
        if (E3.C(C2042a.m.P5) && E3.g(C2042a.m.P5, -1) == 0) {
            this.f5463a.setTextSize(0, 0.0f);
        }
        C(context, E3);
        if (i5 >= 26 && E3.C(C2042a.m.c6) && (w3 = E3.w(C2042a.m.c6)) != null) {
            f.d(this.f5463a, w3);
        }
        E3.I();
        Typeface typeface = this.f5474l;
        if (typeface != null) {
            this.f5463a.setTypeface(typeface, this.f5472j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(@androidx.annotation.N TextView textView, @androidx.annotation.P InputConnection inputConnection, @androidx.annotation.N EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            androidx.core.view.inputmethod.c.j(editorInfo, textView.getText());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(boolean z3) {
        this.f5463a.setAllCaps(z3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        this.f5471i.s(i4, i5, i6, i7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(@androidx.annotation.N int[] iArr, int i4) throws IllegalArgumentException {
        this.f5471i.t(iArr, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(int i4) {
        this.f5471i.u(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(@androidx.annotation.P ColorStateList colorStateList) {
        boolean z3;
        if (this.f5470h == null) {
            this.f5470h = new e0();
        }
        e0 e0Var = this.f5470h;
        e0Var.f6188a = colorStateList;
        if (colorStateList != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        e0Var.f6191d = z3;
        z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(@androidx.annotation.P PorterDuff.Mode mode) {
        boolean z3;
        if (this.f5470h == null) {
            this.f5470h = new e0();
        }
        e0 e0Var = this.f5470h;
        e0Var.f6189b = mode;
        if (mode != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        e0Var.f6190c = z3;
        z();
    }
}
