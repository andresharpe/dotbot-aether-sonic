package androidx.navigation.fragment;

import android.view.View;
import androidx.navigation.fragment.g;
import kotlin.Pair;
import kotlin.jvm.internal.F;

/* loaded from: classes.dex */
public final class j {
    @l3.d
    public static final g.c a(@l3.d Pair<? extends View, String>... sharedElements) {
        F.p(sharedElements, "sharedElements");
        g.c.a aVar = new g.c.a();
        int length = sharedElements.length;
        int i4 = 0;
        while (i4 < length) {
            Pair<? extends View, String> pair = sharedElements[i4];
            i4++;
            aVar.a(pair.a(), pair.b());
        }
        return aVar.c();
    }
}
