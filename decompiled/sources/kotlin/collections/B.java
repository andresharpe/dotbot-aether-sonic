package kotlin.collections;

import java.util.List;

/* loaded from: classes2.dex */
class B extends A {
    @l3.d
    public static final <T> List<T> a1(@l3.d List<? extends T> list) {
        kotlin.jvm.internal.F.p(list, "<this>");
        return new f0(list);
    }

    @l3.d
    @W2.i(name = "asReversedMutable")
    public static final <T> List<T> b1(@l3.d List<T> list) {
        kotlin.jvm.internal.F.p(list, "<this>");
        return new e0(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c1(List<?> list, int i4) {
        int J3;
        int J4;
        int J5;
        J3 = CollectionsKt__CollectionsKt.J(list);
        if (new kotlin.ranges.l(0, J3).q(i4)) {
            J5 = CollectionsKt__CollectionsKt.J(list);
            return J5 - i4;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Element index ");
        sb.append(i4);
        sb.append(" must be in range [");
        J4 = CollectionsKt__CollectionsKt.J(list);
        sb.append(new kotlin.ranges.l(0, J4));
        sb.append("].");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d1(List<?> list, int i4) {
        int J3;
        J3 = CollectionsKt__CollectionsKt.J(list);
        return J3 - i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e1(List<?> list, int i4) {
        if (new kotlin.ranges.l(0, list.size()).q(i4)) {
            return list.size() - i4;
        }
        throw new IndexOutOfBoundsException("Position index " + i4 + " must be in range [" + new kotlin.ranges.l(0, list.size()) + "].");
    }
}
