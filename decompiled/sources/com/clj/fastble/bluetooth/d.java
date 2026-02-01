package com.clj.fastble.bluetooth;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.clj.fastble.exception.BleException;
import com.clj.fastble.exception.OtherException;
import java.util.LinkedList;
import java.util.Queue;
import v0.k;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private HandlerThread f27030a;

    /* renamed from: b, reason: collision with root package name */
    private Handler f27031b;

    /* renamed from: c, reason: collision with root package name */
    private com.clj.fastble.bluetooth.a f27032c;

    /* renamed from: d, reason: collision with root package name */
    private String f27033d;

    /* renamed from: e, reason: collision with root package name */
    private String f27034e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f27035f;

    /* renamed from: g, reason: collision with root package name */
    private int f27036g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f27037h;

    /* renamed from: i, reason: collision with root package name */
    private long f27038i;

    /* renamed from: j, reason: collision with root package name */
    private k f27039j;

    /* renamed from: k, reason: collision with root package name */
    private Queue<byte[]> f27040k;

    /* renamed from: l, reason: collision with root package name */
    private int f27041l;

    /* loaded from: classes.dex */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 51) {
                d.this.l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends k {
        b() {
        }

        @Override // v0.k
        public void e(BleException bleException) {
            if (d.this.f27039j != null) {
                d.this.f27039j.e(new OtherException("exception occur while writing: " + bleException.b()));
            }
            if (d.this.f27037h) {
                d.this.f27031b.sendMessageDelayed(d.this.f27031b.obtainMessage(51), d.this.f27038i);
            }
        }

        @Override // v0.k
        public void f(int i4, int i5, byte[] bArr) {
            int size = d.this.f27041l - d.this.f27040k.size();
            if (d.this.f27039j != null) {
                d.this.f27039j.f(size, d.this.f27041l, bArr);
            }
            if (d.this.f27037h) {
                d.this.f27031b.sendMessageDelayed(d.this.f27031b.obtainMessage(51), d.this.f27038i);
            }
        }
    }

    public d() {
        HandlerThread handlerThread = new HandlerThread("splitWriter");
        this.f27030a = handlerThread;
        handlerThread.start();
        this.f27031b = new a(this.f27030a.getLooper());
    }

    private void h() {
        this.f27030a.quit();
        this.f27031b.removeCallbacksAndMessages(null);
    }

    private static Queue<byte[]> i(byte[] bArr, int i4) {
        int round;
        int length;
        byte[] bArr2;
        if (i4 > 20) {
            com.clj.fastble.utils.a.d("Be careful: split count beyond 20! Ensure MTU higher than 23!");
        }
        LinkedList linkedList = new LinkedList();
        if (bArr.length % i4 == 0) {
            round = bArr.length / i4;
        } else {
            round = Math.round((bArr.length / i4) + 1);
        }
        if (round > 0) {
            for (int i5 = 0; i5 < round; i5++) {
                if (round != 1 && i5 != round - 1) {
                    bArr2 = new byte[i4];
                    System.arraycopy(bArr, i5 * i4, bArr2, 0, i4);
                } else {
                    if (bArr.length % i4 == 0) {
                        length = i4;
                    } else {
                        length = bArr.length % i4;
                    }
                    byte[] bArr3 = new byte[length];
                    System.arraycopy(bArr, i5 * i4, bArr3, 0, length);
                    bArr2 = bArr3;
                }
                linkedList.offer(bArr2);
            }
        }
        return linkedList;
    }

    private void j() {
        byte[] bArr = this.f27035f;
        if (bArr != null) {
            int i4 = this.f27036g;
            if (i4 >= 1) {
                Queue<byte[]> i5 = i(bArr, i4);
                this.f27040k = i5;
                this.f27041l = i5.size();
                l();
                return;
            }
            throw new IllegalArgumentException("split count should higher than 0!");
        }
        throw new IllegalArgumentException("data is Null!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.f27040k.peek() == null) {
            h();
            return;
        }
        this.f27032c.L().x(this.f27033d, this.f27034e).y(this.f27040k.poll(), new b(), this.f27034e);
        if (!this.f27037h) {
            this.f27031b.sendMessageDelayed(this.f27031b.obtainMessage(51), this.f27038i);
        }
    }

    public void k(com.clj.fastble.bluetooth.a aVar, String str, String str2, byte[] bArr, boolean z3, long j4, k kVar) {
        this.f27032c = aVar;
        this.f27033d = str;
        this.f27034e = str2;
        this.f27035f = bArr;
        this.f27037h = z3;
        this.f27038i = j4;
        this.f27036g = com.clj.fastble.a.w().E();
        this.f27039j = kVar;
        j();
    }
}
