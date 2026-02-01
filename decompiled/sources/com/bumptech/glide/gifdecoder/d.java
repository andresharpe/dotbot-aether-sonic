package com.bumptech.glide.gifdecoder;

import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.core.view.C0823k0;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes.dex */
public class d {

    /* renamed from: e, reason: collision with root package name */
    private static final String f25520e = "GifHeaderParser";

    /* renamed from: f, reason: collision with root package name */
    private static final int f25521f = 255;

    /* renamed from: g, reason: collision with root package name */
    private static final int f25522g = 44;

    /* renamed from: h, reason: collision with root package name */
    private static final int f25523h = 33;

    /* renamed from: i, reason: collision with root package name */
    private static final int f25524i = 59;

    /* renamed from: j, reason: collision with root package name */
    private static final int f25525j = 249;

    /* renamed from: k, reason: collision with root package name */
    private static final int f25526k = 255;

    /* renamed from: l, reason: collision with root package name */
    private static final int f25527l = 254;

    /* renamed from: m, reason: collision with root package name */
    private static final int f25528m = 1;

    /* renamed from: n, reason: collision with root package name */
    private static final int f25529n = 28;

    /* renamed from: o, reason: collision with root package name */
    private static final int f25530o = 2;

    /* renamed from: p, reason: collision with root package name */
    private static final int f25531p = 1;

    /* renamed from: q, reason: collision with root package name */
    private static final int f25532q = 128;

    /* renamed from: r, reason: collision with root package name */
    private static final int f25533r = 64;

    /* renamed from: s, reason: collision with root package name */
    private static final int f25534s = 7;

    /* renamed from: t, reason: collision with root package name */
    private static final int f25535t = 128;

    /* renamed from: u, reason: collision with root package name */
    private static final int f25536u = 7;

    /* renamed from: v, reason: collision with root package name */
    static final int f25537v = 2;

    /* renamed from: w, reason: collision with root package name */
    static final int f25538w = 10;

    /* renamed from: x, reason: collision with root package name */
    private static final int f25539x = 256;

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer f25541b;

    /* renamed from: c, reason: collision with root package name */
    private c f25542c;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f25540a = new byte[256];

    /* renamed from: d, reason: collision with root package name */
    private int f25543d = 0;

    private boolean b() {
        if (this.f25542c.f25508b != 0) {
            return true;
        }
        return false;
    }

    private int e() {
        try {
            return this.f25541b.get() & 255;
        } catch (Exception unused) {
            this.f25542c.f25508b = 1;
            return 0;
        }
    }

    private void f() {
        boolean z3;
        this.f25542c.f25510d.f25494a = o();
        this.f25542c.f25510d.f25495b = o();
        this.f25542c.f25510d.f25496c = o();
        this.f25542c.f25510d.f25497d = o();
        int e4 = e();
        boolean z4 = false;
        if ((e4 & 128) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int pow = (int) Math.pow(2.0d, (e4 & 7) + 1);
        b bVar = this.f25542c.f25510d;
        if ((e4 & 64) != 0) {
            z4 = true;
        }
        bVar.f25498e = z4;
        if (z3) {
            bVar.f25504k = h(pow);
        } else {
            bVar.f25504k = null;
        }
        this.f25542c.f25510d.f25503j = this.f25541b.position();
        t();
        if (b()) {
            return;
        }
        c cVar = this.f25542c;
        cVar.f25509c++;
        cVar.f25511e.add(cVar.f25510d);
    }

    private void g() {
        int e4 = e();
        this.f25543d = e4;
        if (e4 > 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                try {
                    i5 = this.f25543d;
                    if (i4 < i5) {
                        i5 -= i4;
                        this.f25541b.get(this.f25540a, i4, i5);
                        i4 += i5;
                    } else {
                        return;
                    }
                } catch (Exception e5) {
                    if (Log.isLoggable(f25520e, 3)) {
                        Log.d(f25520e, "Error Reading Block n: " + i4 + " count: " + i5 + " blockSize: " + this.f25543d, e5);
                    }
                    this.f25542c.f25508b = 1;
                    return;
                }
            }
        }
    }

    @P
    private int[] h(int i4) {
        byte[] bArr = new byte[i4 * 3];
        int[] iArr = null;
        try {
            this.f25541b.get(bArr);
            iArr = new int[256];
            int i5 = 0;
            int i6 = 0;
            while (i5 < i4) {
                int i7 = bArr[i6] & 255;
                int i8 = i6 + 2;
                int i9 = bArr[i6 + 1] & 255;
                i6 += 3;
                int i10 = i5 + 1;
                iArr[i5] = (i9 << 8) | (i7 << 16) | C0823k0.f13589t | (bArr[i8] & 255);
                i5 = i10;
            }
        } catch (BufferUnderflowException e4) {
            if (Log.isLoggable(f25520e, 3)) {
                Log.d(f25520e, "Format Error Reading Color Table", e4);
            }
            this.f25542c.f25508b = 1;
        }
        return iArr;
    }

