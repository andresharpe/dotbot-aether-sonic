package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.os.Build;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.i0;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: androidx.core.graphics.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0710a {

    @androidx.annotation.W(17)
    /* renamed from: androidx.core.graphics.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0086a {
        private C0086a() {
        }

        @InterfaceC0577u
        static boolean a(Bitmap bitmap) {
            return bitmap.hasMipMap();
        }

        @InterfaceC0577u
        static void b(Bitmap bitmap, boolean z3) {
            bitmap.setHasMipMap(z3);
        }
    }

    @androidx.annotation.W(19)
    /* renamed from: androidx.core.graphics.a$b */
    /* loaded from: classes.dex */
    static class b {
        private b() {
        }

        @InterfaceC0577u
        static int a(Bitmap bitmap) {
            return bitmap.getAllocationByteCount();
        }
    }

    @androidx.annotation.W(27)
    /* renamed from: androidx.core.graphics.a$c */
    /* loaded from: classes.dex */
    static class c {
        private c() {
        }

        @InterfaceC0577u
        static Bitmap a(Bitmap bitmap) {
            if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                if (Build.VERSION.SDK_INT >= 31) {
                    config = e.a(bitmap);
                }
                return bitmap.copy(config, true);
            }
            return bitmap;
        }

        @InterfaceC0577u
        static Bitmap b(int i4, int i5, Bitmap bitmap, boolean z3) {
            Bitmap.Config config = bitmap.getConfig();
            ColorSpace colorSpace = bitmap.getColorSpace();
            ColorSpace colorSpace2 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            if (z3 && !bitmap.getColorSpace().equals(colorSpace2)) {
                config = Bitmap.Config.RGBA_F16;
                colorSpace = colorSpace2;
            } else if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                config = Bitmap.Config.ARGB_8888;
                if (Build.VERSION.SDK_INT >= 31) {
                    config = e.a(bitmap);
                }
            }
            return Bitmap.createBitmap(i4, i5, config, bitmap.hasAlpha(), colorSpace);
        }

        @InterfaceC0577u
        static boolean c(Bitmap bitmap) {
            ColorSpace colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            if (bitmap.getConfig() == Bitmap.Config.RGBA_F16 && bitmap.getColorSpace().equals(colorSpace)) {
                return true;
            }
            return false;
        }
    }

    @androidx.annotation.W(ConstraintLayout.b.a.f9571D)
    /* renamed from: androidx.core.graphics.a$d */
    /* loaded from: classes.dex */
    static class d {
        private d() {
        }

        @InterfaceC0577u
        static void a(Paint paint) {
            paint.setBlendMode(BlendMode.SRC);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(ConstraintLayout.b.a.f9573F)
    /* renamed from: androidx.core.graphics.a$e */
    /* loaded from: classes.dex */
    public static class e {
        private e() {
        }

        @InterfaceC0577u
        static Bitmap.Config a(Bitmap bitmap) {
            if (bitmap.getHardwareBuffer().getFormat() == 22) {
                return Bitmap.Config.RGBA_F16;
            }
            return Bitmap.Config.ARGB_8888;
        }
    }

    private C0710a() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x01a9, code lost:
    
        if (androidx.core.graphics.C0710a.c.c(r11) == false) goto L124;
     */
    @androidx.annotation.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap a(@androidx.annotation.N android.graphics.Bitmap r21, int r22, int r23, @androidx.annotation.P android.graphics.Rect r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.C0710a.a(android.graphics.Bitmap, int, int, android.graphics.Rect, boolean):android.graphics.Bitmap");
    }

    public static int b(@androidx.annotation.N Bitmap bitmap) {
        return b.a(bitmap);
    }

    public static boolean c(@androidx.annotation.N Bitmap bitmap) {
        return C0086a.a(bitmap);
    }

    public static void d(@androidx.annotation.N Bitmap bitmap, boolean z3) {
        C0086a.b(bitmap, z3);
    }

    @i0
    public static int e(int i4, int i5, int i6, int i7) {
        return i6 == 0 ? i5 : i6 > 0 ? i4 * (1 << (i7 - i6)) : i5 << ((-i6) - 1);
    }
}
