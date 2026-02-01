package com.harman.jbl.partylight.lib.partystage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment;
import com.harman.jbl.partylight.lib.g;
import kotlin.A;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.U;

@E(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/harman/jbl/partylight/lib/partystage/PartyStageDoneFragment;", "Lcom/harman/jbl/cd_biz_comm/base/BackDispatcherFragment;", "Lm2/r;", "createBinding", "()Lm2/r;", "Lkotlin/H0;", "initView", "()V", "Lcom/harman/jbl/partylight/lib/partystage/e;", "P0", "Lkotlin/A;", "o0", "()Lcom/harman/jbl/partylight/lib/partystage/e;", "viewModel", "", "Q0", "I", PartyStageDoneFragment.ARGS_STICK_NUM, "<init>", "Companion", "a", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nPartyStageDoneFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartyStageDoneFragment.kt\ncom/harman/jbl/partylight/lib/partystage/PartyStageDoneFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,44:1\n56#2,10:45\n*S KotlinDebug\n*F\n+ 1 PartyStageDoneFragment.kt\ncom/harman/jbl/partylight/lib/partystage/PartyStageDoneFragment\n*L\n9#1:45,10\n*E\n"})
/* loaded from: classes2.dex */
public final class PartyStageDoneFragment extends BackDispatcherFragment<m2.r> {

    @l3.d
    public static final String ARGS_STICK_NUM = "stickNum";

    @l3.d
    public static final a Companion = new a(null);

    @l3.d
    public static final String TAG = "PartyStageDoneFragment";

    /* renamed from: P0, reason: collision with root package name */
    @l3.d
    private final A f47395P0;

    /* renamed from: Q0, reason: collision with root package name */
    private int f47396Q0;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final PartyStageDoneFragment a() {
            return new PartyStageDoneFragment();
        }

        private a() {
        }
    }

    public PartyStageDoneFragment() {
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partylight.lib.partystage.PartyStageDoneFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Fragment n() {
                return Fragment.this;
            }
        };
        this.f47395P0 = FragmentViewModelLazyKt.c(this, N.d(e.class), new X2.a<p0>() { // from class: com.harman.jbl.partylight.lib.partystage.PartyStageDoneFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final p0 n() {
                p0 viewModelStore = ((q0) X2.a.this.n()).getViewModelStore();
                F.o(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partylight.lib.partystage.PartyStageDoneFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final m0.b n() {
                InterfaceC0919v interfaceC0919v;
                Object n4 = X2.a.this.n();
                m0.b bVar = null;
                if (n4 instanceof InterfaceC0919v) {
                    interfaceC0919v = (InterfaceC0919v) n4;
                } else {
                    interfaceC0919v = null;
                }
                if (interfaceC0919v != null) {
                    bVar = interfaceC0919v.getDefaultViewModelProviderFactory();
                }
                if (bVar == null) {
                    bVar = this.getDefaultViewModelProviderFactory();
                }
                F.o(bVar, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return bVar;
            }
        });
    }

    @W2.n
    @l3.d
    public static final PartyStageDoneFragment newInstance() {
        return Companion.a();
    }

    private final e o0() {
        return (e) this.f47395P0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0(PartyStageDoneFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.handleOnBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q0(PartyStageDoneFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.o0().v();
    }

    @Override // com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment
    public void initView() {
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey(ARGS_STICK_NUM)) {
            this.f47396Q0 = arguments.getInt(ARGS_STICK_NUM, 0);
        }
        m2.r l02 = l0();
        l02.f55221G.f55031G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.partystage.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PartyStageDoneFragment.p0(PartyStageDoneFragment.this, view);
            }
        });
        l02.f55221G.f55033I.setText(getString(g.l.f47094S));
        l02.f55220F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.partystage.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PartyStageDoneFragment.q0(PartyStageDoneFragment.this, view);
            }
        });
    }

    @Override // com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment
    @l3.d
    public m2.r createBinding() {
        m2.r c4 = m2.r.c(getLayoutInflater());
        F.o(c4, "inflate(...)");
        return c4;
    }
}
