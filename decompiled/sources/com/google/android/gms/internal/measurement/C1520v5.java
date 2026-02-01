package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.v5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1520v5 implements Iterator {

    /* renamed from: E, reason: collision with root package name */
    final Iterator f29818E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ C1528w5 f29819F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1520v5(C1528w5 c1528w5) {
        InterfaceC1535x4 interfaceC1535x4;
        this.f29819F = c1528w5;
        interfaceC1535x4 = c1528w5.f29826E;
        this.f29818E = interfaceC1535x4.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29818E.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f29818E.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
