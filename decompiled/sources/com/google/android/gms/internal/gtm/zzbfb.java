package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzbfb extends zzbff implements zzbgt {
    protected zzbeu zzb = zzbeu.zze();

    private final void zzc(zzbfd zzbfdVar) {
        if (zzbfdVar.zza == ((zzbff) zzb(6, null, null))) {
        } else {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzbeu zzV() {
        if (this.zzb.zzl()) {
            this.zzb = this.zzb.clone();
        }
        return this.zzb;
    }

    public final Object zzW(zzben zzbenVar) {
        zzbfd zzbfdVar = (zzbfd) zzbenVar;
        zzc(zzbfdVar);
        Object zzf = this.zzb.zzf(zzbfdVar.zzd);
        if (zzf == null) {
            return zzbfdVar.zzb;
        }
        zzbfc zzbfcVar = zzbfdVar.zzd;
        if (zzbfcVar.zzd) {
            if (zzbfcVar.zzc.zza() == zzbiq.ENUM) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) zzf).iterator();
                while (it.hasNext()) {
                    arrayList.add(zzbfdVar.zza(it.next()));
                }
                return arrayList;
            }
            return zzf;
        }
        return zzbfdVar.zza(zzf);
    }

    public final boolean zzX(zzben zzbenVar) {
        zzbfd zzbfdVar = (zzbfd) zzbenVar;
        zzc(zzbfdVar);
        zzbeu zzbeuVar = this.zzb;
        zzbfc zzbfcVar = zzbfdVar.zzd;
        if (!zzbfcVar.zzd) {
            if (zzbeuVar.zza.get(zzbfcVar) != null) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }
}
