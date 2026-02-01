package com.harman.jbl.partybox.ui.customviews;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.C0669d;
import com.harman.jbl.partybox.j;

/* loaded from: classes2.dex */
public class HmUpgradingCircleIndicator extends View {

    /* renamed from: R, reason: collision with root package name */
    private static final int f42603R = 10;

    /* renamed from: S, reason: collision with root package name */
    private static final int f42604S = 0;

    /* renamed from: T, reason: collision with root package name */
    private static final int f42605T = 1;

    /* renamed from: E, reason: collision with root package name */
    private final RectF f42606E;

    /* renamed from: F, reason: collision with root package name */
    private Paint f42607F;

    /* renamed from: G, reason: collision with root package name */
    private Paint f42608G;

    /* renamed from: H, reason: collision with root package name */
    private Paint f42609H;

    /* renamed from: I, reason: collision with root package name */
    private RectF f42610I;

    /* renamed from: J, reason: collision with root package name */
    private BlurMaskFilter f42611J;

    /* renamed from: K, reason: collision with root package name */
    private int f42612K;

    /* renamed from: L, reason: collision with root package name */
    private int f42613L;

    /* renamed from: M, reason: collision with root package name */
    private int f42614M;

    /* renamed from: N, reason: collision with root package name */
    private Paint.Cap f42615N;

    /* renamed from: O, reason: collision with root package name */
    private int f42616O;

    /* renamed from: P, reason: collision with root package name */
    private int f42617P;

    /* renamed from: Q, reason: collision with root package name */
    private int f42618Q;

    public HmUpgradingCircleIndicator(Context context) {
        this(context, null);
    }

    public void a(int i4, int i5, Paint.Cap cap) {
        this.f42612K = i4;
        this.f42614M = i5;
        this.f42615N = cap;
        this.f42613L = C0669d.f(getContext(), j.d.f40751g0);
        this.f42607F.setColor(-16776961);
        this.f42607F.setStyle(Paint.Style.STROKE);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f42608G.setColor(this.f42612K);
        Paint paint = this.f42608G;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f42608G.setAntiAlias(true);
        this.f42608G.setStrokeWidth(10.0f);
        this.f42608G.setStrokeCap(this.f42615N);
        canvas.drawArc(this.f42606E, -90.0f, 360.0f, false, this.f42608G);
        this.f42608G.setColor(this.f42614M);
        this.f42609H.setColor(this.f42613L);
        this.f42609H.setStyle(style);
        this.f42609H.setAntiAlias(true);
        this.f42609H.setStrokeCap(this.f42615N);
        this.f42609H.setMaskFilter(this.f42611J);
        this.f42608G.setColor(this.f42614M);
        int i4 = this.f42618Q;
        if (i4 != 0) {
            if (i4 == 1) {
                this.f42608G.setStyle(Paint.Style.FILL_AND_STROKE);
                if (this.f42617P != 0) {
                    canvas.drawArc(this.f42610I, -90.0f, (r1 * 360) / this.f42616O, true, this.f42609H);
                    canvas.drawArc(this.f42610I, -90.0f, (this.f42617P * 360) / this.f42616O, true, this.f42608G);
                    return;
                }
                return;
            }
            return;
        }
        this.f42608G.setStyle(style);
        this.f42608G.setStrokeWidth(10.0f);
        this.f42609H.setStrokeWidth(10.0f);
        canvas.drawArc(this.f42606E, -90.0f, (this.f42617P * 360) / this.f42616O, false, this.f42609H);
        canvas.drawArc(this.f42606E, -90.0f, (this.f42617P * 360) / this.f42616O, false, this.f42608G);
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int size = View.MeasureSpec.getSize(i4) - 20;
        int size2 = View.MeasureSpec.getSize(i5) - 20;
        int min = Math.min(size, size2);
        setMeasuredDimension((size / 2) - 20, size2);
        setMeasuredDimension(min, min);
        float f4 = min - 50;
        this.f42606E.set(50.0f, 60.0f, f4, f4);
    }

    public synchronized void setMax(int i4) {
        if (i4 < 0) {
            i4 = 0;
        }
        this.f42616O = i4;
    }

    public synchronized void setProgress(int i4) {
        if (i4 <= 0) {
            i4 = 0;
        }
        int i5 = this.f42616O;
        if (i4 > i5) {
            i4 = i5;
        }
        this.f42617P = i4;
        postInvalidate();
    }

    public HmUpgradingCircleIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HmUpgradingCircleIndicator(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f42606E = new RectF();
        this.f42615N = Paint.Cap.ROUND;
        this.f42616O = 100;
        this.f42618Q = 0;
        this.f42608G = new Paint();
        this.f42609H = new Paint();
        this.f42610I = new RectF();
        this.f42607F = new Paint();
        this.f42611J = new BlurMaskFilter(30.0f, BlurMaskFilter.Blur.SOLID);
    }
}
