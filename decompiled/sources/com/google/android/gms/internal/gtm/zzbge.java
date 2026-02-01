package com.google.android.gms.internal.gtm;

import java.util.List;

/* loaded from: classes.dex */
final class zzbge extends zzbgg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbge(zzbgd zzbgdVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbgg
    public final List zza(Object obj, long j4) {
        int i4;
        zzbfp zzbfpVar = (zzbfp) zzbij.zzf(obj, j4);
        if (!zzbfpVar.zzc()) {
            int size = zzbfpVar.size();
            if (size == 0) {
                i4 = 10;
            } else {
                i4 = size + size;
            }
            zzbfp zzd = zzbfpVar.zzd(i4);
            zzbij.zzs(obj, j4, zzd);
            return zzd;
        }
        return zzbfpVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbgg
    public final void zzb(Object obj, long j4) {
        ((zzbfp) zzbij.zzf(obj, j4)).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbgg
    public final void zzc(Object obj, Object obj2, long j4) {
        zzbfp zzbfpVar = (zzbfp) zzbij.zzf(obj, j4);
        zzbfp zzbfpVar2 = (zzbfp) zzbij.zzf(obj2, j4);
        int size = zzbfpVar.size();
        int size2 = zzbfpVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzbfpVar.zzc()) {
                zzbfpVar = zzbfpVar.zzd(size2 + size);
            }
            zzbfpVar.addAll(zzbfpVar2);
        }
        if (size > 0) {
            zzbfpVar2 = zzbfpVar;
        }
        zzbij.zzs(obj, j4, zzbfpVar2);
    }

    private zzbge() {
        super(null);
    }
}
