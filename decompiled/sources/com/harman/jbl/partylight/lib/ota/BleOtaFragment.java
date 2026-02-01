package com.harman.jbl.partylight.lib.ota;

import X2.l;
import X2.p;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.app.C0;
import androidx.core.content.C0669d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.Q;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.blankj.utilcode.util.C1114y;
import com.blankj.utilcode.util.C1115z;
import com.blankj.utilcode.util.ToastUtils;
import com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment;
import com.harman.jbl.cd_biz_comm.widget.BottomSheetDialog;
import com.harman.jbl.partylight.lib.g;
import kotlin.A;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.U;
import kotlinx.coroutines.C2323l;
import m2.m;

@E(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0005J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0005J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0005R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/harman/jbl/partylight/lib/ota/BleOtaFragment;", "Lcom/harman/jbl/cd_biz_comm/base/BackDispatcherFragment;", "Lm2/m;", "Lkotlin/H0;", "p0", "()V", "r0", "Lcom/harman/jbl/partylight/lib/ota/ProcessStatus;", C0.f11537F0, "o0", "(Lcom/harman/jbl/partylight/lib/ota/ProcessStatus;)V", "handleOnBackPressed", "createBinding", "()Lm2/m;", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "initView", "observeModel", "Lcom/harman/jbl/partylight/lib/ota/e;", "P0", "Lkotlin/A;", "q0", "()Lcom/harman/jbl/partylight/lib/ota/e;", "vm", "<init>", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nBleOtaFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleOtaFragment.kt\ncom/harman/jbl/partylight/lib/ota/BleOtaFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,308:1\n56#2,10:309\n*S KotlinDebug\n*F\n+ 1 BleOtaFragment.kt\ncom/harman/jbl/partylight/lib/ota/BleOtaFragment\n*L\n38#1:309,10\n*E\n"})
/* loaded from: classes2.dex */
public final class BleOtaFragment extends BackDispatcherFragment<m> {

    /* renamed from: P0, reason: collision with root package name */
    @l3.d
    private final A f47237P0;

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47242a;

