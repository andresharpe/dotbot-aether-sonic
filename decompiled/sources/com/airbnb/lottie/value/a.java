package com.airbnb.lottie.value;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.P;

/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: q, reason: collision with root package name */
    private static final float f23309q = -3987645.8f;

    /* renamed from: r, reason: collision with root package name */
    private static final int f23310r = 784923401;

    /* renamed from: a, reason: collision with root package name */
    @P
    private final com.airbnb.lottie.g f23311a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final T f23312b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public T f23313c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final Interpolator f23314d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public final Interpolator f23315e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public final Interpolator f23316f;

    /* renamed from: g, reason: collision with root package name */
    public final float f23317g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public Float f23318h;

    /* renamed from: i, reason: collision with root package name */
    private float f23319i;

    /* renamed from: j, reason: collision with root package name */
    private float f23320j;

    /* renamed from: k, reason: collision with root package name */
    private int f23321k;

    /* renamed from: l, reason: collision with root package name */
    private int f23322l;

    /* renamed from: m, reason: collision with root package name */
    private float f23323m;

    /* renamed from: n, reason: collision with root package name */
    private float f23324n;

    /* renamed from: o, reason: collision with root package name */
    public PointF f23325o;

    /* renamed from: p, reason: collision with root package name */
    public PointF f23326p;

    public a(com.airbnb.lottie.g gVar, @P T t3, @P T t4, @P Interpolator interpolator, float f4, @P Float f5) {
        this.f23319i = f23309q;
        this.f23320j = f23309q;
        this.f23321k = f23310r;
        this.f23322l = f23310r;
        this.f23323m = Float.MIN_VALUE;
        this.f23324n = Float.MIN_VALUE;
        this.f23325o = null;
        this.f23326p = null;
        this.f23311a = gVar;
        this.f23312b = t3;
        this.f23313c = t4;
        this.f23314d = interpolator;
        this.f23315e = null;
        this.f23316f = null;
        this.f23317g = f4;
        this.f23318h = f5;
    }

    public boolean a(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        if (f4 >= e() && f4 < b()) {
            return true;
        }
        return false;
    }

    public float b() {
        if (this.f23311a == null) {
            return 1.0f;
        }
        if (this.f23324n == Float.MIN_VALUE) {
            if (this.f23318h == null) {
                this.f23324n = 1.0f;
            } else {
                this.f23324n = e() + ((this.f23318h.floatValue() - this.f23317g) / this.f23311a.e());
            }
        }
        return this.f23324n;
    }

    public float c() {
        if (this.f23320j == f23309q) {
            this.f23320j = ((Float) this.f23313c).floatValue();
        }
        return this.f23320j;
    }

    public int d() {
        if (this.f23322l == f23310r) {
            this.f23322l = ((Integer) this.f23313c).intValue();
        }
        return this.f23322l;
    }

    public float e() {
        com.airbnb.lottie.g gVar = this.f23311a;
        if (gVar == null) {
            return 0.0f;
        }
        if (this.f23323m == Float.MIN_VALUE) {
            this.f23323m = (this.f23317g - gVar.r()) / this.f23311a.e();
        }
        return this.f23323m;
    }

    public float f() {
        if (this.f23319i == f23309q) {
            this.f23319i = ((Float) this.f23312b).floatValue();
        }
        return this.f23319i;
    }

    public int g() {
        if (this.f23321k == f23310r) {
            this.f23321k = ((Integer) this.f23312b).intValue();
        }
        return this.f23321k;
    }

    public boolean h() {
        if (this.f23314d == null && this.f23315e == null && this.f23316f == null) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f23312b + ", endValue=" + this.f23313c + ", startFrame=" + this.f23317g + ", endFrame=" + this.f23318h + ", interpolator=" + this.f23314d + '}';
    }

    public a(com.airbnb.lottie.g gVar, @P T t3, @P T t4, @P Interpolator interpolator, @P Interpolator interpolator2, float f4, @P Float f5) {
        this.f23319i = f23309q;
        this.f23320j = f23309q;
        this.f23321k = f23310r;
        this.f23322l = f23310r;
        this.f23323m = Float.MIN_VALUE;
        this.f23324n = Float.MIN_VALUE;
        this.f23325o = null;
        this.f23326p = null;
        this.f23311a = gVar;
        this.f23312b = t3;
        this.f23313c = t4;
        this.f23314d = null;
        this.f23315e = interpolator;
        this.f23316f = interpolator2;
        this.f23317g = f4;
        this.f23318h = f5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(com.airbnb.lottie.g gVar, @P T t3, @P T t4, @P Interpolator interpolator, @P Interpolator interpolator2, @P Interpolator interpolator3, float f4, @P Float f5) {
        this.f23319i = f23309q;
        this.f23320j = f23309q;
        this.f23321k = f23310r;
        this.f23322l = f23310r;
        this.f23323m = Float.MIN_VALUE;
        this.f23324n = Float.MIN_VALUE;
        this.f23325o = null;
        this.f23326p = null;
        this.f23311a = gVar;
        this.f23312b = t3;
        this.f23313c = t4;
        this.f23314d = interpolator;
        this.f23315e = interpolator2;
        this.f23316f = interpolator3;
        this.f23317g = f4;
        this.f23318h = f5;
    }

    public a(T t3) {
        this.f23319i = f23309q;
        this.f23320j = f23309q;
        this.f23321k = f23310r;
        this.f23322l = f23310r;
        this.f23323m = Float.MIN_VALUE;
        this.f23324n = Float.MIN_VALUE;
        this.f23325o = null;
        this.f23326p = null;
        this.f23311a = null;
        this.f23312b = t3;
        this.f23313c = t3;
        this.f23314d = null;
        this.f23315e = null;
        this.f23316f = null;
        this.f23317g = Float.MIN_VALUE;
        this.f23318h = Float.valueOf(Float.MAX_VALUE);
    }
}
