package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.SpinnerAdapter;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.appcompat.app.AbstractC0583a;
import androidx.appcompat.app.j;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.G;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.j0;
import androidx.core.view.C0823k0;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class B extends AbstractC0583a {

    /* renamed from: i, reason: collision with root package name */
    final G f4717i;

    /* renamed from: j, reason: collision with root package name */
    final Window.Callback f4718j;

    /* renamed from: k, reason: collision with root package name */
    final j.i f4719k;

    /* renamed from: l, reason: collision with root package name */
    boolean f4720l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f4721m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f4722n;

    /* renamed from: o, reason: collision with root package name */
    private ArrayList<AbstractC0583a.d> f4723o = new ArrayList<>();

    /* renamed from: p, reason: collision with root package name */
    private final Runnable f4724p = new a();

    /* renamed from: q, reason: collision with root package name */
    private final Toolbar.h f4725q;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            B.this.F0();
        }
    }

    /* loaded from: classes.dex */
    class b implements Toolbar.h {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public boolean onMenuItemClick(MenuItem menuItem) {
            return B.this.f4718j.onMenuItemSelected(0, menuItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c implements n.a {

        /* renamed from: E, reason: collision with root package name */
        private boolean f4728E;

        c() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void b(@N androidx.appcompat.view.menu.g gVar, boolean z3) {
            if (this.f4728E) {
                return;
            }
            this.f4728E = true;
            B.this.f4717i.o();
            B.this.f4718j.onPanelClosed(108, gVar);
            this.f4728E = false;
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean c(@N androidx.appcompat.view.menu.g gVar) {
            B.this.f4718j.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class d implements g.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(@N androidx.appcompat.view.menu.g gVar, @N MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(@N androidx.appcompat.view.menu.g gVar) {
            if (B.this.f4717i.f()) {
                B.this.f4718j.onPanelClosed(108, gVar);
            } else if (B.this.f4718j.onPreparePanel(0, null, gVar)) {
                B.this.f4718j.onMenuOpened(108, gVar);
            }
        }
    }

    /* loaded from: classes.dex */
    private class e implements j.i {
        e() {
        }

        @Override // androidx.appcompat.app.j.i
        public boolean a(int i4) {
            if (i4 == 0) {
                B b4 = B.this;
                if (!b4.f4720l) {
                    b4.f4717i.g();
                    B.this.f4720l = true;
                    return false;
                }
                return false;
            }
            return false;
        }

        @Override // androidx.appcompat.app.j.i
        public View onCreatePanelView(int i4) {
            if (i4 == 0) {
                return new View(B.this.f4717i.e());
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(@N Toolbar toolbar, @P CharSequence charSequence, @N Window.Callback callback) {
        b bVar = new b();
        this.f4725q = bVar;
        androidx.core.util.u.l(toolbar);
        j0 j0Var = new j0(toolbar, false);
        this.f4717i = j0Var;
        this.f4718j = (Window.Callback) androidx.core.util.u.l(callback);
        j0Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        j0Var.setWindowTitle(charSequence);
        this.f4719k = new e();
    }

    private Menu E0() {
        if (!this.f4721m) {
            this.f4717i.H(new c(), new d());
            this.f4721m = true;
        }
        return this.f4717i.A();
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public Context A() {
        return this.f4717i.e();
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void A0(CharSequence charSequence) {
        this.f4717i.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public CharSequence B() {
        return this.f4717i.getTitle();
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void B0(CharSequence charSequence) {
        this.f4717i.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void C() {
        this.f4717i.setVisibility(8);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void C0() {
        this.f4717i.setVisibility(0);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public boolean D() {
        this.f4717i.I().removeCallbacks(this.f4724p);
        C0823k0.p1(this.f4717i.I(), this.f4724p);
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public boolean F() {
        if (this.f4717i.c() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void F0() {
        /*
            r5 = this;
            android.view.Menu r0 = r5.E0()
            boolean r1 = r0 instanceof androidx.appcompat.view.menu.g
            r2 = 0
            if (r1 == 0) goto Ld
            r1 = r0
            androidx.appcompat.view.menu.g r1 = (androidx.appcompat.view.menu.g) r1
            goto Le
        Ld:
            r1 = r2
        Le:
            if (r1 == 0) goto L13
            r1.m0()
        L13:
            r0.clear()     // Catch: java.lang.Throwable -> L28
            android.view.Window$Callback r3 = r5.f4718j     // Catch: java.lang.Throwable -> L28
            r4 = 0
            boolean r3 = r3.onCreatePanelMenu(r4, r0)     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L2a
            android.view.Window$Callback r3 = r5.f4718j     // Catch: java.lang.Throwable -> L28
            boolean r2 = r3.onPreparePanel(r4, r2, r0)     // Catch: java.lang.Throwable -> L28
            if (r2 != 0) goto L2d
            goto L2a
        L28:
            r0 = move-exception
            goto L33
        L2a:
            r0.clear()     // Catch: java.lang.Throwable -> L28
        L2d:
            if (r1 == 0) goto L32
            r1.l0()
        L32:
            return
        L33:
            if (r1 == 0) goto L38
            r1.l0()
        L38:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.B.F0():void");
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public boolean G() {
        return super.G();
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public AbstractC0583a.f H() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void I(Configuration configuration) {
        super.I(configuration);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.app.AbstractC0583a
    public void J() {
        this.f4717i.I().removeCallbacks(this.f4724p);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public boolean K(int i4, KeyEvent keyEvent) {
        int i5;
        Menu E02 = E0();
        if (E02 == null) {
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
        E02.setQwertyMode(z3);
        return E02.performShortcut(i4, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public boolean L(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            M();
        }
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public boolean M() {
        return this.f4717i.m();
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void N() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void O(AbstractC0583a.d dVar) {
        this.f4723o.remove(dVar);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void P(AbstractC0583a.f fVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void Q(int i4) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public boolean R() {
        ViewGroup I3 = this.f4717i.I();
        if (I3 != null && !I3.hasFocus()) {
            I3.requestFocus();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void S(AbstractC0583a.f fVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void T(@P Drawable drawable) {
        this.f4717i.b(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void U(int i4) {
        V(LayoutInflater.from(this.f4717i.e()).inflate(i4, this.f4717i.I(), false));
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void V(View view) {
        W(view, new AbstractC0583a.b(-2, -2));
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void W(View view, AbstractC0583a.b bVar) {
        if (view != null) {
            view.setLayoutParams(bVar);
        }
        this.f4717i.Q(view);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void X(boolean z3) {
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
    @SuppressLint({"WrongConstant"})
    public void Z(int i4) {
        a0(i4, -1);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void a0(int i4, int i5) {
        this.f4717i.u((i4 & i5) | ((~i5) & this.f4717i.N()));
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

    @Override // androidx.appcompat.app.AbstractC0583a
    public void e0(boolean z3) {
        a0(z3 ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void f0(float f4) {
        C0823k0.N1(this.f4717i.I(), f4);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void g(AbstractC0583a.d dVar) {
        this.f4723o.add(dVar);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void h(AbstractC0583a.f fVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void i(AbstractC0583a.f fVar, int i4) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void i0(int i4) {
        this.f4717i.P(i4);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void j(AbstractC0583a.f fVar, int i4, boolean z3) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void j0(CharSequence charSequence) {
        this.f4717i.v(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void k(AbstractC0583a.f fVar, boolean z3) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void k0(int i4) {
        this.f4717i.G(i4);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public boolean l() {
        return this.f4717i.l();
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void l0(Drawable drawable) {
        this.f4717i.U(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public boolean m() {
        if (this.f4717i.s()) {
            this.f4717i.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void m0(boolean z3) {
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void n(boolean z3) {
        if (z3 == this.f4722n) {
            return;
        }
        this.f4722n = z3;
        int size = this.f4723o.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f4723o.get(i4).a(z3);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void n0(int i4) {
        this.f4717i.setIcon(i4);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public View o() {
        return this.f4717i.p();
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void o0(Drawable drawable) {
        this.f4717i.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public int p() {
        return this.f4717i.N();
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void p0(SpinnerAdapter spinnerAdapter, AbstractC0583a.e eVar) {
        this.f4717i.K(spinnerAdapter, new z(eVar));
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public float q() {
        return C0823k0.R(this.f4717i.I());
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void q0(int i4) {
        this.f4717i.setLogo(i4);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public int r() {
        return this.f4717i.a();
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void r0(Drawable drawable) {
        this.f4717i.r(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void s0(int i4) {
        if (i4 != 2) {
            this.f4717i.F(i4);
            return;
        }
        throw new IllegalArgumentException("Tabs not supported in this configuration");
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public int t() {
        return 0;
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void t0(int i4) {
        if (this.f4717i.C() == 1) {
            this.f4717i.z(i4);
            return;
        }
        throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public int u() {
        return 0;
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void u0(boolean z3) {
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public int v() {
        return -1;
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void v0(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public AbstractC0583a.f w() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void w0(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public CharSequence x() {
        return this.f4717i.M();
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void x0(int i4) {
        CharSequence charSequence;
        G g4 = this.f4717i;
        if (i4 != 0) {
            charSequence = g4.e().getText(i4);
        } else {
            charSequence = null;
        }
        g4.w(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public AbstractC0583a.f y(int i4) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void y0(CharSequence charSequence) {
        this.f4717i.w(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public int z() {
        return 0;
    }

    @Override // androidx.appcompat.app.AbstractC0583a
    public void z0(int i4) {
        CharSequence charSequence;
        G g4 = this.f4717i;
        if (i4 != 0) {
            charSequence = g4.e().getText(i4);
        } else {
            charSequence = null;
        }
        g4.setTitle(charSequence);
    }
}
