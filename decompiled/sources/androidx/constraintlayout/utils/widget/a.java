package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.annotation.W;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.utils.widget.b;
import androidx.constraintlayout.widget.h;
import e.C2046a;

/* loaded from: classes.dex */
public class a extends AppCompatImageButton {

    /* renamed from: H, reason: collision with root package name */
    private b.c f9291H;

    /* renamed from: I, reason: collision with root package name */
    private float f9292I;

    /* renamed from: J, reason: collision with root package name */
    private float f9293J;

    /* renamed from: K, reason: collision with root package name */
    private float f9294K;

    /* renamed from: L, reason: collision with root package name */
    private Path f9295L;

    /* renamed from: M, reason: collision with root package name */
    ViewOutlineProvider f9296M;

    /* renamed from: N, reason: collision with root package name */
    RectF f9297N;

    /* renamed from: O, reason: collision with root package name */
    Drawable[] f9298O;

    /* renamed from: P, reason: collision with root package name */
    LayerDrawable f9299P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f9300Q;

    /* renamed from: R, reason: collision with root package name */
    private Drawable f9301R;

    /* renamed from: S, reason: collision with root package name */
    private Drawable f9302S;

    /* renamed from: T, reason: collision with root package name */
    private float f9303T;

    /* renamed from: U, reason: collision with root package name */
    private float f9304U;

    /* renamed from: V, reason: collision with root package name */
    private float f9305V;

