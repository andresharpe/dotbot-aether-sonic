package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C2196t;
import kotlin.jvm.internal.Lambda;

@kotlin.Y(version = "1.1")
@kotlin.jvm.internal.U({"SMAP\nAbstractCollection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractCollection.kt\nkotlin/collections/AbstractCollection\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,50:1\n1747#2,3:51\n1726#2,3:54\n*S KotlinDebug\n*F\n+ 1 AbstractCollection.kt\nkotlin/collections/AbstractCollection\n*L\n19#1:51,3\n22#1:54,3\n*E\n"})
/* renamed from: kotlin.collections.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2086a<E> implements Collection<E>, Y2.a {

    /* renamed from: kotlin.collections.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0454a extends Lambda implements X2.l<E, CharSequence> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ AbstractC2086a<E> f51842F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0454a(AbstractC2086a<? extends E> abstractC2086a) {
            super(1);
            this.f51842F = abstractC2086a;
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final CharSequence C(E e4) {
            if (e4 == this.f51842F) {
                return "(this Collection)";
            }
            return String.valueOf(e4);
        }
    }

    @Override // java.util.Collection
    public boolean add(E e4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract int b();

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(E e4) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.F.g(it.next(), e4)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
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

    @Override // java.util.Collection
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @l3.d
    public abstract Iterator<E> iterator();

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
    @l3.d
    public Object[] toArray() {
        return C2196t.a(this);
    }

    @l3.d
    public String toString() {
        String m32;
        m32 = D.m3(this, ", ", "[", "]", 0, null, new C0454a(this), 24, null);
        return m32;
    }

    @Override // java.util.Collection
    @l3.d
    public <T> T[] toArray(@l3.d T[] array) {
        kotlin.jvm.internal.F.p(array, "array");
        return (T[]) C2196t.b(this, array);
    }
}
