package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class b {
    public static void a(@N AnimatorSet animatorSet, @N List<Animator> list) {
        int size = list.size();
        long j4 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Animator animator = list.get(i4);
            j4 = Math.max(j4, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j4);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }
}