    /* renamed from: W, reason: collision with root package name */
    private float f9306W;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.utils.widget.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0067a extends ViewOutlineProvider {
        C0067a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, a.this.getWidth(), a.this.getHeight(), (Math.min(r3, r4) * a.this.f9293J) / 2.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, a.this.getWidth(), a.this.getHeight(), a.this.f9294K);
        }
    }

    public a(Context context) {
        super(context);
        this.f9291H = new b.c();
        this.f9292I = 0.0f;
        this.f9293J = 0.0f;
        this.f9294K = Float.NaN;
        this.f9298O = new Drawable[2];
        this.f9300Q = true;
        this.f9301R = null;
        this.f9302S = null;
        this.f9303T = Float.NaN;
        this.f9304U = Float.NaN;
        this.f9305V = Float.NaN;
        this.f9306W = Float.NaN;
        c(context, null);
    }

    private void c(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.m.Ge);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f9301R = obtainStyledAttributes.getDrawable(h.m.He);
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == h.m.Le) {
                    this.f9292I = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == h.m.Ue) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == h.m.Te) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == h.m.Ke) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == h.m.Re) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == h.m.Se) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == h.m.Qe) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f9300Q));
                } else if (index == h.m.Me) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.f9303T));
                } else if (index == h.m.Ne) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.f9304U));
                } else if (index == h.m.Oe) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.f9306W));
                } else if (index == h.m.Pe) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.f9305V));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f9302S = drawable;
            if (this.f9301R != null && drawable != null) {
                Drawable[] drawableArr = this.f9298O;
                Drawable mutate = getDrawable().mutate();
                this.f9302S = mutate;
                drawableArr[0] = mutate;
                this.f9298O[1] = this.f9301R.mutate();
                LayerDrawable layerDrawable = new LayerDrawable(this.f9298O);
                this.f9299P = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f9292I * 255.0f));
                if (!this.f9300Q) {
                    this.f9299P.getDrawable(0).setAlpha((int) ((1.0f - this.f9292I) * 255.0f));
                }
                super.setImageDrawable(this.f9299P);
                return;
            }
            Drawable drawable2 = getDrawable();
            this.f9302S = drawable2;
            if (drawable2 != null) {
                Drawable[] drawableArr2 = this.f9298O;
                Drawable mutate2 = drawable2.mutate();
                this.f9302S = mutate2;
                drawableArr2[0] = mutate2;
            }
        }
    }

    private void d() {
        float f4;
        float f5;
        float f6;
        float f7;
        if (Float.isNaN(this.f9303T) && Float.isNaN(this.f9304U) && Float.isNaN(this.f9305V) && Float.isNaN(this.f9306W)) {
            return;
        }
        float f8 = 0.0f;
        if (Float.isNaN(this.f9303T)) {
            f4 = 0.0f;
        } else {
            f4 = this.f9303T;
        }
        if (Float.isNaN(this.f9304U)) {
            f5 = 0.0f;
        } else {
            f5 = this.f9304U;
        }
        if (Float.isNaN(this.f9305V)) {
            f6 = 1.0f;
        } else {
            f6 = this.f9305V;
        }
        if (!Float.isNaN(this.f9306W)) {
            f8 = this.f9306W;
        }
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        if (intrinsicWidth * height < intrinsicHeight * width) {
            f7 = width / intrinsicWidth;
        } else {
            f7 = height / intrinsicHeight;
        }
        float f9 = f6 * f7;
        matrix.postScale(f9, f9);
        float f10 = intrinsicWidth * f9;
        float f11 = f9 * intrinsicHeight;
        matrix.postTranslate((((f4 * (width - f10)) + width) - f10) * 0.5f, (((f5 * (height - f11)) + height) - f11) * 0.5f);
        matrix.postRotate(f8, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private void e() {
        if (Float.isNaN(this.f9303T) && Float.isNaN(this.f9304U) && Float.isNaN(this.f9305V) && Float.isNaN(this.f9306W)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            d();
        }
    }

    private void setOverlay(boolean z3) {
        this.f9300Q = z3;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getContrast() {
        return this.f9291H.f9332f;
    }

    public float getCrossfade() {
        return this.f9292I;
    }

    public float getImagePanX() {
        return this.f9303T;
    }

    public float getImagePanY() {
        return this.f9304U;
    }

    public float getImageRotate() {
        return this.f9306W;
    }

    public float getImageZoom() {
        return this.f9305V;
    }

    public float getRound() {
        return this.f9294K;
    }

    public float getRoundPercent() {
        return this.f9293J;
    }

    public float getSaturation() {
        return this.f9291H.f9331e;
    }

    public float getWarmth() {
        return this.f9291H.f9333g;
    }

    @Override // android.view.View
    public void layout(int i4, int i5, int i6, int i7) {
        super.layout(i4, i5, i6, i7);
        d();
    }

    public void setAltImageResource(int i4) {
        Drawable mutate = C2046a.b(getContext(), i4).mutate();
        this.f9301R = mutate;
        Drawable[] drawableArr = this.f9298O;
        drawableArr[0] = this.f9302S;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f9298O);
        this.f9299P = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f9292I);
    }

    public void setBrightness(float f4) {
        b.c cVar = this.f9291H;
        cVar.f9330d = f4;
        cVar.c(this);
    }

    public void setContrast(float f4) {
        b.c cVar = this.f9291H;
        cVar.f9332f = f4;
        cVar.c(this);
    }

    public void setCrossfade(float f4) {
        this.f9292I = f4;
        if (this.f9298O != null) {
            if (!this.f9300Q) {
                this.f9299P.getDrawable(0).setAlpha((int) ((1.0f - this.f9292I) * 255.0f));
            }
            this.f9299P.getDrawable(1).setAlpha((int) (this.f9292I * 255.0f));
            super.setImageDrawable(this.f9299P);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f9301R != null && drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f9302S = mutate;
            Drawable[] drawableArr = this.f9298O;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f9301R;
            LayerDrawable layerDrawable = new LayerDrawable(this.f9298O);
            this.f9299P = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f9292I);
            return;
        }
        super.setImageDrawable(drawable);
    }

    public void setImagePanX(float f4) {
        this.f9303T = f4;
        e();
    }

    public void setImagePanY(float f4) {
        this.f9304U = f4;
        e();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int i4) {
        if (this.f9301R != null) {
            Drawable mutate = C2046a.b(getContext(), i4).mutate();
            this.f9302S = mutate;
            Drawable[] drawableArr = this.f9298O;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f9301R;
            LayerDrawable layerDrawable = new LayerDrawable(this.f9298O);
            this.f9299P = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f9292I);
            return;
        }
        super.setImageResource(i4);
    }

    public void setImageRotate(float f4) {
        this.f9306W = f4;
        e();
    }

    public void setImageZoom(float f4) {
        this.f9305V = f4;
        e();
    }

    @W(21)
    public void setRound(float f4) {
        boolean z3;
        if (Float.isNaN(f4)) {
            this.f9294K = f4;
            float f5 = this.f9293J;
            this.f9293J = -1.0f;
            setRoundPercent(f5);
            return;
        }
        if (this.f9294K != f4) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f9294K = f4;
        if (f4 != 0.0f) {
            if (this.f9295L == null) {
                this.f9295L = new Path();
            }
            if (this.f9297N == null) {
                this.f9297N = new RectF();
            }
            if (this.f9296M == null) {
                b bVar = new b();
                this.f9296M = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f9297N.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f9295L.reset();
            Path path = this.f9295L;
            RectF rectF = this.f9297N;
            float f6 = this.f9294K;
            path.addRoundRect(rectF, f6, f6, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z3) {
            invalidateOutline();
        }
    }

    @W(21)
    public void setRoundPercent(float f4) {
        boolean z3;
        if (this.f9293J != f4) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f9293J = f4;
        if (f4 != 0.0f) {
            if (this.f9295L == null) {
                this.f9295L = new Path();
            }
            if (this.f9297N == null) {
                this.f9297N = new RectF();
            }
            if (this.f9296M == null) {
                C0067a c0067a = new C0067a();
                this.f9296M = c0067a;
                setOutlineProvider(c0067a);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f9293J) / 2.0f;
            this.f9297N.set(0.0f, 0.0f, width, height);
            this.f9295L.reset();
            this.f9295L.addRoundRect(this.f9297N, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z3) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f4) {
        b.c cVar = this.f9291H;
        cVar.f9331e = f4;
        cVar.c(this);
    }

    public void setWarmth(float f4) {
        b.c cVar = this.f9291H;
        cVar.f9333g = f4;
        cVar.c(this);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9291H = new b.c();
        this.f9292I = 0.0f;
        this.f9293J = 0.0f;
        this.f9294K = Float.NaN;
        this.f9298O = new Drawable[2];
        this.f9300Q = true;
        this.f9301R = null;
        this.f9302S = null;
        this.f9303T = Float.NaN;
        this.f9304U = Float.NaN;
        this.f9305V = Float.NaN;
        this.f9306W = Float.NaN;
        c(context, attributeSet);
    }

    public a(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f9291H = new b.c();
        this.f9292I = 0.0f;
        this.f9293J = 0.0f;
        this.f9294K = Float.NaN;
        this.f9298O = new Drawable[2];
        this.f9300Q = true;
        this.f9301R = null;
        this.f9302S = null;
        this.f9303T = Float.NaN;
        this.f9304U = Float.NaN;
        this.f9305V = Float.NaN;
        this.f9306W = Float.NaN;
        c(context, attributeSet);
    }
}
