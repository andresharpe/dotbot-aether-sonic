package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class zzbcj extends zzbbm {
    private static final Logger zza = Logger.getLogger(zzbcj.class.getName());
    private static final boolean zzb = zzbij.zzx();
    zzbck zze;

    private zzbcj() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int zzA(int i4, zzbgs zzbgsVar, zzbhf zzbhfVar) {
        int zzJ = zzJ(i4 << 3);
        int i5 = zzJ + zzJ;
        zzbay zzbayVar = (zzbay) zzbgsVar;
        int zzQ = zzbayVar.zzQ();
        if (zzQ == -1) {
            zzQ = zzbhfVar.zza(zzbayVar);
            zzbayVar.zzT(zzQ);
        }
        return i5 + zzQ;
    }

    @Deprecated
    public static int zzB(zzbgs zzbgsVar) {
        return zzbgsVar.zzY();
    }

    public static int zzC(int i4) {
        if (i4 >= 0) {
            return zzJ(i4);
        }
        return 10;
    }

    public static int zzD(zzbfy zzbfyVar) {
        int zza2 = zzbfyVar.zza();
        return zzJ(zza2) + zza2;
    }

    public static int zzE(zzbgs zzbgsVar) {
        int zzY = zzbgsVar.zzY();
        return zzJ(zzY) + zzY;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzF(zzbgs zzbgsVar, zzbhf zzbhfVar) {
        zzbay zzbayVar = (zzbay) zzbgsVar;
        int zzQ = zzbayVar.zzQ();
        if (zzQ == -1) {
            zzQ = zzbhfVar.zza(zzbayVar);
            zzbayVar.zzT(zzQ);
        }
        return zzJ(zzQ) + zzQ;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzG(int i4) {
        if (i4 > 4096) {
            return 4096;
        }
        return i4;
    }

    public static int zzH(String str) {
        int length;
        try {
            length = zzbio.zzc(str);
        } catch (zzbin unused) {
            length = str.getBytes(zzbfq.zzb).length;
        }
        return zzJ(length) + length;
    }

    public static int zzI(int i4) {
        return zzJ(i4 << 3);
    }

    public static int zzJ(int i4) {
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

    public static int zzK(long j4) {
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

    public static zzbcj zzL(byte[] bArr) {
        return new zzbcf(bArr, 0, bArr.length);
    }

    public static zzbcj zzM(OutputStream outputStream, int i4) {
        return new zzbch(outputStream, i4);
    }

    public static int zzy(byte[] bArr) {
        int length = bArr.length;
        return zzJ(length) + length;
    }

    public static int zzz(zzbbw zzbbwVar) {
        int zzd = zzbbwVar.zzd();
        return zzJ(zzd) + zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzN(String str, zzbin zzbinVar) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzbinVar);
        byte[] bytes = str.getBytes(zzbfq.zzb);
        try {
            int length = bytes.length;
            zzu(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzbcg(e4);
        }
    }

    public abstract void zzR() throws IOException;

    public abstract void zzS(byte b4) throws IOException;

    public abstract void zzT(int i4, boolean z3) throws IOException;

    public abstract void zzU(int i4, zzbbw zzbbwVar) throws IOException;

    @Override // com.google.android.gms.internal.gtm.zzbbm
    public abstract void zza(byte[] bArr, int i4, int i5) throws IOException;

    public abstract int zzb();

    public abstract void zzh(int i4, int i5) throws IOException;

    public abstract void zzi(int i4) throws IOException;

    public abstract void zzj(int i4, long j4) throws IOException;

    public abstract void zzk(long j4) throws IOException;

    public abstract void zzl(int i4, int i5) throws IOException;

    public abstract void zzm(int i4) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzn(int i4, zzbgs zzbgsVar, zzbhf zzbhfVar) throws IOException;

    public abstract void zzo(int i4, zzbgs zzbgsVar) throws IOException;

    public abstract void zzp(int i4, zzbbw zzbbwVar) throws IOException;

    public abstract void zzq(int i4, String str) throws IOException;

    public abstract void zzs(int i4, int i5) throws IOException;

    public abstract void zzt(int i4, int i5) throws IOException;

    public abstract void zzu(int i4) throws IOException;

    public abstract void zzv(int i4, long j4) throws IOException;

    public abstract void zzw(long j4) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbcj(zzbci zzbciVar) {
    }
}
