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
@kotlin.jvm.internal.U({"SMAP\nUShortArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n*L\n62#1:87,3\n*E\n"})
/* loaded from: classes2.dex */
public final class E0 implements Collection<D0>, Y2.a {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final short[] f51798E;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class a implements Iterator<D0>, Y2.a {

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final short[] f51799E;

        /* renamed from: F, reason: collision with root package name */
        private int f51800F;

        public a(@l3.d short[] array) {
            kotlin.jvm.internal.F.p(array, "array");
            this.f51799E = array;
        }

        public short b() {
            int i4 = this.f51800F;
            short[] sArr = this.f51799E;
            if (i4 < sArr.length) {
                this.f51800F = i4 + 1;
                return D0.l(sArr[i4]);
            }
            throw new NoSuchElementException(String.valueOf(this.f51800F));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f51800F < this.f51799E.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ D0 next() {
            return D0.e(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @U
    private /* synthetic */ E0(short[] sArr) {
        this.f51798E = sArr;
    }

    public static final /* synthetic */ E0 c(short[] sArr) {
        return new E0(sArr);
    }

    @l3.d
    public static short[] d(int i4) {
        return j(new short[i4]);
    }

    @l3.d
    @U
    public static short[] j(@l3.d short[] storage) {
        kotlin.jvm.internal.F.p(storage, "storage");
        return storage;
    }

    public static boolean l(short[] sArr, short s4) {
        boolean t8;
        t8 = C2101p.t8(sArr, s4);
        return t8;
    }

    public static boolean m(short[] sArr, @l3.d Collection<D0> elements) {
        boolean t8;
        kotlin.jvm.internal.F.p(elements, "elements");
        Collection<D0> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (obj instanceof D0) {
                t8 = C2101p.t8(sArr, ((D0) obj).j0());
                if (t8) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean n(short[] sArr, Object obj) {
        return (obj instanceof E0) && kotlin.jvm.internal.F.g(sArr, ((E0) obj).y());
    }

    public static final boolean o(short[] sArr, short[] sArr2) {
        return kotlin.jvm.internal.F.g(sArr, sArr2);
    }

    public static final short p(short[] sArr, int i4) {
        return D0.l(sArr[i4]);
    }

    public static int r(short[] sArr) {
        return sArr.length;
    }

    @U
    public static /* synthetic */ void s() {
    }

    public static int t(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static boolean u(short[] sArr) {
        if (sArr.length == 0) {
            return true;
        }
        return false;
    }

    @l3.d
    public static Iterator<D0> v(short[] sArr) {
        return new a(sArr);
    }

    public static final void w(short[] sArr, int i4, short s4) {
        sArr[i4] = s4;
    }

    public static String x(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(D0 d02) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends D0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean b(short s4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof D0)) {
            return false;
        }
        return k(((D0) obj).j0());
    }

    @Override // java.util.Collection
    public boolean containsAll(@l3.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.F.p(elements, "elements");
        return m(this.f51798E, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return n(this.f51798E, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return t(this.f51798E);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return u(this.f51798E);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @l3.d
    public Iterator<D0> iterator() {
        return v(this.f51798E);
    }

    public boolean k(short s4) {
        return l(this.f51798E, s4);
    }

    @Override // java.util.Collection
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public int size() {
        return r(this.f51798E);
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
        return x(this.f51798E);
    }

    public final /* synthetic */ short[] y() {
        return this.f51798E;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.F.p(array, "array");
        return (T[]) C2196t.b(this, array);
    }
}
