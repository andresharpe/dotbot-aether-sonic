package androidx.collection;

import kotlin.Pair;
import kotlin.jvm.internal.F;

/* loaded from: classes.dex */
public final class b {
    @l3.d
    public static final <K, V> a<K, V> a() {
        return new a<>();
    }

    @l3.d
    public static final <K, V> a<K, V> b(@l3.d Pair<? extends K, ? extends V>... pairs) {
        F.q(pairs, "pairs");
        a<K, V> aVar = new a<>(pairs.length);
        for (Pair<? extends K, ? extends V> pair : pairs) {
            aVar.put(pair.e(), pair.f());
        }
        return aVar;
    }
}
