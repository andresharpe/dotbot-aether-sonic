package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.N;
import androidx.annotation.P;
import b1.C1003a;
import com.google.android.material.circularreveal.d;

/* loaded from: classes2.dex */
public interface g extends d.a {

    /* loaded from: classes2.dex */
    public static class b implements TypeEvaluator<e> {

        /* renamed from: b, reason: collision with root package name */
        public static final TypeEvaluator<e> f31912b = new b();

        /* renamed from: a, reason: collision with root package name */
        private final e f31913a = new e();

        @Override // android.animation.TypeEvaluator
        @N
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e evaluate(float f4, @N e eVar, @N e eVar2) {
            this.f31913a.b(C1003a.f(eVar.f31917a, eVar2.f31917a, f4), C1003a.f(eVar.f31918b, eVar2.f31918b, f4), C1003a.f(eVar.f31919c, eVar2.f31919c, f4));
            return this.f31913a;
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends Property<g, e> {

        /* renamed from: a, reason: collision with root package name */
        public static final Property<g, e> f31914a = new c("circularReveal");

        private c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        @P
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e get(@N g gVar) {
            return gVar.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@N g gVar, @P e eVar) {
            gVar.setRevealInfo(eVar);
        }
    }

    /* loaded from: classes2.dex */
    public static class d extends Property<g, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Property<g, Integer> f31915a = new d("circularRevealScrimColor");

        private d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        @N
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(@N g gVar) {
            return Integer.valueOf(gVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@N g gVar, @N Integer num) {
            gVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* loaded from: classes2.dex */
    public static class e {

        /* renamed from: d, reason: collision with root package name */
        public static final float f31916d = Float.MAX_VALUE;

        /* renamed from: a, reason: collision with root package name */
        public float f31917a;

        /* renamed from: b, reason: collision with root package name */
        public float f31918b;

        /* renamed from: c, reason: collision with root package name */
        public float f31919c;

        public boolean a() {
            if (this.f31919c == Float.MAX_VALUE) {
                return true;
            }
            return false;
        }

        public void b(float f4, float f5, float f6) {
            this.f31917a = f4;
            this.f31918b = f5;
            this.f31919c = f6;
        }

        public void c(@N e eVar) {
            b(eVar.f31917a, eVar.f31918b, eVar.f31919c);
        }

        private e() {
        }

        public e(float f4, float f5, float f6) {
            this.f31917a = f4;
            this.f31918b = f5;
            this.f31919c = f6;
        }

        public e(@N e eVar) {
            this(eVar.f31917a, eVar.f31918b, eVar.f31919c);
        }
    }

    void a();

    void b();

    void draw(Canvas canvas);

    @P
    Drawable getCircularRevealOverlayDrawable();

    @InterfaceC0569l
    int getCircularRevealScrimColor();

    @P
    e getRevealInfo();

    boolean isOpaque();

    void setCircularRevealOverlayDrawable(@P Drawable drawable);

    void setCircularRevealScrimColor(@InterfaceC0569l int i4);

    void setRevealInfo(@P e eVar);
}
