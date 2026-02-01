package com.airbnb.lottie.utils;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.InterfaceC0580x;
import java.util.List;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static final PointF f23297a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static double b(double d4, double d5, double d6) {
        return Math.max(d5, Math.min(d6, d4));
    }

    public static float c(float f4, float f5, float f6) {
        return Math.max(f5, Math.min(f6, f4));
    }

    public static int d(int i4, int i5, int i6) {
        return Math.max(i5, Math.min(i6, i4));
    }

    public static boolean e(float f4, float f5, float f6) {
        return f4 >= f5 && f4 <= f6;
    }

    private static int f(int i4, int i5) {
        boolean z3;
        int i6 = i4 / i5;
        if ((i4 ^ i5) >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i7 = i4 % i5;
        if (!z3 && i7 != 0) {
            return i6 - 1;
        }
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(float f4, float f5) {
        return h((int) f4, (int) f5);
    }

    private static int h(int i4, int i5) {
        return i4 - (i5 * f(i4, i5));
    }

    public static void i(com.airbnb.lottie.model.content.i iVar, Path path) {
        path.reset();
        PointF b4 = iVar.b();
        path.moveTo(b4.x, b4.y);
        f23297a.set(b4.x, b4.y);
        for (int i4 = 0; i4 < iVar.a().size(); i4++) {
            com.airbnb.lottie.model.a aVar = iVar.a().get(i4);
            PointF a4 = aVar.a();
            PointF b5 = aVar.b();
            PointF c4 = aVar.c();
            PointF pointF = f23297a;
            if (a4.equals(pointF) && b5.equals(c4)) {
                path.lineTo(c4.x, c4.y);
            } else {
                path.cubicTo(a4.x, a4.y, b5.x, b5.y, c4.x, c4.y);
            }
            pointF.set(c4.x, c4.y);
        }
        if (iVar.d()) {
            path.close();
        }
    }

    public static double j(double d4, double d5, @InterfaceC0580x(from = 0.0d, to = 1.0d) double d6) {
        return d4 + (d6 * (d5 - d4));
    }

    public static float k(float f4, float f5, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f6) {
        return f4 + (f6 * (f5 - f4));
    }

    public static int l(int i4, int i5, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        return (int) (i4 + (f4 * (i5 - i4)));
    }

    public static void m(com.airbnb.lottie.model.d dVar, int i4, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2, com.airbnb.lottie.animation.content.k kVar) {
        if (dVar.c(kVar.getName(), i4)) {
            list.add(dVar2.a(kVar.getName()).j(kVar));
        }
    }
}
