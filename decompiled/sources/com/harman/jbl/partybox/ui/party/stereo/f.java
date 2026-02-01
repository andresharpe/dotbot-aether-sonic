package com.harman.jbl.partybox.ui.party.stereo;

import androidx.annotation.InterfaceC0561d;
import androidx.annotation.K;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.P;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.EnumSyncOnOff;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.StatusCode;
import kotlin.H0;
import kotlin.Result;
import kotlin.W;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.InterfaceC2333q;
import kotlinx.coroutines.L0;
import kotlinx.coroutines.w1;

@U({"SMAP\nGroupSettingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GroupSettingViewModel.kt\ncom/harman/jbl/partybox/ui/party/stereo/GroupSettingViewModel\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,122:1\n314#2,11:123\n*S KotlinDebug\n*F\n+ 1 GroupSettingViewModel.kt\ncom/harman/jbl/partybox/ui/party/stereo/GroupSettingViewModel\n*L\n86#1:123,11\n*E\n"})
/* loaded from: classes2.dex */
public final class f extends j0 {

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    public static final a f45205J = new a(null);

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private static final String f45206K = "Stereo.GroupSettingViewModel";

    /* renamed from: L, reason: collision with root package name */
    private static final long f45207L = 10000;

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final P<HmDevice> f45208H = new P<>();

    /* renamed from: I, reason: collision with root package name */
    @l3.e
    private L0 f45209I;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.GroupSettingViewModel$onSwitcherClick$2", f = "GroupSettingViewModel.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class b extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f45210I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f45211J;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ z2.e f45213L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ HmDevice f45214M;

        /* renamed from: N, reason: collision with root package name */
        final /* synthetic */ EnumSyncOnOff f45215N;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.GroupSettingViewModel$onSwitcherClick$2$rsp$1$1", f = "GroupSettingViewModel.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super HmDevice>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f45216I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ f f45217J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ z2.e f45218K;

            /* renamed from: L, reason: collision with root package name */
            final /* synthetic */ HmDevice f45219L;

