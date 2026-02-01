package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.InterfaceC0566i;
import androidx.annotation.N;
import androidx.annotation.P;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: e, reason: collision with root package name */
    @P
    private AnimatorSet f33996e;

    /* loaded from: classes2.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f33996e = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableBehavior
    @InterfaceC0566i
    public boolean K(View view, View view2, boolean z3, boolean z4) {
        boolean z5;
        AnimatorSet animatorSet = this.f33996e;
        if (animatorSet != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            animatorSet.cancel();
        }
        AnimatorSet M3 = M(view, view2, z3, z5);
        this.f33996e = M3;
        M3.addListener(new a());
        this.f33996e.start();
        if (!z4) {
            this.f33996e.end();
        }
        return true;
    }

    @N
    protected abstract AnimatorSet M(View view, View view2, boolean z3, boolean z4);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
