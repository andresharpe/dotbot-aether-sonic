package kotlin.collections.builders;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@U({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,487:1\n1#2:488\n*E\n"})
/* loaded from: classes2.dex */
public final class b {
    @l3.d
    public static final <E> E[] d(int i4) {
        if (i4 >= 0) {
            return (E[]) new Object[i4];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    @l3.d
    public static final <T> T[] e(@l3.d T[] tArr, int i4) {
        F.p(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i4);
        F.o(tArr2, "copyOf(...)");
        return tArr2;
    }

    public static final <E> void f(@l3.d E[] eArr, int i4) {
        F.p(eArr, "<this>");
        eArr[i4] = null;
    }

    public static final <E> void g(@l3.d E[] eArr, int i4, int i5) {
        F.p(eArr, "<this>");
        while (i4 < i5) {
            f(eArr, i4);
            i4++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean h(T[] tArr, int i4, int i5, List<?> list) {
        if (i5 != list.size()) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            if (!F.g(tArr[i4 + i6], list.get(i6))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int i(T[] tArr, int i4, int i5) {
        int i6;
        int i7 = 1;
        for (int i8 = 0; i8 < i5; i8++) {
            T t3 = tArr[i4 + i8];
            int i9 = i7 * 31;
            if (t3 != null) {
                i6 = t3.hashCode();
            } else {
                i6 = 0;
            }
            i7 = i9 + i6;
        }
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> String j(T[] tArr, int i4, int i5, Collection<? extends T> collection) {
        StringBuilder sb = new StringBuilder((i5 * 3) + 2);
        sb.append("[");
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            T t3 = tArr[i4 + i6];
            if (t3 == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(t3);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        F.o(sb2, "toString(...)");
        return sb2;
    }
}
