package com.google.android.material.progressindicator;

import T0.a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import androidx.annotation.N;
import androidx.annotation.i0;
import androidx.vectordrawable.graphics.drawable.b;
import com.google.android.material.color.s;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class n extends j<ObjectAnimator> {

    /* renamed from: l, reason: collision with root package name */
    private static final int f32976l = 1800;

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f32977m = {533, 567, 850, 750};

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f32978n = {1267, 1000, 333, 0};

    /* renamed from: o, reason: collision with root package name */
    private static final Property<n, Float> f32979o = new c(Float.class, "animationFraction");

    /* renamed from: d, reason: collision with root package name */
    private ObjectAnimator f32980d;

    /* renamed from: e, reason: collision with root package name */
    private ObjectAnimator f32981e;

    /* renamed from: f, reason: collision with root package name */
    private final Interpolator[] f32982f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.android.material.progressindicator.c f32983g;

    /* renamed from: h, reason: collision with root package name */
    private int f32984h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f32985i;

    /* renamed from: j, reason: collision with root package name */
    private float f32986j;

    /* renamed from: k, reason: collision with root package name */
    b.a f32987k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            n nVar = n.this;
            nVar.f32984h = (nVar.f32984h + 1) % n.this.f32983g.f32894c.length;
            n.this.f32985i = true;
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
            n.this.a();
            n nVar = n.this;
            b.a aVar = nVar.f32987k;
            if (aVar != null) {
                aVar.b(nVar.f32958a);
            }
        }
    }

    /* loaded from: classes2.dex */
    class c extends Property<n, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(n nVar) {
            return Float.valueOf(nVar.n());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(n nVar, Float f4) {
            nVar.r(f4.floatValue());
        }
    }

    public n(@N Context context, @N p pVar) {
        super(2);
        this.f32984h = 0;
        this.f32987k = null;
        this.f32983g = pVar;
        this.f32982f = new Interpolator[]{androidx.vectordrawable.graphics.drawable.d.b(context, a.b.f1778d), androidx.vectordrawable.graphics.drawable.d.b(context, a.b.f1779e), androidx.vectordrawable.graphics.drawable.d.b(context, a.b.f1780f), androidx.vectordrawable.graphics.drawable.d.b(context, a.b.f1781g)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float n() {
        return this.f32986j;
    }

    private void o() {
        if (this.f32980d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f32979o, 0.0f, 1.0f);
            this.f32980d = ofFloat;
            ofFloat.setDuration(1800L);
            this.f32980d.setInterpolator(null);
            this.f32980d.setRepeatCount(-1);
            this.f32980d.addListener(new a());
        }
        if (this.f32981e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f32979o, 1.0f);
            this.f32981e = ofFloat2;
            ofFloat2.setDuration(1800L);
            this.f32981e.setInterpolator(null);
            this.f32981e.addListener(new b());
        }
    }

    private void p() {
        if (this.f32985i) {
            Arrays.fill(this.f32960c, s.a(this.f32983g.f32894c[this.f32984h], this.f32958a.getAlpha()));
            this.f32985i = false;
        }
    }

    private void s(int i4) {
        for (int i5 = 0; i5 < 4; i5++) {
            this.f32959b[i5] = Math.max(0.0f, Math.min(1.0f, this.f32982f[i5].getInterpolation(b(i4, f32978n[i5], f32977m[i5]))));
        }
    }

    @Override // com.google.android.material.progressindicator.j
    public void a() {
        ObjectAnimator objectAnimator = this.f32980d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.j
    public void c() {
        q();
    }

    @Override // com.google.android.material.progressindicator.j
    public void d(@N b.a aVar) {
        this.f32987k = aVar;
    }

    @Override // com.google.android.material.progressindicator.j
    public void f() {
        ObjectAnimator objectAnimator = this.f32981e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            a();
            if (this.f32958a.isVisible()) {
                this.f32981e.setFloatValues(this.f32986j, 1.0f);
                this.f32981e.setDuration((1.0f - this.f32986j) * 1800.0f);
                this.f32981e.start();
            }
        }
    }

    @Override // com.google.android.material.progressindicator.j
    public void g() {
        o();
        q();
        this.f32980d.start();
    }

    @Override // com.google.android.material.progressindicator.j
    public void h() {
        this.f32987k = null;
    }

    @i0
    void q() {
        this.f32984h = 0;
        int a4 = s.a(this.f32983g.f32894c[0], this.f32958a.getAlpha());
        int[] iArr = this.f32960c;
        iArr[0] = a4;
        iArr[1] = a4;
    }

    @i0
    void r(float f4) {
        this.f32986j = f4;
        s((int) (f4 * 1800.0f));
        p();
        this.f32958a.invalidateSelf();
    }
}
