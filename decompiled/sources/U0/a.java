package U0;

import android.graphics.Canvas;
import android.graphics.RectF;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class a {
    private a() {
    }

    public static int a(@N Canvas canvas, float f4, float f5, float f6, float f7, int i4) {
        return canvas.saveLayerAlpha(f4, f5, f6, f7, i4);
    }

    public static int b(@N Canvas canvas, @P RectF rectF, int i4) {
        return canvas.saveLayerAlpha(rectF, i4);
    }
}
