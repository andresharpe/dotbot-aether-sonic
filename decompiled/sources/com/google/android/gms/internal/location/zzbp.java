package com.google.android.gms.internal.location;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public abstract class zzbp<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private static final Object[] f29255E = new Object[0];

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract V<E> iterator();

    /* JADX INFO: Access modifiers changed from: package-private */
    @NullableDecl
    public Object[] c() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        throw null;
    }

    int f() {
        throw null;
    }

    public zzbs<E> g() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean j();

    int k(Object[] objArr, int i4) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f29255E);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int size = size();
        int length = tArr.length;
        if (length < size) {
            Object[] c4 = c();
            if (c4 == null) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            } else {
                return (T[]) Arrays.copyOfRange(c4, d(), f(), tArr.getClass());
            }
        } else if (length > size) {
            tArr[size] = null;
        }
        k(tArr, 0);
        return tArr;
    }
}
