package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import java.lang.reflect.Field;

/* renamed from: androidx.transition.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0988w {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f20191a = true;

    /* renamed from: b, reason: collision with root package name */
    private static Field f20192b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f20193c;

    private C0988w() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(@androidx.annotation.N ImageView imageView, @androidx.annotation.P Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            imageView.animateTransform(matrix);
            return;
        }
        if (matrix == null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
                return;
            }
            return;
        }
        c(imageView, matrix);
    }

    private static void b() {
        if (!f20193c) {
            try {
                Field declaredField = ImageView.class.getDeclaredField("mDrawMatrix");
                f20192b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f20193c = true;
        }
    }

    @SuppressLint({"NewApi"})
    @androidx.annotation.W(21)
    private static void c(@androidx.annotation.N ImageView imageView, @androidx.annotation.P Matrix matrix) {
        if (f20191a) {
            try {
                imageView.animateTransform(matrix);
            } catch (NoSuchMethodError unused) {
                f20191a = false;
            }
        }
    }
}
