package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.w5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1528w5 extends AbstractList implements RandomAccess, InterfaceC1535x4 {

    /* renamed from: E, reason: collision with root package name */
    private final InterfaceC1535x4 f29826E;

    public C1528w5(InterfaceC1535x4 interfaceC1535x4) {
        this.f29826E = interfaceC1535x4;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1535x4
    public final void P(zzjd zzjdVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i4) {
        return ((C1527w4) this.f29826E).get(i4);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C1520v5(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i4) {
        return new C1512u5(this, i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29826E.size();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1535x4
    public final InterfaceC1535x4 zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1535x4
    public final Object zzf(int i4) {
        return this.f29826E.zzf(i4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1535x4
    public final List zzh() {
        return this.f29826E.zzh();
    }
}
