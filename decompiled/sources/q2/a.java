package Q2;

import W2.i;
import java.util.Map;
import kotlin.Y;
import kotlin.internal.f;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.X;

@i(name = "CollectionsJDK8Kt")
/* loaded from: classes2.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    @Y(version = "1.2")
    @f
    private static final <K, V> V a(Map<? extends K, ? extends V> map, K k4, V v3) {
        F.p(map, "<this>");
        return map.getOrDefault(k4, v3);
    }

    @Y(version = "1.2")
    @f
    private static final <K, V> boolean b(Map<? extends K, ? extends V> map, K k4, V v3) {
        F.p(map, "<this>");
        return X.k(map).remove(k4, v3);
    }
}
