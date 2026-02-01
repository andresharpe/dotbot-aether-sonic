package kotlin.collections;

import java.util.Iterator;
import kotlin.H0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlin.collections.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2111y extends C2110x {
    public static final <T> void g0(@l3.d Iterator<? extends T> it, @l3.d X2.l<? super T, H0> operation) {
        kotlin.jvm.internal.F.p(it, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        while (it.hasNext()) {
            operation.C(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.internal.f
    private static final <T> Iterator<T> h0(Iterator<? extends T> it) {
        kotlin.jvm.internal.F.p(it, "<this>");
        return it;
    }

    @l3.d
    public static final <T> Iterator<M<T>> i0(@l3.d Iterator<? extends T> it) {
        kotlin.jvm.internal.F.p(it, "<this>");
        return new O(it);
    }
}
