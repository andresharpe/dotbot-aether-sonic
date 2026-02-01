package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class zzbgc extends zzbgg {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbgc(zzbgb zzbgbVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List zzf(Object obj, long j4, int i4) {
        zzbfz zzbfzVar;
        List arrayList;
        List list = (List) zzbij.zzf(obj, j4);
        if (list.isEmpty()) {
            if (list instanceof zzbga) {
                arrayList = new zzbfz(i4);
            } else if ((list instanceof zzbha) && (list instanceof zzbfp)) {
                arrayList = ((zzbfp) list).zzd(i4);
            } else {
                arrayList = new ArrayList(i4);
            }
            zzbij.zzs(obj, j4, arrayList);
            return arrayList;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i4);
            arrayList2.addAll(list);
            zzbij.zzs(obj, j4, arrayList2);
            zzbfzVar = arrayList2;
        } else if (list instanceof zzbie) {
            zzbfz zzbfzVar2 = new zzbfz(list.size() + i4);
            zzbfzVar2.addAll(zzbfzVar2.size(), (zzbie) list);
            zzbij.zzs(obj, j4, zzbfzVar2);
            zzbfzVar = zzbfzVar2;
        } else {
            if ((list instanceof zzbha) && (list instanceof zzbfp)) {
                zzbfp zzbfpVar = (zzbfp) list;
                if (!zzbfpVar.zzc()) {
                    zzbfp zzd = zzbfpVar.zzd(list.size() + i4);
                    zzbij.zzs(obj, j4, zzd);
                    return zzd;
                }
                return list;
            }
            return list;
        }
        return zzbfzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbgg
    public final List zza(Object obj, long j4) {
        return zzf(obj, j4, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbgg
    public final void zzb(Object obj, long j4) {
        Object unmodifiableList;
        List list = (List) zzbij.zzf(obj, j4);
        if (list instanceof zzbga) {
            unmodifiableList = ((zzbga) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzbha) && (list instanceof zzbfp)) {
                zzbfp zzbfpVar = (zzbfp) list;
                if (zzbfpVar.zzc()) {
                    zzbfpVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzbij.zzs(obj, j4, unmodifiableList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbgg
    public final void zzc(Object obj, Object obj2, long j4) {
        List list = (List) zzbij.zzf(obj2, j4);
        List zzf = zzf(obj, j4, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzbij.zzs(obj, j4, list);
    }

    private zzbgc() {
        super(null);
    }
}
