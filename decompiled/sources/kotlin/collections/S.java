package kotlin.collections;

import java.util.Map;

@W2.i(name = "MapAccessorsKt")
/* loaded from: classes2.dex */
public final class S {
    @kotlin.internal.f
    private static final <V, V1 extends V> V1 a(Map<? super String, ? extends V> map, Object obj, kotlin.reflect.n<?> property) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(property, "property");
        return (V1) W.a(map, property.getName());
    }

    @W2.i(name = "getVar")
    @kotlin.internal.f
    private static final <V, V1 extends V> V1 b(Map<? super String, ? extends V> map, Object obj, kotlin.reflect.n<?> property) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(property, "property");
        return (V1) W.a(map, property.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.internal.f
    private static final <V> void c(Map<? super String, ? super V> map, Object obj, kotlin.reflect.n<?> property, V v3) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(property, "property");
        map.put(property.getName(), v3);
    }
}
