package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C0823k0;
import androidx.core.view.C0850t0;
import androidx.core.view.C0854v0;
import d.C2042a;
import e.C2046a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class j0 implements G {

    /* renamed from: s, reason: collision with root package name */
    private static final String f6221s = "ToolbarWidgetWrapper";

    /* renamed from: t, reason: collision with root package name */
    private static final int f6222t = 3;

    /* renamed from: u, reason: collision with root package name */
    private static final long f6223u = 200;

    /* renamed from: a, reason: collision with root package name */
    Toolbar f6224a;

    /* renamed from: b, reason: collision with root package name */
    private int f6225b;

    /* renamed from: c, reason: collision with root package name */
    private View f6226c;

    /* renamed from: d, reason: collision with root package name */
    private Spinner f6227d;

    /* renamed from: e, reason: collision with root package name */
    private View f6228e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f6229f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f6230g;

    /* renamed from: h, reason: collision with root package name */
    private Drawable f6231h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f6232i;

    /* renamed from: j, reason: collision with root package name */
    CharSequence f6233j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f6234k;

    /* renamed from: l, reason: collision with root package name */
    private CharSequence f6235l;

    /* renamed from: m, reason: collision with root package name */
    Window.Callback f6236m;

    /* renamed from: n, reason: collision with root package name */
    boolean f6237n;

    /* renamed from: o, reason: collision with root package name */
    private C0590c f6238o;

    /* renamed from: p, reason: collision with root package name */
    private int f6239p;

    /* renamed from: q, reason: collision with root package name */
    private int f6240q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f6241r;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {

        /* renamed from: E, reason: collision with root package name */
        final androidx.appcompat.view.menu.a f6242E;

        a() {
            this.f6242E = new androidx.appcompat.view.menu.a(j0.this.f6224a.getContext(), 0, R.id.home, 0, 0, j0.this.f6233j);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j0 j0Var = j0.this;
            Window.Callback callback = j0Var.f6236m;
            if (callback != null && j0Var.f6237n) {
                callback.onMenuItemSelected(0, this.f6242E);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends C0854v0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f6244a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6245b;

        b(int i4) {
            this.f6245b = i4;
        }

        @Override // androidx.core.view.C0854v0, androidx.core.view.InterfaceC0852u0
        public void a(View view) {
            this.f6244a = true;
        }

        @Override // androidx.core.view.C0854v0, androidx.core.view.InterfaceC0852u0
        public void b(View view) {
            if (!this.f6244a) {
                j0.this.f6224a.setVisibility(this.f6245b);
            }
        }

        @Override // androidx.core.view.C0854v0, androidx.core.view.InterfaceC0852u0
        public void c(View view) {
            j0.this.f6224a.setVisibility(0);
        }
    }

    public j0(Toolbar toolbar, boolean z3) {
        this(toolbar, z3, C2042a.k.f49714b, C2042a.f.f49580v);
    }

    private int W() {
        if (this.f6224a.getNavigationIcon() != null) {
            this.f6241r = this.f6224a.getNavigationIcon();
            return 15;
        }
        return 11;
    }

    private void X() {
        if (this.f6227d == null) {
            this.f6227d = new C0611y(e(), null, C2042a.b.f49255m);
            this.f6227d.setLayoutParams(new Toolbar.g(-2, -2, 8388627));
        }
    }

    private void Y(CharSequence charSequence) {
        this.f6233j = charSequence;
        if ((this.f6225b & 8) != 0) {
            this.f6224a.setTitle(charSequence);
            if (this.f6232i) {
                C0823k0.E1(this.f6224a.getRootView(), charSequence);
            }
        }
    }

    private void Z() {
        if ((this.f6225b & 4) != 0) {
            if (TextUtils.isEmpty(this.f6235l)) {
                this.f6224a.setNavigationContentDescription(this.f6240q);
            } else {
                this.f6224a.setNavigationContentDescription(this.f6235l);
            }
        }
    }

    private void a0() {
        if ((this.f6225b & 4) != 0) {
            Toolbar toolbar = this.f6224a;
            Drawable drawable = this.f6231h;
            if (drawable == null) {
                drawable = this.f6241r;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f6224a.setNavigationIcon((Drawable) null);
    }

    private void b0() {
        Drawable drawable;
        int i4 = this.f6225b;
        if ((i4 & 2) != 0) {
            if ((i4 & 1) != 0) {
                drawable = this.f6230g;
                if (drawable == null) {
                    drawable = this.f6229f;
                }
            } else {
                drawable = this.f6229f;
            }
        } else {
            drawable = null;
        }
        this.f6224a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.G
    public Menu A() {
        return this.f6224a.getMenu();
    }

    @Override // androidx.appcompat.widget.G
    public boolean B() {
        if (this.f6226c != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.G
    public int C() {
        return this.f6239p;
    }

    @Override // androidx.appcompat.widget.G
    public void D(int i4) {
        C0850t0 E3 = E(i4, 200L);
        if (E3 != null) {
            E3.y();
        }
    }

    @Override // androidx.appcompat.widget.G
    public C0850t0 E(int i4, long j4) {
        float f4;
        C0850t0 g4 = C0823k0.g(this.f6224a);
        if (i4 == 0) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        return g4.b(f4).s(j4).u(new b(i4));
    }

    @Override // androidx.appcompat.widget.G
    public void F(int i4) {
        View view;
        int i5 = this.f6239p;
        if (i4 != i5) {
            if (i5 != 1) {
                if (i5 == 2 && (view = this.f6226c) != null) {
                    ViewParent parent = view.getParent();
                    Toolbar toolbar = this.f6224a;
                    if (parent == toolbar) {
                        toolbar.removeView(this.f6226c);
                    }
                }
            } else {
                Spinner spinner = this.f6227d;
                if (spinner != null) {
                    ViewParent parent2 = spinner.getParent();
                    Toolbar toolbar2 = this.f6224a;
                    if (parent2 == toolbar2) {
                        toolbar2.removeView(this.f6227d);
                    }
                }
            }
            this.f6239p = i4;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        View view2 = this.f6226c;
                        if (view2 != null) {
                            this.f6224a.addView(view2, 0);
                            Toolbar.g gVar = (Toolbar.g) this.f6226c.getLayoutParams();
                            ((ViewGroup.MarginLayoutParams) gVar).width = -2;
                            ((ViewGroup.MarginLayoutParams) gVar).height = -2;
                            gVar.f4816a = 8388691;
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Invalid navigation mode " + i4);
                }
                X();
                this.f6224a.addView(this.f6227d, 0);
            }
        }
    }

    @Override // androidx.appcompat.widget.G
    public void G(int i4) {
        Drawable drawable;
        if (i4 != 0) {
            drawable = C2046a.b(e(), i4);
        } else {
            drawable = null;
        }
        U(drawable);
    }

    @Override // androidx.appcompat.widget.G
    public void H(n.a aVar, g.a aVar2) {
        this.f6224a.S(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.G
    public ViewGroup I() {
        return this.f6224a;
    }

    @Override // androidx.appcompat.widget.G
    public void J(boolean z3) {
    }

    @Override // androidx.appcompat.widget.G
    public void K(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        X();
        this.f6227d.setAdapter(spinnerAdapter);
        this.f6227d.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // androidx.appcompat.widget.G
    public void L(SparseArray<Parcelable> sparseArray) {
        this.f6224a.restoreHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.G
    public CharSequence M() {
        return this.f6224a.getSubtitle();
    }

    @Override // androidx.appcompat.widget.G
    public int N() {
        return this.f6225b;
    }

    @Override // androidx.appcompat.widget.G
    public int O() {
        Spinner spinner = this.f6227d;
        if (spinner != null) {
            return spinner.getSelectedItemPosition();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.G
    public void P(int i4) {
        String string;
        if (i4 == 0) {
            string = null;
        } else {
            string = e().getString(i4);
        }
        v(string);
    }

    @Override // androidx.appcompat.widget.G
    public void Q(View view) {
        View view2 = this.f6228e;
        if (view2 != null && (this.f6225b & 16) != 0) {
            this.f6224a.removeView(view2);
        }
        this.f6228e = view;
        if (view != null && (this.f6225b & 16) != 0) {
            this.f6224a.addView(view);
        }
    }

    @Override // androidx.appcompat.widget.G
    public void R() {
        Log.i(f6221s, "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.G
    public int S() {
        Spinner spinner = this.f6227d;
        if (spinner != null) {
            return spinner.getCount();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.G
    public void T() {
        Log.i(f6221s, "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.G
    public void U(Drawable drawable) {
        this.f6231h = drawable;
        a0();
    }

    @Override // androidx.appcompat.widget.G
    public void V(boolean z3) {
        this.f6224a.setCollapsible(z3);
    }

    @Override // androidx.appcompat.widget.G
    public int a() {
        return this.f6224a.getHeight();
    }

    @Override // androidx.appcompat.widget.G
    public void b(Drawable drawable) {
        C0823k0.I1(this.f6224a, drawable);
    }

    @Override // androidx.appcompat.widget.G
    public int c() {
        return this.f6224a.getVisibility();
    }

    @Override // androidx.appcompat.widget.G
    public void collapseActionView() {
        this.f6224a.g();
    }

    @Override // androidx.appcompat.widget.G
    public void d(Menu menu, n.a aVar) {
        if (this.f6238o == null) {
            C0590c c0590c = new C0590c(this.f6224a.getContext());
            this.f6238o = c0590c;
            c0590c.s(C2042a.g.f49634j);
        }
        this.f6238o.h(aVar);
        this.f6224a.R((androidx.appcompat.view.menu.g) menu, this.f6238o);
    }

    @Override // androidx.appcompat.widget.G
    public Context e() {
        return this.f6224a.getContext();
    }

    @Override // androidx.appcompat.widget.G
    public boolean f() {
        return this.f6224a.G();
    }

    @Override // androidx.appcompat.widget.G
    public void g() {
        this.f6237n = true;
    }

    @Override // androidx.appcompat.widget.G
    public CharSequence getTitle() {
        return this.f6224a.getTitle();
    }

    @Override // androidx.appcompat.widget.G
    public boolean h() {
        if (this.f6229f != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.G
    public boolean i() {
        return this.f6224a.f();
    }

    @Override // androidx.appcompat.widget.G
    public boolean j() {
        if (this.f6230g != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.G
    public boolean k() {
        return this.f6224a.F();
    }

    @Override // androidx.appcompat.widget.G
    public boolean l() {
        return this.f6224a.B();
    }

    @Override // androidx.appcompat.widget.G
    public boolean m() {
        return this.f6224a.Y();
    }

    @Override // androidx.appcompat.widget.G
    public void n(int i4) {
        if (i4 == this.f6240q) {
            return;
        }
        this.f6240q = i4;
        if (TextUtils.isEmpty(this.f6224a.getNavigationContentDescription())) {
            P(this.f6240q);
        }
    }

    @Override // androidx.appcompat.widget.G
    public void o() {
        this.f6224a.h();
    }

    @Override // androidx.appcompat.widget.G
    public View p() {
        return this.f6228e;
    }

    @Override // androidx.appcompat.widget.G
    public void q(Y y3) {
        View view = this.f6226c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f6224a;
            if (parent == toolbar) {
                toolbar.removeView(this.f6226c);
            }
        }
        this.f6226c = y3;
        if (y3 != null && this.f6239p == 2) {
            this.f6224a.addView(y3, 0);
            Toolbar.g gVar = (Toolbar.g) this.f6226c.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) gVar).width = -2;
            ((ViewGroup.MarginLayoutParams) gVar).height = -2;
            gVar.f4816a = 8388691;
            y3.setAllowCollapse(true);
        }
    }

    @Override // androidx.appcompat.widget.G
    public void r(Drawable drawable) {
        this.f6230g = drawable;
        b0();
    }

    @Override // androidx.appcompat.widget.G
    public boolean s() {
        return this.f6224a.z();
    }

    @Override // androidx.appcompat.widget.G
    public void setIcon(int i4) {
        setIcon(i4 != 0 ? C2046a.b(e(), i4) : null);
    }

    @Override // androidx.appcompat.widget.G
    public void setLogo(int i4) {
        Drawable drawable;
        if (i4 != 0) {
            drawable = C2046a.b(e(), i4);
        } else {
            drawable = null;
        }
        r(drawable);
    }

    @Override // androidx.appcompat.widget.G
    public void setTitle(CharSequence charSequence) {
        this.f6232i = true;
        Y(charSequence);
    }

    @Override // androidx.appcompat.widget.G
    public void setVisibility(int i4) {
        this.f6224a.setVisibility(i4);
    }

    @Override // androidx.appcompat.widget.G
    public void setWindowCallback(Window.Callback callback) {
        this.f6236m = callback;
    }

    @Override // androidx.appcompat.widget.G
    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f6232i) {
            Y(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.G
    public boolean t() {
        return this.f6224a.H();
    }

    @Override // androidx.appcompat.widget.G
    public void u(int i4) {
        View view;
        int i5 = this.f6225b ^ i4;
        this.f6225b = i4;
        if (i5 != 0) {
            if ((i5 & 4) != 0) {
                if ((i4 & 4) != 0) {
                    Z();
                }
                a0();
            }
            if ((i5 & 3) != 0) {
                b0();
            }
            if ((i5 & 8) != 0) {
                if ((i4 & 8) != 0) {
                    this.f6224a.setTitle(this.f6233j);
                    this.f6224a.setSubtitle(this.f6234k);
                } else {
                    this.f6224a.setTitle((CharSequence) null);
                    this.f6224a.setSubtitle((CharSequence) null);
                }
            }
            if ((i5 & 16) != 0 && (view = this.f6228e) != null) {
                if ((i4 & 16) != 0) {
                    this.f6224a.addView(view);
                } else {
                    this.f6224a.removeView(view);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.G
    public void v(CharSequence charSequence) {
        this.f6235l = charSequence;
        Z();
    }

    @Override // androidx.appcompat.widget.G
    public void w(CharSequence charSequence) {
        this.f6234k = charSequence;
        if ((this.f6225b & 8) != 0) {
            this.f6224a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.G
    public void x(Drawable drawable) {
        if (this.f6241r != drawable) {
            this.f6241r = drawable;
            a0();
        }
    }

    @Override // androidx.appcompat.widget.G
    public void y(SparseArray<Parcelable> sparseArray) {
        this.f6224a.saveHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.G
    public void z(int i4) {
        Spinner spinner = this.f6227d;
        if (spinner != null) {
            spinner.setSelection(i4);
            return;
        }
        throw new IllegalStateException("Can't set dropdown selected position without an adapter");
    }

    public j0(Toolbar toolbar, boolean z3, int i4, int i5) {
        Drawable drawable;
        this.f6239p = 0;
        this.f6240q = 0;
        this.f6224a = toolbar;
        this.f6233j = toolbar.getTitle();
        this.f6234k = toolbar.getSubtitle();
        this.f6232i = this.f6233j != null;
        this.f6231h = toolbar.getNavigationIcon();
        g0 G3 = g0.G(toolbar.getContext(), null, C2042a.m.f50070a, C2042a.b.f49220f, 0);
        this.f6241r = G3.h(C2042a.m.f50150q);
        if (z3) {
            CharSequence x3 = G3.x(C2042a.m.f49974C);
            if (!TextUtils.isEmpty(x3)) {
                setTitle(x3);
            }
            CharSequence x4 = G3.x(C2042a.m.f49966A);
            if (!TextUtils.isEmpty(x4)) {
                w(x4);
            }
            Drawable h4 = G3.h(C2042a.m.f50173v);
            if (h4 != null) {
                r(h4);
            }
            Drawable h5 = G3.h(C2042a.m.f50160s);
            if (h5 != null) {
                setIcon(h5);
            }
            if (this.f6231h == null && (drawable = this.f6241r) != null) {
                U(drawable);
            }
            u(G3.o(C2042a.m.f50125l, 0));
            int u3 = G3.u(C2042a.m.f50120k, 0);
            if (u3 != 0) {
                Q(LayoutInflater.from(this.f6224a.getContext()).inflate(u3, (ViewGroup) this.f6224a, false));
                u(this.f6225b | 16);
            }
            int q4 = G3.q(C2042a.m.f50140o, 0);
            if (q4 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f6224a.getLayoutParams();
                layoutParams.height = q4;
                this.f6224a.setLayoutParams(layoutParams);
            }
            int f4 = G3.f(C2042a.m.f50110i, -1);
            int f5 = G3.f(C2042a.m.f50090e, -1);
            if (f4 >= 0 || f5 >= 0) {
                this.f6224a.Q(Math.max(f4, 0), Math.max(f5, 0));
            }
            int u4 = G3.u(C2042a.m.f49978D, 0);
            if (u4 != 0) {
                Toolbar toolbar2 = this.f6224a;
                toolbar2.V(toolbar2.getContext(), u4);
            }
            int u5 = G3.u(C2042a.m.f49970B, 0);
            if (u5 != 0) {
                Toolbar toolbar3 = this.f6224a;
                toolbar3.T(toolbar3.getContext(), u5);
            }
            int u6 = G3.u(C2042a.m.f50181x, 0);
            if (u6 != 0) {
                this.f6224a.setPopupTheme(u6);
            }
        } else {
            this.f6225b = W();
        }
        G3.I();
        n(i4);
        this.f6235l = this.f6224a.getNavigationContentDescription();
        this.f6224a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.G
    public void setIcon(Drawable drawable) {
        this.f6229f = drawable;
        b0();
    }
}
