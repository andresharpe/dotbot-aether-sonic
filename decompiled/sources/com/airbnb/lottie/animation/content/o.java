package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.P;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.List;

/* loaded from: classes.dex */
public class o implements n, a.b, k {

    /* renamed from: o, reason: collision with root package name */
    private static final float f21302o = 0.47829f;

    /* renamed from: p, reason: collision with root package name */
    private static final float f21303p = 0.25f;

    /* renamed from: b, reason: collision with root package name */
    private final String f21305b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.j f21306c;

    /* renamed from: d, reason: collision with root package name */
    private final PolystarShape.Type f21307d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f21308e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f21309f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> f21310g;

    /* renamed from: h, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f21311h;

    /* renamed from: i, reason: collision with root package name */
    @P
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f21312i;

    /* renamed from: j, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f21313j;

    /* renamed from: k, reason: collision with root package name */
    @P
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f21314k;

    /* renamed from: l, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f21315l;

    /* renamed from: n, reason: collision with root package name */
    private boolean f21317n;

    /* renamed from: a, reason: collision with root package name */
    private final Path f21304a = new Path();

    /* renamed from: m, reason: collision with root package name */
    private final b f21316m = new b();

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21318a;

        static {
            int[] iArr = new int[PolystarShape.Type.values().length];
            f21318a = iArr;
            try {
                iArr[PolystarShape.Type.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21318a[PolystarShape.Type.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public o(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.b bVar, PolystarShape polystarShape) {
        this.f21306c = jVar;
        this.f21305b = polystarShape.d();
        PolystarShape.Type j4 = polystarShape.j();
        this.f21307d = j4;
        this.f21308e = polystarShape.k();
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a4 = polystarShape.g().a();
        this.f21309f = a4;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a5 = polystarShape.h().a();
        this.f21310g = a5;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a6 = polystarShape.i().a();
        this.f21311h = a6;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a7 = polystarShape.e().a();
        this.f21313j = a7;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a8 = polystarShape.f().a();
        this.f21315l = a8;
        PolystarShape.Type type = PolystarShape.Type.STAR;
        if (j4 == type) {
            this.f21312i = polystarShape.b().a();
            this.f21314k = polystarShape.c().a();
        } else {
            this.f21312i = null;
            this.f21314k = null;
        }
        bVar.i(a4);
        bVar.i(a5);
        bVar.i(a6);
        bVar.i(a7);
        bVar.i(a8);
        if (j4 == type) {
            bVar.i(this.f21312i);
            bVar.i(this.f21314k);
        }
        a4.a(this);
        a5.a(this);
        a6.a(this);
        a7.a(this);
        a8.a(this);
        if (j4 == type) {
            this.f21312i.a(this);
            this.f21314k.a(this);
        }
    }

    private void e() {
        double floatValue;
        int i4;
        double d4;
        double d5;
        double d6;
        int floor = (int) Math.floor(this.f21309f.h().floatValue());
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar = this.f21311h;
        if (aVar == null) {
            floatValue = com.google.firebase.remoteconfig.l.f37524n;
        } else {
            floatValue = aVar.h().floatValue();
        }
        double radians = Math.toRadians(floatValue - 90.0d);
        double d7 = floor;
        float floatValue2 = this.f21315l.h().floatValue() / 100.0f;
        float floatValue3 = this.f21313j.h().floatValue();
        double d8 = floatValue3;
        float cos = (float) (Math.cos(radians) * d8);
        float sin = (float) (Math.sin(radians) * d8);
        this.f21304a.moveTo(cos, sin);
        double d9 = (float) (6.283185307179586d / d7);
        double d10 = radians + d9;
        double ceil = Math.ceil(d7);
        int i5 = 0;
        while (i5 < ceil) {
            float cos2 = (float) (Math.cos(d10) * d8);
            double d11 = ceil;
            float sin2 = (float) (d8 * Math.sin(d10));
            if (floatValue2 != 0.0f) {
                d5 = d8;
                i4 = i5;
                d4 = d10;
                double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                float sin3 = (float) Math.sin(atan2);
                d6 = d9;
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float cos4 = (float) Math.cos(atan22);
                float sin4 = (float) Math.sin(atan22);
                float f4 = floatValue3 * floatValue2 * f21303p;
                this.f21304a.cubicTo(cos - (cos3 * f4), sin - (sin3 * f4), cos2 + (cos4 * f4), sin2 + (f4 * sin4), cos2, sin2);
            } else {
                i4 = i5;
                d4 = d10;
                d5 = d8;
                d6 = d9;
                this.f21304a.lineTo(cos2, sin2);
            }
            d10 = d4 + d6;
            i5 = i4 + 1;
            sin = sin2;
            cos = cos2;
            ceil = d11;
            d8 = d5;
            d9 = d6;
        }
        PointF h4 = this.f21310g.h();
        this.f21304a.offset(h4.x, h4.y);
        this.f21304a.close();
    }

    private void i() {
        double floatValue;
        float f4;
        float f5;
        int i4;
        float f6;
        float f7;
        double d4;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        double d5;
        float f13;
        float f14;
        float f15;
        double d6;
        float f16;
        float f17;
        float f18;
        float f19;
        float floatValue2 = this.f21309f.h().floatValue();
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar = this.f21311h;
        if (aVar == null) {
            floatValue = com.google.firebase.remoteconfig.l.f37524n;
        } else {
            floatValue = aVar.h().floatValue();
        }
        double radians = Math.toRadians(floatValue - 90.0d);
        double d7 = floatValue2;
        float f20 = (float) (6.283185307179586d / d7);
        float f21 = f20 / 2.0f;
        float f22 = floatValue2 - ((int) floatValue2);
        int i5 = (f22 > 0.0f ? 1 : (f22 == 0.0f ? 0 : -1));
        if (i5 != 0) {
            radians += (1.0f - f22) * f21;
        }
        float floatValue3 = this.f21313j.h().floatValue();
        float floatValue4 = this.f21312i.h().floatValue();
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar2 = this.f21314k;
        if (aVar2 != null) {
            f4 = aVar2.h().floatValue() / 100.0f;
        } else {
            f4 = 0.0f;
        }
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar3 = this.f21315l;
        if (aVar3 != null) {
            f5 = aVar3.h().floatValue() / 100.0f;
        } else {
            f5 = 0.0f;
        }
        if (i5 != 0) {
            f9 = ((floatValue3 - floatValue4) * f22) + floatValue4;
            i4 = i5;
            double d8 = f9;
            float cos = (float) (d8 * Math.cos(radians));
            f8 = (float) (d8 * Math.sin(radians));
            this.f21304a.moveTo(cos, f8);
            d4 = radians + ((f20 * f22) / 2.0f);
            f6 = cos;
            f7 = f21;
        } else {
            i4 = i5;
            double d9 = floatValue3;
            float cos2 = (float) (Math.cos(radians) * d9);
            float sin = (float) (d9 * Math.sin(radians));
            this.f21304a.moveTo(cos2, sin);
            f6 = cos2;
            f7 = f21;
            d4 = radians + f7;
            f8 = sin;
            f9 = 0.0f;
        }
        double ceil = Math.ceil(d7) * 2.0d;
        int i6 = 0;
        float f23 = f7;
        float f24 = f6;
        boolean z3 = false;
        while (true) {
            double d10 = i6;
            if (d10 < ceil) {
                if (z3) {
                    f10 = floatValue3;
                } else {
                    f10 = floatValue4;
                }
                if (f9 != 0.0f && d10 == ceil - 2.0d) {
                    f11 = f20;
                    f12 = (f20 * f22) / 2.0f;
                } else {
                    f11 = f20;
                    f12 = f23;
                }
                if (f9 != 0.0f && d10 == ceil - 1.0d) {
                    d5 = d10;
                    f13 = f9;
                } else {
                    d5 = d10;
                    f13 = f9;
                    f9 = f10;
                }
                double d11 = f9;
                double d12 = ceil;
                float cos3 = (float) (d11 * Math.cos(d4));
                float sin2 = (float) (d11 * Math.sin(d4));
                if (f4 == 0.0f && f5 == 0.0f) {
                    this.f21304a.lineTo(cos3, sin2);
                    d6 = d4;
                    f14 = f4;
                    f15 = f5;
                } else {
                    f14 = f4;
                    double atan2 = (float) (Math.atan2(f8, f24) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    f15 = f5;
                    d6 = d4;
                    double atan22 = (float) (Math.atan2(sin2, cos3) - 1.5707963267948966d);
                    float cos5 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    if (z3) {
                        f16 = f14;
                    } else {
                        f16 = f15;
                    }
                    if (z3) {
                        f17 = f15;
                    } else {
                        f17 = f14;
                    }
                    if (z3) {
                        f18 = floatValue4;
                    } else {
                        f18 = floatValue3;
                    }
                    if (z3) {
                        f19 = floatValue3;
                    } else {
                        f19 = floatValue4;
                    }
                    float f25 = f18 * f16 * f21302o;
                    float f26 = cos4 * f25;
                    float f27 = f25 * sin3;
                    float f28 = f19 * f17 * f21302o;
                    float f29 = cos5 * f28;
                    float f30 = f28 * sin4;
                    if (i4 != 0) {
                        if (i6 == 0) {
                            f26 *= f22;
                            f27 *= f22;
                        } else if (d5 == d12 - 1.0d) {
                            f29 *= f22;
                            f30 *= f22;
                        }
                    }
                    this.f21304a.cubicTo(f24 - f26, f8 - f27, cos3 + f29, sin2 + f30, cos3, sin2);
                }
                d4 = d6 + f12;
                z3 = !z3;
                i6++;
                f24 = cos3;
                f8 = sin2;
                f5 = f15;
                f4 = f14;
                f9 = f13;
                f20 = f11;
                ceil = d12;
            } else {
                PointF h4 = this.f21310g.h();
                this.f21304a.offset(h4.x, h4.y);
                this.f21304a.close();
                return;
            }
        }
    }

    private void j() {
        this.f21317n = false;
        this.f21306c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        j();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            c cVar = list.get(i4);
            if (cVar instanceof t) {
                t tVar = (t) cVar;
                if (tVar.j() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f21316m.a(tVar);
                    tVar.c(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void c(com.airbnb.lottie.model.d dVar, int i4, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        com.airbnb.lottie.utils.i.m(dVar, i4, list, dVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path g() {
        if (this.f21317n) {
            return this.f21304a;
        }
        this.f21304a.reset();
        if (this.f21308e) {
            this.f21317n = true;
            return this.f21304a;
        }
        int i4 = a.f21318a[this.f21307d.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                e();
            }
        } else {
            i();
        }
        this.f21304a.close();
        this.f21316m.b(this.f21304a);
        this.f21317n = true;
        return this.f21304a;
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f21305b;
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void h(T t3, @P com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar;
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar2;
        if (t3 == com.airbnb.lottie.o.f21849w) {
            this.f21309f.n(jVar);
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21850x) {
            this.f21311h.n(jVar);
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21840n) {
            this.f21310g.n(jVar);
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21851y && (aVar2 = this.f21312i) != null) {
            aVar2.n(jVar);
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21852z) {
            this.f21313j.n(jVar);
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21813A && (aVar = this.f21314k) != null) {
            aVar.n(jVar);
        } else if (t3 == com.airbnb.lottie.o.f21814B) {
            this.f21315l.n(jVar);
        }
    }
}
