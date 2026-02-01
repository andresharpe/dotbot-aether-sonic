package kotlin.collections;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class N<T> implements Iterable<M<? extends T>>, Y2.a {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final X2.a<Iterator<T>> f51836E;

    /* JADX WARN: Multi-variable type inference failed */
    public N(@l3.d X2.a<? extends Iterator<? extends T>> iteratorFactory) {
        kotlin.jvm.internal.F.p(iteratorFactory, "iteratorFactory");
        this.f51836E = iteratorFactory;
    }

    @Override // java.lang.Iterable
    @l3.d
    public Iterator<M<T>> iterator() {
        return new O(this.f51836E.n());
    }
}
