package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.InterfaceC0577u;

/* renamed from: androidx.core.view.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0858x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f13659a = 8;

    /* renamed from: b, reason: collision with root package name */
    public static final int f13660b = 9;

    /* renamed from: c, reason: collision with root package name */
    public static final int f13661c = 10;

    @androidx.annotation.W(16)
    /* renamed from: androidx.core.view.x0$a */
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static void a(@androidx.annotation.N Window window, boolean z3) {
            int i4;
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z3) {
                i4 = systemUiVisibility & (-1793);
            } else {
                i4 = systemUiVisibility | 1792;
            }
            decorView.setSystemUiVisibility(i4);
        }
    }

    @androidx.annotation.W(28)
    /* renamed from: androidx.core.view.x0$b */
    /* loaded from: classes.dex */
    static class b {
        private b() {
        }

        @InterfaceC0577u
        static <T> T a(Window window, int i4) {
            return (T) window.requireViewById(i4);
        }
    }

    @androidx.annotation.W(30)
    /* renamed from: androidx.core.view.x0$c */
    /* loaded from: classes.dex */
    static class c {
        private c() {
        }

        @InterfaceC0577u
        static void a(@androidx.annotation.N Window window, boolean z3) {
            window.setDecorFitsSystemWindows(z3);
        }
    }

    private C0858x0() {
    }

    @androidx.annotation.N
    public static E1 a(@androidx.annotation.N Window window, @androidx.annotation.N View view) {
        return new E1(window, view);
    }

    @androidx.annotation.N
    public static <T extends View> T b(@androidx.annotation.N Window window, @androidx.annotation.D int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) b.a(window, i4);
        }
        T t3 = (T) window.findViewById(i4);
        if (t3 != null) {
            return t3;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    }

    public static void c(@androidx.annotation.N Window window, boolean z3) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.a(window, z3);
        } else {
            a.a(window, z3);
        }
    }
}
