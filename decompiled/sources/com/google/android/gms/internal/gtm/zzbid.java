package com.google.android.gms.internal.gtm;

import java.util.Iterator;

/* loaded from: classes.dex */
final class zzbid implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzbie zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbid(zzbie zzbieVar) {
        zzbga zzbgaVar;
        this.zzb = zzbieVar;
        zzbgaVar = zzbieVar.zza;
        this.zza = zzbgaVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
