package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.h;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: U, reason: collision with root package name */
    static final String f8561U = "KeyAttribute";

    /* renamed from: V, reason: collision with root package name */
    private static final String f8562V = "KeyAttributes";

    /* renamed from: W, reason: collision with root package name */
    private static final boolean f8563W = false;

    /* renamed from: X, reason: collision with root package name */
    public static final int f8564X = 1;

    /* renamed from: D, reason: collision with root package name */
    private String f8565D;

    /* renamed from: E, reason: collision with root package name */
    private int f8566E = -1;

    /* renamed from: F, reason: collision with root package name */
    private boolean f8567F = false;

    /* renamed from: G, reason: collision with root package name */
    private float f8568G = Float.NaN;

    /* renamed from: H, reason: collision with root package name */
    private float f8569H = Float.NaN;

    /* renamed from: I, reason: collision with root package name */
    private float f8570I = Float.NaN;

    /* renamed from: J, reason: collision with root package name */
    private float f8571J = Float.NaN;

    /* renamed from: K, reason: collision with root package name */
    private float f8572K = Float.NaN;

    /* renamed from: L, reason: collision with root package name */
    private float f8573L = Float.NaN;

    /* renamed from: M, reason: collision with root package name */
    private float f8574M = Float.NaN;

    /* renamed from: N, reason: collision with root package name */
    private float f8575N = Float.NaN;

    /* renamed from: O, reason: collision with root package name */
    private float f8576O = Float.NaN;

    /* renamed from: P, reason: collision with root package name */
    private float f8577P = Float.NaN;

    /* renamed from: Q, reason: collision with root package name */
    private float f8578Q = Float.NaN;

    /* renamed from: R, reason: collision with root package name */
    private float f8579R = Float.NaN;

    /* renamed from: S, reason: collision with root package name */
    private float f8580S = Float.NaN;

    /* renamed from: T, reason: collision with root package name */
    private float f8581T = Float.NaN;

    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final int f8582a = 1;

        /* renamed from: b, reason: collision with root package name */
        private static final int f8583b = 2;

        /* renamed from: c, reason: collision with root package name */
        private static final int f8584c = 4;

        /* renamed from: d, reason: collision with root package name */
        private static final int f8585d = 5;

        /* renamed from: e, reason: collision with root package name */
        private static final int f8586e = 6;

        /* renamed from: f, reason: collision with root package name */
        private static final int f8587f = 8;

        /* renamed from: g, reason: collision with root package name */
        private static final int f8588g = 7;

        /* renamed from: h, reason: collision with root package name */
        private static final int f8589h = 9;

        /* renamed from: i, reason: collision with root package name */
        private static final int f8590i = 10;

        /* renamed from: j, reason: collision with root package name */
        private static final int f8591j = 12;

        /* renamed from: k, reason: collision with root package name */
        private static final int f8592k = 13;

        /* renamed from: l, reason: collision with root package name */
        private static final int f8593l = 14;

        /* renamed from: m, reason: collision with root package name */
        private static final int f8594m = 15;

        /* renamed from: n, reason: collision with root package name */
        private static final int f8595n = 16;

        /* renamed from: o, reason: collision with root package name */
        private static final int f8596o = 17;

        /* renamed from: p, reason: collision with root package name */
        private static final int f8597p = 18;

        /* renamed from: q, reason: collision with root package name */
        private static final int f8598q = 19;

        /* renamed from: r, reason: collision with root package name */
        private static final int f8599r = 20;

        /* renamed from: s, reason: collision with root package name */
        private static SparseIntArray f8600s;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8600s = sparseIntArray;
            sparseIntArray.append(h.m.We, 1);
            f8600s.append(h.m.hf, 2);
            f8600s.append(h.m.df, 4);
            f8600s.append(h.m.ef, 5);
            f8600s.append(h.m.ff, 6);
            f8600s.append(h.m.Xe, 19);
            f8600s.append(h.m.Ye, 20);
            f8600s.append(h.m.bf, 7);
            f8600s.append(h.m.of, 8);
            f8600s.append(h.m.nf, 9);
            f8600s.append(h.m.lf, 10);
            f8600s.append(h.m.jf, 12);
            f8600s.append(h.m.f5if, 13);
            f8600s.append(h.m.cf, 14);
            f8600s.append(h.m.Ze, 15);
            f8600s.append(h.m.af, 16);
            f8600s.append(h.m.gf, 17);
            f8600s.append(h.m.kf, 18);
        }

        private a() {
        }

        public static void a(g gVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArray.getIndex(i4);
                switch (f8600s.get(index)) {
                    case 1:
                        gVar.f8568G = typedArray.getFloat(index, gVar.f8568G);
                        break;
                    case 2:
                        gVar.f8569H = typedArray.getDimension(index, gVar.f8569H);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e(g.f8561U, "unused attribute 0x" + Integer.toHexString(index) + "   " + f8600s.get(index));
                        break;
                    case 4:
                        gVar.f8570I = typedArray.getFloat(index, gVar.f8570I);
                        break;
                    case 5:
                        gVar.f8571J = typedArray.getFloat(index, gVar.f8571J);
                        break;
                    case 6:
                        gVar.f8572K = typedArray.getFloat(index, gVar.f8572K);
                        break;
                    case 7:
                        gVar.f8576O = typedArray.getFloat(index, gVar.f8576O);
                        break;
                    case 8:
                        gVar.f8575N = typedArray.getFloat(index, gVar.f8575N);
                        break;
                    case 9:
                        gVar.f8565D = typedArray.getString(index);
                        break;
                    case 10:
                        if (s.f8919a2) {
                            int resourceId = typedArray.getResourceId(index, gVar.f8557b);
                            gVar.f8557b = resourceId;
                            if (resourceId == -1) {
                                gVar.f8558c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            gVar.f8558c = typedArray.getString(index);
                            break;
                        } else {
                            gVar.f8557b = typedArray.getResourceId(index, gVar.f8557b);
                            break;
                        }
                    case 12:
                        gVar.f8556a = typedArray.getInt(index, gVar.f8556a);
                        break;
                    case 13:
                        gVar.f8566E = typedArray.getInteger(index, gVar.f8566E);
                        break;
                    case 14:
                        gVar.f8577P = typedArray.getFloat(index, gVar.f8577P);
                        break;
                    case 15:
                        gVar.f8578Q = typedArray.getDimension(index, gVar.f8578Q);
                        break;
                    case 16:
                        gVar.f8579R = typedArray.getDimension(index, gVar.f8579R);
                        break;
                    case 17:
                        gVar.f8580S = typedArray.getDimension(index, gVar.f8580S);
                        break;
                    case 18:
                        gVar.f8581T = typedArray.getFloat(index, gVar.f8581T);
                        break;
                    case 19:
                        gVar.f8573L = typedArray.getDimension(index, gVar.f8573L);
                        break;
                    case 20:
                        gVar.f8574M = typedArray.getDimension(index, gVar.f8574M);
                        break;
                }
            }
        }
    }

    public g() {
        this.f8559d = 1;
        this.f8560e = new HashMap<>();
    }

    int T() {
        return this.f8566E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x009a, code lost:
    
        if (r1.equals("scaleY") == false) goto L15;
     */
    @Override // androidx.constraintlayout.motion.widget.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.d> r7) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.g.a(java.util.HashMap):void");
    }

    @Override // androidx.constraintlayout.motion.widget.f
    /* renamed from: b */
    public f clone() {
        return new g().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public f c(f fVar) {
        super.c(fVar);
        g gVar = (g) fVar;
        this.f8566E = gVar.f8566E;
        this.f8567F = gVar.f8567F;
        this.f8568G = gVar.f8568G;
        this.f8569H = gVar.f8569H;
        this.f8570I = gVar.f8570I;
        this.f8571J = gVar.f8571J;
        this.f8572K = gVar.f8572K;
        this.f8573L = gVar.f8573L;
        this.f8574M = gVar.f8574M;
        this.f8575N = gVar.f8575N;
        this.f8576O = gVar.f8576O;
        this.f8577P = gVar.f8577P;
        this.f8578Q = gVar.f8578Q;
        this.f8579R = gVar.f8579R;
        this.f8580S = gVar.f8580S;
        this.f8581T = gVar.f8581T;
        this.f8565D = gVar.f8565D;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f8568G)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f8569H)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f8570I)) {
            hashSet.add(f.f8538i);
        }
        if (!Float.isNaN(this.f8571J)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f8572K)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f8573L)) {
            hashSet.add(f.f8541l);
        }
        if (!Float.isNaN(this.f8574M)) {
            hashSet.add(f.f8542m);
        }
        if (!Float.isNaN(this.f8578Q)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f8579R)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f8580S)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f8575N)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f8576O)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f8577P)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f8581T)) {
            hashSet.add("progress");
        }
        if (this.f8560e.size() > 0) {
            Iterator<String> it = this.f8560e.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void f(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, h.m.Ve));
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void i(HashMap<String, Integer> hashMap) {
        if (this.f8566E == -1) {
            return;
        }
        if (!Float.isNaN(this.f8568G)) {
            hashMap.put("alpha", Integer.valueOf(this.f8566E));
        }
        if (!Float.isNaN(this.f8569H)) {
            hashMap.put("elevation", Integer.valueOf(this.f8566E));
        }
        if (!Float.isNaN(this.f8570I)) {
            hashMap.put(f.f8538i, Integer.valueOf(this.f8566E));
        }
        if (!Float.isNaN(this.f8571J)) {
            hashMap.put("rotationX", Integer.valueOf(this.f8566E));
        }
        if (!Float.isNaN(this.f8572K)) {
            hashMap.put("rotationY", Integer.valueOf(this.f8566E));
        }
        if (!Float.isNaN(this.f8573L)) {
            hashMap.put(f.f8541l, Integer.valueOf(this.f8566E));
        }
        if (!Float.isNaN(this.f8574M)) {
            hashMap.put(f.f8542m, Integer.valueOf(this.f8566E));
        }
        if (!Float.isNaN(this.f8578Q)) {
            hashMap.put("translationX", Integer.valueOf(this.f8566E));
        }
        if (!Float.isNaN(this.f8579R)) {
            hashMap.put("translationY", Integer.valueOf(this.f8566E));
        }
        if (!Float.isNaN(this.f8580S)) {
            hashMap.put("translationZ", Integer.valueOf(this.f8566E));
        }
        if (!Float.isNaN(this.f8575N)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.f8566E));
        }
        if (!Float.isNaN(this.f8576O)) {
            hashMap.put("scaleX", Integer.valueOf(this.f8566E));
        }
        if (!Float.isNaN(this.f8577P)) {
            hashMap.put("scaleY", Integer.valueOf(this.f8566E));
        }
        if (!Float.isNaN(this.f8581T)) {
            hashMap.put("progress", Integer.valueOf(this.f8566E));
        }
        if (this.f8560e.size() > 0) {
            Iterator<String> it = this.f8560e.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put("CUSTOM," + it.next(), Integer.valueOf(this.f8566E));
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void j(String str, Object obj) {
        str.hashCode();
        char c4 = 65535;
        switch (str.hashCode()) {
            case -1913008125:
                if (str.equals(f.f8532A)) {
                    c4 = 0;
                    break;
                }
                break;
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c4 = 1;
                    break;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c4 = 2;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c4 = 3;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c4 = 4;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c4 = 5;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c4 = 6;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c4 = 7;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c4 = '\b';
                    break;
                }
                break;
            case -760884510:
                if (str.equals(f.f8541l)) {
                    c4 = '\t';
                    break;
                }
                break;
            case -760884509:
                if (str.equals(f.f8542m)) {
                    c4 = '\n';
                    break;
                }
                break;
            case -40300674:
                if (str.equals(f.f8538i)) {
                    c4 = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c4 = '\f';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c4 = '\r';
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c4 = 14;
                    break;
                }
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    c4 = 15;
                    break;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c4 = 16;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                this.f8581T = m(obj);
                return;
            case 1:
                this.f8565D = obj.toString();
                return;
            case 2:
                this.f8571J = m(obj);
                return;
            case 3:
                this.f8572K = m(obj);
                return;
            case 4:
                this.f8578Q = m(obj);
                return;
            case 5:
                this.f8579R = m(obj);
                return;
            case 6:
                this.f8580S = m(obj);
                return;
            case 7:
                this.f8576O = m(obj);
                return;
            case '\b':
                this.f8577P = m(obj);
                return;
            case '\t':
                this.f8573L = m(obj);
                return;
            case '\n':
                this.f8574M = m(obj);
                return;
            case 11:
                this.f8570I = m(obj);
                return;
            case '\f':
                this.f8569H = m(obj);
                return;
            case '\r':
                this.f8575N = m(obj);
                return;
            case 14:
                this.f8568G = m(obj);
                return;
            case 15:
                this.f8566E = n(obj);
                return;
            case 16:
                this.f8567F = l(obj);
                return;
            default:
                return;
        }
    }
}
