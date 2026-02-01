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
@kotlin.jvm.internal.U({"SMAP\nUByteArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n*L\n62#1:87,3\n*E\n"})
/* loaded from: classes2.dex */
public final class q0 implements Collection<p0>, Y2.a {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final byte[] f52422E;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class a implements Iterator<p0>, Y2.a {

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final byte[] f52423E;

        /* renamed from: F, reason: collision with root package name */
        private int f52424F;

        public a(@l3.d byte[] array) {
            kotlin.jvm.internal.F.p(array, "array");
            this.f52423E = array;
        }

        public byte b() {
            int i4 = this.f52424F;
            byte[] bArr = this.f52423E;
            if (i4 < bArr.length) {
                this.f52424F = i4 + 1;
                return p0.l(bArr[i4]);
            }
            throw new NoSuchElementException(String.valueOf(this.f52424F));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f52424F < this.f52423E.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ p0 next() {
            return p0.e(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @U
    private /* synthetic */ q0(byte[] bArr) {
        this.f52422E = bArr;
    }

    public static final /* synthetic */ q0 c(byte[] bArr) {
        return new q0(bArr);
    }

    @l3.d
    public static byte[] d(int i4) {
        return j(new byte[i4]);
    }

    @l3.d
    @U
    public static byte[] j(@l3.d byte[] storage) {
        kotlin.jvm.internal.F.p(storage, "storage");
        return storage;
    }

    public static boolean l(byte[] bArr, byte b4) {
        boolean m8;
        m8 = C2101p.m8(bArr, b4);
        return m8;
    }

    public static boolean m(byte[] bArr, @l3.d Collection<p0> elements) {
        boolean m8;
        kotlin.jvm.internal.F.p(elements, "elements");
        Collection<p0> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (obj instanceof p0) {
                m8 = C2101p.m8(bArr, ((p0) obj).j0());
                if (m8) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean n(byte[] bArr, Object obj) {
        return (obj instanceof q0) && kotlin.jvm.internal.F.g(bArr, ((q0) obj).y());
    }

    public static final boolean o(byte[] bArr, byte[] bArr2) {
        return kotlin.jvm.internal.F.g(bArr, bArr2);
    }

    public static final byte p(byte[] bArr, int i4) {
        return p0.l(bArr[i4]);
    }

    public static int r(byte[] bArr) {
        return bArr.length;
    }

    @U
    public static /* synthetic */ void s() {
    }

    public static int t(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static boolean u(byte[] bArr) {
        if (bArr.length == 0) {
            return true;
        }
        return false;
    }

    @l3.d
    public static Iterator<p0> v(byte[] bArr) {
        return new a(bArr);
    }

    public static final void w(byte[] bArr, int i4, byte b4) {
        bArr[i4] = b4;
    }

    public static String x(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(p0 p0Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends p0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean b(byte b4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        return k(((p0) obj).j0());
    }

    @Override // java.util.Collection
    public boolean containsAll(@l3.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.F.p(elements, "elements");
        return m(this.f52422E, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return n(this.f52422E, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return t(this.f52422E);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return u(this.f52422E);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @l3.d
    public Iterator<p0> iterator() {
        return v(this.f52422E);
    }

    public boolean k(byte b4) {
        return l(this.f52422E, b4);
    }

    @Override // java.util.Collection
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public int size() {
        return r(this.f52422E);
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
        return x(this.f52422E);
    }

    public final /* synthetic */ byte[] y() {
        return this.f52422E;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.F.p(array, "array");
        return (T[]) C2196t.b(this, array);
    }
}
