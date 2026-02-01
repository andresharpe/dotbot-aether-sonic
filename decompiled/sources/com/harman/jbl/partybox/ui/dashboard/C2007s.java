package com.harman.jbl.partybox.ui.dashboard;

import android.os.Bundle;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.effectlab.a;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.AudioChannel;
import com.harman.sdk.utils.DeviceProtocol;
import com.harman.sdk.utils.PartyConnectStatus;
import com.harman.sdk.utils.PlayerStatus;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Triple;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import y2.InterfaceC2445a;

@kotlin.jvm.internal.U({"SMAP\nDashboardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DashboardViewModel.kt\ncom/harman/jbl/partybox/ui/dashboard/DashboardViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,128:1\n1747#2,3:129\n*S KotlinDebug\n*F\n+ 1 DashboardViewModel.kt\ncom/harman/jbl/partybox/ui/dashboard/DashboardViewModel\n*L\n99#1:129,3\n*E\n"})
/* renamed from: com.harman.jbl.partybox.ui.dashboard.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2007s extends com.harman.jbl.partybox.c {

    /* renamed from: S, reason: collision with root package name */
    @l3.d
    public static final a f43324S = new a(null);

    /* renamed from: T, reason: collision with root package name */
    @l3.d
    public static final String f43325T = "DashboardViewModel";

    /* renamed from: P, reason: collision with root package name */
    @l3.d
    private final kotlinx.coroutines.flow.s<Boolean> f43326P = kotlinx.coroutines.flow.z.b(0, 0, null, 7, null);

    /* renamed from: Q, reason: collision with root package name */
    @l3.d
    private final InterfaceC2445a.InterfaceC0551a f43327Q;

    /* renamed from: R, reason: collision with root package name */
    public com.harman.jbl.partybox.ui.main.o f43328R;

    /* renamed from: com.harman.jbl.partybox.ui.dashboard.s$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: com.harman.jbl.partybox.ui.dashboard.s$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC2445a.InterfaceC0551a {
        b() {
        }

        @Override // y2.InterfaceC2445a.InterfaceC0551a
        public void a(@l3.e HmDevice hmDevice, int i4, @l3.d DeviceProtocol protocol) {
            kotlin.jvm.internal.F.p(protocol, "protocol");
            if (C2007s.this.X().k1() == hmDevice && i4 == 0) {
                C2007s.this.W().j(Boolean.FALSE);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.dashboard.DashboardViewModel", f = "DashboardViewModel.kt", i = {}, l = {a.b.f43497g}, m = "wakeupStandbyDevice", n = {}, s = {})
    /* renamed from: com.harman.jbl.partybox.ui.dashboard.s$c */
    /* loaded from: classes2.dex */
    public static final class c extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        /* synthetic */ Object f43330H;

        /* renamed from: J, reason: collision with root package name */
        int f43332J;

        c(kotlin.coroutines.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f43330H = obj;
            this.f43332J |= Integer.MIN_VALUE;
            return C2007s.this.d0(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.dashboard.DashboardViewModel$wakeupStandbyDevice$success$1", f = "DashboardViewModel.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.harman.jbl.partybox.ui.dashboard.s$d */
    /* loaded from: classes2.dex */
    public static final class d extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super Boolean>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f43333I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ HmDevice f43334J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(HmDevice hmDevice, kotlin.coroutines.c<? super d> cVar) {
            super(2, cVar);
            this.f43334J = hmDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f43333I;
            if (i4 != 0) {
                if (i4 == 1) {
                    kotlin.W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.W.n(obj);
                com.harman.log.f.a(C2007s.f43325T, "doWakeupDevice() >>>  " + com.harman.jbl.partybox.ui.party.b.f44881a.t(this.f43334J));
                com.harman.jbl.partybox.ui.business.a aVar = com.harman.jbl.partybox.ui.business.a.f42135a;
                HmDevice hmDevice = this.f43334J;
                this.f43333I = 1;
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
            return ((d) v(u3, cVar)).D(kotlin.H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<kotlin.H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new d(this.f43334J, cVar);
        }
    }

    public C2007s() {
        b bVar = new b();
        this.f43327Q = bVar;
        com.harman.sdk.impl.connect.i d4 = com.harman.sdk.b.d(com.harman.sdk.b.f47608a, null, 1, null);
        if (d4 != null) {
            d4.c(bVar);
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
            if (com.harman.jbl.partybox.ui.party.stereo.D.f45020a.d(device, (HmDevice) it.next())) {
                return true;
            }
        }
        return false;
    }

    @l3.d
    public final kotlinx.coroutines.flow.s<Boolean> W() {
        return this.f43326P;
    }

    @l3.d
    public final com.harman.jbl.partybox.ui.main.o X() {
        com.harman.jbl.partybox.ui.main.o oVar = this.f43328R;
        if (oVar != null) {
            return oVar;
        }
        kotlin.jvm.internal.F.S("mainViewModel");
        return null;
    }

    @l3.d
    public final Triple<Integer, Integer, Integer> Y(@l3.d HmDevice connectedDevice) {
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        kotlin.jvm.internal.F.p(connectedDevice, "connectedDevice");
        if (((PartyBoxDevice) connectedDevice).i1() == PartyConnectStatus.PARTY_CONNECT_WIRELESS_CONNECTED) {
            if (connectedDevice.i().i() == AudioChannel.NONE_CHANNEL.i()) {
                valueOf = Integer.valueOf(j.m.f41818s2);
                valueOf2 = Integer.valueOf(j.f.X3);
                valueOf3 = Integer.valueOf(j.f.Wb);
            } else {
                valueOf = Integer.valueOf(j.m.Z5);
                valueOf2 = Integer.valueOf(j.f.X3);
                valueOf3 = Integer.valueOf(j.f.Xb);
            }
        } else {
            valueOf = Integer.valueOf(j.m.f41685Q);
            valueOf2 = Integer.valueOf(j.f.X3);
            valueOf3 = Integer.valueOf(j.f.f41090q0);
        }
        return new Triple<>(valueOf, valueOf2, valueOf3);
    }

    public final void Z(@l3.d String actionType, @l3.d Bundle bundle) {
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

    public final void a0(@l3.d com.harman.jbl.partybox.ui.main.o oVar) {
        kotlin.jvm.internal.F.p(oVar, "<set-?>");
        this.f43328R = oVar;
    }

    public final void b0(@l3.d HmDevice connectedDevice, @l3.d PlayerStatus playerStateNext) {
        kotlin.jvm.internal.F.p(connectedDevice, "connectedDevice");
        kotlin.jvm.internal.F.p(playerStateNext, "playerStateNext");
        z2.l j4 = com.harman.sdk.b.f47608a.j(connectedDevice);
        if (j4 != null) {
            j4.C(connectedDevice, playerStateNext, null);
        }
    }

    public final void c0(@l3.d HmDevice connectedDevice, int i4) {
        kotlin.jvm.internal.F.p(connectedDevice, "connectedDevice");
        z2.l j4 = com.harman.sdk.b.f47608a.j(connectedDevice);
        if (j4 != null) {
            j4.m0(connectedDevice, i4, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d0(@l3.d com.harman.sdk.device.HmDevice r5, @l3.d kotlin.coroutines.c<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.harman.jbl.partybox.ui.dashboard.C2007s.c
            if (r0 == 0) goto L13
            r0 = r6
            com.harman.jbl.partybox.ui.dashboard.s$c r0 = (com.harman.jbl.partybox.ui.dashboard.C2007s.c) r0
            int r1 = r0.f43332J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43332J = r1
            goto L18
        L13:
            com.harman.jbl.partybox.ui.dashboard.s$c r0 = new com.harman.jbl.partybox.ui.dashboard.s$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f43330H
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f43332J
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.W.n(r6)
            goto L50
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.W.n(r6)
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r2 = "action_power_on"
            r4.Z(r2, r6)
            com.harman.jbl.partybox.ui.dashboard.s$d r6 = new com.harman.jbl.partybox.ui.dashboard.s$d
            r2 = 0
            r6.<init>(r5, r2)
            r0.f43332J = r3
            r2 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r6 = kotlinx.coroutines.w1.e(r2, r6, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "doWakeupDevice() >>> requestDeviceInfo success = "
            r5.append(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "DashboardViewModel"
            com.harman.log.f.a(r0, r5)
            if (r6 == 0) goto L6f
            boolean r5 = r6.booleanValue()
            goto L70
        L6f:
            r5 = 0
        L70:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.dashboard.C2007s.d0(com.harman.sdk.device.HmDevice, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.j0
    public void s() {
        com.harman.sdk.impl.connect.i d4 = com.harman.sdk.b.d(com.harman.sdk.b.f47608a, null, 1, null);
        if (d4 != null) {
            d4.d(this.f43327Q);
        }
    }
}
