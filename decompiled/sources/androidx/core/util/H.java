package androidx.core.util;

import android.util.SparseIntArray;
import kotlin.H0;
import kotlin.collections.P;

/* loaded from: classes.dex */
public final class H {

    /* loaded from: classes.dex */
    public static final class a extends P {

        /* renamed from: E, reason: collision with root package name */
        private int f12992E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ SparseIntArray f12993F;

        a(SparseIntArray sparseIntArray) {
            this.f12993F = sparseIntArray;
        }

        @Override // kotlin.collections.P
        public int c() {
            SparseIntArray sparseIntArray = this.f12993F;
            int i4 = this.f12992E;
            this.f12992E = i4 + 1;
            return sparseIntArray.keyAt(i4);
        }

        public final int d() {
            return this.f12992E;
        }

        public final void e(int i4) {
            this.f12992E = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f12992E < this.f12993F.size()) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends P {

        /* renamed from: E, reason: collision with root package name */
        private int f12994E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ SparseIntArray f12995F;

        b(SparseIntArray sparseIntArray) {
            this.f12995F = sparseIntArray;
        }

        @Override // kotlin.collections.P
        public int c() {
            SparseIntArray sparseIntArray = this.f12995F;
            int i4 = this.f12994E;
            this.f12994E = i4 + 1;
            return sparseIntArray.valueAt(i4);
        }

        public final int d() {
            return this.f12994E;
        }

        public final void e(int i4) {
            this.f12994E = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f12994E < this.f12995F.size()) {
                return true;
            }
            return false;
        }
    }

    public static final boolean a(@l3.d SparseIntArray sparseIntArray, int i4) {
        kotlin.jvm.internal.F.p(sparseIntArray, "<this>");
        if (sparseIntArray.indexOfKey(i4) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean b(@l3.d SparseIntArray sparseIntArray, int i4) {
        kotlin.jvm.internal.F.p(sparseIntArray, "<this>");
        if (sparseIntArray.indexOfKey(i4) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean c(@l3.d SparseIntArray sparseIntArray, int i4) {
        kotlin.jvm.internal.F.p(sparseIntArray, "<this>");
        if (sparseIntArray.indexOfValue(i4) >= 0) {
            return true;
        }
        return false;
    }

    public static final void d(@l3.d SparseIntArray sparseIntArray, @l3.d X2.p<? super Integer, ? super Integer, H0> action) {
        kotlin.jvm.internal.F.p(sparseIntArray, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        int size = sparseIntArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            action.c0(Integer.valueOf(sparseIntArray.keyAt(i4)), Integer.valueOf(sparseIntArray.valueAt(i4)));
        }
    }

    public static final int e(@l3.d SparseIntArray sparseIntArray, int i4, int i5) {
        kotlin.jvm.internal.F.p(sparseIntArray, "<this>");
        return sparseIntArray.get(i4, i5);
    }

    public static final int f(@l3.d SparseIntArray sparseIntArray, int i4, @l3.d X2.a<Integer> defaultValue) {
        kotlin.jvm.internal.F.p(sparseIntArray, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        int indexOfKey = sparseIntArray.indexOfKey(i4);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        return defaultValue.n().intValue();
    }

    public static final int g(@l3.d SparseIntArray sparseIntArray) {
        kotlin.jvm.internal.F.p(sparseIntArray, "<this>");
        return sparseIntArray.size();
    }

    public static final boolean h(@l3.d SparseIntArray sparseIntArray) {
        kotlin.jvm.internal.F.p(sparseIntArray, "<this>");
        if (sparseIntArray.size() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean i(@l3.d SparseIntArray sparseIntArray) {
        kotlin.jvm.internal.F.p(sparseIntArray, "<this>");
        if (sparseIntArray.size() != 0) {
            return true;
        }
        return false;
    }

    @l3.d
    public static final P j(@l3.d SparseIntArray sparseIntArray) {
        kotlin.jvm.internal.F.p(sparseIntArray, "<this>");
        return new a(sparseIntArray);
    }

    @l3.d
    public static final SparseIntArray k(@l3.d SparseIntArray sparseIntArray, @l3.d SparseIntArray other) {
        kotlin.jvm.internal.F.p(sparseIntArray, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        SparseIntArray sparseIntArray2 = new SparseIntArray(sparseIntArray.size() + other.size());
        l(sparseIntArray2, sparseIntArray);
        l(sparseIntArray2, other);
        return sparseIntArray2;
    }

    public static final void l(@l3.d SparseIntArray sparseIntArray, @l3.d SparseIntArray other) {
        kotlin.jvm.internal.F.p(sparseIntArray, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int size = other.size();
        for (int i4 = 0; i4 < size; i4++) {
            sparseIntArray.put(other.keyAt(i4), other.valueAt(i4));
        }
    }

    public static final boolean m(@l3.d SparseIntArray sparseIntArray, int i4, int i5) {
        kotlin.jvm.internal.F.p(sparseIntArray, "<this>");
        int indexOfKey = sparseIntArray.indexOfKey(i4);
        if (indexOfKey >= 0 && i5 == sparseIntArray.valueAt(indexOfKey)) {
            sparseIntArray.removeAt(indexOfKey);
            return true;
        }
        return false;
    }

    public static final void n(@l3.d SparseIntArray sparseIntArray, int i4, int i5) {
        kotlin.jvm.internal.F.p(sparseIntArray, "<this>");
        sparseIntArray.put(i4, i5);
    }

    @l3.d
    public static final P o(@l3.d SparseIntArray sparseIntArray) {
        kotlin.jvm.internal.F.p(sparseIntArray, "<this>");
        return new b(sparseIntArray);
    }
}
