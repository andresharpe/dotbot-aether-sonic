package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.s;
import androidx.constraintlayout.widget.h;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class w {

    /* renamed from: G, reason: collision with root package name */
    private static final String f9232G = "TouchResponse";

    /* renamed from: H, reason: collision with root package name */
    private static final boolean f9233H = false;

    /* renamed from: I, reason: collision with root package name */
    private static final int f9234I = 1000;

    /* renamed from: J, reason: collision with root package name */
    private static final float f9235J = 1.0E-7f;

    /* renamed from: K, reason: collision with root package name */
    private static final float[][] f9236K = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* renamed from: L, reason: collision with root package name */
    private static final float[][] f9237L = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* renamed from: M, reason: collision with root package name */
    private static final int f9238M = 0;

    /* renamed from: N, reason: collision with root package name */
    private static final int f9239N = 1;

    /* renamed from: O, reason: collision with root package name */
    private static final int f9240O = 2;

    /* renamed from: P, reason: collision with root package name */
    private static final int f9241P = 3;

    /* renamed from: Q, reason: collision with root package name */
    private static final int f9242Q = 4;

    /* renamed from: R, reason: collision with root package name */
    private static final int f9243R = 5;

    /* renamed from: S, reason: collision with root package name */
    private static final int f9244S = 0;

    /* renamed from: T, reason: collision with root package name */
    private static final int f9245T = 1;

    /* renamed from: U, reason: collision with root package name */
    private static final int f9246U = 2;

    /* renamed from: V, reason: collision with root package name */
    private static final int f9247V = 3;

    /* renamed from: W, reason: collision with root package name */
    private static final int f9248W = 4;

    /* renamed from: X, reason: collision with root package name */
    private static final int f9249X = 5;

    /* renamed from: Y, reason: collision with root package name */
    private static final int f9250Y = 6;

    /* renamed from: Z, reason: collision with root package name */
    static final int f9251Z = 1;

    /* renamed from: a0, reason: collision with root package name */
    static final int f9252a0 = 2;

    /* renamed from: b0, reason: collision with root package name */
    static final int f9253b0 = 4;

    /* renamed from: c0, reason: collision with root package name */
    public static final int f9254c0 = 0;

    /* renamed from: d0, reason: collision with root package name */
    public static final int f9255d0 = 1;

    /* renamed from: A, reason: collision with root package name */
    private float f9256A;

    /* renamed from: B, reason: collision with root package name */
    private float f9257B;

    /* renamed from: C, reason: collision with root package name */
    private float f9258C;

    /* renamed from: D, reason: collision with root package name */
    private float f9259D;

    /* renamed from: E, reason: collision with root package name */
    private int f9260E;

    /* renamed from: F, reason: collision with root package name */
    private int f9261F;

    /* renamed from: a, reason: collision with root package name */
    private int f9262a;

    /* renamed from: b, reason: collision with root package name */
    private int f9263b;

    /* renamed from: c, reason: collision with root package name */
    private int f9264c;

    /* renamed from: d, reason: collision with root package name */
    private int f9265d;

    /* renamed from: e, reason: collision with root package name */
    private int f9266e;

    /* renamed from: f, reason: collision with root package name */
    private int f9267f;

    /* renamed from: g, reason: collision with root package name */
    private float f9268g;

    /* renamed from: h, reason: collision with root package name */
    private float f9269h;

    /* renamed from: i, reason: collision with root package name */
    float f9270i;

    /* renamed from: j, reason: collision with root package name */
    float f9271j;

    /* renamed from: k, reason: collision with root package name */
    private int f9272k;

    /* renamed from: l, reason: collision with root package name */
    boolean f9273l;

    /* renamed from: m, reason: collision with root package name */
    private float f9274m;

    /* renamed from: n, reason: collision with root package name */
    private float f9275n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f9276o;

    /* renamed from: p, reason: collision with root package name */
    private float[] f9277p;

    /* renamed from: q, reason: collision with root package name */
    private int[] f9278q;

    /* renamed from: r, reason: collision with root package name */
    private float f9279r;

    /* renamed from: s, reason: collision with root package name */
    private float f9280s;

    /* renamed from: t, reason: collision with root package name */
    private final s f9281t;

    /* renamed from: u, reason: collision with root package name */
    private float f9282u;

    /* renamed from: v, reason: collision with root package name */
    private float f9283v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f9284w;

    /* renamed from: x, reason: collision with root package name */
    private float f9285x;

    /* renamed from: y, reason: collision with root package name */
    private int f9286y;

    /* renamed from: z, reason: collision with root package name */
    private float f9287z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnTouchListener {
        a(w wVar) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements NestedScrollView.c {
        b(w wVar) {
        }

        @Override // androidx.core.widget.NestedScrollView.c
        public void a(NestedScrollView nestedScrollView, int i4, int i5, int i6, int i7) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(Context context, s sVar, XmlPullParser xmlPullParser) {
        this.f9262a = 0;
        this.f9263b = 0;
        this.f9264c = 0;
        this.f9265d = -1;
        this.f9266e = -1;
        this.f9267f = -1;
        this.f9268g = 0.5f;
        this.f9269h = 0.5f;
        this.f9270i = 0.5f;
        this.f9271j = 0.5f;
        this.f9272k = -1;
        this.f9273l = false;
        this.f9274m = 0.0f;
        this.f9275n = 1.0f;
        this.f9276o = false;
        this.f9277p = new float[2];
        this.f9278q = new int[2];
        this.f9282u = 4.0f;
        this.f9283v = 1.2f;
        this.f9284w = true;
        this.f9285x = 1.0f;
        this.f9286y = 0;
        this.f9287z = 10.0f;
        this.f9256A = 10.0f;
        this.f9257B = 1.0f;
        this.f9258C = Float.NaN;
        this.f9259D = Float.NaN;
        this.f9260E = 0;
        this.f9261F = 0;
        this.f9281t = sVar;
        c(context, Xml.asAttributeSet(xmlPullParser));
    }

    private void b(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArray.getIndex(i4);
            if (index == h.m.dl) {
                this.f9265d = typedArray.getResourceId(index, this.f9265d);
            } else if (index == h.m.el) {
                int i5 = typedArray.getInt(index, this.f9262a);
                this.f9262a = i5;
                float[] fArr = f9236K[i5];
                this.f9269h = fArr[0];
                this.f9268g = fArr[1];
            } else if (index == h.m.Ok) {
                int i6 = typedArray.getInt(index, this.f9263b);
                this.f9263b = i6;
                float[][] fArr2 = f9237L;
                if (i6 < fArr2.length) {
                    float[] fArr3 = fArr2[i6];
                    this.f9274m = fArr3[0];
                    this.f9275n = fArr3[1];
                } else {
                    this.f9275n = Float.NaN;
                    this.f9274m = Float.NaN;
                    this.f9273l = true;
                }
            } else if (index == h.m.Tk) {
                this.f9282u = typedArray.getFloat(index, this.f9282u);
            } else if (index == h.m.Sk) {
                this.f9283v = typedArray.getFloat(index, this.f9283v);
            } else if (index == h.m.Uk) {
                this.f9284w = typedArray.getBoolean(index, this.f9284w);
            } else if (index == h.m.Pk) {
                this.f9285x = typedArray.getFloat(index, this.f9285x);
            } else if (index == h.m.Qk) {
                this.f9287z = typedArray.getFloat(index, this.f9287z);
            } else if (index == h.m.fl) {
                this.f9266e = typedArray.getResourceId(index, this.f9266e);
            } else if (index == h.m.Wk) {
                this.f9264c = typedArray.getInt(index, this.f9264c);
            } else if (index == h.m.Vk) {
                this.f9286y = typedArray.getInteger(index, 0);
            } else if (index == h.m.Rk) {
                this.f9267f = typedArray.getResourceId(index, 0);
            } else if (index == h.m.Xk) {
                this.f9272k = typedArray.getResourceId(index, this.f9272k);
            } else if (index == h.m.Zk) {
                this.f9256A = typedArray.getFloat(index, this.f9256A);
            } else if (index == h.m.al) {
                this.f9257B = typedArray.getFloat(index, this.f9257B);
            } else if (index == h.m.bl) {
                this.f9258C = typedArray.getFloat(index, this.f9258C);
            } else if (index == h.m.cl) {
                this.f9259D = typedArray.getFloat(index, this.f9259D);
            } else if (index == h.m.Yk) {
                this.f9260E = typedArray.getInt(index, this.f9260E);
            } else if (index == h.m.Nk) {
                this.f9261F = typedArray.getInt(index, this.f9261F);
            }
        }
    }

    private void c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.m.Mk);
        b(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(float f4, float f5) {
        this.f9279r = f4;
        this.f9280s = f5;
    }

    public void B(float f4) {
        this.f9283v = f4;
    }

    public void C(float f4) {
        this.f9282u = f4;
    }

    public void D(boolean z3) {
        if (z3) {
            float[][] fArr = f9237L;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = f9236K;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = f9237L;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = f9236K;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = f9236K[this.f9262a];
        this.f9269h = fArr5[0];
        this.f9268g = fArr5[1];
        int i4 = this.f9263b;
        float[][] fArr6 = f9237L;
        if (i4 >= fArr6.length) {
            return;
        }
        float[] fArr7 = fArr6[i4];
        this.f9274m = fArr7[0];
        this.f9275n = fArr7[1];
    }

    public void E(float f4, float f5) {
        this.f9269h = f4;
        this.f9268g = f5;
    }

    public void F(int i4) {
        this.f9264c = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G(float f4, float f5) {
        this.f9279r = f4;
        this.f9280s = f5;
        this.f9276o = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H() {
        View view;
        int i4 = this.f9265d;
        if (i4 != -1) {
            view = this.f9281t.findViewById(i4);
            if (view == null) {
                Log.e(f9232G, "cannot find TouchAnchorId @id/" + c.i(this.f9281t.getContext(), this.f9265d));
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new a(this));
            nestedScrollView.setOnScrollChangeListener(new b(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float a(float f4, float f5) {
        return (f4 * this.f9274m) + (f5 * this.f9275n);
    }

    public int d() {
        return this.f9265d;
    }

    public int e() {
        return this.f9261F;
    }

    public int f() {
        return this.f9286y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RectF g(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i4 = this.f9267f;
        if (i4 == -1 || (findViewById = viewGroup.findViewById(i4)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    int h() {
        return this.f9267f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float i() {
        return this.f9283v;
    }

    public float j() {
        return this.f9282u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean k() {
        return this.f9284w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float l(float f4, float f5) {
        this.f9281t.D0(this.f9265d, this.f9281t.getProgress(), this.f9269h, this.f9268g, this.f9277p);
        float f6 = this.f9274m;
        if (f6 != 0.0f) {
            float[] fArr = this.f9277p;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f4 * f6) / fArr[0];
        }
        float[] fArr2 = this.f9277p;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f5 * this.f9275n) / fArr2[1];
    }

    public int m() {
        return this.f9260E;
    }

    public float n() {
        return this.f9256A;
    }

    public float o() {
        return this.f9257B;
    }

    public float p() {
        return this.f9258C;
    }

    public float q() {
        return this.f9259D;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RectF r(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i4 = this.f9266e;
        if (i4 == -1 || (findViewById = viewGroup.findViewById(i4)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int s() {
        return this.f9266e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean t() {
        return this.f9276o;
    }

    public String toString() {
        if (Float.isNaN(this.f9274m)) {
            return f.f8538i;
        }
        return this.f9274m + " , " + this.f9275n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(MotionEvent motionEvent, s.i iVar, int i4, u uVar) {
        float f4;
        float f5;
        int i5;
        float f6;
        float f7;
        boolean z3;
        float f8;
        if (this.f9273l) {
            v(motionEvent, iVar, i4, uVar);
            return;
        }
        iVar.e(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float rawY = motionEvent.getRawY() - this.f9280s;
                    float rawX = motionEvent.getRawX() - this.f9279r;
                    if (Math.abs((this.f9274m * rawX) + (this.f9275n * rawY)) > this.f9287z || this.f9276o) {
                        float progress = this.f9281t.getProgress();
                        if (!this.f9276o) {
                            this.f9276o = true;
                            this.f9281t.setProgress(progress);
                        }
                        int i6 = this.f9265d;
                        if (i6 != -1) {
                            this.f9281t.D0(i6, progress, this.f9269h, this.f9268g, this.f9277p);
                        } else {
                            float min = Math.min(this.f9281t.getWidth(), this.f9281t.getHeight());
                            float[] fArr = this.f9277p;
                            fArr[1] = this.f9275n * min;
                            fArr[0] = min * this.f9274m;
                        }
                        float f9 = this.f9274m;
                        float[] fArr2 = this.f9277p;
                        if (Math.abs(((f9 * fArr2[0]) + (this.f9275n * fArr2[1])) * this.f9285x) < 0.01d) {
                            float[] fArr3 = this.f9277p;
                            fArr3[0] = 0.01f;
                            fArr3[1] = 0.01f;
                        }
                        if (this.f9274m != 0.0f) {
                            f7 = rawX / this.f9277p[0];
                        } else {
                            f7 = rawY / this.f9277p[1];
                        }
                        float max = Math.max(Math.min(progress + f7, 1.0f), 0.0f);
                        if (this.f9264c == 6) {
                            max = Math.max(max, 0.01f);
                        }
                        if (this.f9264c == 7) {
                            max = Math.min(max, 0.99f);
                        }
                        float progress2 = this.f9281t.getProgress();
                        if (max != progress2) {
                            if (progress2 == 0.0f || progress2 == 1.0f) {
                                s sVar = this.f9281t;
                                if (progress2 == 0.0f) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                sVar.w0(z3);
                            }
                            this.f9281t.setProgress(max);
                            iVar.h(1000);
                            float g4 = iVar.g();
                            float f10 = iVar.f();
                            if (this.f9274m != 0.0f) {
                                f8 = g4 / this.f9277p[0];
                            } else {
                                f8 = f10 / this.f9277p[1];
                            }
                            this.f9281t.f8992s0 = f8;
                        } else {
                            this.f9281t.f8992s0 = 0.0f;
                        }
                        this.f9279r = motionEvent.getRawX();
                        this.f9280s = motionEvent.getRawY();
                        return;
                    }
                    return;
                }
                return;
            }
            this.f9276o = false;
            iVar.h(1000);
            float g5 = iVar.g();
            float f11 = iVar.f();
            float progress3 = this.f9281t.getProgress();
            int i7 = this.f9265d;
            if (i7 != -1) {
                this.f9281t.D0(i7, progress3, this.f9269h, this.f9268g, this.f9277p);
            } else {
                float min2 = Math.min(this.f9281t.getWidth(), this.f9281t.getHeight());
                float[] fArr4 = this.f9277p;
                fArr4[1] = this.f9275n * min2;
                fArr4[0] = min2 * this.f9274m;
            }
            float f12 = this.f9274m;
            float[] fArr5 = this.f9277p;
            float f13 = fArr5[0];
            float f14 = fArr5[1];
            if (f12 != 0.0f) {
                f4 = g5 / f13;
            } else {
                f4 = f11 / f14;
            }
            if (!Float.isNaN(f4)) {
                f5 = (f4 / 3.0f) + progress3;
            } else {
                f5 = progress3;
            }
            if (f5 != 0.0f && f5 != 1.0f && (i5 = this.f9264c) != 3) {
                if (f5 < 0.5d) {
                    f6 = 0.0f;
                } else {
                    f6 = 1.0f;
                }
                if (i5 == 6) {
                    if (progress3 + f4 < 0.0f) {
                        f4 = Math.abs(f4);
                    }
                    f6 = 1.0f;
                }
                if (this.f9264c == 7) {
                    if (progress3 + f4 > 1.0f) {
                        f4 = -Math.abs(f4);
                    }
                    f6 = 0.0f;
                }
                this.f9281t.e1(this.f9264c, f6, f4);
                if (0.0f >= progress3 || 1.0f <= progress3) {
                    this.f9281t.setState(s.m.FINISHED);
                    return;
                }
                return;
            }
            if (0.0f >= f5 || 1.0f <= f5) {
                this.f9281t.setState(s.m.FINISHED);
                return;
            }
            return;
        }
        this.f9279r = motionEvent.getRawX();
        this.f9280s = motionEvent.getRawY();
        this.f9276o = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0294  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void v(android.view.MotionEvent r24, androidx.constraintlayout.motion.widget.s.i r25, int r26, androidx.constraintlayout.motion.widget.u r27) {
        /*
            Method dump skipped, instructions count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.w.v(android.view.MotionEvent, androidx.constraintlayout.motion.widget.s$i, int, androidx.constraintlayout.motion.widget.u):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(float f4, float f5) {
        float f6;
        float progress = this.f9281t.getProgress();
        if (!this.f9276o) {
            this.f9276o = true;
            this.f9281t.setProgress(progress);
        }
        this.f9281t.D0(this.f9265d, progress, this.f9269h, this.f9268g, this.f9277p);
        float f7 = this.f9274m;
        float[] fArr = this.f9277p;
        if (Math.abs((f7 * fArr[0]) + (this.f9275n * fArr[1])) < 0.01d) {
            float[] fArr2 = this.f9277p;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f8 = this.f9274m;
        if (f8 != 0.0f) {
            f6 = (f4 * f8) / this.f9277p[0];
        } else {
            f6 = (f5 * this.f9275n) / this.f9277p[1];
        }
        float max = Math.max(Math.min(progress + f6, 1.0f), 0.0f);
        if (max != this.f9281t.getProgress()) {
            this.f9281t.setProgress(max);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(float f4, float f5) {
        float f6;
        boolean z3;
        boolean z4 = false;
        this.f9276o = false;
        float progress = this.f9281t.getProgress();
        this.f9281t.D0(this.f9265d, progress, this.f9269h, this.f9268g, this.f9277p);
        float f7 = this.f9274m;
        float[] fArr = this.f9277p;
        float f8 = fArr[0];
        float f9 = this.f9275n;
        float f10 = fArr[1];
        float f11 = 0.0f;
        if (f7 != 0.0f) {
            f6 = (f4 * f7) / f8;
        } else {
            f6 = (f5 * f9) / f10;
        }
        if (!Float.isNaN(f6)) {
            progress += f6 / 3.0f;
        }
        if (progress != 0.0f) {
            if (progress != 1.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i4 = this.f9264c;
            if (i4 != 3) {
                z4 = true;
            }
            if (z4 & z3) {
                s sVar = this.f9281t;
                if (progress >= 0.5d) {
                    f11 = 1.0f;
                }
                sVar.e1(i4, f11, f6);
            }
        }
    }

    public void y(int i4) {
        this.f9265d = i4;
    }

    void z(int i4) {
        this.f9261F = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(s sVar, v vVar) {
        this.f9262a = 0;
        this.f9263b = 0;
        this.f9264c = 0;
        this.f9265d = -1;
        this.f9266e = -1;
        this.f9267f = -1;
        this.f9268g = 0.5f;
        this.f9269h = 0.5f;
        this.f9270i = 0.5f;
        this.f9271j = 0.5f;
        this.f9272k = -1;
        this.f9273l = false;
        this.f9274m = 0.0f;
        this.f9275n = 1.0f;
        this.f9276o = false;
        this.f9277p = new float[2];
        this.f9278q = new int[2];
        this.f9282u = 4.0f;
        this.f9283v = 1.2f;
        this.f9284w = true;
        this.f9285x = 1.0f;
        this.f9286y = 0;
        this.f9287z = 10.0f;
        this.f9256A = 10.0f;
        this.f9257B = 1.0f;
        this.f9258C = Float.NaN;
        this.f9259D = Float.NaN;
        this.f9260E = 0;
        this.f9261F = 0;
        this.f9281t = sVar;
        this.f9265d = vVar.q();
        int r4 = vVar.r();
        this.f9262a = r4;
        if (r4 != -1) {
            float[] fArr = f9236K[r4];
            this.f9269h = fArr[0];
            this.f9268g = fArr[1];
        }
        int b4 = vVar.b();
        this.f9263b = b4;
        float[][] fArr2 = f9237L;
        if (b4 < fArr2.length) {
            float[] fArr3 = fArr2[b4];
            this.f9274m = fArr3[0];
            this.f9275n = fArr3[1];
        } else {
            this.f9275n = Float.NaN;
            this.f9274m = Float.NaN;
            this.f9273l = true;
        }
        this.f9282u = vVar.g();
        this.f9283v = vVar.f();
        this.f9284w = vVar.h();
        this.f9285x = vVar.c();
        this.f9287z = vVar.d();
        this.f9266e = vVar.s();
        this.f9264c = vVar.j();
        this.f9286y = vVar.i();
        this.f9267f = vVar.e();
        this.f9272k = vVar.k();
        this.f9260E = vVar.l();
        this.f9256A = vVar.m();
        this.f9257B = vVar.n();
        this.f9258C = vVar.o();
        this.f9259D = vVar.p();
        this.f9261F = vVar.a();
    }
}
