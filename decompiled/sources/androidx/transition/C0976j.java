package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.transition.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0976j extends J {

    /* renamed from: z0, reason: collision with root package name */
    private static final String f20066z0 = "android:changeScroll:x";

    /* renamed from: A0, reason: collision with root package name */
    private static final String f20064A0 = "android:changeScroll:y";

    /* renamed from: B0, reason: collision with root package name */
    private static final String[] f20065B0 = {f20066z0, f20064A0};

    public C0976j() {
    }

    private void E0(S s4) {
        s4.f19959a.put(f20066z0, Integer.valueOf(s4.f19960b.getScrollX()));
        s4.f19959a.put(f20064A0, Integer.valueOf(s4.f19960b.getScrollY()));
    }

    @Override // androidx.transition.J
    @androidx.annotation.P
    public String[] Y() {
        return f20065B0;
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
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (s4 == null || s5 == null) {
            return null;
        }
        View view = s5.f19960b;
        int intValue = ((Integer) s4.f19959a.get(f20066z0)).intValue();
        int intValue2 = ((Integer) s5.f19959a.get(f20066z0)).intValue();
        int intValue3 = ((Integer) s4.f19959a.get(f20064A0)).intValue();
        int intValue4 = ((Integer) s5.f19959a.get(f20064A0)).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            objectAnimator = ObjectAnimator.ofInt(view, "scrollX", intValue, intValue2);
        } else {
            objectAnimator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator2 = ObjectAnimator.ofInt(view, "scrollY", intValue3, intValue4);
        }
        return Q.c(objectAnimator, objectAnimator2);
    }

    public C0976j(@androidx.annotation.N Context context, @androidx.annotation.N AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
