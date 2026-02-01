package androidx.constraintlayout.core;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public class SolverVariable implements Comparable<SolverVariable> {

    /* renamed from: V, reason: collision with root package name */
    private static final boolean f6573V = false;

    /* renamed from: W, reason: collision with root package name */
    private static final boolean f6574W = false;

    /* renamed from: X, reason: collision with root package name */
    private static final boolean f6575X = false;

    /* renamed from: Y, reason: collision with root package name */
    public static final int f6576Y = 0;

    /* renamed from: Z, reason: collision with root package name */
    public static final int f6577Z = 1;

    /* renamed from: a0, reason: collision with root package name */
    public static final int f6578a0 = 2;

    /* renamed from: b0, reason: collision with root package name */
    public static final int f6579b0 = 3;

    /* renamed from: c0, reason: collision with root package name */
    public static final int f6580c0 = 4;

    /* renamed from: d0, reason: collision with root package name */
    public static final int f6581d0 = 5;

    /* renamed from: e0, reason: collision with root package name */
    public static final int f6582e0 = 6;

    /* renamed from: f0, reason: collision with root package name */
    public static final int f6583f0 = 7;

    /* renamed from: g0, reason: collision with root package name */
    public static final int f6584g0 = 8;

    /* renamed from: h0, reason: collision with root package name */
    private static int f6585h0 = 1;

    /* renamed from: i0, reason: collision with root package name */
    private static int f6586i0 = 1;

    /* renamed from: j0, reason: collision with root package name */
    private static int f6587j0 = 1;

    /* renamed from: k0, reason: collision with root package name */
    private static int f6588k0 = 1;

    /* renamed from: l0, reason: collision with root package name */
    private static int f6589l0 = 1;

    /* renamed from: m0, reason: collision with root package name */
    static final int f6590m0 = 9;

    /* renamed from: E, reason: collision with root package name */
    public boolean f6591E;

    /* renamed from: F, reason: collision with root package name */
    private String f6592F;

    /* renamed from: G, reason: collision with root package name */
    public int f6593G;

    /* renamed from: H, reason: collision with root package name */
    int f6594H;

    /* renamed from: I, reason: collision with root package name */
    public int f6595I;

    /* renamed from: J, reason: collision with root package name */
    public float f6596J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f6597K;

    /* renamed from: L, reason: collision with root package name */
    float[] f6598L;

    /* renamed from: M, reason: collision with root package name */
    float[] f6599M;

    /* renamed from: N, reason: collision with root package name */
    Type f6600N;

    /* renamed from: O, reason: collision with root package name */
    b[] f6601O;

    /* renamed from: P, reason: collision with root package name */
    int f6602P;

    /* renamed from: Q, reason: collision with root package name */
    public int f6603Q;

    /* renamed from: R, reason: collision with root package name */
    boolean f6604R;

    /* renamed from: S, reason: collision with root package name */
    int f6605S;

    /* renamed from: T, reason: collision with root package name */
    float f6606T;

    /* renamed from: U, reason: collision with root package name */
    HashSet<b> f6607U;

    /* loaded from: classes.dex */
    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6608a;

        static {
            int[] iArr = new int[Type.values().length];
            f6608a = iArr;
            try {
                iArr[Type.UNRESTRICTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6608a[Type.CONSTANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6608a[Type.SLACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6608a[Type.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6608a[Type.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public SolverVariable(String str, Type type) {
        this.f6593G = -1;
        this.f6594H = -1;
        this.f6595I = 0;
        this.f6597K = false;
        this.f6598L = new float[9];
        this.f6599M = new float[9];
        this.f6601O = new b[16];
        this.f6602P = 0;
        this.f6603Q = 0;
        this.f6604R = false;
        this.f6605S = -1;
        this.f6606T = 0.0f;
        this.f6607U = null;
        this.f6592F = str;
        this.f6600N = type;
    }

    private static String i(Type type, String str) {
        if (str != null) {
            return str + f6586i0;
        }
        int i4 = a.f6608a[type.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        if (i4 == 5) {
                            int i5 = f6589l0 + 1;
                            f6589l0 = i5;
                            return androidx.exifinterface.media.a.Z4 + i5;
                        }
                        throw new AssertionError(type.name());
                    }
                    int i6 = f6586i0 + 1;
                    f6586i0 = i6;
                    return "e" + i6;
                }
                int i7 = f6585h0 + 1;
                f6585h0 = i7;
                return androidx.exifinterface.media.a.T4 + i7;
            }
            int i8 = f6588k0 + 1;
            f6588k0 = i8;
            return "C" + i8;
        }
        int i9 = f6587j0 + 1;
        f6587j0 = i9;
        return "U" + i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j() {
        f6586i0++;
    }

    public final void b(b bVar) {
        int i4 = 0;
        while (true) {
            int i5 = this.f6602P;
            if (i4 < i5) {
                if (this.f6601O[i4] == bVar) {
                    return;
                } else {
                    i4++;
                }
            } else {
                b[] bVarArr = this.f6601O;
                if (i5 >= bVarArr.length) {
                    this.f6601O = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f6601O;
                int i6 = this.f6602P;
                bVarArr2[i6] = bVar;
                this.f6602P = i6 + 1;
                return;
            }
        }
    }

    void e() {
        for (int i4 = 0; i4 < 9; i4++) {
            this.f6598L[i4] = 0.0f;
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(SolverVariable solverVariable) {
        return this.f6593G - solverVariable.f6593G;
    }

    public String g() {
        return this.f6592F;
    }

    public final void k(b bVar) {
        int i4 = this.f6602P;
        int i5 = 0;
        while (i5 < i4) {
            if (this.f6601O[i5] == bVar) {
                while (i5 < i4 - 1) {
                    b[] bVarArr = this.f6601O;
                    int i6 = i5 + 1;
                    bVarArr[i5] = bVarArr[i6];
                    i5 = i6;
                }
                this.f6602P--;
                return;
            }
            i5++;
        }
    }

    public void l() {
        this.f6592F = null;
        this.f6600N = Type.UNKNOWN;
        this.f6595I = 0;
        this.f6593G = -1;
        this.f6594H = -1;
        this.f6596J = 0.0f;
        this.f6597K = false;
        this.f6604R = false;
        this.f6605S = -1;
        this.f6606T = 0.0f;
        int i4 = this.f6602P;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f6601O[i5] = null;
        }
        this.f6602P = 0;
        this.f6603Q = 0;
        this.f6591E = false;
        Arrays.fill(this.f6599M, 0.0f);
    }

    public void m(e eVar, float f4) {
        this.f6596J = f4;
        this.f6597K = true;
        this.f6604R = false;
        this.f6605S = -1;
        this.f6606T = 0.0f;
        int i4 = this.f6602P;
        this.f6594H = -1;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f6601O[i5].a(eVar, this, false);
        }
        this.f6602P = 0;
    }

    public void n(String str) {
        this.f6592F = str;
    }

    public void o(e eVar, SolverVariable solverVariable, float f4) {
        this.f6604R = true;
        this.f6605S = solverVariable.f6593G;
        this.f6606T = f4;
        int i4 = this.f6602P;
        this.f6594H = -1;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f6601O[i5].G(eVar, this, false);
        }
        this.f6602P = 0;
        eVar.x();
    }

    public void p(Type type, String str) {
        this.f6600N = type;
    }

    String q() {
        String str = this + "[";
        int i4 = 0;
        boolean z3 = false;
        boolean z4 = true;
        while (true) {
            float[] fArr = this.f6598L;
            if (i4 >= fArr.length) {
                break;
            }
            String str2 = str + fArr[i4];
            float[] fArr2 = this.f6598L;
            float f4 = fArr2[i4];
            if (f4 > 0.0f) {
                z3 = false;
            } else if (f4 < 0.0f) {
                z3 = true;
            }
            if (f4 != 0.0f) {
                z4 = false;
            }
            if (i4 < fArr2.length - 1) {
                str = str2 + ", ";
            } else {
                str = str2 + "] ";
            }
            i4++;
        }
        if (z3) {
            str = str + " (-)";
        }
        if (z4) {
            return str + " (*)";
        }
        return str;
    }

    public final void r(e eVar, b bVar) {
        int i4 = this.f6602P;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f6601O[i5].c(eVar, bVar, false);
        }
        this.f6602P = 0;
    }

    public String toString() {
        String str = this.f6592F;
        if (str != null) {
            return "" + str;
        }
        return "" + this.f6593G;
    }

    public SolverVariable(Type type, String str) {
        this.f6593G = -1;
        this.f6594H = -1;
        this.f6595I = 0;
        this.f6597K = false;
        this.f6598L = new float[9];
        this.f6599M = new float[9];
        this.f6601O = new b[16];
        this.f6602P = 0;
        this.f6603Q = 0;
        this.f6604R = false;
        this.f6605S = -1;
        this.f6606T = 0.0f;
        this.f6607U = null;
        this.f6600N = type;
    }
}
