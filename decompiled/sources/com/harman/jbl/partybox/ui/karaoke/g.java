package com.harman.jbl.partybox.ui.karaoke;

import X2.p;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.P;
import androidx.lifecycle.k0;
import com.harman.sdk.command.ReqMicConnectionInfoCommand;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.message.KaraokeMicEQInfo;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.StatusCode;
import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.U;
import z2.h;

/* loaded from: classes2.dex */
public final class g extends com.harman.jbl.partybox.c {

    /* renamed from: Y, reason: collision with root package name */
    @l3.d
    public static final a f43866Y = new a(null);

    /* renamed from: Z, reason: collision with root package name */
    @l3.d
    private static final String f43867Z = "HmKaraokeViewModel";

    /* renamed from: P, reason: collision with root package name */
    private final long f43868P = 300;

    /* renamed from: Q, reason: collision with root package name */
    @l3.e
    private Handler f43869Q;

    /* renamed from: R, reason: collision with root package name */
    @l3.e
    private Handler f43870R;

    /* renamed from: S, reason: collision with root package name */
    @l3.e
    private Handler f43871S;

    /* renamed from: T, reason: collision with root package name */
    private int f43872T;

    /* renamed from: U, reason: collision with root package name */
    private int f43873U;

    /* renamed from: V, reason: collision with root package name */
    private int f43874V;

    /* renamed from: W, reason: collision with root package name */
    @l3.d
    private final P<PartyBoxDevice> f43875W;

