package androidx.core.graphics;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.InterfaceC0580x;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public final class L {

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(26)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @InterfaceC0577u
        static float[] a(Path path, float f4) {
            return path.approximate(f4);
        }
    }

    private L() {
    }

    @androidx.annotation.N
    @androidx.annotation.W(26)
    public static Collection<K> a(@androidx.annotation.N Path path) {
        return b(path, 0.5f);
    }

    @androidx.annotation.N
    @androidx.annotation.W(26)
    public static Collection<K> b(@androidx.annotation.N Path path, @InterfaceC0580x(from = 0.0d) float f4) {
        float[] a4 = a.a(path, f4);
        int length = a4.length / 3;
        ArrayList arrayList = new ArrayList(length);
        for (int i4 = 1; i4 < length; i4++) {
            int i5 = i4 * 3;
            int i6 = (i4 - 1) * 3;
            float f5 = a4[i5];
            float f6 = a4[i5 + 1];
            float f7 = a4[i5 + 2];
            float f8 = a4[i6];
            float f9 = a4[i6 + 1];
            float f10 = a4[i6 + 2];
            if (f5 != f8 && (f6 != f9 || f7 != f10)) {
                arrayList.add(new K(new PointF(f9, f10), f8, new PointF(f6, f7), f5));
            }
        }
        return arrayList;
    }
}
