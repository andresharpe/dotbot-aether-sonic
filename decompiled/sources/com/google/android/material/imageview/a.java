package com.google.android.material.imageview;

import T0.a;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.InterfaceC0571n;
import androidx.annotation.InterfaceC0574q;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import androidx.annotation.r;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.shape.j;
import com.google.android.material.shape.o;
import com.google.android.material.shape.p;
import com.google.android.material.shape.s;
import e.C2046a;

/* loaded from: classes2.dex */
public class a extends AppCompatImageView implements s {

    /* renamed from: c0, reason: collision with root package name */
    private static final int f32471c0 = a.n.Ci;

    /* renamed from: d0, reason: collision with root package name */
    private static final int f32472d0 = Integer.MIN_VALUE;

    /* renamed from: H, reason: collision with root package name */
    private final p f32473H;

    /* renamed from: I, reason: collision with root package name */
    private final RectF f32474I;

    /* renamed from: J, reason: collision with root package name */
    private final RectF f32475J;

    /* renamed from: K, reason: collision with root package name */
    private final Paint f32476K;

    /* renamed from: L, reason: collision with root package name */
    private final Paint f32477L;

    /* renamed from: M, reason: collision with root package name */
    private final Path f32478M;

    /* renamed from: N, reason: collision with root package name */
    @P
    private ColorStateList f32479N;

    /* renamed from: O, reason: collision with root package name */
    @P
    private j f32480O;

    /* renamed from: P, reason: collision with root package name */
    private o f32481P;

    /* renamed from: Q, reason: collision with root package name */
    @r
    private float f32482Q;

    /* renamed from: R, reason: collision with root package name */
    private Path f32483R;

    /* renamed from: S, reason: collision with root package name */
    @r
    private int f32484S;

    /* renamed from: T, reason: collision with root package name */
    @r
    private int f32485T;

    /* renamed from: U, reason: collision with root package name */
    @r
    private int f32486U;

    /* renamed from: V, reason: collision with root package name */
    @r
    private int f32487V;

    /* renamed from: W, reason: collision with root package name */
    @r
    private int f32488W;

    /* renamed from: a0, reason: collision with root package name */
    @r
    private int f32489a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f32490b0;

    @TargetApi(21)
    /* renamed from: com.google.android.material.imageview.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0286a extends ViewOutlineProvider {

        /* renamed from: a, reason: collision with root package name */
        private final Rect f32491a = new Rect();

