package kotlin.math;

import com.google.firebase.remoteconfig.l;
import kotlin.K0;
import kotlin.Y;
import kotlin.internal.f;
import kotlin.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class d extends c {
    @Y(version = "1.2")
    @f
    private static final double A(double d4) {
        return Math.cos(d4);
    }

    @Y(version = "1.2")
    @f
    private static final double A0(double d4, double d5) {
        return Math.nextAfter(d4, d5);
    }

    @Y(version = "1.2")
    @f
    private static final float B(float f4) {
        return (float) Math.cos(f4);
    }

    @Y(version = "1.2")
    @f
    private static final float B0(float f4, float f5) {
        return Math.nextAfter(f4, f5);
    }

    @Y(version = "1.2")
    @f
    private static final double C(double d4) {
        return Math.cosh(d4);
    }

    @Y(version = "1.2")
    @f
    private static final double C0(double d4) {
        return Math.nextUp(d4);
    }

    @Y(version = "1.2")
    @f
    private static final float D(float f4) {
        return (float) Math.cosh(f4);
    }

    @Y(version = "1.2")
    @f
    private static final float D0(float f4) {
        return Math.nextUp(f4);
    }

    @Y(version = "1.2")
    @f
    private static final double E(double d4) {
        return Math.exp(d4);
    }

    @Y(version = "1.2")
    @f
    private static final double E0(double d4, double d5) {
        return Math.pow(d4, d5);
    }

    @Y(version = "1.2")
    @f
    private static final float F(float f4) {
        return (float) Math.exp(f4);
    }

    @Y(version = "1.2")
    @f
    private static final double F0(double d4, int i4) {
        return Math.pow(d4, i4);
    }

    @Y(version = "1.2")
    @f
    private static final double G(double d4) {
        return Math.expm1(d4);
    }

    @Y(version = "1.2")
    @f
    private static final float G0(float f4, float f5) {
        return (float) Math.pow(f4, f5);
    }

    @Y(version = "1.2")
    @f
    private static final float H(float f4) {
        return (float) Math.expm1(f4);
    }

    @Y(version = "1.2")
    @f
    private static final float H0(float f4, int i4) {
        return (float) Math.pow(f4, i4);
    }

    @Y(version = "1.2")
    @f
    private static final double I(double d4) {
        return Math.floor(d4);
    }

    @Y(version = "1.2")
    @f
    private static final double I0(double d4) {
        return Math.rint(d4);
    }

    @Y(version = "1.2")
    @f
    private static final float J(float f4) {
        return (float) Math.floor(f4);
    }

    @Y(version = "1.2")
    @f
    private static final float J0(float f4) {
        return (float) Math.rint(f4);
    }

    private static final double K(double d4) {
        return Math.abs(d4);
    }

    @Y(version = "1.2")
    public static int K0(double d4) {
        if (!Double.isNaN(d4)) {
            if (d4 > 2.147483647E9d) {
                return Integer.MAX_VALUE;
            }
            if (d4 < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d4);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    private static final float L(float f4) {
        return Math.abs(f4);
    }

    @Y(version = "1.2")
    public static int L0(float f4) {
        if (!Float.isNaN(f4)) {
            return Math.round(f4);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    private static final int M(int i4) {
        return Math.abs(i4);
    }

    @Y(version = "1.2")
    public static long M0(double d4) {
        if (!Double.isNaN(d4)) {
            return Math.round(d4);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    private static final long N(long j4) {
        return Math.abs(j4);
    }

    @Y(version = "1.2")
    public static final long N0(float f4) {
        long M02;
        M02 = M0(f4);
        return M02;
    }

    @Y(version = "1.2")
    @f
    public static /* synthetic */ void O(double d4) {
    }

    @Y(version = "1.2")
    @f
    private static final double O0(double d4) {
        return Math.signum(d4);
    }

    @Y(version = "1.2")
    @f
    public static /* synthetic */ void P(float f4) {
    }

    @Y(version = "1.2")
    @f
    private static final float P0(float f4) {
        return Math.signum(f4);
    }

    @Y(version = "1.2")
    @f
    public static /* synthetic */ void Q(int i4) {
    }

    @Y(version = "1.2")
    @f
    private static final double Q0(double d4) {
        return Math.sin(d4);
    }

    @Y(version = "1.2")
    @f
    public static /* synthetic */ void R(long j4) {
    }

    @Y(version = "1.2")
    @f
    private static final float R0(float f4) {
        return (float) Math.sin(f4);
    }

    private static final double S(double d4) {
        return Math.signum(d4);
    }

    @Y(version = "1.2")
    @f
    private static final double S0(double d4) {
        return Math.sinh(d4);
    }

    private static final float T(float f4) {
        return Math.signum(f4);
    }

    @Y(version = "1.2")
    @f
    private static final float T0(float f4) {
        return (float) Math.sinh(f4);
    }

    public static int U(int i4) {
        if (i4 < 0) {
            return -1;
        }
        return i4 > 0 ? 1 : 0;
    }

    @Y(version = "1.2")
    @f
    private static final double U0(double d4) {
        return Math.sqrt(d4);
    }

    public static int V(long j4) {
        if (j4 < 0) {
            return -1;
        }
        return j4 > 0 ? 1 : 0;
    }

    @Y(version = "1.2")
    @f
    private static final float V0(float f4) {
        return (float) Math.sqrt(f4);
    }

    @Y(version = "1.2")
    @f
    public static /* synthetic */ void W(double d4) {
    }

    @Y(version = "1.2")
    @f
    private static final double W0(double d4) {
        return Math.tan(d4);
    }

    @Y(version = "1.2")
    @f
    public static /* synthetic */ void X(float f4) {
    }

    @Y(version = "1.2")
    @f
    private static final float X0(float f4) {
        return (float) Math.tan(f4);
    }

    @Y(version = "1.2")
    public static /* synthetic */ void Y(int i4) {
    }

    @Y(version = "1.2")
    @f
    private static final double Y0(double d4) {
        return Math.tanh(d4);
    }

    @Y(version = "1.2")
    public static /* synthetic */ void Z(long j4) {
    }

    @Y(version = "1.2")
    @f
    private static final float Z0(float f4) {
        return (float) Math.tanh(f4);
    }

    private static final double a0(double d4) {
        return Math.ulp(d4);
    }

    @Y(version = "1.2")
    public static final double a1(double d4) {
        if (!Double.isNaN(d4) && !Double.isInfinite(d4)) {
            if (d4 > l.f37524n) {
                return Math.floor(d4);
            }
            return Math.ceil(d4);
        }
        return d4;
    }

    private static final float b0(float f4) {
        return Math.ulp(f4);
    }

    @Y(version = "1.2")
    public static final float b1(float f4) {
        double ceil;
        if (!Float.isNaN(f4) && !Float.isInfinite(f4)) {
            if (f4 > 0.0f) {
                ceil = Math.floor(f4);
            } else {
                ceil = Math.ceil(f4);
            }
            return (float) ceil;
        }
        return f4;
    }

    @Y(version = "1.2")
    @f
    private static final double c(double d4, double d5) {
        return Math.IEEEremainder(d4, d5);
    }

    @Y(version = "1.2")
    @f
    public static /* synthetic */ void c0(double d4) {
    }

    @Y(version = "1.2")
    @f
    private static final double c1(double d4, double d5) {
        return Math.copySign(d4, d5);
    }

    @Y(version = "1.2")
    @f
    private static final float d(float f4, float f5) {
        return (float) Math.IEEEremainder(f4, f5);
    }

    @Y(version = "1.2")
    @f
    public static /* synthetic */ void d0(float f4) {
    }

    @Y(version = "1.2")
    @f
    private static final double d1(double d4, int i4) {
        return Math.copySign(d4, i4);
    }

    @Y(version = "1.2")
    @f
    private static final double e(double d4) {
        return Math.abs(d4);
    }

    @Y(version = "1.2")
    @f
    private static final double e0(double d4, double d5) {
        return Math.hypot(d4, d5);
    }

    @Y(version = "1.2")
    @f
    private static final float e1(float f4, float f5) {
        return Math.copySign(f4, f5);
    }

    @Y(version = "1.2")
    @f
    private static final float f(float f4) {
        return Math.abs(f4);
    }

    @Y(version = "1.2")
    @f
    private static final float f0(float f4, float f5) {
        return (float) Math.hypot(f4, f5);
    }

    @Y(version = "1.2")
    @f
    private static final float f1(float f4, int i4) {
        return Math.copySign(f4, i4);
    }

    @Y(version = "1.2")
    @f
    private static final int g(int i4) {
        return Math.abs(i4);
    }

    @Y(version = "1.2")
    @f
    private static final double g0(double d4) {
        return Math.log(d4);
    }

    @Y(version = "1.2")
    @f
    private static final long h(long j4) {
        return Math.abs(j4);
    }

    @Y(version = "1.2")
    @f
    private static final float h0(float f4) {
        return (float) Math.log(f4);
    }

    @Y(version = "1.2")
    @f
    private static final double i(double d4) {
        return Math.acos(d4);
    }

    @Y(version = "1.2")
    @f
    private static final double i0(double d4) {
        return Math.log1p(d4);
    }

    @Y(version = "1.2")
    @f
    private static final float j(float f4) {
        return (float) Math.acos(f4);
    }

    @Y(version = "1.2")
    @f
    private static final float j0(float f4) {
        return (float) Math.log1p(f4);
    }

    @Y(version = "1.2")
    public static final double k(double d4) {
        if (d4 < 1.0d) {
            return Double.NaN;
        }
        if (d4 > a.f52407f) {
            return Math.log(d4) + a.f52403b;
        }
        double d5 = 1;
        double d6 = d4 - d5;
        if (d6 >= a.f52406e) {
            return Math.log(d4 + Math.sqrt((d4 * d4) - d5));
        }
        double sqrt = Math.sqrt(d6);
        if (sqrt >= a.f52405d) {
            sqrt -= ((sqrt * sqrt) * sqrt) / 12;
        }
        return sqrt * Math.sqrt(2.0d);
    }

    @Y(version = "1.2")
    public static final double k0(double d4, double d5) {
        if (d5 > l.f37524n && d5 != 1.0d) {
            return Math.log(d4) / Math.log(d5);
        }
        return Double.NaN;
    }

    @Y(version = "1.2")
    @f
    private static final float l(float f4) {
        return (float) k(f4);
    }

    @Y(version = "1.2")
    public static final float l0(float f4, float f5) {
        if (f5 > 0.0f && f5 != 1.0f) {
            return (float) (Math.log(f4) / Math.log(f5));
        }
        return Float.NaN;
    }

    @Y(version = "1.2")
    @f
    private static final double m(double d4) {
        return Math.asin(d4);
    }

    @Y(version = "1.2")
    @f
    private static final double m0(double d4) {
        return Math.log10(d4);
    }

    @Y(version = "1.2")
    @f
    private static final float n(float f4) {
        return (float) Math.asin(f4);
    }

    @Y(version = "1.2")
    @f
    private static final float n0(float f4) {
        return (float) Math.log10(f4);
    }

    @Y(version = "1.2")
    public static final double o(double d4) {
        double d5 = a.f52406e;
        if (d4 >= d5) {
            if (d4 > a.f52408g) {
                if (d4 > a.f52407f) {
                    return Math.log(d4) + a.f52403b;
                }
                double d6 = d4 * 2;
                return Math.log(d6 + (1 / d6));
            }
            return Math.log(d4 + Math.sqrt((d4 * d4) + 1));
        }
        if (d4 <= (-d5)) {
            return -o(-d4);
        }
        if (Math.abs(d4) >= a.f52405d) {
            return d4 - (((d4 * d4) * d4) / 6);
        }
        return d4;
    }

    @Y(version = "1.2")
    public static final double o0(double d4) {
        return Math.log(d4) / a.f52403b;
    }

    @Y(version = "1.2")
    @f
    private static final float p(float f4) {
        return (float) o(f4);
    }

    @Y(version = "1.2")
    public static final float p0(float f4) {
        return (float) (Math.log(f4) / a.f52403b);
    }

    @Y(version = "1.2")
    @f
    private static final double q(double d4) {
        return Math.atan(d4);
    }

    @Y(version = "1.2")
    @f
    private static final double q0(double d4, double d5) {
        return Math.max(d4, d5);
    }

    @Y(version = "1.2")
    @f
    private static final float r(float f4) {
        return (float) Math.atan(f4);
    }

    @Y(version = "1.2")
    @f
    private static final float r0(float f4, float f5) {
        return Math.max(f4, f5);
    }

    @Y(version = "1.2")
    @f
    private static final double s(double d4, double d5) {
        return Math.atan2(d4, d5);
    }

    @Y(version = "1.2")
    @f
    private static final int s0(int i4, int i5) {
        return Math.max(i4, i5);
    }

    @Y(version = "1.2")
    @f
    private static final float t(float f4, float f5) {
        return (float) Math.atan2(f4, f5);
    }

    @Y(version = "1.2")
    @f
    private static final long t0(long j4, long j5) {
        return Math.max(j4, j5);
    }

    @Y(version = "1.2")
    public static final double u(double d4) {
        if (Math.abs(d4) < a.f52406e) {
            if (Math.abs(d4) > a.f52405d) {
                return d4 + (((d4 * d4) * d4) / 3);
            }
            return d4;
        }
        double d5 = 1;
        return Math.log((d5 + d4) / (d5 - d4)) / 2;
    }

    @Y(version = "1.2")
    @f
    private static final double u0(double d4, double d5) {
        return Math.min(d4, d5);
    }

    @Y(version = "1.2")
    @f
    private static final float v(float f4) {
        return (float) u(f4);
    }

    @Y(version = "1.2")
    @f
    private static final float v0(float f4, float f5) {
        return Math.min(f4, f5);
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.8")
    @f
    private static final double w(double d4) {
        return Math.cbrt(d4);
    }

    @Y(version = "1.2")
    @f
    private static final int w0(int i4, int i5) {
        return Math.min(i4, i5);
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.8")
    @f
    private static final float x(float f4) {
        return (float) Math.cbrt(f4);
    }

    @Y(version = "1.2")
    @f
    private static final long x0(long j4, long j5) {
        return Math.min(j4, j5);
    }

    @Y(version = "1.2")
    @f
    private static final double y(double d4) {
        return Math.ceil(d4);
    }

    @Y(version = "1.2")
    @f
    private static final double y0(double d4) {
        return Math.nextAfter(d4, Double.NEGATIVE_INFINITY);
    }

    @Y(version = "1.2")
    @f
    private static final float z(float f4) {
        return (float) Math.ceil(f4);
    }

    @Y(version = "1.2")
    @f
    private static final float z0(float f4) {
        return Math.nextAfter(f4, Double.NEGATIVE_INFINITY);
    }
}
