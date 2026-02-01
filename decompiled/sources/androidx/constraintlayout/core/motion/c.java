package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.m;
import androidx.constraintlayout.core.motion.utils.o;
import androidx.constraintlayout.core.motion.utils.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
class c implements Comparable<c> {

    /* renamed from: h0, reason: collision with root package name */
    public static final String f6827h0 = "MotionPaths";

    /* renamed from: i0, reason: collision with root package name */
    public static final boolean f6828i0 = false;

    /* renamed from: j0, reason: collision with root package name */
    static final int f6829j0 = 1;

    /* renamed from: k0, reason: collision with root package name */
    static final int f6830k0 = 2;

    /* renamed from: l0, reason: collision with root package name */
    static String[] f6831l0 = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: G, reason: collision with root package name */
    int f6834G;

    /* renamed from: T, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.d f6847T;

    /* renamed from: V, reason: collision with root package name */
    private float f6849V;

    /* renamed from: W, reason: collision with root package name */
    private float f6850W;

    /* renamed from: X, reason: collision with root package name */
    private float f6851X;

    /* renamed from: Y, reason: collision with root package name */
    private float f6852Y;

    /* renamed from: Z, reason: collision with root package name */
    private float f6853Z;

    /* renamed from: E, reason: collision with root package name */
    private float f6832E = 1.0f;

    /* renamed from: F, reason: collision with root package name */
    int f6833F = 0;

    /* renamed from: H, reason: collision with root package name */
    private boolean f6835H = false;

    /* renamed from: I, reason: collision with root package name */
    private float f6836I = 0.0f;

    /* renamed from: J, reason: collision with root package name */
    private float f6837J = 0.0f;

    /* renamed from: K, reason: collision with root package name */
    private float f6838K = 0.0f;

    /* renamed from: L, reason: collision with root package name */
    public float f6839L = 0.0f;

    /* renamed from: M, reason: collision with root package name */
    private float f6840M = 1.0f;

    /* renamed from: N, reason: collision with root package name */
    private float f6841N = 1.0f;

    /* renamed from: O, reason: collision with root package name */
    private float f6842O = Float.NaN;

    /* renamed from: P, reason: collision with root package name */
    private float f6843P = Float.NaN;

    /* renamed from: Q, reason: collision with root package name */
    private float f6844Q = 0.0f;

    /* renamed from: R, reason: collision with root package name */
    private float f6845R = 0.0f;

    /* renamed from: S, reason: collision with root package name */
    private float f6846S = 0.0f;

    /* renamed from: U, reason: collision with root package name */
    private int f6848U = 0;

    /* renamed from: a0, reason: collision with root package name */
    private float f6854a0 = Float.NaN;

    /* renamed from: b0, reason: collision with root package name */
    private float f6855b0 = Float.NaN;

    /* renamed from: c0, reason: collision with root package name */
    private int f6856c0 = -1;

    /* renamed from: d0, reason: collision with root package name */
    LinkedHashMap<String, a> f6857d0 = new LinkedHashMap<>();

    /* renamed from: e0, reason: collision with root package name */
    int f6858e0 = 0;

    /* renamed from: f0, reason: collision with root package name */
    double[] f6859f0 = new double[18];

    /* renamed from: g0, reason: collision with root package name */
    double[] f6860g0 = new double[18];

