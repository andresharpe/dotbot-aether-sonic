package androidx.core.view;

import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.InterfaceC0577u;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public static final int f13100a = 8388608;

    /* renamed from: b, reason: collision with root package name */
    public static final int f13101b = 8388611;

    /* renamed from: c, reason: collision with root package name */
    public static final int f13102c = 8388613;

    /* renamed from: d, reason: collision with root package name */
    public static final int f13103d = 8388615;

    @androidx.annotation.W(17)
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static void a(int i4, int i5, int i6, Rect rect, int i7, int i8, Rect rect2, int i9) {
            Gravity.apply(i4, i5, i6, rect, i7, i8, rect2, i9);
        }

        @InterfaceC0577u
        static void b(int i4, int i5, int i6, Rect rect, Rect rect2, int i7) {
            Gravity.apply(i4, i5, i6, rect, rect2, i7);
        }

        @InterfaceC0577u
        static void c(int i4, Rect rect, Rect rect2, int i5) {
            Gravity.applyDisplay(i4, rect, rect2, i5);
        }
    }

    private C() {
    }

    public static void a(int i4, int i5, int i6, @androidx.annotation.N Rect rect, int i7, int i8, @androidx.annotation.N Rect rect2, int i9) {
        a.a(i4, i5, i6, rect, i7, i8, rect2, i9);
    }

    public static void b(int i4, int i5, int i6, @androidx.annotation.N Rect rect, @androidx.annotation.N Rect rect2, int i7) {
        a.b(i4, i5, i6, rect, rect2, i7);
    }

    public static void c(int i4, @androidx.annotation.N Rect rect, @androidx.annotation.N Rect rect2, int i5) {
        a.c(i4, rect, rect2, i5);
    }

    public static int d(int i4, int i5) {
        return Gravity.getAbsoluteGravity(i4, i5);
    }
}
