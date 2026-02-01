package com.harman.sdk.impl.connect;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.harman.sdk.command.BaseCommand;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.MessageID;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.H0;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.U;

@U({"SMAP\nSppControllerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SppControllerImpl.kt\ncom/harman/sdk/impl/connect/SppControllerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,379:1\n1#2:380\n37#3,2:381\n*S KotlinDebug\n*F\n+ 1 SppControllerImpl.kt\ncom/harman/sdk/impl/connect/SppControllerImpl\n*L\n323#1:381,2\n*E\n"})
/* loaded from: classes2.dex */
public final class G extends AbstractC2035b {

    /* renamed from: l, reason: collision with root package name */
    @l3.d
    public static final a f47929l = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @l3.d
    private static final String f47930m = "SppControllerImpl";

    /* renamed from: f, reason: collision with root package name */
    @l3.e
    private b f47936f;

    /* renamed from: j, reason: collision with root package name */
    @l3.e
    private final Handler f47940j;

    /* renamed from: k, reason: collision with root package name */
    @l3.d
    private final Runnable f47941k;

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final com.harman.sdk.concurrent.d<H> f47931a = new com.harman.sdk.concurrent.c();

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final AtomicBoolean f47932b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final Map<String, BluetoothSocket> f47933c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final Map<String, InputStream> f47934d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final Map<String, OutputStream> f47935e = new ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    @l3.d
    private final LinkedList<C2034a> f47937g = new LinkedList<>();

    /* renamed from: h, reason: collision with root package name */
    @l3.d
    private final LinkedList<C2034a> f47938h = new LinkedList<>();

    /* renamed from: i, reason: collision with root package name */
    @l3.d
    private final com.harman.sdk.command.a f47939i = new com.harman.sdk.command.a();

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public final class b extends Thread {

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final HmDevice f47942E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ G f47943F;

        public b(@l3.d G g4, HmDevice readingDevice) {
            kotlin.jvm.internal.F.p(readingDevice, "readingDevice");
            this.f47943F = g4;
            this.f47942E = readingDevice;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            InputStream inputStream;
            super.run();
            while (!Thread.interrupted() && (inputStream = (InputStream) this.f47943F.f47934d.get(this.f47942E.n())) != null) {
                byte[] bArr = new byte[1024];
                try {
                    int read = inputStream.read(bArr);
                    byte[] bArr2 = new byte[read];
                    System.arraycopy(bArr, 0, bArr2, 0, read);
                    this.f47943F.z(this.f47942E, bArr2);
                } catch (IOException unused) {
                    this.f47943F.d(this.f47942E);
                }
            }
            this.f47943F.f47932b.set(false);
        }
    }

