package com.harman.jbl.partybox.ui.musiccontrol;

import X2.l;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.K;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import com.google.firebase.messaging.C1821f;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.C1873g1;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.sdk.command.ReqPlayerInfoCommand;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.utils.DeviceRole;
import com.harman.sdk.utils.MusicControlSettings;
import com.harman.sdk.utils.PartyConnectStatus;
import com.harman.sdk.utils.PlayerStatus;
import com.harman.sdk.utils.UsbStatus;
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
import kotlin.text.z;

@E(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 G2\u00020\u0001:\u0001HB\u0007¢\u0006\u0004\bF\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0002*\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u0002*\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u000f*\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u0004J\u000f\u0010\u001f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010 \u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\"\u0010\u0004J\u001b\u0010#\u001a\u00020\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0003¢\u0006\u0004\b#\u0010\u001aJ\u0017\u0010$\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b$\u0010\u001aJ\u0017\u0010%\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b%\u0010\u001aJ\u0017\u0010'\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0017H\u0002¢\u0006\u0004\b'\u0010\u001aJ\u0017\u0010*\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J!\u00100\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b0\u00101R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u00103\u001a\u0004\b4\u00105R\u001b\u0010<\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u00109\u001a\u0004\b?\u0010@R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00170B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006I"}, d2 = {"Lcom/harman/jbl/partybox/ui/musiccontrol/StageMusicControlFragment;", "Landroidx/fragment/app/Fragment;", "Lkotlin/H0;", "w0", "()V", "Lcom/harman/sdk/device/PartyBoxDevice;", "connectedDevice", "Lcom/harman/sdk/utils/MusicControlSettings;", "settings", "G0", "(Lcom/harman/sdk/device/PartyBoxDevice;Lcom/harman/sdk/utils/MusicControlSettings;)V", "A0", "I0", "(Lcom/harman/sdk/utils/MusicControlSettings;)V", "z0", "", "enableControl", "y0", "(Z)V", "Landroid/widget/ImageView;", "o0", "(Landroid/widget/ImageView;)V", "n0", "Lcom/harman/jbl/partybox/ui/musiccontrol/g;", "musicControlModel", "J0", "(Lcom/harman/jbl/partybox/ui/musiccontrol/g;)V", "", "N0", "(Ljava/lang/String;)Z", "H0", "C0", "M0", "D0", "s0", "K0", "F0", "E0", C1821f.C0339f.a.f37006R, "B0", "", "volume", "x0", "(I)V", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/harman/jbl/partybox/databinding/g1;", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "p0", "()Lcom/harman/jbl/partybox/databinding/g1;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "O0", "Lkotlin/A;", "q0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/ui/musiccontrol/h;", "P0", "r0", "()Lcom/harman/jbl/partybox/ui/musiccontrol/h;", "viewModel", "Landroidx/lifecycle/P;", "Q0", "Landroidx/lifecycle/P;", "liveMusicControlModel", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nStageMusicControlFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StageMusicControlFragment.kt\ncom/harman/jbl/partybox/ui/musiccontrol/StageMusicControlFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,406:1\n66#2,4:407\n84#3,6:411\n1#4:417\n262#5,2:418\n262#5,2:420\n262#5,2:422\n262#5,2:424\n262#5,2:426\n262#5,2:428\n262#5,2:430\n262#5,2:432\n262#5,2:434\n262#5,2:436\n262#5,2:438\n262#5,2:440\n262#5,2:442\n262#5,2:444\n262#5,2:446\n262#5,2:448\n262#5,2:450\n262#5,2:452\n262#5,2:454\n262#5,2:456\n*S KotlinDebug\n*F\n+ 1 StageMusicControlFragment.kt\ncom/harman/jbl/partybox/ui/musiccontrol/StageMusicControlFragment\n*L\n30#1:407,4\n31#1:411,6\n169#1:418,2\n170#1:420,2\n182#1:422,2\n190#1:424,2\n258#1:426,2\n259#1:428,2\n260#1:430,2\n261#1:432,2\n265#1:434,2\n266#1:436,2\n267#1:438,2\n268#1:440,2\n272#1:442,2\n273#1:444,2\n274#1:446,2\n275#1:448,2\n279#1:450,2\n280#1:452,2\n281#1:454,2\n282#1:456,2\n*E\n"})
/* loaded from: classes2.dex */
public final class StageMusicControlFragment extends Fragment {

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private static final String f44337S0 = "StageMusicControlFragment";

    /* renamed from: T0, reason: collision with root package name */
    private static final int f44338T0 = 0;

    /* renamed from: U0, reason: collision with root package name */
    private static final int f44339U0 = 32;

    /* renamed from: N0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f44340N0;

    /* renamed from: O0, reason: collision with root package name */
    @l3.d
    private final A f44341O0;

    /* renamed from: P0, reason: collision with root package name */
    @l3.d
    private final A f44342P0;

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final P<com.harman.jbl.partybox.ui.musiccontrol.g> f44343Q0;

    /* renamed from: R0, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f44336R0 = {N.u(new PropertyReference1Impl(StageMusicControlFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentStageMusicControlBinding;", 0))};

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
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44346a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f44347b;

        static {
            int[] iArr = new int[PlayerStatus.values().length];
            try {
                iArr[PlayerStatus.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayerStatus.PLAYER_STATE_OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayerStatus.PLAYER_STATE_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f44346a = iArr;
            int[] iArr2 = new int[DeviceRole.values().length];
            try {
                iArr2[DeviceRole.SLAVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DeviceRole.MASTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f44347b = iArr2;
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class c extends FunctionReferenceImpl implements l<View, C1873g1> {

        /* renamed from: N, reason: collision with root package name */
        public static final c f44348N = new c();

        c() {
            super(1, C1873g1.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentStageMusicControlBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final C1873g1 C(@l3.d View p02) {
            F.p(p02, "p0");
            return C1873g1.a(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class d extends Lambda implements l<PartyBoxDevice, H0> {
        d() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(PartyBoxDevice partyBoxDevice) {
            c(partyBoxDevice);
            return H0.f51801a;
        }

        public final void c(PartyBoxDevice partyBoxDevice) {
            StageMusicControlFragment.this.w0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class e extends Lambda implements l<com.harman.jbl.partybox.ui.musiccontrol.g, H0> {
        e() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(com.harman.jbl.partybox.ui.musiccontrol.g gVar) {
            c(gVar);
            return H0.f51801a;
        }

        public final void c(com.harman.jbl.partybox.ui.musiccontrol.g gVar) {
            StageMusicControlFragment.this.K0(gVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: E, reason: collision with root package name */
        private int f44351E = -1;

        f() {
        }

        public final int a() {
            return this.f44351E;
        }

        public final void b(int i4) {
            this.f44351E = i4;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(@l3.e SeekBar seekBar, int i4, boolean z3) {
            com.harman.log.f.a(StageMusicControlFragment.f44337S0, "volumeControl.onProgressChanged() >>> progress[" + i4 + "] fromUser[" + z3 + "]");
            if (!z3) {
                i4 = -1;
            }
            this.f44351E = i4;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(@l3.e SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(@l3.e SeekBar seekBar) {
            com.harman.log.f.a(StageMusicControlFragment.f44337S0, "volumeControl.onStopTrackingTouch() >>> progress[" + this.f44351E + "]");
            StageMusicControlFragment.this.x0(this.f44351E);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class g implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f44353a;

        g(l function) {
            F.p(function, "function");
            this.f44353a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f44353a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f44353a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public StageMusicControlFragment() {
        super(j.i.f41439S0);
        this.f44340N0 = com.harman.jbl.partybox.ui.delegate.b.a(this, c.f44348N);
        this.f44341O0 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        this.f44342P0 = FragmentViewModelLazyKt.c(this, N.d(h.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.musiccontrol.StageMusicControlFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final p0 n() {
                p0 viewModelStore = Fragment.this.requireActivity().getViewModelStore();
                F.o(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.musiccontrol.StageMusicControlFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final m0.b n() {
                m0.b defaultViewModelProviderFactory = Fragment.this.requireActivity().getDefaultViewModelProviderFactory();
                F.o(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.f44343Q0 = new P<>();
    }

    private final void A0() {
        MusicControlSettings e12;
        HmDevice k12 = q0().k1();
        if (k12 == null || (e12 = ((PartyBoxDevice) k12).e1()) == null) {
            return;
        }
        PlayerStatus f4 = e12.f();
        PlayerStatus playerStatus = PlayerStatus.PLAYER_STATE_PAUSE;
        if (f4 != playerStatus && e12.f() != PlayerStatus.PLAYER_STATE_OFF && e12.f() != PlayerStatus.UNKNOWN) {
            r0().W(L1.a.f1559a2, L1.a.f1572d0);
        } else {
            r0().W(L1.a.f1559a2, L1.a.f1567c0);
            playerStatus = PlayerStatus.PLAYER_STATE_PLAY;
        }
        r0().b0(k12, playerStatus);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void B0(com.harman.jbl.partybox.ui.musiccontrol.g r4) {
        /*
            r3 = this;
            int r0 = r4.i()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "updateAudioSource() >>> audioSource["
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "StageMusicControlFragment"
            com.harman.log.f.a(r1, r0)
            int r4 = r4.i()
            com.harman.sdk.command.ReqPlayerInfoCommand$a r0 = com.harman.sdk.command.ReqPlayerInfoCommand.f47674L
            int r1 = r0.c()
            r2 = 1
            if (r4 != r1) goto L33
            r3.H0()
            r3.y0(r2)
            goto L6f
        L33:
            int r1 = r0.b()
            if (r4 != r1) goto L42
            r3.y0(r2)
            r3.D0()
            java.lang.String r4 = "bluetooth"
            goto L71
        L42:
            int r1 = r0.a()
            if (r4 != r1) goto L51
            r3.z0()
            r3.C0()
            java.lang.String r4 = "aux"
            goto L71
        L51:
            int r1 = r0.f()
            if (r4 != r1) goto L60
            r3.y0(r2)
            r3.M0()
            java.lang.String r4 = "usb"
            goto L71
        L60:
            int r0 = r0.e()
            if (r4 != r0) goto L6f
            r3.y0(r2)
            r3.M0()
            java.lang.String r4 = "uac"
            goto L71
        L6f:
            java.lang.String r4 = ""
        L71:
            int r0 = r4.length()
            if (r0 <= 0) goto La0
            com.harman.jbl.partybox.ui.main.o$a r0 = com.harman.jbl.partybox.ui.main.o.f44128m1
            java.lang.String r1 = r0.a()
            boolean r1 = kotlin.jvm.internal.F.g(r4, r1)
            if (r1 != 0) goto La0
            r0.f(r4)
            com.harman.jbl.partybox.ui.musiccontrol.h r0 = r3.r0()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r4 = "_from_device"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "action_source_switch_device"
            r0.W(r1, r4)
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.musiccontrol.StageMusicControlFragment.B0(com.harman.jbl.partybox.ui.musiccontrol.g):void");
    }

    private final void C0() {
        ImageView icMusic = p0().f39601I;
        F.o(icMusic, "icMusic");
        icMusic.setVisibility(8);
        ImageView icUsb = p0().f39602J;
        F.o(icUsb, "icUsb");
        icUsb.setVisibility(8);
        ImageView icBt = p0().f39600H;
        F.o(icBt, "icBt");
        icBt.setVisibility(8);
        ImageView icAux = p0().f39599G;
        F.o(icAux, "icAux");
        icAux.setVisibility(0);
    }

    private final void D0() {
        ImageView icMusic = p0().f39601I;
        F.o(icMusic, "icMusic");
        icMusic.setVisibility(8);
        ImageView icUsb = p0().f39602J;
        F.o(icUsb, "icUsb");
        icUsb.setVisibility(8);
        ImageView icBt = p0().f39600H;
        F.o(icBt, "icBt");
        icBt.setVisibility(0);
        ImageView icAux = p0().f39599G;
        F.o(icAux, "icAux");
        icAux.setVisibility(8);
    }

    private final void E0(com.harman.jbl.partybox.ui.musiccontrol.g gVar) {
        if (gVar.k() == PartyConnectStatus.PARTY_CONNECT_WIRED) {
            com.harman.log.f.a(f44337S0, "updateAudioSourceAndPlayerControl() >>> daisy chain mode. role[" + gVar.l().f() + "]");
            int i4 = b.f44347b[gVar.l().ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    B0(gVar);
                } else {
                    p0().f39603K.setVisibility(0);
                    y0(true);
                    B0(gVar);
                }
            } else {
                p0().f39603K.setVisibility(8);
                p0().f39608P.setText(getResources().getString(j.m.f8));
                y0(false);
            }
        } else {
            com.harman.log.f.a(f44337S0, "updateAudioSourceAndPlayerControl() >>> non-daisy chain mode.");
            p0().f39603K.setVisibility(0);
            y0(true);
            B0(gVar);
        }
        J0(gVar);
        q0().c2(gVar.k());
    }

    private final void F0(com.harman.jbl.partybox.ui.musiccontrol.g gVar) {
        E0(gVar);
        I0(gVar.j());
    }

    private final void G0(PartyBoxDevice partyBoxDevice, MusicControlSettings musicControlSettings) {
        com.harman.jbl.partybox.ui.musiccontrol.g gVar = new com.harman.jbl.partybox.ui.musiccontrol.g(partyBoxDevice.c(), partyBoxDevice.q1(), partyBoxDevice.J(), PartyConnectStatus.Companion.a(partyBoxDevice.i1().j()), UsbStatus.Companion.a(partyBoxDevice.s1().j()), musicControlSettings);
        com.harman.log.f.a(f44337S0, "updateMusicControlModel() >>> \n" + gVar);
        this.f44343Q0.r(gVar);
    }

    private final void H0() {
        ImageView icMusic = p0().f39601I;
        F.o(icMusic, "icMusic");
        icMusic.setVisibility(0);
        ImageView icUsb = p0().f39602J;
        F.o(icUsb, "icUsb");
        icUsb.setVisibility(8);
        ImageView icBt = p0().f39600H;
        F.o(icBt, "icBt");
        icBt.setVisibility(8);
        ImageView icAux = p0().f39599G;
        F.o(icAux, "icAux");
        icAux.setVisibility(8);
    }

    private final void I0(MusicControlSettings musicControlSettings) {
        int i4;
        com.harman.log.f.d(f44337S0, "updatePlayerPanel() >>> " + musicControlSettings);
        ImageView imageView = p0().f39605M;
        int i5 = b.f44346a[musicControlSettings.f().ordinal()];
        if (i5 != 1 && i5 != 2 && i5 != 3) {
            i4 = j.f.w3;
        } else {
            i4 = j.f.x3;
        }
        imageView.setImageResource(i4);
        p0().f39610R.setProgress(musicControlSettings.g());
        HmDevice k12 = q0().k1();
        if (k12 != null) {
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
            if (partyBoxDevice.Q1() && partyBoxDevice.u1() && musicControlSettings.g() == 32) {
                p0().f39610R.setProgressDrawable(androidx.core.content.res.i.g(getResources(), j.f.U9, null));
                p0().f39610R.setThumb(androidx.core.content.res.i.g(getResources(), j.f.Qb, null));
            } else {
                p0().f39610R.setProgressDrawable(androidx.core.content.res.i.g(getResources(), j.f.T9, null));
                p0().f39610R.setThumb(androidx.core.content.res.i.g(getResources(), j.f.Rb, null));
            }
        }
    }

    private final void J0(com.harman.jbl.partybox.ui.musiccontrol.g gVar) {
        CharSequence text;
        CharSequence text2;
        CharSequence text3;
        com.harman.log.f.a(f44337S0, "updateTitleAndDesc() >>> source[" + gVar.i() + "] settings:" + gVar.j());
        MusicControlSettings j4 = gVar.j();
        int i4 = gVar.i();
        ReqPlayerInfoCommand.a aVar = ReqPlayerInfoCommand.f47674L;
        if (i4 == aVar.c()) {
            p0().f39608P.setText(getResources().getText(j.m.f41687Q1));
            return;
        }
        if (i4 == aVar.f() || i4 == aVar.e()) {
            TextView textView = p0().f39608P;
            if (N0(j4.e())) {
                text = j4.e();
            } else {
                text = getResources().getText(j.m.Ya);
            }
            textView.setText(text);
            return;
        }
        if (i4 == aVar.b()) {
            TextView textView2 = p0().f39608P;
            if (N0(j4.e())) {
                text3 = j4.e();
            } else {
                text3 = getResources().getText(j.m.f41832w);
            }
            textView2.setText(text3);
            return;
        }
        if (i4 == aVar.a()) {
            TextView textView3 = p0().f39608P;
            if (N0(j4.e())) {
                text2 = j4.e();
            } else {
                text2 = getResources().getText(j.m.f41795o);
            }
            textView3.setText(text2);
            return;
        }
        p0().f39608P.setText(getResources().getText(j.m.Va));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @K
    public final void K0(com.harman.jbl.partybox.ui.musiccontrol.g gVar) {
        if (gVar == null) {
            return;
        }
        F0(gVar);
    }

    static /* synthetic */ void L0(StageMusicControlFragment stageMusicControlFragment, com.harman.jbl.partybox.ui.musiccontrol.g gVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            gVar = stageMusicControlFragment.f44343Q0.f();
        }
        stageMusicControlFragment.K0(gVar);
    }

    private final void M0() {
        ImageView icMusic = p0().f39601I;
        F.o(icMusic, "icMusic");
        icMusic.setVisibility(8);
        ImageView icUsb = p0().f39602J;
        F.o(icUsb, "icUsb");
        icUsb.setVisibility(0);
        ImageView icBt = p0().f39600H;
        F.o(icBt, "icBt");
        icBt.setVisibility(8);
        ImageView icAux = p0().f39599G;
        F.o(icAux, "icAux");
        icAux.setVisibility(8);
    }

    private final boolean N0(String str) {
        boolean K12;
        boolean K13;
        if (str.length() > 0) {
            K12 = z.K1(str, com.harman.jbl.partybox.constants.a.f38376p, true);
            if (!K12) {
                K13 = z.K1(str, com.harman.jbl.partybox.constants.a.f38378q, true);
                if (!K13) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void n0(ImageView imageView) {
        imageView.setEnabled(false);
        imageView.setAlpha(0.3f);
    }

    private final void o0(ImageView imageView) {
        imageView.setEnabled(true);
        imageView.setAlpha(1.0f);
    }

    private final C1873g1 p0() {
        return (C1873g1) this.f44340N0.a(this, f44336R0[0]);
    }

    private final o q0() {
        return (o) this.f44341O0.getValue();
    }

    private final h r0() {
        return (h) this.f44342P0.getValue();
    }

    private final void s0() {
        r0().X().k(getViewLifecycleOwner(), new g(new d()));
        this.f44343Q0.k(this, new g(new e()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(StageMusicControlFragment this$0, View view) {
        F.p(this$0, "this$0");
        HmDevice k12 = this$0.q0().k1();
        if (k12 != null) {
            this$0.r0().b0(k12, PlayerStatus.PLAYER_STATE_PREV);
        }
        this$0.r0().W(L1.a.f1559a2, L1.a.f1582f0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(StageMusicControlFragment this$0, View view) {
        F.p(this$0, "this$0");
        HmDevice k12 = this$0.q0().k1();
        if (k12 != null) {
            this$0.r0().b0(k12, PlayerStatus.PLAYER_STATE_NEXT);
        }
        this$0.r0().W(L1.a.f1559a2, L1.a.f1577e0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(StageMusicControlFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w0() {
        PartyBoxDevice partyBoxDevice;
        HmDevice k12 = q0().k1();
        if (k12 instanceof PartyBoxDevice) {
            partyBoxDevice = (PartyBoxDevice) k12;
        } else {
            partyBoxDevice = null;
        }
        if (partyBoxDevice == null) {
            com.harman.log.f.g(f44337S0, "refreshMusicControlModel() >>> missing main device");
            return;
        }
        MusicControlSettings e12 = partyBoxDevice.e1();
        if (e12 == null) {
            com.harman.log.f.g(f44337S0, "refreshMusicControlModel() >>> missing musicControlSettings");
        } else {
            G0(partyBoxDevice, e12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x0(int i4) {
        HmDevice k12;
        com.harman.log.f.a(f44337S0, "sendSetVolumeCommand() >>> volume[" + i4 + "]");
        if (i4 < 0 || i4 >= 33 || (k12 = q0().k1()) == null) {
            return;
        }
        z2.l j4 = com.harman.sdk.b.f47608a.j(k12);
        if (j4 != null) {
            j4.m0(k12, i4, null);
        }
        r0().W(L1.a.f1550Y1, null);
    }

    private final void y0(boolean z3) {
        ImageView imageView = p0().f39605M;
        if (z3) {
            F.m(imageView);
            o0(imageView);
        } else {
            F.m(imageView);
            n0(imageView);
        }
        ImageView imageView2 = p0().f39606N;
        F.m(imageView2);
        imageView2.setVisibility(0);
        if (z3) {
            o0(imageView2);
        } else {
            n0(imageView2);
        }
        ImageView imageView3 = p0().f39604L;
        F.m(imageView3);
        imageView3.setVisibility(0);
        if (z3) {
            o0(imageView3);
        } else {
            n0(imageView3);
        }
    }

    private final void z0() {
        p0().f39605M.setEnabled(true);
        p0().f39605M.setAlpha(1.0f);
        ImageView playPrevButton = p0().f39606N;
        F.o(playPrevButton, "playPrevButton");
        playPrevButton.setVisibility(8);
        ImageView playNextButton = p0().f39604L;
        F.o(playNextButton, "playNextButton");
        playNextButton.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        HmDevice k12 = q0().k1();
        if (k12 != null) {
            r0().Y(k12);
        }
        C1873g1 p02 = p0();
        p02.f39606N.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.musiccontrol.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StageMusicControlFragment.t0(StageMusicControlFragment.this, view2);
            }
        });
        p02.f39604L.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.musiccontrol.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StageMusicControlFragment.u0(StageMusicControlFragment.this, view2);
            }
        });
        p02.f39605M.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.musiccontrol.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StageMusicControlFragment.v0(StageMusicControlFragment.this, view2);
            }
        });
        p02.f39610R.setMax(32);
        p02.f39610R.setOnSeekBarChangeListener(new f());
        w0();
        s0();
    }
}
