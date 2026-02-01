package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC2205l;
import kotlin.NotImplementedError;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlin.collections.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2112z extends C2111y {
    @kotlin.Y(version = "1.2")
    @kotlin.internal.f
    private static final <T> void j0(List<T> list, T t3) {
        kotlin.jvm.internal.F.p(list, "<this>");
        Collections.fill(list, t3);
    }

    @kotlin.Y(version = "1.2")
    @kotlin.internal.f
    private static final <T> void k0(List<T> list) {
        kotlin.jvm.internal.F.p(list, "<this>");
        Collections.shuffle(list);
    }

    @kotlin.Y(version = "1.2")
    @kotlin.internal.f
    private static final <T> void l0(List<T> list, Random random) {
        kotlin.jvm.internal.F.p(list, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        Collections.shuffle(list, random);
    }

    public static <T extends Comparable<? super T>> void m0(@l3.d List<T> list) {
        kotlin.jvm.internal.F.p(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Use sortWith(Comparator(comparison)) instead.", replaceWith = @kotlin.V(expression = "this.sortWith(Comparator(comparison))", imports = {}))
    @kotlin.internal.f
    private static final <T> void n0(List<T> list, X2.p<? super T, ? super T, Integer> comparison) {
        kotlin.jvm.internal.F.p(list, "<this>");
        kotlin.jvm.internal.F.p(comparison, "comparison");
        throw new NotImplementedError(null, 1, null);
    }

    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Use sortWith(comparator) instead.", replaceWith = @kotlin.V(expression = "this.sortWith(comparator)", imports = {}))
    @kotlin.internal.f
    private static final <T> void o0(List<T> list, Comparator<? super T> comparator) {
        kotlin.jvm.internal.F.p(list, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        throw new NotImplementedError(null, 1, null);
    }

    public static <T> void p0(@l3.d List<T> list, @l3.d Comparator<? super T> comparator) {
        kotlin.jvm.internal.F.p(list, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
