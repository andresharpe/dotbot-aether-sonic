package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.C2101p;
import kotlin.jvm.internal.C2196t;

@InterfaceC2218t
@W2.g
@Y(version = "1.3")
@kotlin.jvm.internal.U({"SMAP\nULongArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ULongArray.kt\nkotlin/ULongArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 ULongArray.kt\nkotlin/ULongArray\n*L\n62#1:87,3\n*E\n"})
/* loaded from: classes2.dex */
public final class y0 implements Collection<x0>, Y2.a {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final long[] f52911E;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class a implements Iterator<x0>, Y2.a {

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final long[] f52912E;

        /* renamed from: F, reason: collision with root package name */
        private int f52913F;

        public a(@l3.d long[] array) {
            kotlin.jvm.internal.F.p(array, "array");
            this.f52912E = array;
        }

        public long b() {
            int i4 = this.f52913F;
            long[] jArr = this.f52912E;
            if (i4 < jArr.length) {
                this.f52913F = i4 + 1;
                return x0.l(jArr[i4]);
            }
            throw new NoSuchElementException(String.valueOf(this.f52913F));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f52913F < this.f52912E.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ x0 next() {
            return x0.e(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @U
    private /* synthetic */ y0(long[] jArr) {
        this.f52911E = jArr;
    }

    public static final /* synthetic */ y0 c(long[] jArr) {
        return new y0(jArr);
    }

    @l3.d
    public static long[] d(int i4) {
        return j(new long[i4]);
    }

    @l3.d
    @U
    public static long[] j(@l3.d long[] storage) {
        kotlin.jvm.internal.F.p(storage, "storage");
        return storage;
    }

    public static boolean l(long[] jArr, long j4) {
        boolean r8;
        r8 = C2101p.r8(jArr, j4);
        return r8;
    }

    public static boolean m(long[] jArr, @l3.d Collection<x0> elements) {
        boolean r8;
        kotlin.jvm.internal.F.p(elements, "elements");
        Collection<x0> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (obj instanceof x0) {
                r8 = C2101p.r8(jArr, ((x0) obj).l0());
                if (r8) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean n(long[] jArr, Object obj) {
        return (obj instanceof y0) && kotlin.jvm.internal.F.g(jArr, ((y0) obj).y());
    }

    public static final boolean o(long[] jArr, long[] jArr2) {
        return kotlin.jvm.internal.F.g(jArr, jArr2);
    }

    public static final long p(long[] jArr, int i4) {
        return x0.l(jArr[i4]);
    }

    public static int r(long[] jArr) {
        return jArr.length;
    }

    @U
    public static /* synthetic */ void s() {
    }

    public static int t(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static boolean u(long[] jArr) {
        if (jArr.length == 0) {
            return true;
        }
        return false;
    }

    @l3.d
    public static Iterator<x0> v(long[] jArr) {
        return new a(jArr);
    }

    public static final void w(long[] jArr, int i4, long j4) {
        jArr[i4] = j4;
    }

    public static String x(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(x0 x0Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends x0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean b(long j4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof x0)) {
            return false;
        }
        return k(((x0) obj).l0());
    }

    @Override // java.util.Collection
    public boolean containsAll(@l3.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.F.p(elements, "elements");
        return m(this.f52911E, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return n(this.f52911E, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return t(this.f52911E);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return u(this.f52911E);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @l3.d
    public Iterator<x0> iterator() {
        return v(this.f52911E);
    }

    public boolean k(long j4) {
        return l(this.f52911E, j4);
    }

    @Override // java.util.Collection
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public int size() {
        return r(this.f52911E);
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
    public Object[] toArray() {
        return C2196t.a(this);
    }

    public String toString() {
        return x(this.f52911E);
    }

    public final /* synthetic */ long[] y() {
        return this.f52911E;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.F.p(array, "array");
        return (T[]) C2196t.b(this, array);
    }
}
