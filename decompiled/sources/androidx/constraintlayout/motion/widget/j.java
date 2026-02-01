package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.widget.h;
import java.util.HashMap;

/* loaded from: classes.dex */
public class j extends k {

    /* renamed from: R, reason: collision with root package name */
    private static final String f8663R = "KeyPosition";

    /* renamed from: S, reason: collision with root package name */
    static final String f8664S = "KeyPosition";

    /* renamed from: T, reason: collision with root package name */
    public static final int f8665T = 2;

    /* renamed from: U, reason: collision with root package name */
    public static final int f8666U = 1;

    /* renamed from: V, reason: collision with root package name */
    public static final int f8667V = 0;

    /* renamed from: W, reason: collision with root package name */
    public static final String f8668W = "transitionEasing";

    /* renamed from: X, reason: collision with root package name */
    public static final String f8669X = "drawPath";

    /* renamed from: Y, reason: collision with root package name */
    public static final String f8670Y = "percentWidth";

    /* renamed from: Z, reason: collision with root package name */
    public static final String f8671Z = "percentHeight";

    /* renamed from: a0, reason: collision with root package name */
    public static final String f8672a0 = "sizePercent";

    /* renamed from: b0, reason: collision with root package name */
    public static final String f8673b0 = "percentX";

    /* renamed from: c0, reason: collision with root package name */
    public static final String f8674c0 = "percentY";

    /* renamed from: d0, reason: collision with root package name */
    static final int f8675d0 = 2;

    /* renamed from: F, reason: collision with root package name */
    String f8676F = null;

    /* renamed from: G, reason: collision with root package name */
    int f8677G = f.f8535f;

    /* renamed from: H, reason: collision with root package name */
    int f8678H = 0;

    /* renamed from: I, reason: collision with root package name */
    float f8679I = Float.NaN;

    /* renamed from: J, reason: collision with root package name */
    float f8680J = Float.NaN;

    /* renamed from: K, reason: collision with root package name */
    float f8681K = Float.NaN;

    /* renamed from: L, reason: collision with root package name */
    float f8682L = Float.NaN;

    /* renamed from: M, reason: collision with root package name */
    float f8683M = Float.NaN;

    /* renamed from: N, reason: collision with root package name */
    float f8684N = Float.NaN;

    /* renamed from: O, reason: collision with root package name */
    int f8685O = 0;

    /* renamed from: P, reason: collision with root package name */
    private float f8686P = Float.NaN;

    /* renamed from: Q, reason: collision with root package name */
    private float f8687Q = Float.NaN;

    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final int f8688a = 1;

        /* renamed from: b, reason: collision with root package name */
        private static final int f8689b = 2;

        /* renamed from: c, reason: collision with root package name */
        private static final int f8690c = 3;

        /* renamed from: d, reason: collision with root package name */
        private static final int f8691d = 4;

        /* renamed from: e, reason: collision with root package name */
        private static final int f8692e = 5;

        /* renamed from: f, reason: collision with root package name */
        private static final int f8693f = 6;

        /* renamed from: g, reason: collision with root package name */
        private static final int f8694g = 7;

        /* renamed from: h, reason: collision with root package name */
        private static final int f8695h = 8;

        /* renamed from: i, reason: collision with root package name */
        private static final int f8696i = 9;

        /* renamed from: j, reason: collision with root package name */
        private static final int f8697j = 10;

        /* renamed from: k, reason: collision with root package name */
        private static final int f8698k = 11;

        /* renamed from: l, reason: collision with root package name */
        private static final int f8699l = 12;

