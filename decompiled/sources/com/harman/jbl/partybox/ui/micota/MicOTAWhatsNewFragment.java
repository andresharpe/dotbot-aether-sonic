package com.harman.jbl.partybox.ui.micota;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.C0669d;
import androidx.fragment.app.ActivityC0889g;
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
import com.harman.jbl.partybox.databinding.H0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.micota.p;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.BatteryInfo;
import com.harman.sdk.message.WirelessMicInfo;
import com.harman.sdk.ota.RemoteOTAConfig;
import java.util.Map;
import kotlin.A;
import kotlin.E;
import kotlin.InterfaceC2229v;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.U;
import kotlin.text.C2220b;

@E(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b*\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0004J!\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0004R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006-"}, d2 = {"Lcom/harman/jbl/partybox/ui/micota/MicOTAWhatsNewFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lkotlin/H0;", "onBtnBackClick", "()V", "A0", "x0", "q0", "Lcom/harman/sdk/device/PartyBoxDevice;", "", "r0", "(Lcom/harman/sdk/device/PartyBoxDevice;)Z", "y0", "z0", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "handleOnBackPressed", "Lcom/harman/jbl/partybox/databinding/H0;", "Q0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "s0", "()Lcom/harman/jbl/partybox/databinding/H0;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "R0", "Lkotlin/A;", "t0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/ui/micota/l;", "S0", "u0", "()Lcom/harman/jbl/partybox/ui/micota/l;", "micOTAViewModel", "", "T0", "Ljava/lang/String;", "currentLanguageString", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nMicOTAWhatsNewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MicOTAWhatsNewFragment.kt\ncom/harman/jbl/partybox/ui/micota/MicOTAWhatsNewFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,215:1\n66#2,4:216\n56#3,10:220\n*S KotlinDebug\n*F\n+ 1 MicOTAWhatsNewFragment.kt\ncom/harman/jbl/partybox/ui/micota/MicOTAWhatsNewFragment\n*L\n28#1:216,4\n29#1:220,10\n*E\n"})
/* loaded from: classes2.dex */
public final class MicOTAWhatsNewFragment extends BackDispatcherFragment {

    @l3.d
    public static final String TAG = "MicOTAWhatsNewFragment";

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f44254Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final A f44255R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private final A f44256S0;

    /* renamed from: T0, reason: collision with root package name */
    @l3.d
    private String f44257T0;

    /* renamed from: U0, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f44253U0 = {N.u(new PropertyReference1Impl(MicOTAWhatsNewFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentMicOtaWhatsNewBinding;", 0))};

    @l3.d
    public static final a Companion = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class b extends FunctionReferenceImpl implements X2.l<View, H0> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f44262N = new b();

        b() {
            super(1, H0.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentMicOtaWhatsNewBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final H0 C(@l3.d View p02) {
            F.p(p02, "p0");
            return H0.a(p02);
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends Lambda implements X2.l<HmDevice, kotlin.H0> {
        c() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(HmDevice hmDevice) {
            c(hmDevice);
            return kotlin.H0.f51801a;
        }

        public final void c(HmDevice hmDevice) {
            MicOTAWhatsNewFragment.this.q0();
        }
    }

    /* loaded from: classes2.dex */
    static final class d extends Lambda implements X2.l<kotlin.H0, kotlin.H0> {
        d() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(kotlin.H0 h02) {
            c(h02);
            return kotlin.H0.f51801a;
        }

        public final void c(kotlin.H0 h02) {
            T1.a.a("MicOTAWhatsNewFragment micConnectInfoLiveData observe");
            MicOTAWhatsNewFragment.this.q0();
        }
    }

    /* loaded from: classes2.dex */
    static final class e extends Lambda implements X2.l<Boolean, kotlin.H0> {
        e() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(Boolean bool) {
            c(bool);
            return kotlin.H0.f51801a;
        }

