package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.o;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public class g extends b {

    /* renamed from: R, reason: collision with root package name */
    private static final String f7064R = "KeyTrigger";

    /* renamed from: S, reason: collision with root package name */
    public static final String f7065S = "viewTransitionOnCross";

    /* renamed from: T, reason: collision with root package name */
    public static final String f7066T = "viewTransitionOnPositiveCross";

    /* renamed from: U, reason: collision with root package name */
    public static final String f7067U = "viewTransitionOnNegativeCross";

    /* renamed from: V, reason: collision with root package name */
    public static final String f7068V = "postLayout";

    /* renamed from: W, reason: collision with root package name */
    public static final String f7069W = "triggerSlack";

    /* renamed from: X, reason: collision with root package name */
    public static final String f7070X = "triggerCollisionView";

    /* renamed from: Y, reason: collision with root package name */
    public static final String f7071Y = "triggerCollisionId";

    /* renamed from: Z, reason: collision with root package name */
    public static final String f7072Z = "triggerID";

    /* renamed from: a0, reason: collision with root package name */
    public static final String f7073a0 = "positiveCross";

    /* renamed from: b0, reason: collision with root package name */
    public static final String f7074b0 = "negativeCross";

    /* renamed from: c0, reason: collision with root package name */
    public static final String f7075c0 = "triggerReceiver";

    /* renamed from: d0, reason: collision with root package name */
    public static final String f7076d0 = "CROSS";

    /* renamed from: e0, reason: collision with root package name */
    public static final int f7077e0 = 301;

    /* renamed from: f0, reason: collision with root package name */
    public static final int f7078f0 = 302;

    /* renamed from: g0, reason: collision with root package name */
    public static final int f7079g0 = 303;

    /* renamed from: h0, reason: collision with root package name */
    public static final int f7080h0 = 304;

    /* renamed from: i0, reason: collision with root package name */
    public static final int f7081i0 = 305;

    /* renamed from: j0, reason: collision with root package name */
    public static final int f7082j0 = 306;

    /* renamed from: k0, reason: collision with root package name */
    public static final int f7083k0 = 307;

    /* renamed from: l0, reason: collision with root package name */
    public static final int f7084l0 = 308;

    /* renamed from: m0, reason: collision with root package name */
    public static final int f7085m0 = 309;

    /* renamed from: n0, reason: collision with root package name */
    public static final int f7086n0 = 310;

    /* renamed from: o0, reason: collision with root package name */
    public static final int f7087o0 = 311;

    /* renamed from: p0, reason: collision with root package name */
    public static final int f7088p0 = 312;

    /* renamed from: q0, reason: collision with root package name */
    public static final int f7089q0 = 5;

    /* renamed from: A, reason: collision with root package name */
    private int f7090A;

    /* renamed from: B, reason: collision with root package name */
    private String f7091B;

    /* renamed from: C, reason: collision with root package name */
    private String f7092C;

    /* renamed from: D, reason: collision with root package name */
    private int f7093D;

    /* renamed from: E, reason: collision with root package name */
    private int f7094E;

    /* renamed from: F, reason: collision with root package name */
    float f7095F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f7096G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f7097H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f7098I;

    /* renamed from: J, reason: collision with root package name */
    private float f7099J;

    /* renamed from: K, reason: collision with root package name */
    private float f7100K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f7101L;

    /* renamed from: M, reason: collision with root package name */
    int f7102M;

    /* renamed from: N, reason: collision with root package name */
    int f7103N;

    /* renamed from: O, reason: collision with root package name */
    int f7104O;

    /* renamed from: P, reason: collision with root package name */
    androidx.constraintlayout.core.motion.utils.e f7105P;

    /* renamed from: Q, reason: collision with root package name */
    androidx.constraintlayout.core.motion.utils.e f7106Q;

    /* renamed from: y, reason: collision with root package name */
    private int f7107y = -1;

    /* renamed from: z, reason: collision with root package name */
    private String f7108z = null;

    public g() {
        int i4 = b.f6953m;
        this.f7090A = i4;
        this.f7091B = null;
        this.f7092C = null;
        this.f7093D = i4;
        this.f7094E = i4;
        this.f7095F = 0.1f;
        this.f7096G = true;
        this.f7097H = true;
        this.f7098I = true;
        this.f7099J = Float.NaN;
        this.f7101L = false;
        this.f7102M = i4;
        this.f7103N = i4;
        this.f7104O = i4;
        this.f7105P = new androidx.constraintlayout.core.motion.utils.e();
        this.f7106Q = new androidx.constraintlayout.core.motion.utils.e();
        this.f6968k = 5;
        this.f6969l = new HashMap<>();
    }

    private void x(String str, androidx.constraintlayout.core.motion.e eVar) {
        boolean z3;
        if (str.length() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f6969l.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z3 || lowerCase.matches(str)) {
                androidx.constraintlayout.core.motion.a aVar = this.f6969l.get(str2);
                if (aVar != null) {
                    aVar.a(eVar);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.constraintlayout.core.motion.utils.v
    public int a(String str) {
        char c4;
        str.hashCode();
        switch (str.hashCode()) {
            case -1594793529:
                if (str.equals("positiveCross")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case -966421266:
                if (str.equals("viewTransitionOnPositiveCross")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case -786670827:
                if (str.equals("triggerCollisionId")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case -648752941:
                if (str.equals("triggerID")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case -638126837:
                if (str.equals("negativeCross")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case -76025313:
                if (str.equals("triggerCollisionView")) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            case -9754574:
                if (str.equals("viewTransitionOnNegativeCross")) {
                    c4 = 6;
                    break;
                }
                c4 = 65535;
                break;
            case 364489912:
                if (str.equals("triggerSlack")) {
                    c4 = 7;
                    break;
                }
                c4 = 65535;
                break;
            case 1301930599:
                if (str.equals("viewTransitionOnCross")) {
                    c4 = '\b';
                    break;
                }
                c4 = 65535;
                break;
            case 1401391082:
                if (str.equals("postLayout")) {
                    c4 = '\t';
                    break;
                }
                c4 = 65535;
                break;
            case 1535404999:
                if (str.equals("triggerReceiver")) {
                    c4 = '\n';
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
                return 309;
            case 1:
                return 302;
            case 2:
                return 307;
            case 3:
                return 308;
            case 4:
                return 310;
            case 5:
                return 306;
            case 6:
                return 303;
            case 7:
                return 305;
            case '\b':
                return 301;
            case '\t':
                return 304;
            case '\n':
                return 311;
            default:
                return -1;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean b(int i4, int i5) {
        if (i4 != 307) {
            if (i4 != 308) {
                if (i4 != 311) {
                    switch (i4) {
                        case 301:
                            this.f7104O = i5;
                            return true;
                        case 302:
                            this.f7103N = i5;
                            return true;
                        case 303:
                            this.f7102M = i5;
                            return true;
                        default:
                            return super.b(i4, i5);
                    }
                }
                this.f7090A = i5;
                return true;
            }
            this.f7093D = u(Integer.valueOf(i5));
            return true;
        }
        this.f7094E = i5;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean c(int i4, float f4) {
        if (i4 != 305) {
            return super.c(i4, f4);
        }
        this.f7095F = f4;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean d(int i4, String str) {
        if (i4 != 309) {
            if (i4 != 310) {
                if (i4 != 312) {
                    return super.d(i4, str);
                }
                this.f7108z = str;
                return true;
            }
            this.f7091B = str;
            return true;
        }
        this.f7092C = str;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean e(int i4, boolean z3) {
        if (i4 != 304) {
            return super.e(i4, z3);
        }
        this.f7101L = z3;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void f(HashMap<String, o> hashMap) {
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    /* renamed from: g */
    public b clone() {
        return new g().h(this);
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void i(HashSet<String> hashSet) {
    }

    public void v(float f4, androidx.constraintlayout.core.motion.e eVar) {
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public g h(b bVar) {
        super.h(bVar);
        g gVar = (g) bVar;
        this.f7107y = gVar.f7107y;
        this.f7108z = gVar.f7108z;
        this.f7090A = gVar.f7090A;
        this.f7091B = gVar.f7091B;
        this.f7092C = gVar.f7092C;
        this.f7093D = gVar.f7093D;
        this.f7094E = gVar.f7094E;
        this.f7095F = gVar.f7095F;
        this.f7096G = gVar.f7096G;
        this.f7097H = gVar.f7097H;
        this.f7098I = gVar.f7098I;
        this.f7099J = gVar.f7099J;
        this.f7100K = gVar.f7100K;
        this.f7101L = gVar.f7101L;
        this.f7105P = gVar.f7105P;
        this.f7106Q = gVar.f7106Q;
        return this;
    }
}
