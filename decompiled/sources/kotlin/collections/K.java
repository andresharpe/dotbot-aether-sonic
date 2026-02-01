package kotlin.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Ref;

@kotlin.jvm.internal.U({"SMAP\nGroupingJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GroupingJVM.kt\nkotlin/collections/GroupingKt__GroupingJVMKt\n+ 2 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n143#2:53\n80#2,4:54\n85#2:59\n1#3:58\n1855#4,2:60\n*S KotlinDebug\n*F\n+ 1 GroupingJVM.kt\nkotlin/collections/GroupingKt__GroupingJVMKt\n*L\n22#1:53\n22#1:54,4\n22#1:59\n48#1:60,2\n*E\n"})
/* loaded from: classes2.dex */
class K {
    @l3.d
    @kotlin.Y(version = "1.1")
    public static final <T, K> Map<K, Integer> a(@l3.d I<T, ? extends K> i4) {
        boolean z3;
        kotlin.jvm.internal.F.p(i4, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b4 = i4.b();
        while (b4.hasNext()) {
            K a4 = i4.a(b4.next());
            Object obj = linkedHashMap.get(a4);
            if (obj == null && !linkedHashMap.containsKey(a4)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                obj = new Ref.IntRef();
            }
            Ref.IntRef intRef = (Ref.IntRef) obj;
            intRef.f52299E++;
            linkedHashMap.put(a4, intRef);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            kotlin.jvm.internal.F.n(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
            kotlin.jvm.internal.X.m(entry).setValue(Integer.valueOf(((Ref.IntRef) entry.getValue()).f52299E));
        }
        return kotlin.jvm.internal.X.k(linkedHashMap);
    }

    @kotlin.U
    @kotlin.internal.f
    private static final <K, V, R> Map<K, R> b(Map<K, V> map, X2.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> f4) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(f4, "f");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            kotlin.jvm.internal.F.n(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
            kotlin.jvm.internal.X.m(entry).setValue(f4.C(entry));
        }
        return kotlin.jvm.internal.X.k(map);
    }
}
