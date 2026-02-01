package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import androidx.core.view.C0823k0;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
@i0
/* renamed from: androidx.recyclerview.widget.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0966l extends RecyclerView.n implements RecyclerView.s {

    /* renamed from: D, reason: collision with root package name */
    private static final int f18130D = 0;

    /* renamed from: E, reason: collision with root package name */
    private static final int f18131E = 1;

    /* renamed from: F, reason: collision with root package name */
    private static final int f18132F = 2;

    /* renamed from: G, reason: collision with root package name */
    private static final int f18133G = 0;

    /* renamed from: H, reason: collision with root package name */
    private static final int f18134H = 1;

    /* renamed from: I, reason: collision with root package name */
    private static final int f18135I = 2;

    /* renamed from: J, reason: collision with root package name */
    private static final int f18136J = 0;

    /* renamed from: K, reason: collision with root package name */
    private static final int f18137K = 1;

    /* renamed from: L, reason: collision with root package name */
    private static final int f18138L = 2;

    /* renamed from: M, reason: collision with root package name */
    private static final int f18139M = 3;

    /* renamed from: N, reason: collision with root package name */
    private static final int f18140N = 500;

    /* renamed from: O, reason: collision with root package name */
    private static final int f18141O = 1500;

    /* renamed from: P, reason: collision with root package name */
    private static final int f18142P = 1200;

    /* renamed from: Q, reason: collision with root package name */
    private static final int f18143Q = 500;

    /* renamed from: R, reason: collision with root package name */
    private static final int f18144R = 255;

    /* renamed from: S, reason: collision with root package name */
    private static final int[] f18145S = {R.attr.state_pressed};

    /* renamed from: T, reason: collision with root package name */
    private static final int[] f18146T = new int[0];

    /* renamed from: A, reason: collision with root package name */
    int f18147A;

    /* renamed from: B, reason: collision with root package name */
    private final Runnable f18148B;

    /* renamed from: C, reason: collision with root package name */
    private final RecyclerView.t f18149C;

    /* renamed from: a, reason: collision with root package name */
    private final int f18150a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18151b;

    /* renamed from: c, reason: collision with root package name */
    final StateListDrawable f18152c;

    /* renamed from: d, reason: collision with root package name */
    final Drawable f18153d;

    /* renamed from: e, reason: collision with root package name */
    private final int f18154e;

    /* renamed from: f, reason: collision with root package name */
    private final int f18155f;

    /* renamed from: g, reason: collision with root package name */
    private final StateListDrawable f18156g;

    /* renamed from: h, reason: collision with root package name */
    private final Drawable f18157h;

    /* renamed from: i, reason: collision with root package name */
    private final int f18158i;

    /* renamed from: j, reason: collision with root package name */
    private final int f18159j;

    /* renamed from: k, reason: collision with root package name */
    @i0
    int f18160k;

    /* renamed from: l, reason: collision with root package name */
    @i0
    int f18161l;

    /* renamed from: m, reason: collision with root package name */
    @i0
    float f18162m;

    /* renamed from: n, reason: collision with root package name */
    @i0
    int f18163n;

    /* renamed from: o, reason: collision with root package name */
    @i0
    int f18164o;

    /* renamed from: p, reason: collision with root package name */
    @i0
    float f18165p;

    /* renamed from: s, reason: collision with root package name */
    private RecyclerView f18168s;

    /* renamed from: z, reason: collision with root package name */
    final ValueAnimator f18175z;

    /* renamed from: q, reason: collision with root package name */
    private int f18166q = 0;

    /* renamed from: r, reason: collision with root package name */
    private int f18167r = 0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f18169t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f18170u = false;

    /* renamed from: v, reason: collision with root package name */
    private int f18171v = 0;

    /* renamed from: w, reason: collision with root package name */
    private int f18172w = 0;

    /* renamed from: x, reason: collision with root package name */
    private final int[] f18173x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    private final int[] f18174y = new int[2];

    /* renamed from: androidx.recyclerview.widget.l$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0966l.this.w(500);
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$b */
    /* loaded from: classes.dex */
    class b extends RecyclerView.t {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i4, int i5) {
            C0966l.this.J(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$c */
    /* loaded from: classes.dex */
    private class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f18178a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f18178a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f18178a) {
                this.f18178a = false;
                return;
            }
            if (((Float) C0966l.this.f18175z.getAnimatedValue()).floatValue() == 0.0f) {
                C0966l c0966l = C0966l.this;
                c0966l.f18147A = 0;
                c0966l.G(0);
            } else {
                C0966l c0966l2 = C0966l.this;
                c0966l2.f18147A = 2;
                c0966l2.D();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$d */
    /* loaded from: classes.dex */
    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C0966l.this.f18152c.setAlpha(floatValue);
            C0966l.this.f18153d.setAlpha(floatValue);
            C0966l.this.D();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0966l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i4, int i5, int i6) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f18175z = ofFloat;
        this.f18147A = 0;
        this.f18148B = new a();
        this.f18149C = new b();
        this.f18152c = stateListDrawable;
        this.f18153d = drawable;
        this.f18156g = stateListDrawable2;
        this.f18157h = drawable2;
        this.f18154e = Math.max(i4, stateListDrawable.getIntrinsicWidth());
        this.f18155f = Math.max(i4, drawable.getIntrinsicWidth());
        this.f18158i = Math.max(i4, stateListDrawable2.getIntrinsicWidth());
        this.f18159j = Math.max(i4, drawable2.getIntrinsicWidth());
        this.f18150a = i5;
        this.f18151b = i6;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        l(recyclerView);
    }

    private void E(int i4) {
        m();
        this.f18168s.postDelayed(this.f18148B, i4);
    }

    private int F(float f4, float f5, int[] iArr, int i4, int i5, int i6) {
        int i7 = iArr[1] - iArr[0];
        if (i7 == 0) {
            return 0;
        }
        int i8 = i4 - i6;
        int i9 = (int) (((f5 - f4) / i7) * i8);
        int i10 = i5 + i9;
        if (i10 >= i8 || i10 < 0) {
            return 0;
        }
        return i9;
    }

    private void H() {
        this.f18168s.n(this);
        this.f18168s.q(this);
        this.f18168s.r(this.f18149C);
    }

    private void K(float f4) {
        int[] t3 = t();
        float max = Math.max(t3[0], Math.min(t3[1], f4));
        if (Math.abs(this.f18161l - max) < 2.0f) {
            return;
        }
        int F3 = F(this.f18162m, max, t3, this.f18168s.computeVerticalScrollRange(), this.f18168s.computeVerticalScrollOffset(), this.f18167r);
        if (F3 != 0) {
            this.f18168s.scrollBy(0, F3);
        }
        this.f18162m = max;
    }

    private void m() {
        this.f18168s.removeCallbacks(this.f18148B);
    }

    private void n() {
        this.f18168s.s1(this);
        this.f18168s.v1(this);
        this.f18168s.w1(this.f18149C);
        m();
    }

    private void o(Canvas canvas) {
        int i4 = this.f18167r;
        int i5 = this.f18158i;
        int i6 = this.f18164o;
        int i7 = this.f18163n;
        this.f18156g.setBounds(0, 0, i7, i5);
        this.f18157h.setBounds(0, 0, this.f18166q, this.f18159j);
        canvas.translate(0.0f, i4 - i5);
        this.f18157h.draw(canvas);
        canvas.translate(i6 - (i7 / 2), 0.0f);
        this.f18156g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    private void p(Canvas canvas) {
        int i4 = this.f18166q;
        int i5 = this.f18154e;
        int i6 = i4 - i5;
        int i7 = this.f18161l;
        int i8 = this.f18160k;
        int i9 = i7 - (i8 / 2);
        this.f18152c.setBounds(0, 0, i5, i8);
        this.f18153d.setBounds(0, 0, this.f18155f, this.f18167r);
        if (z()) {
            this.f18153d.draw(canvas);
            canvas.translate(this.f18154e, i9);
            canvas.scale(-1.0f, 1.0f);
            this.f18152c.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            canvas.translate(-this.f18154e, -i9);
            return;
        }
        canvas.translate(i6, 0.0f);
        this.f18153d.draw(canvas);
        canvas.translate(0.0f, i9);
        this.f18152c.draw(canvas);
        canvas.translate(-i6, -i9);
    }

    private int[] q() {
        int[] iArr = this.f18174y;
        int i4 = this.f18151b;
        iArr[0] = i4;
        iArr[1] = this.f18166q - i4;
        return iArr;
    }

    private int[] t() {
        int[] iArr = this.f18173x;
        int i4 = this.f18151b;
        iArr[0] = i4;
        iArr[1] = this.f18167r - i4;
        return iArr;
    }

    private void x(float f4) {
        int[] q4 = q();
        float max = Math.max(q4[0], Math.min(q4[1], f4));
        if (Math.abs(this.f18164o - max) < 2.0f) {
            return;
        }
        int F3 = F(this.f18165p, max, q4, this.f18168s.computeHorizontalScrollRange(), this.f18168s.computeHorizontalScrollOffset(), this.f18166q);
        if (F3 != 0) {
            this.f18168s.scrollBy(F3, 0);
        }
        this.f18165p = max;
    }

    private boolean z() {
        if (C0823k0.Z(this.f18168s) == 1) {
            return true;
        }
        return false;
    }

    @i0
    boolean A(float f4, float f5) {
        if (f5 >= this.f18167r - this.f18158i) {
            int i4 = this.f18164o;
            int i5 = this.f18163n;
            if (f4 >= i4 - (i5 / 2) && f4 <= i4 + (i5 / 2)) {
                return true;
            }
        }
        return false;
    }

    @i0
    boolean B(float f4, float f5) {
        if (!z() ? f4 >= this.f18166q - this.f18154e : f4 <= this.f18154e) {
            int i4 = this.f18161l;
            int i5 = this.f18160k;
            if (f5 >= i4 - (i5 / 2) && f5 <= i4 + (i5 / 2)) {
                return true;
            }
        }
        return false;
    }

    @i0
    boolean C() {
        if (this.f18171v == 1) {
            return true;
        }
        return false;
    }

    void D() {
        this.f18168s.invalidate();
    }

    void G(int i4) {
        if (i4 == 2 && this.f18171v != 2) {
            this.f18152c.setState(f18145S);
            m();
        }
        if (i4 == 0) {
            D();
        } else {
            I();
        }
        if (this.f18171v == 2 && i4 != 2) {
            this.f18152c.setState(f18146T);
            E(f18142P);
        } else if (i4 == 1) {
            E(1500);
        }
        this.f18171v = i4;
    }

    public void I() {
        int i4 = this.f18147A;
        if (i4 != 0) {
            if (i4 == 3) {
                this.f18175z.cancel();
            } else {
                return;
            }
        }
        this.f18147A = 1;
        ValueAnimator valueAnimator = this.f18175z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f18175z.setDuration(500L);
        this.f18175z.setStartDelay(0L);
        this.f18175z.start();
    }

    void J(int i4, int i5) {
        boolean z3;
        boolean z4;
        int computeVerticalScrollRange = this.f18168s.computeVerticalScrollRange();
        int i6 = this.f18167r;
        if (computeVerticalScrollRange - i6 > 0 && i6 >= this.f18150a) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f18169t = z3;
        int computeHorizontalScrollRange = this.f18168s.computeHorizontalScrollRange();
        int i7 = this.f18166q;
        if (computeHorizontalScrollRange - i7 > 0 && i7 >= this.f18150a) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f18170u = z4;
        boolean z5 = this.f18169t;
        if (!z5 && !z4) {
            if (this.f18171v != 0) {
                G(0);
                return;
            }
            return;
        }
        if (z5) {
            float f4 = i6;
            this.f18161l = (int) ((f4 * (i5 + (f4 / 2.0f))) / computeVerticalScrollRange);
            this.f18160k = Math.min(i6, (i6 * i6) / computeVerticalScrollRange);
        }
        if (this.f18170u) {
            float f5 = i7;
            this.f18164o = (int) ((f5 * (i4 + (f5 / 2.0f))) / computeHorizontalScrollRange);
            this.f18163n = Math.min(i7, (i7 * i7) / computeHorizontalScrollRange);
        }
        int i8 = this.f18171v;
        if (i8 == 0 || i8 == 1) {
            G(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void a(@N RecyclerView recyclerView, @N MotionEvent motionEvent) {
        if (this.f18171v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean B3 = B(motionEvent.getX(), motionEvent.getY());
            boolean A3 = A(motionEvent.getX(), motionEvent.getY());
            if (B3 || A3) {
                if (A3) {
                    this.f18172w = 1;
                    this.f18165p = (int) motionEvent.getX();
                } else if (B3) {
                    this.f18172w = 2;
                    this.f18162m = (int) motionEvent.getY();
                }
                G(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f18171v == 2) {
            this.f18162m = 0.0f;
            this.f18165p = 0.0f;
            G(1);
            this.f18172w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f18171v == 2) {
            I();
            if (this.f18172w == 1) {
                x(motionEvent.getX());
            }
            if (this.f18172w == 2) {
                K(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean c(@N RecyclerView recyclerView, @N MotionEvent motionEvent) {
        int i4 = this.f18171v;
        if (i4 == 1) {
            boolean B3 = B(motionEvent.getX(), motionEvent.getY());
            boolean A3 = A(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!B3 && !A3) {
                return false;
            }
            if (A3) {
                this.f18172w = 1;
                this.f18165p = (int) motionEvent.getX();
            } else if (B3) {
                this.f18172w = 2;
                this.f18162m = (int) motionEvent.getY();
            }
            G(2);
        } else if (i4 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void e(boolean z3) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.C c4) {
        if (this.f18166q == this.f18168s.getWidth() && this.f18167r == this.f18168s.getHeight()) {
            if (this.f18147A != 0) {
                if (this.f18169t) {
                    p(canvas);
                }
                if (this.f18170u) {
                    o(canvas);
                    return;
                }
                return;
            }
            return;
        }
        this.f18166q = this.f18168s.getWidth();
        this.f18167r = this.f18168s.getHeight();
        G(0);
    }

    public void l(@P RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f18168s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            n();
        }
        this.f18168s = recyclerView;
        if (recyclerView != null) {
            H();
        }
    }

    @i0
    Drawable r() {
        return this.f18156g;
    }

    @i0
    Drawable s() {
        return this.f18157h;
    }

    @i0
    Drawable u() {
        return this.f18152c;
    }

    @i0
    Drawable v() {
        return this.f18153d;
    }

    @i0
    void w(int i4) {
        int i5 = this.f18147A;
        if (i5 != 1) {
            if (i5 != 2) {
                return;
            }
        } else {
            this.f18175z.cancel();
        }
        this.f18147A = 3;
        ValueAnimator valueAnimator = this.f18175z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f18175z.setDuration(i4);
        this.f18175z.start();
    }

    public boolean y() {
        if (this.f18171v == 2) {
            return true;
        }
        return false;
    }
}
