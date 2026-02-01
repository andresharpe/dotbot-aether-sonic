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
@kotlin.jvm.internal.U({"SMAP\nUIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIntArray.kt\nkotlin/UIntArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UIntArray.kt\nkotlin/UIntArray\n*L\n62#1:87,3\n*E\n"})
/* loaded from: classes2.dex */
public final class u0 implements Collection<t0>, Y2.a {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final int[] f52894E;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class a implements Iterator<t0>, Y2.a {

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final int[] f52895E;

        /* renamed from: F, reason: collision with root package name */
        private int f52896F;

        public a(@l3.d int[] array) {
            kotlin.jvm.internal.F.p(array, "array");
            this.f52895E = array;
        }

        public int b() {
            int i4 = this.f52896F;
            int[] iArr = this.f52895E;
            if (i4 < iArr.length) {
                this.f52896F = i4 + 1;
                return t0.l(iArr[i4]);
            }
            throw new NoSuchElementException(String.valueOf(this.f52896F));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f52896F < this.f52895E.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ t0 next() {
            return t0.e(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @U
    private /* synthetic */ u0(int[] iArr) {
        this.f52894E = iArr;
    }

    public static final /* synthetic */ u0 c(int[] iArr) {
        return new u0(iArr);
    }

    @l3.d
    public static int[] d(int i4) {
        return j(new int[i4]);
    }

    @l3.d
    @U
    public static int[] j(@l3.d int[] storage) {
        kotlin.jvm.internal.F.p(storage, "storage");
        return storage;
    }

    public static boolean l(int[] iArr, int i4) {
        boolean q8;
        q8 = C2101p.q8(iArr, i4);
        return q8;
    }

    public static boolean m(int[] iArr, @l3.d Collection<t0> elements) {
        boolean q8;
        kotlin.jvm.internal.F.p(elements, "elements");
        Collection<t0> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (obj instanceof t0) {
                q8 = C2101p.q8(iArr, ((t0) obj).l0());
                if (q8) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean n(int[] iArr, Object obj) {
        return (obj instanceof u0) && kotlin.jvm.internal.F.g(iArr, ((u0) obj).y());
    }

    public static final boolean o(int[] iArr, int[] iArr2) {
        return kotlin.jvm.internal.F.g(iArr, iArr2);
    }

    public static final int p(int[] iArr, int i4) {
        return t0.l(iArr[i4]);
    }

    public static int r(int[] iArr) {
        return iArr.length;
    }

    @U
    public static /* synthetic */ void s() {
    }

    public static int t(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static boolean u(int[] iArr) {
        if (iArr.length == 0) {
            return true;
        }
        return false;
    }

    @l3.d
    public static Iterator<t0> v(int[] iArr) {
        return new a(iArr);
    }

    public static final void w(int[] iArr, int i4, int i5) {
        iArr[i4] = i5;
    }

    public static String x(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(t0 t0Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends t0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean b(int i4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof t0)) {
            return false;
        }
        return k(((t0) obj).l0());
    }

    @Override // java.util.Collection
    public boolean containsAll(@l3.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.F.p(elements, "elements");
        return m(this.f52894E, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return n(this.f52894E, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return t(this.f52894E);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return u(this.f52894E);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @l3.d
    public Iterator<t0> iterator() {
        return v(this.f52894E);
    }

    public boolean k(int i4) {
        return l(this.f52894E, i4);
    }

    @Override // java.util.Collection
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public int size() {
        return r(this.f52894E);
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
        return x(this.f52894E);
    }

    public final /* synthetic */ int[] y() {
        return this.f52894E;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.F.p(array, "array");
        return (T[]) C2196t.b(this, array);
    }
}
