package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.H0;
import kotlin.K0;
import kotlin.jvm.internal.C2197u;

@K0(markerClass = {kotlin.r.class})
@kotlin.Y(version = "1.4")
@kotlin.jvm.internal.U({"SMAP\nArrayDeque.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,569:1\n467#1,51:572\n467#1,51:623\n37#2,2:570\n26#3:674\n*S KotlinDebug\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n*L\n462#1:572,51\n464#1:623,51\n47#1:570,2\n559#1:674\n*E\n"})
/* renamed from: kotlin.collections.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2096k<E> extends AbstractC2091f<E> {

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    public static final a f51935H = new a(null);

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private static final Object[] f51936I = new Object[0];

    /* renamed from: J, reason: collision with root package name */
    private static final int f51937J = 10;

    /* renamed from: E, reason: collision with root package name */
    private int f51938E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private Object[] f51939F;

    /* renamed from: G, reason: collision with root package name */
    private int f51940G;

    /* renamed from: kotlin.collections.k$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public C2096k(int i4) {
        Object[] objArr;
        if (i4 == 0) {
            objArr = f51936I;
        } else if (i4 > 0) {
            objArr = new Object[i4];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i4);
        }
        this.f51939F = objArr;
    }

    private final void d(int i4, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f51939F.length;
        while (i4 < length && it.hasNext()) {
            this.f51939F[i4] = it.next();
            i4++;
        }
        int i5 = this.f51938E;
        for (int i6 = 0; i6 < i5 && it.hasNext(); i6++) {
            this.f51939F[i6] = it.next();
        }
        this.f51940G = size() + collection.size();
    }

    private final void j(int i4) {
        Object[] objArr = new Object[i4];
        Object[] objArr2 = this.f51939F;
        C2100o.B0(objArr2, objArr, 0, this.f51938E, objArr2.length);
        Object[] objArr3 = this.f51939F;
        int length = objArr3.length;
        int i5 = this.f51938E;
        C2100o.B0(objArr3, objArr, length - i5, 0, i5);
        this.f51938E = 0;
        this.f51939F = objArr;
    }

    private final int k(int i4) {
        if (i4 == 0) {
            return C2101p.we(this.f51939F);
        }
        return i4 - 1;
    }

    private final void l(int i4) {
        int u3;
        if (i4 >= 0) {
            Object[] objArr = this.f51939F;
            if (i4 <= objArr.length) {
                return;
            }
            if (objArr == f51936I) {
                u3 = kotlin.ranges.u.u(i4, 10);
                this.f51939F = new Object[u3];
                return;
            } else {
                j(AbstractC2088c.f51901E.e(objArr.length, i4));
                return;
            }
        }
        throw new IllegalStateException("Deque is too big.");
    }

    private final boolean m(X2.l<? super E, Boolean> lVar) {
        int w3;
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f51939F.length != 0) {
            int w4 = w(this.f51938E + size());
            int i4 = this.f51938E;
            if (i4 < w4) {
                w3 = i4;
                while (i4 < w4) {
                    Object obj = this.f51939F[i4];
                    if (lVar.C(obj).booleanValue()) {
                        this.f51939F[w3] = obj;
                        w3++;
                    } else {
                        z3 = true;
                    }
                    i4++;
                }
                C2100o.M1(this.f51939F, null, w3, w4);
            } else {
                int length = this.f51939F.length;
                boolean z4 = false;
                int i5 = i4;
                while (i4 < length) {
                    Object[] objArr = this.f51939F;
                    Object obj2 = objArr[i4];
                    objArr[i4] = null;
                    if (lVar.C(obj2).booleanValue()) {
                        this.f51939F[i5] = obj2;
                        i5++;
                    } else {
                        z4 = true;
                    }
                    i4++;
                }
                w3 = w(i5);
                for (int i6 = 0; i6 < w4; i6++) {
                    Object[] objArr2 = this.f51939F;
                    Object obj3 = objArr2[i6];
                    objArr2[i6] = null;
                    if (lVar.C(obj3).booleanValue()) {
                        this.f51939F[w3] = obj3;
                        w3 = p(w3);
                    } else {
                        z4 = true;
                    }
                }
                z3 = z4;
            }
            if (z3) {
                this.f51940G = v(w3 - this.f51938E);
            }
        }
        return z3;
    }

    private final int p(int i4) {
        if (i4 == C2101p.we(this.f51939F)) {
            return 0;
        }
        return i4 + 1;
    }

    @kotlin.internal.f
    private final E q(int i4) {
        return (E) this.f51939F[i4];
    }

    @kotlin.internal.f
    private final int r(int i4) {
        return w(this.f51938E + i4);
    }

    private final int v(int i4) {
        if (i4 < 0) {
            return i4 + this.f51939F.length;
        }
        return i4;
    }

    private final int w(int i4) {
        Object[] objArr = this.f51939F;
        if (i4 >= objArr.length) {
            return i4 - objArr.length;
        }
        return i4;
    }

    @l3.d
    public final <T> T[] A(@l3.d T[] array) {
        kotlin.jvm.internal.F.p(array, "array");
        return (T[]) toArray(array);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e4) {
        addLast(e4);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@l3.d Collection<? extends E> elements) {
        kotlin.jvm.internal.F.p(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        l(size() + elements.size());
        d(w(this.f51938E + size()), elements);
        return true;
    }

    public final void addFirst(E e4) {
        l(size() + 1);
        int k4 = k(this.f51938E);
        this.f51938E = k4;
        this.f51939F[k4] = e4;
        this.f51940G = size() + 1;
    }

    public final void addLast(E e4) {
        l(size() + 1);
        this.f51939F[w(this.f51938E + size())] = e4;
        this.f51940G = size() + 1;
    }

    @Override // kotlin.collections.AbstractC2091f
    public int b() {
        return this.f51940G;
    }

    @Override // kotlin.collections.AbstractC2091f
    public E c(int i4) {
        int J3;
        int J4;
        AbstractC2088c.f51901E.b(i4, size());
        J3 = CollectionsKt__CollectionsKt.J(this);
        if (i4 == J3) {
            return removeLast();
        }
        if (i4 == 0) {
            return removeFirst();
        }
        int w3 = w(this.f51938E + i4);
        E e4 = (E) this.f51939F[w3];
        if (i4 < (size() >> 1)) {
            int i5 = this.f51938E;
            if (w3 >= i5) {
                Object[] objArr = this.f51939F;
                C2100o.B0(objArr, objArr, i5 + 1, i5, w3);
            } else {
                Object[] objArr2 = this.f51939F;
                C2100o.B0(objArr2, objArr2, 1, 0, w3);
                Object[] objArr3 = this.f51939F;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i6 = this.f51938E;
                C2100o.B0(objArr3, objArr3, i6 + 1, i6, objArr3.length - 1);
            }
            Object[] objArr4 = this.f51939F;
            int i7 = this.f51938E;
            objArr4[i7] = null;
            this.f51938E = p(i7);
        } else {
            int i8 = this.f51938E;
            J4 = CollectionsKt__CollectionsKt.J(this);
            int w4 = w(i8 + J4);
            if (w3 <= w4) {
                Object[] objArr5 = this.f51939F;
                C2100o.B0(objArr5, objArr5, w3, w3 + 1, w4 + 1);
            } else {
                Object[] objArr6 = this.f51939F;
                C2100o.B0(objArr6, objArr6, w3, w3 + 1, objArr6.length);
                Object[] objArr7 = this.f51939F;
                objArr7[objArr7.length - 1] = objArr7[0];
                C2100o.B0(objArr7, objArr7, 0, 1, w4 + 1);
            }
            this.f51939F[w4] = null;
        }
        this.f51940G = size() - 1;
        return e4;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int w3 = w(this.f51938E + size());
        int i4 = this.f51938E;
        if (i4 < w3) {
            C2100o.M1(this.f51939F, null, i4, w3);
        } else if (!isEmpty()) {
            Object[] objArr = this.f51939F;
            C2100o.M1(objArr, null, this.f51938E, objArr.length);
            C2100o.M1(this.f51939F, null, 0, w3);
        }
        this.f51938E = 0;
        this.f51940G = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i4) {
        AbstractC2088c.f51901E.b(i4, size());
        return (E) this.f51939F[w(this.f51938E + i4)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i4;
        int w3 = w(this.f51938E + size());
        int i5 = this.f51938E;
        if (i5 < w3) {
            while (i5 < w3) {
                if (kotlin.jvm.internal.F.g(obj, this.f51939F[i5])) {
                    i4 = this.f51938E;
                } else {
                    i5++;
                }
            }
            return -1;
        }
        if (i5 >= w3) {
            int length = this.f51939F.length;
            while (true) {
                if (i5 < length) {
                    if (kotlin.jvm.internal.F.g(obj, this.f51939F[i5])) {
                        i4 = this.f51938E;
                        break;
                    }
                    i5++;
                } else {
                    for (int i6 = 0; i6 < w3; i6++) {
                        if (kotlin.jvm.internal.F.g(obj, this.f51939F[i6])) {
                            i5 = i6 + this.f51939F.length;
                            i4 = this.f51938E;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i5 - i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int we;
        int i4;
        int w3 = w(this.f51938E + size());
        int i5 = this.f51938E;
        if (i5 < w3) {
            we = w3 - 1;
            if (i5 <= we) {
                while (!kotlin.jvm.internal.F.g(obj, this.f51939F[we])) {
                    if (we != i5) {
                        we--;
                    }
                }
                i4 = this.f51938E;
                return we - i4;
            }
            return -1;
        }
        if (i5 > w3) {
            int i6 = w3 - 1;
            while (true) {
                if (-1 < i6) {
                    if (kotlin.jvm.internal.F.g(obj, this.f51939F[i6])) {
                        we = i6 + this.f51939F.length;
                        i4 = this.f51938E;
                        break;
                    }
                    i6--;
                } else {
                    we = C2101p.we(this.f51939F);
                    int i7 = this.f51938E;
                    if (i7 <= we) {
                        while (!kotlin.jvm.internal.F.g(obj, this.f51939F[we])) {
                            if (we != i7) {
                                we--;
                            }
                        }
                        i4 = this.f51938E;
                    }
                }
            }
        }
        return -1;
    }

    public final E n() {
        if (!isEmpty()) {
            return (E) this.f51939F[this.f51938E];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @l3.e
    public final E o() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f51939F[this.f51938E];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@l3.d Collection<? extends Object> elements) {
        int w3;
        kotlin.jvm.internal.F.p(elements, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f51939F.length != 0) {
            int w4 = w(this.f51938E + size());
            int i4 = this.f51938E;
            if (i4 < w4) {
                w3 = i4;
                while (i4 < w4) {
                    Object obj = this.f51939F[i4];
                    if (!elements.contains(obj)) {
                        this.f51939F[w3] = obj;
                        w3++;
                    } else {
                        z3 = true;
                    }
                    i4++;
                }
                C2100o.M1(this.f51939F, null, w3, w4);
            } else {
                int length = this.f51939F.length;
                boolean z4 = false;
                int i5 = i4;
                while (i4 < length) {
                    Object[] objArr = this.f51939F;
                    Object obj2 = objArr[i4];
                    objArr[i4] = null;
                    if (!elements.contains(obj2)) {
                        this.f51939F[i5] = obj2;
                        i5++;
                    } else {
                        z4 = true;
                    }
                    i4++;
                }
                w3 = w(i5);
                for (int i6 = 0; i6 < w4; i6++) {
                    Object[] objArr2 = this.f51939F;
                    Object obj3 = objArr2[i6];
                    objArr2[i6] = null;
                    if (!elements.contains(obj3)) {
                        this.f51939F[w3] = obj3;
                        w3 = p(w3);
                    } else {
                        z4 = true;
                    }
                }
                z3 = z4;
            }
            if (z3) {
                this.f51940G = v(w3 - this.f51938E);
            }
        }
        return z3;
    }

    public final E removeFirst() {
        if (!isEmpty()) {
            Object[] objArr = this.f51939F;
            int i4 = this.f51938E;
            E e4 = (E) objArr[i4];
            objArr[i4] = null;
            this.f51938E = p(i4);
            this.f51940G = size() - 1;
            return e4;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E removeLast() {
        int J3;
        if (!isEmpty()) {
            int i4 = this.f51938E;
            J3 = CollectionsKt__CollectionsKt.J(this);
            int w3 = w(i4 + J3);
            Object[] objArr = this.f51939F;
            E e4 = (E) objArr[w3];
            objArr[w3] = null;
            this.f51940G = size() - 1;
            return e4;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@l3.d Collection<? extends Object> elements) {
        int w3;
        kotlin.jvm.internal.F.p(elements, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f51939F.length != 0) {
            int w4 = w(this.f51938E + size());
            int i4 = this.f51938E;
            if (i4 < w4) {
                w3 = i4;
                while (i4 < w4) {
                    Object obj = this.f51939F[i4];
                    if (elements.contains(obj)) {
                        this.f51939F[w3] = obj;
                        w3++;
                    } else {
                        z3 = true;
                    }
                    i4++;
                }
                C2100o.M1(this.f51939F, null, w3, w4);
            } else {
                int length = this.f51939F.length;
                boolean z4 = false;
                int i5 = i4;
                while (i4 < length) {
                    Object[] objArr = this.f51939F;
                    Object obj2 = objArr[i4];
                    objArr[i4] = null;
                    if (elements.contains(obj2)) {
                        this.f51939F[i5] = obj2;
                        i5++;
                    } else {
                        z4 = true;
                    }
                    i4++;
                }
                w3 = w(i5);
                for (int i6 = 0; i6 < w4; i6++) {
                    Object[] objArr2 = this.f51939F;
                    Object obj3 = objArr2[i6];
                    objArr2[i6] = null;
                    if (elements.contains(obj3)) {
                        this.f51939F[w3] = obj3;
                        w3 = p(w3);
                    } else {
                        z4 = true;
                    }
                }
                z3 = z4;
            }
            if (z3) {
                this.f51940G = v(w3 - this.f51938E);
            }
        }
        return z3;
    }

    public final void s(@l3.d X2.p<? super Integer, ? super Object[], H0> structure) {
        int i4;
        int i5;
        kotlin.jvm.internal.F.p(structure, "structure");
        int w3 = w(this.f51938E + size());
        if (!isEmpty() && (i5 = this.f51938E) >= w3) {
            i4 = i5 - this.f51939F.length;
        } else {
            i4 = this.f51938E;
        }
        structure.c0(Integer.valueOf(i4), toArray());
    }

    @Override // kotlin.collections.AbstractC2091f, java.util.AbstractList, java.util.List
    public E set(int i4, E e4) {
        AbstractC2088c.f51901E.b(i4, size());
        int w3 = w(this.f51938E + i4);
        Object[] objArr = this.f51939F;
        E e5 = (E) objArr[w3];
        objArr[w3] = e4;
        return e5;
    }

    public final E t() {
        int J3;
        if (!isEmpty()) {
            Object[] objArr = this.f51939F;
            int i4 = this.f51938E;
            J3 = CollectionsKt__CollectionsKt.J(this);
            return (E) objArr[w(i4 + J3)];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @l3.d
    public <T> T[] toArray(@l3.d T[] array) {
        Object[] n4;
        kotlin.jvm.internal.F.p(array, "array");
        if (array.length < size()) {
            array = (T[]) C2098m.a(array, size());
        }
        int w3 = w(this.f51938E + size());
        int i4 = this.f51938E;
        if (i4 < w3) {
            C2100o.K0(this.f51939F, array, 0, i4, w3, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f51939F;
            C2100o.B0(objArr, array, 0, this.f51938E, objArr.length);
            Object[] objArr2 = this.f51939F;
            C2100o.B0(objArr2, array, objArr2.length - this.f51938E, 0, w3);
        }
        n4 = C2108v.n(size(), array);
        return (T[]) n4;
    }

    @l3.e
    public final E u() {
        int J3;
        if (isEmpty()) {
            return null;
        }
        Object[] objArr = this.f51939F;
        int i4 = this.f51938E;
        J3 = CollectionsKt__CollectionsKt.J(this);
        return (E) objArr[w(i4 + J3)];
    }

    @l3.e
    public final E x() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @l3.e
    public final E y() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @l3.d
    public final Object[] z() {
        return toArray();
    }

    @Override // kotlin.collections.AbstractC2091f, java.util.AbstractList, java.util.List
    public void add(int i4, E e4) {
        AbstractC2088c.f51901E.c(i4, size());
        if (i4 == size()) {
            addLast(e4);
            return;
        }
        if (i4 == 0) {
            addFirst(e4);
            return;
        }
        l(size() + 1);
        int w3 = w(this.f51938E + i4);
        if (i4 < ((size() + 1) >> 1)) {
            int k4 = k(w3);
            int k5 = k(this.f51938E);
            int i5 = this.f51938E;
            if (k4 >= i5) {
                Object[] objArr = this.f51939F;
                objArr[k5] = objArr[i5];
                C2100o.B0(objArr, objArr, i5, i5 + 1, k4 + 1);
            } else {
                Object[] objArr2 = this.f51939F;
                C2100o.B0(objArr2, objArr2, i5 - 1, i5, objArr2.length);
                Object[] objArr3 = this.f51939F;
                objArr3[objArr3.length - 1] = objArr3[0];
                C2100o.B0(objArr3, objArr3, 0, 1, k4 + 1);
            }
            this.f51939F[k4] = e4;
            this.f51938E = k5;
        } else {
            int w4 = w(this.f51938E + size());
            if (w3 < w4) {
                Object[] objArr4 = this.f51939F;
                C2100o.B0(objArr4, objArr4, w3 + 1, w3, w4);
            } else {
                Object[] objArr5 = this.f51939F;
                C2100o.B0(objArr5, objArr5, 1, 0, w4);
                Object[] objArr6 = this.f51939F;
                objArr6[0] = objArr6[objArr6.length - 1];
                C2100o.B0(objArr6, objArr6, w3 + 1, w3, objArr6.length - 1);
            }
            this.f51939F[w3] = e4;
        }
        this.f51940G = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i4, @l3.d Collection<? extends E> elements) {
        kotlin.jvm.internal.F.p(elements, "elements");
        AbstractC2088c.f51901E.c(i4, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i4 == size()) {
            return addAll(elements);
        }
        l(size() + elements.size());
        int w3 = w(this.f51938E + size());
        int w4 = w(this.f51938E + i4);
        int size = elements.size();
        if (i4 < ((size() + 1) >> 1)) {
            int i5 = this.f51938E;
            int i6 = i5 - size;
            if (w4 < i5) {
                Object[] objArr = this.f51939F;
                C2100o.B0(objArr, objArr, i6, i5, objArr.length);
                if (size >= w4) {
                    Object[] objArr2 = this.f51939F;
                    C2100o.B0(objArr2, objArr2, objArr2.length - size, 0, w4);
                } else {
                    Object[] objArr3 = this.f51939F;
                    C2100o.B0(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f51939F;
                    C2100o.B0(objArr4, objArr4, 0, size, w4);
                }
            } else if (i6 >= 0) {
                Object[] objArr5 = this.f51939F;
                C2100o.B0(objArr5, objArr5, i6, i5, w4);
            } else {
                Object[] objArr6 = this.f51939F;
                i6 += objArr6.length;
                int i7 = w4 - i5;
                int length = objArr6.length - i6;
                if (length >= i7) {
                    C2100o.B0(objArr6, objArr6, i6, i5, w4);
                } else {
                    C2100o.B0(objArr6, objArr6, i6, i5, i5 + length);
                    Object[] objArr7 = this.f51939F;
                    C2100o.B0(objArr7, objArr7, 0, this.f51938E + length, w4);
                }
            }
            this.f51938E = i6;
            d(v(w4 - size), elements);
        } else {
            int i8 = w4 + size;
            if (w4 < w3) {
                int i9 = size + w3;
                Object[] objArr8 = this.f51939F;
                if (i9 <= objArr8.length) {
                    C2100o.B0(objArr8, objArr8, i8, w4, w3);
                } else if (i8 >= objArr8.length) {
                    C2100o.B0(objArr8, objArr8, i8 - objArr8.length, w4, w3);
                } else {
                    int length2 = w3 - (i9 - objArr8.length);
                    C2100o.B0(objArr8, objArr8, 0, length2, w3);
                    Object[] objArr9 = this.f51939F;
                    C2100o.B0(objArr9, objArr9, i8, w4, length2);
                }
            } else {
                Object[] objArr10 = this.f51939F;
                C2100o.B0(objArr10, objArr10, size, 0, w3);
                Object[] objArr11 = this.f51939F;
                if (i8 >= objArr11.length) {
                    C2100o.B0(objArr11, objArr11, i8 - objArr11.length, w4, objArr11.length);
                } else {
                    C2100o.B0(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f51939F;
                    C2100o.B0(objArr12, objArr12, i8, w4, objArr12.length - size);
                }
            }
            d(w4, elements);
        }
        return true;
    }

    public C2096k() {
        this.f51939F = f51936I;
    }

    public C2096k(@l3.d Collection<? extends E> elements) {
        kotlin.jvm.internal.F.p(elements, "elements");
        Object[] array = elements.toArray(new Object[0]);
        this.f51939F = array;
        this.f51940G = array.length;
        if (array.length == 0) {
            this.f51939F = f51936I;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @l3.d
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
