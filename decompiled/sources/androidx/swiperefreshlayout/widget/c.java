package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0571n;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import androidx.core.content.C0669d;
import androidx.core.view.C0823k0;
import androidx.core.view.U;
import androidx.core.view.V;
import androidx.core.view.Y;
import androidx.core.view.Z;
import androidx.core.widget.n;
import com.google.firebase.remoteconfig.l;

/* loaded from: classes.dex */
public class c extends ViewGroup implements Y, U {

    /* renamed from: A0, reason: collision with root package name */
    private static final String f18523A0 = "c";

    /* renamed from: B0, reason: collision with root package name */
    private static final int f18524B0 = 255;

    /* renamed from: C0, reason: collision with root package name */
    private static final int f18525C0 = 76;

    /* renamed from: D0, reason: collision with root package name */
    private static final float f18526D0 = 2.0f;

    /* renamed from: E0, reason: collision with root package name */
    private static final int f18527E0 = -1;

    /* renamed from: F0, reason: collision with root package name */
    private static final float f18528F0 = 0.5f;

    /* renamed from: G0, reason: collision with root package name */
    private static final float f18529G0 = 0.8f;

    /* renamed from: H0, reason: collision with root package name */
    private static final int f18530H0 = 150;

    /* renamed from: I0, reason: collision with root package name */
    private static final int f18531I0 = 300;

    /* renamed from: J0, reason: collision with root package name */
    private static final int f18532J0 = 200;

    /* renamed from: K0, reason: collision with root package name */
    private static final int f18533K0 = 200;

    /* renamed from: L0, reason: collision with root package name */
    private static final int f18534L0 = -328966;

    /* renamed from: M0, reason: collision with root package name */
    private static final int f18535M0 = 64;

    /* renamed from: N0, reason: collision with root package name */
    private static final int[] f18536N0 = {R.attr.enabled};

    /* renamed from: v0, reason: collision with root package name */
    public static final int f18537v0 = 0;

    /* renamed from: w0, reason: collision with root package name */
    public static final int f18538w0 = 1;

    /* renamed from: x0, reason: collision with root package name */
    public static final int f18539x0 = -1;

    /* renamed from: y0, reason: collision with root package name */
    @i0
    static final int f18540y0 = 40;

    /* renamed from: z0, reason: collision with root package name */
    @i0
    static final int f18541z0 = 56;

    /* renamed from: E, reason: collision with root package name */
    private View f18542E;

    /* renamed from: F, reason: collision with root package name */
    j f18543F;

    /* renamed from: G, reason: collision with root package name */
    boolean f18544G;

    /* renamed from: H, reason: collision with root package name */
    private int f18545H;

    /* renamed from: I, reason: collision with root package name */
    private float f18546I;

    /* renamed from: J, reason: collision with root package name */
    private float f18547J;

    /* renamed from: K, reason: collision with root package name */
    private final Z f18548K;

    /* renamed from: L, reason: collision with root package name */
    private final V f18549L;

    /* renamed from: M, reason: collision with root package name */
    private final int[] f18550M;

    /* renamed from: N, reason: collision with root package name */
    private final int[] f18551N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f18552O;

    /* renamed from: P, reason: collision with root package name */
    private int f18553P;

    /* renamed from: Q, reason: collision with root package name */
    int f18554Q;

    /* renamed from: R, reason: collision with root package name */
    private float f18555R;

    /* renamed from: S, reason: collision with root package name */
    private float f18556S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f18557T;

    /* renamed from: U, reason: collision with root package name */
    private int f18558U;

    /* renamed from: V, reason: collision with root package name */
    boolean f18559V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f18560W;

    /* renamed from: a0, reason: collision with root package name */
    private final DecelerateInterpolator f18561a0;

    /* renamed from: b0, reason: collision with root package name */
    androidx.swiperefreshlayout.widget.a f18562b0;

    /* renamed from: c0, reason: collision with root package name */
    private int f18563c0;

    /* renamed from: d0, reason: collision with root package name */
    protected int f18564d0;

    /* renamed from: e0, reason: collision with root package name */
    float f18565e0;

    /* renamed from: f0, reason: collision with root package name */
    protected int f18566f0;

