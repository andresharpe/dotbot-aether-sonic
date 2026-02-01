package com.harman.sdk.impl.connect;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.impl.connect.i;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.DeviceProtocol;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.StatusCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.U;
import y2.InterfaceC2445a;

@U({"SMAP\nDeviceConnectImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceConnectImpl.kt\ncom/harman/sdk/impl/connect/DeviceConnectImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,373:1\n1#2:374\n*E\n"})
/* loaded from: classes2.dex */
public final class i implements InterfaceC2445a {

    /* renamed from: i, reason: collision with root package name */
    @l3.d
    private static final String f47953i = "DeviceConnectImpl";

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final C f47955a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final G f47956b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final com.harman.sdk.concurrent.c<InterfaceC2445a.InterfaceC0551a> f47957c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private com.harman.sdk.concurrent.c<z2.d> f47958d;

    /* renamed from: e, reason: collision with root package name */
    @l3.e
    private final Handler f47959e;

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private final D f47960f;

    /* renamed from: g, reason: collision with root package name */
    @l3.d
    private final H f47961g;

    /* renamed from: h, reason: collision with root package name */
    @l3.d
    public static final a f47952h = new a(null);

    /* renamed from: j, reason: collision with root package name */
    @l3.d
    private static final String f47954j = i.class.getSimpleName() + "KEY_LISTENER";

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47962a;

