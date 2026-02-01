package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* loaded from: classes.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    private static final String f7146c = "cubic(0.4, 0.0, 0.2, 1)";

    /* renamed from: d, reason: collision with root package name */
    private static final String f7147d = "cubic(0.4, 0.05, 0.8, 0.7)";

    /* renamed from: e, reason: collision with root package name */
    private static final String f7148e = "cubic(0.0, 0.0, 0.2, 0.95)";

    /* renamed from: f, reason: collision with root package name */
    private static final String f7149f = "cubic(1, 1, 0, 0)";

    /* renamed from: g, reason: collision with root package name */
    private static final String f7150g = "cubic(0.36, 0, 0.66, -0.56)";

    /* renamed from: h, reason: collision with root package name */
    private static final String f7151h = "cubic(0.34, 1.56, 0.64, 1)";

    /* renamed from: m, reason: collision with root package name */
    private static final String f7156m = "anticipate";

    /* renamed from: n, reason: collision with root package name */
    private static final String f7157n = "overshoot";

    /* renamed from: a, reason: collision with root package name */
    String f7159a = "identity";

    /* renamed from: b, reason: collision with root package name */
    static d f7145b = new d();

    /* renamed from: k, reason: collision with root package name */
    private static final String f7154k = "standard";

    /* renamed from: j, reason: collision with root package name */
    private static final String f7153j = "accelerate";

    /* renamed from: i, reason: collision with root package name */
    private static final String f7152i = "decelerate";

    /* renamed from: l, reason: collision with root package name */
    private static final String f7155l = "linear";

    /* renamed from: o, reason: collision with root package name */
    public static String[] f7158o = {f7154k, f7153j, f7152i, f7155l};

    public static d c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new a(str);
        }
        if (str.startsWith("spline")) {
            return new q(str);
        }
        if (str.startsWith("Schlick")) {
            return new n(str);
        }
        char c4 = 65535;
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals(f7153j)) {
                    c4 = 0;
                    break;
                }
                break;
            case -1263948740:
                if (str.equals(f7152i)) {
                    c4 = 1;
                    break;
                }
                break;
            case -1197605014:
                if (str.equals(f7156m)) {
                    c4 = 2;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals(f7155l)) {
                    c4 = 3;
                    break;
                }
                break;
            case -749065269:
                if (str.equals(f7157n)) {
                    c4 = 4;
                    break;
                }
                break;
            case 1312628413:
                if (str.equals(f7154k)) {
                    c4 = 5;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                return new a(f7147d);
            case 1:
                return new a(f7148e);
            case 2:
                return new a(f7150g);
            case 3:
                return new a(f7149f);
            case 4:
                return new a(f7151h);
            case 5:
                return new a(f7146c);
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f7158o));
                return f7145b;
        }
    }

    public double a(double d4) {
        return d4;
    }

    public double b(double d4) {
        return 1.0d;
    }

    public String toString() {
        return this.f7159a;
    }

    /* loaded from: classes.dex */
    static class a extends d {

        /* renamed from: t, reason: collision with root package name */
        private static double f7160t = 0.01d;

        /* renamed from: u, reason: collision with root package name */
        private static double f7161u = 1.0E-4d;

        /* renamed from: p, reason: collision with root package name */
        double f7162p;

        /* renamed from: q, reason: collision with root package name */
        double f7163q;

        /* renamed from: r, reason: collision with root package name */
        double f7164r;

        /* renamed from: s, reason: collision with root package name */
        double f7165s;

        a(String str) {
            this.f7159a = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.f7162p = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i4 = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i4);
            this.f7163q = Double.parseDouble(str.substring(i4, indexOf3).trim());
            int i5 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i5);
            this.f7164r = Double.parseDouble(str.substring(i5, indexOf4).trim());
            int i6 = indexOf4 + 1;
            this.f7165s = Double.parseDouble(str.substring(i6, str.indexOf(41, i6)).trim());
        }

        private double d(double d4) {
            double d5 = 1.0d - d4;
            double d6 = this.f7162p;
            double d7 = this.f7164r;
            return (d5 * 3.0d * d5 * d6) + (d5 * 6.0d * d4 * (d7 - d6)) + (3.0d * d4 * d4 * (1.0d - d7));
        }

        private double e(double d4) {
            double d5 = 1.0d - d4;
            double d6 = this.f7163q;
            double d7 = this.f7165s;
            return (d5 * 3.0d * d5 * d6) + (d5 * 6.0d * d4 * (d7 - d6)) + (3.0d * d4 * d4 * (1.0d - d7));
        }

        private double f(double d4) {
            double d5 = 1.0d - d4;
            double d6 = 3.0d * d5;
            return (this.f7162p * d5 * d6 * d4) + (this.f7164r * d6 * d4 * d4) + (d4 * d4 * d4);
        }

        private double g(double d4) {
            double d5 = 1.0d - d4;
            double d6 = 3.0d * d5;
            return (this.f7163q * d5 * d6 * d4) + (this.f7165s * d6 * d4 * d4) + (d4 * d4 * d4);
        }

        @Override // androidx.constraintlayout.core.motion.utils.d
        public double a(double d4) {
            if (d4 <= com.google.firebase.remoteconfig.l.f37524n) {
                return com.google.firebase.remoteconfig.l.f37524n;
            }
            if (d4 >= 1.0d) {
                return 1.0d;
            }
            double d5 = 0.5d;
            double d6 = 0.5d;
            while (d5 > f7160t) {
                d5 *= 0.5d;
                if (f(d6) < d4) {
                    d6 += d5;
                } else {
                    d6 -= d5;
                }
            }
            double d7 = d6 - d5;
            double f4 = f(d7);
            double d8 = d6 + d5;
            double f5 = f(d8);
            double g4 = g(d7);
            return (((g(d8) - g4) * (d4 - f4)) / (f5 - f4)) + g4;
        }

        @Override // androidx.constraintlayout.core.motion.utils.d
        public double b(double d4) {
            double d5 = 0.5d;
            double d6 = 0.5d;
            while (d5 > f7161u) {
                d5 *= 0.5d;
                if (f(d6) < d4) {
                    d6 += d5;
                } else {
                    d6 -= d5;
                }
            }
            double d7 = d6 - d5;
            double f4 = f(d7);
            double d8 = d6 + d5;
            return (g(d8) - g(d7)) / (f(d8) - f4);
        }

        void h(double d4, double d5, double d6, double d7) {
            this.f7162p = d4;
            this.f7163q = d5;
            this.f7164r = d6;
            this.f7165s = d7;
        }

        a(double d4, double d5, double d6, double d7) {
            h(d4, d5, d6, d7);
        }
    }
}
