package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12520a = "DrawableCompat";

    /* renamed from: b, reason: collision with root package name */
    private static Method f12521b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f12522c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f12523d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f12524e;

    @W(19)
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static int a(Drawable drawable) {
            return drawable.getAlpha();
        }

        @InterfaceC0577u
        static Drawable b(DrawableContainer.DrawableContainerState drawableContainerState, int i4) {
            return drawableContainerState.getChild(i4);
        }

        @InterfaceC0577u
        static Drawable c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        @InterfaceC0577u
        static boolean d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        @InterfaceC0577u
        static void e(Drawable drawable, boolean z3) {
            drawable.setAutoMirrored(z3);
        }
    }

    @W(21)
    /* loaded from: classes.dex */
    static class b {
        private b() {
        }

        @InterfaceC0577u
        static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        @InterfaceC0577u
        static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        @InterfaceC0577u
        static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        @InterfaceC0577u
        static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        @InterfaceC0577u
        static void e(Drawable drawable, float f4, float f5) {
            drawable.setHotspot(f4, f5);
        }

        @InterfaceC0577u
        static void f(Drawable drawable, int i4, int i5, int i6, int i7) {
            drawable.setHotspotBounds(i4, i5, i6, i7);
        }

        @InterfaceC0577u
        static void g(Drawable drawable, int i4) {
            drawable.setTint(i4);
        }

        @InterfaceC0577u
        static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        @InterfaceC0577u
        static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    @W(23)
    /* loaded from: classes.dex */
    static class c {
        private c() {
        }

        @InterfaceC0577u
        static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        @InterfaceC0577u
        static boolean b(Drawable drawable, int i4) {
            return drawable.setLayoutDirection(i4);
        }
    }

    private d() {
    }

    public static void a(@N Drawable drawable, @N Resources.Theme theme) {
        b.a(drawable, theme);
    }

    public static boolean b(@N Drawable drawable) {
        return b.b(drawable);
    }

    public static void c(@N Drawable drawable) {
        drawable.clearColorFilter();
    }

    public static int d(@N Drawable drawable) {
        return a.a(drawable);
    }

    @P
    public static ColorFilter e(@N Drawable drawable) {
        return b.c(drawable);
    }

    public static int f(@N Drawable drawable) {
        return c.a(drawable);
    }

    public static void g(@N Drawable drawable, @N Resources resources, @N XmlPullParser xmlPullParser, @N AttributeSet attributeSet, @P Resources.Theme theme) throws XmlPullParserException, IOException {
        b.d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean h(@N Drawable drawable) {
        return a.d(drawable);
    }

    @Deprecated
    public static void i(@N Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void j(@N Drawable drawable, boolean z3) {
        a.e(drawable, z3);
    }

    public static void k(@N Drawable drawable, float f4, float f5) {
        b.e(drawable, f4, f5);
    }

    public static void l(@N Drawable drawable, int i4, int i5, int i6, int i7) {
        b.f(drawable, i4, i5, i6, i7);
    }

    public static boolean m(@N Drawable drawable, int i4) {
        return c.b(drawable, i4);
    }

    public static void n(@N Drawable drawable, @InterfaceC0569l int i4) {
        b.g(drawable, i4);
    }

    public static void o(@N Drawable drawable, @P ColorStateList colorStateList) {
        b.h(drawable, colorStateList);
    }

    public static void p(@N Drawable drawable, @P PorterDuff.Mode mode) {
        b.i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T q(@N Drawable drawable) {
        if (drawable instanceof l) {
            return (T) ((l) drawable).b();
        }
        return drawable;
    }

    @N
    public static Drawable r(@N Drawable drawable) {
        return drawable;
    }
}
