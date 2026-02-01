package com.harman.jbl.cd_biz_comm.wireless_tech.bleconn;

import X2.l;
import X2.p;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import androidx.recyclerview.widget.n;
import com.blankj.utilcode.util.C1115z;
import com.blankj.utilcode.util.E0;
import com.clj.fastble.exception.BleException;
import com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a;
import com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlinx.coroutines.B;
import kotlinx.coroutines.C2269d0;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.InterfaceC2350z;
import kotlinx.coroutines.V;
import v0.k;

@U({"SMAP\nFastBleBleConnectorProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastBleBleConnectorProxy.kt\ncom/harman/jbl/cd_biz_comm/wireless_tech/bleconn/FastBleBleConnectorProxy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,245:1\n1#2:246\n215#3,2:247\n*S KotlinDebug\n*F\n+ 1 FastBleBleConnectorProxy.kt\ncom/harman/jbl/cd_biz_comm/wireless_tech/bleconn/FastBleBleConnectorProxy\n*L\n89#1:247,2\n*E\n"})
/* loaded from: classes2.dex */
public final class g extends v0.b implements com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a, kotlinx.coroutines.U {

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    public static final g f38116F;

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    private static final ConcurrentHashMap<String, e> f38117G;

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private static final ConcurrentHashMap<String, com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.d> f38118H;

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private static final String f38119I = "FastBleBleConnector";

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private static final Map<com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.b, com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.b> f38120J;

    /* renamed from: E, reason: collision with root package name */
    private final /* synthetic */ kotlinx.coroutines.U f38121E = V.a(C2322k0.c());

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.FastBleBleConnectorProxy$fastBleWrite$1", f = "FastBleBleConnectorProxy.kt", i = {}, l = {n.f.f18255b}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class a extends SuspendLambda implements p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f38122I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ int f38123J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.d f38124K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ byte[] f38125L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ InterfaceC2350z<i> f38126M;

        /* renamed from: com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0350a extends k {

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.d f38127c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC2350z<i> f38128d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f38129e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ byte[] f38130f;

            C0350a(com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.d dVar, InterfaceC2350z<i> interfaceC2350z, int i4, byte[] bArr) {
                this.f38127c = dVar;
                this.f38128d = interfaceC2350z;
                this.f38129e = i4;
                this.f38130f = bArr;
            }

            @Override // v0.k
            public void e(@l3.e BleException bleException) {
                com.harman.jbl.cd_biz_comm.logger.d.b(com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.t(), "fast ble write fail; " + this.f38127c.h() + "; " + bleException + "; index:" + this.f38129e);
                com.harman.jbl.cd_biz_comm.logger.d.b(g.f38119I, "fast ble write fail; " + this.f38127c.h() + "; " + bleException + "; index:" + this.f38129e);
                int i4 = this.f38129e;
                g gVar = g.f38116F;
                if (i4 < gVar.j()) {
                    gVar.x(this.f38127c, this.f38130f, this.f38129e + 1, this.f38128d);
                } else {
                    this.f38128d.F0(new i(false, String.valueOf(bleException)));
                }
            }

            @Override // v0.k
            public void f(int i4, int i5, @l3.e byte[] bArr) {
                com.harman.jbl.cd_biz_comm.logger.d.a(com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.t(), "fast ble write success " + this.f38127c.h() + " " + C1115z.l(bArr));
                com.harman.jbl.cd_biz_comm.logger.d.a(g.f38119I, "fast ble write success " + this.f38127c.h() + " " + C1115z.l(bArr));
                this.f38128d.F0(new i(true, "ok"));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i4, com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.d dVar, byte[] bArr, InterfaceC2350z<i> interfaceC2350z, kotlin.coroutines.c<? super a> cVar) {
            super(2, cVar);
            this.f38123J = i4;
            this.f38124K = dVar;
            this.f38125L = bArr;
            this.f38126M = interfaceC2350z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f38122I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                long b4 = this.f38123J * g.f38116F.b();
                this.f38122I = 1;
                if (C2269d0.b(b4, this) == l4) {
                    return l4;
                }
            }
            com.clj.fastble.a w3 = com.clj.fastble.a.w();
            com.clj.fastble.data.b f4 = this.f38124K.f();
            String h4 = this.f38124K.g().h();
            String j4 = this.f38124K.g().j();
            byte[] bArr = this.f38125L;
            w3.n0(f4, h4, j4, bArr, false, new C0350a(this.f38124K, this.f38126M, this.f38123J, bArr));
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((a) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new a(this.f38123J, this.f38124K, this.f38125L, this.f38126M, cVar);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.FastBleBleConnectorProxy$onConnectFail$1", f = "FastBleBleConnectorProxy.kt", i = {0}, l = {64}, m = "invokeSuspend", n = {"entry"}, s = {"L$4"})
    @U({"SMAP\nFastBleBleConnectorProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastBleBleConnectorProxy.kt\ncom/harman/jbl/cd_biz_comm/wireless_tech/bleconn/FastBleBleConnectorProxy$onConnectFail$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,245:1\n1#2:246\n*E\n"})
    /* loaded from: classes2.dex */
    static final class b extends SuspendLambda implements p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        Object f38131I;

