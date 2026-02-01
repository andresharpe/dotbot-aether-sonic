package kotlin.collections;

import java.util.AbstractCollection;
import java.util.Collection;

@kotlin.Y(version = "1.1")
/* renamed from: kotlin.collections.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2090e<E> extends AbstractCollection<E> implements Collection<E>, Y2.b {
    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean add(E e4);

    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return b();
    }
}
