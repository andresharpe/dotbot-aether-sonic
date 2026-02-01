package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.P;
import androidx.annotation.W;
import androidx.constraintlayout.widget.h;
import androidx.core.view.C;
import d.C2042a;

/* loaded from: classes.dex */
public class e extends View implements androidx.constraintlayout.motion.widget.e {

    /* renamed from: D0, reason: collision with root package name */
    static final String f9352D0 = "MotionLabel";

    /* renamed from: E0, reason: collision with root package name */
    private static final int f9353E0 = 1;

    /* renamed from: F0, reason: collision with root package name */
    private static final int f9354F0 = 2;

    /* renamed from: G0, reason: collision with root package name */
    private static final int f9355G0 = 3;

    /* renamed from: A0, reason: collision with root package name */
    float f9356A0;

    /* renamed from: B0, reason: collision with root package name */
    float f9357B0;

    /* renamed from: C0, reason: collision with root package name */
    float f9358C0;

    /* renamed from: E, reason: collision with root package name */
    TextPaint f9359E;

    /* renamed from: F, reason: collision with root package name */
    Path f9360F;

    /* renamed from: G, reason: collision with root package name */
    private int f9361G;

    /* renamed from: H, reason: collision with root package name */
    private int f9362H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f9363I;

    /* renamed from: J, reason: collision with root package name */
    private float f9364J;

    /* renamed from: K, reason: collision with root package name */
    private float f9365K;

    /* renamed from: L, reason: collision with root package name */
    ViewOutlineProvider f9366L;

    /* renamed from: M, reason: collision with root package name */
    RectF f9367M;

    /* renamed from: N, reason: collision with root package name */
    private float f9368N;

    /* renamed from: O, reason: collision with root package name */
    private float f9369O;

    /* renamed from: P, reason: collision with root package name */
    private int f9370P;

    /* renamed from: Q, reason: collision with root package name */
    private int f9371Q;

    /* renamed from: R, reason: collision with root package name */
    private float f9372R;

    /* renamed from: S, reason: collision with root package name */
    private String f9373S;

    /* renamed from: T, reason: collision with root package name */
    boolean f9374T;

    /* renamed from: U, reason: collision with root package name */
    private Rect f9375U;

    /* renamed from: V, reason: collision with root package name */
    private CharSequence f9376V;

    /* renamed from: W, reason: collision with root package name */
    private int f9377W;

    /* renamed from: a0, reason: collision with root package name */
    private int f9378a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f9379b0;

    /* renamed from: c0, reason: collision with root package name */
    private int f9380c0;

    /* renamed from: d0, reason: collision with root package name */
    private String f9381d0;

    /* renamed from: e0, reason: collision with root package name */
    private Layout f9382e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f9383f0;

    /* renamed from: g0, reason: collision with root package name */
    private int f9384g0;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f9385h0;

    /* renamed from: i0, reason: collision with root package name */
    private float f9386i0;

    /* renamed from: j0, reason: collision with root package name */
    private float f9387j0;

    /* renamed from: k0, reason: collision with root package name */
    private float f9388k0;

    /* renamed from: l0, reason: collision with root package name */
    private Drawable f9389l0;

    /* renamed from: m0, reason: collision with root package name */
    Matrix f9390m0;

    /* renamed from: n0, reason: collision with root package name */
    private Bitmap f9391n0;

    /* renamed from: o0, reason: collision with root package name */
    private BitmapShader f9392o0;

    /* renamed from: p0, reason: collision with root package name */
    private Matrix f9393p0;

    /* renamed from: q0, reason: collision with root package name */
    private float f9394q0;

    /* renamed from: r0, reason: collision with root package name */
    private float f9395r0;

    /* renamed from: s0, reason: collision with root package name */
    private float f9396s0;

    /* renamed from: t0, reason: collision with root package name */
    private float f9397t0;

    /* renamed from: u0, reason: collision with root package name */
    Paint f9398u0;

    /* renamed from: v0, reason: collision with root package name */
    private int f9399v0;