        public final void c(Boolean bool) {
            MicOTAWhatsNewFragment micOTAWhatsNewFragment = MicOTAWhatsNewFragment.this;
            p.a a4 = p.a();
            F.o(a4, "actionWhatsNewToMicOTAUpgradeFragment(...)");
            com.harman.jbl.partybox.utils.q.f(micOTAWhatsNewFragment, a4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class f extends Lambda implements X2.l<Map<String, ? extends RemoteOTAConfig.WhatsNewItem>, kotlin.H0> {
        f() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(Map<String, ? extends RemoteOTAConfig.WhatsNewItem> map) {
            c(map);
            return kotlin.H0.f51801a;
        }

        public final void c(@l3.d Map<String, RemoteOTAConfig.WhatsNewItem> whatsNew) {
            F.p(whatsNew, "whatsNew");
            MicOTAWhatsNewFragment.this.A0();
        }
    }

    /* loaded from: classes2.dex */
    static final class g implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f44267a;

        g(X2.l function) {
            F.p(function, "function");
            this.f44267a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f44267a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f44267a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public MicOTAWhatsNewFragment() {
        super(j.i.f41555v0);
        this.f44254Q0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f44262N);
        this.f44255R0 = ApplicationViewModelLazyKt.f(this, N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.micota.MicOTAWhatsNewFragment$special$$inlined$viewModels$default$1
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
        this.f44256S0 = FragmentViewModelLazyKt.c(this, N.d(l.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.micota.MicOTAWhatsNewFragment$special$$inlined$viewModels$default$2
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
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.micota.MicOTAWhatsNewFragment$special$$inlined$viewModels$default$3
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
        this.f44257T0 = "en";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A0() {
        String str;
        RemoteOTAConfig H3;
        if (isAdded()) {
            com.harman.jbl.partybox.utils.m mVar = com.harman.jbl.partybox.utils.m.f46192a;
            Resources resources = getResources();
            F.o(resources, "getResources(...)");
            this.f44257T0 = mVar.a(resources);
            HmDevice k12 = t0().k1();
            if (k12 != null && (H3 = k12.H()) != null) {
                str = u0().e0(this.f44257T0, H3.g());
            } else {
                str = null;
            }
            if (str != null) {
                s0().f38680N.setText(str);
            }
        }
    }

    private final void onBtnBackClick() {
        androidx.navigation.fragment.f.a(this).r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0() {
        PartyBoxDevice partyBoxDevice;
        int a4;
        Integer num;
        int a5;
        WirelessMicInfo v12;
        Integer num2;
        int a6;
        HmDevice k12 = t0().k1();
        Integer num3 = null;
        if (k12 instanceof PartyBoxDevice) {
            partyBoxDevice = (PartyBoxDevice) k12;
        } else {
            partyBoxDevice = null;
        }
        if (partyBoxDevice != null) {
            WirelessMicInfo v13 = partyBoxDevice.v1();
            if (v13 != null && com.harman.jbl.partybox.firmware.d.f40541a.a(v13)) {
                ImageView imageView = s0().f38675I;
                WirelessMicInfo v14 = partyBoxDevice.v1();
                if (v14 != null) {
                    num2 = Integer.valueOf(v14.e());
                } else {
                    num2 = null;
                }
                String o4 = partyBoxDevice.o();
                if (o4 != null) {
                    a6 = C2220b.a(16);
                    num3 = Integer.valueOf(Integer.parseInt(o4, a6));
                }
                imageView.setImageResource(w.a(num2, num3));
            } else {
                WirelessMicInfo v15 = partyBoxDevice.v1();
                if (v15 != null && com.harman.jbl.partybox.firmware.d.f40541a.b(v15)) {
                    ImageView imageView2 = s0().f38675I;
                    WirelessMicInfo v16 = partyBoxDevice.v1();
                    if (v16 != null) {
                        num = Integer.valueOf(v16.j());
                    } else {
                        num = null;
                    }
                    String o5 = partyBoxDevice.o();
                    if (o5 != null) {
                        a5 = C2220b.a(16);
                        num3 = Integer.valueOf(Integer.parseInt(o5, a5));
                    }
                    imageView2.setImageResource(w.a(num, num3));
                } else {
                    ImageView imageView3 = s0().f38675I;
                    String o6 = partyBoxDevice.o();
                    if (o6 != null) {
                        a4 = C2220b.a(16);
                        num3 = Integer.valueOf(Integer.parseInt(o6, a4));
                    }
                    imageView3.setImageResource(w.a(3, num3));
                }
            }
            if (!partyBoxDevice.D1() && r0(partyBoxDevice) && (v12 = partyBoxDevice.v1()) != null && com.harman.jbl.partybox.firmware.d.f40541a.c(v12)) {
                z0();
            } else {
                y0();
            }
        }
    }

    private final boolean r0(PartyBoxDevice partyBoxDevice) {
        BatteryInfo f4 = partyBoxDevice.f();
        if (f4 == null) {
            return false;
        }
        if (!f4.a() && !f4.d() && f4.c() < 30) {
            return false;
        }
        return true;
    }

    private final H0 s0() {
        return (H0) this.f44254Q0.a(this, f44253U0[0]);
    }

    private final com.harman.jbl.partybox.ui.main.o t0() {
        return (com.harman.jbl.partybox.ui.main.o) this.f44255R0.getValue();
    }

    private final l u0() {
        return (l) this.f44256S0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(MicOTAWhatsNewFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.onBtnBackClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(MicOTAWhatsNewFragment this$0, View view) {
        HmDevice k12;
        F.p(this$0, "this$0");
        if (!com.harman.jbl.partybox.utils.g.c(1000L) && (k12 = this$0.t0().k1()) != null) {
            this$0.u0().k0(k12);
        }
    }

    private final void x0() {
        HmDevice k12 = t0().k1();
        if (k12 != null && (k12 instanceof PartyBoxDevice)) {
            u0().c0((PartyBoxDevice) k12, new f());
            com.harman.log.f.a(TAG, "requestWhatsNew called");
        }
    }

    private final void y0() {
        WirelessMicInfo v12;
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            s0().f38684R.setEnabled(false);
            s0().f38684R.setBackground(C0669d.i(activity, j.f.f41112v));
            s0().f38684R.setTextColor(C0669d.f(activity, j.d.f40755h1));
            Group groupCondition = s0().f38672F;
            F.o(groupCondition, "groupCondition");
            com.harman.jbl.partybox.utils.q.i(groupCondition);
            s0().f38676J.setImageResource(j.f.f41000X2);
            s0().f38677K.setImageResource(j.f.f41000X2);
            s0().f38678L.setImageResource(j.f.f41000X2);
            HmDevice k12 = t0().k1();
            if (k12 != null) {
                F.n(k12, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
                PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
                WirelessMicInfo v13 = partyBoxDevice.v1();
                if (v13 != null && v13.m() > 0) {
                    s0().f38676J.setImageResource(j.f.f40996W2);
                }
                if (r0(partyBoxDevice) && (v12 = partyBoxDevice.v1()) != null && com.harman.jbl.partybox.firmware.d.f40541a.c(v12)) {
                    s0().f38677K.setImageResource(j.f.f40996W2);
                }
                if (!partyBoxDevice.D1()) {
                    s0().f38678L.setImageResource(j.f.f40996W2);
                }
            }
        }
    }

    private final void z0() {
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            s0().f38684R.setEnabled(true);
            s0().f38684R.setBackground(C0669d.i(activity, j.f.f41104t));
            s0().f38684R.setTextColor(C0669d.f(activity, j.d.f40749f1));
            s0().f38676J.setImageResource(j.f.f40996W2);
            s0().f38677K.setImageResource(j.f.f40996W2);
            s0().f38678L.setImageResource(j.f.f40996W2);
        }
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x011c  */
    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(@l3.d android.view.View r4, @l3.e android.os.Bundle r5) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.micota.MicOTAWhatsNewFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
