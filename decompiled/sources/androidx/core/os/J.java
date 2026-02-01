package androidx.core.os;

import android.os.PersistableBundle;
import androidx.annotation.W;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class J {
    @l3.d
    @W(21)
    public static final PersistableBundle a() {
        return H.a(0);
    }

    @l3.d
    @W(21)
    public static final PersistableBundle b(@l3.d Pair<String, ? extends Object>... pairs) {
        kotlin.jvm.internal.F.p(pairs, "pairs");
        PersistableBundle a4 = H.a(pairs.length);
        for (Pair<String, ? extends Object> pair : pairs) {
            H.b(a4, pair.a(), pair.b());
        }
        return a4;
    }

    @l3.d
    @W(21)
    public static final PersistableBundle c(@l3.d Map<String, ? extends Object> map) {
        kotlin.jvm.internal.F.p(map, "<this>");
        PersistableBundle a4 = H.a(map.size());
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            H.b(a4, entry.getKey(), entry.getValue());
        }
        return a4;
    }
}
