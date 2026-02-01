package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.v;
import androidx.core.view.C0823k0;

/* loaded from: classes.dex */
public class a {

    /* renamed from: g, reason: collision with root package name */
    private static final String f6752g = "TransitionLayout";

    /* renamed from: a, reason: collision with root package name */
    String f6753a;

    /* renamed from: b, reason: collision with root package name */
    private int f6754b;

    /* renamed from: c, reason: collision with root package name */
    private int f6755c;

    /* renamed from: d, reason: collision with root package name */
    private float f6756d;

    /* renamed from: e, reason: collision with root package name */
    private String f6757e;

    /* renamed from: f, reason: collision with root package name */
    boolean f6758f;

    public a(a aVar) {
        this.f6755c = Integer.MIN_VALUE;
        this.f6756d = Float.NaN;
        this.f6757e = null;
        this.f6753a = aVar.f6753a;
        this.f6754b = aVar.f6754b;
        this.f6755c = aVar.f6755c;
        this.f6756d = aVar.f6756d;
        this.f6757e = aVar.f6757e;
        this.f6758f = aVar.f6758f;
    }

    private static int b(int i4) {
        int i5 = (i4 & (~(i4 >> 31))) - 255;
        return (i5 & (i5 >> 31)) + 255;
    }

    public static String c(int i4) {
        return "#" + ("00000000" + Integer.toHexString(i4)).substring(r2.length() - 8);
    }

    public static int p(float f4, float f5, float f6) {
        float f7 = f4 * 6.0f;
        int i4 = (int) f7;
        float f8 = f7 - i4;
        float f9 = f6 * 255.0f;
        int i5 = (int) (((1.0f - f5) * f9) + 0.5f);
        int i6 = (int) (((1.0f - (f8 * f5)) * f9) + 0.5f);
        int i7 = (int) (((1.0f - ((1.0f - f8) * f5)) * f9) + 0.5f);
        int i8 = (int) (f9 + 0.5f);
        if (i4 == 0) {
            return ((i8 << 16) + (i7 << 8) + i5) | C0823k0.f13589t;
        }
        if (i4 == 1) {
            return ((i6 << 16) + (i8 << 8) + i5) | C0823k0.f13589t;
        }
        if (i4 == 2) {
            return ((i5 << 16) + (i8 << 8) + i7) | C0823k0.f13589t;
        }
        if (i4 == 3) {
            return ((i5 << 16) + (i6 << 8) + i8) | C0823k0.f13589t;
        }
        if (i4 == 4) {
            return ((i7 << 16) + (i5 << 8) + i8) | C0823k0.f13589t;
        }
        if (i4 != 5) {
            return 0;
        }
        return ((i8 << 16) + (i5 << 8) + i6) | C0823k0.f13589t;
    }

    public static int s(float f4, float f5, float f6, float f7) {
        int b4 = b((int) (f4 * 255.0f));
        int b5 = b((int) (f5 * 255.0f));
        return (b4 << 16) | (b((int) (f7 * 255.0f)) << 24) | (b5 << 8) | b((int) (f6 * 255.0f));
    }

    public void a(e eVar) {
        int i4 = this.f6754b;
        switch (i4) {
            case 900:
            case v.b.f7410l /* 902 */:
            case v.b.f7414p /* 906 */:
                eVar.J(this.f6753a, i4, this.f6755c);
                return;
            case v.b.f7409k /* 901 */:
            case v.b.f7413o /* 905 */:
                eVar.I(this.f6753a, i4, this.f6756d);
                return;
            case v.b.f7411m /* 903 */:
                eVar.K(this.f6753a, i4, this.f6757e);
                return;
            case v.b.f7412n /* 904 */:
                eVar.L(this.f6753a, i4, this.f6758f);
                return;
            default:
                return;
        }
    }

    public a d() {
        return new a(this);
    }

