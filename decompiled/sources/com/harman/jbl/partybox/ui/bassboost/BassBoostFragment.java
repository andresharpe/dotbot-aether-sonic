package com.harman.jbl.partybox.ui.bassboost;

import X2.l;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.Q;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.T;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.jbl.partybox.ui.widget.BassBoostView;
import com.harman.log.f;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import java.util.LinkedHashMap;
import kotlin.A;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.U;
import kotlin.reflect.n;

@E(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 <2\u00020\u0001:\u0002=>B\u0007¢\u0006\u0004\b;\u0010\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u000bJ\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u000bJ\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u000bJ\u0015\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\tJ\u0015\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u000bR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0016\u00100\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006?"}, d2 = {"Lcom/harman/jbl/partybox/ui/bassboost/BassBoostFragment;", "Landroidx/fragment/app/Fragment;", "", "t0", "()Z", "", "actionItemValue", "Lkotlin/H0;", "o0", "(Ljava/lang/String;)V", "s0", "()V", "y0", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onDestroyView", "onDestroy", "bassBoostStatus", "logBassBoostSettingEvent", "", "bassBoostState", "updateBassBoost", "(I)V", "initBassBoostState", "Lcom/harman/jbl/partybox/ui/main/o;", "N0", "Lkotlin/A;", "q0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/ui/bassboost/e;", "O0", "r0", "()Lcom/harman/jbl/partybox/ui/bassboost/e;", "viewModel", "Lcom/harman/jbl/partybox/databinding/T;", "P0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "p0", "()Lcom/harman/jbl/partybox/databinding/T;", "binding", "Q0", "I", "selectedBassBoost", "R0", "currentBassBoost", "Landroid/os/Handler;", "S0", "Landroid/os/Handler;", "mHandler", "Ljava/lang/Runnable;", "T0", "Ljava/lang/Runnable;", "refreshRunnable", "<init>", "Companion", "a", "EqType", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nBassBoostFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BassBoostFragment.kt\ncom/harman/jbl/partybox/ui/bassboost/BassBoostFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,357:1\n66#2,4:358\n56#3,10:362\n1#4:372\n*S KotlinDebug\n*F\n+ 1 BassBoostFragment.kt\ncom/harman/jbl/partybox/ui/bassboost/BassBoostFragment\n*L\n44#1:358,4\n45#1:362,10\n*E\n"})
/* loaded from: classes2.dex */
public final class BassBoostFragment extends Fragment {
    public static final long NOTIFY_TIME_OUT = 1000;

    @l3.d
    public static final String TAG = "BassBoostFragment";

    /* renamed from: N0, reason: collision with root package name */
    @l3.d
    private final A f42113N0;

    /* renamed from: O0, reason: collision with root package name */
    @l3.d
    private final A f42114O0;

    /* renamed from: P0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f42115P0;

    /* renamed from: Q0, reason: collision with root package name */
    private int f42116Q0;

    /* renamed from: R0, reason: collision with root package name */
    private int f42117R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private final Handler f42118S0;

    /* renamed from: T0, reason: collision with root package name */
    @l3.d
    private final Runnable f42119T0;

    /* renamed from: U0, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f42112U0 = {N.u(new PropertyReference1Impl(BassBoostFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentBassboostBinding;", 0))};

    @l3.d
    public static final a Companion = new a(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/harman/jbl/partybox/ui/bassboost/BassBoostFragment$EqType;", "", "(Ljava/lang/String;I)V", "PB_SIMPLE_EQ_OFF", "PB_SIMPLE_EQ_BASS_BOOST_1", "PB_SIMPLE_EQ_BASS_BOOST_2", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class EqType {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ EqType[] $VALUES;
        public static final EqType PB_SIMPLE_EQ_OFF = new EqType("PB_SIMPLE_EQ_OFF", 0);
        public static final EqType PB_SIMPLE_EQ_BASS_BOOST_1 = new EqType("PB_SIMPLE_EQ_BASS_BOOST_1", 1);
        public static final EqType PB_SIMPLE_EQ_BASS_BOOST_2 = new EqType("PB_SIMPLE_EQ_BASS_BOOST_2", 2);

        static {
            EqType[] b4 = b();
            $VALUES = b4;
            $ENTRIES = kotlin.enums.c.c(b4);
        }

        private EqType(String str, int i4) {
        }

        private static final /* synthetic */ EqType[] b() {
            return new EqType[]{PB_SIMPLE_EQ_OFF, PB_SIMPLE_EQ_BASS_BOOST_1, PB_SIMPLE_EQ_BASS_BOOST_2};
        }