        /* renamed from: m, reason: collision with root package name */
        private static SparseIntArray f8700m;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8700m = sparseIntArray;
            sparseIntArray.append(h.m.Tf, 1);
            f8700m.append(h.m.Rf, 2);
            f8700m.append(h.m.ag, 3);
            f8700m.append(h.m.Pf, 4);
            f8700m.append(h.m.Qf, 5);
            f8700m.append(h.m.Xf, 6);
            f8700m.append(h.m.Yf, 7);
            f8700m.append(h.m.Sf, 9);
            f8700m.append(h.m.Zf, 8);
            f8700m.append(h.m.Wf, 11);
            f8700m.append(h.m.Vf, 12);
            f8700m.append(h.m.Uf, 10);
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(j jVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArray.getIndex(i4);
                switch (f8700m.get(index)) {
                    case 1:
                        if (s.f8919a2) {
                            int resourceId = typedArray.getResourceId(index, jVar.f8557b);
                            jVar.f8557b = resourceId;
                            if (resourceId == -1) {
                                jVar.f8558c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            jVar.f8558c = typedArray.getString(index);
                            break;
                        } else {
                            jVar.f8557b = typedArray.getResourceId(index, jVar.f8557b);
                            break;
                        }
                    case 2:
                        jVar.f8556a = typedArray.getInt(index, jVar.f8556a);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type == 3) {
                            jVar.f8676F = typedArray.getString(index);
                            break;
                        } else {
                            jVar.f8676F = androidx.constraintlayout.core.motion.utils.d.f7158o[typedArray.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        jVar.f8702D = typedArray.getInteger(index, jVar.f8702D);
                        break;
                    case 5:
                        jVar.f8678H = typedArray.getInt(index, jVar.f8678H);
                        break;
                    case 6:
                        jVar.f8681K = typedArray.getFloat(index, jVar.f8681K);
                        break;
                    case 7:
                        jVar.f8682L = typedArray.getFloat(index, jVar.f8682L);
                        break;
                    case 8:
                        float f4 = typedArray.getFloat(index, jVar.f8680J);
                        jVar.f8679I = f4;
                        jVar.f8680J = f4;
                        break;
                    case 9:
                        jVar.f8685O = typedArray.getInt(index, jVar.f8685O);
                        break;
                    case 10:
                        jVar.f8677G = typedArray.getInt(index, jVar.f8677G);
                        break;
                    case 11:
                        jVar.f8679I = typedArray.getFloat(index, jVar.f8679I);
                        break;
                    case 12:
                        jVar.f8680J = typedArray.getFloat(index, jVar.f8680J);
                        break;
                    default:
                        Log.e(v.g.f7518a, "unused attribute 0x" + Integer.toHexString(index) + "   " + f8700m.get(index));
                        break;
                }
            }
            if (jVar.f8556a == -1) {
                Log.e(v.g.f7518a, "no frame position");
            }
        }
    }

    public j() {
        this.f8559d = 2;
    }

    private void t(float f4, float f5, float f6, float f7) {
        float f8;
        float f9;
        float f10;
        float f11 = f6 - f4;
        float f12 = f7 - f5;
        float f13 = 0.0f;
        if (Float.isNaN(this.f8681K)) {
            f8 = 0.0f;
        } else {
            f8 = this.f8681K;
        }
        if (Float.isNaN(this.f8684N)) {
            f9 = 0.0f;
        } else {
            f9 = this.f8684N;
        }
        if (Float.isNaN(this.f8682L)) {
            f10 = 0.0f;
        } else {
            f10 = this.f8682L;
        }
        if (!Float.isNaN(this.f8683M)) {
            f13 = this.f8683M;
        }
        this.f8686P = (int) (f4 + (f8 * f11) + (f13 * f12));
        this.f8687Q = (int) (f5 + (f11 * f9) + (f12 * f10));
    }

    private void u(float f4, float f5, float f6, float f7) {
        float f8 = f6 - f4;
        float f9 = f7 - f5;
        float f10 = this.f8681K;
        float f11 = this.f8682L;
        this.f8686P = f4 + (f8 * f10) + ((-f9) * f11);
        this.f8687Q = f5 + (f9 * f10) + (f8 * f11);
    }