            /* renamed from: M, reason: collision with root package name */
            final /* synthetic */ EnumSyncOnOff f45220M;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar, z2.e eVar, HmDevice hmDevice, EnumSyncOnOff enumSyncOnOff, kotlin.coroutines.c<? super a> cVar) {
                super(2, cVar);
                this.f45217J = fVar;
                this.f45218K = eVar;
                this.f45219L = hmDevice;
                this.f45220M = enumSyncOnOff;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f45216I;
                if (i4 != 0) {
                    if (i4 == 1) {
                        W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    W.n(obj);
                    f fVar = this.f45217J;
                    z2.e eVar = this.f45218K;
                    HmDevice hmDevice = this.f45219L;
                    EnumSyncOnOff enumSyncOnOff = this.f45220M;
                    this.f45216I = 1;
                    obj = fVar.z(eVar, hmDevice, enumSyncOnOff, this);
                    if (obj == l4) {
                        return l4;
                    }
                }
                return obj;
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super HmDevice> cVar) {
                return ((a) v(u3, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new a(this.f45217J, this.f45218K, this.f45219L, this.f45220M, cVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(z2.e eVar, HmDevice hmDevice, EnumSyncOnOff enumSyncOnOff, kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
            this.f45213L = eVar;
            this.f45214M = hmDevice;
            this.f45215N = enumSyncOnOff;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            Object b4;
            Object obj2;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f45210I;
            try {
                if (i4 != 0) {
                    if (i4 == 1) {
                        W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    W.n(obj);
                    f fVar = f.this;
                    z2.e eVar = this.f45213L;
                    HmDevice hmDevice = this.f45214M;
                    EnumSyncOnOff enumSyncOnOff = this.f45215N;
                    Result.a aVar = Result.f51807F;
                    a aVar2 = new a(fVar, eVar, hmDevice, enumSyncOnOff, null);
                    this.f45210I = 1;
                    obj = w1.c(10000L, aVar2, this);
                    if (obj == l4) {
                        return l4;
                    }
                }
                b4 = Result.b((HmDevice) obj);
            } catch (Throwable th) {
                Result.a aVar3 = Result.f51807F;
                b4 = Result.b(W.a(th));
            }
            if (Result.i(b4)) {
                obj2 = null;
            } else {
                obj2 = b4;
            }
            HmDevice hmDevice2 = (HmDevice) obj2;
            if (hmDevice2 != null) {
                f fVar2 = f.this;
                if (Result.j(b4)) {
                    fVar2.f45208H.r(hmDevice2);
                    com.harman.log.f.d(f.f45206K, "onSwitcherClick() >>> switch sync on/off state suc " + com.harman.jbl.partybox.ui.party.b.f44881a.t(hmDevice2));
                    return H0.f51801a;
                }
            }
            com.harman.log.f.b(f.f45206K, "onSwitcherClick() >>> fail to sync on/off state, exception " + Result.e(b4));
            return H0.f51801a;
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
            b bVar = new b(this.f45213L, this.f45214M, this.f45215N, cVar);
            bVar.f45211J = obj;
            return bVar;
        }
    }

    @U({"SMAP\nGroupSettingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GroupSettingViewModel.kt\ncom/harman/jbl/partybox/ui/party/stereo/GroupSettingViewModel$requestSyncOnOff$2$listener$1\n+ 2 PartyUtils.kt\ncom/harman/jbl/partybox/ui/party/PartyUtils\n*L\n1#1,122:1\n94#2,4:123\n*S KotlinDebug\n*F\n+ 1 GroupSettingViewModel.kt\ncom/harman/jbl/partybox/ui/party/stereo/GroupSettingViewModel$requestSyncOnOff$2$listener$1\n*L\n109#1:123,4\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class c implements z2.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2333q<HmDevice> f45221a;

        /* JADX WARN: Multi-variable type inference failed */
        c(InterfaceC2333q<? super HmDevice> interfaceC2333q) {
            this.f45221a = interfaceC2333q;
        }

        @InterfaceC0561d
        private final void c(InterfaceC2333q<? super HmDevice> interfaceC2333q, HmDevice hmDevice, StatusCode statusCode, BaseMessage baseMessage) {
            boolean z3;
            HmDevice hmDevice2;
            String str;
            EnumSyncOnOff L3;
            if (MessageID.SYNC_ON_OFF != baseMessage.b()) {
                return;
            }
            if (StatusCode.STATUS_SUCCESS == statusCode) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object a4 = baseMessage.a();
            String str2 = null;
            if (a4 instanceof HmDevice) {
                hmDevice2 = (HmDevice) a4;
            } else {
                hmDevice2 = null;
            }
            if (z3) {
                str = "suc";
            } else {
                str = L1.a.f1625n3;
            }
            if (hmDevice2 != null && (L3 = hmDevice2.L()) != null) {
                str2 = L3.e();
            }
            com.harman.log.f.d(f.f45206K, "requestSyncOnOff.onStatusChanged() >>> req [" + str + "] target state[" + str2 + "]");
            com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
            if (interfaceC2333q.c()) {
                Result.a aVar = Result.f51807F;
                interfaceC2333q.x(Result.b(hmDevice2));
            }
        }

        @Override // z2.d
        public void a(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            c(this.f45221a, device, code, msg);
        }

        @Override // z2.d
        public void b(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            c(this.f45221a, device, code, msg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object z(z2.e eVar, HmDevice hmDevice, EnumSyncOnOff enumSyncOnOff, kotlin.coroutines.c<? super HmDevice> cVar) {
        kotlin.coroutines.c e4;
        Object l4;
        e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(e4, 1);
        rVar.T();
        c cVar2 = new c(rVar);
        com.harman.log.f.d(f45206K, "requestSyncOnOff() >>> send SYNC_ON_OFF CMD");
        eVar.M(hmDevice, enumSyncOnOff, cVar2);
        Object z3 = rVar.z();
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (z3 == l4) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return z3;
    }

    public final void w(@l3.d C2030a args) {
        F.p(args, "args");
        this.f45208H.r(args.d());
    }

    @l3.d
    public final LiveData<HmDevice> x() {
        return this.f45208H;
    }

    @K
    public final void y() {
        L0 f4;
        L0 l02 = this.f45209I;
        if (l02 != null && !l02.m()) {
            com.harman.log.f.g(f45206K, "onSwitcherClick() >>> last sync on/off job not completed");
            return;
        }
        HmDevice f5 = this.f45208H.f();
        if (f5 == null) {
            com.harman.log.f.b(f45206K, "onSwitcherClick() >>> missing main device");
            return;
        }
        z2.e e4 = com.harman.sdk.b.f47608a.e(f5);
        if (e4 == null) {
            com.harman.log.f.b(f45206K, "onSwitcherClick() >>> missing device controller for device " + com.harman.jbl.partybox.ui.party.b.f44881a.t(f5));
            return;
        }
        f4 = C2323l.f(k0.a(this), C2322k0.e(), null, new b(e4, f5, D.f45020a.t(f5.L()), null), 2, null);
        this.f45209I = f4;
    }
}
