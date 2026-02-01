package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.w4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1527w4 extends AbstractC1526w3 implements RandomAccess, InterfaceC1535x4 {

    /* renamed from: G, reason: collision with root package name */
    private static final C1527w4 f29823G;

    /* renamed from: H, reason: collision with root package name */
    public static final InterfaceC1535x4 f29824H;

    /* renamed from: F, reason: collision with root package name */
    private final List f29825F;

    static {
        C1527w4 c1527w4 = new C1527w4(10);
        f29823G = c1527w4;
        c1527w4.zzb();
        f29824H = c1527w4;
    }

    public C1527w4() {
        this(10);
    }

    private static String d(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzjd) {
            return ((zzjd) obj).q(C1503t4.f29791b);
        }
        return C1503t4.h((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1535x4
    public final void P(zzjd zzjdVar) {
        b();
        this.f29825F.add(zzjdVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i4, Object obj) {
        b();
        this.f29825F.add(i4, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.List
    public final boolean addAll(int i4, Collection collection) {
        b();
        if (collection instanceof InterfaceC1535x4) {
            collection = ((InterfaceC1535x4) collection).zzh();
        }
        boolean addAll = this.f29825F.addAll(i4, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String get(int i4) {
        Object obj = this.f29825F.get(i4);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzjd) {
            zzjd zzjdVar = (zzjd) obj;
            String q4 = zzjdVar.q(C1503t4.f29791b);
            if (zzjdVar.l()) {
                this.f29825F.set(i4, q4);
            }
            return q4;
        }
        byte[] bArr = (byte[]) obj;
        String h4 = C1503t4.h(bArr);
        if (C1503t4.i(bArr)) {
            this.f29825F.set(i4, h4);
        }
        return h4;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.f29825F.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i4) {
        b();
        Object remove = this.f29825F.remove(i4);
        ((AbstractList) this).modCount++;
        return d(remove);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i4, Object obj) {
        b();
        return d(this.f29825F.set(i4, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29825F.size();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1495s4
    public final /* bridge */ /* synthetic */ InterfaceC1495s4 zzd(int i4) {
        if (i4 >= size()) {
            ArrayList arrayList = new ArrayList(i4);
            arrayList.addAll(this.f29825F);
            return new C1527w4(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1535x4
    public final InterfaceC1535x4 zze() {
        if (zzc()) {
            return new C1528w5(this);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1535x4
    public final Object zzf(int i4) {
        return this.f29825F.get(i4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1535x4
    public final List zzh() {
        return Collections.unmodifiableList(this.f29825F);
    }

    public C1527w4(int i4) {
        this.f29825F = new ArrayList(i4);
    }

    private C1527w4(ArrayList arrayList) {
        this.f29825F = arrayList;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
