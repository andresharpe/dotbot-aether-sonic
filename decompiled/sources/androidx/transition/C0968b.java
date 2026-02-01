package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.transition.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0968b extends AbstractC0991z {

    /* renamed from: g, reason: collision with root package name */
    private static final float f19979g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    private static final float f19980h = 70.0f;

    /* renamed from: i, reason: collision with root package name */
    private static final float f19981i = (float) Math.tan(Math.toRadians(35.0d));

    /* renamed from: a, reason: collision with root package name */
    private float f19982a;

    /* renamed from: b, reason: collision with root package name */
    private float f19983b;

    /* renamed from: c, reason: collision with root package name */
    private float f19984c;

    /* renamed from: d, reason: collision with root package name */
    private float f19985d;

    /* renamed from: e, reason: collision with root package name */
    private float f19986e;

    /* renamed from: f, reason: collision with root package name */
    private float f19987f;

    public C0968b() {
        this.f19982a = 0.0f;
        this.f19983b = 0.0f;
        this.f19984c = f19980h;
        this.f19985d = 0.0f;
        this.f19986e = 0.0f;
        this.f19987f = f19981i;
    }

    private static float h(float f4) {
        if (f4 >= 0.0f && f4 <= 90.0f) {
            return (float) Math.tan(Math.toRadians(f4 / 2.0f));
        }
        throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
    }

    @Override // androidx.transition.AbstractC0991z
    @androidx.annotation.N
    public Path a(float f4, float f5, float f6, float f7) {
        boolean z3;
        float f8;
        float f9;
        float f10;
        Path path = new Path();
        path.moveTo(f4, f5);
        float f11 = f6 - f4;
        float f12 = f7 - f5;
        float f13 = (f11 * f11) + (f12 * f12);
        float f14 = (f4 + f6) / 2.0f;
        float f15 = (f5 + f7) / 2.0f;
        float f16 = 0.25f * f13;
        if (f5 > f7) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (Math.abs(f11) < Math.abs(f12)) {
            float abs = Math.abs(f13 / (f12 * 2.0f));
            if (z3) {
                f9 = abs + f7;
                f8 = f6;
            } else {
                f9 = abs + f5;
                f8 = f4;
            }
            f10 = this.f19986e;
        } else {
            float f17 = f13 / (f11 * 2.0f);
            if (z3) {
                f9 = f5;
                f8 = f17 + f4;
            } else {
                f8 = f6 - f17;
                f9 = f7;
            }
            f10 = this.f19985d;
        }
        float f18 = f16 * f10 * f10;
        float f19 = f14 - f8;
        float f20 = f15 - f9;
        float f21 = (f19 * f19) + (f20 * f20);
        float f22 = this.f19987f;
        float f23 = f16 * f22 * f22;
        if (f21 >= f18) {
            if (f21 > f23) {
                f18 = f23;
            } else {
                f18 = 0.0f;
            }
        }
        if (f18 != 0.0f) {
            float sqrt = (float) Math.sqrt(f18 / f21);
            f8 = ((f8 - f14) * sqrt) + f14;
            f9 = f15 + (sqrt * (f9 - f15));
        }
        path.cubicTo((f4 + f8) / 2.0f, (f5 + f9) / 2.0f, (f8 + f6) / 2.0f, (f9 + f7) / 2.0f, f6, f7);
        return path;
    }

    public float b() {
        return this.f19984c;
    }

    public float c() {
        return this.f19982a;
    }

    public float d() {
        return this.f19983b;
    }

    public void e(float f4) {
        this.f19984c = f4;
        this.f19987f = h(f4);
    }

    public void f(float f4) {
        this.f19982a = f4;
        this.f19985d = h(f4);
    }

    public void g(float f4) {
        this.f19983b = f4;
        this.f19986e = h(f4);
    }

    @SuppressLint({"RestrictedApi"})
    public C0968b(@androidx.annotation.N Context context, @androidx.annotation.N AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19982a = 0.0f;
        this.f19983b = 0.0f;
        this.f19984c = f19980h;
        this.f19985d = 0.0f;
        this.f19986e = 0.0f;
        this.f19987f = f19981i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I.f19844j);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        g(androidx.core.content.res.n.j(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        f(androidx.core.content.res.n.j(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        e(androidx.core.content.res.n.j(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, f19980h));
        obtainStyledAttributes.recycle();
    }
}