    /* renamed from: X, reason: collision with root package name */
    @l3.d
    private final z2.d f43876X;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements z2.d {
        b() {
        }

        @Override // z2.d
        public void a(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            g.this.b0(device, code, msg);
        }

        @Override // z2.d
        public void b(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            g.this.b0(device, code, msg);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.karaoke.KaraokeViewModel$getMicConnectionInfo$1", f = "KaraokeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class c extends SuspendLambda implements p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f43878I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ HmDevice f43879J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(HmDevice hmDevice, kotlin.coroutines.c<? super c> cVar) {
            super(2, cVar);
            this.f43879J = hmDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f43878I == 0) {
                W.n(obj);
                HmDevice hmDevice = this.f43879J;
                z2.e e4 = com.harman.sdk.b.f47608a.e(hmDevice);
                if (e4 != null) {
                    e4.q0(hmDevice, new ReqMicConnectionInfoCommand(), null);
                }
                return H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
            return new c(this.f43879J, cVar);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.karaoke.KaraokeViewModel$reqKaraokeDataOperation$1", f = "KaraokeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class d extends SuspendLambda implements p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f43880I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ HmDevice f43881J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(HmDevice hmDevice, kotlin.coroutines.c<? super d> cVar) {
            super(2, cVar);
            this.f43881J = hmDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f43880I == 0) {
                W.n(obj);
                PartyBoxDevice partyBoxDevice = (PartyBoxDevice) this.f43881J;
                h g4 = com.harman.sdk.b.f47608a.g(partyBoxDevice);
                if (g4 != null) {
                    g4.F(partyBoxDevice, null);
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
            return new d(this.f43881J, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.karaoke.KaraokeViewModel$setKaraokeValue$1", f = "KaraokeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class e extends SuspendLambda implements p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f43882I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ PartyBoxDevice f43883J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ int f43884K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ int f43885L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(PartyBoxDevice partyBoxDevice, int i4, int i5, kotlin.coroutines.c<? super e> cVar) {
            super(2, cVar);
            this.f43883J = partyBoxDevice;
            this.f43884K = i4;
            this.f43885L = i5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            String str;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f43882I == 0) {
                W.n(obj);
                h g4 = com.harman.sdk.b.f47608a.g(this.f43883J);
                if (g4 != null) {
                    g4.B0(this.f43883J, this.f43884K, this.f43885L, null);
                }
                int i4 = this.f43884K;
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            str = "";
                        } else {
                            str = L1.a.f1461C0;
                        }
                    } else {
                        str = L1.a.f1457B0;
                    }
                } else {
                    str = L1.a.f1453A0;
                }
                Bundle bundle = new Bundle();
                PartyBoxDevice partyBoxDevice = this.f43883J;
                bundle.putString("di_action_type", L1.a.f1569c2);
                bundle.putInt(L1.a.w3, com.harman.jbl.partybox.c.f38305O);
                bundle.putString(L1.a.f1522R1, str);
                bundle.putString(L1.a.f1655u, com.harman.sdk.utils.d.v(partyBoxDevice.q()));
                K1.a.a(L1.a.f1514P1, bundle);
                return H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((e) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new e(this.f43883J, this.f43884K, this.f43885L, cVar);
        }
    }

    public g() {
        com.harman.log.f.a(f43867Z, "KaraokeViewModel init");
        this.f43875W = new P<>();
        this.f43876X = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(HmDevice hmDevice, StatusCode statusCode, BaseMessage baseMessage) {
        Integer num;
        Integer num2;
        com.harman.log.f.a(f43867Z, "HmKaraokeViewModel, karaokeUpdate observer called, msg = " + baseMessage + " device = " + hmDevice.J());
        if (statusCode == StatusCode.STATUS_SUCCESS) {
            F.n(hmDevice, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) hmDevice;
            if (baseMessage.b() == MessageID.KARAOKE_STATUS) {
                KaraokeMicEQInfo Y02 = partyBoxDevice.Y0();
                Integer num3 = null;
                if (Y02 != null) {
                    num = Integer.valueOf(Y02.a());
                } else {
                    num = null;
                }
                KaraokeMicEQInfo Y03 = partyBoxDevice.Y0();
                if (Y03 != null) {
                    num2 = Integer.valueOf(Y03.c());
                } else {
                    num2 = null;
                }
                KaraokeMicEQInfo Y04 = partyBoxDevice.Y0();
                if (Y04 != null) {
                    num3 = Integer.valueOf(Y04.b());
                }
                com.harman.log.f.a(f43867Z, "HmKaraokeViewModel, Bass = " + num + " , treble = " + num2 + " , echo = " + num3);
                T(this.f43875W, partyBoxDevice);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e0(KaraokeMicEQInfo it, g this$0, HmDevice device) {
        F.p(it, "$it");
        F.p(this$0, "this$0");
        F.p(device, "$device");
        it.d(this$0.f43872T);
        this$0.j0((PartyBoxDevice) device, 1, this$0.f43872T);
        this$0.f43869Q = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(KaraokeMicEQInfo it, g this$0, HmDevice device) {
        F.p(it, "$it");
        F.p(this$0, "this$0");
        F.p(device, "$device");
        it.e(this$0.f43874V);
        this$0.j0((PartyBoxDevice) device, 3, this$0.f43874V);
        this$0.f43871S = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i0(KaraokeMicEQInfo it, g this$0, HmDevice device) {
        F.p(it, "$it");
        F.p(this$0, "this$0");
        F.p(device, "$device");
        it.f(this$0.f43873U);
        this$0.j0((PartyBoxDevice) device, 2, this$0.f43873U);
        this$0.f43870R = null;
    }

    @l3.d
    public final LiveData<PartyBoxDevice> Z() {
        return this.f43875W;
    }

    public final void a0(@l3.d HmDevice device) {
        F.p(device, "device");
        z2.e e4 = com.harman.sdk.b.f47608a.e(device);
        if (e4 != null) {
            e4.m(this.f43876X);
        }
        C2323l.f(k0.a(this), null, null, new c(device, null), 3, null);
    }

    public final void c0(@l3.d HmDevice device) {
        F.p(device, "device");
        z2.e e4 = com.harman.sdk.b.f47608a.e(device);
        if (e4 != null) {
            e4.m(this.f43876X);
        }
        T(this.f43875W, (PartyBoxDevice) device);
        C2323l.f(k0.a(this), null, null, new d(device, null), 3, null);
    }

    public final void d0(@l3.d final HmDevice device, int i4, @l3.d String seekbarTxtValue) {
        PartyBoxDevice partyBoxDevice;
        final KaraokeMicEQInfo Y02;
        F.p(device, "device");
        F.p(seekbarTxtValue, "seekbarTxtValue");
        this.f43872T = i4;
        if (device instanceof PartyBoxDevice) {
            partyBoxDevice = (PartyBoxDevice) device;
        } else {
            partyBoxDevice = null;
        }
        if (partyBoxDevice != null && (Y02 = partyBoxDevice.Y0()) != null && Y02.a() != i4 && this.f43869Q == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            this.f43869Q = handler;
            handler.postDelayed(new Runnable() { // from class: com.harman.jbl.partybox.ui.karaoke.d
                @Override // java.lang.Runnable
                public final void run() {
                    g.e0(KaraokeMicEQInfo.this, this, device);
                }
            }, this.f43868P);
        }
    }

    public final void f0(@l3.d final HmDevice device, int i4) {
        PartyBoxDevice partyBoxDevice;
        final KaraokeMicEQInfo Y02;
        F.p(device, "device");
        this.f43874V = i4;
        if (device instanceof PartyBoxDevice) {
            partyBoxDevice = (PartyBoxDevice) device;
        } else {
            partyBoxDevice = null;
        }
        if (partyBoxDevice != null && (Y02 = partyBoxDevice.Y0()) != null && Y02.b() != i4 && this.f43871S == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            this.f43871S = handler;
            handler.postDelayed(new Runnable() { // from class: com.harman.jbl.partybox.ui.karaoke.e
                @Override // java.lang.Runnable
                public final void run() {
                    g.g0(KaraokeMicEQInfo.this, this, device);
                }
            }, this.f43868P);
        }
    }

    public final void h0(@l3.d final HmDevice device, int i4, @l3.d String seekbarTxtValue) {
        PartyBoxDevice partyBoxDevice;
        final KaraokeMicEQInfo Y02;
        F.p(device, "device");
        F.p(seekbarTxtValue, "seekbarTxtValue");
        this.f43873U = i4;
        if (device instanceof PartyBoxDevice) {
            partyBoxDevice = (PartyBoxDevice) device;
        } else {
            partyBoxDevice = null;
        }
        if (partyBoxDevice != null && (Y02 = partyBoxDevice.Y0()) != null && Y02.c() != i4 && this.f43870R == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            this.f43870R = handler;
            handler.postDelayed(new Runnable() { // from class: com.harman.jbl.partybox.ui.karaoke.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.i0(KaraokeMicEQInfo.this, this, device);
                }
            }, this.f43868P);
        }
    }

    public final void j0(@l3.d PartyBoxDevice device, int i4, int i5) {
        F.p(device, "device");
        C2323l.f(k0.a(this), null, null, new e(device, i4, i5, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.j0
    public void s() {
        z2.e e4;
        super.s();
        PartyBoxDevice f4 = this.f43875W.f();
        if (f4 != null && (e4 = com.harman.sdk.b.f47608a.e(f4)) != null) {
            e4.h(this.f43876X);
        }
    }
}
