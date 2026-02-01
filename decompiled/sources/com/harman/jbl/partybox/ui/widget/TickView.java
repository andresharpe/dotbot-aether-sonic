package com.harman.jbl.partybox.ui.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.P;
import com.harman.jbl.partybox.j;

/* loaded from: classes2.dex */
public class TickView extends View {

    /* renamed from: E, reason: collision with root package name */
    private int f45906E;

    /* renamed from: F, reason: collision with root package name */
    private int f45907F;

    /* renamed from: G, reason: collision with root package name */
    private int f45908G;

    /* renamed from: H, reason: collision with root package name */
    private float f45909H;

    /* renamed from: I, reason: collision with root package name */
    private float f45910I;

    /* renamed from: J, reason: collision with root package name */
    private float f45911J;

    /* renamed from: K, reason: collision with root package name */
    private float f45912K;

    /* renamed from: L, reason: collision with root package name */
    private float f45913L;

    /* renamed from: M, reason: collision with root package name */
    private float f45914M;

    /* renamed from: N, reason: collision with root package name */
    private float f45915N;

    /* renamed from: O, reason: collision with root package name */
    private int f45916O;

    /* renamed from: P, reason: collision with root package name */
    private int f45917P;

    /* renamed from: Q, reason: collision with root package name */
    private float f45918Q;

    /* renamed from: R, reason: collision with root package name */
    private Path f45919R;

    /* renamed from: S, reason: collision with root package name */
    private Path f45920S;

    /* renamed from: T, reason: collision with root package name */
    private Paint f45921T;

    /* renamed from: U, reason: collision with root package name */
    private PathMeasure f45922U;

    /* renamed from: V, reason: collision with root package name */
    private ValueAnimator f45923V;

    /* renamed from: W, reason: collision with root package name */
    private ValueAnimator.AnimatorUpdateListener f45924W;

    /* loaded from: classes2.dex */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TickView.this.f45909H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            TickView.this.postInvalidate();
        }
    }

    public TickView(Context context) {
        this(context, null);
    }

    public void b(Context context, @P AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.o.f41958a0);
        this.f45917P = obtainStyledAttributes.getColor(j.o.f41961b0, this.f45906E);
        this.f45918Q = obtainStyledAttributes.getDimension(j.o.f41994m0, 10.0f);
        obtainStyledAttributes.recycle();
        this.f45919R = new Path();
        this.f45920S = new Path();
        this.f45922U = new PathMeasure();
        Paint paint = new Paint(1);
        this.f45921T = paint;
        paint.setColor(this.f45917P);
        this.f45921T.setStyle(Paint.Style.STROKE);
        this.f45921T.setStrokeWidth(this.f45918Q);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f45923V = ofFloat;
        ofFloat.setDuration(this.f45916O);
        this.f45923V.setInterpolator(new LinearInterpolator());
        this.f45923V.addUpdateListener(this.f45924W);
    }

    public void c() {
        d();
        if (this.f45919R == null) {
            this.f45919R = new Path();
        }
        ValueAnimator valueAnimator = this.f45923V;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    public void d() {
        ValueAnimator valueAnimator = this.f45923V;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        this.f45920S.moveTo(this.f45907F * this.f45910I, this.f45908G * this.f45911J);
        this.f45920S.lineTo(this.f45907F * this.f45912K, this.f45908G * this.f45913L);
        this.f45920S.lineTo(this.f45907F * this.f45914M, this.f45908G * this.f45915N);
        this.f45922U.setPath(this.f45920S, false);
        PathMeasure pathMeasure = this.f45922U;
        pathMeasure.getSegment(0.0f, this.f45909H * pathMeasure.getLength(), this.f45919R, true);
        this.f45919R.rLineTo(0.0f, 0.0f);
        canvas.drawPath(this.f45919R, this.f45921T);
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        this.f45907F = View.MeasureSpec.getSize(i4);
        int size = View.MeasureSpec.getSize(i5);
        this.f45908G = size;
        setMeasuredDimension(this.f45907F, size);
    }

    public void setAnimateColor(int i4) {
        this.f45917P = i4;
        this.f45921T.setColor(i4);
        invalidate();
    }

    public TickView(Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TickView(Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f45906E = -1;
        this.f45910I = 0.2659f;
        this.f45911J = 0.4588f;
        this.f45912K = 0.4541f;
        this.f45913L = 0.6306f;
        this.f45914M = 0.7553f;
        this.f45915N = 0.3388f;
        this.f45916O = 500;
        this.f45924W = new a();
        b(context, attributeSet);
    }
}
