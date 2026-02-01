package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Point;
import android.graphics.PointF;
import androidx.annotation.InterfaceC0569l;
import kotlin.H0;

/* renamed from: androidx.core.graphics.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0714e {
    @l3.d
    public static final Bitmap a(@l3.d Bitmap bitmap, @l3.d X2.l<? super Canvas, H0> block) {
        kotlin.jvm.internal.F.p(bitmap, "<this>");
        kotlin.jvm.internal.F.p(block, "block");
        block.C(new Canvas(bitmap));
        return bitmap;
    }

    public static final boolean b(@l3.d Bitmap bitmap, @l3.d Point p4) {
        int i4;
        kotlin.jvm.internal.F.p(bitmap, "<this>");
        kotlin.jvm.internal.F.p(p4, "p");
        int width = bitmap.getWidth();
        int i5 = p4.x;
        if (i5 >= 0 && i5 < width && (i4 = p4.y) >= 0 && i4 < bitmap.getHeight()) {
            return true;
        }
        return false;
    }

    public static final boolean c(@l3.d Bitmap bitmap, @l3.d PointF p4) {
        kotlin.jvm.internal.F.p(bitmap, "<this>");
        kotlin.jvm.internal.F.p(p4, "p");
        float f4 = p4.x;
        if (f4 >= 0.0f && f4 < bitmap.getWidth()) {
            float f5 = p4.y;
            if (f5 >= 0.0f && f5 < bitmap.getHeight()) {
                return true;
            }
        }
        return false;
    }

    @l3.d
    public static final Bitmap d(int i4, int i5, @l3.d Bitmap.Config config) {
        kotlin.jvm.internal.F.p(config, "config");
        Bitmap createBitmap = Bitmap.createBitmap(i4, i5, config);
        kotlin.jvm.internal.F.o(createBitmap, "createBitmap(width, height, config)");
        return createBitmap;
    }

    @l3.d
    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.W(26)
    public static final Bitmap e(int i4, int i5, @l3.d Bitmap.Config config, boolean z3, @l3.d ColorSpace colorSpace) {
        Bitmap createBitmap;
        kotlin.jvm.internal.F.p(config, "config");
        kotlin.jvm.internal.F.p(colorSpace, "colorSpace");
        createBitmap = Bitmap.createBitmap(i4, i5, config, z3, colorSpace);
        kotlin.jvm.internal.F.o(createBitmap, "createBitmap(width, heig…ig, hasAlpha, colorSpace)");
        return createBitmap;
    }

    public static /* synthetic */ Bitmap f(int i4, int i5, Bitmap.Config config, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        kotlin.jvm.internal.F.p(config, "config");
        Bitmap createBitmap = Bitmap.createBitmap(i4, i5, config);
        kotlin.jvm.internal.F.o(createBitmap, "createBitmap(width, height, config)");
        return createBitmap;
    }

    public static /* synthetic */ Bitmap g(int i4, int i5, Bitmap.Config config, boolean z3, ColorSpace colorSpace, int i6, Object obj) {
        Bitmap createBitmap;
        ColorSpace.Named named;
        if ((i6 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        if ((i6 & 8) != 0) {
            z3 = true;
        }
        if ((i6 & 16) != 0) {
            named = ColorSpace.Named.SRGB;
            colorSpace = ColorSpace.get(named);
            kotlin.jvm.internal.F.o(colorSpace, "get(ColorSpace.Named.SRGB)");
        }
        kotlin.jvm.internal.F.p(config, "config");
        kotlin.jvm.internal.F.p(colorSpace, "colorSpace");
        createBitmap = Bitmap.createBitmap(i4, i5, config, z3, colorSpace);
        kotlin.jvm.internal.F.o(createBitmap, "createBitmap(width, heig…ig, hasAlpha, colorSpace)");
        return createBitmap;
    }

    public static final int h(@l3.d Bitmap bitmap, int i4, int i5) {
        kotlin.jvm.internal.F.p(bitmap, "<this>");
        return bitmap.getPixel(i4, i5);
    }

    @l3.d
    public static final Bitmap i(@l3.d Bitmap bitmap, int i4, int i5, boolean z3) {
        kotlin.jvm.internal.F.p(bitmap, "<this>");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i4, i5, z3);
        kotlin.jvm.internal.F.o(createScaledBitmap, "createScaledBitmap(this, width, height, filter)");
        return createScaledBitmap;
    }

    public static /* synthetic */ Bitmap j(Bitmap bitmap, int i4, int i5, boolean z3, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            z3 = true;
        }
        kotlin.jvm.internal.F.p(bitmap, "<this>");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i4, i5, z3);
        kotlin.jvm.internal.F.o(createScaledBitmap, "createScaledBitmap(this, width, height, filter)");
        return createScaledBitmap;
    }

    public static final void k(@l3.d Bitmap bitmap, int i4, int i5, @InterfaceC0569l int i6) {
        kotlin.jvm.internal.F.p(bitmap, "<this>");
        bitmap.setPixel(i4, i5, i6);
    }
}
