package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzbfw implements Iterator {
    private final Iterator zza;

    public zzbfw(Iterator it) {
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        if (entry.getValue() instanceof zzbfx) {
            return new zzbfv(entry, null);
        }
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
    }
}
