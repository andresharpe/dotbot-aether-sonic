package com.harman.jbl.partybox.ui.group;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
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
import com.harman.jbl.partybox.databinding.C1853c1;
import com.harman.jbl.partybox.databinding.H1;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.group.k;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import com.harman.jbl.partybox.ui.party.stereo.D;
import com.harman.jbl.partybox.utils.q;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.BatteryInfo;
import com.harman.sdk.setting.ProductConfig;
import com.harman.sdk.utils.AudioChannel;
import com.harman.sdk.utils.DeviceRole;
import com.harman.sdk.utils.EnumIdentifyDevice;
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

@E(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 '2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b&\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0004J!\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0004R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcom/harman/jbl/partybox/ui/group/SpeakerInGroupFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lkotlin/H0;", "initData", "()V", "initView", "onBtnBackClick", "", "supportUrl", "w0", "(Ljava/lang/String;)V", "x0", "E0", "D0", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "handleOnBackPressed", "Lcom/harman/jbl/partybox/databinding/c1;", "Q0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "t0", "()Lcom/harman/jbl/partybox/databinding/c1;", "binding", "Lcom/harman/jbl/partybox/ui/group/l;", "R0", "Lkotlin/A;", "v0", "()Lcom/harman/jbl/partybox/ui/group/l;", "viewModel", "Lcom/harman/jbl/partybox/ui/main/o;", "S0", "u0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nSpeakerInGroupFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpeakerInGroupFragment.kt\ncom/harman/jbl/partybox/ui/group/SpeakerInGroupFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,237:1\n56#2,10:238\n66#3,4:248\n1#4:252\n*S KotlinDebug\n*F\n+ 1 SpeakerInGroupFragment.kt\ncom/harman/jbl/partybox/ui/group/SpeakerInGroupFragment\n*L\n38#1:238,10\n40#1:248,4\n*E\n"})
/* loaded from: classes2.dex */
public final class SpeakerInGroupFragment extends BackDispatcherFragment {

    @l3.d
    public static final String TAG = "SpeakerInGroupFragment";

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f43735Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final A f43736R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private final A f43737S0;

    /* renamed from: T0, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f43734T0 = {N.u(new PropertyReference1Impl(SpeakerInGroupFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentSpeakerInGroupBinding;", 0))};

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
    /* synthetic */ class b extends FunctionReferenceImpl implements X2.l<View, C1853c1> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f43742N = new b();

        b() {
            super(1, C1853c1.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentSpeakerInGroupBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final C1853c1 C(@l3.d View p02) {
            F.p(p02, "p0");
            return C1853c1.a(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements X2.l<AudioChannel, H0> {
        c() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(AudioChannel audioChannel) {
            c(audioChannel);
            return H0.f51801a;
        }

        public final void c(AudioChannel audioChannel) {
            T1.a.a("SpeakerInGroupFragment initObserver current device change:" + audioChannel);
            SpeakerInGroupFragment.this.E0();
            SpeakerInGroupFragment.this.D0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class d implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f43744a;

        d(X2.l function) {
            F.p(function, "function");
            this.f43744a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f43744a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f43744a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public SpeakerInGroupFragment() {
        super(j.i.f41427P0);
        this.f43735Q0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f43742N);
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.group.SpeakerInGroupFragment$special$$inlined$viewModels$default$1
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
        this.f43736R0 = FragmentViewModelLazyKt.c(this, N.d(l.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.group.SpeakerInGroupFragment$special$$inlined$viewModels$default$2
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
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.group.SpeakerInGroupFragment$special$$inlined$viewModels$default$3
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
        this.f43737S0 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A0(C1853c1 this_apply, LinearLayout this_apply$1, SpeakerInGroupFragment this$0, View view) {
        F.p(this_apply, "$this_apply");
        F.p(this_apply$1, "$this_apply$1");
        F.p(this$0, "this$0");
        this_apply.f39401M.setAlpha(0.5f);
        this_apply$1.setAlpha(1.0f);
        this_apply.f39402N.setVisibility(0);
        this_apply.f39407S.setVisibility(4);
        this$0.v0().Y(AudioChannel.STEREO_LEFT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B0(C1853c1 this_apply, LinearLayout this_apply$1, SpeakerInGroupFragment this$0, View view) {
        F.p(this_apply, "$this_apply");
        F.p(this_apply$1, "$this_apply$1");
        F.p(this$0, "this$0");
        this_apply.f39399K.setAlpha(0.5f);
        this_apply$1.setAlpha(1.0f);
        this_apply.f39402N.setVisibility(4);
        this_apply.f39407S.setVisibility(0);
        this$0.v0().Y(AudioChannel.STEREO_RIGHT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C0(SpeakerInGroupFragment this$0, View view) {
        String str;
        F.p(this$0, "this$0");
        HmDevice k12 = this$0.u0().k1();
        if (k12 != null) {
            ProductConfig.ProductItem u3 = com.harman.sdk.utils.d.u(((PartyBoxDevice) k12).q());
            if (u3 != null) {
                str = u3.k();
            } else {
                str = null;
            }
            this$0.w0(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D0() {
        boolean z3;
        String str;
        BatteryInfo batteryInfo;
        String str2;
        String str3;
        String string;
        C1853c1 t02 = t0();
        HmDevice k12 = u0().k1();
        if (k12 != null) {
            F.n(k12, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
            if (k12.i() == v0().V().f()) {
                z3 = true;
            } else {
                z3 = false;
            }
            T1.a.a("SpeakerInGroupFragment,isLeftChannel :" + z3);
            HmCustomFontTextView hmCustomFontTextView = t02.f39415a0;
            Object obj = "";
            if (z3) {
                str = k12.p();
            } else {
                HmDevice g4 = D.f45020a.g(partyBoxDevice);
                if (g4 != null) {
                    str = g4.p();
                    if (str == null) {
                        str = "";
                    }
                } else {
                    str = null;
                }
            }
            hmCustomFontTextView.setText(str);
            if (z3) {
                batteryInfo = k12.f();
            } else {
                Object obj2 = partyBoxDevice.l1().get("Device_Battery");
                if (obj2 != null) {
                    batteryInfo = (BatteryInfo) obj2;
                } else {
                    batteryInfo = new BatteryInfo();
                }
            }
            if (batteryInfo != null) {
                t02.f39394F.c(batteryInfo, "");
            }
            t02.f39406R.setText(com.harman.sdk.utils.d.v(k12.q()));
            HmCustomFontTextView hmCustomFontTextView2 = t02.f39409U;
            if (z3) {
                str2 = partyBoxDevice.n1();
            } else {
                Object obj3 = partyBoxDevice.l1().get("Serial_Number");
                if (obj3 == null) {
                    obj3 = "";
                }
                F.n(obj3, "null cannot be cast to non-null type kotlin.String");
                str2 = (String) obj3;
            }
            hmCustomFontTextView2.setText(str2);
            HmCustomFontTextView hmCustomFontTextView3 = t02.f39403O;
            if (z3) {
                str3 = k12.n();
            } else {
                Object obj4 = partyBoxDevice.l1().get("Mac_Address");
                if (obj4 == null) {
                    obj4 = "";
                }
                F.n(obj4, "null cannot be cast to non-null type kotlin.String");
                str3 = (String) obj4;
            }
            hmCustomFontTextView3.setText(str3);
            if (z3) {
                string = getString(j.m.t9, k12.w());
            } else {
                Object obj5 = partyBoxDevice.l1().get("Firmware_Version");
                if (obj5 != null) {
                    obj = obj5;
                }
                F.n(obj, "null cannot be cast to non-null type kotlin.String");
                string = getString(j.m.t9, (String) obj);
            }
            F.m(string);
            t02.f39414Z.setText(string);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E0() {
        DeviceRole deviceRole;
        int i4;
        Integer num;
        int i5;
        HmDevice k12 = u0().k1();
        if (k12 != null) {
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
            T1.a.a("SpeakerInGroupFragment channel:" + k12.i());
            DeviceRole J3 = k12.J();
            DeviceRole deviceRole2 = DeviceRole.MASTER;
            boolean z3 = false;
            H0 h02 = null;
            if (J3 == deviceRole2) {
                if (k12.i() == v0().V().f()) {
                    z3 = true;
                }
                HmCustomFontTextView hmCustomFontTextView = t0().f39416b0;
                if (z3) {
                    i5 = j.m.f41754f3;
                } else {
                    i5 = j.m.G5;
                }
                hmCustomFontTextView.setText(getString(i5));
            } else {
                HmDevice g4 = D.f45020a.g(partyBoxDevice);
                if (g4 != null) {
                    deviceRole = g4.J();
                } else {
                    deviceRole = null;
                }
                if (deviceRole == deviceRole2) {
                    if (k12.i() == v0().V().f()) {
                        z3 = true;
                    }
                    HmCustomFontTextView hmCustomFontTextView2 = t0().f39416b0;
                    if (z3) {
                        i4 = j.m.G5;
                    } else {
                        i4 = j.m.f41754f3;
                    }
                    hmCustomFontTextView2.setText(getString(i4));
                } else {
                    t0().f39416b0.setText(getString(j.m.G5));
                }
            }
            Context context = getContext();
            if (context != null) {
                int r4 = com.harman.sdk.utils.d.r(context, k12.q(), k12.o());
                HmDevice g5 = D.f45020a.g(partyBoxDevice);
                if (g5 != null) {
                    Context context2 = getContext();
                    if (context2 != null) {
                        num = Integer.valueOf(com.harman.sdk.utils.d.r(context2, g5.q(), g5.o()));
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        if (k12.i() == AudioChannel.STEREO_LEFT) {
                            t0().f39397I.setImageResource(r4);
                            t0().f39398J.setImageResource(num.intValue());
                        } else {
                            t0().f39397I.setImageResource(num.intValue());
                            t0().f39398J.setImageResource(r4);
                        }
                        h02 = H0.f51801a;
                    }
                    if (h02 == null) {
                        t0().f39397I.setImageResource(r4);
                        t0().f39398J.setImageResource(r4);
                    }
                    h02 = H0.f51801a;
                }
                if (h02 == null) {
                    t0().f39397I.setImageResource(r4);
                    t0().f39398J.setImageResource(r4);
                }
            }
        }
    }

    private final void initData() {
        v0().Y(AudioChannel.STEREO_LEFT);
    }

    private final void initView() {
        H1 h12 = t0().f39395G;
        h12.f38691H.setText(getString(j.m.K5));
        h12.f38689F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.group.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpeakerInGroupFragment.y0(SpeakerInGroupFragment.this, view);
            }
        });
        h12.f38692I.setVisibility(4);
        final C1853c1 t02 = t0();
        final LinearLayout linearLayout = t02.f39399K;
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.group.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpeakerInGroupFragment.A0(C1853c1.this, linearLayout, this, view);
            }
        });
        final LinearLayout linearLayout2 = t02.f39401M;
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.group.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpeakerInGroupFragment.B0(C1853c1.this, linearLayout2, this, view);
            }
        });
        t02.f39400L.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.group.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpeakerInGroupFragment.C0(SpeakerInGroupFragment.this, view);
            }
        });
        t02.f39416b0.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.group.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpeakerInGroupFragment.z0(SpeakerInGroupFragment.this, view);
            }
        });
    }

    private final void onBtnBackClick() {
        androidx.navigation.fragment.f.a(this).r0();
    }

    private final C1853c1 t0() {
        return (C1853c1) this.f43735Q0.a(this, f43734T0[0]);
    }

    private final o u0() {
        return (o) this.f43737S0.getValue();
    }

    private final l v0() {
        return (l) this.f43736R0.getValue();
    }

    private final void w0(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        ActivityInfo resolveActivityInfo = intent.resolveActivityInfo(requireContext().getPackageManager(), 65536);
        if (resolveActivityInfo != null && resolveActivityInfo.exported) {
            startActivity(intent);
        } else {
            T1.a.a("SpeakerInGroupFragment app did not find any browser");
        }
    }

    private final void x0() {
        v0().V().k(getViewLifecycleOwner(), new d(new c()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y0(SpeakerInGroupFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.onBtnBackClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z0(SpeakerInGroupFragment this$0, View view) {
        AudioChannel audioChannel;
        EnumIdentifyDevice enumIdentifyDevice;
        EnumIdentifyDevice enumIdentifyDevice2;
        int i4;
        F.p(this$0, "this$0");
        if (com.harman.jbl.partybox.utils.g.b()) {
            return;
        }
        HmDevice k12 = this$0.u0().k1();
        if (k12 != null) {
            audioChannel = k12.i();
        } else {
            audioChannel = null;
        }
        AudioChannel f4 = this$0.v0().V().f();
        if (audioChannel == f4) {
            enumIdentifyDevice = EnumIdentifyDevice.REPEAT;
        } else {
            enumIdentifyDevice = EnumIdentifyDevice.OFF;
        }
        if (audioChannel != f4) {
            enumIdentifyDevice2 = EnumIdentifyDevice.REPEAT;
        } else {
            enumIdentifyDevice2 = EnumIdentifyDevice.OFF;
        }
        HmDevice k13 = this$0.u0().k1();
        if (k13 != null) {
            this$0.v0().W(k13, enumIdentifyDevice, enumIdentifyDevice2);
        }
        k.a a4 = k.a();
        F.o(a4, "actionToIdentityDialogFragment(...)");
        if (f4 == AudioChannel.STEREO_LEFT) {
            i4 = 0;
        } else {
            i4 = 1;
        }
        a4.b(i4);
        q.f(this$0, a4);
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        initView();
        x0();
        initData();
    }
}
