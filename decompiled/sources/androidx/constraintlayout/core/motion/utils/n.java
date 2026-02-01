package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class n extends d {

    /* renamed from: s, reason: collision with root package name */
    private static final boolean f7262s = false;

    /* renamed from: p, reason: collision with root package name */
    double f7263p;

    /* renamed from: q, reason: collision with root package name */
    double f7264q;

    /* renamed from: r, reason: collision with root package name */
    double f7265r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(String str) {
        this.f7159a = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.f7263p = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i4 = indexOf2 + 1;
        this.f7264q = Double.parseDouble(str.substring(i4, str.indexOf(44, i4)).trim());
    }

    private double d(double d4) {
        double d5 = this.f7264q;
        if (d4 < d5) {
            double d6 = this.f7263p;
            return ((d6 * d5) * d5) / ((((d5 - d4) * d6) + d4) * ((d6 * (d5 - d4)) + d4));
        }
        double d7 = this.f7263p;
        return (((d5 - 1.0d) * d7) * (d5 - 1.0d)) / (((((-d7) * (d5 - d4)) - d4) + 1.0d) * ((((-d7) * (d5 - d4)) - d4) + 1.0d));
    }

    private double e(double d4) {
        double d5 = this.f7264q;
        if (d4 < d5) {
            return (d5 * d4) / (d4 + (this.f7263p * (d5 - d4)));
        }
        return ((1.0d - d5) * (d4 - 1.0d)) / ((1.0d - d4) - (this.f7263p * (d5 - d4)));
    }

    @Override // androidx.constraintlayout.core.motion.utils.d
    public double a(double d4) {
        return e(d4);
    }

    @Override // androidx.constraintlayout.core.motion.utils.d
    public double b(double d4) {
        return d(d4);
    }
}
