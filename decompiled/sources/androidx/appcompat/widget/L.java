package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class L {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f5659a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f5660b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f5661c = new Rect();

    @androidx.annotation.W(18)
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final boolean f5662a;

        /* renamed from: b, reason: collision with root package name */
        private static final Method f5663b;

        /* renamed from: c, reason: collision with root package name */
        private static final Field f5664c;

        /* renamed from: d, reason: collision with root package name */
        private static final Field f5665d;

        /* renamed from: e, reason: collision with root package name */
        private static final Field f5666e;

        /* renamed from: f, reason: collision with root package name */
        private static final Field f5667f;

        /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L3f java.lang.ClassNotFoundException -> L42 java.lang.NoSuchMethodException -> L45
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchFieldException -> L3f java.lang.ClassNotFoundException -> L42 java.lang.NoSuchMethodException -> L45
                java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.NoSuchFieldException -> L3f java.lang.ClassNotFoundException -> L42 java.lang.NoSuchMethodException -> L45
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L36 java.lang.ClassNotFoundException -> L39 java.lang.NoSuchMethodException -> L3c
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L2f java.lang.ClassNotFoundException -> L32 java.lang.NoSuchMethodException -> L34
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2d
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L48
                r8 = r0
                goto L4a
            L2d:
                r7 = r1
                goto L48
            L2f:
                r6 = r1
            L30:
                r7 = r6
                goto L48
            L32:
                r6 = r1
                goto L30
            L34:
                r6 = r1
                goto L30
            L36:
                r5 = r1
            L37:
                r6 = r5
                goto L30
            L39:
                r5 = r1
            L3a:
                r6 = r5
                goto L30
            L3c:
                r5 = r1
            L3d:
                r6 = r5
                goto L30
            L3f:
                r4 = r1
                r5 = r4
                goto L37
            L42:
                r4 = r1
                r5 = r4
                goto L3a
            L45:
                r4 = r1
                r5 = r4
                goto L3d
            L48:
                r3 = r1
                r8 = r2
            L4a:
                if (r8 == 0) goto L59
                androidx.appcompat.widget.L.a.f5663b = r4
                androidx.appcompat.widget.L.a.f5664c = r5
                androidx.appcompat.widget.L.a.f5665d = r6
                androidx.appcompat.widget.L.a.f5666e = r7
                androidx.appcompat.widget.L.a.f5667f = r3
                androidx.appcompat.widget.L.a.f5662a = r0
                goto L65
            L59:
                androidx.appcompat.widget.L.a.f5663b = r1
                androidx.appcompat.widget.L.a.f5664c = r1
                androidx.appcompat.widget.L.a.f5665d = r1
                androidx.appcompat.widget.L.a.f5666e = r1
                androidx.appcompat.widget.L.a.f5667f = r1
                androidx.appcompat.widget.L.a.f5662a = r2
            L65:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.L.a.<clinit>():void");
        }

        private a() {
        }

        @androidx.annotation.N
        static Rect a(@androidx.annotation.N Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f5662a) {
                try {
                    Object invoke = f5663b.invoke(drawable, new Object[0]);
                    if (invoke != null) {
                        return new Rect(f5664c.getInt(invoke), f5665d.getInt(invoke), f5666e.getInt(invoke), f5667f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return L.f5661c;
        }
    }

    @androidx.annotation.W(ConstraintLayout.b.a.f9571D)
    /* loaded from: classes.dex */
    static class b {
        private b() {
        }

        @InterfaceC0577u
        static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    private L() {
    }

    public static boolean a(@androidx.annotation.N Drawable drawable) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(@androidx.annotation.N Drawable drawable) {
        String name = drawable.getClass().getName();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29 && i4 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            c(drawable);
        }
    }

    private static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state != null && state.length != 0) {
            drawable.setState(f5660b);
        } else {
            drawable.setState(f5659a);
        }
        drawable.setState(state);
    }

    @androidx.annotation.N
    public static Rect d(@androidx.annotation.N Drawable drawable) {
        int i4;
        int i5;
        int i6;
        int i7;
        if (Build.VERSION.SDK_INT >= 29) {
            Insets a4 = b.a(drawable);
            i4 = a4.left;
            i5 = a4.top;
            i6 = a4.right;
            i7 = a4.bottom;
            return new Rect(i4, i5, i6, i7);
        }
        return a.a(androidx.core.graphics.drawable.d.q(drawable));
    }

    public static PorterDuff.Mode e(int i4, PorterDuff.Mode mode) {
        if (i4 != 3) {
            if (i4 != 5) {
                if (i4 != 9) {
                    switch (i4) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
