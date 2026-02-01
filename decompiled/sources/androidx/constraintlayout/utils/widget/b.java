package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.h;
import e.C2046a;

/* loaded from: classes.dex */
public class b extends AppCompatImageView {

    /* renamed from: H, reason: collision with root package name */
    private c f9309H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f9310I;

    /* renamed from: J, reason: collision with root package name */
    private Drawable f9311J;

    /* renamed from: K, reason: collision with root package name */
    private Drawable f9312K;

    /* renamed from: L, reason: collision with root package name */
    private float f9313L;

    /* renamed from: M, reason: collision with root package name */
    private float f9314M;

    /* renamed from: N, reason: collision with root package name */
    private float f9315N;

    /* renamed from: O, reason: collision with root package name */
    private Path f9316O;

    /* renamed from: P, reason: collision with root package name */
    ViewOutlineProvider f9317P;

    /* renamed from: Q, reason: collision with root package name */
    RectF f9318Q;

    /* renamed from: R, reason: collision with root package name */
    Drawable[] f9319R;

    /* renamed from: S, reason: collision with root package name */
    LayerDrawable f9320S;

    /* renamed from: T, reason: collision with root package name */
    float f9321T;

    /* renamed from: U, reason: collision with root package name */
    float f9322U;

    /* renamed from: V, reason: collision with root package name */
    float f9323V;

    /* renamed from: W, reason: collision with root package name */
    float f9324W;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, b.this.getWidth(), b.this.getHeight(), (Math.min(r3, r4) * b.this.f9314M) / 2.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.utils.widget.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0068b extends ViewOutlineProvider {
        C0068b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, b.this.getWidth(), b.this.getHeight(), b.this.f9315N);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        float[] f9327a = new float[20];

        /* renamed from: b, reason: collision with root package name */
        ColorMatrix f9328b = new ColorMatrix();

        /* renamed from: c, reason: collision with root package name */
        ColorMatrix f9329c = new ColorMatrix();

        /* renamed from: d, reason: collision with root package name */
        float f9330d = 1.0f;

        /* renamed from: e, reason: collision with root package name */
        float f9331e = 1.0f;

        /* renamed from: f, reason: collision with root package name */
        float f9332f = 1.0f;

        /* renamed from: g, reason: collision with root package name */
        float f9333g = 1.0f;