    /* renamed from: g0, reason: collision with root package name */
    int f18567g0;

    /* renamed from: h0, reason: collision with root package name */
    int f18568h0;

    /* renamed from: i0, reason: collision with root package name */
    androidx.swiperefreshlayout.widget.b f18569i0;

    /* renamed from: j0, reason: collision with root package name */
    private Animation f18570j0;

    /* renamed from: k0, reason: collision with root package name */
    private Animation f18571k0;

    /* renamed from: l0, reason: collision with root package name */
    private Animation f18572l0;

    /* renamed from: m0, reason: collision with root package name */
    private Animation f18573m0;

    /* renamed from: n0, reason: collision with root package name */
    private Animation f18574n0;

    /* renamed from: o0, reason: collision with root package name */
    boolean f18575o0;

    /* renamed from: p0, reason: collision with root package name */
    private int f18576p0;

    /* renamed from: q0, reason: collision with root package name */
    boolean f18577q0;

    /* renamed from: r0, reason: collision with root package name */
    private i f18578r0;

    /* renamed from: s0, reason: collision with root package name */
    private Animation.AnimationListener f18579s0;

    /* renamed from: t0, reason: collision with root package name */
    private final Animation f18580t0;

    /* renamed from: u0, reason: collision with root package name */
    private final Animation f18581u0;