    private boolean g(float f4, float f5) {
        if (!Float.isNaN(f4) && !Float.isNaN(f5)) {
            if (Math.abs(f4 - f5) <= 1.0E-6f) {
                return false;
            }
            return true;
        }
        if (Float.isNaN(f4) == Float.isNaN(f5)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0023. Please report as an issue. */
    public void b(HashMap<String, o> hashMap, int i4) {
        for (String str : hashMap.keySet()) {
            o oVar = hashMap.get(str);
            str.hashCode();
            char c4 = 65535;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case -1249320804:
                    if (str.equals("rotationZ")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c4 = 3;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c4 = 4;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c4 = 5;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c4 = 6;
                        break;
                    }
                    break;
                case -987906986:
                    if (str.equals("pivotX")) {
                        c4 = 7;
                        break;
                    }
                    break;
                case -987906985:
                    if (str.equals("pivotY")) {
                        c4 = '\b';
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c4 = '\t';
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c4 = '\n';
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c4 = 11;
                        break;
                    }
                    break;
                case 803192288:
                    if (str.equals("pathRotate")) {
                        c4 = '\f';
                        break;
                    }
                    break;
            }
            float f4 = 1.0f;
            float f5 = 0.0f;
            switch (c4) {
                case 0:
                    if (!Float.isNaN(this.f6838K)) {
                        f5 = this.f6838K;
                    }
                    oVar.g(i4, f5);
                    break;
                case 1:
                    if (!Float.isNaN(this.f6839L)) {
                        f5 = this.f6839L;
                    }
                    oVar.g(i4, f5);
                    break;
                case 2:
                    if (!Float.isNaN(this.f6837J)) {
                        f5 = this.f6837J;
                    }
                    oVar.g(i4, f5);
                    break;
                case 3:
                    if (!Float.isNaN(this.f6844Q)) {
                        f5 = this.f6844Q;
                    }
                    oVar.g(i4, f5);
                    break;
                case 4:
                    if (!Float.isNaN(this.f6845R)) {
                        f5 = this.f6845R;
                    }
                    oVar.g(i4, f5);
                    break;
                case 5:
                    if (!Float.isNaN(this.f6846S)) {
                        f5 = this.f6846S;
                    }
                    oVar.g(i4, f5);
                    break;
                case 6:
                    if (!Float.isNaN(this.f6855b0)) {
                        f5 = this.f6855b0;
                    }
                    oVar.g(i4, f5);
                    break;
                case 7:
                    if (!Float.isNaN(this.f6842O)) {
                        f5 = this.f6842O;
                    }
                    oVar.g(i4, f5);
                    break;
                case '\b':
                    if (!Float.isNaN(this.f6843P)) {
                        f5 = this.f6843P;
                    }
                    oVar.g(i4, f5);
                    break;
                case '\t':
                    if (!Float.isNaN(this.f6840M)) {
                        f4 = this.f6840M;
                    }
                    oVar.g(i4, f4);
                    break;
                case '\n':
                    if (!Float.isNaN(this.f6841N)) {
                        f4 = this.f6841N;
                    }
                    oVar.g(i4, f4);
                    break;
                case 11:
                    if (!Float.isNaN(this.f6832E)) {
                        f4 = this.f6832E;
                    }
                    oVar.g(i4, f4);
                    break;
                case '\f':
                    if (!Float.isNaN(this.f6854a0)) {
                        f5 = this.f6854a0;
                    }
                    oVar.g(i4, f5);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.f6857d0.containsKey(str2)) {
                            a aVar = this.f6857d0.get(str2);
                            if (oVar instanceof o.c) {
                                ((o.c) oVar).k(i4, aVar);
                                break;
                            } else {
                                w.f("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i4 + ", value" + aVar.n() + oVar);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        w.f("MotionPaths", "UNKNOWN spline " + str);
                        break;
                    }
            }
        }
    }

    public void e(e eVar) {
        float g4;
        this.f6834G = eVar.B();
        if (eVar.B() != 4) {
            g4 = 0.0f;
        } else {
            g4 = eVar.g();
        }
        this.f6832E = g4;
        this.f6835H = false;
        this.f6837J = eVar.t();
        this.f6838K = eVar.r();
        this.f6839L = eVar.s();
        this.f6840M = eVar.u();
        this.f6841N = eVar.v();
        this.f6842O = eVar.o();
        this.f6843P = eVar.p();
        this.f6844Q = eVar.x();
        this.f6845R = eVar.y();
        this.f6846S = eVar.z();
        for (String str : eVar.j()) {
            a i4 = eVar.i(str);
            if (i4 != null && i4.q()) {
                this.f6857d0.put(str, i4);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        return Float.compare(this.f6849V, cVar.f6849V);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(c cVar, HashSet<String> hashSet) {
        if (g(this.f6832E, cVar.f6832E)) {
            hashSet.add("alpha");
        }
        if (g(this.f6836I, cVar.f6836I)) {
            hashSet.add("translationZ");
        }
        int i4 = this.f6834G;
        int i5 = cVar.f6834G;
        if (i4 != i5 && this.f6833F == 0 && (i4 == 4 || i5 == 4)) {
            hashSet.add("alpha");
        }
        if (g(this.f6837J, cVar.f6837J)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f6854a0) || !Float.isNaN(cVar.f6854a0)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f6855b0) || !Float.isNaN(cVar.f6855b0)) {
            hashSet.add("progress");
        }
        if (g(this.f6838K, cVar.f6838K)) {
            hashSet.add("rotationX");
        }
        if (g(this.f6839L, cVar.f6839L)) {
            hashSet.add("rotationY");
        }
        if (g(this.f6842O, cVar.f6842O)) {
            hashSet.add("pivotX");
        }
        if (g(this.f6843P, cVar.f6843P)) {
            hashSet.add("pivotY");
        }
        if (g(this.f6840M, cVar.f6840M)) {
            hashSet.add("scaleX");
        }
        if (g(this.f6841N, cVar.f6841N)) {
            hashSet.add("scaleY");
        }
        if (g(this.f6844Q, cVar.f6844Q)) {
            hashSet.add("translationX");
        }
        if (g(this.f6845R, cVar.f6845R)) {
            hashSet.add("translationY");
        }
        if (g(this.f6846S, cVar.f6846S)) {
            hashSet.add("translationZ");
        }
        if (g(this.f6836I, cVar.f6836I)) {
            hashSet.add("elevation");
        }
    }

    void j(c cVar, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | g(this.f6849V, cVar.f6849V);
        zArr[1] = zArr[1] | g(this.f6850W, cVar.f6850W);
        zArr[2] = zArr[2] | g(this.f6851X, cVar.f6851X);
        zArr[3] = zArr[3] | g(this.f6852Y, cVar.f6852Y);
        zArr[4] = g(this.f6853Z, cVar.f6853Z) | zArr[4];
    }

    void k(double[] dArr, int[] iArr) {
        int i4 = 0;
        float[] fArr = {this.f6849V, this.f6850W, this.f6851X, this.f6852Y, this.f6853Z, this.f6832E, this.f6836I, this.f6837J, this.f6838K, this.f6839L, this.f6840M, this.f6841N, this.f6842O, this.f6843P, this.f6844Q, this.f6845R, this.f6846S, this.f6854a0};
        for (int i5 : iArr) {
            if (i5 < 18) {
                dArr[i4] = fArr[r5];
                i4++;
            }
        }
    }

    int l(String str, double[] dArr, int i4) {
        a aVar = this.f6857d0.get(str);
        if (aVar.r() == 1) {
            dArr[i4] = aVar.n();
            return 1;
        }
        int r4 = aVar.r();
        aVar.o(new float[r4]);
        int i5 = 0;
        while (i5 < r4) {
            dArr[i4] = r1[i5];
            i5++;
            i4++;
        }
        return r4;
    }

    int m(String str) {
        return this.f6857d0.get(str).r();
    }

    boolean n(String str) {
        return this.f6857d0.containsKey(str);
    }

    void o(float f4, float f5, float f6, float f7) {
        this.f6850W = f4;
        this.f6851X = f5;
        this.f6852Y = f6;
        this.f6853Z = f7;
    }

    public void p(e eVar) {
        o(eVar.E(), eVar.F(), eVar.D(), eVar.k());
        e(eVar);
    }

    public void q(m mVar, e eVar, int i4, float f4) {
        o(mVar.f7259b, mVar.f7261d, mVar.b(), mVar.a());
        e(eVar);
        this.f6842O = Float.NaN;
        this.f6843P = Float.NaN;
        if (i4 != 1) {
            if (i4 == 2) {
                this.f6837J = f4 + 90.0f;
                return;
            }
            return;
        }
        this.f6837J = f4 - 90.0f;
    }
}
