package com.harman.jbl.partybox.ui.djeffects.viewmodel;

import X2.p;
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.P;
import androidx.lifecycle.k0;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.StatusCode;
import f2.C2054a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C2122h0;
import kotlin.H0;
import kotlin.W;
import kotlin.collections.C2109w;
import kotlin.collections.Y;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlinx.coroutines.C2323l;
import z2.f;
import z2.i;

@U({"SMAP\nHmDJEffectViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HmDJEffectViewModel.kt\ncom/harman/jbl/partybox/ui/djeffects/viewmodel/HmDJEffectViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,255:1\n1549#2:256\n1620#2,3:257\n819#2:260\n847#2,2:261\n1549#2:263\n1620#2,3:264\n*S KotlinDebug\n*F\n+ 1 HmDJEffectViewModel.kt\ncom/harman/jbl/partybox/ui/djeffects/viewmodel/HmDJEffectViewModel\n*L\n226#1:256\n226#1:257,3\n242#1:260\n242#1:261,2\n245#1:263\n245#1:264,3\n*E\n"})
/* loaded from: classes2.dex */
public final class a extends com.harman.jbl.partybox.c {

    /* renamed from: V, reason: collision with root package name */
    @l3.d
    public static final C0374a f43386V = new C0374a(null);

    /* renamed from: W, reason: collision with root package name */
    @l3.d
    private static final String f43387W = "HmDJEffectViewModel";

    /* renamed from: P, reason: collision with root package name */
    @l3.d
    private final P<List<Integer>> f43388P;

    /* renamed from: Q, reason: collision with root package name */
    @l3.d
    private final LiveData<List<Integer>> f43389Q;

    /* renamed from: R, reason: collision with root package name */
    @l3.d
    private final P<List<V1.a>> f43390R;

    /* renamed from: S, reason: collision with root package name */
    @l3.d
    private final LiveData<List<V1.a>> f43391S;

    /* renamed from: T, reason: collision with root package name */
    @l3.d
    private final P<List<Integer>> f43392T;

    /* renamed from: U, reason: collision with root package name */
    @l3.d
    private final z2.d f43393U;

    /* renamed from: com.harman.jbl.partybox.ui.djeffects.viewmodel.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0374a {
        public /* synthetic */ C0374a(C2197u c2197u) {
            this();
        }

