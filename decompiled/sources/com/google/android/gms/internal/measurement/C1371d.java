package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1371d implements Iterator {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ Iterator f29613E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ Iterator f29614F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1371d(C1387f c1387f, Iterator it, Iterator it2) {
        this.f29613E = it;
        this.f29614F = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f29613E.hasNext()) {
            return true;
        }
        return this.f29614F.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f29613E.hasNext()) {
            return new C1514v(((Integer) this.f29613E.next()).toString());
        }
        if (this.f29614F.hasNext()) {
            return new C1514v((String) this.f29614F.next());
        }
        throw new NoSuchElementException();
    }
}
