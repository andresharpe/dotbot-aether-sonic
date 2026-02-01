package com.harman.jbl.partybox.ui.widget;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import com.harman.jbl.partybox.j;

/* loaded from: classes2.dex */
public class TickProgressView extends ProgressBar {

    /* renamed from: k0, reason: collision with root package name */
    private static final String f45875k0 = "TickProgressView";

    /* renamed from: E, reason: collision with root package name */
    private final int f45876E;

    /* renamed from: F, reason: collision with root package name */
    private final int f45877F;

    /* renamed from: G, reason: collision with root package name */
    private final int f45878G;

    /* renamed from: H, reason: collision with root package name */
    private final int f45879H;

    /* renamed from: I, reason: collision with root package name */
    private final int f45880I;

    /* renamed from: J, reason: collision with root package name */
    private final int f45881J;

    /* renamed from: K, reason: collision with root package name */
    private final int f45882K;

    /* renamed from: L, reason: collision with root package name */
    private final int f45883L;

    /* renamed from: M, reason: collision with root package name */
    private final int f45884M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f45885N;

    /* renamed from: O, reason: collision with root package name */
    private float f45886O;

    /* renamed from: P, reason: collision with root package name */
    private int f45887P;

    /* renamed from: Q, reason: collision with root package name */
    private int f45888Q;

    /* renamed from: R, reason: collision with root package name */
    private RectF f45889R;

    /* renamed from: S, reason: collision with root package name */
    private Paint f45890S;

    /* renamed from: T, reason: collision with root package name */
    private Paint f45891T;

    /* renamed from: U, reason: collision with root package name */
    private int f45892U;

    /* renamed from: V, reason: collision with root package name */
    private int f45893V;

    /* renamed from: W, reason: collision with root package name */
    private int f45894W;

    /* renamed from: a0, reason: collision with root package name */
    private int f45895a0;

    /* renamed from: b0, reason: collision with root package name */
    private float f45896b0;

    /* renamed from: c0, reason: collision with root package name */
    private float f45897c0;

    /* renamed from: d0, reason: collision with root package name */
    private int f45898d0;

    /* renamed from: e0, reason: collision with root package name */
    private int f45899e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f45900f0;

    /* renamed from: g0, reason: collision with root package name */
    private float f45901g0;

    /* renamed from: h0, reason: collision with root package name */
    private ObjectAnimator f45902h0;

    /* renamed from: i0, reason: collision with root package name */
    private ProgressStatus f45903i0;

    /* renamed from: j0, reason: collision with root package name */
    private ValueAnimator.AnimatorUpdateListener f45904j0;

