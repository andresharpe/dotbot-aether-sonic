package com.harman.jbl.partylight.lib.core;

import android.app.Application;
import android.bluetooth.le.ScanResult;
import androidx.core.os.C0741d;
import com.blankj.utilcode.util.C1078a;
import com.blankj.utilcode.util.E0;
import com.harman.jbl.cd_biz_comm.utils.h;
import com.harman.jbl.cd_biz_comm.wireless_tech.j;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice;
import com.harman.jbl.partylight.lib.core.PLGroup;
import com.harman.jbl.partylight.lib.f;
import com.harman.jbl.partylight.lib.reset.PLResetProductActivity;
import j2.C2074a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C2122h0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@U({"SMAP\nPLModuleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PLModuleImpl.kt\ncom/harman/jbl/partylight/lib/core/PLModuleImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,116:1\n1855#2:117\n1855#2,2:118\n1856#2:120\n*S KotlinDebug\n*F\n+ 1 PLModuleImpl.kt\ncom/harman/jbl/partylight/lib/core/PLModuleImpl\n*L\n107#1:117\n108#1:118,2\n107#1:120\n*E\n"})
/* loaded from: classes2.dex */
public final class d implements f {

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    public static final d f46277b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f46278c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f46279d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.core.PLModuleImpl", f = "PLModuleImpl.kt", i = {0, 0}, l = {52}, m = "enterPartyLightDashboard", n = {"group", "mainSpeakerMutual"}, s = {"L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f46280H;

        /* renamed from: I, reason: collision with root package name */
        Object f46281I;

        /* renamed from: J, reason: collision with root package name */
        /* synthetic */ Object f46282J;

        /* renamed from: L, reason: collision with root package name */
        int f46284L;

