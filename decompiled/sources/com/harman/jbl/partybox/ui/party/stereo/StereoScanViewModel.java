package com.harman.jbl.partybox.ui.party.stereo;

import B2.c;
import androidx.annotation.InterfaceC0561d;
import androidx.annotation.K;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.P;
import androidx.lifecycle.h0;
import androidx.lifecycle.k0;
import com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoScanPageStyle;
import com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoType;
import com.harman.sdk.device.HmDevice;
import java.util.List;
import kotlin.E;
import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.C2323l;

@E(d1 = {"\u0000u\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001A\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0001SB\u0007¢\u0006\u0004\bQ\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\u0005J\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0015\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0004\b\"\u0010!J\u0017\u0010%\u001a\u00020\u00032\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010&R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020,0+8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010)R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020#0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010)R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001e0'8\u0006¢\u0006\f\n\u0004\b=\u0010)\u001a\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020\r0+8F¢\u0006\u0006\u001a\u0004\bE\u00100R\u001d\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r020+8F¢\u0006\u0006\u001a\u0004\bG\u00100R\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020#0+8F¢\u0006\u0006\u001a\u0004\bI\u00100R\u0013\u0010M\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020N0+8F¢\u0006\u0006\u001a\u0004\bO\u00100¨\u0006T"}, d2 = {"Lcom/harman/jbl/partybox/ui/party/stereo/StereoScanViewModel;", "Lcom/harman/jbl/partybox/c;", "Landroidx/lifecycle/A;", "Lkotlin/H0;", "s0", "()V", "o0", "r0", "q0", "p0", "v0", "t0", "u0", "Lcom/harman/sdk/device/HmDevice;", "scannedDevice", "l0", "(Lcom/harman/sdk/device/HmDevice;)V", "j0", "expiredDevice", "i0", "Lcom/harman/jbl/partybox/ui/party/stereo/x;", "args", "a0", "(Lcom/harman/jbl/partybox/ui/party/stereo/x;)V", "Landroidx/lifecycle/E;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "f", "(Landroidx/lifecycle/E;Landroidx/lifecycle/Lifecycle$Event;)V", "", "isEnable", "onBtEnabled", "(Z)V", "onLocationEnabled", "", "position", "n0", "(I)V", "Landroidx/lifecycle/P;", "P", "Landroidx/lifecycle/P;", "_mainDevice", "Landroidx/lifecycle/LiveData;", "", "Q", "Landroidx/lifecycle/LiveData;", "c0", "()Landroidx/lifecycle/LiveData;", "deviceName", "", "R", "_nearbyDevices", androidx.exifinterface.media.a.T4, "_selectedDeviceIdx", androidx.exifinterface.media.a.f5, "Lcom/harman/jbl/partybox/ui/party/stereo/x;", "Lcom/harman/jbl/partybox/ui/party/stereo/define/EnumStereoType;", "U", "Lcom/harman/jbl/partybox/ui/party/stereo/define/EnumStereoType;", "twsType", androidx.exifinterface.media.a.Z4, "h0", "()Landroidx/lifecycle/P;", "showTips", "com/harman/jbl/partybox/ui/party/stereo/StereoScanViewModel$i", androidx.exifinterface.media.a.V4, "Lcom/harman/jbl/partybox/ui/party/stereo/StereoScanViewModel$i;", "scanListener", "d0", "mainDevice", "e0", "nearbyDevices", "g0", "selectedDeviceIdx", "b0", "()Lcom/harman/sdk/device/HmDevice;", "coDevice", "Lcom/harman/jbl/partybox/ui/party/stereo/define/EnumStereoScanPageStyle;", "f0", "pageStyle", "<init>", "X", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nStereoScanViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StereoScanViewModel.kt\ncom/harman/jbl/partybox/ui/party/stereo/StereoScanViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,252:1\n766#2:253\n857#2,2:254\n1747#2,3:256\n1655#2,8:259\n1655#2,8:267\n*S KotlinDebug\n*F\n+ 1 StereoScanViewModel.kt\ncom/harman/jbl/partybox/ui/party/stereo/StereoScanViewModel\n*L\n76#1:253\n76#1:254,2\n203#1:256,3\n215#1:259,8\n225#1:267,8\n*E\n"})
/* loaded from: classes2.dex */
public final class StereoScanViewModel extends com.harman.jbl.partybox.c implements androidx.lifecycle.A {

