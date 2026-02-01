package com.clj.fastble.bluetooth;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.clj.fastble.exception.GattException;
import com.clj.fastble.exception.OtherException;
import com.clj.fastble.exception.TimeoutException;
import java.util.UUID;
import v0.e;
import v0.f;
import v0.g;
import v0.k;

@TargetApi(18)
/* loaded from: classes.dex */
public class b {

    /* renamed from: f, reason: collision with root package name */
    private static final String f27020f = "00002902-0000-1000-8000-00805f9b34fb";

    /* renamed from: a, reason: collision with root package name */
    private BluetoothGatt f27021a;

    /* renamed from: b, reason: collision with root package name */
    private BluetoothGattService f27022b;

    /* renamed from: c, reason: collision with root package name */
    private BluetoothGattCharacteristic f27023c;

    /* renamed from: d, reason: collision with root package name */
    private com.clj.fastble.bluetooth.a f27024d;

    /* renamed from: e, reason: collision with root package name */
    private Handler f27025e = new a(Looper.getMainLooper());

    /* loaded from: classes.dex */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i4 = message.what;
            if (i4 != 49) {
                if (i4 != 50) {
                    if (i4 != 65) {
                        if (i4 != 66) {
                            if (i4 != 81) {
                                if (i4 != 82) {
                                    if (i4 != 97) {
                                        if (i4 != 98) {
                                            switch (i4) {
                                                case 17:
                                                    e eVar = (e) message.obj;
                                                    if (eVar != null) {
                                                        eVar.f(new TimeoutException());
                                                        return;
                                                    }
                                                    return;
                                                case 18:
                                                    b.this.n();
                                                    e eVar2 = (e) message.obj;
                                                    int i5 = message.getData().getInt(com.clj.fastble.data.c.f27070l);
                                                    if (eVar2 != null) {
                                                        if (i5 == 0) {
                                                            eVar2.g();
                                                            return;
                                                        } else {
                                                            eVar2.f(new GattException(i5));
                                                            return;
                                                        }
                                                    }
                                                    return;
                                                case 19:
                                                    e eVar3 = (e) message.obj;
                                                    byte[] byteArray = message.getData().getByteArray(com.clj.fastble.data.c.f27071m);
                                                    if (eVar3 != null) {
                                                        eVar3.e(byteArray);
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    switch (i4) {
                                                        case 33:
                                                            v0.c cVar = (v0.c) message.obj;
                                                            if (cVar != null) {
                                                                cVar.f(new TimeoutException());
                                                                return;
                                                            }
                                                            return;
                                                        case 34:
                                                            b.this.l();
                                                            v0.c cVar2 = (v0.c) message.obj;
                                                            int i6 = message.getData().getInt(com.clj.fastble.data.c.f27075q);
                                                            if (cVar2 != null) {
                                                                if (i6 == 0) {
                                                                    cVar2.g();
                                                                    return;
                                                                } else {
                                                                    cVar2.f(new GattException(i6));
                                                                    return;
                                                                }
                                                            }
                                                            return;
                                                        case 35:
                                                            v0.c cVar3 = (v0.c) message.obj;
                                                            byte[] byteArray2 = message.getData().getByteArray(com.clj.fastble.data.c.f27076r);
                                                            if (cVar3 != null) {
                                                                cVar3.e(byteArray2);
                                                                return;
                                                            }
                                                            return;
                                                        default:
                                                            return;
                                                    }
                                            }
                                        }
                                        b.this.m();
                                        v0.d dVar = (v0.d) message.obj;
                                        Bundle data = message.getData();
                                        int i7 = data.getInt(com.clj.fastble.data.c.f27057H);
                                        int i8 = data.getInt(com.clj.fastble.data.c.f27058I);
                                        if (dVar != null) {
                                            if (i7 == 0) {
                                                dVar.e(i8);
                                                return;
                                            } else {
                                                dVar.f(new GattException(i7));
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    v0.d dVar2 = (v0.d) message.obj;
                                    if (dVar2 != null) {
                                        dVar2.f(new TimeoutException());
                                        return;
                                    }
                                    return;
                                }
                                b.this.s();
                                g gVar = (g) message.obj;
                                Bundle data2 = message.getData();
                                int i9 = data2.getInt(com.clj.fastble.data.c.f27053D);
                                int i10 = data2.getInt(com.clj.fastble.data.c.f27054E);
                                if (gVar != null) {
                                    if (i9 == 0) {
                                        gVar.f(i10);
                                        return;
                                    } else {
                                        gVar.e(new GattException(i9));
                                        return;
                                    }
                                }
                                return;
                            }
                            g gVar2 = (g) message.obj;
                            if (gVar2 != null) {
                                gVar2.e(new TimeoutException());
                                return;
                            }
                            return;
                        }
                        b.this.p();
                        f fVar = (f) message.obj;
                        Bundle data3 = message.getData();
                        int i11 = data3.getInt(com.clj.fastble.data.c.f27084z);
                        byte[] byteArray3 = data3.getByteArray(com.clj.fastble.data.c.f27050A);
                        if (fVar != null) {
                            if (i11 == 0) {
                                fVar.f(byteArray3);
                                return;
                            } else {
                                fVar.e(new GattException(i11));
                                return;
                            }
                        }
                        return;
                    }
                    f fVar2 = (f) message.obj;
                    if (fVar2 != null) {
                        fVar2.e(new TimeoutException());
                        return;
                    }
                    return;
                }
                b.this.z();
                k kVar = (k) message.obj;
                Bundle data4 = message.getData();
                int i12 = data4.getInt(com.clj.fastble.data.c.f27080v);
                byte[] byteArray4 = data4.getByteArray(com.clj.fastble.data.c.f27081w);
                if (kVar != null) {
                    if (i12 == 0) {
                        kVar.f(1, 1, byteArray4);
                        return;
                    } else {
                        kVar.e(new GattException(i12));
                        return;
                    }
                }
                return;
            }
            k kVar2 = (k) message.obj;
            if (kVar2 != null) {
                kVar2.e(new TimeoutException());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(com.clj.fastble.bluetooth.a aVar) {
        this.f27024d = aVar;
        this.f27021a = aVar.I();
    }

    private UUID e(String str) {
        if (str == null) {
            return null;
        }
        return UUID.fromString(str);
    }

    private void f(v0.c cVar, String str) {
        if (cVar != null) {
            l();
            cVar.d(str);
            cVar.c(this.f27025e);
            this.f27024d.v(str, cVar);
            Handler handler = this.f27025e;
            handler.sendMessageDelayed(handler.obtainMessage(33, cVar), com.clj.fastble.a.w().z());
        }
    }

    private void g(e eVar, String str) {
        if (eVar != null) {
            n();
            eVar.d(str);
            eVar.c(this.f27025e);
            this.f27024d.x(str, eVar);
            Handler handler = this.f27025e;
            handler.sendMessageDelayed(handler.obtainMessage(17, eVar), com.clj.fastble.a.w().z());
        }
    }

    private void h(f fVar, String str) {
        if (fVar != null) {
            p();
            fVar.d(str);
            fVar.c(this.f27025e);
            this.f27024d.y(str, fVar);
            Handler handler = this.f27025e;
            handler.sendMessageDelayed(handler.obtainMessage(65, fVar), com.clj.fastble.a.w().z());
        }
    }

    private void i(k kVar, String str) {
        if (kVar != null) {
            z();
            kVar.d(str);
            kVar.c(this.f27025e);
            this.f27024d.A(str, kVar);
            Handler handler = this.f27025e;
            handler.sendMessageDelayed(handler.obtainMessage(49, kVar), com.clj.fastble.a.w().z());
        }
    }

    private void j(g gVar) {
        if (gVar != null) {
            s();
            gVar.c(this.f27025e);
            this.f27024d.z(gVar);
            Handler handler = this.f27025e;
            handler.sendMessageDelayed(handler.obtainMessage(81, gVar), com.clj.fastble.a.w().z());
        }
    }

    private void k(v0.d dVar) {
        if (dVar != null) {
            m();
            dVar.c(this.f27025e);
            this.f27024d.w(dVar);
            Handler handler = this.f27025e;
            handler.sendMessageDelayed(handler.obtainMessage(97, dVar), com.clj.fastble.a.w().z());
        }
    }

    private boolean t(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z3, boolean z4, v0.c cVar) {
        BluetoothGattDescriptor descriptor;
        byte[] bArr;
        if (bluetoothGatt != null && bluetoothGattCharacteristic != null) {
            if (!bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, z4)) {
                l();
                if (cVar != null) {
                    cVar.f(new OtherException("gatt setCharacteristicNotification fail"));
                }
                return false;
            }
            if (z3) {
                descriptor = bluetoothGattCharacteristic.getDescriptor(bluetoothGattCharacteristic.getUuid());
            } else {
                descriptor = bluetoothGattCharacteristic.getDescriptor(e(f27020f));
            }
            if (descriptor == null) {
                l();
                if (cVar != null) {
                    cVar.f(new OtherException("descriptor equals null"));
                }
                return false;
            }
            if (z4) {
                bArr = BluetoothGattDescriptor.ENABLE_INDICATION_VALUE;
            } else {
                bArr = BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE;
            }
            descriptor.setValue(bArr);
            boolean writeDescriptor = bluetoothGatt.writeDescriptor(descriptor);
            if (!writeDescriptor) {
                l();
                if (cVar != null) {
                    cVar.f(new OtherException("gatt writeDescriptor fail"));
                }
            }
            return writeDescriptor;
        }
        l();
        if (cVar != null) {
            cVar.f(new OtherException("gatt or characteristic equal null"));
        }
        return false;
    }

    private boolean u(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z3, boolean z4, e eVar) {
        BluetoothGattDescriptor descriptor;
        byte[] bArr;
        if (bluetoothGatt != null && bluetoothGattCharacteristic != null) {
            if (!bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, z4)) {
                n();
                if (eVar != null) {
                    eVar.f(new OtherException("gatt setCharacteristicNotification fail"));
                }
                return false;
            }
            if (z3) {
                descriptor = bluetoothGattCharacteristic.getDescriptor(bluetoothGattCharacteristic.getUuid());
            } else {
                descriptor = bluetoothGattCharacteristic.getDescriptor(e(f27020f));
            }
            if (descriptor == null) {
                n();
                if (eVar != null) {
                    eVar.f(new OtherException("descriptor equals null"));
                }
                return false;
            }
            if (z4) {
                bArr = BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
            } else {
                bArr = BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE;
            }
            descriptor.setValue(bArr);
            boolean writeDescriptor = bluetoothGatt.writeDescriptor(descriptor);
            if (!writeDescriptor) {
                n();
                if (eVar != null) {
                    eVar.f(new OtherException("gatt writeDescriptor fail"));
                }
            }
            return writeDescriptor;
        }
        n();
        if (eVar != null) {
            eVar.f(new OtherException("gatt or characteristic equal null"));
        }
        return false;
    }

    private b w(UUID uuid, UUID uuid2) {
        BluetoothGatt bluetoothGatt;
        if (uuid != null && (bluetoothGatt = this.f27021a) != null) {
            this.f27022b = bluetoothGatt.getService(uuid);
        }
        BluetoothGattService bluetoothGattService = this.f27022b;
        if (bluetoothGattService != null && uuid2 != null) {
            this.f27023c = bluetoothGattService.getCharacteristic(uuid2);
        }
        return this;
    }

    public boolean a(boolean z3) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f27023c;
        if (bluetoothGattCharacteristic != null && (bluetoothGattCharacteristic.getProperties() | 16) > 0) {
            return t(this.f27021a, this.f27023c, z3, false, null);
        }
        return false;
    }

    public boolean b(boolean z3) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f27023c;
        if (bluetoothGattCharacteristic != null && (bluetoothGattCharacteristic.getProperties() | 16) > 0) {
            return u(this.f27021a, this.f27023c, z3, false, null);
        }
        return false;
    }

    public void c(v0.c cVar, String str, boolean z3) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f27023c;
        if (bluetoothGattCharacteristic != null && (bluetoothGattCharacteristic.getProperties() | 16) > 0) {
            f(cVar, str);
            t(this.f27021a, this.f27023c, z3, true, cVar);
        } else if (cVar != null) {
            cVar.f(new OtherException("this characteristic not support indicate!"));
        }
    }

