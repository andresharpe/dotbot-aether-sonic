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
public class l extends f {

    /* renamed from: V, reason: collision with root package name */
    public static final String f8703V = "wavePeriod";

    /* renamed from: W, reason: collision with root package name */
    public static final String f8704W = "waveOffset";

    /* renamed from: X, reason: collision with root package name */
    public static final String f8705X = "waveShape";

    /* renamed from: Y, reason: collision with root package name */
    public static final int f8706Y = 0;

    /* renamed from: Z, reason: collision with root package name */
    public static final int f8707Z = 1;

    /* renamed from: a0, reason: collision with root package name */
    public static final int f8708a0 = 2;

    /* renamed from: b0, reason: collision with root package name */
    public static final int f8709b0 = 3;

    /* renamed from: c0, reason: collision with root package name */
    public static final int f8710c0 = 4;

    /* renamed from: d0, reason: collision with root package name */
    public static final int f8711d0 = 5;

    /* renamed from: e0, reason: collision with root package name */
    public static final int f8712e0 = 6;

    /* renamed from: f0, reason: collision with root package name */
    public static final int f8713f0 = 3;

    /* renamed from: g0, reason: collision with root package name */
    static final String f8714g0 = "KeyTimeCycle";

    /* renamed from: h0, reason: collision with root package name */
    private static final String f8715h0 = "KeyTimeCycle";

    /* renamed from: D, reason: collision with root package name */
    private String f8716D;

    /* renamed from: E, reason: collision with root package name */
    private int f8717E = -1;

    /* renamed from: F, reason: collision with root package name */
    private float f8718F = Float.NaN;

    /* renamed from: G, reason: collision with root package name */
    private float f8719G = Float.NaN;

    /* renamed from: H, reason: collision with root package name */
    private float f8720H = Float.NaN;

    /* renamed from: I, reason: collision with root package name */
    private float f8721I = Float.NaN;

    /* renamed from: J, reason: collision with root package name */
    private float f8722J = Float.NaN;

    /* renamed from: K, reason: collision with root package name */
    private float f8723K = Float.NaN;

    /* renamed from: L, reason: collision with root package name */
    private float f8724L = Float.NaN;

    /* renamed from: M, reason: collision with root package name */
    private float f8725M = Float.NaN;

    /* renamed from: N, reason: collision with root package name */
    private float f8726N = Float.NaN;

    /* renamed from: O, reason: collision with root package name */
    private float f8727O = Float.NaN;

    /* renamed from: P, reason: collision with root package name */
    private float f8728P = Float.NaN;

    /* renamed from: Q, reason: collision with root package name */
    private float f8729Q = Float.NaN;

    /* renamed from: R, reason: collision with root package name */
    private int f8730R = 0;

    /* renamed from: S, reason: collision with root package name */
    private String f8731S = null;

    /* renamed from: T, reason: collision with root package name */
    private float f8732T = Float.NaN;

    /* renamed from: U, reason: collision with root package name */
    private float f8733U = 0.0f;

    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final int f8734a = 1;

        /* renamed from: b, reason: collision with root package name */
        private static final int f8735b = 2;

        /* renamed from: c, reason: collision with root package name */
        private static final int f8736c = 4;

        /* renamed from: d, reason: collision with root package name */
        private static final int f8737d = 5;

        /* renamed from: e, reason: collision with root package name */
        private static final int f8738e = 6;

        /* renamed from: f, reason: collision with root package name */
        private static final int f8739f = 8;

        /* renamed from: g, reason: collision with root package name */
        private static final int f8740g = 7;

        /* renamed from: h, reason: collision with root package name */
        private static final int f8741h = 9;

        /* renamed from: i, reason: collision with root package name */
        private static final int f8742i = 10;

        /* renamed from: j, reason: collision with root package name */
        private static final int f8743j = 12;

        /* renamed from: k, reason: collision with root package name */
        private static final int f8744k = 13;

        /* renamed from: l, reason: collision with root package name */
        private static final int f8745l = 14;

        /* renamed from: m, reason: collision with root package name */
        private static final int f8746m = 15;

        /* renamed from: n, reason: collision with root package name */
        private static final int f8747n = 16;

        /* renamed from: o, reason: collision with root package name */
        private static final int f8748o = 17;

        /* renamed from: p, reason: collision with root package name */
        private static final int f8749p = 18;

        /* renamed from: q, reason: collision with root package name */
        private static final int f8750q = 19;

        /* renamed from: r, reason: collision with root package name */
        private static final int f8751r = 20;

