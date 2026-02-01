package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.s;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class e extends b implements g.a {

    /* renamed from: G, reason: collision with root package name */
    private Context f5119G;

    /* renamed from: H, reason: collision with root package name */
    private ActionBarContextView f5120H;

    /* renamed from: I, reason: collision with root package name */
    private b.a f5121I;

    /* renamed from: J, reason: collision with root package name */
    private WeakReference<View> f5122J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f5123K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f5124L;

    /* renamed from: M, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f5125M;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z3) {
        this.f5119G = context;
        this.f5120H = actionBarContextView;
        this.f5121I = aVar;
        androidx.appcompat.view.menu.g Z3 = new androidx.appcompat.view.menu.g(actionBarContextView.getContext()).Z(1);
        this.f5125M = Z3;
        Z3.X(this);
        this.f5124L = z3;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(@N androidx.appcompat.view.menu.g gVar, @N MenuItem menuItem) {
        return this.f5121I.d(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(@N androidx.appcompat.view.menu.g gVar) {
        k();
        this.f5120H.o();
    }

    @Override // androidx.appcompat.view.b
    public void c() {
        if (this.f5123K) {
            return;
        }
        this.f5123K = true;
        this.f5121I.a(this);
    }

    @Override // androidx.appcompat.view.b
    public View d() {
        WeakReference<View> weakReference = this.f5122J;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.b
    public Menu e() {
        return this.f5125M;
    }

    @Override // androidx.appcompat.view.b
    public MenuInflater f() {
        return new g(this.f5120H.getContext());
    }

    @Override // androidx.appcompat.view.b
    public CharSequence g() {
        return this.f5120H.getSubtitle();
    }

    @Override // androidx.appcompat.view.b
    public CharSequence i() {
        return this.f5120H.getTitle();
    }

    @Override // androidx.appcompat.view.b
    public void k() {
        this.f5121I.c(this, this.f5125M);
    }

    @Override // androidx.appcompat.view.b
    public boolean l() {
        return this.f5120H.s();
    }

    @Override // androidx.appcompat.view.b
    public boolean m() {
        return this.f5124L;
    }

    @Override // androidx.appcompat.view.b
    public void n(View view) {
        WeakReference<View> weakReference;
        this.f5120H.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference<>(view);
        } else {
            weakReference = null;
        }
        this.f5122J = weakReference;
    }

    @Override // androidx.appcompat.view.b
    public void o(int i4) {
        p(this.f5119G.getString(i4));
    }

    @Override // androidx.appcompat.view.b
    public void p(CharSequence charSequence) {
        this.f5120H.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void r(int i4) {
        s(this.f5119G.getString(i4));
    }

    @Override // androidx.appcompat.view.b
    public void s(CharSequence charSequence) {
        this.f5120H.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void t(boolean z3) {
        super.t(z3);
        this.f5120H.setTitleOptional(z3);
    }

    public void u(androidx.appcompat.view.menu.g gVar, boolean z3) {
    }

    public void v(s sVar) {
    }

    public boolean w(s sVar) {
        if (!sVar.hasVisibleItems()) {
            return true;
        }
        new m(this.f5120H.getContext(), sVar).l();
        return true;
    }
}
