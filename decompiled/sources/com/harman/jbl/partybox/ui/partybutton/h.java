package com.harman.jbl.partybox.ui.partybutton;

import X2.p;
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.P;
import androidx.lifecycle.k0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.djeffects.model.DjEffectToneId;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.StatusCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.H0;
import kotlin.W;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.C2323l;

@U({"SMAP\nPartyButtonViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartyButtonViewModel.kt\ncom/harman/jbl/partybox/ui/partybutton/PartyButtonViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,271:1\n1855#2,2:272\n1855#2,2:274\n288#2,2:276\n1#3:278\n*S KotlinDebug\n*F\n+ 1 PartyButtonViewModel.kt\ncom/harman/jbl/partybox/ui/partybutton/PartyButtonViewModel\n*L\n136#1:272,2\n139#1:274,2\n147#1:276,2\n*E\n"})
/* loaded from: classes2.dex */
public final class h extends com.harman.jbl.partybox.c {

    /* renamed from: Y, reason: collision with root package name */
    @l3.d
    public static final a f45436Y = new a(null);

    /* renamed from: Z, reason: collision with root package name */
    @l3.d
    public static final String f45437Z = "PartyButtonViewModel";

    /* renamed from: P, reason: collision with root package name */
    @l3.d
    private final P<List<com.harman.jbl.partybox.model.c>> f45438P = new P<>();

    /* renamed from: Q, reason: collision with root package name */
    @l3.d
    private final P<List<com.harman.jbl.partybox.model.c>> f45439Q;

    /* renamed from: R, reason: collision with root package name */
    @l3.d
    private final LiveData<List<com.harman.jbl.partybox.model.c>> f45440R;

    /* renamed from: S, reason: collision with root package name */
    @l3.d
    private final P<Map<Integer, com.harman.jbl.partybox.model.c>> f45441S;

    /* renamed from: T, reason: collision with root package name */
    @l3.d
    private final LiveData<Map<Integer, com.harman.jbl.partybox.model.c>> f45442T;

    /* renamed from: U, reason: collision with root package name */
    @l3.d
    private final List<com.harman.jbl.partybox.model.c> f45443U;

    /* renamed from: V, reason: collision with root package name */
    @l3.d
    private final List<com.harman.jbl.partybox.model.c> f45444V;

    /* renamed from: W, reason: collision with root package name */
    @l3.d
    private final List<com.harman.jbl.partybox.model.c> f45445W;