    private void i() {
        j(Integer.MAX_VALUE);
    }

    private void j(int i4) {
        boolean z3 = false;
        while (!z3 && !b() && this.f25542c.f25509c <= i4) {
            int e4 = e();
            if (e4 != 33) {
                if (e4 != 44) {
                    if (e4 != f25524i) {
                        this.f25542c.f25508b = 1;
                    } else {
                        z3 = true;
                    }
                } else {
                    c cVar = this.f25542c;
                    if (cVar.f25510d == null) {
                        cVar.f25510d = new b();
                    }
                    f();
                }
            } else {
                int e5 = e();
                if (e5 != 1) {
                    if (e5 != f25525j) {
                        if (e5 != 254) {
                            if (e5 != 255) {
                                s();
                            } else {
                                g();
                                StringBuilder sb = new StringBuilder();
                                for (int i5 = 0; i5 < 11; i5++) {
                                    sb.append((char) this.f25540a[i5]);
                                }
                                if (sb.toString().equals("NETSCAPE2.0")) {
                                    n();
                                } else {
                                    s();
                                }
                            }
                        } else {
                            s();
                        }
                    } else {
                        this.f25542c.f25510d = new b();
                        k();
                    }
                } else {
                    s();
                }
            }
        }
    }

    private void k() {
        e();
        int e4 = e();
        b bVar = this.f25542c.f25510d;
        int i4 = (e4 & 28) >> 2;
        bVar.f25500g = i4;
        boolean z3 = true;
        if (i4 == 0) {
            bVar.f25500g = 1;
        }
        if ((e4 & 1) == 0) {
            z3 = false;
        }
        bVar.f25499f = z3;
        int o4 = o();
        if (o4 < 2) {
            o4 = 10;
        }
        b bVar2 = this.f25542c.f25510d;
        bVar2.f25502i = o4 * 10;
        bVar2.f25501h = e();
        e();
    }

    private void l() {
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < 6; i4++) {
            sb.append((char) e());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f25542c.f25508b = 1;
            return;
        }
        m();
        if (this.f25542c.f25514h && !b()) {
            c cVar = this.f25542c;
            cVar.f25507a = h(cVar.f25515i);
            c cVar2 = this.f25542c;
            cVar2.f25518l = cVar2.f25507a[cVar2.f25516j];
        }
    }

    private void m() {
        boolean z3;
        this.f25542c.f25512f = o();
        this.f25542c.f25513g = o();
        int e4 = e();
        c cVar = this.f25542c;
        if ((e4 & 128) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        cVar.f25514h = z3;
        cVar.f25515i = (int) Math.pow(2.0d, (e4 & 7) + 1);
        this.f25542c.f25516j = e();
        this.f25542c.f25517k = e();
    }

    private void n() {
        do {
            g();
            byte[] bArr = this.f25540a;
            if (bArr[0] == 1) {
                this.f25542c.f25519m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f25543d <= 0) {
                return;
            }
        } while (!b());
    }

    private int o() {
        return this.f25541b.getShort();
    }

    private void p() {
        this.f25541b = null;
        Arrays.fill(this.f25540a, (byte) 0);
        this.f25542c = new c();
        this.f25543d = 0;
    }

    private void s() {
        int e4;
        do {
            e4 = e();
            this.f25541b.position(Math.min(this.f25541b.position() + e4, this.f25541b.limit()));
        } while (e4 > 0);
    }

    private void t() {
        e();
        s();
    }

    public void a() {
        this.f25541b = null;
        this.f25542c = null;
    }

    public boolean c() {
        l();
        if (!b()) {
            j(2);
        }
        if (this.f25542c.f25509c > 1) {
            return true;
        }
        return false;
    }

    @N
    public c d() {
        if (this.f25541b != null) {
            if (b()) {
                return this.f25542c;
            }
            l();
            if (!b()) {
                i();
                c cVar = this.f25542c;
                if (cVar.f25509c < 0) {
                    cVar.f25508b = 1;
                }
            }
            return this.f25542c;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    public d q(@N ByteBuffer byteBuffer) {
        p();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f25541b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f25541b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public d r(@P byte[] bArr) {
        if (bArr != null) {
            q(ByteBuffer.wrap(bArr));
        } else {
            this.f25541b = null;
            this.f25542c.f25508b = 2;
        }
        return this;
    }
}
