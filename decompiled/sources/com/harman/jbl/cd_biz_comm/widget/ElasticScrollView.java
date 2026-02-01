package com.harman.jbl.cd_biz_comm.widget;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.ScrollView;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

@E(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 S2\u00020\u0001:\u0001TB\u0013\b\u0016\u0012\b\u0010I\u001a\u0004\u0018\u00010H¢\u0006\u0004\bJ\u0010KB\u001d\b\u0016\u0012\b\u0010I\u001a\u0004\u0018\u00010H\u0012\b\u0010M\u001a\u0004\u0018\u00010L¢\u0006\u0004\bJ\u0010NB%\b\u0016\u0012\b\u0010I\u001a\u0004\u0018\u00010H\u0012\b\u0010M\u001a\u0004\u0018\u00010L\u0012\u0006\u0010O\u001a\u00020\u0007¢\u0006\u0004\bJ\u0010PB-\b\u0016\u0012\b\u0010I\u001a\u0004\u0018\u00010H\u0012\b\u0010M\u001a\u0004\u0018\u00010L\u0012\u0006\u0010O\u001a\u00020\u0007\u0012\u0006\u0010Q\u001a\u00020\u0007¢\u0006\u0004\bJ\u0010RJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J)\u0010\u0019\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001b\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001f\u0010\u0013J\u0017\u0010 \u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b \u0010\u000eJ\u000f\u0010!\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\"\u00100\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00106\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u0010\u0011R\u0018\u00109\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010:\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00108R\u0016\u0010<\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010+R\u0016\u0010>\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00102R\u0016\u0010@\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00102R\u0014\u0010C\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010BR\u0014\u0010G\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010B¨\u0006U"}, d2 = {"Lcom/harman/jbl/cd_biz_comm/widget/ElasticScrollView;", "Landroid/widget/ScrollView;", "Landroid/view/MotionEvent;", "event", "Lkotlin/H0;", "d", "(Landroid/view/MotionEvent;)V", "", "c", "(Landroid/view/MotionEvent;)I", "i", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "p", "(Landroid/view/View;)V", "deltaY", "o", "(I)V", "j", "()V", "q", "v", "start", "end", "Landroid/animation/ValueAnimator;", "e", "(Landroid/view/View;II)Landroid/animation/ValueAnimator;", "g", "", "k", "(I)Z", "onFinishInflate", "setElasticView", "getElasticView", "()Landroid/view/View;", "ev", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/graphics/Rect;", androidx.exifinterface.media.a.U4, "Landroid/graphics/Rect;", "normalRect", "", "F", "getDampness", "()F", "setDampness", "(F)V", "dampness", "G", "I", "getResetDelay", "()I", "setResetDelay", "resetDelay", "H", "Landroid/view/View;", "mInnerView", "elasticView", "J", "startY", "K", "originHeight", "L", "originWidth", "n", "()Z", "isNeedReset", "m", "isNeedMoveTop", "l", "isNeedMoveBottom", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "M", "a", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ElasticScrollView extends ScrollView {

    /* renamed from: M, reason: collision with root package name */
    @l3.d
    public static final a f38010M = new a(null);

    /* renamed from: N, reason: collision with root package name */
    private static final int f38011N = 3;

    /* renamed from: O, reason: collision with root package name */
    private static final int f38012O = 2;

    /* renamed from: P, reason: collision with root package name */
    private static final int f38013P = 200;

    /* renamed from: Q, reason: collision with root package name */
    private static final int f38014Q = 0;

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final Rect f38015E;

    /* renamed from: F, reason: collision with root package name */
    private float f38016F;

    /* renamed from: G, reason: collision with root package name */
    private int f38017G;

    /* renamed from: H, reason: collision with root package name */
    @l3.e
    private View f38018H;

    /* renamed from: I, reason: collision with root package name */
    @l3.e
    private View f38019I;

    /* renamed from: J, reason: collision with root package name */
    private float f38020J;

    /* renamed from: K, reason: collision with root package name */
    private int f38021K;

    /* renamed from: L, reason: collision with root package name */
    private int f38022L;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public ElasticScrollView(@l3.e Context context) {
        super(context);
        this.f38015E = new Rect();
        this.f38016F = 2.0f;
        this.f38017G = 200;
    }

    private final int c(MotionEvent motionEvent) {
        int i4;
        float y3 = motionEvent.getY();
        if (Math.abs(y3 - this.f38020J) > 3.0f) {
            i4 = (int) ((this.f38020J - y3) / this.f38016F);
        } else {
            i4 = 0;
        }
        this.f38020J = y3;
        return i4;
    }

    private final void d(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return;
                    }
                } else {
                    i(motionEvent);
                    return;
                }
            }
            j();
            return;
        }
        this.f38020J = motionEvent.getY();
    }

    private final ValueAnimator e(final View view, int i4, int i5) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i4, i5);
        ofInt.setDuration(this.f38017G);
        ofInt.setInterpolator(new OvershootInterpolator());
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.harman.jbl.cd_biz_comm.widget.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ElasticScrollView.f(view, valueAnimator);
            }
        });
        F.m(ofInt);
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(View view, ValueAnimator animation) {
        F.p(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        F.n(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        F.m(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = intValue;
        view.setLayoutParams(layoutParams);
    }

    private final ValueAnimator g(final View view, int i4, int i5) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i4, i5);
        ofInt.setDuration(this.f38017G);
        ofInt.setInterpolator(new OvershootInterpolator());
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.harman.jbl.cd_biz_comm.widget.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ElasticScrollView.h(view, valueAnimator);
            }
        });
        F.m(ofInt);
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(View view, ValueAnimator animation) {
        F.p(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        F.n(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        F.m(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = intValue;
        view.setLayoutParams(layoutParams);
    }

    private final void i(MotionEvent motionEvent) {
        int c4 = c(motionEvent);
        if (k(c4) && this.f38019I != null) {
            o(c4);
        }
    }

    private final void j() {
        if (n() && this.f38019I != null) {
            q();
        }
    }

    private final boolean k(int i4) {
        boolean l4;
        if (i4 != 0) {
            if (i4 < 0) {
                l4 = m();
            } else {
                l4 = l();
            }
            if (l4) {
                return true;
            }
        }
        return false;
    }

    private final boolean l() {
        View view = this.f38018H;
        F.m(view);
        if (getScrollY() != Math.max(view.getMeasuredHeight() - getHeight(), 0)) {
            return false;
        }
        return true;
    }

    private final boolean m() {
        if (getScrollY() == 0) {
            return true;
        }
        return false;
    }

    private final boolean n() {
        View view = this.f38019I;
        if (view == null) {
            if (this.f38015E.isEmpty()) {
                return false;
            }
        } else {
            int i4 = this.f38021K;
            F.m(view);
            if (i4 == view.getLayoutParams().height) {
                return false;
            }
        }
        return true;
    }

    private final void o(int i4) {
        View view = this.f38019I;
        F.m(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = Math.max(0, layoutParams.height - i4);
        layoutParams.width = Math.max(0, layoutParams.width - i4);
        View view2 = this.f38019I;
        F.m(view2);
        view2.setLayoutParams(layoutParams);
    }

    private final void p(View view) {
        View view2 = this.f38019I;
        if (view2 != null) {
            F.m(view2);
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            layoutParams.height = this.f38021K;
            layoutParams.width = this.f38022L;
            View view3 = this.f38019I;
            F.m(view3);
            view3.setLayoutParams(layoutParams);
        }
        if (view != null) {
            this.f38021K = view.getLayoutParams().height;
            this.f38022L = view.getLayoutParams().width;
        }
    }

    private final void q() {
        View view = this.f38019I;
        F.m(view);
        ValueAnimator e4 = e(view, view.getHeight(), this.f38021K);
        View view2 = this.f38019I;
        F.m(view2);
        ValueAnimator g4 = g(view2, view2.getWidth(), this.f38022L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(e4).with(g4);
        animatorSet.start();
    }

    public final float getDampness() {
        return this.f38016F;
    }

    @l3.e
    public final View getElasticView() {
        return this.f38019I;
    }

    public final int getResetDelay() {
        return this.f38017G;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() == 0) {
            return;
        }
        this.f38018H = getChildAt(0);
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(@l3.d MotionEvent ev) {
        F.p(ev, "ev");
        if (this.f38018H != null) {
            d(ev);
        }
        return super.onTouchEvent(ev);
    }

    public final void setDampness(float f4) {
        this.f38016F = f4;
    }

    public final void setElasticView(@l3.e View view) {
        p(view);
        this.f38019I = view;
    }

    public final void setResetDelay(int i4) {
        this.f38017G = i4;
    }

    public ElasticScrollView(@l3.e Context context, @l3.e AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38015E = new Rect();
        this.f38016F = 2.0f;
        this.f38017G = 200;
    }

    public ElasticScrollView(@l3.e Context context, @l3.e AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f38015E = new Rect();
        this.f38016F = 2.0f;
        this.f38017G = 200;
    }

    public ElasticScrollView(@l3.e Context context, @l3.e AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f38015E = new Rect();
        this.f38016F = 2.0f;
        this.f38017G = 200;
    }
}
