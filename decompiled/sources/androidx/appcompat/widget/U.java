package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.g;
import d.C2042a;

/* loaded from: classes.dex */
public class U {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5982a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.appcompat.view.menu.g f5983b;

    /* renamed from: c, reason: collision with root package name */
    private final View f5984c;

    /* renamed from: d, reason: collision with root package name */
    final androidx.appcompat.view.menu.m f5985d;

    /* renamed from: e, reason: collision with root package name */
    e f5986e;

    /* renamed from: f, reason: collision with root package name */
    d f5987f;

    /* renamed from: g, reason: collision with root package name */
    private View.OnTouchListener f5988g;

    /* loaded from: classes.dex */
    class a implements g.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(@androidx.annotation.N androidx.appcompat.view.menu.g gVar, @androidx.annotation.N MenuItem menuItem) {
            e eVar = U.this.f5986e;
            if (eVar != null) {
                return eVar.onMenuItemClick(menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(@androidx.annotation.N androidx.appcompat.view.menu.g gVar) {
        }
    }

    /* loaded from: classes.dex */
    class b implements PopupWindow.OnDismissListener {
        b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            U u3 = U.this;
            d dVar = u3.f5987f;
            if (dVar != null) {
                dVar.a(u3);
            }
        }
    }

    /* loaded from: classes.dex */
    class c extends P {
        c(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.P
        public androidx.appcompat.view.menu.q b() {
            return U.this.f5985d.e();
        }

        @Override // androidx.appcompat.widget.P
        protected boolean c() {
            U.this.l();
            return true;
        }

        @Override // androidx.appcompat.widget.P
        protected boolean d() {
            U.this.a();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(U u3);
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public U(@androidx.annotation.N Context context, @androidx.annotation.N View view) {
        this(context, view, 0);
    }

    public void a() {
        this.f5985d.dismiss();
    }

    @androidx.annotation.N
    public View.OnTouchListener b() {
        if (this.f5988g == null) {
            this.f5988g = new c(this.f5984c);
        }
        return this.f5988g;
    }

    public int c() {
        return this.f5985d.c();
    }

    @androidx.annotation.N
    public Menu d() {
        return this.f5983b;
    }

    @androidx.annotation.N
    public MenuInflater e() {
        return new androidx.appcompat.view.g(this.f5982a);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    ListView f() {
        if (!this.f5985d.f()) {
            return null;
        }
        return this.f5985d.d();
    }

    public void g(@androidx.annotation.L int i4) {
        e().inflate(i4, this.f5983b);
    }

    public void h(boolean z3) {
        this.f5985d.i(z3);
    }

    public void i(int i4) {
        this.f5985d.j(i4);
    }

    public void j(@androidx.annotation.P d dVar) {
        this.f5987f = dVar;
    }

    public void k(@androidx.annotation.P e eVar) {
        this.f5986e = eVar;
    }

    public void l() {
        this.f5985d.l();
    }

    public U(@androidx.annotation.N Context context, @androidx.annotation.N View view, int i4) {
        this(context, view, i4, C2042a.b.f49317z2, 0);
    }

    public U(@androidx.annotation.N Context context, @androidx.annotation.N View view, int i4, @InterfaceC0563f int i5, @androidx.annotation.d0 int i6) {
        this.f5982a = context;
        this.f5984c = view;
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        this.f5983b = gVar;
        gVar.X(new a());
        androidx.appcompat.view.menu.m mVar = new androidx.appcompat.view.menu.m(context, gVar, view, false, i5, i6);
        this.f5985d = mVar;
        mVar.j(i4);
        mVar.k(new b());
    }
}
