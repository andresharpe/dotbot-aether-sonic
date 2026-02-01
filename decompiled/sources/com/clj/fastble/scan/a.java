package com.clj.fastble.scan;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import v0.j;

@TargetApi(18)
/* loaded from: classes.dex */
public abstract class a implements BluetoothAdapter.LeScanCallback {

    /* renamed from: a, reason: collision with root package name */
    private String[] f27095a;

    /* renamed from: b, reason: collision with root package name */
    private String f27096b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f27097c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f27098d;

    /* renamed from: e, reason: collision with root package name */
    private long f27099e;

    /* renamed from: f, reason: collision with root package name */
    private j f27100f;

    /* renamed from: g, reason: collision with root package name */
    private final List<com.clj.fastble.data.b> f27101g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final Handler f27102h = new Handler(Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    private HandlerThread f27103i;

    /* renamed from: j, reason: collision with root package name */
    private Handler f27104j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f27105k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.clj.fastble.scan.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0247a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ com.clj.fastble.data.b f27106E;

        RunnableC0247a(com.clj.fastble.data.b bVar) {
            this.f27106E = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.j(this.f27106E);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.clj.fastble.scan.c.b().g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ com.clj.fastble.data.b f27109E;

        c(com.clj.fastble.data.b bVar) {
            this.f27109E = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.m(this.f27109E);
        }
    }

    /* loaded from: classes.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.clj.fastble.scan.c.b().g();
        }
    }

    /* loaded from: classes.dex */
    class e implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f27112E;

        e(boolean z3) {
            this.f27112E = z3;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.l(this.f27112E);
        }
    }

    /* loaded from: classes.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            aVar.k(aVar.f27101g);
        }
    }

    /* loaded from: classes.dex */
    private static final class g extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<a> f27115a;

        g(Looper looper, a aVar) {
            super(looper);
            this.f27115a = new WeakReference<>(aVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            com.clj.fastble.data.b bVar;
            a aVar = this.f27115a.get();
            if (aVar != null && message.what == 0 && (bVar = (com.clj.fastble.data.b) message.obj) != null) {
                aVar.f(bVar);
            }
        }
    }

    private void c(com.clj.fastble.data.b bVar) {
        String[] strArr;
        if (TextUtils.isEmpty(this.f27096b) && ((strArr = this.f27095a) == null || strArr.length < 1)) {
            d(bVar);
            return;
        }
        if (!TextUtils.isEmpty(this.f27096b) && !this.f27096b.equalsIgnoreCase(bVar.c())) {
            return;
        }
        String[] strArr2 = this.f27095a;
        if (strArr2 != null && strArr2.length > 0) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            for (String str : this.f27095a) {
                String d4 = bVar.d();
                if (d4 == null) {
                    d4 = "";
                }
                if (this.f27097c) {
                    if (!d4.contains(str)) {
                    }
                    atomicBoolean.set(true);
                } else {
                    if (!d4.equals(str)) {
                    }
                    atomicBoolean.set(true);
                }
            }
            if (!atomicBoolean.get()) {
                return;
            }
        }
        d(bVar);
    }

    private void d(com.clj.fastble.data.b bVar) {
        if (this.f27098d) {
            com.clj.fastble.utils.a.c("devices detected  ------  name:" + bVar.d() + "  mac:" + bVar.c() + "  Rssi:" + bVar.e() + "  scanRecord:" + com.clj.fastble.utils.b.j(bVar.g()));
            this.f27101g.add(bVar);
            this.f27102h.post(new b());
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator<com.clj.fastble.data.b> it = this.f27101g.iterator();
        while (it.hasNext()) {
            if (it.next().a().equals(bVar.a())) {
                atomicBoolean.set(true);
            }
        }
        if (!atomicBoolean.get()) {
            com.clj.fastble.utils.a.c("device detected  ------  name: " + bVar.d() + "  mac: " + bVar.c() + "  Rssi: " + bVar.e() + "  scanRecord: " + com.clj.fastble.utils.b.k(bVar.g(), true));
            this.f27101g.add(bVar);
            this.f27102h.post(new c(bVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(com.clj.fastble.data.b bVar) {
        this.f27102h.post(new RunnableC0247a(bVar));
        c(bVar);
    }

    public j e() {
        return this.f27100f;
    }

    public boolean g() {
        return this.f27098d;
    }

    public final void h(boolean z3) {
        this.f27101g.clear();
        o();
        if (z3 && this.f27099e > 0) {
            this.f27102h.postDelayed(new d(), this.f27099e);
        }
        this.f27102h.post(new e(z3));
    }

    public final void i() {
        this.f27105k = false;
        this.f27103i.quit();
        o();
        this.f27102h.post(new f());
    }

    public abstract void j(com.clj.fastble.data.b bVar);

    public abstract void k(List<com.clj.fastble.data.b> list);

    public abstract void l(boolean z3);

    public abstract void m(com.clj.fastble.data.b bVar);

    public void n(String[] strArr, String str, boolean z3, boolean z4, long j4, j jVar) {
        this.f27095a = strArr;
        this.f27096b = str;
        this.f27097c = z3;
        this.f27098d = z4;
        this.f27099e = j4;
        this.f27100f = jVar;
        HandlerThread handlerThread = new HandlerThread(a.class.getSimpleName());
        this.f27103i = handlerThread;
        handlerThread.start();
        this.f27104j = new g(this.f27103i.getLooper(), this);
        this.f27105k = true;
    }

    public final void o() {
        this.f27102h.removeCallbacksAndMessages(null);
        this.f27104j.removeCallbacksAndMessages(null);
    }

    @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
    public void onLeScan(BluetoothDevice bluetoothDevice, int i4, byte[] bArr) {
        if (bluetoothDevice == null || !this.f27105k) {
            return;
        }
        Message obtainMessage = this.f27104j.obtainMessage();
        obtainMessage.what = 0;
        obtainMessage.obj = new com.clj.fastble.data.b(bluetoothDevice, i4, bArr, System.currentTimeMillis());
        this.f27104j.sendMessage(obtainMessage);
    }
}
