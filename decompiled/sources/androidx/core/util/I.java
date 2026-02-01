package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.SparseLongArray;
import androidx.annotation.W;
import kotlin.H0;
import kotlin.collections.P;
import kotlin.collections.Q;

/* loaded from: classes.dex */
public final class I {

    /* loaded from: classes.dex */
    public static final class a extends P {

        /* renamed from: E, reason: collision with root package name */
        private int f12996E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ SparseLongArray f12997F;

        a(SparseLongArray sparseLongArray) {
            this.f12997F = sparseLongArray;
        }

        @Override // kotlin.collections.P
        public int c() {
            SparseLongArray sparseLongArray = this.f12997F;
            int i4 = this.f12996E;
            this.f12996E = i4 + 1;
            return sparseLongArray.keyAt(i4);
        }

        public final int d() {
            return this.f12996E;
        }

        public final void e(int i4) {
            this.f12996E = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f12996E < this.f12997F.size()) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Q {

        /* renamed from: E, reason: collision with root package name */
        private int f12998E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ SparseLongArray f12999F;

        b(SparseLongArray sparseLongArray) {
            this.f12999F = sparseLongArray;
        }

        @Override // kotlin.collections.Q
        public long c() {
            SparseLongArray sparseLongArray = this.f12999F;
            int i4 = this.f12998E;
            this.f12998E = i4 + 1;
            return sparseLongArray.valueAt(i4);
        }

        public final int d() {
            return this.f12998E;
        }

        public final void e(int i4) {
            this.f12998E = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f12998E < this.f12999F.size()) {
                return true;
            }
            return false;
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    @W(18)
    public static final boolean a(@l3.d SparseLongArray sparseLongArray, int i4) {
        kotlin.jvm.internal.F.p(sparseLongArray, "<this>");
        if (sparseLongArray.indexOfKey(i4) >= 0) {
            return true;
        }
        return false;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @W(18)
    public static final boolean b(@l3.d SparseLongArray sparseLongArray, int i4) {
        kotlin.jvm.internal.F.p(sparseLongArray, "<this>");
        if (sparseLongArray.indexOfKey(i4) >= 0) {
            return true;
        }
        return false;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @W(18)
    public static final boolean c(@l3.d SparseLongArray sparseLongArray, long j4) {
        kotlin.jvm.internal.F.p(sparseLongArray, "<this>");
        if (sparseLongArray.indexOfValue(j4) >= 0) {
            return true;
        }
        return false;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @W(18)
    public static final void d(@l3.d SparseLongArray sparseLongArray, @l3.d X2.p<? super Integer, ? super Long, H0> action) {
        kotlin.jvm.internal.F.p(sparseLongArray, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        int size = sparseLongArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            action.c0(Integer.valueOf(sparseLongArray.keyAt(i4)), Long.valueOf(sparseLongArray.valueAt(i4)));
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    @W(18)
    public static final long e(@l3.d SparseLongArray sparseLongArray, int i4, long j4) {
        kotlin.jvm.internal.F.p(sparseLongArray, "<this>");
        return sparseLongArray.get(i4, j4);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @W(18)
    public static final long f(@l3.d SparseLongArray sparseLongArray, int i4, @l3.d X2.a<Long> defaultValue) {
        kotlin.jvm.internal.F.p(sparseLongArray, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        int indexOfKey = sparseLongArray.indexOfKey(i4);
        if (indexOfKey >= 0) {
            return sparseLongArray.valueAt(indexOfKey);
        }
        return defaultValue.n().longValue();
    }

    @SuppressLint({"ClassVerificationFailure"})
    @W(18)
    public static final int g(@l3.d SparseLongArray sparseLongArray) {
        kotlin.jvm.internal.F.p(sparseLongArray, "<this>");
        return sparseLongArray.size();
    }

    @SuppressLint({"ClassVerificationFailure"})
    @W(18)
    public static final boolean h(@l3.d SparseLongArray sparseLongArray) {
        kotlin.jvm.internal.F.p(sparseLongArray, "<this>");
        if (sparseLongArray.size() == 0) {
            return true;
        }
        return false;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @W(18)
    public static final boolean i(@l3.d SparseLongArray sparseLongArray) {
        kotlin.jvm.internal.F.p(sparseLongArray, "<this>");
        if (sparseLongArray.size() != 0) {
            return true;
        }
        return false;
    }

    @l3.d
    @SuppressLint({"ClassVerificationFailure"})
    @W(18)
    public static final P j(@l3.d SparseLongArray sparseLongArray) {
        kotlin.jvm.internal.F.p(sparseLongArray, "<this>");
        return new a(sparseLongArray);
    }

    @l3.d
    @SuppressLint({"ClassVerificationFailure"})
    @W(18)
    public static final SparseLongArray k(@l3.d SparseLongArray sparseLongArray, @l3.d SparseLongArray other) {
        kotlin.jvm.internal.F.p(sparseLongArray, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        SparseLongArray sparseLongArray2 = new SparseLongArray(sparseLongArray.size() + other.size());
        l(sparseLongArray2, sparseLongArray);
        l(sparseLongArray2, other);
        return sparseLongArray2;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @W(18)
    public static final void l(@l3.d SparseLongArray sparseLongArray, @l3.d SparseLongArray other) {
        kotlin.jvm.internal.F.p(sparseLongArray, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int size = other.size();
        for (int i4 = 0; i4 < size; i4++) {
            sparseLongArray.put(other.keyAt(i4), other.valueAt(i4));
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    @W(18)
    public static final boolean m(@l3.d SparseLongArray sparseLongArray, int i4, long j4) {
        kotlin.jvm.internal.F.p(sparseLongArray, "<this>");
        int indexOfKey = sparseLongArray.indexOfKey(i4);
        if (indexOfKey >= 0 && j4 == sparseLongArray.valueAt(indexOfKey)) {
            sparseLongArray.removeAt(indexOfKey);
            return true;
        }
        return false;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @W(18)
    public static final void n(@l3.d SparseLongArray sparseLongArray, int i4, long j4) {
        kotlin.jvm.internal.F.p(sparseLongArray, "<this>");
        sparseLongArray.put(i4, j4);
    }

    @l3.d
    @SuppressLint({"ClassVerificationFailure"})
    @W(18)
    public static final Q o(@l3.d SparseLongArray sparseLongArray) {
        kotlin.jvm.internal.F.p(sparseLongArray, "<this>");
        return new b(sparseLongArray);
    }
}
