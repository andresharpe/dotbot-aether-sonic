package com.harman.jbl.partybox.ui.party.stereo;

import androidx.annotation.K;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.P;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.harman.jbl.partybox.ui.effectlab.a;
import com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoChannelConnectState;
import com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoType;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.GestureInfo;
import com.harman.sdk.utils.AudioChannel;
import com.harman.sdk.utils.EnumIdentifyDevice;
import kotlin.E;
import kotlin.H0;
import kotlin.Result;
import kotlin.W;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.L0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.w1;

@E(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0001CB\u0007¢\u0006\u0004\bA\u0010\nJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0013\u0010\u0007J\u0013\u0010\u0014\u001a\u00020\u0010H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0012J\u001f\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\"\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010&R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010&R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010&R\u0018\u00100\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00102\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020%078F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020(078F¢\u0006\u0006\u001a\u0004\b;\u00109R\u0013\u0010>\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b=\u0010#R\u0013\u0010@\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b?\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006D"}, d2 = {"Lcom/harman/jbl/partybox/ui/party/stereo/StereoChannelViewModel;", "Landroidx/lifecycle/j0;", "Landroidx/lifecycle/A;", "Lcom/harman/sdk/utils/AudioChannel;", "channel", "Lkotlin/H0;", "x", "(Lcom/harman/sdk/utils/AudioChannel;)V", "w", "F", "()V", "D", "Lcom/harman/jbl/partybox/ui/party/stereo/k;", "args", "u", "(Lcom/harman/jbl/partybox/ui/party/stereo/k;)V", "", "G", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", androidx.exifinterface.media.a.U4, "H", "Landroidx/lifecycle/E;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "f", "(Landroidx/lifecycle/E;Landroidx/lifecycle/Lifecycle$Event;)V", "v", "()Z", "Lcom/harman/sdk/device/HmDevice;", "device", "activeChannel", "I", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/utils/AudioChannel;)V", androidx.exifinterface.media.a.Y4, "()Lcom/harman/sdk/device/HmDevice;", "Landroidx/lifecycle/P;", "Lcom/harman/jbl/partybox/ui/party/stereo/define/EnumStereoChannelConnectState;", "Landroidx/lifecycle/P;", "_connectState", "Lcom/harman/jbl/partybox/ui/party/stereo/define/EnumStereoType;", "_pageStyle", "J", "_mainDevice", "K", "_coDevice", "L", "Lcom/harman/sdk/device/HmDevice;", "_lDevice", "M", "_rDevice", "Lkotlinx/coroutines/L0;", "N", "Lkotlinx/coroutines/L0;", "lastPlayJob", "Landroidx/lifecycle/LiveData;", "y", "()Landroidx/lifecycle/LiveData;", "connectState", "B", "pageStyle", "z", "lDevice", "C", "rDevice", "<init>", "O", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class StereoChannelViewModel extends j0 implements androidx.lifecycle.A {

    /* renamed from: O, reason: collision with root package name */
    @l3.d
    public static final a f45081O = new a(null);

    /* renamed from: P, reason: collision with root package name */
    @l3.d
    private static final String f45082P = "Stereo.ChannelViewModel";

    /* renamed from: Q, reason: collision with root package name */
    private static final long f45083Q = 10000;

    /* renamed from: R, reason: collision with root package name */
    private static final long f45084R = 10000;

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final P<EnumStereoChannelConnectState> f45085H = new P<>();

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final P<EnumStereoType> f45086I = new P<>();

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private final P<HmDevice> f45087J = new P<>();

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private final P<HmDevice> f45088K = new P<>();

    /* renamed from: L, reason: collision with root package name */
    @l3.e
    private HmDevice f45089L;

    /* renamed from: M, reason: collision with root package name */
    @l3.e
    private HmDevice f45090M;

    /* renamed from: N, reason: collision with root package name */
    @l3.e
    private L0 f45091N;

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
        public static final /* synthetic */ int[] f45092a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f45093b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f45094c;

        static {
            int[] iArr = new int[AudioChannel.values().length];
            try {
                iArr[AudioChannel.STEREO_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioChannel.STEREO_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f45092a = iArr;
            int[] iArr2 = new int[EnumStereoType.values().length];
            try {
                iArr2[EnumStereoType.WIRELESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumStereoType.TWS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumStereoType.STEREO.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f45093b = iArr2;
            int[] iArr3 = new int[Lifecycle.Event.values().length];
            try {
                iArr3[Lifecycle.Event.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            f45094c = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.StereoChannelViewModel$flashAsStereo$2", f = "StereoChannelViewModel.kt", i = {}, l = {195}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class c extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f45095I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f45096J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ AudioChannel f45097K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ HmDevice f45098L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ HmDevice f45099M;

        /* renamed from: N, reason: collision with root package name */
        final /* synthetic */ EnumIdentifyDevice f45100N;

        /* renamed from: O, reason: collision with root package name */
        final /* synthetic */ EnumIdentifyDevice f45101O;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.StereoChannelViewModel$flashAsStereo$2$rst$1$1", f = "StereoChannelViewModel.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super Boolean>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f45102I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ HmDevice f45103J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ EnumIdentifyDevice f45104K;

            /* renamed from: L, reason: collision with root package name */
            final /* synthetic */ EnumIdentifyDevice f45105L;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(HmDevice hmDevice, EnumIdentifyDevice enumIdentifyDevice, EnumIdentifyDevice enumIdentifyDevice2, kotlin.coroutines.c<? super a> cVar) {
                super(2, cVar);
                this.f45103J = hmDevice;
                this.f45104K = enumIdentifyDevice;
                this.f45105L = enumIdentifyDevice2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f45102I;
                if (i4 != 0) {
                    if (i4 == 1) {
                        W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    W.n(obj);
                    com.harman.jbl.partybox.ui.party.stereo.state.create.d dVar = com.harman.jbl.partybox.ui.party.stereo.state.create.d.f45289a;
                    HmDevice hmDevice = this.f45103J;
                    EnumIdentifyDevice enumIdentifyDevice = this.f45104K;
                    EnumIdentifyDevice enumIdentifyDevice2 = this.f45105L;
                    this.f45102I = 1;
                    obj = dVar.b(hmDevice, enumIdentifyDevice, enumIdentifyDevice2, this);
                    if (obj == l4) {
                        return l4;
                    }
                }
                return obj;
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super Boolean> cVar) {
                return ((a) v(u3, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new a(this.f45103J, this.f45104K, this.f45105L, cVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(AudioChannel audioChannel, HmDevice hmDevice, HmDevice hmDevice2, EnumIdentifyDevice enumIdentifyDevice, EnumIdentifyDevice enumIdentifyDevice2, kotlin.coroutines.c<? super c> cVar) {
            super(2, cVar);
            this.f45097K = audioChannel;
            this.f45098L = hmDevice;
            this.f45099M = hmDevice2;
            this.f45100N = enumIdentifyDevice;
            this.f45101O = enumIdentifyDevice2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            Object b4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f45095I;
            Object obj2 = null;
            try {
                if (i4 != 0) {
                    if (i4 == 1) {
                        W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    W.n(obj);
                    HmDevice hmDevice = this.f45099M;
                    EnumIdentifyDevice enumIdentifyDevice = this.f45100N;
                    EnumIdentifyDevice enumIdentifyDevice2 = this.f45101O;
                    Result.a aVar = Result.f51807F;
                    a aVar2 = new a(hmDevice, enumIdentifyDevice, enumIdentifyDevice2, null);
                    this.f45095I = 1;
                    obj = w1.c(10000L, aVar2, this);
                    if (obj == l4) {
                        return l4;
                    }
                }
                b4 = Result.b(kotlin.coroutines.jvm.internal.a.a(((Boolean) obj).booleanValue()));
            } catch (Throwable th) {
                Result.a aVar3 = Result.f51807F;
                b4 = Result.b(W.a(th));
            }
            AudioChannel audioChannel = this.f45097K;
            if (!Result.i(b4)) {
                obj2 = b4;
            }
            com.harman.log.f.d(StereoChannelViewModel.f45082P, "flashAsStereo() >>> play tone on [" + audioChannel + "] rst[" + obj2 + "] exception:" + Result.e(b4) + " device " + com.harman.jbl.partybox.ui.party.b.f44881a.t(this.f45098L));
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((c) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            c cVar2 = new c(this.f45097K, this.f45098L, this.f45099M, this.f45100N, this.f45101O, cVar);
            cVar2.f45096J = obj;
            return cVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.StereoChannelViewModel$lightNormalDevice$1", f = "StereoChannelViewModel.kt", i = {}, l = {GestureInfo.f48244d0}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class d extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f45106I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ HmDevice f45107J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(HmDevice hmDevice, kotlin.coroutines.c<? super d> cVar) {
            super(2, cVar);
            this.f45107J = hmDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f45106I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                com.harman.jbl.partybox.ui.party.stereo.state.create.d dVar = com.harman.jbl.partybox.ui.party.stereo.state.create.d.f45289a;
                HmDevice hmDevice = this.f45107J;
                EnumIdentifyDevice enumIdentifyDevice = EnumIdentifyDevice.NORMAL;
                this.f45106I = 1;
                obj = dVar.b(hmDevice, enumIdentifyDevice, enumIdentifyDevice, this);
                if (obj == l4) {
                    return l4;
                }
            }
            com.harman.log.f.d(StereoChannelViewModel.f45082P, "lightNormalDevice() >>> rst[" + ((Boolean) obj).booleanValue() + "]");
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((d) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new d(this.f45107J, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.StereoChannelViewModel", f = "StereoChannelViewModel.kt", i = {0, 0, 0, 0}, l = {105}, m = "onSwipeClick", n = {"this", "mainDevice", "coDevice", "mainNextChn"}, s = {"L$0", "L$1", "L$2", "L$3"})
    /* loaded from: classes2.dex */
    public static final class e extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f45108H;

        /* renamed from: I, reason: collision with root package name */
        Object f45109I;

        /* renamed from: J, reason: collision with root package name */
        Object f45110J;

        /* renamed from: K, reason: collision with root package name */
        Object f45111K;

        /* renamed from: L, reason: collision with root package name */
        /* synthetic */ Object f45112L;

        /* renamed from: N, reason: collision with root package name */
        int f45114N;

        e(kotlin.coroutines.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f45112L = obj;
            this.f45114N |= Integer.MIN_VALUE;
            return StereoChannelViewModel.this.G(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.StereoChannelViewModel$onSwipeClick$result$1$1", f = "StereoChannelViewModel.kt", i = {}, l = {a.b.f43497g}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class f extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super Boolean>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f45115I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ HmDevice f45116J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ AudioChannel f45117K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(HmDevice hmDevice, AudioChannel audioChannel, kotlin.coroutines.c<? super f> cVar) {
            super(2, cVar);
            this.f45116J = hmDevice;
            this.f45117K = audioChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f45115I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                com.harman.jbl.partybox.ui.party.stereo.state.channel.b bVar = com.harman.jbl.partybox.ui.party.stereo.state.channel.b.f45280a;
                HmDevice hmDevice = this.f45116J;
                AudioChannel audioChannel = this.f45117K;
                this.f45115I = 1;
                obj = bVar.a(hmDevice, audioChannel, this);
                if (obj == l4) {
                    return l4;
                }
            }
            return obj;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super Boolean> cVar) {
            return ((f) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new f(this.f45116J, this.f45117K, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.StereoChannelViewModel", f = "StereoChannelViewModel.kt", i = {}, l = {218}, m = "onUnGroupClick", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class g extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        /* synthetic */ Object f45118H;

        /* renamed from: J, reason: collision with root package name */
        int f45120J;

        g(kotlin.coroutines.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f45118H = obj;
            this.f45120J |= Integer.MIN_VALUE;
            return StereoChannelViewModel.this.H(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.StereoChannelViewModel$onUnGroupClick$result$1$1", f = "StereoChannelViewModel.kt", i = {}, l = {219}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class h extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super Boolean>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f45121I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ HmDevice f45122J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ HmDevice f45123K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(HmDevice hmDevice, HmDevice hmDevice2, kotlin.coroutines.c<? super h> cVar) {
            super(2, cVar);
            this.f45122J = hmDevice;
            this.f45123K = hmDevice2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f45121I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                com.harman.jbl.partybox.ui.party.business.a aVar = com.harman.jbl.partybox.ui.party.business.a.f44891a;
                HmDevice hmDevice = this.f45122J;
                HmDevice hmDevice2 = this.f45123K;
                this.f45121I = 1;
                obj = aVar.o(hmDevice, hmDevice2, this);
                if (obj == l4) {
                    return l4;
                }
            }
            return obj;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super Boolean> cVar) {
            return ((h) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new h(this.f45122J, this.f45123K, cVar);
        }
    }

    @K
    private final void D() {
        HmDevice f4 = this.f45087J.f();
        if (f4 == null) {
            com.harman.log.f.b(f45082P, "lightNormalDevice() >>> cant get mainDev instance");
        } else {
            com.harman.log.f.a(f45082P, "lightNormalDevice() >>> emit identify to light normal");
            C2323l.f(k0.a(this), C2322k0.e(), null, new d(f4, null), 2, null);
        }
    }

    private final void F() {
        D();
    }

    private final void w(AudioChannel audioChannel) {
        HmDevice hmDevice;
        EnumIdentifyDevice enumIdentifyDevice;
        EnumIdentifyDevice enumIdentifyDevice2;
        L0 f4;
        L0 l02 = this.f45091N;
        if (l02 != null && !l02.m()) {
            com.harman.log.f.g(f45082P, "flashAsStereo() >>> last play job not completed");
            return;
        }
        HmDevice f5 = this.f45087J.f();
        if (f5 == null) {
            com.harman.log.f.b(f45082P, "flashAsStereo() >>> cant get main device");
            return;
        }
        int i4 = b.f45092a[audioChannel.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                hmDevice = null;
            } else {
                hmDevice = this.f45090M;
            }
        } else {
            hmDevice = this.f45089L;
        }
        HmDevice hmDevice2 = hmDevice;
        if (hmDevice2 == null) {
            com.harman.log.f.b(f45082P, "flashAsStereo() >>> cant get target device from channel[" + audioChannel.f() + "]");
            return;
        }
        com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
        if (bVar.o(hmDevice2, f5)) {
            enumIdentifyDevice = EnumIdentifyDevice.ONCE_ON;
        } else {
            enumIdentifyDevice = EnumIdentifyDevice.ONCE_OFF;
        }
        EnumIdentifyDevice enumIdentifyDevice3 = enumIdentifyDevice;
        if (bVar.o(hmDevice2, f5)) {
            enumIdentifyDevice2 = EnumIdentifyDevice.ONCE_OFF;
        } else {
            enumIdentifyDevice2 = EnumIdentifyDevice.ONCE_ON;
        }
        f4 = C2323l.f(k0.a(this), C2322k0.e(), null, new c(audioChannel, hmDevice2, f5, enumIdentifyDevice3, enumIdentifyDevice2, null), 2, null);
        this.f45091N = f4;
    }

    private final void x(AudioChannel audioChannel) {
        HmDevice hmDevice;
        int i4 = b.f45092a[audioChannel.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                hmDevice = null;
            } else {
                hmDevice = this.f45090M;
            }
        } else {
            hmDevice = this.f45089L;
        }
        if (hmDevice == null) {
            com.harman.log.f.b(f45082P, "flashAsTWS() >>> cant get device mapping channel[" + audioChannel.f() + "]");
            return;
        }
        HmDevice f4 = this.f45087J.f();
        if (f4 == null) {
            com.harman.log.f.b(f45082P, "flashAsTWS() >>> missing main device");
            return;
        }
        com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
        int i5 = !bVar.o(hmDevice, f4) ? 1 : 0;
        com.harman.log.f.d(f45082P, "flashAsTWS() >>> send flash CMD to device " + bVar.t(f4) + "\nchannel[" + audioChannel.f() + "] index[" + i5 + "]");
        z2.n n4 = com.harman.sdk.b.f47608a.n(f4);
        if (n4 != null) {
            n4.s0(f4, i5, 20, 1, null);
        }
    }

    @l3.e
    public final HmDevice A() {
        return this.f45087J.f();
    }

    @l3.d
    public final LiveData<EnumStereoType> B() {
        return this.f45086I;
    }

    @l3.e
    public final HmDevice C() {
        return this.f45090M;
    }

    @K
    public final void E(@l3.d AudioChannel channel) {
        int i4;
        F.p(channel, "channel");
        EnumStereoType f4 = this.f45086I.f();
        if (f4 == null) {
            i4 = -1;
        } else {
            i4 = b.f45093b[f4.ordinal()];
        }
        if (i4 != 1 && i4 != 2) {
            if (i4 == 3) {
                w(channel);
                return;
            }
            return;
        }
        x(channel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @l3.e
    @androidx.annotation.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(@l3.d kotlin.coroutines.c<? super java.lang.Boolean> r12) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.party.stereo.StereoChannelViewModel.G(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(11:5|6|7|(1:(1:10)(2:29|30))(2:31|(2:33|34)(3:35|36|(1:38)))|11|12|(4:14|(1:16)(1:22)|17|(2:19|20))|23|(1:25)|26|27))|41|6|7|(0)(0)|11|12|(0)|23|(0)|26|27) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x002d, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
    
        r0 = kotlin.Result.f51807F;
        r11 = kotlin.Result.b(kotlin.W.a(r11));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @l3.e
    @androidx.annotation.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(@l3.d kotlin.coroutines.c<? super java.lang.Boolean> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.harman.jbl.partybox.ui.party.stereo.StereoChannelViewModel.g
            if (r0 == 0) goto L13
            r0 = r11
            com.harman.jbl.partybox.ui.party.stereo.StereoChannelViewModel$g r0 = (com.harman.jbl.partybox.ui.party.stereo.StereoChannelViewModel.g) r0
            int r1 = r0.f45120J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45120J = r1
            goto L18
        L13:
            com.harman.jbl.partybox.ui.party.stereo.StereoChannelViewModel$g r0 = new com.harman.jbl.partybox.ui.party.stereo.StereoChannelViewModel$g
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f45118H
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f45120J
            r3 = 0
            r4 = 0
            java.lang.String r5 = "Stereo.ChannelViewModel"
            r6 = 1
            if (r2 == 0) goto L37
            if (r2 != r6) goto L2f
            kotlin.W.n(r11)     // Catch: java.lang.Throwable -> L2d
            goto L82
        L2d:
            r11 = move-exception
            goto L91
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L37:
            kotlin.W.n(r11)
            androidx.lifecycle.P<com.harman.sdk.device.HmDevice> r11 = r10.f45087J
            java.lang.Object r11 = r11.f()
            com.harman.sdk.device.HmDevice r11 = (com.harman.sdk.device.HmDevice) r11
            if (r11 != 0) goto L4e
            java.lang.String r11 = "onUnGroupClick() >>> no main device info"
            com.harman.log.f.g(r5, r11)
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.a.a(r3)
            return r11
        L4e:
            androidx.lifecycle.P<com.harman.sdk.device.HmDevice> r2 = r10.f45088K
            java.lang.Object r2 = r2.f()
            com.harman.sdk.device.HmDevice r2 = (com.harman.sdk.device.HmDevice) r2
            com.harman.jbl.partybox.ui.party.b r7 = com.harman.jbl.partybox.ui.party.b.f44881a
            java.lang.String r7 = r7.t(r11)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "onUnGroupClick() >>> send unGroup CMD to device "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.harman.log.f.d(r5, r7)
            kotlin.Result$a r7 = kotlin.Result.f51807F     // Catch: java.lang.Throwable -> L2d
            com.harman.jbl.partybox.ui.party.stereo.StereoChannelViewModel$h r7 = new com.harman.jbl.partybox.ui.party.stereo.StereoChannelViewModel$h     // Catch: java.lang.Throwable -> L2d
            r7.<init>(r11, r2, r4)     // Catch: java.lang.Throwable -> L2d
            r0.f45120J = r6     // Catch: java.lang.Throwable -> L2d
            r8 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r11 = kotlinx.coroutines.w1.c(r8, r7, r0)     // Catch: java.lang.Throwable -> L2d
            if (r11 != r1) goto L82
            return r1
        L82:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L2d
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.a.a(r11)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r11 = kotlin.Result.b(r11)     // Catch: java.lang.Throwable -> L2d
            goto L9b
        L91:
            kotlin.Result$a r0 = kotlin.Result.f51807F
            java.lang.Object r11 = kotlin.W.a(r11)
            java.lang.Object r11 = kotlin.Result.b(r11)
        L9b:
            boolean r0 = kotlin.Result.i(r11)
            if (r0 != 0) goto Lbf
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.a.a(r6)
            boolean r1 = kotlin.Result.i(r11)
            if (r1 == 0) goto Lad
            r1 = r4
            goto Lae
        Lad:
            r1 = r11
        Lae:
            boolean r0 = kotlin.jvm.internal.F.g(r0, r1)
            if (r0 != 0) goto Lb5
            goto Lbf
        Lb5:
            java.lang.String r11 = "onUnGroupClick() >>> unGroup suc, clear local Stereo info"
            com.harman.log.f.d(r5, r11)
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.a.a(r6)
            return r11
        Lbf:
            boolean r0 = kotlin.Result.i(r11)
            if (r0 == 0) goto Lc6
            goto Lc7
        Lc6:
            r4 = r11
        Lc7:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "onUnGroupClick() >>> fail to unGroup. rst["
            r11.append(r0)
            r11.append(r4)
            java.lang.String r0 = "]"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.harman.log.f.b(r5, r11)
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.a.a(r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.party.stereo.StereoChannelViewModel.H(kotlin.coroutines.c):java.lang.Object");
    }

    public final void I(@l3.e HmDevice hmDevice, @l3.d AudioChannel activeChannel) {
        z2.n n4;
        F.p(activeChannel, "activeChannel");
        if (hmDevice != null && (n4 = com.harman.sdk.b.f47608a.n(hmDevice)) != null) {
            n4.n0(hmDevice, activeChannel, null);
        }
    }

    @Override // androidx.lifecycle.A
    public void f(@l3.d androidx.lifecycle.E source, @l3.d Lifecycle.Event event) {
        F.p(source, "source");
        F.p(event, "event");
        if (b.f45094c[event.ordinal()] == 1) {
            F();
        }
    }

    @K
    public final void u(@l3.d k args) {
        AudioChannel audioChannel;
        int i4;
        String str;
        F.p(args, "args");
        this.f45086I.r(EnumStereoType.Companion.a(args.f()));
        HmDevice e4 = args.e();
        HmDevice c4 = args.c();
        this.f45087J.r(e4);
        this.f45088K.r(c4);
        String str2 = null;
        if (e4 != null) {
            audioChannel = e4.i();
        } else {
            audioChannel = null;
        }
        if (audioChannel == null) {
            i4 = -1;
        } else {
            i4 = b.f45092a[audioChannel.ordinal()];
        }
        if (i4 != 1) {
            if (i4 != 2) {
                this.f45089L = e4;
                this.f45090M = c4;
            } else {
                this.f45089L = c4;
                this.f45090M = e4;
            }
        } else {
            this.f45089L = e4;
            this.f45090M = c4;
        }
        if (c4 != null) {
            this.f45085H.r(EnumStereoChannelConnectState.CONNECTED);
        } else {
            this.f45085H.r(EnumStereoChannelConnectState.UNCONNECTED);
        }
        int f4 = args.f();
        int d4 = args.d();
        if (e4 != null) {
            str = com.harman.jbl.partybox.ui.party.b.f44881a.t(e4);
        } else {
            str = null;
        }
        if (c4 != null) {
            str2 = com.harman.jbl.partybox.ui.party.b.f44881a.t(c4);
        }
        com.harman.log.f.d(f45082P, "bindArgs() >>> type[" + f4 + "] from[" + d4 + "] mainDevice " + str + "\ncoDevice " + str2);
    }

    public final boolean v() {
        String str;
        String str2;
        String str3;
        HmDevice f4 = this.f45088K.f();
        String str4 = null;
        if (f4 != null) {
            str = f4.q();
        } else {
            str = null;
        }
        HmDevice f5 = this.f45087J.f();
        if (f5 != null) {
            str2 = f5.q();
        } else {
            str2 = null;
        }
        if (!F.g(str, str2)) {
            HmDevice f6 = this.f45088K.f();
            if (f6 != null) {
                str3 = f6.q();
            } else {
                str3 = null;
            }
            HmDevice f7 = this.f45087J.f();
            if (f7 != null) {
                str4 = f7.q();
            }
            return com.harman.sdk.utils.d.E(str3, str4);
        }
        return true;
    }

    @l3.d
    public final LiveData<EnumStereoChannelConnectState> y() {
        return this.f45085H;
    }

    @l3.e
    public final HmDevice z() {
        return this.f45089L;
    }
}
