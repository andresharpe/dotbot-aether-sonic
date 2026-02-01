package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.core.state.s;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Set;

/* loaded from: classes.dex */
public class e implements v {

    /* renamed from: A, reason: collision with root package name */
    public static final int f6894A = 0;

    /* renamed from: B, reason: collision with root package name */
    public static final int f6895B = 0;

    /* renamed from: C, reason: collision with root package name */
    public static final int f6896C = -1;

    /* renamed from: D, reason: collision with root package name */
    public static final int f6897D = -1;

    /* renamed from: E, reason: collision with root package name */
    public static final int f6898E = -2;

    /* renamed from: F, reason: collision with root package name */
    public static final int f6899F = Integer.MIN_VALUE;

    /* renamed from: G, reason: collision with root package name */
    public static final int f6900G = 1;

    /* renamed from: m, reason: collision with root package name */
    public static final int f6901m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static final int f6902n = 1;

    /* renamed from: o, reason: collision with root package name */
    private static final int f6903o = -1;

    /* renamed from: p, reason: collision with root package name */
    private static final int f6904p = -2;

    /* renamed from: q, reason: collision with root package name */
    public static final int f6905q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static final int f6906r = 4;

    /* renamed from: s, reason: collision with root package name */
    private static final int f6907s = -3;

    /* renamed from: t, reason: collision with root package name */
    private static final int f6908t = -4;

    /* renamed from: u, reason: collision with root package name */
    public static final int f6909u = 0;

    /* renamed from: v, reason: collision with root package name */
    public static final int f6910v = 1;

    /* renamed from: w, reason: collision with root package name */
    public static final int f6911w = 2;

    /* renamed from: x, reason: collision with root package name */
    public static final int f6912x = 3;

    /* renamed from: y, reason: collision with root package name */
    public static final int f6913y = 4;

    /* renamed from: z, reason: collision with root package name */
    public static final int f6914z = -1;

    /* renamed from: h, reason: collision with root package name */
    s f6915h;

    /* renamed from: i, reason: collision with root package name */
    a f6916i;

    /* renamed from: j, reason: collision with root package name */
    b f6917j;

    /* renamed from: k, reason: collision with root package name */
    private float f6918k;

    /* renamed from: l, reason: collision with root package name */
    float f6919l;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: n, reason: collision with root package name */
        private static final int f6920n = -2;

        /* renamed from: o, reason: collision with root package name */
        private static final int f6921o = -1;

        /* renamed from: p, reason: collision with root package name */
        private static final int f6922p = -3;

        /* renamed from: a, reason: collision with root package name */
        public String f6923a = null;

        /* renamed from: b, reason: collision with root package name */
        public int f6924b = 0;

        /* renamed from: c, reason: collision with root package name */
        public String f6925c = null;

        /* renamed from: d, reason: collision with root package name */
        public int f6926d = -1;

        /* renamed from: e, reason: collision with root package name */
        public int f6927e = 0;

        /* renamed from: f, reason: collision with root package name */
        public float f6928f = Float.NaN;

        /* renamed from: g, reason: collision with root package name */
        public int f6929g = -1;

        /* renamed from: h, reason: collision with root package name */
        public float f6930h = Float.NaN;

        /* renamed from: i, reason: collision with root package name */
        public float f6931i = Float.NaN;

        /* renamed from: j, reason: collision with root package name */
        public int f6932j = -1;

        /* renamed from: k, reason: collision with root package name */
        public String f6933k = null;

        /* renamed from: l, reason: collision with root package name */
        public int f6934l = -3;

        /* renamed from: m, reason: collision with root package name */
        public int f6935m = -1;
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f6936a = 4;

        /* renamed from: b, reason: collision with root package name */
        public int f6937b = 0;

        /* renamed from: c, reason: collision with root package name */
        public float f6938c = 1.0f;

