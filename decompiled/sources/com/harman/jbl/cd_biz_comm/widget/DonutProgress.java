package com.harman.jbl.cd_biz_comm.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.InterfaceC0578v;
import androidx.core.content.C0669d;
import com.harman.jbl.cd_biz_comm.utils.k;
import com.harman.jbl.partybox.ui.effectlab.a;
import com.harman.jbl.partylight.lib.g;

/* loaded from: classes2.dex */
public class DonutProgress extends View {

    /* renamed from: A0, reason: collision with root package name */
    private static final String f37953A0 = "inner_bottom_text_color";

    /* renamed from: B0, reason: collision with root package name */
    private static final String f37954B0 = "finished_stroke_color";

    /* renamed from: C0, reason: collision with root package name */
    private static final String f37955C0 = "unfinished_stroke_color";

    /* renamed from: D0, reason: collision with root package name */
    private static final String f37956D0 = "max";

    /* renamed from: E0, reason: collision with root package name */
    private static final String f37957E0 = "progress";

    /* renamed from: F0, reason: collision with root package name */
    private static final String f37958F0 = "suffix";

    /* renamed from: G0, reason: collision with root package name */
    private static final String f37959G0 = "prefix";

    /* renamed from: H0, reason: collision with root package name */
    private static final String f37960H0 = "finished_stroke_width";

    /* renamed from: I0, reason: collision with root package name */
    private static final String f37961I0 = "unfinished_stroke_width";

    /* renamed from: J0, reason: collision with root package name */
    private static final String f37962J0 = "inner_background_color";

    /* renamed from: K0, reason: collision with root package name */
    private static final String f37963K0 = "starting_degree";

    /* renamed from: L0, reason: collision with root package name */
    private static final String f37964L0 = "inner_drawable";

    /* renamed from: u0, reason: collision with root package name */
    private static final String f37965u0 = "saved_instance";

    /* renamed from: v0, reason: collision with root package name */
    private static final String f37966v0 = "text_color";

    /* renamed from: w0, reason: collision with root package name */
    private static final String f37967w0 = "text_size";

    /* renamed from: x0, reason: collision with root package name */
    private static final String f37968x0 = "text";

    /* renamed from: y0, reason: collision with root package name */
    private static final String f37969y0 = "inner_bottom_text_size";

    /* renamed from: z0, reason: collision with root package name */
    private static final String f37970z0 = "inner_bottom_text";

    /* renamed from: E, reason: collision with root package name */
    private Paint f37971E;

    /* renamed from: F, reason: collision with root package name */
    private Paint f37972F;

    /* renamed from: G, reason: collision with root package name */
    private Paint f37973G;

    /* renamed from: H, reason: collision with root package name */
    protected Paint f37974H;

    /* renamed from: I, reason: collision with root package name */
    protected Paint f37975I;

    /* renamed from: J, reason: collision with root package name */
    private RectF f37976J;

    /* renamed from: K, reason: collision with root package name */
    private RectF f37977K;

    /* renamed from: L, reason: collision with root package name */
    private int f37978L;

    /* renamed from: M, reason: collision with root package name */
    private Bitmap f37979M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f37980N;

    /* renamed from: O, reason: collision with root package name */
    private float f37981O;

    /* renamed from: P, reason: collision with root package name */
    private int f37982P;

    /* renamed from: Q, reason: collision with root package name */
    private int f37983Q;

    /* renamed from: R, reason: collision with root package name */
    private float f37984R;

    /* renamed from: S, reason: collision with root package name */
    private int f37985S;

    /* renamed from: T, reason: collision with root package name */
    private int f37986T;

    /* renamed from: U, reason: collision with root package name */
    private int f37987U;

    /* renamed from: V, reason: collision with root package name */
    private int f37988V;

    /* renamed from: W, reason: collision with root package name */
    private float f37989W;

    /* renamed from: a0, reason: collision with root package name */
    private float f37990a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f37991b0;

    /* renamed from: c0, reason: collision with root package name */
    private String f37992c0;

    /* renamed from: d0, reason: collision with root package name */
    private String f37993d0;

    /* renamed from: e0, reason: collision with root package name */
    private String f37994e0;

    /* renamed from: f0, reason: collision with root package name */
    private float f37995f0;

    /* renamed from: g0, reason: collision with root package name */
    private String f37996g0;

    /* renamed from: h0, reason: collision with root package name */
    private float f37997h0;

    /* renamed from: i0, reason: collision with root package name */
    private final float f37998i0;

    /* renamed from: j0, reason: collision with root package name */
    private final int f37999j0;

    /* renamed from: k0, reason: collision with root package name */
    private final int f38000k0;

