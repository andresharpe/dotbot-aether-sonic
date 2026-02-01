package androidx.core.util;

import android.util.SparseArray;
import java.util.Iterator;
import kotlin.H0;
import kotlin.collections.P;

/* loaded from: classes.dex */
public final class F {

    /* loaded from: classes.dex */
    public static final class a extends P {

        /* renamed from: E, reason: collision with root package name */
        private int f12984E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ SparseArray<T> f12985F;

        a(SparseArray<T> sparseArray) {
            this.f12985F = sparseArray;
        }

        @Override // kotlin.collections.P
        public int c() {
            SparseArray<T> sparseArray = this.f12985F;
            int i4 = this.f12984E;
            this.f12984E = i4 + 1;
            return sparseArray.keyAt(i4);
        }

        public final int d() {
            return this.f12984E;
        }

        public final void e(int i4) {
            this.f12984E = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f12984E < this.f12985F.size()) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class b<T> implements Iterator<T>, Y2.a {

        /* renamed from: E, reason: collision with root package name */
        private int f12986E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ SparseArray<T> f12987F;

        b(SparseArray<T> sparseArray) {
            this.f12987F = sparseArray;
        }

        public final int b() {
            return this.f12986E;
        }

        public final void c(int i4) {
            this.f12986E = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f12986E < this.f12987F.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            SparseArray<T> sparseArray = this.f12987F;
            int i4 = this.f12986E;
            this.f12986E = i4 + 1;
            return sparseArray.valueAt(i4);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> boolean a(@l3.d SparseArray<T> sparseArray, int i4) {
        kotlin.jvm.internal.F.p(sparseArray, "<this>");
        if (sparseArray.indexOfKey(i4) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean b(@l3.d SparseArray<T> sparseArray, int i4) {
        kotlin.jvm.internal.F.p(sparseArray, "<this>");
        if (sparseArray.indexOfKey(i4) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean c(@l3.d SparseArray<T> sparseArray, T t3) {
        kotlin.jvm.internal.F.p(sparseArray, "<this>");
        if (sparseArray.indexOfValue(t3) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> void d(@l3.d SparseArray<T> sparseArray, @l3.d X2.p<? super Integer, ? super T, H0> action) {
        kotlin.jvm.internal.F.p(sparseArray, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        int size = sparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            action.c0(Integer.valueOf(sparseArray.keyAt(i4)), sparseArray.valueAt(i4));
        }
    }

    public static final <T> T e(@l3.d SparseArray<T> sparseArray, int i4, T t3) {
        kotlin.jvm.internal.F.p(sparseArray, "<this>");
        T t4 = sparseArray.get(i4);
        if (t4 != null) {
            return t4;
        }
        return t3;
    }

    public static final <T> T f(@l3.d SparseArray<T> sparseArray, int i4, @l3.d X2.a<? extends T> defaultValue) {
        kotlin.jvm.internal.F.p(sparseArray, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        T t3 = sparseArray.get(i4);
        if (t3 == null) {
            return defaultValue.n();
        }
        return t3;
    }

    public static final <T> int g(@l3.d SparseArray<T> sparseArray) {
        kotlin.jvm.internal.F.p(sparseArray, "<this>");
        return sparseArray.size();
    }

    public static final <T> boolean h(@l3.d SparseArray<T> sparseArray) {
        kotlin.jvm.internal.F.p(sparseArray, "<this>");
        if (sparseArray.size() == 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean i(@l3.d SparseArray<T> sparseArray) {
        kotlin.jvm.internal.F.p(sparseArray, "<this>");
        if (sparseArray.size() != 0) {
            return true;
        }
        return false;
    }

    @l3.d
    public static final <T> P j(@l3.d SparseArray<T> sparseArray) {
        kotlin.jvm.internal.F.p(sparseArray, "<this>");
        return new a(sparseArray);
    }

    @l3.d
    public static final <T> SparseArray<T> k(@l3.d SparseArray<T> sparseArray, @l3.d SparseArray<T> other) {
        kotlin.jvm.internal.F.p(sparseArray, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        SparseArray<T> sparseArray2 = new SparseArray<>(sparseArray.size() + other.size());
        l(sparseArray2, sparseArray);
        l(sparseArray2, other);
        return sparseArray2;
    }

    public static final <T> void l(@l3.d SparseArray<T> sparseArray, @l3.d SparseArray<T> other) {
        kotlin.jvm.internal.F.p(sparseArray, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int size = other.size();
        for (int i4 = 0; i4 < size; i4++) {
            sparseArray.put(other.keyAt(i4), other.valueAt(i4));
        }
    }

    public static final <T> boolean m(@l3.d SparseArray<T> sparseArray, int i4, T t3) {
        kotlin.jvm.internal.F.p(sparseArray, "<this>");
        int indexOfKey = sparseArray.indexOfKey(i4);
        if (indexOfKey >= 0 && kotlin.jvm.internal.F.g(t3, sparseArray.valueAt(indexOfKey))) {
            sparseArray.removeAt(indexOfKey);
            return true;
        }
        return false;
    }

    public static final <T> void n(@l3.d SparseArray<T> sparseArray, int i4, T t3) {
        kotlin.jvm.internal.F.p(sparseArray, "<this>");
        sparseArray.put(i4, t3);
    }

    @l3.d
    public static final <T> Iterator<T> o(@l3.d SparseArray<T> sparseArray) {
        kotlin.jvm.internal.F.p(sparseArray, "<this>");
        return new b(sparseArray);
    }
}
