package kotlin.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import kotlin.InterfaceC2205l;
import kotlin.InterfaceC2207m;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class Z extends Y {
    @InterfaceC2205l(message = "Use maxByOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.internal.f
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    private static final /* synthetic */ <K, V, R extends Comparable<? super R>> Map.Entry<K, V> L0(Map<? extends K, ? extends V> map, X2.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Map.Entry<K, V> entry;
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            entry = null;
        } else {
            Map.Entry<K, V> entry2 = (Object) it.next();
            if (it.hasNext()) {
                R C3 = selector.C(entry2);
                do {
                    Map.Entry<K, V> entry3 = (Object) it.next();
                    R C4 = selector.C(entry3);
                    if (C3.compareTo(C4) < 0) {
                        entry2 = entry3;
                        C3 = C4;
                    }
                } while (it.hasNext());
            }
            entry = entry2;
        }
        return entry;
    }

    @InterfaceC2205l(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.internal.f
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    private static final /* synthetic */ <K, V> Map.Entry<K, V> M0(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        return (Map.Entry) D.V3(map.entrySet(), comparator);
    }

    @InterfaceC2205l(message = "Use minByOrNull instead.", replaceWith = @kotlin.V(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <K, V, R extends Comparable<? super R>> Map.Entry<K, V> N0(Map<? extends K, ? extends V> map, X2.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Map.Entry<K, V> entry;
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            entry = null;
        } else {
            Map.Entry<K, V> entry2 = (Object) it.next();
            if (it.hasNext()) {
                R C3 = selector.C(entry2);
                do {
                    Map.Entry<K, V> entry3 = (Object) it.next();
                    R C4 = selector.C(entry3);
                    if (C3.compareTo(C4) > 0) {
                        entry2 = entry3;
                        C3 = C4;
                    }
                } while (it.hasNext());
            }
            entry = entry2;
        }
        return entry;
    }

    @InterfaceC2205l(message = "Use minWithOrNull instead.", replaceWith = @kotlin.V(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Map.Entry O0(Map map, Comparator comparator) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        return (Map.Entry) D.n4(map.entrySet(), comparator);
    }
}
