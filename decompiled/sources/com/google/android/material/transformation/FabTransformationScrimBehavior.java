package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.N;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.animation.i;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: h, reason: collision with root package name */
    public static final long f34017h = 75;

    /* renamed from: i, reason: collision with root package name */
    public static final long f34018i = 150;

    /* renamed from: j, reason: collision with root package name */
    public static final long f34019j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final long f34020k = 150;

    /* renamed from: f, reason: collision with root package name */
    private final i f34021f;

    /* renamed from: g, reason: collision with root package name */
    private final i f34022g;

    /* loaded from: classes2.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f34023a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f34024b;

        a(boolean z3, View view) {
            this.f34023a = z3;
            this.f34024b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f34023a) {
                this.f34024b.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f34023a) {
                this.f34024b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f34021f = new i(75L, 150L);
        this.f34022g = new i(0L, 150L);
    }

    private void N(@N View view, boolean z3, boolean z4, @N List<Animator> list, List<Animator.AnimatorListener> list2) {
        i iVar;
        ObjectAnimator ofFloat;
        if (z3) {
            iVar = this.f34021f;
        } else {
            iVar = this.f34022g;
        }
        if (z3) {
            if (!z4) {
                view.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        iVar.a(ofFloat);
        list.add(ofFloat);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(@N CoordinatorLayout coordinatorLayout, @N View view, @N MotionEvent motionEvent) {
        return super.E(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @N
    protected AnimatorSet M(@N View view, @N View view2, boolean z3, boolean z4) {
        ArrayList arrayList = new ArrayList();
        N(view2, z3, z4, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        com.google.android.material.animation.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z3, view2));
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean f(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34021f = new i(75L, 150L);
        this.f34022g = new i(0L, 150L);
    }
}