    /* renamed from: l0, reason: collision with root package name */
    private final int f38001l0;

    /* renamed from: m0, reason: collision with root package name */
    private final int f38002m0;

    /* renamed from: n0, reason: collision with root package name */
    private final int f38003n0;

    /* renamed from: o0, reason: collision with root package name */
    private final int f38004o0;

    /* renamed from: p0, reason: collision with root package name */
    private final int f38005p0;

    /* renamed from: q0, reason: collision with root package name */
    private final float f38006q0;

    /* renamed from: r0, reason: collision with root package name */
    private final float f38007r0;

    /* renamed from: s0, reason: collision with root package name */
    private final int f38008s0;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f38009t0;

    public DonutProgress(Context context) {
        this(context, null);
    }

    private static Bitmap a(Context context, @InterfaceC0578v int i4) {
        Drawable i5 = C0669d.i(context, i4);
        if (i5 == null) {
            return null;
        }
        Canvas canvas = new Canvas();
        Bitmap createBitmap = Bitmap.createBitmap(i5.getIntrinsicWidth(), i5.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        canvas.setBitmap(createBitmap);
        i5.setBounds(0, 0, i5.getIntrinsicWidth(), i5.getIntrinsicHeight());
        i5.draw(canvas);
        return createBitmap;
    }

    private int g(int i4) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode != 1073741824) {
            int i5 = this.f38008s0;
            if (mode == Integer.MIN_VALUE) {
                return Math.min(i5, size);
            }
            return i5;
        }
        return size;
    }

    private float getProgressAngle() {
        return (getProgress() / this.f37985S) * 360.0f;
    }

    protected void b(TypedArray typedArray) {
        this.f37986T = typedArray.getColor(g.n.f47190e, this.f37999j0);
        this.f37987U = typedArray.getColor(g.n.f47204s, this.f38000k0);
        this.f37980N = typedArray.getBoolean(g.n.f47199n, true);
        this.f37978L = typedArray.getResourceId(g.n.f47195j, 0);
        setMax(typedArray.getInt(g.n.f47196k, 100));
        setProgress(typedArray.getFloat(g.n.f47198m, 0.0f));
        this.f37989W = typedArray.getDimension(g.n.f47191f, this.f37998i0);
        this.f37990a0 = typedArray.getDimension(g.n.f47205t, this.f37998i0);
        if (this.f37980N) {
            if (typedArray.getString(g.n.f47197l) != null) {
                this.f37992c0 = typedArray.getString(g.n.f47197l);
            }
            if (typedArray.getString(g.n.f47200o) != null) {
                this.f37993d0 = typedArray.getString(g.n.f47200o);
            }
            if (typedArray.getString(g.n.f47201p) != null) {
                this.f37994e0 = typedArray.getString(g.n.f47201p);
            }
            this.f37982P = typedArray.getColor(g.n.f47202q, this.f38001l0);
            this.f37981O = typedArray.getDimension(g.n.f47203r, this.f38006q0);
            this.f37995f0 = typedArray.getDimension(g.n.f47194i, this.f38007r0);
            this.f37983Q = typedArray.getColor(g.n.f47193h, this.f38002m0);
            this.f37996g0 = typedArray.getString(g.n.f47192g);
        }
        this.f37995f0 = typedArray.getDimension(g.n.f47194i, this.f38007r0);
        this.f37983Q = typedArray.getColor(g.n.f47193h, this.f38002m0);
        this.f37996g0 = typedArray.getString(g.n.f47192g);
        this.f37988V = typedArray.getInt(g.n.f47188c, 0);
        this.f37991b0 = typedArray.getColor(g.n.f47187b, 0);
    }

    protected void c() {
        d(getContext());
    }

    protected void d(Context context) {
        int i4 = this.f37978L;
        if (i4 != 0) {
            this.f37979M = a(context, i4);
        }
    }

    protected void e() {
        if (this.f37980N) {
            TextPaint textPaint = new TextPaint();
            this.f37974H = textPaint;
            textPaint.setColor(this.f37982P);
            this.f37974H.setTextSize(this.f37981O);
            this.f37974H.setAntiAlias(true);
            TextPaint textPaint2 = new TextPaint();
            this.f37975I = textPaint2;
            textPaint2.setColor(this.f37983Q);
            this.f37975I.setTextSize(this.f37995f0);
            this.f37975I.setAntiAlias(true);
        }
        Paint paint = new Paint();
        this.f37971E = paint;
        paint.setColor(this.f37986T);
        Paint paint2 = this.f37971E;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f37971E.setAntiAlias(true);
        this.f37971E.setStrokeWidth(this.f37989W);
        Paint paint3 = new Paint();
        this.f37972F = paint3;
        paint3.setColor(this.f37987U);
        this.f37972F.setStyle(style);
        this.f37972F.setAntiAlias(true);
        this.f37972F.setStrokeWidth(this.f37990a0);
        Paint paint4 = new Paint();
        this.f37973G = paint4;
        paint4.setColor(this.f37991b0);
        this.f37973G.setAntiAlias(true);
    }

    public boolean f() {
        return this.f37980N;
    }

    public int getAttributeResourceId() {
        return this.f37978L;
    }

    public int getFinishedStrokeColor() {
        return this.f37986T;
    }

    public float getFinishedStrokeWidth() {
        return this.f37989W;
    }

    public int getInnerBackgroundColor() {
        return this.f37991b0;
    }

    public String getInnerBottomText() {
        return this.f37996g0;
    }

    public int getInnerBottomTextColor() {
        return this.f37983Q;
    }

    public float getInnerBottomTextSize() {
        return this.f37995f0;
    }

    public int getMax() {
        return this.f37985S;
    }

    public String getPrefixText() {
        return this.f37992c0;
    }

    public float getProgress() {
        return this.f37984R;
    }

    public int getStartingDegree() {
        return this.f37988V;
    }

    public String getSuffixText() {
        return this.f37993d0;
    }

    public String getText() {
        return this.f37994e0;
    }

    public int getTextColor() {
        return this.f37982P;
    }

    public float getTextSize() {
        return this.f37981O;
    }

    public int getUnfinishedStrokeColor() {
        return this.f37987U;
    }

    public float getUnfinishedStrokeWidth() {
        return this.f37990a0;
    }

    @Override // android.view.View
    public void invalidate() {
        e();
        super.invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float max = Math.max(this.f37989W, this.f37990a0);
        this.f37976J.set(max, max, getWidth() - max, getHeight() - max);
        this.f37977K.set(max, max, getWidth() - max, getHeight() - max);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, ((getWidth() - Math.min(this.f37989W, this.f37990a0)) + Math.abs(this.f37989W - this.f37990a0)) / 2.0f, this.f37973G);
        if (!this.f38009t0) {
            canvas.drawArc(this.f37976J, -(360.0f - getStartingDegree()), -getProgressAngle(), false, this.f37971E);
            canvas.drawArc(this.f37977K, (-(360.0f - getStartingDegree())) - getProgressAngle(), -(360.0f - getProgressAngle()), false, this.f37972F);
        } else {
            canvas.drawArc(this.f37976J, getStartingDegree(), getProgressAngle(), false, this.f37971E);
            canvas.drawArc(this.f37977K, getProgressAngle() + getStartingDegree(), 360.0f - getProgressAngle(), false, this.f37972F);
        }
        if (this.f37980N) {
            String str = this.f37994e0;
            if (str == null) {
                str = this.f37992c0 + this.f37984R + this.f37993d0;
            }
            if (!TextUtils.isEmpty(str)) {
                canvas.drawText(str, (getWidth() - this.f37974H.measureText(str)) / 2.0f, (getWidth() - (this.f37974H.descent() + this.f37974H.ascent())) / 2.0f, this.f37974H);
            }
            if (!TextUtils.isEmpty(getInnerBottomText())) {
                this.f37975I.setTextSize(this.f37995f0);
                canvas.drawText(getInnerBottomText(), (getWidth() - this.f37975I.measureText(getInnerBottomText())) / 2.0f, (getHeight() - this.f37997h0) - ((this.f37974H.descent() + this.f37974H.ascent()) / 2.0f), this.f37975I);
            }
        }
        Bitmap bitmap = this.f37979M;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (getWidth() - this.f37979M.getWidth()) / 2.0f, (getHeight() - this.f37979M.getHeight()) / 2.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        setMeasuredDimension(g(i4), g(i5));
        this.f37997h0 = getHeight() - ((getHeight() * 3) / 4);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f37982P = bundle.getInt(f37966v0);
            this.f37981O = bundle.getFloat(f37967w0);
            this.f37995f0 = bundle.getFloat(f37969y0);
            this.f37996g0 = bundle.getString(f37970z0);
            this.f37983Q = bundle.getInt(f37953A0);
            this.f37986T = bundle.getInt(f37954B0);
            this.f37987U = bundle.getInt(f37955C0);
            this.f37989W = bundle.getFloat(f37960H0);
            this.f37990a0 = bundle.getFloat(f37961I0);
            this.f37991b0 = bundle.getInt(f37962J0);
            this.f37978L = bundle.getInt(f37964L0);
            c();
            e();
            setMax(bundle.getInt(f37956D0));
            setStartingDegree(bundle.getInt(f37963K0));
            setProgress(bundle.getFloat("progress"));
            this.f37992c0 = bundle.getString(f37959G0);
            this.f37993d0 = bundle.getString(f37958F0);
            this.f37994e0 = bundle.getString(f37968x0);
            super.onRestoreInstanceState(bundle.getParcelable(f37965u0));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(f37965u0, super.onSaveInstanceState());
        bundle.putInt(f37966v0, getTextColor());
        bundle.putFloat(f37967w0, getTextSize());
        bundle.putFloat(f37969y0, getInnerBottomTextSize());
        bundle.putFloat(f37953A0, getInnerBottomTextColor());
        bundle.putString(f37970z0, getInnerBottomText());
        bundle.putInt(f37953A0, getInnerBottomTextColor());
        bundle.putInt(f37954B0, getFinishedStrokeColor());
        bundle.putInt(f37955C0, getUnfinishedStrokeColor());
        bundle.putInt(f37956D0, getMax());
        bundle.putInt(f37963K0, getStartingDegree());
        bundle.putFloat("progress", getProgress());
        bundle.putString(f37958F0, getSuffixText());
        bundle.putString(f37959G0, getPrefixText());
        bundle.putString(f37968x0, getText());
        bundle.putFloat(f37960H0, getFinishedStrokeWidth());
        bundle.putFloat(f37961I0, getUnfinishedStrokeWidth());
        bundle.putInt(f37962J0, getInnerBackgroundColor());
        bundle.putInt(f37964L0, getAttributeResourceId());
        return bundle;
    }

    public void setAttributeResourceId(int i4) {
        this.f37978L = i4;
        c();
        invalidate();
    }

    public void setDonut_progress(String str) {
        if (!TextUtils.isEmpty(str)) {
            setProgress(Integer.parseInt(str));
        }
    }

    public void setFinishedStrokeColor(int i4) {
        this.f37986T = i4;
        invalidate();
    }

    public void setFinishedStrokeWidth(float f4) {
        this.f37989W = f4;
        invalidate();
    }

    public void setInnerBackgroundColor(int i4) {
        this.f37991b0 = i4;
        invalidate();
    }

    public void setInnerBottomText(String str) {
        this.f37996g0 = str;
        invalidate();
    }

    public void setInnerBottomTextColor(int i4) {
        this.f37983Q = i4;
        invalidate();
    }

    public void setInnerBottomTextSize(float f4) {
        this.f37995f0 = f4;
        invalidate();
    }

    public void setMax(int i4) {
        if (i4 > 0) {
            this.f37985S = i4;
            invalidate();
        }
    }

    public void setPrefixText(String str) {
        this.f37992c0 = str;
        invalidate();
    }

    public void setProgress(float f4) {
        this.f37984R = f4;
        if (f4 > getMax()) {
            this.f37984R %= getMax();
        }
        invalidate();
    }

    public void setShowText(boolean z3) {
        this.f37980N = z3;
    }

    public void setStartingDegree(int i4) {
        this.f37988V = i4;
        invalidate();
    }

    public void setSuffixText(String str) {
        this.f37993d0 = str;
        invalidate();
    }

    public void setText(String str) {
        this.f37994e0 = str;
        invalidate();
    }

    public void setTextColor(int i4) {
        this.f37982P = i4;
        invalidate();
    }

    public void setTextSize(float f4) {
        this.f37981O = f4;
        invalidate();
    }

    public void setUnfinishedStrokeColor(int i4) {
        this.f37987U = i4;
        invalidate();
    }

    public void setUnfinishedStrokeWidth(float f4) {
        this.f37990a0 = f4;
        invalidate();
    }

    public DonutProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DonutProgress(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f37976J = new RectF();
        this.f37977K = new RectF();
        this.f37978L = 0;
        this.f37984R = 0.0f;
        this.f37992c0 = "";
        this.f37993d0 = "%";
        this.f37994e0 = null;
        this.f37999j0 = Color.rgb(66, 145, 241);
        this.f38000k0 = Color.rgb(a.c.f43512e, a.c.f43512e, a.c.f43512e);
        this.f38001l0 = Color.rgb(66, 145, 241);
        this.f38002m0 = Color.rgb(66, 145, 241);
        this.f38003n0 = 0;
        this.f38004o0 = 100;
        this.f38005p0 = 0;
        this.f38006q0 = k.h(18.0f);
        this.f38008s0 = k.b(100.0f);
        this.f37998i0 = k.b(10.0f);
        this.f38007r0 = k.h(18.0f);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, g.n.f47186a, i4, 0);
        b(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        d(context);
        e();
    }
}
