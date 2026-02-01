package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.h;
import androidx.constraintlayout.core.motion.utils.o;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.core.motion.utils.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d extends b {

    /* renamed from: R, reason: collision with root package name */
    private static final String f6991R = "KeyCycle";

    /* renamed from: S, reason: collision with root package name */
    static final String f6992S = "KeyCycle";

    /* renamed from: T, reason: collision with root package name */
    public static final String f6993T = "wavePeriod";

    /* renamed from: U, reason: collision with root package name */
    public static final String f6994U = "waveOffset";

    /* renamed from: V, reason: collision with root package name */
    public static final String f6995V = "wavePhase";

    /* renamed from: W, reason: collision with root package name */
    public static final String f6996W = "waveShape";

    /* renamed from: X, reason: collision with root package name */
    public static final int f6997X = 0;

    /* renamed from: Y, reason: collision with root package name */
    public static final int f6998Y = 1;

    /* renamed from: Z, reason: collision with root package name */
    public static final int f6999Z = 2;

    /* renamed from: a0, reason: collision with root package name */
    public static final int f7000a0 = 3;

    /* renamed from: b0, reason: collision with root package name */
    public static final int f7001b0 = 4;

    /* renamed from: c0, reason: collision with root package name */
    public static final int f7002c0 = 5;

    /* renamed from: d0, reason: collision with root package name */
    public static final int f7003d0 = 6;

    /* renamed from: e0, reason: collision with root package name */
    public static final int f7004e0 = 4;

    /* renamed from: y, reason: collision with root package name */
    private String f7022y = null;

    /* renamed from: z, reason: collision with root package name */
    private int f7023z = 0;

    /* renamed from: A, reason: collision with root package name */
    private int f7005A = -1;

    /* renamed from: B, reason: collision with root package name */
    private String f7006B = null;

    /* renamed from: C, reason: collision with root package name */
    private float f7007C = Float.NaN;

    /* renamed from: D, reason: collision with root package name */
    private float f7008D = 0.0f;

    /* renamed from: E, reason: collision with root package name */
    private float f7009E = 0.0f;

    /* renamed from: F, reason: collision with root package name */
    private float f7010F = Float.NaN;

    /* renamed from: G, reason: collision with root package name */
    private float f7011G = Float.NaN;

    /* renamed from: H, reason: collision with root package name */
    private float f7012H = Float.NaN;

    /* renamed from: I, reason: collision with root package name */
    private float f7013I = Float.NaN;

    /* renamed from: J, reason: collision with root package name */
    private float f7014J = Float.NaN;

    /* renamed from: K, reason: collision with root package name */
    private float f7015K = Float.NaN;

    /* renamed from: L, reason: collision with root package name */
    private float f7016L = Float.NaN;

    /* renamed from: M, reason: collision with root package name */
    private float f7017M = Float.NaN;

    /* renamed from: N, reason: collision with root package name */
    private float f7018N = Float.NaN;

    /* renamed from: O, reason: collision with root package name */
    private float f7019O = Float.NaN;

    /* renamed from: P, reason: collision with root package name */
    private float f7020P = Float.NaN;

    /* renamed from: Q, reason: collision with root package name */
    private float f7021Q = Float.NaN;

    public d() {
        this.f6968k = 4;
        this.f6969l = new HashMap<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.constraintlayout.core.motion.utils.v
    public int a(String str) {
        char c4;
        str.hashCode();
        switch (str.hashCode()) {
            case -1581616630:
                if (str.equals(v.c.f7430P)) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case -1310311125:
                if (str.equals("easing")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c4 = 6;
                    break;
                }
                c4 = 65535;
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c4 = 7;
                    break;
                }
                c4 = 65535;
                break;
            case -1019779949:
                if (str.equals(v.c.f7432R)) {
                    c4 = '\b';
                    break;
                }
                c4 = 65535;
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c4 = '\t';
                    break;
                }
                c4 = 65535;
                break;
            case -991726143:
                if (str.equals(v.c.f7431Q)) {
                    c4 = '\n';
                    break;
                }
                c4 = 65535;
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c4 = 11;
                    break;
                }
                c4 = 65535;
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c4 = '\f';
                    break;
                }
                c4 = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c4 = '\r';
                    break;
                }
                c4 = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c4 = 14;
                    break;
                }
                c4 = 65535;
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c4 = 15;
                    break;
                }
                c4 = 65535;
                break;
            case 106629499:
                if (str.equals(v.c.f7433S)) {
                    c4 = 16;
                    break;
                }
                c4 = 65535;
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    c4 = 17;
                    break;
                }
                c4 = 65535;
                break;
            case 803192288:
                if (str.equals("pathRotate")) {
                    c4 = 18;
                    break;
                }
                c4 = 65535;
                break;
            case 1532805160:
                if (str.equals("waveShape")) {
                    c4 = 19;
                    break;
                }
                c4 = 65535;
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c4 = 20;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        switch (c4) {
            case 0:
                return v.c.f7454t;
            case 1:
                return v.c.f7452r;
            case 2:
                return 308;
            case 3:
                return 309;
            case 4:
                return 310;
            case 5:
                return 304;
            case 6:
                return 305;
            case 7:
                return 306;
            case '\b':
                return v.c.f7456v;
            case '\t':
                return 315;
            case '\n':
                return v.c.f7455u;
            case 11:
                return 313;
            case '\f':
                return 314;
            case '\r':
                return 311;
            case 14:
                return 312;
            case 15:
                return v.c.f7438d;
            case 16:
                return v.c.f7457w;
            case 17:
                return v.c.f7436b;
            case 18:
                return v.c.f7451q;
            case 19:
                return v.c.f7453s;
            case 20:
                return v.c.f7437c;
            default:
                return -1;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean b(int i4, int i5) {
        if (i4 != 401) {
            if (i4 != 421) {
                if (c(i4, i5)) {
                    return true;
                }
                return super.b(i4, i5);
            }
            this.f7005A = i5;
            return true;
        }
        this.f7023z = i5;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean c(int i4, float f4) {
        if (i4 != 315) {
            if (i4 != 403) {
                if (i4 != 416) {
                    switch (i4) {
                        case 304:
                            this.f7019O = f4;
                            return true;
                        case 305:
                            this.f7020P = f4;
                            return true;
                        case 306:
                            this.f7021Q = f4;
                            return true;
                        case 307:
                            this.f7012H = f4;
                            return true;
                        case 308:
                            this.f7015K = f4;
                            return true;
                        case 309:
                            this.f7016L = f4;
                            return true;
                        case 310:
                            this.f7013I = f4;
                            return true;
                        case 311:
                            this.f7017M = f4;
                            return true;
                        case 312:
                            this.f7018N = f4;
                            return true;
                        default:
                            switch (i4) {
                                case v.c.f7455u /* 423 */:
                                    this.f7007C = f4;
                                    return true;
                                case v.c.f7456v /* 424 */:
                                    this.f7008D = f4;
                                    return true;
                                case v.c.f7457w /* 425 */:
                                    this.f7009E = f4;
                                    return true;
                                default:
                                    return super.c(i4, f4);
                            }
                    }
                }
                this.f7014J = f4;
                return true;
            }
            this.f7011G = f4;
            return true;
        }
        this.f7010F = f4;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean d(int i4, String str) {
        if (i4 != 420) {
            if (i4 != 422) {
                return super.d(i4, str);
            }
            this.f7006B = str;
            return true;
        }
        this.f7022y = str;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void f(HashMap<String, o> hashMap) {
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    /* renamed from: g */
    public b clone() {
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f7011G)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f7012H)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f7013I)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f7015K)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f7016L)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f7017M)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f7018N)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f7014J)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f7019O)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f7020P)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f7021Q)) {
            hashSet.add("translationZ");
        }
        if (this.f6969l.size() > 0) {
            Iterator<String> it = this.f6969l.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    public void v(HashMap<String, h> hashMap) {
        h hVar;
        h hVar2;
        for (String str : hashMap.keySet()) {
            if (str.startsWith("CUSTOM")) {
                androidx.constraintlayout.core.motion.a aVar = this.f6969l.get(str.substring(7));
                if (aVar != null && aVar.m() == 901 && (hVar = hashMap.get(str)) != null) {
                    hVar.g(this.f6965h, this.f7005A, this.f7006B, -1, this.f7007C, this.f7008D, this.f7009E, aVar.n(), aVar);
                }
            } else {
                float x3 = x(str);
                if (!Float.isNaN(x3) && (hVar2 = hashMap.get(str)) != null) {
                    hVar2.f(this.f6965h, this.f7005A, this.f7006B, -1, this.f7007C, this.f7008D, this.f7009E, x3);
                }
            }
        }
    }

    public void w() {
        System.out.println("MotionKeyCycle{mWaveShape=" + this.f7005A + ", mWavePeriod=" + this.f7007C + ", mWaveOffset=" + this.f7008D + ", mWavePhase=" + this.f7009E + ", mRotation=" + this.f7013I + "}");
    }

    public float x(String str) {
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
            case -1019779949:
                if (str.equals(v.c.f7432R)) {
                    c4 = 6;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c4 = 7;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c4 = '\b';
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c4 = '\t';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
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
            case 106629499:
                if (str.equals(v.c.f7433S)) {
                    c4 = '\f';
                    break;
                }
                break;
            case 803192288:
                if (str.equals("pathRotate")) {
                    c4 = '\r';
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                return this.f7015K;
            case 1:
                return this.f7016L;
            case 2:
                return this.f7013I;
            case 3:
                return this.f7019O;
            case 4:
                return this.f7020P;
            case 5:
                return this.f7021Q;
            case 6:
                return this.f7008D;
            case 7:
                return this.f7010F;
            case '\b':
                return this.f7017M;
            case '\t':
                return this.f7018N;
            case '\n':
                return this.f7012H;
            case 11:
                return this.f7011G;
            case '\f':
                return this.f7009E;
            case '\r':
                return this.f7014J;
            default:
                return Float.NaN;
        }
    }

    public void y() {
        HashSet<String> hashSet = new HashSet<>();
        i(hashSet);
        w.c(" ------------- " + this.f6965h + " -------------");
        w.c("MotionKeyCycle{Shape=" + this.f7005A + ", Period=" + this.f7007C + ", Offset=" + this.f7008D + ", Phase=" + this.f7009E + "}");
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i4 = 0; i4 < strArr.length; i4++) {
            v.a.a(strArr[i4]);
            String str = strArr[i4];
            w.c(str + ":" + x(str));
        }
    }
}
