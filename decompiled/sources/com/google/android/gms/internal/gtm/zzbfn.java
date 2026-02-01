package com.google.android.gms.internal.gtm;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbfn extends AbstractList {
    private final List zza;
    private final zzbfm zzb;

    public zzbfn(List list, zzbfm zzbfmVar) {
        this.zza = list;
        this.zzb = zzbfmVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        return this.zzb.zzb(this.zza.get(i4));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
