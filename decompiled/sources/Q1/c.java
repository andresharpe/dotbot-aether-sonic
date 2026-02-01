package Q1;

import android.view.View;
import l3.d;
import l3.e;

/* loaded from: classes2.dex */
public interface c {

    /* loaded from: classes2.dex */
    public static final class a {
        public static /* synthetic */ void a(c cVar, View view, Object obj, Integer num, int i4, Object obj2) {
            if (obj2 == null) {
                if ((i4 & 2) != 0) {
                    obj = null;
                }
                if ((i4 & 4) != 0) {
                    num = null;
                }
                cVar.a(view, obj, num);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onClick");
        }
    }

    void a(@d View view, @e Object obj, @e Integer num);
}
