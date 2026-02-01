package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
final class e0<T> extends AbstractC2091f<T> {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final List<T> f51919E;

    /* loaded from: classes2.dex */
    public static final class a implements ListIterator<T>, Y2.f {

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final ListIterator<T> f51920E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ e0<T> f51921F;

        a(e0<T> e0Var, int i4) {
            int e12;
            this.f51921F = e0Var;
            List list = ((e0) e0Var).f51919E;
            e12 = B.e1(e0Var, i4);
            this.f51920E = list.listIterator(e12);
        }

        @Override // java.util.ListIterator
        public void add(T t3) {
            this.f51920E.add(t3);
            this.f51920E.previous();
        }

        @l3.d
        public final ListIterator<T> b() {
            return this.f51920E;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f51920E.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f51920E.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.f51920E.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            int d12;
            d12 = B.d1(this.f51921F, this.f51920E.previousIndex());
            return d12;
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.f51920E.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            int d12;
            d12 = B.d1(this.f51921F, this.f51920E.nextIndex());
            return d12;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f51920E.remove();
        }

        @Override // java.util.ListIterator
        public void set(T t3) {
            this.f51920E.set(t3);
        }
    }

    public e0(@l3.d List<T> delegate) {
        kotlin.jvm.internal.F.p(delegate, "delegate");
        this.f51919E = delegate;
    }

    @Override // kotlin.collections.AbstractC2091f, java.util.AbstractList, java.util.List
    public void add(int i4, T t3) {
        int e12;
        List<T> list = this.f51919E;
        e12 = B.e1(this, i4);
        list.add(e12, t3);
    }

    @Override // kotlin.collections.AbstractC2091f
    public int b() {
        return this.f51919E.size();
    }

    @Override // kotlin.collections.AbstractC2091f
    public T c(int i4) {
        int c12;
        List<T> list = this.f51919E;
        c12 = B.c1(this, i4);
        return list.remove(c12);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f51919E.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i4) {
        int c12;
        List<T> list = this.f51919E;
        c12 = B.c1(this, i4);
        return list.get(c12);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @l3.d
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    @l3.d
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractC2091f, java.util.AbstractList, java.util.List
    public T set(int i4, T t3) {
        int c12;
        List<T> list = this.f51919E;
        c12 = B.c1(this, i4);
        return list.set(c12, t3);
    }

    @Override // java.util.AbstractList, java.util.List
    @l3.d
    public ListIterator<T> listIterator(int i4) {
        return new a(this, i4);
    }
}
