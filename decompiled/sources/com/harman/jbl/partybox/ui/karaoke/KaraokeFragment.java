package com.harman.jbl.partybox.ui.karaoke;

import X2.l;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.C0;
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
import com.harman.jbl.partybox.databinding.C1951w0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomScrollUpSeekbar;
import com.harman.jbl.partybox.ui.customviews.HmCustomUpDownSeekBar;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import com.harman.jbl.partybox.ui.widget.BatteryView;
import com.harman.jbl.partybox.utils.q;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.BatteryInfo;
import com.harman.sdk.message.KaraokeMicEQInfo;
import com.harman.sdk.message.WirelessMicInfo;
import java.util.Arrays;
import java.util.Locale;
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
import kotlin.reflect.n;

@E(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 72\u00020\u00012\u00020\u00022\u00020\u0003:\u00018B\u0007¢\u0006\u0004\b6\u0010\u0011J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J!\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u0011J!\u0010\u001c\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001f\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u00104¨\u00069"}, d2 = {"Lcom/harman/jbl/partybox/ui/karaoke/KaraokeFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lcom/harman/jbl/partybox/ui/customviews/HmCustomUpDownSeekBar$b;", "Lcom/harman/jbl/partybox/ui/customviews/HmCustomScrollUpSeekbar$b;", "", C0.f11537F0, "Lcom/harman/sdk/message/WirelessMicInfo;", "wirelessMicInfo", "", "deviceMid", "Lkotlin/H0;", "A0", "(ILcom/harman/sdk/message/WirelessMicInfo;Ljava/lang/String;)V", "genVersion", "t0", "(ILjava/lang/String;)I", "onBtnBackClick", "()V", "y0", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "handleOnBackPressed", "tagValue", "value", "setEcoValue", "(Ljava/lang/String;I)V", "seekbarTxtValue", "setValue", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/harman/sdk/device/PartyBoxDevice;", "device", "setKaraokeValues", "(Lcom/harman/sdk/device/PartyBoxDevice;)V", "Lcom/harman/jbl/partybox/databinding/w0;", "Q0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "r0", "()Lcom/harman/jbl/partybox/databinding/w0;", "binding", "Lcom/harman/jbl/partybox/ui/karaoke/g;", "R0", "Lkotlin/A;", "v0", "()Lcom/harman/jbl/partybox/ui/karaoke/g;", "viewModel", "Lcom/harman/jbl/partybox/ui/main/o;", "S0", "s0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nKaraokeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KaraokeFragment.kt\ncom/harman/jbl/partybox/ui/karaoke/KaraokeFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,325:1\n56#2,10:326\n66#3,4:336\n262#4,2:340\n1#5:342\n*S KotlinDebug\n*F\n+ 1 KaraokeFragment.kt\ncom/harman/jbl/partybox/ui/karaoke/KaraokeFragment\n*L\n34#1:326,10\n35#1:336,4\n291#1:340,2\n*E\n"})
/* loaded from: classes2.dex */
public final class KaraokeFragment extends BackDispatcherFragment implements HmCustomUpDownSeekBar.b, HmCustomScrollUpSeekbar.b {

    @l3.d
    public static final String TAG = "KaraokeFragment";

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f43845Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final A f43846R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private final A f43847S0;

    /* renamed from: T0, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f43844T0 = {N.u(new PropertyReference1Impl(KaraokeFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentKaraokeBinding;", 0))};

    @l3.d
    public static final a Companion = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final KaraokeFragment a() {
            return new KaraokeFragment();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class b extends FunctionReferenceImpl implements l<View, C1951w0> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f43852N = new b();

        b() {
            super(1, C1951w0.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentKaraokeBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final C1951w0 C(@l3.d View p02) {
            F.p(p02, "p0");
            return C1951w0.a(p02);
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends Lambda implements l<PartyBoxDevice, H0> {
        c() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(PartyBoxDevice partyBoxDevice) {
            c(partyBoxDevice);
            return H0.f51801a;
        }

        public final void c(PartyBoxDevice partyBoxDevice) {
            PartyBoxDevice partyBoxDevice2;
            int d12;
            HmDevice k12 = KaraokeFragment.this.s0().k1();
            if (k12 instanceof PartyBoxDevice) {
                partyBoxDevice2 = (PartyBoxDevice) k12;
            } else {
                partyBoxDevice2 = null;
            }
            if (partyBoxDevice2 != null) {
                KaraokeFragment karaokeFragment = KaraokeFragment.this;
                WirelessMicInfo v12 = partyBoxDevice2.v1();
                if (v12 != null) {
                    d12 = v12.m();
                } else {
                    d12 = partyBoxDevice2.d1();
                }
                com.harman.log.f.a(KaraokeFragment.TAG, "KaraokeFragment connectDeviceLiveData observe: wirelessMicInfo = " + partyBoxDevice2.v1() + " micConnectStatus = " + d12);
                karaokeFragment.setKaraokeValues(partyBoxDevice2);
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class d extends Lambda implements l<H0, H0> {
        d() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(H0 h02) {
            c(h02);
            return H0.f51801a;
        }

        public final void c(H0 h02) {
            int d12;
            com.harman.log.f.a(KaraokeFragment.TAG, " KaraokeFragment micConnectInfoLiveData observe");
            KaraokeFragment.this.y0();
            HmDevice k12 = KaraokeFragment.this.s0().k1();
            if (k12 != null) {
                KaraokeFragment karaokeFragment = KaraokeFragment.this;
                if (k12 instanceof PartyBoxDevice) {
                    PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
                    WirelessMicInfo v12 = partyBoxDevice.v1();
                    if (v12 != null) {
                        d12 = v12.m();
                    } else {
                        d12 = partyBoxDevice.d1();
                    }
                    com.harman.log.f.a(KaraokeFragment.TAG, "KaraokeFragment micConnectInfoLiveData observe: wirelessMicInfo = " + partyBoxDevice.v1() + " micConnectStatus = " + d12);
                    karaokeFragment.A0(d12, partyBoxDevice.v1(), k12.o());
                    if (com.harman.sdk.utils.d.G(k12) && d12 != 0) {
                        karaokeFragment.v0().c0(k12);
                    }
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class e implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f43855a;

        e(l function) {
            F.p(function, "function");
            this.f43855a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f43855a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f43855a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public KaraokeFragment() {
        super(j.i.f41515l0);
        this.f43845Q0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f43852N);
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.karaoke.KaraokeFragment$special$$inlined$viewModels$default$1
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
        this.f43846R0 = FragmentViewModelLazyKt.c(this, N.d(g.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.karaoke.KaraokeFragment$special$$inlined$viewModels$default$2
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
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.karaoke.KaraokeFragment$special$$inlined$viewModels$default$3
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
        this.f43847S0 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A0(int i4, WirelessMicInfo wirelessMicInfo, String str) {
        String str2;
        H0 h02;
        com.harman.log.f.a(TAG, "KaraokeFragment updateMicConnectionView: " + i4);
        H0 h03 = null;
        if (wirelessMicInfo != null) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        r0().f40266L.setImageResource(j.f.j6);
                        ImageView ivIconMic2 = r0().f40267M;
                        F.o(ivIconMic2, "ivIconMic2");
                        q.c(ivIconMic2);
                        ImageView ivIconMic1 = r0().f40266L;
                        F.o(ivIconMic1, "ivIconMic1");
                        q.i(ivIconMic1);
                        BatteryView mic1BatteryView = r0().f40269O;
                        F.o(mic1BatteryView, "mic1BatteryView");
                        q.d(mic1BatteryView);
                        BatteryView mic2BatteryView = r0().f40270P;
                        F.o(mic2BatteryView, "mic2BatteryView");
                        q.d(mic2BatteryView);
                        r0().f40261G.U();
                        r0().f40263I.U();
                        r0().f40262H.U();
                    } else {
                        ImageView ivIconMic12 = r0().f40266L;
                        F.o(ivIconMic12, "ivIconMic1");
                        q.i(ivIconMic12);
                        ImageView ivIconMic22 = r0().f40267M;
                        F.o(ivIconMic22, "ivIconMic2");
                        q.i(ivIconMic22);
                        ImageView imageView = r0().f40266L;
                        int e4 = wirelessMicInfo.e();
                        if (wirelessMicInfo.d() != 0) {
                            W w3 = W.f52310a;
                            str2 = String.format(Locale.CHINA, "%02X", Arrays.copyOf(new Object[]{Integer.valueOf(wirelessMicInfo.d())}, 1));
                            F.o(str2, "format(...)");
                        } else {
                            str2 = str;
                        }
                        imageView.setImageResource(t0(e4, str2));
                        ImageView imageView2 = r0().f40267M;
                        int j4 = wirelessMicInfo.j();
                        if (wirelessMicInfo.i() != 0) {
                            W w4 = W.f52310a;
                            str = String.format(Locale.CHINA, "%02X", Arrays.copyOf(new Object[]{Integer.valueOf(wirelessMicInfo.i())}, 1));
                            F.o(str, "format(...)");
                        }
                        imageView2.setImageResource(t0(j4, str));
                        BatteryInfo g4 = wirelessMicInfo.g();
                        if (g4 != null) {
                            BatteryView mic1BatteryView2 = r0().f40269O;
                            F.o(mic1BatteryView2, "mic1BatteryView");
                            q.i(mic1BatteryView2);
                            r0().f40269O.c(g4, null);
                            h02 = H0.f51801a;
                        } else {
                            h02 = null;
                        }
                        if (h02 == null) {
                            BatteryView mic1BatteryView3 = r0().f40269O;
                            F.o(mic1BatteryView3, "mic1BatteryView");
                            q.d(mic1BatteryView3);
                        }
                        BatteryInfo l4 = wirelessMicInfo.l();
                        if (l4 != null) {
                            BatteryView mic2BatteryView2 = r0().f40270P;
                            F.o(mic2BatteryView2, "mic2BatteryView");
                            q.i(mic2BatteryView2);
                            r0().f40270P.c(l4, null);
                            h03 = H0.f51801a;
                        }
                        if (h03 == null) {
                            BatteryView mic2BatteryView3 = r0().f40270P;
                            F.o(mic2BatteryView3, "mic2BatteryView");
                            q.d(mic2BatteryView3);
                        }
                    }
                } else {
                    ImageView imageView3 = r0().f40266L;
                    int j5 = wirelessMicInfo.j();
                    if (wirelessMicInfo.i() != 0) {
                        W w5 = W.f52310a;
                        str = String.format(Locale.CHINA, "%02X", Arrays.copyOf(new Object[]{Integer.valueOf(wirelessMicInfo.i())}, 1));
                        F.o(str, "format(...)");
                    }
                    imageView3.setImageResource(t0(j5, str));
                    ImageView ivIconMic23 = r0().f40267M;
                    F.o(ivIconMic23, "ivIconMic2");
                    q.c(ivIconMic23);
                    ImageView ivIconMic13 = r0().f40266L;
                    F.o(ivIconMic13, "ivIconMic1");
                    q.i(ivIconMic13);
                    BatteryInfo l5 = wirelessMicInfo.l();
                    if (l5 != null) {
                        BatteryView mic1BatteryView4 = r0().f40269O;
                        F.o(mic1BatteryView4, "mic1BatteryView");
                        q.i(mic1BatteryView4);
                        r0().f40269O.c(l5, null);
                        h03 = H0.f51801a;
                    }
                    if (h03 == null) {
                        BatteryView mic1BatteryView5 = r0().f40269O;
                        F.o(mic1BatteryView5, "mic1BatteryView");
                        q.d(mic1BatteryView5);
                    }
                    BatteryView mic2BatteryView4 = r0().f40270P;
                    F.o(mic2BatteryView4, "mic2BatteryView");
                    q.d(mic2BatteryView4);
                }
            } else {
                ImageView imageView4 = r0().f40266L;
                int e5 = wirelessMicInfo.e();
                if (wirelessMicInfo.d() != 0) {
                    W w6 = W.f52310a;
                    str = String.format(Locale.CHINA, "%02X", Arrays.copyOf(new Object[]{Integer.valueOf(wirelessMicInfo.d())}, 1));
                    F.o(str, "format(...)");
                }
                imageView4.setImageResource(t0(e5, str));
                ImageView ivIconMic24 = r0().f40267M;
                F.o(ivIconMic24, "ivIconMic2");
                q.c(ivIconMic24);
                ImageView ivIconMic14 = r0().f40266L;
                F.o(ivIconMic14, "ivIconMic1");
                q.i(ivIconMic14);
                BatteryInfo g5 = wirelessMicInfo.g();
                if (g5 != null) {
                    BatteryView mic1BatteryView6 = r0().f40269O;
                    F.o(mic1BatteryView6, "mic1BatteryView");
                    q.i(mic1BatteryView6);
                    r0().f40269O.c(g5, null);
                    h03 = H0.f51801a;
                }
                if (h03 == null) {
                    BatteryView mic1BatteryView7 = r0().f40269O;
                    F.o(mic1BatteryView7, "mic1BatteryView");
                    q.d(mic1BatteryView7);
                }
                BatteryView mic2BatteryView5 = r0().f40270P;
                F.o(mic2BatteryView5, "mic2BatteryView");
                q.d(mic2BatteryView5);
            }
            h03 = H0.f51801a;
        }
        if (h03 == null) {
            ImageView ivIconMic15 = r0().f40266L;
            F.o(ivIconMic15, "ivIconMic1");
            q.i(ivIconMic15);
            r0().f40266L.setImageResource(j.f.j6);
            ImageView ivIconMic25 = r0().f40267M;
            F.o(ivIconMic25, "ivIconMic2");
            q.c(ivIconMic25);
            BatteryView mic1BatteryView8 = r0().f40269O;
            F.o(mic1BatteryView8, "mic1BatteryView");
            q.d(mic1BatteryView8);
            BatteryView mic2BatteryView6 = r0().f40270P;
            F.o(mic2BatteryView6, "mic2BatteryView");
            q.d(mic2BatteryView6);
            if (i4 == 0) {
                r0().f40261G.U();
                r0().f40263I.U();
                r0().f40262H.U();
            }
        }
    }

    static /* synthetic */ void B0(KaraokeFragment karaokeFragment, int i4, WirelessMicInfo wirelessMicInfo, String str, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            str = "01";
        }
        karaokeFragment.A0(i4, wirelessMicInfo, str);
    }

    private final void onBtnBackClick() {
        androidx.navigation.fragment.f.a(this).r0();
    }

    private final C1951w0 r0() {
        return (C1951w0) this.f43845Q0.a(this, f43844T0[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o s0() {
        return (o) this.f43847S0.getValue();
    }

    private final int t0(int i4, String str) {
        if (i4 != 3) {
            if (i4 != 4) {
                if (i4 != 5) {
                    return j.f.j6;
                }
                return j.f.n6;
            }
            return j.f.m6;
        }
        if (F.g(str, "04")) {
            return j.f.l6;
        }
        return j.f.k6;
    }

    static /* synthetic */ int u0(KaraokeFragment karaokeFragment, int i4, String str, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str = "01";
        }
        return karaokeFragment.t0(i4, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g v0() {
        return (g) this.f43846R0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w0(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(KaraokeFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.onBtnBackClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0() {
        int d12;
        boolean z3;
        com.harman.log.f.a(TAG, " KaraokeFragment micConnectInfoLiveData setupMaskView");
        HmDevice k12 = s0().k1();
        if (k12 != null) {
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
            if (!com.harman.sdk.utils.d.G(k12)) {
                com.harman.log.f.a(TAG, " KaraokeFragment setupMaskView return " + k12.q());
                return;
            }
            WirelessMicInfo v12 = partyBoxDevice.v1();
            if (v12 != null) {
                d12 = v12.m();
            } else {
                d12 = partyBoxDevice.d1();
            }
            com.harman.log.f.a(TAG, " KaraokeFragment setupMaskView:" + d12);
            int i4 = 8;
            if (d12 == 0) {
                r0().f40274T.setVisibility(0);
                r0().f40274T.setOnTouchListener(new View.OnTouchListener() { // from class: com.harman.jbl.partybox.ui.karaoke.c
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        boolean z02;
                        z02 = KaraokeFragment.z0(view, motionEvent);
                        return z02;
                    }
                });
            } else {
                r0().f40274T.setVisibility(8);
                r0().f40274T.setOnClickListener(null);
            }
            ConstraintLayout layoutNoMick = r0().f40268N;
            F.o(layoutNoMick, "layoutNoMick");
            if (d12 == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                i4 = 0;
            }
            layoutNoMick.setVisibility(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z0(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        H0 h02;
        int d12;
        int d13;
        String w3;
        String q4;
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        HmDevice k12 = s0().k1();
        if (k12 != null && (q4 = k12.q()) != null) {
            r0().f40261G.setDevicePid(q4);
            r0().f40262H.setDevicePid(q4);
            r0().f40263I.setDevicePid(q4);
        }
        HmDevice k13 = s0().k1();
        if (k13 != null && (w3 = k13.w()) != null) {
            r0().f40261G.setFirmwareVer(w3);
            r0().f40262H.setFirmwareVer(w3);
            r0().f40263I.setFirmwareVer(w3);
        }
        y0();
        C1951w0 r02 = r0();
        r02.f40261G.setSubHdrValue(com.harman.jbl.partybox.constants.a.f38347a0);
        r02.f40263I.setSubHdrValue(com.harman.jbl.partybox.constants.a.f38349b0);
        r02.f40262H.setSubHdrValue(com.harman.jbl.partybox.constants.a.f38351c0);
        HmDevice k14 = s0().k1();
        if (k14 != null) {
            if (com.harman.sdk.utils.d.G(k14)) {
                r02.f40264J.f38613I.setText(getString(j.m.f41631C1));
            } else {
                r02.f40264J.f38613I.setText(getString(j.m.f41742d1));
            }
            if (k14 instanceof PartyBoxDevice) {
                PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k14;
                WirelessMicInfo v12 = partyBoxDevice.v1();
                if (v12 != null) {
                    d13 = v12.m();
                } else {
                    d13 = partyBoxDevice.d1();
                }
                com.harman.log.f.a(TAG, "KaraokeFragment micConnectInfoLiveData observe: wirelessMicInfo = " + partyBoxDevice.v1() + " micConnectStatus = " + d13);
                A0(d13, partyBoxDevice.v1(), k14.o());
            }
            if (com.harman.sdk.utils.d.D(k14.q())) {
                r02.f40273S.setText(j.m.S3);
            }
            h02 = H0.f51801a;
        } else {
            h02 = null;
        }
        if (h02 == null) {
            r02.f40264J.f38613I.setText(getString(j.m.f41631C1));
        }
        r0().f40261G.setListener(this);
        r0().f40263I.setListener(this);
        r0().f40262H.setListener(this);
        r0().f40272R.setOnTouchListener(new View.OnTouchListener() { // from class: com.harman.jbl.partybox.ui.karaoke.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean w02;
                w02 = KaraokeFragment.w0(view2, motionEvent);
                return w02;
            }
        });
        r0().f40264J.f38611G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.karaoke.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                KaraokeFragment.x0(KaraokeFragment.this, view2);
            }
        });
        v0().Z().k(getViewLifecycleOwner(), new e(new c()));
        HmDevice k15 = s0().k1();
        if (k15 != null && (k15 instanceof PartyBoxDevice)) {
            if (com.harman.sdk.utils.d.G(k15)) {
                PartyBoxDevice partyBoxDevice2 = (PartyBoxDevice) k15;
                WirelessMicInfo v13 = partyBoxDevice2.v1();
                if (v13 != null) {
                    d12 = v13.m();
                } else {
                    d12 = partyBoxDevice2.d1();
                }
                if (d12 == 0) {
                    v0().a0(k15);
                }
            } else {
                v0().c0(k15);
            }
        }
        s0().l1().k(getViewLifecycleOwner(), new e(new d()));
    }

    @Override // com.harman.jbl.partybox.ui.customviews.HmCustomScrollUpSeekbar.b
    public void setEcoValue(@l3.e String str, int i4) {
        HmDevice k12 = s0().k1();
        if (k12 != null) {
            v0().f0(k12, i4);
        }
    }

    public final void setKaraokeValues(@l3.e PartyBoxDevice partyBoxDevice) {
        Integer num;
        Integer num2;
        KaraokeMicEQInfo Y02;
        KaraokeMicEQInfo Y03;
        KaraokeMicEQInfo Y04;
        KaraokeMicEQInfo Y05;
        Integer num3 = null;
        if (partyBoxDevice != null && (Y05 = partyBoxDevice.Y0()) != null) {
            num = Integer.valueOf(Y05.a());
        } else {
            num = null;
        }
        if (partyBoxDevice != null && (Y04 = partyBoxDevice.Y0()) != null) {
            num2 = Integer.valueOf(Y04.c());
        } else {
            num2 = null;
        }
        if (partyBoxDevice != null && (Y03 = partyBoxDevice.Y0()) != null) {
            num3 = Integer.valueOf(Y03.b());
        }
        com.harman.log.f.a(TAG, " BLE_LOG KaraokeFragment setKaraokeValues karaokeBassLevel = " + num + ", karaokeTrebleLevel = " + num2 + ", karaokeEchoLevel = " + num3);
        if (partyBoxDevice != null && (Y02 = partyBoxDevice.Y0()) != null) {
            C1951w0 r02 = r0();
            r02.f40261G.setSeekBarLevel(Y02.a());
            r02.f40263I.setSeekBarLevel(Y02.c());
            r02.f40262H.setSeekBarLevel(Y02.b());
        }
    }

    @Override // com.harman.jbl.partybox.ui.customviews.HmCustomUpDownSeekBar.b
    public void setValue(@l3.e String str, int i4, @l3.d String seekbarTxtValue) {
        HmDevice k12;
        F.p(seekbarTxtValue, "seekbarTxtValue");
        if (F.g(str, com.harman.jbl.partybox.constants.a.f38347a0)) {
            HmDevice k13 = s0().k1();
            if (k13 != null) {
                v0().d0(k13, i4, seekbarTxtValue);
                return;
            }
            return;
        }
        if (F.g(str, com.harman.jbl.partybox.constants.a.f38349b0) && (k12 = s0().k1()) != null) {
            v0().h0(k12, i4, seekbarTxtValue);
        }
    }
}
