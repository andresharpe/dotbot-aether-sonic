package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.d0;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.S;
import androidx.appcompat.widget.T;
import androidx.core.view.C;
import androidx.core.view.C0823k0;
import d.C2042a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class d extends l implements n, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: f0, reason: collision with root package name */
    private static final int f5269f0 = C2042a.j.f49696l;

    /* renamed from: g0, reason: collision with root package name */
    static final int f5270g0 = 0;

    /* renamed from: h0, reason: collision with root package name */
    static final int f5271h0 = 1;

    /* renamed from: i0, reason: collision with root package name */
    static final int f5272i0 = 200;

    /* renamed from: F, reason: collision with root package name */
    private final Context f5273F;

    /* renamed from: G, reason: collision with root package name */
    private final int f5274G;

    /* renamed from: H, reason: collision with root package name */
    private final int f5275H;

    /* renamed from: I, reason: collision with root package name */
    private final int f5276I;

    /* renamed from: J, reason: collision with root package name */
    private final boolean f5277J;

    /* renamed from: K, reason: collision with root package name */
    final Handler f5278K;

    /* renamed from: S, reason: collision with root package name */
    private View f5286S;

    /* renamed from: T, reason: collision with root package name */
    View f5287T;

    /* renamed from: V, reason: collision with root package name */
    private boolean f5289V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f5290W;

    /* renamed from: X, reason: collision with root package name */
    private int f5291X;

    /* renamed from: Y, reason: collision with root package name */
    private int f5292Y;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f5294a0;

    /* renamed from: b0, reason: collision with root package name */
    private n.a f5295b0;

    /* renamed from: c0, reason: collision with root package name */
    ViewTreeObserver f5296c0;

    /* renamed from: d0, reason: collision with root package name */
    private PopupWindow.OnDismissListener f5297d0;

    /* renamed from: e0, reason: collision with root package name */
    boolean f5298e0;

    /* renamed from: L, reason: collision with root package name */
    private final List<g> f5279L = new ArrayList();

    /* renamed from: M, reason: collision with root package name */
    final List<C0047d> f5280M = new ArrayList();

    /* renamed from: N, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f5281N = new a();

    /* renamed from: O, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f5282O = new b();

    /* renamed from: P, reason: collision with root package name */
    private final S f5283P = new c();

    /* renamed from: Q, reason: collision with root package name */
    private int f5284Q = 0;

    /* renamed from: R, reason: collision with root package name */
    private int f5285R = 0;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f5293Z = false;

    /* renamed from: U, reason: collision with root package name */
    private int f5288U = G();

    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (d.this.c() && d.this.f5280M.size() > 0 && !d.this.f5280M.get(0).f5306a.L()) {
                View view = d.this.f5287T;
                if (view != null && view.isShown()) {
                    Iterator<C0047d> it = d.this.f5280M.iterator();
                    while (it.hasNext()) {
                        it.next().f5306a.a();
                    }
                    return;
                }
                d.this.dismiss();
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
            ViewTreeObserver viewTreeObserver = d.this.f5296c0;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.f5296c0 = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.f5296c0.removeGlobalOnLayoutListener(dVar.f5281N);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* loaded from: classes.dex */
    class c implements S {

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ C0047d f5302E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ MenuItem f5303F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ g f5304G;

            a(C0047d c0047d, MenuItem menuItem, g gVar) {
                this.f5302E = c0047d;
                this.f5303F = menuItem;
                this.f5304G = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0047d c0047d = this.f5302E;
                if (c0047d != null) {
                    d.this.f5298e0 = true;
                    c0047d.f5307b.f(false);
                    d.this.f5298e0 = false;
                }
                if (this.f5303F.isEnabled() && this.f5303F.hasSubMenu()) {
                    this.f5304G.O(this.f5303F, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.S
        public void e(@N g gVar, @N MenuItem menuItem) {
            C0047d c0047d = null;
            d.this.f5278K.removeCallbacksAndMessages(null);
            int size = d.this.f5280M.size();
            int i4 = 0;
            while (true) {
                if (i4 < size) {
                    if (gVar == d.this.f5280M.get(i4).f5307b) {
                        break;
                    } else {
                        i4++;
                    }
                } else {
                    i4 = -1;
                    break;
                }
            }
            if (i4 == -1) {
                return;
            }
            int i5 = i4 + 1;
            if (i5 < d.this.f5280M.size()) {
                c0047d = d.this.f5280M.get(i5);
            }
            d.this.f5278K.postAtTime(new a(c0047d, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.S
        public void h(@N g gVar, @N MenuItem menuItem) {
            d.this.f5278K.removeCallbacksAndMessages(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.view.menu.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0047d {

        /* renamed from: a, reason: collision with root package name */
        public final T f5306a;

        /* renamed from: b, reason: collision with root package name */
        public final g f5307b;

        /* renamed from: c, reason: collision with root package name */
        public final int f5308c;

        public C0047d(@N T t3, @N g gVar, int i4) {
            this.f5306a = t3;
            this.f5307b = gVar;
            this.f5308c = i4;
        }

        public ListView a() {
            return this.f5306a.k();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface e {
    }

    public d(@N Context context, @N View view, @InterfaceC0563f int i4, @d0 int i5, boolean z3) {
        this.f5273F = context;
        this.f5286S = view;
        this.f5275H = i4;
        this.f5276I = i5;
        this.f5277J = z3;
        Resources resources = context.getResources();
        this.f5274G = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C2042a.e.f49495x));
        this.f5278K = new Handler();
    }

    private T C() {
        T t3 = new T(this.f5273F, null, this.f5275H, this.f5276I);
        t3.r0(this.f5283P);
        t3.f0(this);
        t3.e0(this);
        t3.S(this.f5286S);
        t3.W(this.f5285R);
        t3.d0(true);
        t3.a0(2);
        return t3;
    }

    private int D(@N g gVar) {
        int size = this.f5280M.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (gVar == this.f5280M.get(i4).f5307b) {
                return i4;
            }
        }
        return -1;
    }

    private MenuItem E(@N g gVar, @N g gVar2) {
        int size = gVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = gVar.getItem(i4);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    @P
    private View F(@N C0047d c0047d, @N g gVar) {
        f fVar;
        int i4;
        int firstVisiblePosition;
        MenuItem E3 = E(c0047d.f5307b, gVar);
        if (E3 == null) {
            return null;
        }
        ListView a4 = c0047d.a();
        ListAdapter adapter = a4.getAdapter();
        int i5 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i4 = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            i4 = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i5 < count) {
                if (E3 == fVar.getItem(i5)) {
                    break;
                }
                i5++;
            } else {
                i5 = -1;
                break;
            }
        }
        if (i5 == -1 || (firstVisiblePosition = (i5 + i4) - a4.getFirstVisiblePosition()) < 0 || firstVisiblePosition >= a4.getChildCount()) {
            return null;
        }
        return a4.getChildAt(firstVisiblePosition);
    }

    private int G() {
        if (C0823k0.Z(this.f5286S) != 1) {
            return 1;
        }
        return 0;
    }

    private int H(int i4) {
        List<C0047d> list = this.f5280M;
        ListView a4 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a4.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f5287T.getWindowVisibleDisplayFrame(rect);
        if (this.f5288U == 1) {
            if (iArr[0] + a4.getWidth() + i4 <= rect.right) {
                return 1;
            }
            return 0;
        }
        if (iArr[0] - i4 < 0) {
            return 1;
        }
        return 0;
    }

    private void I(@N g gVar) {
        C0047d c0047d;
        View view;
        boolean z3;
        int i4;
        int i5;
        int i6;
        LayoutInflater from = LayoutInflater.from(this.f5273F);
        f fVar = new f(gVar, from, this.f5277J, f5269f0);
        if (!c() && this.f5293Z) {
            fVar.e(true);
        } else if (c()) {
            fVar.e(l.A(gVar));
        }
        int r4 = l.r(fVar, null, this.f5273F, this.f5274G);
        T C3 = C();
        C3.q(fVar);
        C3.U(r4);
        C3.W(this.f5285R);
        if (this.f5280M.size() > 0) {
            List<C0047d> list = this.f5280M;
            c0047d = list.get(list.size() - 1);
            view = F(c0047d, gVar);
        } else {
            c0047d = null;
            view = null;
        }
        if (view != null) {
            C3.s0(false);
            C3.p0(null);
            int H3 = H(r4);
            if (H3 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f5288U = H3;
            if (Build.VERSION.SDK_INT >= 26) {
                C3.S(view);
                i5 = 0;
                i4 = 0;
            } else {
                int[] iArr = new int[2];
                this.f5286S.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f5285R & 7) == 5) {
                    iArr[0] = iArr[0] + this.f5286S.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i4 = iArr2[0] - iArr[0];
                i5 = iArr2[1] - iArr[1];
            }
            if ((this.f5285R & 5) == 5) {
                if (!z3) {
                    r4 = view.getWidth();
                    i6 = i4 - r4;
                }
                i6 = i4 + r4;
            } else {
                if (z3) {
                    r4 = view.getWidth();
                    i6 = i4 + r4;
                }
                i6 = i4 - r4;
            }
            C3.f(i6);
            C3.h0(true);
            C3.l(i5);
        } else {
            if (this.f5289V) {
                C3.f(this.f5291X);
            }
            if (this.f5290W) {
                C3.l(this.f5292Y);
            }
            C3.X(q());
        }
        this.f5280M.add(new C0047d(C3, gVar, this.f5288U));
        C3.a();
        ListView k4 = C3.k();
        k4.setOnKeyListener(this);
        if (c0047d == null && this.f5294a0 && gVar.A() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C2042a.j.f49703s, (ViewGroup) k4, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(gVar.A());
            k4.addHeaderView(frameLayout, null, false);
            C3.a();
        }
    }

    @Override // androidx.appcompat.view.menu.q
    public void a() {
        boolean z3;
        if (c()) {
            return;
        }
        Iterator<g> it = this.f5279L.iterator();
        while (it.hasNext()) {
            I(it.next());
        }
        this.f5279L.clear();
        View view = this.f5286S;
        this.f5287T = view;
        if (view != null) {
            if (this.f5296c0 == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f5296c0 = viewTreeObserver;
            if (z3) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f5281N);
            }
            this.f5287T.addOnAttachStateChangeListener(this.f5282O);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void b(g gVar, boolean z3) {
        int D3 = D(gVar);
        if (D3 < 0) {
            return;
        }
        int i4 = D3 + 1;
        if (i4 < this.f5280M.size()) {
            this.f5280M.get(i4).f5307b.f(false);
        }
        C0047d remove = this.f5280M.remove(D3);
        remove.f5307b.S(this);
        if (this.f5298e0) {
            remove.f5306a.q0(null);
            remove.f5306a.T(0);
        }
        remove.f5306a.dismiss();
        int size = this.f5280M.size();
        if (size > 0) {
            this.f5288U = this.f5280M.get(size - 1).f5308c;
        } else {
            this.f5288U = G();
        }
        if (size == 0) {
            dismiss();
            n.a aVar = this.f5295b0;
            if (aVar != null) {
                aVar.b(gVar, true);
            }
            ViewTreeObserver viewTreeObserver = this.f5296c0;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.f5296c0.removeGlobalOnLayoutListener(this.f5281N);
                }
                this.f5296c0 = null;
            }
            this.f5287T.removeOnAttachStateChangeListener(this.f5282O);
            this.f5297d0.onDismiss();
            return;
        }
        if (z3) {
            this.f5280M.get(0).f5307b.f(false);
        }
    }

    @Override // androidx.appcompat.view.menu.q
    public boolean c() {
        if (this.f5280M.size() <= 0 || !this.f5280M.get(0).f5306a.c()) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.n
    public void d(boolean z3) {
        Iterator<C0047d> it = this.f5280M.iterator();
        while (it.hasNext()) {
            l.B(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.q
    public void dismiss() {
        int size = this.f5280M.size();
        if (size > 0) {
            C0047d[] c0047dArr = (C0047d[]) this.f5280M.toArray(new C0047d[size]);
            for (int i4 = size - 1; i4 >= 0; i4--) {
                C0047d c0047d = c0047dArr[i4];
                if (c0047d.f5306a.c()) {
                    c0047d.f5306a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public void h(n.a aVar) {
        this.f5295b0 = aVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void j(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.q
    public ListView k() {
        if (this.f5280M.isEmpty()) {
            return null;
        }
        return this.f5280M.get(r0.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean l(s sVar) {
        for (C0047d c0047d : this.f5280M) {
            if (sVar == c0047d.f5307b) {
                c0047d.a().requestFocus();
                return true;
            }
        }
        if (sVar.hasVisibleItems()) {
            o(sVar);
            n.a aVar = this.f5295b0;
            if (aVar != null) {
                aVar.c(sVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public Parcelable n() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.l
    public void o(g gVar) {
        gVar.c(this, this.f5273F);
        if (c()) {
            I(gVar);
        } else {
            this.f5279L.add(gVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0047d c0047d;
        int size = this.f5280M.size();
        int i4 = 0;
        while (true) {
            if (i4 < size) {
                c0047d = this.f5280M.get(i4);
                if (!c0047d.f5306a.c()) {
                    break;
                } else {
                    i4++;
                }
            } else {
                c0047d = null;
                break;
            }
        }
        if (c0047d != null) {
            c0047d.f5307b.f(false);
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
    protected boolean p() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.l
    public void s(@N View view) {
        if (this.f5286S != view) {
            this.f5286S = view;
            this.f5285R = C.d(this.f5284Q, C0823k0.Z(view));
        }
    }

    @Override // androidx.appcompat.view.menu.l
    public void u(boolean z3) {
        this.f5293Z = z3;
    }

    @Override // androidx.appcompat.view.menu.l
    public void v(int i4) {
        if (this.f5284Q != i4) {
            this.f5284Q = i4;
            this.f5285R = C.d(i4, C0823k0.Z(this.f5286S));
        }
    }

    @Override // androidx.appcompat.view.menu.l
    public void w(int i4) {
        this.f5289V = true;
        this.f5291X = i4;
    }

    @Override // androidx.appcompat.view.menu.l
    public void x(PopupWindow.OnDismissListener onDismissListener) {
        this.f5297d0 = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.l
    public void y(boolean z3) {
        this.f5294a0 = z3;
    }

    @Override // androidx.appcompat.view.menu.l
    public void z(int i4) {
        this.f5290W = true;
        this.f5292Y = i4;
    }
}
