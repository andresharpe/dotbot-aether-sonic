package kotlin;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

@W2.i(name = "TuplesKt")
/* renamed from: kotlin.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2122h0 {
    @l3.d
    public static final <A, B> Pair<A, B> a(A a4, B b4) {
        return new Pair<>(a4, b4);
    }

    @l3.d
    public static final <T> List<T> b(@l3.d Pair<? extends T, ? extends T> pair) {
        List<T> O3;
        kotlin.jvm.internal.F.p(pair, "<this>");
        O3 = CollectionsKt__CollectionsKt.O(pair.e(), pair.f());
        return O3;
    }

    @l3.d
    public static final <T> List<T> c(@l3.d Triple<? extends T, ? extends T, ? extends T> triple) {
        List<T> O3;
        kotlin.jvm.internal.F.p(triple, "<this>");
        O3 = CollectionsKt__CollectionsKt.O(triple.f(), triple.g(), triple.h());
        return O3;
    }
}
