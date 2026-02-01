package androidx.databinding.adapters;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC0879d;

@androidx.databinding.h({@androidx.databinding.g(attribute = "android:tint", method = "setImageTintList", type = ImageView.class), @androidx.databinding.g(attribute = "android:tintMode", method = "setImageTintMode", type = ImageView.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class p {
    @InterfaceC0879d({"android:src"})
    public static void a(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
    }

    @InterfaceC0879d({"android:src"})
    public static void b(ImageView imageView, Uri uri) {
        imageView.setImageURI(uri);
    }

    @InterfaceC0879d({"android:src"})
    public static void c(ImageView imageView, String str) {
        if (str == null) {
            imageView.setImageURI(null);
        } else {
            imageView.setImageURI(Uri.parse(str));
        }
    }
}
