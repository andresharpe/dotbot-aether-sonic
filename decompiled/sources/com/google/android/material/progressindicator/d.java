package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.N;
import com.google.android.material.color.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class d extends i<f> {

    /* renamed from: c, reason: collision with root package name */
    private int f32898c;

    /* renamed from: d, reason: collision with root package name */
    private float f32899d;

    /* renamed from: e, reason: collision with root package name */
    private float f32900e;

    /* renamed from: f, reason: collision with root package name */
    private float f32901f;

    public d(@N f fVar) {
        super(fVar);
        this.f32898c = 1;
    }

    private void h(Canvas canvas, Paint paint, float f4, float f5, float f6) {
        canvas.save();
        canvas.rotate(f6);
        float f7 = this.f32901f;
        float f8 = f4 / 2.0f;
        canvas.drawRoundRect(new RectF(f7 - f8, f5, f7 + f8, -f5), f5, f5, paint);
        canvas.restore();
    }

    private int i() {
        S s4 = this.f32956a;
        return ((f) s4).f32926g + (((f) s4).f32927h * 2);
    }

    @Override // com.google.android.material.progressindicator.i
    public void a(@N Canvas canvas, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        int i4;
        S s4 = this.f32956a;
        float f5 = (((f) s4).f32926g / 2.0f) + ((f) s4).f32927h;
        canvas.translate(f5, f5);
        canvas.rotate(-90.0f);
        float f6 = -f5;
        canvas.clipRect(f6, f6, f5, f5);
        if (((f) this.f32956a).f32928i == 0) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        this.f32898c = i4;
        this.f32899d = ((f) r5).f32892a * f4;
        this.f32900e = ((f) r5).f32893b * f4;
        this.f32901f = (((f) r5).f32926g - ((f) r5).f32892a) / 2.0f;
        if ((this.f32957b.n() && ((f) this.f32956a).f32896e == 2) || (this.f32957b.m() && ((f) this.f32956a).f32897f == 1)) {
            this.f32901f += ((1.0f - f4) * ((f) this.f32956a).f32892a) / 2.0f;
        } else if ((this.f32957b.n() && ((f) this.f32956a).f32896e == 1) || (this.f32957b.m() && ((f) this.f32956a).f32897f == 2)) {
            this.f32901f -= ((1.0f - f4) * ((f) this.f32956a).f32892a) / 2.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.i
    public void b(@N Canvas canvas, @N Paint paint, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f4, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f5, @InterfaceC0569l int i4) {
        float f6;
        if (f4 == f5) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i4);
        paint.setStrokeWidth(this.f32899d);
        int i5 = this.f32898c;
        float f7 = f4 * 360.0f * i5;
        if (f5 >= f4) {
            f6 = f5 - f4;
        } else {
            f6 = (1.0f + f5) - f4;
        }
        float f8 = f6 * 360.0f * i5;
        float f9 = this.f32901f;
        canvas.drawArc(new RectF(-f9, -f9, f9, f9), f7, f8, false, paint);
        if (this.f32900e > 0.0f && Math.abs(f8) < 360.0f) {
            paint.setStyle(Paint.Style.FILL);
            h(canvas, paint, this.f32899d, this.f32900e, f7);
            h(canvas, paint, this.f32899d, this.f32900e, f7 + f8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.i
    public void c(@N Canvas canvas, @N Paint paint) {
        int a4 = s.a(((f) this.f32956a).f32895d, this.f32957b.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(a4);
        paint.setStrokeWidth(this.f32899d);
        float f4 = this.f32901f;
        canvas.drawArc(new RectF(-f4, -f4, f4, f4), 0.0f, 360.0f, false, paint);
    }

    @Override // com.google.android.material.progressindicator.i
    public int d() {
        return i();
    }

    @Override // com.google.android.material.progressindicator.i
    public int e() {
        return i();
    }
}
