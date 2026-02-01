package com.harman.jbl.partylight.lib.main;

import X2.l;
import X2.p;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.Fragment;
import androidx.navigation.C0943u;
import androidx.navigation.I;
import com.harman.jbl.cd_biz_comm.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partylight.lib.core.PLGroup;
import com.harman.jbl.partylight.lib.g;
import java.io.Serializable;
import kotlin.E;
import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.n;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.U;
import m2.q;

@E(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/harman/jbl/partylight/lib/main/SplashFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/H0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "()V", "Lm2/q;", "N0", "Lcom/harman/jbl/cd_biz_comm/delegate/FragmentViewBindingDelegate;", "getBinding", "()Lm2/q;", "binding", "<init>", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SplashFragment extends Fragment {

    /* renamed from: O0, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f47230O0 = {N.u(new PropertyReference1Impl(SplashFragment.class, "binding", "getBinding()Lcom/harman/jbl/partylight/lib/databinding/FragmentPartylightSplashBinding;", 0))};

    /* renamed from: N0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f47231N0;

    /* loaded from: classes2.dex */
    /* synthetic */ class a extends FunctionReferenceImpl implements l<View, q> {

        /* renamed from: N, reason: collision with root package name */
        public static final a f47232N = new a();

        a() {
            super(1, q.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partylight/lib/databinding/FragmentPartylightSplashBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final q C(@l3.d View p02) {
            F.p(p02, "p0");
            return q.a(p02);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.main.SplashFragment$onViewCreated$1", f = "SplashFragment.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class b extends SuspendLambda implements p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f47233I;

        b(kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f47233I;
            try {
                if (i4 != 0) {
                    if (i4 == 1) {
                        W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    W.n(obj);
                    ActivityC0889g requireActivity = SplashFragment.this.requireActivity();
                    F.n(requireActivity, "null cannot be cast to non-null type com.harman.jbl.partylight.lib.main.PartyLightActivity");
                    Intent intent = ((PartyLightActivity) requireActivity).getIntent();
                    F.m(intent);
                    Bundle extras = intent.getExtras();
                    F.m(extras);
                    Serializable serializable = extras.getSerializable("EXTRACT_TARGET_GROUP");
                    F.n(serializable, "null cannot be cast to non-null type com.harman.jbl.partylight.lib.core.PLGroup");
                    com.harman.jbl.partylight.lib.core.b bVar = com.harman.jbl.partylight.lib.core.b.f46256F;
                    this.f47233I = 1;
                    obj = bVar.g((PLGroup) serializable, this);
                    if (obj == l4) {
                        return l4;
                    }
                }
            } catch (Exception unused) {
                c.a(SplashFragment.this);
            }
            if (((Boolean) obj).booleanValue()) {
                C0943u a4 = androidx.navigation.fragment.f.a(SplashFragment.this);
                I a5 = f.a();
                F.o(a5, "toDashboard(...)");
                a4.h0(a5);
                return H0.f51801a;
            }
            throw new Exception("connect group failed");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((b) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new b(cVar);
        }
    }

    public SplashFragment() {
        super(g.h.f47017q);
        this.f47231N0 = com.harman.jbl.cd_biz_comm.delegate.b.a(this, a.f47232N);
    }

    @l3.d
    public final q getBinding() {
        return (q) this.f47231N0.a(this, f47230O0[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        c.f(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        c.c(this);
        C2323l.f(androidx.lifecycle.F.a(this), null, null, new b(null), 3, null);
    }
}
