package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

@kotlin.jvm.internal.U({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n204#1:208\n204#1:209\n204#1:210\n1#2:207\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n106#1:208\n175#1:209\n188#1:210\n*E\n"})
/* loaded from: classes2.dex */
final class g0<T> extends AbstractC2088c<T> implements RandomAccess {

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    private final Object[] f51925G;

    /* renamed from: H, reason: collision with root package name */
    private final int f51926H;

    /* renamed from: I, reason: collision with root package name */
    private int f51927I;

    /* renamed from: J, reason: collision with root package name */
    private int f51928J;

    @kotlin.jvm.internal.U({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n+ 2 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n1#1,206:1\n204#2:207\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n*L\n121#1:207\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC2087b<T> {

        /* renamed from: G, reason: collision with root package name */
        private int f51929G;

        /* renamed from: H, reason: collision with root package name */
        private int f51930H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ g0<T> f51931I;

        a(g0<T> g0Var) {
            this.f51931I = g0Var;
            this.f51929G = g0Var.size();
            this.f51930H = ((g0) g0Var).f51927I;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.collections.AbstractC2087b
        protected void b() {
            if (this.f51929G == 0) {
                c();
                return;
            }
            d(((g0) this.f51931I).f51925G[this.f51930H]);
            this.f51930H = (this.f51930H + 1) % ((g0) this.f51931I).f51926H;
            this.f51929G--;
        }
    }

    public g0(@l3.d Object[] buffer, int i4) {
        kotlin.jvm.internal.F.p(buffer, "buffer");
        this.f51925G = buffer;
        if (i4 >= 0) {
            if (i4 <= buffer.length) {
                this.f51926H = buffer.length;
                this.f51928J = i4;
                return;
            }
            throw new IllegalArgumentException(("ring buffer filled size: " + i4 + " cannot be larger than the buffer size: " + buffer.length).toString());
        }
        throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i4).toString());
    }

    private final int m(int i4, int i5) {
        return (i4 + i5) % this.f51926H;
    }

    @Override // kotlin.collections.AbstractC2088c, kotlin.collections.AbstractC2086a
    public int b() {
        return this.f51928J;
    }

    @Override // kotlin.collections.AbstractC2088c, java.util.List
    public T get(int i4) {
        AbstractC2088c.f51901E.b(i4, size());
        return (T) this.f51925G[(this.f51927I + i4) % this.f51926H];
    }

    @Override // kotlin.collections.AbstractC2088c, kotlin.collections.AbstractC2086a, java.util.Collection, java.lang.Iterable
    @l3.d
    public Iterator<T> iterator() {
        return new a(this);
    }

    public final void k(T t3) {
        if (!n()) {
            this.f51925G[(this.f51927I + size()) % this.f51926H] = t3;
            this.f51928J = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public final g0<T> l(int i4) {
        int B3;
        Object[] array;
        int i5 = this.f51926H;
        B3 = kotlin.ranges.u.B(i5 + (i5 >> 1) + 1, i4);
        if (this.f51927I == 0) {
            array = Arrays.copyOf(this.f51925G, B3);
            kotlin.jvm.internal.F.o(array, "copyOf(...)");
        } else {
            array = toArray(new Object[B3]);
        }
        return new g0<>(array, size());
    }

    public final boolean n() {
        if (size() == this.f51926H) {
            return true;
        }
        return false;
    }

    public final void o(int i4) {
        if (i4 >= 0) {
            if (i4 <= size()) {
                if (i4 > 0) {
                    int i5 = this.f51927I;
                    int i6 = (i5 + i4) % this.f51926H;
                    if (i5 > i6) {
                        C2100o.M1(this.f51925G, null, i5, this.f51926H);
                        C2100o.M1(this.f51925G, null, 0, i6);
                    } else {
                        C2100o.M1(this.f51925G, null, i5, i6);
                    }
                    this.f51927I = i6;
                    this.f51928J = size() - i4;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i4 + ", size = " + size()).toString());
        }
        throw new IllegalArgumentException(("n shouldn't be negative but it is " + i4).toString());
    }

    @Override // kotlin.collections.AbstractC2086a, java.util.Collection
    @l3.d
    public <T> T[] toArray(@l3.d T[] array) {
        Object[] n4;
        kotlin.jvm.internal.F.p(array, "array");
        int length = array.length;
        Object[] objArr = array;
        if (length < size()) {
            Object[] objArr2 = (T[]) Arrays.copyOf(array, size());
            kotlin.jvm.internal.F.o(objArr2, "copyOf(...)");
            objArr = objArr2;
        }
        int size = size();
        int i4 = 0;
        int i5 = 0;
        for (int i6 = this.f51927I; i5 < size && i6 < this.f51926H; i6++) {
            objArr[i5] = this.f51925G[i6];
            i5++;
        }
        while (i5 < size) {
            objArr[i5] = this.f51925G[i4];
            i5++;
            i4++;
        }
        n4 = C2108v.n(size, objArr);
        return (T[]) n4;
    }

    public g0(int i4) {
        this(new Object[i4], 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractC2086a, java.util.Collection
    @l3.d
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
