package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.transition.J;
import androidx.transition.S;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class u extends J {

    /* renamed from: z0, reason: collision with root package name */
    private static final String f32725z0 = "android:textscale:scale";

    /* loaded from: classes2.dex */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f32726a;

        a(TextView textView) {
            this.f32726a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@N ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f32726a.setScaleX(floatValue);
            this.f32726a.setScaleY(floatValue);
        }
    }

    private void E0(@N S s4) {
        View view = s4.f19960b;
        if (view instanceof TextView) {
            s4.f19959a.put(f32725z0, Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.J
    public void l(@N S s4) {
        E0(s4);
    }

    @Override // androidx.transition.J
    public void p(@N S s4) {
        E0(s4);
    }

    @Override // androidx.transition.J
    public Animator t(@N ViewGroup viewGroup, @P S s4, @P S s5) {
        float f4;
        if (s4 == null || s5 == null || !(s4.f19960b instanceof TextView)) {
            return null;
        }
        View view = s5.f19960b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = s4.f19959a;
        Map<String, Object> map2 = s5.f19959a;
        float f5 = 1.0f;
        if (map.get(f32725z0) != null) {
            f4 = ((Float) map.get(f32725z0)).floatValue();
        } else {
            f4 = 1.0f;
        }
        if (map2.get(f32725z0) != null) {
            f5 = ((Float) map2.get(f32725z0)).floatValue();
        }
        if (f4 == f5) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f4, f5);
        ofFloat.addUpdateListener(new a(textView));
        return ofFloat;
    }
}
