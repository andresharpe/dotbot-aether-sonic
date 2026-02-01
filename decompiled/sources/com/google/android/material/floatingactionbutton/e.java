package com.google.android.material.floatingactionbutton;

import T0.a;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import androidx.core.content.C0669d;
import androidx.core.util.u;
import com.google.android.material.shape.j;
import com.google.android.material.shape.o;
import java.util.ArrayList;

@W(21)
/* loaded from: classes2.dex */
class e extends d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a extends j {
        a(o oVar) {
            super(oVar);
        }

        @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(FloatingActionButton floatingActionButton, com.google.android.material.shadow.c cVar) {
        super(floatingActionButton, cVar);
    }

    @N
    private Animator m0(float f4, float f5) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f32439w, "elevation", f4).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f32439w, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f5).setDuration(100L));
        animatorSet.setInterpolator(d.f32393D);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.d
    public void A() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.d
    public void C() {
        i0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.d
    public void E(int[] iArr) {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void F(float f4, float f5, float f6) {
        int i4 = Build.VERSION.SDK_INT;
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(d.f32408S, m0(f4, f6));
        stateListAnimator.addState(d.f32409T, m0(f4, f5));
        stateListAnimator.addState(d.f32410U, m0(f4, f5));
        stateListAnimator.addState(d.f32411V, m0(f4, f5));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f32439w, "elevation", f4).setDuration(0L));
        if (i4 <= 24) {
            FloatingActionButton floatingActionButton = this.f32439w;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f32439w, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(d.f32393D);
        stateListAnimator.addState(d.f32412W, animatorSet);
        stateListAnimator.addState(d.f32413X, m0(0.0f, 0.0f));
        this.f32439w.setStateListAnimator(stateListAnimator);
        if (c0()) {
            i0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    boolean N() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.d
    public void Y(@P ColorStateList colorStateList) {
        Drawable drawable = this.f32419c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(com.google.android.material.ripple.b.d(colorStateList));
        } else {
            super.Y(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    boolean c0() {
        if (!this.f32440x.c() && e0()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void g0() {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    @N
    j l() {
        return new a((o) u.l(this.f32417a));
    }

    @N
    c l0(int i4, ColorStateList colorStateList) {
        Context context = this.f32439w.getContext();
        c cVar = new c((o) u.l(this.f32417a));
        cVar.f(C0669d.f(context, a.e.f2044D0), C0669d.f(context, a.e.f2040C0), C0669d.f(context, a.e.f2032A0), C0669d.f(context, a.e.f2036B0));
        cVar.e(i4);
        cVar.d(colorStateList);
        return cVar;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public float n() {
        return this.f32439w.getElevation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.d
    public void s(@N Rect rect) {
        if (this.f32440x.c()) {
            super.s(rect);
        } else if (!e0()) {
            int sizeDimension = (this.f32427k - this.f32439w.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.d
    public void x(ColorStateList colorStateList, @P PorterDuff.Mode mode, ColorStateList colorStateList2, int i4) {
        Drawable drawable;
        j l4 = l();
        this.f32418b = l4;
        l4.setTintList(colorStateList);
        if (mode != null) {
            this.f32418b.setTintMode(mode);
        }
        this.f32418b.Z(this.f32439w.getContext());
        if (i4 > 0) {
            this.f32420d = l0(i4, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{(Drawable) u.l(this.f32420d), (Drawable) u.l(this.f32418b)});
        } else {
            this.f32420d = null;
            drawable = this.f32418b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(com.google.android.material.ripple.b.d(colorStateList2), drawable, null);
        this.f32419c = rippleDrawable;
        this.f32421e = rippleDrawable;
    }
}
