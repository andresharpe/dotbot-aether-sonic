package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class B extends AbstractC0991z {

    /* renamed from: a, reason: collision with root package name */
    private Path f18604a;

    /* renamed from: b, reason: collision with root package name */
    private final Path f18605b;

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f18606c;

    public B() {
        Path path = new Path();
        this.f18605b = path;
        this.f18606c = new Matrix();
        path.lineTo(1.0f, 0.0f);
        this.f18604a = path;
    }

    private static float b(float f4, float f5) {
        return (float) Math.sqrt((f4 * f4) + (f5 * f5));
    }

    @Override // androidx.transition.AbstractC0991z
    @androidx.annotation.N
    public Path a(float f4, float f5, float f6, float f7) {
        float f8 = f6 - f4;
        float f9 = f7 - f5;
        float b4 = b(f8, f9);
        double atan2 = Math.atan2(f9, f8);
        this.f18606c.setScale(b4, b4);
        this.f18606c.postRotate((float) Math.toDegrees(atan2));
        this.f18606c.postTranslate(f4, f5);
        Path path = new Path();
        this.f18605b.transform(this.f18606c, path);
        return path;
    }

    public Path c() {
        return this.f18604a;
    }

    public void d(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f4 = fArr[0];
        float f5 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f6 = fArr[0];
        float f7 = fArr[1];
        if (f6 == f4 && f7 == f5) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f18606c.setTranslate(-f6, -f7);
        float f8 = f4 - f6;
        float f9 = f5 - f7;
        float b4 = 1.0f / b(f8, f9);
        this.f18606c.postScale(b4, b4);
        this.f18606c.postRotate((float) Math.toDegrees(-Math.atan2(f9, f8)));
        path.transform(this.f18606c, this.f18605b);
        this.f18604a = path;
    }

    @SuppressLint({"RestrictedApi"})
    public B(@androidx.annotation.N Context context, @androidx.annotation.N AttributeSet attributeSet) {
        this.f18605b = new Path();
        this.f18606c = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I.f19845k);
        try {
            String m4 = androidx.core.content.res.n.m(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (m4 != null) {
                d(androidx.core.graphics.J.e(m4));
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public B(Path path) {
        this.f18605b = new Path();
        this.f18606c = new Matrix();
        d(path);
    }
}
