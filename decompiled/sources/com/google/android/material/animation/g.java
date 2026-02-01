package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import androidx.annotation.N;

/* loaded from: classes2.dex */
public class g implements TypeEvaluator<Matrix> {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f31217a = new float[9];

    /* renamed from: b, reason: collision with root package name */
    private final float[] f31218b = new float[9];

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f31219c = new Matrix();

    @Override // android.animation.TypeEvaluator
    @N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix evaluate(float f4, @N Matrix matrix, @N Matrix matrix2) {
        matrix.getValues(this.f31217a);
        matrix2.getValues(this.f31218b);
        for (int i4 = 0; i4 < 9; i4++) {
            float[] fArr = this.f31218b;
            float f5 = fArr[i4];
            float f6 = this.f31217a[i4];
            fArr[i4] = f6 + ((f5 - f6) * f4);
        }
        this.f31219c.setValues(this.f31218b);
        return this.f31219c;
    }
}
