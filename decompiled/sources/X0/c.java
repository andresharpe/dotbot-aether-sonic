package X0;

import T0.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import com.google.android.material.internal.w;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class c {
    private c() {
    }

    @N
    public static Rect a(@N Context context, @InterfaceC0563f int i4, int i5) {
        TypedArray j4 = w.j(context, null, a.o.Jk, i4, i5, new int[0]);
        int dimensionPixelSize = j4.getDimensionPixelSize(a.o.Mk, context.getResources().getDimensionPixelSize(a.f.T5));
        int dimensionPixelSize2 = j4.getDimensionPixelSize(a.o.Nk, context.getResources().getDimensionPixelSize(a.f.U5));
        int dimensionPixelSize3 = j4.getDimensionPixelSize(a.o.Lk, context.getResources().getDimensionPixelSize(a.f.S5));
        int dimensionPixelSize4 = j4.getDimensionPixelSize(a.o.Kk, context.getResources().getDimensionPixelSize(a.f.R5));
        j4.recycle();
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        return new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
    }

    @N
    public static InsetDrawable b(@P Drawable drawable, @N Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }
}