    /* renamed from: X, reason: collision with root package name */
    @l3.d
    public static final a f45175X = new a(null);

    /* renamed from: Y, reason: collision with root package name */
    @l3.d
    private static final String f45176Y = "Stereo.ScanViewModel";

    /* renamed from: P, reason: collision with root package name */
    @l3.d
    private final P<HmDevice> f45177P;

    /* renamed from: Q, reason: collision with root package name */
    @l3.d
    private final LiveData<String> f45178Q;

    /* renamed from: R, reason: collision with root package name */
    @l3.d
    private final P<List<HmDevice>> f45179R;

    /* renamed from: S, reason: collision with root package name */
    @l3.d
    private final P<Integer> f45180S;

    /* renamed from: T, reason: collision with root package name */
    @l3.e
    private x f45181T;

    /* renamed from: U, reason: collision with root package name */
    @l3.d
    private EnumStereoType f45182U;

    /* renamed from: V, reason: collision with root package name */
    @l3.d
    private final P<Boolean> f45183V;

    /* renamed from: W, reason: collision with root package name */
    @l3.d
    private final i f45184W;

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
        public static final /* synthetic */ int[] f45185a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f45185a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends Lambda implements X2.l<HmDevice, String> {

        /* renamed from: F, reason: collision with root package name */
        public static final c f45186F = new c();

        c() {
            super(1);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String C(HmDevice hmDevice) {
            String p4;
            if (hmDevice == null || (p4 = hmDevice.p()) == null) {
                return "";
            }
            return p4;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.StereoScanViewModel$onBtEnabled$1", f = "StereoScanViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class d extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f45187I;

        d(kotlin.coroutines.c<? super d> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f45187I == 0) {
                W.n(obj);
                StereoScanViewModel.this.v0();
                return H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((d) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new d(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class e extends Lambda implements X2.l<HmDevice, Boolean> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ HmDevice f45189F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(HmDevice hmDevice) {
            super(1);
            this.f45189F = hmDevice;
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean C(@l3.d HmDevice device) {
            F.p(device, "device");
            return Boolean.valueOf(com.harman.jbl.partybox.ui.party.b.f44881a.o(device, this.f45189F));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class f extends Lambda implements X2.l<HmDevice, Boolean> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ HmDevice f45190F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(HmDevice hmDevice) {
            super(1);
            this.f45190F = hmDevice;
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean C(@l3.d HmDevice device) {
            F.p(device, "device");
            return Boolean.valueOf(com.harman.jbl.partybox.ui.party.b.f44881a.o(device, this.f45190F));
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.StereoScanViewModel$onLocationEnabled$1", f = "StereoScanViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class g extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f45191I;

        g(kotlin.coroutines.c<? super g> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f45191I == 0) {
                W.n(obj);
                StereoScanViewModel.this.v0();
                return H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((g) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new g(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class h extends Lambda implements X2.l<List<HmDevice>, EnumStereoScanPageStyle> {

        /* renamed from: F, reason: collision with root package name */
        public static final h f45193F = new h();

        h() {
            super(1);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final EnumStereoScanPageStyle C(List<HmDevice> list) {
            if (list != null && !list.isEmpty()) {
                return EnumStereoScanPageStyle.DEVICES;
            }
            return EnumStereoScanPageStyle.NO_DEVICE;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i implements c.b {

        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.StereoScanViewModel$scanListener$1$onDeviceOffline$1", f = "StereoScanViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        static final class a extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f45195I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ StereoScanViewModel f45196J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ HmDevice f45197K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(StereoScanViewModel stereoScanViewModel, HmDevice hmDevice, kotlin.coroutines.c<? super a> cVar) {
                super(2, cVar);
                this.f45196J = stereoScanViewModel;
                this.f45197K = hmDevice;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f45195I == 0) {
                    W.n(obj);
                    this.f45196J.i0(this.f45197K);
                    return H0.f51801a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                return ((a) v(u3, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new a(this.f45196J, this.f45197K, cVar);
            }
        }

        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.StereoScanViewModel$scanListener$1$onScanResult$1", f = "StereoScanViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        static final class b extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f45198I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ StereoScanViewModel f45199J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ HmDevice f45200K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(StereoScanViewModel stereoScanViewModel, HmDevice hmDevice, kotlin.coroutines.c<? super b> cVar) {
                super(2, cVar);
                this.f45199J = stereoScanViewModel;
                this.f45200K = hmDevice;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f45198I == 0) {
                    W.n(obj);
                    this.f45199J.l0(this.f45200K);
                    return H0.f51801a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
                return new b(this.f45199J, this.f45200K, cVar);
            }
        }

        i() {
        }

        @Override // B2.c.b
        public void b(int i4, @l3.e String str) {
            com.harman.log.f.b(StereoScanViewModel.f45176Y, "onScanFailed() >>> code[" + i4 + "] msg[" + str + "]");
        }

        @Override // B2.c.b
        public void c(@l3.d HmDevice device) {
            F.p(device, "device");
        }

        @Override // B2.c.b
        public void d(@l3.d HmDevice device) {
            F.p(device, "device");
            C2323l.f(k0.a(StereoScanViewModel.this), C2322k0.e(), null, new a(StereoScanViewModel.this, device, null), 2, null);
        }

        @Override // B2.c.b
        public void e(@l3.d HmDevice scannedDevice) {
            F.p(scannedDevice, "scannedDevice");
            C2323l.f(k0.a(StereoScanViewModel.this), C2322k0.e(), null, new b(StereoScanViewModel.this, scannedDevice, null), 2, null);
        }
    }

    public StereoScanViewModel() {
        P<HmDevice> p4 = new P<>();
        this.f45177P = p4;
        this.f45178Q = h0.b(p4, c.f45186F);
        this.f45179R = new P<>();
        this.f45180S = new P<>();
        this.f45182U = EnumStereoType.STEREO;
        this.f45183V = new P<>();
        this.f45184W = new i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        r0 = kotlin.collections.D.Y5(r0);
     */
    @androidx.annotation.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i0(com.harman.sdk.device.HmDevice r4) {
        /*
            r3 = this;
            androidx.lifecycle.P<java.util.List<com.harman.sdk.device.HmDevice>> r0 = r3.f45179R
            java.lang.Object r0 = r0.f()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L10
            java.util.List r0 = kotlin.collections.C2107u.Y5(r0)
            if (r0 != 0) goto L15
        L10:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L15:
            com.harman.jbl.partybox.ui.party.stereo.StereoScanViewModel$e r1 = new com.harman.jbl.partybox.ui.party.stereo.StereoScanViewModel$e
            r1.<init>(r4)
            kotlin.collections.C2107u.L0(r0, r1)
            androidx.lifecycle.P<java.util.List<com.harman.sdk.device.HmDevice>> r1 = r3.f45179R
            r1.r(r0)
            com.harman.jbl.partybox.ui.party.b r1 = com.harman.jbl.partybox.ui.party.b.f44881a
            java.lang.String r4 = r1.t(r4)
            int r0 = r0.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onDeviceExpired() >>> rm device "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " nearby.size["
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = "]"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r0 = "Stereo.ScanViewModel"
            com.harman.log.f.d(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.party.stereo.StereoScanViewModel.i0(com.harman.sdk.device.HmDevice):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        r0 = kotlin.collections.D.Y5(r0);
     */
    @androidx.annotation.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void j0(com.harman.sdk.device.HmDevice r8) {
        /*
            r7 = this;
            androidx.lifecycle.P<java.util.List<com.harman.sdk.device.HmDevice>> r0 = r7.f45179R
            java.lang.Object r0 = r0.f()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L10
            java.util.List r0 = kotlin.collections.C2107u.Y5(r0)
            if (r0 != 0) goto L15
        L10:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L15:
            com.harman.jbl.partybox.ui.party.stereo.StereoScanViewModel$f r1 = new com.harman.jbl.partybox.ui.party.stereo.StereoScanViewModel$f
            r1.<init>(r8)
            com.harman.jbl.partybox.ui.party.stereo.B r2 = new com.harman.jbl.partybox.ui.party.stereo.B
            r2.<init>()
            boolean r1 = r0.removeIf(r2)
            if (r1 == 0) goto L80
            androidx.lifecycle.P<java.util.List<com.harman.sdk.device.HmDevice>> r1 = r7.f45179R
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r0.iterator()
        L35:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L50
            java.lang.Object r5 = r4.next()
            r6 = r5
            com.harman.sdk.device.HmDevice r6 = (com.harman.sdk.device.HmDevice) r6
            java.lang.String r6 = r6.n()
            boolean r6 = r2.add(r6)
            if (r6 == 0) goto L35
            r3.add(r5)
            goto L35
        L50:
            r1.r(r3)
            com.harman.jbl.partybox.ui.party.b r1 = com.harman.jbl.partybox.ui.party.b.f44881a
            java.lang.String r8 = r1.t(r8)
            int r0 = r0.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onDeviceScanned() >>> cat device "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = " nearby.size["
            r1.append(r8)
            r1.append(r0)
            java.lang.String r8 = "]"
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            java.lang.String r0 = "Stereo.ScanViewModel"
            com.harman.log.f.d(r0, r8)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.party.stereo.StereoScanViewModel.j0(com.harman.sdk.device.HmDevice):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k0(X2.l tmp0, Object obj) {
        F.p(tmp0, "$tmp0");
        return ((Boolean) tmp0.C(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0054, code lost:
    
        r0 = kotlin.collections.D.Y5(r0);
     */
    @androidx.annotation.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l0(final com.harman.sdk.device.HmDevice r8) {
        /*
            r7 = this;
            com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoType r0 = r7.f45182U
            com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoType r1 = com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoType.STEREO
            if (r0 != r1) goto L1a
            com.harman.jbl.partybox.ui.party.stereo.D r0 = com.harman.jbl.partybox.ui.party.stereo.D.f45020a
            androidx.lifecycle.P<com.harman.sdk.device.HmDevice> r1 = r7.f45177P
            java.lang.Object r1 = r1.f()
            com.harman.sdk.device.HmDevice r1 = (com.harman.sdk.device.HmDevice) r1
            boolean r0 = r0.b(r1, r8)
            if (r0 != 0) goto L4a
            r7.j0(r8)
            return
        L1a:
            com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoType r1 = com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoType.TWS
            if (r0 != r1) goto L32
            com.harman.jbl.partybox.ui.party.stereo.D r0 = com.harman.jbl.partybox.ui.party.stereo.D.f45020a
            androidx.lifecycle.P<com.harman.sdk.device.HmDevice> r1 = r7.f45177P
            java.lang.Object r1 = r1.f()
            com.harman.sdk.device.HmDevice r1 = (com.harman.sdk.device.HmDevice) r1
            boolean r0 = r0.c(r1, r8)
            if (r0 != 0) goto L4a
            r7.j0(r8)
            return
        L32:
            com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoType r1 = com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoType.WIRELESS
            if (r0 != r1) goto L4a
            com.harman.jbl.partybox.ui.party.stereo.D r0 = com.harman.jbl.partybox.ui.party.stereo.D.f45020a
            androidx.lifecycle.P<com.harman.sdk.device.HmDevice> r1 = r7.f45177P
            java.lang.Object r1 = r1.f()
            com.harman.sdk.device.HmDevice r1 = (com.harman.sdk.device.HmDevice) r1
            boolean r0 = r0.d(r1, r8)
            if (r0 != 0) goto L4a
            r7.j0(r8)
            return
        L4a:
            androidx.lifecycle.P<java.util.List<com.harman.sdk.device.HmDevice>> r0 = r7.f45179R
            java.lang.Object r0 = r0.f()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L5a
            java.util.List r0 = kotlin.collections.C2107u.Y5(r0)
            if (r0 != 0) goto L5f
        L5a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5f:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L66
            goto L87
        L66:
            java.util.Iterator r1 = r0.iterator()
        L6a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L87
            java.lang.Object r2 = r1.next()
            com.harman.sdk.device.HmDevice r2 = (com.harman.sdk.device.HmDevice) r2
            com.harman.jbl.partybox.ui.party.b r3 = com.harman.jbl.partybox.ui.party.b.f44881a
            boolean r2 = r3.o(r2, r8)
            if (r2 == 0) goto L6a
            com.harman.jbl.partybox.ui.party.stereo.C r1 = new com.harman.jbl.partybox.ui.party.stereo.C
            r1.<init>()
            r0.replaceAll(r1)
            goto L8a
        L87:
            r0.add(r8)
        L8a:
            androidx.lifecycle.P<java.util.List<com.harman.sdk.device.HmDevice>> r1 = r7.f45179R
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r0.iterator()
        L9a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lb5
            java.lang.Object r5 = r4.next()
            r6 = r5
            com.harman.sdk.device.HmDevice r6 = (com.harman.sdk.device.HmDevice) r6
            java.lang.String r6 = r6.n()
            boolean r6 = r2.add(r6)
            if (r6 == 0) goto L9a
            r3.add(r5)
            goto L9a
        Lb5:
            r1.r(r3)
            com.harman.jbl.partybox.ui.party.b r1 = com.harman.jbl.partybox.ui.party.b.f44881a
            java.lang.String r8 = r1.t(r8)
            int r0 = r0.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onDeviceScanned() >>> cat device "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = " nearby.size["
            r1.append(r8)
            r1.append(r0)
            java.lang.String r8 = "]"
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            java.lang.String r0 = "Stereo.ScanViewModel"
            com.harman.log.f.d(r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.party.stereo.StereoScanViewModel.l0(com.harman.sdk.device.HmDevice):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HmDevice m0(HmDevice scannedDevice, HmDevice device) {
        F.p(scannedDevice, "$scannedDevice");
        F.p(device, "device");
        if (!com.harman.jbl.partybox.ui.party.b.f44881a.o(device, scannedDevice)) {
            return device;
        }
        return scannedDevice;
    }

    private final void o0() {
    }

    private final void p0() {
    }

    private final void q0() {
        u0();
    }

    private final void r0() {
        v0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        r0 = kotlin.collections.D.V5(r0);
     */
    @androidx.annotation.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void s0() {
        /*
            r7 = this;
            com.harman.sdk.b r0 = com.harman.sdk.b.f47608a
            B2.c r0 = r0.k()
            if (r0 == 0) goto L16
            java.util.Collection r0 = r0.i()
            if (r0 == 0) goto L16
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.C2107u.V5(r0)
            if (r0 != 0) goto L1a
        L16:
            java.util.List r0 = kotlin.collections.C2107u.H()
        L1a:
            androidx.lifecycle.P<java.util.List<com.harman.sdk.device.HmDevice>> r1 = r7.f45179R
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L25:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L6e
            java.lang.Object r3 = r0.next()
            r4 = r3
            com.harman.sdk.device.HmDevice r4 = (com.harman.sdk.device.HmDevice) r4
            com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoType r5 = r7.f45182U
            com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoType r6 = com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoType.STEREO
            if (r5 != r6) goto L47
            com.harman.jbl.partybox.ui.party.stereo.D r5 = com.harman.jbl.partybox.ui.party.stereo.D.f45020a
            androidx.lifecycle.P<com.harman.sdk.device.HmDevice> r6 = r7.f45177P
            java.lang.Object r6 = r6.f()
            com.harman.sdk.device.HmDevice r6 = (com.harman.sdk.device.HmDevice) r6
            boolean r4 = r5.b(r6, r4)
            goto L68
        L47:
            com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoType r6 = com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoType.TWS
            if (r5 != r6) goto L5a
            com.harman.jbl.partybox.ui.party.stereo.D r5 = com.harman.jbl.partybox.ui.party.stereo.D.f45020a
            androidx.lifecycle.P<com.harman.sdk.device.HmDevice> r6 = r7.f45177P
            java.lang.Object r6 = r6.f()
            com.harman.sdk.device.HmDevice r6 = (com.harman.sdk.device.HmDevice) r6
            boolean r4 = r5.c(r6, r4)
            goto L68
        L5a:
            com.harman.jbl.partybox.ui.party.stereo.D r5 = com.harman.jbl.partybox.ui.party.stereo.D.f45020a
            androidx.lifecycle.P<com.harman.sdk.device.HmDevice> r6 = r7.f45177P
            java.lang.Object r6 = r6.f()
            com.harman.sdk.device.HmDevice r6 = (com.harman.sdk.device.HmDevice) r6
            boolean r4 = r5.d(r6, r4)
        L68:
            if (r4 == 0) goto L25
            r2.add(r3)
            goto L25
        L6e:
            int r0 = r2.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "refreshDevices() >>> nearby.size["
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = "]"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "Stereo.ScanViewModel"
            com.harman.log.f.a(r3, r0)
            r1.r(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.party.stereo.StereoScanViewModel.s0():void");
    }

    private final void t0() {
        com.harman.log.f.d(f45176Y, "observeScanObserver() >>> start");
        com.harman.sdk.b bVar = com.harman.sdk.b.f47608a;
        B2.c k4 = bVar.k();
        if (k4 != null) {
            k4.a(true);
        }
        B2.c k5 = bVar.k();
        if (k5 != null) {
            k5.g(D.f45020a.k(), this.f45184W, null);
        }
    }

    private final void u0() {
        com.harman.log.f.d(f45176Y, "stopObserveDevices() >>> ");
        com.harman.sdk.b bVar = com.harman.sdk.b.f47608a;
        B2.c k4 = bVar.k();
        if (k4 != null) {
            k4.a(false);
        }
        B2.c k5 = bVar.k();
        if (k5 != null) {
            k5.j(D.f45020a.k(), this.f45184W);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0() {
        if (I() && J() && H()) {
            s0();
            t0();
        } else {
            u0();
        }
    }

    public final void a0(@l3.d x args) {
        boolean z3;
        F.p(args, "args");
        this.f45181T = args;
        EnumStereoType a4 = EnumStereoType.Companion.a(args.d());
        if (a4 == null) {
            a4 = EnumStereoType.STEREO;
        }
        this.f45182U = a4;
        P<Boolean> p4 = this.f45183V;
        if (a4 == EnumStereoType.TWS) {
            z3 = true;
        } else {
            z3 = false;
        }
        p4.r(Boolean.valueOf(z3));
        HmDevice c4 = args.c();
        P<HmDevice> p5 = this.f45177P;
        if (c4 == null) {
            return;
        }
        p5.r(c4);
    }

    @l3.e
    public final HmDevice b0() {
        Object W22;
        Integer f4 = this.f45180S.f();
        if (f4 == null) {
            return null;
        }
        F.m(f4);
        int intValue = f4.intValue();
        List<HmDevice> f5 = this.f45179R.f();
        if (f5 == null) {
            return null;
        }
        F.m(f5);
        W22 = kotlin.collections.D.W2(f5, intValue);
        return (HmDevice) W22;
    }

    @l3.d
    public final LiveData<String> c0() {
        return this.f45178Q;
    }

    @l3.d
    public final LiveData<HmDevice> d0() {
        return this.f45177P;
    }

    @l3.d
    public final LiveData<List<HmDevice>> e0() {
        return this.f45179R;
    }

    @Override // androidx.lifecycle.A
    public void f(@l3.d androidx.lifecycle.E source, @l3.d Lifecycle.Event event) {
        F.p(source, "source");
        F.p(event, "event");
        int i4 = b.f45185a[event.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 == 4) {
                        p0();
                        return;
                    }
                    return;
                }
                q0();
                return;
            }
            r0();
            return;
        }
        o0();
    }

    @l3.d
    public final LiveData<EnumStereoScanPageStyle> f0() {
        return h0.b(this.f45179R, h.f45193F);
    }

    @l3.d
    public final LiveData<Integer> g0() {
        return this.f45180S;
    }

    @l3.d
    public final P<Boolean> h0() {
        return this.f45183V;
    }

    @K
    public final void n0(int i4) {
        com.harman.log.f.d(f45176Y, "onDeviceSelected() >>> position[" + i4 + "]");
        this.f45180S.r(Integer.valueOf(i4));
    }

    @Override // com.harman.jbl.partybox.c, com.harman.sdk.c
    @InterfaceC0561d
    public void onBtEnabled(boolean z3) {
        super.onBtEnabled(z3);
        C2323l.f(k0.a(this), C2322k0.e(), null, new d(null), 2, null);
    }

    @Override // com.harman.jbl.partybox.c, com.harman.sdk.c
    @InterfaceC0561d
    public void onLocationEnabled(boolean z3) {
        super.onLocationEnabled(z3);
        C2323l.f(k0.a(this), C2322k0.e(), null, new g(null), 2, null);
    }
}