        static {
            int[] iArr = new int[DeviceProtocol.values().length];
            try {
                iArr[DeviceProtocol.PROTOCOL_BLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeviceProtocol.PROTOCOL_GATT_BR_EDR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeviceProtocol.PROTOCOL_SPP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f47962a = iArr;
        }
    }

    @U({"SMAP\nDeviceConnectImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceConnectImpl.kt\ncom/harman/sdk/impl/connect/DeviceConnectImpl$gattObserver$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,373:1\n1#2:374\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class c implements D {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(i this$0, HmDevice device, com.harman.sdk.a command, z2.d dVar) {
            kotlin.jvm.internal.F.p(this$0, "this$0");
            kotlin.jvm.internal.F.p(device, "$device");
            kotlin.jvm.internal.F.p(command, "$command");
            this$0.G(device, command, dVar);
        }

        @Override // com.harman.sdk.impl.connect.D
        public void a(@l3.d HmDevice device, int i4) {
            kotlin.jvm.internal.F.p(device, "device");
        }

        @Override // com.harman.sdk.impl.connect.D
        public void b(@l3.d HmDevice device, int i4, @l3.e String str) {
            kotlin.jvm.internal.F.p(device, "device");
            com.harman.log.f.a(i.f47953i, "onConnectChanged : onStatusChanged[" + device.n() + "] status[" + i4 + "] msg[" + str + "]");
            for (InterfaceC2445a.InterfaceC0551a interfaceC0551a : i.this.f47957c.a()) {
                if (interfaceC0551a != null) {
                    interfaceC0551a.a(device, i4, device.F());
                }
            }
        }

        @Override // com.harman.sdk.impl.connect.D
        public void c(@l3.d HmDevice device) {
            kotlin.jvm.internal.F.p(device, "device");
            com.harman.log.f.a(i.f47953i, "onStandbyDeviceBLEConnected : " + device.n());
            for (InterfaceC2445a.InterfaceC0551a interfaceC0551a : i.this.f47957c.a()) {
                if (interfaceC0551a != null) {
                    interfaceC0551a.c(device);
                }
            }
        }

        @Override // com.harman.sdk.impl.connect.D
        public void d(@l3.d final HmDevice device, @l3.e com.harman.sdk.a aVar, @l3.e com.harman.sdk.a aVar2, @l3.e BaseMessage baseMessage) {
            MessageID messageID;
            StatusCode statusCode;
            kotlin.jvm.internal.F.p(device, "device");
            final z2.d dVar = null;
            if (baseMessage != null) {
                messageID = baseMessage.b();
            } else {
                messageID = null;
            }
            com.harman.log.f.a(i.f47953i, "BLE_LOG onCharacteristicChanged: msgID: " + messageID);
            if (aVar != null) {
                String h4 = com.harman.sdk.utils.g.h(aVar.b(), true);
                device.I0(h4);
                com.harman.log.f.a(i.f47953i, "BLE_LOG onCharacteristicChanged: content: " + h4);
            }
            if (aVar2 == null) {
                for (z2.d dVar2 : i.this.f47958d.a()) {
                    if (baseMessage != null) {
                        dVar2.b(device, StatusCode.STATUS_SUCCESS, baseMessage);
                    }
                }
                return;
            }
            if (!aVar2.c()) {
                Object r4 = aVar2.r(i.f47954j);
                final com.harman.sdk.a next = aVar2.next();
                if (next != null) {
                    final i iVar = i.this;
                    if (r4 instanceof z2.d) {
                        dVar = (z2.d) r4;
                    }
                    Handler handler = iVar.f47959e;
                    if (handler != null) {
                        handler.post(new Runnable() { // from class: com.harman.sdk.impl.connect.j
                            @Override // java.lang.Runnable
                            public final void run() {
                                i.c.i(i.this, device, next, dVar);
                            }
                        });
                    }
                }
                if (aVar == null || (statusCode = StatusCode.STATUS_SUCCESS) == null) {
                    statusCode = StatusCode.STATUS_TIMEOUT;
                }
                if (baseMessage != null) {
                    i iVar2 = i.this;
                    Object r5 = aVar2.r(i.f47954j);
                    if (r5 instanceof z2.d) {
                        if (aVar2.d()) {
                            ((z2.d) r5).b(device, statusCode, baseMessage);
                        } else {
                            ((z2.d) r5).a(device, statusCode, baseMessage);
                        }
                    }
                    if (aVar2.d()) {
                        Iterator it = iVar2.f47958d.a().iterator();
                        while (it.hasNext()) {
                            ((z2.d) it.next()).b(device, statusCode, baseMessage);
                        }
                    } else {
                        Iterator it2 = iVar2.f47958d.a().iterator();
                        while (it2.hasNext()) {
                            ((z2.d) it2.next()).a(device, statusCode, baseMessage);
                        }
                    }
                }
            }
        }

        @Override // com.harman.sdk.impl.connect.D
        public void e(@l3.d HmDevice device) {
            kotlin.jvm.internal.F.p(device, "device");
            com.harman.log.f.a(i.f47953i, "onRequestDevInfo: " + device.n());
            for (InterfaceC2445a.InterfaceC0551a interfaceC0551a : i.this.f47957c.a()) {
                if (interfaceC0551a != null) {
                    interfaceC0551a.b(device);
                }
            }
        }

        @Override // com.harman.sdk.impl.connect.D
        public void f(@l3.d HmDevice device, @l3.e String str) {
            kotlin.jvm.internal.F.p(device, "device");
        }

        @Override // com.harman.sdk.impl.connect.D
        public void g(@l3.d HmDevice device, @l3.e com.harman.sdk.a aVar, @l3.e String str, int i4) {
            Object obj;
            kotlin.jvm.internal.F.p(device, "device");
            if (i4 == 257) {
                z2.d dVar = null;
                if (aVar != null) {
                    obj = aVar.r(i.f47954j);
                } else {
                    obj = null;
                }
                if (obj instanceof z2.d) {
                    dVar = (z2.d) obj;
                }
                if (dVar != null) {
                    i iVar = i.this;
                    if (aVar.d()) {
                        dVar.b(device, StatusCode.STATUS_FAIL, new BaseMessage());
                        Iterator it = iVar.f47958d.a().iterator();
                        while (it.hasNext()) {
                            ((z2.d) it.next()).b(device, StatusCode.STATUS_FAIL, new BaseMessage());
                        }
                        return;
                    }
                    dVar.a(device, StatusCode.STATUS_FAIL, new BaseMessage());
                    Iterator it2 = iVar.f47958d.a().iterator();
                    while (it2.hasNext()) {
                        ((z2.d) it2.next()).a(device, StatusCode.STATUS_FAIL, new BaseMessage());
                    }
                }
            }
        }
    }

    @U({"SMAP\nDeviceConnectImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceConnectImpl.kt\ncom/harman/sdk/impl/connect/DeviceConnectImpl$sppObserver$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,373:1\n1#2:374\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class d implements H {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(i this$0, HmDevice device, com.harman.sdk.a command, z2.d dVar) {
            kotlin.jvm.internal.F.p(this$0, "this$0");
            kotlin.jvm.internal.F.p(device, "$device");
            kotlin.jvm.internal.F.p(command, "$command");
            this$0.G(device, command, dVar);
        }

        @Override // com.harman.sdk.impl.connect.H
        public void a(@l3.e HmDevice hmDevice, int i4) {
        }

        @Override // com.harman.sdk.impl.connect.H
        public void b(@l3.e HmDevice hmDevice, int i4, @l3.e String str) {
            for (InterfaceC2445a.InterfaceC0551a interfaceC0551a : i.this.f47957c.a()) {
                if (interfaceC0551a != null) {
                    interfaceC0551a.a(hmDevice, i4, DeviceProtocol.PROTOCOL_SPP);
                }
            }
        }

        @Override // com.harman.sdk.impl.connect.H
        public void c(@l3.e HmDevice hmDevice, @l3.e String str, int i4) {
        }

        @Override // com.harman.sdk.impl.connect.H
        public void d(@l3.d final HmDevice device, @l3.e com.harman.sdk.a aVar, @l3.e com.harman.sdk.a aVar2, @l3.e BaseMessage baseMessage) {
            StatusCode statusCode;
            final z2.d dVar;
            kotlin.jvm.internal.F.p(device, "device");
            if (aVar != null) {
                String h4 = com.harman.sdk.utils.g.h(aVar.b(), true);
                device.I0(h4);
                com.harman.log.f.a(i.f47953i, "onCharacteristicChanged: content: " + h4);
            }
            if (aVar2 == null) {
                for (z2.d dVar2 : i.this.f47958d.a()) {
                    if (baseMessage != null) {
                        dVar2.b(device, StatusCode.STATUS_SUCCESS, baseMessage);
                    }
                }
                return;
            }
            if (!aVar2.c()) {
                Object r4 = aVar2.r(i.f47954j);
                final com.harman.sdk.a next = aVar2.next();
                if (next != null) {
                    final i iVar = i.this;
                    if (r4 instanceof z2.d) {
                        dVar = (z2.d) r4;
                    } else {
                        dVar = null;
                    }
                    Handler handler = iVar.f47959e;
                    if (handler != null) {
                        handler.post(new Runnable() { // from class: com.harman.sdk.impl.connect.k
                            @Override // java.lang.Runnable
                            public final void run() {
                                i.d.f(i.this, device, next, dVar);
                            }
                        });
                    }
                }
                if (aVar == null || (statusCode = StatusCode.STATUS_SUCCESS) == null) {
                    statusCode = StatusCode.STATUS_TIMEOUT;
                }
                if (baseMessage != null) {
                    i iVar2 = i.this;
                    Object r5 = aVar2.r(i.f47954j);
                    if (r5 instanceof z2.d) {
                        if (aVar2.d()) {
                            ((z2.d) r5).b(device, statusCode, baseMessage);
                        } else {
                            ((z2.d) r5).a(device, statusCode, baseMessage);
                        }
                    }
                    if (aVar2.d()) {
                        Iterator it = iVar2.f47958d.a().iterator();
                        while (it.hasNext()) {
                            ((z2.d) it.next()).b(device, statusCode, baseMessage);
                        }
                    } else {
                        Iterator it2 = iVar2.f47958d.a().iterator();
                        while (it2.hasNext()) {
                            ((z2.d) it2.next()).a(device, statusCode, baseMessage);
                        }
                    }
                }
            }
        }
    }

    public i(@l3.d Context context) {
        Handler handler;
        kotlin.jvm.internal.F.p(context, "context");
        C c4 = new C(context);
        this.f47955a = c4;
        G g4 = new G();
        this.f47956b = g4;
        this.f47957c = new com.harman.sdk.concurrent.c<>();
        this.f47958d = new com.harman.sdk.concurrent.c<>();
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            handler = new Handler(myLooper);
        } else {
            handler = null;
        }
        this.f47959e = handler;
        c cVar = new c();
        this.f47960f = cVar;
        d dVar = new d();
        this.f47961g = dVar;
        c4.g(cVar);
        g4.h(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(HmDevice device) {
        kotlin.jvm.internal.F.p(device, "$device");
        z2.e e4 = com.harman.sdk.b.f47608a.e(device);
        if (e4 != null) {
            e4.h0(device, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(HmDevice device) {
        kotlin.jvm.internal.F.p(device, "$device");
        z2.e e4 = com.harman.sdk.b.f47608a.e(device);
        if (e4 != null) {
            e4.a0(device, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(HmDevice device) {
        kotlin.jvm.internal.F.p(device, "$device");
        z2.b a4 = com.harman.sdk.b.f47608a.a(device);
        if (a4 != null) {
            a4.d0(device, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(HmDevice device) {
        kotlin.jvm.internal.F.p(device, "$device");
        z2.i h4 = com.harman.sdk.b.f47608a.h(device);
        if (h4 != null) {
            h4.a(device, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(HmDevice device) {
        kotlin.jvm.internal.F.p(device, "$device");
        z2.l j4 = com.harman.sdk.b.f47608a.j(device);
        if (j4 != null) {
            j4.i0(device, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(HmDevice device) {
        kotlin.jvm.internal.F.p(device, "$device");
        z2.j i4 = com.harman.sdk.b.f47608a.i(device);
        if (i4 != null) {
            i4.E(device, null);
        }
    }

    public final void G(@l3.d HmDevice device, @l3.d com.harman.sdk.a command, @l3.e z2.d dVar) {
        kotlin.jvm.internal.F.p(device, "device");
        kotlin.jvm.internal.F.p(command, "command");
        if (dVar != null) {
            command.i(f47954j, dVar);
        }
        AbstractC2035b v3 = v(device.F());
        if (v3 != null) {
            v3.j(device, command);
        }
    }

    public final void H(@l3.d z2.d globalListener) {
        kotlin.jvm.internal.F.p(globalListener, "globalListener");
        this.f47958d.remove(globalListener);
    }

    @Override // y2.InterfaceC2445a
    public void a(@l3.d HmDevice device, @l3.d String newBLEAddress) {
        kotlin.jvm.internal.F.p(device, "device");
        kotlin.jvm.internal.F.p(newBLEAddress, "newBLEAddress");
        this.f47955a.z0(device, newBLEAddress);
    }

    @Override // y2.InterfaceC2445a
    @l3.d
    public List<DeviceProtocol> b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DeviceProtocol.PROTOCOL_BLE);
        arrayList.add(DeviceProtocol.PROTOCOL_GATT_BR_EDR);
        arrayList.add(DeviceProtocol.PROTOCOL_SPP);
        return arrayList;
    }

    @Override // y2.InterfaceC2445a
    public void c(@l3.e InterfaceC2445a.InterfaceC0551a interfaceC0551a) {
        this.f47957c.add(interfaceC0551a);
    }

    @Override // y2.InterfaceC2445a
    public void d(@l3.e InterfaceC2445a.InterfaceC0551a interfaceC0551a) {
        this.f47957c.remove(interfaceC0551a);
    }

    @Override // y2.InterfaceC2445a
    public void e(boolean z3) {
        this.f47955a.N0(z3);
    }

    @Override // y2.InterfaceC2445a
    public void f(@l3.d HmDevice device) {
        kotlin.jvm.internal.F.p(device, "device");
        this.f47955a.i(device);
        z(device);
    }

    @Override // y2.InterfaceC2445a
    public boolean g() {
        return this.f47955a.v0();
    }

    @Override // y2.InterfaceC2445a
    public void h(@l3.d String deviceAddress, @l3.d String secondaryAddress) {
        kotlin.jvm.internal.F.p(deviceAddress, "deviceAddress");
        kotlin.jvm.internal.F.p(secondaryAddress, "secondaryAddress");
        this.f47955a.M0(deviceAddress, secondaryAddress);
    }

    @Override // y2.InterfaceC2445a
    public boolean i(@l3.d DeviceProtocol deviceProtocol) {
        kotlin.jvm.internal.F.p(deviceProtocol, "deviceProtocol");
        int i4 = b.f47962a[deviceProtocol.ordinal()];
        if (i4 == 1 || i4 == 2 || i4 == 3) {
            return true;
        }
        return false;
    }

    @Override // y2.InterfaceC2445a
    public void j(@l3.d HmDevice device) {
        kotlin.jvm.internal.F.p(device, "device");
        if (device.F() != DeviceProtocol.PROTOCOL_BLE && device.F() != DeviceProtocol.PROTOCOL_GATT_BR_EDR) {
            if (device.F() == DeviceProtocol.PROTOCOL_SPP) {
                this.f47956b.c(device);
                return;
            }
            return;
        }
        this.f47955a.c(device);
    }

    @Override // y2.InterfaceC2445a
    public void k(@l3.d HmDevice device) {
        kotlin.jvm.internal.F.p(device, "device");
        if (device.F() != DeviceProtocol.PROTOCOL_BLE && device.F() != DeviceProtocol.PROTOCOL_GATT_BR_EDR) {
            if (device.F() == DeviceProtocol.PROTOCOL_SPP) {
                this.f47956b.d(device);
                return;
            }
            return;
        }
        this.f47955a.d(device);
    }

    @l3.e
    public final AbstractC2035b v(@l3.d DeviceProtocol protocol) {
        kotlin.jvm.internal.F.p(protocol, "protocol");
        if (protocol != DeviceProtocol.PROTOCOL_BLE && protocol != DeviceProtocol.PROTOCOL_GATT_BR_EDR) {
            if (protocol == DeviceProtocol.PROTOCOL_SPP) {
                return this.f47956b;
            }
            return null;
        }
        return this.f47955a;
    }

    @l3.d
    public final List<HmDevice> w() {
        return this.f47955a.u0();
    }

    @l3.d
    public final C x() {
        return this.f47955a;
    }

    public final void y(@l3.d z2.d globalListener) {
        kotlin.jvm.internal.F.p(globalListener, "globalListener");
        if (!this.f47958d.contains(globalListener)) {
            this.f47958d.add(globalListener);
        }
    }

    public final void z(@l3.d final HmDevice device) {
        Handler handler;
        kotlin.jvm.internal.F.p(device, "device");
        com.harman.log.f.a(f47953i, "requestStatusCommands");
        Handler handler2 = this.f47959e;
        if (handler2 != null) {
            handler2.postDelayed(new Runnable() { // from class: com.harman.sdk.impl.connect.c
                @Override // java.lang.Runnable
                public final void run() {
                    i.A(HmDevice.this);
                }
            }, 1000L);
        }
        Handler handler3 = this.f47959e;
        if (handler3 != null) {
            handler3.postDelayed(new Runnable() { // from class: com.harman.sdk.impl.connect.d
                @Override // java.lang.Runnable
                public final void run() {
                    i.B(HmDevice.this);
                }
            }, 1500L);
        }
        Handler handler4 = this.f47959e;
        if (handler4 != null) {
            handler4.postDelayed(new Runnable() { // from class: com.harman.sdk.impl.connect.e
                @Override // java.lang.Runnable
                public final void run() {
                    i.C(HmDevice.this);
                }
            }, 2300L);
        }
        Handler handler5 = this.f47959e;
        if (handler5 != null) {
            handler5.postDelayed(new Runnable() { // from class: com.harman.sdk.impl.connect.f
                @Override // java.lang.Runnable
                public final void run() {
                    i.D(HmDevice.this);
                }
            }, 2800L);
        }
        Handler handler6 = this.f47959e;
        if (handler6 != null) {
            handler6.postDelayed(new Runnable() { // from class: com.harman.sdk.impl.connect.g
                @Override // java.lang.Runnable
                public final void run() {
                    i.E(HmDevice.this);
                }
            }, 3300L);
        }
        if (com.harman.sdk.utils.d.u0(device.q()) && (handler = this.f47959e) != null) {
            handler.postDelayed(new Runnable() { // from class: com.harman.sdk.impl.connect.h
                @Override // java.lang.Runnable
                public final void run() {
                    i.F(HmDevice.this);
                }
            }, 3800L);
        }
    }
}
