package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.T;
import androidx.core.view.C0823k0;
import d.C2042a;

/* loaded from: classes.dex */
final class r extends l implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, n, View.OnKeyListener {

    /* renamed from: Z, reason: collision with root package name */
    private static final int f5433Z = C2042a.j.f49704t;

    /* renamed from: F, reason: collision with root package name */
    private final Context f5434F;

    /* renamed from: G, reason: collision with root package name */
    private final g f5435G;

    /* renamed from: H, reason: collision with root package name */
    private final f f5436H;

    /* renamed from: I, reason: collision with root package name */
    private final boolean f5437I;

    /* renamed from: J, reason: collision with root package name */
    private final int f5438J;

    /* renamed from: K, reason: collision with root package name */
    private final int f5439K;

    /* renamed from: L, reason: collision with root package name */
    private final int f5440L;

    /* renamed from: M, reason: collision with root package name */
    final T f5441M;

    /* renamed from: P, reason: collision with root package name */
    private PopupWindow.OnDismissListener f5444P;

    /* renamed from: Q, reason: collision with root package name */
    private View f5445Q;

    /* renamed from: R, reason: collision with root package name */
    View f5446R;

    /* renamed from: S, reason: collision with root package name */
    private n.a f5447S;

    /* renamed from: T, reason: collision with root package name */
    ViewTreeObserver f5448T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f5449U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f5450V;

    /* renamed from: W, reason: collision with root package name */
    private int f5451W;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f5453Y;

    /* renamed from: N, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f5442N = new a();

    /* renamed from: O, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f5443O = new b();

    /* renamed from: X, reason: collision with root package name */
    private int f5452X = 0;

    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (r.this.c() && !r.this.f5441M.L()) {
                View view = r.this.f5446R;
                if (view != null && view.isShown()) {
                    r.this.f5441M.a();
                } else {
                    r.this.dismiss();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = r.this.f5448T;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    r.this.f5448T = view.getViewTreeObserver();
                }
                r rVar = r.this;
                rVar.f5448T.removeGlobalOnLayoutListener(rVar.f5442N);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public r(Context context, g gVar, View view, int i4, int i5, boolean z3) {
        this.f5434F = context;
        this.f5435G = gVar;
        this.f5437I = z3;
        this.f5436H = new f(gVar, LayoutInflater.from(context), z3, f5433Z);
        this.f5439K = i4;
        this.f5440L = i5;
        Resources resources = context.getResources();
        this.f5438J = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C2042a.e.f49495x));
        this.f5445Q = view;
        this.f5441M = new T(context, null, i4, i5);
        gVar.c(this, context);
    }

    private boolean C() {
        View view;
        boolean z3;
        if (c()) {
            return true;
        }
        if (this.f5449U || (view = this.f5445Q) == null) {
            return false;
        }
        this.f5446R = view;
        this.f5441M.e0(this);
        this.f5441M.f0(this);
        this.f5441M.d0(true);
        View view2 = this.f5446R;
        if (this.f5448T == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f5448T = viewTreeObserver;
        if (z3) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f5442N);
        }
        view2.addOnAttachStateChangeListener(this.f5443O);
        this.f5441M.S(view2);
        this.f5441M.W(this.f5452X);
        if (!this.f5450V) {
            this.f5451W = l.r(this.f5436H, null, this.f5434F, this.f5438J);
            this.f5450V = true;
        }
        this.f5441M.U(this.f5451W);
        this.f5441M.a0(2);
        this.f5441M.X(q());
        this.f5441M.a();
        ListView k4 = this.f5441M.k();
        k4.setOnKeyListener(this);
        if (this.f5453Y && this.f5435G.A() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f5434F).inflate(C2042a.j.f49703s, (ViewGroup) k4, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f5435G.A());
            }
            frameLayout.setEnabled(false);
            k4.addHeaderView(frameLayout, null, false);
        }
        this.f5441M.q(this.f5436H);
        this.f5441M.a();
        return true;
    }

    @Override // androidx.appcompat.view.menu.q
    public void a() {
        if (C()) {
        } else {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void b(g gVar, boolean z3) {
        if (gVar != this.f5435G) {
            return;
        }
        dismiss();
        n.a aVar = this.f5447S;
        if (aVar != null) {
            aVar.b(gVar, z3);
        }
    }

    @Override // androidx.appcompat.view.menu.q
    public boolean c() {
        if (!this.f5449U && this.f5441M.c()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public void d(boolean z3) {
        this.f5450V = false;
        f fVar = this.f5436H;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.q
    public void dismiss() {
        if (c()) {
            this.f5441M.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public void h(n.a aVar) {
        this.f5447S = aVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void j(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.q
    public ListView k() {
        return this.f5441M.k();
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean l(s sVar) {
        if (sVar.hasVisibleItems()) {
            m mVar = new m(this.f5434F, sVar, this.f5446R, this.f5437I, this.f5439K, this.f5440L);
            mVar.a(this.f5447S);
            mVar.i(l.A(sVar));
            mVar.k(this.f5444P);
            this.f5444P = null;
            this.f5435G.f(false);
            int d4 = this.f5441M.d();
            int o4 = this.f5441M.o();
            if ((Gravity.getAbsoluteGravity(this.f5452X, C0823k0.Z(this.f5445Q)) & 7) == 5) {
                d4 += this.f5445Q.getWidth();
            }
            if (mVar.p(d4, o4)) {
                n.a aVar = this.f5447S;
                if (aVar != null) {
                    aVar.c(sVar);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public Parcelable n() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.l
    public void o(g gVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f5449U = true;
        this.f5435G.close();
        ViewTreeObserver viewTreeObserver = this.f5448T;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f5448T = this.f5446R.getViewTreeObserver();
            }
            this.f5448T.removeGlobalOnLayoutListener(this.f5442N);
            this.f5448T = null;
        }
        this.f5446R.removeOnAttachStateChangeListener(this.f5443O);
        PopupWindow.OnDismissListener onDismissListener = this.f5444P;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i4, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i4 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.l
    public void s(View view) {
        this.f5445Q = view;
    }

    @Override // androidx.appcompat.view.menu.l
    public void u(boolean z3) {
        this.f5436H.e(z3);
    }

    @Override // androidx.appcompat.view.menu.l
    public void v(int i4) {
        this.f5452X = i4;
    }

    @Override // androidx.appcompat.view.menu.l
    public void w(int i4) {
        this.f5441M.f(i4);
    }

    @Override // androidx.appcompat.view.menu.l
    public void x(PopupWindow.OnDismissListener onDismissListener) {
        this.f5444P = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.l
    public void y(boolean z3) {
        this.f5453Y = z3;
    }

    @Override // androidx.appcompat.view.menu.l
    public void z(int i4) {
        this.f5441M.l(i4);
    }
}
