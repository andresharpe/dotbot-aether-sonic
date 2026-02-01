package com.google.android.material.circularreveal;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.core.view.C0823k0;
import b1.C1003a;
import com.google.android.material.circularreveal.g;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.InterfaceMenuC2377a;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: k, reason: collision with root package name */
    private static final boolean f31895k = false;

    /* renamed from: l, reason: collision with root package name */
    public static final int f31896l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f31897m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f31898n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f31899o = 2;

    /* renamed from: a, reason: collision with root package name */
    private final a f31900a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final View f31901b;

    /* renamed from: c, reason: collision with root package name */
    @N
    private final Path f31902c;

    /* renamed from: d, reason: collision with root package name */
    @N
    private final Paint f31903d;

    /* renamed from: e, reason: collision with root package name */
    @N
    private final Paint f31904e;

    /* renamed from: f, reason: collision with root package name */
    @P
    private g.e f31905f;

    /* renamed from: g, reason: collision with root package name */
    @P
    private Drawable f31906g;

    /* renamed from: h, reason: collision with root package name */
    private Paint f31907h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f31908i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f31909j;

    /* loaded from: classes2.dex */
    public interface a {
        void c(Canvas canvas);

        boolean d();
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface b {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(a aVar) {
        this.f31900a = aVar;
        View view = (View) aVar;
        this.f31901b = view;
        view.setWillNotDraw(false);
        this.f31902c = new Path();
        this.f31903d = new Paint(7);
        Paint paint = new Paint(1);
        this.f31904e = paint;
        paint.setColor(0);
    }

    private void d(@N Canvas canvas, int i4, float f4) {
        this.f31907h.setColor(i4);
        this.f31907h.setStrokeWidth(f4);
        g.e eVar = this.f31905f;
        canvas.drawCircle(eVar.f31917a, eVar.f31918b, eVar.f31919c - (f4 / 2.0f), this.f31907h);
    }

    private void e(@N Canvas canvas) {
        this.f31900a.c(canvas);
        if (r()) {
            g.e eVar = this.f31905f;
            canvas.drawCircle(eVar.f31917a, eVar.f31918b, eVar.f31919c, this.f31904e);
        }
        if (p()) {
            d(canvas, C0823k0.f13589t, 10.0f);
            d(canvas, InterfaceMenuC2377a.f55290c, 5.0f);
        }
        f(canvas);
    }

    private void f(@N Canvas canvas) {
        if (q()) {
            Rect bounds = this.f31906g.getBounds();
            float width = this.f31905f.f31917a - (bounds.width() / 2.0f);
            float height = this.f31905f.f31918b - (bounds.height() / 2.0f);
            canvas.translate(width, height);
            this.f31906g.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    private float i(@N g.e eVar) {
        return C1003a.b(eVar.f31917a, eVar.f31918b, 0.0f, 0.0f, this.f31901b.getWidth(), this.f31901b.getHeight());
    }

    private void k() {
        if (f31899o == 1) {
            this.f31902c.rewind();
            g.e eVar = this.f31905f;
            if (eVar != null) {
                this.f31902c.addCircle(eVar.f31917a, eVar.f31918b, eVar.f31919c, Path.Direction.CW);
            }
        }
        this.f31901b.invalidate();
    }

    private boolean p() {
        boolean z3;
        g.e eVar = this.f31905f;
        if (eVar != null && !eVar.a()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (f31899o == 0) {
            if (z3 || !this.f31909j) {
                return false;
            }
            return true;
        }
        return !z3;
    }

    private boolean q() {
        if (!this.f31908i && this.f31906g != null && this.f31905f != null) {
            return true;
        }
        return false;
    }

    private boolean r() {
        if (!this.f31908i && Color.alpha(this.f31904e.getColor()) != 0) {
            return true;
        }
        return false;
    }

    public void a() {
        if (f31899o == 0) {
            this.f31908i = true;
            this.f31909j = false;
            this.f31901b.buildDrawingCache();
            Bitmap drawingCache = this.f31901b.getDrawingCache();
            if (drawingCache == null && this.f31901b.getWidth() != 0 && this.f31901b.getHeight() != 0) {
                drawingCache = Bitmap.createBitmap(this.f31901b.getWidth(), this.f31901b.getHeight(), Bitmap.Config.ARGB_8888);
                this.f31901b.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.f31903d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.f31908i = false;
            this.f31909j = true;
        }
    }

    public void b() {
        if (f31899o == 0) {
            this.f31909j = false;
            this.f31901b.destroyDrawingCache();
            this.f31903d.setShader(null);
            this.f31901b.invalidate();
        }
    }

    public void c(@N Canvas canvas) {
        if (p()) {
            int i4 = f31899o;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        this.f31900a.c(canvas);
                        if (r()) {
                            canvas.drawRect(0.0f, 0.0f, this.f31901b.getWidth(), this.f31901b.getHeight(), this.f31904e);
                        }
                    } else {
                        throw new IllegalStateException("Unsupported strategy " + i4);
                    }
                } else {
                    int save = canvas.save();
                    canvas.clipPath(this.f31902c);
                    this.f31900a.c(canvas);
                    if (r()) {
                        canvas.drawRect(0.0f, 0.0f, this.f31901b.getWidth(), this.f31901b.getHeight(), this.f31904e);
                    }
                    canvas.restoreToCount(save);
                }
            } else {
                g.e eVar = this.f31905f;
                canvas.drawCircle(eVar.f31917a, eVar.f31918b, eVar.f31919c, this.f31903d);
                if (r()) {
                    g.e eVar2 = this.f31905f;
                    canvas.drawCircle(eVar2.f31917a, eVar2.f31918b, eVar2.f31919c, this.f31904e);
                }
            }
        } else {
            this.f31900a.c(canvas);
            if (r()) {
                canvas.drawRect(0.0f, 0.0f, this.f31901b.getWidth(), this.f31901b.getHeight(), this.f31904e);
            }
        }
        f(canvas);
    }

    @P
    public Drawable g() {
        return this.f31906g;
    }

    @InterfaceC0569l
    public int h() {
        return this.f31904e.getColor();
    }

    @P
    public g.e j() {
        g.e eVar = this.f31905f;
        if (eVar == null) {
            return null;
        }
        g.e eVar2 = new g.e(eVar);
        if (eVar2.a()) {
            eVar2.f31919c = i(eVar2);
        }
        return eVar2;
    }

    public boolean l() {
        if (this.f31900a.d() && !p()) {
            return true;
        }
        return false;
    }

    public void m(@P Drawable drawable) {
        this.f31906g = drawable;
        this.f31901b.invalidate();
    }

    public void n(@InterfaceC0569l int i4) {
        this.f31904e.setColor(i4);
        this.f31901b.invalidate();
    }

    public void o(@P g.e eVar) {
        if (eVar == null) {
            this.f31905f = null;
        } else {
            g.e eVar2 = this.f31905f;
            if (eVar2 == null) {
                this.f31905f = new g.e(eVar);
            } else {
                eVar2.c(eVar);
            }
            if (C1003a.e(eVar.f31919c, i(eVar), 1.0E-4f)) {
                this.f31905f.f31919c = Float.MAX_VALUE;
            }
        }
        k();
    }
}
