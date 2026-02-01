package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.N;
import androidx.annotation.i0;
import androidx.vectordrawable.graphics.drawable.b;
import com.google.android.material.color.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class e extends j<ObjectAnimator> {

    /* renamed from: l, reason: collision with root package name */
    private static final int f32902l = 4;

    /* renamed from: m, reason: collision with root package name */
    private static final int f32903m = 5400;

    /* renamed from: n, reason: collision with root package name */
    private static final int f32904n = 667;

    /* renamed from: o, reason: collision with root package name */
    private static final int f32905o = 667;

    /* renamed from: p, reason: collision with root package name */
    private static final int f32906p = 333;

    /* renamed from: q, reason: collision with root package name */
    private static final int f32907q = 333;

    /* renamed from: u, reason: collision with root package name */
    private static final int f32911u = -20;

    /* renamed from: v, reason: collision with root package name */
    private static final int f32912v = 250;

    /* renamed from: w, reason: collision with root package name */
    private static final int f32913w = 1520;

    /* renamed from: d, reason: collision with root package name */
    private ObjectAnimator f32916d;

    /* renamed from: e, reason: collision with root package name */
    private ObjectAnimator f32917e;

    /* renamed from: f, reason: collision with root package name */
    private final androidx.interpolator.view.animation.b f32918f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.android.material.progressindicator.c f32919g;

    /* renamed from: h, reason: collision with root package name */
    private int f32920h;

    /* renamed from: i, reason: collision with root package name */
    private float f32921i;

    /* renamed from: j, reason: collision with root package name */
    private float f32922j;

    /* renamed from: k, reason: collision with root package name */
    b.a f32923k;

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f32908r = {0, 1350, 2700, 4050};

    /* renamed from: s, reason: collision with root package name */
    private static final int[] f32909s = {667, 2017, 3367, 4717};

    /* renamed from: t, reason: collision with root package name */
    private static final int[] f32910t = {1000, 2350, 3700, 5050};

    /* renamed from: x, reason: collision with root package name */
    private static final Property<e, Float> f32914x = new c(Float.class, "animationFraction");

    /* renamed from: y, reason: collision with root package name */
    private static final Property<e, Float> f32915y = new d(Float.class, "completeEndFraction");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            e eVar = e.this;
            eVar.f32920h = (eVar.f32920h + 4) % e.this.f32919g.f32894c.length;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            e.this.a();
            e eVar = e.this;
            b.a aVar = eVar.f32923k;
            if (aVar != null) {
                aVar.b(eVar.f32958a);
            }
        }
    }

    /* loaded from: classes2.dex */
    class c extends Property<e, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(e eVar) {
            return Float.valueOf(eVar.o());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(e eVar, Float f4) {
            eVar.t(f4.floatValue());
        }
    }

    /* loaded from: classes2.dex */
    class d extends Property<e, Float> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(e eVar) {
            return Float.valueOf(eVar.p());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(e eVar, Float f4) {
            eVar.u(f4.floatValue());
        }
    }

    public e(@N f fVar) {
        super(1);
        this.f32920h = 0;
        this.f32923k = null;
        this.f32919g = fVar;
        this.f32918f = new androidx.interpolator.view.animation.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float o() {
        return this.f32921i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float p() {
        return this.f32922j;
    }

    private void q() {
        if (this.f32916d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f32914x, 0.0f, 1.0f);
            this.f32916d = ofFloat;
            ofFloat.setDuration(5400L);
            this.f32916d.setInterpolator(null);
            this.f32916d.setRepeatCount(-1);
            this.f32916d.addListener(new a());
        }
        if (this.f32917e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f32915y, 0.0f, 1.0f);
            this.f32917e = ofFloat2;
            ofFloat2.setDuration(333L);
            this.f32917e.setInterpolator(this.f32918f);
            this.f32917e.addListener(new b());
        }
    }

    private void r(int i4) {
        for (int i5 = 0; i5 < 4; i5++) {
            float b4 = b(i4, f32910t[i5], 333);
            if (b4 >= 0.0f && b4 <= 1.0f) {
                int i6 = i5 + this.f32920h;
                int[] iArr = this.f32919g.f32894c;
                int length = i6 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                this.f32960c[0] = com.google.android.material.animation.c.b().evaluate(this.f32918f.getInterpolation(b4), Integer.valueOf(s.a(iArr[length], this.f32958a.getAlpha())), Integer.valueOf(s.a(this.f32919g.f32894c[length2], this.f32958a.getAlpha()))).intValue();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(float f4) {
        this.f32922j = f4;
    }

    private void v(int i4) {
        float[] fArr = this.f32959b;
        float f4 = this.f32921i;
        fArr[0] = (f4 * 1520.0f) - 20.0f;
        fArr[1] = f4 * 1520.0f;
        for (int i5 = 0; i5 < 4; i5++) {
            float b4 = b(i4, f32908r[i5], 667);
            float[] fArr2 = this.f32959b;
            fArr2[1] = fArr2[1] + (this.f32918f.getInterpolation(b4) * 250.0f);
            float b5 = b(i4, f32909s[i5], 667);
            float[] fArr3 = this.f32959b;
            fArr3[0] = fArr3[0] + (this.f32918f.getInterpolation(b5) * 250.0f);
        }
        float[] fArr4 = this.f32959b;
        float f5 = fArr4[0];
        float f6 = fArr4[1];
        float f7 = f5 + ((f6 - f5) * this.f32922j);
        fArr4[0] = f7;
        fArr4[0] = f7 / 360.0f;
        fArr4[1] = f6 / 360.0f;
    }

    @Override // com.google.android.material.progressindicator.j
    void a() {
        ObjectAnimator objectAnimator = this.f32916d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.j
    public void c() {
        s();
    }

    @Override // com.google.android.material.progressindicator.j
    public void d(@N b.a aVar) {
        this.f32923k = aVar;
    }

    @Override // com.google.android.material.progressindicator.j
    void f() {
        ObjectAnimator objectAnimator = this.f32917e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (this.f32958a.isVisible()) {
                this.f32917e.start();
            } else {
                a();
            }
        }
    }

    @Override // com.google.android.material.progressindicator.j
    void g() {
        q();
        s();
        this.f32916d.start();
    }

    @Override // com.google.android.material.progressindicator.j
    public void h() {
        this.f32923k = null;
    }

    @i0
    void s() {
        this.f32920h = 0;
        this.f32960c[0] = s.a(this.f32919g.f32894c[0], this.f32958a.getAlpha());
        this.f32922j = 0.0f;
    }

    @i0
    void t(float f4) {
        this.f32921i = f4;
        int i4 = (int) (f4 * 5400.0f);
        v(i4);
        r(i4);
        this.f32958a.invalidateSelf();
    }
}
