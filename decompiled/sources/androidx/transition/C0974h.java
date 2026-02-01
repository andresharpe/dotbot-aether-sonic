package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0823k0;

/* renamed from: androidx.transition.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0974h extends J {

    /* renamed from: A0, reason: collision with root package name */
    private static final String f20052A0 = "android:clipBounds:bounds";

    /* renamed from: z0, reason: collision with root package name */
    private static final String f20054z0 = "android:clipBounds:clip";

    /* renamed from: B0, reason: collision with root package name */
    private static final String[] f20053B0 = {f20054z0};

    /* renamed from: androidx.transition.h$a */
    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f20055a;

        a(View view) {
            this.f20055a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0823k0.M1(this.f20055a, null);
        }
    }

    public C0974h() {
    }

    private void E0(S s4) {
        View view = s4.f19960b;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect P3 = C0823k0.P(view);
        s4.f19959a.put(f20054z0, P3);
        if (P3 == null) {
            s4.f19959a.put(f20052A0, new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // androidx.transition.J
    @androidx.annotation.N
    public String[] Y() {
        return f20053B0;
    }

    @Override // androidx.transition.J
    public void l(@androidx.annotation.N S s4) {
        E0(s4);
    }

    @Override // androidx.transition.J
    public void p(@androidx.annotation.N S s4) {
        E0(s4);
    }

    @Override // androidx.transition.J
    @androidx.annotation.P
    public Animator t(@androidx.annotation.N ViewGroup viewGroup, @androidx.annotation.P S s4, @androidx.annotation.P S s5) {
        boolean z3;
        ObjectAnimator objectAnimator = null;
        if (s4 != null && s5 != null && s4.f19959a.containsKey(f20054z0) && s5.f19959a.containsKey(f20054z0)) {
            Rect rect = (Rect) s4.f19959a.get(f20054z0);
            Rect rect2 = (Rect) s5.f19959a.get(f20054z0);
            if (rect2 == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (rect == null && rect2 == null) {
                return null;
            }
            if (rect == null) {
                rect = (Rect) s4.f19959a.get(f20052A0);
            } else if (rect2 == null) {
                rect2 = (Rect) s5.f19959a.get(f20052A0);
            }
            if (rect.equals(rect2)) {
                return null;
            }
            C0823k0.M1(s5.f19960b, rect);
            objectAnimator = ObjectAnimator.ofObject(s5.f19960b, (Property<View, V>) f0.f20009d, (TypeEvaluator) new E(new Rect()), (Object[]) new Rect[]{rect, rect2});
            if (z3) {
                objectAnimator.addListener(new a(s5.f19960b));
            }
        }
        return objectAnimator;
    }

    public C0974h(@androidx.annotation.N Context context, @androidx.annotation.N AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
