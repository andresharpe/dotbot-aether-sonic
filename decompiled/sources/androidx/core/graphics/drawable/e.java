package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.U;
import kotlin.jvm.internal.F;

/* loaded from: classes.dex */
public final class e {
    @l3.d
    public static final Bitmap a(@l3.d Drawable drawable, @U int i4, @U int i5, @l3.e Bitmap.Config config) {
        F.p(drawable, "<this>");
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                if (config == null || bitmapDrawable.getBitmap().getConfig() == config) {
                    if (i4 == bitmapDrawable.getBitmap().getWidth() && i5 == bitmapDrawable.getBitmap().getHeight()) {
                        Bitmap bitmap = bitmapDrawable.getBitmap();
                        F.o(bitmap, "bitmap");
                        return bitmap;
                    }
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i4, i5, true);
                    F.o(createScaledBitmap, "createScaledBitmap(bitmap, width, height, true)");
                    return createScaledBitmap;
                }
            } else {
                throw new IllegalArgumentException("bitmap is null");
            }
        }
        Rect bounds = drawable.getBounds();
        F.o(bounds, "bounds");
        int i6 = bounds.left;
        int i7 = bounds.top;
        int i8 = bounds.right;
        int i9 = bounds.bottom;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmap2 = Bitmap.createBitmap(i4, i5, config);
        drawable.setBounds(0, 0, i4, i5);
        drawable.draw(new Canvas(bitmap2));
        drawable.setBounds(i6, i7, i8, i9);
        F.o(bitmap2, "bitmap");
        return bitmap2;
    }

    public static /* synthetic */ Bitmap b(Drawable drawable, int i4, int i5, Bitmap.Config config, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = drawable.getIntrinsicWidth();
        }
        if ((i6 & 2) != 0) {
            i5 = drawable.getIntrinsicHeight();
        }
        if ((i6 & 4) != 0) {
            config = null;
        }
        return a(drawable, i4, i5, config);
    }

    @l3.e
    public static final Bitmap c(@l3.d Drawable drawable, @U int i4, @U int i5, @l3.e Bitmap.Config config) {
        F.p(drawable, "<this>");
        if ((drawable instanceof BitmapDrawable) && ((BitmapDrawable) drawable).getBitmap() == null) {
            return null;
        }
        return a(drawable, i4, i5, config);
    }

    public static /* synthetic */ Bitmap d(Drawable drawable, int i4, int i5, Bitmap.Config config, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = drawable.getIntrinsicWidth();
        }
        if ((i6 & 2) != 0) {
            i5 = drawable.getIntrinsicHeight();
        }
        if ((i6 & 4) != 0) {
            config = null;
        }
        return c(drawable, i4, i5, config);
    }

    public static final void e(@l3.d Drawable drawable, @U int i4, @U int i5, @U int i6, @U int i7) {
        F.p(drawable, "<this>");
        drawable.setBounds(i4, i5, i6, i7);
    }

    public static /* synthetic */ void f(Drawable drawable, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i4 = drawable.getBounds().left;
        }
        if ((i8 & 2) != 0) {
            i5 = drawable.getBounds().top;
        }
        if ((i8 & 4) != 0) {
            i6 = drawable.getBounds().right;
        }
        if ((i8 & 8) != 0) {
            i7 = drawable.getBounds().bottom;
        }
        e(drawable, i4, i5, i6, i7);
    }
}
