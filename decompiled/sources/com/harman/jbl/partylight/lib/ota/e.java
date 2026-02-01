package com.harman.jbl.partylight.lib.ota;

import X2.p;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.P;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice;
import com.harman.jbl.partylight.lib.ota.sdk.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import kotlin.C2122h0;
import kotlin.H0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.D;
import kotlin.collections.Y;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;
import kotlinx.coroutines.C2323l;

@U({"SMAP\nBleOtaViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleOtaViewModel.kt\ncom/harman/jbl/partylight/lib/ota/BleOtaViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,264:1\n1#2:265\n1726#3,3:266\n*S KotlinDebug\n*F\n+ 1 BleOtaViewModel.kt\ncom/harman/jbl/partylight/lib/ota/BleOtaViewModel\n*L\n235#1:266,3\n*E\n"})
/* loaded from: classes2.dex */
public final class e extends j0 implements l {

    /* renamed from: O, reason: collision with root package name */
    @l3.d
    public static final a f47261O = new a(null);

    /* renamed from: P, reason: collision with root package name */
    @l3.d
    public static final String f47262P = "BleOtaViewModel";

    /* renamed from: Q, reason: collision with root package name */
    @l3.d
    private static final Map<String, String> f47263Q;

    /* renamed from: H, reason: collision with root package name */
    @l3.e
    private com.harman.jbl.partylight.lib.ota.sdk.f f47264H;

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final P<ProcessStatus> f47265I = new P<>(ProcessStatus.Checking);

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private final P<List<com.harman.jbl.partylight.lib.ota.c>> f47266J;

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private final P<String> f47267K;

    /* renamed from: L, reason: collision with root package name */
    @l3.d
    private final List<com.harman.jbl.partylight.lib.ota.c> f47268L;

    /* renamed from: M, reason: collision with root package name */
    @l3.d
    private final List<com.harman.jbl.partylight.lib.ota.c> f47269M;