        /* renamed from: d, reason: collision with root package name */
        public float f6939d = Float.NaN;
    }

    public e() {
        this.f6915h = new s();
        this.f6916i = new a();
        this.f6917j = new b();
    }

    public float A(int i4) {
        switch (i4) {
            case 303:
                return this.f6915h.f7872p;
            case 304:
                return this.f6915h.f7867k;
            case 305:
                return this.f6915h.f7868l;
            case 306:
                return this.f6915h.f7869m;
            case 307:
            default:
                return Float.NaN;
            case 308:
                return this.f6915h.f7864h;
            case 309:
                return this.f6915h.f7865i;
            case 310:
                return this.f6915h.f7866j;
            case 311:
                return this.f6915h.f7870n;
            case 312:
                return this.f6915h.f7871o;
            case 313:
                return this.f6915h.f7862f;
            case 314:
                return this.f6915h.f7863g;
            case 315:
                return this.f6918k;
            case v.a.f7389q /* 316 */:
                return this.f6919l;
        }
    }

    public int B() {
        return this.f6917j.f6936a;
    }

    public s C() {
        return this.f6915h;
    }

    public int D() {
        s sVar = this.f6915h;
        return sVar.f7860d - sVar.f7858b;
    }

    public int E() {
        return this.f6915h.f7858b;
    }

    public int F() {
        return this.f6915h.f7859c;
    }

    public void G(int i4, int i5, int i6, int i7) {
        H(i4, i5, i6, i7);
    }

    public void H(int i4, int i5, int i6, int i7) {
        if (this.f6915h == null) {
            this.f6915h = new s((ConstraintWidget) null);
        }
        s sVar = this.f6915h;
        sVar.f7859c = i5;
        sVar.f7858b = i4;
        sVar.f7860d = i6;
        sVar.f7861e = i7;
    }

    public void I(String str, int i4, float f4) {
        this.f6915h.w(str, i4, f4);
    }

    public void J(String str, int i4, int i5) {
        this.f6915h.x(str, i4, i5);
    }

    public void K(String str, int i4, String str2) {
        this.f6915h.y(str, i4, str2);
    }

    public void L(String str, int i4, boolean z3) {
        this.f6915h.z(str, i4, z3);
    }

    public void M(CustomAttribute customAttribute, float[] fArr) {
        this.f6915h.w(customAttribute.f6744b, v.b.f7409k, fArr[0]);
    }

    public void N(float f4) {
        this.f6915h.f7862f = f4;
    }

    public void O(float f4) {
        this.f6915h.f7863g = f4;
    }

    public void P(float f4) {
        this.f6915h.f7864h = f4;
    }

    public void Q(float f4) {
        this.f6915h.f7865i = f4;
    }

    public void R(float f4) {
        this.f6915h.f7866j = f4;
    }

    public void S(float f4) {
        this.f6915h.f7870n = f4;
    }

    public void T(float f4) {
        this.f6915h.f7871o = f4;
    }

    public void U(float f4) {
        this.f6915h.f7867k = f4;
    }

    public void V(float f4) {
        this.f6915h.f7868l = f4;
    }

    public void W(float f4) {
        this.f6915h.f7869m = f4;
    }

    public boolean X(int i4, float f4) {
        switch (i4) {
            case 303:
                this.f6915h.f7872p = f4;
                return true;
            case 304:
                this.f6915h.f7867k = f4;
                return true;
            case 305:
                this.f6915h.f7868l = f4;
                return true;
            case 306:
                this.f6915h.f7869m = f4;
                return true;
            case 307:
            default:
                return false;
            case 308:
                this.f6915h.f7864h = f4;
                return true;
            case 309:
                this.f6915h.f7865i = f4;
                return true;
            case 310:
                this.f6915h.f7866j = f4;
                return true;
            case 311:
                this.f6915h.f7870n = f4;
                return true;
            case 312:
                this.f6915h.f7871o = f4;
                return true;
            case 313:
                this.f6915h.f7862f = f4;
                return true;
            case 314:
                this.f6915h.f7863g = f4;
                return true;
            case 315:
                this.f6918k = f4;
                return true;
            case v.a.f7389q /* 316 */:
                this.f6919l = f4;
                return true;
        }
    }

    public boolean Y(int i4, float f4) {
        switch (i4) {
            case 600:
                this.f6916i.f6928f = f4;
                return true;
            case 601:
                this.f6916i.f6930h = f4;
                return true;
            case v.e.f7486r /* 602 */:
                this.f6916i.f6931i = f4;
                return true;
            default:
                return false;
        }
    }

    public boolean Z(int i4, int i5) {
        switch (i4) {
            case v.e.f7490v /* 606 */:
                this.f6916i.f6924b = i5;
                return true;
            case v.e.f7491w /* 607 */:
                this.f6916i.f6926d = i5;
                return true;
            case v.e.f7492x /* 608 */:
                this.f6916i.f6927e = i5;
                return true;
            case v.e.f7493y /* 609 */:
                this.f6916i.f6929g = i5;
                return true;
            case v.e.f7494z /* 610 */:
                this.f6916i.f6932j = i5;
                return true;
            case v.e.f7467A /* 611 */:
                this.f6916i.f6934l = i5;
                return true;
            case v.e.f7468B /* 612 */:
                this.f6916i.f6935m = i5;
                return true;
            default:
                return false;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public int a(String str) {
        int a4 = v.a.a(str);
        if (a4 != -1) {
            return a4;
        }
        return v.e.a(str);
    }

    public boolean a0(int i4, String str) {
        if (i4 != 603) {
            if (i4 != 604) {
                return false;
            }
            this.f6916i.f6933k = str;
            return true;
        }
        this.f6916i.f6925c = str;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public boolean b(int i4, int i5) {
        if (X(i4, i5)) {
            return true;
        }
        return Z(i4, i5);
    }

    public void b0(int i4) {
        this.f6917j.f6936a = i4;
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public boolean c(int i4, float f4) {
        if (X(i4, f4)) {
            return true;
        }
        return Y(i4, f4);
    }

    public void c0(v vVar) {
        if (this.f6915h.l() != null) {
            this.f6915h.l().g(vVar);
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public boolean d(int i4, String str) {
        if (i4 == 605) {
            this.f6916i.f6923a = str;
            return true;
        }
        return a0(i4, str);
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public boolean e(int i4, boolean z3) {
        return false;
    }

    public e f(int i4) {
        return null;
    }

    public float g() {
        return this.f6917j.f6938c;
    }

    public int h() {
        return this.f6915h.f7861e;
    }

    public androidx.constraintlayout.core.motion.a i(String str) {
        return this.f6915h.g(str);
    }

    public Set<String> j() {
        return this.f6915h.h();
    }

    public int k() {
        s sVar = this.f6915h;
        return sVar.f7861e - sVar.f7859c;
    }

    public int l() {
        return this.f6915h.f7858b;
    }

    public String m() {
        return this.f6915h.k();
    }

    public e n() {
        return null;
    }

    public float o() {
        return this.f6915h.f7862f;
    }

    public float p() {
        return this.f6915h.f7863g;
    }

    public int q() {
        return this.f6915h.f7860d;
    }

    public float r() {
        return this.f6915h.f7864h;
    }

    public float s() {
        return this.f6915h.f7865i;
    }

    public float t() {
        return this.f6915h.f7866j;
    }

    public String toString() {
        s sVar = this.f6915h;
        return sVar.f7858b + ", " + sVar.f7859c + ", " + sVar.f7860d + ", " + sVar.f7861e;
    }

    public float u() {
        return this.f6915h.f7870n;
    }

    public float v() {
        return this.f6915h.f7871o;
    }

    public int w() {
        return this.f6915h.f7859c;
    }

    public float x() {
        return this.f6915h.f7867k;
    }

    public float y() {
        return this.f6915h.f7868l;
    }

    public float z() {
        return this.f6915h.f7869m;
    }

    public e(s sVar) {
        this.f6915h = new s();
        this.f6916i = new a();
        this.f6917j = new b();
        this.f6915h = sVar;
    }
}
