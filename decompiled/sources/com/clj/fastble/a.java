package com.clj.fastble;

import android.annotation.TargetApi;
import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.C0909k;
import com.clj.fastble.data.BleScanState;
import com.clj.fastble.exception.OtherException;
import java.util.List;
import v0.d;
import v0.e;
import v0.f;
import v0.g;
import v0.h;
import v0.i;
import v0.k;

@TargetApi(18)
/* loaded from: classes.dex */
public class a {

    /* renamed from: l, reason: collision with root package name */
    public static final int f26980l = 10000;

    /* renamed from: m, reason: collision with root package name */
    private static final int f26981m = 7;

    /* renamed from: n, reason: collision with root package name */
    private static final int f26982n = 5000;

    /* renamed from: o, reason: collision with root package name */
    private static final int f26983o = 0;

    /* renamed from: p, reason: collision with root package name */
    private static final int f26984p = 5000;

    /* renamed from: q, reason: collision with root package name */
    private static final int f26985q = 23;

    /* renamed from: r, reason: collision with root package name */
    private static final int f26986r = 512;

    /* renamed from: s, reason: collision with root package name */
    private static final int f26987s = 20;

    /* renamed from: t, reason: collision with root package name */
    private static final int f26988t = 10000;

    /* renamed from: a, reason: collision with root package name */
    private Application f26989a;

    /* renamed from: b, reason: collision with root package name */
    private com.clj.fastble.scan.b f26990b;

    /* renamed from: c, reason: collision with root package name */
    private BluetoothAdapter f26991c;

    /* renamed from: d, reason: collision with root package name */
    private com.clj.fastble.bluetooth.c f26992d;

    /* renamed from: e, reason: collision with root package name */
    private BluetoothManager f26993e;

    /* renamed from: f, reason: collision with root package name */
    private int f26994f = 7;

    /* renamed from: g, reason: collision with root package name */
    private int f26995g = 5000;

    /* renamed from: h, reason: collision with root package name */
    private int f26996h = 0;

    /* renamed from: i, reason: collision with root package name */
    private long f26997i = C0909k.f15658a;

    /* renamed from: j, reason: collision with root package name */
    private int f26998j = 20;

    /* renamed from: k, reason: collision with root package name */
    private long f26999k = 10000;

    /* renamed from: com.clj.fastble.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0245a {

        /* renamed from: a, reason: collision with root package name */
        private static final a f27000a = new a();

