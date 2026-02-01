package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1443m implements Iterator {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ Iterator f29715E;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1443m(Iterator it) {
        this.f29715E = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29715E.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new C1514v((String) this.f29715E.next());
    }
}
