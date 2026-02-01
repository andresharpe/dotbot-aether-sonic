package com.google.android.gms.internal.common;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.CheckForNull;
import l1.InterfaceC2354a;
import org.jspecify.nullness.NullMarked;

@l1.f("Use ImmutableList.of or another implementation")
@NullMarked
/* loaded from: classes.dex */
public abstract class zzac extends AbstractCollection implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private static final Object[] f29162E = new Object[0];

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC2354a
    @l1.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC2354a
    @l1.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @InterfaceC2354a
    int b(Object[] objArr, int i4) {
        throw null;
    }

    int c() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @l1.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        throw null;
    }

    public zzag f() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC1321i iterator();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean j();

    /* JADX INFO: Access modifiers changed from: package-private */
    @CheckForNull
    public Object[] k() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC2354a
    @l1.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC2354a
    @l1.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC2354a
    @l1.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f29162E);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC2354a
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] k4 = k();
            if (k4 == null) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            } else {
                return Arrays.copyOfRange(k4, d(), c(), objArr.getClass());
            }
        } else if (length > size) {
            objArr[size] = null;
        }
        b(objArr, 0);
        return objArr;
    }
}
