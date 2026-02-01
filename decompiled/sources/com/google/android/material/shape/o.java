package com.google.android.material.shape;

import T0.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;
import androidx.annotation.d0;

/* loaded from: classes2.dex */
public class o {

    /* renamed from: m, reason: collision with root package name */
    public static final d f33162m = new m(0.5f);

    /* renamed from: a, reason: collision with root package name */
    e f33163a;

    /* renamed from: b, reason: collision with root package name */
    e f33164b;

    /* renamed from: c, reason: collision with root package name */
    e f33165c;

    /* renamed from: d, reason: collision with root package name */
    e f33166d;

    /* renamed from: e, reason: collision with root package name */
    d f33167e;

    /* renamed from: f, reason: collision with root package name */
    d f33168f;

    /* renamed from: g, reason: collision with root package name */
    d f33169g;

    /* renamed from: h, reason: collision with root package name */
    d f33170h;

    /* renamed from: i, reason: collision with root package name */
    g f33171i;

    /* renamed from: j, reason: collision with root package name */
    g f33172j;

    /* renamed from: k, reason: collision with root package name */
    g f33173k;

    /* renamed from: l, reason: collision with root package name */
    g f33174l;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public interface c {
        @N
        d a(@N d dVar);
    }

    @N
    public static b a() {
        return new b();
    }

    @N
    public static b b(Context context, @d0 int i4, @d0 int i5) {
        return c(context, i4, i5, 0);
    }

    @N
    private static b c(Context context, @d0 int i4, @d0 int i5, int i6) {
        return d(context, i4, i5, new com.google.android.material.shape.a(i6));
    }

