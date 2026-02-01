package com.clj.fastble.bluetooth;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.clj.fastble.exception.ConnectException;
import com.clj.fastble.exception.OtherException;
import com.clj.fastble.exception.TimeoutException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import v0.e;
import v0.f;
import v0.g;
import v0.k;

@TargetApi(18)
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private v0.b f27004a;

    /* renamed from: b, reason: collision with root package name */
    private g f27005b;

    /* renamed from: c, reason: collision with root package name */
    private v0.d f27006c;

    /* renamed from: h, reason: collision with root package name */
    private b f27011h;

    /* renamed from: j, reason: collision with root package name */
    private final com.clj.fastble.data.b f27013j;

    /* renamed from: k, reason: collision with root package name */
    private BluetoothGatt f27014k;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<String, e> f27007d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<String, v0.c> f27008e = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashMap<String, k> f27009f = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, f> f27010g = new HashMap<>();

    /* renamed from: i, reason: collision with root package name */
    private boolean f27012i = false;

    /* renamed from: l, reason: collision with root package name */
    private final c f27015l = new c(Looper.getMainLooper());

    /* renamed from: m, reason: collision with root package name */
    private int f27016m = 0;

    /* renamed from: n, reason: collision with root package name */
    private BluetoothGattCallback f27017n = new C0246a();

    /* renamed from: com.clj.fastble.bluetooth.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0246a extends BluetoothGattCallback {
        C0246a() {
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            Handler a4;
            Handler a5;
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            Iterator it = a.this.f27007d.entrySet().iterator();
            while (it.hasNext()) {
                Object value = ((Map.Entry) it.next()).getValue();
                if (value instanceof e) {
                    e eVar = (e) value;
                    if (bluetoothGattCharacteristic.getUuid().toString().equalsIgnoreCase(eVar.b()) && (a5 = eVar.a()) != null) {
                        Message obtainMessage = a5.obtainMessage();
                        obtainMessage.what = 19;
                        obtainMessage.obj = eVar;
                        Bundle bundle = new Bundle();
                        bundle.putByteArray(com.clj.fastble.data.c.f27071m, bluetoothGattCharacteristic.getValue());
                        obtainMessage.setData(bundle);
                        a5.sendMessage(obtainMessage);
                    }
                }
            }
            Iterator it2 = a.this.f27008e.entrySet().iterator();
            while (it2.hasNext()) {
                Object value2 = ((Map.Entry) it2.next()).getValue();
                if (value2 instanceof v0.c) {
                    v0.c cVar = (v0.c) value2;
                    if (bluetoothGattCharacteristic.getUuid().toString().equalsIgnoreCase(cVar.b()) && (a4 = cVar.a()) != null) {
                        Message obtainMessage2 = a4.obtainMessage();
                        obtainMessage2.what = 35;
                        obtainMessage2.obj = cVar;
                        Bundle bundle2 = new Bundle();
                        bundle2.putByteArray(com.clj.fastble.data.c.f27076r, bluetoothGattCharacteristic.getValue());
                        obtainMessage2.setData(bundle2);
                        a4.sendMessage(obtainMessage2);
                    }
                }
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i4) {
            Handler a4;
            super.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i4);
            Iterator it = a.this.f27010g.entrySet().iterator();
            while (it.hasNext()) {
                Object value = ((Map.Entry) it.next()).getValue();
                if (value instanceof f) {
                    f fVar = (f) value;
                    if (bluetoothGattCharacteristic.getUuid().toString().equalsIgnoreCase(fVar.b()) && (a4 = fVar.a()) != null) {
                        Message obtainMessage = a4.obtainMessage();
                        obtainMessage.what = 66;
                        obtainMessage.obj = fVar;
                        Bundle bundle = new Bundle();
                        bundle.putInt(com.clj.fastble.data.c.f27084z, i4);
                        bundle.putByteArray(com.clj.fastble.data.c.f27050A, bluetoothGattCharacteristic.getValue());
                        obtainMessage.setData(bundle);
                        a4.sendMessage(obtainMessage);
                    }
                }
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i4) {
            Handler a4;
            super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i4);
            Iterator it = a.this.f27009f.entrySet().iterator();
            while (it.hasNext()) {
                Object value = ((Map.Entry) it.next()).getValue();
                if (value instanceof k) {
                    k kVar = (k) value;
                    if (bluetoothGattCharacteristic.getUuid().toString().equalsIgnoreCase(kVar.b()) && (a4 = kVar.a()) != null) {
                        Message obtainMessage = a4.obtainMessage();
                        obtainMessage.what = 50;
                        obtainMessage.obj = kVar;
                        Bundle bundle = new Bundle();
                        bundle.putInt(com.clj.fastble.data.c.f27080v, i4);
                        bundle.putByteArray(com.clj.fastble.data.c.f27081w, bluetoothGattCharacteristic.getValue());
                        obtainMessage.setData(bundle);
                        a4.sendMessage(obtainMessage);
                    }
                }
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i4, int i5) {
            super.onConnectionStateChange(bluetoothGatt, i4, i5);
            com.clj.fastble.utils.a.c("BluetoothGattCallback：onConnectionStateChange \nstatus: " + i4 + "\nnewState: " + i5 + "\ncurrentThread: " + Thread.currentThread().getId());
            a.this.f27014k = bluetoothGatt;
            a.this.f27015l.removeMessages(7);
            if (i5 == 2) {
                Message obtainMessage = a.this.f27015l.obtainMessage();
                obtainMessage.what = 4;
                a.this.f27015l.sendMessageDelayed(obtainMessage, 500L);
                return;
            }
            if (i5 == 0) {
                if (a.this.f27011h == b.CONNECT_CONNECTING) {
                    Message obtainMessage2 = a.this.f27015l.obtainMessage();
                    obtainMessage2.what = 1;
                    obtainMessage2.obj = new com.clj.fastble.data.a(i4);
                    a.this.f27015l.sendMessage(obtainMessage2);
                    return;
                }
                if (a.this.f27011h == b.CONNECT_CONNECTED) {
                    Message obtainMessage3 = a.this.f27015l.obtainMessage();
                    obtainMessage3.what = 2;
                    com.clj.fastble.data.a aVar = new com.clj.fastble.data.a(i4);
                    aVar.c(a.this.f27012i);
                    obtainMessage3.obj = aVar;
                    a.this.f27015l.sendMessage(obtainMessage3);
                }
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i4) {
            Handler a4;
            Handler a5;
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i4);
            Iterator it = a.this.f27007d.entrySet().iterator();
            while (it.hasNext()) {
                Object value = ((Map.Entry) it.next()).getValue();
                if (value instanceof e) {
                    e eVar = (e) value;
                    if (bluetoothGattDescriptor.getCharacteristic().getUuid().toString().equalsIgnoreCase(eVar.b()) && (a5 = eVar.a()) != null) {
                        Message obtainMessage = a5.obtainMessage();
                        obtainMessage.what = 18;
                        obtainMessage.obj = eVar;
                        Bundle bundle = new Bundle();
                        bundle.putInt(com.clj.fastble.data.c.f27070l, i4);
                        obtainMessage.setData(bundle);
                        a5.sendMessage(obtainMessage);
                    }
                }
            }
            Iterator it2 = a.this.f27008e.entrySet().iterator();
            while (it2.hasNext()) {
                Object value2 = ((Map.Entry) it2.next()).getValue();
                if (value2 instanceof v0.c) {
                    v0.c cVar = (v0.c) value2;
                    if (bluetoothGattDescriptor.getCharacteristic().getUuid().toString().equalsIgnoreCase(cVar.b()) && (a4 = cVar.a()) != null) {
                        Message obtainMessage2 = a4.obtainMessage();
                        obtainMessage2.what = 34;
                        obtainMessage2.obj = cVar;
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt(com.clj.fastble.data.c.f27075q, i4);
                        obtainMessage2.setData(bundle2);
                        a4.sendMessage(obtainMessage2);
                    }
                }
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i4, int i5) {
            Handler a4;
            super.onMtuChanged(bluetoothGatt, i4, i5);
            if (a.this.f27006c != null && (a4 = a.this.f27006c.a()) != null) {
                Message obtainMessage = a4.obtainMessage();
                obtainMessage.what = 98;
                obtainMessage.obj = a.this.f27006c;
                Bundle bundle = new Bundle();
                bundle.putInt(com.clj.fastble.data.c.f27057H, i5);
                bundle.putInt(com.clj.fastble.data.c.f27058I, i4);
                obtainMessage.setData(bundle);
                a4.sendMessage(obtainMessage);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i4, int i5) {
            Handler a4;
            super.onReadRemoteRssi(bluetoothGatt, i4, i5);
            if (a.this.f27005b != null && (a4 = a.this.f27005b.a()) != null) {
                Message obtainMessage = a4.obtainMessage();
                obtainMessage.what = 82;
                obtainMessage.obj = a.this.f27005b;
                Bundle bundle = new Bundle();
                bundle.putInt(com.clj.fastble.data.c.f27053D, i5);
                bundle.putInt(com.clj.fastble.data.c.f27054E, i4);
                obtainMessage.setData(bundle);
                a4.sendMessage(obtainMessage);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i4) {
            super.onServicesDiscovered(bluetoothGatt, i4);
            com.clj.fastble.utils.a.c("BluetoothGattCallback：onServicesDiscovered \nstatus: " + i4 + "\ncurrentThread: " + Thread.currentThread().getId());
            a.this.f27014k = bluetoothGatt;
            if (i4 == 0) {
                Message obtainMessage = a.this.f27015l.obtainMessage();
                obtainMessage.what = 6;
                obtainMessage.obj = new com.clj.fastble.data.a(i4);
                a.this.f27015l.sendMessage(obtainMessage);
                return;
            }
            Message obtainMessage2 = a.this.f27015l.obtainMessage();
            obtainMessage2.what = 5;
            a.this.f27015l.sendMessage(obtainMessage2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum b {
        CONNECT_IDLE,
        CONNECT_CONNECTING,
        CONNECT_CONNECTED,
        CONNECT_FAILURE,
        CONNECT_DISCONNECT
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c extends Handler {
        c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    a.this.H();
                    a.this.M();
                    a.this.C();
                    if (a.this.f27016m < com.clj.fastble.a.w().A()) {
                        com.clj.fastble.utils.a.b("Connect fail, try reconnect " + com.clj.fastble.a.w().B() + " millisecond later");
                        a.k(a.this);
                        Message obtainMessage = a.this.f27015l.obtainMessage();
                        obtainMessage.what = 3;
                        a.this.f27015l.sendMessageDelayed(obtainMessage, com.clj.fastble.a.w().B());
                        return;
                    }
                    a.this.f27011h = b.CONNECT_FAILURE;
                    com.clj.fastble.a.w().y().m(a.this);
                    int a4 = ((com.clj.fastble.data.a) message.obj).a();
                    if (a.this.f27004a != null) {
                        a.this.f27004a.n(a.this.f27013j, new ConnectException(a.this.f27014k, a4));
                        return;
                    }
                    return;
                case 2:
                    a.this.f27011h = b.CONNECT_DISCONNECT;
                    com.clj.fastble.a.w().y().l(a.this);
                    a.this.G();
                    a.this.M();
                    a.this.C();
                    a.this.S();
                    a.this.P();
                    a.this.B();
                    a.this.f27015l.removeCallbacksAndMessages(null);
                    com.clj.fastble.data.a aVar = (com.clj.fastble.data.a) message.obj;
                    boolean b4 = aVar.b();
                    int a5 = aVar.a();
                    if (a.this.f27004a != null) {
                        a.this.f27004a.p(b4, a.this.f27013j, a.this.f27014k, a5);
                        return;
                    }
                    return;
                case 3:
                    a aVar2 = a.this;
                    aVar2.E(aVar2.f27013j, false, a.this.f27004a, a.this.f27016m);
                    return;
                case 4:
                    if (a.this.f27014k != null) {
                        if (!a.this.f27014k.discoverServices()) {
                            Message obtainMessage2 = a.this.f27015l.obtainMessage();
                            obtainMessage2.what = 5;
                            a.this.f27015l.sendMessage(obtainMessage2);
                            return;
                        }
                        return;
                    }
                    Message obtainMessage3 = a.this.f27015l.obtainMessage();
                    obtainMessage3.what = 5;
                    a.this.f27015l.sendMessage(obtainMessage3);
                    return;
                case 5:
                    a.this.H();
                    a.this.M();
                    a.this.C();
                    a.this.f27011h = b.CONNECT_FAILURE;
                    com.clj.fastble.a.w().y().m(a.this);
                    if (a.this.f27004a != null) {
                        a.this.f27004a.n(a.this.f27013j, new OtherException("GATT discover services exception occurred!"));
                        return;
                    }
                    return;
                case 6:
                    a.this.f27011h = b.CONNECT_CONNECTED;
                    a.this.f27012i = false;
                    com.clj.fastble.a.w().y().m(a.this);
                    com.clj.fastble.a.w().y().a(a.this);
                    int a6 = ((com.clj.fastble.data.a) message.obj).a();
                    if (a.this.f27004a != null) {
                        a.this.f27004a.o(a.this.f27013j, a.this.f27014k, a6);
                        return;
                    }
                    return;
                case 7:
                    a.this.H();
                    a.this.M();
                    a.this.C();
                    a.this.f27011h = b.CONNECT_FAILURE;
                    com.clj.fastble.a.w().y().m(a.this);
                    if (a.this.f27004a != null) {
                        a.this.f27004a.n(a.this.f27013j, new TimeoutException());
                        return;
                    }
                    return;
                default:
                    super.handleMessage(message);
                    return;
            }
        }
    }

    public a(com.clj.fastble.data.b bVar) {
        this.f27013j = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void C() {
        BluetoothGatt bluetoothGatt = this.f27014k;
        if (bluetoothGatt != null) {
            bluetoothGatt.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void H() {
        BluetoothGatt bluetoothGatt = this.f27014k;
        if (bluetoothGatt != null) {
            bluetoothGatt.disconnect();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void M() {
        BluetoothGatt bluetoothGatt;
        try {
            Method method = BluetoothGatt.class.getMethod("refresh", new Class[0]);
            if (method != null && (bluetoothGatt = this.f27014k) != null) {
                com.clj.fastble.utils.a.c("refreshDeviceCache, is success:  " + ((Boolean) method.invoke(bluetoothGatt, new Object[0])).booleanValue());
            }
        } catch (Exception e4) {
            com.clj.fastble.utils.a.c("exception occur while refreshing device: " + e4.getMessage());
            e4.printStackTrace();
        }
    }

    static /* synthetic */ int k(a aVar) {
        int i4 = aVar.f27016m + 1;
        aVar.f27016m = i4;
        return i4;
    }

    public synchronized void A(String str, k kVar) {
        this.f27009f.put(str, kVar);
    }

    public synchronized void B() {
        this.f27007d.clear();
        this.f27008e.clear();
        this.f27009f.clear();
        this.f27010g.clear();
    }

    public synchronized BluetoothGatt D(com.clj.fastble.data.b bVar, boolean z3, v0.b bVar2) {
        return E(bVar, z3, bVar2, 0);
    }

    public synchronized BluetoothGatt E(com.clj.fastble.data.b bVar, boolean z3, v0.b bVar2, int i4) {
        try {
            com.clj.fastble.utils.a.c("connect device: " + bVar.d() + "\nmac: " + bVar.c() + "\nautoConnect: " + z3 + "\ncurrentThread: " + Thread.currentThread().getId() + "\nconnectCount:" + (i4 + 1));
            if (i4 == 0) {
                this.f27016m = 0;
            }
            u(bVar2);
            this.f27011h = b.CONNECT_CONNECTING;
            BluetoothGatt connectGatt = bVar.a().connectGatt(com.clj.fastble.a.w().v(), z3, this.f27017n, 2);
            this.f27014k = connectGatt;
            if (connectGatt != null) {
                v0.b bVar3 = this.f27004a;
                if (bVar3 != null) {
                    bVar3.q();
                }
                Message obtainMessage = this.f27015l.obtainMessage();
                obtainMessage.what = 7;
                this.f27015l.sendMessageDelayed(obtainMessage, com.clj.fastble.a.w().t());
            } else {
                H();
                M();
                C();
                this.f27011h = b.CONNECT_FAILURE;
                com.clj.fastble.a.w().y().m(this);
                v0.b bVar4 = this.f27004a;
                if (bVar4 != null) {
                    bVar4.n(bVar, new OtherException("GATT connect exception occurred!"));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f27014k;
    }

    public synchronized void F() {
        this.f27011h = b.CONNECT_IDLE;
        H();
        M();
        C();
        N();
        S();
        P();
        B();
        this.f27015l.removeCallbacksAndMessages(null);
    }

    public synchronized void G() {
        this.f27012i = true;
        H();
    }

    public BluetoothGatt I() {
        return this.f27014k;
    }

    public com.clj.fastble.data.b J() {
        return this.f27013j;
    }

    public String K() {
        return this.f27013j.b();
    }

    public com.clj.fastble.bluetooth.b L() {
        return new com.clj.fastble.bluetooth.b(this);
    }

    public synchronized void N() {
        this.f27004a = null;
    }

    public synchronized void O(String str) {
        if (this.f27008e.containsKey(str)) {
            this.f27008e.remove(str);
        }
    }

    public synchronized void P() {
        this.f27006c = null;
    }

    public synchronized void Q(String str) {
        if (this.f27007d.containsKey(str)) {
            this.f27007d.remove(str);
        }
    }

    public synchronized void R(String str) {
        if (this.f27010g.containsKey(str)) {
            this.f27010g.remove(str);
        }
    }

    public synchronized void S() {
        this.f27005b = null;
    }

    public synchronized void T(String str) {
        if (this.f27009f.containsKey(str)) {
            this.f27009f.remove(str);
        }
    }

    public synchronized void u(v0.b bVar) {
        this.f27004a = bVar;
    }

    public synchronized void v(String str, v0.c cVar) {
        this.f27008e.put(str, cVar);
    }

    public synchronized void w(v0.d dVar) {
        this.f27006c = dVar;
    }

    public synchronized void x(String str, e eVar) {
        this.f27007d.put(str, eVar);
    }

    public synchronized void y(String str, f fVar) {
        this.f27010g.put(str, fVar);
    }

    public synchronized void z(g gVar) {
        this.f27005b = gVar;
    }
}