        /* renamed from: J, reason: collision with root package name */
        Object f38132J;

        /* renamed from: K, reason: collision with root package name */
        Object f38133K;

        /* renamed from: L, reason: collision with root package name */
        Object f38134L;

        /* renamed from: M, reason: collision with root package name */
        Object f38135M;

        /* renamed from: N, reason: collision with root package name */
        int f38136N;

        /* renamed from: O, reason: collision with root package name */
        final /* synthetic */ com.clj.fastble.data.b f38137O;

        /* renamed from: P, reason: collision with root package name */
        final /* synthetic */ BleException f38138P;

        /* renamed from: Q, reason: collision with root package name */
        final /* synthetic */ g f38139Q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.clj.fastble.data.b bVar, BleException bleException, g gVar, kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
            this.f38137O = bVar;
            this.f38138P = bleException;
            this.f38139Q = gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x012d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 336
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.g.b.D(java.lang.Object):java.lang.Object");
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
            return new b(this.f38137O, this.f38138P, this.f38139Q, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.FastBleBleConnectorProxy$startNotify$1", f = "FastBleBleConnectorProxy.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class c extends SuspendLambda implements p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f38140I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ int f38141J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ e f38142K;

        @U({"SMAP\nFastBleBleConnectorProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastBleBleConnectorProxy.kt\ncom/harman/jbl/cd_biz_comm/wireless_tech/bleconn/FastBleBleConnectorProxy$startNotify$1$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,245:1\n215#2,2:246\n*S KotlinDebug\n*F\n+ 1 FastBleBleConnectorProxy.kt\ncom/harman/jbl/cd_biz_comm/wireless_tech/bleconn/FastBleBleConnectorProxy$startNotify$1$1\n*L\n164#1:246,2\n*E\n"})
        /* loaded from: classes2.dex */
        public static final class a extends v0.e {

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ e f38143c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f38144d;

            a(e eVar, int i4) {
                this.f38143c = eVar;
                this.f38144d = i4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void i(e connectingModel, byte[] data) {
                F.p(connectingModel, "$connectingModel");
                F.p(data, "$data");
                Iterator<Map.Entry<com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.b, com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.b>> it = g.f38116F.l().entrySet().iterator();
                while (it.hasNext()) {
                    it.next().getValue().f().c0(connectingModel.l(), data);
                }
            }

            @Override // v0.e
            public void e(@l3.e final byte[] bArr) {
                com.harman.jbl.cd_biz_comm.logger.d.a(com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.t(), "fast ble notify " + this.f38143c.l() + " " + C1115z.l(bArr));
                com.harman.jbl.cd_biz_comm.logger.d.a(g.f38119I, "fast ble notify " + this.f38143c.l() + " " + C1115z.l(bArr));
                if (bArr != null) {
                    final e eVar = this.f38143c;
                    com.harman.jbl.cd_biz_comm.utils.b.a(new Runnable() { // from class: com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            g.c.a.i(e.this, bArr);
                        }
                    });
                }
            }

            @Override // v0.e
            public void f(@l3.e BleException bleException) {
                String str;
                com.harman.jbl.cd_biz_comm.logger.d.b(com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.t(), "start notify fail; " + this.f38143c.l() + "; " + bleException + "; index:" + this.f38144d);
                if (bleException != null) {
                    str = bleException.b();
                } else {
                    str = null;
                }
                if (F.g(str, "descriptor equals null")) {
                    g();
                    return;
                }
                int i4 = this.f38144d;
                g gVar = g.f38116F;
                if (i4 < gVar.j()) {
                    gVar.A(this.f38143c, this.f38144d + 1);
                } else {
                    com.clj.fastble.a.w().i(this.f38143c.h());
                    gVar.y(this.f38143c, new i(false, String.valueOf(bleException)));
                }
            }

            @Override // v0.e
            public void g() {
                com.harman.jbl.cd_biz_comm.logger.d.d(com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.t(), "notify success; " + this.f38143c.l() + ";");
                g.f38116F.y(this.f38143c, new i(true, "OK"));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i4, e eVar, kotlin.coroutines.c<? super c> cVar) {
            super(2, cVar);
            this.f38141J = i4;
            this.f38142K = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f38140I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                long b4 = g.f38116F.b() * (this.f38141J + 1);
                this.f38140I = 1;
                if (C2269d0.b(b4, this) == l4) {
                    return l4;
                }
            }
            com.clj.fastble.a.w().O(this.f38142K.h(), this.f38142K.j().h(), this.f38142K.j().i(), false, new a(this.f38142K, this.f38141J));
            return H0.f51801a;
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
            return new c(this.f38141J, this.f38142K, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.FastBleBleConnectorProxy$startSetMtu$1", f = "FastBleBleConnectorProxy.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class d extends SuspendLambda implements p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f38145I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ int f38146J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ e f38147K;

        /* loaded from: classes2.dex */
        public static final class a extends v0.d {

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ e f38148c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f38149d;

            a(e eVar, int i4) {
                this.f38148c = eVar;
                this.f38149d = i4;
            }

            @Override // v0.d
            public void e(int i4) {
                com.harman.jbl.cd_biz_comm.logger.d.d(com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.t(), "set mtu success; " + this.f38148c.l() + "; " + i4);
                g.f38116F.A(this.f38148c, 0);
            }

            @Override // v0.d
            public void f(@l3.e BleException bleException) {
                com.harman.jbl.cd_biz_comm.logger.d.b(com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.t(), "set mtu fail; " + this.f38148c.l() + "; " + bleException + "; index:" + this.f38149d);
                int i4 = this.f38149d;
                g gVar = g.f38116F;
                if (i4 < gVar.j()) {
                    gVar.B(this.f38148c, this.f38149d + 1);
                } else {
                    com.clj.fastble.a.w().i(this.f38148c.h());
                    gVar.y(this.f38148c, new i(false, String.valueOf(bleException)));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i4, e eVar, kotlin.coroutines.c<? super d> cVar) {
            super(2, cVar);
            this.f38146J = i4;
            this.f38147K = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f38145I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                long b4 = g.f38116F.b() * (this.f38146J + 1);
                this.f38145I = 1;
                if (C2269d0.b(b4, this) == l4) {
                    return l4;
                }
            }
            com.clj.fastble.a.w().d0(this.f38147K.h(), this.f38147K.j().g(), new a(this.f38147K, this.f38146J));
            return H0.f51801a;
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
            return new d(this.f38146J, this.f38147K, cVar);
        }
    }

    static {
        g gVar = new g();
        f38116F = gVar;
        f38117G = new ConcurrentHashMap<>();
        f38118H = new ConcurrentHashMap<>();
        com.clj.fastble.a.w().l(false).f0(0).b0(gVar.a()).e0((int) gVar.g()).H(E0.a());
        f38120J = new LinkedHashMap();
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(e eVar, int i4) {
        C2323l.f(this, null, null, new c(i4, eVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(e eVar, int i4) {
        C2323l.f(this, null, null, new d(i4, eVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.d dVar, byte[] bArr, int i4, InterfaceC2350z<i> interfaceC2350z) {
        C2323l.f(this, null, null, new a(i4, dVar, bArr, interfaceC2350z, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(e eVar, i iVar) {
        if (iVar.f()) {
            f38118H.put(eVar.l(), new com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.d(eVar.l(), eVar.h(), eVar.j()));
        }
        e remove = f38117G.remove(eVar.l());
        if (remove != null) {
            remove.i().F0(iVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void z(Map.Entry connectedEntry) {
        F.p(connectedEntry, "$connectedEntry");
        Iterator<Map.Entry<com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.b, com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.b>> it = f38116F.l().entrySet().iterator();
        while (it.hasNext()) {
            l<String, H0> e4 = it.next().getValue().e();
            Object key = connectedEntry.getKey();
            F.o(key, "<get-key>(...)");
            e4.C(key);
        }
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a
    public long a() {
        return a.b.c(this);
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a
    public long b() {
        return a.b.e(this);
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a
    public void c(@l3.d com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.b bVar) {
        a.b.b(this, bVar);
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a
    public void d(@l3.e String str) {
        if (str == null) {
            com.clj.fastble.a.w().j();
            return;
        }
        com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.d dVar = f38118H.get(str);
        if (dVar != null) {
            com.clj.fastble.a.w().i(dVar.f());
        }
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a
    public boolean e(@l3.d String uuid) {
        F.p(uuid, "uuid");
        return f38118H.containsKey(uuid);
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a
    @l3.e
    public Object f(@l3.d String str, @l3.d byte[] bArr, @l3.d kotlin.coroutines.c<? super i> cVar) {
        com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.d dVar = null;
        InterfaceC2350z<i> c4 = B.c(null, 1, null);
        com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.d dVar2 = f38118H.get(str);
        if (dVar2 != null) {
            f38116F.x(dVar2, bArr, 0, c4);
            dVar = dVar2;
        }
        if (dVar == null) {
            kotlin.coroutines.jvm.internal.a.a(c4.F0(new i(false, "device not connect " + str)));
        }
        return c4.c0(cVar);
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a
    public long g() {
        return a.b.d(this);
    }

    @Override // kotlinx.coroutines.U
    @l3.d
    public kotlin.coroutines.f getCoroutineContext() {
        return this.f38121E.getCoroutineContext();
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a
    public int j() {
        return a.b.f(this);
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a
    @l3.e
    public Object k(@l3.d String str, @l3.d BluetoothDevice bluetoothDevice, @l3.d com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.c cVar, @l3.d kotlin.coroutines.c<? super i> cVar2) {
        ConcurrentHashMap<String, e> concurrentHashMap = f38117G;
        e eVar = concurrentHashMap.get(str);
        if (eVar != null) {
            return eVar.i().c0(cVar2);
        }
        e eVar2 = new e(str, new com.clj.fastble.data.b(bluetoothDevice), B.c(null, 1, null), 0, cVar);
        concurrentHashMap.put(str, eVar2);
        com.clj.fastble.a.w().c(eVar2.h(), this);
        return eVar2.i().c0(cVar2);
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a
    @l3.d
    public Map<com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.b, com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.b> l() {
        return f38120J;
    }

    @Override // v0.b
    public void n(@l3.e com.clj.fastble.data.b bVar, @l3.e BleException bleException) {
        C2323l.f(this, C2322k0.e(), null, new b(bVar, bleException, this, null), 2, null);
    }

    @Override // v0.b
    public void o(@l3.e com.clj.fastble.data.b bVar, @l3.e BluetoothGatt bluetoothGatt, int i4) {
        e eVar;
        Object obj;
        Collection<e> values = f38117G.values();
        F.o(values, "<get-values>(...)");
        Iterator<T> it = values.iterator();
        while (true) {
            eVar = null;
            if (it.hasNext()) {
                obj = it.next();
                if (F.g(((e) obj).h(), bVar)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        e eVar2 = (e) obj;
        if (eVar2 != null) {
            com.harman.jbl.cd_biz_comm.logger.d.d(com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.t(), "ble connect success; " + bluetoothGatt);
            f38116F.B(eVar2, 0);
            eVar = eVar2;
        }
        if (eVar == null) {
            com.harman.jbl.cd_biz_comm.logger.d.b(com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.t(), "ble connect success not find target dev; " + bVar + " " + bluetoothGatt);
        }
    }

    @Override // v0.b
    public void p(boolean z3, @l3.e com.clj.fastble.data.b bVar, @l3.e BluetoothGatt bluetoothGatt, int i4) {
        Map.Entry entry;
        Object obj;
        Set<Map.Entry<String, com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.d>> entrySet = f38118H.entrySet();
        F.o(entrySet, "<get-entries>(...)");
        Iterator<T> it = entrySet.iterator();
        while (true) {
            entry = null;
            if (it.hasNext()) {
                obj = it.next();
                if (((com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.d) ((Map.Entry) obj).getValue()).f() == bVar) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        final Map.Entry entry2 = (Map.Entry) obj;
        if (entry2 != null) {
            com.harman.jbl.cd_biz_comm.logger.d.b(com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.t(), "onDisConnected; isActive:" + z3 + "; bd:" + bVar + "; uuid:" + entry2.getKey());
            f38118H.remove(entry2.getKey());
            if (!z3) {
                com.harman.jbl.cd_biz_comm.utils.b.a(new Runnable() { // from class: com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.z(entry2);
                    }
                });
            }
            entry = entry2;
        }
        if (entry == null) {
            com.harman.jbl.cd_biz_comm.logger.d.b(com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.t(), "onDisConnected not find target dev; isActive:" + z3 + "; bd:" + bVar);
        }
    }

    @Override // v0.b
    public void q() {
    }
}
