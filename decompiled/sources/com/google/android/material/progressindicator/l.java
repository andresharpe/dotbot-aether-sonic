package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.N;
import com.google.android.material.color.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class l extends i<p> {

    /* renamed from: c, reason: collision with root package name */
    private float f32963c;

    /* renamed from: d, reason: collision with root package name */
    private float f32964d;

    /* renamed from: e, reason: collision with root package name */
    private float f32965e;

    public l(@N p pVar) {
        super(pVar);
        this.f32963c = 300.0f;
    }

    @Override // com.google.android.material.progressindicator.i
    public void a(@N Canvas canvas, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        Rect clipBounds = canvas.getClipBounds();
        this.f32963c = clipBounds.width();
        float f5 = ((p) this.f32956a).f32892a;
        canvas.translate(clipBounds.left + (clipBounds.width() / 2.0f), clipBounds.top + (clipBounds.height() / 2.0f) + Math.max(0.0f, (clipBounds.height() - ((p) this.f32956a).f32892a) / 2.0f));
        if (((p) this.f32956a).f32999i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f32957b.n() && ((p) this.f32956a).f32896e == 1) || (this.f32957b.m() && ((p) this.f32956a).f32897f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f32957b.n() || this.f32957b.m()) {
            canvas.translate(0.0f, (((p) this.f32956a).f32892a * (f4 - 1.0f)) / 2.0f);
        }
        float f6 = this.f32963c;
        canvas.clipRect((-f6) / 2.0f, (-f5) / 2.0f, f6 / 2.0f, f5 / 2.0f);
        S s4 = this.f32956a;
        this.f32964d = ((p) s4).f32892a * f4;
        this.f32965e = ((p) s4).f32893b * f4;
    }

    @Override // com.google.android.material.progressindicator.i
    public void b(@N Canvas canvas, @N Paint paint, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f4, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f5, @InterfaceC0569l int i4) {
        if (f4 == f5) {
            return;
        }
        float f6 = this.f32963c;
        float f7 = this.f32965e;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i4);
        float f8 = this.f32964d;
        RectF rectF = new RectF(((-f6) / 2.0f) + (f4 * (f6 - (f7 * 2.0f))), (-f8) / 2.0f, ((-f6) / 2.0f) + (f5 * (f6 - (f7 * 2.0f))) + (f7 * 2.0f), f8 / 2.0f);
        float f9 = this.f32965e;
        canvas.drawRoundRect(rectF, f9, f9, paint);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.i
    public void c(@N Canvas canvas, @N Paint paint) {
        int a4 = s.a(((p) this.f32956a).f32895d, this.f32957b.getAlpha());
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(a4);
        float f4 = this.f32963c;
        float f5 = this.f32964d;
        RectF rectF = new RectF((-f4) / 2.0f, (-f5) / 2.0f, f4 / 2.0f, f5 / 2.0f);
        float f6 = this.f32965e;
        canvas.drawRoundRect(rectF, f6, f6, paint);
    }

    @Override // com.google.android.material.progressindicator.i
    public int d() {
        return ((p) this.f32956a).f32892a;
    }

    @Override // com.google.android.material.progressindicator.i
    public int e() {
        return -1;
    }
}
