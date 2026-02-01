package com.google.android.gms.internal.gtm;

import java.io.IOException;
import kotlinx.coroutines.scheduling.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbbg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i4, zzbbf zzbbfVar) throws zzbfs {
        int zzj = zzj(bArr, i4, zzbbfVar);
        int i5 = zzbbfVar.zza;
        if (i5 >= 0) {
            if (i5 <= bArr.length - zzj) {
                if (i5 == 0) {
                    zzbbfVar.zzc = zzbbw.zzb;
                    return zzj;
                }
                zzbbfVar.zzc = zzbbw.zzn(bArr, zzj, i5);
                return zzj + i5;
            }
            throw zzbfs.zzj();
        }
        throw zzbfs.zzf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(byte[] bArr, int i4) {
        return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(zzbhf zzbhfVar, byte[] bArr, int i4, int i5, int i6, zzbbf zzbbfVar) throws IOException {
        zzbgv zzbgvVar = (zzbgv) zzbhfVar;
        Object zze = zzbgvVar.zze();
        int zzc = zzbgvVar.zzc(zze, bArr, i4, i5, i6, zzbbfVar);
        zzbgvVar.zzf(zze);
        zzbbfVar.zzc = zze;
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(zzbhf zzbhfVar, byte[] bArr, int i4, int i5, zzbbf zzbbfVar) throws IOException {
        int i6 = i4 + 1;
        int i7 = bArr[i4];
        if (i7 < 0) {
            i6 = zzk(i7, bArr, i6, zzbbfVar);
            i7 = zzbbfVar.zza;
        }
        int i8 = i6;
        if (i7 >= 0 && i7 <= i5 - i8) {
            Object zze = zzbhfVar.zze();
            int i9 = i7 + i8;
            zzbhfVar.zzi(zze, bArr, i8, i9, zzbbfVar);
            zzbhfVar.zzf(zze);
            zzbbfVar.zzc = zze;
            return i9;
        }
        throw zzbfs.zzj();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(zzbhf zzbhfVar, int i4, byte[] bArr, int i5, int i6, zzbfp zzbfpVar, zzbbf zzbbfVar) throws IOException {
        int zzd = zzd(zzbhfVar, bArr, i5, i6, zzbbfVar);
        zzbfpVar.add(zzbbfVar.zzc);
        while (zzd < i6) {
            int zzj = zzj(bArr, zzd, zzbbfVar);
            if (i4 != zzbbfVar.zza) {
                break;
            }
            zzd = zzd(zzbhfVar, bArr, zzj, i6, zzbbfVar);
            zzbfpVar.add(zzbbfVar.zzc);
        }
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(byte[] bArr, int i4, zzbfp zzbfpVar, zzbbf zzbbfVar) throws IOException {
        zzbfg zzbfgVar = (zzbfg) zzbfpVar;
        int zzj = zzj(bArr, i4, zzbbfVar);
        int i5 = zzbbfVar.zza + zzj;
        while (zzj < i5) {
            zzj = zzj(bArr, zzj, zzbbfVar);
            zzbfgVar.zzh(zzbbfVar.zza);
        }
        if (zzj == i5) {
            return zzj;
        }
        throw zzbfs.zzj();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(byte[] bArr, int i4, zzbbf zzbbfVar) throws zzbfs {
        int zzj = zzj(bArr, i4, zzbbfVar);
        int i5 = zzbbfVar.zza;
        if (i5 >= 0) {
            if (i5 == 0) {
                zzbbfVar.zzc = "";
                return zzj;
            }
            zzbbfVar.zzc = new String(bArr, zzj, i5, zzbfq.zzb);
            return zzj + i5;
        }
        throw zzbfs.zzf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(byte[] bArr, int i4, zzbbf zzbbfVar) throws zzbfs {
        int zzj = zzj(bArr, i4, zzbbfVar);
        int i5 = zzbbfVar.zza;
        if (i5 >= 0) {
            if (i5 == 0) {
                zzbbfVar.zzc = "";
                return zzj;
            }
            zzbbfVar.zzc = zzbio.zzd(bArr, zzj, i5);
            return zzj + i5;
        }
        throw zzbfs.zzf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(int i4, byte[] bArr, int i5, int i6, zzbia zzbiaVar, zzbbf zzbbfVar) throws zzbfs {
        if ((i4 >>> 3) != 0) {
            int i7 = i4 & 7;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 == 5) {
                                zzbiaVar.zzh(i4, Integer.valueOf(zzb(bArr, i5)));
                                return i5 + 4;
                            }
                            throw zzbfs.zzc();
                        }
                        int i8 = (i4 & (-8)) | 4;
                        zzbia zze = zzbia.zze();
                        int i9 = 0;
                        while (true) {
                            if (i5 >= i6) {
                                break;
                            }
                            int zzj = zzj(bArr, i5, zzbbfVar);
                            int i10 = zzbbfVar.zza;
                            if (i10 == i8) {
                                i9 = i10;
                                i5 = zzj;
                                break;
                            }
                            i9 = i10;
                            i5 = zzi(i10, bArr, zzj, i6, zze, zzbbfVar);
                        }
                        if (i5 <= i6 && i9 == i8) {
                            zzbiaVar.zzh(i4, zze);
                            return i5;
                        }
                        throw zzbfs.zzg();
                    }
                    int zzj2 = zzj(bArr, i5, zzbbfVar);
                    int i11 = zzbbfVar.zza;
                    if (i11 >= 0) {
                        if (i11 <= bArr.length - zzj2) {
                            if (i11 == 0) {
                                zzbiaVar.zzh(i4, zzbbw.zzb);
                            } else {
                                zzbiaVar.zzh(i4, zzbbw.zzn(bArr, zzj2, i11));
                            }
                            return zzj2 + i11;
                        }
                        throw zzbfs.zzj();
                    }
                    throw zzbfs.zzf();
                }
                zzbiaVar.zzh(i4, Long.valueOf(zzo(bArr, i5)));
                return i5 + 8;
            }
            int zzm = zzm(bArr, i5, zzbbfVar);
            zzbiaVar.zzh(i4, Long.valueOf(zzbbfVar.zzb));
            return zzm;
        }
        throw zzbfs.zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(byte[] bArr, int i4, zzbbf zzbbfVar) {
        int i5 = i4 + 1;
        byte b4 = bArr[i4];
        if (b4 >= 0) {
            zzbbfVar.zza = b4;
            return i5;
        }
        return zzk(b4, bArr, i5, zzbbfVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(int i4, byte[] bArr, int i5, zzbbf zzbbfVar) {
        int i6 = i4 & q.f54649c;
        int i7 = i5 + 1;
        byte b4 = bArr[i5];
        if (b4 >= 0) {
            zzbbfVar.zza = i6 | (b4 << 7);
            return i7;
        }
        int i8 = i6 | ((b4 & Byte.MAX_VALUE) << 7);
        int i9 = i5 + 2;
        byte b5 = bArr[i7];
        if (b5 >= 0) {
            zzbbfVar.zza = i8 | (b5 << 14);
            return i9;
        }
        int i10 = i8 | ((b5 & Byte.MAX_VALUE) << 14);
        int i11 = i5 + 3;
        byte b6 = bArr[i9];
        if (b6 >= 0) {
            zzbbfVar.zza = i10 | (b6 << 21);
            return i11;
        }
        int i12 = i10 | ((b6 & Byte.MAX_VALUE) << 21);
        int i13 = i5 + 4;
        byte b7 = bArr[i11];
        if (b7 >= 0) {
            zzbbfVar.zza = i12 | (b7 << 28);
            return i13;
        }
        int i14 = i12 | ((b7 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] < 0) {
                i13 = i15;
            } else {
                zzbbfVar.zza = i14;
                return i15;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(int i4, byte[] bArr, int i5, int i6, zzbfp zzbfpVar, zzbbf zzbbfVar) {
        zzbfg zzbfgVar = (zzbfg) zzbfpVar;
        int zzj = zzj(bArr, i5, zzbbfVar);
        zzbfgVar.zzh(zzbbfVar.zza);
        while (zzj < i6) {
            int zzj2 = zzj(bArr, zzj, zzbbfVar);
            if (i4 != zzbbfVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzbbfVar);
            zzbfgVar.zzh(zzbbfVar.zza);
        }
        return zzj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzm(byte[] bArr, int i4, zzbbf zzbbfVar) {
        int i5 = i4 + 1;
        long j4 = bArr[i4];
        if (j4 >= 0) {
            zzbbfVar.zzb = j4;
            return i5;
        }
        int i6 = i4 + 2;
        byte b4 = bArr[i5];
        long j5 = (j4 & 127) | ((b4 & Byte.MAX_VALUE) << 7);
        int i7 = 7;
        while (b4 < 0) {
            int i8 = i6 + 1;
            i7 += 7;
            j5 |= (r10 & Byte.MAX_VALUE) << i7;
            b4 = bArr[i6];
            i6 = i8;
        }
        zzbbfVar.zzb = j5;
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzn(int i4, byte[] bArr, int i5, int i6, zzbbf zzbbfVar) throws zzbfs {
        if ((i4 >>> 3) != 0) {
            int i7 = i4 & 7;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 == 5) {
                                return i5 + 4;
                            }
                            throw zzbfs.zzc();
                        }
                        int i8 = (i4 & (-8)) | 4;
                        int i9 = 0;
                        while (i5 < i6) {
                            i5 = zzj(bArr, i5, zzbbfVar);
                            i9 = zzbbfVar.zza;
                            if (i9 == i8) {
                                break;
                            }
                            i5 = zzn(i9, bArr, i5, i6, zzbbfVar);
                        }
                        if (i5 <= i6 && i9 == i8) {
                            return i5;
                        }
                        throw zzbfs.zzg();
                    }
                    return zzj(bArr, i5, zzbbfVar) + zzbbfVar.zza;
                }
                return i5 + 8;
            }
            return zzm(bArr, i5, zzbbfVar);
        }
        throw zzbfs.zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzo(byte[] bArr, int i4) {
        return ((bArr[i4 + 7] & 255) << 56) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48);
    }
}
