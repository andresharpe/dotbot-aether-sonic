package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.LongSparseArray;
import androidx.annotation.W;
import java.util.Iterator;
import kotlin.H0;
import kotlin.collections.Q;

/* loaded from: classes.dex */
public final class o {

    /* loaded from: classes.dex */
    public static final class a extends Q {

        /* renamed from: E, reason: collision with root package name */
        private int f13021E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ LongSparseArray<T> f13022F;

        a(LongSparseArray<T> longSparseArray) {
            this.f13022F = longSparseArray;
        }

        @Override // kotlin.collections.Q
        @SuppressLint({"ClassVerificationFailure"})
        public long c() {
            LongSparseArray<T> longSparseArray = this.f13022F;
            int i4 = this.f13021E;
            this.f13021E = i4 + 1;
            return longSparseArray.keyAt(i4);
        }

        public final int d() {
            return this.f13021E;
        }

        public final void e(int i4) {
            this.f13021E = i4;
        }

        @Override // java.util.Iterator
        @SuppressLint({"ClassVerificationFailure"})
        public boolean hasNext() {
            if (this.f13021E < this.f13022F.size()) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class b<T> implements Iterator<T>, Y2.a {

        /* renamed from: E, reason: collision with root package name */
        private int f13023E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ LongSparseArray<T> f13024F;

        b(LongSparseArray<T> longSparseArray) {
            this.f13024F = longSparseArray;
        }

        public final int b() {
            return this.f13023E;
        }

        public final void c(int i4) {
            this.f13023E = i4;
        }

        @Override // java.util.Iterator
        @SuppressLint({"ClassVerificationFailure"})
        public boolean hasNext() {
            if (this.f13023E < this.f13024F.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        @SuppressLint({"ClassVerificationFailure"})
        public T next() {
            LongSparseArray<T> longSparseArray = this.f13024F;
            int i4 = this.f13023E;
            this.f13023E = i4 + 1;
            return longSparseArray.valueAt(i4);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    @W(16)
    public static final <T> boolean a(@l3.d LongSparseArray<T> longSparseArray, long j4) {
        kotlin.jvm.internal.F.p(longSparseArray, "<this>");
        if (longSparseArray.indexOfKey(j4) >= 0) {
            return true;
        }
        return false;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @W(16)
    public static final <T> boolean b(@l3.d LongSparseArray<T> longSparseArray, long j4) {
        kotlin.jvm.internal.F.p(longSparseArray, "<this>");
        if (longSparseArray.indexOfKey(j4) >= 0) {
            return true;
        }
        return false;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @W(16)
    public static final <T> boolean c(@l3.d LongSparseArray<T> longSparseArray, T t3) {
        kotlin.jvm.internal.F.p(longSparseArray, "<this>");
        if (longSparseArray.indexOfValue(t3) >= 0) {
            return true;
        }
        return false;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @W(16)
    public static final <T> void d(@l3.d LongSparseArray<T> longSparseArray, @l3.d X2.p<? super Long, ? super T, H0> action) {
        kotlin.jvm.internal.F.p(longSparseArray, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        int size = longSparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            action.c0(Long.valueOf(longSparseArray.keyAt(i4)), longSparseArray.valueAt(i4));
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    @W(16)
    public static final <T> T e(@l3.d LongSparseArray<T> longSparseArray, long j4, T t3) {
        kotlin.jvm.internal.F.p(longSparseArray, "<this>");
        T t4 = longSparseArray.get(j4);
        if (t4 != null) {
            return t4;
        }
        return t3;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @W(16)
    public static final <T> T f(@l3.d LongSparseArray<T> longSparseArray, long j4, @l3.d X2.a<? extends T> defaultValue) {
        kotlin.jvm.internal.F.p(longSparseArray, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        T t3 = longSparseArray.get(j4);
        if (t3 == null) {
            return defaultValue.n();
        }
        return t3;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @W(16)
    public static final <T> int g(@l3.d LongSparseArray<T> longSparseArray) {
        kotlin.jvm.internal.F.p(longSparseArray, "<this>");
        return longSparseArray.size();
    }

    @SuppressLint({"ClassVerificationFailure"})
    @W(16)
    public static final <T> boolean h(@l3.d LongSparseArray<T> longSparseArray) {
        kotlin.jvm.internal.F.p(longSparseArray, "<this>");
        if (longSparseArray.size() == 0) {
            return true;
        }
        return false;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @W(16)
    public static final <T> boolean i(@l3.d LongSparseArray<T> longSparseArray) {
        kotlin.jvm.internal.F.p(longSparseArray, "<this>");
        if (longSparseArray.size() != 0) {
            return true;
        }
        return false;
    }

    @l3.d
    @W(16)
    public static final <T> Q j(@l3.d LongSparseArray<T> longSparseArray) {
        kotlin.jvm.internal.F.p(longSparseArray, "<this>");
        return new a(longSparseArray);
    }

    @l3.d
    @SuppressLint({"ClassVerificationFailure"})
    @W(16)
    public static final <T> LongSparseArray<T> k(@l3.d LongSparseArray<T> longSparseArray, @l3.d LongSparseArray<T> other) {
        kotlin.jvm.internal.F.p(longSparseArray, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        LongSparseArray<T> longSparseArray2 = new LongSparseArray<>(longSparseArray.size() + other.size());
        l(longSparseArray2, longSparseArray);
        l(longSparseArray2, other);
        return longSparseArray2;
    }

    @W(16)
    public static final <T> void l(@l3.d LongSparseArray<T> longSparseArray, @l3.d LongSparseArray<T> other) {
        kotlin.jvm.internal.F.p(longSparseArray, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int size = other.size();
        for (int i4 = 0; i4 < size; i4++) {
            longSparseArray.put(other.keyAt(i4), other.valueAt(i4));
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    @W(16)
    public static final <T> boolean m(@l3.d LongSparseArray<T> longSparseArray, long j4, T t3) {
        kotlin.jvm.internal.F.p(longSparseArray, "<this>");
        int indexOfKey = longSparseArray.indexOfKey(j4);
        if (indexOfKey >= 0 && kotlin.jvm.internal.F.g(t3, longSparseArray.valueAt(indexOfKey))) {
            longSparseArray.removeAt(indexOfKey);
            return true;
        }
        return false;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @W(16)
    public static final <T> void n(@l3.d LongSparseArray<T> longSparseArray, long j4, T t3) {
        kotlin.jvm.internal.F.p(longSparseArray, "<this>");
        longSparseArray.put(j4, t3);
    }

    @l3.d
    @W(16)
    public static final <T> Iterator<T> o(@l3.d LongSparseArray<T> longSparseArray) {
        kotlin.jvm.internal.F.p(longSparseArray, "<this>");
        return new b(longSparseArray);
    }
}
