package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C2191n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbca extends zzbcc {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbca(InputStream inputStream, int i4, zzbbz zzbbzVar) {
        super(null);
        this.zzl = Integer.MAX_VALUE;
        zzbfq.zzf(inputStream, "input");
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final List zzu(int i4) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i4 > 0) {
            int min = Math.min(i4, 4096);
            byte[] bArr = new byte[min];
            int i5 = 0;
            while (i5 < min) {
                int read = this.zze.read(bArr, i5, min - i5);
                if (read != -1) {
                    this.zzk += read;
                    i5 += read;
                } else {
                    throw zzbfs.zzj();
                }
            }
            i4 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzv() {
        int i4 = this.zzg + this.zzh;
        this.zzg = i4;
        int i5 = this.zzk + i4;
        int i6 = this.zzl;
        if (i5 <= i6) {
            this.zzh = 0;
            return;
        }
        int i7 = i5 - i6;
        this.zzh = i7;
        this.zzg = i4 - i7;
    }

    private final void zzw(int i4) throws IOException {
        if (!zzx(i4)) {
            if (i4 > (Integer.MAX_VALUE - this.zzk) - this.zzi) {
                throw zzbfs.zzi();
            }
            throw zzbfs.zzj();
        }
    }

    private final boolean zzx(int i4) throws IOException {
        int i5 = this.zzi;
        int i6 = this.zzg;
        if (i5 + i4 > i6) {
            int i7 = this.zzk;
            if (i4 > (Integer.MAX_VALUE - i7) - i5 || i7 + i5 + i4 > this.zzl) {
                return false;
            }
            if (i5 > 0) {
                if (i6 > i5) {
                    byte[] bArr = this.zzf;
                    System.arraycopy(bArr, i5, bArr, 0, i6 - i5);
                }
                i7 = this.zzk + i5;
                this.zzk = i7;
                i6 = this.zzg - i5;
                this.zzg = i6;
                this.zzi = 0;
            }
            try {
                int read = this.zze.read(this.zzf, i6, Math.min(4096 - i6, (Integer.MAX_VALUE - i7) - i6));
                if (read != 0 && read >= -1 && read <= 4096) {
                    if (read <= 0) {
                        return false;
                    }
                    this.zzg += read;
                    zzv();
                    if (this.zzg >= i4) {
                        return true;
                    }
                    return zzx(i4);
                }
                throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            } catch (zzbfs e4) {
                e4.zzk();
                throw e4;
            }
        }
        throw new IllegalStateException("refillBuffer() called when " + i4 + " bytes were already available in buffer");
    }

    private final byte[] zzy(int i4, boolean z3) throws IOException {
        byte[] zzz = zzz(i4);
        if (zzz != null) {
            return zzz;
        }
        int i5 = this.zzi;
        int i6 = this.zzg;
        int i7 = i6 - i5;
        this.zzk += i6;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzu = zzu(i4 - i7);
        byte[] bArr = new byte[i4];
        System.arraycopy(this.zzf, i5, bArr, 0, i7);
        for (byte[] bArr2 : zzu) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i7, length);
            i7 += length;
        }
        return bArr;
    }

    private final byte[] zzz(int i4) throws IOException {
        if (i4 == 0) {
            return zzbfq.zzd;
        }
        if (i4 >= 0) {
            int i5 = this.zzk;
            int i6 = this.zzi;
            int i7 = i5 + i6 + i4;
            if ((-2147483647) + i7 <= 0) {
                int i8 = this.zzl;
                if (i7 <= i8) {
                    int i9 = this.zzg - i6;
                    int i10 = i4 - i9;
                    if (i10 >= 4096) {
                        try {
                            if (i10 > this.zze.available()) {
                                return null;
                            }
                        } catch (zzbfs e4) {
                            e4.zzk();
                            throw e4;
                        }
                    }
                    byte[] bArr = new byte[i4];
                    System.arraycopy(this.zzf, this.zzi, bArr, 0, i9);
                    this.zzk += this.zzg;
                    this.zzi = 0;
                    this.zzg = 0;
                    while (i9 < i4) {
                        try {
                            int read = this.zze.read(bArr, i9, i4 - i9);
                            if (read != -1) {
                                this.zzk += read;
                                i9 += read;
                            } else {
                                throw zzbfs.zzj();
                            }
                        } catch (zzbfs e5) {
                            e5.zzk();
                            throw e5;
                        }
                    }
                    return bArr;
                }
                zzr((i8 - i5) - i6);
                throw zzbfs.zzj();
            }
            throw zzbfs.zzi();
        }
        throw zzbfs.zzf();
    }

    @Override // com.google.android.gms.internal.gtm.zzbcc
    public final int zza() {
        return this.zzk + this.zzi;
    }

    @Override // com.google.android.gms.internal.gtm.zzbcc
    public final int zzb(int i4) throws zzbfs {
        if (i4 >= 0) {
            int i5 = i4 + this.zzk + this.zzi;
            int i6 = this.zzl;
            if (i5 <= i6) {
                this.zzl = i5;
                zzv();
                return i6;
            }
            throw zzbfs.zzj();
        }
        throw zzbfs.zzf();
    }

    @Override // com.google.android.gms.internal.gtm.zzbcc
    public final int zzc() throws IOException {
        if (zzi()) {
            this.zzj = 0;
            return 0;
        }
        int zzn = zzn();
        this.zzj = zzn;
        if ((zzn >>> 3) != 0) {
            return zzn;
        }
        throw zzbfs.zzc();
    }

    @Override // com.google.android.gms.internal.gtm.zzbcc
    public final zzbbw zzd() throws IOException {
        int zzn = zzn();
        int i4 = this.zzg;
        int i5 = this.zzi;
        if (zzn <= i4 - i5 && zzn > 0) {
            zzbbw zzn2 = zzbbw.zzn(this.zzf, i5, zzn);
            this.zzi += zzn;
            return zzn2;
        }
        if (zzn != 0) {
            byte[] zzz = zzz(zzn);
            if (zzz != null) {
                return zzbbw.zzm(zzz);
            }
            int i6 = this.zzi;
            int i7 = this.zzg;
            int i8 = i7 - i6;
            this.zzk += i7;
            this.zzi = 0;
            this.zzg = 0;
            List<byte[]> zzu = zzu(zzn - i8);
            byte[] bArr = new byte[zzn];
            System.arraycopy(this.zzf, i6, bArr, 0, i8);
            for (byte[] bArr2 : zzu) {
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i8, length);
                i8 += length;
            }
            return zzbbw.zzp(bArr);
        }
        return zzbbw.zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzbcc
    public final String zze() throws IOException {
        int zzn = zzn();
        if (zzn > 0) {
            int i4 = this.zzg;
            int i5 = this.zzi;
            if (zzn <= i4 - i5) {
                String str = new String(this.zzf, i5, zzn, zzbfq.zzb);
                this.zzi += zzn;
                return str;
            }
        }
        if (zzn == 0) {
            return "";
        }
        if (zzn <= this.zzg) {
            zzw(zzn);
            String str2 = new String(this.zzf, this.zzi, zzn, zzbfq.zzb);
            this.zzi += zzn;
            return str2;
        }
        return new String(zzy(zzn, false), zzbfq.zzb);
    }

    @Override // com.google.android.gms.internal.gtm.zzbcc
    public final String zzf() throws IOException {
        byte[] zzy;
        int zzn = zzn();
        int i4 = this.zzi;
        int i5 = this.zzg;
        if (zzn <= i5 - i4 && zzn > 0) {
            zzy = this.zzf;
            this.zzi = i4 + zzn;
        } else {
            if (zzn == 0) {
                return "";
            }
            i4 = 0;
            if (zzn <= i5) {
                zzw(zzn);
                zzy = this.zzf;
                this.zzi = zzn;
            } else {
                zzy = zzy(zzn, false);
            }
        }
        return zzbio.zzd(zzy, i4, zzn);
    }

    @Override // com.google.android.gms.internal.gtm.zzbcc
    public final void zzg(int i4) throws zzbfs {
        if (this.zzj == i4) {
        } else {
            throw zzbfs.zzb();
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbcc
    public final void zzh(int i4) {
        this.zzl = i4;
        zzv();
    }

    @Override // com.google.android.gms.internal.gtm.zzbcc
    public final boolean zzi() throws IOException {
        if (this.zzi == this.zzg && !zzx(1)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.gtm.zzbcc
    public final boolean zzj() throws IOException {
        if (zzp() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.gtm.zzbcc
    public final boolean zzk(int i4) throws IOException {
        int zzc;
        int i5 = i4 & 7;
        int i6 = 0;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 == 4) {
                            return false;
                        }
                        if (i5 == 5) {
                            zzr(4);
                            return true;
                        }
                        throw zzbfs.zza();
                    }
                    do {
                        zzc = zzc();
                        if (zzc == 0) {
                            break;
                        }
                    } while (zzk(zzc));
                    zzg(((i4 >>> 3) << 3) | 4);
                    return true;
                }
                zzr(zzn());
                return true;
            }
            zzr(8);
            return true;
        }
        if (this.zzg - this.zzi >= 10) {
            while (i6 < 10) {
                byte[] bArr = this.zzf;
                int i7 = this.zzi;
                this.zzi = i7 + 1;
                if (bArr[i7] < 0) {
                    i6++;
                }
            }
            throw zzbfs.zze();
        }
        while (i6 < 10) {
            if (zzl() < 0) {
                i6++;
            }
        }
        throw zzbfs.zze();
        return true;
    }

    public final byte zzl() throws IOException {
        if (this.zzi == this.zzg) {
            zzw(1);
        }
        byte[] bArr = this.zzf;
        int i4 = this.zzi;
        this.zzi = i4 + 1;
        return bArr[i4];
    }

    public final int zzm() throws IOException {
        int i4 = this.zzi;
        if (this.zzg - i4 < 4) {
            zzw(4);
            i4 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i4 + 4;
        return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
    }

    public final int zzn() throws IOException {
        int i4;
        int i5 = this.zzi;
        int i6 = this.zzg;
        if (i6 != i5) {
            byte[] bArr = this.zzf;
            int i7 = i5 + 1;
            byte b4 = bArr[i5];
            if (b4 >= 0) {
                this.zzi = i7;
                return b4;
            }
            if (i6 - i7 >= 9) {
                int i8 = i5 + 2;
                int i9 = (bArr[i7] << 7) ^ b4;
                if (i9 < 0) {
                    i4 = i9 ^ (-128);
                } else {
                    int i10 = i5 + 3;
                    int i11 = (bArr[i8] << 14) ^ i9;
                    if (i11 >= 0) {
                        i4 = i11 ^ 16256;
                    } else {
                        int i12 = i5 + 4;
                        int i13 = i11 ^ (bArr[i10] << 21);
                        if (i13 < 0) {
                            i4 = (-2080896) ^ i13;
                        } else {
                            i10 = i5 + 5;
                            byte b5 = bArr[i12];
                            int i14 = (i13 ^ (b5 << 28)) ^ 266354560;
                            if (b5 < 0) {
                                i12 = i5 + 6;
                                if (bArr[i10] < 0) {
                                    i10 = i5 + 7;
                                    if (bArr[i12] < 0) {
                                        i12 = i5 + 8;
                                        if (bArr[i10] < 0) {
                                            i10 = i5 + 9;
                                            if (bArr[i12] < 0) {
                                                int i15 = i5 + 10;
                                                if (bArr[i10] >= 0) {
                                                    i8 = i15;
                                                    i4 = i14;
                                                }
                                            }
                                        }
                                    }
                                }
                                i4 = i14;
                            }
                            i4 = i14;
                        }
                        i8 = i12;
                    }
                    i8 = i10;
                }
                this.zzi = i8;
                return i4;
            }
        }
        return (int) zzq();
    }

    public final long zzo() throws IOException {
        int i4 = this.zzi;
        if (this.zzg - i4 < 8) {
            zzw(8);
            i4 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i4 + 8;
        return ((bArr[i4 + 7] & 255) << 56) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48);
    }

    public final long zzp() throws IOException {
        long j4;
        long j5;
        int i4 = this.zzi;
        int i5 = this.zzg;
        if (i5 != i4) {
            byte[] bArr = this.zzf;
            int i6 = i4 + 1;
            byte b4 = bArr[i4];
            if (b4 >= 0) {
                this.zzi = i6;
                return b4;
            }
            if (i5 - i6 >= 9) {
                int i7 = i4 + 2;
                int i8 = (bArr[i6] << 7) ^ b4;
                if (i8 < 0) {
                    j4 = i8 ^ (-128);
                } else {
                    int i9 = i4 + 3;
                    int i10 = (bArr[i7] << 14) ^ i8;
                    if (i10 >= 0) {
                        j4 = i10 ^ 16256;
                    } else {
                        int i11 = i4 + 4;
                        int i12 = i10 ^ (bArr[i9] << 21);
                        if (i12 < 0) {
                            long j6 = (-2080896) ^ i12;
                            i7 = i11;
                            j4 = j6;
                        } else {
                            i9 = i4 + 5;
                            long j7 = i12 ^ (bArr[i11] << 28);
                            if (j7 >= 0) {
                                j4 = j7 ^ 266354560;
                            } else {
                                i7 = i4 + 6;
                                long j8 = (bArr[i9] << 35) ^ j7;
                                if (j8 < 0) {
                                    j5 = -34093383808L;
                                } else {
                                    int i13 = i4 + 7;
                                    long j9 = j8 ^ (bArr[i7] << 42);
                                    if (j9 >= 0) {
                                        j4 = j9 ^ 4363953127296L;
                                    } else {
                                        i7 = i4 + 8;
                                        j8 = j9 ^ (bArr[i13] << 49);
                                        if (j8 < 0) {
                                            j5 = -558586000294016L;
                                        } else {
                                            i13 = i4 + 9;
                                            long j10 = (j8 ^ (bArr[i7] << 56)) ^ 71499008037633920L;
                                            if (j10 < 0) {
                                                i7 = i4 + 10;
                                                if (bArr[i13] >= 0) {
                                                    j4 = j10;
                                                }
                                            } else {
                                                j4 = j10;
                                            }
                                        }
                                    }
                                    i7 = i13;
                                }
                                j4 = j8 ^ j5;
                            }
                        }
                    }
                    i7 = i9;
                }
                this.zzi = i7;
                return j4;
            }
        }
        return zzq();
    }

    final long zzq() throws IOException {
        long j4 = 0;
        for (int i4 = 0; i4 < 64; i4 += 7) {
            j4 |= (r3 & Byte.MAX_VALUE) << i4;
            if ((zzl() & C2191n.f52349b) == 0) {
                return j4;
            }
        }
        throw zzbfs.zze();
    }

    public final void zzr(int i4) throws IOException {
        int i5 = this.zzg;
        int i6 = this.zzi;
        int i7 = i5 - i6;
        if (i4 <= i7 && i4 >= 0) {
            this.zzi = i6 + i4;
            return;
        }
        if (i4 >= 0) {
            int i8 = this.zzk;
            int i9 = i8 + i6;
            int i10 = this.zzl;
            if (i9 + i4 <= i10) {
                this.zzk = i9;
                this.zzg = 0;
                this.zzi = 0;
                while (i7 < i4) {
                    try {
                        long j4 = i4 - i7;
                        try {
                            long skip = this.zze.skip(j4);
                            if (skip >= 0 && skip <= j4) {
                                if (skip == 0) {
                                    break;
                                } else {
                                    i7 += (int) skip;
                                }
                            } else {
                                throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            }
                        } catch (zzbfs e4) {
                            e4.zzk();
                            throw e4;
                        }
                    } catch (Throwable th) {
                        this.zzk += i7;
                        zzv();
                        throw th;
                    }
                }
                this.zzk += i7;
                zzv();
                if (i7 < i4) {
                    int i11 = this.zzg;
                    int i12 = i11 - this.zzi;
                    this.zzi = i11;
                    zzw(1);
                    while (true) {
                        int i13 = i4 - i12;
                        int i14 = this.zzg;
                        if (i13 > i14) {
                            i12 += i14;
                            this.zzi = i14;
                            zzw(1);
                        } else {
                            this.zzi = i13;
                            return;
                        }
                    }
                }
            } else {
                zzr((i10 - i8) - i6);
                throw zzbfs.zzj();
            }
        } else {
            throw zzbfs.zzf();
        }
    }
}
