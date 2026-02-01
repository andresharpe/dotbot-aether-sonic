package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C1285y;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzff {
    final /* synthetic */ zzfg zza;
    private int zzb;
    private final ByteArrayOutputStream zzc = new ByteArrayOutputStream();

    public zzff(zzfg zzfgVar) {
        this.zza = zzfgVar;
    }

    public final int zza() {
        return this.zzb;
    }

    public final boolean zzb(zzez zzezVar) {
        byte[] bArr;
        C1285y.l(zzezVar);
        int i4 = this.zzb;
        this.zza.zzw();
        if (i4 + 1 > zzcv.zzg()) {
            return false;
        }
        String zza = this.zza.zza(zzezVar, false);
        if (zza == null) {
            this.zza.zzz().zzb(zzezVar, "Error formatting hit");
            return true;
        }
        byte[] bytes = zza.getBytes();
        int length = bytes.length;
        this.zza.zzw();
        if (length > zzcv.zzf()) {
            this.zza.zzz().zzb(zzezVar, "Hit size exceeds the maximum size limit");
            return true;
        }
        if (this.zzc.size() > 0) {
            length++;
        }
        int size = this.zzc.size();
        this.zza.zzw();
        if (size + length > ((Integer) zzew.zzA.zzb()).intValue()) {
            return false;
        }
        try {
            if (this.zzc.size() > 0) {
                ByteArrayOutputStream byteArrayOutputStream = this.zzc;
                bArr = zzfg.zza;
                byteArrayOutputStream.write(bArr);
            }
            this.zzc.write(bytes);
            this.zzb++;
            return true;
        } catch (IOException e4) {
            this.zza.zzJ("Failed to write payload when batching hits", e4);
            return true;
        }
    }

    public final byte[] zzc() {
        return this.zzc.toByteArray();
    }
}
