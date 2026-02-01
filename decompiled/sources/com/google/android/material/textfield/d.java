package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import androidx.annotation.N;
import androidx.annotation.P;

/* loaded from: classes2.dex */
class d extends com.google.android.material.shape.j {

    /* renamed from: i0, reason: collision with root package name */
    @N
    private final Paint f33713i0;

    /* renamed from: j0, reason: collision with root package name */
    @N
    private final RectF f33714j0;

    d() {
        this(null);
    }

    private void T0() {
        this.f33713i0.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f33713i0.setColor(-1);
        this.f33713i0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean P0() {
        return !this.f33714j0.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q0() {
        R0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void R0(float f4, float f5, float f6, float f7) {
        RectF rectF = this.f33714j0;
        if (f4 != rectF.left || f5 != rectF.top || f6 != rectF.right || f7 != rectF.bottom) {
            rectF.set(f4, f5, f6, f7);
            invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S0(@N RectF rectF) {
        R0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.shape.j
    public void s(@N Canvas canvas) {
        if (this.f33714j0.isEmpty()) {
            super.s(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f33714j0);
        } else {
            canvas.clipRect(this.f33714j0, Region.Op.DIFFERENCE);
        }
        super.s(canvas);
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(@P com.google.android.material.shape.o oVar) {
        super(oVar == null ? new com.google.android.material.shape.o() : oVar);
        this.f33713i0 = new Paint(1);
        T0();
        this.f33714j0 = new RectF();
    }
}
