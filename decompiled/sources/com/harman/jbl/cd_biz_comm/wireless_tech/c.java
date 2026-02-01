package com.harman.jbl.cd_biz_comm.wireless_tech;

import X2.p;
import android.bluetooth.BluetoothDevice;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.ModuleDevice;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.U;
import kotlinx.coroutines.C2319j;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.V;

@U({"SMAP\nDevConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DevConnector.kt\ncom/harman/jbl/cd_biz_comm/wireless_tech/DevConnector\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,202:1\n215#2,2:203\n215#2,2:205\n215#2,2:207\n215#2,2:209\n*S KotlinDebug\n*F\n+ 1 DevConnector.kt\ncom/harman/jbl/cd_biz_comm/wireless_tech/DevConnector\n*L\n43#1:203,2\n53#1:205,2\n94#1:207,2\n67#1:209,2\n*E\n"})
/* loaded from: classes2.dex */
public final class c implements kotlinx.coroutines.U, com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a {

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    public static final c f38154G;

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private static final String f38155H;

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private static final ConcurrentHashMap<String, com.harman.jbl.cd_biz_comm.wireless_tech.a> f38156I;

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private static final Map<com.harman.jbl.cd_biz_comm.wireless_tech.e, com.harman.jbl.cd_biz_comm.wireless_tech.e> f38157J;

    /* renamed from: E, reason: collision with root package name */
    private final /* synthetic */ kotlinx.coroutines.U f38158E = V.a(C2322k0.c());

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a f38159F = com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a.f38098t.a();