        a(kotlin.coroutines.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f46282J = obj;
            this.f46284L |= Integer.MIN_VALUE;
            return d.this.g(null, null, null, this);
        }
    }

    static {
        d dVar = new d();
        f46277b = dVar;
        f46279d = dVar.getClass().getSimpleName();
    }

    private d() {
    }

    @Override // com.harman.jbl.partylight.lib.f
    public void a(@l3.d ScanResult scanResult) {
        F.p(scanResult, "scanResult");
        if (!f46278c) {
            return;
        }
        j.f38190F.o(scanResult);
    }

    @Override // com.harman.jbl.partylight.lib.f
    public void b(@l3.d com.harman.jbl.partylight.lib.c groupObserver) {
        F.p(groupObserver, "groupObserver");
        if (!f46278c) {
            return;
        }
        b.f46256F.p(groupObserver);
    }

    @Override // com.harman.jbl.partylight.lib.f
    public void c(@l3.d List<? extends PLGroup.Type> supportTypes, @l3.d String otaURL, @l3.d List<PBDevice> supportPartyBox) {
        F.p(supportTypes, "supportTypes");
        F.p(otaURL, "otaURL");
        F.p(supportPartyBox, "supportPartyBox");
        if (f46278c) {
            return;
        }
        com.harman.jbl.partylight.lib.ota.sdk.a.f47294a.i(otaURL);
        com.harman.jbl.cd_biz_comm.logger.b.f37854F.f("party_light_log");
        b.f46256F.n();
        h.f(supportPartyBox);
        j.f38190F.n(new j2.e(supportTypes));
        C2074a c2074a = C2074a.f51023a;
        Application a4 = E0.a();
        F.o(a4, "getApp(...)");
        c2074a.d(a4);
        String str = f46279d;
        com.harman.jbl.cd_biz_comm.logger.d.d(str, "PLModuleImpl init supportTypes = " + supportTypes);
        com.harman.jbl.cd_biz_comm.logger.d.d(str, "PLModuleImpl init otaURL = " + otaURL);
        com.harman.jbl.cd_biz_comm.logger.d.d(str, "PLModuleImpl init supportPartyBox = " + supportPartyBox);
        f46278c = true;
    }

    @Override // com.harman.jbl.partylight.lib.f
    public void d(@l3.d List<? extends PLGroup.Type> types) {
        F.p(types, "types");
        if (!f46278c) {
            return;
        }
        Map<PLGroup.Type, List<PartyLightDevice>> m4 = b.f46256F.m();
        Iterator<T> it = types.iterator();
        while (it.hasNext()) {
            List<PartyLightDevice> list = m4.get((PLGroup.Type) it.next());
            if (list != null) {
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.q((PartyLightDevice) it2.next());
                }
            }
        }
    }

    @Override // com.harman.jbl.partylight.lib.f
    public void e(@l3.d PLGroup.Type type) {
        F.p(type, "type");
        if (!f46278c) {
            return;
        }
        C1078a.K0(PLResetProductActivity.class, C0741d.b(C2122h0.a("type", type)));
    }

    @Override // com.harman.jbl.partylight.lib.f
    public void f(@l3.d com.harman.jbl.partylight.lib.c groupObserver) {
        F.p(groupObserver, "groupObserver");
        if (!f46278c) {
            return;
        }
        b.f46256F.r(groupObserver);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.harman.jbl.partylight.lib.f
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(@l3.d com.harman.jbl.partylight.lib.core.PLGroup r10, @l3.d com.harman.jbl.partylight.lib.EnterConnectMode r11, @l3.e com.harman.jbl.partylight.lib.d r12, @l3.d kotlin.coroutines.c<? super com.harman.jbl.partylight.lib.EnterResp> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.harman.jbl.partylight.lib.core.d.a
            if (r0 == 0) goto L13
            r0 = r13
            com.harman.jbl.partylight.lib.core.d$a r0 = (com.harman.jbl.partylight.lib.core.d.a) r0
            int r1 = r0.f46284L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46284L = r1
            goto L18
        L13:
            com.harman.jbl.partylight.lib.core.d$a r0 = new com.harman.jbl.partylight.lib.core.d$a
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f46282J
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f46284L
            r3 = 2
            java.lang.Class<com.harman.jbl.partylight.lib.main.PartyLightActivity> r4 = com.harman.jbl.partylight.lib.main.PartyLightActivity.class
            java.lang.String r5 = "EXTRACT_TARGET_GROUP"
            r6 = 0
            r7 = 0
            r8 = 1
            if (r2 == 0) goto L41
            if (r2 != r8) goto L39
            java.lang.Object r10 = r0.f46281I
            r12 = r10
            com.harman.jbl.partylight.lib.d r12 = (com.harman.jbl.partylight.lib.d) r12
            java.lang.Object r10 = r0.f46280H
            com.harman.jbl.partylight.lib.core.PLGroup r10 = (com.harman.jbl.partylight.lib.core.PLGroup) r10
            kotlin.W.n(r13)
            goto L63
        L39:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L41:
            kotlin.W.n(r13)
            boolean r13 = com.harman.jbl.partylight.lib.core.d.f46278c
            if (r13 != 0) goto L50
            com.harman.jbl.partylight.lib.EnterResp r10 = new com.harman.jbl.partylight.lib.EnterResp
            com.harman.jbl.partylight.lib.EnterResp$EnterError r11 = com.harman.jbl.partylight.lib.EnterResp.EnterError.NOT_INIT
            r10.<init>(r6, r11)
            return r10
        L50:
            com.harman.jbl.partylight.lib.EnterConnectMode r13 = com.harman.jbl.partylight.lib.EnterConnectMode.CONNECT_BEFORE_ENTER
            if (r11 != r13) goto L8d
            com.harman.jbl.partylight.lib.core.b r11 = com.harman.jbl.partylight.lib.core.b.f46256F
            r0.f46280H = r10
            r0.f46281I = r12
            r0.f46284L = r8
            java.lang.Object r13 = r11.g(r10, r0)
            if (r13 != r1) goto L63
            return r1
        L63:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r11 = r13.booleanValue()
            if (r11 == 0) goto L85
            com.harman.jbl.partylight.lib.partystage.v r11 = com.harman.jbl.partylight.lib.partystage.v.f47482a
            r11.i(r12)
            kotlin.Pair r10 = kotlin.C2122h0.a(r5, r10)
            kotlin.Pair[] r10 = new kotlin.Pair[]{r10}
            android.os.Bundle r10 = androidx.core.os.C0741d.b(r10)
            com.blankj.utilcode.util.C1078a.C0(r10, r4)
            com.harman.jbl.partylight.lib.EnterResp r10 = new com.harman.jbl.partylight.lib.EnterResp
            r10.<init>(r8, r7, r3, r7)
            return r10
        L85:
            com.harman.jbl.partylight.lib.EnterResp r10 = new com.harman.jbl.partylight.lib.EnterResp
            com.harman.jbl.partylight.lib.EnterResp$EnterError r11 = com.harman.jbl.partylight.lib.EnterResp.EnterError.CONNECT_FAIL
            r10.<init>(r6, r11)
            return r10
        L8d:
            kotlin.Pair r10 = kotlin.C2122h0.a(r5, r10)
            kotlin.Pair[] r10 = new kotlin.Pair[]{r10}
            android.os.Bundle r10 = androidx.core.os.C0741d.b(r10)
            com.blankj.utilcode.util.C1078a.C0(r10, r4)
            com.harman.jbl.partylight.lib.EnterResp r10 = new com.harman.jbl.partylight.lib.EnterResp
            r10.<init>(r8, r7, r3, r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partylight.lib.core.d.g(com.harman.jbl.partylight.lib.core.PLGroup, com.harman.jbl.partylight.lib.EnterConnectMode, com.harman.jbl.partylight.lib.d, kotlin.coroutines.c):java.lang.Object");
    }

    public final String h() {
        return f46279d;
    }
}
