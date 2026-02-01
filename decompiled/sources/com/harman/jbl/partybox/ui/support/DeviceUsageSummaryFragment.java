package com.harman.jbl.partybox.ui.support;

import android.os.Bundle;
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
import com.harman.jbl.partybox.databinding.C1842a0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.BatteryInfo;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
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
import kotlin.jvm.internal.W;

@E(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b \u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J!\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0004R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/harman/jbl/partybox/ui/support/DeviceUsageSummaryFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lkotlin/H0;", "onBtnBackClick", "()V", "t0", "q0", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "initView", "handleOnBackPressed", "Lcom/harman/jbl/partybox/databinding/a0;", "Q0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "p0", "()Lcom/harman/jbl/partybox/databinding/a0;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "R0", "Lkotlin/A;", "r0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/ui/support/x;", "S0", "s0", "()Lcom/harman/jbl/partybox/ui/support/x;", "viewModel", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nDeviceUsageSummaryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceUsageSummaryFragment.kt\ncom/harman/jbl/partybox/ui/support/DeviceUsageSummaryFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,83:1\n66#2,4:84\n56#3,10:88\n*S KotlinDebug\n*F\n+ 1 DeviceUsageSummaryFragment.kt\ncom/harman/jbl/partybox/ui/support/DeviceUsageSummaryFragment\n*L\n26#1:84,4\n27#1:88,10\n*E\n"})
/* loaded from: classes2.dex */
public final class DeviceUsageSummaryFragment extends BackDispatcherFragment {

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f45567Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final A f45568R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private final A f45569S0;

    /* renamed from: T0, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f45565T0 = {N.u(new PropertyReference1Impl(DeviceUsageSummaryFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentDeviceUsageSummaryBinding;", 0))};

    @l3.d
    public static final a Companion = new a(null);

    /* renamed from: U0, reason: collision with root package name */
    @l3.d
    private static final String f45566U0 = "DeviceUsageSummaryFragment";

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final String a() {
            return DeviceUsageSummaryFragment.f45566U0;
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class b extends FunctionReferenceImpl implements X2.l<View, C1842a0> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f45574N = new b();

        b() {
            super(1, C1842a0.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentDeviceUsageSummaryBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final C1842a0 C(@l3.d View p02) {
            F.p(p02, "p0");
            return C1842a0.a(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements X2.l<Boolean, H0> {
        c() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Boolean bool) {
            c(bool);
            return H0.f51801a;
        }

        public final void c(Boolean bool) {
            BatteryInfo f4;
            Map<Integer, Integer> b4;
            Integer num;
            HmDevice k12 = DeviceUsageSummaryFragment.this.r0().k1();
            if (k12 != null && (f4 = k12.f()) != null && (b4 = f4.b()) != null) {
                DeviceUsageSummaryFragment deviceUsageSummaryFragment = DeviceUsageSummaryFragment.this;
                Integer num2 = b4.get(Integer.valueOf(BatteryInfo.FeatureType.TOTAL_POWER_ON_DURATION.f()));
                Integer num3 = b4.get(Integer.valueOf(BatteryInfo.FeatureType.TOTAL_PLAYBACK_TIME_DURATION.f()));
                Integer num4 = null;
                if (num2 != null) {
                    num = Integer.valueOf(num2.intValue() / 60);
                } else {
                    num = null;
                }
                F.n(num, "null cannot be cast to non-null type kotlin.Int");
                int intValue = num.intValue();
                if (num3 != null) {
                    num4 = Integer.valueOf(num3.intValue() / 60);
                }
                F.n(num4, "null cannot be cast to non-null type kotlin.Int");
                int intValue2 = num4.intValue();
                DecimalFormat decimalFormat = new DecimalFormat("###,###,###");
                String format = decimalFormat.format(Integer.valueOf(intValue));
                String format2 = decimalFormat.format(Integer.valueOf(intValue2));
                T1.a.a(DeviceUsageSummaryFragment.Companion.a() + " batteryStatus change,totalPowerHours:" + format + ", totalPlaybackHours:" + format2);
                TextView textView = deviceUsageSummaryFragment.p0().f39326J;
                W w3 = W.f52310a;
                String string = deviceUsageSummaryFragment.getString(j.m.Xa);
                F.o(string, "getString(...)");
                String format3 = String.format(string, Arrays.copyOf(new Object[]{String.valueOf(format2)}, 1));
                F.o(format3, "format(...)");
                textView.setText(format3);
                TextView textView2 = deviceUsageSummaryFragment.p0().f39327K;
                String string2 = deviceUsageSummaryFragment.getString(j.m.Xa);
                F.o(string2, "getString(...)");
                String format4 = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf(format)}, 1));
                F.o(format4, "format(...)");
                textView2.setText(format4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class d implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f45576a;

        d(X2.l function) {
            F.p(function, "function");
            this.f45576a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f45576a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f45576a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public DeviceUsageSummaryFragment() {
        super(j.i.f41434R);
        this.f45567Q0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f45574N);
        this.f45568R0 = ApplicationViewModelLazyKt.f(this, N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.support.DeviceUsageSummaryFragment$special$$inlined$viewModels$default$1
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
        this.f45569S0 = FragmentViewModelLazyKt.c(this, N.d(x.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.support.DeviceUsageSummaryFragment$special$$inlined$viewModels$default$2
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
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.support.DeviceUsageSummaryFragment$special$$inlined$viewModels$default$3
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

    private final void onBtnBackClick() {
        androidx.navigation.fragment.f.a(this).r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1842a0 p0() {
        return (C1842a0) this.f45567Q0.a(this, f45565T0[0]);
    }

    private final void q0() {
        HmDevice k12 = r0().k1();
        if (k12 != null) {
            s0().x(k12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.harman.jbl.partybox.ui.main.o r0() {
        return (com.harman.jbl.partybox.ui.main.o) this.f45568R0.getValue();
    }

    private final x s0() {
        return (x) this.f45569S0.getValue();
    }

    private final void t0() {
        s0().w().k(getViewLifecycleOwner(), new d(new c()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(DeviceUsageSummaryFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.onBtnBackClick();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    public final void initView() {
        C1842a0 p02 = p0();
        p02.f39323G.f38611G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.support.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceUsageSummaryFragment.u0(DeviceUsageSummaryFragment.this, view);
            }
        });
        p02.f39323G.f38613I.setText(getString(j.m.f41736c0));
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        initView();
        t0();
        q0();
    }
}
