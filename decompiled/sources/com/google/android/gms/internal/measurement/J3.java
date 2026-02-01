package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class J3 extends H3 {

    /* renamed from: I, reason: collision with root package name */
    protected final byte[] f29368I;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J3(byte[] bArr) {
        bArr.getClass();
        this.f29368I = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzjd
    public byte b(int i4) {
        return this.f29368I[i4];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzjd
    public byte c(int i4) {
        return this.f29368I[i4];
    }

    @Override // com.google.android.gms.internal.measurement.zzjd
    public int d() {
        return this.f29368I.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzjd
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzjd) || d() != ((zzjd) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (obj instanceof J3) {
            J3 j32 = (J3) obj;
            int n4 = n();
            int n5 = j32.n();
            if (n4 != 0 && n5 != 0 && n4 != n5) {
                return false;
            }
            int d4 = d();
            if (d4 <= j32.d()) {
                if (d4 <= j32.d()) {
                    byte[] bArr = this.f29368I;
                    byte[] bArr2 = j32.f29368I;
                    j32.r();
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < d4) {
                        if (bArr[i4] != bArr2[i5]) {
                            return false;
                        }
                        i4++;
                        i5++;
                    }
                    return true;
                }
                throw new IllegalArgumentException("Ran off end of other: 0, " + d4 + ", " + j32.d());
            }
            throw new IllegalArgumentException("Length too large: " + d4 + d());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzjd
    protected final int f(int i4, int i5, int i6) {
        return C1503t4.d(i4, this.f29368I, 0, i6);
    }

    @Override // com.google.android.gms.internal.measurement.zzjd
    public final zzjd g(int i4, int i5) {
        int m4 = zzjd.m(0, i5, d());
        if (m4 == 0) {
            return zzjd.f29849F;
        }
        return new F3(this.f29368I, 0, m4);
    }

    @Override // com.google.android.gms.internal.measurement.zzjd
    protected final String j(Charset charset) {
        return new String(this.f29368I, 0, d(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzjd
    public final void k(B3 b32) throws IOException {
        ((Q3) b32).E(this.f29368I, 0, d());
    }

    @Override // com.google.android.gms.internal.measurement.zzjd
    public final boolean l() {
        return H5.f(this.f29368I, 0, d());
    }

    protected int r() {
        return 0;
    }
}
