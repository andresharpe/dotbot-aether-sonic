package com.harman.jbl.partybox.ui.customviews.swipe;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.util.Property;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.N;
import androidx.recyclerview.widget.n;

/* loaded from: classes2.dex */
public class a implements com.harman.jbl.partybox.ui.customviews.swipe.e {

    /* renamed from: o, reason: collision with root package name */
    public static final int f42829o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static final int f42830p = 1;

    /* renamed from: q, reason: collision with root package name */
    public static final int f42831q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static final int f42832r = 1;

    /* renamed from: s, reason: collision with root package name */
    private static final int f42833s = 20;

    /* renamed from: t, reason: collision with root package name */
    private static final String f42834t = "a";

    /* renamed from: u, reason: collision with root package name */
    private static final int f42835u = 2;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f42836a;

    /* renamed from: b, reason: collision with root package name */
    private final int f42837b;

    /* renamed from: c, reason: collision with root package name */
    private final int f42838c;

    /* renamed from: d, reason: collision with root package name */
    private final g f42839d;

    /* renamed from: e, reason: collision with root package name */
    private final Activity f42840e;

    /* renamed from: f, reason: collision with root package name */
    private final FrameLayout f42841f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f42842g;

    /* renamed from: h, reason: collision with root package name */
    private float f42843h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f42844i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f42845j;

    /* renamed from: k, reason: collision with root package name */
    private float f42846k;

    /* renamed from: l, reason: collision with root package name */
    private int f42847l;

    /* renamed from: m, reason: collision with root package name */
    private AnimatorSet f42848m;

    /* renamed from: n, reason: collision with root package name */
    private com.harman.jbl.partybox.ui.customviews.swipe.d f42849n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.harman.jbl.partybox.ui.customviews.swipe.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0370a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f42850a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f42851b;

