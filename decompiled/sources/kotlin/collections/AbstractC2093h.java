package kotlin.collections;

import java.util.AbstractSet;
import java.util.Set;

@kotlin.Y(version = "1.1")
/* renamed from: kotlin.collections.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2093h<E> extends AbstractSet<E> implements Set<E>, Y2.h {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean add(E e4);

    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return b();
    }
}
