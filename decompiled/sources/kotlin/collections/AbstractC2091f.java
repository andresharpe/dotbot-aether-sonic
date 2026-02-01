package kotlin.collections;

import java.util.AbstractList;
import java.util.List;

@kotlin.Y(version = "1.1")
/* renamed from: kotlin.collections.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2091f<E> extends AbstractList<E> implements List<E>, Y2.e {
    @Override // java.util.AbstractList, java.util.List
    public abstract void add(int i4, E e4);

    public abstract int b();

    public abstract E c(int i4);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i4) {
        return c(i4);
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract E set(int i4, E e4);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return b();
    }
}
