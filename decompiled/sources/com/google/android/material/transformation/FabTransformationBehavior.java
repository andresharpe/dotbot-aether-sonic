package com.google.android.material.transformation;

import T0.a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.InterfaceC0566i;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0823k0;
import b1.C1003a;
import com.google.android.material.animation.h;
import com.google.android.material.animation.i;
import com.google.android.material.animation.j;
import com.google.android.material.circularreveal.g;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: f, reason: collision with root package name */
    private final Rect f33998f;

    /* renamed from: g, reason: collision with root package name */
    private final RectF f33999g;

    /* renamed from: h, reason: collision with root package name */
    private final RectF f34000h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f34001i;

    /* renamed from: j, reason: collision with root package name */
    private float f34002j;

    /* renamed from: k, reason: collision with root package name */
    private float f34003k;

    /* loaded from: classes2.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f34004a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f34005b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f34006c;

        a(boolean z3, View view, View view2) {
            this.f34004a = z3;
            this.f34005b = view;
            this.f34006c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f34004a) {
                this.f34005b.setVisibility(4);
                this.f34006c.setAlpha(1.0f);
                this.f34006c.setVisibility(0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f34004a) {
                this.f34005b.setVisibility(0);
                this.f34006c.setAlpha(0.0f);
                this.f34006c.setVisibility(4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f34008a;

        b(View view) {
            this.f34008a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f34008a.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f34010a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Drawable f34011b;

        c(g gVar, Drawable drawable) {
            this.f34010a = gVar;
            this.f34011b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f34010a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f34010a.setCircularRevealOverlayDrawable(this.f34011b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f34013a;

        d(g gVar) {
            this.f34013a = gVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g.e revealInfo = this.f34013a.getRevealInfo();
            revealInfo.f31919c = Float.MAX_VALUE;
            this.f34013a.setRevealInfo(revealInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        @P
        public h f34015a;

        /* renamed from: b, reason: collision with root package name */
        public j f34016b;
    }

    public FabTransformationBehavior() {
        this.f33998f = new Rect();
        this.f33999g = new RectF();
        this.f34000h = new RectF();
        this.f34001i = new int[2];
    }

    @P
    private ViewGroup N(@N View view) {
        View findViewById = view.findViewById(a.h.f2810p3);
        if (findViewById != null) {
            return i0(findViewById);
        }
        if (!(view instanceof com.google.android.material.transformation.b) && !(view instanceof com.google.android.material.transformation.a)) {
            return i0(view);
        }
        return i0(((ViewGroup) view).getChildAt(0));
    }

    private void O(@N View view, @N e eVar, @N i iVar, @N i iVar2, float f4, float f5, float f6, float f7, @N RectF rectF) {
        float V3 = V(eVar, iVar, f4, f6);
        float V4 = V(eVar, iVar2, f5, f7);
        Rect rect = this.f33998f;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f33999g;
        rectF2.set(rect);
        RectF rectF3 = this.f34000h;
        W(view, rectF3);
        rectF3.offset(V3, V4);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void P(@N View view, @N RectF rectF) {
        W(view, rectF);
        rectF.offset(this.f34002j, this.f34003k);
    }

    @N
    private Pair<i, i> Q(float f4, float f5, boolean z3, @N e eVar) {
        i h4;
        i h5;
        if (f4 != 0.0f && f5 != 0.0f) {
            if ((z3 && f5 < 0.0f) || (!z3 && f5 > 0.0f)) {
                h4 = eVar.f34015a.h("translationXCurveUpwards");
                h5 = eVar.f34015a.h("translationYCurveUpwards");
            } else {
                h4 = eVar.f34015a.h("translationXCurveDownwards");
                h5 = eVar.f34015a.h("translationYCurveDownwards");
            }
        } else {
            h4 = eVar.f34015a.h("translationXLinear");
            h5 = eVar.f34015a.h("translationYLinear");
        }
        return new Pair<>(h4, h5);
    }

    private float R(@N View view, @N View view2, @N j jVar) {
        RectF rectF = this.f33999g;
        RectF rectF2 = this.f34000h;
        P(view, rectF);
        W(view2, rectF2);
        rectF2.offset(-T(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float S(@N View view, @N View view2, @N j jVar) {
        RectF rectF = this.f33999g;
        RectF rectF2 = this.f34000h;
        P(view, rectF);
        W(view2, rectF2);
        rectF2.offset(0.0f, -U(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    private float T(@N View view, @N View view2, @N j jVar) {
        float centerX;
        float centerX2;
        float f4;
        RectF rectF = this.f33999g;
        RectF rectF2 = this.f34000h;
        P(view, rectF);
        W(view2, rectF2);
        int i4 = jVar.f31228a & 7;
        if (i4 != 1) {
            if (i4 != 3) {
                if (i4 != 5) {
                    f4 = 0.0f;
                    return f4 + jVar.f31229b;
                }
                centerX = rectF2.right;
                centerX2 = rectF.right;
            } else {
                centerX = rectF2.left;
                centerX2 = rectF.left;
            }
        } else {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        }
        f4 = centerX - centerX2;
        return f4 + jVar.f31229b;
    }

    private float U(@N View view, @N View view2, @N j jVar) {
        float centerY;
        float centerY2;
        float f4;
        RectF rectF = this.f33999g;
        RectF rectF2 = this.f34000h;
        P(view, rectF);
        W(view2, rectF2);
        int i4 = jVar.f31228a & 112;
        if (i4 != 16) {
            if (i4 != 48) {
                if (i4 != 80) {
                    f4 = 0.0f;
                    return f4 + jVar.f31230c;
                }
                centerY = rectF2.bottom;
                centerY2 = rectF.bottom;
            } else {
                centerY = rectF2.top;
                centerY2 = rectF.top;
            }
        } else {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        }
        f4 = centerY - centerY2;
        return f4 + jVar.f31230c;
    }

    private float V(@N e eVar, @N i iVar, float f4, float f5) {
        long c4 = iVar.c();
        long d4 = iVar.d();
        i h4 = eVar.f34015a.h("expansion");
        return com.google.android.material.animation.a.a(f4, f5, iVar.e().getInterpolation(((float) (((h4.c() + h4.d()) + 17) - c4)) / ((float) d4)));
    }

    private void W(@N View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f34001i);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void X(View view, View view2, boolean z3, boolean z4, @N e eVar, @N List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup N3;
        ObjectAnimator ofFloat;
        if (!(view2 instanceof ViewGroup)) {
            return;
        }
        if (((view2 instanceof g) && com.google.android.material.circularreveal.d.f31899o == 0) || (N3 = N(view2)) == null) {
            return;
        }
        if (z3) {
            if (!z4) {
                com.google.android.material.animation.d.f31213a.set(N3, Float.valueOf(0.0f));
            }
            ofFloat = ObjectAnimator.ofFloat(N3, com.google.android.material.animation.d.f31213a, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(N3, com.google.android.material.animation.d.f31213a, 0.0f);
        }
        eVar.f34015a.h("contentFade").a(ofFloat);
        list.add(ofFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Y(@N View view, View view2, boolean z3, boolean z4, @N e eVar, @N List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if (!(view2 instanceof g)) {
            return;
        }
        g gVar = (g) view2;
        int g02 = g0(view);
        int i4 = 16777215 & g02;
        if (z3) {
            if (!z4) {
                gVar.setCircularRevealScrimColor(g02);
            }
            ofInt = ObjectAnimator.ofInt(gVar, g.d.f31915a, i4);
        } else {
            ofInt = ObjectAnimator.ofInt(gVar, g.d.f31915a, g02);
        }
        ofInt.setEvaluator(com.google.android.material.animation.c.b());
        eVar.f34015a.h(v.b.f7402d).a(ofInt);
        list.add(ofInt);
    }

    private void Z(@N View view, @N View view2, boolean z3, @N e eVar, @N List<Animator> list) {
        float T3 = T(view, view2, eVar.f34016b);
        float U3 = U(view, view2, eVar.f34016b);
        Pair<i, i> Q3 = Q(T3, U3, z3, eVar);
        i iVar = (i) Q3.first;
        i iVar2 = (i) Q3.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z3) {
            T3 = this.f34002j;
        }
        fArr[0] = T3;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z3) {
            U3 = this.f34003k;
        }
        fArr2[0] = U3;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        iVar.a(ofFloat);
        iVar2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    private void a0(View view, @N View view2, boolean z3, boolean z4, @N e eVar, @N List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        float R3 = C0823k0.R(view2) - C0823k0.R(view);
        if (z3) {
            if (!z4) {
                view2.setTranslationZ(-R3);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -R3);
        }
        eVar.f34015a.h("elevation").a(ofFloat);
        list.add(ofFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b0(@N View view, View view2, boolean z3, boolean z4, @N e eVar, float f4, float f5, @N List<Animator> list, @N List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (!(view2 instanceof g)) {
            return;
        }
        g gVar = (g) view2;
        float R3 = R(view, view2, eVar.f34016b);
        float S3 = S(view, view2, eVar.f34016b);
        ((FloatingActionButton) view).k(this.f33998f);
        float width = this.f33998f.width() / 2.0f;
        i h4 = eVar.f34015a.h("expansion");
        if (z3) {
            if (!z4) {
                gVar.setRevealInfo(new g.e(R3, S3, width));
            }
            if (z4) {
                width = gVar.getRevealInfo().f31919c;
            }
            animator = com.google.android.material.circularreveal.a.a(gVar, R3, S3, C1003a.b(R3, S3, 0.0f, 0.0f, f4, f5));
            animator.addListener(new d(gVar));
            e0(view2, h4.c(), (int) R3, (int) S3, width, list);
        } else {
            float f6 = gVar.getRevealInfo().f31919c;
            Animator a4 = com.google.android.material.circularreveal.a.a(gVar, R3, S3, width);
            int i4 = (int) R3;
            int i5 = (int) S3;
            e0(view2, h4.c(), i4, i5, f6, list);
            d0(view2, h4.c(), h4.d(), eVar.f34015a.i(), i4, i5, width, list);
            animator = a4;
        }
        h4.a(animator);
        list.add(animator);
        list2.add(com.google.android.material.circularreveal.a.c(gVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c0(View view, View view2, boolean z3, boolean z4, @N e eVar, @N List<Animator> list, @N List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if ((view2 instanceof g) && (view instanceof ImageView)) {
            g gVar = (g) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z3) {
                if (!z4) {
                    drawable.setAlpha(255);
                }
                ofInt = ObjectAnimator.ofInt(drawable, com.google.android.material.animation.e.f31214b, 0);
            } else {
                ofInt = ObjectAnimator.ofInt(drawable, com.google.android.material.animation.e.f31214b, 255);
            }
            ofInt.addUpdateListener(new b(view2));
            eVar.f34015a.h("iconFade").a(ofInt);
            list.add(ofInt);
            list2.add(new c(gVar, drawable));
        }
    }

    private void d0(View view, long j4, long j5, long j6, int i4, int i5, float f4, @N List<Animator> list) {
        long j7 = j4 + j5;
        if (j7 < j6) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i4, i5, f4, f4);
            createCircularReveal.setStartDelay(j7);
            createCircularReveal.setDuration(j6 - j7);
            list.add(createCircularReveal);
        }
    }

    private void e0(View view, long j4, int i4, int i5, float f4, @N List<Animator> list) {
        if (j4 > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i4, i5, f4, f4);
            createCircularReveal.setStartDelay(0L);
            createCircularReveal.setDuration(j4);
            list.add(createCircularReveal);
        }
    }

    private void f0(@N View view, @N View view2, boolean z3, boolean z4, @N e eVar, @N List<Animator> list, List<Animator.AnimatorListener> list2, @N RectF rectF) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float T3 = T(view, view2, eVar.f34016b);
        float U3 = U(view, view2, eVar.f34016b);
        Pair<i, i> Q3 = Q(T3, U3, z3, eVar);
        i iVar = (i) Q3.first;
        i iVar2 = (i) Q3.second;
        if (z3) {
            if (!z4) {
                view2.setTranslationX(-T3);
                view2.setTranslationY(-U3);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            O(view2, eVar, iVar, iVar2, -T3, -U3, 0.0f, 0.0f, rectF);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -T3);
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -U3);
        }
        iVar.a(ofFloat);
        iVar2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    private int g0(@N View view) {
        ColorStateList N3 = C0823k0.N(view);
        if (N3 != null) {
            return N3.getColorForState(view.getDrawableState(), N3.getDefaultColor());
        }
        return 0;
    }

    @P
    private ViewGroup i0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @N
    protected AnimatorSet M(@N View view, @N View view2, boolean z3, boolean z4) {
        e h02 = h0(view2.getContext(), z3);
        if (z3) {
            this.f34002j = view.getTranslationX();
            this.f34003k = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        a0(view, view2, z3, z4, h02, arrayList, arrayList2);
        RectF rectF = this.f33999g;
        f0(view, view2, z3, z4, h02, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        Z(view, view2, z3, h02, arrayList);
        c0(view, view2, z3, z4, h02, arrayList, arrayList2);
        b0(view, view2, z3, z4, h02, width, height, arrayList, arrayList2);
        Y(view, view2, z3, z4, h02, arrayList, arrayList2);
        X(view, view2, z3, z4, h02, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        com.google.android.material.animation.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z3, view2, view));
        int size = arrayList2.size();
        for (int i4 = 0; i4 < size; i4++) {
            animatorSet.addListener(arrayList2.get(i4));
        }
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @InterfaceC0566i
    public boolean f(@N CoordinatorLayout coordinatorLayout, @N View view, @N View view2) {
        if (view.getVisibility() != 8) {
            if (!(view2 instanceof FloatingActionButton)) {
                return false;
            }
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint != 0 && expandedComponentIdHint != view.getId()) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @InterfaceC0566i
    public void h(@N CoordinatorLayout.g gVar) {
        if (gVar.f11490h == 0) {
            gVar.f11490h = 80;
        }
    }

    protected abstract e h0(Context context, boolean z3);

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33998f = new Rect();
        this.f33999g = new RectF();
        this.f34000h = new RectF();
        this.f34001i = new int[2];
    }
}
