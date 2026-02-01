package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.RestrictTo;
import com.google.firebase.remoteconfig.l;
import d.C2042a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class d extends Drawable {

    /* renamed from: m, reason: collision with root package name */
    public static final int f5088m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static final int f5089n = 1;

    /* renamed from: o, reason: collision with root package name */
    public static final int f5090o = 2;

    /* renamed from: p, reason: collision with root package name */
    public static final int f5091p = 3;

    /* renamed from: q, reason: collision with root package name */
    private static final float f5092q = (float) Math.toRadians(45.0d);

    /* renamed from: a, reason: collision with root package name */
    private final Paint f5093a;

    /* renamed from: b, reason: collision with root package name */
    private float f5094b;

    /* renamed from: c, reason: collision with root package name */
    private float f5095c;

    /* renamed from: d, reason: collision with root package name */
    private float f5096d;

    /* renamed from: e, reason: collision with root package name */
    private float f5097e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5098f;

    /* renamed from: g, reason: collision with root package name */
    private final Path f5099g;

    /* renamed from: h, reason: collision with root package name */
    private final int f5100h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f5101i;

    /* renamed from: j, reason: collision with root package name */
    private float f5102j;

    /* renamed from: k, reason: collision with root package name */
    private float f5103k;

    /* renamed from: l, reason: collision with root package name */
    private int f5104l;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface a {
    }

    public d(Context context) {
        Paint paint = new Paint();
        this.f5093a = paint;
        this.f5099g = new Path();
        this.f5101i = false;
        this.f5104l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, C2042a.m.C3, C2042a.b.f49267o1, C2042a.l.f49948v1);
        p(obtainStyledAttributes.getColor(C2042a.m.G3, 0));
        o(obtainStyledAttributes.getDimension(C2042a.m.K3, 0.0f));
        t(obtainStyledAttributes.getBoolean(C2042a.m.J3, true));
        r(Math.round(obtainStyledAttributes.getDimension(C2042a.m.I3, 0.0f)));
        this.f5100h = obtainStyledAttributes.getDimensionPixelSize(C2042a.m.H3, 0);
        this.f5095c = Math.round(obtainStyledAttributes.getDimension(C2042a.m.F3, 0.0f));
        this.f5094b = Math.round(obtainStyledAttributes.getDimension(C2042a.m.D3, 0.0f));
        this.f5096d = obtainStyledAttributes.getDimension(C2042a.m.E3, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private static float k(float f4, float f5, float f6) {
        return f4 + ((f5 - f4) * f6);
    }

    public float a() {
        return this.f5094b;
    }

    public float b() {
        return this.f5096d;
    }

    public float c() {
        return this.f5095c;
    }

    public float d() {
        return this.f5093a.getStrokeWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f4;
        float f5;
        int i4;
        Rect bounds = getBounds();
        int i5 = this.f5104l;
        boolean z3 = false;
        if (i5 != 0 && (i5 == 1 || (i5 == 3 ? androidx.core.graphics.drawable.d.f(this) == 0 : androidx.core.graphics.drawable.d.f(this) == 1))) {
            z3 = true;
        }
        float f6 = this.f5094b;
        float k4 = k(this.f5095c, (float) Math.sqrt(f6 * f6 * 2.0f), this.f5102j);
        float k5 = k(this.f5095c, this.f5096d, this.f5102j);
        float round = Math.round(k(0.0f, this.f5103k, this.f5102j));
        float k6 = k(0.0f, f5092q, this.f5102j);
        if (z3) {
            f4 = 0.0f;
        } else {
            f4 = -180.0f;
        }
        if (z3) {
            f5 = 180.0f;
        } else {
            f5 = 0.0f;
        }
        float k7 = k(f4, f5, this.f5102j);
        double d4 = k4;
        double d5 = k6;
        boolean z4 = z3;
        float round2 = (float) Math.round(Math.cos(d5) * d4);
        float round3 = (float) Math.round(d4 * Math.sin(d5));
        this.f5099g.rewind();
        float k8 = k(this.f5097e + this.f5093a.getStrokeWidth(), -this.f5103k, this.f5102j);
        float f7 = (-k5) / 2.0f;
        this.f5099g.moveTo(f7 + round, 0.0f);
        this.f5099g.rLineTo(k5 - (round * 2.0f), 0.0f);
        this.f5099g.moveTo(f7, k8);
        this.f5099g.rLineTo(round2, round3);
        this.f5099g.moveTo(f7, -k8);
        this.f5099g.rLineTo(round2, -round3);
        this.f5099g.close();
        canvas.save();
        float strokeWidth = this.f5093a.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (height - (2.0f * r5))) / 4) * 2) + (strokeWidth * 1.5f) + this.f5097e);
        if (this.f5098f) {
            if (this.f5101i ^ z4) {
                i4 = -1;
            } else {
                i4 = 1;
            }
            canvas.rotate(k7 * i4);
        } else if (z4) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f5099g, this.f5093a);
        canvas.restore();
    }

    @InterfaceC0569l
    public int e() {
        return this.f5093a.getColor();
    }

    public int f() {
        return this.f5104l;
    }

    public float g() {
        return this.f5097e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f5100h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f5100h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final Paint h() {
        return this.f5093a;
    }

    @InterfaceC0580x(from = l.f37524n, to = 1.0d)
    public float i() {
        return this.f5102j;
    }

    public boolean j() {
        return this.f5098f;
    }

    public void l(float f4) {
        if (this.f5094b != f4) {
            this.f5094b = f4;
            invalidateSelf();
        }
    }

    public void m(float f4) {
        if (this.f5096d != f4) {
            this.f5096d = f4;
            invalidateSelf();
        }
    }

    public void n(float f4) {
        if (this.f5095c != f4) {
            this.f5095c = f4;
            invalidateSelf();
        }
    }

    public void o(float f4) {
        if (this.f5093a.getStrokeWidth() != f4) {
            this.f5093a.setStrokeWidth(f4);
            this.f5103k = (float) ((f4 / 2.0f) * Math.cos(f5092q));
            invalidateSelf();
        }
    }

    public void p(@InterfaceC0569l int i4) {
        if (i4 != this.f5093a.getColor()) {
            this.f5093a.setColor(i4);
            invalidateSelf();
        }
    }

    public void q(int i4) {
        if (i4 != this.f5104l) {
            this.f5104l = i4;
            invalidateSelf();
        }
    }

    public void r(float f4) {
        if (f4 != this.f5097e) {
            this.f5097e = f4;
            invalidateSelf();
        }
    }

    public void s(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        if (this.f5102j != f4) {
            this.f5102j = f4;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        if (i4 != this.f5093a.getAlpha()) {
            this.f5093a.setAlpha(i4);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5093a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void t(boolean z3) {
        if (this.f5098f != z3) {
            this.f5098f = z3;
            invalidateSelf();
        }
    }

    public void u(boolean z3) {
        if (this.f5101i != z3) {
            this.f5101i = z3;
            invalidateSelf();
        }
    }
}