        private void a(float f4) {
            float[] fArr = this.f9327a;
            fArr[0] = f4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f4;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f4;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        private void b(float f4) {
            float f5 = 1.0f - f4;
            float f6 = 0.2999f * f5;
            float f7 = 0.587f * f5;
            float f8 = f5 * 0.114f;
            float[] fArr = this.f9327a;
            fArr[0] = f6 + f4;
            fArr[1] = f7;
            fArr[2] = f8;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f6;
            fArr[6] = f7 + f4;
            fArr[7] = f8;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f6;
            fArr[11] = f7;
            fArr[12] = f8 + f4;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        private void d(float f4) {
            float log;
            float f5;
            float f6;
            if (f4 <= 0.0f) {
                f4 = 0.01f;
            }
            float f7 = (5000.0f / f4) / 100.0f;
            if (f7 > 66.0f) {
                double d4 = f7 - 60.0f;
                f5 = ((float) Math.pow(d4, -0.13320475816726685d)) * 329.69873f;
                log = ((float) Math.pow(d4, 0.07551484555006027d)) * 288.12216f;
            } else {
                log = (((float) Math.log(f7)) * 99.4708f) - 161.11957f;
                f5 = 255.0f;
            }
            if (f7 < 66.0f) {
                if (f7 > 19.0f) {
                    f6 = (((float) Math.log(f7 - 10.0f)) * 138.51773f) - 305.0448f;
                } else {
                    f6 = 0.0f;
                }
            } else {
                f6 = 255.0f;
            }
            float min = Math.min(255.0f, Math.max(f5, 0.0f));
            float min2 = Math.min(255.0f, Math.max(log, 0.0f));
            float min3 = Math.min(255.0f, Math.max(f6, 0.0f));
            float log2 = (((float) Math.log(50.0f)) * 99.4708f) - 161.11957f;
            float log3 = (((float) Math.log(40.0f)) * 138.51773f) - 305.0448f;
            float min4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float min5 = Math.min(255.0f, Math.max(log2, 0.0f));
            float min6 = min3 / Math.min(255.0f, Math.max(log3, 0.0f));
            float[] fArr = this.f9327a;
            fArr[0] = min / min4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = min2 / min5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = min6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c(ImageView imageView) {
            boolean z3;
            this.f9328b.reset();
            float f4 = this.f9331e;
            boolean z4 = true;
            if (f4 != 1.0f) {
                b(f4);
                this.f9328b.set(this.f9327a);
                z3 = true;
            } else {
                z3 = false;
            }
            float f5 = this.f9332f;
            if (f5 != 1.0f) {
                this.f9329c.setScale(f5, f5, f5, 1.0f);
                this.f9328b.postConcat(this.f9329c);
                z3 = true;
            }
            float f6 = this.f9333g;
            if (f6 != 1.0f) {
                d(f6);
                this.f9329c.set(this.f9327a);
                this.f9328b.postConcat(this.f9329c);
            } else {
                z4 = z3;
            }
            float f7 = this.f9330d;
            if (f7 != 1.0f) {
                a(f7);
                this.f9329c.set(this.f9327a);
                this.f9328b.postConcat(this.f9329c);
            } else if (!z4) {
                imageView.clearColorFilter();
                return;
            }
            imageView.setColorFilter(new ColorMatrixColorFilter(this.f9328b));
        }
    }

    public b(Context context) {
        super(context);
        this.f9309H = new c();
        this.f9310I = true;
        this.f9311J = null;
        this.f9312K = null;
        this.f9313L = 0.0f;
        this.f9314M = 0.0f;
        this.f9315N = Float.NaN;
        this.f9319R = new Drawable[2];
        this.f9321T = Float.NaN;
        this.f9322U = Float.NaN;
        this.f9323V = Float.NaN;
        this.f9324W = Float.NaN;
        e(context, null);
    }

    private void e(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.m.Ge);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f9311J = obtainStyledAttributes.getDrawable(h.m.He);
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == h.m.Le) {
                    this.f9313L = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == h.m.Ue) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == h.m.Te) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == h.m.Ke) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == h.m.Je) {
                    setBrightness(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == h.m.Re) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == h.m.Se) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == h.m.Qe) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f9310I));
                } else if (index == h.m.Me) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.f9321T));
                } else if (index == h.m.Ne) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.f9322U));
                } else if (index == h.m.Oe) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.f9324W));
                } else if (index == h.m.Pe) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.f9323V));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f9312K = drawable;
            if (this.f9311J != null && drawable != null) {
                Drawable[] drawableArr = this.f9319R;
                Drawable mutate = getDrawable().mutate();
                this.f9312K = mutate;
                drawableArr[0] = mutate;
                this.f9319R[1] = this.f9311J.mutate();
                LayerDrawable layerDrawable = new LayerDrawable(this.f9319R);
                this.f9320S = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f9313L * 255.0f));
                if (!this.f9310I) {
                    this.f9320S.getDrawable(0).setAlpha((int) ((1.0f - this.f9313L) * 255.0f));
                }
                super.setImageDrawable(this.f9320S);
                return;
            }
            Drawable drawable2 = getDrawable();
            this.f9312K = drawable2;
            if (drawable2 != null) {
                Drawable[] drawableArr2 = this.f9319R;
                Drawable mutate2 = drawable2.mutate();
                this.f9312K = mutate2;
                drawableArr2[0] = mutate2;
            }
        }
    }

    private void f() {
        float f4;
        float f5;
        float f6;
        float f7;
        if (Float.isNaN(this.f9321T) && Float.isNaN(this.f9322U) && Float.isNaN(this.f9323V) && Float.isNaN(this.f9324W)) {
            return;
        }
        float f8 = 0.0f;
        if (Float.isNaN(this.f9321T)) {
            f4 = 0.0f;
        } else {
            f4 = this.f9321T;
        }
        if (Float.isNaN(this.f9322U)) {
            f5 = 0.0f;
        } else {
            f5 = this.f9322U;
        }
        if (Float.isNaN(this.f9323V)) {
            f6 = 1.0f;
        } else {
            f6 = this.f9323V;
        }
        if (!Float.isNaN(this.f9324W)) {
            f8 = this.f9324W;
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

    private void g() {
        if (Float.isNaN(this.f9321T) && Float.isNaN(this.f9322U) && Float.isNaN(this.f9323V) && Float.isNaN(this.f9324W)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            f();
        }
    }

    private void setOverlay(boolean z3) {
        this.f9310I = z3;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getBrightness() {
        return this.f9309H.f9330d;
    }

    public float getContrast() {
        return this.f9309H.f9332f;
    }

    public float getCrossfade() {
        return this.f9313L;
    }

    public float getImagePanX() {
        return this.f9321T;
    }

    public float getImagePanY() {
        return this.f9322U;
    }

    public float getImageRotate() {
        return this.f9324W;
    }

    public float getImageZoom() {
        return this.f9323V;
    }

    public float getRound() {
        return this.f9315N;
    }

    public float getRoundPercent() {
        return this.f9314M;
    }

    public float getSaturation() {
        return this.f9309H.f9331e;
    }

    public float getWarmth() {
        return this.f9309H.f9333g;
    }

    @Override // android.view.View
    public void layout(int i4, int i5, int i6, int i7) {
        super.layout(i4, i5, i6, i7);
        f();
    }

    public void setAltImageDrawable(Drawable drawable) {
        Drawable mutate = drawable.mutate();
        this.f9311J = mutate;
        Drawable[] drawableArr = this.f9319R;
        drawableArr[0] = this.f9312K;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f9319R);
        this.f9320S = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f9313L);
    }

    public void setAltImageResource(int i4) {
        Drawable b4 = C2046a.b(getContext(), i4);
        this.f9311J = b4;
        setAltImageDrawable(b4);
    }

    public void setBrightness(float f4) {
        c cVar = this.f9309H;
        cVar.f9330d = f4;
        cVar.c(this);
    }

    public void setContrast(float f4) {
        c cVar = this.f9309H;
        cVar.f9332f = f4;
        cVar.c(this);
    }

    public void setCrossfade(float f4) {
        this.f9313L = f4;
        if (this.f9319R != null) {
            if (!this.f9310I) {
                this.f9320S.getDrawable(0).setAlpha((int) ((1.0f - this.f9313L) * 255.0f));
            }
            this.f9320S.getDrawable(1).setAlpha((int) (this.f9313L * 255.0f));
            super.setImageDrawable(this.f9320S);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f9311J != null && drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f9312K = mutate;
            Drawable[] drawableArr = this.f9319R;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f9311J;
            LayerDrawable layerDrawable = new LayerDrawable(this.f9319R);
            this.f9320S = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f9313L);
            return;
        }
        super.setImageDrawable(drawable);
    }

    public void setImagePanX(float f4) {
        this.f9321T = f4;
        g();
    }

    public void setImagePanY(float f4) {
        this.f9322U = f4;
        g();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i4) {
        if (this.f9311J != null) {
            Drawable mutate = C2046a.b(getContext(), i4).mutate();
            this.f9312K = mutate;
            Drawable[] drawableArr = this.f9319R;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f9311J;
            LayerDrawable layerDrawable = new LayerDrawable(this.f9319R);
            this.f9320S = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f9313L);
            return;
        }
        super.setImageResource(i4);
    }

    public void setImageRotate(float f4) {
        this.f9324W = f4;
        g();
    }

    public void setImageZoom(float f4) {
        this.f9323V = f4;
        g();
    }

    @W(21)
    public void setRound(float f4) {
        boolean z3;
        if (Float.isNaN(f4)) {
            this.f9315N = f4;
            float f5 = this.f9314M;
            this.f9314M = -1.0f;
            setRoundPercent(f5);
            return;
        }
        if (this.f9315N != f4) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f9315N = f4;
        if (f4 != 0.0f) {
            if (this.f9316O == null) {
                this.f9316O = new Path();
            }
            if (this.f9318Q == null) {
                this.f9318Q = new RectF();
            }
            if (this.f9317P == null) {
                C0068b c0068b = new C0068b();
                this.f9317P = c0068b;
                setOutlineProvider(c0068b);
            }
            setClipToOutline(true);
            this.f9318Q.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f9316O.reset();
            Path path = this.f9316O;
            RectF rectF = this.f9318Q;
            float f6 = this.f9315N;
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
        if (this.f9314M != f4) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f9314M = f4;
        if (f4 != 0.0f) {
            if (this.f9316O == null) {
                this.f9316O = new Path();
            }
            if (this.f9318Q == null) {
                this.f9318Q = new RectF();
            }
            if (this.f9317P == null) {
                a aVar = new a();
                this.f9317P = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f9314M) / 2.0f;
            this.f9318Q.set(0.0f, 0.0f, width, height);
            this.f9316O.reset();
            this.f9316O.addRoundRect(this.f9318Q, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z3) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f4) {
        c cVar = this.f9309H;
        cVar.f9331e = f4;
        cVar.c(this);
    }

    public void setWarmth(float f4) {
        c cVar = this.f9309H;
        cVar.f9333g = f4;
        cVar.c(this);
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9309H = new c();
        this.f9310I = true;
        this.f9311J = null;
        this.f9312K = null;
        this.f9313L = 0.0f;
        this.f9314M = 0.0f;
        this.f9315N = Float.NaN;
        this.f9319R = new Drawable[2];
        this.f9321T = Float.NaN;
        this.f9322U = Float.NaN;
        this.f9323V = Float.NaN;
        this.f9324W = Float.NaN;
        e(context, attributeSet);
    }

    public b(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f9309H = new c();
        this.f9310I = true;
        this.f9311J = null;
        this.f9312K = null;
        this.f9313L = 0.0f;
        this.f9314M = 0.0f;
        this.f9315N = Float.NaN;
        this.f9319R = new Drawable[2];
        this.f9321T = Float.NaN;
        this.f9322U = Float.NaN;
        this.f9323V = Float.NaN;
        this.f9324W = Float.NaN;
        e(context, attributeSet);
    }
}
