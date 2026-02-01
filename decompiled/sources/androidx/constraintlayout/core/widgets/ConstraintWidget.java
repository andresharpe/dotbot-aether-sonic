package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.motion.utils.w;
import androidx.constraintlayout.core.state.s;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.analyzer.n;
import androidx.constraintlayout.core.widgets.analyzer.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ConstraintWidget {

    /* renamed from: A1, reason: collision with root package name */
    public static float f7890A1 = 0.5f;

    /* renamed from: U0, reason: collision with root package name */
    private static final boolean f7891U0 = false;

    /* renamed from: V0, reason: collision with root package name */
    private static final boolean f7892V0 = false;

    /* renamed from: W0, reason: collision with root package name */
    protected static final int f7893W0 = 1;

    /* renamed from: X0, reason: collision with root package name */
    protected static final int f7894X0 = 2;

    /* renamed from: Y0, reason: collision with root package name */
    private static final boolean f7895Y0 = false;

    /* renamed from: Z0, reason: collision with root package name */
    public static final int f7896Z0 = 0;

    /* renamed from: a1, reason: collision with root package name */
    public static final int f7897a1 = 1;

    /* renamed from: b1, reason: collision with root package name */
    public static final int f7898b1 = 2;

    /* renamed from: c1, reason: collision with root package name */
    public static final int f7899c1 = 3;

    /* renamed from: d1, reason: collision with root package name */
    public static final int f7900d1 = 4;

    /* renamed from: e1, reason: collision with root package name */
    public static final int f7901e1 = -1;

    /* renamed from: f1, reason: collision with root package name */
    public static final int f7902f1 = 0;

    /* renamed from: g1, reason: collision with root package name */
    public static final int f7903g1 = 1;

    /* renamed from: h1, reason: collision with root package name */
    public static final int f7904h1 = 2;

    /* renamed from: i1, reason: collision with root package name */
    public static final int f7905i1 = 0;

    /* renamed from: j1, reason: collision with root package name */
    public static final int f7906j1 = 4;

    /* renamed from: k1, reason: collision with root package name */
    public static final int f7907k1 = 8;

    /* renamed from: l1, reason: collision with root package name */
    public static final int f7908l1 = 0;

    /* renamed from: m1, reason: collision with root package name */
    public static final int f7909m1 = 1;

    /* renamed from: n1, reason: collision with root package name */
    public static final int f7910n1 = 2;

    /* renamed from: o1, reason: collision with root package name */
    public static final int f7911o1 = 0;

    /* renamed from: p1, reason: collision with root package name */
    public static final int f7912p1 = 1;

    /* renamed from: q1, reason: collision with root package name */
    public static final int f7913q1 = 2;

    /* renamed from: r1, reason: collision with root package name */
    public static final int f7914r1 = 3;

    /* renamed from: s1, reason: collision with root package name */
    private static final int f7915s1 = -2;

    /* renamed from: t1, reason: collision with root package name */
    public static final int f7916t1 = 0;

    /* renamed from: u1, reason: collision with root package name */
    public static final int f7917u1 = 1;

    /* renamed from: v1, reason: collision with root package name */
    public static final int f7918v1 = 2;

    /* renamed from: w1, reason: collision with root package name */
    public static final int f7919w1 = 3;

    /* renamed from: x1, reason: collision with root package name */
    public static final int f7920x1 = 4;

    /* renamed from: y1, reason: collision with root package name */
    static final int f7921y1 = 0;

    /* renamed from: z1, reason: collision with root package name */
    static final int f7922z1 = 1;

    /* renamed from: A, reason: collision with root package name */
    public int f7923A;

    /* renamed from: A0, reason: collision with root package name */
    int f7924A0;

    /* renamed from: B, reason: collision with root package name */
    public float f7925B;

    /* renamed from: B0, reason: collision with root package name */
    int f7926B0;

    /* renamed from: C, reason: collision with root package name */
    public int f7927C;

    /* renamed from: C0, reason: collision with root package name */
    boolean f7928C0;

    /* renamed from: D, reason: collision with root package name */
    public int f7929D;

    /* renamed from: D0, reason: collision with root package name */
    boolean f7930D0;

    /* renamed from: E, reason: collision with root package name */
    public float f7931E;

    /* renamed from: E0, reason: collision with root package name */
    boolean f7932E0;

    /* renamed from: F, reason: collision with root package name */
    public boolean f7933F;

    /* renamed from: F0, reason: collision with root package name */
    boolean f7934F0;

    /* renamed from: G, reason: collision with root package name */
    public boolean f7935G;

    /* renamed from: G0, reason: collision with root package name */
    boolean f7936G0;

    /* renamed from: H, reason: collision with root package name */
    int f7937H;

    /* renamed from: H0, reason: collision with root package name */
    boolean f7938H0;

    /* renamed from: I, reason: collision with root package name */
    float f7939I;

    /* renamed from: I0, reason: collision with root package name */
    boolean f7940I0;

    /* renamed from: J, reason: collision with root package name */
    private int[] f7941J;

    /* renamed from: J0, reason: collision with root package name */
    int f7942J0;

    /* renamed from: K, reason: collision with root package name */
    public float f7943K;

    /* renamed from: K0, reason: collision with root package name */
    int f7944K0;

    /* renamed from: L, reason: collision with root package name */
    private boolean f7945L;

    /* renamed from: L0, reason: collision with root package name */
    boolean f7946L0;

    /* renamed from: M, reason: collision with root package name */
    private boolean f7947M;

    /* renamed from: M0, reason: collision with root package name */
    boolean f7948M0;

    /* renamed from: N, reason: collision with root package name */
    private boolean f7949N;

    /* renamed from: N0, reason: collision with root package name */
    public float[] f7950N0;

    /* renamed from: O, reason: collision with root package name */
    private int f7951O;

    /* renamed from: O0, reason: collision with root package name */
    protected ConstraintWidget[] f7952O0;

    /* renamed from: P, reason: collision with root package name */
    private int f7953P;

    /* renamed from: P0, reason: collision with root package name */
    protected ConstraintWidget[] f7954P0;

    /* renamed from: Q, reason: collision with root package name */
    public ConstraintAnchor f7955Q;

    /* renamed from: Q0, reason: collision with root package name */
    ConstraintWidget f7956Q0;

    /* renamed from: R, reason: collision with root package name */
    public ConstraintAnchor f7957R;

    /* renamed from: R0, reason: collision with root package name */
    ConstraintWidget f7958R0;

    /* renamed from: S, reason: collision with root package name */
    public ConstraintAnchor f7959S;

    /* renamed from: S0, reason: collision with root package name */
    public int f7960S0;

    /* renamed from: T, reason: collision with root package name */
    public ConstraintAnchor f7961T;

    /* renamed from: T0, reason: collision with root package name */
    public int f7962T0;

    /* renamed from: U, reason: collision with root package name */
    public ConstraintAnchor f7963U;

    /* renamed from: V, reason: collision with root package name */
    ConstraintAnchor f7964V;

    /* renamed from: W, reason: collision with root package name */
    ConstraintAnchor f7965W;

    /* renamed from: X, reason: collision with root package name */
    public ConstraintAnchor f7966X;

    /* renamed from: Y, reason: collision with root package name */
    public ConstraintAnchor[] f7967Y;

    /* renamed from: Z, reason: collision with root package name */
    protected ArrayList<ConstraintAnchor> f7968Z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f7969a;

    /* renamed from: a0, reason: collision with root package name */
    private boolean[] f7970a0;

    /* renamed from: b, reason: collision with root package name */
    public p[] f7971b;

    /* renamed from: b0, reason: collision with root package name */
    public DimensionBehaviour[] f7972b0;

    /* renamed from: c, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.c f7973c;

    /* renamed from: c0, reason: collision with root package name */
    public ConstraintWidget f7974c0;

    /* renamed from: d, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.c f7975d;

    /* renamed from: d0, reason: collision with root package name */
    int f7976d0;

    /* renamed from: e, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.l f7977e;

    /* renamed from: e0, reason: collision with root package name */
    int f7978e0;

    /* renamed from: f, reason: collision with root package name */
    public n f7979f;

    /* renamed from: f0, reason: collision with root package name */
    public float f7980f0;

    /* renamed from: g, reason: collision with root package name */
    public boolean[] f7981g;

    /* renamed from: g0, reason: collision with root package name */
    protected int f7982g0;

    /* renamed from: h, reason: collision with root package name */
    boolean f7983h;

    /* renamed from: h0, reason: collision with root package name */
    protected int f7984h0;

    /* renamed from: i, reason: collision with root package name */
    private boolean f7985i;

    /* renamed from: i0, reason: collision with root package name */
    protected int f7986i0;

    /* renamed from: j, reason: collision with root package name */
    private boolean f7987j;

    /* renamed from: j0, reason: collision with root package name */
    int f7988j0;

    /* renamed from: k, reason: collision with root package name */
    private boolean f7989k;

    /* renamed from: k0, reason: collision with root package name */
    int f7990k0;

    /* renamed from: l, reason: collision with root package name */
    private int f7991l;

    /* renamed from: l0, reason: collision with root package name */
    protected int f7992l0;

    /* renamed from: m, reason: collision with root package name */
    private int f7993m;

    /* renamed from: m0, reason: collision with root package name */
    protected int f7994m0;

    /* renamed from: n, reason: collision with root package name */
    public s f7995n;

    /* renamed from: n0, reason: collision with root package name */
    int f7996n0;

    /* renamed from: o, reason: collision with root package name */
    public String f7997o;

    /* renamed from: o0, reason: collision with root package name */
    protected int f7998o0;

    /* renamed from: p, reason: collision with root package name */
    private boolean f7999p;

    /* renamed from: p0, reason: collision with root package name */
    protected int f8000p0;

    /* renamed from: q, reason: collision with root package name */
    private boolean f8001q;

    /* renamed from: q0, reason: collision with root package name */
    float f8002q0;

    /* renamed from: r, reason: collision with root package name */
    private boolean f8003r;

    /* renamed from: r0, reason: collision with root package name */
    float f8004r0;

    /* renamed from: s, reason: collision with root package name */
    private boolean f8005s;

    /* renamed from: s0, reason: collision with root package name */
    private Object f8006s0;

    /* renamed from: t, reason: collision with root package name */
    public int f8007t;

    /* renamed from: t0, reason: collision with root package name */
    private int f8008t0;

    /* renamed from: u, reason: collision with root package name */
    public int f8009u;

    /* renamed from: u0, reason: collision with root package name */
    private int f8010u0;

    /* renamed from: v, reason: collision with root package name */
    private int f8011v;

    /* renamed from: v0, reason: collision with root package name */
    private boolean f8012v0;

    /* renamed from: w, reason: collision with root package name */
    public int f8013w;

    /* renamed from: w0, reason: collision with root package name */
    private String f8014w0;

    /* renamed from: x, reason: collision with root package name */
    public int f8015x;

    /* renamed from: x0, reason: collision with root package name */
    private String f8016x0;

    /* renamed from: y, reason: collision with root package name */
    public int[] f8017y;

    /* renamed from: y0, reason: collision with root package name */
    int f8018y0;

    /* renamed from: z, reason: collision with root package name */
    public int f8019z;

    /* renamed from: z0, reason: collision with root package name */
    int f8020z0;

    /* loaded from: classes.dex */
    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8021a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f8022b;

        static {
            int[] iArr = new int[DimensionBehaviour.values().length];
            f8022b = iArr;
            try {
                iArr[DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8022b[DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8022b[DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8022b[DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ConstraintAnchor.Type.values().length];
            f8021a = iArr2;
            try {
                iArr2[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8021a[ConstraintAnchor.Type.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8021a[ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8021a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8021a[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8021a[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8021a[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f8021a[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f8021a[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public ConstraintWidget() {
        this.f7969a = false;
        this.f7971b = new p[2];
        this.f7977e = null;
        this.f7979f = null;
        this.f7981g = new boolean[]{true, true};
        this.f7983h = false;
        this.f7985i = true;
        this.f7987j = false;
        this.f7989k = true;
        this.f7991l = -1;
        this.f7993m = -1;
        this.f7995n = new s(this);
        this.f7999p = false;
        this.f8001q = false;
        this.f8003r = false;
        this.f8005s = false;
        this.f8007t = -1;
        this.f8009u = -1;
        this.f8011v = 0;
        this.f8013w = 0;
        this.f8015x = 0;
        this.f8017y = new int[2];
        this.f8019z = 0;
        this.f7923A = 0;
        this.f7925B = 1.0f;
        this.f7927C = 0;
        this.f7929D = 0;
        this.f7931E = 1.0f;
        this.f7937H = -1;
        this.f7939I = 1.0f;
        this.f7941J = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f7943K = Float.NaN;
        this.f7945L = false;
        this.f7949N = false;
        this.f7951O = 0;
        this.f7953P = 0;
        this.f7955Q = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.f7957R = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.f7959S = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.f7961T = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.f7963U = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.f7964V = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.f7965W = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.f7966X = constraintAnchor;
        this.f7967Y = new ConstraintAnchor[]{this.f7955Q, this.f7959S, this.f7957R, this.f7961T, this.f7963U, constraintAnchor};
        this.f7968Z = new ArrayList<>();
        this.f7970a0 = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.f7972b0 = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.f7974c0 = null;
        this.f7976d0 = 0;
        this.f7978e0 = 0;
        this.f7980f0 = 0.0f;
        this.f7982g0 = -1;
        this.f7984h0 = 0;
        this.f7986i0 = 0;
        this.f7988j0 = 0;
        this.f7990k0 = 0;
        this.f7992l0 = 0;
        this.f7994m0 = 0;
        this.f7996n0 = 0;
        float f4 = f7890A1;
        this.f8002q0 = f4;
        this.f8004r0 = f4;
        this.f8008t0 = 0;
        this.f8010u0 = 0;
        this.f8012v0 = false;
        this.f8014w0 = null;
        this.f8016x0 = null;
        this.f7940I0 = false;
        this.f7942J0 = 0;
        this.f7944K0 = 0;
        this.f7950N0 = new float[]{-1.0f, -1.0f};
        this.f7952O0 = new ConstraintWidget[]{null, null};
        this.f7954P0 = new ConstraintWidget[]{null, null};
        this.f7956Q0 = null;
        this.f7958R0 = null;
        this.f7960S0 = -1;
        this.f7962T0 = -1;
        d();
    }

    private void Z0(StringBuilder sb, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.f7885f == null) {
            return;
        }
        sb.append(str);
        sb.append(" : [ '");
        sb.append(constraintAnchor.f7885f);
        sb.append("',");
        sb.append(constraintAnchor.f7886g);
        sb.append(",");
        sb.append(constraintAnchor.f7887h);
        sb.append(",");
        sb.append(" ] ,\n");
    }

    private void a1(StringBuilder sb, String str, float f4, float f5) {
        if (f4 == f5) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f4);
        sb.append(",\n");
    }

    private void b1(StringBuilder sb, String str, int i4, int i5) {
        if (i4 == i5) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i4);
        sb.append(",\n");
    }

    private void c0(StringBuilder sb, String str, int i4, int i5, int i6, int i7, int i8, int i9, float f4, float f5) {
        sb.append(str);
        sb.append(" :  {\n");
        b1(sb, "      size", i4, 0);
        b1(sb, "      min", i5, 0);
        b1(sb, "      max", i6, Integer.MAX_VALUE);
        b1(sb, "      matchMin", i8, 0);
        b1(sb, "      matchDef", i9, 0);
        a1(sb, "      matchPercent", f4, 1.0f);
        sb.append("    },\n");
    }

    private void c1(StringBuilder sb, ConstraintAnchor constraintAnchor, float f4) {
        if (constraintAnchor.f7885f != null && !Float.isNaN(f4)) {
            sb.append("circle : [ '");
            sb.append(constraintAnchor.f7885f);
            sb.append("',");
            sb.append(constraintAnchor.f7886g);
            sb.append(",");
            sb.append(f4);
            sb.append(",");
            sb.append(" ] ,\n");
        }
    }

    private void d() {
        this.f7968Z.add(this.f7955Q);
        this.f7968Z.add(this.f7957R);
        this.f7968Z.add(this.f7959S);
        this.f7968Z.add(this.f7961T);
        this.f7968Z.add(this.f7964V);
        this.f7968Z.add(this.f7965W);
        this.f7968Z.add(this.f7966X);
        this.f7968Z.add(this.f7963U);
    }

    private void d0(StringBuilder sb, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.f7885f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(constraintAnchor.f7885f);
        sb.append("'");
        if (constraintAnchor.f7887h != Integer.MIN_VALUE || constraintAnchor.f7886g != 0) {
            sb.append(",");
            sb.append(constraintAnchor.f7886g);
            if (constraintAnchor.f7887h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(constraintAnchor.f7887h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    private void d1(StringBuilder sb, String str, float f4, int i4) {
        if (f4 == 0.0f) {
            return;
        }
        sb.append(str);
        sb.append(" :  [");
        sb.append(f4);
        sb.append(",");
        sb.append(i4);
        sb.append("");
        sb.append("],\n");
    }

    private void e1(StringBuilder sb, String str, int i4, int i5, int i6, int i7, int i8, int i9, float f4, float f5) {
        sb.append(str);
        sb.append(" :  {\n");
        b1(sb, "size", i4, Integer.MIN_VALUE);
        b1(sb, "min", i5, 0);
        b1(sb, "max", i6, Integer.MAX_VALUE);
        b1(sb, "matchMin", i8, 0);
        b1(sb, "matchDef", i9, 0);
        b1(sb, "matchPercent", i9, 1);
        a1(sb, "matchConstraintPercent", f4, 1.0f);
        a1(sb, "weight", f5, 1.0f);
        b1(sb, "override", i7, 1);
        sb.append("},\n");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0433 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x04cd A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i(androidx.constraintlayout.core.e r32, boolean r33, boolean r34, boolean r35, boolean r36, androidx.constraintlayout.core.SolverVariable r37, androidx.constraintlayout.core.SolverVariable r38, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r39, boolean r40, androidx.constraintlayout.core.widgets.ConstraintAnchor r41, androidx.constraintlayout.core.widgets.ConstraintAnchor r42, int r43, int r44, int r45, int r46, float r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52, int r53, int r54, int r55, int r56, float r57, boolean r58) {
        /*
            Method dump skipped, instructions count: 1350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.i(androidx.constraintlayout.core.e, boolean, boolean, boolean, boolean, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour, boolean, androidx.constraintlayout.core.widgets.ConstraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    private boolean x0(int i4) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        int i5 = i4 * 2;
        ConstraintAnchor[] constraintAnchorArr = this.f7967Y;
        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i5];
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f7885f;
        if (constraintAnchor4 != null && constraintAnchor4.f7885f != constraintAnchor3 && (constraintAnchor2 = (constraintAnchor = constraintAnchorArr[i5 + 1]).f7885f) != null && constraintAnchor2.f7885f == constraintAnchor) {
            return true;
        }
        return false;
    }

    public float A() {
        return this.f7980f0;
    }

    public boolean A0(int i4) {
        return this.f7970a0[i4];
    }

    public void A1(float f4) {
        this.f8002q0 = f4;
    }

    public int B() {
        return this.f7982g0;
    }

    public boolean B0() {
        ConstraintAnchor constraintAnchor = this.f7955Q;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f7885f;
        if (constraintAnchor2 == null || constraintAnchor2.f7885f != constraintAnchor) {
            ConstraintAnchor constraintAnchor3 = this.f7959S;
            ConstraintAnchor constraintAnchor4 = constraintAnchor3.f7885f;
            if (constraintAnchor4 != null && constraintAnchor4.f7885f == constraintAnchor3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void B1(int i4) {
        this.f7942J0 = i4;
    }

    public boolean C() {
        return this.f7945L;
    }

    public boolean C0() {
        return this.f7947M;
    }

    public void C1(int i4, int i5) {
        this.f7984h0 = i4;
        int i6 = i5 - i4;
        this.f7976d0 = i6;
        int i7 = this.f7998o0;
        if (i6 < i7) {
            this.f7976d0 = i7;
        }
    }

    public int D() {
        if (this.f8010u0 == 8) {
            return 0;
        }
        return this.f7978e0;
    }

    public boolean D0() {
        ConstraintAnchor constraintAnchor = this.f7957R;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f7885f;
        if (constraintAnchor2 == null || constraintAnchor2.f7885f != constraintAnchor) {
            ConstraintAnchor constraintAnchor3 = this.f7961T;
            ConstraintAnchor constraintAnchor4 = constraintAnchor3.f7885f;
            if (constraintAnchor4 != null && constraintAnchor4.f7885f == constraintAnchor3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void D1(DimensionBehaviour dimensionBehaviour) {
        this.f7972b0[0] = dimensionBehaviour;
    }

    public float E() {
        return this.f8002q0;
    }

    public boolean E0() {
        return this.f7949N;
    }

    public void E1(int i4, int i5, int i6, float f4) {
        this.f8013w = i4;
        this.f8019z = i5;
        if (i6 == Integer.MAX_VALUE) {
            i6 = 0;
        }
        this.f7923A = i6;
        this.f7925B = f4;
        if (f4 > 0.0f && f4 < 1.0f && i4 == 0) {
            this.f8013w = 2;
        }
    }

    public ConstraintWidget F() {
        ConstraintAnchor k4;
        ConstraintWidget i4;
        ConstraintAnchor k5;
        if (!B0()) {
            return null;
        }
        ConstraintWidget constraintWidget = this;
        ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            ConstraintAnchor r4 = constraintWidget.r(ConstraintAnchor.Type.LEFT);
            if (r4 == null) {
                k4 = null;
            } else {
                k4 = r4.k();
            }
            if (k4 == null) {
                i4 = null;
            } else {
                i4 = k4.i();
            }
            if (i4 == U()) {
                return constraintWidget;
            }
            if (i4 == null) {
                k5 = null;
            } else {
                k5 = i4.r(ConstraintAnchor.Type.RIGHT).k();
            }
            if (k5 != null && k5.i() != constraintWidget) {
                constraintWidget2 = constraintWidget;
            } else {
                constraintWidget = i4;
            }
        }
        return constraintWidget2;
    }

    public boolean F0() {
        if (this.f7985i && this.f8010u0 != 8) {
            return true;
        }
        return false;
    }

    public void F1(float f4) {
        this.f7950N0[0] = f4;
    }

    public int G() {
        return this.f7942J0;
    }

    public boolean G0() {
        if (!this.f7999p && (!this.f7955Q.o() || !this.f7959S.o())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void G1(int i4, boolean z3) {
        this.f7970a0[i4] = z3;
    }

    public DimensionBehaviour H() {
        return this.f7972b0[0];
    }

    public boolean H0() {
        if (!this.f8001q && (!this.f7957R.o() || !this.f7961T.o())) {
            return false;
        }
        return true;
    }

    public void H1(boolean z3) {
        this.f7947M = z3;
    }

    public int I() {
        int i4;
        ConstraintAnchor constraintAnchor = this.f7955Q;
        if (constraintAnchor != null) {
            i4 = constraintAnchor.f7886g;
        } else {
            i4 = 0;
        }
        ConstraintAnchor constraintAnchor2 = this.f7959S;
        if (constraintAnchor2 != null) {
            return i4 + constraintAnchor2.f7886g;
        }
        return i4;
    }

    public boolean I0() {
        if (this.f7974c0 == null) {
            return true;
        }
        return false;
    }

    public void I1(boolean z3) {
        this.f7949N = z3;
    }

    public int J() {
        return this.f7951O;
    }

    public boolean J0() {
        if (this.f8015x == 0 && this.f7980f0 == 0.0f && this.f7927C == 0 && this.f7929D == 0 && this.f7972b0[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            return true;
        }
        return false;
    }

    public void J1(int i4, int i5) {
        this.f7951O = i4;
        this.f7953P = i5;
        N1(false);
    }

    public int K() {
        return this.f7953P;
    }

    public boolean K0() {
        if (this.f8013w != 0 || this.f7980f0 != 0.0f || this.f8019z != 0 || this.f7923A != 0 || this.f7972b0[0] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return false;
        }
        return true;
    }

    public void K1(int i4, int i5) {
        if (i5 == 0) {
            c2(i4);
        } else if (i5 == 1) {
            y1(i4);
        }
    }

    public int L() {
        return o0();
    }

    public boolean L0() {
        return this.f8005s;
    }

    public void L1(int i4) {
        this.f7941J[1] = i4;
    }

    public int M(int i4) {
        if (i4 == 0) {
            return m0();
        }
        if (i4 == 1) {
            return D();
        }
        return 0;
    }

    public boolean M0() {
        return this.f7933F;
    }

    public void M1(int i4) {
        this.f7941J[0] = i4;
    }

    public int N() {
        return this.f7941J[1];
    }

    public void N0() {
        this.f8003r = true;
    }

    public void N1(boolean z3) {
        this.f7985i = z3;
    }

    public int O() {
        return this.f7941J[0];
    }

    public void O0() {
        this.f8005s = true;
    }

    public void O1(int i4) {
        if (i4 < 0) {
            this.f8000p0 = 0;
        } else {
            this.f8000p0 = i4;
        }
    }

    public int P() {
        return this.f8000p0;
    }

    public boolean P0(int i4) {
        char c4;
        if (i4 == 0) {
            c4 = 1;
        } else {
            c4 = 0;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.f7972b0;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[i4];
        DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[c4];
        DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviour != dimensionBehaviour3 || dimensionBehaviour2 != dimensionBehaviour3) {
            return false;
        }
        return true;
    }

    public void P1(int i4) {
        if (i4 < 0) {
            this.f7998o0 = 0;
        } else {
            this.f7998o0 = i4;
        }
    }

    public int Q() {
        return this.f7998o0;
    }

    public boolean Q0() {
        DimensionBehaviour[] dimensionBehaviourArr = this.f7972b0;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviour != dimensionBehaviour2 || dimensionBehaviourArr[1] != dimensionBehaviour2) {
            return false;
        }
        return true;
    }

    public void Q1(int i4, int i5) {
        this.f7992l0 = i4;
        this.f7994m0 = i5;
    }

    public ConstraintWidget R(int i4) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i4 == 0) {
            ConstraintAnchor constraintAnchor3 = this.f7959S;
            ConstraintAnchor constraintAnchor4 = constraintAnchor3.f7885f;
            if (constraintAnchor4 != null && constraintAnchor4.f7885f == constraintAnchor3) {
                return constraintAnchor4.f7883d;
            }
            return null;
        }
        if (i4 == 1 && (constraintAnchor2 = (constraintAnchor = this.f7961T).f7885f) != null && constraintAnchor2.f7885f == constraintAnchor) {
            return constraintAnchor2.f7883d;
        }
        return null;
    }

    public void R0() {
        this.f7955Q.x();
        this.f7957R.x();
        this.f7959S.x();
        this.f7961T.x();
        this.f7963U.x();
        this.f7964V.x();
        this.f7965W.x();
        this.f7966X.x();
        this.f7974c0 = null;
        this.f7943K = Float.NaN;
        this.f7976d0 = 0;
        this.f7978e0 = 0;
        this.f7980f0 = 0.0f;
        this.f7982g0 = -1;
        this.f7984h0 = 0;
        this.f7986i0 = 0;
        this.f7992l0 = 0;
        this.f7994m0 = 0;
        this.f7996n0 = 0;
        this.f7998o0 = 0;
        this.f8000p0 = 0;
        float f4 = f7890A1;
        this.f8002q0 = f4;
        this.f8004r0 = f4;
        DimensionBehaviour[] dimensionBehaviourArr = this.f7972b0;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.f8006s0 = null;
        this.f8008t0 = 0;
        this.f8010u0 = 0;
        this.f8016x0 = null;
        this.f7936G0 = false;
        this.f7938H0 = false;
        this.f7942J0 = 0;
        this.f7944K0 = 0;
        this.f7946L0 = false;
        this.f7948M0 = false;
        float[] fArr = this.f7950N0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f8007t = -1;
        this.f8009u = -1;
        int[] iArr = this.f7941J;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f8013w = 0;
        this.f8015x = 0;
        this.f7925B = 1.0f;
        this.f7931E = 1.0f;
        this.f7923A = Integer.MAX_VALUE;
        this.f7929D = Integer.MAX_VALUE;
        this.f8019z = 0;
        this.f7927C = 0;
        this.f7983h = false;
        this.f7937H = -1;
        this.f7939I = 1.0f;
        this.f7940I0 = false;
        boolean[] zArr = this.f7981g;
        zArr[0] = true;
        zArr[1] = true;
        this.f7949N = false;
        boolean[] zArr2 = this.f7970a0;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f7985i = true;
        int[] iArr2 = this.f8017y;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f7991l = -1;
        this.f7993m = -1;
    }

    public void R1(int i4, int i5) {
        this.f7984h0 = i4;
        this.f7986i0 = i5;
    }

    public int S() {
        int i4;
        int i5 = this.f7978e0;
        if (this.f7972b0[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            if (this.f8015x == 1) {
                i4 = Math.max(this.f7927C, i5);
            } else {
                i4 = this.f7927C;
                if (i4 > 0) {
                    this.f7978e0 = i4;
                } else {
                    i4 = 0;
                }
            }
            int i6 = this.f7929D;
            if (i6 > 0 && i6 < i4) {
                return i6;
            }
            return i4;
        }
        return i5;
    }

    public void S0() {
        U0();
        V1(f7890A1);
        A1(f7890A1);
    }

    public void S1(ConstraintWidget constraintWidget) {
        this.f7974c0 = constraintWidget;
    }

    public int T() {
        int i4;
        int i5 = this.f7976d0;
        if (this.f7972b0[0] == DimensionBehaviour.MATCH_CONSTRAINT) {
            if (this.f8013w == 1) {
                i4 = Math.max(this.f8019z, i5);
            } else {
                i4 = this.f8019z;
                if (i4 > 0) {
                    this.f7976d0 = i4;
                } else {
                    i4 = 0;
                }
            }
            int i6 = this.f7923A;
            if (i6 > 0 && i6 < i4) {
                return i6;
            }
            return i4;
        }
        return i5;
    }

    public void T0(ConstraintAnchor constraintAnchor) {
        if (U() != null && (U() instanceof d) && ((d) U()).K2()) {
            return;
        }
        ConstraintAnchor r4 = r(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor r5 = r(ConstraintAnchor.Type.RIGHT);
        ConstraintAnchor r6 = r(ConstraintAnchor.Type.TOP);
        ConstraintAnchor r7 = r(ConstraintAnchor.Type.BOTTOM);
        ConstraintAnchor r8 = r(ConstraintAnchor.Type.CENTER);
        ConstraintAnchor r9 = r(ConstraintAnchor.Type.CENTER_X);
        ConstraintAnchor r10 = r(ConstraintAnchor.Type.CENTER_Y);
        if (constraintAnchor == r8) {
            if (r4.p() && r5.p() && r4.k() == r5.k()) {
                r4.x();
                r5.x();
            }
            if (r6.p() && r7.p() && r6.k() == r7.k()) {
                r6.x();
                r7.x();
            }
            this.f8002q0 = 0.5f;
            this.f8004r0 = 0.5f;
        } else if (constraintAnchor == r9) {
            if (r4.p() && r5.p() && r4.k().i() == r5.k().i()) {
                r4.x();
                r5.x();
            }
            this.f8002q0 = 0.5f;
        } else if (constraintAnchor == r10) {
            if (r6.p() && r7.p() && r6.k().i() == r7.k().i()) {
                r6.x();
                r7.x();
            }
            this.f8004r0 = 0.5f;
        } else if (constraintAnchor != r4 && constraintAnchor != r5) {
            if ((constraintAnchor == r6 || constraintAnchor == r7) && r6.p() && r6.k() == r7.k()) {
                r8.x();
            }
        } else if (r4.p() && r4.k() == r5.k()) {
            r8.x();
        }
        constraintAnchor.x();
    }

    void T1(int i4, int i5) {
        if (i5 == 0) {
            this.f7988j0 = i4;
        } else if (i5 == 1) {
            this.f7990k0 = i4;
        }
    }

    public ConstraintWidget U() {
        return this.f7974c0;
    }

    public void U0() {
        ConstraintWidget U3 = U();
        if (U3 != null && (U3 instanceof d) && ((d) U()).K2()) {
            return;
        }
        int size = this.f7968Z.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f7968Z.get(i4).x();
        }
    }

    public void U1(String str) {
        this.f8016x0 = str;
    }

    public ConstraintWidget V(int i4) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i4 == 0) {
            ConstraintAnchor constraintAnchor3 = this.f7955Q;
            ConstraintAnchor constraintAnchor4 = constraintAnchor3.f7885f;
            if (constraintAnchor4 != null && constraintAnchor4.f7885f == constraintAnchor3) {
                return constraintAnchor4.f7883d;
            }
            return null;
        }
        if (i4 == 1 && (constraintAnchor2 = (constraintAnchor = this.f7957R).f7885f) != null && constraintAnchor2.f7885f == constraintAnchor) {
            return constraintAnchor2.f7883d;
        }
        return null;
    }

    public void V0() {
        this.f7999p = false;
        this.f8001q = false;
        this.f8003r = false;
        this.f8005s = false;
        int size = this.f7968Z.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f7968Z.get(i4).y();
        }
    }

    public void V1(float f4) {
        this.f8004r0 = f4;
    }

    int W(int i4) {
        if (i4 == 0) {
            return this.f7988j0;
        }
        if (i4 == 1) {
            return this.f7990k0;
        }
        return 0;
    }

    public void W0(androidx.constraintlayout.core.c cVar) {
        this.f7955Q.z(cVar);
        this.f7957R.z(cVar);
        this.f7959S.z(cVar);
        this.f7961T.z(cVar);
        this.f7963U.z(cVar);
        this.f7966X.z(cVar);
        this.f7964V.z(cVar);
        this.f7965W.z(cVar);
    }

    public void W1(int i4) {
        this.f7944K0 = i4;
    }

    public int X() {
        return o0() + this.f7976d0;
    }

    public void X0() {
        this.f8003r = false;
        this.f8005s = false;
    }

    public void X1(int i4, int i5) {
        this.f7986i0 = i4;
        int i6 = i5 - i4;
        this.f7978e0 = i6;
        int i7 = this.f8000p0;
        if (i6 < i7) {
            this.f7978e0 = i7;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int Y() {
        return this.f7984h0 + this.f7992l0;
    }

    public StringBuilder Y0(StringBuilder sb) {
        sb.append("{\n");
        Z0(sb, "left", this.f7955Q);
        Z0(sb, "top", this.f7957R);
        Z0(sb, "right", this.f7959S);
        Z0(sb, "bottom", this.f7961T);
        Z0(sb, "baseline", this.f7963U);
        Z0(sb, "centerX", this.f7964V);
        Z0(sb, "centerY", this.f7965W);
        c1(sb, this.f7966X, this.f7943K);
        e1(sb, "width", this.f7976d0, this.f7998o0, this.f7941J[0], this.f7991l, this.f8019z, this.f8013w, this.f7925B, this.f7950N0[0]);
        e1(sb, "height", this.f7978e0, this.f8000p0, this.f7941J[1], this.f7993m, this.f7927C, this.f8015x, this.f7931E, this.f7950N0[1]);
        d1(sb, "dimensionRatio", this.f7980f0, this.f7982g0);
        a1(sb, "horizontalBias", this.f8002q0, f7890A1);
        a1(sb, "verticalBias", this.f8004r0, f7890A1);
        sb.append("}\n");
        return sb;
    }

    public void Y1(DimensionBehaviour dimensionBehaviour) {
        this.f7972b0[1] = dimensionBehaviour;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int Z() {
        return this.f7986i0 + this.f7994m0;
    }

    public void Z1(int i4, int i5, int i6, float f4) {
        this.f8015x = i4;
        this.f7927C = i5;
        if (i6 == Integer.MAX_VALUE) {
            i6 = 0;
        }
        this.f7929D = i6;
        this.f7931E = f4;
        if (f4 > 0.0f && f4 < 1.0f && i4 == 0) {
            this.f8015x = 2;
        }
    }

    public p a0(int i4) {
        if (i4 == 0) {
            return this.f7977e;
        }
        if (i4 == 1) {
            return this.f7979f;
        }
        return null;
    }

    public void a2(float f4) {
        this.f7950N0[1] = f4;
    }

    public void b0(StringBuilder sb) {
        sb.append("  " + this.f7997o + ":{\n");
        sb.append("    actualWidth:" + this.f7976d0);
        sb.append("\n");
        sb.append("    actualHeight:" + this.f7978e0);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f7984h0);
        sb.append("\n");
        sb.append("    actualTop:" + this.f7986i0);
        sb.append("\n");
        d0(sb, "left", this.f7955Q);
        d0(sb, "top", this.f7957R);
        d0(sb, "right", this.f7959S);
        d0(sb, "bottom", this.f7961T);
        d0(sb, "baseline", this.f7963U);
        d0(sb, "centerX", this.f7964V);
        d0(sb, "centerY", this.f7965W);
        c0(sb, "    width", this.f7976d0, this.f7998o0, this.f7941J[0], this.f7991l, this.f8019z, this.f8013w, this.f7925B, this.f7950N0[0]);
        c0(sb, "    height", this.f7978e0, this.f8000p0, this.f7941J[1], this.f7993m, this.f7927C, this.f8015x, this.f7931E, this.f7950N0[1]);
        d1(sb, "    dimensionRatio", this.f7980f0, this.f7982g0);
        a1(sb, "    horizontalBias", this.f8002q0, f7890A1);
        a1(sb, "    verticalBias", this.f8004r0, f7890A1);
        b1(sb, "    horizontalChainStyle", this.f7942J0, 0);
        b1(sb, "    verticalChainStyle", this.f7944K0, 0);
        sb.append("  }");
    }

    public void b2(int i4) {
        this.f8010u0 = i4;
    }

    public void c2(int i4) {
        this.f7976d0 = i4;
        int i5 = this.f7998o0;
        if (i4 < i5) {
            this.f7976d0 = i5;
        }
    }

    public void d2(boolean z3) {
        this.f7933F = z3;
    }

    public void e(d dVar, androidx.constraintlayout.core.e eVar, HashSet<ConstraintWidget> hashSet, int i4, boolean z3) {
        if (z3) {
            if (!hashSet.contains(this)) {
                return;
            }
            i.a(dVar, eVar, this);
            hashSet.remove(this);
            g(eVar, dVar.S2(64));
        }
        if (i4 == 0) {
            HashSet<ConstraintAnchor> e4 = this.f7955Q.e();
            if (e4 != null) {
                Iterator<ConstraintAnchor> it = e4.iterator();
                while (it.hasNext()) {
                    it.next().f7883d.e(dVar, eVar, hashSet, i4, true);
                }
            }
            HashSet<ConstraintAnchor> e5 = this.f7959S.e();
            if (e5 != null) {
                Iterator<ConstraintAnchor> it2 = e5.iterator();
                while (it2.hasNext()) {
                    it2.next().f7883d.e(dVar, eVar, hashSet, i4, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> e6 = this.f7957R.e();
        if (e6 != null) {
            Iterator<ConstraintAnchor> it3 = e6.iterator();
            while (it3.hasNext()) {
                it3.next().f7883d.e(dVar, eVar, hashSet, i4, true);
            }
        }
        HashSet<ConstraintAnchor> e7 = this.f7961T.e();
        if (e7 != null) {
            Iterator<ConstraintAnchor> it4 = e7.iterator();
            while (it4.hasNext()) {
                it4.next().f7883d.e(dVar, eVar, hashSet, i4, true);
            }
        }
        HashSet<ConstraintAnchor> e8 = this.f7963U.e();
        if (e8 != null) {
            Iterator<ConstraintAnchor> it5 = e8.iterator();
            while (it5.hasNext()) {
                it5.next().f7883d.e(dVar, eVar, hashSet, i4, true);
            }
        }
    }

    public int e0() {
        return p0();
    }

    public void e2(int i4) {
        if (i4 >= 0 && i4 <= 3) {
            this.f8011v = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        if (!(this instanceof l) && !(this instanceof f)) {
            return false;
        }
        return true;
    }

    public String f0() {
        return this.f8016x0;
    }

    public void f1(boolean z3) {
        this.f8012v0 = z3;
    }

    public void f2(int i4) {
        this.f7984h0 = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(androidx.constraintlayout.core.e r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.g(androidx.constraintlayout.core.e, boolean):void");
    }

    public float g0() {
        return this.f8004r0;
    }

    public void g1(int i4) {
        boolean z3;
        this.f7996n0 = i4;
        if (i4 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f7945L = z3;
    }

    public void g2(int i4) {
        this.f7986i0 = i4;
    }

    public boolean h() {
        if (this.f8010u0 != 8) {
            return true;
        }
        return false;
    }

    public ConstraintWidget h0() {
        ConstraintAnchor k4;
        ConstraintWidget i4;
        ConstraintAnchor k5;
        if (!D0()) {
            return null;
        }
        ConstraintWidget constraintWidget = this;
        ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            ConstraintAnchor r4 = constraintWidget.r(ConstraintAnchor.Type.TOP);
            if (r4 == null) {
                k4 = null;
            } else {
                k4 = r4.k();
            }
            if (k4 == null) {
                i4 = null;
            } else {
                i4 = k4.i();
            }
            if (i4 == U()) {
                return constraintWidget;
            }
            if (i4 == null) {
                k5 = null;
            } else {
                k5 = i4.r(ConstraintAnchor.Type.BOTTOM).k();
            }
            if (k5 != null && k5.i() != constraintWidget) {
                constraintWidget2 = constraintWidget;
            } else {
                constraintWidget = i4;
            }
        }
        return constraintWidget2;
    }

    public void h1(Object obj) {
        this.f8006s0 = obj;
    }

    public void h2(boolean z3, boolean z4, boolean z5, boolean z6) {
        if (this.f7937H == -1) {
            if (z5 && !z6) {
                this.f7937H = 0;
            } else if (!z5 && z6) {
                this.f7937H = 1;
                if (this.f7982g0 == -1) {
                    this.f7939I = 1.0f / this.f7939I;
                }
            }
        }
        if (this.f7937H == 0 && (!this.f7957R.p() || !this.f7961T.p())) {
            this.f7937H = 1;
        } else if (this.f7937H == 1 && (!this.f7955Q.p() || !this.f7959S.p())) {
            this.f7937H = 0;
        }
        if (this.f7937H == -1 && (!this.f7957R.p() || !this.f7961T.p() || !this.f7955Q.p() || !this.f7959S.p())) {
            if (this.f7957R.p() && this.f7961T.p()) {
                this.f7937H = 0;
            } else if (this.f7955Q.p() && this.f7959S.p()) {
                this.f7939I = 1.0f / this.f7939I;
                this.f7937H = 1;
            }
        }
        if (this.f7937H == -1) {
            int i4 = this.f8019z;
            if (i4 > 0 && this.f7927C == 0) {
                this.f7937H = 0;
            } else if (i4 == 0 && this.f7927C > 0) {
                this.f7939I = 1.0f / this.f7939I;
                this.f7937H = 1;
            }
        }
    }

    public int i0() {
        return this.f7944K0;
    }

    public void i1(int i4) {
        if (i4 >= 0) {
            this.f8008t0 = i4;
        } else {
            this.f8008t0 = 0;
        }
    }

    public void i2(boolean z3, boolean z4) {
        int i4;
        int i5;
        boolean m4 = z3 & this.f7977e.m();
        boolean m5 = z4 & this.f7979f.m();
        androidx.constraintlayout.core.widgets.analyzer.l lVar = this.f7977e;
        int i6 = lVar.f8132h.f8077g;
        n nVar = this.f7979f;
        int i7 = nVar.f8132h.f8077g;
        int i8 = lVar.f8133i.f8077g;
        int i9 = nVar.f8133i.f8077g;
        int i10 = i9 - i7;
        if (i8 - i6 < 0 || i10 < 0 || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE || i8 == Integer.MIN_VALUE || i8 == Integer.MAX_VALUE || i9 == Integer.MIN_VALUE || i9 == Integer.MAX_VALUE) {
            i8 = 0;
            i6 = 0;
            i9 = 0;
            i7 = 0;
        }
        int i11 = i8 - i6;
        int i12 = i9 - i7;
        if (m4) {
            this.f7984h0 = i6;
        }
        if (m5) {
            this.f7986i0 = i7;
        }
        if (this.f8010u0 == 8) {
            this.f7976d0 = 0;
            this.f7978e0 = 0;
            return;
        }
        if (m4) {
            if (this.f7972b0[0] == DimensionBehaviour.FIXED && i11 < (i5 = this.f7976d0)) {
                i11 = i5;
            }
            this.f7976d0 = i11;
            int i13 = this.f7998o0;
            if (i11 < i13) {
                this.f7976d0 = i13;
            }
        }
        if (m5) {
            if (this.f7972b0[1] == DimensionBehaviour.FIXED && i12 < (i4 = this.f7978e0)) {
                i12 = i4;
            }
            this.f7978e0 = i12;
            int i14 = this.f8000p0;
            if (i12 < i14) {
                this.f7978e0 = i14;
            }
        }
    }

    public void j(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2) {
        k(type, constraintWidget, type2, 0);
    }

    public DimensionBehaviour j0() {
        return this.f7972b0[1];
    }

    public void j1(String str) {
        this.f8014w0 = str;
    }

    public void j2(androidx.constraintlayout.core.e eVar, boolean z3) {
        n nVar;
        androidx.constraintlayout.core.widgets.analyzer.l lVar;
        int M3 = eVar.M(this.f7955Q);
        int M4 = eVar.M(this.f7957R);
        int M5 = eVar.M(this.f7959S);
        int M6 = eVar.M(this.f7961T);
        if (z3 && (lVar = this.f7977e) != null) {
            androidx.constraintlayout.core.widgets.analyzer.f fVar = lVar.f8132h;
            if (fVar.f8080j) {
                androidx.constraintlayout.core.widgets.analyzer.f fVar2 = lVar.f8133i;
                if (fVar2.f8080j) {
                    M3 = fVar.f8077g;
                    M5 = fVar2.f8077g;
                }
            }
        }
        if (z3 && (nVar = this.f7979f) != null) {
            androidx.constraintlayout.core.widgets.analyzer.f fVar3 = nVar.f8132h;
            if (fVar3.f8080j) {
                androidx.constraintlayout.core.widgets.analyzer.f fVar4 = nVar.f8133i;
                if (fVar4.f8080j) {
                    M4 = fVar3.f8077g;
                    M6 = fVar4.f8077g;
                }
            }
        }
        int i4 = M6 - M4;
        if (M5 - M3 < 0 || i4 < 0 || M3 == Integer.MIN_VALUE || M3 == Integer.MAX_VALUE || M4 == Integer.MIN_VALUE || M4 == Integer.MAX_VALUE || M5 == Integer.MIN_VALUE || M5 == Integer.MAX_VALUE || M6 == Integer.MIN_VALUE || M6 == Integer.MAX_VALUE) {
            M3 = 0;
            M6 = 0;
            M4 = 0;
            M5 = 0;
        }
        v1(M3, M4, M5, M6);
    }

    public void k(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i4) {
        ConstraintAnchor.Type type3;
        ConstraintAnchor.Type type4;
        boolean z3;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.CENTER;
        if (type == type5) {
            if (type2 == type5) {
                ConstraintAnchor.Type type6 = ConstraintAnchor.Type.LEFT;
                ConstraintAnchor r4 = r(type6);
                ConstraintAnchor.Type type7 = ConstraintAnchor.Type.RIGHT;
                ConstraintAnchor r5 = r(type7);
                ConstraintAnchor.Type type8 = ConstraintAnchor.Type.TOP;
                ConstraintAnchor r6 = r(type8);
                ConstraintAnchor.Type type9 = ConstraintAnchor.Type.BOTTOM;
                ConstraintAnchor r7 = r(type9);
                boolean z4 = true;
                if ((r4 != null && r4.p()) || (r5 != null && r5.p())) {
                    z3 = false;
                } else {
                    k(type6, constraintWidget, type6, 0);
                    k(type7, constraintWidget, type7, 0);
                    z3 = true;
                }
                if ((r6 != null && r6.p()) || (r7 != null && r7.p())) {
                    z4 = false;
                } else {
                    k(type8, constraintWidget, type8, 0);
                    k(type9, constraintWidget, type9, 0);
                }
                if (z3 && z4) {
                    r(type5).a(constraintWidget.r(type5), 0);
                    return;
                }
                if (z3) {
                    ConstraintAnchor.Type type10 = ConstraintAnchor.Type.CENTER_X;
                    r(type10).a(constraintWidget.r(type10), 0);
                    return;
                } else {
                    if (z4) {
                        ConstraintAnchor.Type type11 = ConstraintAnchor.Type.CENTER_Y;
                        r(type11).a(constraintWidget.r(type11), 0);
                        return;
                    }
                    return;
                }
            }
            ConstraintAnchor.Type type12 = ConstraintAnchor.Type.LEFT;
            if (type2 != type12 && type2 != ConstraintAnchor.Type.RIGHT) {
                ConstraintAnchor.Type type13 = ConstraintAnchor.Type.TOP;
                if (type2 == type13 || type2 == ConstraintAnchor.Type.BOTTOM) {
                    k(type13, constraintWidget, type2, 0);
                    k(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                    r(type5).a(constraintWidget.r(type2), 0);
                    return;
                }
                return;
            }
            k(type12, constraintWidget, type2, 0);
            k(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
            r(type5).a(constraintWidget.r(type2), 0);
            return;
        }
        ConstraintAnchor.Type type14 = ConstraintAnchor.Type.CENTER_X;
        if (type == type14 && (type2 == (type4 = ConstraintAnchor.Type.LEFT) || type2 == ConstraintAnchor.Type.RIGHT)) {
            ConstraintAnchor r8 = r(type4);
            ConstraintAnchor r9 = constraintWidget.r(type2);
            ConstraintAnchor r10 = r(ConstraintAnchor.Type.RIGHT);
            r8.a(r9, 0);
            r10.a(r9, 0);
            r(type14).a(r9, 0);
            return;
        }
        ConstraintAnchor.Type type15 = ConstraintAnchor.Type.CENTER_Y;
        if (type == type15 && (type2 == (type3 = ConstraintAnchor.Type.TOP) || type2 == ConstraintAnchor.Type.BOTTOM)) {
            ConstraintAnchor r11 = constraintWidget.r(type2);
            r(type3).a(r11, 0);
            r(ConstraintAnchor.Type.BOTTOM).a(r11, 0);
            r(type15).a(r11, 0);
            return;
        }
        if (type == type14 && type2 == type14) {
            ConstraintAnchor.Type type16 = ConstraintAnchor.Type.LEFT;
            r(type16).a(constraintWidget.r(type16), 0);
            ConstraintAnchor.Type type17 = ConstraintAnchor.Type.RIGHT;
            r(type17).a(constraintWidget.r(type17), 0);
            r(type14).a(constraintWidget.r(type2), 0);
            return;
        }
        if (type == type15 && type2 == type15) {
            ConstraintAnchor.Type type18 = ConstraintAnchor.Type.TOP;
            r(type18).a(constraintWidget.r(type18), 0);
            ConstraintAnchor.Type type19 = ConstraintAnchor.Type.BOTTOM;
            r(type19).a(constraintWidget.r(type19), 0);
            r(type15).a(constraintWidget.r(type2), 0);
            return;
        }
        ConstraintAnchor r12 = r(type);
        ConstraintAnchor r13 = constraintWidget.r(type2);
        if (r12.v(r13)) {
            ConstraintAnchor.Type type20 = ConstraintAnchor.Type.BASELINE;
            if (type == type20) {
                ConstraintAnchor r14 = r(ConstraintAnchor.Type.TOP);
                ConstraintAnchor r15 = r(ConstraintAnchor.Type.BOTTOM);
                if (r14 != null) {
                    r14.x();
                }
                if (r15 != null) {
                    r15.x();
                }
            } else if (type != ConstraintAnchor.Type.TOP && type != ConstraintAnchor.Type.BOTTOM) {
                if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                    ConstraintAnchor r16 = r(type5);
                    if (r16.k() != r13) {
                        r16.x();
                    }
                    ConstraintAnchor h4 = r(type).h();
                    ConstraintAnchor r17 = r(type14);
                    if (r17.p()) {
                        h4.x();
                        r17.x();
                    }
                }
            } else {
                ConstraintAnchor r18 = r(type20);
                if (r18 != null) {
                    r18.x();
                }
                ConstraintAnchor r19 = r(type5);
                if (r19.k() != r13) {
                    r19.x();
                }
                ConstraintAnchor h5 = r(type).h();
                ConstraintAnchor r20 = r(type15);
                if (r20.p()) {
                    h5.x();
                    r20.x();
                }
            }
            r12.a(r13, i4);
        }
    }

    public int k0() {
        int i4;
        if (this.f7955Q != null) {
            i4 = this.f7957R.f7886g;
        } else {
            i4 = 0;
        }
        if (this.f7959S != null) {
            return i4 + this.f7961T.f7886g;
        }
        return i4;
    }

    public void k1(androidx.constraintlayout.core.e eVar, String str) {
        this.f8014w0 = str;
        SolverVariable s4 = eVar.s(this.f7955Q);
        SolverVariable s5 = eVar.s(this.f7957R);
        SolverVariable s6 = eVar.s(this.f7959S);
        SolverVariable s7 = eVar.s(this.f7961T);
        s4.n(str + ".left");
        s5.n(str + ".top");
        s6.n(str + ".right");
        s7.n(str + ".bottom");
        eVar.s(this.f7963U).n(str + ".baseline");
    }

    public void l(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i4) {
        if (constraintAnchor.i() == this) {
            k(constraintAnchor.l(), constraintAnchor2.i(), constraintAnchor2.l(), i4);
        }
    }

    public int l0() {
        return this.f8010u0;
    }

    public void l1(int i4, int i5) {
        this.f7976d0 = i4;
        int i6 = this.f7998o0;
        if (i4 < i6) {
            this.f7976d0 = i6;
        }
        this.f7978e0 = i5;
        int i7 = this.f8000p0;
        if (i5 < i7) {
            this.f7978e0 = i7;
        }
    }

    public void m(ConstraintWidget constraintWidget, float f4, int i4) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.CENTER;
        v0(type, constraintWidget, type, i4, 0);
        this.f7943K = f4;
    }

    public int m0() {
        if (this.f8010u0 == 8) {
            return 0;
        }
        return this.f7976d0;
    }

    public void m1(float f4, int i4) {
        this.f7980f0 = f4;
        this.f7982g0 = i4;
    }

    public void n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        this.f8007t = constraintWidget.f8007t;
        this.f8009u = constraintWidget.f8009u;
        this.f8013w = constraintWidget.f8013w;
        this.f8015x = constraintWidget.f8015x;
        int[] iArr = this.f8017y;
        int[] iArr2 = constraintWidget.f8017y;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.f8019z = constraintWidget.f8019z;
        this.f7923A = constraintWidget.f7923A;
        this.f7927C = constraintWidget.f7927C;
        this.f7929D = constraintWidget.f7929D;
        this.f7931E = constraintWidget.f7931E;
        this.f7933F = constraintWidget.f7933F;
        this.f7935G = constraintWidget.f7935G;
        this.f7937H = constraintWidget.f7937H;
        this.f7939I = constraintWidget.f7939I;
        int[] iArr3 = constraintWidget.f7941J;
        this.f7941J = Arrays.copyOf(iArr3, iArr3.length);
        float f4 = constraintWidget.f7943K;
        this.f7943K = f4;
        w.e(" copying angle = " + f4, 5);
        this.f7945L = constraintWidget.f7945L;
        this.f7947M = constraintWidget.f7947M;
        this.f7955Q.x();
        this.f7957R.x();
        this.f7959S.x();
        this.f7961T.x();
        this.f7963U.x();
        this.f7964V.x();
        this.f7965W.x();
        this.f7966X.x();
        this.f7972b0 = (DimensionBehaviour[]) Arrays.copyOf(this.f7972b0, 2);
        ConstraintWidget constraintWidget4 = null;
        if (this.f7974c0 == null) {
            constraintWidget2 = null;
        } else {
            constraintWidget2 = hashMap.get(constraintWidget.f7974c0);
        }
        this.f7974c0 = constraintWidget2;
        this.f7976d0 = constraintWidget.f7976d0;
        this.f7978e0 = constraintWidget.f7978e0;
        this.f7980f0 = constraintWidget.f7980f0;
        this.f7982g0 = constraintWidget.f7982g0;
        this.f7984h0 = constraintWidget.f7984h0;
        this.f7986i0 = constraintWidget.f7986i0;
        this.f7988j0 = constraintWidget.f7988j0;
        this.f7990k0 = constraintWidget.f7990k0;
        this.f7992l0 = constraintWidget.f7992l0;
        this.f7994m0 = constraintWidget.f7994m0;
        this.f7996n0 = constraintWidget.f7996n0;
        this.f7998o0 = constraintWidget.f7998o0;
        this.f8000p0 = constraintWidget.f8000p0;
        this.f8002q0 = constraintWidget.f8002q0;
        this.f8004r0 = constraintWidget.f8004r0;
        this.f8006s0 = constraintWidget.f8006s0;
        this.f8008t0 = constraintWidget.f8008t0;
        this.f8010u0 = constraintWidget.f8010u0;
        this.f8012v0 = constraintWidget.f8012v0;
        this.f8014w0 = constraintWidget.f8014w0;
        this.f8016x0 = constraintWidget.f8016x0;
        this.f8018y0 = constraintWidget.f8018y0;
        this.f8020z0 = constraintWidget.f8020z0;
        this.f7924A0 = constraintWidget.f7924A0;
        this.f7926B0 = constraintWidget.f7926B0;
        this.f7928C0 = constraintWidget.f7928C0;
        this.f7930D0 = constraintWidget.f7930D0;
        this.f7932E0 = constraintWidget.f7932E0;
        this.f7934F0 = constraintWidget.f7934F0;
        this.f7936G0 = constraintWidget.f7936G0;
        this.f7938H0 = constraintWidget.f7938H0;
        this.f7942J0 = constraintWidget.f7942J0;
        this.f7944K0 = constraintWidget.f7944K0;
        this.f7946L0 = constraintWidget.f7946L0;
        this.f7948M0 = constraintWidget.f7948M0;
        float[] fArr = this.f7950N0;
        float[] fArr2 = constraintWidget.f7950N0;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        ConstraintWidget[] constraintWidgetArr = this.f7952O0;
        ConstraintWidget[] constraintWidgetArr2 = constraintWidget.f7952O0;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        ConstraintWidget[] constraintWidgetArr3 = this.f7954P0;
        ConstraintWidget[] constraintWidgetArr4 = constraintWidget.f7954P0;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        ConstraintWidget constraintWidget5 = constraintWidget.f7956Q0;
        if (constraintWidget5 == null) {
            constraintWidget3 = null;
        } else {
            constraintWidget3 = hashMap.get(constraintWidget5);
        }
        this.f7956Q0 = constraintWidget3;
        ConstraintWidget constraintWidget6 = constraintWidget.f7958R0;
        if (constraintWidget6 != null) {
            constraintWidget4 = hashMap.get(constraintWidget6);
        }
        this.f7958R0 = constraintWidget4;
    }

    public int n0() {
        return this.f8011v;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0086 -> B:31:0x0087). Please report as a decompilation issue!!! */
    public void n1(String str) {
        float f4;
        int i4 = 0;
        if (str != null && str.length() != 0) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i5 = 0;
            int i6 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase(androidx.exifinterface.media.a.V4)) {
                    if (substring.equalsIgnoreCase("H")) {
                        i5 = 1;
                    } else {
                        i5 = -1;
                    }
                }
                i6 = i5;
                i5 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 >= 0 && indexOf2 < length - 1) {
                String substring2 = str.substring(i5, indexOf2);
                String substring3 = str.substring(indexOf2 + 1);
                if (substring2.length() > 0 && substring3.length() > 0) {
                    float parseFloat = Float.parseFloat(substring2);
                    float parseFloat2 = Float.parseFloat(substring3);
                    if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                        if (i6 == 1) {
                            f4 = Math.abs(parseFloat2 / parseFloat);
                        } else {
                            f4 = Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
                f4 = i4;
            } else {
                String substring4 = str.substring(i5);
                if (substring4.length() > 0) {
                    f4 = Float.parseFloat(substring4);
                }
                f4 = i4;
            }
            i4 = (f4 > i4 ? 1 : (f4 == i4 ? 0 : -1));
            if (i4 > 0) {
                this.f7980f0 = f4;
                this.f7982g0 = i6;
                return;
            }
            return;
        }
        this.f7980f0 = 0.0f;
    }

    public void o(androidx.constraintlayout.core.e eVar) {
        eVar.s(this.f7955Q);
        eVar.s(this.f7957R);
        eVar.s(this.f7959S);
        eVar.s(this.f7961T);
        if (this.f7996n0 > 0) {
            eVar.s(this.f7963U);
        }
    }

    public int o0() {
        ConstraintWidget constraintWidget = this.f7974c0;
        if (constraintWidget != null && (constraintWidget instanceof d)) {
            return ((d) constraintWidget).f8172J1 + this.f7984h0;
        }
        return this.f7984h0;
    }

    public void o1(int i4) {
        if (!this.f7945L) {
            return;
        }
        int i5 = i4 - this.f7996n0;
        int i6 = this.f7978e0 + i5;
        this.f7986i0 = i5;
        this.f7957R.A(i5);
        this.f7961T.A(i6);
        this.f7963U.A(i4);
        this.f8001q = true;
    }

    public void p() {
        this.f7985i = true;
    }

    public int p0() {
        ConstraintWidget constraintWidget = this.f7974c0;
        if (constraintWidget != null && (constraintWidget instanceof d)) {
            return ((d) constraintWidget).f8173K1 + this.f7986i0;
        }
        return this.f7986i0;
    }

    public void p1(int i4, int i5, int i6, int i7, int i8, int i9) {
        v1(i4, i5, i6, i7);
        g1(i8);
        if (i9 == 0) {
            this.f7999p = true;
            this.f8001q = false;
        } else if (i9 == 1) {
            this.f7999p = false;
            this.f8001q = true;
        } else if (i9 == 2) {
            this.f7999p = true;
            this.f8001q = true;
        } else {
            this.f7999p = false;
            this.f8001q = false;
        }
    }

    public void q() {
        if (this.f7977e == null) {
            this.f7977e = new androidx.constraintlayout.core.widgets.analyzer.l(this);
        }
        if (this.f7979f == null) {
            this.f7979f = new n(this);
        }
    }

    public boolean q0() {
        return this.f7945L;
    }

    public void q1(int i4, int i5) {
        if (this.f7999p) {
            return;
        }
        this.f7955Q.A(i4);
        this.f7959S.A(i5);
        this.f7984h0 = i4;
        this.f7976d0 = i5 - i4;
        this.f7999p = true;
    }

    public ConstraintAnchor r(ConstraintAnchor.Type type) {
        switch (a.f8021a[type.ordinal()]) {
            case 1:
                return this.f7955Q;
            case 2:
                return this.f7957R;
            case 3:
                return this.f7959S;
            case 4:
                return this.f7961T;
            case 5:
                return this.f7963U;
            case 6:
                return this.f7966X;
            case 7:
                return this.f7964V;
            case 8:
                return this.f7965W;
            case 9:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    public boolean r0(int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (i4 == 0) {
            if (this.f7955Q.f7885f != null) {
                i8 = 1;
            } else {
                i8 = 0;
            }
            if (this.f7959S.f7885f != null) {
                i9 = 1;
            } else {
                i9 = 0;
            }
            if (i8 + i9 >= 2) {
                return false;
            }
            return true;
        }
        if (this.f7957R.f7885f != null) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        if (this.f7961T.f7885f != null) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        int i10 = i5 + i6;
        if (this.f7963U.f7885f != null) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        if (i10 + i7 >= 2) {
            return false;
        }
        return true;
    }

    public void r1(int i4) {
        this.f7955Q.A(i4);
        this.f7984h0 = i4;
    }

    public ArrayList<ConstraintAnchor> s() {
        return this.f7968Z;
    }

    public boolean s0() {
        int size = this.f7968Z.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (this.f7968Z.get(i4).n()) {
                return true;
            }
        }
        return false;
    }

    public void s1(int i4) {
        this.f7957R.A(i4);
        this.f7986i0 = i4;
    }

    public int t() {
        return this.f7996n0;
    }

    public boolean t0() {
        if (this.f7991l == -1 && this.f7993m == -1) {
            return false;
        }
        return true;
    }

    public void t1(int i4, int i5) {
        if (this.f8001q) {
            return;
        }
        this.f7957R.A(i4);
        this.f7961T.A(i5);
        this.f7986i0 = i4;
        this.f7978e0 = i5 - i4;
        if (this.f7945L) {
            this.f7963U.A(i4 + this.f7996n0);
        }
        this.f8001q = true;
    }

    public String toString() {
        String str;
        String str2 = this.f8016x0;
        String str3 = "";
        if (str2 == null) {
            str = "";
        } else {
            str = "type: " + str2 + " ";
        }
        String str4 = this.f8014w0;
        if (str4 != null) {
            str3 = "id: " + str4 + " ";
        }
        return str + str3 + "(" + this.f7984h0 + ", " + this.f7986i0 + ") - (" + this.f7976d0 + " x " + this.f7978e0 + ")";
    }

    public float u(int i4) {
        if (i4 == 0) {
            return this.f8002q0;
        }
        if (i4 == 1) {
            return this.f8004r0;
        }
        return -1.0f;
    }

    public boolean u0(int i4, int i5) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i4 == 0) {
            ConstraintAnchor constraintAnchor3 = this.f7955Q.f7885f;
            if (constraintAnchor3 != null && constraintAnchor3.o() && (constraintAnchor2 = this.f7959S.f7885f) != null && constraintAnchor2.o() && (this.f7959S.f7885f.f() - this.f7959S.g()) - (this.f7955Q.f7885f.f() + this.f7955Q.g()) >= i5) {
                return true;
            }
            return false;
        }
        ConstraintAnchor constraintAnchor4 = this.f7957R.f7885f;
        if (constraintAnchor4 != null && constraintAnchor4.o() && (constraintAnchor = this.f7961T.f7885f) != null && constraintAnchor.o() && (this.f7961T.f7885f.f() - this.f7961T.g()) - (this.f7957R.f7885f.f() + this.f7957R.g()) >= i5) {
            return true;
        }
        return false;
        return false;
    }

    public void u1(int i4, int i5, int i6) {
        if (i6 == 0) {
            C1(i4, i5);
        } else if (i6 == 1) {
            X1(i4, i5);
        }
    }

    public int v() {
        return p0() + this.f7978e0;
    }

    public void v0(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i4, int i5) {
        r(type).b(constraintWidget.r(type2), i4, i5, true);
    }

    public void v1(int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10 = i6 - i4;
        int i11 = i7 - i5;
        this.f7984h0 = i4;
        this.f7986i0 = i5;
        if (this.f8010u0 == 8) {
            this.f7976d0 = 0;
            this.f7978e0 = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.f7972b0;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i10 < (i9 = this.f7976d0)) {
            i10 = i9;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i11 < (i8 = this.f7978e0)) {
            i11 = i8;
        }
        this.f7976d0 = i10;
        this.f7978e0 = i11;
        int i12 = this.f8000p0;
        if (i11 < i12) {
            this.f7978e0 = i12;
        }
        int i13 = this.f7998o0;
        if (i10 < i13) {
            this.f7976d0 = i13;
        }
        int i14 = this.f7923A;
        if (i14 > 0 && dimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.f7976d0 = Math.min(this.f7976d0, i14);
        }
        int i15 = this.f7929D;
        if (i15 > 0 && this.f7972b0[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.f7978e0 = Math.min(this.f7978e0, i15);
        }
        int i16 = this.f7976d0;
        if (i10 != i16) {
            this.f7991l = i16;
        }
        int i17 = this.f7978e0;
        if (i11 != i17) {
            this.f7993m = i17;
        }
    }

    public Object w() {
        return this.f8006s0;
    }

    public boolean w0() {
        return this.f8012v0;
    }

    public void w1(ConstraintAnchor.Type type, int i4) {
        int i5 = a.f8021a[type.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 == 5) {
                            this.f7963U.f7887h = i4;
                            return;
                        }
                        return;
                    }
                    this.f7961T.f7887h = i4;
                    return;
                }
                this.f7959S.f7887h = i4;
                return;
            }
            this.f7957R.f7887h = i4;
            return;
        }
        this.f7955Q.f7887h = i4;
    }

    public int x() {
        return this.f8008t0;
    }

    public void x1(boolean z3) {
        this.f7945L = z3;
    }

    public String y() {
        return this.f8014w0;
    }

    public boolean y0() {
        return this.f7935G;
    }

    public void y1(int i4) {
        this.f7978e0 = i4;
        int i5 = this.f8000p0;
        if (i4 < i5) {
            this.f7978e0 = i5;
        }
    }

    public DimensionBehaviour z(int i4) {
        if (i4 == 0) {
            return H();
        }
        if (i4 == 1) {
            return j0();
        }
        return null;
    }

    public boolean z0() {
        return this.f8003r;
    }

    public void z1(boolean z3) {
        this.f7935G = z3;
    }

    public ConstraintWidget(String str) {
        this.f7969a = false;
        this.f7971b = new p[2];
        this.f7977e = null;
        this.f7979f = null;
        this.f7981g = new boolean[]{true, true};
        this.f7983h = false;
        this.f7985i = true;
        this.f7987j = false;
        this.f7989k = true;
        this.f7991l = -1;
        this.f7993m = -1;
        this.f7995n = new s(this);
        this.f7999p = false;
        this.f8001q = false;
        this.f8003r = false;
        this.f8005s = false;
        this.f8007t = -1;
        this.f8009u = -1;
        this.f8011v = 0;
        this.f8013w = 0;
        this.f8015x = 0;
        this.f8017y = new int[2];
        this.f8019z = 0;
        this.f7923A = 0;
        this.f7925B = 1.0f;
        this.f7927C = 0;
        this.f7929D = 0;
        this.f7931E = 1.0f;
        this.f7937H = -1;
        this.f7939I = 1.0f;
        this.f7941J = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f7943K = Float.NaN;
        this.f7945L = false;
        this.f7949N = false;
        this.f7951O = 0;
        this.f7953P = 0;
        this.f7955Q = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.f7957R = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.f7959S = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.f7961T = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.f7963U = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.f7964V = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.f7965W = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.f7966X = constraintAnchor;
        this.f7967Y = new ConstraintAnchor[]{this.f7955Q, this.f7959S, this.f7957R, this.f7961T, this.f7963U, constraintAnchor};
        this.f7968Z = new ArrayList<>();
        this.f7970a0 = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.f7972b0 = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.f7974c0 = null;
        this.f7976d0 = 0;
        this.f7978e0 = 0;
        this.f7980f0 = 0.0f;
        this.f7982g0 = -1;
        this.f7984h0 = 0;
        this.f7986i0 = 0;
        this.f7988j0 = 0;
        this.f7990k0 = 0;
        this.f7992l0 = 0;
        this.f7994m0 = 0;
        this.f7996n0 = 0;
        float f4 = f7890A1;
        this.f8002q0 = f4;
        this.f8004r0 = f4;
        this.f8008t0 = 0;
        this.f8010u0 = 0;
        this.f8012v0 = false;
        this.f8014w0 = null;
        this.f8016x0 = null;
        this.f7940I0 = false;
        this.f7942J0 = 0;
        this.f7944K0 = 0;
        this.f7950N0 = new float[]{-1.0f, -1.0f};
        this.f7952O0 = new ConstraintWidget[]{null, null};
        this.f7954P0 = new ConstraintWidget[]{null, null};
        this.f7956Q0 = null;
        this.f7958R0 = null;
        this.f7960S0 = -1;
        this.f7962T0 = -1;
        d();
        j1(str);
    }

    public ConstraintWidget(int i4, int i5, int i6, int i7) {
        this.f7969a = false;
        this.f7971b = new p[2];
        this.f7977e = null;
        this.f7979f = null;
        this.f7981g = new boolean[]{true, true};
        this.f7983h = false;
        this.f7985i = true;
        this.f7987j = false;
        this.f7989k = true;
        this.f7991l = -1;
        this.f7993m = -1;
        this.f7995n = new s(this);
        this.f7999p = false;
        this.f8001q = false;
        this.f8003r = false;
        this.f8005s = false;
        this.f8007t = -1;
        this.f8009u = -1;
        this.f8011v = 0;
        this.f8013w = 0;
        this.f8015x = 0;
        this.f8017y = new int[2];
        this.f8019z = 0;
        this.f7923A = 0;
        this.f7925B = 1.0f;
        this.f7927C = 0;
        this.f7929D = 0;
        this.f7931E = 1.0f;
        this.f7937H = -1;
        this.f7939I = 1.0f;
        this.f7941J = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f7943K = Float.NaN;
        this.f7945L = false;
        this.f7949N = false;
        this.f7951O = 0;
        this.f7953P = 0;
        this.f7955Q = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.f7957R = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.f7959S = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.f7961T = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.f7963U = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.f7964V = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.f7965W = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.f7966X = constraintAnchor;
        this.f7967Y = new ConstraintAnchor[]{this.f7955Q, this.f7959S, this.f7957R, this.f7961T, this.f7963U, constraintAnchor};
        this.f7968Z = new ArrayList<>();
        this.f7970a0 = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.f7972b0 = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.f7974c0 = null;
        this.f7980f0 = 0.0f;
        this.f7982g0 = -1;
        this.f7988j0 = 0;
        this.f7990k0 = 0;
        this.f7992l0 = 0;
        this.f7994m0 = 0;
        this.f7996n0 = 0;
        float f4 = f7890A1;
        this.f8002q0 = f4;
        this.f8004r0 = f4;
        this.f8008t0 = 0;
        this.f8010u0 = 0;
        this.f8012v0 = false;
        this.f8014w0 = null;
        this.f8016x0 = null;
        this.f7940I0 = false;
        this.f7942J0 = 0;
        this.f7944K0 = 0;
        this.f7950N0 = new float[]{-1.0f, -1.0f};
        this.f7952O0 = new ConstraintWidget[]{null, null};
        this.f7954P0 = new ConstraintWidget[]{null, null};
        this.f7956Q0 = null;
        this.f7958R0 = null;
        this.f7960S0 = -1;
        this.f7962T0 = -1;
        this.f7984h0 = i4;
        this.f7986i0 = i5;
        this.f7976d0 = i6;
        this.f7978e0 = i7;
        d();
    }

    public ConstraintWidget(String str, int i4, int i5, int i6, int i7) {
        this(i4, i5, i6, i7);
        j1(str);
    }

    public ConstraintWidget(int i4, int i5) {
        this(0, 0, i4, i5);
    }

    public ConstraintWidget(String str, int i4, int i5) {
        this(i4, i5);
        j1(str);
    }
}
