package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C2185h;
import kotlin.jvm.internal.C2196t;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.jvm.internal.U({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/ArrayAsCollection\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,522:1\n1726#2,3:523\n*S KotlinDebug\n*F\n+ 1 Collections.kt\nkotlin/collections/ArrayAsCollection\n*L\n62#1:523,3\n*E\n"})
/* renamed from: kotlin.collections.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2095j<T> implements Collection<T>, Y2.a {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final T[] f51933E;

    /* renamed from: F, reason: collision with root package name */
    private final boolean f51934F;

    public C2095j(@l3.d T[] values, boolean z3) {
        kotlin.jvm.internal.F.p(values, "values");
        this.f51933E = values;
        this.f51934F = z3;
    }

    @Override // java.util.Collection
    public boolean add(T t3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int b() {
        return this.f51933E.length;
    }

    @l3.d
    public final T[] c() {
        return this.f51933E;
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        boolean s8;
        s8 = C2101p.s8(this.f51933E, obj);
        return s8;
    }

    @Override // java.util.Collection
    public boolean containsAll(@l3.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.F.p(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean d() {
        return this.f51934F;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        if (this.f51933E.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @l3.d
    public Iterator<T> iterator() {
        return C2185h.a(this.f51933E);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return b();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.F.p(array, "array");
        return (T[]) C2196t.b(this, array);
    }

    @Override // java.util.Collection
    @l3.d
    public final Object[] toArray() {
        return C2108v.h(this.f51933E, this.f51934F);
    }
}
