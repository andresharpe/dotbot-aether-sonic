package com.google.android.gms.internal.gtm;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbio {
    private static final zzbil zza;

    static {
        if (zzbij.zzx() && zzbij.zzy()) {
            int i4 = zzbbb.zza;
        }
        zza = new zzbim();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i4, int i5) {
        byte b4 = bArr[i4 - 1];
        int i6 = i5 - i4;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    byte b5 = bArr[i4];
                    byte b6 = bArr[i4 + 1];
                    if (b4 <= -12 && b5 <= -65 && b6 <= -65) {
                        return ((b5 << 8) ^ b4) ^ (b6 << 16);
                    }
                } else {
                    throw new AssertionError();
                }
            } else {
                byte b7 = bArr[i4];
                if (b4 <= -12 && b7 <= -65) {
                    return b4 ^ (b7 << 8);
                }
            }
        } else if (b4 <= -12) {
            return b4;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fe, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzb(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzbio.zzb(java.lang.CharSequence, byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(CharSequence charSequence) {
        int length = charSequence.length();
        int i4 = 0;
        int i5 = 0;
        while (i5 < length && charSequence.charAt(i5) < 128) {
            i5++;
        }
        int i6 = length;
        while (true) {
            if (i5 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i5);
            if (charAt < 2048) {
                i6 += (127 - charAt) >>> 31;
                i5++;
            } else {
                int length2 = charSequence.length();
                while (i5 < length2) {
                    char charAt2 = charSequence.charAt(i5);
                    if (charAt2 < 2048) {
                        i4 += (127 - charAt2) >>> 31;
                    } else {
                        i4 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i5) >= 65536) {
                                i5++;
                            } else {
                                throw new zzbin(i5, length2);
                            }
                        }
                    }
                    i5++;
                }
                i6 += i4;
            }
        }
        if (i6 >= length) {
            return i6;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i6 + 4294967296L));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzd(byte[] bArr, int i4, int i5) throws zzbfs {
        int length = bArr.length;
        if ((i4 | i5 | ((length - i4) - i5)) >= 0) {
            int i6 = i4 + i5;
            char[] cArr = new char[i5];
            int i7 = 0;
            while (i4 < i6) {
                byte b4 = bArr[i4];
                if (!zzbik.zzd(b4)) {
                    break;
                }
                i4++;
                cArr[i7] = (char) b4;
                i7++;
            }
            int i8 = i7;
            while (i4 < i6) {
                int i9 = i4 + 1;
                byte b5 = bArr[i4];
                if (zzbik.zzd(b5)) {
                    cArr[i8] = (char) b5;
                    i8++;
                    i4 = i9;
                    while (i4 < i6) {
                        byte b6 = bArr[i4];
                        if (!zzbik.zzd(b6)) {
                            break;
                        }
                        i4++;
                        cArr[i8] = (char) b6;
                        i8++;
                    }
                } else if (b5 < -32) {
                    if (i9 < i6) {
                        i4 += 2;
                        zzbik.zzc(b5, bArr[i9], cArr, i8);
                        i8++;
                    } else {
                        throw zzbfs.zzd();
                    }
                } else if (b5 < -16) {
                    if (i9 < i6 - 1) {
                        int i10 = i4 + 2;
                        i4 += 3;
                        zzbik.zzb(b5, bArr[i9], bArr[i10], cArr, i8);
                        i8++;
                    } else {
                        throw zzbfs.zzd();
                    }
                } else if (i9 < i6 - 2) {
                    int i11 = i4 + 2;
                    int i12 = i4 + 3;
                    i4 += 4;
                    zzbik.zza(b5, bArr[i9], bArr[i11], bArr[i12], cArr, i8);
                    i8 += 2;
                } else {
                    throw zzbfs.zzd();
                }
            }
            return new String(cArr, 0, i8);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i4), Integer.valueOf(i5)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zze(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzf(byte[] bArr, int i4, int i5) {
        return zza.zzb(bArr, i4, i5);
    }
}