    /* renamed from: N, reason: collision with root package name */
    @l3.d
    private final List<PartyLightDevice> f47270N;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final Map<String, String> a() {
            return e.f47263Q;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.ota.BleOtaViewModel$initList$1", f = "BleOtaViewModel.kt", i = {1}, l = {ConstraintLayout.b.a.f9601d0, 105}, m = "invokeSuspend", n = {"firmware"}, s = {"L$0"})
    @U({"SMAP\nBleOtaViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleOtaViewModel.kt\ncom/harman/jbl/partylight/lib/ota/BleOtaViewModel$initList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,264:1\n1864#2,3:265\n1864#2,3:268\n1855#2,2:271\n766#2:273\n857#2,2:274\n1549#2:276\n1620#2,3:277\n*S KotlinDebug\n*F\n+ 1 BleOtaViewModel.kt\ncom/harman/jbl/partylight/lib/ota/BleOtaViewModel$initList$1\n*L\n58#1:265,3\n82#1:268,3\n98#1:271,2\n115#1:273\n115#1:274,2\n115#1:276\n115#1:277,3\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class b extends SuspendLambda implements p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        Object f47271I;

        /* renamed from: J, reason: collision with root package name */
        int f47272J;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public static final class a extends Lambda implements p<PartyLightDevice, PartyLightDevice, Integer> {

            /* renamed from: F, reason: collision with root package name */
            public static final a f47274F = new a();

            a() {
                super(2);
            }

            @Override // X2.p
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Integer c0(PartyLightDevice partyLightDevice, PartyLightDevice partyLightDevice2) {
                if (partyLightDevice.u()) {
                    return 1;
                }
                return -1;
            }
        }

        b(kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int b0(p pVar, Object obj, Object obj2) {
            return ((Number) pVar.c0(obj, obj2)).intValue();
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x02bf  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x02df  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0235  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 754
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partylight.lib.ota.e.b.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((b) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new b(cVar);
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends Lambda implements X2.l<com.harman.jbl.partylight.lib.ota.c, Boolean> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ com.harman.jbl.partylight.lib.ota.c f47275F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(com.harman.jbl.partylight.lib.ota.c cVar) {
            super(1);
            this.f47275F = cVar;
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean C(@l3.d com.harman.jbl.partylight.lib.ota.c i4) {
            F.p(i4, "i");
            return Boolean.valueOf(F.g(i4, this.f47275F));
        }
    }

    static {
        Map<String, String> W3;
        W3 = Y.W(C2122h0.a(com.harman.jbl.cd_biz_comm.utils.h.f37903f, "PartyLight Beam"), C2122h0.a(com.harman.jbl.cd_biz_comm.utils.h.f37904g, "PartyLight Stick"));
        f47263Q = W3;
    }

    public e() {
        List H3;
        List<PartyLightDevice> Y5;
        H3 = CollectionsKt__CollectionsKt.H();
        this.f47266J = new P<>(H3);
        this.f47267K = new P<>();
        this.f47268L = new ArrayList();
        this.f47269M = new ArrayList();
        Y5 = D.Y5(com.harman.jbl.partylight.lib.core.b.f46256F.i());
        this.f47270N = Y5;
        J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D() {
        List<com.harman.jbl.partylight.lib.ota.c> D4;
        P<List<com.harman.jbl.partylight.lib.ota.c>> p4 = this.f47266J;
        D4 = D.D4(this.f47269M, this.f47268L);
        p4.r(D4);
    }

    private final void J() {
        C2323l.f(k0.a(this), null, null, new b(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean K() {
        List<com.harman.jbl.partylight.lib.ota.c> list = this.f47269M;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((com.harman.jbl.partylight.lib.ota.c) it.next()).n() != BleUpdateStatus.LowPower) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean N(X2.l tmp0, Object obj) {
        F.p(tmp0, "$tmp0");
        return ((Boolean) tmp0.C(obj)).booleanValue();
    }

    @l3.e
    public final Object E(@l3.d kotlin.coroutines.c<? super Boolean> cVar) {
        com.harman.jbl.partylight.lib.ota.sdk.f fVar = this.f47264H;
        if (fVar != null) {
            fVar.w();
        }
        return com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.p(com.harman.jbl.partylight.lib.core.b.f46256F.j(), cVar);
    }

    @l3.d
    public final P<List<com.harman.jbl.partylight.lib.ota.c>> F() {
        return this.f47266J;
    }

    @l3.d
    public final P<String> G() {
        return this.f47267K;
    }

    public final int H() {
        return this.f47269M.size() * 4;
    }

    @l3.d
    public final P<ProcessStatus> I() {
        return this.f47265I;
    }

    public final void L() {
        this.f47269M.clear();
        this.f47268L.clear();
        D();
        J();
    }

    public final void M(@l3.d com.harman.jbl.partylight.lib.ota.c item) {
        F.p(item, "item");
        com.harman.jbl.partylight.lib.ota.sdk.f fVar = this.f47264H;
        if (fVar != null) {
            if (fVar.D()) {
                List<com.harman.jbl.partylight.lib.ota.c> list = this.f47269M;
                final c cVar = new c(item);
                list.removeIf(new Predicate() { // from class: com.harman.jbl.partylight.lib.ota.d
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        boolean N3;
                        N3 = e.N(X2.l.this, obj);
                        return N3;
                    }
                });
                this.f47269M.add(item);
            }
            item.p(BleUpdateStatus.ReadyUpdate);
            D();
            com.harman.jbl.partylight.lib.ota.sdk.f fVar2 = this.f47264H;
            if (fVar2 != null) {
                fVar2.H(item.k());
            }
        }
    }

    public final void O() {
        com.harman.jbl.partylight.lib.ota.sdk.f fVar = this.f47264H;
        if (fVar != null) {
            fVar.J();
        }
    }

    @Override // com.harman.jbl.partylight.lib.ota.sdk.l
    public void a(@l3.d PartyLightDevice device, @l3.d String msg) {
        Object obj;
        F.p(device, "device");
        F.p(msg, "msg");
        Iterator<T> it = this.f47269M.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (F.g(((com.harman.jbl.partylight.lib.ota.c) obj).k(), device)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        com.harman.jbl.partylight.lib.ota.c cVar = (com.harman.jbl.partylight.lib.ota.c) obj;
        if (cVar != null) {
            cVar.p(BleUpdateStatus.Failed);
        }
        D();
        com.harman.jbl.cd_biz_comm.logger.d.b(f47262P, "更新失败 " + msg);
    }

    @Override // com.harman.jbl.partylight.lib.ota.sdk.l
    public void d(@l3.d List<PartyLightDevice> devices) {
        F.p(devices, "devices");
        if (this.f47269M.isEmpty()) {
            this.f47265I.r(ProcessStatus.AllUpdated);
        } else if (K()) {
            this.f47265I.r(ProcessStatus.CanNotUpdate);
        } else {
            this.f47265I.r(ProcessStatus.Processing);
        }
    }

    @Override // com.harman.jbl.partylight.lib.ota.sdk.l
    public void e(@l3.d PartyLightDevice device, double d4) {
        Object obj;
        int i4;
        F.p(device, "device");
        Iterator<T> it = this.f47269M.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (F.g(((com.harman.jbl.partylight.lib.ota.c) obj).k(), device)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        com.harman.jbl.partylight.lib.ota.c cVar = (com.harman.jbl.partylight.lib.ota.c) obj;
        if (cVar == null || cVar.m() == (i4 = (int) (d4 * 100))) {
            return;
        }
        cVar.o(i4);
        D();
    }

    @Override // com.harman.jbl.partylight.lib.ota.sdk.l
    public void h(@l3.d PartyLightDevice device) {
        Object obj;
        F.p(device, "device");
        Iterator<T> it = this.f47269M.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (F.g(((com.harman.jbl.partylight.lib.ota.c) obj).k(), device)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        com.harman.jbl.partylight.lib.ota.c cVar = (com.harman.jbl.partylight.lib.ota.c) obj;
        if (cVar != null) {
            cVar.p(BleUpdateStatus.Installing);
            D();
        }
    }

    @Override // com.harman.jbl.partylight.lib.ota.sdk.l
    public void k(@l3.d PartyLightDevice device) {
        Object obj;
        F.p(device, "device");
        Iterator<T> it = this.f47269M.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (F.g(((com.harman.jbl.partylight.lib.ota.c) obj).k(), device)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        com.harman.jbl.partylight.lib.ota.c cVar = (com.harman.jbl.partylight.lib.ota.c) obj;
        if (cVar != null) {
            cVar.o(0);
            cVar.p(BleUpdateStatus.Updating);
            this.f47265I.r(ProcessStatus.Processing);
            D();
        }
    }

    @Override // com.harman.jbl.partylight.lib.ota.sdk.l
    public void m(@l3.d PartyLightDevice device) {
        Object obj;
        F.p(device, "device");
        Iterator<T> it = this.f47269M.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (F.g(((com.harman.jbl.partylight.lib.ota.c) obj).k(), device)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        com.harman.jbl.partylight.lib.ota.c cVar = (com.harman.jbl.partylight.lib.ota.c) obj;
        if (cVar != null) {
            cVar.p(BleUpdateStatus.Success);
            this.f47268L.add(cVar);
            this.f47269M.remove(cVar);
            D();
        }
    }
}