    /* loaded from: classes2.dex */
    /* synthetic */ class a extends FunctionReferenceImpl implements p<String, byte[], H0> {
        a(Object obj) {
            super(2, obj, c.class, "onNotify", "onNotify(Ljava/lang/String;[B)V", 0);
        }

        public final void C0(@l3.d String p02, @l3.d byte[] p12) {
            F.p(p02, "p0");
            F.p(p12, "p1");
            ((c) this.f52262F).w(p02, p12);
        }

        @Override // X2.p
        public /* bridge */ /* synthetic */ H0 c0(String str, byte[] bArr) {
            C0(str, bArr);
            return H0.f51801a;
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class b extends FunctionReferenceImpl implements X2.l<String, H0> {
        b(Object obj) {
            super(1, obj, c.class, "onDisconnected", "onDisconnected(Ljava/lang/String;)V", 0);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(String str) {
            C0(str);
            return H0.f51801a;
        }

        public final void C0(@l3.d String p02) {
            F.p(p02, "p0");
            ((c) this.f52262F).v(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.cd_biz_comm.wireless_tech.DevConnector", f = "DevConnector.kt", i = {0}, l = {62}, m = "doConnect", n = {"dev"}, s = {"L$0"})
    /* renamed from: com.harman.jbl.cd_biz_comm.wireless_tech.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0351c extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f38160H;

        /* renamed from: I, reason: collision with root package name */
        /* synthetic */ Object f38161I;

        /* renamed from: K, reason: collision with root package name */
        int f38163K;

        C0351c(kotlin.coroutines.c<? super C0351c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f38161I = obj;
            this.f38163K |= Integer.MIN_VALUE;
            return c.this.r(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.cd_biz_comm.wireless_tech.DevConnector", f = "DevConnector.kt", i = {0, 0, 1, 1, 2, 2}, l = {135, 143, 145}, m = "sendCommand", n = {"dev", "reqCommand", "dev", "reqCommand", "dev", "reqCommand"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class d<R> extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f38164H;

        /* renamed from: I, reason: collision with root package name */
        Object f38165I;

        /* renamed from: J, reason: collision with root package name */
        /* synthetic */ Object f38166J;

        /* renamed from: L, reason: collision with root package name */
        int f38168L;

        d(kotlin.coroutines.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f38166J = obj;
            this.f38168L |= Integer.MIN_VALUE;
            return c.this.y(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.cd_biz_comm.wireless_tech.DevConnector$sendCommandWithoutSuspend$1", f = "DevConnector.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class e extends SuspendLambda implements p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f38169I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ ModuleDevice f38170J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g<?> f38171K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ModuleDevice moduleDevice, com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g<?> gVar, kotlin.coroutines.c<? super e> cVar) {
            super(2, cVar);
            this.f38170J = moduleDevice;
            this.f38171K = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f38169I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                c cVar = c.f38154G;
                ModuleDevice moduleDevice = this.f38170J;
                com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g<?> gVar = this.f38171K;
                this.f38169I = 1;
                if (cVar.y(moduleDevice, gVar, this) == l4) {
                    return l4;
                }
            }
            return H0.f51801a;
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
            return new e(this.f38170J, this.f38171K, cVar);
        }
    }

    static {
        c cVar = new c();
        f38154G = cVar;
        f38155H = "DevConnector";
        f38156I = new ConcurrentHashMap<>();
        f38157J = new LinkedHashMap();
        cVar.c(new com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.b(new a(cVar), new b(cVar)));
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(final com.harman.jbl.cd_biz_comm.wireless_tech.type.ModuleDevice r6, kotlin.coroutines.c<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.harman.jbl.cd_biz_comm.wireless_tech.c.C0351c
            if (r0 == 0) goto L13
            r0 = r7
            com.harman.jbl.cd_biz_comm.wireless_tech.c$c r0 = (com.harman.jbl.cd_biz_comm.wireless_tech.c.C0351c) r0
            int r1 = r0.f38163K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38163K = r1
            goto L18
        L13:
            com.harman.jbl.cd_biz_comm.wireless_tech.c$c r0 = new com.harman.jbl.cd_biz_comm.wireless_tech.c$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f38161I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f38163K
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f38160H
            com.harman.jbl.cd_biz_comm.wireless_tech.type.ModuleDevice r6 = (com.harman.jbl.cd_biz_comm.wireless_tech.type.ModuleDevice) r6
            kotlin.W.n(r7)
            goto L6e
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.W.n(r7)
            java.lang.String r7 = com.harman.jbl.cd_biz_comm.wireless_tech.c.f38155H
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "dev start connect "
            r2.append(r4)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.harman.jbl.cd_biz_comm.logger.d.d(r7, r2)
            java.lang.String r7 = r6.g()
            android.bluetooth.le.ScanResult r2 = r6.f()
            android.bluetooth.BluetoothDevice r2 = r2.getDevice()
            java.lang.String r4 = "getDevice(...)"
            kotlin.jvm.internal.F.o(r2, r4)
            com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.c r4 = com.harman.jbl.cd_biz_comm.wireless_tech.d.b(r6)
            r0.f38160H = r6
            r0.f38163K = r3
            java.lang.Object r7 = r5.k(r7, r2, r4, r0)
            if (r7 != r1) goto L6e
            return r1
        L6e:
            com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.i r7 = (com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.i) r7
            boolean r0 = r7.f()
            if (r0 == 0) goto La7
            java.lang.String r0 = com.harman.jbl.cd_biz_comm.wireless_tech.c.f38155H
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "dev connect success; "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.harman.jbl.cd_biz_comm.logger.d.d(r0, r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.harman.jbl.cd_biz_comm.wireless_tech.a> r0 = com.harman.jbl.cd_biz_comm.wireless_tech.c.f38156I
            java.lang.String r1 = r6.g()
            com.harman.jbl.cd_biz_comm.wireless_tech.a r2 = new com.harman.jbl.cd_biz_comm.wireless_tech.a
            com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.b r3 = com.harman.jbl.cd_biz_comm.wireless_tech.d.a(r6)
            r2.<init>(r6, r3)
            r0.put(r1, r2)
            com.harman.jbl.cd_biz_comm.wireless_tech.b r0 = new com.harman.jbl.cd_biz_comm.wireless_tech.b
            r0.<init>()
            com.harman.jbl.cd_biz_comm.utils.b.a(r0)
            goto Lc9
        La7:
            java.lang.String r0 = com.harman.jbl.cd_biz_comm.wireless_tech.c.f38155H
            java.lang.String r1 = r7.e()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "dev connect failed; "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = " "
            r2.append(r6)
            r2.append(r1)
            java.lang.String r6 = r2.toString()
            com.harman.jbl.cd_biz_comm.logger.d.b(r0, r6)
        Lc9:
            boolean r6 = r7.f()
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.a.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.cd_biz_comm.wireless_tech.c.r(com.harman.jbl.cd_biz_comm.wireless_tech.type.ModuleDevice, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(ModuleDevice dev) {
        F.p(dev, "$dev");
        Iterator<Map.Entry<com.harman.jbl.cd_biz_comm.wireless_tech.e, com.harman.jbl.cd_biz_comm.wireless_tech.e>> it = f38157J.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().f().C(dev);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(String str) {
        com.harman.jbl.cd_biz_comm.wireless_tech.a remove = f38156I.remove(str);
        if (remove != null) {
            com.harman.jbl.cd_biz_comm.logger.d.b(f38155H, "onDisConnected " + remove.f());
            Iterator<Map.Entry<com.harman.jbl.cd_biz_comm.wireless_tech.e, com.harman.jbl.cd_biz_comm.wireless_tech.e>> it = f38157J.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().g().C(remove.f());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(String str, byte[] bArr) {
        com.harman.jbl.cd_biz_comm.wireless_tech.a aVar = f38156I.get(str);
        if (aVar != null) {
            com.harman.jbl.cd_biz_comm.logger.d.d(com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.b.f38065J.a(), "onNotify " + aVar.f());
            g t3 = aVar.e().t(bArr);
            if (t3 != null) {
                Iterator<Map.Entry<com.harman.jbl.cd_biz_comm.wireless_tech.e, com.harman.jbl.cd_biz_comm.wireless_tech.e>> it = f38157J.entrySet().iterator();
                while (it.hasNext()) {
                    it.next().getValue().h().c0(aVar.f(), t3);
                }
            }
        }
    }

    public final void A(@l3.d com.harman.jbl.cd_biz_comm.wireless_tech.e observer) {
        F.p(observer, "observer");
        f38157J.remove(observer);
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a
    public long a() {
        return this.f38159F.a();
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a
    public long b() {
        return this.f38159F.b();
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a
    public void c(@l3.d com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.b observer) {
        F.p(observer, "observer");
        this.f38159F.c(observer);
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a
    public void d(@l3.e String str) {
        this.f38159F.d(str);
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a
    public boolean e(@l3.d String uuid) {
        F.p(uuid, "uuid");
        return this.f38159F.e(uuid);
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a
    @l3.e
    public Object f(@l3.d String str, @l3.d byte[] bArr, @l3.d kotlin.coroutines.c<? super com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.i> cVar) {
        return this.f38159F.f(str, bArr, cVar);
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a
    public long g() {
        return this.f38159F.g();
    }

    @Override // kotlinx.coroutines.U
    @l3.d
    public kotlin.coroutines.f getCoroutineContext() {
        return this.f38158E.getCoroutineContext();
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a
    public int j() {
        return this.f38159F.j();
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a
    @l3.e
    public Object k(@l3.d String str, @l3.d BluetoothDevice bluetoothDevice, @l3.d com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.c cVar, @l3.d kotlin.coroutines.c<? super com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.i> cVar2) {
        return this.f38159F.k(str, bluetoothDevice, cVar, cVar2);
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a
    @l3.d
    public Map<com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.b, com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.b> l() {
        return this.f38159F.l();
    }

    @l3.e
    public final Object p(@l3.d ModuleDevice moduleDevice, @l3.d kotlin.coroutines.c<? super Boolean> cVar) {
        if (u(moduleDevice)) {
            return kotlin.coroutines.jvm.internal.a.a(true);
        }
        return r(moduleDevice, cVar);
    }

    public final void q(@l3.e ModuleDevice moduleDevice) {
        com.harman.jbl.cd_biz_comm.logger.d.d(f38155H, "start disconnect " + moduleDevice);
        if (moduleDevice == null) {
            Iterator<Map.Entry<String, com.harman.jbl.cd_biz_comm.wireless_tech.a>> it = f38156I.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().e().p();
            }
            f38156I.clear();
            d(null);
            return;
        }
        com.harman.jbl.cd_biz_comm.wireless_tech.a remove = f38156I.remove(moduleDevice.g());
        if (remove != null) {
            f38154G.d(remove.f().g());
        }
    }

    @l3.d
    public final String t() {
        return f38155H;
    }

    public final boolean u(@l3.d ModuleDevice dev) {
        F.p(dev, "dev");
        return e(dev.g());
    }

    public final void x(@l3.d com.harman.jbl.cd_biz_comm.wireless_tech.e observer) {
        F.p(observer, "observer");
        f38157J.put(observer, observer);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @androidx.annotation.InterfaceC0561d
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> java.lang.Object y(@l3.d com.harman.jbl.cd_biz_comm.wireless_tech.type.ModuleDevice r13, @l3.d com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g<R> r14, @l3.d kotlin.coroutines.c<? super com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.WriteResp<R>> r15) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.cd_biz_comm.wireless_tech.c.y(com.harman.jbl.cd_biz_comm.wireless_tech.type.ModuleDevice, com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g, kotlin.coroutines.c):java.lang.Object");
    }

    public final void z(@l3.d ModuleDevice dev, @l3.d com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g<?> reqCommand) {
        F.p(dev, "dev");
        F.p(reqCommand, "reqCommand");
        C2319j.e(this, null, null, new e(dev, reqCommand, null), 3, null);
    }
}
