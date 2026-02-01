package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13798a = "CompoundButtonCompat";

    /* renamed from: b, reason: collision with root package name */
    private static Field f13799b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f13800c;

    @W(21)
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static ColorStateList a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        @InterfaceC0577u
        static PorterDuff.Mode b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        @InterfaceC0577u
        static void c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        @InterfaceC0577u
        static void d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    @W(23)
    /* loaded from: classes.dex */
    static class b {
        private b() {
        }

        @InterfaceC0577u
        static Drawable a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    private d() {
    }

    @P
    public static Drawable a(@N CompoundButton compoundButton) {
        return b.a(compoundButton);
    }

    @P
    public static ColorStateList b(@N CompoundButton compoundButton) {
        return a.a(compoundButton);
    }

    @P
    public static PorterDuff.Mode c(@N CompoundButton compoundButton) {
        return a.b(compoundButton);
    }

    public static void d(@N CompoundButton compoundButton, @P ColorStateList colorStateList) {
        a.c(compoundButton, colorStateList);
    }

    public static void e(@N CompoundButton compoundButton, @P PorterDuff.Mode mode) {
        a.d(compoundButton, mode);
    }
}
