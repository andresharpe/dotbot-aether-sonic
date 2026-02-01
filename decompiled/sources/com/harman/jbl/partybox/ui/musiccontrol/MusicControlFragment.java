package com.harman.jbl.partybox.ui.musiccontrol;

import X2.l;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.app.C0;
import androidx.core.content.C0669d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.Q;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import com.google.firebase.messaging.C1821f;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.C1860d3;
import com.harman.jbl.partybox.databinding.J0;
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
import kotlin.text.C2220b;
import kotlin.text.z;

@E(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ?2\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b>\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\tJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\tJ\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\tJ\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\tJ\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0010J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u0010J\u000f\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u0004J\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\tJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u0004J\u0017\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\tJ\u000f\u0010 \u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\"\u0010\u0004J!\u0010'\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0002H\u0016¢\u0006\u0004\b)\u0010\u0004J\u001d\u0010+\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\r¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u0015¢\u0006\u0004\b.\u0010\u0018R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u00100\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\b6\u00107R\u001b\u0010<\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b:\u0010;R\u0016\u0010-\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010=¨\u0006A"}, d2 = {"Lcom/harman/jbl/partybox/ui/musiccontrol/MusicControlFragment;", "Landroidx/fragment/app/Fragment;", "Lkotlin/H0;", "Q0", "()V", "z0", "Lcom/harman/jbl/partybox/ui/musiccontrol/g;", C1821f.C0339f.a.f37006R, "P0", "(Lcom/harman/jbl/partybox/ui/musiccontrol/g;)V", "G0", "U0", "y0", "", C0.f11537F0, "x0", "(Z)V", "E0", "F0", "O0", "I0", "", "audioSource", "H0", "(I)V", "N0", "K0", "S0", "A0", "L0", "J0", "T0", "R0", "M0", "t0", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroy", "enable", "updateVolumeSync", "(Lcom/harman/jbl/partybox/ui/musiccontrol/g;Z)V", "productId", "setCurrentDevice", "Lcom/harman/jbl/partybox/databinding/J0;", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "q0", "()Lcom/harman/jbl/partybox/databinding/J0;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "Lkotlin/A;", "r0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/ui/musiccontrol/h;", "s0", "()Lcom/harman/jbl/partybox/ui/musiccontrol/h;", "viewModel", "I", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nMusicControlFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicControlFragment.kt\ncom/harman/jbl/partybox/ui/musiccontrol/MusicControlFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,601:1\n66#2,4:602\n56#3,10:606\n1#4:616\n*S KotlinDebug\n*F\n+ 1 MusicControlFragment.kt\ncom/harman/jbl/partybox/ui/musiccontrol/MusicControlFragment\n*L\n25#1:602,4\n26#1:606,10\n*E\n"})
/* loaded from: classes2.dex */
public final class MusicControlFragment extends Fragment {

    @l3.d
    public static final String TAG = "MusicControlFragment";
    public static final int VOLUME_BAR_MAX_LEVEL = 32;
    public static final int VOLUME_BAR_MIN_LEVEL = 0;

    /* renamed from: N0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f44318N0;

    /* renamed from: O0, reason: collision with root package name */
    @l3.d
    private final A f44319O0;

    /* renamed from: P0, reason: collision with root package name */
    @l3.d
    private final A f44320P0;

    /* renamed from: Q0, reason: collision with root package name */
    private int f44321Q0;

    /* renamed from: R0, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f44317R0 = {N.u(new PropertyReference1Impl(MusicControlFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentMusicControlBinding;", 0))};

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
        public static final /* synthetic */ int[] f44326a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f44327b;

        static {
            int[] iArr = new int[DeviceRole.values().length];
            try {
                iArr[DeviceRole.SLAVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeviceRole.MASTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f44326a = iArr;
            int[] iArr2 = new int[PlayerStatus.values().length];
            try {
                iArr2[PlayerStatus.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PlayerStatus.PLAYER_STATE_OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PlayerStatus.PLAYER_STATE_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f44327b = iArr2;
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class c extends FunctionReferenceImpl implements l<View, J0> {

        /* renamed from: N, reason: collision with root package name */
        public static final c f44328N = new c();

        c() {
            super(1, J0.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentMusicControlBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final J0 C(@l3.d View p02) {
            F.p(p02, "p0");
            return J0.a(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class d extends Lambda implements l<Boolean, H0> {
        d() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Boolean bool) {
            c(bool);
            return H0.f51801a;
        }

        public final void c(Boolean bool) {
            if (MusicControlFragment.this.r0().k1() != null) {
                MusicControlFragment musicControlFragment = MusicControlFragment.this;
                F.m(bool);
                if (bool.booleanValue()) {
                    musicControlFragment.Q0();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class e extends Lambda implements l<PartyBoxDevice, H0> {
        e() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(PartyBoxDevice partyBoxDevice) {
            c(partyBoxDevice);
            return H0.f51801a;
        }

        public final void c(PartyBoxDevice partyBoxDevice) {
            MusicControlFragment.this.Q0();
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: E, reason: collision with root package name */
        private int f44331E;

        f() {
        }

        public final int a() {
            return this.f44331E;
        }

        public final void b(int i4) {
            this.f44331E = i4;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(@l3.e SeekBar seekBar, int i4, boolean z3) {
            this.f44331E = i4;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(@l3.e SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(@l3.e SeekBar seekBar) {
            HmDevice k12 = MusicControlFragment.this.r0().k1();
            if (k12 != null) {
                MusicControlFragment.this.s0().d0(k12, this.f44331E);
            }
        }
    }

    @U({"SMAP\nMusicControlFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicControlFragment.kt\ncom/harman/jbl/partybox/ui/musiccontrol/MusicControlFragment$onViewCreated$2$5\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,601:1\n1#2:602\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class g implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: E, reason: collision with root package name */
        private int f44333E;

        g() {
        }

        public final int a() {
            return this.f44333E;
        }

        public final void b(int i4) {
            this.f44333E = i4;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(@l3.e SeekBar seekBar, int i4, boolean z3) {
            this.f44333E = i4;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(@l3.e SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(@l3.e SeekBar seekBar) {
            HmDevice k12 = MusicControlFragment.this.r0().k1();
            if (k12 != null) {
                MusicControlFragment.this.s0().c0(k12, this.f44333E);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class h implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f44335a;

        h(l function) {
            F.p(function, "function");
            this.f44335a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f44335a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f44335a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public MusicControlFragment() {
        super(j.i.f41563x0);
        this.f44318N0 = com.harman.jbl.partybox.ui.delegate.b.a(this, c.f44328N);
        this.f44319O0 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.musiccontrol.MusicControlFragment$special$$inlined$viewModels$default$1
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
        this.f44320P0 = FragmentViewModelLazyKt.c(this, N.d(com.harman.jbl.partybox.ui.musiccontrol.h.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.musiccontrol.MusicControlFragment$special$$inlined$viewModels$default$2
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
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.musiccontrol.MusicControlFragment$special$$inlined$viewModels$default$3
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
        this.f44321Q0 = com.harman.sdk.utils.c.f48436e;
    }

    private final void A0() {
        q0().f38758H.f39493O.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.musiccontrol.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicControlFragment.B0(MusicControlFragment.this, view);
            }
        });
        q0().f38758H.f39484F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.musiccontrol.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicControlFragment.C0(MusicControlFragment.this, view);
            }
        });
        q0().f38758H.f39486H.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.musiccontrol.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicControlFragment.D0(MusicControlFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B0(MusicControlFragment this$0, View view) {
        F.p(this$0, "this$0");
        o.a aVar = o.f44128m1;
        aVar.f("usb");
        this$0.s0().W(L1.a.f1584f2, aVar.a() + L1.a.f1589g2);
        HmDevice k12 = this$0.r0().k1();
        if (k12 != null) {
            this$0.s0().Z(k12, ReqPlayerInfoCommand.f47674L.f());
        }
        HmDevice k13 = this$0.r0().k1();
        if (k13 != null) {
            k13.X(ReqPlayerInfoCommand.f47674L.f());
        }
        this$0.H0(ReqPlayerInfoCommand.f47674L.f());
        this$0.x0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C0(MusicControlFragment this$0, View view) {
        F.p(this$0, "this$0");
        o.a aVar = o.f44128m1;
        aVar.f("aux");
        this$0.s0().W(L1.a.f1584f2, aVar.a() + L1.a.f1589g2);
        HmDevice k12 = this$0.r0().k1();
        if (k12 != null) {
            this$0.s0().Z(k12, ReqPlayerInfoCommand.f47674L.a());
        }
        HmDevice k13 = this$0.r0().k1();
        if (k13 != null) {
            k13.X(ReqPlayerInfoCommand.f47674L.a());
        }
        this$0.H0(ReqPlayerInfoCommand.f47674L.a());
        this$0.x0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D0(MusicControlFragment this$0, View view) {
        F.p(this$0, "this$0");
        o.a aVar = o.f44128m1;
        aVar.f("bluetooth");
        this$0.s0().W(L1.a.f1584f2, aVar.a() + L1.a.f1589g2);
        HmDevice k12 = this$0.r0().k1();
        if (k12 != null) {
            this$0.s0().Z(k12, ReqPlayerInfoCommand.f47674L.b());
        }
        HmDevice k13 = this$0.r0().k1();
        if (k13 != null) {
            k13.X(ReqPlayerInfoCommand.f47674L.b());
        }
        this$0.H0(ReqPlayerInfoCommand.f47674L.b());
        this$0.x0(true);
    }

    private final void E0(com.harman.jbl.partybox.ui.musiccontrol.g gVar) {
        boolean K12;
        boolean K13;
        if (gVar.i() == ReqPlayerInfoCommand.f47674L.f()) {
            MusicControlSettings j4 = gVar.j();
            if (j4.e().length() > 0) {
                K12 = z.K1(j4.e(), com.harman.jbl.partybox.constants.a.f38376p, true);
                if (!K12) {
                    K13 = z.K1(j4.e(), com.harman.jbl.partybox.constants.a.f38378q, true);
                    if (!K13) {
                        q0().f38764N.setVisibility(0);
                        q0().f38769S.setText(j4.e());
                        q0().f38757G.setText(j4.a());
                        return;
                    }
                }
            }
            q0().f38764N.setVisibility(8);
            return;
        }
        q0().f38764N.setVisibility(8);
    }

    private final void F0(com.harman.jbl.partybox.ui.musiccontrol.g gVar) {
        String str;
        T1.a.a("MusicControlFragment updateAudioSource audioSource is " + gVar.i());
        int i4 = gVar.i();
        ReqPlayerInfoCommand.a aVar = ReqPlayerInfoCommand.f47674L;
        if (i4 == aVar.b()) {
            x0(true);
            if (this.f44321Q0 == 8029) {
                O0(gVar);
            } else {
                T1.a.a("MusicControlFragment updateAudioSource updateBluetoothSource called");
                M0();
            }
            str = "bluetooth";
        } else if (i4 == aVar.a()) {
            y0();
            if (this.f44321Q0 == 8029) {
                L0(gVar);
            } else {
                J0();
            }
            str = "aux";
        } else if (i4 == aVar.f()) {
            x0(true);
            if (this.f44321Q0 == 8029) {
                T0(gVar);
            } else {
                R0();
            }
            str = "usb";
        } else {
            str = "";
        }
        if (str.length() > 0) {
            o.a aVar2 = o.f44128m1;
            if (!F.g(str, aVar2.a())) {
                aVar2.f(str);
                s0().W(L1.a.f1579e2, aVar2.a() + L1.a.f1594h2);
            }
        }
    }

    private final void G0(com.harman.jbl.partybox.ui.musiccontrol.g gVar) {
        String str;
        String str2;
        T1.a.a("MusicControlFragment updateAudioSourceAndPlayerControl called");
        PartyConnectStatus k4 = gVar.k();
        PartyConnectStatus partyConnectStatus = PartyConnectStatus.PARTY_CONNECT_WIRED;
        if (k4 != partyConnectStatus && gVar.k() != PartyConnectStatus.PARTY_CONNECT_WIRELESS_CONNECTED) {
            q0().f38759I.setVisibility(8);
            F0(gVar);
        } else {
            boolean z3 = false;
            q0().f38759I.setVisibility(0);
            String str3 = null;
            if (gVar.k() == partyConnectStatus) {
                TextView textView = q0().f38759I;
                Context context = getContext();
                if (context != null) {
                    str2 = context.getString(j.m.L6);
                } else {
                    str2 = null;
                }
                textView.setText(str2);
            } else if (gVar.k() == PartyConnectStatus.PARTY_CONNECT_WIRELESS_CONNECTED) {
                TextView textView2 = q0().f38759I;
                Context context2 = getContext();
                if (context2 != null) {
                    str = context2.getString(j.m.eb);
                } else {
                    str = null;
                }
                textView2.setText(str);
            }
            T1.a.a("MusicControlFragment data.role : " + gVar.l());
            int i4 = b.f44326a[gVar.l().ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    T1.a.a("MusicControlFragment data.role is master and update audio source");
                    F0(gVar);
                }
            } else {
                q0().f38758H.d().setVisibility(8);
                q0().f38756F.setVisibility(0);
                TextView textView3 = q0().f38756F;
                Context context3 = getContext();
                if (context3 != null) {
                    str3 = context3.getString(j.m.f8);
                }
                textView3.setText(str3);
                T1.a.a("MusicControlFragment activeAudioSource text updated to Linked Speaker");
                if (gVar.k() == PartyConnectStatus.PARTY_CONNECT_WIRELESS_CONNECTED) {
                    z3 = true;
                }
                x0(z3);
            }
        }
        r0().c2(gVar.k());
    }

    private final void H0(int i4) {
        ReqPlayerInfoCommand.a aVar = ReqPlayerInfoCommand.f47674L;
        if (i4 == aVar.b()) {
            N0(true);
            K0(false);
            S0(false);
        } else if (i4 == aVar.a()) {
            N0(false);
            K0(true);
            S0(false);
        } else if (i4 == aVar.f()) {
            N0(false);
            K0(false);
            S0(true);
        }
    }

    private final void I0(com.harman.jbl.partybox.ui.musiccontrol.g gVar) {
        String str;
        q0().f38756F.setVisibility(8);
        q0().f38758H.d().setVisibility(0);
        TextView textView = q0().f38758H.f39487I;
        Context context = getContext();
        if (context != null) {
            str = context.getString(j.m.t6);
        } else {
            str = null;
        }
        textView.setText(str);
    }

    private final void J0() {
        String str;
        q0().f38756F.setVisibility(0);
        q0().f38758H.d().setVisibility(8);
        TextView textView = q0().f38756F;
        Context context = getContext();
        if (context != null) {
            str = context.getString(j.m.k6);
        } else {
            str = null;
        }
        textView.setText(str);
    }

    private final void K0(boolean z3) {
        Drawable drawable;
        int f4;
        C1860d3 c1860d3 = q0().f38758H;
        ImageView imageView = c1860d3.f39484F;
        if (z3) {
            drawable = C0669d.i(requireContext(), j.f.f41054j);
        } else {
            drawable = null;
        }
        imageView.setBackground(drawable);
        if (z3) {
            c1860d3.f39484F.clearColorFilter();
        } else {
            c1860d3.f39484F.setColorFilter(C0669d.f(requireContext(), j.d.f40752g1), PorterDuff.Mode.SRC_IN);
        }
        TextView textView = c1860d3.f39485G;
        if (z3) {
            f4 = C0669d.f(requireContext(), j.d.f40749f1);
        } else {
            f4 = C0669d.f(requireContext(), j.d.f40683B0);
        }
        textView.setTextColor(f4);
    }

    private final void L0(com.harman.jbl.partybox.ui.musiccontrol.g gVar) {
        I0(gVar);
        H0(ReqPlayerInfoCommand.f47674L.a());
        A0();
    }

    private final void M0() {
        String str;
        q0().f38756F.setVisibility(0);
        q0().f38758H.d().setVisibility(8);
        TextView textView = q0().f38756F;
        Context context = getContext();
        if (context != null) {
            str = context.getString(j.m.t6);
        } else {
            str = null;
        }
        textView.setText(str);
        T1.a.a("MusicControlFragment updateBluetoothSource string called");
    }

    private final void N0(boolean z3) {
        Drawable drawable;
        int f4;
        C1860d3 c1860d3 = q0().f38758H;
        ImageView imageView = c1860d3.f39486H;
        if (z3) {
            drawable = C0669d.i(requireContext(), j.f.f41059k);
        } else {
            drawable = null;
        }
        imageView.setBackground(drawable);
        if (z3) {
            c1860d3.f39486H.clearColorFilter();
        } else {
            c1860d3.f39486H.setColorFilter(C0669d.f(requireContext(), j.d.f40752g1), PorterDuff.Mode.SRC_IN);
        }
        TextView textView = c1860d3.f39487I;
        if (z3) {
            f4 = C0669d.f(requireContext(), j.d.f40749f1);
        } else {
            f4 = C0669d.f(requireContext(), j.d.f40683B0);
        }
        textView.setTextColor(f4);
    }

    private final void O0(com.harman.jbl.partybox.ui.musiccontrol.g gVar) {
        I0(gVar);
        H0(ReqPlayerInfoCommand.f47674L.b());
        A0();
    }

    private final void P0(com.harman.jbl.partybox.ui.musiccontrol.g gVar) {
        G0(gVar);
        U0(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q0() {
        HmDevice k12 = r0().k1();
        if (k12 != null) {
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
            if (partyBoxDevice.e1() == null) {
                T1.a.a("MusicControlFragment updateMusicControlModel is null, so return");
                return;
            }
            int c4 = k12.c();
            int q12 = partyBoxDevice.q1();
            DeviceRole J3 = k12.J();
            PartyConnectStatus a4 = PartyConnectStatus.Companion.a(partyBoxDevice.i1().j());
            UsbStatus a5 = UsbStatus.Companion.a(partyBoxDevice.s1().j());
            MusicControlSettings e12 = partyBoxDevice.e1();
            F.m(e12);
            com.harman.jbl.partybox.ui.musiccontrol.g gVar = new com.harman.jbl.partybox.ui.musiccontrol.g(c4, q12, J3, a4, a5, e12);
            P0(gVar);
            boolean G3 = com.harman.sdk.utils.d.G(k12);
            if (partyBoxDevice.O1() && partyBoxDevice.r1() && partyBoxDevice.i1() == PartyConnectStatus.PARTY_CONNECT_WIRELESS_CONNECTED) {
                updateVolumeSync(gVar, !G3);
            } else {
                updateVolumeSync(gVar, false);
            }
        }
    }

    private final void R0() {
        String str;
        q0().f38756F.setVisibility(0);
        q0().f38758H.d().setVisibility(8);
        TextView textView = q0().f38756F;
        Context context = getContext();
        if (context != null) {
            str = context.getString(j.m.ba);
        } else {
            str = null;
        }
        textView.setText(str);
    }

    private final void S0(boolean z3) {
        Drawable drawable;
        int f4;
        C1860d3 c1860d3 = q0().f38758H;
        ImageView imageView = c1860d3.f39493O;
        if (z3) {
            drawable = C0669d.i(requireContext(), j.f.f41069m);
        } else {
            drawable = null;
        }
        imageView.setBackground(drawable);
        if (z3) {
            c1860d3.f39493O.clearColorFilter();
        } else {
            c1860d3.f39493O.setColorFilter(C0669d.f(requireContext(), j.d.f40752g1), PorterDuff.Mode.SRC_IN);
        }
        TextView textView = c1860d3.f39494P;
        if (z3) {
            f4 = C0669d.f(requireContext(), j.d.f40749f1);
        } else {
            f4 = C0669d.f(requireContext(), j.d.f40683B0);
        }
        textView.setTextColor(f4);
    }

    private final void T0(com.harman.jbl.partybox.ui.musiccontrol.g gVar) {
        I0(gVar);
        H0(ReqPlayerInfoCommand.f47674L.f());
        A0();
    }

    private final void U0(com.harman.jbl.partybox.ui.musiccontrol.g gVar) {
        int i4;
        int a4;
        MusicControlSettings j4 = gVar.j();
        ImageView imageView = q0().f38761K;
        int i5 = b.f44327b[j4.f().ordinal()];
        if (i5 != 1 && i5 != 2 && i5 != 3) {
            i4 = j.f.w3;
        } else {
            i4 = j.f.x3;
        }
        imageView.setImageResource(i4);
        q0().f38772V.setProgress(j4.g());
        E0(gVar);
        HmDevice k12 = r0().k1();
        if (k12 != null) {
            int i6 = this.f44321Q0;
            String q4 = k12.q();
            a4 = C2220b.a(16);
            if (i6 == Integer.parseInt(q4, a4) && k12.c() == ReqPlayerInfoCommand.f47674L.a() && j4.f() == PlayerStatus.PLAYER_STATE_PAUSE) {
                q0().f38772V.setProgress(0);
            }
        }
    }

    private final J0 q0() {
        return (J0) this.f44318N0.a(this, f44317R0[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o r0() {
        return (o) this.f44319O0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.harman.jbl.partybox.ui.musiccontrol.h s0() {
        return (com.harman.jbl.partybox.ui.musiccontrol.h) this.f44320P0.getValue();
    }

    private final void t0() {
        r0().D1().k(getViewLifecycleOwner(), new h(new d()));
        s0().X().k(getViewLifecycleOwner(), new h(new e()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(MusicControlFragment this$0, View view) {
        F.p(this$0, "this$0");
        HmDevice k12 = this$0.r0().k1();
        if (k12 != null) {
            this$0.s0().b0(k12, PlayerStatus.PLAYER_STATE_PREV);
        }
        this$0.s0().W(L1.a.f1559a2, L1.a.f1582f0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(MusicControlFragment this$0, View view) {
        F.p(this$0, "this$0");
        HmDevice k12 = this$0.r0().k1();
        if (k12 != null) {
            this$0.s0().b0(k12, PlayerStatus.PLAYER_STATE_NEXT);
        }
        this$0.s0().W(L1.a.f1559a2, L1.a.f1577e0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(MusicControlFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.z0();
    }

    private final void x0(boolean z3) {
        ImageView imageView = q0().f38761K;
        if (z3) {
            imageView.setEnabled(true);
            imageView.setAlpha(1.0f);
        } else {
            imageView.setEnabled(false);
            imageView.setAlpha(0.5f);
        }
        ImageView imageView2 = q0().f38762L;
        if (z3) {
            imageView2.setEnabled(true);
            imageView2.setAlpha(1.0f);
        } else {
            imageView2.setEnabled(false);
            imageView2.setAlpha(0.3f);
        }
        ImageView imageView3 = q0().f38760J;
        if (z3) {
            imageView3.setEnabled(true);
            imageView3.setAlpha(1.0f);
        } else {
            imageView3.setEnabled(false);
            imageView3.setAlpha(0.3f);
        }
    }

    private final void y0() {
        ImageView imageView = q0().f38761K;
        imageView.setEnabled(true);
        imageView.setAlpha(1.0f);
        ImageView imageView2 = q0().f38762L;
        imageView2.setEnabled(false);
        imageView2.setAlpha(0.3f);
        ImageView imageView3 = q0().f38760J;
        imageView3.setEnabled(false);
        imageView3.setAlpha(0.3f);
    }

    private final void z0() {
        HmDevice k12 = r0().k1();
        if (k12 != null) {
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
            if (partyBoxDevice.e1() == null) {
                return;
            }
            MusicControlSettings e12 = partyBoxDevice.e1();
            F.m(e12);
            PlayerStatus f4 = e12.f();
            PlayerStatus playerStatus = PlayerStatus.PLAYER_STATE_PAUSE;
            if (f4 != playerStatus && e12.f() != PlayerStatus.PLAYER_STATE_OFF && e12.f() != PlayerStatus.UNKNOWN) {
                s0().W(L1.a.f1559a2, L1.a.f1572d0);
            } else {
                playerStatus = PlayerStatus.PLAYER_STATE_PLAY;
                s0().W(L1.a.f1559a2, L1.a.f1567c0);
            }
            MusicControlSettings e13 = partyBoxDevice.e1();
            if (e13 != null) {
                e13.m(playerStatus);
            }
            s0().b0(k12, playerStatus);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        T1.a.a("BLE_LOG MusicControlFragment onDestroy called");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        int a4;
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        T1.a.a("BLE_LOG MusicControlFragment onViewCreated called");
        HmDevice k12 = r0().k1();
        if (k12 != null) {
            s0().Y(k12);
        }
        J0 q02 = q0();
        q02.f38762L.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.musiccontrol.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MusicControlFragment.u0(MusicControlFragment.this, view2);
            }
        });
        q02.f38760J.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.musiccontrol.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MusicControlFragment.v0(MusicControlFragment.this, view2);
            }
        });
        q02.f38761K.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.musiccontrol.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MusicControlFragment.w0(MusicControlFragment.this, view2);
            }
        });
        q02.f38772V.setMax(32);
        q02.f38772V.setOnSeekBarChangeListener(new f());
        q02.f38767Q.setMax(32);
        q02.f38767Q.setOnSeekBarChangeListener(new g());
        HmDevice k13 = r0().k1();
        if (k13 != null && k13.q().length() > 0) {
            String q4 = k13.q();
            a4 = C2220b.a(16);
            int parseInt = Integer.parseInt(q4, a4);
            this.f44321Q0 = parseInt;
            setCurrentDevice(parseInt);
        }
        Q0();
        t0();
    }

    public final void setCurrentDevice(int i4) {
        this.f44321Q0 = i4;
    }

    public final void updateVolumeSync(@l3.d com.harman.jbl.partybox.ui.musiccontrol.g data, boolean z3) {
        F.p(data, "data");
        if (z3) {
            q0().f38768R.setVisibility(0);
            q0().f38767Q.setProgress(data.j().d());
        } else {
            q0().f38768R.setVisibility(8);
        }
    }
}
