package androidx.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* loaded from: classes.dex */
class A<T> extends Property<T, Float> {

    /* renamed from: a, reason: collision with root package name */
    private final Property<T, PointF> f18598a;

    /* renamed from: b, reason: collision with root package name */
    private final PathMeasure f18599b;

    /* renamed from: c, reason: collision with root package name */
    private final float f18600c;

    /* renamed from: d, reason: collision with root package name */
    private final float[] f18601d;

    /* renamed from: e, reason: collision with root package name */
    private final PointF f18602e;

    /* renamed from: f, reason: collision with root package name */
    private float f18603f;

    A(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f18601d = new float[2];
        this.f18602e = new PointF();
        this.f18598a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f18599b = pathMeasure;
        this.f18600c = pathMeasure.getLength();
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(T t3) {
        return Float.valueOf(this.f18603f);
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(T t3, Float f4) {
        this.f18603f = f4.floatValue();
        this.f18599b.getPosTan(this.f18600c * f4.floatValue(), this.f18601d, null);
        PointF pointF = this.f18602e;
        float[] fArr = this.f18601d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f18598a.set(t3, pointF);
    }
}
