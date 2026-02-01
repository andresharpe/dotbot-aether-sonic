package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Y;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
class i extends h {
    @Y(version = "1.4")
    public static final <T> T A0(T t3, @l3.d T[] other, @l3.d Comparator<? super T> comparator) {
        F.p(other, "other");
        F.p(comparator, "comparator");
        for (T t4 : other) {
            if (comparator.compare(t3, t4) < 0) {
                t3 = t4;
            }
        }
        return t3;
    }

    @Y(version = "1.1")
    public static final <T> T B0(T t3, T t4, T t5, @l3.d Comparator<? super T> comparator) {
        F.p(comparator, "comparator");
        return (T) C0(t3, C0(t4, t5, comparator), comparator);
    }

    @Y(version = "1.1")
    public static final <T> T C0(T t3, T t4, @l3.d Comparator<? super T> comparator) {
        F.p(comparator, "comparator");
        if (comparator.compare(t3, t4) > 0) {
            return t4;
        }
        return t3;
    }

    @Y(version = "1.4")
    public static final <T> T D0(T t3, @l3.d T[] other, @l3.d Comparator<? super T> comparator) {
        F.p(other, "other");
        F.p(comparator, "comparator");
        for (T t4 : other) {
            if (comparator.compare(t3, t4) > 0) {
                t3 = t4;
            }
        }
        return t3;
    }

    @Y(version = "1.1")
    public static final <T> T y0(T t3, T t4, T t5, @l3.d Comparator<? super T> comparator) {
        F.p(comparator, "comparator");
        return (T) z0(t3, z0(t4, t5, comparator), comparator);
    }

    @Y(version = "1.1")
    public static final <T> T z0(T t3, T t4, @l3.d Comparator<? super T> comparator) {
        F.p(comparator, "comparator");
        if (comparator.compare(t3, t4) < 0) {
            return t4;
        }
        return t3;
    }
}
