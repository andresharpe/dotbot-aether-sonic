package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.measurement.u5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1512u5 implements ListIterator {

    /* renamed from: E, reason: collision with root package name */
    final ListIterator f29805E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ int f29806F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ C1528w5 f29807G;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1512u5(C1528w5 c1528w5, int i4) {
        InterfaceC1535x4 interfaceC1535x4;
        this.f29807G = c1528w5;
        this.f29806F = i4;
        interfaceC1535x4 = c1528w5.f29826E;
        this.f29805E = interfaceC1535x4.listIterator(i4);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f29805E.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f29805E.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f29805E.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f29805E.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f29805E.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f29805E.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