    /* renamed from: X, reason: collision with root package name */
    @l3.d
    private final z2.d f45446X;

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
            h.this.e0(device, code, msg);
        }

        @Override // z2.d
        public void b(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            h.this.e0(device, code, msg);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.partybutton.PartyButtonViewModel$reqDJEffectDataOperation$1", f = "PartyButtonViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class c extends SuspendLambda implements p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f45448I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ HmDevice f45449J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ h f45450K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(HmDevice hmDevice, h hVar, kotlin.coroutines.c<? super c> cVar) {
            super(2, cVar);
            this.f45449J = hmDevice;
            this.f45450K = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f45448I == 0) {
                W.n(obj);
                HmDevice hmDevice = this.f45449J;
                h hVar = this.f45450K;
                z2.f b4 = com.harman.sdk.b.f47608a.b(hmDevice);
                if (b4 != null) {
                    b4.z0(hmDevice, hVar.f45446X);
                }
                return H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((c) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new c(this.f45449J, this.f45450K, cVar);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.partybutton.PartyButtonViewModel$setDJEffectToneOperation$1", f = "PartyButtonViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @U({"SMAP\nPartyButtonViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartyButtonViewModel.kt\ncom/harman/jbl/partybox/ui/partybutton/PartyButtonViewModel$setDJEffectToneOperation$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,271:1\n288#2,2:272\n*S KotlinDebug\n*F\n+ 1 PartyButtonViewModel.kt\ncom/harman/jbl/partybox/ui/partybutton/PartyButtonViewModel$setDJEffectToneOperation$1\n*L\n198#1:272,2\n*E\n"})
    /* loaded from: classes2.dex */
    static final class d extends SuspendLambda implements p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f45451I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ int f45453K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ HmDevice f45454L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i4, HmDevice hmDevice, kotlin.coroutines.c<? super d> cVar) {
            super(2, cVar);
            this.f45453K = i4;
            this.f45454L = hmDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object obj2;
            DjEffectToneId l4;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f45451I == 0) {
                W.n(obj);
                Iterator<T> it = h.this.b0(this.f45453K).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((com.harman.jbl.partybox.model.c) obj2).k()) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                com.harman.jbl.partybox.model.c cVar = (com.harman.jbl.partybox.model.c) obj2;
                T1.a.b("PartyButtonViewModel setDJEffectToneOperation= " + cVar);
                if (cVar != null && (l4 = cVar.l()) != null) {
                    int g4 = l4.g();
                    HmDevice hmDevice = this.f45454L;
                    h hVar = h.this;
                    z2.f b4 = com.harman.sdk.b.f47608a.b(hmDevice);
                    if (b4 != null) {
                        b4.v(hmDevice, g4, hVar.f45446X);
                    }
                    hVar.Y(hmDevice, L1.a.f1564b2, com.harman.jbl.partybox.utils.c.f46169a.a(g4));
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
            return new d(this.f45453K, this.f45454L, cVar);
        }
    }

    public h() {
        List<com.harman.jbl.partybox.model.c> O3;
        List<com.harman.jbl.partybox.model.c> O4;
        List<com.harman.jbl.partybox.model.c> O5;
        P<List<com.harman.jbl.partybox.model.c>> p4 = new P<>();
        this.f45439Q = p4;
        this.f45440R = p4;
        P<Map<Integer, com.harman.jbl.partybox.model.c>> p5 = new P<>();
        this.f45441S = p5;
        this.f45442T = p5;
        O3 = CollectionsKt__CollectionsKt.O(new com.harman.jbl.partybox.model.c(DjEffectToneId.TONE_PARTY, j.m.f41803p2, j.f.Ma, j.f.f41048h3, false, 16, null), new com.harman.jbl.partybox.model.c(DjEffectToneId.TONE_HEY, j.m.f41788m2, j.f.Ma, j.f.f41048h3, false, 16, null), new com.harman.jbl.partybox.model.c(DjEffectToneId.TONE_HANDS_UP, j.m.f41783l2, j.f.Ma, j.f.f41048h3, false, 16, null), new com.harman.jbl.partybox.model.c(DjEffectToneId.TONE_123, j.m.f41778k2, j.f.Ma, j.f.f41048h3, false, 16, null), new com.harman.jbl.partybox.model.c(DjEffectToneId.TONE_JUMP, j.m.f41793n2, j.f.Ma, j.f.f41048h3, false, 16, null), new com.harman.jbl.partybox.model.c(DjEffectToneId.TONE_READY, j.m.f41808q2, j.f.Ma, j.f.f41048h3, false, 16, null), new com.harman.jbl.partybox.model.c(DjEffectToneId.TONE_LETS_GO, j.m.f41798o2, j.f.Ma, j.f.f41048h3, false, 16, null));
        this.f45443U = O3;
        O4 = CollectionsKt__CollectionsKt.O(new com.harman.jbl.partybox.model.c(DjEffectToneId.TONE_HORN, j.m.O7, j.f.La, j.f.f41053i3, false, 16, null), new com.harman.jbl.partybox.model.c(DjEffectToneId.TONE_CLAPPING, j.m.B6, j.f.La, j.f.f41053i3, false, 16, null), new com.harman.jbl.partybox.model.c(DjEffectToneId.TONE_LIKE, j.m.c8, j.f.La, j.f.f41053i3, false, 16, null), new com.harman.jbl.partybox.model.c(DjEffectToneId.TONE_BOO, j.m.v6, j.f.La, j.f.f41053i3, false, 16, null));
        this.f45444V = O4;
        O5 = CollectionsKt__CollectionsKt.O(new com.harman.jbl.partybox.model.c(DjEffectToneId.TONE_SCRATCH_1, j.m.d9, j.f.Ka, j.f.f41058j3, false, 16, null), new com.harman.jbl.partybox.model.c(DjEffectToneId.TONE_SCRATCH_2, j.m.e9, j.f.Ka, j.f.f41058j3, false, 16, null), new com.harman.jbl.partybox.model.c(DjEffectToneId.TONE_SCRATCH_3, j.m.f9, j.f.Ka, j.f.f41058j3, false, 16, null), new com.harman.jbl.partybox.model.c(DjEffectToneId.TONE_GAME, j.m.B7, j.f.Ka, j.f.f41058j3, false, 16, null));
        this.f45445W = O5;
        this.f45446X = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(HmDevice hmDevice, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("di_action_type", str);
        bundle.putString(L1.a.f1522R1, str2);
        bundle.putInt(L1.a.u3, com.harman.jbl.partybox.c.f38305O);
        bundle.putString(L1.a.f1655u, com.harman.sdk.utils.d.v(hmDevice.q()));
        K1.a.a(L1.a.f1514P1, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0(HmDevice hmDevice, StatusCode statusCode, BaseMessage baseMessage) {
        T1.a.a("PartyButtonViewModel, ButtonSettingUpdate observer called, msg = " + baseMessage + " device = " + hmDevice.J());
        if (statusCode == StatusCode.STATUS_SUCCESS) {
            F.n(hmDevice, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) hmDevice;
            if (baseMessage.b() == MessageID.DJ_STATUS) {
                i0(partyBoxDevice);
            }
        }
    }

    private final void i0(PartyBoxDevice partyBoxDevice) {
        Object obj;
        Object obj2;
        Object obj3;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = b0(0).iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                if (((com.harman.jbl.partybox.model.c) obj2).l().g() == partyBoxDevice.V0()) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        com.harman.jbl.partybox.model.c cVar = (com.harman.jbl.partybox.model.c) obj2;
        if (cVar != null) {
            cVar.m(true);
            arrayList.add(cVar);
        }
        Iterator<T> it2 = b0(1).iterator();
        while (true) {
            if (it2.hasNext()) {
                obj3 = it2.next();
                if (((com.harman.jbl.partybox.model.c) obj3).l().g() == partyBoxDevice.W0()) {
                    break;
                }
            } else {
                obj3 = null;
                break;
            }
        }
        com.harman.jbl.partybox.model.c cVar2 = (com.harman.jbl.partybox.model.c) obj3;
        if (cVar2 != null) {
            cVar2.m(true);
            arrayList.add(cVar2);
        }
        Iterator<T> it3 = b0(2).iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            if (((com.harman.jbl.partybox.model.c) next).l().g() == partyBoxDevice.X0()) {
                obj = next;
                break;
            }
        }
        com.harman.jbl.partybox.model.c cVar3 = (com.harman.jbl.partybox.model.c) obj;
        if (cVar3 != null) {
            cVar3.m(true);
            arrayList.add(cVar3);
        }
        T(this.f45439Q, arrayList);
        T(this.f45441S, linkedHashMap);
    }

    @Override // com.harman.jbl.partybox.c
    public void O() {
        z2.e e4;
        super.O();
        HmDevice hmDevice = this.f38311M;
        if (hmDevice != null && (e4 = com.harman.sdk.b.f47608a.e(hmDevice)) != null) {
            e4.h(this.f45446X);
        }
    }

    @Override // com.harman.jbl.partybox.c
    public void P() {
        z2.e e4;
        super.P();
        HmDevice hmDevice = this.f38311M;
        if (hmDevice != null && (e4 = com.harman.sdk.b.f47608a.e(hmDevice)) != null) {
            e4.m(this.f45446X);
        }
    }

    public final void Z(@l3.d HmDevice connectedDevice, int i4) {
        Object obj;
        F.p(connectedDevice, "connectedDevice");
        List<com.harman.jbl.partybox.model.c> b02 = b0(i4);
        Iterator<T> it = b02.iterator();
        while (it.hasNext()) {
            ((com.harman.jbl.partybox.model.c) it.next()).m(false);
        }
        List<com.harman.jbl.partybox.model.c> f4 = this.f45440R.f();
        if (f4 != null) {
            Iterator<T> it2 = f4.iterator();
            while (it2.hasNext()) {
                int indexOf = b02.indexOf((com.harman.jbl.partybox.model.c) it2.next());
                if (indexOf >= 0) {
                    b02.get(indexOf).m(true);
                }
            }
        }
        Iterator<T> it3 = b02.iterator();
        while (true) {
            if (it3.hasNext()) {
                obj = it3.next();
                if (((com.harman.jbl.partybox.model.c) obj).k()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (((com.harman.jbl.partybox.model.c) obj) == null) {
            g0(i4 + 1, b02.get(0).l().g(), connectedDevice);
        }
        T(this.f45438P, b02);
    }

    @l3.d
    public final LiveData<List<com.harman.jbl.partybox.model.c>> a0() {
        return this.f45438P;
    }

    @l3.d
    public final List<com.harman.jbl.partybox.model.c> b0(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                return this.f45445W;
            }
            return this.f45444V;
        }
        return this.f45443U;
    }

    @l3.d
    public final LiveData<List<com.harman.jbl.partybox.model.c>> c0() {
        return this.f45440R;
    }

    @l3.d
    public final LiveData<Map<Integer, com.harman.jbl.partybox.model.c>> d0() {
        return this.f45442T;
    }

    public final void f0(@l3.d HmDevice connectedDevice) {
        F.p(connectedDevice, "connectedDevice");
        C2323l.f(k0.a(this), null, null, new c(connectedDevice, this, null), 3, null);
    }

    public final void g0(int i4, int i5, @l3.d HmDevice device) {
        F.p(device, "device");
        PartyBoxDevice partyBoxDevice = (PartyBoxDevice) device;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    T1.a.b("PartyButtonViewModel Unhandled DJ button set button = " + i4 + ", tone = " + i5);
                } else {
                    partyBoxDevice.e2(i5);
                }
            } else {
                partyBoxDevice.d2(i5);
            }
        } else {
            partyBoxDevice.c2(i5);
        }
        T1.a.b("PartyButtonViewModel setDJEffectDataOperation DJ button set button = " + i4 + ", tone = " + i5);
        z2.f b4 = com.harman.sdk.b.f47608a.b(device);
        if (b4 != null) {
            b4.f0(device, i5, i4, null);
        }
        i0(partyBoxDevice);
        Y(device, L1.a.f1574d2, L1.a.f1465D0);
    }

    public final void h0(@l3.d HmDevice connectedDevice, int i4) {
        F.p(connectedDevice, "connectedDevice");
        C2323l.f(k0.a(this), C2322k0.e(), null, new d(i4, connectedDevice, null), 2, null);
    }
}
