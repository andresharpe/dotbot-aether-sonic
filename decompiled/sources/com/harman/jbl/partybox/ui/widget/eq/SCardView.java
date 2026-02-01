package com.harman.jbl.partybox.ui.widget.eq;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.RelativeLayout;
import com.harman.jbl.partybox.j;

/* loaded from: classes2.dex */
public class SCardView extends RelativeLayout {

    /* renamed from: E, reason: collision with root package name */
    private int f45995E;

    /* renamed from: F, reason: collision with root package name */
    private float f45996F;

    /* renamed from: G, reason: collision with root package name */
    private float f45997G;

    /* renamed from: H, reason: collision with root package name */
    private float f45998H;

    /* renamed from: I, reason: collision with root package name */
    private float f45999I;

    /* renamed from: J, reason: collision with root package name */
    private float f46000J;

    /* renamed from: K, reason: collision with root package name */
    private float f46001K;

    /* renamed from: L, reason: collision with root package name */
    private float f46002L;

    /* renamed from: M, reason: collision with root package name */
    float f46003M;

    /* renamed from: N, reason: collision with root package name */
    float f46004N;

    /* renamed from: O, reason: collision with root package name */
    float f46005O;

    /* renamed from: P, reason: collision with root package name */
    float f46006P;

    /* renamed from: Q, reason: collision with root package name */
    private Paint f46007Q;

    public SCardView(Context context) {
        super(context);
        b(null);
    }

    private float a(float f4) {
        return TypedValue.applyDimension(1, f4, getResources().getDisplayMetrics());
    }

    private void b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.o.f42002p0);
        this.f45995E = obtainStyledAttributes.getColor(j.o.f42004q0, Color.parseColor("#19000000"));
        this.f45996F = obtainStyledAttributes.getDimension(j.o.f42006r0, 12.0f);
        this.f45997G = obtainStyledAttributes.getDimension(j.o.f42008s0, 12.0f);
        this.f45998H = obtainStyledAttributes.getDimension(j.o.f42012u0, 12.0f);
        this.f45999I = obtainStyledAttributes.getDimension(j.o.f42014v0, 0.0f);
        this.f46000J = obtainStyledAttributes.getDimension(j.o.f42016w0, 0.0f);
        this.f46001K = obtainStyledAttributes.getDimension(j.o.f42018x0, 12.0f);
        this.f46002L = obtainStyledAttributes.getDimension(j.o.f42010t0, 0.0f);
        Paint paint = new Paint(1);
        this.f46007Q = paint;
        paint.setColor(this.f45995E);
        this.f46003M = a(0.0f);
        float a4 = a(0.0f);
        this.f46004N = a4;
        this.f46005O = 0.0f;
        this.f46006P = this.f45996F;
        this.f46007Q.setShadowLayer(0.0f, this.f46003M, a4, Color.parseColor("#19000000"));
        setWillNotDraw(false);
        float f4 = this.f46002L;
        if (f4 == 0.0f) {
            float f5 = this.f45999I;
            float f6 = this.f46001K;
            float f7 = this.f46005O;
            d(f5, f6 + f7, this.f46000J, this.f45998H + f7);
            return;
        }
        float f8 = this.f46005O;
        d(f4 + f8, f4 + f8, f4 + f8, f4 + f8);
    }

    private void d(float f4, float f5, float f6, float f7) {
        setPadding((int) f4, (int) f5, (int) f6, (int) f7);
    }

    public void c(int i4, int i5, int i6, int i7) {
        this.f45999I = i4;
        this.f46001K = i5;
        this.f46000J = i6;
        this.f45998H = i7;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f4 = this.f46005O;
        float width = canvas.getWidth() - this.f46005O;
        float height = canvas.getHeight() - this.f46005O;
        float f5 = this.f46006P;
        canvas.drawRoundRect(f4, f4, width, height, f5, f5, this.f46007Q);
    }

    public void setCardBackgroundColor(int i4) {
        this.f45995E = i4;
        invalidate();
    }

    public void setRadius(int i4) {
        this.f46006P = i4;
        invalidate();
    }

    public SCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(attributeSet);
    }

    public SCardView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        b(attributeSet);
    }

    public SCardView(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        b(attributeSet);
    }
}
