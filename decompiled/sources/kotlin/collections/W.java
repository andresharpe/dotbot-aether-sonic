package kotlin.collections;

import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.jvm.internal.U({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,104:1\n341#2,6:105\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n*L\n24#1:105,6\n*E\n"})
/* loaded from: classes2.dex */
public class W {
    @W2.i(name = "getOrImplicitDefaultNullable")
    @kotlin.U
    public static final <K, V> V a(@l3.d Map<K, ? extends V> map, K k4) {
        kotlin.jvm.internal.F.p(map, "<this>");
        if (map instanceof T) {
            return (V) ((T) map).g(k4);
        }
        V v3 = map.get(k4);
        if (v3 == null && !map.containsKey(k4)) {
            throw new NoSuchElementException("Key " + k4 + " is missing in the map.");
        }
        return v3;
    }

    @l3.d
    public static final <K, V> Map<K, V> b(@l3.d Map<K, ? extends V> map, @l3.d X2.l<? super K, ? extends V> defaultValue) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        if (map instanceof T) {
            return b(((T) map).f(), defaultValue);
        }
        return new U(map, defaultValue);
    }

    @l3.d
    @W2.i(name = "withDefaultMutable")
    public static final <K, V> Map<K, V> c(@l3.d Map<K, V> map, @l3.d X2.l<? super K, ? extends V> defaultValue) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        if (map instanceof c0) {
            return c(((c0) map).f(), defaultValue);
        }
        return new d0(map, defaultValue);
    }
}