        C0370a(boolean z3, int i4) {
            this.f42850a = z3;
            this.f42851b = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            T1.a.a(a.f42834t + "animation fact: " + valueAnimator.getAnimatedFraction() + ",slideCanceled: " + this.f42850a + ",mDistanceX: " + a.this.f42846k + ",width: " + this.f42851b);
            if (a.this.f42849n != null) {
                if (!this.f42850a) {
                    a.this.f42849n.d(0, a.this.f42846k + ((this.f42851b - a.this.f42846k) * valueAnimator.getAnimatedFraction()));
                } else {
                    a.this.f42849n.d(1, a.this.f42846k * (1.0f - valueAnimator.getAnimatedFraction()));
                }
                if (valueAnimator.getAnimatedFraction() >= 1.0f) {
                    valueAnimator.removeAllUpdateListeners();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f42853a;

        b(boolean z3) {
            this.f42853a = z3;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            animator.removeAllListeners();
            a.this.f42848m.cancel();
            if (this.f42853a) {
                a.this.q();
                return;
            }
            a.this.f42849n.f();
            a.this.f42840e.finish();
            a.this.f42840e.overridePendingTransition(0, 0);
            com.harman.jbl.partybox.lifecycle.b.e().h(a.this.f42840e);
        }
    }

    /* loaded from: classes2.dex */
    class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f42855a;

        c(int i4) {
            this.f42855a = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (a.this.f42849n != null) {
                a.this.f42849n.d(0, a.this.f42846k + ((this.f42855a - a.this.f42846k) * valueAnimator.getAnimatedFraction()));
            }
            if (valueAnimator.getAnimatedFraction() >= 1.0f) {
                valueAnimator.removeAllUpdateListeners();
            }
        }
    }

    /* loaded from: classes2.dex */
    class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            animator.removeAllListeners();
            a.this.f42848m.cancel();
            a.this.f42849n.f();
            a.this.f42840e.finish();
            a.this.f42840e.overridePendingTransition(0, 0);
            com.harman.jbl.partybox.lifecycle.b.e().h(a.this.f42840e);
        }
    }

    /* loaded from: classes2.dex */
    class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f42858a;

        e(int i4) {
            this.f42858a = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (a.this.f42849n != null) {
                a.this.f42849n.d(1, (float) (a.this.f42846k + ((this.f42858a - a.this.f42846k) * (1.0d - valueAnimator.getAnimatedFraction()))));
            }
            if (valueAnimator.getAnimatedFraction() >= 1.0f) {
                valueAnimator.removeAllUpdateListeners();
            }
        }
    }

    /* loaded from: classes2.dex */
    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            animator.removeAllListeners();
            a.this.f42848m.cancel();
            a.this.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class g {

        /* renamed from: a, reason: collision with root package name */
        private Activity f42861a;

        /* renamed from: b, reason: collision with root package name */
        private com.harman.jbl.partybox.ui.customviews.swipe.c f42862b;

        /* JADX INFO: Access modifiers changed from: private */
        public boolean e() {
            if (a.this.f42841f.getChildCount() == 0) {
                this.f42861a = null;
                this.f42862b = null;
                return false;
            }
            Activity f4 = com.harman.jbl.partybox.lifecycle.b.e().f();
            T1.a.a(a.f42834t + " previous activity: " + f4 + ",mActivity: " + a.this.f42840e);
            if (f4 != null && !f4.getClass().isAssignableFrom(a.this.f42840e.getClass())) {
                this.f42861a = f4;
            } else {
                Activity f5 = com.harman.jbl.partybox.lifecycle.b.e().f();
                if (f5 != null && !f5.getClass().isAssignableFrom(a.this.f42840e.getClass())) {
                    this.f42861a = f5;
                } else {
                    this.f42862b = null;
                    return false;
                }
            }
            ComponentCallbacks2 componentCallbacks2 = this.f42861a;
            if (!(componentCallbacks2 instanceof com.harman.jbl.partybox.ui.customviews.swipe.d) || ((com.harman.jbl.partybox.ui.customviews.swipe.d) componentCallbacks2).c()) {
                FrameLayout n4 = a.this.n(this.f42861a);
                if (n4 != null && n4.getChildCount() != 0) {
                    View childAt = n4.getChildAt(0);
                    com.harman.jbl.partybox.ui.customviews.swipe.c cVar = new com.harman.jbl.partybox.ui.customviews.swipe.c(this.f42861a);
                    this.f42862b = cVar;
                    cVar.a(childAt);
                    a.this.f42841f.addView(this.f42862b, 0, new FrameLayout.LayoutParams(childAt.getMeasuredWidth(), childAt.getMeasuredHeight()));
                    return true;
                }
                this.f42861a = null;
                this.f42862b = null;
                return false;
            }
            this.f42861a = null;
            this.f42862b = null;
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public View f() {
            int i4;
            if (this.f42862b != null) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            return a.this.f42841f.getChildAt(i4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g() {
            com.harman.jbl.partybox.ui.customviews.swipe.c cVar = this.f42862b;
            if (cVar != null) {
                cVar.a(null);
                a.this.f42841f.removeView(this.f42862b);
                this.f42862b = null;
            }
            this.f42861a = null;
        }

        private g() {
        }
    }

    public a(@N com.harman.jbl.partybox.ui.customviews.swipe.d dVar) {
        this.f42849n = dVar;
        Activity a4 = dVar.a();
        this.f42840e = a4;
        this.f42839d = new g();
        this.f42836a = dVar.e();
        this.f42841f = n(a4);
        this.f42837b = ViewConfiguration.get(a4).getScaledTouchSlop();
        this.f42838c = (int) ((a4.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f42847l = dVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FrameLayout n(Activity activity) {
        return (FrameLayout) activity.findViewById(R.id.content);
    }

    private void o() {
        int i4 = this.f42840e.getResources().getDisplayMetrics().widthPixels;
        float f4 = this.f42846k;
        if (f4 == 0.0f) {
            q();
        } else if (f4 > i4 / 4) {
            s(false);
        } else {
            s(true);
        }
    }

    private void p(float f4) {
        int i4 = this.f42840e.getResources().getDisplayMetrics().widthPixels;
        com.harman.jbl.partybox.ui.customviews.swipe.c cVar = this.f42839d.f42862b;
        View f5 = this.f42839d.f();
        if (cVar != null && f5 != null) {
            T1.a.a(f42834t + "curPointX ..." + f4);
            if (this.f42847l == 0) {
                float f6 = f4 - this.f42843h;
                this.f42843h = f4;
                float f7 = this.f42846k + f6;
                this.f42846k = f7;
                if (f7 < 0.0f) {
                    this.f42846k = 0.0f;
                }
                cVar.setX((-i4) + this.f42846k);
                f5.setX(this.f42846k);
                com.harman.jbl.partybox.ui.customviews.swipe.d dVar = this.f42849n;
                if (dVar != null) {
                    dVar.d(2, this.f42846k);
                    return;
                }
                return;
            }
            float f8 = this.f42843h - f4;
            this.f42843h = f4;
            float f9 = this.f42846k + f8;
            this.f42846k = f9;
            if (f9 < 0.0f) {
                this.f42846k = 0.0f;
            }
            cVar.setX(i4 - this.f42846k);
            f5.setX(-this.f42846k);
            com.harman.jbl.partybox.ui.customviews.swipe.d dVar2 = this.f42849n;
            if (dVar2 != null) {
                dVar2.d(2, -this.f42846k);
                return;
            }
            return;
        }
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        this.f42846k = 0.0f;
        this.f42845j = false;
        this.f42844i = false;
        this.f42839d.g();
    }

    private void r(long j4, boolean z3, boolean z4, float f4, float f5, float f6, float f7, ValueAnimator.AnimatorUpdateListener animatorUpdateListener, Animator.AnimatorListener animatorListener) {
        if (z3 || this.f42839d.e()) {
            com.harman.jbl.partybox.ui.customviews.swipe.c cVar = this.f42839d.f42862b;
            View f8 = this.f42839d.f();
            if (cVar != null && f8 != null) {
                com.harman.jbl.partybox.ui.customviews.swipe.d dVar = this.f42849n;
                if (dVar != null) {
                    dVar.g(false);
                }
                DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(2.0f);
                AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator(1.5f);
                ObjectAnimator objectAnimator = new ObjectAnimator();
                if (z4) {
                    objectAnimator.setInterpolator(decelerateInterpolator);
                } else {
                    objectAnimator.setInterpolator(accelerateInterpolator);
                }
                Property property = View.TRANSLATION_X;
                objectAnimator.setProperty(property);
                objectAnimator.setFloatValues(f4, f5);
                objectAnimator.setTarget(cVar);
                ObjectAnimator objectAnimator2 = new ObjectAnimator();
                if (z4) {
                    objectAnimator2.setInterpolator(decelerateInterpolator);
                } else {
                    objectAnimator2.setInterpolator(accelerateInterpolator);
                }
                objectAnimator2.setProperty(property);
                objectAnimator2.addUpdateListener(animatorUpdateListener);
                objectAnimator2.setFloatValues(f6, f7);
                objectAnimator2.setTarget(f8);
                AnimatorSet animatorSet = new AnimatorSet();
                this.f42848m = animatorSet;
                animatorSet.setDuration(j4);
                this.f42848m.playTogether(objectAnimator, objectAnimator2);
                this.f42848m.addListener(animatorListener);
                this.f42848m.start();
                this.f42844i = true;
            }
        }
    }

    private void s(boolean z3) {
        boolean z4;
        float f4;
        float f5;
        float f6;
        long j4;
        int i4 = this.f42840e.getResources().getDisplayMetrics().widthPixels;
        int i5 = 0;
        if (this.f42847l == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            f4 = this.f42846k;
            f5 = i4;
        } else {
            f4 = i4;
            f5 = this.f42846k;
        }
        float f7 = f4 - f5;
        if (z3) {
            f6 = -i4;
        } else {
            f6 = 0.0f;
        }
        float f8 = f6;
        float f9 = this.f42846k;
        if (!z4) {
            f9 = -f9;
        }
        float f10 = f9;
        if (z4) {
            if (!z3) {
                i5 = i4;
            }
        } else if (!z3) {
            i5 = -i4;
        }
        float f11 = i5;
        if (z3) {
            j4 = 150;
        } else {
            j4 = 300;
        }
        r(j4, true, true, f7, f8, f10, f11, new C0370a(z3, i4), new b(z3));
    }

    @Override // com.harman.jbl.partybox.ui.customviews.swipe.e
    public boolean a() {
        return this.f42844i;
    }

    @Override // com.harman.jbl.partybox.ui.customviews.swipe.e
    public void b(boolean z3) {
        boolean z4;
        float f4;
        float f5;
        int i4 = this.f42840e.getResources().getDisplayMetrics().widthPixels;
        if (this.f42847l == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            f4 = -i4;
        } else {
            f4 = i4;
        }
        float f6 = f4;
        if (z4) {
            f5 = i4;
        } else {
            f5 = -i4;
        }
        r(n.f.f18255b, false, z3, 0.0f, f6, f5, 0.0f, new e(i4), new f());
    }

    @Override // com.harman.jbl.partybox.ui.customviews.swipe.e
    public void c() {
        boolean z3;
        float f4;
        float f5;
        int i4 = this.f42840e.getResources().getDisplayMetrics().widthPixels;
        if (this.f42847l == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            f4 = -i4;
        } else {
            f4 = i4;
        }
        float f6 = f4;
        if (z3) {
            f5 = i4;
        } else {
            f5 = -i4;
        }
        r(200L, false, false, f6, 0.0f, 0.0f, f5, new c(i4), new d());
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0125 A[RETURN] */
    @Override // com.harman.jbl.partybox.ui.customviews.swipe.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(@androidx.annotation.N android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.customviews.swipe.a.d(android.view.MotionEvent):boolean");
    }

    @Override // com.harman.jbl.partybox.ui.customviews.swipe.e
    public void e() {
        AnimatorSet animatorSet = this.f42848m;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}
