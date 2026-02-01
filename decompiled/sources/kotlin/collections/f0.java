package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
class f0<T> extends AbstractC2088c<T> {

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    private final List<T> f51922G;

    /* loaded from: classes2.dex */
    public static final class a implements ListIterator<T>, Y2.a {

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final ListIterator<T> f51923E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ f0<T> f51924F;

        /* JADX WARN: Multi-variable type inference failed */
        a(f0<? extends T> f0Var, int i4) {
            int e12;
            this.f51924F = f0Var;
            List list = ((f0) f0Var).f51922G;
            e12 = B.e1(f0Var, i4);
            this.f51923E = list.listIterator(e12);
        }

        @Override // java.util.ListIterator
        public void add(T t3) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @l3.d
        public final ListIterator<T> b() {
            return this.f51923E;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f51923E.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f51923E.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.f51923E.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            int d12;
            d12 = B.d1(this.f51924F, this.f51923E.previousIndex());
            return d12;
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.f51923E.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            int d12;
            d12 = B.d1(this.f51924F, this.f51923E.nextIndex());
            return d12;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(T t3) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f0(@l3.d List<? extends T> delegate) {
        kotlin.jvm.internal.F.p(delegate, "delegate");
        this.f51922G = delegate;
    }

    @Override // kotlin.collections.AbstractC2088c, kotlin.collections.AbstractC2086a
    public int b() {
        return this.f51922G.size();
    }

    @Override // kotlin.collections.AbstractC2088c, java.util.List
    public T get(int i4) {
        int c12;
        List<T> list = this.f51922G;
        c12 = B.c1(this, i4);
        return list.get(c12);
    }

    @Override // kotlin.collections.AbstractC2088c, kotlin.collections.AbstractC2086a, java.util.Collection, java.lang.Iterable
    @l3.d
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractC2088c, java.util.List
    @l3.d
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractC2088c, java.util.List
    @l3.d
    public ListIterator<T> listIterator(int i4) {
        return new a(this, i4);
    }
}
