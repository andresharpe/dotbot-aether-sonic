package i0;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.D;
import androidx.annotation.P;

/* renamed from: i0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2067c {
    private C2067c() {
    }

    @P
    public static <T extends View> T a(View view, @D int i4) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            T t3 = (T) viewGroup.getChildAt(i5).findViewById(i4);
            if (t3 != null) {
                return t3;
            }
        }
        return null;
    }
}
