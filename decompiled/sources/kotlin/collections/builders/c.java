package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class c<K, V> extends a<Map.Entry<K, V>, K, V> {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final MapBuilder<K, V> f51895E;

    public c(@l3.d MapBuilder<K, V> backing) {
        F.p(backing, "backing");
        this.f51895E = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@l3.d Collection<? extends Map.Entry<K, V>> elements) {
        F.p(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.collections.AbstractC2093h
    public int b() {
        return this.f51895E.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f51895E.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(@l3.d Collection<? extends Object> elements) {
        F.p(elements, "elements");
        return this.f51895E.s(elements);
    }

    @Override // kotlin.collections.builders.a
    public boolean d(@l3.d Map.Entry<? extends K, ? extends V> element) {
        F.p(element, "element");
        return this.f51895E.t(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f51895E.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @l3.d
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.f51895E.x();
    }

    @Override // kotlin.collections.builders.a
    public boolean j(@l3.d Map.Entry element) {
        F.p(element, "element");
        return this.f51895E.O(element);
    }

    @Override // kotlin.collections.AbstractC2093h, java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public boolean add(@l3.d Map.Entry<K, V> element) {
        F.p(element, "element");
        throw new UnsupportedOperationException();
    }

    @l3.d
    public final MapBuilder<K, V> l() {
        return this.f51895E;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@l3.d Collection<? extends Object> elements) {
        F.p(elements, "elements");
        this.f51895E.q();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@l3.d Collection<? extends Object> elements) {
        F.p(elements, "elements");
        this.f51895E.q();
        return super.retainAll(elements);
    }
}