        static {
            int[] iArr = new int[ProcessStatus.values().length];
            try {
                iArr[ProcessStatus.Ready.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProcessStatus.Processing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProcessStatus.AllUpdated.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f47242a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.ota.BleOtaFragment$exit$1", f = "BleOtaFragment.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class b extends SuspendLambda implements p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f47243I;

        b(kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f47243I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                com.harman.jbl.partylight.lib.main.c.e(BleOtaFragment.this);
                com.harman.jbl.partylight.lib.ota.e q02 = BleOtaFragment.this.q0();
                this.f47243I = 1;
                obj = q02.E(this);
                if (obj == l4) {
                    return l4;
                }
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            com.harman.jbl.partylight.lib.main.c.b(BleOtaFragment.this);
            if (booleanValue) {
                androidx.navigation.fragment.f.a(BleOtaFragment.this).t0();
            } else {
                com.harman.jbl.partylight.lib.main.c.a(BleOtaFragment.this);
            }
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((b) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new b(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements X2.a<H0> {
        c() {
            super(0);
        }

        public final void c() {
            BleOtaFragment.this.p0();
        }

        @Override // X2.a
        public /* bridge */ /* synthetic */ H0 n() {
            c();
            return H0.f51801a;
        }
    }

    /* loaded from: classes2.dex */
    static final class d extends Lambda implements l<ProcessStatus, H0> {
        d() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(ProcessStatus processStatus) {
            c(processStatus);
            return H0.f51801a;
        }

        public final void c(ProcessStatus processStatus) {
            BleOtaFragment bleOtaFragment = BleOtaFragment.this;
            F.m(processStatus);
            bleOtaFragment.o0(processStatus);
        }
    }

    /* loaded from: classes2.dex */
    static final class e extends Lambda implements l<String, H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final e f47247F = new e();

        e() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(String str) {
            c(str);
            return H0.f51801a;
        }

        public final void c(String str) {
            ToastUtils.W(str, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class f implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f47248a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public f(l function) {
            F.p(function, "function");
            this.f47248a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f47248a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f47248a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public BleOtaFragment() {
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partylight.lib.ota.BleOtaFragment$special$$inlined$viewModels$default$1
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
        this.f47237P0 = FragmentViewModelLazyKt.c(this, N.d(com.harman.jbl.partylight.lib.ota.e.class), new X2.a<p0>() { // from class: com.harman.jbl.partylight.lib.ota.BleOtaFragment$special$$inlined$viewModels$default$2
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
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partylight.lib.ota.BleOtaFragment$special$$inlined$viewModels$default$3
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0(ProcessStatus processStatus) {
        int i4;
        boolean z3;
        int i5;
        int i6;
        String string;
        int i7;
        Group group = l0().f55158G;
        ProcessStatus processStatus2 = ProcessStatus.Checking;
        if (processStatus != processStatus2 && processStatus != ProcessStatus.CheckingFailed) {
            F.m(group);
            com.harman.jbl.cd_biz_comm.utils.p.k(group);
        } else {
            F.m(group);
            com.harman.jbl.cd_biz_comm.utils.p.f(group);
        }
        Group group2 = l0().f55160I;
        F.m(group2);
        if (processStatus == processStatus2) {
            com.harman.jbl.cd_biz_comm.utils.p.k(group2);
        } else {
            com.harman.jbl.cd_biz_comm.utils.p.f(group2);
        }
        Group group3 = l0().f55159H;
        ProcessStatus processStatus3 = ProcessStatus.CheckingFailed;
        F.m(group3);
        if (processStatus == processStatus3) {
            com.harman.jbl.cd_biz_comm.utils.p.k(group3);
        } else {
            com.harman.jbl.cd_biz_comm.utils.p.f(group3);
        }
        TextView textView = l0().f55165N;
        int i8 = 4;
        if (processStatus != ProcessStatus.Ready && processStatus != processStatus3 && processStatus != ProcessStatus.CanNotUpdate) {
            i4 = 4;
        } else {
            i4 = 0;
        }
        textView.setVisibility(i4);
        ProcessStatus processStatus4 = ProcessStatus.CanNotUpdate;
        if (processStatus != processStatus4) {
            z3 = true;
        } else {
            z3 = false;
        }
        textView.setClickable(z3);
        if (processStatus == processStatus4) {
            i5 = g.c.f46617E;
        } else {
            i5 = g.c.f46616D;
        }
        textView.setBackgroundTintList(ColorStateList.valueOf(C1114y.a(i5)));
        if (processStatus == processStatus4) {
            i6 = g.c.f46619G;
        } else {
            i6 = g.c.f46624b;
        }
        textView.setTextColor(C1114y.a(i6));
        TextView textView2 = l0().f55167P;
        if (processStatus != processStatus4) {
            i8 = 0;
        }
        textView2.setVisibility(i8);
        int i9 = a.f47242a[processStatus.ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    string = "";
                } else {
                    string = getString(g.l.f47106c);
                }
            } else {
                string = getString(g.l.f47082K0);
            }
        } else {
            string = getString(g.l.f47142u, String.valueOf(q0().H()));
        }
        textView2.setText(string);
        Context requireContext = requireContext();
        if (processStatus == ProcessStatus.AllUpdated) {
            i7 = g.c.f46641s;
        } else {
            i7 = g.c.f46621I;
        }
        textView2.setTextColor(C0669d.f(requireContext, i7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0() {
        C2323l.f(androidx.lifecycle.F.a(this), null, null, new b(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.harman.jbl.partylight.lib.ota.e q0() {
        return (com.harman.jbl.partylight.lib.ota.e) this.f47237P0.getValue();
    }

    private final void r0() {
        l0().f55163L.setAdapter(new i(q0(), this));
        l0().f55163L.setLayoutManager(new LinearLayoutManager(requireContext()));
        l0().f55163L.n(new j(C1115z.w(10.0f), 1));
        l0().f55163L.setItemAnimator(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(BleOtaFragment this$0, View view) {
        F.p(this$0, "this$0");
        if (this$0.q0().I().f() == ProcessStatus.CheckingFailed) {
            this$0.q0().L();
        } else {
            this$0.q0().O();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(BleOtaFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.handleOnBackPressed();
    }

    @Override // com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment
    public void handleOnBackPressed() {
        if (q0().I().f() == ProcessStatus.Processing) {
            String string = getString(g.l.f47146w);
            F.o(string, "getString(...)");
            String string2 = getString(g.l.f47127m0);
            F.o(string2, "getString(...)");
            String string3 = getString(g.l.f47144v);
            F.o(string3, "getString(...)");
            new BottomSheetDialog(string, string2, string3, null, new c(), 8, null).show(getParentFragmentManager(), (String) null);
            return;
        }
        p0();
    }

    @Override // com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment
    public void initView() {
        l0().f55161J.f55033I.setText(g.l.f47148x);
        r0();
        l0().f55165N.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.ota.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BleOtaFragment.s0(BleOtaFragment.this, view);
            }
        });
        l0().f55161J.f55031G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.ota.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BleOtaFragment.t0(BleOtaFragment.this, view);
            }
        });
    }

    @Override // com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment
    public void observeModel() {
        super.observeModel();
        q0().I().k(this, new f(new d()));
        q0().G().k(this, new f(e.f47247F));
    }

    @Override // com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        com.harman.jbl.partylight.lib.core.e.b(false);
        com.harman.jbl.cd_biz_comm.wireless_tech.j.f38190F.z(true);
        requireActivity().getWindow().getDecorView().setKeepScreenOn(false);
    }

    @Override // com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        requireActivity().getWindow().getDecorView().setKeepScreenOn(true);
        com.harman.jbl.partylight.lib.core.e.b(true);
        com.harman.jbl.cd_biz_comm.wireless_tech.j.f38190F.z(false);
    }

    @Override // com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment
    @l3.d
    public m createBinding() {
        m c4 = m.c(getLayoutInflater());
        F.o(c4, "inflate(...)");
        return c4;
    }
}
