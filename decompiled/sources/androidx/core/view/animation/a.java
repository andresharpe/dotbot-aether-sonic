package androidx.core.view.animation;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
class a implements Interpolator {

    /* renamed from: c, reason: collision with root package name */
    private static final float f13454c = 0.002f;

    /* renamed from: a, reason: collision with root package name */
    private final float[] f13455a;

    /* renamed from: b, reason: collision with root package name */
    private final float[] f13456b;

    a(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i4 = (int) (length / 0.002f);
        int i5 = i4 + 1;
        this.f13455a = new float[i5];
        this.f13456b = new float[i5];
        float[] fArr = new float[2];
        for (int i6 = 0; i6 < i5; i6++) {
            pathMeasure.getPosTan((i6 * length) / i4, fArr, null);
            this.f13455a[i6] = fArr[0];
            this.f13456b[i6] = fArr[1];
        }
    }

    private static Path a(float f4, float f5, float f6, float f7) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f4, f5, f6, f7, 1.0f, 1.0f);
        return path;
    }

    private static Path b(float f4, float f5) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f4, f5, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f4) {
        if (f4 <= 0.0f) {
            return 0.0f;
        }
        if (f4 >= 1.0f) {
            return 1.0f;
        }
        int length = this.f13455a.length - 1;
        int i4 = 0;
        while (length - i4 > 1) {
            int i5 = (i4 + length) / 2;
            if (f4 < this.f13455a[i5]) {
                length = i5;
            } else {
                i4 = i5;
            }
        }
        float[] fArr = this.f13455a;
        float f5 = fArr[length];
        float f6 = fArr[i4];
        float f7 = f5 - f6;
        if (f7 == 0.0f) {
            return this.f13456b[i4];
        }
        float f8 = (f4 - f6) / f7;
        float[] fArr2 = this.f13456b;
        float f9 = fArr2[i4];
        return f9 + (f8 * (fArr2[length] - f9));
    }

    a(float f4, float f5) {
        this(b(f4, f5));
    }

    a(float f4, float f5, float f6, float f7) {
        this(a(f4, f5, f6, f7));
    }
}
