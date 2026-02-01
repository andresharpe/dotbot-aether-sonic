package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzbho implements Iterator {
    final /* synthetic */ zzbhs zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbho(zzbhs zzbhsVar, zzbhn zzbhnVar) {
        this.zza = zzbhsVar;
    }

    private final Iterator zza() {
        Map map;
        if (this.zzd == null) {
            map = this.zza.zzc;
            this.zzd = map.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i4 = this.zzb + 1;
        list = this.zza.zzb;
        if (i4 < list.size()) {
            return true;
        }
        map = this.zza.zzc;
        if (!map.isEmpty() && zza().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        List list;
        List list2;
        this.zzc = true;
        int i4 = this.zzb + 1;
        this.zzb = i4;
        list = this.zza.zzb;
        if (i4 < list.size()) {
            list2 = this.zza.zzb;
            return (Map.Entry) list2.get(this.zzb);
        }
        return (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.zzc) {
            this.zzc = false;
            this.zza.zzn();
            int i4 = this.zzb;
            list = this.zza.zzb;
            if (i4 < list.size()) {
                zzbhs zzbhsVar = this.zza;
                int i5 = this.zzb;
                this.zzb = i5 - 1;
                zzbhsVar.zzl(i5);
                return;
            }
            zza().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
