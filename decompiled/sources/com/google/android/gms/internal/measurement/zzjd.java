package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class zzjd implements Iterable, Serializable {

    /* renamed from: F, reason: collision with root package name */
    public static final zzjd f29849F = new J3(C1503t4.f29793d);

    /* renamed from: G, reason: collision with root package name */
    private static final Comparator f29850G;

    /* renamed from: H, reason: collision with root package name */
    private static final L3 f29851H;

    /* renamed from: E, reason: collision with root package name */
    private int f29852E = 0;

    static {
        int i4 = C1534x3.f29834a;
        f29851H = new L3(null);
        f29850G = new D3();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(int i4, int i5, int i6) {
        int i7 = i5 - i4;
        if ((i4 | i5 | i7 | (i6 - i5)) < 0) {
            if (i4 >= 0) {
                if (i5 < i4) {
                    throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i4 + ", " + i5);
                }
                throw new IndexOutOfBoundsException("End index: " + i5 + " >= " + i6);
            }
            throw new IndexOutOfBoundsException("Beginning index: " + i4 + " < 0");
        }
        return i7;
    }

    public static zzjd o(byte[] bArr, int i4, int i5) {
        m(i4, i4 + i5, bArr.length);
        byte[] bArr2 = new byte[i5];
        System.arraycopy(bArr, i4, bArr2, 0, i5);
        return new J3(bArr2);
    }

    public static zzjd p(String str) {
        return new J3(str.getBytes(C1503t4.f29791b));
    }

    public abstract byte b(int i4);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte c(int i4);

    public abstract int d();

    public abstract boolean equals(Object obj);

    protected abstract int f(int i4, int i5, int i6);

    public abstract zzjd g(int i4, int i5);

    public final int hashCode() {
        int i4 = this.f29852E;
        if (i4 == 0) {
            int d4 = d();
            i4 = f(d4, 0, d4);
            if (i4 == 0) {
                i4 = 1;
            }
            this.f29852E = i4;
        }
        return i4;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C3(this);
    }

    protected abstract String j(Charset charset);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void k(B3 b32) throws IOException;

    public abstract boolean l();

    /* JADX INFO: Access modifiers changed from: protected */
    public final int n() {
        return this.f29852E;
    }

    public final String q(Charset charset) {
        if (d() == 0) {
            return "";
        }
        return j(charset);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(d());
        if (d() <= 50) {
            concat = C1481q5.a(this);
        } else {
            concat = C1481q5.a(g(0, 47)).concat("...");
        }
        objArr[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
