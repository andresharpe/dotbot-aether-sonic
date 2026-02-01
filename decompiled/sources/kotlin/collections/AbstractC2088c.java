package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.C2197u;

@kotlin.Y(version = "1.1")
@kotlin.jvm.internal.U({"SMAP\nAbstractList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n350#2,7:171\n378#2,7:178\n*S KotlinDebug\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n*L\n27#1:171,7\n29#1:178,7\n*E\n"})
/* renamed from: kotlin.collections.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2088c<E> extends AbstractC2086a<E> implements List<E>, Y2.a {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    public static final a f51901E = new a(null);

    /* renamed from: F, reason: collision with root package name */
    private static final int f51902F = 2147483639;

    /* renamed from: kotlin.collections.c$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        public final void a(int i4, int i5, int i6) {
            if (i4 >= 0 && i5 <= i6) {
                if (i4 <= i5) {
                    return;
                }
                throw new IllegalArgumentException("startIndex: " + i4 + " > endIndex: " + i5);
            }
            throw new IndexOutOfBoundsException("startIndex: " + i4 + ", endIndex: " + i5 + ", size: " + i6);
        }

        public final void b(int i4, int i5) {
            if (i4 >= 0 && i4 < i5) {
                return;
            }
            throw new IndexOutOfBoundsException("index: " + i4 + ", size: " + i5);
        }

        public final void c(int i4, int i5) {
            if (i4 >= 0 && i4 <= i5) {
                return;
            }
            throw new IndexOutOfBoundsException("index: " + i4 + ", size: " + i5);
        }

        public final void d(int i4, int i5, int i6) {
            if (i4 >= 0 && i5 <= i6) {
                if (i4 <= i5) {
                    return;
                }
                throw new IllegalArgumentException("fromIndex: " + i4 + " > toIndex: " + i5);
            }
            throw new IndexOutOfBoundsException("fromIndex: " + i4 + ", toIndex: " + i5 + ", size: " + i6);
        }

        public final int e(int i4, int i5) {
            int i6 = i4 + (i4 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - AbstractC2088c.f51902F <= 0) {
                return i6;
            }
            if (i5 > AbstractC2088c.f51902F) {
                return Integer.MAX_VALUE;
            }
            return AbstractC2088c.f51902F;
        }

        public final boolean f(@l3.d Collection<?> c4, @l3.d Collection<?> other) {
            kotlin.jvm.internal.F.p(c4, "c");
            kotlin.jvm.internal.F.p(other, "other");
            if (c4.size() != other.size()) {
                return false;
            }
            Iterator<?> it = other.iterator();
            Iterator<?> it2 = c4.iterator();
            while (it2.hasNext()) {
                if (!kotlin.jvm.internal.F.g(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int g(@l3.d Collection<?> c4) {
            int i4;
            kotlin.jvm.internal.F.p(c4, "c");
            int i5 = 1;
            for (Object obj : c4) {
                int i6 = i5 * 31;
                if (obj != null) {
                    i4 = obj.hashCode();
                } else {
                    i4 = 0;
                }
                i5 = i6 + i4;
            }
            return i5;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kotlin.collections.c$b */
    /* loaded from: classes2.dex */
    public class b implements Iterator<E>, Y2.a {

        /* renamed from: E, reason: collision with root package name */
        private int f51903E;

        public b() {
        }

        protected final int b() {
            return this.f51903E;
        }

        protected final void c(int i4) {
            this.f51903E = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f51903E < AbstractC2088c.this.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public E next() {
            if (hasNext()) {
                AbstractC2088c<E> abstractC2088c = AbstractC2088c.this;
                int i4 = this.f51903E;
                this.f51903E = i4 + 1;
                return abstractC2088c.get(i4);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlin.collections.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private class C0455c extends AbstractC2088c<E>.b implements ListIterator<E>, Y2.a {
        public C0455c(int i4) {
            super();
            AbstractC2088c.f51901E.c(i4, AbstractC2088c.this.size());
            c(i4);
        }

        @Override // java.util.ListIterator
        public void add(E e4) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (b() > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return b();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (hasPrevious()) {
                AbstractC2088c<E> abstractC2088c = AbstractC2088c.this;
                c(b() - 1);
                return abstractC2088c.get(b());
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return b() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e4) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlin.collections.c$d */
    /* loaded from: classes2.dex */
    private static final class d<E> extends AbstractC2088c<E> implements RandomAccess {

        /* renamed from: G, reason: collision with root package name */
        @l3.d
        private final AbstractC2088c<E> f51906G;

        /* renamed from: H, reason: collision with root package name */
        private final int f51907H;

        /* renamed from: I, reason: collision with root package name */
        private int f51908I;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@l3.d AbstractC2088c<? extends E> list, int i4, int i5) {
            kotlin.jvm.internal.F.p(list, "list");
            this.f51906G = list;
            this.f51907H = i4;
            AbstractC2088c.f51901E.d(i4, i5, list.size());
            this.f51908I = i5 - i4;
        }

        @Override // kotlin.collections.AbstractC2088c, kotlin.collections.AbstractC2086a
        public int b() {
            return this.f51908I;
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        public E get(int i4) {
            AbstractC2088c.f51901E.b(i4, this.f51908I);
            return this.f51906G.get(this.f51907H + i4);
        }
    }

    @Override // java.util.List
    public void add(int i4, E e4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i4, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.collections.AbstractC2086a
    public abstract int b();

    @Override // java.util.Collection, java.util.List
    public boolean equals(@l3.e Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return f51901E.f(this, (Collection) obj);
    }

    public abstract E get(int i4);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f51901E.g(this);
    }

    @Override // java.util.List
    public int indexOf(E e4) {
        Iterator<E> it = iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (!kotlin.jvm.internal.F.g(it.next(), e4)) {
                i4++;
            } else {
                return i4;
            }
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractC2086a, java.util.Collection, java.lang.Iterable
    @l3.d
    public Iterator<E> iterator() {
        return new b();
    }

    @Override // java.util.List
    public int lastIndexOf(E e4) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.F.g(listIterator.previous(), e4)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    @l3.d
    public ListIterator<E> listIterator() {
        return new C0455c(0);
    }

    @Override // java.util.List
    public E remove(int i4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i4, E e4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @l3.d
    public List<E> subList(int i4, int i5) {
        return new d(this, i4, i5);
    }

    @Override // java.util.List
    @l3.d
    public ListIterator<E> listIterator(int i4) {
        return new C0455c(i4);
    }
}
