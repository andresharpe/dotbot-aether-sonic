package com.harman.jbl.partylight.lib.partystage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.N;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.Q;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice;
import com.harman.jbl.partylight.lib.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.A;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;

@E(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0007R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0012\u001a\u00060\u000fR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/harman/jbl/partylight/lib/partystage/PartyStagePlacedFragment;", "Lcom/harman/jbl/cd_biz_comm/base/BackDispatcherFragment;", "Lm2/t;", "createBinding", "()Lm2/t;", "Lkotlin/H0;", "initView", "()V", "observeModel", "Lcom/harman/jbl/partylight/lib/partystage/k;", "P0", "Lkotlin/A;", "p0", "()Lcom/harman/jbl/partylight/lib/partystage/k;", "viewModel", "Lcom/harman/jbl/partylight/lib/partystage/PartyStagePlacedFragment$b;", "Q0", "Lcom/harman/jbl/partylight/lib/partystage/PartyStagePlacedFragment$b;", "adapter", "Lcom/harman/jbl/cd_biz_comm/utils/q;", "R0", "Lcom/harman/jbl/cd_biz_comm/utils/q;", "viewUtils", "<init>", "Companion", "a", com.harman.log.b.f47574c, "partylightLib_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nPartyStagePlacedFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartyStagePlacedFragment.kt\ncom/harman/jbl/partylight/lib/partystage/PartyStagePlacedFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,98:1\n56#2,10:99\n254#3,2:109\n*S KotlinDebug\n*F\n+ 1 PartyStagePlacedFragment.kt\ncom/harman/jbl/partylight/lib/partystage/PartyStagePlacedFragment\n*L\n19#1:99,10\n40#1:109,2\n*E\n"})
/* loaded from: classes2.dex */
public final class PartyStagePlacedFragment extends BackDispatcherFragment<m2.t> {

    @l3.d
    public static final a Companion = new a(null);

    @l3.d
    public static final String TAG = "PartyStageFragment";

    /* renamed from: P0, reason: collision with root package name */
    @l3.d
    private final A f47401P0;

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final b f47402Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final com.harman.jbl.cd_biz_comm.utils.q f47403R0;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final PartyStagePlacedFragment a() {
            return new PartyStagePlacedFragment();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public final class b extends RecyclerView.Adapter<a> {

        /* renamed from: d, reason: collision with root package name */
        @l3.d
        private final ArrayList<PartyLightDevice> f47408d = new ArrayList<>();

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes2.dex */
        public final class a extends RecyclerView.F {

            /* renamed from: I, reason: collision with root package name */
            final /* synthetic */ b f47410I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@l3.d @N b bVar, View itemView) {
                super(itemView);
                F.p(itemView, "itemView");
                this.f47410I = bVar;
            }
        }

        public b() {
        }

        @l3.d
        public final ArrayList<PartyLightDevice> O() {
            return this.f47408d;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: P, reason: merged with bridge method [inline-methods] */
        public void C(@l3.d a holder, int i4) {
            F.p(holder, "holder");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @l3.d
        /* renamed from: Q, reason: merged with bridge method [inline-methods] */
        public a E(@l3.d ViewGroup parent, int i4) {
            F.p(parent, "parent");
            View inflate = LayoutInflater.from(parent.getContext()).inflate(g.h.f47025y, parent, false);
            F.o(inflate, "inflate(...)");
            return new a(this, inflate);
        }

        public final void R(@l3.d List<PartyLightDevice> list) {
            F.p(list, "list");
            this.f47408d.clear();
            this.f47408d.addAll(list);
            r();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int l() {
            return this.f47408d.size();
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends Lambda implements X2.l<List<? extends PartyLightDevice>, H0> {
        c() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(List<? extends PartyLightDevice> list) {
            c(list);
            return H0.f51801a;
        }

        public final void c(List<PartyLightDevice> list) {
            b bVar = PartyStagePlacedFragment.this.f47402Q0;
            F.m(list);
            bVar.R(list);
        }
    }

    /* loaded from: classes2.dex */
    static final class d implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f47412a;

        d(X2.l function) {
            F.p(function, "function");
            this.f47412a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f47412a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f47412a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public PartyStagePlacedFragment() {
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partylight.lib.partystage.PartyStagePlacedFragment$special$$inlined$viewModels$default$1
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
        this.f47401P0 = FragmentViewModelLazyKt.c(this, kotlin.jvm.internal.N.d(k.class), new X2.a<p0>() { // from class: com.harman.jbl.partylight.lib.partystage.PartyStagePlacedFragment$special$$inlined$viewModels$default$2
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
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partylight.lib.partystage.PartyStagePlacedFragment$special$$inlined$viewModels$default$3
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
        this.f47402Q0 = new b();
        this.f47403R0 = new com.harman.jbl.cd_biz_comm.utils.q();
    }

    @W2.n
    @l3.d
    public static final PartyStagePlacedFragment newInstance() {
        return Companion.a();
    }

    private final k p0() {
        return (k) this.f47401P0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q0(PartyStagePlacedFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.handleOnBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(PartyStagePlacedFragment this$0, View view) {
        F.p(this$0, "this$0");
        new PartyStageTipsDialogFragment(null, 1, null).show(this$0.getChildFragmentManager(), PartyStageTipsDialogFragment.TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(PartyStagePlacedFragment this$0, View view) {
        F.p(this$0, "this$0");
        com.harman.jbl.cd_biz_comm.utils.q qVar = this$0.f47403R0;
        F.m(view);
        qVar.a(view);
        androidx.navigation.fragment.f.a(this$0).W(g.C0418g.f46853M0);
    }

    @Override // com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment
    public void initView() {
        m2.t l02 = l0();
        l02.f55232G.f55031G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.partystage.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PartyStagePlacedFragment.q0(PartyStagePlacedFragment.this, view);
            }
        });
        l02.f55232G.f55033I.setText(getString(g.l.f47094S));
        l02.f55232G.f55030F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.partystage.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PartyStagePlacedFragment.r0(PartyStagePlacedFragment.this, view);
            }
        });
        l02.f55232G.f55030F.setImageResource(g.e.f46762E);
        ImageView action = l02.f55232G.f55030F;
        F.o(action, "action");
        action.setVisibility(0);
        l02.f55231F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.partystage.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PartyStagePlacedFragment.s0(PartyStagePlacedFragment.this, view);
            }
        });
        l02.f55233H.setRepeatMode(1);
        l02.f55233H.setRepeatCount(0);
        l02.f55233H.setAnimation(g.k.f47055b);
        l02.f55233H.B();
    }

    @Override // com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment
    public void observeModel() {
        super.observeModel();
        p0().v().k(this, new d(new c()));
    }

    @Override // com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment
    @l3.d
    public m2.t createBinding() {
        m2.t c4 = m2.t.c(getLayoutInflater());
        F.o(c4, "inflate(...)");
        return c4;
    }
}
