package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.ColorSpace;
import androidx.annotation.InterfaceC0569l;

/* renamed from: androidx.core.graphics.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0733y {
    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.W(26)
    public static final float A(long j4) {
        float luminance;
        luminance = Color.luminance(j4);
        return luminance;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.W(26)
    public static final float B(long j4) {
        float red;
        red = Color.red(j4);
        return red;
    }

    public static final int C(@InterfaceC0569l int i4) {
        return (i4 >> 16) & 255;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.W(26)
    public static final boolean D(long j4) {
        boolean isSrgb;
        isSrgb = Color.isSrgb(j4);
        return isSrgb;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.W(26)
    public static final boolean E(long j4) {
        boolean isWideGamut;
        isWideGamut = Color.isWideGamut(j4);
        return isWideGamut;
    }

    @l3.d
    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.W(26)
    public static final Color F(@l3.d Color color, @l3.d Color c4) {
        kotlin.jvm.internal.F.p(color, "<this>");
        kotlin.jvm.internal.F.p(c4, "c");
        Color u3 = C0734z.u(c4, color);
        kotlin.jvm.internal.F.o(u3, "compositeColors(c, this)");
        return u3;
    }

    @l3.d
    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.W(26)
    public static final Color G(@InterfaceC0569l int i4) {
        Color valueOf;
        valueOf = Color.valueOf(i4);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(this)");
        return valueOf;
    }

    @l3.d
    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.W(26)
    public static final Color H(long j4) {
        Color valueOf;
        valueOf = Color.valueOf(j4);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(this)");
        return valueOf;
    }

    @InterfaceC0569l
    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.W(26)
    public static final int I(long j4) {
        int argb;
        argb = Color.toArgb(j4);
        return argb;
    }

    @InterfaceC0569l
    public static final int J(@l3.d String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        return Color.parseColor(str);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.W(26)
    public static final long K(@InterfaceC0569l int i4) {
        long pack;
        pack = Color.pack(i4);
        return pack;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.W(26)
    public static final float a(long j4) {
        float red;
        red = Color.red(j4);
        return red;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.W(26)
    public static final float b(@l3.d Color color) {
        float component;
        kotlin.jvm.internal.F.p(color, "<this>");
        component = color.getComponent(0);
        return component;
    }

    public static final int c(@InterfaceC0569l int i4) {
        return (i4 >> 24) & 255;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.W(26)
    public static final float d(long j4) {
        float green;
        green = Color.green(j4);
        return green;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.W(26)
    public static final float e(@l3.d Color color) {
        float component;
        kotlin.jvm.internal.F.p(color, "<this>");
        component = color.getComponent(1);
        return component;
    }

    public static final int f(@InterfaceC0569l int i4) {
        return (i4 >> 16) & 255;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.W(26)
    public static final float g(long j4) {
        float blue;
        blue = Color.blue(j4);
        return blue;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.W(26)
    public static final float h(@l3.d Color color) {
        float component;
        kotlin.jvm.internal.F.p(color, "<this>");
        component = color.getComponent(2);
        return component;
    }

    public static final int i(@InterfaceC0569l int i4) {
        return (i4 >> 8) & 255;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.W(26)
    public static final float j(long j4) {
        float alpha;
        alpha = Color.alpha(j4);
        return alpha;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.W(26)
    public static final float k(@l3.d Color color) {
        float component;
        kotlin.jvm.internal.F.p(color, "<this>");
        component = color.getComponent(3);
        return component;
    }

    public static final int l(@InterfaceC0569l int i4) {
        return i4 & 255;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.W(26)
    public static final long m(@InterfaceC0569l int i4, @l3.d ColorSpace.Named colorSpace) {
        ColorSpace colorSpace2;
        long convert;
        kotlin.jvm.internal.F.p(colorSpace, "colorSpace");
        colorSpace2 = ColorSpace.get(colorSpace);
        convert = Color.convert(i4, colorSpace2);
        return convert;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.W(26)
    public static final long n(@InterfaceC0569l int i4, @l3.d ColorSpace colorSpace) {
        long convert;
        kotlin.jvm.internal.F.p(colorSpace, "colorSpace");
        convert = Color.convert(i4, colorSpace);
        return convert;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.W(26)
    public static final long o(long j4, @l3.d ColorSpace.Named colorSpace) {
        ColorSpace colorSpace2;
        long convert;
        kotlin.jvm.internal.F.p(colorSpace, "colorSpace");
        colorSpace2 = ColorSpace.get(colorSpace);
        convert = Color.convert(j4, colorSpace2);
        return convert;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.W(26)
    public static final long p(long j4, @l3.d ColorSpace colorSpace) {
        long convert;
        kotlin.jvm.internal.F.p(colorSpace, "colorSpace");
        convert = Color.convert(j4, colorSpace);
        return convert;
    }

    @l3.d
    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.W(26)
    public static final Color q(@l3.d Color color, @l3.d ColorSpace.Named colorSpace) {
        ColorSpace colorSpace2;
        Color convert;
        kotlin.jvm.internal.F.p(color, "<this>");
        kotlin.jvm.internal.F.p(colorSpace, "colorSpace");
        colorSpace2 = ColorSpace.get(colorSpace);
        convert = color.convert(colorSpace2);
        kotlin.jvm.internal.F.o(convert, "convert(ColorSpace.get(colorSpace))");
        return convert;
    }

    @l3.d
    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.W(26)
    public static final Color r(@l3.d Color color, @l3.d ColorSpace colorSpace) {
        Color convert;
        kotlin.jvm.internal.F.p(color, "<this>");
        kotlin.jvm.internal.F.p(colorSpace, "colorSpace");
        convert = color.convert(colorSpace);
        kotlin.jvm.internal.F.o(convert, "convert(colorSpace)");
        return convert;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.W(26)
    public static final float s(long j4) {
        float alpha;
        alpha = Color.alpha(j4);
        return alpha;
    }

    public static final int t(@InterfaceC0569l int i4) {
        return (i4 >> 24) & 255;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.W(26)
    public static final float u(long j4) {
        float blue;
        blue = Color.blue(j4);
        return blue;
    }

    public static final int v(@InterfaceC0569l int i4) {
        return i4 & 255;
    }

    @l3.d
    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.W(26)
    public static final ColorSpace w(long j4) {
        ColorSpace colorSpace;
        colorSpace = Color.colorSpace(j4);
        kotlin.jvm.internal.F.o(colorSpace, "colorSpace(this)");
        return colorSpace;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.W(26)
    public static final float x(long j4) {
        float green;
        green = Color.green(j4);
        return green;
    }

    public static final int y(@InterfaceC0569l int i4) {
        return (i4 >> 8) & 255;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.W(26)
    public static final float z(@InterfaceC0569l int i4) {
        return Color.luminance(i4);
    }
}
