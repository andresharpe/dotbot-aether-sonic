package kotlin;

/* loaded from: classes2.dex */
public final class T {
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <V> V a(kotlin.reflect.o<? extends V> oVar, Object obj, kotlin.reflect.n<?> property) {
        kotlin.jvm.internal.F.p(oVar, "<this>");
        kotlin.jvm.internal.F.p(property, "property");
        return oVar.get();
    }

    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, V> V b(kotlin.reflect.p<T, ? extends V> pVar, T t3, kotlin.reflect.n<?> property) {
        kotlin.jvm.internal.F.p(pVar, "<this>");
        kotlin.jvm.internal.F.p(property, "property");
        return pVar.get(t3);
    }

    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <V> void c(kotlin.reflect.k<V> kVar, Object obj, kotlin.reflect.n<?> property, V v3) {
        kotlin.jvm.internal.F.p(kVar, "<this>");
        kotlin.jvm.internal.F.p(property, "property");
        kVar.set(v3);
    }

    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, V> void d(kotlin.reflect.l<T, V> lVar, T t3, kotlin.reflect.n<?> property, V v3) {
        kotlin.jvm.internal.F.p(lVar, "<this>");
        kotlin.jvm.internal.F.p(property, "property");
        lVar.W(t3, v3);
    }
}
