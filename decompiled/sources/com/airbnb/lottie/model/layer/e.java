package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.j;

/* loaded from: classes.dex */
public class e extends b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public e(j jVar, Layer layer) {
        super(jVar, layer);
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void d(RectF rectF, Matrix matrix, boolean z3) {
        super.d(rectF, matrix, z3);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // com.airbnb.lottie.model.layer.b
    void t(Canvas canvas, Matrix matrix, int i4) {
    }
}
