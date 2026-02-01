package com.harman.jbl.partybox.ui.dashboard;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LiveData;
import com.harman.jbl.partybox.model.GroupInfo;
import com.harman.sdk.command.ReqMicConnectionInfoCommand;
import com.harman.sdk.command.ReqOneTouchMusicButton;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.message.TWSInfo;
import com.harman.sdk.utils.DeviceProtocol;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.PlayerStatus;
import com.harman.sdk.utils.StatusCode;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.w1;
import y2.InterfaceC2445a;

@kotlin.jvm.internal.U({"SMAP\nStageDashboardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StageDashboardViewModel.kt\ncom/harman/jbl/partybox/ui/dashboard/StageDashboardViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,373:1\n1#2:374\n1747#3,3:375\n1747#3,3:378\n288#3,2:381\n*S KotlinDebug\n*F\n+ 1 StageDashboardViewModel.kt\ncom/harman/jbl/partybox/ui/dashboard/StageDashboardViewModel\n*L\n153#1:375,3\n159#1:378,3\n346#1:381,2\n*E\n"})
/* loaded from: classes2.dex */
public final class E0 extends com.harman.jbl.partybox.c {

    /* renamed from: b0, reason: collision with root package name */
    @l3.d
    public static final a f42947b0 = new a(null);

    /* renamed from: c0, reason: collision with root package name */
    @l3.d
    public static final String f42948c0 = "StageDashboardViewModel";

    /* renamed from: P, reason: collision with root package name */
    @l3.e
    private HmDevice f42949P;

    /* renamed from: Q, reason: collision with root package name */
    @l3.d
    private final androidx.lifecycle.P<PartyBoxDevice> f42950Q = new androidx.lifecycle.P<>();

    /* renamed from: R, reason: collision with root package name */
    @l3.d
    private final androidx.lifecycle.P<Boolean> f42951R;

    /* renamed from: S, reason: collision with root package name */
    @l3.d
    private final LiveData<Boolean> f42952S;

    /* renamed from: T, reason: collision with root package name */
    @l3.d
    private final androidx.lifecycle.P<String> f42953T;

    /* renamed from: U, reason: collision with root package name */
    @l3.d
    private final LiveData<String> f42954U;

    /* renamed from: V, reason: collision with root package name */
    @l3.d
    private final androidx.lifecycle.P<Boolean> f42955V;

    /* renamed from: W, reason: collision with root package name */
    @l3.d
    private final LiveData<Boolean> f42956W;

    /* renamed from: X, reason: collision with root package name */
    @l3.e
    private final Handler f42957X;

    /* renamed from: Y, reason: collision with root package name */
    @l3.d
    private final androidx.lifecycle.P<Boolean> f42958Y;

    /* renamed from: Z, reason: collision with root package name */
    @l3.d
    private final InterfaceC2445a.InterfaceC0551a f42959Z;

    /* renamed from: a0, reason: collision with root package name */
    @l3.d
    private final z2.d f42960a0;

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
        public static final /* synthetic */ int[] f42961a;

