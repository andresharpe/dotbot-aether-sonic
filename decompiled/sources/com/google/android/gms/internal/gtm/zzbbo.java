package com.google.android.gms.internal.gtm;

import java.util.Comparator;

/* loaded from: classes.dex */
final class zzbbo implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzbbw zzbbwVar = (zzbbw) obj;
        zzbbw zzbbwVar2 = (zzbbw) obj2;
        zzbbn zzbbnVar = new zzbbn(zzbbwVar);
        zzbbn zzbbnVar2 = new zzbbn(zzbbwVar2);
        while (zzbbnVar.hasNext() && zzbbnVar2.hasNext()) {
            int compareTo = Integer.valueOf(zzbbnVar.zza() & 255).compareTo(Integer.valueOf(zzbbnVar2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzbbwVar.zzd()).compareTo(Integer.valueOf(zzbbwVar2.zzd()));
    }
}
