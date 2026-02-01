package com.google.android.gms.internal.common;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
import l1.InterfaceC2354a;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* loaded from: classes.dex */
public abstract class zzag extends zzac implements List, RandomAccess {

    /* renamed from: F, reason: collision with root package name */
    private static final j f29163F = new C1317e(C1320h.f29150I, 0);

    static zzag m(Object[] objArr, int i4) {
        if (i4 == 0) {
            return C1320h.f29150I;
        }
        return new C1320h(objArr, i4);
    }

    public static zzag n(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return o((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return C1320h.f29150I;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return q(next);
        }
        C1316d c1316d = new C1316d(4);
        c1316d.c(next);
        c1316d.d(it);
        c1316d.f29145c = true;
        return m(c1316d.f29143a, c1316d.f29144b);
    }

    public static zzag o(Collection collection) {
        if (collection instanceof zzac) {
            zzag f4 = ((zzac) collection).f();
            if (f4.j()) {
                Object[] array = f4.toArray();
                return m(array, array.length);
            }
            return f4;
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        C1319g.a(array2, length);
        return m(array2, length);
    }

    public static zzag p() {
        return C1320h.f29150I;
    }

    public static zzag q(Object obj) {
        Object[] objArr = {obj};
        C1319g.a(objArr, 1);
        return m(objArr, 1);
    }

    public static zzag r(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        C1319g.a(objArr, 2);
        return m(objArr, 2);
    }

    @Override // java.util.List
    @l1.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(int i4, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @InterfaceC2354a
    @l1.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(int i4, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.common.zzac
    int b(Object[] objArr, int i4) {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            objArr[i5] = get(i5);
        }
        return size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(@CheckForNull Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i4 = 0; i4 < size; i4++) {
                        if (A.a(get(i4), list.get(i4))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !A.a(it.next(), it2.next())) {
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

    @Override // com.google.android.gms.internal.common.zzac
    @l1.l(replacement = "this")
    @Deprecated
    public final zzag f() {
        return this;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* renamed from: g */
    public final AbstractC1321i iterator() {
        return listIterator(0);
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
    public final int indexOf(@CheckForNull Object obj) {
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

    @Override // com.google.android.gms.internal.common.zzac, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public zzag subList(int i4, int i5) {
        B.c(i4, i5, size());
        int i6 = i5 - i4;
        if (i6 == size()) {
            return this;
        }
        if (i6 == 0) {
            return C1320h.f29150I;
        }
        return new C1318f(this, i4, i6);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
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
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @InterfaceC2354a
    @l1.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final Object remove(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final j listIterator(int i4) {
        B.b(i4, size(), FirebaseAnalytics.b.f34777X);
        if (isEmpty()) {
            return f29163F;
        }
        return new C1317e(this, i4);
    }

    @Override // java.util.List
    @InterfaceC2354a
    @l1.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final Object set(int i4, Object obj) {
        throw new UnsupportedOperationException();
    }
}
