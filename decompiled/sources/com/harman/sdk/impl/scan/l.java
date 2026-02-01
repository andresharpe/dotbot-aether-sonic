package com.harman.sdk.impl.scan;

import B2.c;
import android.content.Context;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.utils.DeviceProtocol;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlinx.coroutines.C0;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.C2323l;

/* loaded from: classes2.dex */
public final class l implements B2.c {

    /* renamed from: k, reason: collision with root package name */
    @l3.d
    public static final a f48090k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    @l3.d
    private static final String f48091l = "ScanMgrImpl";

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final com.harman.sdk.concurrent.c<c.b> f48092a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final com.harman.sdk.concurrent.c<c.b> f48093b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final f f48094c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final AtomicBoolean f48095d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final f f48096e;

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private final AtomicBoolean f48097f;

    /* renamed from: g, reason: collision with root package name */
    @l3.d
    private final com.harman.sdk.concurrent.c<HmDevice> f48098g;

    /* renamed from: h, reason: collision with root package name */
    @l3.d
    private final com.harman.sdk.concurrent.c<i> f48099h;

    /* renamed from: i, reason: collision with root package name */
    @l3.d
    private final h f48100i;

    /* renamed from: j, reason: collision with root package name */
    @l3.d
    private final h f48101j;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    @U({"SMAP\nScanMgrImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanMgrImpl.kt\ncom/harman/sdk/impl/scan/ScanMgrImpl$bleDiscoveryObserver$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,228:1\n1#2:229\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class b implements h {

        @kotlin.coroutines.jvm.internal.d(c = "com.harman.sdk.impl.scan.ScanMgrImpl$bleDiscoveryObserver$1$onDeviceInfoChanged$2", f = "ScanMgrImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        static final class a extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f48103I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ l f48104J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ HmDevice f48105K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l lVar, HmDevice hmDevice, kotlin.coroutines.c<? super a> cVar) {
                super(2, cVar);
                this.f48104J = lVar;
                this.f48105K = hmDevice;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f48103I == 0) {
                    W.n(obj);
                    Iterator it = this.f48104J.f48092a.a().iterator();
                    while (it.hasNext()) {
                        ((c.b) it.next()).e(this.f48105K);
                    }
                    return H0.f51801a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
                return new a(this.f48104J, this.f48105K, cVar);
            }
        }

        @kotlin.coroutines.jvm.internal.d(c = "com.harman.sdk.impl.scan.ScanMgrImpl$bleDiscoveryObserver$1$onDeviceOffline$2", f = "ScanMgrImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.harman.sdk.impl.scan.l$b$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C0431b extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f48106I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ l f48107J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ HmDevice f48108K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0431b(l lVar, HmDevice hmDevice, kotlin.coroutines.c<? super C0431b> cVar) {
                super(2, cVar);
                this.f48107J = lVar;
                this.f48108K = hmDevice;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f48106I == 0) {
                    W.n(obj);
                    Iterator it = this.f48107J.f48092a.a().iterator();
                    while (it.hasNext()) {
                        ((c.b) it.next()).d(this.f48108K);
                    }
                    return H0.f51801a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                return ((C0431b) v(u3, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new C0431b(this.f48107J, this.f48108K, cVar);
            }
        }

        b() {
        }

        @Override // com.harman.sdk.impl.scan.h
        public void a(@l3.d HmDevice device, @l3.d String newBLEAddress) {
            F.p(device, "device");
            F.p(newBLEAddress, "newBLEAddress");
            Iterator it = l.this.f48099h.a().iterator();
            while (it.hasNext()) {
                ((i) it.next()).a(device, newBLEAddress);
            }
        }

        @Override // com.harman.sdk.impl.scan.h
        public void b(int i4, @l3.e String str) {
            Iterator it = l.this.f48092a.a().iterator();
            while (it.hasNext()) {
                ((c.b) it.next()).b(i4, str);
            }
        }

        @Override // com.harman.sdk.impl.scan.h
        public void c(@l3.d HmDevice device) {
            F.p(device, "device");
            com.harman.log.f.a(l.f48091l, "onDeviceRoleBitToNormal");
            Iterator it = l.this.f48092a.a().iterator();
            while (it.hasNext()) {
                ((c.b) it.next()).c(device);
            }
        }

        @Override // com.harman.sdk.impl.scan.h
        public void d(@l3.d HmDevice device) {
            F.p(device, "device");
            com.harman.log.f.a(l.f48091l, "onDeviceOffline " + device);
            com.harman.sdk.concurrent.c cVar = l.this.f48098g;
            l lVar = l.this;
            synchronized (cVar) {
                lVar.f48098g.remove(device);
            }
            C2323l.f(C0.f52916E, C2322k0.e(), null, new C0431b(l.this, device, null), 2, null);
        }

        @Override // com.harman.sdk.impl.scan.h
        public void e(@l3.d HmDevice device) {
            F.p(device, "device");
            com.harman.log.f.a(l.f48091l, "onReceived device = " + device.n() + ", receivedContent = " + device.G() + ", bleListeners.size = " + l.this.f48092a.size());
            com.harman.sdk.concurrent.c cVar = l.this.f48098g;
            l lVar = l.this;
            synchronized (cVar) {
                lVar.f48098g.add(device);
            }
            C2323l.f(C0.f52916E, C2322k0.e(), null, new a(l.this, device, null), 2, null);
        }
    }

    @U({"SMAP\nScanMgrImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanMgrImpl.kt\ncom/harman/sdk/impl/scan/ScanMgrImpl$sppDiscoveryObserver$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,228:1\n1#2:229\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class c implements h {
        c() {
        }

        @Override // com.harman.sdk.impl.scan.h
        public void a(@l3.d HmDevice device, @l3.d String newBLEAddress) {
            F.p(device, "device");
            F.p(newBLEAddress, "newBLEAddress");
        }

        @Override // com.harman.sdk.impl.scan.h
        public void b(int i4, @l3.e String str) {
            Iterator it = l.this.f48093b.a().iterator();
            while (it.hasNext()) {
                ((c.b) it.next()).b(i4, str);
            }
        }

        @Override // com.harman.sdk.impl.scan.h
        public void c(@l3.d HmDevice device) {
            F.p(device, "device");
        }

        @Override // com.harman.sdk.impl.scan.h
        public void d(@l3.d HmDevice device) {
            F.p(device, "device");
            com.harman.sdk.concurrent.c cVar = l.this.f48098g;
            l lVar = l.this;
            synchronized (cVar) {
                lVar.f48098g.remove(device);
            }
            Iterator it = l.this.f48093b.a().iterator();
            while (it.hasNext()) {
                ((c.b) it.next()).d(device);
            }
        }

        @Override // com.harman.sdk.impl.scan.h
        public void e(@l3.d HmDevice device) {
            F.p(device, "device");
            com.harman.log.f.a(l.f48091l, "onReceived " + device + ", " + device.G());
            com.harman.sdk.concurrent.c cVar = l.this.f48098g;
            l lVar = l.this;
            synchronized (cVar) {
                lVar.f48098g.add(device);
            }
            Iterator it = l.this.f48093b.a().iterator();
            while (it.hasNext()) {
                ((c.b) it.next()).e(device);
            }
        }
    }

    public l(@l3.d Context context) {
        F.p(context, "context");
        this.f48092a = new com.harman.sdk.concurrent.c<>();
        this.f48093b = new com.harman.sdk.concurrent.c<>();
        this.f48095d = new AtomicBoolean(false);
        this.f48097f = new AtomicBoolean(false);
        this.f48098g = new com.harman.sdk.concurrent.c<>();
        this.f48099h = new com.harman.sdk.concurrent.c<>();
        b bVar = new b();
        this.f48100i = bVar;
        c cVar = new c();
        this.f48101j = cVar;
        d dVar = new d();
        this.f48094c = dVar;
        dVar.c(context);
        dVar.g(bVar);
        q qVar = new q();
        this.f48096e = qVar;
        qVar.c(context);
        qVar.g(cVar);
    }

    @Override // B2.c
    public void a(boolean z3) {
        this.f48094c.a(z3);
    }

    @Override // B2.c
    public void b(@l3.d HmDevice device) {
        F.p(device, "device");
        this.f48094c.b(device);
    }

    @Override // B2.c
    public void d() {
        this.f48094c.d();
    }

    @Override // B2.c
    public void e() {
        this.f48094c.e();
    }

    @Override // B2.c
    public void f() {
        this.f48094c.j();
    }

    @Override // B2.c
    public void g(@l3.d Collection<? extends DeviceProtocol> deviceProtocols, @l3.d c.b scanListener, @l3.e B2.b bVar) {
        F.p(deviceProtocols, "deviceProtocols");
        F.p(scanListener, "scanListener");
        h(deviceProtocols, scanListener, bVar, null);
    }

    @Override // B2.c
    public void h(@l3.d Collection<? extends DeviceProtocol> deviceProtocols, @l3.d c.b scanListener, @l3.e B2.b bVar, @l3.e B2.a aVar) {
        F.p(deviceProtocols, "deviceProtocols");
        F.p(scanListener, "scanListener");
        for (DeviceProtocol deviceProtocol : deviceProtocols) {
            if (!com.harman.sdk.utils.d.w().contains(deviceProtocol)) {
                scanListener.b(-1, "Doesn't support " + deviceProtocol.name());
            } else if (deviceProtocol == DeviceProtocol.PROTOCOL_BLE || deviceProtocol == DeviceProtocol.PROTOCOL_GATT_BR_EDR) {
                synchronized (this.f48092a) {
                    try {
                        this.f48095d.set(true);
                        if (!this.f48092a.contains(scanListener)) {
                            this.f48092a.add(scanListener);
                        }
                        f fVar = this.f48094c;
                        if (fVar instanceof d) {
                            ((d) fVar).c0(aVar);
                        }
                        this.f48094c.f(bVar);
                        H0 h02 = H0.f51801a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    @Override // B2.c
    @l3.d
    public Collection<HmDevice> i() {
        Collection<HmDevice> a4 = this.f48098g.a();
        F.o(a4, "getSnapshot(...)");
        return a4;
    }

    @Override // B2.c
    public void j(@l3.d Collection<? extends DeviceProtocol> deviceProtocols, @l3.d c.b listener) {
        F.p(deviceProtocols, "deviceProtocols");
        F.p(listener, "listener");
        if ((deviceProtocols.contains(DeviceProtocol.PROTOCOL_BLE) || deviceProtocols.contains(DeviceProtocol.PROTOCOL_GATT_BR_EDR)) && this.f48095d.get()) {
            synchronized (this.f48092a) {
                try {
                    this.f48092a.remove(listener);
                    if (this.f48092a.size() == 0) {
                        this.f48094c.i();
                        this.f48095d.set(false);
                    }
                    H0 h02 = H0.f51801a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (deviceProtocols.contains(DeviceProtocol.PROTOCOL_SPP) && this.f48097f.get()) {
            synchronized (this.f48093b) {
                try {
                    this.f48093b.remove(listener);
                    if (this.f48093b.size() == 0) {
                        this.f48096e.i();
                        this.f48097f.set(false);
                    }
                    H0 h03 = H0.f51801a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // B2.c
    public boolean k(@l3.d DeviceProtocol deviceProtocol) {
        F.p(deviceProtocol, "deviceProtocol");
        if (deviceProtocol != DeviceProtocol.PROTOCOL_BLE && deviceProtocol != DeviceProtocol.PROTOCOL_GATT_BR_EDR) {
            if (deviceProtocol == DeviceProtocol.PROTOCOL_SPP) {
                return this.f48097f.get();
            }
            return false;
        }
        return this.f48095d.get();
    }

    @Override // B2.c
    public void l() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(DeviceProtocol.PROTOCOL_BLE);
        linkedList.add(DeviceProtocol.PROTOCOL_GATT_BR_EDR);
        linkedList.add(DeviceProtocol.PROTOCOL_SPP);
        this.f48092a.clear();
        this.f48093b.clear();
        this.f48095d.set(false);
        this.f48097f.set(false);
        this.f48094c.i();
        this.f48096e.i();
    }

    public final void p(@l3.d i listener) {
        F.p(listener, "listener");
        synchronized (this.f48099h) {
            try {
                if (!this.f48099h.contains(listener)) {
                    this.f48099h.add(listener);
                }
                H0 h02 = H0.f51801a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q(@l3.d i listener) {
        F.p(listener, "listener");
        synchronized (this.f48099h) {
            this.f48099h.remove(listener);
        }
    }
}
