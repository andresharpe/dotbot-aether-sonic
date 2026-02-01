package androidx.core.util;

import android.util.SparseBooleanArray;
import kotlin.H0;
import kotlin.collections.P;

/* loaded from: classes.dex */
public final class G {

    /* loaded from: classes.dex */
    public static final class a extends P {

        /* renamed from: E, reason: collision with root package name */
        private int f12988E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ SparseBooleanArray f12989F;

        a(SparseBooleanArray sparseBooleanArray) {
            this.f12989F = sparseBooleanArray;
        }

        @Override // kotlin.collections.P
        public int c() {
            SparseBooleanArray sparseBooleanArray = this.f12989F;
            int i4 = this.f12988E;
            this.f12988E = i4 + 1;
            return sparseBooleanArray.keyAt(i4);
        }

        public final int d() {
            return this.f12988E;
        }

        public final void e(int i4) {
            this.f12988E = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f12988E < this.f12989F.size()) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends kotlin.collections.r {

        /* renamed from: E, reason: collision with root package name */
        private int f12990E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ SparseBooleanArray f12991F;

        b(SparseBooleanArray sparseBooleanArray) {
            this.f12991F = sparseBooleanArray;
        }

        @Override // kotlin.collections.r
        public boolean c() {
            SparseBooleanArray sparseBooleanArray = this.f12991F;
            int i4 = this.f12990E;
            this.f12990E = i4 + 1;
            return sparseBooleanArray.valueAt(i4);
        }

        public final int d() {
            return this.f12990E;
        }

        public final void e(int i4) {
            this.f12990E = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f12990E < this.f12991F.size()) {
                return true;
            }
            return false;
        }
    }

    public static final boolean a(@l3.d SparseBooleanArray sparseBooleanArray, int i4) {
        kotlin.jvm.internal.F.p(sparseBooleanArray, "<this>");
        if (sparseBooleanArray.indexOfKey(i4) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean b(@l3.d SparseBooleanArray sparseBooleanArray, int i4) {
        kotlin.jvm.internal.F.p(sparseBooleanArray, "<this>");
        if (sparseBooleanArray.indexOfKey(i4) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean c(@l3.d SparseBooleanArray sparseBooleanArray, boolean z3) {
        kotlin.jvm.internal.F.p(sparseBooleanArray, "<this>");
        if (sparseBooleanArray.indexOfValue(z3) >= 0) {
            return true;
        }
        return false;
    }

    public static final void d(@l3.d SparseBooleanArray sparseBooleanArray, @l3.d X2.p<? super Integer, ? super Boolean, H0> action) {
        kotlin.jvm.internal.F.p(sparseBooleanArray, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        int size = sparseBooleanArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            action.c0(Integer.valueOf(sparseBooleanArray.keyAt(i4)), Boolean.valueOf(sparseBooleanArray.valueAt(i4)));
        }
    }

    public static final boolean e(@l3.d SparseBooleanArray sparseBooleanArray, int i4, boolean z3) {
        kotlin.jvm.internal.F.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.get(i4, z3);
    }

    public static final boolean f(@l3.d SparseBooleanArray sparseBooleanArray, int i4, @l3.d X2.a<Boolean> defaultValue) {
        kotlin.jvm.internal.F.p(sparseBooleanArray, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        int indexOfKey = sparseBooleanArray.indexOfKey(i4);
        if (indexOfKey >= 0) {
            return sparseBooleanArray.valueAt(indexOfKey);
        }
        return defaultValue.n().booleanValue();
    }

    public static final int g(@l3.d SparseBooleanArray sparseBooleanArray) {
        kotlin.jvm.internal.F.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.size();
    }

    public static final boolean h(@l3.d SparseBooleanArray sparseBooleanArray) {
        kotlin.jvm.internal.F.p(sparseBooleanArray, "<this>");
        if (sparseBooleanArray.size() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean i(@l3.d SparseBooleanArray sparseBooleanArray) {
        kotlin.jvm.internal.F.p(sparseBooleanArray, "<this>");
        if (sparseBooleanArray.size() != 0) {
            return true;
        }
        return false;
    }

    @l3.d
    public static final P j(@l3.d SparseBooleanArray sparseBooleanArray) {
        kotlin.jvm.internal.F.p(sparseBooleanArray, "<this>");
        return new a(sparseBooleanArray);
    }

    @l3.d
    public static final SparseBooleanArray k(@l3.d SparseBooleanArray sparseBooleanArray, @l3.d SparseBooleanArray other) {
        kotlin.jvm.internal.F.p(sparseBooleanArray, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(sparseBooleanArray.size() + other.size());
        l(sparseBooleanArray2, sparseBooleanArray);
        l(sparseBooleanArray2, other);
        return sparseBooleanArray2;
    }

    public static final void l(@l3.d SparseBooleanArray sparseBooleanArray, @l3.d SparseBooleanArray other) {
        kotlin.jvm.internal.F.p(sparseBooleanArray, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int size = other.size();
        for (int i4 = 0; i4 < size; i4++) {
            sparseBooleanArray.put(other.keyAt(i4), other.valueAt(i4));
        }
    }

    public static final boolean m(@l3.d SparseBooleanArray sparseBooleanArray, int i4, boolean z3) {
        kotlin.jvm.internal.F.p(sparseBooleanArray, "<this>");
        int indexOfKey = sparseBooleanArray.indexOfKey(i4);
        if (indexOfKey >= 0 && z3 == sparseBooleanArray.valueAt(indexOfKey)) {
            sparseBooleanArray.delete(i4);
            return true;
        }
        return false;
    }

    public static final void n(@l3.d SparseBooleanArray sparseBooleanArray, int i4, boolean z3) {
        kotlin.jvm.internal.F.p(sparseBooleanArray, "<this>");
        sparseBooleanArray.put(i4, z3);
    }

    @l3.d
    public static final kotlin.collections.r o(@l3.d SparseBooleanArray sparseBooleanArray) {
        kotlin.jvm.internal.F.p(sparseBooleanArray, "<this>");
        return new b(sparseBooleanArray);
    }
}
