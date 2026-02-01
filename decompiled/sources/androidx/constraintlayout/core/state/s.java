package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.utils.u;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.q;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.core.os.C0745h;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public class s {

    /* renamed from: v, reason: collision with root package name */
    public static float f7856v = Float.NaN;

    /* renamed from: a, reason: collision with root package name */
    public ConstraintWidget f7857a;

    /* renamed from: b, reason: collision with root package name */
    public int f7858b;

    /* renamed from: c, reason: collision with root package name */
    public int f7859c;

    /* renamed from: d, reason: collision with root package name */
    public int f7860d;

    /* renamed from: e, reason: collision with root package name */
    public int f7861e;

    /* renamed from: f, reason: collision with root package name */
    public float f7862f;

    /* renamed from: g, reason: collision with root package name */
    public float f7863g;

    /* renamed from: h, reason: collision with root package name */
    public float f7864h;

    /* renamed from: i, reason: collision with root package name */
    public float f7865i;

    /* renamed from: j, reason: collision with root package name */
    public float f7866j;

    /* renamed from: k, reason: collision with root package name */
    public float f7867k;

    /* renamed from: l, reason: collision with root package name */
    public float f7868l;

    /* renamed from: m, reason: collision with root package name */
    public float f7869m;

    /* renamed from: n, reason: collision with root package name */
    public float f7870n;

    /* renamed from: o, reason: collision with root package name */
    public float f7871o;

    /* renamed from: p, reason: collision with root package name */
    public float f7872p;

    /* renamed from: q, reason: collision with root package name */
    public float f7873q;

    /* renamed from: r, reason: collision with root package name */
    public int f7874r;

    /* renamed from: s, reason: collision with root package name */
    public final HashMap<String, androidx.constraintlayout.core.motion.a> f7875s;

    /* renamed from: t, reason: collision with root package name */
    public String f7876t;

    /* renamed from: u, reason: collision with root package name */
    u f7877u;

    public s() {
        this.f7857a = null;
        this.f7858b = 0;
        this.f7859c = 0;
        this.f7860d = 0;
        this.f7861e = 0;
        this.f7862f = Float.NaN;
        this.f7863g = Float.NaN;
        this.f7864h = Float.NaN;
        this.f7865i = Float.NaN;
        this.f7866j = Float.NaN;
        this.f7867k = Float.NaN;
        this.f7868l = Float.NaN;
        this.f7869m = Float.NaN;
        this.f7870n = Float.NaN;
        this.f7871o = Float.NaN;
        this.f7872p = Float.NaN;
        this.f7873q = Float.NaN;
        this.f7874r = 0;
        this.f7875s = new HashMap<>();
        this.f7876t = null;
    }

    private static void a(StringBuilder sb, String str, float f4) {
        if (Float.isNaN(f4)) {
            return;
        }
        sb.append(str);
        sb.append(": ");
        sb.append(f4);
        sb.append(",\n");
    }

    private static void b(StringBuilder sb, String str, int i4) {
        sb.append(str);
        sb.append(": ");
        sb.append(i4);
        sb.append(",\n");
    }

    private static float n(float f4, float f5, float f6, float f7) {
        boolean isNaN = Float.isNaN(f4);
        boolean isNaN2 = Float.isNaN(f5);
        if (isNaN && isNaN2) {
            return Float.NaN;
        }
        if (isNaN) {
            f4 = f6;
        }
        if (isNaN2) {
            f5 = f6;
        }
        return f4 + (f7 * (f5 - f4));
    }

    public static void o(int i4, int i5, s sVar, s sVar2, s sVar3, q qVar, float f4) {
        int i6;
        float f5;
        int i7;
        int i8;
        float f6;
        float f7;
        float f8;
        int i9;
        float f9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10 = 100.0f * f4;
        int i16 = (int) f10;
        int i17 = sVar2.f7858b;
        int i18 = sVar2.f7859c;
        int i19 = sVar3.f7858b;
        int i20 = sVar3.f7859c;
        int i21 = sVar2.f7860d - i17;
        int i22 = sVar2.f7861e - i18;
        int i23 = sVar3.f7860d - i19;
        int i24 = sVar3.f7861e - i20;
        float f11 = sVar2.f7872p;
        float f12 = sVar3.f7872p;
        if (sVar2.f7874r == 8) {
            i18 -= (int) (i24 / 2.0f);
            i8 = i17 - ((int) (i23 / 2.0f));
            if (Float.isNaN(f11)) {
                i7 = i24;
                i6 = i23;
                f5 = 0.0f;
            } else {
                f5 = f11;
                i6 = i23;
                i7 = i24;
            }
        } else {
            i6 = i21;
            f5 = f11;
            i7 = i22;
            i8 = i17;
        }
        if (sVar3.f7874r == 8) {
            i19 -= (int) (i6 / 2.0f);
            i20 -= (int) (i7 / 2.0f);
            i23 = i6;
            i24 = i7;
            if (Float.isNaN(f12)) {
                f12 = 0.0f;
            }
        }
        if (Float.isNaN(f5) && !Float.isNaN(f12)) {
            f5 = 1.0f;
        }
        if (!Float.isNaN(f5) && Float.isNaN(f12)) {
            f12 = 1.0f;
        }
        if (sVar2.f7874r == 4) {
            f7 = f12;
            f6 = 0.0f;
        } else {
            f6 = f5;
            f7 = f12;
        }
        if (sVar3.f7874r == 4) {
            f8 = 0.0f;
        } else {
            f8 = f7;
        }
        if (sVar.f7857a != null && qVar.S()) {
            q.a A3 = qVar.A(sVar.f7857a.f7997o, i16);
            i9 = i18;
            q.a z3 = qVar.z(sVar.f7857a.f7997o, i16);
            if (A3 == z3) {
                z3 = null;
            }
            if (A3 != null) {
                i8 = (int) (A3.f7788d * i4);
                i13 = i19;
                i12 = i5;
                i9 = (int) (A3.f7789e * i12);
                i14 = A3.f7785a;
            } else {
                i12 = i5;
                i13 = i19;
                i14 = 0;
            }
            i10 = i8;
            if (z3 != null) {
                i11 = (int) (z3.f7788d * i4);
                i20 = (int) (z3.f7789e * i12);
                i15 = z3.f7785a;
            } else {
                i15 = 100;
                i11 = i13;
            }
            f9 = (f10 - i14) / (i15 - i14);
        } else {
            i9 = i18;
            f9 = f4;
            i10 = i8;
            i11 = i19;
        }
        int i25 = i9;
        sVar.f7857a = sVar2.f7857a;
        int i26 = (int) (i10 + ((i11 - i10) * f9));
        sVar.f7858b = i26;
        int i27 = (int) (i25 + (f9 * (i20 - i25)));
        sVar.f7859c = i27;
        float f13 = 1.0f - f4;
        sVar.f7860d = i26 + ((int) ((i6 * f13) + (i23 * f4)));
        sVar.f7861e = i27 + ((int) ((f13 * i7) + (i24 * f4)));
        sVar.f7862f = n(sVar2.f7862f, sVar3.f7862f, 0.5f, f4);
        sVar.f7863g = n(sVar2.f7863g, sVar3.f7863g, 0.5f, f4);
        sVar.f7864h = n(sVar2.f7864h, sVar3.f7864h, 0.0f, f4);
        sVar.f7865i = n(sVar2.f7865i, sVar3.f7865i, 0.0f, f4);
        sVar.f7866j = n(sVar2.f7866j, sVar3.f7866j, 0.0f, f4);
        sVar.f7870n = n(sVar2.f7870n, sVar3.f7870n, 1.0f, f4);
        sVar.f7871o = n(sVar2.f7871o, sVar3.f7871o, 1.0f, f4);
        sVar.f7867k = n(sVar2.f7867k, sVar3.f7867k, 0.0f, f4);
        sVar.f7868l = n(sVar2.f7868l, sVar3.f7868l, 0.0f, f4);
        sVar.f7869m = n(sVar2.f7869m, sVar3.f7869m, 0.0f, f4);
        sVar.f7872p = n(f6, f8, 1.0f, f4);
        Set<String> keySet = sVar3.f7875s.keySet();
        sVar.f7875s.clear();
        for (String str : keySet) {
            if (sVar2.f7875s.containsKey(str)) {
                androidx.constraintlayout.core.motion.a aVar = sVar2.f7875s.get(str);
                androidx.constraintlayout.core.motion.a aVar2 = sVar3.f7875s.get(str);
                androidx.constraintlayout.core.motion.a aVar3 = new androidx.constraintlayout.core.motion.a(aVar);
                sVar.f7875s.put(str, aVar3);
                if (aVar.r() == 1) {
                    aVar3.y(Float.valueOf(n(aVar.n(), aVar2.n(), 0.0f, f4)));
                } else {
                    int r4 = aVar.r();
                    float[] fArr = new float[r4];
                    float[] fArr2 = new float[r4];
                    aVar.o(fArr);
                    aVar2.o(fArr2);
                    for (int i28 = 0; i28 < r4; i28++) {
                        fArr[i28] = n(fArr[i28], fArr2[i28], 0.0f, f4);
                        aVar3.z(fArr);
                    }
                }
            }
        }
    }

    private void v(StringBuilder sb, ConstraintAnchor.Type type) {
        ConstraintAnchor r4 = this.f7857a.r(type);
        if (r4 != null && r4.f7885f != null) {
            sb.append("Anchor");
            sb.append(type.name());
            sb.append(": ['");
            String str = r4.f7885f.i().f7997o;
            if (str == null) {
                str = "#PARENT";
            }
            sb.append(str);
            sb.append("', '");
            sb.append(r4.f7885f.l().name());
            sb.append("', '");
            sb.append(r4.f7886g);
            sb.append("'],\n");
        }
    }

    public void A(CustomAttribute customAttribute, float[] fArr) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B(u uVar) {
        this.f7877u = uVar;
    }

    public boolean C(String str, androidx.constraintlayout.core.parser.c cVar) throws CLParsingException {
        str.hashCode();
        char c4 = 65535;
        switch (str.hashCode()) {
            case -1881940865:
                if (str.equals("phone_orientation")) {
                    c4 = 0;
                    break;
                }
                break;
            case -1383228885:
                if (str.equals("bottom")) {
                    c4 = 1;
                    break;
                }
                break;
            case -1349088399:
                if (str.equals("custom")) {
                    c4 = 2;
                    break;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c4 = 3;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c4 = 4;
                    break;
                }
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c4 = 5;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c4 = 6;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c4 = 7;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c4 = '\b';
                    break;
                }
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c4 = '\t';
                    break;
                }
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c4 = '\n';
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c4 = 11;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c4 = '\f';
                    break;
                }
                break;
            case 115029:
                if (str.equals("top")) {
                    c4 = '\r';
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c4 = 14;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c4 = 15;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c4 = 16;
                    break;
                }
                break;
            case 642850769:
                if (str.equals("interpolatedPos")) {
                    c4 = 17;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                f7856v = cVar.j();
                return true;
            case 1:
                this.f7861e = cVar.k();
                return true;
            case 2:
                r(cVar);
                return true;
            case 3:
                this.f7864h = cVar.j();
                return true;
            case 4:
                this.f7865i = cVar.j();
                return true;
            case 5:
                this.f7866j = cVar.j();
                return true;
            case 6:
                this.f7867k = cVar.j();
                return true;
            case 7:
                this.f7868l = cVar.j();
                return true;
            case '\b':
                this.f7869m = cVar.j();
                return true;
            case '\t':
                this.f7862f = cVar.j();
                return true;
            case '\n':
                this.f7863g = cVar.j();
                return true;
            case 11:
                this.f7870n = cVar.j();
                return true;
            case '\f':
                this.f7871o = cVar.j();
                return true;
            case '\r':
                this.f7859c = cVar.k();
                return true;
            case 14:
                this.f7858b = cVar.k();
                return true;
            case 15:
                this.f7872p = cVar.j();
                return true;
            case 16:
                this.f7860d = cVar.k();
                return true;
            case 17:
                this.f7873q = cVar.j();
                return true;
            default:
                return false;
        }
    }

    public s D() {
        ConstraintWidget constraintWidget = this.f7857a;
        if (constraintWidget != null) {
            this.f7858b = constraintWidget.L();
            this.f7859c = this.f7857a.e0();
            this.f7860d = this.f7857a.X();
            this.f7861e = this.f7857a.v();
            F(this.f7857a.f7995n);
        }
        return this;
    }

    public s E(ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return this;
        }
        this.f7857a = constraintWidget;
        D();
        return this;
    }

    public void F(s sVar) {
        this.f7862f = sVar.f7862f;
        this.f7863g = sVar.f7863g;
        this.f7864h = sVar.f7864h;
        this.f7865i = sVar.f7865i;
        this.f7866j = sVar.f7866j;
        this.f7867k = sVar.f7867k;
        this.f7868l = sVar.f7868l;
        this.f7869m = sVar.f7869m;
        this.f7870n = sVar.f7870n;
        this.f7871o = sVar.f7871o;
        this.f7872p = sVar.f7872p;
        this.f7874r = sVar.f7874r;
        B(sVar.f7877u);
        this.f7875s.clear();
        for (androidx.constraintlayout.core.motion.a aVar : sVar.f7875s.values()) {
            this.f7875s.put(aVar.k(), aVar.d());
        }
    }

    public int G() {
        return Math.max(0, this.f7860d - this.f7858b);
    }

    public void c(String str, int i4) {
        x(str, v.b.f7410l, i4);
    }

    public void d(String str, float f4) {
        w(str, v.b.f7409k, f4);
    }

    public float e() {
        return this.f7858b + ((this.f7860d - r0) / 2.0f);
    }

    public float f() {
        return this.f7859c + ((this.f7861e - r0) / 2.0f);
    }

    public androidx.constraintlayout.core.motion.a g(String str) {
        return this.f7875s.get(str);
    }

    public Set<String> h() {
        return this.f7875s.keySet();
    }

    public int i(String str) {
        if (this.f7875s.containsKey(str)) {
            return this.f7875s.get(str).g();
        }
        return -21880;
    }

    public float j(String str) {
        if (this.f7875s.containsKey(str)) {
            return this.f7875s.get(str).h();
        }
        return Float.NaN;
    }

    public String k() {
        ConstraintWidget constraintWidget = this.f7857a;
        if (constraintWidget == null) {
            return C0745h.f12738b;
        }
        return constraintWidget.f7997o;
    }

    public u l() {
        return this.f7877u;
    }

    public int m() {
        return Math.max(0, this.f7861e - this.f7859c);
    }

    public boolean p() {
        if (Float.isNaN(this.f7864h) && Float.isNaN(this.f7865i) && Float.isNaN(this.f7866j) && Float.isNaN(this.f7867k) && Float.isNaN(this.f7868l) && Float.isNaN(this.f7869m) && Float.isNaN(this.f7870n) && Float.isNaN(this.f7871o) && Float.isNaN(this.f7872p)) {
            return true;
        }
        return false;
    }

    void q(String str) {
        String str2;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str3 = (".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + " " + (hashCode() % 1000);
        ConstraintWidget constraintWidget = this.f7857a;
        if (constraintWidget != null) {
            str2 = str3 + "/" + (constraintWidget.hashCode() % 1000);
        } else {
            str2 = str3 + "/NULL";
        }
        System.out.println(str2 + " " + str);
    }

    void r(androidx.constraintlayout.core.parser.c cVar) throws CLParsingException {
        androidx.constraintlayout.core.parser.f fVar = (androidx.constraintlayout.core.parser.f) cVar;
        int size = fVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            androidx.constraintlayout.core.parser.c e02 = ((androidx.constraintlayout.core.parser.d) fVar.z(i4)).e0();
            String c4 = e02.c();
            if (c4.matches("#[0-9a-fA-F]+")) {
                x(this.f7876t, v.b.f7410l, Integer.parseInt(c4.substring(1), 16));
            } else if (e02 instanceof androidx.constraintlayout.core.parser.e) {
                w(this.f7876t, v.b.f7409k, e02.j());
            } else {
                y(this.f7876t, v.b.f7411m, c4);
            }
        }
    }

    void s() {
        String str;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = (".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + " " + (hashCode() % 1000);
        ConstraintWidget constraintWidget = this.f7857a;
        if (constraintWidget != null) {
            str = str2 + "/" + (constraintWidget.hashCode() % 1000) + " ";
        } else {
            str = str2 + "/NULL ";
        }
        HashMap<String, androidx.constraintlayout.core.motion.a> hashMap = this.f7875s;
        if (hashMap != null) {
            for (String str3 : hashMap.keySet()) {
                System.out.println(str + this.f7875s.get(str3).toString());
            }
        }
    }

    public StringBuilder t(StringBuilder sb) {
        return u(sb, false);
    }

    public StringBuilder u(StringBuilder sb, boolean z3) {
        sb.append("{\n");
        b(sb, "left", this.f7858b);
        b(sb, "top", this.f7859c);
        b(sb, "right", this.f7860d);
        b(sb, "bottom", this.f7861e);
        a(sb, "pivotX", this.f7862f);
        a(sb, "pivotY", this.f7863g);
        a(sb, "rotationX", this.f7864h);
        a(sb, "rotationY", this.f7865i);
        a(sb, "rotationZ", this.f7866j);
        a(sb, "translationX", this.f7867k);
        a(sb, "translationY", this.f7868l);
        a(sb, "translationZ", this.f7869m);
        a(sb, "scaleX", this.f7870n);
        a(sb, "scaleY", this.f7871o);
        a(sb, "alpha", this.f7872p);
        b(sb, "visibility", this.f7874r);
        a(sb, "interpolatedPos", this.f7873q);
        if (this.f7857a != null) {
            for (ConstraintAnchor.Type type : ConstraintAnchor.Type.values()) {
                v(sb, type);
            }
        }
        if (z3) {
            a(sb, "phone_orientation", f7856v);
        }
        if (z3) {
            a(sb, "phone_orientation", f7856v);
        }
        if (this.f7875s.size() != 0) {
            sb.append("custom : {\n");
            for (String str : this.f7875s.keySet()) {
                androidx.constraintlayout.core.motion.a aVar = this.f7875s.get(str);
                sb.append(str);
                sb.append(": ");
                switch (aVar.m()) {
                    case 900:
                        sb.append(aVar.i());
                        sb.append(",\n");
                        break;
                    case v.b.f7409k /* 901 */:
                    case v.b.f7413o /* 905 */:
                        sb.append(aVar.h());
                        sb.append(",\n");
                        break;
                    case v.b.f7410l /* 902 */:
                        sb.append("'");
                        sb.append(androidx.constraintlayout.core.motion.a.c(aVar.i()));
                        sb.append("',\n");
                        break;
                    case v.b.f7411m /* 903 */:
                        sb.append("'");
                        sb.append(aVar.l());
                        sb.append("',\n");
                        break;
                    case v.b.f7412n /* 904 */:
                        sb.append("'");
                        sb.append(aVar.f());
                        sb.append("',\n");
                        break;
                }
            }
            sb.append("}\n");
        }
        sb.append("}\n");
        return sb;
    }

    public void w(String str, int i4, float f4) {
        if (this.f7875s.containsKey(str)) {
            this.f7875s.get(str).u(f4);
        } else {
            this.f7875s.put(str, new androidx.constraintlayout.core.motion.a(str, i4, f4));
        }
    }

    public void x(String str, int i4, int i5) {
        if (this.f7875s.containsKey(str)) {
            this.f7875s.get(str).v(i5);
        } else {
            this.f7875s.put(str, new androidx.constraintlayout.core.motion.a(str, i4, i5));
        }
    }

    public void y(String str, int i4, String str2) {
        if (this.f7875s.containsKey(str)) {
            this.f7875s.get(str).x(str2);
        } else {
            this.f7875s.put(str, new androidx.constraintlayout.core.motion.a(str, i4, str2));
        }
    }

    public void z(String str, int i4, boolean z3) {
        if (this.f7875s.containsKey(str)) {
            this.f7875s.get(str).t(z3);
        } else {
            this.f7875s.put(str, new androidx.constraintlayout.core.motion.a(str, i4, z3));
        }
    }

    public s(ConstraintWidget constraintWidget) {
        this.f7857a = null;
        this.f7858b = 0;
        this.f7859c = 0;
        this.f7860d = 0;
        this.f7861e = 0;
        this.f7862f = Float.NaN;
        this.f7863g = Float.NaN;
        this.f7864h = Float.NaN;
        this.f7865i = Float.NaN;
        this.f7866j = Float.NaN;
        this.f7867k = Float.NaN;
        this.f7868l = Float.NaN;
        this.f7869m = Float.NaN;
        this.f7870n = Float.NaN;
        this.f7871o = Float.NaN;
        this.f7872p = Float.NaN;
        this.f7873q = Float.NaN;
        this.f7874r = 0;
        this.f7875s = new HashMap<>();
        this.f7876t = null;
        this.f7857a = constraintWidget;
    }

    public s(s sVar) {
        this.f7857a = null;
        this.f7858b = 0;
        this.f7859c = 0;
        this.f7860d = 0;
        this.f7861e = 0;
        this.f7862f = Float.NaN;
        this.f7863g = Float.NaN;
        this.f7864h = Float.NaN;
        this.f7865i = Float.NaN;
        this.f7866j = Float.NaN;
        this.f7867k = Float.NaN;
        this.f7868l = Float.NaN;
        this.f7869m = Float.NaN;
        this.f7870n = Float.NaN;
        this.f7871o = Float.NaN;
        this.f7872p = Float.NaN;
        this.f7873q = Float.NaN;
        this.f7874r = 0;
        this.f7875s = new HashMap<>();
        this.f7876t = null;
        this.f7857a = sVar.f7857a;
        this.f7858b = sVar.f7858b;
        this.f7859c = sVar.f7859c;
        this.f7860d = sVar.f7860d;
        this.f7861e = sVar.f7861e;
        F(sVar);
    }
}
