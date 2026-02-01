package com.harman.jbl.partybox.ui.sq;

import X2.p;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.P;
import androidx.lifecycle.k0;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.StatusCode;
import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.U;

/* loaded from: classes2.dex */
public final class c extends com.harman.jbl.partybox.c {

    /* renamed from: R, reason: collision with root package name */
    @l3.d
    public static final a f45551R = new a(null);

    /* renamed from: S, reason: collision with root package name */
    @l3.d
    private static final String f45552S = "AuracastSQViewModel";

    /* renamed from: P, reason: collision with root package name */
    @l3.d
    private final P<PartyBoxDevice> f45553P = new P<>();

    /* renamed from: Q, reason: collision with root package name */
    @l3.d
    private final z2.d f45554Q = new C0404c();

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.sq.AuracastSQViewModel$closeSQ$1", f = "AuracastSQViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class b extends SuspendLambda implements p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f45555I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ HmDevice f45556J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ c f45557K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(HmDevice hmDevice, c cVar, kotlin.coroutines.c<? super b> cVar2) {
            super(2, cVar2);
            this.f45556J = hmDevice;
            this.f45557K = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f45555I == 0) {
                W.n(obj);
                HmDevice hmDevice = this.f45556J;
                c cVar = this.f45557K;
                z2.e e4 = com.harman.sdk.b.f47608a.e(hmDevice);
                if (e4 != null) {
                    e4.r0(hmDevice, false, cVar.f45554Q);
                }
                return H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((b) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new b(this.f45556J, this.f45557K, cVar);
        }
    }

    /* renamed from: com.harman.jbl.partybox.ui.sq.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0404c implements z2.d {
        C0404c() {
        }

        @Override // z2.d
        public void a(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            c.this.b0(device, code, msg);
        }

        @Override // z2.d
        public void b(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            c.this.b0(device, code, msg);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.sq.AuracastSQViewModel$openSQ$1", f = "AuracastSQViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class d extends SuspendLambda implements p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f45559I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ HmDevice f45560J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ c f45561K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(HmDevice hmDevice, c cVar, kotlin.coroutines.c<? super d> cVar2) {
            super(2, cVar2);
            this.f45560J = hmDevice;
            this.f45561K = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f45559I == 0) {
                W.n(obj);
                HmDevice hmDevice = this.f45560J;
                c cVar = this.f45561K;
                z2.e e4 = com.harman.sdk.b.f47608a.e(hmDevice);
                if (e4 != null) {
                    e4.r0(hmDevice, true, cVar.f45554Q);
                }
                return H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
            return new d(this.f45560J, this.f45561K, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(HmDevice hmDevice, StatusCode statusCode, BaseMessage baseMessage) {
        T1.a.a("AuracastSQViewModel, processMsg, msg = " + baseMessage + " device = " + hmDevice.J());
        if (statusCode == StatusCode.STATUS_SUCCESS) {
            F.n(hmDevice, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) hmDevice;
            if (baseMessage.b() == MessageID.DEVICE_INFO) {
                T1.a.a("AuracastSQViewModel, isSupportAuracastSQ = " + partyBoxDevice.G1() + " , auracastSQEnable = " + partyBoxDevice.O0());
                T(this.f45553P, partyBoxDevice);
                return;
            }
            if (baseMessage.b() == MessageID.RET_SQ_RESULT) {
                T1.a.a("AuracastSQViewModel, setSQ result, isSupportAuracastSQ = " + partyBoxDevice.G1() + " , auracastSQEnable = " + partyBoxDevice.O0());
                T(this.f45553P, partyBoxDevice);
            }
        }
    }

    public final void X(@l3.d HmDevice device) {
        F.p(device, "device");
        C2323l.f(k0.a(this), null, null, new b(device, this, null), 3, null);
    }

    @l3.d
    public final LiveData<PartyBoxDevice> Y() {
        return this.f45553P;
    }

    public final void Z(@l3.d HmDevice device) {
        F.p(device, "device");
        this.f38311M = device;
        z2.e e4 = com.harman.sdk.b.f47608a.e(device);
        if (e4 != null) {
            e4.m(this.f45554Q);
        }
    }

    public final void a0(@l3.d HmDevice device) {
        F.p(device, "device");
        C2323l.f(k0.a(this), null, null, new d(device, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.j0
    public void s() {
        z2.e e4;
        super.s();
        HmDevice hmDevice = this.f38311M;
        if (hmDevice != null && (e4 = com.harman.sdk.b.f47608a.e(hmDevice)) != null) {
            e4.h(this.f45554Q);
        }
    }
}
