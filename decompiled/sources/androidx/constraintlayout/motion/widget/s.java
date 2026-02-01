package androidx.constraintlayout.motion.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.annotation.D;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.motion.widget.u;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import androidx.constraintlayout.widget.h;
import androidx.core.view.C0823k0;
import androidx.core.view.X;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o.InterfaceMenuC2377a;

/* loaded from: classes.dex */
public class s extends ConstraintLayout implements X {

    /* renamed from: Q1, reason: collision with root package name */
    public static final int f8909Q1 = 0;

    /* renamed from: R1, reason: collision with root package name */
    public static final int f8910R1 = 1;

    /* renamed from: S1, reason: collision with root package name */
    public static final int f8911S1 = 2;

    /* renamed from: T1, reason: collision with root package name */
    public static final int f8912T1 = 3;

    /* renamed from: U1, reason: collision with root package name */
    public static final int f8913U1 = 4;

    /* renamed from: V1, reason: collision with root package name */
    public static final int f8914V1 = 5;

    /* renamed from: W1, reason: collision with root package name */
    public static final int f8915W1 = 6;

    /* renamed from: X1, reason: collision with root package name */
    public static final int f8916X1 = 7;

    /* renamed from: Y1, reason: collision with root package name */
    static final String f8917Y1 = "MotionLayout";

    /* renamed from: Z1, reason: collision with root package name */
    private static final boolean f8918Z1 = false;

    /* renamed from: a2, reason: collision with root package name */
    public static boolean f8919a2 = false;

    /* renamed from: b2, reason: collision with root package name */
    public static final int f8920b2 = 0;

    /* renamed from: c2, reason: collision with root package name */
    public static final int f8921c2 = 1;

    /* renamed from: d2, reason: collision with root package name */
    public static final int f8922d2 = 2;

    /* renamed from: e2, reason: collision with root package name */
    static final int f8923e2 = 50;

    /* renamed from: f2, reason: collision with root package name */
    public static final int f8924f2 = 0;

    /* renamed from: g2, reason: collision with root package name */
    public static final int f8925g2 = 1;

    /* renamed from: h2, reason: collision with root package name */
    public static final int f8926h2 = 2;

    /* renamed from: i2, reason: collision with root package name */
    public static final int f8927i2 = 3;

    /* renamed from: j2, reason: collision with root package name */
    private static final float f8928j2 = 1.0E-5f;

    /* renamed from: A0, reason: collision with root package name */
    private long f8929A0;

    /* renamed from: A1, reason: collision with root package name */
    int f8930A1;

    /* renamed from: B0, reason: collision with root package name */
    private float f8931B0;

    /* renamed from: B1, reason: collision with root package name */
    private boolean f8932B1;

    /* renamed from: C0, reason: collision with root package name */
    float f8933C0;

    /* renamed from: C1, reason: collision with root package name */
    int f8934C1;

    /* renamed from: D0, reason: collision with root package name */
    float f8935D0;

    /* renamed from: D1, reason: collision with root package name */
    HashMap<View, androidx.constraintlayout.motion.utils.e> f8936D1;

    /* renamed from: E0, reason: collision with root package name */
    private long f8937E0;

    /* renamed from: E1, reason: collision with root package name */
    private int f8938E1;

    /* renamed from: F0, reason: collision with root package name */
    float f8939F0;

    /* renamed from: F1, reason: collision with root package name */
    private int f8940F1;

    /* renamed from: G0, reason: collision with root package name */
    private boolean f8941G0;

    /* renamed from: G1, reason: collision with root package name */
    private int f8942G1;

    /* renamed from: H0, reason: collision with root package name */
    boolean f8943H0;

    /* renamed from: H1, reason: collision with root package name */
    Rect f8944H1;

    /* renamed from: I0, reason: collision with root package name */
    boolean f8945I0;

    /* renamed from: I1, reason: collision with root package name */
    private boolean f8946I1;

    /* renamed from: J0, reason: collision with root package name */
    private l f8947J0;

    /* renamed from: J1, reason: collision with root package name */
    m f8948J1;

    /* renamed from: K0, reason: collision with root package name */
    private float f8949K0;

    /* renamed from: K1, reason: collision with root package name */
    h f8950K1;

    /* renamed from: L0, reason: collision with root package name */
    private float f8951L0;

    /* renamed from: L1, reason: collision with root package name */
    private boolean f8952L1;

    /* renamed from: M0, reason: collision with root package name */
    int f8953M0;

    /* renamed from: M1, reason: collision with root package name */
    private RectF f8954M1;

    /* renamed from: N0, reason: collision with root package name */
    g f8955N0;

    /* renamed from: N1, reason: collision with root package name */
    private View f8956N1;

    /* renamed from: O0, reason: collision with root package name */
    private boolean f8957O0;

    /* renamed from: O1, reason: collision with root package name */
    private Matrix f8958O1;

    /* renamed from: P0, reason: collision with root package name */
    private androidx.constraintlayout.motion.utils.b f8959P0;

    /* renamed from: P1, reason: collision with root package name */
    ArrayList<Integer> f8960P1;

    /* renamed from: Q0, reason: collision with root package name */
    private f f8961Q0;

    /* renamed from: R0, reason: collision with root package name */
    private androidx.constraintlayout.motion.widget.d f8962R0;

    /* renamed from: S0, reason: collision with root package name */
    boolean f8963S0;

    /* renamed from: T0, reason: collision with root package name */
    int f8964T0;

    /* renamed from: U0, reason: collision with root package name */
    int f8965U0;

    /* renamed from: V0, reason: collision with root package name */
    int f8966V0;

    /* renamed from: W0, reason: collision with root package name */
    int f8967W0;

    /* renamed from: X0, reason: collision with root package name */
    boolean f8968X0;

    /* renamed from: Y0, reason: collision with root package name */
    float f8969Y0;

    /* renamed from: Z0, reason: collision with root package name */
    float f8970Z0;

    /* renamed from: a1, reason: collision with root package name */
    long f8971a1;

    /* renamed from: b1, reason: collision with root package name */
    float f8972b1;

    /* renamed from: c1, reason: collision with root package name */
    private boolean f8973c1;

    /* renamed from: d1, reason: collision with root package name */
    private ArrayList<p> f8974d1;

    /* renamed from: e1, reason: collision with root package name */
    private ArrayList<p> f8975e1;

    /* renamed from: f1, reason: collision with root package name */
    private ArrayList<p> f8976f1;

    /* renamed from: g1, reason: collision with root package name */
    private CopyOnWriteArrayList<l> f8977g1;

    /* renamed from: h1, reason: collision with root package name */
    private int f8978h1;

    /* renamed from: i1, reason: collision with root package name */
    private long f8979i1;

    /* renamed from: j1, reason: collision with root package name */
    private float f8980j1;

    /* renamed from: k1, reason: collision with root package name */
    private int f8981k1;

    /* renamed from: l1, reason: collision with root package name */
    private float f8982l1;

    /* renamed from: m1, reason: collision with root package name */
    boolean f8983m1;

    /* renamed from: n1, reason: collision with root package name */
    protected boolean f8984n1;

    /* renamed from: o1, reason: collision with root package name */
    int f8985o1;

    /* renamed from: p0, reason: collision with root package name */
    u f8986p0;

    /* renamed from: p1, reason: collision with root package name */
    int f8987p1;

    /* renamed from: q0, reason: collision with root package name */
    Interpolator f8988q0;

    /* renamed from: q1, reason: collision with root package name */
    int f8989q1;

    /* renamed from: r0, reason: collision with root package name */
    Interpolator f8990r0;

    /* renamed from: r1, reason: collision with root package name */
    int f8991r1;

    /* renamed from: s0, reason: collision with root package name */
    float f8992s0;

    /* renamed from: s1, reason: collision with root package name */
    int f8993s1;

    /* renamed from: t0, reason: collision with root package name */
    private int f8994t0;

    /* renamed from: t1, reason: collision with root package name */
    int f8995t1;

    /* renamed from: u0, reason: collision with root package name */
    int f8996u0;

    /* renamed from: u1, reason: collision with root package name */
    float f8997u1;

    /* renamed from: v0, reason: collision with root package name */
    private int f8998v0;

    /* renamed from: v1, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.g f8999v1;

    /* renamed from: w0, reason: collision with root package name */
    private int f9000w0;

    /* renamed from: w1, reason: collision with root package name */
    private boolean f9001w1;

    /* renamed from: x0, reason: collision with root package name */
    private int f9002x0;

    /* renamed from: x1, reason: collision with root package name */
    private k f9003x1;

    /* renamed from: y0, reason: collision with root package name */
    private boolean f9004y0;

    /* renamed from: y1, reason: collision with root package name */
    private Runnable f9005y1;

    /* renamed from: z0, reason: collision with root package name */
    HashMap<View, o> f9006z0;

    /* renamed from: z1, reason: collision with root package name */
    private int[] f9007z1;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.f9003x1.a();
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.f8932B1 = false;
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ View f9010E;

