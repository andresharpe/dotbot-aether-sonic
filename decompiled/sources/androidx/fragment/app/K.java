package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.e0;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class K implements InterfaceC0919v, androidx.savedstate.e, q0 {

    /* renamed from: E, reason: collision with root package name */
    private final Fragment f15188E;

    /* renamed from: F, reason: collision with root package name */
    private final p0 f15189F;

    /* renamed from: G, reason: collision with root package name */
    private m0.b f15190G;

    /* renamed from: H, reason: collision with root package name */
    private androidx.lifecycle.G f15191H = null;

    /* renamed from: I, reason: collision with root package name */
    private androidx.savedstate.d f15192I = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public K(@androidx.annotation.N Fragment fragment, @androidx.annotation.N p0 p0Var) {
        this.f15188E = fragment;
        this.f15189F = p0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(@androidx.annotation.N Lifecycle.Event event) {
        this.f15191H.l(event);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (this.f15191H == null) {
            this.f15191H = new androidx.lifecycle.G(this);
            this.f15192I = androidx.savedstate.d.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        if (this.f15191H != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(@androidx.annotation.P Bundle bundle) {
        this.f15192I.d(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(@androidx.annotation.N Bundle bundle) {
        this.f15192I.e(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(@androidx.annotation.N Lifecycle.State state) {
        this.f15191H.s(state);
    }

    @Override // androidx.lifecycle.InterfaceC0919v
    @androidx.annotation.N
    public m0.b getDefaultViewModelProviderFactory() {
        Application application;
        m0.b defaultViewModelProviderFactory = this.f15188E.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f15188E.f15038y0)) {
            this.f15190G = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f15190G == null) {
            Context applicationContext = this.f15188E.requireContext().getApplicationContext();
            while (true) {
                if (applicationContext instanceof ContextWrapper) {
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    }
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                } else {
                    application = null;
                    break;
                }
            }
            this.f15190G = new e0(application, this, this.f15188E.getArguments());
        }
        return this.f15190G;
    }

    @Override // androidx.lifecycle.E
    @androidx.annotation.N
    public Lifecycle getLifecycle() {
        b();
        return this.f15191H;
    }

    @Override // androidx.savedstate.e
    @androidx.annotation.N
    public androidx.savedstate.c getSavedStateRegistry() {
        b();
        return this.f15192I.b();
    }

    @Override // androidx.lifecycle.q0
    @androidx.annotation.N
    public p0 getViewModelStore() {
        b();
        return this.f15189F;
    }
}
