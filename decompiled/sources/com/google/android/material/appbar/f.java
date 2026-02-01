package com.google.android.material.appbar;

import T0.a;
import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.N;
import androidx.annotation.W;
import com.google.android.material.internal.w;

@W(21)
/* loaded from: classes2.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f31377a = {R.attr.stateListAnimator};

    f() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(@N View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(@N View view, float f4) {
        int integer = view.getResources().getInteger(a.i.f2883c);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j4 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, a.c.De, -a.c.Ee}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j4));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, "elevation", f4).setDuration(j4));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(@N View view, AttributeSet attributeSet, int i4, int i5) {
        Context context = view.getContext();
        TypedArray j4 = w.j(context, attributeSet, f31377a, i4, i5, new int[0]);
        try {
            if (j4.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, j4.getResourceId(0, 0)));
            }
        } finally {
            j4.recycle();
        }
    }
}