        c(s sVar, View view) {
            this.f9010E = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9010E.setNestedScrollingEnabled(true);
        }
    }

    /* loaded from: classes.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.f9003x1.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9012a;

        static {
            int[] iArr = new int[m.values().length];
            f9012a = iArr;
            try {
                iArr[m.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9012a[m.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9012a[m.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9012a[m.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    class f extends r {

        /* renamed from: a, reason: collision with root package name */
        float f9013a = 0.0f;

        /* renamed from: b, reason: collision with root package name */
        float f9014b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        float f9015c;

        f() {
        }

        @Override // androidx.constraintlayout.motion.widget.r
        public float a() {
            return s.this.f8992s0;
        }

        public void b(float f4, float f5, float f6) {
            this.f9013a = f4;
            this.f9014b = f5;
            this.f9015c = f6;
        }

        @Override // androidx.constraintlayout.motion.widget.r, android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            float f5;
            float f6;
            float f7 = this.f9013a;
            if (f7 > 0.0f) {
                float f8 = this.f9015c;
                if (f7 / f8 < f4) {
                    f4 = f7 / f8;
                }
                s.this.f8992s0 = f7 - (f8 * f4);
                f5 = (f7 * f4) - (((f8 * f4) * f4) / 2.0f);
                f6 = this.f9014b;
            } else {
                float f9 = this.f9015c;
                if ((-f7) / f9 < f4) {
                    f4 = (-f7) / f9;
                }
                s.this.f8992s0 = (f9 * f4) + f7;
                f5 = (f7 * f4) + (((f9 * f4) * f4) / 2.0f);
                f6 = this.f9014b;
            }
            return f5 + f6;
        }
    }

    /* loaded from: classes.dex */
    private class g {

        /* renamed from: v, reason: collision with root package name */
        private static final int f9017v = 16;

        /* renamed from: a, reason: collision with root package name */
        float[] f9018a;

        /* renamed from: b, reason: collision with root package name */
        int[] f9019b;

        /* renamed from: c, reason: collision with root package name */
        float[] f9020c;

        /* renamed from: d, reason: collision with root package name */
        Path f9021d;

        /* renamed from: e, reason: collision with root package name */
        Paint f9022e;

        /* renamed from: f, reason: collision with root package name */
        Paint f9023f;

        /* renamed from: g, reason: collision with root package name */
        Paint f9024g;

        /* renamed from: h, reason: collision with root package name */
        Paint f9025h;

        /* renamed from: i, reason: collision with root package name */
        Paint f9026i;

        /* renamed from: j, reason: collision with root package name */
        private float[] f9027j;

        /* renamed from: p, reason: collision with root package name */
        DashPathEffect f9033p;

        /* renamed from: q, reason: collision with root package name */
        int f9034q;

        /* renamed from: t, reason: collision with root package name */
        int f9037t;

        /* renamed from: k, reason: collision with root package name */
        final int f9028k = -21965;

        /* renamed from: l, reason: collision with root package name */
        final int f9029l = -2067046;

        /* renamed from: m, reason: collision with root package name */
        final int f9030m = -13391360;

        /* renamed from: n, reason: collision with root package name */
        final int f9031n = 1996488704;

        /* renamed from: o, reason: collision with root package name */
        final int f9032o = 10;

        /* renamed from: r, reason: collision with root package name */
        Rect f9035r = new Rect();

        /* renamed from: s, reason: collision with root package name */
        boolean f9036s = false;

        g() {
            this.f9037t = 1;
            Paint paint = new Paint();
            this.f9022e = paint;
            paint.setAntiAlias(true);
            this.f9022e.setColor(-21965);
            this.f9022e.setStrokeWidth(2.0f);
            Paint paint2 = this.f9022e;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            this.f9023f = paint3;
            paint3.setAntiAlias(true);
            this.f9023f.setColor(-2067046);
            this.f9023f.setStrokeWidth(2.0f);
            this.f9023f.setStyle(style);
            Paint paint4 = new Paint();
            this.f9024g = paint4;
            paint4.setAntiAlias(true);
            this.f9024g.setColor(-13391360);
            this.f9024g.setStrokeWidth(2.0f);
            this.f9024g.setStyle(style);
            Paint paint5 = new Paint();
            this.f9025h = paint5;
            paint5.setAntiAlias(true);
            this.f9025h.setColor(-13391360);
            this.f9025h.setTextSize(s.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f9027j = new float[8];
            Paint paint6 = new Paint();
            this.f9026i = paint6;
            paint6.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.f9033p = dashPathEffect;
            this.f9024g.setPathEffect(dashPathEffect);
            this.f9020c = new float[100];
            this.f9019b = new int[50];
            if (this.f9036s) {
                this.f9022e.setStrokeWidth(8.0f);
                this.f9026i.setStrokeWidth(8.0f);
                this.f9023f.setStrokeWidth(8.0f);
                this.f9037t = 4;
            }
        }

        private void c(Canvas canvas) {
            canvas.drawLines(this.f9018a, this.f9022e);
        }

        private void d(Canvas canvas) {
            boolean z3 = false;
            boolean z4 = false;
            for (int i4 = 0; i4 < this.f9034q; i4++) {
                int i5 = this.f9019b[i4];
                if (i5 == 1) {
                    z3 = true;
                }
                if (i5 == 0) {
                    z4 = true;
                }
            }
            if (z3) {
                g(canvas);
            }
            if (z4) {
                e(canvas);
            }
        }

        private void e(Canvas canvas) {
            float[] fArr = this.f9018a;
            float f4 = fArr[0];
            float f5 = fArr[1];
            float f6 = fArr[fArr.length - 2];
            float f7 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f4, f6), Math.max(f5, f7), Math.max(f4, f6), Math.max(f5, f7), this.f9024g);
            canvas.drawLine(Math.min(f4, f6), Math.min(f5, f7), Math.min(f4, f6), Math.max(f5, f7), this.f9024g);
        }

        private void f(Canvas canvas, float f4, float f5) {
            float[] fArr = this.f9018a;
            float f6 = fArr[0];
            float f7 = fArr[1];
            float f8 = fArr[fArr.length - 2];
            float f9 = fArr[fArr.length - 1];
            float min = Math.min(f6, f8);
            float max = Math.max(f7, f9);
            float min2 = f4 - Math.min(f6, f8);
            float max2 = Math.max(f7, f9) - f5;
            String str = "" + (((int) (((min2 * 100.0f) / Math.abs(f8 - f6)) + 0.5d)) / 100.0f);
            m(str, this.f9025h);
            canvas.drawText(str, ((min2 / 2.0f) - (this.f9035r.width() / 2)) + min, f5 - 20.0f, this.f9025h);
            canvas.drawLine(f4, f5, Math.min(f6, f8), f5, this.f9024g);
            String str2 = "" + (((int) (((max2 * 100.0f) / Math.abs(f9 - f7)) + 0.5d)) / 100.0f);
            m(str2, this.f9025h);
            canvas.drawText(str2, f4 + 5.0f, max - ((max2 / 2.0f) - (this.f9035r.height() / 2)), this.f9025h);
            canvas.drawLine(f4, f5, f4, Math.max(f7, f9), this.f9024g);
        }

        private void g(Canvas canvas) {
            float[] fArr = this.f9018a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f9024g);
        }

        private void h(Canvas canvas, float f4, float f5) {
            float[] fArr = this.f9018a;
            float f6 = fArr[0];
            float f7 = fArr[1];
            float f8 = fArr[fArr.length - 2];
            float f9 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot(f6 - f8, f7 - f9);
            float f10 = f8 - f6;
            float f11 = f9 - f7;
            float f12 = (((f4 - f6) * f10) + ((f5 - f7) * f11)) / (hypot * hypot);
            float f13 = f6 + (f10 * f12);
            float f14 = f7 + (f12 * f11);
            Path path = new Path();
            path.moveTo(f4, f5);
            path.lineTo(f13, f14);
            float hypot2 = (float) Math.hypot(f13 - f4, f14 - f5);
            String str = "" + (((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
            m(str, this.f9025h);
            canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - (this.f9035r.width() / 2), -20.0f, this.f9025h);
            canvas.drawLine(f4, f5, f13, f14, this.f9024g);
        }

        private void i(Canvas canvas, float f4, float f5, int i4, int i5) {
            String str = "" + (((int) ((((f4 - (i4 / 2)) * 100.0f) / (s.this.getWidth() - i4)) + 0.5d)) / 100.0f);
            m(str, this.f9025h);
            canvas.drawText(str, ((f4 / 2.0f) - (this.f9035r.width() / 2)) + 0.0f, f5 - 20.0f, this.f9025h);
            canvas.drawLine(f4, f5, Math.min(0.0f, 1.0f), f5, this.f9024g);
            String str2 = "" + (((int) ((((f5 - (i5 / 2)) * 100.0f) / (s.this.getHeight() - i5)) + 0.5d)) / 100.0f);
            m(str2, this.f9025h);
            canvas.drawText(str2, f4 + 5.0f, 0.0f - ((f5 / 2.0f) - (this.f9035r.height() / 2)), this.f9025h);
            canvas.drawLine(f4, f5, f4, Math.max(0.0f, 1.0f), this.f9024g);
        }

        private void j(Canvas canvas, o oVar) {
            this.f9021d.reset();
            for (int i4 = 0; i4 <= 50; i4++) {
                oVar.g(i4 / 50, this.f9027j, 0);
                Path path = this.f9021d;
                float[] fArr = this.f9027j;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f9021d;
                float[] fArr2 = this.f9027j;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f9021d;
                float[] fArr3 = this.f9027j;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f9021d;
                float[] fArr4 = this.f9027j;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f9021d.close();
            }
            this.f9022e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f9021d, this.f9022e);
            canvas.translate(-2.0f, -2.0f);
            this.f9022e.setColor(InterfaceMenuC2377a.f55290c);
            canvas.drawPath(this.f9021d, this.f9022e);
        }

        private void k(Canvas canvas, int i4, int i5, o oVar) {
            int i6;
            int i7;
            float f4;
            float f5;
            View view = oVar.f8879b;
            if (view != null) {
                i6 = view.getWidth();
                i7 = oVar.f8879b.getHeight();
            } else {
                i6 = 0;
                i7 = 0;
            }
            for (int i8 = 1; i8 < i5 - 1; i8++) {
                if (i4 != 4 || this.f9019b[i8 - 1] != 0) {
                    float[] fArr = this.f9020c;
                    int i9 = i8 * 2;
                    float f6 = fArr[i9];
                    float f7 = fArr[i9 + 1];
                    this.f9021d.reset();
                    this.f9021d.moveTo(f6, f7 + 10.0f);
                    this.f9021d.lineTo(f6 + 10.0f, f7);
                    this.f9021d.lineTo(f6, f7 - 10.0f);
                    this.f9021d.lineTo(f6 - 10.0f, f7);
                    this.f9021d.close();
                    int i10 = i8 - 1;
                    oVar.w(i10);
                    if (i4 == 4) {
                        int i11 = this.f9019b[i10];
                        if (i11 == 1) {
                            h(canvas, f6 - 0.0f, f7 - 0.0f);
                        } else if (i11 == 0) {
                            f(canvas, f6 - 0.0f, f7 - 0.0f);
                        } else if (i11 == 2) {
                            f4 = f7;
                            f5 = f6;
                            i(canvas, f6 - 0.0f, f7 - 0.0f, i6, i7);
                            canvas.drawPath(this.f9021d, this.f9026i);
                        }
                        f4 = f7;
                        f5 = f6;
                        canvas.drawPath(this.f9021d, this.f9026i);
                    } else {
                        f4 = f7;
                        f5 = f6;
                    }
                    if (i4 == 2) {
                        h(canvas, f5 - 0.0f, f4 - 0.0f);
                    }
                    if (i4 == 3) {
                        f(canvas, f5 - 0.0f, f4 - 0.0f);
                    }
                    if (i4 == 6) {
                        i(canvas, f5 - 0.0f, f4 - 0.0f, i6, i7);
                    }
                    canvas.drawPath(this.f9021d, this.f9026i);
                }
            }
            float[] fArr2 = this.f9018a;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f9023f);
                float[] fArr3 = this.f9018a;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f9023f);
            }
        }

        private void l(Canvas canvas, float f4, float f5, float f6, float f7) {
            canvas.drawRect(f4, f5, f6, f7, this.f9024g);
            canvas.drawLine(f4, f5, f6, f7, this.f9024g);
        }

        public void a(Canvas canvas, HashMap<View, o> hashMap, int i4, int i5) {
            if (hashMap != null && hashMap.size() != 0) {
                canvas.save();
                if (!s.this.isInEditMode() && (i5 & 1) == 2) {
                    String str = s.this.getContext().getResources().getResourceName(s.this.f8998v0) + ":" + s.this.getProgress();
                    canvas.drawText(str, 10.0f, s.this.getHeight() - 30, this.f9025h);
                    canvas.drawText(str, 11.0f, s.this.getHeight() - 29, this.f9022e);
                }
                for (o oVar : hashMap.values()) {
                    int q4 = oVar.q();
                    if (i5 > 0 && q4 == 0) {
                        q4 = 1;
                    }
                    if (q4 != 0) {
                        this.f9034q = oVar.e(this.f9020c, this.f9019b);
                        if (q4 >= 1) {
                            int i6 = i4 / 16;
                            float[] fArr = this.f9018a;
                            if (fArr == null || fArr.length != i6 * 2) {
                                this.f9018a = new float[i6 * 2];
                                this.f9021d = new Path();
                            }
                            int i7 = this.f9037t;
                            canvas.translate(i7, i7);
                            this.f9022e.setColor(1996488704);
                            this.f9026i.setColor(1996488704);
                            this.f9023f.setColor(1996488704);
                            this.f9024g.setColor(1996488704);
                            oVar.f(this.f9018a, i6);
                            b(canvas, q4, this.f9034q, oVar);
                            this.f9022e.setColor(-21965);
                            this.f9023f.setColor(-2067046);
                            this.f9026i.setColor(-2067046);
                            this.f9024g.setColor(-13391360);
                            int i8 = this.f9037t;
                            canvas.translate(-i8, -i8);
                            b(canvas, q4, this.f9034q, oVar);
                            if (q4 == 5) {
                                j(canvas, oVar);
                            }
                        }
                    }
                }
                canvas.restore();
            }
        }

        public void b(Canvas canvas, int i4, int i5, o oVar) {
            if (i4 == 4) {
                d(canvas);
            }
            if (i4 == 2) {
                g(canvas);
            }
            if (i4 == 3) {
                e(canvas);
            }
            c(canvas);
            k(canvas, i4, i5, oVar);
        }

        void m(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f9035r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h {

        /* renamed from: a, reason: collision with root package name */
        androidx.constraintlayout.core.widgets.d f9039a = new androidx.constraintlayout.core.widgets.d();

        /* renamed from: b, reason: collision with root package name */
        androidx.constraintlayout.core.widgets.d f9040b = new androidx.constraintlayout.core.widgets.d();

        /* renamed from: c, reason: collision with root package name */
        androidx.constraintlayout.widget.d f9041c = null;

        /* renamed from: d, reason: collision with root package name */
        androidx.constraintlayout.widget.d f9042d = null;

        /* renamed from: e, reason: collision with root package name */
        int f9043e;

        /* renamed from: f, reason: collision with root package name */
        int f9044f;

        h() {
        }

        private void b(int i4, int i5) {
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int optimizationLevel = s.this.getOptimizationLevel();
            s sVar = s.this;
            if (sVar.f8996u0 == sVar.getStartState()) {
                s sVar2 = s.this;
                androidx.constraintlayout.core.widgets.d dVar = this.f9040b;
                androidx.constraintlayout.widget.d dVar2 = this.f9042d;
                if (dVar2 != null && dVar2.f9832e != 0) {
                    i9 = i5;
                } else {
                    i9 = i4;
                }
                if (dVar2 != null && dVar2.f9832e != 0) {
                    i10 = i4;
                } else {
                    i10 = i5;
                }
                sVar2.E(dVar, optimizationLevel, i9, i10);
                androidx.constraintlayout.widget.d dVar3 = this.f9041c;
                if (dVar3 != null) {
                    s sVar3 = s.this;
                    androidx.constraintlayout.core.widgets.d dVar4 = this.f9039a;
                    int i12 = dVar3.f9832e;
                    if (i12 == 0) {
                        i11 = i4;
                    } else {
                        i11 = i5;
                    }
                    if (i12 == 0) {
                        i4 = i5;
                    }
                    sVar3.E(dVar4, optimizationLevel, i11, i4);
                    return;
                }
                return;
            }
            androidx.constraintlayout.widget.d dVar5 = this.f9041c;
            if (dVar5 != null) {
                s sVar4 = s.this;
                androidx.constraintlayout.core.widgets.d dVar6 = this.f9039a;
                int i13 = dVar5.f9832e;
                if (i13 == 0) {
                    i7 = i4;
                } else {
                    i7 = i5;
                }
                if (i13 == 0) {
                    i8 = i5;
                } else {
                    i8 = i4;
                }
                sVar4.E(dVar6, optimizationLevel, i7, i8);
            }
            s sVar5 = s.this;
            androidx.constraintlayout.core.widgets.d dVar7 = this.f9040b;
            androidx.constraintlayout.widget.d dVar8 = this.f9042d;
            if (dVar8 != null && dVar8.f9832e != 0) {
                i6 = i5;
            } else {
                i6 = i4;
            }
            if (dVar8 == null || dVar8.f9832e == 0) {
                i4 = i5;
            }
            sVar5.E(dVar7, optimizationLevel, i6, i4);
        }

        @SuppressLint({"LogConditional"})
        private void d(String str, androidx.constraintlayout.core.widgets.d dVar) {
            String str2;
            String str3;
            String str4;
            String str5 = str + " " + androidx.constraintlayout.motion.widget.c.k((View) dVar.w());
            Log.v(s.f8917Y1, str5 + "  ========= " + dVar);
            int size = dVar.l2().size();
            for (int i4 = 0; i4 < size; i4++) {
                String str6 = str5 + "[" + i4 + "] ";
                ConstraintWidget constraintWidget = dVar.l2().get(i4);
                StringBuilder sb = new StringBuilder();
                sb.append("");
                String str7 = "_";
                if (constraintWidget.f7957R.f7885f == null) {
                    str2 = "_";
                } else {
                    str2 = androidx.exifinterface.media.a.f5;
                }
                sb.append(str2);
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                if (constraintWidget.f7961T.f7885f == null) {
                    str3 = "_";
                } else {
                    str3 = "B";
                }
                sb3.append(str3);
                String sb4 = sb3.toString();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(sb4);
                if (constraintWidget.f7955Q.f7885f == null) {
                    str4 = "_";
                } else {
                    str4 = "L";
                }
                sb5.append(str4);
                String sb6 = sb5.toString();
                StringBuilder sb7 = new StringBuilder();
                sb7.append(sb6);
                if (constraintWidget.f7959S.f7885f != null) {
                    str7 = "R";
                }
                sb7.append(str7);
                String sb8 = sb7.toString();
                View view = (View) constraintWidget.w();
                String k4 = androidx.constraintlayout.motion.widget.c.k(view);
                if (view instanceof TextView) {
                    k4 = k4 + "(" + ((Object) ((TextView) view).getText()) + ")";
                }
                Log.v(s.f8917Y1, str6 + "  " + k4 + " " + constraintWidget + " " + sb8);
            }
            Log.v(s.f8917Y1, str5 + " done. ");
        }

        @SuppressLint({"LogConditional"})
        private void e(String str, ConstraintLayout.b bVar) {
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            StringBuilder sb = new StringBuilder();
            sb.append(" ");
            if (bVar.f9557t != -1) {
                str2 = "SS";
            } else {
                str2 = "__";
            }
            sb.append(str2);
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            String str13 = "|__";
            if (bVar.f9555s == -1) {
                str3 = "|__";
            } else {
                str3 = "|SE";
            }
            sb3.append(str3);
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            if (bVar.f9559u == -1) {
                str4 = "|__";
            } else {
                str4 = "|ES";
            }
            sb5.append(str4);
            String sb6 = sb5.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            if (bVar.f9561v == -1) {
                str5 = "|__";
            } else {
                str5 = "|EE";
            }
            sb7.append(str5);
            String sb8 = sb7.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append(sb8);
            if (bVar.f9527e == -1) {
                str6 = "|__";
            } else {
                str6 = "|LL";
            }
            sb9.append(str6);
            String sb10 = sb9.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append(sb10);
            if (bVar.f9529f == -1) {
                str7 = "|__";
            } else {
                str7 = "|LR";
            }
            sb11.append(str7);
            String sb12 = sb11.toString();
            StringBuilder sb13 = new StringBuilder();
            sb13.append(sb12);
            if (bVar.f9531g == -1) {
                str8 = "|__";
            } else {
                str8 = "|RL";
            }
            sb13.append(str8);
            String sb14 = sb13.toString();
            StringBuilder sb15 = new StringBuilder();
            sb15.append(sb14);
            if (bVar.f9533h == -1) {
                str9 = "|__";
            } else {
                str9 = "|RR";
            }
            sb15.append(str9);
            String sb16 = sb15.toString();
            StringBuilder sb17 = new StringBuilder();
            sb17.append(sb16);
            if (bVar.f9535i == -1) {
                str10 = "|__";
            } else {
                str10 = "|TT";
            }
            sb17.append(str10);
            String sb18 = sb17.toString();
            StringBuilder sb19 = new StringBuilder();
            sb19.append(sb18);
            if (bVar.f9537j == -1) {
                str11 = "|__";
            } else {
                str11 = "|TB";
            }
            sb19.append(str11);
            String sb20 = sb19.toString();
            StringBuilder sb21 = new StringBuilder();
            sb21.append(sb20);
            if (bVar.f9539k == -1) {
                str12 = "|__";
            } else {
                str12 = "|BT";
            }
            sb21.append(str12);
            String sb22 = sb21.toString();
            StringBuilder sb23 = new StringBuilder();
            sb23.append(sb22);
            if (bVar.f9541l != -1) {
                str13 = "|BB";
            }
            sb23.append(str13);
            Log.v(s.f8917Y1, str + sb23.toString());
        }

        @SuppressLint({"LogConditional"})
        private void f(String str, ConstraintWidget constraintWidget) {
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            StringBuilder sb = new StringBuilder();
            sb.append(" ");
            String str7 = "B";
            String str8 = "__";
            if (constraintWidget.f7957R.f7885f == null) {
                str2 = "__";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(androidx.exifinterface.media.a.f5);
                if (constraintWidget.f7957R.f7885f.f7884e != ConstraintAnchor.Type.TOP) {
                    str6 = "B";
                } else {
                    str6 = androidx.exifinterface.media.a.f5;
                }
                sb2.append(str6);
                str2 = sb2.toString();
            }
            sb.append(str2);
            String sb3 = sb.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb3);
            if (constraintWidget.f7961T.f7885f == null) {
                str3 = "__";
            } else {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("B");
                if (constraintWidget.f7961T.f7885f.f7884e == ConstraintAnchor.Type.TOP) {
                    str7 = androidx.exifinterface.media.a.f5;
                }
                sb5.append(str7);
                str3 = sb5.toString();
            }
            sb4.append(str3);
            String sb6 = sb4.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            String str9 = "R";
            if (constraintWidget.f7955Q.f7885f == null) {
                str4 = "__";
            } else {
                StringBuilder sb8 = new StringBuilder();
                sb8.append("L");
                if (constraintWidget.f7955Q.f7885f.f7884e != ConstraintAnchor.Type.LEFT) {
                    str5 = "R";
                } else {
                    str5 = "L";
                }
                sb8.append(str5);
                str4 = sb8.toString();
            }
            sb7.append(str4);
            String sb9 = sb7.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append(sb9);
            if (constraintWidget.f7959S.f7885f != null) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append("R");
                if (constraintWidget.f7959S.f7885f.f7884e == ConstraintAnchor.Type.LEFT) {
                    str9 = "L";
                }
                sb11.append(str9);
                str8 = sb11.toString();
            }
            sb10.append(str8);
            Log.v(s.f8917Y1, str + sb10.toString() + " ---  " + constraintWidget);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void m(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.widget.d dVar2) {
            SparseArray<ConstraintWidget> sparseArray = new SparseArray<>();
            e.a aVar = new e.a(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, dVar);
            sparseArray.put(s.this.getId(), dVar);
            if (dVar2 != null && dVar2.f9832e != 0) {
                s sVar = s.this;
                sVar.E(this.f9040b, sVar.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(s.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(s.this.getWidth(), 1073741824));
            }
            Iterator<ConstraintWidget> it = dVar.l2().iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.f1(true);
                sparseArray.put(((View) next.w()).getId(), next);
            }
            Iterator<ConstraintWidget> it2 = dVar.l2().iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                View view = (View) next2.w();
                dVar2.u(view.getId(), aVar);
                next2.c2(dVar2.v0(view.getId()));
                next2.y1(dVar2.n0(view.getId()));
                if (view instanceof androidx.constraintlayout.widget.a) {
                    dVar2.s((androidx.constraintlayout.widget.a) view, next2, aVar, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).K();
                    }
                }
                aVar.resolveLayoutDirection(s.this.getLayoutDirection());
                s.this.j(false, view, next2, aVar, sparseArray);
                if (dVar2.u0(view.getId()) == 1) {
                    next2.b2(view.getVisibility());
                } else {
                    next2.b2(dVar2.t0(view.getId()));
                }
            }
            Iterator<ConstraintWidget> it3 = dVar.l2().iterator();
            while (it3.hasNext()) {
                ConstraintWidget next3 = it3.next();
                if (next3 instanceof androidx.constraintlayout.core.widgets.l) {
                    androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) next3.w();
                    androidx.constraintlayout.core.widgets.g gVar = (androidx.constraintlayout.core.widgets.g) next3;
                    aVar2.I(dVar, gVar, sparseArray);
                    ((androidx.constraintlayout.core.widgets.l) gVar).n2();
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x013c A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a() {
            /*
                Method dump skipped, instructions count: 359
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.s.h.a():void");
        }

        void c(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.core.widgets.d dVar2) {
            ConstraintWidget constraintWidget;
            ArrayList<ConstraintWidget> l22 = dVar.l2();
            HashMap<ConstraintWidget, ConstraintWidget> hashMap = new HashMap<>();
            hashMap.put(dVar, dVar2);
            dVar2.l2().clear();
            dVar2.n(dVar, hashMap);
            Iterator<ConstraintWidget> it = l22.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                if (next instanceof androidx.constraintlayout.core.widgets.a) {
                    constraintWidget = new androidx.constraintlayout.core.widgets.a();
                } else if (next instanceof androidx.constraintlayout.core.widgets.f) {
                    constraintWidget = new androidx.constraintlayout.core.widgets.f();
                } else if (next instanceof androidx.constraintlayout.core.widgets.e) {
                    constraintWidget = new androidx.constraintlayout.core.widgets.e();
                } else if (next instanceof androidx.constraintlayout.core.widgets.j) {
                    constraintWidget = new androidx.constraintlayout.core.widgets.j();
                } else if (next instanceof androidx.constraintlayout.core.widgets.g) {
                    constraintWidget = new androidx.constraintlayout.core.widgets.h();
                } else {
                    constraintWidget = new ConstraintWidget();
                }
                dVar2.b(constraintWidget);
                hashMap.put(next, constraintWidget);
            }
            Iterator<ConstraintWidget> it2 = l22.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                hashMap.get(next2).n(next2, hashMap);
            }
        }

        ConstraintWidget g(androidx.constraintlayout.core.widgets.d dVar, View view) {
            if (dVar.w() == view) {
                return dVar;
            }
            ArrayList<ConstraintWidget> l22 = dVar.l2();
            int size = l22.size();
            for (int i4 = 0; i4 < size; i4++) {
                ConstraintWidget constraintWidget = l22.get(i4);
                if (constraintWidget.w() == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        void h(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.widget.d dVar2, androidx.constraintlayout.widget.d dVar3) {
            this.f9041c = dVar2;
            this.f9042d = dVar3;
            this.f9039a = new androidx.constraintlayout.core.widgets.d();
            this.f9040b = new androidx.constraintlayout.core.widgets.d();
            this.f9039a.U2(((ConstraintLayout) s.this).f9445G.G2());
            this.f9040b.U2(((ConstraintLayout) s.this).f9445G.G2());
            this.f9039a.p2();
            this.f9040b.p2();
            c(((ConstraintLayout) s.this).f9445G, this.f9039a);
            c(((ConstraintLayout) s.this).f9445G, this.f9040b);
            if (s.this.f8935D0 > 0.5d) {
                if (dVar2 != null) {
                    m(this.f9039a, dVar2);
                }
                m(this.f9040b, dVar3);
            } else {
                m(this.f9040b, dVar3);
                if (dVar2 != null) {
                    m(this.f9039a, dVar2);
                }
            }
            this.f9039a.Y2(s.this.y());
            this.f9039a.a3();
            this.f9040b.Y2(s.this.y());
            this.f9040b.a3();
            ViewGroup.LayoutParams layoutParams = s.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    androidx.constraintlayout.core.widgets.d dVar4 = this.f9039a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    dVar4.D1(dimensionBehaviour);
                    this.f9040b.D1(dimensionBehaviour);
                }
                if (layoutParams.height == -2) {
                    androidx.constraintlayout.core.widgets.d dVar5 = this.f9039a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    dVar5.Y1(dimensionBehaviour2);
                    this.f9040b.Y1(dimensionBehaviour2);
                }
            }
        }

        public boolean i(int i4, int i5) {
            if (i4 == this.f9043e && i5 == this.f9044f) {
                return false;
            }
            return true;
        }

        public void j(int i4, int i5) {
            boolean z3;
            boolean z4;
            boolean z5;
            int mode = View.MeasureSpec.getMode(i4);
            int mode2 = View.MeasureSpec.getMode(i5);
            s sVar = s.this;
            sVar.f8993s1 = mode;
            sVar.f8995t1 = mode2;
            sVar.getOptimizationLevel();
            b(i4, i5);
            if (!(s.this.getParent() instanceof s) || mode != 1073741824 || mode2 != 1073741824) {
                b(i4, i5);
                s.this.f8985o1 = this.f9039a.m0();
                s.this.f8987p1 = this.f9039a.D();
                s.this.f8989q1 = this.f9040b.m0();
                s.this.f8991r1 = this.f9040b.D();
                s sVar2 = s.this;
                if (sVar2.f8985o1 == sVar2.f8989q1 && sVar2.f8987p1 == sVar2.f8991r1) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                sVar2.f8984n1 = z3;
            }
            s sVar3 = s.this;
            int i6 = sVar3.f8985o1;
            int i7 = sVar3.f8987p1;
            int i8 = sVar3.f8993s1;
            if (i8 == Integer.MIN_VALUE || i8 == 0) {
                i6 = (int) (i6 + (sVar3.f8997u1 * (sVar3.f8989q1 - i6)));
            }
            int i9 = i6;
            int i10 = sVar3.f8995t1;
            if (i10 == Integer.MIN_VALUE || i10 == 0) {
                i7 = (int) (i7 + (sVar3.f8997u1 * (sVar3.f8991r1 - i7)));
            }
            int i11 = i7;
            if (!this.f9039a.P2() && !this.f9040b.P2()) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!this.f9039a.N2() && !this.f9040b.N2()) {
                z5 = false;
            } else {
                z5 = true;
            }
            s.this.D(i4, i5, i9, i11, z4, z5);
        }

        public void k() {
            j(s.this.f9000w0, s.this.f9002x0);
            s.this.c1();
        }

        public void l(int i4, int i5) {
            this.f9043e = i4;
            this.f9044f = i5;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public interface i {
        void a();

        void b(int i4, float f4);

        float c(int i4);

        void clear();

        float d(int i4);

        void e(MotionEvent motionEvent);

        float f();

        float g();

        void h(int i4);
    }

    /* loaded from: classes.dex */
    private static class j implements i {

        /* renamed from: b, reason: collision with root package name */
        private static j f9046b = new j();

        /* renamed from: a, reason: collision with root package name */
        VelocityTracker f9047a;

        private j() {
        }

        public static j i() {
            f9046b.f9047a = VelocityTracker.obtain();
            return f9046b;
        }

        @Override // androidx.constraintlayout.motion.widget.s.i
        public void a() {
            VelocityTracker velocityTracker = this.f9047a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f9047a = null;
            }
        }

        @Override // androidx.constraintlayout.motion.widget.s.i
        public void b(int i4, float f4) {
            VelocityTracker velocityTracker = this.f9047a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i4, f4);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.s.i
        public float c(int i4) {
            VelocityTracker velocityTracker = this.f9047a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity(i4);
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.s.i
        public void clear() {
            VelocityTracker velocityTracker = this.f9047a;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }

        @Override // androidx.constraintlayout.motion.widget.s.i
        public float d(int i4) {
            if (this.f9047a != null) {
                return d(i4);
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.s.i
        public void e(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.f9047a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.s.i
        public float f() {
            VelocityTracker velocityTracker = this.f9047a;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.s.i
        public float g() {
            VelocityTracker velocityTracker = this.f9047a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.s.i
        public void h(int i4) {
            VelocityTracker velocityTracker = this.f9047a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class k {

        /* renamed from: a, reason: collision with root package name */
        float f9048a = Float.NaN;

        /* renamed from: b, reason: collision with root package name */
        float f9049b = Float.NaN;

        /* renamed from: c, reason: collision with root package name */
        int f9050c = -1;

        /* renamed from: d, reason: collision with root package name */
        int f9051d = -1;

        /* renamed from: e, reason: collision with root package name */
        final String f9052e = "motion.progress";

        /* renamed from: f, reason: collision with root package name */
        final String f9053f = "motion.velocity";

        /* renamed from: g, reason: collision with root package name */
        final String f9054g = "motion.StartState";

        /* renamed from: h, reason: collision with root package name */
        final String f9055h = "motion.EndState";

        k() {
        }

        void a() {
            int i4 = this.f9050c;
            if (i4 != -1 || this.f9051d != -1) {
                if (i4 == -1) {
                    s.this.j1(this.f9051d);
                } else {
                    int i5 = this.f9051d;
                    if (i5 == -1) {
                        s.this.I(i4, -1, -1);
                    } else {
                        s.this.b1(i4, i5);
                    }
                }
                s.this.setState(m.SETUP);
            }
            if (Float.isNaN(this.f9049b)) {
                if (Float.isNaN(this.f9048a)) {
                    return;
                }
                s.this.setProgress(this.f9048a);
            } else {
                s.this.a1(this.f9048a, this.f9049b);
                this.f9048a = Float.NaN;
                this.f9049b = Float.NaN;
                this.f9050c = -1;
                this.f9051d = -1;
            }
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f9048a);
            bundle.putFloat("motion.velocity", this.f9049b);
            bundle.putInt("motion.StartState", this.f9050c);
            bundle.putInt("motion.EndState", this.f9051d);
            return bundle;
        }

        public void c() {
            this.f9051d = s.this.f8998v0;
            this.f9050c = s.this.f8994t0;
            this.f9049b = s.this.getVelocity();
            this.f9048a = s.this.getProgress();
        }

        public void d(int i4) {
            this.f9051d = i4;
        }

        public void e(float f4) {
            this.f9048a = f4;
        }

        public void f(int i4) {
            this.f9050c = i4;
        }

        public void g(Bundle bundle) {
            this.f9048a = bundle.getFloat("motion.progress");
            this.f9049b = bundle.getFloat("motion.velocity");
            this.f9050c = bundle.getInt("motion.StartState");
            this.f9051d = bundle.getInt("motion.EndState");
        }

        public void h(float f4) {
            this.f9049b = f4;
        }
    }

    /* loaded from: classes.dex */
    public interface l {
        void a(s sVar, int i4, int i5, float f4);

        void c(s sVar, int i4, int i5);

        void d(s sVar, int i4, boolean z3, float f4);

        void k(s sVar, int i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum m {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public s(@N Context context) {
        super(context);
        this.f8990r0 = null;
        this.f8992s0 = 0.0f;
        this.f8994t0 = -1;
        this.f8996u0 = -1;
        this.f8998v0 = -1;
        this.f9000w0 = 0;
        this.f9002x0 = 0;
        this.f9004y0 = true;
        this.f9006z0 = new HashMap<>();
        this.f8929A0 = 0L;
        this.f8931B0 = 1.0f;
        this.f8933C0 = 0.0f;
        this.f8935D0 = 0.0f;
        this.f8939F0 = 0.0f;
        this.f8943H0 = false;
        this.f8945I0 = false;
        this.f8953M0 = 0;
        this.f8957O0 = false;
        this.f8959P0 = new androidx.constraintlayout.motion.utils.b();
        this.f8961Q0 = new f();
        this.f8963S0 = true;
        this.f8968X0 = false;
        this.f8973c1 = false;
        this.f8974d1 = null;
        this.f8975e1 = null;
        this.f8976f1 = null;
        this.f8977g1 = null;
        this.f8978h1 = 0;
        this.f8979i1 = -1L;
        this.f8980j1 = 0.0f;
        this.f8981k1 = 0;
        this.f8982l1 = 0.0f;
        this.f8983m1 = false;
        this.f8984n1 = false;
        this.f8999v1 = new androidx.constraintlayout.core.motion.utils.g();
        this.f9001w1 = false;
        this.f9005y1 = null;
        this.f9007z1 = null;
        this.f8930A1 = 0;
        this.f8932B1 = false;
        this.f8934C1 = 0;
        this.f8936D1 = new HashMap<>();
        this.f8944H1 = new Rect();
        this.f8946I1 = false;
        this.f8948J1 = m.UNDEFINED;
        this.f8950K1 = new h();
        this.f8952L1 = false;
        this.f8954M1 = new RectF();
        this.f8956N1 = null;
        this.f8958O1 = null;
        this.f8960P1 = new ArrayList<>();
        L0(null);
    }

    private void B0(s sVar, int i4, int i5) {
        l lVar = this.f8947J0;
        if (lVar != null) {
            lVar.c(this, i4, i5);
        }
        CopyOnWriteArrayList<l> copyOnWriteArrayList = this.f8977g1;
        if (copyOnWriteArrayList != null) {
            Iterator<l> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().c(sVar, i4, i5);
            }
        }
    }

    private boolean K0(float f4, float f5, View view, MotionEvent motionEvent) {
        boolean z3;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (K0((r3.getLeft() + f4) - view.getScrollX(), (r3.getTop() + f5) - view.getScrollY(), viewGroup.getChildAt(childCount), motionEvent)) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        if (!z3) {
            this.f8954M1.set(f4, f5, (view.getRight() + f4) - view.getLeft(), (view.getBottom() + f5) - view.getTop());
            if ((motionEvent.getAction() != 0 || this.f8954M1.contains(motionEvent.getX(), motionEvent.getY())) && m0(view, motionEvent, -f4, -f5)) {
                return true;
            }
        }
        return z3;
    }

    private void L0(AttributeSet attributeSet) {
        u uVar;
        int i4;
        f8919a2 = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.m.vk);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z3 = true;
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == h.m.yk) {
                    this.f8986p0 = new u(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == h.m.xk) {
                    this.f8996u0 = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == h.m.Ak) {
                    this.f8939F0 = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.f8943H0 = true;
                } else if (index == h.m.wk) {
                    z3 = obtainStyledAttributes.getBoolean(index, z3);
                } else if (index == h.m.Bk) {
                    if (this.f8953M0 == 0) {
                        if (obtainStyledAttributes.getBoolean(index, false)) {
                            i4 = 2;
                        } else {
                            i4 = 0;
                        }
                        this.f8953M0 = i4;
                    }
                } else if (index == h.m.zk) {
                    this.f8953M0 = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (this.f8986p0 == null) {
                Log.e(f8917Y1, "WARNING NO app:layoutDescription tag");
            }
            if (!z3) {
                this.f8986p0 = null;
            }
        }
        if (this.f8953M0 != 0) {
            n0();
        }
        if (this.f8996u0 == -1 && (uVar = this.f8986p0) != null) {
            this.f8996u0 = uVar.O();
            this.f8994t0 = this.f8986p0.O();
            this.f8998v0 = this.f8986p0.u();
        }
    }

    private void U0() {
        CopyOnWriteArrayList<l> copyOnWriteArrayList;
        if (this.f8947J0 == null && ((copyOnWriteArrayList = this.f8977g1) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        this.f8983m1 = false;
        Iterator<Integer> it = this.f8960P1.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            l lVar = this.f8947J0;
            if (lVar != null) {
                lVar.k(this, next.intValue());
            }
            CopyOnWriteArrayList<l> copyOnWriteArrayList2 = this.f8977g1;
            if (copyOnWriteArrayList2 != null) {
                Iterator<l> it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().k(this, next.intValue());
                }
            }
        }
        this.f8960P1.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c1() {
        float f4;
        float f5;
        int childCount = getChildCount();
        this.f8950K1.a();
        boolean z3 = true;
        this.f8943H0 = true;
        SparseArray sparseArray = new SparseArray();
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            sparseArray.put(childAt.getId(), this.f9006z0.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int m4 = this.f8986p0.m();
        if (m4 != -1) {
            for (int i6 = 0; i6 < childCount; i6++) {
                o oVar = this.f9006z0.get(getChildAt(i6));
                if (oVar != null) {
                    oVar.U(m4);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.f9006z0.size()];
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            o oVar2 = this.f9006z0.get(getChildAt(i8));
            if (oVar2.k() != -1) {
                sparseBooleanArray.put(oVar2.k(), true);
                iArr[i7] = oVar2.k();
                i7++;
            }
        }
        if (this.f8976f1 != null) {
            for (int i9 = 0; i9 < i7; i9++) {
                o oVar3 = this.f9006z0.get(findViewById(iArr[i9]));
                if (oVar3 != null) {
                    this.f8986p0.z(oVar3);
                }
            }
            Iterator<p> it = this.f8976f1.iterator();
            while (it.hasNext()) {
                it.next().g(this, this.f9006z0);
            }
            for (int i10 = 0; i10 < i7; i10++) {
                o oVar4 = this.f9006z0.get(findViewById(iArr[i10]));
                if (oVar4 != null) {
                    oVar4.a0(width, height, this.f8931B0, getNanoTime());
                }
            }
        } else {
            for (int i11 = 0; i11 < i7; i11++) {
                o oVar5 = this.f9006z0.get(findViewById(iArr[i11]));
                if (oVar5 != null) {
                    this.f8986p0.z(oVar5);
                    oVar5.a0(width, height, this.f8931B0, getNanoTime());
                }
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            o oVar6 = this.f9006z0.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && oVar6 != null) {
                this.f8986p0.z(oVar6);
                oVar6.a0(width, height, this.f8931B0, getNanoTime());
            }
        }
        float N3 = this.f8986p0.N();
        if (N3 != 0.0f) {
            if (N3 >= com.google.firebase.remoteconfig.l.f37524n) {
                z3 = false;
            }
            float abs = Math.abs(N3);
            float f6 = -3.4028235E38f;
            float f7 = Float.MAX_VALUE;
            float f8 = -3.4028235E38f;
            float f9 = Float.MAX_VALUE;
            for (int i13 = 0; i13 < childCount; i13++) {
                o oVar7 = this.f9006z0.get(getChildAt(i13));
                if (!Float.isNaN(oVar7.f8890m)) {
                    for (int i14 = 0; i14 < childCount; i14++) {
                        o oVar8 = this.f9006z0.get(getChildAt(i14));
                        if (!Float.isNaN(oVar8.f8890m)) {
                            f7 = Math.min(f7, oVar8.f8890m);
                            f6 = Math.max(f6, oVar8.f8890m);
                        }
                    }
                    while (i4 < childCount) {
                        o oVar9 = this.f9006z0.get(getChildAt(i4));
                        if (!Float.isNaN(oVar9.f8890m)) {
                            oVar9.f8892o = 1.0f / (1.0f - abs);
                            if (z3) {
                                oVar9.f8891n = abs - (((f6 - oVar9.f8890m) / (f6 - f7)) * abs);
                            } else {
                                oVar9.f8891n = abs - (((oVar9.f8890m - f7) * abs) / (f6 - f7));
                            }
                        }
                        i4++;
                    }
                    return;
                }
                float t3 = oVar7.t();
                float u3 = oVar7.u();
                if (z3) {
                    f5 = u3 - t3;
                } else {
                    f5 = u3 + t3;
                }
                f9 = Math.min(f9, f5);
                f8 = Math.max(f8, f5);
            }
            while (i4 < childCount) {
                o oVar10 = this.f9006z0.get(getChildAt(i4));
                float t4 = oVar10.t();
                float u4 = oVar10.u();
                if (z3) {
                    f4 = u4 - t4;
                } else {
                    f4 = u4 + t4;
                }
                oVar10.f8892o = 1.0f / (1.0f - abs);
                oVar10.f8891n = abs - (((f4 - f9) * abs) / (f8 - f9));
                i4++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect d1(ConstraintWidget constraintWidget) {
        this.f8944H1.top = constraintWidget.p0();
        this.f8944H1.left = constraintWidget.o0();
        Rect rect = this.f8944H1;
        int m02 = constraintWidget.m0();
        Rect rect2 = this.f8944H1;
        rect.right = m02 + rect2.left;
        int D3 = constraintWidget.D();
        Rect rect3 = this.f8944H1;
        rect2.bottom = D3 + rect3.top;
        return rect3;
    }

    private boolean m0(View view, MotionEvent motionEvent, float f4, float f5) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            motionEvent.offsetLocation(f4, f5);
            boolean onTouchEvent = view.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(-f4, -f5);
            return onTouchEvent;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(f4, f5);
        if (this.f8958O1 == null) {
            this.f8958O1 = new Matrix();
        }
        matrix.invert(this.f8958O1);
        obtain.transform(this.f8958O1);
        boolean onTouchEvent2 = view.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent2;
    }

    private void n0() {
        u uVar = this.f8986p0;
        if (uVar == null) {
            Log.e(f8917Y1, "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int O3 = uVar.O();
        u uVar2 = this.f8986p0;
        o0(O3, uVar2.o(uVar2.O()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        Iterator<u.b> it = this.f8986p0.s().iterator();
        while (it.hasNext()) {
            u.b next = it.next();
            if (next == this.f8986p0.f9120c) {
                Log.v(f8917Y1, "CHECK: CURRENT");
            }
            p0(next);
            int I3 = next.I();
            int B3 = next.B();
            String i4 = androidx.constraintlayout.motion.widget.c.i(getContext(), I3);
            String i5 = androidx.constraintlayout.motion.widget.c.i(getContext(), B3);
            if (sparseIntArray.get(I3) == B3) {
                Log.e(f8917Y1, "CHECK: two transitions with the same start and end " + i4 + "->" + i5);
            }
            if (sparseIntArray2.get(B3) == I3) {
                Log.e(f8917Y1, "CHECK: you can't have reverse transitions" + i4 + "->" + i5);
            }
            sparseIntArray.put(I3, B3);
            sparseIntArray2.put(B3, I3);
            if (this.f8986p0.o(I3) == null) {
                Log.e(f8917Y1, " no such constraintSetStart " + i4);
            }
            if (this.f8986p0.o(B3) == null) {
                Log.e(f8917Y1, " no such constraintSetEnd " + i4);
            }
        }
    }

    private void o0(int i4, androidx.constraintlayout.widget.d dVar) {
        String i5 = androidx.constraintlayout.motion.widget.c.i(getContext(), i4);
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            int id = childAt.getId();
            if (id == -1) {
                Log.w(f8917Y1, "CHECK: " + i5 + " ALL VIEWS SHOULD HAVE ID's " + childAt.getClass().getName() + " does not!");
            }
            if (dVar.k0(id) == null) {
                Log.w(f8917Y1, "CHECK: " + i5 + " NO CONSTRAINTS for " + androidx.constraintlayout.motion.widget.c.k(childAt));
            }
        }
        int[] o02 = dVar.o0();
        for (int i7 = 0; i7 < o02.length; i7++) {
            int i8 = o02[i7];
            String i9 = androidx.constraintlayout.motion.widget.c.i(getContext(), i8);
            if (findViewById(o02[i7]) == null) {
                Log.w(f8917Y1, "CHECK: " + i5 + " NO View matches id " + i9);
            }
            if (dVar.n0(i8) == -1) {
                Log.w(f8917Y1, "CHECK: " + i5 + "(" + i9 + ") no LAYOUT_HEIGHT");
            }
            if (dVar.v0(i8) == -1) {
                Log.w(f8917Y1, "CHECK: " + i5 + "(" + i9 + ") no LAYOUT_HEIGHT");
            }
        }
    }

    private void p0(u.b bVar) {
        if (bVar.I() == bVar.B()) {
            Log.e(f8917Y1, "CHECK: start and end constraint set should not be the same!");
        }
    }

    private void r0() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            o oVar = this.f9006z0.get(childAt);
            if (oVar != null) {
                oVar.V(childAt);
            }
        }
    }

    private static boolean r1(float f4, float f5, float f6) {
        if (f4 > 0.0f) {
            float f7 = f4 / f6;
            return f5 + ((f4 * f7) - (((f6 * f7) * f7) / 2.0f)) > 1.0f;
        }
        float f8 = (-f4) / f6;
        return f5 + ((f4 * f8) + (((f6 * f8) * f8) / 2.0f)) < 0.0f;
    }

    @SuppressLint({"LogConditional"})
    private void s0() {
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            Log.v(f8917Y1, " " + androidx.constraintlayout.motion.widget.c.g() + " " + androidx.constraintlayout.motion.widget.c.k(this) + " " + androidx.constraintlayout.motion.widget.c.i(getContext(), this.f8996u0) + " " + androidx.constraintlayout.motion.widget.c.k(childAt) + childAt.getLeft() + " " + childAt.getTop());
        }
    }

    private void y0() {
        float f4;
        boolean z3;
        float signum = Math.signum(this.f8939F0 - this.f8935D0);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.f8988q0;
        if (!(interpolator instanceof androidx.constraintlayout.motion.utils.b)) {
            f4 = ((((float) (nanoTime - this.f8937E0)) * signum) * 1.0E-9f) / this.f8931B0;
        } else {
            f4 = 0.0f;
        }
        float f5 = this.f8935D0 + f4;
        if (this.f8941G0) {
            f5 = this.f8939F0;
        }
        if ((signum > 0.0f && f5 >= this.f8939F0) || (signum <= 0.0f && f5 <= this.f8939F0)) {
            f5 = this.f8939F0;
            z3 = true;
        } else {
            z3 = false;
        }
        if (interpolator != null && !z3) {
            if (this.f8957O0) {
                f5 = interpolator.getInterpolation(((float) (nanoTime - this.f8929A0)) * 1.0E-9f);
            } else {
                f5 = interpolator.getInterpolation(f5);
            }
        }
        if ((signum > 0.0f && f5 >= this.f8939F0) || (signum <= 0.0f && f5 <= this.f8939F0)) {
            f5 = this.f8939F0;
        }
        this.f8997u1 = f5;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator2 = this.f8990r0;
        if (interpolator2 != null) {
            f5 = interpolator2.getInterpolation(f5);
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            o oVar = this.f9006z0.get(childAt);
            if (oVar != null) {
                oVar.L(childAt, f5, nanoTime2, this.f8999v1);
            }
        }
        if (this.f8984n1) {
            requestLayout();
        }
    }

    private void z0() {
        CopyOnWriteArrayList<l> copyOnWriteArrayList;
        if ((this.f8947J0 != null || ((copyOnWriteArrayList = this.f8977g1) != null && !copyOnWriteArrayList.isEmpty())) && this.f8982l1 != this.f8933C0) {
            if (this.f8981k1 != -1) {
                l lVar = this.f8947J0;
                if (lVar != null) {
                    lVar.c(this, this.f8994t0, this.f8998v0);
                }
                CopyOnWriteArrayList<l> copyOnWriteArrayList2 = this.f8977g1;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<l> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().c(this, this.f8994t0, this.f8998v0);
                    }
                }
                this.f8983m1 = true;
            }
            this.f8981k1 = -1;
            float f4 = this.f8933C0;
            this.f8982l1 = f4;
            l lVar2 = this.f8947J0;
            if (lVar2 != null) {
                lVar2.a(this, this.f8994t0, this.f8998v0, f4);
            }
            CopyOnWriteArrayList<l> copyOnWriteArrayList3 = this.f8977g1;
            if (copyOnWriteArrayList3 != null) {
                Iterator<l> it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().a(this, this.f8994t0, this.f8998v0, this.f8933C0);
                }
            }
            this.f8983m1 = true;
        }
    }

    protected void A0() {
        int i4;
        CopyOnWriteArrayList<l> copyOnWriteArrayList;
        if ((this.f8947J0 != null || ((copyOnWriteArrayList = this.f8977g1) != null && !copyOnWriteArrayList.isEmpty())) && this.f8981k1 == -1) {
            this.f8981k1 = this.f8996u0;
            if (!this.f8960P1.isEmpty()) {
                ArrayList<Integer> arrayList = this.f8960P1;
                i4 = arrayList.get(arrayList.size() - 1).intValue();
            } else {
                i4 = -1;
            }
            int i5 = this.f8996u0;
            if (i4 != i5 && i5 != -1) {
                this.f8960P1.add(Integer.valueOf(i5));
            }
        }
        U0();
        Runnable runnable = this.f9005y1;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.f9007z1;
        if (iArr != null && this.f8930A1 > 0) {
            j1(iArr[0]);
            int[] iArr2 = this.f9007z1;
            System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
            this.f8930A1--;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    protected void B(int i4) {
        this.f9453O = null;
    }

    public void C0(int i4, boolean z3, float f4) {
        l lVar = this.f8947J0;
        if (lVar != null) {
            lVar.d(this, i4, z3, f4);
        }
        CopyOnWriteArrayList<l> copyOnWriteArrayList = this.f8977g1;
        if (copyOnWriteArrayList != null) {
            Iterator<l> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().d(this, i4, z3, f4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D0(int i4, float f4, float f5, float f6, float[] fArr) {
        String resourceName;
        HashMap<View, o> hashMap = this.f9006z0;
        View q4 = q(i4);
        o oVar = hashMap.get(q4);
        if (oVar != null) {
            oVar.p(f4, f5, f6, fArr);
            float y3 = q4.getY();
            this.f8949K0 = f4;
            this.f8951L0 = y3;
            return;
        }
        if (q4 == null) {
            resourceName = "" + i4;
        } else {
            resourceName = q4.getContext().getResources().getResourceName(i4);
        }
        Log.w(f8917Y1, "WARNING could not find view id " + resourceName);
    }

    public androidx.constraintlayout.widget.d E0(int i4) {
        u uVar = this.f8986p0;
        if (uVar == null) {
            return null;
        }
        return uVar.o(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String F0(int i4) {
        u uVar = this.f8986p0;
        if (uVar == null) {
            return null;
        }
        return uVar.Y(i4);
    }

    public int[] G0(String... strArr) {
        u uVar = this.f8986p0;
        if (uVar == null) {
            return null;
        }
        return uVar.B(strArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o H0(int i4) {
        return this.f9006z0.get(findViewById(i4));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void I(int i4, int i5, int i6) {
        setState(m.SETUP);
        this.f8996u0 = i4;
        this.f8994t0 = -1;
        this.f8998v0 = -1;
        androidx.constraintlayout.widget.b bVar = this.f9453O;
        if (bVar != null) {
            bVar.e(i4, i5, i6);
            return;
        }
        u uVar = this.f8986p0;
        if (uVar != null) {
            uVar.o(i4).r(this);
        }
    }

    public u.b I0(int i4) {
        return this.f8986p0.P(i4);
    }

    public void J0(View view, float f4, float f5, float[] fArr, int i4) {
        float f6;
        float f7 = this.f8992s0;
        float f8 = this.f8935D0;
        if (this.f8988q0 != null) {
            float signum = Math.signum(this.f8939F0 - f8);
            float interpolation = this.f8988q0.getInterpolation(this.f8935D0 + f8928j2);
            f6 = this.f8988q0.getInterpolation(this.f8935D0);
            f7 = (signum * ((interpolation - f6) / f8928j2)) / this.f8931B0;
        } else {
            f6 = f8;
        }
        Interpolator interpolator = this.f8988q0;
        if (interpolator instanceof r) {
            f7 = ((r) interpolator).a();
        }
        o oVar = this.f9006z0.get(view);
        if ((i4 & 1) == 0) {
            oVar.C(f6, view.getWidth(), view.getHeight(), f4, f5, fArr);
        } else {
            oVar.p(f6, f4, f5, fArr);
        }
        if (i4 < 2) {
            fArr[0] = fArr[0] * f7;
            fArr[1] = fArr[1] * f7;
        }
    }

    public boolean M0() {
        return this.f8946I1;
    }

    public boolean N0() {
        return this.f8932B1;
    }

    public boolean O0() {
        return this.f9004y0;
    }

    public boolean P0(int i4) {
        u uVar = this.f8986p0;
        if (uVar != null) {
            return uVar.V(i4);
        }
        return false;
    }

    public void Q0(int i4) {
        if (!isAttachedToWindow()) {
            this.f8996u0 = i4;
        }
        if (this.f8994t0 == i4) {
            setProgress(0.0f);
        } else if (this.f8998v0 == i4) {
            setProgress(1.0f);
        } else {
            b1(i4, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int R0(String str) {
        u uVar = this.f8986p0;
        if (uVar == null) {
            return 0;
        }
        return uVar.X(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public i S0() {
        return j.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T0() {
        u uVar = this.f8986p0;
        if (uVar == null) {
            return;
        }
        if (uVar.i(this, this.f8996u0)) {
            requestLayout();
            return;
        }
        int i4 = this.f8996u0;
        if (i4 != -1) {
            this.f8986p0.f(this, i4);
        }
        if (this.f8986p0.s0()) {
            this.f8986p0.q0();
        }
    }

    @Deprecated
    public void V0() {
        Log.e(f8917Y1, "This method is deprecated. Please call rebuildScene() instead.");
        W0();
    }

    public void W0() {
        this.f8950K1.k();
        invalidate();
    }

    public boolean X0(l lVar) {
        CopyOnWriteArrayList<l> copyOnWriteArrayList = this.f8977g1;
        if (copyOnWriteArrayList == null) {
            return false;
        }
        return copyOnWriteArrayList.remove(lVar);
    }

    @W(api = 17)
    public void Y0(int i4, int i5) {
        int i6 = 1;
        this.f8932B1 = true;
        this.f8938E1 = getWidth();
        this.f8940F1 = getHeight();
        int rotation = getDisplay().getRotation();
        if ((rotation + 1) % 4 <= (this.f8942G1 + 1) % 4) {
            i6 = 2;
        }
        this.f8934C1 = i6;
        this.f8942G1 = rotation;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            androidx.constraintlayout.motion.utils.e eVar = this.f8936D1.get(childAt);
            if (eVar == null) {
                eVar = new androidx.constraintlayout.motion.utils.e();
                this.f8936D1.put(childAt, eVar);
            }
            eVar.a(childAt);
        }
        this.f8994t0 = -1;
        this.f8998v0 = i4;
        this.f8986p0.o0(-1, i4);
        this.f8950K1.h(this.f9445G, null, this.f8986p0.o(this.f8998v0));
        this.f8933C0 = 0.0f;
        this.f8935D0 = 0.0f;
        invalidate();
        h1(new b());
        if (i5 > 0) {
            this.f8931B0 = i5 / 1000.0f;
        }
    }

    public void Z0(int i4) {
        if (getCurrentState() == -1) {
            j1(i4);
            return;
        }
        int[] iArr = this.f9007z1;
        if (iArr == null) {
            this.f9007z1 = new int[4];
        } else if (iArr.length <= this.f8930A1) {
            this.f9007z1 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f9007z1;
        int i5 = this.f8930A1;
        this.f8930A1 = i5 + 1;
        iArr2[i5] = i4;
    }

    public void a1(float f4, float f5) {
        if (!isAttachedToWindow()) {
            if (this.f9003x1 == null) {
                this.f9003x1 = new k();
            }
            this.f9003x1.e(f4);
            this.f9003x1.h(f5);
            return;
        }
        setProgress(f4);
        setState(m.MOVING);
        this.f8992s0 = f5;
        float f6 = 0.0f;
        if (f5 != 0.0f) {
            if (f5 > 0.0f) {
                f6 = 1.0f;
            }
            k0(f6);
        } else if (f4 != 0.0f && f4 != 1.0f) {
            if (f4 > 0.5f) {
                f6 = 1.0f;
            }
            k0(f6);
        }
    }

    public void b1(int i4, int i5) {
        if (!isAttachedToWindow()) {
            if (this.f9003x1 == null) {
                this.f9003x1 = new k();
            }
            this.f9003x1.f(i4);
            this.f9003x1.d(i5);
            return;
        }
        u uVar = this.f8986p0;
        if (uVar != null) {
            this.f8994t0 = i4;
            this.f8998v0 = i5;
            uVar.o0(i4, i5);
            this.f8950K1.h(this.f9445G, this.f8986p0.o(i4), this.f8986p0.o(i5));
            W0();
            this.f8935D0 = 0.0f;
            i1();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        String l4;
        B b4;
        ArrayList<p> arrayList = this.f8976f1;
        if (arrayList != null) {
            Iterator<p> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().h(canvas);
            }
        }
        x0(false);
        u uVar = this.f8986p0;
        if (uVar != null && (b4 = uVar.f9135r) != null) {
            b4.d();
        }
        super.dispatchDraw(canvas);
        if (this.f8986p0 == null) {
            return;
        }
        if ((this.f8953M0 & 1) == 1 && !isInEditMode()) {
            this.f8978h1++;
            long nanoTime = getNanoTime();
            long j4 = this.f8979i1;
            if (j4 != -1) {
                if (nanoTime - j4 > 200000000) {
                    this.f8980j1 = ((int) ((this.f8978h1 / (((float) r5) * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.f8978h1 = 0;
                    this.f8979i1 = nanoTime;
                }
            } else {
                this.f8979i1 = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            String str = this.f8980j1 + " fps " + androidx.constraintlayout.motion.widget.c.l(this, this.f8994t0) + " -> ";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(androidx.constraintlayout.motion.widget.c.l(this, this.f8998v0));
            sb.append(" (progress: ");
            sb.append(((int) (getProgress() * 1000.0f)) / 10.0f);
            sb.append(" ) state=");
            int i4 = this.f8996u0;
            if (i4 == -1) {
                l4 = "undefined";
            } else {
                l4 = androidx.constraintlayout.motion.widget.c.l(this, i4);
            }
            sb.append(l4);
            String sb2 = sb.toString();
            paint.setColor(C0823k0.f13589t);
            canvas.drawText(sb2, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(sb2, 10.0f, getHeight() - 30, paint);
        }
        if (this.f8953M0 > 1) {
            if (this.f8955N0 == null) {
                this.f8955N0 = new g();
            }
            this.f8955N0.a(canvas, this.f9006z0, this.f8986p0.t(), this.f8953M0);
        }
        ArrayList<p> arrayList2 = this.f8976f1;
        if (arrayList2 != null) {
            Iterator<p> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().i(canvas);
            }
        }
    }

    @Override // androidx.core.view.X
    public void e(@N View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        if (this.f8968X0 || i4 != 0 || i5 != 0) {
            iArr[0] = iArr[0] + i6;
            iArr[1] = iArr[1] + i7;
        }
        this.f8968X0 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if (r10 != 7) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e1(int r10, float r11, float r12) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.s.e1(int, float, float):void");
    }

    public void f1(float f4, float f5) {
        if (this.f8986p0 == null || this.f8935D0 == f4) {
            return;
        }
        this.f8957O0 = true;
        this.f8929A0 = getNanoTime();
        this.f8931B0 = this.f8986p0.t() / 1000.0f;
        this.f8939F0 = f4;
        this.f8943H0 = true;
        this.f8959P0.f(this.f8935D0, f4, f5, this.f8986p0.K(), this.f8986p0.L(), this.f8986p0.J(), this.f8986p0.M(), this.f8986p0.I());
        int i4 = this.f8996u0;
        this.f8939F0 = f4;
        this.f8996u0 = i4;
        this.f8988q0 = this.f8959P0;
        this.f8941G0 = false;
        this.f8929A0 = getNanoTime();
        invalidate();
    }

    public void g1() {
        k0(1.0f);
        this.f9005y1 = null;
    }

    @D
    public int[] getConstraintSetIds() {
        u uVar = this.f8986p0;
        if (uVar == null) {
            return null;
        }
        return uVar.r();
    }

    public int getCurrentState() {
        return this.f8996u0;
    }

    public ArrayList<u.b> getDefinedTransitions() {
        u uVar = this.f8986p0;
        if (uVar == null) {
            return null;
        }
        return uVar.s();
    }

    public androidx.constraintlayout.motion.widget.d getDesignTool() {
        if (this.f8962R0 == null) {
            this.f8962R0 = new androidx.constraintlayout.motion.widget.d(this);
        }
        return this.f8962R0;
    }

    public int getEndState() {
        return this.f8998v0;
    }

    protected long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f8935D0;
    }

    public u getScene() {
        return this.f8986p0;
    }

    public int getStartState() {
        return this.f8994t0;
    }

    public float getTargetPosition() {
        return this.f8939F0;
    }

    public Bundle getTransitionState() {
        if (this.f9003x1 == null) {
            this.f9003x1 = new k();
        }
        this.f9003x1.c();
        return this.f9003x1.b();
    }

    public long getTransitionTimeMs() {
        if (this.f8986p0 != null) {
            this.f8931B0 = r0.t() / 1000.0f;
        }
        return this.f8931B0 * 1000.0f;
    }

    public float getVelocity() {
        return this.f8992s0;
    }

    public void h1(Runnable runnable) {
        k0(1.0f);
        this.f9005y1 = runnable;
    }

    public void i1() {
        k0(0.0f);
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    public void j0(l lVar) {
        if (this.f8977g1 == null) {
            this.f8977g1 = new CopyOnWriteArrayList<>();
        }
        this.f8977g1.add(lVar);
    }

    public void j1(int i4) {
        if (!isAttachedToWindow()) {
            if (this.f9003x1 == null) {
                this.f9003x1 = new k();
            }
            this.f9003x1.d(i4);
            return;
        }
        l1(i4, -1, -1);
    }

    void k0(float f4) {
        if (this.f8986p0 == null) {
            return;
        }
        float f5 = this.f8935D0;
        float f6 = this.f8933C0;
        if (f5 != f6 && this.f8941G0) {
            this.f8935D0 = f6;
        }
        float f7 = this.f8935D0;
        if (f7 == f4) {
            return;
        }
        this.f8957O0 = false;
        this.f8939F0 = f4;
        this.f8931B0 = r0.t() / 1000.0f;
        setProgress(this.f8939F0);
        this.f8988q0 = null;
        this.f8990r0 = this.f8986p0.x();
        this.f8941G0 = false;
        this.f8929A0 = getNanoTime();
        this.f8943H0 = true;
        this.f8933C0 = f7;
        this.f8935D0 = f7;
        invalidate();
    }

    public void k1(int i4, int i5) {
        if (!isAttachedToWindow()) {
            if (this.f9003x1 == null) {
                this.f9003x1 = new k();
            }
            this.f9003x1.d(i4);
            return;
        }
        m1(i4, -1, -1, i5);
    }

    public boolean l0(int i4, o oVar) {
        u uVar = this.f8986p0;
        if (uVar != null) {
            return uVar.h(i4, oVar);
        }
        return false;
    }

    public void l1(int i4, int i5, int i6) {
        m1(i4, i5, i6, -1);
    }

    public void m1(int i4, int i5, int i6, int i7) {
        androidx.constraintlayout.widget.k kVar;
        int a4;
        u uVar = this.f8986p0;
        if (uVar != null && (kVar = uVar.f9119b) != null && (a4 = kVar.a(this.f8996u0, i4, i5, i6)) != -1) {
            i4 = a4;
        }
        int i8 = this.f8996u0;
        if (i8 == i4) {
            return;
        }
        if (this.f8994t0 == i4) {
            k0(0.0f);
            if (i7 > 0) {
                this.f8931B0 = i7 / 1000.0f;
                return;
            }
            return;
        }
        if (this.f8998v0 == i4) {
            k0(1.0f);
            if (i7 > 0) {
                this.f8931B0 = i7 / 1000.0f;
                return;
            }
            return;
        }
        this.f8998v0 = i4;
        if (i8 != -1) {
            b1(i8, i4);
            k0(1.0f);
            this.f8935D0 = 0.0f;
            g1();
            if (i7 > 0) {
                this.f8931B0 = i7 / 1000.0f;
                return;
            }
            return;
        }
        this.f8957O0 = false;
        this.f8939F0 = 1.0f;
        this.f8933C0 = 0.0f;
        this.f8935D0 = 0.0f;
        this.f8937E0 = getNanoTime();
        this.f8929A0 = getNanoTime();
        this.f8941G0 = false;
        this.f8988q0 = null;
        if (i7 == -1) {
            this.f8931B0 = this.f8986p0.t() / 1000.0f;
        }
        this.f8994t0 = -1;
        this.f8986p0.o0(-1, this.f8998v0);
        SparseArray sparseArray = new SparseArray();
        if (i7 == 0) {
            this.f8931B0 = this.f8986p0.t() / 1000.0f;
        } else if (i7 > 0) {
            this.f8931B0 = i7 / 1000.0f;
        }
        int childCount = getChildCount();
        this.f9006z0.clear();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            this.f9006z0.put(childAt, new o(childAt));
            sparseArray.put(childAt.getId(), this.f9006z0.get(childAt));
        }
        this.f8943H0 = true;
        this.f8950K1.h(this.f9445G, null, this.f8986p0.o(i4));
        W0();
        this.f8950K1.a();
        r0();
        int width = getWidth();
        int height = getHeight();
        if (this.f8976f1 != null) {
            for (int i10 = 0; i10 < childCount; i10++) {
                o oVar = this.f9006z0.get(getChildAt(i10));
                if (oVar != null) {
                    this.f8986p0.z(oVar);
                }
            }
            Iterator<p> it = this.f8976f1.iterator();
            while (it.hasNext()) {
                it.next().g(this, this.f9006z0);
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                o oVar2 = this.f9006z0.get(getChildAt(i11));
                if (oVar2 != null) {
                    oVar2.a0(width, height, this.f8931B0, getNanoTime());
                }
            }
        } else {
            for (int i12 = 0; i12 < childCount; i12++) {
                o oVar3 = this.f9006z0.get(getChildAt(i12));
                if (oVar3 != null) {
                    this.f8986p0.z(oVar3);
                    oVar3.a0(width, height, this.f8931B0, getNanoTime());
                }
            }
        }
        float N3 = this.f8986p0.N();
        if (N3 != 0.0f) {
            float f4 = Float.MAX_VALUE;
            float f5 = -3.4028235E38f;
            for (int i13 = 0; i13 < childCount; i13++) {
                o oVar4 = this.f9006z0.get(getChildAt(i13));
                float u3 = oVar4.u() + oVar4.t();
                f4 = Math.min(f4, u3);
                f5 = Math.max(f5, u3);
            }
            for (int i14 = 0; i14 < childCount; i14++) {
                o oVar5 = this.f9006z0.get(getChildAt(i14));
                float t3 = oVar5.t();
                float u4 = oVar5.u();
                oVar5.f8892o = 1.0f / (1.0f - N3);
                oVar5.f8891n = N3 - ((((t3 + u4) - f4) * N3) / (f5 - f4));
            }
        }
        this.f8933C0 = 0.0f;
        this.f8935D0 = 0.0f;
        this.f8943H0 = true;
        invalidate();
    }

    public void n1() {
        this.f8950K1.h(this.f9445G, this.f8986p0.o(this.f8994t0), this.f8986p0.o(this.f8998v0));
        W0();
    }

    public void o1(int i4, androidx.constraintlayout.widget.d dVar) {
        u uVar = this.f8986p0;
        if (uVar != null) {
            uVar.k0(i4, dVar);
        }
        n1();
        if (this.f8996u0 == i4) {
            dVar.r(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        u.b bVar;
        int i4;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.f8942G1 = display.getRotation();
        }
        u uVar = this.f8986p0;
        if (uVar != null && (i4 = this.f8996u0) != -1) {
            androidx.constraintlayout.widget.d o4 = uVar.o(i4);
            this.f8986p0.i0(this);
            ArrayList<p> arrayList = this.f8976f1;
            if (arrayList != null) {
                Iterator<p> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().b(this);
                }
            }
            if (o4 != null) {
                o4.r(this);
            }
            this.f8994t0 = this.f8996u0;
        }
        T0();
        k kVar = this.f9003x1;
        if (kVar != null) {
            if (this.f8946I1) {
                post(new d());
                return;
            } else {
                kVar.a();
                return;
            }
        }
        u uVar2 = this.f8986p0;
        if (uVar2 != null && (bVar = uVar2.f9120c) != null && bVar.z() == 4) {
            g1();
            setState(m.SETUP);
            setState(m.MOVING);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        w J3;
        int s4;
        RectF r4;
        u uVar = this.f8986p0;
        if (uVar != null && this.f9004y0) {
            B b4 = uVar.f9135r;
            if (b4 != null) {
                b4.l(motionEvent);
            }
            u.b bVar = this.f8986p0.f9120c;
            if (bVar != null && bVar.K() && (J3 = bVar.J()) != null && ((motionEvent.getAction() != 0 || (r4 = J3.r(this, new RectF())) == null || r4.contains(motionEvent.getX(), motionEvent.getY())) && (s4 = J3.s()) != -1)) {
                View view = this.f8956N1;
                if (view == null || view.getId() != s4) {
                    this.f8956N1 = findViewById(s4);
                }
                if (this.f8956N1 != null) {
                    this.f8954M1.set(r0.getLeft(), this.f8956N1.getTop(), this.f8956N1.getRight(), this.f8956N1.getBottom());
                    if (this.f8954M1.contains(motionEvent.getX(), motionEvent.getY()) && !K0(this.f8956N1.getLeft(), this.f8956N1.getTop(), this.f8956N1, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        this.f9001w1 = true;
        try {
            if (this.f8986p0 == null) {
                super.onLayout(z3, i4, i5, i6, i7);
                return;
            }
            int i8 = i6 - i4;
            int i9 = i7 - i5;
            if (this.f8966V0 != i8 || this.f8967W0 != i9) {
                W0();
                x0(true);
            }
            this.f8966V0 = i8;
            this.f8967W0 = i9;
            this.f8964T0 = i8;
            this.f8965U0 = i9;
        } finally {
            this.f9001w1 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        boolean z3;
        if (this.f8986p0 == null) {
            super.onMeasure(i4, i5);
            return;
        }
        boolean z4 = false;
        if (this.f9000w0 == i4 && this.f9002x0 == i5) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (this.f8952L1) {
            this.f8952L1 = false;
            T0();
            U0();
            z3 = true;
        }
        if (this.f9450L) {
            z3 = true;
        }
        this.f9000w0 = i4;
        this.f9002x0 = i5;
        int O3 = this.f8986p0.O();
        int u3 = this.f8986p0.u();
        if ((z3 || this.f8950K1.i(O3, u3)) && this.f8994t0 != -1) {
            super.onMeasure(i4, i5);
            this.f8950K1.h(this.f9445G, this.f8986p0.o(O3), this.f8986p0.o(u3));
            this.f8950K1.k();
            this.f8950K1.l(O3, u3);
        } else {
            if (z3) {
                super.onMeasure(i4, i5);
            }
            z4 = true;
        }
        if (this.f8984n1 || z4) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int m02 = this.f9445G.m0() + getPaddingLeft() + getPaddingRight();
            int D3 = this.f9445G.D() + paddingTop;
            int i6 = this.f8993s1;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                m02 = (int) (this.f8985o1 + (this.f8997u1 * (this.f8989q1 - r8)));
                requestLayout();
            }
            int i7 = this.f8995t1;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                D3 = (int) (this.f8987p1 + (this.f8997u1 * (this.f8991r1 - r8)));
                requestLayout();
            }
            setMeasuredDimension(m02, D3);
        }
        y0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.Y
    public boolean onNestedFling(@N View view, float f4, float f5, boolean z3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.Y
    public boolean onNestedPreFling(@N View view, float f4, float f5) {
        return false;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i4) {
        u uVar = this.f8986p0;
        if (uVar != null) {
            uVar.n0(y());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        u uVar = this.f8986p0;
        if (uVar != null && this.f9004y0 && uVar.s0()) {
            u.b bVar = this.f8986p0.f9120c;
            if (bVar != null && !bVar.K()) {
                return super.onTouchEvent(motionEvent);
            }
            this.f8986p0.g0(motionEvent, getCurrentState(), this);
            if (this.f8986p0.f9120c.L(4)) {
                return this.f8986p0.f9120c.J().t();
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof p) {
            p pVar = (p) view;
            if (this.f8977g1 == null) {
                this.f8977g1 = new CopyOnWriteArrayList<>();
            }
            this.f8977g1.add(pVar);
            if (pVar.e()) {
                if (this.f8974d1 == null) {
                    this.f8974d1 = new ArrayList<>();
                }
                this.f8974d1.add(pVar);
            }
            if (pVar.f()) {
                if (this.f8975e1 == null) {
                    this.f8975e1 = new ArrayList<>();
                }
                this.f8975e1.add(pVar);
            }
            if (pVar.j()) {
                if (this.f8976f1 == null) {
                    this.f8976f1 = new ArrayList<>();
                }
                this.f8976f1.add(pVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<p> arrayList = this.f8974d1;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<p> arrayList2 = this.f8975e1;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public void p1(int i4, androidx.constraintlayout.widget.d dVar, int i5) {
        if (this.f8986p0 != null && this.f8996u0 == i4) {
            o1(h.g.P3, E0(i4));
            I(h.g.P3, -1, -1);
            o1(i4, dVar);
            u.b bVar = new u.b(-1, this.f8986p0, h.g.P3, i4);
            bVar.O(i5);
            setTransition(bVar);
            g1();
        }
    }

    public androidx.constraintlayout.widget.d q0(int i4) {
        u uVar = this.f8986p0;
        if (uVar == null) {
            return null;
        }
        androidx.constraintlayout.widget.d o4 = uVar.o(i4);
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.I(o4);
        return dVar;
    }

    public void q1(int i4, View... viewArr) {
        u uVar = this.f8986p0;
        if (uVar != null) {
            uVar.u0(i4, viewArr);
        } else {
            Log.e(f8917Y1, " no motionScene");
        }
    }

    @Override // androidx.core.view.W
    public void r(@N View view, int i4, int i5, int i6, int i7, int i8) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        u uVar;
        u.b bVar;
        if (!this.f8984n1 && this.f8996u0 == -1 && (uVar = this.f8986p0) != null && (bVar = uVar.f9120c) != null) {
            int E3 = bVar.E();
            if (E3 == 0) {
                return;
            }
            if (E3 == 2) {
                int childCount = getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    this.f9006z0.get(getChildAt(i4)).P();
                }
                return;
            }
        }
        super.requestLayout();
    }

    @Override // androidx.core.view.W
    public boolean s(@N View view, @N View view2, int i4, int i5) {
        u.b bVar;
        u uVar = this.f8986p0;
        if (uVar != null && (bVar = uVar.f9120c) != null && bVar.J() != null && (this.f8986p0.f9120c.J().f() & 2) == 0) {
            return true;
        }
        return false;
    }

    public void setDebugMode(int i4) {
        this.f8953M0 = i4;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z3) {
        this.f8946I1 = z3;
    }

    public void setInteractionEnabled(boolean z3) {
        this.f9004y0 = z3;
    }

    public void setInterpolatedProgress(float f4) {
        if (this.f8986p0 != null) {
            setState(m.MOVING);
            Interpolator x3 = this.f8986p0.x();
            if (x3 != null) {
                setProgress(x3.getInterpolation(f4));
                return;
            }
        }
        setProgress(f4);
    }

    public void setOnHide(float f4) {
        ArrayList<p> arrayList = this.f8975e1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.f8975e1.get(i4).setProgress(f4);
            }
        }
    }

    public void setOnShow(float f4) {
        ArrayList<p> arrayList = this.f8974d1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.f8974d1.get(i4).setProgress(f4);
            }
        }
    }

    public void setProgress(float f4) {
        if (f4 < 0.0f || f4 > 1.0f) {
            Log.w(f8917Y1, "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f9003x1 == null) {
                this.f9003x1 = new k();
            }
            this.f9003x1.e(f4);
            return;
        }
        if (f4 <= 0.0f) {
            if (this.f8935D0 == 1.0f && this.f8996u0 == this.f8998v0) {
                setState(m.MOVING);
            }
            this.f8996u0 = this.f8994t0;
            if (this.f8935D0 == 0.0f) {
                setState(m.FINISHED);
            }
        } else if (f4 >= 1.0f) {
            if (this.f8935D0 == 0.0f && this.f8996u0 == this.f8994t0) {
                setState(m.MOVING);
            }
            this.f8996u0 = this.f8998v0;
            if (this.f8935D0 == 1.0f) {
                setState(m.FINISHED);
            }
        } else {
            this.f8996u0 = -1;
            setState(m.MOVING);
        }
        if (this.f8986p0 == null) {
            return;
        }
        this.f8941G0 = true;
        this.f8939F0 = f4;
        this.f8933C0 = f4;
        this.f8937E0 = -1L;
        this.f8929A0 = -1L;
        this.f8988q0 = null;
        this.f8943H0 = true;
        invalidate();
    }

    public void setScene(u uVar) {
        this.f8986p0 = uVar;
        uVar.n0(y());
        W0();
    }

    void setStartState(int i4) {
        if (!isAttachedToWindow()) {
            if (this.f9003x1 == null) {
                this.f9003x1 = new k();
            }
            this.f9003x1.f(i4);
            this.f9003x1.d(i4);
            return;
        }
        this.f8996u0 = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setState(m mVar) {
        m mVar2 = m.FINISHED;
        if (mVar == mVar2 && this.f8996u0 == -1) {
            return;
        }
        m mVar3 = this.f8948J1;
        this.f8948J1 = mVar;
        m mVar4 = m.MOVING;
        if (mVar3 == mVar4 && mVar == mVar4) {
            z0();
        }
        int i4 = e.f9012a[mVar3.ordinal()];
        if (i4 != 1 && i4 != 2) {
            if (i4 == 3 && mVar == mVar2) {
                A0();
                return;
            }
            return;
        }
        if (mVar == mVar4) {
            z0();
        }
        if (mVar == mVar2) {
            A0();
        }
    }

    public void setTransition(int i4) {
        float f4;
        if (this.f8986p0 != null) {
            u.b I02 = I0(i4);
            this.f8994t0 = I02.I();
            this.f8998v0 = I02.B();
            if (!isAttachedToWindow()) {
                if (this.f9003x1 == null) {
                    this.f9003x1 = new k();
                }
                this.f9003x1.f(this.f8994t0);
                this.f9003x1.d(this.f8998v0);
                return;
            }
            int i5 = this.f8996u0;
            if (i5 == this.f8994t0) {
                f4 = 0.0f;
            } else {
                f4 = i5 == this.f8998v0 ? 1.0f : Float.NaN;
            }
            this.f8986p0.p0(I02);
            this.f8950K1.h(this.f9445G, this.f8986p0.o(this.f8994t0), this.f8986p0.o(this.f8998v0));
            W0();
            if (this.f8935D0 != f4) {
                if (f4 == 0.0f) {
                    w0(true);
                    this.f8986p0.o(this.f8994t0).r(this);
                } else if (f4 == 1.0f) {
                    w0(false);
                    this.f8986p0.o(this.f8998v0).r(this);
                }
            }
            this.f8935D0 = Float.isNaN(f4) ? 0.0f : f4;
            if (Float.isNaN(f4)) {
                Log.v(f8917Y1, androidx.constraintlayout.motion.widget.c.g() + " transitionToStart ");
                i1();
                return;
            }
            setProgress(f4);
        }
    }

    public void setTransitionDuration(int i4) {
        u uVar = this.f8986p0;
        if (uVar == null) {
            Log.e(f8917Y1, "MotionScene not defined");
        } else {
            uVar.l0(i4);
        }
    }

    public void setTransitionListener(l lVar) {
        this.f8947J0 = lVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f9003x1 == null) {
            this.f9003x1 = new k();
        }
        this.f9003x1.g(bundle);
        if (isAttachedToWindow()) {
            this.f9003x1.a();
        }
    }

    @Override // androidx.core.view.W
    public void t(@N View view, @N View view2, int i4, int i5) {
        this.f8971a1 = getNanoTime();
        this.f8972b1 = 0.0f;
        this.f8969Y0 = 0.0f;
        this.f8970Z0 = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t0(boolean z3) {
        u uVar = this.f8986p0;
        if (uVar == null) {
            return;
        }
        uVar.k(z3);
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return androidx.constraintlayout.motion.widget.c.i(context, this.f8994t0) + "->" + androidx.constraintlayout.motion.widget.c.i(context, this.f8998v0) + " (pos:" + this.f8935D0 + " Dpos/Dt:" + this.f8992s0;
    }

    @Override // androidx.core.view.W
    public void u(@N View view, int i4) {
        u uVar = this.f8986p0;
        if (uVar != null) {
            float f4 = this.f8972b1;
            if (f4 != 0.0f) {
                uVar.f0(this.f8969Y0 / f4, this.f8970Z0 / f4);
            }
        }
    }

    public void u0(int i4, boolean z3) {
        u.b I02 = I0(i4);
        if (z3) {
            I02.P(true);
            return;
        }
        u uVar = this.f8986p0;
        if (I02 == uVar.f9120c) {
            Iterator<u.b> it = uVar.R(this.f8996u0).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                u.b next = it.next();
                if (next.K()) {
                    this.f8986p0.f9120c = next;
                    break;
                }
            }
        }
        I02.P(false);
    }

    @Override // androidx.core.view.W
    public void v(@N View view, int i4, int i5, @N int[] iArr, int i6) {
        u.b bVar;
        w J3;
        int s4;
        u uVar = this.f8986p0;
        if (uVar != null && (bVar = uVar.f9120c) != null && bVar.K()) {
            int i7 = -1;
            if (bVar.K() && (J3 = bVar.J()) != null && (s4 = J3.s()) != -1 && view.getId() != s4) {
                return;
            }
            if (uVar.E()) {
                w J4 = bVar.J();
                if (J4 != null && (J4.f() & 4) != 0) {
                    i7 = i5;
                }
                float f4 = this.f8933C0;
                if ((f4 == 1.0f || f4 == 0.0f) && view.canScrollVertically(i7)) {
                    return;
                }
            }
            if (bVar.J() != null && (bVar.J().f() & 1) != 0) {
                float G3 = uVar.G(i4, i5);
                float f5 = this.f8935D0;
                if ((f5 <= 0.0f && G3 < 0.0f) || (f5 >= 1.0f && G3 > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new c(this, view));
                    return;
                }
            }
            float f6 = this.f8933C0;
            long nanoTime = getNanoTime();
            float f7 = i4;
            this.f8969Y0 = f7;
            float f8 = i5;
            this.f8970Z0 = f8;
            this.f8972b1 = (float) ((nanoTime - this.f8971a1) * 1.0E-9d);
            this.f8971a1 = nanoTime;
            uVar.e0(f7, f8);
            if (f6 != this.f8933C0) {
                iArr[0] = i4;
                iArr[1] = i5;
            }
            x0(false);
            if (iArr[0] != 0 || iArr[1] != 0) {
                this.f8968X0 = true;
            }
        }
    }

    public void v0(int i4, boolean z3) {
        u uVar = this.f8986p0;
        if (uVar != null) {
            uVar.l(i4, z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w0(boolean z3) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            o oVar = this.f9006z0.get(getChildAt(i4));
            if (oVar != null) {
                oVar.i(z3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x0(boolean r23) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.s.x0(boolean):void");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void z(int i4) {
        int rotation;
        u.b bVar;
        if (i4 != 0) {
            try {
                u uVar = new u(getContext(), this, i4);
                this.f8986p0 = uVar;
                if (this.f8996u0 == -1) {
                    this.f8996u0 = uVar.O();
                    this.f8994t0 = this.f8986p0.O();
                    this.f8998v0 = this.f8986p0.u();
                }
                if (isAttachedToWindow()) {
                    try {
                        Display display = getDisplay();
                        if (display == null) {
                            rotation = 0;
                        } else {
                            rotation = display.getRotation();
                        }
                        this.f8942G1 = rotation;
                        u uVar2 = this.f8986p0;
                        if (uVar2 != null) {
                            androidx.constraintlayout.widget.d o4 = uVar2.o(this.f8996u0);
                            this.f8986p0.i0(this);
                            ArrayList<p> arrayList = this.f8976f1;
                            if (arrayList != null) {
                                Iterator<p> it = arrayList.iterator();
                                while (it.hasNext()) {
                                    it.next().b(this);
                                }
                            }
                            if (o4 != null) {
                                o4.r(this);
                            }
                            this.f8994t0 = this.f8996u0;
                        }
                        T0();
                        k kVar = this.f9003x1;
                        if (kVar != null) {
                            if (this.f8946I1) {
                                post(new a());
                                return;
                            } else {
                                kVar.a();
                                return;
                            }
                        }
                        u uVar3 = this.f8986p0;
                        if (uVar3 != null && (bVar = uVar3.f9120c) != null && bVar.z() == 4) {
                            g1();
                            setState(m.SETUP);
                            setState(m.MOVING);
                            return;
                        }
                        return;
                    } catch (Exception e4) {
                        throw new IllegalArgumentException("unable to parse MotionScene file", e4);
                    }
                }
                this.f8986p0 = null;
                return;
            } catch (Exception e5) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e5);
            }
        }
        this.f8986p0 = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setTransition(u.b bVar) {
        this.f8986p0.p0(bVar);
        setState(m.SETUP);
        if (this.f8996u0 == this.f8986p0.u()) {
            this.f8935D0 = 1.0f;
            this.f8933C0 = 1.0f;
            this.f8939F0 = 1.0f;
        } else {
            this.f8935D0 = 0.0f;
            this.f8933C0 = 0.0f;
            this.f8939F0 = 0.0f;
        }
        this.f8937E0 = bVar.L(1) ? -1L : getNanoTime();
        int O3 = this.f8986p0.O();
        int u3 = this.f8986p0.u();
        if (O3 == this.f8994t0 && u3 == this.f8998v0) {
            return;
        }
        this.f8994t0 = O3;
        this.f8998v0 = u3;
        this.f8986p0.o0(O3, u3);
        this.f8950K1.h(this.f9445G, this.f8986p0.o(this.f8994t0), this.f8986p0.o(this.f8998v0));
        this.f8950K1.l(this.f8994t0, this.f8998v0);
        this.f8950K1.k();
        W0();
    }

    public s(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8990r0 = null;
        this.f8992s0 = 0.0f;
        this.f8994t0 = -1;
        this.f8996u0 = -1;
        this.f8998v0 = -1;
        this.f9000w0 = 0;
        this.f9002x0 = 0;
        this.f9004y0 = true;
        this.f9006z0 = new HashMap<>();
        this.f8929A0 = 0L;
        this.f8931B0 = 1.0f;
        this.f8933C0 = 0.0f;
        this.f8935D0 = 0.0f;
        this.f8939F0 = 0.0f;
        this.f8943H0 = false;
        this.f8945I0 = false;
        this.f8953M0 = 0;
        this.f8957O0 = false;
        this.f8959P0 = new androidx.constraintlayout.motion.utils.b();
        this.f8961Q0 = new f();
        this.f8963S0 = true;
        this.f8968X0 = false;
        this.f8973c1 = false;
        this.f8974d1 = null;
        this.f8975e1 = null;
        this.f8976f1 = null;
        this.f8977g1 = null;
        this.f8978h1 = 0;
        this.f8979i1 = -1L;
        this.f8980j1 = 0.0f;
        this.f8981k1 = 0;
        this.f8982l1 = 0.0f;
        this.f8983m1 = false;
        this.f8984n1 = false;
        this.f8999v1 = new androidx.constraintlayout.core.motion.utils.g();
        this.f9001w1 = false;
        this.f9005y1 = null;
        this.f9007z1 = null;
        this.f8930A1 = 0;
        this.f8932B1 = false;
        this.f8934C1 = 0;
        this.f8936D1 = new HashMap<>();
        this.f8944H1 = new Rect();
        this.f8946I1 = false;
        this.f8948J1 = m.UNDEFINED;
        this.f8950K1 = new h();
        this.f8952L1 = false;
        this.f8954M1 = new RectF();
        this.f8956N1 = null;
        this.f8958O1 = null;
        this.f8960P1 = new ArrayList<>();
        L0(attributeSet);
    }

    public s(@N Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f8990r0 = null;
        this.f8992s0 = 0.0f;
        this.f8994t0 = -1;
        this.f8996u0 = -1;
        this.f8998v0 = -1;
        this.f9000w0 = 0;
        this.f9002x0 = 0;
        this.f9004y0 = true;
        this.f9006z0 = new HashMap<>();
        this.f8929A0 = 0L;
        this.f8931B0 = 1.0f;
        this.f8933C0 = 0.0f;
        this.f8935D0 = 0.0f;
        this.f8939F0 = 0.0f;
        this.f8943H0 = false;
        this.f8945I0 = false;
        this.f8953M0 = 0;
        this.f8957O0 = false;
        this.f8959P0 = new androidx.constraintlayout.motion.utils.b();
        this.f8961Q0 = new f();
        this.f8963S0 = true;
        this.f8968X0 = false;
        this.f8973c1 = false;
        this.f8974d1 = null;
        this.f8975e1 = null;
        this.f8976f1 = null;
        this.f8977g1 = null;
        this.f8978h1 = 0;
        this.f8979i1 = -1L;
        this.f8980j1 = 0.0f;
        this.f8981k1 = 0;
        this.f8982l1 = 0.0f;
        this.f8983m1 = false;
        this.f8984n1 = false;
        this.f8999v1 = new androidx.constraintlayout.core.motion.utils.g();
        this.f9001w1 = false;
        this.f9005y1 = null;
        this.f9007z1 = null;
        this.f8930A1 = 0;
        this.f8932B1 = false;
        this.f8934C1 = 0;
        this.f8936D1 = new HashMap<>();
        this.f8944H1 = new Rect();
        this.f8946I1 = false;
        this.f8948J1 = m.UNDEFINED;
        this.f8950K1 = new h();
        this.f8952L1 = false;
        this.f8954M1 = new RectF();
        this.f8956N1 = null;
        this.f8958O1 = null;
        this.f8960P1 = new ArrayList<>();
        L0(attributeSet);
    }
}
