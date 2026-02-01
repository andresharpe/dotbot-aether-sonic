package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.h;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h extends f {

    /* renamed from: X, reason: collision with root package name */
    private static final String f8601X = "KeyCycle";

    /* renamed from: Y, reason: collision with root package name */
    static final String f8602Y = "KeyCycle";

    /* renamed from: Z, reason: collision with root package name */
    public static final String f8603Z = "wavePeriod";

    /* renamed from: a0, reason: collision with root package name */
    public static final String f8604a0 = "waveOffset";

    /* renamed from: b0, reason: collision with root package name */
    public static final String f8605b0 = "wavePhase";

    /* renamed from: c0, reason: collision with root package name */
    public static final String f8606c0 = "waveShape";

    /* renamed from: d0, reason: collision with root package name */
    public static final int f8607d0 = 0;

    /* renamed from: e0, reason: collision with root package name */
    public static final int f8608e0 = 1;

    /* renamed from: f0, reason: collision with root package name */
    public static final int f8609f0 = 2;

    /* renamed from: g0, reason: collision with root package name */
    public static final int f8610g0 = 3;

    /* renamed from: h0, reason: collision with root package name */
    public static final int f8611h0 = 4;

    /* renamed from: i0, reason: collision with root package name */
    public static final int f8612i0 = 5;

    /* renamed from: j0, reason: collision with root package name */
    public static final int f8613j0 = 6;

    /* renamed from: k0, reason: collision with root package name */
    public static final int f8614k0 = 4;

    /* renamed from: D, reason: collision with root package name */
    private String f8615D = null;

    /* renamed from: E, reason: collision with root package name */
    private int f8616E = 0;

    /* renamed from: F, reason: collision with root package name */
    private int f8617F = -1;

    /* renamed from: G, reason: collision with root package name */
    private String f8618G = null;

    /* renamed from: H, reason: collision with root package name */
    private float f8619H = Float.NaN;

    /* renamed from: I, reason: collision with root package name */
    private float f8620I = 0.0f;

    /* renamed from: J, reason: collision with root package name */
    private float f8621J = 0.0f;

    /* renamed from: K, reason: collision with root package name */
    private float f8622K = Float.NaN;

    /* renamed from: L, reason: collision with root package name */
    private int f8623L = -1;

    /* renamed from: M, reason: collision with root package name */
    private float f8624M = Float.NaN;

    /* renamed from: N, reason: collision with root package name */
    private float f8625N = Float.NaN;

    /* renamed from: O, reason: collision with root package name */
    private float f8626O = Float.NaN;

    /* renamed from: P, reason: collision with root package name */
    private float f8627P = Float.NaN;

    /* renamed from: Q, reason: collision with root package name */
    private float f8628Q = Float.NaN;

    /* renamed from: R, reason: collision with root package name */
    private float f8629R = Float.NaN;

    /* renamed from: S, reason: collision with root package name */
    private float f8630S = Float.NaN;

    /* renamed from: T, reason: collision with root package name */
    private float f8631T = Float.NaN;

    /* renamed from: U, reason: collision with root package name */
    private float f8632U = Float.NaN;

    /* renamed from: V, reason: collision with root package name */
    private float f8633V = Float.NaN;

    /* renamed from: W, reason: collision with root package name */
    private float f8634W = Float.NaN;

    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final int f8635a = 1;

        /* renamed from: b, reason: collision with root package name */
        private static final int f8636b = 2;

        /* renamed from: c, reason: collision with root package name */
        private static final int f8637c = 3;

        /* renamed from: d, reason: collision with root package name */
        private static final int f8638d = 4;

        /* renamed from: e, reason: collision with root package name */
        private static final int f8639e = 5;

        /* renamed from: f, reason: collision with root package name */
        private static final int f8640f = 6;

        /* renamed from: g, reason: collision with root package name */
        private static final int f8641g = 7;

        /* renamed from: h, reason: collision with root package name */
        private static final int f8642h = 8;

        /* renamed from: i, reason: collision with root package name */
        private static final int f8643i = 9;

        /* renamed from: j, reason: collision with root package name */
        private static final int f8644j = 10;

        /* renamed from: k, reason: collision with root package name */
        private static final int f8645k = 11;

        /* renamed from: l, reason: collision with root package name */
        private static final int f8646l = 12;

        /* renamed from: m, reason: collision with root package name */
        private static final int f8647m = 13;

        /* renamed from: n, reason: collision with root package name */
        private static final int f8648n = 14;

        /* renamed from: o, reason: collision with root package name */
        private static final int f8649o = 15;

        /* renamed from: p, reason: collision with root package name */
        private static final int f8650p = 16;

        /* renamed from: q, reason: collision with root package name */
        private static final int f8651q = 17;

        /* renamed from: r, reason: collision with root package name */
        private static final int f8652r = 18;

        /* renamed from: s, reason: collision with root package name */
        private static final int f8653s = 19;

        /* renamed from: t, reason: collision with root package name */
        private static final int f8654t = 20;

        /* renamed from: u, reason: collision with root package name */
        private static final int f8655u = 21;

        /* renamed from: v, reason: collision with root package name */
        private static SparseIntArray f8656v;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8656v = sparseIntArray;
            sparseIntArray.append(h.m.Df, 1);
            f8656v.append(h.m.Bf, 2);
            f8656v.append(h.m.Ef, 3);
            f8656v.append(h.m.Af, 4);
            f8656v.append(h.m.Jf, 5);
            f8656v.append(h.m.Hf, 6);
            f8656v.append(h.m.Gf, 7);
            f8656v.append(h.m.Kf, 8);
            f8656v.append(h.m.qf, 9);
            f8656v.append(h.m.zf, 10);
            f8656v.append(h.m.vf, 11);
            f8656v.append(h.m.wf, 12);
            f8656v.append(h.m.xf, 13);
            f8656v.append(h.m.Ff, 14);
            f8656v.append(h.m.tf, 15);
            f8656v.append(h.m.uf, 16);
            f8656v.append(h.m.rf, 17);
            f8656v.append(h.m.sf, 18);
            f8656v.append(h.m.yf, 19);
            f8656v.append(h.m.Cf, 20);
            f8656v.append(h.m.If, 21);
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(h hVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArray.getIndex(i4);
                switch (f8656v.get(index)) {
                    case 1:
                        if (s.f8919a2) {
                            int resourceId = typedArray.getResourceId(index, hVar.f8557b);
                            hVar.f8557b = resourceId;
                            if (resourceId == -1) {
                                hVar.f8558c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            hVar.f8558c = typedArray.getString(index);
                            break;
                        } else {
                            hVar.f8557b = typedArray.getResourceId(index, hVar.f8557b);
                            break;
                        }
                    case 2:
                        hVar.f8556a = typedArray.getInt(index, hVar.f8556a);
                        break;
                    case 3:
                        hVar.f8615D = typedArray.getString(index);
                        break;
                    case 4:
                        hVar.f8616E = typedArray.getInteger(index, hVar.f8616E);
                        break;
                    case 5:
                        if (typedArray.peekValue(index).type == 3) {
                            hVar.f8618G = typedArray.getString(index);
                            hVar.f8617F = 7;
                            break;
                        } else {
                            hVar.f8617F = typedArray.getInt(index, hVar.f8617F);
                            break;
                        }
                    case 6:
                        hVar.f8619H = typedArray.getFloat(index, hVar.f8619H);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type == 5) {
                            hVar.f8620I = typedArray.getDimension(index, hVar.f8620I);
                            break;
                        } else {
                            hVar.f8620I = typedArray.getFloat(index, hVar.f8620I);
                            break;
                        }
                    case 8:
                        hVar.f8623L = typedArray.getInt(index, hVar.f8623L);
                        break;
                    case 9:
                        hVar.f8624M = typedArray.getFloat(index, hVar.f8624M);
                        break;
                    case 10:
                        hVar.f8625N = typedArray.getDimension(index, hVar.f8625N);
                        break;
                    case 11:
                        hVar.f8626O = typedArray.getFloat(index, hVar.f8626O);
                        break;
                    case 12:
                        hVar.f8628Q = typedArray.getFloat(index, hVar.f8628Q);
                        break;
                    case 13:
                        hVar.f8629R = typedArray.getFloat(index, hVar.f8629R);
                        break;
                    case 14:
                        hVar.f8627P = typedArray.getFloat(index, hVar.f8627P);
                        break;
                    case 15:
                        hVar.f8630S = typedArray.getFloat(index, hVar.f8630S);
                        break;
                    case 16:
                        hVar.f8631T = typedArray.getFloat(index, hVar.f8631T);
                        break;
                    case 17:
                        hVar.f8632U = typedArray.getDimension(index, hVar.f8632U);
                        break;
                    case 18:
                        hVar.f8633V = typedArray.getDimension(index, hVar.f8633V);
                        break;
                    case 19:
                        hVar.f8634W = typedArray.getDimension(index, hVar.f8634W);
                        break;
                    case 20:
                        hVar.f8622K = typedArray.getFloat(index, hVar.f8622K);
                        break;
                    case 21:
                        hVar.f8621J = typedArray.getFloat(index, hVar.f8621J) / 360.0f;
                        break;
                    default:
                        Log.e(v.c.f7435a, "unused attribute 0x" + Integer.toHexString(index) + "   " + f8656v.get(index));
                        break;
                }
            }
        }
    }

    public h() {
        this.f8559d = 4;
        this.f8560e = new HashMap<>();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0045. Please report as an issue. */
    @Override // androidx.constraintlayout.motion.widget.f
    public void a(HashMap<String, androidx.constraintlayout.motion.utils.d> hashMap) {
        c.n(v.c.f7435a, "add " + hashMap.size() + " values", 2);
        for (String str : hashMap.keySet()) {
            androidx.constraintlayout.motion.utils.d dVar = hashMap.get(str);
            if (dVar != null) {
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
                    case -40300674:
                        if (str.equals(f.f8538i)) {
                            c4 = '\b';
                            break;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            c4 = '\t';
                            break;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
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
                    case 156108012:
                        if (str.equals("waveOffset")) {
                            c4 = '\f';
                            break;
                        }
                        break;
                    case 1530034690:
                        if (str.equals("wavePhase")) {
                            c4 = '\r';
                            break;
                        }
                        break;
                }
                switch (c4) {
                    case 0:
                        dVar.g(this.f8556a, this.f8628Q);
                        break;
                    case 1:
                        dVar.g(this.f8556a, this.f8629R);
                        break;
                    case 2:
                        dVar.g(this.f8556a, this.f8632U);
                        break;
                    case 3:
                        dVar.g(this.f8556a, this.f8633V);
                        break;
                    case 4:
                        dVar.g(this.f8556a, this.f8634W);
                        break;
                    case 5:
                        dVar.g(this.f8556a, this.f8622K);
                        break;
                    case 6:
                        dVar.g(this.f8556a, this.f8630S);
                        break;
                    case 7:
                        dVar.g(this.f8556a, this.f8631T);
                        break;
                    case '\b':
                        dVar.g(this.f8556a, this.f8626O);
                        break;
                    case '\t':
                        dVar.g(this.f8556a, this.f8625N);
                        break;
                    case '\n':
                        dVar.g(this.f8556a, this.f8627P);
                        break;
                    case 11:
                        dVar.g(this.f8556a, this.f8624M);
                        break;
                    case '\f':
                        dVar.g(this.f8556a, this.f8620I);
                        break;
                    case '\r':
                        dVar.g(this.f8556a, this.f8621J);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            break;
                        } else {
                            Log.v("WARNING KeyCycle", "  UNKNOWN  " + str);
                            break;
                        }
                }
            }
        }
    }

    public void a0(HashMap<String, androidx.constraintlayout.motion.utils.c> hashMap) {
        androidx.constraintlayout.motion.utils.c cVar;
        androidx.constraintlayout.motion.utils.c cVar2;
        for (String str : hashMap.keySet()) {
            if (str.startsWith("CUSTOM")) {
                ConstraintAttribute constraintAttribute = this.f8560e.get(str.substring(7));
                if (constraintAttribute != null && constraintAttribute.j() == ConstraintAttribute.AttributeType.FLOAT_TYPE && (cVar = hashMap.get(str)) != null) {
                    cVar.g(this.f8556a, this.f8617F, this.f8618G, this.f8623L, this.f8619H, this.f8620I, this.f8621J, constraintAttribute.k(), constraintAttribute);
                }
            } else {
                float b02 = b0(str);
                if (!Float.isNaN(b02) && (cVar2 = hashMap.get(str)) != null) {
                    cVar2.f(this.f8556a, this.f8617F, this.f8618G, this.f8623L, this.f8619H, this.f8620I, this.f8621J, b02);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.f
    /* renamed from: b */
    public f clone() {
        return new h().c(this);
    }

    public float b0(String str) {
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
            case -40300674:
                if (str.equals(f.f8538i)) {
                    c4 = '\b';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c4 = '\t';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
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
            case 156108012:
                if (str.equals("waveOffset")) {
                    c4 = '\f';
                    break;
                }
                break;
            case 1530034690:
                if (str.equals("wavePhase")) {
                    c4 = '\r';
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                return this.f8628Q;
            case 1:
                return this.f8629R;
            case 2:
                return this.f8632U;
            case 3:
                return this.f8633V;
            case 4:
                return this.f8634W;
            case 5:
                return this.f8622K;
            case 6:
                return this.f8630S;
            case 7:
                return this.f8631T;
            case '\b':
                return this.f8626O;
            case '\t':
                return this.f8625N;
            case '\n':
                return this.f8627P;
            case 11:
                return this.f8624M;
            case '\f':
                return this.f8620I;
            case '\r':
                return this.f8621J;
            default:
                if (!str.startsWith("CUSTOM")) {
                    Log.v("WARNING! KeyCycle", "  UNKNOWN  " + str);
                    return Float.NaN;
                }
                return Float.NaN;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public f c(f fVar) {
        super.c(fVar);
        h hVar = (h) fVar;
        this.f8615D = hVar.f8615D;
        this.f8616E = hVar.f8616E;
        this.f8617F = hVar.f8617F;
        this.f8618G = hVar.f8618G;
        this.f8619H = hVar.f8619H;
        this.f8620I = hVar.f8620I;
        this.f8621J = hVar.f8621J;
        this.f8622K = hVar.f8622K;
        this.f8623L = hVar.f8623L;
        this.f8624M = hVar.f8624M;
        this.f8625N = hVar.f8625N;
        this.f8626O = hVar.f8626O;
        this.f8627P = hVar.f8627P;
        this.f8628Q = hVar.f8628Q;
        this.f8629R = hVar.f8629R;
        this.f8630S = hVar.f8630S;
        this.f8631T = hVar.f8631T;
        this.f8632U = hVar.f8632U;
        this.f8633V = hVar.f8633V;
        this.f8634W = hVar.f8634W;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f8624M)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f8625N)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f8626O)) {
            hashSet.add(f.f8538i);
        }
        if (!Float.isNaN(this.f8628Q)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f8629R)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f8630S)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f8631T)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f8627P)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f8632U)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f8633V)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f8634W)) {
            hashSet.add("translationZ");
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
        a.b(this, context.obtainStyledAttributes(attributeSet, h.m.pf));
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
            case -40300674:
                if (str.equals(f.f8538i)) {
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
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c4 = 11;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c4 = '\f';
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c4 = '\r';
                    break;
                }
                break;
            case 184161818:
                if (str.equals("wavePeriod")) {
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
            case 1530034690:
                if (str.equals("wavePhase")) {
                    c4 = 16;
                    break;
                }
                break;
            case 1532805160:
                if (str.equals("waveShape")) {
                    c4 = 17;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                this.f8622K = m(obj);
                return;
            case 1:
                this.f8615D = obj.toString();
                return;
            case 2:
                this.f8628Q = m(obj);
                return;
            case 3:
                this.f8629R = m(obj);
                return;
            case 4:
                this.f8632U = m(obj);
                return;
            case 5:
                this.f8633V = m(obj);
                return;
            case 6:
                this.f8634W = m(obj);
                return;
            case 7:
                this.f8630S = m(obj);
                return;
            case '\b':
                this.f8631T = m(obj);
                return;
            case '\t':
                this.f8626O = m(obj);
                return;
            case '\n':
                this.f8625N = m(obj);
                return;
            case 11:
                this.f8627P = m(obj);
                return;
            case '\f':
                this.f8624M = m(obj);
                return;
            case '\r':
                this.f8620I = m(obj);
                return;
            case 14:
                this.f8619H = m(obj);
                return;
            case 15:
                this.f8616E = n(obj);
                return;
            case 16:
                this.f8621J = m(obj);
                return;
            case 17:
                if (obj instanceof Integer) {
                    this.f8617F = n(obj);
                    return;
                } else {
                    this.f8617F = 7;
                    this.f8618G = obj.toString();
                    return;
                }
            default:
                return;
        }
    }
}
