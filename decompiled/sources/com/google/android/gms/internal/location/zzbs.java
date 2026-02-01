package com.google.android.gms.internal.location;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public abstract class zzbs<E> extends zzbp<E> implements List<E>, RandomAccess {

    /* renamed from: F, reason: collision with root package name */
    private static final W<Object> f29256F = new S(U.f29199I, 0);

    public static <E> zzbs<E> m() {
        return (zzbs<E>) U.f29199I;
    }

    public static <E> zzbs<E> n(Collection<? extends E> collection) {
        if (collection instanceof zzbp) {
            zzbs<E> g4 = ((zzbp) collection).g();
            if (g4.j()) {
                Object[] array = g4.toArray();
                return o(array, array.length);
            }
            return g4;
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (array2[i4] == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i4);
                throw new NullPointerException(sb.toString());
            }
        }
        return o(array2, length);
    }

    static <E> zzbs<E> o(Object[] objArr, int i4) {
        if (i4 == 0) {
            return (zzbs<E>) U.f29199I;
        }
        return new U(objArr, i4);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i4, E e4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i4, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.location.zzbp
    /* renamed from: b */
    public final V<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(@NullableDecl Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i4 = 0; i4 < size; i4++) {
                        if (N.a(get(i4), list.get(i4))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !N.a(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final zzbs<E> g() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i4 = 1;
        for (int i5 = 0; i5 < size; i5++) {
            i4 = (i4 * 31) + get(i5).hashCode();
        }
        return i4;
    }

    @Override // java.util.List
    public final int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            if (obj.equals(get(i4))) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.location.zzbp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.location.zzbp
    int k(Object[] objArr, int i4) {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            objArr[i5] = get(i5);
        }
        return size;
    }

    @Override // java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public zzbs<E> subList(int i4, int i5) {
        O.c(i4, i5, size());
        int i6 = i5 - i4;
        if (i6 == size()) {
            return this;
        }
        if (i6 == 0) {
            return (zzbs<E>) U.f29199I;
        }
        return new T(this, i4, i6);
    }

    @Override // java.util.List
    public final int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final W<E> listIterator(int i4) {
        O.b(i4, size(), FirebaseAnalytics.b.f34777X);
        if (isEmpty()) {
            return (W<E>) f29256F;
        }
        return new S(this, i4);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i4, E e4) {
        throw new UnsupportedOperationException();
    }
}