    private void v(int i4, int i5) {
        float f4 = this.f8681K;
        float f5 = 0;
        this.f8686P = (i4 * f4) + f5;
        this.f8687Q = (i5 * f4) + f5;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void a(HashMap<String, androidx.constraintlayout.motion.utils.d> hashMap) {
    }

    @Override // androidx.constraintlayout.motion.widget.f
    /* renamed from: b */
    public f clone() {
        return new j().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public f c(f fVar) {
        super.c(fVar);
        j jVar = (j) fVar;
        this.f8676F = jVar.f8676F;
        this.f8677G = jVar.f8677G;
        this.f8678H = jVar.f8678H;
        this.f8679I = jVar.f8679I;
        this.f8680J = Float.NaN;
        this.f8681K = jVar.f8681K;
        this.f8682L = jVar.f8682L;
        this.f8683M = jVar.f8683M;
        this.f8684N = jVar.f8684N;
        this.f8686P = jVar.f8686P;
        this.f8687Q = jVar.f8687Q;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void f(Context context, AttributeSet attributeSet) {
        a.b(this, context.obtainStyledAttributes(attributeSet, h.m.Of));
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void j(String str, Object obj) {
        str.hashCode();
        char c4 = 65535;
        switch (str.hashCode()) {
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c4 = 0;
                    break;
                }
                break;
            case -1127236479:
                if (str.equals("percentWidth")) {
                    c4 = 1;
                    break;
                }
                break;
            case -1017587252:
                if (str.equals("percentHeight")) {
                    c4 = 2;
                    break;
                }
                break;
            case -827014263:
                if (str.equals("drawPath")) {
                    c4 = 3;
                    break;
                }
                break;
            case -200259324:
                if (str.equals("sizePercent")) {
                    c4 = 4;
                    break;
                }
                break;
            case 428090547:
                if (str.equals("percentX")) {
                    c4 = 5;
                    break;
                }
                break;
            case 428090548:
                if (str.equals("percentY")) {
                    c4 = 6;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                this.f8676F = obj.toString();
                return;
            case 1:
                this.f8679I = m(obj);
                return;
            case 2:
                this.f8680J = m(obj);
                return;
            case 3:
                this.f8678H = n(obj);
                return;
            case 4:
                float m4 = m(obj);
                this.f8679I = m4;
                this.f8680J = m4;
                return;
            case 5:
                this.f8681K = m(obj);
                return;
            case 6:
                this.f8682L = m(obj);
                return;
            default:
                return;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.k
    void o(int i4, int i5, float f4, float f5, float f6, float f7) {
        int i6 = this.f8685O;
        if (i6 != 1) {
            if (i6 != 2) {
                t(f4, f5, f6, f7);
                return;
            } else {
                v(i4, i5);
                return;
            }
        }
        u(f4, f5, f6, f7);
    }

    @Override // androidx.constraintlayout.motion.widget.k
    float p() {
        return this.f8686P;
    }

    @Override // androidx.constraintlayout.motion.widget.k
    float q() {
        return this.f8687Q;
    }

    @Override // androidx.constraintlayout.motion.widget.k
    public boolean r(int i4, int i5, RectF rectF, RectF rectF2, float f4, float f5) {
        o(i4, i5, rectF.centerX(), rectF.centerY(), rectF2.centerX(), rectF2.centerY());
        if (Math.abs(f4 - this.f8686P) < 20.0f && Math.abs(f5 - this.f8687Q) < 20.0f) {
            return true;
        }
        return false;
    }

    @Override // androidx.constraintlayout.motion.widget.k
    public void s(View view, RectF rectF, RectF rectF2, float f4, float f5, String[] strArr, float[] fArr) {
        int i4 = this.f8685O;
        if (i4 != 1) {
            if (i4 != 2) {
                w(rectF, rectF2, f4, f5, strArr, fArr);
                return;
            } else {
                y(view, rectF, rectF2, f4, f5, strArr, fArr);
                return;
            }
        }
        x(rectF, rectF2, f4, f5, strArr, fArr);
    }

    void w(RectF rectF, RectF rectF2, float f4, float f5, String[] strArr, float[] fArr) {
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float centerX2 = rectF2.centerX() - centerX;
        float centerY2 = rectF2.centerY() - centerY;
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = (f4 - centerX) / centerX2;
                fArr[1] = (f5 - centerY) / centerY2;
                return;
            } else {
                fArr[1] = (f4 - centerX) / centerX2;
                fArr[0] = (f5 - centerY) / centerY2;
                return;
            }
        }
        strArr[0] = "percentX";
        fArr[0] = (f4 - centerX) / centerX2;
        strArr[1] = "percentY";
        fArr[1] = (f5 - centerY) / centerY2;
    }

    void x(RectF rectF, RectF rectF2, float f4, float f5, String[] strArr, float[] fArr) {
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float centerX2 = rectF2.centerX() - centerX;
        float centerY2 = rectF2.centerY() - centerY;
        float hypot = (float) Math.hypot(centerX2, centerY2);
        if (hypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f6 = centerX2 / hypot;
        float f7 = centerY2 / hypot;
        float f8 = f5 - centerY;
        float f9 = f4 - centerX;
        float f10 = ((f6 * f8) - (f9 * f7)) / hypot;
        float f11 = ((f6 * f9) + (f7 * f8)) / hypot;
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = f11;
                fArr[1] = f10;
                return;
            }
            return;
        }
        strArr[0] = "percentX";
        strArr[1] = "percentY";
        fArr[0] = f11;
        fArr[1] = f10;
    }

    void y(View view, RectF rectF, RectF rectF2, float f4, float f5, String[] strArr, float[] fArr) {
        rectF.centerX();
        rectF.centerY();
        rectF2.centerX();
        rectF2.centerY();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = f4 / width;
                fArr[1] = f5 / height;
                return;
            } else {
                fArr[1] = f4 / width;
                fArr[0] = f5 / height;
                return;
            }
        }
        strArr[0] = "percentX";
        fArr[0] = f4 / width;
        strArr[1] = "percentY";
        fArr[1] = f5 / height;
    }

    public void z(int i4) {
        this.f8685O = i4;
    }
}
