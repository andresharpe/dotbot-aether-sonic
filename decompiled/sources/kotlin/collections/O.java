package kotlin.collections;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class O<T> implements Iterator<M<? extends T>>, Y2.a {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final Iterator<T> f51837E;

    /* renamed from: F, reason: collision with root package name */
    private int f51838F;

    /* JADX WARN: Multi-variable type inference failed */
    public O(@l3.d Iterator<? extends T> iterator) {
        kotlin.jvm.internal.F.p(iterator, "iterator");
        this.f51837E = iterator;
    }

    @Override // java.util.Iterator
    @l3.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final M<T> next() {
        int i4 = this.f51838F;
        this.f51838F = i4 + 1;
        if (i4 < 0) {
            CollectionsKt__CollectionsKt.Z();
        }
        return new M<>(i4, this.f51837E.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f51837E.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