    /* loaded from: classes.dex */
    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            c cVar = c.this;
            if (cVar.f18544G) {
                cVar.f18569i0.setAlpha(255);
                c.this.f18569i0.start();
                c cVar2 = c.this;
                if (cVar2.f18575o0 && (jVar = cVar2.f18543F) != null) {
                    jVar.a();
                }
                c cVar3 = c.this;
                cVar3.f18554Q = cVar3.f18562b0.getTop();
                return;
            }
            cVar.x();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends Animation {
        b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f4, Transformation transformation) {
            c.this.setAnimationProgress(f4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0178c extends Animation {
        C0178c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f4, Transformation transformation) {
            c.this.setAnimationProgress(1.0f - f4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends Animation {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f18585E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f18586F;

        d(int i4, int i5) {
            this.f18585E = i4;
            this.f18586F = i5;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f4, Transformation transformation) {
            c.this.f18569i0.setAlpha((int) (this.f18585E + ((this.f18586F - r0) * f4)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Animation.AnimationListener {
        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            c cVar = c.this;
            if (!cVar.f18559V) {
                cVar.F(null);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes.dex */
    class f extends Animation {
        f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f4, Transformation transformation) {
            int i4;
            c cVar = c.this;
            if (!cVar.f18577q0) {
                i4 = cVar.f18567g0 - Math.abs(cVar.f18566f0);
            } else {
                i4 = cVar.f18567g0;
            }
            c cVar2 = c.this;
            c.this.setTargetOffsetTopAndBottom((cVar2.f18564d0 + ((int) ((i4 - r1) * f4))) - cVar2.f18562b0.getTop());
            c.this.f18569i0.v(1.0f - f4);
        }
    }

    /* loaded from: classes.dex */
    class g extends Animation {
        g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f4, Transformation transformation) {
            c.this.q(f4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h extends Animation {
        h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f4, Transformation transformation) {
            c cVar = c.this;
            float f5 = cVar.f18565e0;
            cVar.setAnimationProgress(f5 + ((-f5) * f4));
            c.this.q(f4);
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        boolean a(@N c cVar, @P View view);
    }

    /* loaded from: classes.dex */
    public interface j {
        void a();
    }

    public c(@N Context context) {
        this(context, null);
    }

    private void A(boolean z3, boolean z4) {
        if (this.f18544G != z3) {
            this.f18575o0 = z4;
            l();
            this.f18544G = z3;
            if (z3) {
                h(this.f18554Q, this.f18579s0);
            } else {
                F(this.f18579s0);
            }
        }
    }

    private Animation B(int i4, int i5) {
        d dVar = new d(i4, i5);
        dVar.setDuration(300L);
        this.f18562b0.b(null);
        this.f18562b0.clearAnimation();
        this.f18562b0.startAnimation(dVar);
        return dVar;
    }

    private void C(float f4) {
        float f5 = this.f18556S;
        float f6 = f4 - f5;
        int i4 = this.f18545H;
        if (f6 > i4 && !this.f18557T) {
            this.f18555R = f5 + i4;
            this.f18557T = true;
            this.f18569i0.setAlpha(76);
        }
    }

    private void D() {
        this.f18573m0 = B(this.f18569i0.getAlpha(), 255);
    }

    private void E() {
        this.f18572l0 = B(this.f18569i0.getAlpha(), 76);
    }

    private void G(int i4, Animation.AnimationListener animationListener) {
        this.f18564d0 = i4;
        this.f18565e0 = this.f18562b0.getScaleX();
        h hVar = new h();
        this.f18574n0 = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.f18562b0.b(animationListener);
        }
        this.f18562b0.clearAnimation();
        this.f18562b0.startAnimation(this.f18574n0);
    }

    private void H(Animation.AnimationListener animationListener) {
        this.f18562b0.setVisibility(0);
        this.f18569i0.setAlpha(255);
        b bVar = new b();
        this.f18570j0 = bVar;
        bVar.setDuration(this.f18553P);
        if (animationListener != null) {
            this.f18562b0.b(animationListener);
        }
        this.f18562b0.clearAnimation();
        this.f18562b0.startAnimation(this.f18570j0);
    }

    private void h(int i4, Animation.AnimationListener animationListener) {
        this.f18564d0 = i4;
        this.f18580t0.reset();
        this.f18580t0.setDuration(200L);
        this.f18580t0.setInterpolator(this.f18561a0);
        if (animationListener != null) {
            this.f18562b0.b(animationListener);
        }
        this.f18562b0.clearAnimation();
        this.f18562b0.startAnimation(this.f18580t0);
    }

    private void i(int i4, Animation.AnimationListener animationListener) {
        if (this.f18559V) {
            G(i4, animationListener);
            return;
        }
        this.f18564d0 = i4;
        this.f18581u0.reset();
        this.f18581u0.setDuration(200L);
        this.f18581u0.setInterpolator(this.f18561a0);
        if (animationListener != null) {
            this.f18562b0.b(animationListener);
        }
        this.f18562b0.clearAnimation();
        this.f18562b0.startAnimation(this.f18581u0);
    }

    private void k() {
        this.f18562b0 = new androidx.swiperefreshlayout.widget.a(getContext(), f18534L0);
        androidx.swiperefreshlayout.widget.b bVar = new androidx.swiperefreshlayout.widget.b(getContext());
        this.f18569i0 = bVar;
        bVar.F(1);
        this.f18562b0.setImageDrawable(this.f18569i0);
        this.f18562b0.setVisibility(8);
        addView(this.f18562b0);
    }

    private void l() {
        if (this.f18542E == null) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (!childAt.equals(this.f18562b0)) {
                    this.f18542E = childAt;
                    return;
                }
            }
        }
    }

    private void m(float f4) {
        e eVar;
        if (f4 > this.f18546I) {
            A(true, true);
            return;
        }
        this.f18544G = false;
        this.f18569i0.C(0.0f, 0.0f);
        if (!this.f18559V) {
            eVar = new e();
        } else {
            eVar = null;
        }
        i(this.f18554Q, eVar);
        this.f18569i0.u(false);
    }

    private boolean n(Animation animation) {
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            return true;
        }
        return false;
    }

    private void p(float f4) {
        this.f18569i0.u(true);
        float min = Math.min(1.0f, Math.abs(f4 / this.f18546I));
        float max = (((float) Math.max(min - 0.4d, l.f37524n)) * 5.0f) / 3.0f;
        float abs = Math.abs(f4) - this.f18546I;
        int i4 = this.f18568h0;
        if (i4 <= 0) {
            if (this.f18577q0) {
                i4 = this.f18567g0 - this.f18566f0;
            } else {
                i4 = this.f18567g0;
            }
        }
        float f5 = i4;
        double max2 = Math.max(0.0f, Math.min(abs, f5 * 2.0f) / f5) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i5 = this.f18566f0 + ((int) ((f5 * min) + (f5 * pow * 2.0f)));
        if (this.f18562b0.getVisibility() != 0) {
            this.f18562b0.setVisibility(0);
        }
        if (!this.f18559V) {
            this.f18562b0.setScaleX(1.0f);
            this.f18562b0.setScaleY(1.0f);
        }
        if (this.f18559V) {
            setAnimationProgress(Math.min(1.0f, f4 / this.f18546I));
        }
        if (f4 < this.f18546I) {
            if (this.f18569i0.getAlpha() > 76 && !n(this.f18572l0)) {
                E();
            }
        } else if (this.f18569i0.getAlpha() < 255 && !n(this.f18573m0)) {
            D();
        }
        this.f18569i0.C(0.0f, Math.min(f18529G0, max * f18529G0));
        this.f18569i0.v(Math.min(1.0f, max));
        this.f18569i0.z((((max * 0.4f) - 0.25f) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i5 - this.f18554Q);
    }

    private void setColorViewAlpha(int i4) {
        this.f18562b0.getBackground().setAlpha(i4);
        this.f18569i0.setAlpha(i4);
    }

    private void w(MotionEvent motionEvent) {
        int i4;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f18558U) {
            if (actionIndex == 0) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            this.f18558U = motionEvent.getPointerId(i4);
        }
    }

    void F(Animation.AnimationListener animationListener) {
        C0178c c0178c = new C0178c();
        this.f18571k0 = c0178c;
        c0178c.setDuration(150L);
        this.f18562b0.b(animationListener);
        this.f18562b0.clearAnimation();
        this.f18562b0.startAnimation(this.f18571k0);
    }

    @Override // android.view.View, androidx.core.view.U
    public boolean dispatchNestedFling(float f4, float f5, boolean z3) {
        return this.f18549L.a(f4, f5, z3);
    }

    @Override // android.view.View, androidx.core.view.U
    public boolean dispatchNestedPreFling(float f4, float f5) {
        return this.f18549L.b(f4, f5);
    }

    @Override // android.view.View, androidx.core.view.U
    public boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return this.f18549L.c(i4, i5, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.U
    public boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return this.f18549L.f(i4, i5, i6, i7, iArr);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i4, int i5) {
        int i6 = this.f18563c0;
        if (i6 < 0) {
            return i5;
        }
        if (i5 == i4 - 1) {
            return i6;
        }
        if (i5 >= i6) {
            return i5 + 1;
        }
        return i5;
    }

    @Override // android.view.ViewGroup, androidx.core.view.Y
    public int getNestedScrollAxes() {
        return this.f18548K.a();
    }

    public int getProgressCircleDiameter() {
        return this.f18576p0;
    }

    public int getProgressViewEndOffset() {
        return this.f18567g0;
    }

    public int getProgressViewStartOffset() {
        return this.f18566f0;
    }

    @Override // android.view.View, androidx.core.view.U
    public boolean hasNestedScrollingParent() {
        return this.f18549L.k();
    }

    @Override // android.view.View, androidx.core.view.U
    public boolean isNestedScrollingEnabled() {
        return this.f18549L.m();
    }

    public boolean j() {
        i iVar = this.f18578r0;
        if (iVar != null) {
            return iVar.a(this, this.f18542E);
        }
        View view = this.f18542E;
        if (view instanceof ListView) {
            return n.a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    public boolean o() {
        return this.f18544G;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        l();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f18560W && actionMasked == 0) {
            this.f18560W = false;
        }
        if (!isEnabled() || this.f18560W || j() || this.f18544G || this.f18552O) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            w(motionEvent);
                        }
                    }
                } else {
                    int i4 = this.f18558U;
                    if (i4 == -1) {
                        Log.e(f18523A0, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i4);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    C(motionEvent.getY(findPointerIndex));
                }
            }
            this.f18557T = false;
            this.f18558U = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f18566f0 - this.f18562b0.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f18558U = pointerId;
            this.f18557T = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f18556S = motionEvent.getY(findPointerIndex2);
        }
        return this.f18557T;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f18542E == null) {
            l();
        }
        View view = this.f18542E;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f18562b0.getMeasuredWidth();
        int measuredHeight2 = this.f18562b0.getMeasuredHeight();
        int i8 = measuredWidth / 2;
        int i9 = measuredWidth2 / 2;
        int i10 = this.f18554Q;
        this.f18562b0.layout(i8 - i9, i10, i8 + i9, measuredHeight2 + i10);
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f18542E == null) {
            l();
        }
        View view = this.f18542E;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f18562b0.measure(View.MeasureSpec.makeMeasureSpec(this.f18576p0, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f18576p0, 1073741824));
        this.f18563c0 = -1;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            if (getChildAt(i6) == this.f18562b0) {
                this.f18563c0 = i6;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.Y
    public boolean onNestedFling(View view, float f4, float f5, boolean z3) {
        return dispatchNestedFling(f4, f5, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.Y
    public boolean onNestedPreFling(View view, float f4, float f5) {
        return dispatchNestedPreFling(f4, f5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.Y
    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        if (i5 > 0) {
            float f4 = this.f18547J;
            if (f4 > 0.0f) {
                float f5 = i5;
                if (f5 > f4) {
                    iArr[1] = i5 - ((int) f4);
                    this.f18547J = 0.0f;
                } else {
                    this.f18547J = f4 - f5;
                    iArr[1] = i5;
                }
                p(this.f18547J);
            }
        }
        if (this.f18577q0 && i5 > 0 && this.f18547J == 0.0f && Math.abs(i5 - iArr[1]) > 0) {
            this.f18562b0.setVisibility(8);
        }
        int[] iArr2 = this.f18550M;
        if (dispatchNestedPreScroll(i4 - iArr[0], i5 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.Y
    public void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        dispatchNestedScroll(i4, i5, i6, i7, this.f18551N);
        if (i7 + this.f18551N[1] < 0 && !j()) {
            float abs = this.f18547J + Math.abs(r11);
            this.f18547J = abs;
            p(abs);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.Y
    public void onNestedScrollAccepted(View view, View view2, int i4) {
        this.f18548K.b(view, view2, i4);
        startNestedScroll(i4 & 2);
        this.f18547J = 0.0f;
        this.f18552O = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.Y
    public boolean onStartNestedScroll(View view, View view2, int i4) {
        if (isEnabled() && !this.f18560W && !this.f18544G && (i4 & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.Y
    public void onStopNestedScroll(View view) {
        this.f18548K.d(view);
        this.f18552O = false;
        float f4 = this.f18547J;
        if (f4 > 0.0f) {
            m(f4);
            this.f18547J = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f18560W && actionMasked == 0) {
            this.f18560W = false;
        }
        if (!isEnabled() || this.f18560W || j() || this.f18544G || this.f18552O) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        return false;
                    }
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            w(motionEvent);
                        }
                    } else {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex < 0) {
                            Log.e(f18523A0, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                            return false;
                        }
                        this.f18558U = motionEvent.getPointerId(actionIndex);
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f18558U);
                    if (findPointerIndex < 0) {
                        Log.e(f18523A0, "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    float y3 = motionEvent.getY(findPointerIndex);
                    C(y3);
                    if (this.f18557T) {
                        float f4 = (y3 - this.f18555R) * 0.5f;
                        if (f4 <= 0.0f) {
                            return false;
                        }
                        p(f4);
                    }
                }
            } else {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f18558U);
                if (findPointerIndex2 < 0) {
                    Log.e(f18523A0, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f18557T) {
                    float y4 = (motionEvent.getY(findPointerIndex2) - this.f18555R) * 0.5f;
                    this.f18557T = false;
                    m(y4);
                }
                this.f18558U = -1;
                return false;
            }
        } else {
            this.f18558U = motionEvent.getPointerId(0);
            this.f18557T = false;
        }
        return true;
    }

    void q(float f4) {
        setTargetOffsetTopAndBottom((this.f18564d0 + ((int) ((this.f18566f0 - r0) * f4))) - this.f18562b0.getTop());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z3) {
        View view = this.f18542E;
        if (view == null || C0823k0.W0(view)) {
            super.requestDisallowInterceptTouchEvent(z3);
        }
    }

    void setAnimationProgress(float f4) {
        this.f18562b0.setScaleX(f4);
        this.f18562b0.setScaleY(f4);
    }

    @Deprecated
    public void setColorScheme(@InterfaceC0571n int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(@InterfaceC0569l int... iArr) {
        l();
        this.f18569i0.y(iArr);
    }

    public void setColorSchemeResources(@InterfaceC0571n int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            iArr2[i4] = C0669d.f(context, iArr[i4]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i4) {
        this.f18546I = i4;
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        if (!z3) {
            x();
        }
    }

    @Override // android.view.View, androidx.core.view.U
    public void setNestedScrollingEnabled(boolean z3) {
        this.f18549L.p(z3);
    }

    public void setOnChildScrollUpCallback(@P i iVar) {
        this.f18578r0 = iVar;
    }

    public void setOnRefreshListener(@P j jVar) {
        this.f18543F = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i4) {
        setProgressBackgroundColorSchemeResource(i4);
    }

    public void setProgressBackgroundColorSchemeColor(@InterfaceC0569l int i4) {
        this.f18562b0.setBackgroundColor(i4);
    }

    public void setProgressBackgroundColorSchemeResource(@InterfaceC0571n int i4) {
        setProgressBackgroundColorSchemeColor(C0669d.f(getContext(), i4));
    }

    public void setRefreshing(boolean z3) {
        int i4;
        if (z3 && this.f18544G != z3) {
            this.f18544G = z3;
            if (!this.f18577q0) {
                i4 = this.f18567g0 + this.f18566f0;
            } else {
                i4 = this.f18567g0;
            }
            setTargetOffsetTopAndBottom(i4 - this.f18554Q);
            this.f18575o0 = false;
            H(this.f18579s0);
            return;
        }
        A(z3, false);
    }

    public void setSize(int i4) {
        if (i4 != 0 && i4 != 1) {
            return;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        if (i4 == 0) {
            this.f18576p0 = (int) (displayMetrics.density * 56.0f);
        } else {
            this.f18576p0 = (int) (displayMetrics.density * 40.0f);
        }
        this.f18562b0.setImageDrawable(null);
        this.f18569i0.F(i4);
        this.f18562b0.setImageDrawable(this.f18569i0);
    }

    public void setSlingshotDistance(@androidx.annotation.U int i4) {
        this.f18568h0 = i4;
    }

    void setTargetOffsetTopAndBottom(int i4) {
        this.f18562b0.bringToFront();
        C0823k0.f1(this.f18562b0, i4);
        this.f18554Q = this.f18562b0.getTop();
    }

    @Override // android.view.View, androidx.core.view.U
    public boolean startNestedScroll(int i4) {
        return this.f18549L.r(i4);
    }

    @Override // android.view.View, androidx.core.view.U
    public void stopNestedScroll() {
        this.f18549L.t();
    }

    void x() {
        this.f18562b0.clearAnimation();
        this.f18569i0.stop();
        this.f18562b0.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f18559V) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f18566f0 - this.f18554Q);
        }
        this.f18554Q = this.f18562b0.getTop();
    }

    public void y(boolean z3, int i4) {
        this.f18567g0 = i4;
        this.f18559V = z3;
        this.f18562b0.invalidate();
    }

    public void z(boolean z3, int i4, int i5) {
        this.f18559V = z3;
        this.f18566f0 = i4;
        this.f18567g0 = i5;
        this.f18577q0 = true;
        x();
        this.f18544G = false;
    }

    public c(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18544G = false;
        this.f18546I = -1.0f;
        this.f18550M = new int[2];
        this.f18551N = new int[2];
        this.f18558U = -1;
        this.f18563c0 = -1;
        this.f18579s0 = new a();
        this.f18580t0 = new f();
        this.f18581u0 = new g();
        this.f18545H = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f18553P = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f18561a0 = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f18576p0 = (int) (displayMetrics.density * 40.0f);
        k();
        setChildrenDrawingOrderEnabled(true);
        int i4 = (int) (displayMetrics.density * 64.0f);
        this.f18567g0 = i4;
        this.f18546I = i4;
        this.f18548K = new Z(this);
        this.f18549L = new V(this);
        setNestedScrollingEnabled(true);
        int i5 = -this.f18576p0;
        this.f18554Q = i5;
        this.f18566f0 = i5;
        q(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f18536N0);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }
}
