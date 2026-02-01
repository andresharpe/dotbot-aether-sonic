package com.google.android.material.animation;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import androidx.annotation.N;

/* loaded from: classes2.dex */
public class f extends Property<ImageView, Matrix> {

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f31216a;

    public f() {
        super(Matrix.class, "imageMatrixProperty");
        this.f31216a = new Matrix();
    }

    @Override // android.util.Property
    @N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix get(@N ImageView imageView) {
        this.f31216a.set(imageView.getImageMatrix());
        return this.f31216a;
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(@N ImageView imageView, @N Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
