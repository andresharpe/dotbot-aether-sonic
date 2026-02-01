package com.harman.jbl.partybox;

import android.app.Application;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public class d extends Application implements q0, InterfaceC0919v {

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    public static final a f38436G = new a(null);

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    public static final String f38437H = "BaseViewModelApplication";

    /* renamed from: E, reason: collision with root package name */
    @l3.e
    private p0 f38438E;

    /* renamed from: F, reason: collision with root package name */
    @l3.e
    private m0.b f38439F;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    @Override // androidx.lifecycle.InterfaceC0919v
    @l3.d
    public m0.b getDefaultViewModelProviderFactory() {
        if (this.f38439F == null) {
            this.f38439F = m0.a.f15676f.b(this);
        }
        m0.b bVar = this.f38439F;
        F.n(bVar, "null cannot be cast to non-null type androidx.lifecycle.ViewModelProvider.Factory");
        return bVar;
    }

    @Override // androidx.lifecycle.q0
    @l3.d
    public p0 getViewModelStore() {
        if (this.f38438E == null) {
            this.f38438E = new p0();
        }
        p0 p0Var = this.f38438E;
        F.n(p0Var, "null cannot be cast to non-null type androidx.lifecycle.ViewModelStore");
        return p0Var;
    }
}
