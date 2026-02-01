package androidx.fragment.app;

import A.a;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.os.C0745h;
import androidx.core.view.C0823k0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.M;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class B {

    /* renamed from: f, reason: collision with root package name */
    private static final String f14858f = "FragmentManager";

    /* renamed from: g, reason: collision with root package name */
    private static final String f14859g = "android:target_req_state";

    /* renamed from: h, reason: collision with root package name */
    private static final String f14860h = "android:target_state";

    /* renamed from: i, reason: collision with root package name */
    private static final String f14861i = "android:view_state";

    /* renamed from: j, reason: collision with root package name */
    private static final String f14862j = "android:view_registry_state";

    /* renamed from: k, reason: collision with root package name */
    private static final String f14863k = "android:user_visible_hint";

    /* renamed from: a, reason: collision with root package name */
    private final C0898p f14864a;

    /* renamed from: b, reason: collision with root package name */
    private final D f14865b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.N
    private final Fragment f14866c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14867d = false;

    /* renamed from: e, reason: collision with root package name */
    private int f14868e = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ View f14869E;

        a(View view) {
            this.f14869E = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f14869E.removeOnAttachStateChangeListener(this);
            C0823k0.v1(this.f14869E);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f14871a;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            f14871a = iArr;
            try {
                iArr[Lifecycle.State.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14871a[Lifecycle.State.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14871a[Lifecycle.State.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14871a[Lifecycle.State.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(@androidx.annotation.N C0898p c0898p, @androidx.annotation.N D d4, @androidx.annotation.N Fragment fragment) {
        this.f14864a = c0898p;
        this.f14865b = d4;
        this.f14866c = fragment;
    }

    private boolean l(@androidx.annotation.N View view) {
        if (view == this.f14866c.f15026m0) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f14866c.f15026m0) {
                return true;
            }
        }
        return false;
    }

    private Bundle q() {
        Bundle bundle = new Bundle();
        this.f14866c.V(bundle);
        this.f14864a.j(this.f14866c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f14866c.f15026m0 != null) {
            t();
        }
        if (this.f14866c.f14994G != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray(f14861i, this.f14866c.f14994G);
        }
        if (this.f14866c.f14995H != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle(f14862j, this.f14866c.f14995H);
        }
        if (!this.f14866c.f15028o0) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean(f14863k, this.f14866c.f15028o0);
        }
        return bundle;
    }

    void a() {
        if (FragmentManager.S0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f14866c);
        }
        Fragment fragment = this.f14866c;
        fragment.B(fragment.f14993F);
        C0898p c0898p = this.f14864a;
        Fragment fragment2 = this.f14866c;
        c0898p.a(fragment2, fragment2.f14993F, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        int j4 = this.f14865b.j(this.f14866c);
        Fragment fragment = this.f14866c;
        fragment.f15025l0.addView(fragment.f15026m0, j4);
    }

    void c() {
        if (FragmentManager.S0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f14866c);
        }
        Fragment fragment = this.f14866c;
        Fragment fragment2 = fragment.f14999L;
        B b4 = null;
        if (fragment2 != null) {
            B o4 = this.f14865b.o(fragment2.f14997J);
            if (o4 != null) {
                Fragment fragment3 = this.f14866c;
                fragment3.f15000M = fragment3.f14999L.f14997J;
                fragment3.f14999L = null;
                b4 = o4;
            } else {
                throw new IllegalStateException("Fragment " + this.f14866c + " declared target fragment " + this.f14866c.f14999L + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.f15000M;
            if (str != null && (b4 = this.f14865b.o(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f14866c + " declared target fragment " + this.f14866c.f15000M + " that does not belong to this FragmentManager!");
            }
        }
        if (b4 != null) {
            b4.m();
        }
        Fragment fragment4 = this.f14866c;
        fragment4.f15012Y = fragment4.f15011X.F0();
        Fragment fragment5 = this.f14866c;
        fragment5.f15014a0 = fragment5.f15011X.I0();
        this.f14864a.g(this.f14866c, false);
        this.f14866c.C();
        this.f14864a.b(this.f14866c, false);
    }

    int d() {
        M.e.b bVar;
        Fragment fragment = this.f14866c;
        if (fragment.f15011X == null) {
            return fragment.f14992E;
        }
        int i4 = this.f14868e;
        int i5 = b.f14871a[fragment.f15034u0.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        i4 = Math.min(i4, -1);
                    } else {
                        i4 = Math.min(i4, 0);
                    }
                } else {
                    i4 = Math.min(i4, 1);
                }
            } else {
                i4 = Math.min(i4, 5);
            }
        }
        Fragment fragment2 = this.f14866c;
        if (fragment2.f15006S) {
            if (fragment2.f15007T) {
                i4 = Math.max(this.f14868e, 2);
                View view = this.f14866c.f15026m0;
                if (view != null && view.getParent() == null) {
                    i4 = Math.min(i4, 2);
                }
            } else {
                i4 = this.f14868e < 4 ? Math.min(i4, fragment2.f14992E) : Math.min(i4, 1);
            }
        }
        if (!this.f14866c.f15003P) {
            i4 = Math.min(i4, 1);
        }
        Fragment fragment3 = this.f14866c;
        ViewGroup viewGroup = fragment3.f15025l0;
        if (viewGroup != null) {
            bVar = M.n(viewGroup, fragment3.getParentFragmentManager()).l(this);
        } else {
            bVar = null;
        }
        if (bVar == M.e.b.ADDING) {
            i4 = Math.min(i4, 6);
        } else if (bVar == M.e.b.REMOVING) {
            i4 = Math.max(i4, 3);
        } else {
            Fragment fragment4 = this.f14866c;
            if (fragment4.f15004Q) {
                if (fragment4.y()) {
                    i4 = Math.min(i4, 1);
                } else {
                    i4 = Math.min(i4, -1);
                }
            }
        }
        Fragment fragment5 = this.f14866c;
        if (fragment5.f15027n0 && fragment5.f14992E < 5) {
            i4 = Math.min(i4, 4);
        }
        if (FragmentManager.S0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i4 + " for " + this.f14866c);
        }
        return i4;
    }

    void e() {
        if (FragmentManager.S0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f14866c);
        }
        Fragment fragment = this.f14866c;
        if (!fragment.f15033t0) {
            this.f14864a.h(fragment, fragment.f14993F, false);
            Fragment fragment2 = this.f14866c;
            fragment2.F(fragment2.f14993F);
            C0898p c0898p = this.f14864a;
            Fragment fragment3 = this.f14866c;
            c0898p.c(fragment3, fragment3.f14993F, false);
            return;
        }
        fragment.b0(fragment.f14993F);
        this.f14866c.f14992E = 1;
    }

    void f() {
        String str;
        if (this.f14866c.f15006S) {
            return;
        }
        if (FragmentManager.S0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f14866c);
        }
        Fragment fragment = this.f14866c;
        LayoutInflater L3 = fragment.L(fragment.f14993F);
        Fragment fragment2 = this.f14866c;
        ViewGroup viewGroup = fragment2.f15025l0;
        if (viewGroup == null) {
            int i4 = fragment2.f15016c0;
            if (i4 != 0) {
                if (i4 != -1) {
                    viewGroup = (ViewGroup) fragment2.f15011X.z0().c(this.f14866c.f15016c0);
                    if (viewGroup == null) {
                        Fragment fragment3 = this.f14866c;
                        if (!fragment3.f15008U) {
                            try {
                                str = fragment3.getResources().getResourceName(this.f14866c.f15016c0);
                            } catch (Resources.NotFoundException unused) {
                                str = C0745h.f12738b;
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f14866c.f15016c0) + " (" + str + ") for fragment " + this.f14866c);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        FragmentStrictMode.r(this.f14866c, viewGroup);
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f14866c + " for a container view with no id");
                }
            } else {
                viewGroup = null;
            }
        }
        Fragment fragment4 = this.f14866c;
        fragment4.f15025l0 = viewGroup;
        fragment4.H(L3, viewGroup, fragment4.f14993F);
        View view = this.f14866c.f15026m0;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f14866c;
            fragment5.f15026m0.setTag(a.c.f15a, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.f14866c;
            if (fragment6.f15018e0) {
                fragment6.f15026m0.setVisibility(8);
            }
            if (C0823k0.O0(this.f14866c.f15026m0)) {
                C0823k0.v1(this.f14866c.f15026m0);
            } else {
                View view2 = this.f14866c.f15026m0;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f14866c.Y();
            C0898p c0898p = this.f14864a;
            Fragment fragment7 = this.f14866c;
            c0898p.m(fragment7, fragment7.f15026m0, fragment7.f14993F, false);
            int visibility = this.f14866c.f15026m0.getVisibility();
            this.f14866c.i0(this.f14866c.f15026m0.getAlpha());
            Fragment fragment8 = this.f14866c;
            if (fragment8.f15025l0 != null && visibility == 0) {
                View findFocus = fragment8.f15026m0.findFocus();
                if (findFocus != null) {
                    this.f14866c.f0(findFocus);
                    if (FragmentManager.S0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f14866c);
                    }
                }
                this.f14866c.f15026m0.setAlpha(0.0f);
            }
        }
        this.f14866c.f14992E = 2;
    }

    void g() {
        boolean z3;
        Fragment f4;
        if (FragmentManager.S0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f14866c);
        }
        Fragment fragment = this.f14866c;
        boolean z4 = true;
        if (fragment.f15004Q && !fragment.y()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            Fragment fragment2 = this.f14866c;
            if (!fragment2.f15005R) {
                this.f14865b.C(fragment2.f14997J, null);
            }
        }
        if (!z3 && !this.f14865b.q().I(this.f14866c)) {
            String str = this.f14866c.f15000M;
            if (str != null && (f4 = this.f14865b.f(str)) != null && f4.f15020g0) {
                this.f14866c.f14999L = f4;
            }
            this.f14866c.f14992E = 0;
            return;
        }
        AbstractC0894l<?> abstractC0894l = this.f14866c.f15012Y;
        if (abstractC0894l instanceof q0) {
            z4 = this.f14865b.q().E();
        } else if (abstractC0894l.g() instanceof Activity) {
            z4 = true ^ ((Activity) abstractC0894l.g()).isChangingConfigurations();
        }
        if ((z3 && !this.f14866c.f15005R) || z4) {
            this.f14865b.q().v(this.f14866c);
        }
        this.f14866c.I();
        this.f14864a.d(this.f14866c, false);
        for (B b4 : this.f14865b.l()) {
            if (b4 != null) {
                Fragment k4 = b4.k();
                if (this.f14866c.f14997J.equals(k4.f15000M)) {
                    k4.f14999L = this.f14866c;
                    k4.f15000M = null;
                }
            }
        }
        Fragment fragment3 = this.f14866c;
        String str2 = fragment3.f15000M;
        if (str2 != null) {
            fragment3.f14999L = this.f14865b.f(str2);
        }
        this.f14865b.t(this);
    }

    void h() {
        View view;
        if (FragmentManager.S0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f14866c);
        }
        Fragment fragment = this.f14866c;
        ViewGroup viewGroup = fragment.f15025l0;
        if (viewGroup != null && (view = fragment.f15026m0) != null) {
            viewGroup.removeView(view);
        }
        this.f14866c.J();
        this.f14864a.n(this.f14866c, false);
        Fragment fragment2 = this.f14866c;
        fragment2.f15025l0 = null;
        fragment2.f15026m0 = null;
        fragment2.f15036w0 = null;
        fragment2.f15037x0.r(null);
        this.f14866c.f15007T = false;
    }

    void i() {
        if (FragmentManager.S0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f14866c);
        }
        this.f14866c.K();
        this.f14864a.e(this.f14866c, false);
        Fragment fragment = this.f14866c;
        fragment.f14992E = -1;
        fragment.f15012Y = null;
        fragment.f15014a0 = null;
        fragment.f15011X = null;
        if ((fragment.f15004Q && !fragment.y()) || this.f14865b.q().I(this.f14866c)) {
            if (FragmentManager.S0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f14866c);
            }
            this.f14866c.x();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        Fragment fragment = this.f14866c;
        if (fragment.f15006S && fragment.f15007T && !fragment.f15009V) {
            if (FragmentManager.S0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f14866c);
            }
            Fragment fragment2 = this.f14866c;
            fragment2.H(fragment2.L(fragment2.f14993F), null, this.f14866c.f14993F);
            View view = this.f14866c.f15026m0;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f14866c;
                fragment3.f15026m0.setTag(a.c.f15a, fragment3);
                Fragment fragment4 = this.f14866c;
                if (fragment4.f15018e0) {
                    fragment4.f15026m0.setVisibility(8);
                }
                this.f14866c.Y();
                C0898p c0898p = this.f14864a;
                Fragment fragment5 = this.f14866c;
                c0898p.m(fragment5, fragment5.f15026m0, fragment5.f14993F, false);
                this.f14866c.f14992E = 2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public Fragment k() {
        return this.f14866c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f14867d) {
            if (FragmentManager.S0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f14867d = true;
            boolean z3 = false;
            while (true) {
                int d4 = d();
                Fragment fragment = this.f14866c;
                int i4 = fragment.f14992E;
                if (d4 != i4) {
                    if (d4 > i4) {
                        switch (i4 + 1) {
                            case 0:
                                c();
                                break;
                            case 1:
                                e();
                                break;
                            case 2:
                                j();
                                f();
                                break;
                            case 3:
                                a();
                                break;
                            case 4:
                                if (fragment.f15026m0 != null && (viewGroup3 = fragment.f15025l0) != null) {
                                    M.n(viewGroup3, fragment.getParentFragmentManager()).b(M.e.c.e(this.f14866c.f15026m0.getVisibility()), this);
                                }
                                this.f14866c.f14992E = 4;
                                break;
                            case 5:
                                v();
                                break;
                            case 6:
                                fragment.f14992E = 6;
                                break;
                            case 7:
                                p();
                                break;
                        }
                    } else {
                        switch (i4 - 1) {
                            case -1:
                                i();
                                break;
                            case 0:
                                if (fragment.f15005R && this.f14865b.r(fragment.f14997J) == null) {
                                    s();
                                }
                                g();
                                break;
                            case 1:
                                h();
                                this.f14866c.f14992E = 1;
                                break;
                            case 2:
                                fragment.f15007T = false;
                                fragment.f14992E = 2;
                                break;
                            case 3:
                                if (FragmentManager.S0(3)) {
                                    Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f14866c);
                                }
                                Fragment fragment2 = this.f14866c;
                                if (fragment2.f15005R) {
                                    s();
                                } else if (fragment2.f15026m0 != null && fragment2.f14994G == null) {
                                    t();
                                }
                                Fragment fragment3 = this.f14866c;
                                if (fragment3.f15026m0 != null && (viewGroup2 = fragment3.f15025l0) != null) {
                                    M.n(viewGroup2, fragment3.getParentFragmentManager()).d(this);
                                }
                                this.f14866c.f14992E = 3;
                                break;
                            case 4:
                                w();
                                break;
                            case 5:
                                fragment.f14992E = 5;
                                break;
                            case 6:
                                n();
                                break;
                        }
                    }
                    z3 = true;
                } else {
                    if (!z3 && i4 == -1 && fragment.f15004Q && !fragment.y() && !this.f14866c.f15005R) {
                        if (FragmentManager.S0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f14866c);
                        }
                        this.f14865b.q().v(this.f14866c);
                        this.f14865b.t(this);
                        if (FragmentManager.S0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f14866c);
                        }
                        this.f14866c.x();
                    }
                    Fragment fragment4 = this.f14866c;
                    if (fragment4.f15031r0) {
                        if (fragment4.f15026m0 != null && (viewGroup = fragment4.f15025l0) != null) {
                            M n4 = M.n(viewGroup, fragment4.getParentFragmentManager());
                            if (this.f14866c.f15018e0) {
                                n4.c(this);
                            } else {
                                n4.e(this);
                            }
                        }
                        Fragment fragment5 = this.f14866c;
                        FragmentManager fragmentManager = fragment5.f15011X;
                        if (fragmentManager != null) {
                            fragmentManager.Q0(fragment5);
                        }
                        Fragment fragment6 = this.f14866c;
                        fragment6.f15031r0 = false;
                        fragment6.onHiddenChanged(fragment6.f15018e0);
                        this.f14866c.f15013Z.M();
                    }
                    this.f14867d = false;
                    return;
                }
            }
        } catch (Throwable th) {
            this.f14867d = false;
            throw th;
        }
    }

    void n() {
        if (FragmentManager.S0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f14866c);
        }
        this.f14866c.Q();
        this.f14864a.f(this.f14866c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(@androidx.annotation.N ClassLoader classLoader) {
        Bundle bundle = this.f14866c.f14993F;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f14866c;
        fragment.f14994G = fragment.f14993F.getSparseParcelableArray(f14861i);
        Fragment fragment2 = this.f14866c;
        fragment2.f14995H = fragment2.f14993F.getBundle(f14862j);
        Fragment fragment3 = this.f14866c;
        fragment3.f15000M = fragment3.f14993F.getString(f14860h);
        Fragment fragment4 = this.f14866c;
        if (fragment4.f15000M != null) {
            fragment4.f15001N = fragment4.f14993F.getInt(f14859g, 0);
        }
        Fragment fragment5 = this.f14866c;
        Boolean bool = fragment5.f14996I;
        if (bool != null) {
            fragment5.f15028o0 = bool.booleanValue();
            this.f14866c.f14996I = null;
        } else {
            fragment5.f15028o0 = fragment5.f14993F.getBoolean(f14863k, true);
        }
        Fragment fragment6 = this.f14866c;
        if (!fragment6.f15028o0) {
            fragment6.f15027n0 = true;
        }
    }

    void p() {
        String str;
        if (FragmentManager.S0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f14866c);
        }
        View m4 = this.f14866c.m();
        if (m4 != null && l(m4)) {
            boolean requestFocus = m4.requestFocus();
            if (FragmentManager.S0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(m4);
                sb.append(" ");
                if (requestFocus) {
                    str = "succeeded";
                } else {
                    str = "failed";
                }
                sb.append(str);
                sb.append(" on Fragment ");
                sb.append(this.f14866c);
                sb.append(" resulting in focused view ");
                sb.append(this.f14866c.f15026m0.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f14866c.f0(null);
        this.f14866c.U();
        this.f14864a.i(this.f14866c, false);
        Fragment fragment = this.f14866c;
        fragment.f14993F = null;
        fragment.f14994G = null;
        fragment.f14995H = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public Fragment.l r() {
        Bundle q4;
        if (this.f14866c.f14992E <= -1 || (q4 = q()) == null) {
            return null;
        }
        return new Fragment.l(q4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s() {
        A a4 = new A(this.f14866c);
        Fragment fragment = this.f14866c;
        if (fragment.f14992E > -1 && a4.f14857Q == null) {
            Bundle q4 = q();
            a4.f14857Q = q4;
            if (this.f14866c.f15000M != null) {
                if (q4 == null) {
                    a4.f14857Q = new Bundle();
                }
                a4.f14857Q.putString(f14860h, this.f14866c.f15000M);
                int i4 = this.f14866c.f15001N;
                if (i4 != 0) {
                    a4.f14857Q.putInt(f14859g, i4);
                }
            }
        } else {
            a4.f14857Q = fragment.f14993F;
        }
        this.f14865b.C(this.f14866c.f14997J, a4);
    }

    void t() {
        if (this.f14866c.f15026m0 == null) {
            return;
        }
        if (FragmentManager.S0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f14866c + " with view " + this.f14866c.f15026m0);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f14866c.f15026m0.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f14866c.f14994G = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f14866c.f15036w0.f(bundle);
        if (!bundle.isEmpty()) {
            this.f14866c.f14995H = bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(int i4) {
        this.f14868e = i4;
    }

    void v() {
        if (FragmentManager.S0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f14866c);
        }
        this.f14866c.W();
        this.f14864a.k(this.f14866c, false);
    }

    void w() {
        if (FragmentManager.S0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f14866c);
        }
        this.f14866c.X();
        this.f14864a.l(this.f14866c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(@androidx.annotation.N C0898p c0898p, @androidx.annotation.N D d4, @androidx.annotation.N ClassLoader classLoader, @androidx.annotation.N C0893k c0893k, @androidx.annotation.N A a4) {
        this.f14864a = c0898p;
        this.f14865b = d4;
        Fragment a5 = a4.a(c0893k, classLoader);
        this.f14866c = a5;
        if (FragmentManager.S0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(@androidx.annotation.N C0898p c0898p, @androidx.annotation.N D d4, @androidx.annotation.N Fragment fragment, @androidx.annotation.N A a4) {
        this.f14864a = c0898p;
        this.f14865b = d4;
        this.f14866c = fragment;
        fragment.f14994G = null;
        fragment.f14995H = null;
        fragment.f15010W = 0;
        fragment.f15007T = false;
        fragment.f15003P = false;
        Fragment fragment2 = fragment.f14999L;
        fragment.f15000M = fragment2 != null ? fragment2.f14997J : null;
        fragment.f14999L = null;
        Bundle bundle = a4.f14857Q;
        if (bundle != null) {
            fragment.f14993F = bundle;
        } else {
            fragment.f14993F = new Bundle();
        }
    }
}
