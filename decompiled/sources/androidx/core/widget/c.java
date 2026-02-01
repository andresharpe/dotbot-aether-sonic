package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.CheckedTextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13795a = "CheckedTextViewCompat";

    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static Field f13796a;

        /* renamed from: b, reason: collision with root package name */
        private static boolean f13797b;

        private a() {
        }

        @P
        static Drawable a(@N CheckedTextView checkedTextView) {
            if (!f13797b) {
                try {
                    Field declaredField = CheckedTextView.class.getDeclaredField("mCheckMarkDrawable");
                    f13796a = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e4) {
                    Log.i(c.f13795a, "Failed to retrieve mCheckMarkDrawable field", e4);
                }
                f13797b = true;
            }
            Field field = f13796a;
            if (field != null) {
                try {
                    return (Drawable) field.get(checkedTextView);
                } catch (IllegalAccessException e5) {
                    Log.i(c.f13795a, "Failed to get check mark drawable via reflection", e5);
                    f13796a = null;
                }
            }
            return null;
        }
    }

    @W(16)
    /* loaded from: classes.dex */
    private static class b {
        private b() {
        }

        @P
        static Drawable a(@N CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }

    @W(21)
    /* renamed from: androidx.core.widget.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0112c {
        private C0112c() {
        }

        @P
        static ColorStateList a(@N CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintList();
        }

        @P
        static PorterDuff.Mode b(@N CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintMode();
        }

        static void c(@N CheckedTextView checkedTextView, @P ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        static void d(@N CheckedTextView checkedTextView, @P PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    private c() {
    }

    @P
    public static Drawable a(@N CheckedTextView checkedTextView) {
        return b.a(checkedTextView);
    }

    @P
    public static ColorStateList b(@N CheckedTextView checkedTextView) {
        return C0112c.a(checkedTextView);
    }

    @P
    public static PorterDuff.Mode c(@N CheckedTextView checkedTextView) {
        return C0112c.b(checkedTextView);
    }

    public static void d(@N CheckedTextView checkedTextView, @P ColorStateList colorStateList) {
        C0112c.c(checkedTextView, colorStateList);
    }

    public static void e(@N CheckedTextView checkedTextView, @P PorterDuff.Mode mode) {
        C0112c.d(checkedTextView, mode);
    }
}
