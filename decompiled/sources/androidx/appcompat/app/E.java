package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.SpinnerAdapter;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AbstractC0583a;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.G;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Y;
import androidx.core.view.C0823k0;
import androidx.core.view.C0850t0;
import androidx.core.view.C0854v0;
import androidx.core.view.InterfaceC0852u0;
import androidx.core.view.InterfaceC0856w0;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.F;
import d.C2042a;
import e.C2046a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class E extends AbstractC0583a implements ActionBarOverlayLayout.d {

    /* renamed from: N, reason: collision with root package name */
    private static final String f4755N = "WindowDecorActionBar";

    /* renamed from: O, reason: collision with root package name */
    private static final Interpolator f4756O = new AccelerateInterpolator();

    /* renamed from: P, reason: collision with root package name */
    private static final Interpolator f4757P = new DecelerateInterpolator();

    /* renamed from: Q, reason: collision with root package name */
    private static final int f4758Q = -1;

    /* renamed from: R, reason: collision with root package name */
    private static final long f4759R = 100;

    /* renamed from: S, reason: collision with root package name */
    private static final long f4760S = 200;

    /* renamed from: A, reason: collision with root package name */
    private boolean f4761A;

    /* renamed from: D, reason: collision with root package name */
    boolean f4764D;

    /* renamed from: E, reason: collision with root package name */
    boolean f4765E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f4766F;

    /* renamed from: H, reason: collision with root package name */
    androidx.appcompat.view.h f4768H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f4769I;

    /* renamed from: J, reason: collision with root package name */
    boolean f4770J;

    /* renamed from: i, reason: collision with root package name */
    Context f4774i;

    /* renamed from: j, reason: collision with root package name */
    private Context f4775j;

    /* renamed from: k, reason: collision with root package name */
    private Activity f4776k;

    /* renamed from: l, reason: collision with root package name */
    ActionBarOverlayLayout f4777l;

    /* renamed from: m, reason: collision with root package name */
    ActionBarContainer f4778m;

    /* renamed from: n, reason: collision with root package name */
    G f4779n;

    /* renamed from: o, reason: collision with root package name */
    ActionBarContextView f4780o;

    /* renamed from: p, reason: collision with root package name */
    View f4781p;

    /* renamed from: q, reason: collision with root package name */
    Y f4782q;

    /* renamed from: s, reason: collision with root package name */
    private e f4784s;

    /* renamed from: u, reason: collision with root package name */
    private boolean f4786u;

    /* renamed from: v, reason: collision with root package name */
    d f4787v;

    /* renamed from: w, reason: collision with root package name */
    androidx.appcompat.view.b f4788w;

    /* renamed from: x, reason: collision with root package name */
    b.a f4789x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f4790y;

    /* renamed from: r, reason: collision with root package name */
    private ArrayList<e> f4783r = new ArrayList<>();

    /* renamed from: t, reason: collision with root package name */
    private int f4785t = -1;

    /* renamed from: z, reason: collision with root package name */
    private ArrayList<AbstractC0583a.d> f4791z = new ArrayList<>();

    /* renamed from: B, reason: collision with root package name */
    private int f4762B = 0;

    /* renamed from: C, reason: collision with root package name */
    boolean f4763C = true;

    /* renamed from: G, reason: collision with root package name */
    private boolean f4767G = true;

    /* renamed from: K, reason: collision with root package name */
    final InterfaceC0852u0 f4771K = new a();

    /* renamed from: L, reason: collision with root package name */
    final InterfaceC0852u0 f4772L = new b();

    /* renamed from: M, reason: collision with root package name */
    final InterfaceC0856w0 f4773M = new c();

    /* loaded from: classes.dex */
    class a extends C0854v0 {
        a() {
        }

        @Override // androidx.core.view.C0854v0, androidx.core.view.InterfaceC0852u0
        public void b(View view) {
            View view2;
            E e4 = E.this;
            if (e4.f4763C && (view2 = e4.f4781p) != null) {
                view2.setTranslationY(0.0f);
                E.this.f4778m.setTranslationY(0.0f);
            }
            E.this.f4778m.setVisibility(8);
            E.this.f4778m.setTransitioning(false);
            E e5 = E.this;
            e5.f4768H = null;
            e5.H0();
            ActionBarOverlayLayout actionBarOverlayLayout = E.this.f4777l;
            if (actionBarOverlayLayout != null) {
                C0823k0.v1(actionBarOverlayLayout);
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends C0854v0 {
        b() {
        }

        @Override // androidx.core.view.C0854v0, androidx.core.view.InterfaceC0852u0
        public void b(View view) {
            E e4 = E.this;
            e4.f4768H = null;
            e4.f4778m.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    class c implements InterfaceC0856w0 {
        c() {
        }

        @Override // androidx.core.view.InterfaceC0856w0
        public void a(View view) {
            ((View) E.this.f4778m.getParent()).invalidate();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public class d extends androidx.appcompat.view.b implements g.a {

        /* renamed from: G, reason: collision with root package name */
        private final Context f4795G;

        /* renamed from: H, reason: collision with root package name */
        private final androidx.appcompat.view.menu.g f4796H;

        /* renamed from: I, reason: collision with root package name */
        private b.a f4797I;

        /* renamed from: J, reason: collision with root package name */
        private WeakReference<View> f4798J;

        public d(Context context, b.a aVar) {
            this.f4795G = context;
            this.f4797I = aVar;
            androidx.appcompat.view.menu.g Z3 = new androidx.appcompat.view.menu.g(context).Z(1);
            this.f4796H = Z3;
            Z3.X(this);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(@N androidx.appcompat.view.menu.g gVar, @N MenuItem menuItem) {
            b.a aVar = this.f4797I;
            if (aVar != null) {
                return aVar.d(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(@N androidx.appcompat.view.menu.g gVar) {
            if (this.f4797I == null) {
                return;
            }
            k();
            E.this.f4780o.o();
        }

        @Override // androidx.appcompat.view.b
        public void c() {
            E e4 = E.this;
            if (e4.f4787v != this) {
                return;
            }
            if (!E.F0(e4.f4764D, e4.f4765E, false)) {
                E e5 = E.this;
                e5.f4788w = this;
                e5.f4789x = this.f4797I;
            } else {
                this.f4797I.a(this);
            }
            this.f4797I = null;
            E.this.E0(false);
            E.this.f4780o.p();
            E e6 = E.this;
            e6.f4777l.setHideOnContentScrollEnabled(e6.f4770J);
            E.this.f4787v = null;
        }

        @Override // androidx.appcompat.view.b
        public View d() {
            WeakReference<View> weakReference = this.f4798J;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.b
        public Menu e() {
            return this.f4796H;
        }

        @Override // androidx.appcompat.view.b
        public MenuInflater f() {
            return new androidx.appcompat.view.g(this.f4795G);
        }

        @Override // androidx.appcompat.view.b
        public CharSequence g() {
            return E.this.f4780o.getSubtitle();
        }

        @Override // androidx.appcompat.view.b
        public CharSequence i() {
            return E.this.f4780o.getTitle();
        }

        @Override // androidx.appcompat.view.b
        public void k() {
            if (E.this.f4787v != this) {
                return;
            }
            this.f4796H.m0();
            try {
                this.f4797I.c(this, this.f4796H);
            } finally {
                this.f4796H.l0();
            }
        }

        @Override // androidx.appcompat.view.b
        public boolean l() {
            return E.this.f4780o.s();
        }

        @Override // androidx.appcompat.view.b
        public void n(View view) {
            E.this.f4780o.setCustomView(view);
            this.f4798J = new WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.b
        public void o(int i4) {
            p(E.this.f4774i.getResources().getString(i4));
        }

        @Override // androidx.appcompat.view.b
        public void p(CharSequence charSequence) {
            E.this.f4780o.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void r(int i4) {
            s(E.this.f4774i.getResources().getString(i4));
        }

        @Override // androidx.appcompat.view.b
        public void s(CharSequence charSequence) {
            E.this.f4780o.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void t(boolean z3) {
            super.t(z3);
            E.this.f4780o.setTitleOptional(z3);
        }

        public boolean u() {
            this.f4796H.m0();
            try {
                return this.f4797I.b(this, this.f4796H);
            } finally {
                this.f4796H.l0();
            }
        }

        public void v(androidx.appcompat.view.menu.g gVar, boolean z3) {
        }

        public void w(androidx.appcompat.view.menu.s sVar) {
        }

        public boolean x(androidx.appcompat.view.menu.s sVar) {
            if (this.f4797I == null) {
                return false;
            }
            if (!sVar.hasVisibleItems()) {
                return true;
            }
            new androidx.appcompat.view.menu.m(E.this.A(), sVar).l();
            return true;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public class e extends AbstractC0583a.f {

        /* renamed from: b, reason: collision with root package name */
        private AbstractC0583a.g f4800b;

        /* renamed from: c, reason: collision with root package name */
        private Object f4801c;

        /* renamed from: d, reason: collision with root package name */
        private Drawable f4802d;

        /* renamed from: e, reason: collision with root package name */
        private CharSequence f4803e;

        /* renamed from: f, reason: collision with root package name */
        private CharSequence f4804f;

        /* renamed from: g, reason: collision with root package name */
        private int f4805g = -1;

        /* renamed from: h, reason: collision with root package name */
        private View f4806h;

        public e() {
        }

        @Override // androidx.appcompat.app.AbstractC0583a.f
        public CharSequence a() {
            return this.f4804f;
        }

        @Override // androidx.appcompat.app.AbstractC0583a.f
        public View b() {
            return this.f4806h;
        }

        @Override // androidx.appcompat.app.AbstractC0583a.f
        public Drawable c() {
            return this.f4802d;
        }

        @Override // androidx.appcompat.app.AbstractC0583a.f
        public int d() {
            return this.f4805g;
        }

        @Override // androidx.appcompat.app.AbstractC0583a.f
        public Object e() {
            return this.f4801c;
        }

        @Override // androidx.appcompat.app.AbstractC0583a.f
        public CharSequence f() {
            return this.f4803e;
        }

        @Override // androidx.appcompat.app.AbstractC0583a.f
        public void g() {
            E.this.S(this);
        }

        @Override // androidx.appcompat.app.AbstractC0583a.f
        public AbstractC0583a.f h(int i4) {
            return i(E.this.f4774i.getResources().getText(i4));
        }

        @Override // androidx.appcompat.app.AbstractC0583a.f
        public AbstractC0583a.f i(CharSequence charSequence) {
            this.f4804f = charSequence;
            int i4 = this.f4805g;
            if (i4 >= 0) {
                E.this.f4782q.m(i4);
            }
            return this;
        }

        @Override // androidx.appcompat.app.AbstractC0583a.f
        public AbstractC0583a.f j(int i4) {
            return k(LayoutInflater.from(E.this.A()).inflate(i4, (ViewGroup) null));
        }

        @Override // androidx.appcompat.app.AbstractC0583a.f
        public AbstractC0583a.f k(View view) {
            this.f4806h = view;
            int i4 = this.f4805g;
            if (i4 >= 0) {
                E.this.f4782q.m(i4);
            }
            return this;
        }

        @Override // androidx.appcompat.app.AbstractC0583a.f
        public AbstractC0583a.f l(int i4) {
            return m(C2046a.b(E.this.f4774i, i4));
        }

        @Override // androidx.appcompat.app.AbstractC0583a.f
        public AbstractC0583a.f m(Drawable drawable) {
            this.f4802d = drawable;
            int i4 = this.f4805g;
            if (i4 >= 0) {
                E.this.f4782q.m(i4);
            }
            return this;
        }

        @Override // androidx.appcompat.app.AbstractC0583a.f
        public AbstractC0583a.f n(AbstractC0583a.g gVar) {
            this.f4800b = gVar;
            return this;
        }

        @Override // androidx.appcompat.app.AbstractC0583a.f
        public AbstractC0583a.f o(Object obj) {
            this.f4801c = obj;
            return this;
        }

        @Override // androidx.appcompat.app.AbstractC0583a.f
        public AbstractC0583a.f p(int i4) {
            return q(E.this.f4774i.getResources().getText(i4));
        }

        @Override // androidx.appcompat.app.AbstractC0583a.f
        public AbstractC0583a.f q(CharSequence charSequence) {
            this.f4803e = charSequence;
            int i4 = this.f4805g;
            if (i4 >= 0) {
                E.this.f4782q.m(i4);
            }
            return this;
        }

        public AbstractC0583a.g r() {
            return this.f4800b;
        }

        public void s(int i4) {
            this.f4805g = i4;
        }
    }

    public E(Activity activity, boolean z3) {
        this.f4776k = activity;
        View decorView = activity.getWindow().getDecorView();
        Q0(decorView);
        if (z3) {
            return;
        }
        this.f4781p = decorView.findViewById(R.id.content);
    }

    static boolean F0(boolean z3, boolean z4, boolean z5) {
        if (z5) {
            return true;
        }
        return (z3 || z4) ? false : true;
    }

    private void G0() {
        if (this.f4784s != null) {
            S(null);
        }
        this.f4783r.clear();
        Y y3 = this.f4782q;
        if (y3 != null) {
            y3.k();
        }
        this.f4785t = -1;
    }

    private void I0(AbstractC0583a.f fVar, int i4) {
        e eVar = (e) fVar;
        if (eVar.r() != null) {
            eVar.s(i4);
            this.f4783r.add(i4, eVar);
            int size = this.f4783r.size();
            while (true) {
                i4++;
                if (i4 < size) {
                    this.f4783r.get(i4).s(i4);
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("Action Bar Tab must have a Callback");
        }
    }

    private void L0() {
        if (this.f4782q != null) {
            return;
        }
        Y y3 = new Y(this.f4774i);
        if (this.f4761A) {
            y3.setVisibility(0);
            this.f4779n.q(y3);
        } else {
            if (u() == 2) {
                y3.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f4777l;
                if (actionBarOverlayLayout != null) {
                    C0823k0.v1(actionBarOverlayLayout);
                }
            } else {
                y3.setVisibility(8);
            }
            this.f4778m.setTabContainer(y3);
        }
        this.f4782q = y3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private G M0(View view) {
        String str;
        if (view instanceof G) {
            return (G) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        if (view != 0) {
            str = view.getClass().getSimpleName();
        } else {
            str = "null";
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    private void P0() {
        if (this.f4766F) {
            this.f4766F = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f4777l;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            U0(false);
        }
    }

    private void Q0(View view) {
        boolean z3;
        boolean z4;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C2042a.g.f49662x);
        this.f4777l = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f4779n = M0(view.findViewById(C2042a.g.f49616a));
        this.f4780o = (ActionBarContextView) view.findViewById(C2042a.g.f49630h);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C2042a.g.f49620c);
        this.f4778m = actionBarContainer;
        G g4 = this.f4779n;
        if (g4 != null && this.f4780o != null && actionBarContainer != null) {
            this.f4774i = g4.e();
            if ((this.f4779n.N() & 4) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                this.f4786u = true;
            }
            androidx.appcompat.view.a b4 = androidx.appcompat.view.a.b(this.f4774i);
            if (!b4.a() && !z3) {
                z4 = false;
            } else {
                z4 = true;
            }
            m0(z4);
            R0(b4.g());
            TypedArray obtainStyledAttributes = this.f4774i.obtainStyledAttributes(null, C2042a.m.f50070a, C2042a.b.f49220f, 0);
            if (obtainStyledAttributes.getBoolean(C2042a.m.f50145p, false)) {
                h0(true);
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C2042a.m.f50135n, 0);
            if (dimensionPixelSize != 0) {
                f0(dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
    }

    private void R0(boolean z3) {
        boolean z4;
        boolean z5;
        this.f4761A = z3;
        if (!z3) {
            this.f4779n.q(null);
            this.f4778m.setTabContainer(this.f4782q);
        } else {
            this.f4778m.setTabContainer(null);
            this.f4779n.q(this.f4782q);
        }
        boolean z6 = true;
        if (u() == 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        Y y3 = this.f4782q;
        if (y3 != null) {
            if (z4) {
                y3.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f4777l;
                if (actionBarOverlayLayout != null) {
                    C0823k0.v1(actionBarOverlayLayout);
                }
            } else {
                y3.setVisibility(8);
            }
        }
        G g4 = this.f4779n;
        if (!this.f4761A && z4) {
            z5 = true;
        } else {
            z5 = false;
        }
        g4.V(z5);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f4777l;
        if (this.f4761A || !z4) {
            z6 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z6);
    }

    private boolean S0() {
        return C0823k0.U0(this.f4778m);
    }

    private void T0() {
        if (!this.f4766F) {
            this.f4766F = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f4777l;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            U0(false);
        }
    }

    private void U0(boolean z3) {
        if (F0(this.f4764D, this.f4765E, this.f4766F)) {
            if (!this.f4767G) {
                this.f4767G = true;
                K0(z3);
                return;
            }
            return;
        }
        if (this.f4767G) {
            this.f4767G = false;
            J0(z3);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public Context A() {
        if (this.f4775j == null) {
            TypedValue typedValue = new TypedValue();
            this.f4774i.getTheme().resolveAttribute(C2042a.b.f49245k, typedValue, true);
            int i4 = typedValue.resourceId;
            if (i4 != 0) {
                this.f4775j = new ContextThemeWrapper(this.f4774i, i4);
            } else {
                this.f4775j = this.f4774i;
            }
        }
        return this.f4775j;
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void A0(CharSequence charSequence) {
        this.f4779n.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public CharSequence B() {
        return this.f4779n.getTitle();
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void B0(CharSequence charSequence) {
        this.f4779n.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void C() {
        if (!this.f4764D) {
            this.f4764D = true;
            U0(false);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void C0() {
        if (this.f4764D) {
            this.f4764D = false;
            U0(false);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public androidx.appcompat.view.b D0(b.a aVar) {
        d dVar = this.f4787v;
        if (dVar != null) {
            dVar.c();
        }
        this.f4777l.setHideOnContentScrollEnabled(false);
        this.f4780o.t();
        d dVar2 = new d(this.f4780o.getContext(), aVar);
        if (dVar2.u()) {
            this.f4787v = dVar2;
            dVar2.k();
            this.f4780o.q(dVar2);
            E0(true);
            return dVar2;
        }
        return null;
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public boolean E() {
        return this.f4777l.A();
    }

    public void E0(boolean z3) {
        C0850t0 E3;
        C0850t0 n4;
        if (z3) {
            T0();
        } else {
            P0();
        }
        if (S0()) {
            if (z3) {
                n4 = this.f4779n.E(4, 100L);
                E3 = this.f4780o.n(0, 200L);
            } else {
                E3 = this.f4779n.E(0, 200L);
                n4 = this.f4780o.n(8, 100L);
            }
            androidx.appcompat.view.h hVar = new androidx.appcompat.view.h();
            hVar.d(n4, E3);
            hVar.h();
            return;
        }
        if (z3) {
            this.f4779n.setVisibility(4);
            this.f4780o.setVisibility(0);
        } else {
            this.f4779n.setVisibility(0);
            this.f4780o.setVisibility(8);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public boolean F() {
        int r4 = r();
        if (this.f4767G && (r4 == 0 || s() < r4)) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public boolean G() {
        G g4 = this.f4779n;
        if (g4 != null && g4.t()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public AbstractC0583a.f H() {
        return new e();
    }

    void H0() {
        b.a aVar = this.f4789x;
        if (aVar != null) {
            aVar.a(this.f4788w);
            this.f4788w = null;
            this.f4789x = null;
        }
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void I(Configuration configuration) {
        R0(androidx.appcompat.view.a.b(this.f4774i).g());
    }

    public void J0(boolean z3) {
        View view;
        androidx.appcompat.view.h hVar = this.f4768H;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f4762B == 0 && (this.f4769I || z3)) {
            this.f4778m.setAlpha(1.0f);
            this.f4778m.setTransitioning(true);
            androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
            float f4 = -this.f4778m.getHeight();
            if (z3) {
                this.f4778m.getLocationInWindow(new int[]{0, 0});
                f4 -= r5[1];
            }
            C0850t0 B3 = C0823k0.g(this.f4778m).B(f4);
            B3.x(this.f4773M);
            hVar2.c(B3);
            if (this.f4763C && (view = this.f4781p) != null) {
                hVar2.c(C0823k0.g(view).B(f4));
            }
            hVar2.f(f4756O);
            hVar2.e(250L);
            hVar2.g(this.f4771K);
            this.f4768H = hVar2;
            hVar2.h();
            return;
        }
        this.f4771K.b(null);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public boolean K(int i4, KeyEvent keyEvent) {
        Menu e4;
        int i5;
        d dVar = this.f4787v;
        if (dVar == null || (e4 = dVar.e()) == null) {
            return false;
        }
        if (keyEvent != null) {
            i5 = keyEvent.getDeviceId();
        } else {
            i5 = -1;
        }
        boolean z3 = true;
        if (KeyCharacterMap.load(i5).getKeyboardType() == 1) {
            z3 = false;
        }
        e4.setQwertyMode(z3);
        return e4.performShortcut(i4, keyEvent, 0);
    }

    public void K0(boolean z3) {
        View view;
        View view2;
        androidx.appcompat.view.h hVar = this.f4768H;
        if (hVar != null) {
            hVar.a();
        }
        this.f4778m.setVisibility(0);
        if (this.f4762B == 0 && (this.f4769I || z3)) {
            this.f4778m.setTranslationY(0.0f);
            float f4 = -this.f4778m.getHeight();
            if (z3) {
                this.f4778m.getLocationInWindow(new int[]{0, 0});
                f4 -= r5[1];
            }
            this.f4778m.setTranslationY(f4);
            androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
            C0850t0 B3 = C0823k0.g(this.f4778m).B(0.0f);
            B3.x(this.f4773M);
            hVar2.c(B3);
            if (this.f4763C && (view2 = this.f4781p) != null) {
                view2.setTranslationY(f4);
                hVar2.c(C0823k0.g(this.f4781p).B(0.0f));
            }
            hVar2.f(f4757P);
            hVar2.e(250L);
            hVar2.g(this.f4772L);
            this.f4768H = hVar2;
            hVar2.h();
        } else {
            this.f4778m.setAlpha(1.0f);
            this.f4778m.setTranslationY(0.0f);
            if (this.f4763C && (view = this.f4781p) != null) {
                view.setTranslationY(0.0f);
            }
            this.f4772L.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f4777l;
        if (actionBarOverlayLayout != null) {
            C0823k0.v1(actionBarOverlayLayout);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void N() {
        G0();
    }

    public boolean N0() {
        return this.f4779n.h();
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void O(AbstractC0583a.d dVar) {
        this.f4791z.remove(dVar);
    }

    public boolean O0() {
        return this.f4779n.j();
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void P(AbstractC0583a.f fVar) {
        Q(fVar.d());
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void Q(int i4) {
        int i5;
        e eVar;
        if (this.f4782q == null) {
            return;
        }
        e eVar2 = this.f4784s;
        if (eVar2 != null) {
            i5 = eVar2.d();
        } else {
            i5 = this.f4785t;
        }
        this.f4782q.l(i4);
        e remove = this.f4783r.remove(i4);
        if (remove != null) {
            remove.s(-1);
        }
        int size = this.f4783r.size();
        for (int i6 = i4; i6 < size; i6++) {
            this.f4783r.get(i6).s(i6);
        }
        if (i5 == i4) {
            if (this.f4783r.isEmpty()) {
                eVar = null;
            } else {
                eVar = this.f4783r.get(Math.max(0, i4 - 1));
            }
            S(eVar);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public boolean R() {
        ViewGroup I3 = this.f4779n.I();
        if (I3 != null && !I3.hasFocus()) {
            I3.requestFocus();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void S(AbstractC0583a.f fVar) {
        F f4;
        int i4 = -1;
        if (u() != 2) {
            if (fVar != null) {
                i4 = fVar.d();
            }
            this.f4785t = i4;
            return;
        }
        if ((this.f4776k instanceof ActivityC0889g) && !this.f4779n.I().isInEditMode()) {
            f4 = ((ActivityC0889g) this.f4776k).S().q().w();
        } else {
            f4 = null;
        }
        e eVar = this.f4784s;
        if (eVar == fVar) {
            if (eVar != null) {
                eVar.r().c(this.f4784s, f4);
                this.f4782q.c(fVar.d());
            }
        } else {
            Y y3 = this.f4782q;
            if (fVar != null) {
                i4 = fVar.d();
            }
            y3.setTabSelected(i4);
            e eVar2 = this.f4784s;
            if (eVar2 != null) {
                eVar2.r().b(this.f4784s, f4);
            }
            e eVar3 = (e) fVar;
            this.f4784s = eVar3;
            if (eVar3 != null) {
                eVar3.r().a(this.f4784s, f4);
            }
        }
        if (f4 != null && !f4.A()) {
            f4.q();
        }
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void T(Drawable drawable) {
        this.f4778m.setPrimaryBackground(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void U(int i4) {
        V(LayoutInflater.from(A()).inflate(i4, this.f4779n.I(), false));
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void V(View view) {
        this.f4779n.Q(view);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void W(View view, AbstractC0583a.b bVar) {
        view.setLayoutParams(bVar);
        this.f4779n.Q(view);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void X(boolean z3) {
        if (!this.f4786u) {
            Y(z3);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void Y(boolean z3) {
        int i4;
        if (z3) {
            i4 = 4;
        } else {
            i4 = 0;
        }
        a0(i4, 4);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void Z(int i4) {
        if ((i4 & 4) != 0) {
            this.f4786u = true;
        }
        this.f4779n.u(i4);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f4765E) {
            this.f4765E = false;
            U0(true);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void a0(int i4, int i5) {
        int N3 = this.f4779n.N();
        if ((i5 & 4) != 0) {
            this.f4786u = true;
        }
        this.f4779n.u((i4 & i5) | ((~i5) & N3));
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void b0(boolean z3) {
        int i4;
        if (z3) {
            i4 = 16;
        } else {
            i4 = 0;
        }
        a0(i4, 16);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z3) {
        this.f4763C = z3;
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void c0(boolean z3) {
        int i4;
        if (z3) {
            i4 = 2;
        } else {
            i4 = 0;
        }
        a0(i4, 2);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (!this.f4765E) {
            this.f4765E = true;
            U0(true);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void d0(boolean z3) {
        int i4;
        if (z3) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        a0(i4, 8);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        androidx.appcompat.view.h hVar = this.f4768H;
        if (hVar != null) {
            hVar.a();
            this.f4768H = null;
        }
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void e0(boolean z3) {
        a0(z3 ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void f(int i4) {
        this.f4762B = i4;
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void f0(float f4) {
        C0823k0.N1(this.f4778m, f4);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void g(AbstractC0583a.d dVar) {
        this.f4791z.add(dVar);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void g0(int i4) {
        if (i4 != 0 && !this.f4777l.B()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
        }
        this.f4777l.setActionBarHideOffset(i4);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void h(AbstractC0583a.f fVar) {
        k(fVar, this.f4783r.isEmpty());
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void h0(boolean z3) {
        if (z3 && !this.f4777l.B()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f4770J = z3;
        this.f4777l.setHideOnContentScrollEnabled(z3);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void i(AbstractC0583a.f fVar, int i4) {
        j(fVar, i4, this.f4783r.isEmpty());
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void i0(int i4) {
        this.f4779n.P(i4);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void j(AbstractC0583a.f fVar, int i4, boolean z3) {
        L0();
        this.f4782q.a(fVar, i4, z3);
        I0(fVar, i4);
        if (z3) {
            S(fVar);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void j0(CharSequence charSequence) {
        this.f4779n.v(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void k(AbstractC0583a.f fVar, boolean z3) {
        L0();
        this.f4782q.b(fVar, z3);
        I0(fVar, this.f4783r.size());
        if (z3) {
            S(fVar);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void k0(int i4) {
        this.f4779n.G(i4);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void l0(Drawable drawable) {
        this.f4779n.U(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public boolean m() {
        G g4 = this.f4779n;
        if (g4 != null && g4.s()) {
            this.f4779n.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void m0(boolean z3) {
        this.f4779n.J(z3);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void n(boolean z3) {
        if (z3 == this.f4790y) {
            return;
        }
        this.f4790y = z3;
        int size = this.f4791z.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f4791z.get(i4).a(z3);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void n0(int i4) {
        this.f4779n.setIcon(i4);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public View o() {
        return this.f4779n.p();
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void o0(Drawable drawable) {
        this.f4779n.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public int p() {
        return this.f4779n.N();
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void p0(SpinnerAdapter spinnerAdapter, AbstractC0583a.e eVar) {
        this.f4779n.K(spinnerAdapter, new z(eVar));
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public float q() {
        return C0823k0.R(this.f4778m);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void q0(int i4) {
        this.f4779n.setLogo(i4);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public int r() {
        return this.f4778m.getHeight();
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void r0(Drawable drawable) {
        this.f4779n.r(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public int s() {
        return this.f4777l.getActionBarHideOffset();
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void s0(int i4) {
        boolean z3;
        ActionBarOverlayLayout actionBarOverlayLayout;
        int C3 = this.f4779n.C();
        if (C3 == 2) {
            this.f4785t = v();
            S(null);
            this.f4782q.setVisibility(8);
        }
        if (C3 != i4 && !this.f4761A && (actionBarOverlayLayout = this.f4777l) != null) {
            C0823k0.v1(actionBarOverlayLayout);
        }
        this.f4779n.F(i4);
        boolean z4 = false;
        if (i4 == 2) {
            L0();
            this.f4782q.setVisibility(0);
            int i5 = this.f4785t;
            if (i5 != -1) {
                t0(i5);
                this.f4785t = -1;
            }
        }
        G g4 = this.f4779n;
        if (i4 == 2 && !this.f4761A) {
            z3 = true;
        } else {
            z3 = false;
        }
        g4.V(z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f4777l;
        if (i4 == 2 && !this.f4761A) {
            z4 = true;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z4);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public int t() {
        int C3 = this.f4779n.C();
        if (C3 != 1) {
            if (C3 != 2) {
                return 0;
            }
            return this.f4783r.size();
        }
        return this.f4779n.S();
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void t0(int i4) {
        int C3 = this.f4779n.C();
        if (C3 != 1) {
            if (C3 == 2) {
                S(this.f4783r.get(i4));
                return;
            }
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        }
        this.f4779n.z(i4);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public int u() {
        return this.f4779n.C();
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void u0(boolean z3) {
        androidx.appcompat.view.h hVar;
        this.f4769I = z3;
        if (!z3 && (hVar = this.f4768H) != null) {
            hVar.a();
        }
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public int v() {
        e eVar;
        int C3 = this.f4779n.C();
        if (C3 != 1) {
            if (C3 != 2 || (eVar = this.f4784s) == null) {
                return -1;
            }
            return eVar.d();
        }
        return this.f4779n.O();
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void v0(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public AbstractC0583a.f w() {
        return this.f4784s;
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void w0(Drawable drawable) {
        this.f4778m.setStackedBackground(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public CharSequence x() {
        return this.f4779n.M();
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void x0(int i4) {
        y0(this.f4774i.getString(i4));
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public AbstractC0583a.f y(int i4) {
        return this.f4783r.get(i4);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void y0(CharSequence charSequence) {
        this.f4779n.w(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public int z() {
        return this.f4783r.size();
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void z0(int i4) {
        A0(this.f4774i.getString(i4));
    }

    public E(Dialog dialog) {
        Q0(dialog.getWindow().getDecorView());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public E(View view) {
        Q0(view);
    }
}
