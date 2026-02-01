package com.harman.jbl.partybox.ui.customviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.harman.jbl.partybox.j;

/* loaded from: classes2.dex */
public class ShadowLayout extends RelativeLayout {

    /* renamed from: O, reason: collision with root package name */
    public static final int f42619O = 4369;

    /* renamed from: P, reason: collision with root package name */
    public static final int f42620P = 1;

    /* renamed from: Q, reason: collision with root package name */
    public static final int f42621Q = 16;

    /* renamed from: R, reason: collision with root package name */
    public static final int f42622R = 256;

    /* renamed from: S, reason: collision with root package name */
    public static final int f42623S = 4096;

    /* renamed from: E, reason: collision with root package name */
    private Paint f42624E;

    /* renamed from: F, reason: collision with root package name */
    private RectF f42625F;

    /* renamed from: G, reason: collision with root package name */
    private int f42626G;

    /* renamed from: H, reason: collision with root package name */
    private float f42627H;

    /* renamed from: I, reason: collision with root package name */
    private float f42628I;

    /* renamed from: J, reason: collision with root package name */
    private float f42629J;

    /* renamed from: K, reason: collision with root package name */
    private int f42630K;

    /* renamed from: L, reason: collision with root package name */
    private int f42631L;

    /* renamed from: M, reason: collision with root package name */
    private int f42632M;

    /* renamed from: N, reason: collision with root package name */
    private String f42633N;

    public ShadowLayout(Context context) {
        this(context, null);
    }

    private int a(Context context, float f4) {
        return (int) ((f4 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.o.f41946U0);
        this.f42633N = obtainStyledAttributes.getString(j.o.f41950W0);
        this.f42626G = obtainStyledAttributes.getColor(j.o.f41948V0, Color.parseColor("#66B70000"));
        if (TextUtils.isEmpty(this.f42633N)) {
            this.f42633N = "rectangle";
        }
        obtainStyledAttributes.recycle();
        setLayerType(1, null);
        setWillNotDraw(false);
        this.f42624E.setAntiAlias(true);
        this.f42624E.setColor(0);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f42633N.equals("rectangle")) {
            this.f42624E.setShadowLayer(this.f42627H, this.f42628I, this.f42629J, this.f42626G);
            canvas.drawRoundRect(this.f42625F, 75.0f, 75.0f, this.f42624E);
        } else if (this.f42633N.equals("circle")) {
            this.f42624E.setShadowLayer(this.f42627H, this.f42628I, this.f42629J, this.f42626G);
            int i4 = this.f42631L;
            canvas.drawCircle(i4 / 2.0f, this.f42632M / 2.0f, (i4 / 2.0f) - this.f42627H, this.f42624E);
        } else {
            this.f42624E.clearShadowLayer();
            canvas.drawRect(this.f42625F, this.f42624E);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        float f4 = this.f42627H;
        RectF rectF = this.f42625F;
        rectF.left = f4;
        rectF.top = f4;
        rectF.right = this.f42631L - f4;
        rectF.bottom = this.f42632M - f4;
        setPadding(0, 0, 0, 0);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        this.f42631L = View.MeasureSpec.getSize(i4);
        this.f42632M = View.MeasureSpec.getSize(i5);
    }

    public void setShape(String str) {
        this.f42633N = str;
        invalidate();
    }

    public ShadowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShadowLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f42624E = new Paint(1);
        this.f42625F = new RectF();
        this.f42626G = Color.parseColor("#66B70000");
        this.f42627H = a(getContext(), 5.0f);
        this.f42628I = 0.0f;
        this.f42629J = 0.0f;
        this.f42630K = f42619O;
        this.f42633N = "rectangle";
        b(attributeSet);
    }
}
