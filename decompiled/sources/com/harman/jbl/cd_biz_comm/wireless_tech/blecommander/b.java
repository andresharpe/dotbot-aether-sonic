package com.harman.jbl.cd_biz_comm.wireless_tech.blecommander;

import X2.p;
import android.bluetooth.BluetoothDevice;
import androidx.annotation.InterfaceC0561d;
import androidx.annotation.K;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.WriteResp;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.ModuleDevice;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.H0;
import kotlin.W;
import kotlin.collections.A;
import kotlin.collections.D;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.B;
import kotlinx.coroutines.C2319j;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.InterfaceC2350z;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V;
import kotlinx.coroutines.W0;
import kotlinx.coroutines.w1;

/* loaded from: classes2.dex */
public abstract class b implements U, com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a {

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    public static final a f38065J = new a(null);

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private static final String f38066K = com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.t();

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final ModuleDevice f38067E;

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ U f38068F;

    /* renamed from: G, reason: collision with root package name */
    private final /* synthetic */ com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a f38069G;

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final List<com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.c> f38070H;

    /* renamed from: I, reason: collision with root package name */
    @l3.e
    private volatile com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.c f38071I;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final String a() {
            return b.f38066K;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.BaseCommander$clear$1", f = "BaseCommander.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0347b extends SuspendLambda implements p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f38072I;

        C0347b(kotlin.coroutines.c<? super C0347b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f38072I == 0) {
                W.n(obj);
                b.this.f38070H.clear();
                return H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((C0347b) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new C0347b(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.BaseCommander$doWriteNextCommand$1$1", f = "BaseCommander.kt", i = {}, l = {66, 84}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class c extends SuspendLambda implements p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f38074I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.c f38075J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ b f38076K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ U f38077L;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.BaseCommander$doWriteNextCommand$1$1$1", f = "BaseCommander.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends SuspendLambda implements p<U, kotlin.coroutines.c<? super H0>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f38078I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ b f38079J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ U f38080K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, U u3, kotlin.coroutines.c<? super a> cVar) {
                super(2, cVar);
                this.f38079J = bVar;
                this.f38080K = u3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f38078I == 0) {
                    W.n(obj);
                    this.f38079J.f38071I = null;
                    this.f38079J.q(this.f38080K);
                    return H0.f51801a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                return ((a) v(u3, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new a(this.f38079J, this.f38080K, cVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.BaseCommander$doWriteNextCommand$1$1$ret$1", f = "BaseCommander.kt", i = {}, l = {ConstraintLayout.b.a.f9609h0, 71}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.b$c$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0348b extends SuspendLambda implements p<U, kotlin.coroutines.c<? super WriteResp<?>>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f38081I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ b f38082J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.c f38083K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0348b(b bVar, com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.c cVar, kotlin.coroutines.c<? super C0348b> cVar2) {
                super(2, cVar2);
                this.f38082J = bVar;
                this.f38083K = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f38081I;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            W.n(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    W.n(obj);
                } else {
                    W.n(obj);
                    b bVar = this.f38082J;
                    String g4 = bVar.r().g();
                    byte[] g5 = this.f38083K.f().g();
                    this.f38081I = 1;
                    obj = bVar.f(g4, g5, this);
                    if (obj == l4) {
                        return l4;
                    }
                }
                com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.i iVar = (com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.i) obj;
                if (iVar.f()) {
                    com.harman.jbl.cd_biz_comm.logger.d.d(b.f38065J.a(), "write success " + this.f38082J.r().g() + " " + this.f38083K.f().e());
                    InterfaceC2350z<WriteResp<?>> e4 = this.f38083K.e();
                    this.f38081I = 2;
                    obj = e4.c0(this);
                    if (obj == l4) {
                        return l4;
                    }
                    return obj;
                }
                com.harman.jbl.cd_biz_comm.logger.d.b(b.f38065J.a(), "write error " + iVar.e() + " " + this.f38082J.r().g() + " " + this.f38083K.f().e());
                WriteResp<?> writeResp = new WriteResp<>(null, false, WriteResp.Error.WRITE_ERROR, iVar.e(), null, 16, null);
                this.f38083K.e().F0(writeResp);
                return writeResp;
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super WriteResp<?>> cVar) {
                return ((C0348b) v(u3, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new C0348b(this.f38082J, this.f38083K, cVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.c cVar, b bVar, U u3, kotlin.coroutines.c<? super c> cVar2) {
            super(2, cVar2);
            this.f38075J = cVar;
            this.f38076K = bVar;
            this.f38077L = u3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f38074I;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        W.n(obj);
                        return H0.f51801a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                W.n(obj);
            } else {
                W.n(obj);
                long d4 = this.f38075J.f().d();
                C0348b c0348b = new C0348b(this.f38076K, this.f38075J, null);
                this.f38074I = 1;
                obj = w1.e(d4, c0348b, this);
                if (obj == l4) {
                    return l4;
                }
            }
            if (((WriteResp) obj) == null) {
                this.f38075J.e().F0(new WriteResp<>(null, false, WriteResp.Error.TIMEOUT, "request time out", null, 16, null));
            }
            W0 e4 = C2322k0.e();
            a aVar = new a(this.f38076K, this.f38077L, null);
            this.f38074I = 2;
            if (C2319j.h(e4, aVar, this) == l4) {
                return l4;
            }
            return H0.f51801a;
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
            return new c(this.f38075J, this.f38076K, this.f38077L, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.BaseCommander$sendCommand$2", f = "BaseCommander.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class d<R> extends SuspendLambda implements p<U, kotlin.coroutines.c<? super WriteResp<R>>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f38084I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ g<R> f38086K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(g<R> gVar, kotlin.coroutines.c<? super d> cVar) {
            super(2, cVar);
            this.f38086K = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            Object v3;
            InterfaceC2350z<WriteResp<?>> c4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f38084I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                v3 = D.v3(b.this.f38070H);
                com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.c cVar = (com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.c) v3;
                if (cVar != null && F.g(cVar.f().getClass().getName(), this.f38086K.getClass().getName()) && this.f38086K.a()) {
                    c4 = cVar.e();
                    F.n(c4, "null cannot be cast to non-null type kotlinx.coroutines.CompletableDeferred<com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.WriteResp<R of com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.BaseCommander.sendCommand>>");
                    cVar.g(this.f38086K);
                } else {
                    c4 = B.c(null, 1, null);
                    List list = b.this.f38070H;
                    g<R> gVar = this.f38086K;
                    F.n(c4, "null cannot be cast to non-null type kotlinx.coroutines.CompletableDeferred<com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.WriteResp<*>>");
                    list.add(new com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.c(gVar, c4));
                }
                if (b.this.s() == null) {
                    b bVar = b.this;
                    bVar.q(bVar);
                }
                this.f38084I = 1;
                obj = c4.c0(this);
                if (obj == l4) {
                    return l4;
                }
            }
            return obj;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super WriteResp<R>> cVar) {
            return ((d) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new d(this.f38086K, cVar);
        }
    }

    public b(@l3.d ModuleDevice dev) {
        F.p(dev, "dev");
        this.f38067E = dev;
        this.f38068F = V.a(C2322k0.c());
        this.f38069G = com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a.f38098t.a();
        this.f38070H = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @K
    public final void q(U u3) {
        Object N02;
        N02 = A.N0(this.f38070H);
        this.f38071I = (com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.c) N02;
        com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.c cVar = this.f38071I;
        if (cVar != null) {
            C2323l.f(u3, null, null, new c(cVar, this, u3, null), 3, null);
        }
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a
    public long a() {
        return this.f38069G.a();
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a
    public long b() {
        return this.f38069G.b();
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a
    public void c(@l3.d com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.b observer) {
        F.p(observer, "observer");
        this.f38069G.c(observer);
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a
    public void d(@l3.e String str) {
        this.f38069G.d(str);
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a
    public boolean e(@l3.d String uuid) {
        F.p(uuid, "uuid");
        return this.f38069G.e(uuid);
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a
    @l3.e
    public Object f(@l3.d String str, @l3.d byte[] bArr, @l3.d kotlin.coroutines.c<? super com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.i> cVar) {
        return this.f38069G.f(str, bArr, cVar);
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a
    public long g() {
        return this.f38069G.g();
    }

    @Override // kotlinx.coroutines.U
    @l3.d
    public kotlin.coroutines.f getCoroutineContext() {
        return this.f38068F.getCoroutineContext();
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a
    public int j() {
        return this.f38069G.j();
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a
    @l3.e
    public Object k(@l3.d String str, @l3.d BluetoothDevice bluetoothDevice, @l3.d com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.c cVar, @l3.d kotlin.coroutines.c<? super com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.i> cVar2) {
        return this.f38069G.k(str, bluetoothDevice, cVar, cVar2);
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a
    @l3.d
    public Map<com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.b, com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.b> l() {
        return this.f38069G.l();
    }

    public final void p() {
        C2323l.f(this, C2322k0.e(), null, new C0347b(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l3.d
    public final ModuleDevice r() {
        return this.f38067E;
    }

    @l3.e
    public final com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.c s() {
        return this.f38071I;
    }

    @l3.e
    public abstract com.harman.jbl.cd_biz_comm.wireless_tech.g t(@l3.d byte[] bArr);

    @InterfaceC0561d
    @l3.e
    public final <R> Object u(@l3.d g<R> gVar, @l3.d kotlin.coroutines.c<? super WriteResp<R>> cVar) {
        return C2319j.h(C2322k0.e(), new d(gVar, null), cVar);
    }
}