        /* renamed from: s, reason: collision with root package name */
        private static final int f8752s = 21;

        /* renamed from: t, reason: collision with root package name */
        private static SparseIntArray f8753t;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8753t = sparseIntArray;
            sparseIntArray.append(h.m.cg, 1);
            f8753t.append(h.m.lg, 2);
            f8753t.append(h.m.hg, 4);
            f8753t.append(h.m.ig, 5);
            f8753t.append(h.m.jg, 6);
            f8753t.append(h.m.fg, 7);
            f8753t.append(h.m.rg, 8);
            f8753t.append(h.m.qg, 9);
            f8753t.append(h.m.pg, 10);
            f8753t.append(h.m.ng, 12);
            f8753t.append(h.m.mg, 13);
            f8753t.append(h.m.gg, 14);
            f8753t.append(h.m.dg, 15);
            f8753t.append(h.m.eg, 16);
            f8753t.append(h.m.kg, 17);
            f8753t.append(h.m.og, 18);
            f8753t.append(h.m.ug, 20);
            f8753t.append(h.m.tg, 21);
            f8753t.append(h.m.wg, 19);
        }

        private a() {
        }

        public static void a(l lVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArray.getIndex(i4);
                switch (f8753t.get(index)) {
                    case 1:
                        lVar.f8718F = typedArray.getFloat(index, lVar.f8718F);
                        break;
                    case 2:
                        lVar.f8719G = typedArray.getDimension(index, lVar.f8719G);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f8753t.get(index));
                        break;
                    case 4:
                        lVar.f8720H = typedArray.getFloat(index, lVar.f8720H);
                        break;
                    case 5:
                        lVar.f8721I = typedArray.getFloat(index, lVar.f8721I);
                        break;
                    case 6:
                        lVar.f8722J = typedArray.getFloat(index, lVar.f8722J);
                        break;
                    case 7:
                        lVar.f8724L = typedArray.getFloat(index, lVar.f8724L);
                        break;
                    case 8:
                        lVar.f8723K = typedArray.getFloat(index, lVar.f8723K);
                        break;
                    case 9:
                        lVar.f8716D = typedArray.getString(index);
                        break;
                    case 10:
                        if (s.f8919a2) {
                            int resourceId = typedArray.getResourceId(index, lVar.f8557b);
                            lVar.f8557b = resourceId;
                            if (resourceId == -1) {
                                lVar.f8558c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            lVar.f8558c = typedArray.getString(index);
                            break;
                        } else {
                            lVar.f8557b = typedArray.getResourceId(index, lVar.f8557b);
                            break;
                        }
                    case 12:
                        lVar.f8556a = typedArray.getInt(index, lVar.f8556a);
                        break;
                    case 13:
                        lVar.f8717E = typedArray.getInteger(index, lVar.f8717E);
                        break;
                    case 14:
                        lVar.f8725M = typedArray.getFloat(index, lVar.f8725M);
                        break;
                    case 15:
                        lVar.f8726N = typedArray.getDimension(index, lVar.f8726N);
                        break;
                    case 16:
                        lVar.f8727O = typedArray.getDimension(index, lVar.f8727O);
                        break;
                    case 17:
                        lVar.f8728P = typedArray.getDimension(index, lVar.f8728P);
                        break;
                    case 18:
                        lVar.f8729Q = typedArray.getFloat(index, lVar.f8729Q);
                        break;
                    case 19:
                        if (typedArray.peekValue(index).type == 3) {
                            lVar.f8731S = typedArray.getString(index);
                            lVar.f8730R = 7;
                            break;
                        } else {
                            lVar.f8730R = typedArray.getInt(index, lVar.f8730R);
                            break;
                        }
                    case 20:
                        lVar.f8732T = typedArray.getFloat(index, lVar.f8732T);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type == 5) {
                            lVar.f8733U = typedArray.getDimension(index, lVar.f8733U);
                            break;
                        } else {
                            lVar.f8733U = typedArray.getFloat(index, lVar.f8733U);
                            break;
                        }
                }
            }
        }
    }

    public l() {
        this.f8559d = 3;
        this.f8560e = new HashMap<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0089, code lost:
    
        if (r1.equals("scaleY") == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void W(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.f> r11) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.l.W(java.util.HashMap):void");
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void a(HashMap<String, androidx.constraintlayout.motion.utils.d> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // androidx.constraintlayout.motion.widget.f
    /* renamed from: b */
    public f clone() {
        return new l().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public f c(f fVar) {
        super.c(fVar);
        l lVar = (l) fVar;
        this.f8716D = lVar.f8716D;
        this.f8717E = lVar.f8717E;
        this.f8730R = lVar.f8730R;
        this.f8732T = lVar.f8732T;
        this.f8733U = lVar.f8733U;
        this.f8729Q = lVar.f8729Q;
        this.f8718F = lVar.f8718F;
        this.f8719G = lVar.f8719G;
        this.f8720H = lVar.f8720H;
        this.f8723K = lVar.f8723K;
        this.f8721I = lVar.f8721I;
        this.f8722J = lVar.f8722J;
        this.f8724L = lVar.f8724L;
        this.f8725M = lVar.f8725M;
        this.f8726N = lVar.f8726N;
        this.f8727O = lVar.f8727O;
        this.f8728P = lVar.f8728P;
        this.f8731S = lVar.f8731S;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f8718F)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f8719G)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f8720H)) {
            hashSet.add(f.f8538i);
        }
        if (!Float.isNaN(this.f8721I)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f8722J)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f8726N)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f8727O)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f8728P)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f8723K)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f8724L)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f8725M)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f8729Q)) {
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
        a.a(this, context.obtainStyledAttributes(attributeSet, h.m.bg));
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void i(HashMap<String, Integer> hashMap) {
        if (this.f8717E == -1) {
            return;
        }
        if (!Float.isNaN(this.f8718F)) {
            hashMap.put("alpha", Integer.valueOf(this.f8717E));
        }
        if (!Float.isNaN(this.f8719G)) {
            hashMap.put("elevation", Integer.valueOf(this.f8717E));
        }
        if (!Float.isNaN(this.f8720H)) {
            hashMap.put(f.f8538i, Integer.valueOf(this.f8717E));
        }
        if (!Float.isNaN(this.f8721I)) {
            hashMap.put("rotationX", Integer.valueOf(this.f8717E));
        }
        if (!Float.isNaN(this.f8722J)) {
            hashMap.put("rotationY", Integer.valueOf(this.f8717E));
        }
        if (!Float.isNaN(this.f8726N)) {
            hashMap.put("translationX", Integer.valueOf(this.f8717E));
        }
        if (!Float.isNaN(this.f8727O)) {
            hashMap.put("translationY", Integer.valueOf(this.f8717E));
        }
        if (!Float.isNaN(this.f8728P)) {
            hashMap.put("translationZ", Integer.valueOf(this.f8717E));
        }
        if (!Float.isNaN(this.f8723K)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.f8717E));
        }
        if (!Float.isNaN(this.f8724L)) {
            hashMap.put("scaleX", Integer.valueOf(this.f8717E));
        }
        if (!Float.isNaN(this.f8724L)) {
            hashMap.put("scaleY", Integer.valueOf(this.f8717E));
        }
        if (!Float.isNaN(this.f8729Q)) {
            hashMap.put("progress", Integer.valueOf(this.f8717E));
        }
        if (this.f8560e.size() > 0) {
            Iterator<String> it = this.f8560e.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put("CUSTOM," + it.next(), Integer.valueOf(this.f8717E));
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
            case 1532805160:
                if (str.equals("waveShape")) {
                    c4 = 16;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                this.f8729Q = m(obj);
                return;
            case 1:
                this.f8716D = obj.toString();
                return;
            case 2:
                this.f8721I = m(obj);
                return;
            case 3:
                this.f8722J = m(obj);
                return;
            case 4:
                this.f8726N = m(obj);
                return;
            case 5:
                this.f8727O = m(obj);
                return;
            case 6:
                this.f8728P = m(obj);
                return;
            case 7:
                this.f8724L = m(obj);
                return;
            case '\b':
                this.f8725M = m(obj);
                return;
            case '\t':
                this.f8720H = m(obj);
                return;
            case '\n':
                this.f8719G = m(obj);
                return;
            case 11:
                this.f8723K = m(obj);
                return;
            case '\f':
                this.f8718F = m(obj);
                return;
            case '\r':
                this.f8733U = m(obj);
                return;
            case 14:
                this.f8732T = m(obj);
                return;
            case 15:
                this.f8717E = n(obj);
                return;
            case 16:
                if (obj instanceof Integer) {
                    this.f8730R = n(obj);
                    return;
                } else {
                    this.f8730R = 7;
                    this.f8731S = obj.toString();
                    return;
                }
            default:
                return;
        }
    }
}