        private C0245a() {
        }
    }

    public static a w() {
        return C0245a.f27000a;
    }

    public int A() {
        return this.f26996h;
    }

    public long B() {
        return this.f26997i;
    }

    public com.clj.fastble.scan.b C() {
        return this.f26990b;
    }

    public BleScanState D() {
        return com.clj.fastble.scan.c.b().c();
    }

    public int E() {
        return this.f26998j;
    }

    public void F(com.clj.fastble.data.b bVar, String str, String str2, v0.c cVar) {
        G(bVar, str, str2, false, cVar);
    }

    public void G(com.clj.fastble.data.b bVar, String str, String str2, boolean z3, v0.c cVar) {
        if (cVar != null) {
            com.clj.fastble.bluetooth.a f4 = this.f26992d.f(bVar);
            if (f4 == null) {
                cVar.f(new OtherException("This device not connect!"));
                return;
            } else {
                f4.L().x(str, str2).c(cVar, str2, z3);
                return;
            }
        }
        throw new IllegalArgumentException("BleIndicateCallback can not be Null!");
    }

    public void H(Application application) {
        if (this.f26989a == null && application != null) {
            this.f26989a = application;
            if (M()) {
                this.f26993e = (BluetoothManager) this.f26989a.getSystemService("bluetooth");
            }
            this.f26991c = BluetoothAdapter.getDefaultAdapter();
            this.f26992d = new com.clj.fastble.bluetooth.c();
            this.f26990b = new com.clj.fastble.scan.b();
        }
    }

    public void I(com.clj.fastble.scan.b bVar) {
        this.f26990b = bVar;
    }

    public boolean J() {
        BluetoothAdapter bluetoothAdapter = this.f26991c;
        if (bluetoothAdapter != null && bluetoothAdapter.isEnabled()) {
            return true;
        }
        return false;
    }

    public boolean K(com.clj.fastble.data.b bVar) {
        if (u(bVar) == 2) {
            return true;
        }
        return false;
    }

    public boolean L(String str) {
        for (com.clj.fastble.data.b bVar : m()) {
            if (bVar != null && bVar.c().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean M() {
        return this.f26989a.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    public void N(com.clj.fastble.data.b bVar, String str, String str2, e eVar) {
        O(bVar, str, str2, false, eVar);
    }

    public void O(com.clj.fastble.data.b bVar, String str, String str2, boolean z3, e eVar) {
        if (eVar != null) {
            com.clj.fastble.bluetooth.a f4 = this.f26992d.f(bVar);
            if (f4 == null) {
                eVar.f(new OtherException("This device not connect!"));
                return;
            } else {
                f4.L().x(str, str2).d(eVar, str2, z3);
                return;
            }
        }
        throw new IllegalArgumentException("BleNotifyCallback can not be Null!");
    }

    public void P(com.clj.fastble.data.b bVar, String str, String str2, f fVar) {
        if (fVar != null) {
            com.clj.fastble.bluetooth.a f4 = this.f26992d.f(bVar);
            if (f4 == null) {
                fVar.e(new OtherException("This device is not connected!"));
                return;
            } else {
                f4.L().x(str, str2).o(fVar, str2);
                return;
            }
        }
        throw new IllegalArgumentException("BleReadCallback can not be Null!");
    }

    public void Q(com.clj.fastble.data.b bVar, g gVar) {
        if (gVar != null) {
            com.clj.fastble.bluetooth.a f4 = this.f26992d.f(bVar);
            if (f4 == null) {
                gVar.e(new OtherException("This device is not connected!"));
                return;
            } else {
                f4.L().q(gVar);
                return;
            }
        }
        throw new IllegalArgumentException("BleRssiCallback can not be Null!");
    }

    public void R(com.clj.fastble.data.b bVar) {
        com.clj.fastble.bluetooth.a n4 = n(bVar);
        if (n4 != null) {
            n4.N();
        }
    }

    public void S(com.clj.fastble.data.b bVar, String str) {
        com.clj.fastble.bluetooth.a n4 = n(bVar);
        if (n4 != null) {
            n4.O(str);
        }
    }

    public void T(com.clj.fastble.data.b bVar) {
        com.clj.fastble.bluetooth.a n4 = n(bVar);
        if (n4 != null) {
            n4.P();
        }
    }

    public void U(com.clj.fastble.data.b bVar, String str) {
        com.clj.fastble.bluetooth.a n4 = n(bVar);
        if (n4 != null) {
            n4.Q(str);
        }
    }

    public void V(com.clj.fastble.data.b bVar, String str) {
        com.clj.fastble.bluetooth.a n4 = n(bVar);
        if (n4 != null) {
            n4.R(str);
        }
    }

    public void W(com.clj.fastble.data.b bVar) {
        com.clj.fastble.bluetooth.a n4 = n(bVar);
        if (n4 != null) {
            n4.S();
        }
    }

    public void X(com.clj.fastble.data.b bVar, String str) {
        com.clj.fastble.bluetooth.a n4 = n(bVar);
        if (n4 != null) {
            n4.T(str);
        }
    }

    public boolean Y(com.clj.fastble.data.b bVar, int i4) {
        com.clj.fastble.bluetooth.a f4 = this.f26992d.f(bVar);
        if (f4 == null) {
            return false;
        }
        return f4.L().r(i4);
    }

    public void Z(i iVar) {
        if (iVar != null) {
            if (!J()) {
                com.clj.fastble.utils.a.b("Bluetooth not enable!");
                iVar.m(false);
                return;
            }
            com.clj.fastble.scan.c.b().d(this.f26990b.j(), this.f26990b.h(), this.f26990b.g(), this.f26990b.l(), this.f26990b.i(), iVar);
            return;
        }
        throw new IllegalArgumentException("BleScanCallback can not be Null!");
    }

    public void a() {
        com.clj.fastble.scan.c.b().g();
    }

    public void a0(h hVar) {
        if (hVar != null) {
            if (!J()) {
                com.clj.fastble.utils.a.b("Bluetooth not enable!");
                hVar.m(false);
                return;
            }
            com.clj.fastble.scan.c.b().e(this.f26990b.j(), this.f26990b.h(), this.f26990b.g(), this.f26990b.l(), this.f26990b.i(), hVar);
            return;
        }
        throw new IllegalArgumentException("BleScanAndConnectCallback can not be Null!");
    }

    public void b(com.clj.fastble.data.b bVar) {
        com.clj.fastble.bluetooth.a n4 = n(bVar);
        if (n4 != null) {
            n4.B();
        }
    }

    public a b0(long j4) {
        if (j4 <= 0) {
            j4 = 100;
        }
        this.f26999k = j4;
        return this;
    }

    public BluetoothGatt c(com.clj.fastble.data.b bVar, v0.b bVar2) {
        if (bVar2 != null) {
            if (!J()) {
                com.clj.fastble.utils.a.b("Bluetooth not enable!");
                bVar2.n(bVar, new OtherException("Bluetooth not enable!"));
                return null;
            }
            if (Looper.myLooper() == null || Looper.myLooper() != Looper.getMainLooper()) {
                com.clj.fastble.utils.a.d("Be careful: currentThread is not MainThread!");
            }
            if (bVar != null && bVar.a() != null) {
                return this.f26992d.b(bVar).D(bVar, this.f26990b.k(), bVar2);
            }
            bVar2.n(bVar, new OtherException("Not Found Device Exception Occurred!"));
            return null;
        }
        throw new IllegalArgumentException("BleGattCallback can not be Null!");
    }

    public a c0(int i4) {
        if (i4 > 7) {
            i4 = 7;
        }
        this.f26994f = i4;
        return this;
    }

    public BluetoothGatt d(String str, v0.b bVar) {
        return c(new com.clj.fastble.data.b(o().getRemoteDevice(str), 0, null, 0L), bVar);
    }

    public void d0(com.clj.fastble.data.b bVar, int i4, d dVar) {
        if (dVar != null) {
            if (i4 > 512) {
                com.clj.fastble.utils.a.b("requiredMtu should lower than 512 !");
                dVar.f(new OtherException("requiredMtu should lower than 512 !"));
                return;
            } else {
                if (i4 < 23) {
                    com.clj.fastble.utils.a.b("requiredMtu should higher than 23 !");
                    dVar.f(new OtherException("requiredMtu should higher than 23 !"));
                    return;
                }
                com.clj.fastble.bluetooth.a f4 = this.f26992d.f(bVar);
                if (f4 == null) {
                    dVar.f(new OtherException("This device is not connected!"));
                    return;
                } else {
                    f4.L().v(i4, dVar);
                    return;
                }
            }
        }
        throw new IllegalArgumentException("BleMtuChangedCallback can not be Null!");
    }

    public com.clj.fastble.data.b e(BluetoothDevice bluetoothDevice) {
        return new com.clj.fastble.data.b(bluetoothDevice);
    }

    public a e0(int i4) {
        this.f26995g = i4;
        return this;
    }

    @TargetApi(21)
    public com.clj.fastble.data.b f(ScanResult scanResult) {
        byte[] bArr;
        if (scanResult != null) {
            BluetoothDevice device = scanResult.getDevice();
            int rssi = scanResult.getRssi();
            ScanRecord scanRecord = scanResult.getScanRecord();
            if (scanRecord != null) {
                bArr = scanRecord.getBytes();
            } else {
                bArr = null;
            }
            return new com.clj.fastble.data.b(device, rssi, bArr, scanResult.getTimestampNanos());
        }
        throw new IllegalArgumentException("scanResult can not be Null!");
    }

    public a f0(int i4) {
        return g0(i4, C0909k.f15658a);
    }

    public void g() {
        com.clj.fastble.bluetooth.c cVar = this.f26992d;
        if (cVar != null) {
            cVar.c();
        }
    }

    public a g0(int i4, long j4) {
        if (i4 > 10) {
            i4 = 10;
        }
        if (j4 < 0) {
            j4 = 0;
        }
        this.f26996h = i4;
        this.f26997i = j4;
        return this;
    }

    public void h() {
        BluetoothAdapter bluetoothAdapter = this.f26991c;
        if (bluetoothAdapter != null && bluetoothAdapter.isEnabled()) {
            this.f26991c.disable();
        }
    }

    public a h0(int i4) {
        if (i4 > 0) {
            this.f26998j = i4;
        }
        return this;
    }

    public void i(com.clj.fastble.data.b bVar) {
        com.clj.fastble.bluetooth.c cVar = this.f26992d;
        if (cVar != null) {
            cVar.d(bVar);
        }
    }

    public boolean i0(com.clj.fastble.data.b bVar, String str, String str2) {
        return j0(bVar, str, str2, false);
    }

    public void j() {
        com.clj.fastble.bluetooth.c cVar = this.f26992d;
        if (cVar != null) {
            cVar.e();
        }
    }

    public boolean j0(com.clj.fastble.data.b bVar, String str, String str2, boolean z3) {
        com.clj.fastble.bluetooth.a f4 = this.f26992d.f(bVar);
        if (f4 == null) {
            return false;
        }
        boolean a4 = f4.L().x(str, str2).a(z3);
        if (a4) {
            f4.O(str2);
        }
        return a4;
    }

    public void k() {
        BluetoothAdapter bluetoothAdapter = this.f26991c;
        if (bluetoothAdapter != null) {
            bluetoothAdapter.enable();
        }
    }

    public boolean k0(com.clj.fastble.data.b bVar, String str, String str2) {
        return l0(bVar, str, str2, false);
    }

    public a l(boolean z3) {
        com.clj.fastble.utils.a.f27136a = z3;
        return this;
    }

    public boolean l0(com.clj.fastble.data.b bVar, String str, String str2, boolean z3) {
        com.clj.fastble.bluetooth.a f4 = this.f26992d.f(bVar);
        if (f4 == null) {
            return false;
        }
        boolean b4 = f4.L().x(str, str2).b(z3);
        if (b4) {
            f4.Q(str2);
        }
        return b4;
    }

    public List<com.clj.fastble.data.b> m() {
        com.clj.fastble.bluetooth.c cVar = this.f26992d;
        if (cVar == null) {
            return null;
        }
        return cVar.h();
    }

    public void m0(com.clj.fastble.data.b bVar, String str, String str2, byte[] bArr, k kVar) {
        n0(bVar, str, str2, bArr, true, kVar);
    }

    public com.clj.fastble.bluetooth.a n(com.clj.fastble.data.b bVar) {
        com.clj.fastble.bluetooth.c cVar = this.f26992d;
        if (cVar != null) {
            return cVar.f(bVar);
        }
        return null;
    }

    public void n0(com.clj.fastble.data.b bVar, String str, String str2, byte[] bArr, boolean z3, k kVar) {
        o0(bVar, str, str2, bArr, z3, true, 0L, kVar);
    }

    public BluetoothAdapter o() {
        return this.f26991c;
    }

    public void o0(com.clj.fastble.data.b bVar, String str, String str2, byte[] bArr, boolean z3, boolean z4, long j4, k kVar) {
        if (kVar != null) {
            if (bArr == null) {
                com.clj.fastble.utils.a.b("data is Null!");
                kVar.e(new OtherException("data is Null!"));
                return;
            }
            if (bArr.length > 20 && !z3) {
                com.clj.fastble.utils.a.d("Be careful: data's length beyond 20! Ensure MTU higher than 23, or use spilt write!");
            }
            com.clj.fastble.bluetooth.a f4 = this.f26992d.f(bVar);
            if (f4 == null) {
                kVar.e(new OtherException("This device not connect!"));
                return;
            } else if (z3 && bArr.length > E()) {
                new com.clj.fastble.bluetooth.d().k(f4, str, str2, bArr, z4, j4, kVar);
                return;
            } else {
                f4.L().x(str, str2).y(bArr, kVar, str2);
                return;
            }
        }
        throw new IllegalArgumentException("BleWriteCallback can not be Null!");
    }

    public BluetoothGatt p(com.clj.fastble.data.b bVar) {
        com.clj.fastble.bluetooth.a n4 = n(bVar);
        if (n4 != null) {
            return n4.I();
        }
        return null;
    }

    public List<BluetoothGattCharacteristic> q(BluetoothGattService bluetoothGattService) {
        return bluetoothGattService.getCharacteristics();
    }

    public List<BluetoothGattService> r(com.clj.fastble.data.b bVar) {
        BluetoothGatt p4 = p(bVar);
        if (p4 != null) {
            return p4.getServices();
        }
        return null;
    }

    public BluetoothManager s() {
        return this.f26993e;
    }

    public long t() {
        return this.f26999k;
    }

    public int u(com.clj.fastble.data.b bVar) {
        if (bVar != null) {
            return this.f26993e.getConnectionState(bVar.a(), 7);
        }
        return 0;
    }

    public Context v() {
        return this.f26989a;
    }

    public int x() {
        return this.f26994f;
    }

    public com.clj.fastble.bluetooth.c y() {
        return this.f26992d;
    }

    public int z() {
        return this.f26995g;
    }
}