        static {
            int[] iArr = new int[MessageID.values().length];
            try {
                iArr[MessageID.PLAYER_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageID.DEVICE_INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageID.RET_VOLUME_BOOST_RESULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageID.RET_SET_TONE_SHIFTER_RESULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f42961a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC2445a.InterfaceC0551a {
        c() {
        }

        @Override // y2.InterfaceC2445a.InterfaceC0551a
        public void a(@l3.e HmDevice hmDevice, int i4, @l3.d DeviceProtocol protocol) {
            String str;
            kotlin.jvm.internal.F.p(protocol, "protocol");
            String str2 = null;
            if (hmDevice != null) {
                str = hmDevice.n();
            } else {
                str = null;
            }
            HmDevice hmDevice2 = ((com.harman.jbl.partybox.c) E0.this).f38309K;
            if (hmDevice2 != null) {
                str2 = hmDevice2.n();
            }
            com.harman.log.f.a(E0.f42948c0, "StageDashboardViewModel connectionListener onStatusChanged: device = " + str + ", mainDevice = " + str2 + ", status = " + i4 + ", protocol = " + protocol);
            if (kotlin.jvm.internal.F.g(((com.harman.jbl.partybox.c) E0.this).f38309K, hmDevice) && i4 == 0) {
                com.harman.log.f.a(E0.f42948c0, "StageDashboardViewModel connectionListener onStatusChanged: changed bleConnectStatusLiveData to false");
                com.harman.jbl.partybox.h.f40556a.b(E0.this.e0(), Boolean.FALSE);
            }
        }

        @Override // y2.InterfaceC2445a.InterfaceC0551a
        public void b(@l3.d HmDevice hmDevice) {
            InterfaceC2445a.InterfaceC0551a.C0552a.a(this, hmDevice);
        }

        @Override // y2.InterfaceC2445a.InterfaceC0551a
        public void c(@l3.d HmDevice hmDevice) {
            InterfaceC2445a.InterfaceC0551a.C0552a.b(this, hmDevice);
        }

        @Override // y2.InterfaceC2445a.InterfaceC0551a
        public void d(@l3.d BaseMessage deviceMessage) {
            kotlin.jvm.internal.F.p(deviceMessage, "deviceMessage");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements z2.d {
        d() {
        }

        @Override // z2.d
        public void a(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            kotlin.jvm.internal.F.p(device, "device");
            kotlin.jvm.internal.F.p(code, "code");
            kotlin.jvm.internal.F.p(msg, "msg");
            com.harman.log.f.a(E0.f42948c0, "Message " + msg);
            E0.this.p0(device, code, msg);
        }

        @Override // z2.d
        public void b(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            kotlin.jvm.internal.F.p(device, "device");
            kotlin.jvm.internal.F.p(code, "code");
            kotlin.jvm.internal.F.p(msg, "msg");
            com.harman.log.f.a(E0.f42948c0, "Message " + msg);
            E0.this.p0(device, code, msg);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.dashboard.StageDashboardViewModel$getDeviceInfo$1", f = "StageDashboardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class e extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super kotlin.H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f42964I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ HmDevice f42965J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(HmDevice hmDevice, kotlin.coroutines.c<? super e> cVar) {
            super(2, cVar);
            this.f42965J = hmDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f42964I == 0) {
                kotlin.W.n(obj);
                z2.e e4 = com.harman.sdk.b.f47608a.e(this.f42965J);
                if (e4 != null) {
                    e4.h0(this.f42965J, null);
                }
                return kotlin.H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super kotlin.H0> cVar) {
            return ((e) v(u3, cVar)).D(kotlin.H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<kotlin.H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new e(this.f42965J, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.dashboard.StageDashboardViewModel$silenceUngroup$1", f = "StageDashboardViewModel.kt", i = {}, l = {292}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class f extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super kotlin.H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f42966I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f42967J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ HmDevice f42968K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ E0 f42969L;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.dashboard.StageDashboardViewModel$silenceUngroup$1$result$1$1", f = "StageDashboardViewModel.kt", i = {}, l = {293}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super Boolean>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f42970I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ E0 f42971J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ HmDevice f42972K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(E0 e02, HmDevice hmDevice, kotlin.coroutines.c<? super a> cVar) {
                super(2, cVar);
                this.f42971J = e02;
                this.f42972K = hmDevice;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f42970I;
                if (i4 != 0) {
                    if (i4 == 1) {
                        kotlin.W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    kotlin.W.n(obj);
                    E0 e02 = this.f42971J;
                    HmDevice hmDevice = this.f42972K;
                    this.f42970I = 1;
                    obj = e02.c0(hmDevice, null, this);
                    if (obj == l4) {
                        return l4;
                    }
                }
                return obj;
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super Boolean> cVar) {
                return ((a) v(u3, cVar)).D(kotlin.H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<kotlin.H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new a(this.f42971J, this.f42972K, cVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(HmDevice hmDevice, E0 e02, kotlin.coroutines.c<? super f> cVar) {
            super(2, cVar);
            this.f42968K = hmDevice;
            this.f42969L = e02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            Object b4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f42966I;
            Object obj2 = null;
            try {
                if (i4 != 0) {
                    if (i4 == 1) {
                        kotlin.W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    kotlin.W.n(obj);
                    com.harman.log.f.a(E0.f42948c0, "StageDashboardViewModel silenceUngroup >>> send unGroup CMD to device " + com.harman.jbl.partybox.ui.party.b.f44881a.t(this.f42968K));
                    E0 e02 = this.f42969L;
                    HmDevice hmDevice = this.f42968K;
                    Result.a aVar = Result.f51807F;
                    a aVar2 = new a(e02, hmDevice, null);
                    this.f42966I = 1;
                    obj = w1.c(20000L, aVar2, this);
                    if (obj == l4) {
                        return l4;
                    }
                }
                b4 = Result.b(kotlin.coroutines.jvm.internal.a.a(((Boolean) obj).booleanValue()));
            } catch (Throwable th) {
                Result.a aVar3 = Result.f51807F;
                b4 = Result.b(kotlin.W.a(th));
            }
            if (Result.j(b4)) {
                Boolean a4 = kotlin.coroutines.jvm.internal.a.a(true);
                if (!Result.i(b4)) {
                    obj2 = b4;
                }
                if (kotlin.jvm.internal.F.g(a4, obj2)) {
                    com.harman.log.f.a(E0.f42948c0, "StageDashboardViewModel silenceUngroup() >>> unGroup suc");
                    E0 e03 = this.f42969L;
                    e03.U(e03.f42955V, kotlin.coroutines.jvm.internal.a.a(true));
                    return kotlin.H0.f51801a;
                }
            }
            com.harman.log.f.b(E0.f42948c0, "silenceUngroup() >>> unGroup fail");
            return kotlin.H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super kotlin.H0> cVar) {
            return ((f) v(u3, cVar)).D(kotlin.H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<kotlin.H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            f fVar = new f(this.f42968K, this.f42969L, cVar);
            fVar.f42967J = obj;
            return fVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.dashboard.StageDashboardViewModel", f = "StageDashboardViewModel.kt", i = {}, l = {174}, m = "wakeupStandbyDevice", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class g extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        /* synthetic */ Object f42973H;

        /* renamed from: J, reason: collision with root package name */
        int f42975J;

        g(kotlin.coroutines.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f42973H = obj;
            this.f42975J |= Integer.MIN_VALUE;
            return E0.this.w0(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.dashboard.StageDashboardViewModel$wakeupStandbyDevice$connectResult$1$1", f = "StageDashboardViewModel.kt", i = {}, l = {174}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class h extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super Boolean>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f42976I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ HmDevice f42977J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(HmDevice hmDevice, kotlin.coroutines.c<? super h> cVar) {
            super(2, cVar);
            this.f42977J = hmDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f42976I;
            if (i4 != 0) {
                if (i4 == 1) {
                    kotlin.W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.W.n(obj);
                com.harman.jbl.partybox.ui.business.a aVar = com.harman.jbl.partybox.ui.business.a.f42135a;
                HmDevice hmDevice = this.f42977J;
                this.f42976I = 1;
                obj = aVar.l(hmDevice, this);
                if (obj == l4) {
                    return l4;
                }
            }
            return obj;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super Boolean> cVar) {
            return ((h) v(u3, cVar)).D(kotlin.H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<kotlin.H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new h(this.f42977J, cVar);
        }
    }

    public E0() {
        Handler handler;
        androidx.lifecycle.P<Boolean> p4 = new androidx.lifecycle.P<>();
        this.f42951R = p4;
        this.f42952S = p4;
        androidx.lifecycle.P<String> p5 = new androidx.lifecycle.P<>();
        this.f42953T = p5;
        this.f42954U = p5;
        androidx.lifecycle.P<Boolean> p6 = new androidx.lifecycle.P<>();
        this.f42955V = p6;
        this.f42956W = p6;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            handler = new Handler(myLooper);
        } else {
            handler = null;
        }
        this.f42957X = handler;
        this.f42958Y = new androidx.lifecycle.P<>();
        c cVar = new c();
        this.f42959Z = cVar;
        com.harman.sdk.impl.connect.i d4 = com.harman.sdk.b.d(com.harman.sdk.b.f47608a, null, 1, null);
        if (d4 != null) {
            d4.c(cVar);
        }
        this.f42960a0 = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c0(HmDevice hmDevice, HmDevice hmDevice2, kotlin.coroutines.c<? super Boolean> cVar) {
        if (!hmDevice.R()) {
            com.harman.log.f.b(f42948c0, "silenceUngroup connect device " + com.harman.jbl.partybox.ui.party.b.f44881a.t(hmDevice));
            return kotlin.coroutines.jvm.internal.a.a(false);
        }
        return com.harman.jbl.partybox.ui.party.business.a.f44891a.o(hmDevice, hmDevice2, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0(HmDevice hmDevice, StatusCode statusCode, BaseMessage baseMessage) {
        int i4;
        com.harman.log.f.a(f42948c0, "StageDashboardViewModel, Process observer called, msg = " + baseMessage + " device = " + hmDevice.J());
        if (statusCode == StatusCode.STATUS_SUCCESS) {
            MessageID b4 = baseMessage.b();
            if (b4 == null) {
                i4 = -1;
            } else {
                i4 = b.f42961a[b4.ordinal()];
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 == 4) {
                            com.harman.jbl.partybox.h.f40556a.b(this.f42950Q, hmDevice);
                            return;
                        }
                        return;
                    }
                    com.harman.jbl.partybox.h.f40556a.b(this.f42950Q, hmDevice);
                    return;
                }
                com.harman.jbl.partybox.h.f40556a.b(this.f42950Q, hmDevice);
                return;
            }
            com.harman.jbl.partybox.h.f40556a.b(this.f42950Q, hmDevice);
        }
    }

    public final boolean V(@l3.d PartyBoxDevice device) {
        Collection<HmDevice> i4;
        kotlin.jvm.internal.F.p(device, "device");
        B2.c k4 = com.harman.sdk.b.f47608a.k();
        if (k4 == null || (i4 = k4.i()) == null) {
            return false;
        }
        Collection<HmDevice> collection = i4;
        if (collection.isEmpty()) {
            return false;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (com.harman.jbl.partybox.ui.party.stereo.D.f45020a.b(device, (HmDevice) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean W(@l3.d PartyBoxDevice device) {
        Collection<HmDevice> i4;
        kotlin.jvm.internal.F.p(device, "device");
        B2.c k4 = com.harman.sdk.b.f47608a.k();
        if (k4 == null || (i4 = k4.i()) == null) {
            return false;
        }
        Collection<HmDevice> collection = i4;
        if (collection.isEmpty()) {
            return false;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (com.harman.jbl.partybox.ui.party.stereo.D.f45020a.c(device, (HmDevice) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final void b0(@l3.d HmDevice mainDevice, @l3.e List<? extends HmDevice> list) {
        GroupInfo groupInfo;
        String str;
        String a4;
        kotlin.jvm.internal.F.p(mainDevice, "mainDevice");
        com.harman.log.f.a(f42948c0, "StageDashboardViewModel checkDeviceGroupInfo mainDevice:" + mainDevice.n() + ",tws:" + mainDevice.M());
        if ((list != null && list.isEmpty()) || !com.harman.jbl.partybox.ui.party.stereo.D.f45020a.l(mainDevice)) {
            return;
        }
        TWSInfo M3 = mainDevice.M();
        Object obj = null;
        if (M3 != null && (a4 = M3.a()) != null) {
            groupInfo = U1.a.i(a4);
        } else {
            groupInfo = null;
        }
        com.harman.log.f.a(f42948c0, "StageDashboardViewModel checkDeviceGroupInfo groupInfo:" + groupInfo);
        if (groupInfo != null && groupInfo.u(mainDevice)) {
            TWSInfo M4 = mainDevice.M();
            if (M4 != null) {
                str = M4.a();
            } else {
                str = null;
            }
            String s4 = groupInfo.s(mainDevice.n());
            com.harman.log.f.a(f42948c0, "StageDashboardViewModel checkDeviceGroupInfo other device mac:" + ((Object) s4));
            if (s4 != null && s4.length() != 0) {
                if (list != null) {
                    for (Object obj2 : list) {
                        HmDevice hmDevice = (HmDevice) obj2;
                        if (kotlin.jvm.internal.F.g(hmDevice.n(), s4)) {
                            com.harman.jbl.partybox.ui.party.stereo.D d4 = com.harman.jbl.partybox.ui.party.stereo.D.f45020a;
                            if (!d4.l(hmDevice) || !d4.m(hmDevice, str)) {
                                obj = obj2;
                                break;
                            }
                        }
                    }
                    obj = (HmDevice) obj;
                }
                com.harman.log.f.a(f42948c0, "StageDashboardViewModel checkDeviceGroupInfo targetDevice:" + obj);
                if (obj != null) {
                    v0(mainDevice.n());
                }
            }
        }
    }

    public final void d0(@l3.e HmDevice hmDevice) {
        z2.b a4;
        if (hmDevice != null && (a4 = com.harman.sdk.b.f47608a.a(hmDevice)) != null) {
            a4.d0(hmDevice, null);
        }
    }

    @l3.d
    public final androidx.lifecycle.P<Boolean> e0() {
        return this.f42958Y;
    }

    @l3.d
    public final LiveData<PartyBoxDevice> f0() {
        return this.f42950Q;
    }

    @l3.e
    public final HmDevice g0() {
        return this.f42949P;
    }

    public final void h0(@l3.d HmDevice device) {
        kotlin.jvm.internal.F.p(device, "device");
        z2.e e4 = com.harman.sdk.b.f47608a.e(device);
        if (e4 != null) {
            e4.a0(device, null);
        }
    }

    public final void i0(@l3.d HmDevice device) {
        kotlin.jvm.internal.F.p(device, "device");
        C2323l.f(androidx.lifecycle.k0.a(this), null, null, new e(device, null), 3, null);
    }

    public final void j0(@l3.e HmDevice hmDevice) {
        z2.e e4;
        if (hmDevice != null && (e4 = com.harman.sdk.b.f47608a.e(hmDevice)) != null) {
            e4.q0(hmDevice, new ReqMicConnectionInfoCommand(), null);
        }
    }

    @l3.d
    public final LiveData<String> k0() {
        return this.f42954U;
    }

    public final void l0(@l3.d HmDevice device) {
        z2.e e4;
        kotlin.jvm.internal.F.p(device, "device");
        if (com.harman.sdk.utils.d.G(device) && (e4 = com.harman.sdk.b.f47608a.e(device)) != null) {
            e4.q0(device, new ReqOneTouchMusicButton(), null);
        }
    }

    @l3.d
    public final LiveData<Boolean> m0() {
        return this.f42956W;
    }

    @l3.d
    public final LiveData<Boolean> n0() {
        return this.f42952S;
    }

    public final void o0(@l3.d String actionType, @l3.d Bundle bundle) {
        kotlin.jvm.internal.F.p(actionType, "actionType");
        kotlin.jvm.internal.F.p(bundle, "bundle");
        HmDevice hmDevice = this.f38311M;
        if (hmDevice != null) {
            bundle.putString("di_action_type", actionType);
            bundle.putInt(L1.a.u3, com.harman.jbl.partybox.c.f38305O);
            bundle.putString(L1.a.f1655u, com.harman.sdk.utils.d.v(hmDevice.q()));
            K1.a.a(L1.a.f1514P1, bundle);
        }
    }

    public final void q0(@l3.d HmDevice connectedDevice, @l3.d PlayerStatus playerStateNext) {
        kotlin.jvm.internal.F.p(connectedDevice, "connectedDevice");
        kotlin.jvm.internal.F.p(playerStateNext, "playerStateNext");
        z2.l j4 = com.harman.sdk.b.f47608a.j(connectedDevice);
        if (j4 != null) {
            j4.C(connectedDevice, playerStateNext, null);
        }
    }

    public final void r0(@l3.d HmDevice connectedDevice, int i4) {
        kotlin.jvm.internal.F.p(connectedDevice, "connectedDevice");
        z2.l j4 = com.harman.sdk.b.f47608a.j(connectedDevice);
        if (j4 != null) {
            j4.m0(connectedDevice, i4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.j0
    public void s() {
        z2.e e4;
        com.harman.sdk.b bVar = com.harman.sdk.b.f47608a;
        com.harman.sdk.impl.connect.i d4 = com.harman.sdk.b.d(bVar, null, 1, null);
        if (d4 != null) {
            d4.d(this.f42959Z);
        }
        HmDevice hmDevice = this.f38311M;
        if (hmDevice != null && (e4 = bVar.e(hmDevice)) != null) {
            e4.h(this.f42960a0);
        }
    }

    public final void s0(@l3.d HmDevice device, boolean z3) {
        kotlin.jvm.internal.F.p(device, "device");
        z2.e e4 = com.harman.sdk.b.f47608a.e(device);
        if (e4 != null) {
            e4.l(device, z3, null);
        }
    }

    public final void t0(@l3.d HmDevice mainDevice) {
        kotlin.jvm.internal.F.p(mainDevice, "mainDevice");
        C2323l.f(androidx.lifecycle.k0.a(this), C2322k0.e(), null, new f(mainDevice, this, null), 2, null);
    }

    public final void u0(@l3.d HmDevice hmDevice) {
        kotlin.jvm.internal.F.p(hmDevice, "hmDevice");
        com.harman.log.f.a(f42948c0, "StageDashboardViewModel updateCurrentDevice:" + ((PartyBoxDevice) hmDevice));
        this.f42949P = hmDevice;
        this.f38309K = hmDevice;
        z2.e e4 = com.harman.sdk.b.f47608a.e(hmDevice);
        if (e4 != null) {
            e4.m(this.f42960a0);
        }
    }

    public final void v0(@l3.d String needToUngroupDeviceMac) {
        kotlin.jvm.internal.F.p(needToUngroupDeviceMac, "needToUngroupDeviceMac");
        T(this.f42953T, needToUngroupDeviceMac);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(1:10)(2:24|25))(3:26|27|(1:29))|11|12|(3:14|(1:16)|17)|22|19|20))|32|6|7|(0)(0)|11|12|(0)|22|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008b, code lost:
    
        if (kotlin.jvm.internal.F.g(r3, kotlin.coroutines.jvm.internal.a.a(true)) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002a, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        r9 = kotlin.Result.f51807F;
        r8 = kotlin.Result.b(kotlin.W.a(r8));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w0(@l3.d com.harman.sdk.device.HmDevice r8, @l3.d kotlin.coroutines.c<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.harman.jbl.partybox.ui.dashboard.E0.g
            if (r0 == 0) goto L13
            r0 = r9
            com.harman.jbl.partybox.ui.dashboard.E0$g r0 = (com.harman.jbl.partybox.ui.dashboard.E0.g) r0
            int r1 = r0.f42975J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42975J = r1
            goto L18
        L13:
            com.harman.jbl.partybox.ui.dashboard.E0$g r0 = new com.harman.jbl.partybox.ui.dashboard.E0$g
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f42973H
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f42975J
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.W.n(r9)     // Catch: java.lang.Throwable -> L2a
            goto L5c
        L2a:
            r8 = move-exception
            goto L6b
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            kotlin.W.n(r9)
            java.lang.String r9 = "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice"
            kotlin.jvm.internal.F.n(r8, r9)
            r9 = r8
            com.harman.sdk.device.PartyBoxDevice r9 = (com.harman.sdk.device.PartyBoxDevice) r9
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            java.lang.String r2 = "action_power_on"
            r7.o0(r2, r9)
            kotlin.Result$a r9 = kotlin.Result.f51807F     // Catch: java.lang.Throwable -> L2a
            com.harman.jbl.partybox.ui.dashboard.E0$h r9 = new com.harman.jbl.partybox.ui.dashboard.E0$h     // Catch: java.lang.Throwable -> L2a
            r9.<init>(r8, r3)     // Catch: java.lang.Throwable -> L2a
            r0.f42975J = r4     // Catch: java.lang.Throwable -> L2a
            r5 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r9 = kotlinx.coroutines.w1.c(r5, r9, r0)     // Catch: java.lang.Throwable -> L2a
            if (r9 != r1) goto L5c
            return r1
        L5c:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L2a
            boolean r8 = r9.booleanValue()     // Catch: java.lang.Throwable -> L2a
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.a.a(r8)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r8 = kotlin.Result.b(r8)     // Catch: java.lang.Throwable -> L2a
            goto L75
        L6b:
            kotlin.Result$a r9 = kotlin.Result.f51807F
            java.lang.Object r8 = kotlin.W.a(r8)
            java.lang.Object r8 = kotlin.Result.b(r8)
        L75:
            boolean r9 = kotlin.Result.j(r8)
            if (r9 == 0) goto L8e
            boolean r9 = kotlin.Result.i(r8)
            if (r9 == 0) goto L82
            goto L83
        L82:
            r3 = r8
        L83:
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.a.a(r4)
            boolean r8 = kotlin.jvm.internal.F.g(r3, r8)
            if (r8 == 0) goto L8e
            goto L8f
        L8e:
            r4 = 0
        L8f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "StageDashboardViewModel wakeupStandbyDevice:"
            r8.append(r9)
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "StageDashboardViewModel"
            com.harman.log.f.a(r9, r8)
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.a.a(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.dashboard.E0.w0(com.harman.sdk.device.HmDevice, kotlin.coroutines.c):java.lang.Object");
    }
}
