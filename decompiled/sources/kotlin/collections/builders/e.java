package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC2090e;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class e<V> extends AbstractC2090e<V> implements Collection<V>, Y2.b {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final MapBuilder<?, V> f51897E;

    public e(@l3.d MapBuilder<?, V> backing) {
        F.p(backing, "backing");
        this.f51897E = backing;
    }

    @Override // kotlin.collections.AbstractC2090e, java.util.AbstractCollection, java.util.Collection
    public boolean add(V v3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(@l3.d Collection<? extends V> elements) {
        F.p(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.collections.AbstractC2090e
    public int b() {
        return this.f51897E.size();
    }

    @l3.d
    public final MapBuilder<?, V> c() {
        return this.f51897E;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f51897E.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f51897E.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f51897E.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @l3.d
    public Iterator<V> iterator() {
        return this.f51897E.U();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f51897E.S(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(@l3.d Collection<? extends Object> elements) {
        F.p(elements, "elements");
        this.f51897E.q();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(@l3.d Collection<? extends Object> elements) {
        F.p(elements, "elements");
        this.f51897E.q();
        return super.retainAll(elements);
    }
}
