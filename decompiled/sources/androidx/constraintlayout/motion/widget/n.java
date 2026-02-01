package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.utils.d;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class n implements Comparable<n> {

    /* renamed from: h0, reason: collision with root package name */
    public static final String f8804h0 = "MotionPaths";

    /* renamed from: i0, reason: collision with root package name */
    public static final boolean f8805i0 = false;

    /* renamed from: j0, reason: collision with root package name */
    static final int f8806j0 = 1;

    /* renamed from: k0, reason: collision with root package name */
    static final int f8807k0 = 2;

    /* renamed from: l0, reason: collision with root package name */
    static String[] f8808l0 = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: G, reason: collision with root package name */
    int f8811G;

    /* renamed from: X, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.d f8828X;

    /* renamed from: Z, reason: collision with root package name */
    private float f8830Z;

    /* renamed from: a0, reason: collision with root package name */
    private float f8831a0;

    /* renamed from: b0, reason: collision with root package name */
    private float f8832b0;

    /* renamed from: c0, reason: collision with root package name */
    private float f8833c0;

    /* renamed from: d0, reason: collision with root package name */
    private float f8834d0;

    /* renamed from: E, reason: collision with root package name */
    public float f8809E = 0.0f;

    /* renamed from: F, reason: collision with root package name */
    int f8810F = 0;

    /* renamed from: H, reason: collision with root package name */
    LinkedHashMap<String, ConstraintAttribute> f8812H = new LinkedHashMap<>();

    /* renamed from: I, reason: collision with root package name */
    int f8813I = 0;

    /* renamed from: J, reason: collision with root package name */
    double[] f8814J = new double[18];

    /* renamed from: K, reason: collision with root package name */
    double[] f8815K = new double[18];

    /* renamed from: L, reason: collision with root package name */
    private float f8816L = 1.0f;

    /* renamed from: M, reason: collision with root package name */
    private boolean f8817M = false;

    /* renamed from: N, reason: collision with root package name */
    private float f8818N = 0.0f;

    /* renamed from: O, reason: collision with root package name */
    private float f8819O = 0.0f;

    /* renamed from: P, reason: collision with root package name */
    private float f8820P = 0.0f;

    /* renamed from: Q, reason: collision with root package name */
    private float f8821Q = 1.0f;

    /* renamed from: R, reason: collision with root package name */
    private float f8822R = 1.0f;

    /* renamed from: S, reason: collision with root package name */
    private float f8823S = Float.NaN;

    /* renamed from: T, reason: collision with root package name */
    private float f8824T = Float.NaN;

    /* renamed from: U, reason: collision with root package name */
    private float f8825U = 0.0f;

    /* renamed from: V, reason: collision with root package name */
    private float f8826V = 0.0f;

    /* renamed from: W, reason: collision with root package name */
    private float f8827W = 0.0f;

    /* renamed from: Y, reason: collision with root package name */
    private int f8829Y = 0;

    /* renamed from: e0, reason: collision with root package name */
    private float f8835e0 = Float.NaN;

    /* renamed from: f0, reason: collision with root package name */
    private float f8836f0 = Float.NaN;

    /* renamed from: g0, reason: collision with root package name */
    private int f8837g0 = -1;

    private boolean i(float f4, float f5) {
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
    public void b(HashMap<String, androidx.constraintlayout.motion.utils.d> hashMap, int i4) {
        for (String str : hashMap.keySet()) {
            androidx.constraintlayout.motion.utils.d dVar = hashMap.get(str);
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
                case -1225497657:
                    if (str.equals("translationX")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c4 = 3;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c4 = 4;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c4 = 5;
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c4 = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c4 = 7;
                        break;
                    }
                    break;
                case -760884510:
                    if (str.equals(f.f8541l)) {
                        c4 = '\b';
                        break;
                    }
                    break;
                case -760884509:
                    if (str.equals(f.f8542m)) {
                        c4 = '\t';
                        break;
                    }
                    break;
                case -40300674:
                    if (str.equals(f.f8538i)) {
                        c4 = '\n';
                        break;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c4 = 11;
                        break;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        c4 = '\f';
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c4 = '\r';
                        break;
                    }
                    break;
            }
            float f4 = 1.0f;
            float f5 = 0.0f;
            switch (c4) {
                case 0:
                    if (!Float.isNaN(this.f8820P)) {
                        f5 = this.f8820P;
                    }
                    dVar.g(i4, f5);
                    break;
                case 1:
                    if (!Float.isNaN(this.f8809E)) {
                        f5 = this.f8809E;
                    }
                    dVar.g(i4, f5);
                    break;
                case 2:
                    if (!Float.isNaN(this.f8825U)) {
                        f5 = this.f8825U;
                    }
                    dVar.g(i4, f5);
                    break;
                case 3:
                    if (!Float.isNaN(this.f8826V)) {
                        f5 = this.f8826V;
                    }
                    dVar.g(i4, f5);
                    break;
                case 4:
                    if (!Float.isNaN(this.f8827W)) {
                        f5 = this.f8827W;
                    }
                    dVar.g(i4, f5);
                    break;
                case 5:
                    if (!Float.isNaN(this.f8836f0)) {
                        f5 = this.f8836f0;
                    }
                    dVar.g(i4, f5);
                    break;
                case 6:
                    if (!Float.isNaN(this.f8821Q)) {
                        f4 = this.f8821Q;
                    }
                    dVar.g(i4, f4);
                    break;
                case 7:
                    if (!Float.isNaN(this.f8822R)) {
                        f4 = this.f8822R;
                    }
                    dVar.g(i4, f4);
                    break;
                case '\b':
                    if (!Float.isNaN(this.f8823S)) {
                        f5 = this.f8823S;
                    }
                    dVar.g(i4, f5);
                    break;
                case '\t':
                    if (!Float.isNaN(this.f8824T)) {
                        f5 = this.f8824T;
                    }
                    dVar.g(i4, f5);
                    break;
                case '\n':
                    if (!Float.isNaN(this.f8819O)) {
                        f5 = this.f8819O;
                    }
                    dVar.g(i4, f5);
                    break;
                case 11:
                    if (!Float.isNaN(this.f8818N)) {
                        f5 = this.f8818N;
                    }
                    dVar.g(i4, f5);
                    break;
                case '\f':
                    if (!Float.isNaN(this.f8835e0)) {
                        f5 = this.f8835e0;
                    }
                    dVar.g(i4, f5);
                    break;
                case '\r':
                    if (!Float.isNaN(this.f8816L)) {
                        f4 = this.f8816L;
                    }
                    dVar.g(i4, f4);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.f8812H.containsKey(str2)) {
                            ConstraintAttribute constraintAttribute = this.f8812H.get(str2);
                            if (dVar instanceof d.b) {
                                ((d.b) dVar).n(i4, constraintAttribute);
                                break;
                            } else {
                                Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i4 + ", value" + constraintAttribute.k() + dVar);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        Log.e("MotionPaths", "UNKNOWN spline " + str);
                        break;
                    }
            }
        }
    }

    public void e(View view) {
        float alpha;
        this.f8811G = view.getVisibility();
        if (view.getVisibility() != 0) {
            alpha = 0.0f;
        } else {
            alpha = view.getAlpha();
        }
        this.f8816L = alpha;
        this.f8817M = false;
        this.f8818N = view.getElevation();
        this.f8819O = view.getRotation();
        this.f8820P = view.getRotationX();
        this.f8809E = view.getRotationY();
        this.f8821Q = view.getScaleX();
        this.f8822R = view.getScaleY();
        this.f8823S = view.getPivotX();
        this.f8824T = view.getPivotY();
        this.f8825U = view.getTranslationX();
        this.f8826V = view.getTranslationY();
        this.f8827W = view.getTranslationZ();
    }

    public void f(d.a aVar) {
        float f4;
        d.C0071d c0071d = aVar.f9838c;
        int i4 = c0071d.f10030c;
        this.f8810F = i4;
        int i5 = c0071d.f10029b;
        this.f8811G = i5;
        if (i5 != 0 && i4 == 0) {
            f4 = 0.0f;
        } else {
            f4 = c0071d.f10031d;
        }
        this.f8816L = f4;
        d.e eVar = aVar.f9841f;
        this.f8817M = eVar.f10058m;
        this.f8818N = eVar.f10059n;
        this.f8819O = eVar.f10047b;
        this.f8820P = eVar.f10048c;
        this.f8809E = eVar.f10049d;
        this.f8821Q = eVar.f10050e;
        this.f8822R = eVar.f10051f;
        this.f8823S = eVar.f10052g;
        this.f8824T = eVar.f10053h;
        this.f8825U = eVar.f10055j;
        this.f8826V = eVar.f10056k;
        this.f8827W = eVar.f10057l;
        this.f8828X = androidx.constraintlayout.core.motion.utils.d.c(aVar.f9839d.f10017d);
        d.c cVar = aVar.f9839d;
        this.f8835e0 = cVar.f10022i;
        this.f8829Y = cVar.f10019f;
        this.f8837g0 = cVar.f10015b;
        this.f8836f0 = aVar.f9838c.f10032e;
        for (String str : aVar.f9842g.keySet()) {
            ConstraintAttribute constraintAttribute = aVar.f9842g.get(str);
            if (constraintAttribute.n()) {
                this.f8812H.put(str, constraintAttribute);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(n nVar) {
        return Float.compare(this.f8830Z, nVar.f8830Z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(n nVar, HashSet<String> hashSet) {
        if (i(this.f8816L, nVar.f8816L)) {
            hashSet.add("alpha");
        }
        if (i(this.f8818N, nVar.f8818N)) {
            hashSet.add("elevation");
        }
        int i4 = this.f8811G;
        int i5 = nVar.f8811G;
        if (i4 != i5 && this.f8810F == 0 && (i4 == 0 || i5 == 0)) {
            hashSet.add("alpha");
        }
        if (i(this.f8819O, nVar.f8819O)) {
            hashSet.add(f.f8538i);
        }
        if (!Float.isNaN(this.f8835e0) || !Float.isNaN(nVar.f8835e0)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f8836f0) || !Float.isNaN(nVar.f8836f0)) {
            hashSet.add("progress");
        }
        if (i(this.f8820P, nVar.f8820P)) {
            hashSet.add("rotationX");
        }
        if (i(this.f8809E, nVar.f8809E)) {
            hashSet.add("rotationY");
        }
        if (i(this.f8823S, nVar.f8823S)) {
            hashSet.add(f.f8541l);
        }
        if (i(this.f8824T, nVar.f8824T)) {
            hashSet.add(f.f8542m);
        }
        if (i(this.f8821Q, nVar.f8821Q)) {
            hashSet.add("scaleX");
        }
        if (i(this.f8822R, nVar.f8822R)) {
            hashSet.add("scaleY");
        }
        if (i(this.f8825U, nVar.f8825U)) {
            hashSet.add("translationX");
        }
        if (i(this.f8826V, nVar.f8826V)) {
            hashSet.add("translationY");
        }
        if (i(this.f8827W, nVar.f8827W)) {
            hashSet.add("translationZ");
        }
    }

    void k(n nVar, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | i(this.f8830Z, nVar.f8830Z);
        zArr[1] = zArr[1] | i(this.f8831a0, nVar.f8831a0);
        zArr[2] = zArr[2] | i(this.f8832b0, nVar.f8832b0);
        zArr[3] = zArr[3] | i(this.f8833c0, nVar.f8833c0);
        zArr[4] = i(this.f8834d0, nVar.f8834d0) | zArr[4];
    }

    void l(double[] dArr, int[] iArr) {
        int i4 = 0;
        float[] fArr = {this.f8830Z, this.f8831a0, this.f8832b0, this.f8833c0, this.f8834d0, this.f8816L, this.f8818N, this.f8819O, this.f8820P, this.f8809E, this.f8821Q, this.f8822R, this.f8823S, this.f8824T, this.f8825U, this.f8826V, this.f8827W, this.f8835e0};
        for (int i5 : iArr) {
            if (i5 < 18) {
                dArr[i4] = fArr[r5];
                i4++;
            }
        }
    }

    int m(String str, double[] dArr, int i4) {
        ConstraintAttribute constraintAttribute = this.f8812H.get(str);
        if (constraintAttribute.p() == 1) {
            dArr[i4] = constraintAttribute.k();
            return 1;
        }
        int p4 = constraintAttribute.p();
        constraintAttribute.l(new float[p4]);
        int i5 = 0;
        while (i5 < p4) {
            dArr[i4] = r1[i5];
            i5++;
            i4++;
        }
        return p4;
    }

    int n(String str) {
        return this.f8812H.get(str).p();
    }

    boolean o(String str) {
        return this.f8812H.containsKey(str);
    }

    void p(float f4, float f5, float f6, float f7) {
        this.f8831a0 = f4;
        this.f8832b0 = f5;
        this.f8833c0 = f6;
        this.f8834d0 = f7;
    }

    public void q(Rect rect, View view, int i4, float f4) {
        p(rect.left, rect.top, rect.width(), rect.height());
        e(view);
        this.f8823S = Float.NaN;
        this.f8824T = Float.NaN;
        if (i4 != 1) {
            if (i4 == 2) {
                this.f8819O = f4 + 90.0f;
                return;
            }
            return;
        }
        this.f8819O = f4 - 90.0f;
    }

    public void r(Rect rect, androidx.constraintlayout.widget.d dVar, int i4, int i5) {
        p(rect.left, rect.top, rect.width(), rect.height());
        f(dVar.q0(i5));
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        return;
                    }
                }
            }
            float f4 = this.f8819O + 90.0f;
            this.f8819O = f4;
            if (f4 > 180.0f) {
                this.f8819O = f4 - 360.0f;
                return;
            }
            return;
        }
        this.f8819O -= 90.0f;
    }

    public void s(View view) {
        p(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        e(view);
    }
}