    public void d(e eVar, String str, boolean z3) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f27023c;
        if (bluetoothGattCharacteristic != null && (bluetoothGattCharacteristic.getProperties() | 16) > 0) {
            g(eVar, str);
            u(this.f27021a, this.f27023c, z3, true, eVar);
        } else if (eVar != null) {
            eVar.f(new OtherException("this characteristic not support notify!"));
        }
    }

    public void l() {
        this.f27025e.removeMessages(33);
    }

    public void m() {
        this.f27025e.removeMessages(97);
    }

    public void n() {
        this.f27025e.removeMessages(17);
    }

    public void o(f fVar, String str) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f27023c;
        if (bluetoothGattCharacteristic != null && (bluetoothGattCharacteristic.getProperties() & 2) > 0) {
            h(fVar, str);
            if (!this.f27021a.readCharacteristic(this.f27023c)) {
                p();
                if (fVar != null) {
                    fVar.e(new OtherException("gatt readCharacteristic fail"));
                    return;
                }
                return;
            }
            return;
        }
        if (fVar != null) {
            fVar.e(new OtherException("this characteristic not support read!"));
        }
    }

    public void p() {
        this.f27025e.removeMessages(65);
    }

    public void q(g gVar) {
        j(gVar);
        if (!this.f27021a.readRemoteRssi()) {
            s();
            if (gVar != null) {
                gVar.e(new OtherException("gatt readRemoteRssi fail"));
            }
        }
    }

    public boolean r(int i4) {
        return this.f27021a.requestConnectionPriority(i4);
    }

    public void s() {
        this.f27025e.removeMessages(81);
    }

    public void v(int i4, v0.d dVar) {
        k(dVar);
        if (!this.f27021a.requestMtu(i4)) {
            m();
            if (dVar != null) {
                dVar.f(new OtherException("gatt requestMtu fail"));
            }
        }
    }

    public b x(String str, String str2) {
        return w(e(str), e(str2));
    }

    public void y(byte[] bArr, k kVar, String str) {
        if (bArr != null && bArr.length > 0) {
            BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f27023c;
            if (bluetoothGattCharacteristic != null && (bluetoothGattCharacteristic.getProperties() & 12) != 0) {
                if (this.f27023c.setValue(bArr)) {
                    i(kVar, str);
                    if (!this.f27021a.writeCharacteristic(this.f27023c)) {
                        z();
                        if (kVar != null) {
                            kVar.e(new OtherException("gatt writeCharacteristic fail"));
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (kVar != null) {
                    kVar.e(new OtherException("Updates the locally stored value of this characteristic fail"));
                    return;
                }
                return;
            }
            if (kVar != null) {
                kVar.e(new OtherException("this characteristic not support write!"));
                return;
            }
            return;
        }
        if (kVar != null) {
            kVar.e(new OtherException("the data to be written is empty"));
        }
    }

    public void z() {
        this.f27025e.removeMessages(49);
    }
}