    /* renamed from: w0, reason: collision with root package name */
    Rect f9400w0;

    /* renamed from: x0, reason: collision with root package name */
    Paint f9401x0;

    /* renamed from: y0, reason: collision with root package name */
    float f9402y0;

    /* renamed from: z0, reason: collision with root package name */
    float f9403z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, e.this.getWidth(), e.this.getHeight(), (Math.min(r3, r4) * e.this.f9364J) / 2.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, e.this.getWidth(), e.this.getHeight(), e.this.f9365K);
        }
    }

    public e(Context context) {
        super(context);
        this.f9359E = new TextPaint();
        this.f9360F = new Path();
        this.f9361G = 65535;
        this.f9362H = 65535;
        this.f9363I = false;
        this.f9364J = 0.0f;
        this.f9365K = Float.NaN;
        this.f9368N = 48.0f;
        this.f9369O = Float.NaN;
        this.f9372R = 0.0f;
        this.f9373S = "Hello World";
        this.f9374T = true;
        this.f9375U = new Rect();
        this.f9377W = 1;
        this.f9378a0 = 1;
        this.f9379b0 = 1;
        this.f9380c0 = 1;
        this.f9383f0 = 8388659;
        this.f9384g0 = 0;
        this.f9385h0 = false;
        this.f9394q0 = Float.NaN;
        this.f9395r0 = Float.NaN;
        this.f9396s0 = 0.0f;
        this.f9397t0 = 0.0f;
        this.f9398u0 = new Paint();
        this.f9399v0 = 0;
        this.f9403z0 = Float.NaN;
        this.f9356A0 = Float.NaN;
        this.f9357B0 = Float.NaN;
        this.f9358C0 = Float.NaN;
        g(context, null);
    }

    private void d(float f4, float f5, float f6, float f7) {
        if (this.f9393p0 == null) {
            return;
        }
        this.f9387j0 = f6 - f4;
        this.f9388k0 = f7 - f5;
        l();
    }

    private void g(Context context, AttributeSet attributeSet) {
        i(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.m.Vj);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == h.m.bk) {
                    setText(obtainStyledAttributes.getText(index));
                } else if (index == h.m.dk) {
                    this.f9381d0 = obtainStyledAttributes.getString(index);
                } else if (index == h.m.hk) {
                    this.f9369O = obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f9369O);
                } else if (index == h.m.Wj) {
                    this.f9368N = obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f9368N);
                } else if (index == h.m.Yj) {
                    this.f9370P = obtainStyledAttributes.getInt(index, this.f9370P);
                } else if (index == h.m.Xj) {
                    this.f9371Q = obtainStyledAttributes.getInt(index, this.f9371Q);
                } else if (index == h.m.Zj) {
                    this.f9361G = obtainStyledAttributes.getColor(index, this.f9361G);
                } else if (index == h.m.fk) {
                    float dimension = obtainStyledAttributes.getDimension(index, this.f9365K);
                    this.f9365K = dimension;
                    setRound(dimension);
                } else if (index == h.m.gk) {
                    float f4 = obtainStyledAttributes.getFloat(index, this.f9364J);
                    this.f9364J = f4;
                    setRoundPercent(f4);
                } else if (index == h.m.ak) {
                    setGravity(obtainStyledAttributes.getInt(index, -1));
                } else if (index == h.m.ek) {
                    this.f9384g0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == h.m.nk) {
                    this.f9362H = obtainStyledAttributes.getInt(index, this.f9362H);
                    this.f9363I = true;
                } else if (index == h.m.ok) {
                    this.f9372R = obtainStyledAttributes.getDimension(index, this.f9372R);
                    this.f9363I = true;
                } else if (index == h.m.ik) {
                    this.f9389l0 = obtainStyledAttributes.getDrawable(index);
                    this.f9363I = true;
                } else if (index == h.m.jk) {
                    this.f9403z0 = obtainStyledAttributes.getFloat(index, this.f9403z0);
                } else if (index == h.m.kk) {
                    this.f9356A0 = obtainStyledAttributes.getFloat(index, this.f9356A0);
                } else if (index == h.m.pk) {
                    this.f9396s0 = obtainStyledAttributes.getFloat(index, this.f9396s0);
                } else if (index == h.m.qk) {
                    this.f9397t0 = obtainStyledAttributes.getFloat(index, this.f9397t0);
                } else if (index == h.m.lk) {
                    this.f9358C0 = obtainStyledAttributes.getFloat(index, this.f9358C0);
                } else if (index == h.m.mk) {
                    this.f9357B0 = obtainStyledAttributes.getFloat(index, this.f9357B0);
                } else if (index == h.m.tk) {
                    this.f9394q0 = obtainStyledAttributes.getDimension(index, this.f9394q0);
                } else if (index == h.m.uk) {
                    this.f9395r0 = obtainStyledAttributes.getDimension(index, this.f9395r0);
                } else if (index == h.m.sk) {
                    this.f9399v0 = obtainStyledAttributes.getInt(index, this.f9399v0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        k();
        j();
    }

    private float getHorizontalOffset() {
        float f4;
        float f5;
        if (Float.isNaN(this.f9369O)) {
            f4 = 1.0f;
        } else {
            f4 = this.f9368N / this.f9369O;
        }
        TextPaint textPaint = this.f9359E;
        String str = this.f9373S;
        float measureText = f4 * textPaint.measureText(str, 0, str.length());
        if (Float.isNaN(this.f9387j0)) {
            f5 = getMeasuredWidth();
        } else {
            f5 = this.f9387j0;
        }
        return ((((f5 - getPaddingLeft()) - getPaddingRight()) - measureText) * (this.f9396s0 + 1.0f)) / 2.0f;
    }

    private float getVerticalOffset() {
        float f4;
        float f5;
        if (Float.isNaN(this.f9369O)) {
            f4 = 1.0f;
        } else {
            f4 = this.f9368N / this.f9369O;
        }
        Paint.FontMetrics fontMetrics = this.f9359E.getFontMetrics();
        if (Float.isNaN(this.f9388k0)) {
            f5 = getMeasuredHeight();
        } else {
            f5 = this.f9388k0;
        }
        float paddingTop = (f5 - getPaddingTop()) - getPaddingBottom();
        float f6 = fontMetrics.descent;
        float f7 = fontMetrics.ascent;
        return (((paddingTop - ((f6 - f7) * f4)) * (1.0f - this.f9397t0)) / 2.0f) - (f4 * f7);
    }

    private void h(String str, int i4, int i5) {
        Typeface typeface;
        Typeface create;
        int i6;
        if (str != null) {
            typeface = Typeface.create(str, i5);
            if (typeface != null) {
                setTypeface(typeface);
                return;
            }
        } else {
            typeface = null;
        }
        boolean z3 = true;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    typeface = Typeface.MONOSPACE;
                }
            } else {
                typeface = Typeface.SERIF;
            }
        } else {
            typeface = Typeface.SANS_SERIF;
        }
        float f4 = 0.0f;
        if (i5 > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i5);
            } else {
                create = Typeface.create(typeface, i5);
            }
            setTypeface(create);
            if (create != null) {
                i6 = create.getStyle();
            } else {
                i6 = 0;
            }
            int i7 = (~i6) & i5;
            TextPaint textPaint = this.f9359E;
            if ((i7 & 1) == 0) {
                z3 = false;
            }
            textPaint.setFakeBoldText(z3);
            TextPaint textPaint2 = this.f9359E;
            if ((i7 & 2) != 0) {
                f4 = -0.25f;
            }
            textPaint2.setTextSkewX(f4);
            return;
        }
        this.f9359E.setFakeBoldText(false);
        this.f9359E.setTextSkewX(0.0f);
        setTypeface(typeface);
    }

    private void i(Context context, @P AttributeSet attributeSet) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C2042a.b.f49128J0, typedValue, true);
        TextPaint textPaint = this.f9359E;
        int i4 = typedValue.data;
        this.f9361G = i4;
        textPaint.setColor(i4);
    }

    private void k() {
        if (this.f9389l0 != null) {
            this.f9393p0 = new Matrix();
            int intrinsicWidth = this.f9389l0.getIntrinsicWidth();
            int intrinsicHeight = this.f9389l0.getIntrinsicHeight();
            int i4 = 128;
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                if (Float.isNaN(this.f9395r0)) {
                    intrinsicWidth = 128;
                } else {
                    intrinsicWidth = (int) this.f9395r0;
                }
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                if (!Float.isNaN(this.f9394q0)) {
                    i4 = (int) this.f9394q0;
                }
                intrinsicHeight = i4;
            }
            if (this.f9399v0 != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.f9391n0 = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f9391n0);
            this.f9389l0.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.f9389l0.setFilterBitmap(true);
            this.f9389l0.draw(canvas);
            if (this.f9399v0 != 0) {
                this.f9391n0 = e(this.f9391n0, 4);
            }
            Bitmap bitmap = this.f9391n0;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.f9392o0 = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    private void l() {
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10 = 0.0f;
        if (Float.isNaN(this.f9403z0)) {
            f4 = 0.0f;
        } else {
            f4 = this.f9403z0;
        }
        if (Float.isNaN(this.f9356A0)) {
            f5 = 0.0f;
        } else {
            f5 = this.f9356A0;
        }
        if (Float.isNaN(this.f9357B0)) {
            f6 = 1.0f;
        } else {
            f6 = this.f9357B0;
        }
        if (!Float.isNaN(this.f9358C0)) {
            f10 = this.f9358C0;
        }
        this.f9393p0.reset();
        float width = this.f9391n0.getWidth();
        float height = this.f9391n0.getHeight();
        if (Float.isNaN(this.f9395r0)) {
            f7 = this.f9387j0;
        } else {
            f7 = this.f9395r0;
        }
        if (Float.isNaN(this.f9394q0)) {
            f8 = this.f9388k0;
        } else {
            f8 = this.f9394q0;
        }
        if (width * f8 < height * f7) {
            f9 = f7 / width;
        } else {
            f9 = f8 / height;
        }
        float f11 = f6 * f9;
        this.f9393p0.postScale(f11, f11);
        float f12 = width * f11;
        float f13 = f7 - f12;
        float f14 = f11 * height;
        float f15 = f8 - f14;
        if (!Float.isNaN(this.f9394q0)) {
            f15 = this.f9394q0 / 2.0f;
        }
        if (!Float.isNaN(this.f9395r0)) {
            f13 = this.f9395r0 / 2.0f;
        }
        this.f9393p0.postTranslate((((f4 * f13) + f7) - f12) * 0.5f, (((f5 * f15) + f8) - f14) * 0.5f);
        this.f9393p0.postRotate(f10, f7 / 2.0f, f8 / 2.0f);
        this.f9392o0.setLocalMatrix(this.f9393p0);
    }

    @Override // androidx.constraintlayout.motion.widget.e
    public void a(float f4, float f5, float f6, float f7) {
        float f8;
        int i4 = (int) (f4 + 0.5f);
        this.f9386i0 = f4 - i4;
        int i5 = (int) (f6 + 0.5f);
        int i6 = i5 - i4;
        int i7 = (int) (f7 + 0.5f);
        int i8 = (int) (0.5f + f5);
        int i9 = i7 - i8;
        float f9 = f6 - f4;
        this.f9387j0 = f9;
        float f10 = f7 - f5;
        this.f9388k0 = f10;
        d(f4, f5, f6, f7);
        if (getMeasuredHeight() == i9 && getMeasuredWidth() == i6) {
            super.layout(i4, i8, i5, i7);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(i9, 1073741824));
            super.layout(i4, i8, i5, i7);
        }
        if (this.f9385h0) {
            if (this.f9400w0 == null) {
                this.f9401x0 = new Paint();
                this.f9400w0 = new Rect();
                this.f9401x0.set(this.f9359E);
                this.f9402y0 = this.f9401x0.getTextSize();
            }
            this.f9387j0 = f9;
            this.f9388k0 = f10;
            Paint paint = this.f9401x0;
            String str = this.f9373S;
            paint.getTextBounds(str, 0, str.length(), this.f9400w0);
            float height = this.f9400w0.height() * 1.3f;
            float f11 = (f9 - this.f9378a0) - this.f9377W;
            float f12 = (f10 - this.f9380c0) - this.f9379b0;
            float width = this.f9400w0.width();
            if (width * f12 > height * f11) {
                this.f9359E.setTextSize((this.f9402y0 * f11) / width);
            } else {
                this.f9359E.setTextSize((this.f9402y0 * f12) / height);
            }
            if (this.f9363I || !Float.isNaN(this.f9369O)) {
                if (Float.isNaN(this.f9369O)) {
                    f8 = 1.0f;
                } else {
                    f8 = this.f9368N / this.f9369O;
                }
                f(f8);
            }
        }
    }

    Bitmap e(Bitmap bitmap, int i4) {
        System.nanoTime();
        int width = bitmap.getWidth() / 2;
        int height = bitmap.getHeight() / 2;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
        for (int i5 = 0; i5 < i4 && width >= 32 && height >= 32; i5++) {
            width /= 2;
            height /= 2;
            createScaledBitmap = Bitmap.createScaledBitmap(createScaledBitmap, width, height, true);
        }
        return createScaledBitmap;
    }

    void f(float f4) {
        if (!this.f9363I && f4 == 1.0f) {
            return;
        }
        this.f9360F.reset();
        String str = this.f9373S;
        int length = str.length();
        this.f9359E.getTextBounds(str, 0, length, this.f9375U);
        this.f9359E.getTextPath(str, 0, length, 0.0f, 0.0f, this.f9360F);
        if (f4 != 1.0f) {
            Log.v(f9352D0, androidx.constraintlayout.motion.widget.c.f() + " scale " + f4);
            Matrix matrix = new Matrix();
            matrix.postScale(f4, f4);
            this.f9360F.transform(matrix);
        }
        Rect rect = this.f9375U;
        rect.right--;
        rect.left++;
        rect.bottom++;
        rect.top--;
        RectF rectF = new RectF();
        rectF.bottom = getHeight();
        rectF.right = getWidth();
        this.f9374T = false;
    }

    public float getRound() {
        return this.f9365K;
    }

    public float getRoundPercent() {
        return this.f9364J;
    }

    public float getScaleFromTextSize() {
        return this.f9369O;
    }

    public float getTextBackgroundPanX() {
        return this.f9403z0;
    }

    public float getTextBackgroundPanY() {
        return this.f9356A0;
    }

    public float getTextBackgroundRotate() {
        return this.f9358C0;
    }

    public float getTextBackgroundZoom() {
        return this.f9357B0;
    }

    public int getTextOutlineColor() {
        return this.f9362H;
    }

    public float getTextPanX() {
        return this.f9396s0;
    }

    public float getTextPanY() {
        return this.f9397t0;
    }

    public float getTextureHeight() {
        return this.f9394q0;
    }

    public float getTextureWidth() {
        return this.f9395r0;
    }

    public Typeface getTypeface() {
        return this.f9359E.getTypeface();
    }

    void j() {
        this.f9377W = getPaddingLeft();
        this.f9378a0 = getPaddingRight();
        this.f9379b0 = getPaddingTop();
        this.f9380c0 = getPaddingBottom();
        h(this.f9381d0, this.f9371Q, this.f9370P);
        this.f9359E.setColor(this.f9361G);
        this.f9359E.setStrokeWidth(this.f9372R);
        this.f9359E.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f9359E.setFlags(128);
        setTextSize(this.f9368N);
        this.f9359E.setAntiAlias(true);
    }

    @Override // android.view.View
    public void layout(int i4, int i5, int i6, int i7) {
        float f4;
        super.layout(i4, i5, i6, i7);
        boolean isNaN = Float.isNaN(this.f9369O);
        if (isNaN) {
            f4 = 1.0f;
        } else {
            f4 = this.f9368N / this.f9369O;
        }
        this.f9387j0 = i6 - i4;
        this.f9388k0 = i7 - i5;
        if (this.f9385h0) {
            if (this.f9400w0 == null) {
                this.f9401x0 = new Paint();
                this.f9400w0 = new Rect();
                this.f9401x0.set(this.f9359E);
                this.f9402y0 = this.f9401x0.getTextSize();
            }
            Paint paint = this.f9401x0;
            String str = this.f9373S;
            paint.getTextBounds(str, 0, str.length(), this.f9400w0);
            int width = this.f9400w0.width();
            int height = (int) (this.f9400w0.height() * 1.3f);
            float f5 = (this.f9387j0 - this.f9378a0) - this.f9377W;
            float f6 = (this.f9388k0 - this.f9380c0) - this.f9379b0;
            if (isNaN) {
                float f7 = width;
                float f8 = height;
                if (f7 * f6 > f8 * f5) {
                    this.f9359E.setTextSize((this.f9402y0 * f5) / f7);
                } else {
                    this.f9359E.setTextSize((this.f9402y0 * f6) / f8);
                }
            } else {
                float f9 = width;
                float f10 = height;
                if (f9 * f6 > f10 * f5) {
                    f4 = f5 / f9;
                } else {
                    f4 = f6 / f10;
                }
            }
        }
        if (this.f9363I || !isNaN) {
            d(i4, i5, i6, i7);
            f(f4);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f4;
        if (Float.isNaN(this.f9369O)) {
            f4 = 1.0f;
        } else {
            f4 = this.f9368N / this.f9369O;
        }
        super.onDraw(canvas);
        if (!this.f9363I && f4 == 1.0f) {
            canvas.drawText(this.f9373S, this.f9386i0 + this.f9377W + getHorizontalOffset(), this.f9379b0 + getVerticalOffset(), this.f9359E);
            return;
        }
        if (this.f9374T) {
            f(f4);
        }
        if (this.f9390m0 == null) {
            this.f9390m0 = new Matrix();
        }
        if (this.f9363I) {
            this.f9398u0.set(this.f9359E);
            this.f9390m0.reset();
            float horizontalOffset = this.f9377W + getHorizontalOffset();
            float verticalOffset = this.f9379b0 + getVerticalOffset();
            this.f9390m0.postTranslate(horizontalOffset, verticalOffset);
            this.f9390m0.preScale(f4, f4);
            this.f9360F.transform(this.f9390m0);
            if (this.f9392o0 != null) {
                this.f9359E.setFilterBitmap(true);
                this.f9359E.setShader(this.f9392o0);
            } else {
                this.f9359E.setColor(this.f9361G);
            }
            this.f9359E.setStyle(Paint.Style.FILL);
            this.f9359E.setStrokeWidth(this.f9372R);
            canvas.drawPath(this.f9360F, this.f9359E);
            if (this.f9392o0 != null) {
                this.f9359E.setShader(null);
            }
            this.f9359E.setColor(this.f9362H);
            this.f9359E.setStyle(Paint.Style.STROKE);
            this.f9359E.setStrokeWidth(this.f9372R);
            canvas.drawPath(this.f9360F, this.f9359E);
            this.f9390m0.reset();
            this.f9390m0.postTranslate(-horizontalOffset, -verticalOffset);
            this.f9360F.transform(this.f9390m0);
            this.f9359E.set(this.f9398u0);
            return;
        }
        float horizontalOffset2 = this.f9377W + getHorizontalOffset();
        float verticalOffset2 = this.f9379b0 + getVerticalOffset();
        this.f9390m0.reset();
        this.f9390m0.preTranslate(horizontalOffset2, verticalOffset2);
        this.f9360F.transform(this.f9390m0);
        this.f9359E.setColor(this.f9361G);
        this.f9359E.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f9359E.setStrokeWidth(this.f9372R);
        canvas.drawPath(this.f9360F, this.f9359E);
        this.f9390m0.reset();
        this.f9390m0.preTranslate(-horizontalOffset2, -verticalOffset2);
        this.f9360F.transform(this.f9390m0);
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        this.f9385h0 = false;
        this.f9377W = getPaddingLeft();
        this.f9378a0 = getPaddingRight();
        this.f9379b0 = getPaddingTop();
        this.f9380c0 = getPaddingBottom();
        if (mode == 1073741824 && mode2 == 1073741824) {
            if (this.f9384g0 != 0) {
                this.f9385h0 = true;
            }
        } else {
            TextPaint textPaint = this.f9359E;
            String str = this.f9373S;
            textPaint.getTextBounds(str, 0, str.length(), this.f9375U);
            if (mode != 1073741824) {
                size = (int) (this.f9375U.width() + 0.99999f);
            }
            size += this.f9377W + this.f9378a0;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (this.f9359E.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.f9379b0 + this.f9380c0 + fontMetricsInt;
            }
        }
        setMeasuredDimension(size, size2);
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int i4) {
        if ((i4 & C.f13103d) == 0) {
            i4 |= C.f13101b;
        }
        if ((i4 & 112) == 0) {
            i4 |= 48;
        }
        if (i4 != this.f9383f0) {
            invalidate();
        }
        this.f9383f0 = i4;
        int i5 = i4 & 112;
        if (i5 != 48) {
            if (i5 != 80) {
                this.f9397t0 = 0.0f;
            } else {
                this.f9397t0 = 1.0f;
            }
        } else {
            this.f9397t0 = -1.0f;
        }
        int i6 = i4 & C.f13103d;
        if (i6 != 3) {
            if (i6 != 5) {
                if (i6 != 8388611) {
                    if (i6 != 8388613) {
                        this.f9396s0 = 0.0f;
                        return;
                    }
                }
            }
            this.f9396s0 = 1.0f;
            return;
        }
        this.f9396s0 = -1.0f;
    }

    @W(21)
    public void setRound(float f4) {
        boolean z3;
        if (Float.isNaN(f4)) {
            this.f9365K = f4;
            float f5 = this.f9364J;
            this.f9364J = -1.0f;
            setRoundPercent(f5);
            return;
        }
        if (this.f9365K != f4) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f9365K = f4;
        if (f4 != 0.0f) {
            if (this.f9360F == null) {
                this.f9360F = new Path();
            }
            if (this.f9367M == null) {
                this.f9367M = new RectF();
            }
            if (this.f9366L == null) {
                b bVar = new b();
                this.f9366L = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f9367M.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f9360F.reset();
            Path path = this.f9360F;
            RectF rectF = this.f9367M;
            float f6 = this.f9365K;
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
        if (this.f9364J != f4) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f9364J = f4;
        if (f4 != 0.0f) {
            if (this.f9360F == null) {
                this.f9360F = new Path();
            }
            if (this.f9367M == null) {
                this.f9367M = new RectF();
            }
            if (this.f9366L == null) {
                a aVar = new a();
                this.f9366L = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f9364J) / 2.0f;
            this.f9367M.set(0.0f, 0.0f, width, height);
            this.f9360F.reset();
            this.f9360F.addRoundRect(this.f9367M, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z3) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f4) {
        this.f9369O = f4;
    }

    public void setText(CharSequence charSequence) {
        this.f9373S = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f4) {
        this.f9403z0 = f4;
        l();
        invalidate();
    }

    public void setTextBackgroundPanY(float f4) {
        this.f9356A0 = f4;
        l();
        invalidate();
    }

    public void setTextBackgroundRotate(float f4) {
        this.f9358C0 = f4;
        l();
        invalidate();
    }

    public void setTextBackgroundZoom(float f4) {
        this.f9357B0 = f4;
        l();
        invalidate();
    }

    public void setTextFillColor(int i4) {
        this.f9361G = i4;
        invalidate();
    }

    public void setTextOutlineColor(int i4) {
        this.f9362H = i4;
        this.f9363I = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f4) {
        this.f9372R = f4;
        this.f9363I = true;
        if (Float.isNaN(f4)) {
            this.f9372R = 1.0f;
            this.f9363I = false;
        }
        invalidate();
    }

    public void setTextPanX(float f4) {
        this.f9396s0 = f4;
        invalidate();
    }

    public void setTextPanY(float f4) {
        this.f9397t0 = f4;
        invalidate();
    }

    public void setTextSize(float f4) {
        float f5;
        this.f9368N = f4;
        Log.v(f9352D0, androidx.constraintlayout.motion.widget.c.f() + "  " + f4 + " / " + this.f9369O);
        TextPaint textPaint = this.f9359E;
        if (!Float.isNaN(this.f9369O)) {
            f4 = this.f9369O;
        }
        textPaint.setTextSize(f4);
        if (Float.isNaN(this.f9369O)) {
            f5 = 1.0f;
        } else {
            f5 = this.f9368N / this.f9369O;
        }
        f(f5);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f4) {
        this.f9394q0 = f4;
        l();
        invalidate();
    }

    public void setTextureWidth(float f4) {
        this.f9395r0 = f4;
        l();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        if (this.f9359E.getTypeface() != typeface) {
            this.f9359E.setTypeface(typeface);
            if (this.f9382e0 != null) {
                this.f9382e0 = null;
                requestLayout();
                invalidate();
            }
        }
    }

    public e(Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9359E = new TextPaint();
        this.f9360F = new Path();
        this.f9361G = 65535;
        this.f9362H = 65535;
        this.f9363I = false;
        this.f9364J = 0.0f;
        this.f9365K = Float.NaN;
        this.f9368N = 48.0f;
        this.f9369O = Float.NaN;
        this.f9372R = 0.0f;
        this.f9373S = "Hello World";
        this.f9374T = true;
        this.f9375U = new Rect();
        this.f9377W = 1;
        this.f9378a0 = 1;
        this.f9379b0 = 1;
        this.f9380c0 = 1;
        this.f9383f0 = 8388659;
        this.f9384g0 = 0;
        this.f9385h0 = false;
        this.f9394q0 = Float.NaN;
        this.f9395r0 = Float.NaN;
        this.f9396s0 = 0.0f;
        this.f9397t0 = 0.0f;
        this.f9398u0 = new Paint();
        this.f9399v0 = 0;
        this.f9403z0 = Float.NaN;
        this.f9356A0 = Float.NaN;
        this.f9357B0 = Float.NaN;
        this.f9358C0 = Float.NaN;
        g(context, attributeSet);
    }

    public e(Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f9359E = new TextPaint();
        this.f9360F = new Path();
        this.f9361G = 65535;
        this.f9362H = 65535;
        this.f9363I = false;
        this.f9364J = 0.0f;
        this.f9365K = Float.NaN;
        this.f9368N = 48.0f;
        this.f9369O = Float.NaN;
        this.f9372R = 0.0f;
        this.f9373S = "Hello World";
        this.f9374T = true;
        this.f9375U = new Rect();
        this.f9377W = 1;
        this.f9378a0 = 1;
        this.f9379b0 = 1;
        this.f9380c0 = 1;
        this.f9383f0 = 8388659;
        this.f9384g0 = 0;
        this.f9385h0 = false;
        this.f9394q0 = Float.NaN;
        this.f9395r0 = Float.NaN;
        this.f9396s0 = 0.0f;
        this.f9397t0 = 0.0f;
        this.f9398u0 = new Paint();
        this.f9399v0 = 0;
        this.f9403z0 = Float.NaN;
        this.f9356A0 = Float.NaN;
        this.f9357B0 = Float.NaN;
        this.f9358C0 = Float.NaN;
        g(context, attributeSet);
    }
}