    public G() {
        Handler handler;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            handler = new Handler(myLooper);
        } else {
            handler = null;
        }
        this.f47940j = handler;
        this.f47941k = new Runnable() { // from class: com.harman.sdk.impl.connect.E
            @Override // java.lang.Runnable
            public final void run() {
                G.B(G.this);
            }
        };
    }

    private final void A(HmDevice hmDevice, com.harman.sdk.a aVar) {
        synchronized (this.f47938h) {
            try {
                C2034a c2034a = new C2034a(hmDevice, aVar);
                if (!this.f47937g.contains(c2034a)) {
                    this.f47937g.add(c2034a);
                }
                H0 h02 = H0.f51801a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(G this$0) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        synchronized (this$0.f47938h) {
            try {
                Iterator<C2034a> it = this$0.f47938h.iterator();
                while (it.hasNext()) {
                    C2034a next = it.next();
                    Iterator<H> it2 = this$0.f47931a.a().iterator();
                    while (it2.hasNext()) {
                        it2.next().d(next.b(), null, next.a(), new BaseMessage());
                    }
                }
                this$0.f47938h.clear();
                this$0.r();
                H0 h02 = H0.f51801a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void r() {
        C2034a w3 = w();
        if (w3 != null) {
            t(w3.b(), w3);
        }
    }

    private final void s(HmDevice hmDevice, byte[] bArr) {
        com.harman.sdk.a aVar;
        BaseMessage f4;
        if (bArr == null) {
            return;
        }
        BaseCommand baseCommand = new BaseCommand(bArr);
        synchronized (this.f47938h) {
            try {
                aVar = null;
                if (!this.f47938h.isEmpty()) {
                    com.harman.sdk.a a4 = this.f47938h.getFirst().a();
                    if (a4 != null) {
                        f4 = a4.q(hmDevice, baseCommand);
                    } else {
                        f4 = null;
                    }
                    if (f4 != null && f4.b() != MessageID.UNKNOWN && a4 != null && a4.f()) {
                        Handler handler = this.f47940j;
                        if (handler != null) {
                            handler.removeCallbacks(this.f47941k);
                        }
                        kotlin.collections.A.M0(this.f47938h);
                        r();
                    } else {
                        if (f4 != null) {
                            if (f4.b() == MessageID.UNKNOWN) {
                            }
                        }
                        f4 = this.f47939i.f(hmDevice, baseCommand, null);
                    }
                    aVar = a4;
                } else {
                    f4 = this.f47939i.f(hmDevice, baseCommand, null);
                }
                H0 h02 = H0.f51801a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator<H> it = this.f47931a.a().iterator();
        while (it.hasNext()) {
            it.next().d(hmDevice, baseCommand, aVar, f4);
        }
    }

    private final boolean t(HmDevice hmDevice, C2034a c2034a) {
        OutputStream outputStream = this.f47935e.get(hmDevice.n());
        if (outputStream == null) {
            return false;
        }
        String a4 = c2034a.a().a();
        try {
            com.harman.log.f.d(f47930m, "------send to device command status------->spp command = " + a4);
            outputStream.write(c2034a.a().b());
            outputStream.flush();
            synchronized (this.f47938h) {
                try {
                    Handler handler = this.f47940j;
                    if (handler != null) {
                        handler.removeCallbacks(this.f47941k);
                    }
                    if (this.f47938h.get(0).a().f()) {
                        Handler handler2 = this.f47940j;
                        if (handler2 != null) {
                            handler2.postDelayed(this.f47941k, 50L);
                        }
                    } else {
                        Handler handler3 = this.f47940j;
                        if (handler3 != null) {
                            handler3.postDelayed(this.f47941k, com.harman.sdk.utils.d.j().d());
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        } catch (Exception unused) {
            com.harman.log.f.d(f47930m, " sendCmd: os write Exception");
            u(hmDevice, a4);
            return false;
        }
    }

    private final void u(HmDevice hmDevice, String str) {
        com.harman.sdk.a a4;
        synchronized (this.f47938h) {
            a4 = this.f47938h.getFirst().a();
            this.f47938h.clear();
            H0 h02 = H0.f51801a;
        }
        com.harman.log.f.g(f47930m, hmDevice.n() + ", send command failed: " + str);
        Iterator<H> it = this.f47931a.a().iterator();
        while (it.hasNext()) {
            it.next().d(hmDevice, null, a4, new BaseMessage());
        }
        com.harman.sdk.concurrent.a.a().execute(new Runnable() { // from class: com.harman.sdk.impl.connect.F
            @Override // java.lang.Runnable
            public final void run() {
                G.v(G.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(G this$0) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        this$0.r();
    }

    private final C2034a w() {
        synchronized (this.f47938h) {
            boolean isEmpty = this.f47938h.isEmpty();
            boolean isEmpty2 = this.f47937g.isEmpty();
            if (isEmpty && !isEmpty2) {
                C2034a first = this.f47937g.getFirst();
                if (!TextUtils.isEmpty(first.b().j())) {
                    kotlin.collections.A.M0(this.f47937g);
                    this.f47938h.add(first);
                    return first;
                }
            }
            H0 h02 = H0.f51801a;
            return null;
        }
    }

    private final void x(HmDevice hmDevice, int i4, String str) {
        Iterator<H> it = this.f47931a.a().iterator();
        while (it.hasNext()) {
            it.next().b(hmDevice, i4, str);
        }
    }

    private final void y(HmDevice hmDevice) {
        hmDevice.g0(false);
        x(hmDevice, 0, "Connect Failed");
        this.f47932b.set(false);
        this.f47933c.remove(hmDevice.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(HmDevice hmDevice, byte[] bArr) {
        boolean s22;
        List R4;
        if (bArr == null) {
            return;
        }
        String h4 = com.harman.sdk.utils.g.h(bArr, true);
        String h5 = com.harman.sdk.utils.g.h(bArr, true);
        kotlin.jvm.internal.F.m(h5);
        s22 = kotlin.text.z.s2(h5, "aa", false, 2, null);
        if (!s22) {
            return;
        }
        kotlin.jvm.internal.F.m(h4);
        R4 = kotlin.text.A.R4(h4, new String[]{"aa"}, false, 0, 6, null);
        for (String str : (String[]) R4.toArray(new String[0])) {
            if (!TextUtils.isEmpty(str)) {
                char[] charArray = ("aa" + str).toCharArray();
                kotlin.jvm.internal.F.o(charArray, "toCharArray(...)");
                s(hmDevice, com.harman.sdk.utils.g.f(charArray));
            }
        }
    }

    @Override // com.harman.sdk.impl.connect.AbstractC2035b
    public void c(@l3.d HmDevice device) {
        BluetoothDevice remoteDevice;
        kotlin.jvm.internal.F.p(device, "device");
        if (this.f47932b.getAndSet(true)) {
            Iterator<H> it = this.f47931a.a().iterator();
            while (it.hasNext()) {
                it.next().b(device, 1, "Device is connecting");
            }
            return;
        }
        if (device.R()) {
            return;
        }
        BluetoothSocket bluetoothSocket = this.f47933c.get(device.n());
        if (bluetoothSocket == null) {
            x(device, 1, "");
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null && (remoteDevice = defaultAdapter.getRemoteDevice(device.n())) != null) {
                try {
                    bluetoothSocket = remoteDevice.createRfcommSocketToServiceRecord(UUID.fromString(com.harman.sdk.utils.d.j().s()));
                } catch (IOException unused) {
                }
            }
        }
        if (bluetoothSocket != null) {
            try {
                if (!bluetoothSocket.isConnected()) {
                    bluetoothSocket.connect();
                    String n4 = device.n();
                    if (n4 != null) {
                        this.f47933c.put(n4, bluetoothSocket);
                        InputStream inputStream = bluetoothSocket.getInputStream();
                        OutputStream outputStream = bluetoothSocket.getOutputStream();
                        Map<String, InputStream> map = this.f47934d;
                        kotlin.jvm.internal.F.m(inputStream);
                        map.put(n4, inputStream);
                        Map<String, OutputStream> map2 = this.f47935e;
                        kotlin.jvm.internal.F.m(outputStream);
                        map2.put(n4, outputStream);
                    }
                }
                try {
                    b bVar = this.f47936f;
                    if (bVar != null) {
                        bVar.interrupt();
                    }
                } catch (Exception unused2) {
                }
                b bVar2 = new b(this, device);
                this.f47936f = bVar2;
                bVar2.start();
                device.g0(true);
                x(device, 2, "");
            } catch (IOException unused3) {
                y(device);
            }
        } else {
            y(device);
        }
        this.f47932b.set(false);
    }

    @Override // com.harman.sdk.impl.connect.AbstractC2035b
    public void d(@l3.d HmDevice device) {
        kotlin.jvm.internal.F.p(device, "device");
        try {
            b bVar = this.f47936f;
            if (bVar != null) {
                bVar.interrupt();
            }
        } catch (Exception unused) {
        }
        InputStream remove = this.f47934d.remove(device.n());
        if (remove != null) {
            try {
                remove.close();
            } catch (IOException unused2) {
            }
        }
        OutputStream remove2 = this.f47935e.remove(device.n());
        if (remove2 != null) {
            try {
                remove2.close();
            } catch (IOException unused3) {
            }
        }
        BluetoothSocket remove3 = this.f47933c.remove(device.n());
        if (remove3 != null) {
            try {
                remove3.close();
            } catch (IOException unused4) {
            }
            device.g0(false);
            x(device, 0, "");
        }
        this.f47932b.getAndSet(false);
    }

    @Override // com.harman.sdk.impl.connect.AbstractC2035b
    public void h(@l3.d H observer) {
        kotlin.jvm.internal.F.p(observer, "observer");
        this.f47931a.add(observer);
    }

    @Override // com.harman.sdk.impl.connect.AbstractC2035b
    public boolean j(@l3.d HmDevice device, @l3.d com.harman.sdk.a command) {
        kotlin.jvm.internal.F.p(device, "device");
        kotlin.jvm.internal.F.p(command, "command");
        A(device, command);
        C2034a w3 = w();
        if (w3 != null) {
            return t(device, w3);
        }
        com.harman.log.f.g(f47930m, "Command cached : " + command);
        return false;
    }

    @Override // com.harman.sdk.impl.connect.AbstractC2035b
    public void l(@l3.d H observer) {
        kotlin.jvm.internal.F.p(observer, "observer");
        this.f47931a.remove(observer);
    }
}