    public boolean e(a aVar) {
        int i4;
        if (aVar == null || (i4 = this.f6754b) != aVar.f6754b) {
            return false;
        }
        switch (i4) {
            case 900:
            case v.b.f7414p /* 906 */:
                if (this.f6755c != aVar.f6755c) {
                    return false;
                }
                return true;
            case v.b.f7409k /* 901 */:
                if (this.f6756d != aVar.f6756d) {
                    return false;
                }
                return true;
            case v.b.f7410l /* 902 */:
                if (this.f6755c != aVar.f6755c) {
                    return false;
                }
                return true;
            case v.b.f7411m /* 903 */:
                if (this.f6755c != aVar.f6755c) {
                    return false;
                }
                return true;
            case v.b.f7412n /* 904 */:
                if (this.f6758f != aVar.f6758f) {
                    return false;
                }
                return true;
            case v.b.f7413o /* 905 */:
                if (this.f6756d != aVar.f6756d) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public boolean f() {
        return this.f6758f;
    }

    public int g() {
        return this.f6755c;
    }

    public float h() {
        return this.f6756d;
    }

    public int i() {
        return this.f6755c;
    }

    public int j(float[] fArr) {
        return (b((int) (fArr[3] * 255.0f)) << 24) | (b((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (b((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | b((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }

    public String k() {
        return this.f6753a;
    }

    public String l() {
        return this.f6757e;
    }

    public int m() {
        return this.f6754b;
    }

    public float n() {
        switch (this.f6754b) {
            case 900:
                return this.f6755c;
            case v.b.f7409k /* 901 */:
                return this.f6756d;
            case v.b.f7410l /* 902 */:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case v.b.f7411m /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case v.b.f7412n /* 904 */:
                if (this.f6758f) {
                    return 1.0f;
                }
                return 0.0f;
            case v.b.f7413o /* 905 */:
                return this.f6756d;
            default:
                return Float.NaN;
        }
    }

    public void o(float[] fArr) {
        float f4;
        switch (this.f6754b) {
            case 900:
                fArr[0] = this.f6755c;
                return;
            case v.b.f7409k /* 901 */:
                fArr[0] = this.f6756d;
                return;
            case v.b.f7410l /* 902 */:
                int i4 = (this.f6755c >> 24) & 255;
                float pow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = pow3;
                fArr[3] = i4 / 255.0f;
                return;
            case v.b.f7411m /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case v.b.f7412n /* 904 */:
                if (this.f6758f) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.0f;
                }
                fArr[0] = f4;
                return;
            case v.b.f7413o /* 905 */:
                fArr[0] = this.f6756d;
                return;
            default:
                return;
        }
    }

    public boolean q() {
        int i4 = this.f6754b;
        if (i4 != 903 && i4 != 904 && i4 != 906) {
            return true;
        }
        return false;
    }

    public int r() {
        if (this.f6754b != 902) {
            return 1;
        }
        return 4;
    }

    public void t(boolean z3) {
        this.f6758f = z3;
    }

    public String toString() {
        String str = this.f6753a + ":";
        switch (this.f6754b) {
            case 900:
                return str + this.f6755c;
            case v.b.f7409k /* 901 */:
                return str + this.f6756d;
            case v.b.f7410l /* 902 */:
                return str + c(this.f6755c);
            case v.b.f7411m /* 903 */:
                return str + this.f6757e;
            case v.b.f7412n /* 904 */:
                return str + Boolean.valueOf(this.f6758f);
            case v.b.f7413o /* 905 */:
                return str + this.f6756d;
            default:
                return str + "????";
        }
    }

    public void u(float f4) {
        this.f6756d = f4;
    }

    public void v(int i4) {
        this.f6755c = i4;
    }

    public void w(e eVar, float[] fArr) {
        int i4 = this.f6754b;
        boolean z3 = true;
        switch (i4) {
            case 900:
                eVar.J(this.f6753a, i4, (int) fArr[0]);
                return;
            case v.b.f7409k /* 901 */:
            case v.b.f7413o /* 905 */:
                eVar.I(this.f6753a, i4, fArr[0]);
                return;
            case v.b.f7410l /* 902 */:
                eVar.J(this.f6753a, this.f6754b, (b((int) (fArr[3] * 255.0f)) << 24) | (b((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (b((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | b((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f)));
                return;
            case v.b.f7411m /* 903 */:
            case v.b.f7414p /* 906 */:
                throw new RuntimeException("unable to interpolate " + this.f6753a);
            case v.b.f7412n /* 904 */:
                String str = this.f6753a;
                if (fArr[0] <= 0.5f) {
                    z3 = false;
                }
                eVar.L(str, i4, z3);
                return;
            default:
                return;
        }
    }

    public void x(String str) {
        this.f6757e = str;
    }

    public void y(Object obj) {
        switch (this.f6754b) {
            case 900:
            case v.b.f7414p /* 906 */:
                this.f6755c = ((Integer) obj).intValue();
                return;
            case v.b.f7409k /* 901 */:
                this.f6756d = ((Float) obj).floatValue();
                return;
            case v.b.f7410l /* 902 */:
                this.f6755c = ((Integer) obj).intValue();
                return;
            case v.b.f7411m /* 903 */:
                this.f6757e = (String) obj;
                return;
            case v.b.f7412n /* 904 */:
                this.f6758f = ((Boolean) obj).booleanValue();
                return;
            case v.b.f7413o /* 905 */:
                this.f6756d = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public void z(float[] fArr) {
        boolean z3 = true;
        switch (this.f6754b) {
            case 900:
            case v.b.f7414p /* 906 */:
                this.f6755c = (int) fArr[0];
                return;
            case v.b.f7409k /* 901 */:
            case v.b.f7413o /* 905 */:
                this.f6756d = fArr[0];
                return;
            case v.b.f7410l /* 902 */:
                float f4 = fArr[0];
                float f5 = fArr[1];
                float f6 = fArr[2];
                this.f6755c = ((Math.round(fArr[3] * 255.0f) & 255) << 24) | ((Math.round(((float) Math.pow(f4, 0.5d)) * 255.0f) & 255) << 16) | ((Math.round(((float) Math.pow(f5, 0.5d)) * 255.0f) & 255) << 8) | (Math.round(((float) Math.pow(f6, 0.5d)) * 255.0f) & 255);
                return;
            case v.b.f7411m /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case v.b.f7412n /* 904 */:
                if (fArr[0] <= 0.5d) {
                    z3 = false;
                }
                this.f6758f = z3;
                return;
            default:
                return;
        }
    }

    public a(String str, int i4, String str2) {
        this.f6755c = Integer.MIN_VALUE;
        this.f6756d = Float.NaN;
        this.f6753a = str;
        this.f6754b = i4;
        this.f6757e = str2;
    }

    public a(String str, int i4, int i5) {
        this.f6755c = Integer.MIN_VALUE;
        this.f6756d = Float.NaN;
        this.f6757e = null;
        this.f6753a = str;
        this.f6754b = i4;
        if (i4 == 901) {
            this.f6756d = i5;
        } else {
            this.f6755c = i5;
        }
    }

    public a(String str, int i4, float f4) {
        this.f6755c = Integer.MIN_VALUE;
        this.f6757e = null;
        this.f6753a = str;
        this.f6754b = i4;
        this.f6756d = f4;
    }

    public a(String str, int i4, boolean z3) {
        this.f6755c = Integer.MIN_VALUE;
        this.f6756d = Float.NaN;
        this.f6757e = null;
        this.f6753a = str;
        this.f6754b = i4;
        this.f6758f = z3;
    }

    public a(String str, int i4) {
        this.f6755c = Integer.MIN_VALUE;
        this.f6756d = Float.NaN;
        this.f6757e = null;
        this.f6753a = str;
        this.f6754b = i4;
    }

    public a(String str, int i4, Object obj) {
        this.f6755c = Integer.MIN_VALUE;
        this.f6756d = Float.NaN;
        this.f6757e = null;
        this.f6753a = str;
        this.f6754b = i4;
        y(obj);
    }

    public a(a aVar, Object obj) {
        this.f6755c = Integer.MIN_VALUE;
        this.f6756d = Float.NaN;
        this.f6757e = null;
        this.f6753a = aVar.f6753a;
        this.f6754b = aVar.f6754b;
        y(obj);
    }
}
