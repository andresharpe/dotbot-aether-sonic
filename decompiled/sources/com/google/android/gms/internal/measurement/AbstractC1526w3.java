package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.w3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC1526w3 extends AbstractList implements InterfaceC1495s4 {

    /* renamed from: E, reason: collision with root package name */
    private boolean f29822E = true;

    @Override // java.util.AbstractList, java.util.List
    public void add(int i4, Object obj) {
        b();
        super.add(i4, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i4, Collection collection) {
        b();
        return super.addAll(i4, collection);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b() {
        if (this.f29822E) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        b();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i4 = 0; i4 < size; i4++) {
            if (!get(i4).equals(list.get(i4))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i4 = 1;
        for (int i5 = 0; i5 < size; i5++) {
            i4 = (i4 * 31) + get(i5).hashCode();
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i4) {
        b();
        return super.remove(i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        b();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        b();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i4, Object obj) {
        b();
        return super.set(i4, obj);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1495s4
    public final void zzb() {
        this.f29822E = false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1495s4
    public final boolean zzc() {
        return this.f29822E;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        b();
        return super.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        b();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
