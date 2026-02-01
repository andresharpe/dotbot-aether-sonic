package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;

/* loaded from: classes.dex */
public class k {

    @W(21)
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static ColorStateList a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        @InterfaceC0577u
        static PorterDuff.Mode b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        @InterfaceC0577u
        static void c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        @InterfaceC0577u
        static void d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    private k() {
    }

    @P
    public static ColorStateList a(@N ImageView imageView) {
        return a.a(imageView);
    }

    @P
    public static PorterDuff.Mode b(@N ImageView imageView) {
        return a.b(imageView);
    }

    public static void c(@N ImageView imageView, @P ColorStateList colorStateList) {
        a.c(imageView, colorStateList);
    }

    public static void d(@N ImageView imageView, @P PorterDuff.Mode mode) {
        a.d(imageView, mode);
    }
}
