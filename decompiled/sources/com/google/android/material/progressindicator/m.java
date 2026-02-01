package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import androidx.vectordrawable.graphics.drawable.b;
import com.google.android.material.color.s;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class m extends j<ObjectAnimator> {

    /* renamed from: j, reason: collision with root package name */
    private static final int f32966j = 667;

    /* renamed from: k, reason: collision with root package name */
    private static final int f32967k = 333;

    /* renamed from: l, reason: collision with root package name */
    private static final Property<m, Float> f32968l = new b(Float.class, "animationFraction");

    /* renamed from: d, reason: collision with root package name */
    private ObjectAnimator f32969d;

    /* renamed from: e, reason: collision with root package name */
    private androidx.interpolator.view.animation.b f32970e;

    /* renamed from: f, reason: collision with root package name */
    private final c f32971f;

    /* renamed from: g, reason: collision with root package name */
    private int f32972g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f32973h;

    /* renamed from: i, reason: collision with root package name */
    private float f32974i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            m mVar = m.this;
            mVar.f32972g = (mVar.f32972g + 1) % m.this.f32971f.f32894c.length;
            m.this.f32973h = true;
        }
    }

    /* loaded from: classes2.dex */
    class b extends Property<m, Float> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(m mVar) {
            return Float.valueOf(mVar.n());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(m mVar, Float f4) {
            mVar.r(f4.floatValue());
        }
    }

    public m(@N p pVar) {
        super(3);
        this.f32972g = 1;
        this.f32971f = pVar;
        this.f32970e = new androidx.interpolator.view.animation.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float n() {
        return this.f32974i;
    }

    private void o() {
        if (this.f32969d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f32968l, 0.0f, 1.0f);
            this.f32969d = ofFloat;
            ofFloat.setDuration(333L);
            this.f32969d.setInterpolator(null);
            this.f32969d.setRepeatCount(-1);
            this.f32969d.addListener(new a());
        }
    }

    private void p() {
        if (this.f32973h && this.f32959b[3] < 1.0f) {
            int[] iArr = this.f32960c;
            iArr[2] = iArr[1];
            iArr[1] = iArr[0];
            iArr[0] = s.a(this.f32971f.f32894c[this.f32972g], this.f32958a.getAlpha());
            this.f32973h = false;
        }
    }

    private void s(int i4) {
        this.f32959b[0] = 0.0f;
        float b4 = b(i4, 0, f32966j);
        float[] fArr = this.f32959b;
        float interpolation = this.f32970e.getInterpolation(b4);
        fArr[2] = interpolation;
        fArr[1] = interpolation;
        float[] fArr2 = this.f32959b;
        float interpolation2 = this.f32970e.getInterpolation(b4 + 0.49925038f);
        fArr2[4] = interpolation2;
        fArr2[3] = interpolation2;
        this.f32959b[5] = 1.0f;
    }

    @Override // com.google.android.material.progressindicator.j
    public void a() {
        ObjectAnimator objectAnimator = this.f32969d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.j
    public void c() {
        q();
    }

    @Override // com.google.android.material.progressindicator.j
    public void d(@P b.a aVar) {
    }

    @Override // com.google.android.material.progressindicator.j
    public void f() {
    }

    @Override // com.google.android.material.progressindicator.j
    public void g() {
        o();
        q();
        this.f32969d.start();
    }

    @Override // com.google.android.material.progressindicator.j
    public void h() {
    }

    @i0
    void q() {
        this.f32973h = true;
        this.f32972g = 1;
        Arrays.fill(this.f32960c, s.a(this.f32971f.f32894c[0], this.f32958a.getAlpha()));
    }

    @i0
    void r(float f4) {
        this.f32974i = f4;
        s((int) (f4 * 333.0f));
        p();
        this.f32958a.invalidateSelf();
    }
}