        @l3.d
        public static kotlin.enums.a<EqType> e() {
            return $ENTRIES;
        }

        public static EqType valueOf(String str) {
            return (EqType) Enum.valueOf(EqType.class, str);
        }

        public static EqType[] values() {
            return (EqType[]) $VALUES.clone();
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class b extends FunctionReferenceImpl implements l<View, T> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f42124N = new b();

        b() {
            super(1, T.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentBassboostBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final T C(@l3.d View p02) {
            F.p(p02, "p0");
            return T.a(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements l<PartyBoxDevice, H0> {
        c() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(PartyBoxDevice partyBoxDevice) {
            c(partyBoxDevice);
            return H0.f51801a;
        }

        public final void c(PartyBoxDevice partyBoxDevice) {
            HmDevice k12 = BassBoostFragment.this.q0().k1();
            if (k12 != null) {
                BassBoostFragment.this.updateBassBoost(((PartyBoxDevice) k12).P0());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class d extends Lambda implements l<H0, H0> {
        d() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(H0 h02) {
            c(h02);
            return H0.f51801a;
        }

        public final void c(H0 h02) {
            BassBoostFragment.this.f42118S0.removeCallbacks(BassBoostFragment.this.f42119T0);
            BassBoostFragment.this.f42118S0.postDelayed(BassBoostFragment.this.f42119T0, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class e implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f42127a;

        e(l function) {
            F.p(function, "function");
            this.f42127a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f42127a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f42127a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public BassBoostFragment() {
        super(j.i.f41406K);
        this.f42113N0 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.bassboost.BassBoostFragment$special$$inlined$viewModels$default$1
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
        this.f42114O0 = FragmentViewModelLazyKt.c(this, N.d(com.harman.jbl.partybox.ui.bassboost.e.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.bassboost.BassBoostFragment$special$$inlined$viewModels$default$2
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
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.bassboost.BassBoostFragment$special$$inlined$viewModels$default$3
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
        this.f42115P0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f42124N);
        BassBoostView.EqType eqType = BassBoostView.EqType.PB_SIMPLE_EQ_BASS_BOOST_1;
        this.f42116Q0 = eqType.ordinal();
        this.f42117R0 = eqType.ordinal();
        this.f42118S0 = new Handler(Looper.getMainLooper());
        this.f42119T0 = new Runnable() { // from class: com.harman.jbl.partybox.ui.bassboost.a
            @Override // java.lang.Runnable
            public final void run() {
                BassBoostFragment.x0(BassBoostFragment.this);
            }
        };
    }

    private final void o0(String str) {
        HmDevice k12 = q0().k1();
        if (k12 != null) {
            Bundle bundle = new Bundle();
            bundle.putString("di_action_type", L1.a.f1546X1);
            bundle.putString(L1.a.f1522R1, str);
            bundle.putInt(L1.a.w3, com.harman.jbl.partybox.c.f38305O);
            bundle.putString(L1.a.f1655u, com.harman.sdk.utils.d.v(k12.q()));
            K1.a.a(L1.a.f1514P1, bundle);
        }
    }

    private final T p0() {
        return (T) this.f42115P0.a(this, f42112U0[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o q0() {
        return (o) this.f42113N0.getValue();
    }

    private final com.harman.jbl.partybox.ui.bassboost.e r0() {
        return (com.harman.jbl.partybox.ui.bassboost.e) this.f42114O0.getValue();
    }

    private final void s0() {
        r0().V().k(getViewLifecycleOwner(), new e(new c()));
        q0().U0().k(getViewLifecycleOwner(), new e(new d()));
    }

    private final boolean t0() {
        PartyBoxDevice partyBoxDevice;
        HmDevice k12 = q0().k1();
        if (k12 instanceof PartyBoxDevice) {
            partyBoxDevice = (PartyBoxDevice) k12;
        } else {
            partyBoxDevice = null;
        }
        boolean z3 = true;
        if (partyBoxDevice == null) {
            f.a(TAG, "isDeviceOffline() >>> missing main device or not a PartyBox type");
            return true;
        }
        if ((partyBoxDevice.O() && partyBoxDevice.R()) || partyBoxDevice.F1()) {
            z3 = false;
        }
        f.a(TAG, "isDeviceOffline() >>> MAC[" + partyBoxDevice.n() + "] Classic BT.connected[" + partyBoxDevice.O() + "] BLE.connected[" + partyBoxDevice.R() + "] standby[" + partyBoxDevice.F1() + "]");
        return z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(BassBoostFragment this$0, View view) {
        F.p(this$0, "this$0");
        T1.a.a("BLE_LOG BassBoostFragment BassBoost1 Button selected ");
        if (this$0.t0()) {
            return;
        }
        EqType eqType = EqType.PB_SIMPLE_EQ_BASS_BOOST_1;
        this$0.updateBassBoost(eqType.ordinal());
        HmDevice k12 = this$0.q0().k1();
        if (k12 != null) {
            this$0.r0().W(k12, eqType.ordinal());
        }
        this$0.o0("deep");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(BassBoostFragment this$0, View view) {
        F.p(this$0, "this$0");
        T1.a.a("BLE_LOG BassBoostFragment BassBoost2 Button selected ");
        if (this$0.t0()) {
            return;
        }
        EqType eqType = EqType.PB_SIMPLE_EQ_BASS_BOOST_2;
        this$0.updateBassBoost(eqType.ordinal());
        HmDevice k12 = this$0.q0().k1();
        if (k12 != null) {
            this$0.r0().W(k12, eqType.ordinal());
        }
        this$0.o0("punchy");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(BassBoostFragment this$0, View view) {
        String str;
        F.p(this$0, "this$0");
        int i4 = this$0.f42117R0;
        EqType eqType = EqType.PB_SIMPLE_EQ_OFF;
        if (i4 == eqType.ordinal()) {
            T1.a.a("BLE_LOG BassBoostFragment BassBoost Switch Turn On ");
            if (this$0.t0()) {
                return;
            }
            if (this$0.f42116Q0 == EqType.PB_SIMPLE_EQ_BASS_BOOST_2.ordinal()) {
                str = "punchy";
            } else {
                str = "deep";
            }
            this$0.o0(str);
            this$0.updateBassBoost(this$0.f42116Q0);
            HmDevice k12 = this$0.q0().k1();
            if (k12 != null) {
                this$0.r0().W(k12, this$0.f42116Q0);
                return;
            }
            return;
        }
        T1.a.a("BLE_LOG BassBoostFragment BassBoost Switch Turn Off ");
        if (this$0.t0()) {
            return;
        }
        this$0.o0(L1.a.f1552Z);
        this$0.updateBassBoost(eqType.ordinal());
        HmDevice k13 = this$0.q0().k1();
        if (k13 != null) {
            this$0.r0().W(k13, eqType.ordinal());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(BassBoostFragment this$0) {
        F.p(this$0, "this$0");
        HmDevice k12 = this$0.q0().k1();
        if (k12 != null && (k12 instanceof PartyBoxDevice)) {
            this$0.updateBassBoost(((PartyBoxDevice) k12).P0());
        }
    }

    private final void y0() {
        String str;
        String str2;
        TextView textView = p0().f39059N;
        Context context = getContext();
        String str3 = null;
        if (context != null) {
            str = context.getString(j.m.f41663K1);
        } else {
            str = null;
        }
        textView.setText(str);
        TextView textView2 = p0().f39053H;
        Context context2 = getContext();
        if (context2 != null) {
            str2 = context2.getString(j.m.U6);
        } else {
            str2 = null;
        }
        textView2.setText(str2);
        TextView textView3 = p0().f39056K;
        Context context3 = getContext();
        if (context3 != null) {
            str3 = context3.getString(j.m.P8);
        }
        textView3.setText(str3);
    }

    public final void initBassBoostState() {
        String str;
        int ordinal;
        LinkedHashMap<String, Integer> f4 = com.harman.jbl.partybox.persistence.a.f42065a.f("BASS_BOOST_STATE_KEY");
        if (f4 != null) {
            HmDevice k12 = q0().k1();
            String str2 = null;
            if (k12 != null) {
                str = k12.n();
            } else {
                str = null;
            }
            if (f4.containsKey(str)) {
                HmDevice k13 = q0().k1();
                if (k13 != null) {
                    str2 = k13.n();
                }
                Integer num = f4.get(str2);
                if (num != null) {
                    ordinal = num.intValue();
                } else {
                    ordinal = EqType.PB_SIMPLE_EQ_BASS_BOOST_1.ordinal();
                }
                this.f42116Q0 = ordinal;
                T1.a.a("BLE_LOG BassBoostFragment BassBoost found in SP and the state is : " + ordinal);
            }
        }
    }

    public final void logBassBoostSettingEvent(@l3.d String bassBoostStatus) {
        F.p(bassBoostStatus, "bassBoostStatus");
        HmDevice k12 = q0().k1();
        if (k12 != null && o.f44128m1.e()) {
            T1.a.a("BLE_LOG logBassBoostSettingEvent called");
            Bundle bundle = new Bundle();
            bundle.putString(L1.a.f1655u, com.harman.sdk.utils.d.v(k12.q()));
            bundle.putString(L1.a.f1671y, com.harman.sdk.utils.j.b(k12.n()));
            bundle.putString(L1.a.f1675z, com.harman.sdk.utils.l.a(k12.n()));
            bundle.putString(L1.a.f1628o1, bassBoostStatus);
            T1.a.a("BLE_LOG EVENT_SETTING_BassBoost called");
            q0().n2(L1.a.f1616m, bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f42118S0.removeCallbacksAndMessages(null);
        T1.a.a("BLE_LOG BassBoostFragment onDestroy called");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f42118S0.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        T1.a.a("BLE_LOG BassBoostFragment onResume called");
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        String str;
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        T1.a.a("BLE_LOG BassBoostFragment onViewCreated called");
        T p02 = p0();
        p02.f39051F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.bassboost.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BassBoostFragment.u0(BassBoostFragment.this, view2);
            }
        });
        p02.f39054I.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.bassboost.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BassBoostFragment.v0(BassBoostFragment.this, view2);
            }
        });
        p02.f39058M.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.bassboost.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BassBoostFragment.w0(BassBoostFragment.this, view2);
            }
        });
        initBassBoostState();
        s0();
        HmDevice k12 = q0().k1();
        if (k12 != null) {
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
            updateBassBoost(partyBoxDevice.P0());
            int P02 = partyBoxDevice.P0();
            if (P02 == EqType.PB_SIMPLE_EQ_BASS_BOOST_1.ordinal()) {
                str = "deep";
            } else if (P02 == EqType.PB_SIMPLE_EQ_BASS_BOOST_2.ordinal()) {
                str = "punchy";
            } else {
                str = "off";
            }
            logBassBoostSettingEvent(str);
        }
    }

    public final void updateBassBoost(int i4) {
        Resources.Theme theme;
        Resources.Theme theme2;
        Resources.Theme theme3;
        Resources.Theme theme4;
        T1.a.a("BLE_LOG BassBoostFragment updateBassBoost called and BassBoost : " + i4 + " ");
        this.f42117R0 = i4;
        initBassBoostState();
        y0();
        Resources.Theme theme5 = null;
        if (i4 == EqType.PB_SIMPLE_EQ_BASS_BOOST_1.ordinal() || i4 == -1) {
            this.f42116Q0 = i4;
            p0().f39051F.setEnabled(true);
            p0().f39054I.setEnabled(true);
            HmDevice k12 = q0().k1();
            if (k12 != null) {
                if (com.harman.sdk.utils.d.G(k12)) {
                    p0().f39051F.setBackgroundResource(j.f.f40937I);
                } else {
                    p0().f39051F.setBackgroundResource(j.f.f40993W);
                }
            }
            p0().f39054I.setBackgroundResource(0);
            p0().f39052G.setImageResource(j.f.f41086p1);
            TextView textView = p0().f39053H;
            Resources resources = getResources();
            int i5 = j.d.f40749f1;
            Context context = getContext();
            if (context != null) {
                theme = context.getTheme();
            } else {
                theme = null;
            }
            textView.setTextColor(resources.getColor(i5, theme));
            p0().f39055J.setImageResource(j.f.f41091q1);
            TextView textView2 = p0().f39056K;
            Resources resources2 = getResources();
            int i6 = j.d.f40687D0;
            Context context2 = getContext();
            if (context2 != null) {
                theme5 = context2.getTheme();
            }
            textView2.setTextColor(resources2.getColor(i6, theme5));
            p0().f39058M.setImageResource(j.f.i4);
            return;
        }
        EqType eqType = EqType.PB_SIMPLE_EQ_BASS_BOOST_2;
        if (i4 == eqType.ordinal()) {
            this.f42116Q0 = i4;
            p0().f39051F.setEnabled(true);
            p0().f39054I.setEnabled(true);
            p0().f39051F.setBackgroundResource(0);
            HmDevice k13 = q0().k1();
            if (k13 != null) {
                if (com.harman.sdk.utils.d.G(k13)) {
                    p0().f39054I.setBackgroundResource(j.f.f40937I);
                } else {
                    p0().f39054I.setBackgroundResource(j.f.f40993W);
                }
            }
            p0().f39052G.setImageResource(j.f.f41081o1);
            TextView textView3 = p0().f39053H;
            Resources resources3 = getResources();
            int i7 = j.d.f40687D0;
            Context context3 = getContext();
            if (context3 != null) {
                theme4 = context3.getTheme();
            } else {
                theme4 = null;
            }
            textView3.setTextColor(resources3.getColor(i7, theme4));
            p0().f39055J.setImageResource(j.f.f41096r1);
            TextView textView4 = p0().f39056K;
            Resources resources4 = getResources();
            int i8 = j.d.f40749f1;
            Context context4 = getContext();
            if (context4 != null) {
                theme5 = context4.getTheme();
            }
            textView4.setTextColor(resources4.getColor(i8, theme5));
            p0().f39058M.setImageResource(j.f.i4);
            return;
        }
        if (i4 == EqType.PB_SIMPLE_EQ_OFF.ordinal()) {
            T1.a.a("BLE_LOG BassBoostFragment updateBassBoost called and BassBoost is Off and selectedBassBoost is : " + this.f42116Q0 + " ");
            p0().f39058M.setImageResource(j.f.h4);
            p0().f39051F.setEnabled(false);
            p0().f39054I.setEnabled(false);
            if (this.f42116Q0 == eqType.ordinal()) {
                p0().f39051F.setBackgroundResource(0);
                p0().f39054I.setBackgroundResource(j.f.f40941J);
                p0().f39052G.setImageResource(j.f.f41081o1);
                TextView textView5 = p0().f39053H;
                Resources resources5 = getResources();
                int i9 = j.d.f40687D0;
                Context context5 = getContext();
                if (context5 != null) {
                    theme3 = context5.getTheme();
                } else {
                    theme3 = null;
                }
                textView5.setTextColor(resources5.getColor(i9, theme3));
                p0().f39055J.setImageResource(j.f.f41091q1);
                TextView textView6 = p0().f39056K;
                Resources resources6 = getResources();
                int i10 = j.d.f40687D0;
                Context context6 = getContext();
                if (context6 != null) {
                    theme5 = context6.getTheme();
                }
                textView6.setTextColor(resources6.getColor(i10, theme5));
                return;
            }
            p0().f39054I.setBackgroundResource(0);
            p0().f39051F.setBackgroundResource(j.f.f40941J);
            p0().f39052G.setImageResource(j.f.f41081o1);
            TextView textView7 = p0().f39053H;
            Resources resources7 = getResources();
            int i11 = j.d.f40687D0;
            Context context7 = getContext();
            if (context7 != null) {
                theme2 = context7.getTheme();
            } else {
                theme2 = null;
            }
            textView7.setTextColor(resources7.getColor(i11, theme2));
            p0().f39055J.setImageResource(j.f.f41091q1);
            TextView textView8 = p0().f39056K;
            Resources resources8 = getResources();
            int i12 = j.d.f40687D0;
            Context context8 = getContext();
            if (context8 != null) {
                theme5 = context8.getTheme();
            }
            textView8.setTextColor(resources8.getColor(i12, theme5));
        }
    }
}
