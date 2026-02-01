package com.google.android.material.transition;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.N;
import androidx.transition.AbstractC0991z;

/* loaded from: classes2.dex */
public final class k extends AbstractC0991z {
    private static PointF b(float f4, float f5, float f6, float f7) {
        if (f5 > f7) {
            return new PointF(f6, f5);
        }
        return new PointF(f4, f7);
    }

    @Override // androidx.transition.AbstractC0991z
    @N
    public Path a(float f4, float f5, float f6, float f7) {
        Path path = new Path();
        path.moveTo(f4, f5);
        PointF b4 = b(f4, f5, f6, f7);
        path.quadTo(b4.x, b4.y, f6, f7);
        return path;
    }
}
