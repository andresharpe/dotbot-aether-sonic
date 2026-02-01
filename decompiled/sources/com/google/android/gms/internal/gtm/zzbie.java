package com.google.android.gms.internal.gtm;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class zzbie extends AbstractList implements RandomAccess, zzbga {
    private final zzbga zza;

    public zzbie(zzbga zzbgaVar) {
        this.zza = zzbgaVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i4) {
        return ((zzbfz) this.zza).get(i4);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzbid(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i4) {
        return new zzbic(this, i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.gtm.zzbga
    public final zzbga zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.gtm.zzbga
    public final Object zzf(int i4) {
        return this.zza.zzf(i4);
    }

    @Override // com.google.android.gms.internal.gtm.zzbga
    public final List zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.gtm.zzbga
    public final void zzi(zzbbw zzbbwVar) {
        throw new UnsupportedOperationException();
    }
}
