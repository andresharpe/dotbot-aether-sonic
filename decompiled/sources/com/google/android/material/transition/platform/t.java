package com.google.android.material.transition.platform;

import T0.a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.U;
import androidx.annotation.W;
import androidx.core.view.C0823k0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@W(21)
/* loaded from: classes2.dex */
public final class t implements w {

    /* renamed from: c, reason: collision with root package name */
    private static final int f34361c = -1;

    /* renamed from: a, reason: collision with root package name */
    private int f34362a;

    /* renamed from: b, reason: collision with root package name */
    @U
    private int f34363b = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f34364a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f34365b;

        a(View view, float f4) {
            this.f34364a = view;
            this.f34365b = f4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f34364a.setTranslationX(this.f34365b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f34366a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f34367b;

        b(View view, float f4) {
            this.f34366a = view;
            this.f34367b = f4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f34366a.setTranslationY(this.f34367b);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface c {
    }

    public t(int i4) {
        this.f34362a = i4;
    }

    private static Animator c(View view, View view2, int i4, @U int i5) {
        float f4;
        float f5;
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i4 != 3) {
            if (i4 != 5) {
                if (i4 != 48) {
                    if (i4 != 80) {
                        if (i4 != 8388611) {
                            if (i4 == 8388613) {
                                if (j(view)) {
                                    f5 = translationX - i5;
                                } else {
                                    f5 = i5 + translationX;
                                }
                                return e(view2, f5, translationX, translationX);
                            }
                            throw new IllegalArgumentException("Invalid slide direction: " + i4);
                        }
                        if (j(view)) {
                            f4 = i5 + translationX;
                        } else {
                            f4 = translationX - i5;
                        }
                        return e(view2, f4, translationX, translationX);
                    }
                    return f(view2, i5 + translationY, translationY, translationY);
                }
                return f(view2, translationY - i5, translationY, translationY);
            }
            return e(view2, translationX - i5, translationX, translationX);
        }
        return e(view2, i5 + translationX, translationX, translationX);
    }

    private static Animator d(View view, View view2, int i4, @U int i5) {
        float f4;
        float f5;
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i4 != 3) {
            if (i4 != 5) {
                if (i4 != 48) {
                    if (i4 != 80) {
                        if (i4 != 8388611) {
                            if (i4 == 8388613) {
                                if (j(view)) {
                                    f5 = i5 + translationX;
                                } else {
                                    f5 = translationX - i5;
                                }
                                return e(view2, translationX, f5, translationX);
                            }
                            throw new IllegalArgumentException("Invalid slide direction: " + i4);
                        }
                        if (j(view)) {
                            f4 = translationX - i5;
                        } else {
                            f4 = i5 + translationX;
                        }
                        return e(view2, translationX, f4, translationX);
                    }
                    return f(view2, translationY, translationY - i5, translationY);
                }
                return f(view2, translationY, i5 + translationY, translationY);
            }
            return e(view2, translationX, i5 + translationX, translationX);
        }
        return e(view2, translationX, translationX - i5, translationX);
    }

    private static Animator e(View view, float f4, float f5, float f6) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f4, f5));
        ofPropertyValuesHolder.addListener(new a(view, f6));
        return ofPropertyValuesHolder;
    }

    private static Animator f(View view, float f4, float f5, float f6) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f4, f5));
        ofPropertyValuesHolder.addListener(new b(view, f6));
        return ofPropertyValuesHolder;
    }

    private int h(Context context) {
        int i4 = this.f34363b;
        if (i4 != -1) {
            return i4;
        }
        return context.getResources().getDimensionPixelSize(a.f.C9);
    }

    private static boolean j(View view) {
        if (C0823k0.Z(view) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.transition.platform.w
    @P
    public Animator a(@N ViewGroup viewGroup, @N View view) {
        return c(viewGroup, view, this.f34362a, h(view.getContext()));
    }

    @Override // com.google.android.material.transition.platform.w
    @P
    public Animator b(@N ViewGroup viewGroup, @N View view) {
        return d(viewGroup, view, this.f34362a, h(view.getContext()));
    }

    @U
    public int g() {
        return this.f34363b;
    }

    public int i() {
        return this.f34362a;
    }

    public void k(@U int i4) {
        if (i4 >= 0) {
            this.f34363b = i4;
            return;
        }
        throw new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
    }

    public void l(int i4) {
        this.f34362a = i4;
    }
}
