package androidx.core.graphics;

import android.graphics.Color;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.i0;
import androidx.core.view.C0823k0;
import java.util.Objects;

/* renamed from: androidx.core.graphics.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0734z {

    /* renamed from: a, reason: collision with root package name */
    private static final double f12554a = 95.047d;

    /* renamed from: b, reason: collision with root package name */
    private static final double f12555b = 100.0d;

    /* renamed from: c, reason: collision with root package name */
    private static final double f12556c = 108.883d;

    /* renamed from: d, reason: collision with root package name */
    private static final double f12557d = 0.008856d;

    /* renamed from: e, reason: collision with root package name */
    private static final double f12558e = 903.3d;

    /* renamed from: f, reason: collision with root package name */
    private static final int f12559f = 10;

    /* renamed from: g, reason: collision with root package name */
    private static final int f12560g = 1;

    /* renamed from: h, reason: collision with root package name */
    private static final ThreadLocal<double[]> f12561h = new ThreadLocal<>();

    @androidx.annotation.W(26)
    /* renamed from: androidx.core.graphics.z$a */
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static Color a(Color color, Color color2) {
            if (Objects.equals(color.getModel(), color2.getModel())) {
                if (!Objects.equals(color2.getColorSpace(), color.getColorSpace())) {
                    color = color.convert(color2.getColorSpace());
                }
                float[] components = color.getComponents();
                float[] components2 = color2.getComponents();
                float alpha = color.alpha();
                float alpha2 = color2.alpha() * (1.0f - alpha);
                int componentCount = color2.getComponentCount() - 1;
                float f4 = alpha + alpha2;
                components2[componentCount] = f4;
                if (f4 > 0.0f) {
                    alpha /= f4;
                    alpha2 /= f4;
                }
                for (int i4 = 0; i4 < componentCount; i4++) {
                    components2[i4] = (components[i4] * alpha) + (components2[i4] * alpha2);
                }
                return Color.valueOf(components2, color2.getColorSpace());
            }
            throw new IllegalArgumentException("Color models must match (" + color.getModel() + " vs. " + color2.getModel() + ")");
        }
    }

    private C0734z() {
    }

    private static double A(double d4) {
        if (d4 > f12557d) {
            return Math.pow(d4, 0.3333333333333333d);
        }
        return ((d4 * f12558e) + 16.0d) / 116.0d;
    }

    @InterfaceC0569l
    public static int B(@InterfaceC0569l int i4, @androidx.annotation.F(from = 0, to = 255) int i5) {
        if (i5 >= 0 && i5 <= 255) {
            return (i4 & C0823k0.f13588s) | (i5 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    @InterfaceC0569l
    public static int a(@androidx.annotation.N float[] fArr) {
        int round;
        int round2;
        int round3;
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = fArr[2];
        float abs = (1.0f - Math.abs((f6 * 2.0f) - 1.0f)) * f5;
        float f7 = f6 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f4 / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f4) / 60) {
            case 0:
                round = Math.round((abs + f7) * 255.0f);
                round2 = Math.round((abs2 + f7) * 255.0f);
                round3 = Math.round(f7 * 255.0f);
                break;
            case 1:
                round = Math.round((abs2 + f7) * 255.0f);
                round2 = Math.round((abs + f7) * 255.0f);
                round3 = Math.round(f7 * 255.0f);
                break;
            case 2:
                round = Math.round(f7 * 255.0f);
                round2 = Math.round((abs + f7) * 255.0f);
                round3 = Math.round((abs2 + f7) * 255.0f);
                break;
            case 3:
                round = Math.round(f7 * 255.0f);
                round2 = Math.round((abs2 + f7) * 255.0f);
                round3 = Math.round((abs + f7) * 255.0f);
                break;
            case 4:
                round = Math.round((abs2 + f7) * 255.0f);
                round2 = Math.round(f7 * 255.0f);
                round3 = Math.round((abs + f7) * 255.0f);
                break;
            case 5:
            case 6:
                round = Math.round((abs + f7) * 255.0f);
                round2 = Math.round(f7 * 255.0f);
                round3 = Math.round((abs2 + f7) * 255.0f);
                break;
            default:
                round3 = 0;
                round = 0;
                round2 = 0;
                break;
        }
        return Color.rgb(x(round, 0, 255), x(round2, 0, 255), x(round3, 0, 255));
    }

    @InterfaceC0569l
    public static int b(@InterfaceC0580x(from = 0.0d, to = 100.0d) double d4, @InterfaceC0580x(from = -128.0d, to = 127.0d) double d5, @InterfaceC0580x(from = -128.0d, to = 127.0d) double d6) {
        double[] z3 = z();
        c(d4, d5, d6, z3);
        return g(z3[0], z3[1], z3[2]);
    }

    public static void c(@InterfaceC0580x(from = 0.0d, to = 100.0d) double d4, @InterfaceC0580x(from = -128.0d, to = 127.0d) double d5, @InterfaceC0580x(from = -128.0d, to = 127.0d) double d6, @androidx.annotation.N double[] dArr) {
        double d7;
        double d8 = (d4 + 16.0d) / 116.0d;
        double d9 = (d5 / 500.0d) + d8;
        double d10 = d8 - (d6 / 200.0d);
        double pow = Math.pow(d9, 3.0d);
        if (pow <= f12557d) {
            pow = ((d9 * 116.0d) - 16.0d) / f12558e;
        }
        if (d4 > 7.9996247999999985d) {
            d7 = Math.pow(d8, 3.0d);
        } else {
            d7 = d4 / f12558e;
        }
        double pow2 = Math.pow(d10, 3.0d);
        if (pow2 <= f12557d) {
            pow2 = ((d10 * 116.0d) - 16.0d) / f12558e;
        }
        dArr[0] = pow * f12554a;
        dArr[1] = d7 * f12555b;
        dArr[2] = pow2 * f12556c;
    }

    public static void d(@androidx.annotation.F(from = 0, to = 255) int i4, @androidx.annotation.F(from = 0, to = 255) int i5, @androidx.annotation.F(from = 0, to = 255) int i6, @androidx.annotation.N float[] fArr) {
        float f4;
        float abs;
        float f5 = i4 / 255.0f;
        float f6 = i5 / 255.0f;
        float f7 = i6 / 255.0f;
        float max = Math.max(f5, Math.max(f6, f7));
        float min = Math.min(f5, Math.min(f6, f7));
        float f8 = max - min;
        float f9 = (max + min) / 2.0f;
        if (max == min) {
            f4 = 0.0f;
            abs = 0.0f;
        } else {
            if (max == f5) {
                f4 = ((f6 - f7) / f8) % 6.0f;
            } else if (max == f6) {
                f4 = ((f7 - f5) / f8) + 2.0f;
            } else {
                f4 = 4.0f + ((f5 - f6) / f8);
            }
            abs = f8 / (1.0f - Math.abs((2.0f * f9) - 1.0f));
        }
        float f10 = (f4 * 60.0f) % 360.0f;
        if (f10 < 0.0f) {
            f10 += 360.0f;
        }
        fArr[0] = w(f10, 0.0f, 360.0f);
        fArr[1] = w(abs, 0.0f, 1.0f);
        fArr[2] = w(f9, 0.0f, 1.0f);
    }

    public static void e(@androidx.annotation.F(from = 0, to = 255) int i4, @androidx.annotation.F(from = 0, to = 255) int i5, @androidx.annotation.F(from = 0, to = 255) int i6, @androidx.annotation.N double[] dArr) {
        f(i4, i5, i6, dArr);
        h(dArr[0], dArr[1], dArr[2], dArr);
    }

    public static void f(@androidx.annotation.F(from = 0, to = 255) int i4, @androidx.annotation.F(from = 0, to = 255) int i5, @androidx.annotation.F(from = 0, to = 255) int i6, @androidx.annotation.N double[] dArr) {
        double pow;
        double pow2;
        double pow3;
        if (dArr.length == 3) {
            double d4 = i4 / 255.0d;
            if (d4 < 0.04045d) {
                pow = d4 / 12.92d;
            } else {
                pow = Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
            }
            double d5 = i5 / 255.0d;
            if (d5 < 0.04045d) {
                pow2 = d5 / 12.92d;
            } else {
                pow2 = Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
            }
            double d6 = i6 / 255.0d;
            if (d6 < 0.04045d) {
                pow3 = d6 / 12.92d;
            } else {
                pow3 = Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
            }
            dArr[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * f12555b;
            dArr[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * f12555b;
            dArr[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * f12555b;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    @InterfaceC0569l
    public static int g(@InterfaceC0580x(from = 0.0d, to = 95.047d) double d4, @InterfaceC0580x(from = 0.0d, to = 100.0d) double d5, @InterfaceC0580x(from = 0.0d, to = 108.883d) double d6) {
        double d7;
        double d8;
        double d9;
        double d10 = (((3.2406d * d4) + ((-1.5372d) * d5)) + ((-0.4986d) * d6)) / f12555b;
        double d11 = ((((-0.9689d) * d4) + (1.8758d * d5)) + (0.0415d * d6)) / f12555b;
        double d12 = (((0.0557d * d4) + ((-0.204d) * d5)) + (1.057d * d6)) / f12555b;
        if (d10 > 0.0031308d) {
            d7 = (Math.pow(d10, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d7 = d10 * 12.92d;
        }
        if (d11 > 0.0031308d) {
            d8 = (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d8 = d11 * 12.92d;
        }
        if (d12 > 0.0031308d) {
            d9 = (Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d9 = d12 * 12.92d;
        }
        return Color.rgb(x((int) Math.round(d7 * 255.0d), 0, 255), x((int) Math.round(d8 * 255.0d), 0, 255), x((int) Math.round(d9 * 255.0d), 0, 255));
    }

    public static void h(@InterfaceC0580x(from = 0.0d, to = 95.047d) double d4, @InterfaceC0580x(from = 0.0d, to = 100.0d) double d5, @InterfaceC0580x(from = 0.0d, to = 108.883d) double d6, @androidx.annotation.N double[] dArr) {
        if (dArr.length == 3) {
            double A3 = A(d4 / f12554a);
            double A4 = A(d5 / f12555b);
            double A5 = A(d6 / f12556c);
            dArr[0] = Math.max(com.google.firebase.remoteconfig.l.f37524n, (116.0d * A4) - 16.0d);
            dArr[1] = (A3 - A4) * 500.0d;
            dArr[2] = (A4 - A5) * 200.0d;
            return;
        }
        throw new IllegalArgumentException("outLab must have a length of 3.");
    }

    @InterfaceC0569l
    public static int i(@InterfaceC0569l int i4, @InterfaceC0569l int i5, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        float f5 = 1.0f - f4;
        return Color.argb((int) ((Color.alpha(i4) * f5) + (Color.alpha(i5) * f4)), (int) ((Color.red(i4) * f5) + (Color.red(i5) * f4)), (int) ((Color.green(i4) * f5) + (Color.green(i5) * f4)), (int) ((Color.blue(i4) * f5) + (Color.blue(i5) * f4)));
    }

    public static void j(@androidx.annotation.N float[] fArr, @androidx.annotation.N float[] fArr2, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f4, @androidx.annotation.N float[] fArr3) {
        if (fArr3.length == 3) {
            float f5 = 1.0f - f4;
            fArr3[0] = o(fArr[0], fArr2[0], f4);
            fArr3[1] = (fArr[1] * f5) + (fArr2[1] * f4);
            fArr3[2] = (fArr[2] * f5) + (fArr2[2] * f4);
            return;
        }
        throw new IllegalArgumentException("result must have a length of 3.");
    }

    public static void k(@androidx.annotation.N double[] dArr, @androidx.annotation.N double[] dArr2, @InterfaceC0580x(from = 0.0d, to = 1.0d) double d4, @androidx.annotation.N double[] dArr3) {
        if (dArr3.length == 3) {
            double d5 = 1.0d - d4;
            dArr3[0] = (dArr[0] * d5) + (dArr2[0] * d4);
            dArr3[1] = (dArr[1] * d5) + (dArr2[1] * d4);
            dArr3[2] = (dArr[2] * d5) + (dArr2[2] * d4);
            return;
        }
        throw new IllegalArgumentException("outResult must have a length of 3.");
    }

    public static double l(@InterfaceC0569l int i4, @InterfaceC0569l int i5) {
        if (Color.alpha(i5) == 255) {
            if (Color.alpha(i4) < 255) {
                i4 = t(i4, i5);
            }
            double m4 = m(i4) + 0.05d;
            double m5 = m(i5) + 0.05d;
            return Math.max(m4, m5) / Math.min(m4, m5);
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i5));
    }

    @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n, to = 1.0d)
    public static double m(@InterfaceC0569l int i4) {
        double[] z3 = z();
        r(i4, z3);
        return z3[1] / f12555b;
    }

    public static int n(@InterfaceC0569l int i4, @InterfaceC0569l int i5, float f4) {
        int i6 = 255;
        if (Color.alpha(i5) == 255) {
            double d4 = f4;
            if (l(B(i4, 255), i5) < d4) {
                return -1;
            }
            int i7 = 0;
            for (int i8 = 0; i8 <= 10 && i6 - i7 > 1; i8++) {
                int i9 = (i7 + i6) / 2;
                if (l(B(i4, i9), i5) < d4) {
                    i7 = i9;
                } else {
                    i6 = i9;
                }
            }
            return i6;
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i5));
    }

    @i0
    static float o(float f4, float f5, float f6) {
        if (Math.abs(f5 - f4) > 180.0f) {
            if (f5 > f4) {
                f4 += 360.0f;
            } else {
                f5 += 360.0f;
            }
        }
        return (f4 + ((f5 - f4) * f6)) % 360.0f;
    }

    public static void p(@InterfaceC0569l int i4, @androidx.annotation.N float[] fArr) {
        d(Color.red(i4), Color.green(i4), Color.blue(i4), fArr);
    }

    public static void q(@InterfaceC0569l int i4, @androidx.annotation.N double[] dArr) {
        e(Color.red(i4), Color.green(i4), Color.blue(i4), dArr);
    }

    public static void r(@InterfaceC0569l int i4, @androidx.annotation.N double[] dArr) {
        f(Color.red(i4), Color.green(i4), Color.blue(i4), dArr);
    }

    private static int s(int i4, int i5) {
        return 255 - (((255 - i5) * (255 - i4)) / 255);
    }

    public static int t(@InterfaceC0569l int i4, @InterfaceC0569l int i5) {
        int alpha = Color.alpha(i5);
        int alpha2 = Color.alpha(i4);
        int s4 = s(alpha2, alpha);
        return Color.argb(s4, v(Color.red(i4), alpha2, Color.red(i5), alpha, s4), v(Color.green(i4), alpha2, Color.green(i5), alpha, s4), v(Color.blue(i4), alpha2, Color.blue(i5), alpha, s4));
    }

    @androidx.annotation.N
    @androidx.annotation.W(26)
    public static Color u(@androidx.annotation.N Color color, @androidx.annotation.N Color color2) {
        return a.a(color, color2);
    }

    private static int v(int i4, int i5, int i6, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        return (((i4 * 255) * i5) + ((i6 * i7) * (255 - i5))) / (i8 * 255);
    }

    private static float w(float f4, float f5, float f6) {
        if (f4 >= f5) {
            return Math.min(f4, f6);
        }
        return f5;
    }

    private static int x(int i4, int i5, int i6) {
        if (i4 >= i5) {
            return Math.min(i4, i6);
        }
        return i5;
    }

    public static double y(@androidx.annotation.N double[] dArr, @androidx.annotation.N double[] dArr2) {
        return Math.sqrt(Math.pow(dArr[0] - dArr2[0], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + Math.pow(dArr[2] - dArr2[2], 2.0d));
    }

    private static double[] z() {
        ThreadLocal<double[]> threadLocal = f12561h;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            double[] dArr2 = new double[3];
            threadLocal.set(dArr2);
            return dArr2;
        }
        return dArr;
    }
}
