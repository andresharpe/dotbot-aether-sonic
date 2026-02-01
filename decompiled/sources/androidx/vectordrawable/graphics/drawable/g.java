package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.n;
import androidx.core.graphics.J;
import org.xmlpull.v1.XmlPullParser;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class g implements Interpolator {

    /* renamed from: c, reason: collision with root package name */
    private static final float f20306c = 0.002f;

    /* renamed from: d, reason: collision with root package name */
    public static final int f20307d = 3000;

    /* renamed from: e, reason: collision with root package name */
    public static final double f20308e = 1.0E-5d;

    /* renamed from: a, reason: collision with root package name */
    private float[] f20309a;

    /* renamed from: b, reason: collision with root package name */
    private float[] f20310b;

    public g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    private void a(float f4, float f5, float f6, float f7) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f4, f5, f6, f7, 1.0f, 1.0f);
        b(path);
    }

    private void b(Path path) {
        int i4 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(f20307d, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f20309a = new float[min];
            this.f20310b = new float[min];
            float[] fArr = new float[2];
            for (int i5 = 0; i5 < min; i5++) {
                pathMeasure.getPosTan((i5 * length) / (min - 1), fArr, null);
                this.f20309a[i5] = fArr[0];
                this.f20310b[i5] = fArr[1];
            }
            if (Math.abs(this.f20309a[0]) <= 1.0E-5d && Math.abs(this.f20310b[0]) <= 1.0E-5d) {
                int i6 = min - 1;
                if (Math.abs(this.f20309a[i6] - 1.0f) <= 1.0E-5d && Math.abs(this.f20310b[i6] - 1.0f) <= 1.0E-5d) {
                    float f4 = 0.0f;
                    int i7 = 0;
                    while (i4 < min) {
                        float[] fArr2 = this.f20309a;
                        int i8 = i7 + 1;
                        float f5 = fArr2[i7];
                        if (f5 >= f4) {
                            fArr2[i4] = f5;
                            i4++;
                            f4 = f5;
                            i7 = i8;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f5);
                        }
                    }
                    if (!pathMeasure.nextContour()) {
                        return;
                    } else {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The Path must start at (0,0) and end at (1,1) start: ");
            sb.append(this.f20309a[0]);
            sb.append(",");
            sb.append(this.f20310b[0]);
            sb.append(" end:");
            int i9 = min - 1;
            sb.append(this.f20309a[i9]);
            sb.append(",");
            sb.append(this.f20310b[i9]);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }

    private void c(float f4, float f5) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f4, f5, 1.0f, 1.0f);
        b(path);
    }

    private void d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (n.r(xmlPullParser, "pathData")) {
            String m4 = n.m(typedArray, xmlPullParser, "pathData", 4);
            Path e4 = J.e(m4);
            if (e4 != null) {
                b(e4);
                return;
            }
            throw new InflateException("The path is null, which is created from " + m4);
        }
        if (n.r(xmlPullParser, "controlX1")) {
            if (n.r(xmlPullParser, "controlY1")) {
                float j4 = n.j(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
                float j5 = n.j(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
                boolean r4 = n.r(xmlPullParser, "controlX2");
                if (r4 == n.r(xmlPullParser, "controlY2")) {
                    if (!r4) {
                        c(j4, j5);
                        return;
                    } else {
                        a(j4, j5, n.j(typedArray, xmlPullParser, "controlX2", 2, 0.0f), n.j(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
                        return;
                    }
                }
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            }
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        throw new InflateException("pathInterpolator requires the controlX1 attribute");
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f4) {
        if (f4 <= 0.0f) {
            return 0.0f;
        }
        if (f4 >= 1.0f) {
            return 1.0f;
        }
        int length = this.f20309a.length - 1;
        int i4 = 0;
        while (length - i4 > 1) {
            int i5 = (i4 + length) / 2;
            if (f4 < this.f20309a[i5]) {
                length = i5;
            } else {
                i4 = i5;
            }
        }
        float[] fArr = this.f20309a;
        float f5 = fArr[length];
        float f6 = fArr[i4];
        float f7 = f5 - f6;
        if (f7 == 0.0f) {
            return this.f20310b[i4];
        }
        float f8 = (f4 - f6) / f7;
        float[] fArr2 = this.f20310b;
        float f9 = fArr2[i4];
        return f9 + (f8 * (fArr2[length] - f9));
    }

    public g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray s4 = n.s(resources, theme, attributeSet, a.f20257r0);
        d(s4, xmlPullParser);
        s4.recycle();
    }
}
