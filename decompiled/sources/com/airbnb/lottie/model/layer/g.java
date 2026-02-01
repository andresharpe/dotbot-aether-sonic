package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.P;
import com.airbnb.lottie.animation.keyframe.q;
import com.airbnb.lottie.j;
import com.airbnb.lottie.o;

/* loaded from: classes.dex */
public class g extends b {

    /* renamed from: F, reason: collision with root package name */
    private final RectF f21780F;

    /* renamed from: G, reason: collision with root package name */
    private final Paint f21781G;

    /* renamed from: H, reason: collision with root package name */
    private final float[] f21782H;

    /* renamed from: I, reason: collision with root package name */
    private final Path f21783I;

    /* renamed from: J, reason: collision with root package name */
    private final Layer f21784J;

    /* renamed from: K, reason: collision with root package name */
    @P
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> f21785K;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(j jVar, Layer layer) {
        super(jVar, layer);
        this.f21780F = new RectF();
        com.airbnb.lottie.animation.a aVar = new com.airbnb.lottie.animation.a();
        this.f21781G = aVar;
        this.f21782H = new float[8];
        this.f21783I = new Path();
        this.f21784J = layer;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(layer.o());
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void d(RectF rectF, Matrix matrix, boolean z3) {
        super.d(rectF, matrix, z3);
        this.f21780F.set(0.0f, 0.0f, this.f21784J.q(), this.f21784J.p());
        this.f21749m.mapRect(this.f21780F);
        rectF.set(this.f21780F);
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.e
    public <T> void h(T t3, @P com.airbnb.lottie.value.j<T> jVar) {
        super.h(t3, jVar);
        if (t3 == o.f21823K) {
            if (jVar == null) {
                this.f21785K = null;
            } else {
                this.f21785K = new q(jVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void t(Canvas canvas, Matrix matrix, int i4) {
        int intValue;
        int alpha = Color.alpha(this.f21784J.o());
        if (alpha == 0) {
            return;
        }
        if (this.f21758v.h() == null) {
            intValue = 100;
        } else {
            intValue = this.f21758v.h().h().intValue();
        }
        int i5 = (int) ((i4 / 255.0f) * (((alpha / 255.0f) * intValue) / 100.0f) * 255.0f);
        this.f21781G.setAlpha(i5);
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f21785K;
        if (aVar != null) {
            this.f21781G.setColorFilter(aVar.h());
        }
        if (i5 > 0) {
            float[] fArr = this.f21782H;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.f21784J.q();
            float[] fArr2 = this.f21782H;
            fArr2[3] = 0.0f;
            fArr2[4] = this.f21784J.q();
            this.f21782H[5] = this.f21784J.p();
            float[] fArr3 = this.f21782H;
            fArr3[6] = 0.0f;
            fArr3[7] = this.f21784J.p();
            matrix.mapPoints(this.f21782H);
            this.f21783I.reset();
            Path path = this.f21783I;
            float[] fArr4 = this.f21782H;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.f21783I;
            float[] fArr5 = this.f21782H;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.f21783I;
            float[] fArr6 = this.f21782H;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.f21783I;
            float[] fArr7 = this.f21782H;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.f21783I;
            float[] fArr8 = this.f21782H;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.f21783I.close();
            canvas.drawPath(this.f21783I, this.f21781G);
        }
    }
}
