package com.google.android.gms.internal.gtm;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class zzbfq {
    static final Charset zza = Charset.forName("US-ASCII");
    static final Charset zzb = Charset.forName("UTF-8");
    static final Charset zzc = Charset.forName("ISO-8859-1");
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzbcc zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        int i4 = zzbcc.zzd;
        zzbby zzbbyVar = new zzbby(bArr, 0, 0, false, null);
        try {
            zzbbyVar.zzb(0);
            zzf = zzbbyVar;
        } catch (zzbfs e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static int zza(boolean z3) {
        return z3 ? 1231 : 1237;
    }

    public static int zzb(byte[] bArr) {
        int length = bArr.length;
        int zzd2 = zzd(length, bArr, 0, length);
        if (zzd2 == 0) {
            return 1;
        }
        return zzd2;
    }

    public static int zzc(long j4) {
        return (int) (j4 ^ (j4 >>> 32));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i4, byte[] bArr, int i5, int i6) {
        for (int i7 = i5; i7 < i5 + i6; i7++) {
            i4 = (i4 * 31) + bArr[i7];
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zze(Object obj) {
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzf(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzg(Object obj, Object obj2) {
        return ((zzbgs) obj).zzat().zzx((zzbgs) obj2).zzD();
    }

    public static String zzh(byte[] bArr) {
        return new String(bArr, zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzi(zzbgs zzbgsVar) {
        if (!(zzbgsVar instanceof zzbaz)) {
            return false;
        }
        throw null;
    }

    public static boolean zzj(byte[] bArr) {
        return zzbio.zze(bArr);
    }
}
