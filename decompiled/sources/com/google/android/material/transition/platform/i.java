package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;

@W(21)
/* loaded from: classes2.dex */
public final class i extends Visibility {
    @Override // android.transition.Visibility
    @N
    public Animator onAppear(@N ViewGroup viewGroup, @N View view, @P TransitionValues transitionValues, @P TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(0.0f);
    }

    @Override // android.transition.Visibility
    @N
    public Animator onDisappear(@N ViewGroup viewGroup, @N View view, @P TransitionValues transitionValues, @P TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(0.0f);
    }
}