    /* loaded from: classes2.dex */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
    }

    public TickProgressView(Context context) {
        this(context, null);
    }

    private void a() {
        this.f45903i0 = ProgressStatus.Idel;
    }

    protected int b(int i4) {
        return (int) TypedValue.applyDimension(1, i4, getResources().getDisplayMetrics());
    }

    public void c() {
        ProgressStatus progressStatus = this.f45903i0;
        ProgressStatus progressStatus2 = ProgressStatus.Failed;
        if (progressStatus == progressStatus2) {
            return;
        }
        this.f45903i0 = progressStatus2;
        invalidate();
    }

    public void d() {
        ProgressStatus progressStatus = this.f45903i0;
        ProgressStatus progressStatus2 = ProgressStatus.Finished;
        if (progressStatus == progressStatus2) {
            return;
        }
        this.f45903i0 = progressStatus2;
        ObjectAnimator objectAnimator = this.f45902h0;
        if (objectAnimator != null) {
            this.f45901g0 = ((Float) objectAnimator.getAnimatedValue()).floatValue();
            Log.i(f45875k0, "lastRotationAngle:" + this.f45901g0);
        }
        f();
        invalidate();
    }

    public void e() {
        if (getProgress() < getMax()) {
            return;
        }
        this.f45903i0 = ProgressStatus.Animate;
        invalidate();
        if (this.f45902h0 == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, androidx.constraintlayout.motion.widget.f.f8538i, 0.0f, 720.0f);
            this.f45902h0 = ofFloat;
            ofFloat.setInterpolator(new LinearInterpolator());
            this.f45902h0.setRepeatCount(-1);
            this.f45902h0.setRepeatMode(1);
            this.f45902h0.setDuration(3000L);
        }
        if (!this.f45902h0.isRunning()) {
            this.f45902h0.start();
        }
    }

    public void f() {
        if (this.f45903i0 == ProgressStatus.Animate) {
            this.f45903i0 = ProgressStatus.Idel;
        }
        ObjectAnimator objectAnimator = this.f45902h0;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.f45902h0.cancel();
            this.f45902h0 = null;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        try {
            canvas.save();
            int progress = (int) (((getProgress() * 1.0f) / getMax()) * this.f45899e0);
            if (this.f45885N) {
                canvas.drawArc(this.f45889R, this.f45898d0 + 90, 360 - this.f45888Q, false, this.f45891T);
            }
            String str = f45875k0;
            Log.i(str, "onDraw: startAngle = " + this.f45898d0);
            Log.i(str, "onDraw: pivotX = " + this.f45896b0);
            Log.i(str, "onDraw: pivotY = " + this.f45897c0);
            canvas.rotate((float) (this.f45898d0 + 180), this.f45896b0, this.f45897c0);
            ProgressStatus progressStatus = this.f45903i0;
            int i4 = 0;
            if (progressStatus == ProgressStatus.Normal) {
                while (i4 < this.f45899e0) {
                    if (i4 < progress) {
                        this.f45890S.setColor(this.f45893V);
                    } else {
                        this.f45890S.setColor(this.f45892U);
                    }
                    float f4 = this.f45896b0;
                    int i5 = this.f45887P;
                    canvas.drawLine(f4, i5 + (i5 / 2.0f), f4, i5 - (i5 / 2.0f), this.f45890S);
                    canvas.rotate(this.f45895a0, this.f45896b0, this.f45897c0);
                    i4++;
                }
            } else if (progressStatus == ProgressStatus.Animate) {
                while (i4 < this.f45899e0) {
                    this.f45890S.setColor(this.f45893V);
                    if (i4 >= this.f45900f0) {
                        this.f45890S.setAlpha((int) ((((i4 - r0) * 1.0f) / (this.f45899e0 - r0)) * 255.0f));
                    } else {
                        this.f45890S.setAlpha(255);
                    }
                    float f5 = this.f45896b0;
                    int i6 = this.f45887P;
                    canvas.drawLine(f5, i6 + (i6 / 2.0f), f5, i6 - (i6 / 2.0f), this.f45890S);
                    canvas.rotate(this.f45895a0, this.f45896b0, this.f45897c0);
                    i4++;
                }
            } else if (progressStatus == ProgressStatus.Finished || progressStatus == ProgressStatus.Failed) {
                Log.i(str, "onDraw: progressStatus == ProgressStatus.Finished lastRotationAngle = " + this.f45901g0);
                this.f45888Q = 40;
                Log.i(str, "onDraw: progressStatus == ProgressStatus.Finished mDegree = " + this.f45888Q);
                this.f45898d0 = this.f45888Q / 2;
                Log.i(str, "onDraw: progressStatus == ProgressStatus.Finished startAngle = " + this.f45898d0);
                this.f45899e0 = (360 - this.f45888Q) / this.f45895a0;
                Log.i(str, "onDraw: progressStatus == ProgressStatus.Finished tickCount = " + this.f45899e0);
                int i7 = (360 - ((int) this.f45901g0)) + this.f45898d0;
                Log.i(str, "onDraw: progressStatus == ProgressStatus.Finished angleToCenter = " + i7);
                canvas.rotate((float) (i7 + this.f45895a0), this.f45896b0, this.f45897c0);
                Log.i(str, "onDraw: progressStatus == ProgressStatus.Finished tickDensity = " + this.f45895a0);
                Log.i(str, "onDraw: progressStatus == ProgressStatus.Finished pivotX = " + this.f45896b0);
                Log.i(str, "onDraw: progressStatus == ProgressStatus.Finished pivotY = " + this.f45897c0);
                for (int i8 = 0; i8 < this.f45899e0; i8++) {
                    if (this.f45903i0 == ProgressStatus.Failed) {
                        this.f45890S.setColor(this.f45892U);
                    } else {
                        this.f45890S.setColor(this.f45893V);
                    }
                    float f6 = this.f45896b0;
                    int i9 = this.f45887P;
                    canvas.drawLine(f6, i9 + (i9 / 2.0f), f6, i9 - (i9 / 2.0f), this.f45890S);
                    canvas.rotate(this.f45895a0, this.f45896b0, this.f45897c0);
                }
                this.f45898d0 = 0;
            }
            canvas.restore();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i4, int i5) {
        try {
            int mode = View.MeasureSpec.getMode(i4);
            int mode2 = View.MeasureSpec.getMode(i5);
            if (mode != 1073741824) {
                i4 = View.MeasureSpec.makeMeasureSpec((int) ((this.f45886O * 2.0f) + (this.f45887P * 2)), 1073741824);
            }
            if (mode2 != 1073741824) {
                i5 = View.MeasureSpec.makeMeasureSpec((int) ((this.f45886O * 2.0f) + (this.f45887P * 2)), 1073741824);
            }
            Log.i(f45875k0, "onMeasure widthMeasureSpec: " + i4 + "   heightMeasureSpec = " + i5);
            super.onMeasure(i4, i5);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        this.f45896b0 = getMeasuredWidth() / 2.0f;
        this.f45897c0 = getMeasuredHeight() / 2.0f;
        int i8 = this.f45888Q;
        this.f45898d0 = i8 / 2;
        int i9 = (360 - i8) / this.f45895a0;
        this.f45899e0 = i9;
        this.f45900f0 = (int) (i9 - (i9 * 0.25d));
        int i10 = this.f45887P;
        float f4 = this.f45886O;
        this.f45889R = new RectF(i10, i10, (f4 * 2.0f) - i10, (f4 * 2.0f) - i10);
        Log.i(f45875k0, "onSizeChanged tickRectF: " + this.f45889R.toString() + "   mRadius == " + (this.f45886O * 2.0f));
    }

    public TickProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TickProgressView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        int b4 = b(8);
        this.f45876E = b4;
        int b5 = b(2);
        this.f45877F = b5;
        this.f45878G = b(72);
        int parseColor = Color.parseColor("#80FFFFFF");
        this.f45879H = parseColor;
        int parseColor2 = Color.parseColor("#FF5901");
        this.f45880I = parseColor2;
        this.f45881J = 40;
        this.f45882K = 2;
        this.f45883L = 8;
        this.f45884M = 8;
        this.f45888Q = 40;
        this.f45900f0 = 0;
        this.f45901g0 = 0.0f;
        this.f45903i0 = ProgressStatus.Normal;
        this.f45904j0 = new a();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.o.f41958a0);
        this.f45887P = obtainStyledAttributes.getDimensionPixelOffset(j.o.f41967d0, b4);
        this.f45892U = obtainStyledAttributes.getColor(j.o.f41976g0, parseColor);
        this.f45893V = obtainStyledAttributes.getColor(j.o.f41961b0, parseColor2);
        this.f45894W = obtainStyledAttributes.getDimensionPixelOffset(j.o.f41982i0, b5);
        this.f45895a0 = obtainStyledAttributes.getInt(j.o.f41991l0, 8);
        this.f45886O = obtainStyledAttributes.getDimensionPixelOffset(j.o.f41985j0, r2);
        this.f45895a0 = Math.max(Math.min(this.f45895a0, 8), 2);
        this.f45885N = obtainStyledAttributes.getBoolean(j.o.f41964c0, false);
        this.f45888Q = obtainStyledAttributes.getInt(j.o.f41979h0, 40);
        boolean z3 = obtainStyledAttributes.getBoolean(j.o.f41970e0, false);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f45891T = paint;
        paint.setColor(this.f45892U);
        this.f45891T.setStrokeWidth(this.f45887P);
        this.f45891T.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint2 = new Paint(1);
        this.f45890S = paint2;
        paint2.setStrokeWidth(this.f45894W);
        if (z3) {
            this.f45890S.setStrokeCap(Paint.Cap.ROUND);
        }
    }
}