    @N
    private static b d(Context context, @d0 int i4, @d0 int i5, @N d dVar) {
        if (i5 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i4);
            i4 = i5;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i4, a.o.Zq);
        try {
            int i6 = obtainStyledAttributes.getInt(a.o.ar, 0);
            int i7 = obtainStyledAttributes.getInt(a.o.dr, i6);
            int i8 = obtainStyledAttributes.getInt(a.o.er, i6);
            int i9 = obtainStyledAttributes.getInt(a.o.cr, i6);
            int i10 = obtainStyledAttributes.getInt(a.o.br, i6);
            d m4 = m(obtainStyledAttributes, a.o.fr, dVar);
            d m5 = m(obtainStyledAttributes, a.o.ir, m4);
            d m6 = m(obtainStyledAttributes, a.o.jr, m4);
            d m7 = m(obtainStyledAttributes, a.o.hr, m4);
            return new b().I(i7, m5).N(i8, m6).A(i9, m7).v(i10, m(obtainStyledAttributes, a.o.gr, m4));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @N
    public static b e(@N Context context, AttributeSet attributeSet, @InterfaceC0563f int i4, @d0 int i5) {
        return f(context, attributeSet, i4, i5, 0);
    }

    @N
    public static b f(@N Context context, AttributeSet attributeSet, @InterfaceC0563f int i4, @d0 int i5, int i6) {
        return g(context, attributeSet, i4, i5, new com.google.android.material.shape.a(i6));
    }

    @N
    public static b g(@N Context context, AttributeSet attributeSet, @InterfaceC0563f int i4, @d0 int i5, @N d dVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.wm, i4, i5);
        int resourceId = obtainStyledAttributes.getResourceId(a.o.xm, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(a.o.ym, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, dVar);
    }

    @N
    private static d m(TypedArray typedArray, int i4, @N d dVar) {
        TypedValue peekValue = typedArray.peekValue(i4);
        if (peekValue == null) {
            return dVar;
        }
        int i5 = peekValue.type;
        if (i5 == 5) {
            return new com.google.android.material.shape.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i5 == 6) {
            return new m(peekValue.getFraction(1.0f, 1.0f));
        }
        return dVar;
    }

    @N
    public g h() {
        return this.f33173k;
    }

    @N
    public e i() {
        return this.f33166d;
    }

    @N
    public d j() {
        return this.f33170h;
    }

    @N
    public e k() {
        return this.f33165c;
    }

    @N
    public d l() {
        return this.f33169g;
    }

    @N
    public g n() {
        return this.f33174l;
    }

    @N
    public g o() {
        return this.f33172j;
    }

    @N
    public g p() {
        return this.f33171i;
    }

    @N
    public e q() {
        return this.f33163a;
    }

    @N
    public d r() {
        return this.f33167e;
    }

    @N
    public e s() {
        return this.f33164b;
    }

    @N
    public d t() {
        return this.f33168f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean u(@N RectF rectF) {
        boolean z3;
        boolean z4;
        boolean z5;
        if (this.f33174l.getClass().equals(g.class) && this.f33172j.getClass().equals(g.class) && this.f33171i.getClass().equals(g.class) && this.f33173k.getClass().equals(g.class)) {
            z3 = true;
        } else {
            z3 = false;
        }
        float a4 = this.f33167e.a(rectF);
        if (this.f33168f.a(rectF) == a4 && this.f33170h.a(rectF) == a4 && this.f33169g.a(rectF) == a4) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((this.f33164b instanceof n) && (this.f33163a instanceof n) && (this.f33165c instanceof n) && (this.f33166d instanceof n)) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z3 || !z4 || !z5) {
            return false;
        }
        return true;
    }

    @N
    public b v() {
        return new b(this);
    }

    @N
    public o w(float f4) {
        return v().o(f4).m();
    }

    @N
    public o x(@N d dVar) {
        return v().p(dVar).m();
    }

    @N
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public o y(@N c cVar) {
        return v().L(cVar.a(r())).Q(cVar.a(t())).y(cVar.a(j())).D(cVar.a(l())).m();
    }

    private o(@N b bVar) {
        this.f33163a = bVar.f33175a;
        this.f33164b = bVar.f33176b;
        this.f33165c = bVar.f33177c;
        this.f33166d = bVar.f33178d;
        this.f33167e = bVar.f33179e;
        this.f33168f = bVar.f33180f;
        this.f33169g = bVar.f33181g;
        this.f33170h = bVar.f33182h;
        this.f33171i = bVar.f33183i;
        this.f33172j = bVar.f33184j;
        this.f33173k = bVar.f33185k;
        this.f33174l = bVar.f33186l;
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @N
        private e f33175a;

        /* renamed from: b, reason: collision with root package name */
        @N
        private e f33176b;

        /* renamed from: c, reason: collision with root package name */
        @N
        private e f33177c;

        /* renamed from: d, reason: collision with root package name */
        @N
        private e f33178d;

        /* renamed from: e, reason: collision with root package name */
        @N
        private d f33179e;

        /* renamed from: f, reason: collision with root package name */
        @N
        private d f33180f;

        /* renamed from: g, reason: collision with root package name */
        @N
        private d f33181g;

        /* renamed from: h, reason: collision with root package name */
        @N
        private d f33182h;

        /* renamed from: i, reason: collision with root package name */
        @N
        private g f33183i;

        /* renamed from: j, reason: collision with root package name */
        @N
        private g f33184j;

        /* renamed from: k, reason: collision with root package name */
        @N
        private g f33185k;

        /* renamed from: l, reason: collision with root package name */
        @N
        private g f33186l;

        public b() {
            this.f33175a = k.b();
            this.f33176b = k.b();
            this.f33177c = k.b();
            this.f33178d = k.b();
            this.f33179e = new com.google.android.material.shape.a(0.0f);
            this.f33180f = new com.google.android.material.shape.a(0.0f);
            this.f33181g = new com.google.android.material.shape.a(0.0f);
            this.f33182h = new com.google.android.material.shape.a(0.0f);
            this.f33183i = k.c();
            this.f33184j = k.c();
            this.f33185k = k.c();
            this.f33186l = k.c();
        }

        private static float n(e eVar) {
            if (eVar instanceof n) {
                return ((n) eVar).f33161a;
            }
            if (eVar instanceof f) {
                return ((f) eVar).f33094a;
            }
            return -1.0f;
        }

        @N
        public b A(int i4, @N d dVar) {
            return B(k.a(i4)).D(dVar);
        }

        @N
        public b B(@N e eVar) {
            this.f33177c = eVar;
            float n4 = n(eVar);
            if (n4 != -1.0f) {
                C(n4);
            }
            return this;
        }

        @N
        public b C(@androidx.annotation.r float f4) {
            this.f33181g = new com.google.android.material.shape.a(f4);
            return this;
        }

        @N
        public b D(@N d dVar) {
            this.f33181g = dVar;
            return this;
        }

        @N
        public b E(@N g gVar) {
            this.f33186l = gVar;
            return this;
        }

        @N
        public b F(@N g gVar) {
            this.f33184j = gVar;
            return this;
        }

        @N
        public b G(@N g gVar) {
            this.f33183i = gVar;
            return this;
        }

        @N
        public b H(int i4, @androidx.annotation.r float f4) {
            return J(k.a(i4)).K(f4);
        }

        @N
        public b I(int i4, @N d dVar) {
            return J(k.a(i4)).L(dVar);
        }

        @N
        public b J(@N e eVar) {
            this.f33175a = eVar;
            float n4 = n(eVar);
            if (n4 != -1.0f) {
                K(n4);
            }
            return this;
        }

        @N
        public b K(@androidx.annotation.r float f4) {
            this.f33179e = new com.google.android.material.shape.a(f4);
            return this;
        }

        @N
        public b L(@N d dVar) {
            this.f33179e = dVar;
            return this;
        }

        @N
        public b M(int i4, @androidx.annotation.r float f4) {
            return O(k.a(i4)).P(f4);
        }

        @N
        public b N(int i4, @N d dVar) {
            return O(k.a(i4)).Q(dVar);
        }

        @N
        public b O(@N e eVar) {
            this.f33176b = eVar;
            float n4 = n(eVar);
            if (n4 != -1.0f) {
                P(n4);
            }
            return this;
        }

        @N
        public b P(@androidx.annotation.r float f4) {
            this.f33180f = new com.google.android.material.shape.a(f4);
            return this;
        }

        @N
        public b Q(@N d dVar) {
            this.f33180f = dVar;
            return this;
        }

        @N
        public o m() {
            return new o(this);
        }

        @N
        public b o(@androidx.annotation.r float f4) {
            return K(f4).P(f4).C(f4).x(f4);
        }

        @N
        public b p(@N d dVar) {
            return L(dVar).Q(dVar).D(dVar).y(dVar);
        }

        @N
        public b q(int i4, @androidx.annotation.r float f4) {
            return r(k.a(i4)).o(f4);
        }

        @N
        public b r(@N e eVar) {
            return J(eVar).O(eVar).B(eVar).w(eVar);
        }

        @N
        public b s(@N g gVar) {
            return E(gVar).G(gVar).F(gVar).t(gVar);
        }

        @N
        public b t(@N g gVar) {
            this.f33185k = gVar;
            return this;
        }

        @N
        public b u(int i4, @androidx.annotation.r float f4) {
            return w(k.a(i4)).x(f4);
        }

        @N
        public b v(int i4, @N d dVar) {
            return w(k.a(i4)).y(dVar);
        }

        @N
        public b w(@N e eVar) {
            this.f33178d = eVar;
            float n4 = n(eVar);
            if (n4 != -1.0f) {
                x(n4);
            }
            return this;
        }

        @N
        public b x(@androidx.annotation.r float f4) {
            this.f33182h = new com.google.android.material.shape.a(f4);
            return this;
        }

        @N
        public b y(@N d dVar) {
            this.f33182h = dVar;
            return this;
        }

        @N
        public b z(int i4, @androidx.annotation.r float f4) {
            return B(k.a(i4)).C(f4);
        }

        public b(@N o oVar) {
            this.f33175a = k.b();
            this.f33176b = k.b();
            this.f33177c = k.b();
            this.f33178d = k.b();
            this.f33179e = new com.google.android.material.shape.a(0.0f);
            this.f33180f = new com.google.android.material.shape.a(0.0f);
            this.f33181g = new com.google.android.material.shape.a(0.0f);
            this.f33182h = new com.google.android.material.shape.a(0.0f);
            this.f33183i = k.c();
            this.f33184j = k.c();
            this.f33185k = k.c();
            this.f33186l = k.c();
            this.f33175a = oVar.f33163a;
            this.f33176b = oVar.f33164b;
            this.f33177c = oVar.f33165c;
            this.f33178d = oVar.f33166d;
            this.f33179e = oVar.f33167e;
            this.f33180f = oVar.f33168f;
            this.f33181g = oVar.f33169g;
            this.f33182h = oVar.f33170h;
            this.f33183i = oVar.f33171i;
            this.f33184j = oVar.f33172j;
            this.f33185k = oVar.f33173k;
            this.f33186l = oVar.f33174l;
        }
    }

    public o() {
        this.f33163a = k.b();
        this.f33164b = k.b();
        this.f33165c = k.b();
        this.f33166d = k.b();
        this.f33167e = new com.google.android.material.shape.a(0.0f);
        this.f33168f = new com.google.android.material.shape.a(0.0f);
        this.f33169g = new com.google.android.material.shape.a(0.0f);
        this.f33170h = new com.google.android.material.shape.a(0.0f);
        this.f33171i = k.c();
        this.f33172j = k.c();
        this.f33173k = k.c();
        this.f33174l = k.c();
    }
}