        private C0374a() {
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43394a;

        static {
            int[] iArr = new int[MessageID.values().length];
            try {
                iArr[MessageID.LIGHT_ACTIVE_PATTERN_STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageID.DJ_STATUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f43394a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements z2.d {
        c() {
        }

        @Override // z2.d
        public void a(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            a.this.d0(device, code, msg);
        }

        @Override // z2.d
        public void b(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            a.this.d0(device, code, msg);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.djeffects.viewmodel.HmDJEffectViewModel$reqDJEffectDataOperation$1", f = "HmDJEffectViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class d extends SuspendLambda implements p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f43396I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ HmDevice f43397J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ a f43398K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(HmDevice hmDevice, a aVar, kotlin.coroutines.c<? super d> cVar) {
            super(2, cVar);
            this.f43397J = hmDevice;
            this.f43398K = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f43396I == 0) {
                W.n(obj);
                HmDevice hmDevice = this.f43397J;
                a aVar = this.f43398K;
                f b4 = com.harman.sdk.b.f47608a.b(hmDevice);
                if (b4 != null) {
                    b4.z0(hmDevice, aVar.f43393U);
                }
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
            return new d(this.f43397J, this.f43398K, cVar);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.djeffects.viewmodel.HmDJEffectViewModel$setDJEffectToneOperation$1", f = "HmDJEffectViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class e extends SuspendLambda implements p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f43399I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ HmDevice f43400J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ int f43401K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ a f43402L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(HmDevice hmDevice, int i4, a aVar, kotlin.coroutines.c<? super e> cVar) {
            super(2, cVar);
            this.f43400J = hmDevice;
            this.f43401K = i4;
            this.f43402L = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f43399I == 0) {
                W.n(obj);
                f b4 = com.harman.sdk.b.f47608a.b(this.f43400J);
                if (b4 != null) {
                    b4.v(this.f43400J, this.f43401K, this.f43402L.f43393U);
                }
                return H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((e) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new e(this.f43400J, this.f43401K, this.f43402L, cVar);
        }
    }

    public a() {
        P<List<Integer>> p4 = new P<>();
        this.f43388P = p4;
        this.f43389Q = p4;
        P<List<V1.a>> p5 = new P<>();
        this.f43390R = p5;
        this.f43391S = p5;
        this.f43392T = new P<>();
        this.f43393U = new c();
    }

    private final void X(HmDevice hmDevice, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("di_action_type", str);
        bundle.putString(L1.a.f1522R1, str2);
        bundle.putString(L1.a.f1655u, com.harman.sdk.utils.d.v(hmDevice.q()));
        K1.a.a(L1.a.f1514P1, bundle);
    }

    private final String a0(int i4) {
        switch (i4) {
            case 0:
                return "horn";
            case 1:
                return "clapping";
            case 2:
                return L1.a.f1602j0;
            case 3:
                return L1.a.f1607k0;
            case 4:
                return L1.a.f1612l0;
            case 5:
                return "barking";
            case 6:
                return "like";
            case 7:
                return "boo";
            case 8:
                return "ready";
            default:
                return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0(HmDevice hmDevice, StatusCode statusCode, BaseMessage baseMessage) {
        int i4;
        com.harman.log.f.a(f43387W, "ButtonSettingUpdate observer called, msg = " + baseMessage + " device = " + hmDevice.n());
        if (statusCode == StatusCode.STATUS_SUCCESS) {
            MessageID b4 = baseMessage.b();
            if (b4 == null) {
                i4 = -1;
            } else {
                i4 = b.f43394a[b4.ordinal()];
            }
            if (i4 != 1) {
                if (i4 == 2) {
                    com.harman.log.f.a(f43387W, "Received DJ_STATUS, msg = " + baseMessage + " device = " + hmDevice.n());
                    if (com.harman.sdk.utils.d.I(hmDevice.q())) {
                        k0(hmDevice);
                        return;
                    }
                    return;
                }
                return;
            }
            com.harman.log.f.a(f43387W, "Received LIGHT_STATUS, msg = " + baseMessage + " device = " + hmDevice.n());
            c0(hmDevice);
        }
    }

    private final void k0(HmDevice hmDevice) {
        F.n(hmDevice, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
        PartyBoxDevice partyBoxDevice = (PartyBoxDevice) hmDevice;
        j0(partyBoxDevice.V0(), partyBoxDevice.W0(), partyBoxDevice.X0());
    }

    @Override // com.harman.jbl.partybox.c
    public void O() {
        z2.e e4;
        super.O();
        HmDevice hmDevice = this.f38311M;
        if (hmDevice != null && (e4 = com.harman.sdk.b.f47608a.e(hmDevice)) != null) {
            e4.h(this.f43393U);
        }
    }

    @Override // com.harman.jbl.partybox.c
    public void P() {
        z2.e e4;
        super.P();
        HmDevice hmDevice = this.f38311M;
        if (hmDevice != null && (e4 = com.harman.sdk.b.f47608a.e(hmDevice)) != null) {
            e4.m(this.f43393U);
        }
    }

    @l3.d
    public final LiveData<List<Integer>> Y() {
        return this.f43392T;
    }

    @l3.d
    public final LiveData<List<V1.a>> Z() {
        return this.f43391S;
    }

    @l3.d
    public final LiveData<List<Integer>> b0() {
        return this.f43389Q;
    }

    public final void c0(@l3.d HmDevice device) {
        PartyBoxDevice partyBoxDevice;
        int b02;
        F.p(device, "device");
        com.harman.log.f.a(f43387W, "getSupportedButtonList called, device = " + device.n());
        if (device instanceof PartyBoxDevice) {
            partyBoxDevice = (PartyBoxDevice) device;
        } else {
            partyBoxDevice = null;
        }
        if (partyBoxDevice != null) {
            List<C2054a> b4 = com.harman.jbl.partybox.ui.lightshow.c.f43994n.a().b(partyBoxDevice);
            ArrayList arrayList = new ArrayList();
            for (Object obj : b4) {
                if (!(!((C2054a) obj).g())) {
                    arrayList.add(obj);
                }
            }
            b02 = C2109w.b0(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(b02);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((C2054a) it.next()).j()));
            }
            this.f43392T.o(arrayList2);
        }
    }

    public final void e0(@l3.d HmDevice connectedDevice) {
        F.p(connectedDevice, "connectedDevice");
        C2323l.f(k0.a(this), null, null, new d(connectedDevice, this, null), 3, null);
    }

    public final void f0(@l3.d HmDevice device) {
        F.p(device, "device");
        this.f38311M = device;
        com.harman.log.f.a(f43387W, "requestLightShowInfo called, device = " + device.n());
        com.harman.sdk.b bVar = com.harman.sdk.b.f47608a;
        z2.e e4 = bVar.e(device);
        if (e4 != null) {
            e4.m(this.f43393U);
        }
        i h4 = bVar.h(device);
        if (h4 != null) {
            h4.a(device, null);
        }
    }

    public final void g0(int i4, @l3.d HmDevice connectedDevice) {
        F.p(connectedDevice, "connectedDevice");
        f b4 = com.harman.sdk.b.f47608a.b(connectedDevice);
        if (b4 != null) {
            b4.u(connectedDevice, i4, null);
        }
        X(connectedDevice, L1.a.f1564b2, a0(i4 - 1));
    }

    public final void h0(int i4, int i5, @l3.d HmDevice connectedDevice) {
        F.p(connectedDevice, "connectedDevice");
        PartyBoxDevice partyBoxDevice = (PartyBoxDevice) connectedDevice;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    T1.a.b("HmDJEffectViewModel Unhandled DJ button set button = " + i4 + ", tone = " + i5);
                } else {
                    partyBoxDevice.e2(i5);
                }
            } else {
                partyBoxDevice.d2(i5);
            }
        } else {
            partyBoxDevice.c2(i5);
        }
        f b4 = com.harman.sdk.b.f47608a.b(connectedDevice);
        if (b4 != null) {
            b4.f0(connectedDevice, i5, i4, null);
        }
        k0(connectedDevice);
        X(connectedDevice, L1.a.f1574d2, L1.a.f1465D0);
    }

    public final void i0(int i4, @l3.d HmDevice connectedDevice) {
        F.p(connectedDevice, "connectedDevice");
        C2323l.f(k0.a(this), null, null, new e(connectedDevice, i4, this, null), 3, null);
    }

    public final void j0(int i4, int i5, int i6) {
        Map W3;
        int b02;
        Object K3;
        W3 = Y.W(C2122h0.a(Integer.valueOf(i4), 1), C2122h0.a(Integer.valueOf(i5), 2), C2122h0.a(Integer.valueOf(i6), 3));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<Y1.a> a4 = new com.harman.jbl.partybox.ui.djeffects.adapter.e().a();
        b02 = C2109w.b0(a4, 10);
        ArrayList arrayList3 = new ArrayList(b02);
        for (Y1.a aVar : a4) {
            if (W3.containsKey(Integer.valueOf(aVar.j().g()))) {
                arrayList.add(Integer.valueOf(aVar.i()));
                K3 = Y.K(W3, Integer.valueOf(aVar.j().g()));
                arrayList2.add(new V1.a(aVar, true, ((Number) K3).intValue()));
            }
            arrayList3.add(H0.f51801a);
        }
        T(this.f43390R, arrayList2);
        T(this.f43388P, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.j0
    public void s() {
        z2.e e4;
        super.s();
        HmDevice hmDevice = this.f38311M;
        if (hmDevice != null && (e4 = com.harman.sdk.b.f47608a.e(hmDevice)) != null) {
            e4.h(this.f43393U);
        }
    }
}
