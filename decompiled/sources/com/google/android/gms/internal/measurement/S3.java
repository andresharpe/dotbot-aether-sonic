package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class S3 extends B3 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f29476b = Logger.getLogger(S3.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f29477c = B5.C();

    /* renamed from: a, reason: collision with root package name */
    T3 f29478a;

    private S3() {
    }

    public static int A(C1519v4 c1519v4) {
        int a4 = c1519v4.a();
        return a(a4) + a4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int B(P4 p4, InterfaceC1353a5 interfaceC1353a5) {
        AbstractC1518v3 abstractC1518v3 = (AbstractC1518v3) p4;
        int h4 = abstractC1518v3.h();
        if (h4 == -1) {
            h4 = interfaceC1353a5.zza(abstractC1518v3);
            abstractC1518v3.j(h4);
        }
        return a(h4) + h4;
    }

    public static int C(String str) {
        int length;
        try {
            length = H5.c(str);
        } catch (G5 unused) {
            length = str.getBytes(C1503t4.f29791b).length;
        }
        return a(length) + length;
    }

    public static int D(int i4) {
        return a(i4 << 3);
    }

    public static int a(int i4) {
        if ((i4 & (-128)) == 0) {
            return 1;
        }
        if ((i4 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i4) == 0) {
            return 3;
        }
        return (i4 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int b(long j4) {
        int i4;
        if (((-128) & j4) == 0) {
            return 1;
        }
        if (j4 < 0) {
            return 10;
        }
        if (((-34359738368L) & j4) != 0) {
            j4 >>>= 28;
            i4 = 6;
        } else {
            i4 = 2;
        }
        if (((-2097152) & j4) != 0) {
            i4 += 2;
            j4 >>>= 14;
        }
        return (j4 & (-16384)) != 0 ? i4 + 1 : i4;
    }

    public static S3 c(byte[] bArr) {
        return new Q3(bArr, 0, bArr.length);
    }

    public static int x(zzjd zzjdVar) {
        int d4 = zzjdVar.d();
        return a(d4) + d4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int y(int i4, P4 p4, InterfaceC1353a5 interfaceC1353a5) {
        int a4 = a(i4 << 3);
        int i5 = a4 + a4;
        AbstractC1518v3 abstractC1518v3 = (AbstractC1518v3) p4;
        int h4 = abstractC1518v3.h();
        if (h4 == -1) {
            h4 = interfaceC1353a5.zza(abstractC1518v3);
            abstractC1518v3.j(h4);
        }
        return i5 + h4;
    }

    public static int z(int i4) {
        if (i4 >= 0) {
            return a(i4);
        }
        return 10;
    }

    public final void d() {
        if (g() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(String str, G5 g5) throws IOException {
        f29476b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) g5);
        byte[] bytes = str.getBytes(C1503t4.f29791b);
        try {
            int length = bytes.length;
            u(length);
            q(bytes, 0, length);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzjj(e4);
        }
    }

    public abstract int g();

    public abstract void h(byte b4) throws IOException;

    public abstract void i(int i4, boolean z3) throws IOException;

    public abstract void j(int i4, zzjd zzjdVar) throws IOException;

    public abstract void k(int i4, int i5) throws IOException;

    public abstract void l(int i4) throws IOException;

    public abstract void m(int i4, long j4) throws IOException;

    public abstract void n(long j4) throws IOException;

    public abstract void o(int i4, int i5) throws IOException;

    public abstract void p(int i4) throws IOException;

    public abstract void q(byte[] bArr, int i4, int i5) throws IOException;

    public abstract void r(int i4, String str) throws IOException;

    public abstract void s(int i4, int i5) throws IOException;

    public abstract void t(int i4, int i5) throws IOException;

    public abstract void u(int i4) throws IOException;

    public abstract void v(int i4, long j4) throws IOException;

    public abstract void w(long j4) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ S3(R3 r32) {
    }
}