        C0286a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (a.this.f32481P == null) {
                return;
            }
            if (a.this.f32480O == null) {
                a.this.f32480O = new j(a.this.f32481P);
            }
            a.this.f32474I.round(this.f32491a);
            a.this.f32480O.setBounds(this.f32491a);
            a.this.f32480O.getOutline(outline);
        }
    }

    public a(Context context) {
        this(context, null, 0);
    }

    private void g(Canvas canvas) {
        if (this.f32479N == null) {
            return;
        }
        this.f32476K.setStrokeWidth(this.f32482Q);
        int colorForState = this.f32479N.getColorForState(getDrawableState(), this.f32479N.getDefaultColor());
        if (this.f32482Q > 0.0f && colorForState != 0) {
            this.f32476K.setColor(colorForState);
            canvas.drawPath(this.f32478M, this.f32476K);
        }
    }

    private boolean h() {
        if (this.f32488W == Integer.MIN_VALUE && this.f32489a0 == Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    private boolean i() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    private void l(int i4, int i5) {
        this.f32474I.set(getPaddingLeft(), getPaddingTop(), i4 - getPaddingRight(), i5 - getPaddingBottom());
        this.f32473H.d(this.f32481P, 1.0f, this.f32474I, this.f32478M);
        this.f32483R.rewind();
        this.f32483R.addPath(this.f32478M);
        this.f32475J.set(0.0f, 0.0f, i4, i5);
        this.f32483R.addRect(this.f32475J, Path.Direction.CCW);
    }

    @r
    public int getContentPaddingBottom() {
        return this.f32487V;
    }

    @r
    public final int getContentPaddingEnd() {
        int i4 = this.f32489a0;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        if (i()) {
            return this.f32484S;
        }
        return this.f32486U;
    }

    @r
    public int getContentPaddingLeft() {
        int i4;
        int i5;
        if (h()) {
            if (i() && (i5 = this.f32489a0) != Integer.MIN_VALUE) {
                return i5;
            }
            if (!i() && (i4 = this.f32488W) != Integer.MIN_VALUE) {
                return i4;
            }
        }
        return this.f32484S;
    }

    @r
    public int getContentPaddingRight() {
        int i4;
        int i5;
        if (h()) {
            if (i() && (i5 = this.f32488W) != Integer.MIN_VALUE) {
                return i5;
            }
            if (!i() && (i4 = this.f32489a0) != Integer.MIN_VALUE) {
                return i4;
            }
        }
        return this.f32486U;
    }

    @r
    public final int getContentPaddingStart() {
        int i4 = this.f32488W;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        if (i()) {
            return this.f32486U;
        }
        return this.f32484S;
    }

    @r
    public int getContentPaddingTop() {
        return this.f32485T;
    }

    @Override // android.view.View
    @r
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    @r
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    @r
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    @r
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    @r
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    @r
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @Override // com.google.android.material.shape.s
    @N
    public o getShapeAppearanceModel() {
        return this.f32481P;
    }

    @P
    public ColorStateList getStrokeColor() {
        return this.f32479N;
    }

    @r
    public float getStrokeWidth() {
        return this.f32482Q;
    }

    public void j(@r int i4, @r int i5, @r int i6, @r int i7) {
        this.f32488W = Integer.MIN_VALUE;
        this.f32489a0 = Integer.MIN_VALUE;
        super.setPadding((super.getPaddingLeft() - this.f32484S) + i4, (super.getPaddingTop() - this.f32485T) + i5, (super.getPaddingRight() - this.f32486U) + i6, (super.getPaddingBottom() - this.f32487V) + i7);
        this.f32484S = i4;
        this.f32485T = i5;
        this.f32486U = i6;
        this.f32487V = i7;
    }

    @W(17)
    public void k(@r int i4, @r int i5, @r int i6, @r int i7) {
        int i8;
        super.setPaddingRelative((super.getPaddingStart() - getContentPaddingStart()) + i4, (super.getPaddingTop() - this.f32485T) + i5, (super.getPaddingEnd() - getContentPaddingEnd()) + i6, (super.getPaddingBottom() - this.f32487V) + i7);
        if (i()) {
            i8 = i6;
        } else {
            i8 = i4;
        }
        this.f32484S = i8;
        this.f32485T = i5;
        if (!i()) {
            i4 = i6;
        }
        this.f32486U = i4;
        this.f32487V = i7;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        setLayerType(0, null);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f32483R, this.f32477L);
        g(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f32490b0 || !isLayoutDirectionResolved()) {
            return;
        }
        this.f32490b0 = true;
        if (!isPaddingRelative() && !h()) {
            setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
        } else {
            setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        l(i4, i5);
    }

    @Override // android.view.View
    public void setPadding(@r int i4, @r int i5, @r int i6, @r int i7) {
        super.setPadding(i4 + getContentPaddingLeft(), i5 + getContentPaddingTop(), i6 + getContentPaddingRight(), i7 + getContentPaddingBottom());
    }

    @Override // android.view.View
    public void setPaddingRelative(@r int i4, @r int i5, @r int i6, @r int i7) {
        super.setPaddingRelative(i4 + getContentPaddingStart(), i5 + getContentPaddingTop(), i6 + getContentPaddingEnd(), i7 + getContentPaddingBottom());
    }

    @Override // com.google.android.material.shape.s
    public void setShapeAppearanceModel(@N o oVar) {
        this.f32481P = oVar;
        j jVar = this.f32480O;
        if (jVar != null) {
            jVar.setShapeAppearanceModel(oVar);
        }
        l(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(@P ColorStateList colorStateList) {
        this.f32479N = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(@InterfaceC0571n int i4) {
        setStrokeColor(C2046a.a(getContext(), i4));
    }

    public void setStrokeWidth(@r float f4) {
        if (this.f32482Q != f4) {
            this.f32482Q = f4;
            invalidate();
        }
    }

    public void setStrokeWidthResource(@InterfaceC0574q int i4) {
        setStrokeWidth(getResources().getDimensionPixelSize(i4));
    }

    public a(Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(android.content.Context r7, @androidx.annotation.P android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r0 = com.google.android.material.imageview.a.f32471c0
            android.content.Context r7 = d1.C2044a.c(r7, r8, r9, r0)
            r6.<init>(r7, r8, r9)
            com.google.android.material.shape.p r7 = com.google.android.material.shape.p.k()
            r6.f32473H = r7
            android.graphics.Path r7 = new android.graphics.Path
            r7.<init>()
            r6.f32478M = r7
            r7 = 0
            r6.f32490b0 = r7
            android.content.Context r1 = r6.getContext()
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r6.f32477L = r2
            r3 = 1
            r2.setAntiAlias(r3)
            r4 = -1
            r2.setColor(r4)
            android.graphics.PorterDuffXfermode r4 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.DST_OUT
            r4.<init>(r5)
            r2.setXfermode(r4)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f32474I = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f32475J = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r6.f32483R = r2
            int[] r2 = T0.a.o.kr
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r8, r2, r9, r0)
            int r4 = T0.a.o.ur
            android.content.res.ColorStateList r4 = com.google.android.material.resources.c.a(r1, r2, r4)
            r6.f32479N = r4
            int r4 = T0.a.o.vr
            int r4 = r2.getDimensionPixelSize(r4, r7)
            float r4 = (float) r4
            r6.f32482Q = r4
            int r4 = T0.a.o.lr
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f32484S = r7
            r6.f32485T = r7
            r6.f32486U = r7
            r6.f32487V = r7
            int r4 = T0.a.o.or
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f32484S = r4
            int r4 = T0.a.o.rr
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f32485T = r4
            int r4 = T0.a.o.pr
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f32486U = r4
            int r4 = T0.a.o.mr
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f32487V = r7
            int r7 = T0.a.o.qr
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f32488W = r7
            int r7 = T0.a.o.nr
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f32489a0 = r7
            r2.recycle()
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r6.f32476K = r7
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r7.setStyle(r2)
            r7.setAntiAlias(r3)
            com.google.android.material.shape.o$b r7 = com.google.android.material.shape.o.e(r1, r8, r9, r0)
            com.google.android.material.shape.o r7 = r7.m()
            r6.f32481P = r7
            com.google.android.material.imageview.a$a r7 = new com.google.android.material.imageview.a$a
            r7.<init>()
            r6.setOutlineProvider(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.imageview.a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
