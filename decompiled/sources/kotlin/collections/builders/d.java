package kotlin.collections.builders;

import Y2.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.AbstractC2093h;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class d<E> extends AbstractC2093h<E> implements Set<E>, h {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final MapBuilder<E, ?> f51896E;

    public d(@l3.d MapBuilder<E, ?> backing) {
        F.p(backing, "backing");
        this.f51896E = backing;
    }

    @Override // kotlin.collections.AbstractC2093h, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@l3.d Collection<? extends E> elements) {
        F.p(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.collections.AbstractC2093h
    public int b() {
        return this.f51896E.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f51896E.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f51896E.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f51896E.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @l3.d
    public Iterator<E> iterator() {
        return this.f51896E.I();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (this.f51896E.Q(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@l3.d Collection<? extends Object> elements) {
        F.p(elements, "elements");
        this.f51896E.q();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@l3.d Collection<? extends Object> elements) {
        F.p(elements, "elements");
        this.f51896E.q();
        return super.retainAll(elements);
    }
}
