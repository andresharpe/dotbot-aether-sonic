package com.google.android.material.timepicker;

import T0.a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.P;
import androidx.annotation.U;
import androidx.annotation.r;
import androidx.core.view.C0823k0;
import com.google.firebase.remoteconfig.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ClockHandView extends View {

    /* renamed from: V, reason: collision with root package name */
    private static final int f33838V = 200;

    /* renamed from: E, reason: collision with root package name */
    private ValueAnimator f33839E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f33840F;

    /* renamed from: G, reason: collision with root package name */
    private float f33841G;

    /* renamed from: H, reason: collision with root package name */
    private float f33842H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f33843I;

    /* renamed from: J, reason: collision with root package name */
    private int f33844J;

    /* renamed from: K, reason: collision with root package name */
    private final List<d> f33845K;

    /* renamed from: L, reason: collision with root package name */
    private final int f33846L;

    /* renamed from: M, reason: collision with root package name */
    private final float f33847M;

    /* renamed from: N, reason: collision with root package name */
    private final Paint f33848N;

    /* renamed from: O, reason: collision with root package name */
    private final RectF f33849O;

    /* renamed from: P, reason: collision with root package name */
    @U
    private final int f33850P;

    /* renamed from: Q, reason: collision with root package name */
    private float f33851Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f33852R;

    /* renamed from: S, reason: collision with root package name */
    private c f33853S;

    /* renamed from: T, reason: collision with root package name */
    private double f33854T;

    /* renamed from: U, reason: collision with root package name */
    private int f33855U;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.n(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void e(@InterfaceC0580x(from = 0.0d, to = 360.0d) float f4, boolean z3);
    }

    /* loaded from: classes2.dex */
    public interface d {
        void d(@InterfaceC0580x(from = 0.0d, to = 360.0d) float f4, boolean z3);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }

    private void c(Canvas canvas) {
        int height = getHeight() / 2;
        float width = getWidth() / 2;
        float cos = (this.f33855U * ((float) Math.cos(this.f33854T))) + width;
        float f4 = height;
        float sin = (this.f33855U * ((float) Math.sin(this.f33854T))) + f4;
        this.f33848N.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f33846L, this.f33848N);
        double sin2 = Math.sin(this.f33854T);
        double cos2 = Math.cos(this.f33854T);
        this.f33848N.setStrokeWidth(this.f33850P);
        canvas.drawLine(width, f4, r1 + ((int) (cos2 * r6)), height + ((int) (r6 * sin2)), this.f33848N);
        canvas.drawCircle(width, f4, this.f33847M, this.f33848N);
    }

    private int e(float f4, float f5) {
        int degrees = (int) Math.toDegrees(Math.atan2(f5 - (getHeight() / 2), f4 - (getWidth() / 2)));
        int i4 = degrees + 90;
        if (i4 < 0) {
            return degrees + 450;
        }
        return i4;
    }

    private Pair<Float, Float> h(float f4) {
        float f5 = f();
        if (Math.abs(f5 - f4) > 180.0f) {
            if (f5 > 180.0f && f4 < 180.0f) {
                f4 += 360.0f;
            }
            if (f5 < 180.0f && f4 > 180.0f) {
                f5 += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(f5), Float.valueOf(f4));
    }

    private boolean i(float f4, float f5, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        float e4 = e(f4, f5);
        boolean z7 = false;
        if (f() != e4) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z4 && z6) {
            return true;
        }
        if (!z6 && !z3) {
            return false;
        }
        if (z5 && this.f33840F) {
            z7 = true;
        }
        m(e4, z7);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(@InterfaceC0580x(from = 0.0d, to = 360.0d) float f4, boolean z3) {
        float f5 = f4 % 360.0f;
        this.f33851Q = f5;
        this.f33854T = Math.toRadians(f5 - 90.0f);
        int height = getHeight() / 2;
        float width = (getWidth() / 2) + (this.f33855U * ((float) Math.cos(this.f33854T)));
        float sin = height + (this.f33855U * ((float) Math.sin(this.f33854T)));
        RectF rectF = this.f33849O;
        int i4 = this.f33846L;
        rectF.set(width - i4, sin - i4, width + i4, sin + i4);
        Iterator<d> it = this.f33845K.iterator();
        while (it.hasNext()) {
            it.next().d(f5, z3);
        }
        invalidate();
    }

    public void b(d dVar) {
        this.f33845K.add(dVar);
    }

    public RectF d() {
        return this.f33849O;
    }

    @InterfaceC0580x(from = l.f37524n, to = 360.0d)
    public float f() {
        return this.f33851Q;
    }

    public int g() {
        return this.f33846L;
    }

    public void j(boolean z3) {
        this.f33840F = z3;
    }

    public void k(@r int i4) {
        this.f33855U = i4;
        invalidate();
    }

    public void l(@InterfaceC0580x(from = 0.0d, to = 360.0d) float f4) {
        m(f4, false);
    }

    public void m(@InterfaceC0580x(from = 0.0d, to = 360.0d) float f4, boolean z3) {
        ValueAnimator valueAnimator = this.f33839E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z3) {
            n(f4, false);
            return;
        }
        Pair<Float, Float> h4 = h(f4);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) h4.first).floatValue(), ((Float) h4.second).floatValue());
        this.f33839E = ofFloat;
        ofFloat.setDuration(200L);
        this.f33839E.addUpdateListener(new a());
        this.f33839E.addListener(new b());
        this.f33839E.start();
    }

    public void o(c cVar) {
        this.f33853S = cVar;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        l(f());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        boolean z4;
        boolean z5;
        c cVar;
        boolean z6;
        int actionMasked = motionEvent.getActionMasked();
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z3 = false;
                z4 = false;
                z5 = false;
            } else {
                int i4 = (int) (x3 - this.f33841G);
                int i5 = (int) (y3 - this.f33842H);
                if ((i4 * i4) + (i5 * i5) > this.f33844J) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                this.f33843I = z6;
                boolean z7 = this.f33852R;
                if (actionMasked == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z5 = false;
                z4 = z7;
            }
        } else {
            this.f33841G = x3;
            this.f33842H = y3;
            this.f33843I = true;
            this.f33852R = false;
            z3 = false;
            z4 = false;
            z5 = true;
        }
        boolean i6 = i(x3, y3, z4, z5, z3) | this.f33852R;
        this.f33852R = i6;
        if (i6 && z3 && (cVar = this.f33853S) != null) {
            cVar.e(e(x3, y3), this.f33843I);
        }
        return true;
    }

    public ClockHandView(Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, a.c.gb);
    }

    public ClockHandView(Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f33845K = new ArrayList();
        Paint paint = new Paint();
        this.f33848N = paint;
        this.f33849O = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.C6, i4, a.n.Zi);
        this.f33855U = obtainStyledAttributes.getDimensionPixelSize(a.o.E6, 0);
        this.f33846L = obtainStyledAttributes.getDimensionPixelSize(a.o.F6, 0);
        this.f33850P = getResources().getDimensionPixelSize(a.f.i5);
        this.f33847M = r6.getDimensionPixelSize(a.f.g5);
        int color = obtainStyledAttributes.getColor(a.o.D6, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        l(0.0f);
        this.f33844J = ViewConfiguration.get(context).getScaledTouchSlop();
        C0823k0.R1(this, 2);
        obtainStyledAttributes.recycle();
    }
}
