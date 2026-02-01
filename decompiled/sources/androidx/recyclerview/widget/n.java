package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import androidx.core.view.C0823k0;
import androidx.recyclerview.widget.RecyclerView;
import b0.C1002a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class n extends RecyclerView.n implements RecyclerView.q {

    /* renamed from: E, reason: collision with root package name */
    public static final int f18196E = 1;

    /* renamed from: F, reason: collision with root package name */
    public static final int f18197F = 2;

    /* renamed from: G, reason: collision with root package name */
    public static final int f18198G = 4;

    /* renamed from: H, reason: collision with root package name */
    public static final int f18199H = 8;

    /* renamed from: I, reason: collision with root package name */
    public static final int f18200I = 16;

    /* renamed from: J, reason: collision with root package name */
    public static final int f18201J = 32;

    /* renamed from: K, reason: collision with root package name */
    public static final int f18202K = 0;

    /* renamed from: L, reason: collision with root package name */
    public static final int f18203L = 1;

    /* renamed from: M, reason: collision with root package name */
    public static final int f18204M = 2;

    /* renamed from: N, reason: collision with root package name */
    public static final int f18205N = 2;

    /* renamed from: O, reason: collision with root package name */
    public static final int f18206O = 4;

    /* renamed from: P, reason: collision with root package name */
    public static final int f18207P = 8;

    /* renamed from: Q, reason: collision with root package name */
    private static final String f18208Q = "ItemTouchHelper";

    /* renamed from: R, reason: collision with root package name */
    private static final boolean f18209R = false;

    /* renamed from: S, reason: collision with root package name */
    private static final int f18210S = -1;

    /* renamed from: T, reason: collision with root package name */
    static final int f18211T = 8;

    /* renamed from: U, reason: collision with root package name */
    private static final int f18212U = 255;

    /* renamed from: V, reason: collision with root package name */
    static final int f18213V = 65280;

    /* renamed from: W, reason: collision with root package name */
    static final int f18214W = 16711680;

    /* renamed from: X, reason: collision with root package name */
    private static final int f18215X = 1000;

    /* renamed from: A, reason: collision with root package name */
    private g f18216A;

    /* renamed from: C, reason: collision with root package name */
    private Rect f18218C;

    /* renamed from: D, reason: collision with root package name */
    private long f18219D;

    /* renamed from: d, reason: collision with root package name */
    float f18223d;

    /* renamed from: e, reason: collision with root package name */
    float f18224e;

    /* renamed from: f, reason: collision with root package name */
    private float f18225f;

    /* renamed from: g, reason: collision with root package name */
    private float f18226g;

    /* renamed from: h, reason: collision with root package name */
    float f18227h;

    /* renamed from: i, reason: collision with root package name */
    float f18228i;

    /* renamed from: j, reason: collision with root package name */
    private float f18229j;

    /* renamed from: k, reason: collision with root package name */
    private float f18230k;

    /* renamed from: m, reason: collision with root package name */
    @N
    f f18232m;

    /* renamed from: o, reason: collision with root package name */
    int f18234o;

    /* renamed from: q, reason: collision with root package name */
    private int f18236q;

    /* renamed from: r, reason: collision with root package name */
    RecyclerView f18237r;

    /* renamed from: t, reason: collision with root package name */
    VelocityTracker f18239t;

    /* renamed from: u, reason: collision with root package name */
    private List<RecyclerView.F> f18240u;

    /* renamed from: v, reason: collision with root package name */
    private List<Integer> f18241v;

    /* renamed from: z, reason: collision with root package name */
    androidx.core.view.B f18245z;

    /* renamed from: a, reason: collision with root package name */
    final List<View> f18220a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final float[] f18221b = new float[2];

    /* renamed from: c, reason: collision with root package name */
    RecyclerView.F f18222c = null;

    /* renamed from: l, reason: collision with root package name */
    int f18231l = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f18233n = 0;

    /* renamed from: p, reason: collision with root package name */
    @i0
    List<h> f18235p = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    final Runnable f18238s = new a();

    /* renamed from: w, reason: collision with root package name */
    private RecyclerView.j f18242w = null;

    /* renamed from: x, reason: collision with root package name */
    View f18243x = null;

    /* renamed from: y, reason: collision with root package name */
    int f18244y = -1;

    /* renamed from: B, reason: collision with root package name */
    private final RecyclerView.s f18217B = new b();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n nVar = n.this;
            if (nVar.f18222c != null && nVar.E()) {
                n nVar2 = n.this;
                RecyclerView.F f4 = nVar2.f18222c;
                if (f4 != null) {
                    nVar2.z(f4);
                }
                n nVar3 = n.this;
                nVar3.f18237r.removeCallbacks(nVar3.f18238s);
                C0823k0.p1(n.this.f18237r, this);
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements RecyclerView.s {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void a(@N RecyclerView recyclerView, @N MotionEvent motionEvent) {
            n.this.f18245z.b(motionEvent);
            VelocityTracker velocityTracker = n.this.f18239t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (n.this.f18231l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(n.this.f18231l);
            if (findPointerIndex >= 0) {
                n.this.o(actionMasked, motionEvent, findPointerIndex);
            }
            n nVar = n.this;
            RecyclerView.F f4 = nVar.f18222c;
            if (f4 == null) {
                return;
            }
            int i4 = 0;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            n nVar2 = n.this;
                            if (pointerId == nVar2.f18231l) {
                                if (actionIndex == 0) {
                                    i4 = 1;
                                }
                                nVar2.f18231l = motionEvent.getPointerId(i4);
                                n nVar3 = n.this;
                                nVar3.M(motionEvent, nVar3.f18234o, actionIndex);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    VelocityTracker velocityTracker2 = nVar.f18239t;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                } else {
                    if (findPointerIndex >= 0) {
                        nVar.M(motionEvent, nVar.f18234o, findPointerIndex);
                        n.this.z(f4);
                        n nVar4 = n.this;
                        nVar4.f18237r.removeCallbacks(nVar4.f18238s);
                        n.this.f18238s.run();
                        n.this.f18237r.invalidate();
                        return;
                    }
                    return;
                }
            }
            n.this.F(null, 0);
            n.this.f18231l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public boolean c(@N RecyclerView recyclerView, @N MotionEvent motionEvent) {
            int findPointerIndex;
            h s4;
            n.this.f18245z.b(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                n.this.f18231l = motionEvent.getPointerId(0);
                n.this.f18223d = motionEvent.getX();
                n.this.f18224e = motionEvent.getY();
                n.this.A();
                n nVar = n.this;
                if (nVar.f18222c == null && (s4 = nVar.s(motionEvent)) != null) {
                    n nVar2 = n.this;
                    nVar2.f18223d -= s4.f18274j;
                    nVar2.f18224e -= s4.f18275k;
                    nVar2.r(s4.f18269e, true);
                    if (n.this.f18220a.remove(s4.f18269e.f17770a)) {
                        n nVar3 = n.this;
                        nVar3.f18232m.c(nVar3.f18237r, s4.f18269e);
                    }
                    n.this.F(s4.f18269e, s4.f18270f);
                    n nVar4 = n.this;
                    nVar4.M(motionEvent, nVar4.f18234o, 0);
                }
            } else if (actionMasked != 3 && actionMasked != 1) {
                int i4 = n.this.f18231l;
                if (i4 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i4)) >= 0) {
                    n.this.o(actionMasked, motionEvent, findPointerIndex);
                }
            } else {
                n nVar5 = n.this;
                nVar5.f18231l = -1;
                nVar5.F(null, 0);
            }
            VelocityTracker velocityTracker = n.this.f18239t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (n.this.f18222c != null) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void e(boolean z3) {
            if (!z3) {
                return;
            }
            n.this.F(null, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends h {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f18248o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ RecyclerView.F f18249p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(RecyclerView.F f4, int i4, int i5, float f5, float f6, float f7, float f8, int i6, RecyclerView.F f9) {
            super(f4, i4, i5, f5, f6, f7, f8);
            this.f18248o = i6;
            this.f18249p = f9;
        }

        @Override // androidx.recyclerview.widget.n.h, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f18276l) {
                return;
            }
            if (this.f18248o <= 0) {
                n nVar = n.this;
                nVar.f18232m.c(nVar.f18237r, this.f18249p);
            } else {
                n.this.f18220a.add(this.f18249p.f17770a);
                this.f18273i = true;
                int i4 = this.f18248o;
                if (i4 > 0) {
                    n.this.B(this, i4);
                }
            }
            n nVar2 = n.this;
            View view = nVar2.f18243x;
            View view2 = this.f18249p.f17770a;
            if (view == view2) {
                nVar2.D(view2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ h f18251E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f18252F;

        d(h hVar, int i4) {
            this.f18251E = hVar;
            this.f18252F = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = n.this.f18237r;
            if (recyclerView != null && recyclerView.isAttachedToWindow()) {
                h hVar = this.f18251E;
                if (!hVar.f18276l && hVar.f18269e.j() != -1) {
                    RecyclerView.l itemAnimator = n.this.f18237r.getItemAnimator();
                    if ((itemAnimator == null || !itemAnimator.r(null)) && !n.this.x()) {
                        n.this.f18232m.D(this.f18251E.f18269e, this.f18252F);
                    } else {
                        n.this.f18237r.post(this);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class e implements RecyclerView.j {
        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public int a(int i4, int i5) {
            n nVar = n.this;
            View view = nVar.f18243x;
            if (view == null) {
                return i5;
            }
            int i6 = nVar.f18244y;
            if (i6 == -1) {
                i6 = nVar.f18237r.indexOfChild(view);
                n.this.f18244y = i6;
            }
            if (i5 == i4 - 1) {
                return i6;
            }
            if (i5 >= i6) {
                return i5 + 1;
            }
            return i5;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {

        /* renamed from: b, reason: collision with root package name */
        public static final int f18255b = 200;

        /* renamed from: c, reason: collision with root package name */
        public static final int f18256c = 250;

        /* renamed from: d, reason: collision with root package name */
        static final int f18257d = 3158064;

        /* renamed from: e, reason: collision with root package name */
        private static final int f18258e = 789516;

        /* renamed from: f, reason: collision with root package name */
        private static final Interpolator f18259f = new a();

        /* renamed from: g, reason: collision with root package name */
        private static final Interpolator f18260g = new b();

        /* renamed from: h, reason: collision with root package name */
        private static final long f18261h = 2000;

        /* renamed from: a, reason: collision with root package name */
        private int f18262a = -1;

        /* loaded from: classes.dex */
        class a implements Interpolator {
            a() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f4) {
                return f4 * f4 * f4 * f4 * f4;
            }
        }

        /* loaded from: classes.dex */
        class b implements Interpolator {
            b() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f4) {
                float f5 = f4 - 1.0f;
                return (f5 * f5 * f5 * f5 * f5) + 1.0f;
            }
        }

        public static int e(int i4, int i5) {
            int i6;
            int i7 = i4 & f18258e;
            if (i7 == 0) {
                return i4;
            }
            int i8 = i4 & (~i7);
            if (i5 == 0) {
                i6 = i7 << 2;
            } else {
                int i9 = i7 << 1;
                i8 |= (-789517) & i9;
                i6 = (i9 & f18258e) << 2;
            }
            return i8 | i6;
        }

        @N
        public static o i() {
            return p.f18282a;
        }

        private int j(RecyclerView recyclerView) {
            if (this.f18262a == -1) {
                this.f18262a = recyclerView.getResources().getDimensionPixelSize(C1002a.c.f20984k);
            }
            return this.f18262a;
        }

        public static int u(int i4, int i5) {
            return i5 << (i4 * 8);
        }

        public static int v(int i4, int i5) {
            return u(2, i4) | u(1, i5) | u(0, i5 | i4);
        }

        public abstract boolean A(@N RecyclerView recyclerView, @N RecyclerView.F f4, @N RecyclerView.F f5);

        /* JADX WARN: Multi-variable type inference failed */
        public void B(@N RecyclerView recyclerView, @N RecyclerView.F f4, int i4, @N RecyclerView.F f5, int i5, int i6, int i7) {
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof j) {
                ((j) layoutManager).b(f4.f17770a, f5.f17770a, i6, i7);
                return;
            }
            if (layoutManager.n()) {
                if (layoutManager.Y(f5.f17770a) <= recyclerView.getPaddingLeft()) {
                    recyclerView.G1(i5);
                }
                if (layoutManager.b0(f5.f17770a) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.G1(i5);
                }
            }
            if (layoutManager.o()) {
                if (layoutManager.c0(f5.f17770a) <= recyclerView.getPaddingTop()) {
                    recyclerView.G1(i5);
                }
                if (layoutManager.W(f5.f17770a) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.G1(i5);
                }
            }
        }

        public void C(@P RecyclerView.F f4, int i4) {
            if (f4 != null) {
                p.f18282a.b(f4.f17770a);
            }
        }

        public abstract void D(@N RecyclerView.F f4, int i4);

        public boolean a(@N RecyclerView recyclerView, @N RecyclerView.F f4, @N RecyclerView.F f5) {
            return true;
        }

        public RecyclerView.F b(@N RecyclerView.F f4, @N List<RecyclerView.F> list, int i4, int i5) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = i4 + f4.f17770a.getWidth();
            int height = i5 + f4.f17770a.getHeight();
            int left2 = i4 - f4.f17770a.getLeft();
            int top2 = i5 - f4.f17770a.getTop();
            int size = list.size();
            RecyclerView.F f5 = null;
            int i6 = -1;
            for (int i7 = 0; i7 < size; i7++) {
                RecyclerView.F f6 = list.get(i7);
                if (left2 > 0 && (right = f6.f17770a.getRight() - width) < 0 && f6.f17770a.getRight() > f4.f17770a.getRight() && (abs4 = Math.abs(right)) > i6) {
                    f5 = f6;
                    i6 = abs4;
                }
                if (left2 < 0 && (left = f6.f17770a.getLeft() - i4) > 0 && f6.f17770a.getLeft() < f4.f17770a.getLeft() && (abs3 = Math.abs(left)) > i6) {
                    f5 = f6;
                    i6 = abs3;
                }
                if (top2 < 0 && (top = f6.f17770a.getTop() - i5) > 0 && f6.f17770a.getTop() < f4.f17770a.getTop() && (abs2 = Math.abs(top)) > i6) {
                    f5 = f6;
                    i6 = abs2;
                }
                if (top2 > 0 && (bottom = f6.f17770a.getBottom() - height) < 0 && f6.f17770a.getBottom() > f4.f17770a.getBottom() && (abs = Math.abs(bottom)) > i6) {
                    f5 = f6;
                    i6 = abs;
                }
            }
            return f5;
        }

        public void c(@N RecyclerView recyclerView, @N RecyclerView.F f4) {
            p.f18282a.a(f4.f17770a);
        }

        public int d(int i4, int i5) {
            int i6;
            int i7 = i4 & f18257d;
            if (i7 == 0) {
                return i4;
            }
            int i8 = i4 & (~i7);
            if (i5 == 0) {
                i6 = i7 >> 2;
            } else {
                int i9 = i7 >> 1;
                i8 |= (-3158065) & i9;
                i6 = (i9 & f18257d) >> 2;
            }
            return i8 | i6;
        }

        final int f(RecyclerView recyclerView, RecyclerView.F f4) {
            return d(l(recyclerView, f4), C0823k0.Z(recyclerView));
        }

        public long g(@N RecyclerView recyclerView, int i4, float f4, float f5) {
            RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                if (i4 == 8) {
                    return 200L;
                }
                return 250L;
            }
            if (i4 == 8) {
                return itemAnimator.o();
            }
            return itemAnimator.p();
        }

        public int h() {
            return 0;
        }

        public float k(@N RecyclerView.F f4) {
            return 0.5f;
        }

        public abstract int l(@N RecyclerView recyclerView, @N RecyclerView.F f4);

        public float m(float f4) {
            return f4;
        }

        public float n(@N RecyclerView.F f4) {
            return 0.5f;
        }

        public float o(float f4) {
            return f4;
        }

        boolean p(RecyclerView recyclerView, RecyclerView.F f4) {
            if ((f(recyclerView, f4) & n.f18214W) != 0) {
                return true;
            }
            return false;
        }

        boolean q(RecyclerView recyclerView, RecyclerView.F f4) {
            if ((f(recyclerView, f4) & 65280) != 0) {
                return true;
            }
            return false;
        }

        public int r(@N RecyclerView recyclerView, int i4, int i5, int i6, long j4) {
            int j5 = j(recyclerView);
            float f4 = 1.0f;
            int signum = (int) (((int) Math.signum(i5)) * j5 * f18260g.getInterpolation(Math.min(1.0f, (Math.abs(i5) * 1.0f) / i4)));
            if (j4 <= f18261h) {
                f4 = ((float) j4) / 2000.0f;
            }
            int interpolation = (int) (signum * f18259f.getInterpolation(f4));
            if (interpolation == 0) {
                if (i5 > 0) {
                    return 1;
                }
                return -1;
            }
            return interpolation;
        }

        public boolean s() {
            return true;
        }

        public boolean t() {
            return true;
        }

        public void w(@N Canvas canvas, @N RecyclerView recyclerView, @N RecyclerView.F f4, float f5, float f6, int i4, boolean z3) {
            p.f18282a.d(canvas, recyclerView, f4.f17770a, f5, f6, i4, z3);
        }

        public void x(@N Canvas canvas, @N RecyclerView recyclerView, RecyclerView.F f4, float f5, float f6, int i4, boolean z3) {
            p.f18282a.c(canvas, recyclerView, f4.f17770a, f5, f6, i4, z3);
        }

        void y(Canvas canvas, RecyclerView recyclerView, RecyclerView.F f4, List<h> list, int i4, float f5, float f6) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                h hVar = list.get(i5);
                hVar.e();
                int save = canvas.save();
                w(canvas, recyclerView, hVar.f18269e, hVar.f18274j, hVar.f18275k, hVar.f18270f, false);
                canvas.restoreToCount(save);
            }
            if (f4 != null) {
                int save2 = canvas.save();
                w(canvas, recyclerView, f4, f5, f6, i4, true);
                canvas.restoreToCount(save2);
            }
        }

        void z(Canvas canvas, RecyclerView recyclerView, RecyclerView.F f4, List<h> list, int i4, float f5, float f6) {
            int size = list.size();
            boolean z3 = false;
            for (int i5 = 0; i5 < size; i5++) {
                h hVar = list.get(i5);
                int save = canvas.save();
                x(canvas, recyclerView, hVar.f18269e, hVar.f18274j, hVar.f18275k, hVar.f18270f, false);
                canvas.restoreToCount(save);
            }
            if (f4 != null) {
                int save2 = canvas.save();
                x(canvas, recyclerView, f4, f5, f6, i4, true);
                canvas.restoreToCount(save2);
            }
            for (int i6 = size - 1; i6 >= 0; i6--) {
                h hVar2 = list.get(i6);
                boolean z4 = hVar2.f18277m;
                if (z4 && !hVar2.f18273i) {
                    list.remove(i6);
                } else if (!z4) {
                    z3 = true;
                }
            }
            if (z3) {
                recyclerView.invalidate();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a, reason: collision with root package name */
        private boolean f18263a = true;

        g() {
        }

        void a() {
            this.f18263a = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View t3;
            RecyclerView.F t02;
            if (this.f18263a && (t3 = n.this.t(motionEvent)) != null && (t02 = n.this.f18237r.t0(t3)) != null) {
                n nVar = n.this;
                if (!nVar.f18232m.p(nVar.f18237r, t02)) {
                    return;
                }
                int pointerId = motionEvent.getPointerId(0);
                int i4 = n.this.f18231l;
                if (pointerId == i4) {
                    int findPointerIndex = motionEvent.findPointerIndex(i4);
                    float x3 = motionEvent.getX(findPointerIndex);
                    float y3 = motionEvent.getY(findPointerIndex);
                    n nVar2 = n.this;
                    nVar2.f18223d = x3;
                    nVar2.f18224e = y3;
                    nVar2.f18228i = 0.0f;
                    nVar2.f18227h = 0.0f;
                    if (nVar2.f18232m.t()) {
                        n.this.F(t02, 2);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0
    /* loaded from: classes.dex */
    public static class h implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final float f18265a;

        /* renamed from: b, reason: collision with root package name */
        final float f18266b;

        /* renamed from: c, reason: collision with root package name */
        final float f18267c;

        /* renamed from: d, reason: collision with root package name */
        final float f18268d;

        /* renamed from: e, reason: collision with root package name */
        final RecyclerView.F f18269e;

        /* renamed from: f, reason: collision with root package name */
        final int f18270f;

        /* renamed from: g, reason: collision with root package name */
        @i0
        final ValueAnimator f18271g;

        /* renamed from: h, reason: collision with root package name */
        final int f18272h;

        /* renamed from: i, reason: collision with root package name */
        boolean f18273i;

        /* renamed from: j, reason: collision with root package name */
        float f18274j;

        /* renamed from: k, reason: collision with root package name */
        float f18275k;

        /* renamed from: l, reason: collision with root package name */
        boolean f18276l = false;

        /* renamed from: m, reason: collision with root package name */
        boolean f18277m = false;

        /* renamed from: n, reason: collision with root package name */
        private float f18278n;

        /* loaded from: classes.dex */
        class a implements ValueAnimator.AnimatorUpdateListener {
            a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                h.this.c(valueAnimator.getAnimatedFraction());
            }
        }

        h(RecyclerView.F f4, int i4, int i5, float f5, float f6, float f7, float f8) {
            this.f18270f = i5;
            this.f18272h = i4;
            this.f18269e = f4;
            this.f18265a = f5;
            this.f18266b = f6;
            this.f18267c = f7;
            this.f18268d = f8;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f18271g = ofFloat;
            ofFloat.addUpdateListener(new a());
            ofFloat.setTarget(f4.f17770a);
            ofFloat.addListener(this);
            c(0.0f);
        }

        public void a() {
            this.f18271g.cancel();
        }

        public void b(long j4) {
            this.f18271g.setDuration(j4);
        }

        public void c(float f4) {
            this.f18278n = f4;
        }

        public void d() {
            this.f18269e.K(false);
            this.f18271g.start();
        }

        public void e() {
            float f4 = this.f18265a;
            float f5 = this.f18267c;
            if (f4 == f5) {
                this.f18274j = this.f18269e.f17770a.getTranslationX();
            } else {
                this.f18274j = f4 + (this.f18278n * (f5 - f4));
            }
            float f6 = this.f18266b;
            float f7 = this.f18268d;
            if (f6 == f7) {
                this.f18275k = this.f18269e.f17770a.getTranslationY();
            } else {
                this.f18275k = f6 + (this.f18278n * (f7 - f6));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f18277m) {
                this.f18269e.K(true);
            }
            this.f18277m = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class i extends f {

        /* renamed from: i, reason: collision with root package name */
        private int f18280i;

        /* renamed from: j, reason: collision with root package name */
        private int f18281j;

        public i(int i4, int i5) {
            this.f18280i = i5;
            this.f18281j = i4;
        }

        public int E(@N RecyclerView recyclerView, @N RecyclerView.F f4) {
            return this.f18281j;
        }

        public int F(@N RecyclerView recyclerView, @N RecyclerView.F f4) {
            return this.f18280i;
        }

        public void G(int i4) {
            this.f18281j = i4;
        }

        public void H(int i4) {
            this.f18280i = i4;
        }

        @Override // androidx.recyclerview.widget.n.f
        public int l(@N RecyclerView recyclerView, @N RecyclerView.F f4) {
            return f.v(E(recyclerView, f4), F(recyclerView, f4));
        }
    }

    /* loaded from: classes.dex */
    public interface j {
        void b(@N View view, @N View view2, int i4, int i5);
    }

    public n(@N f fVar) {
        this.f18232m = fVar;
    }

    private void C() {
        VelocityTracker velocityTracker = this.f18239t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f18239t = null;
        }
    }

    private void G() {
        this.f18236q = ViewConfiguration.get(this.f18237r.getContext()).getScaledTouchSlop();
        this.f18237r.n(this);
        this.f18237r.q(this.f18217B);
        this.f18237r.p(this);
        I();
    }

    private void I() {
        this.f18216A = new g();
        this.f18245z = new androidx.core.view.B(this.f18237r.getContext(), this.f18216A);
    }

    private void K() {
        g gVar = this.f18216A;
        if (gVar != null) {
            gVar.a();
            this.f18216A = null;
        }
        if (this.f18245z != null) {
            this.f18245z = null;
        }
    }

    private int L(RecyclerView.F f4) {
        if (this.f18233n == 2) {
            return 0;
        }
        int l4 = this.f18232m.l(this.f18237r, f4);
        int d4 = (this.f18232m.d(l4, C0823k0.Z(this.f18237r)) & 65280) >> 8;
        if (d4 == 0) {
            return 0;
        }
        int i4 = (l4 & 65280) >> 8;
        if (Math.abs(this.f18227h) > Math.abs(this.f18228i)) {
            int n4 = n(f4, d4);
            if (n4 > 0) {
                if ((i4 & n4) == 0) {
                    return f.e(n4, C0823k0.Z(this.f18237r));
                }
                return n4;
            }
            int p4 = p(f4, d4);
            if (p4 > 0) {
                return p4;
            }
        } else {
            int p5 = p(f4, d4);
            if (p5 > 0) {
                return p5;
            }
            int n5 = n(f4, d4);
            if (n5 > 0) {
                if ((i4 & n5) == 0) {
                    return f.e(n5, C0823k0.Z(this.f18237r));
                }
                return n5;
            }
        }
        return 0;
    }

    private void l() {
    }

    private int n(RecyclerView.F f4, int i4) {
        int i5;
        if ((i4 & 12) != 0) {
            int i6 = 4;
            if (this.f18227h > 0.0f) {
                i5 = 8;
            } else {
                i5 = 4;
            }
            VelocityTracker velocityTracker = this.f18239t;
            if (velocityTracker != null && this.f18231l > -1) {
                velocityTracker.computeCurrentVelocity(1000, this.f18232m.o(this.f18226g));
                float xVelocity = this.f18239t.getXVelocity(this.f18231l);
                float yVelocity = this.f18239t.getYVelocity(this.f18231l);
                if (xVelocity > 0.0f) {
                    i6 = 8;
                }
                float abs = Math.abs(xVelocity);
                if ((i6 & i4) != 0 && i5 == i6 && abs >= this.f18232m.m(this.f18225f) && abs > Math.abs(yVelocity)) {
                    return i6;
                }
            }
            float width = this.f18237r.getWidth() * this.f18232m.n(f4);
            if ((i4 & i5) != 0 && Math.abs(this.f18227h) > width) {
                return i5;
            }
            return 0;
        }
        return 0;
    }

    private int p(RecyclerView.F f4, int i4) {
        int i5;
        if ((i4 & 3) != 0) {
            int i6 = 1;
            if (this.f18228i > 0.0f) {
                i5 = 2;
            } else {
                i5 = 1;
            }
            VelocityTracker velocityTracker = this.f18239t;
            if (velocityTracker != null && this.f18231l > -1) {
                velocityTracker.computeCurrentVelocity(1000, this.f18232m.o(this.f18226g));
                float xVelocity = this.f18239t.getXVelocity(this.f18231l);
                float yVelocity = this.f18239t.getYVelocity(this.f18231l);
                if (yVelocity > 0.0f) {
                    i6 = 2;
                }
                float abs = Math.abs(yVelocity);
                if ((i6 & i4) != 0 && i6 == i5 && abs >= this.f18232m.m(this.f18225f) && abs > Math.abs(xVelocity)) {
                    return i6;
                }
            }
            float height = this.f18237r.getHeight() * this.f18232m.n(f4);
            if ((i4 & i5) != 0 && Math.abs(this.f18228i) > height) {
                return i5;
            }
            return 0;
        }
        return 0;
    }

    private void q() {
        this.f18237r.s1(this);
        this.f18237r.v1(this.f18217B);
        this.f18237r.u1(this);
        for (int size = this.f18235p.size() - 1; size >= 0; size--) {
            h hVar = this.f18235p.get(0);
            hVar.a();
            this.f18232m.c(this.f18237r, hVar.f18269e);
        }
        this.f18235p.clear();
        this.f18243x = null;
        this.f18244y = -1;
        C();
        K();
    }

    private List<RecyclerView.F> u(RecyclerView.F f4) {
        RecyclerView.F f5 = f4;
        List<RecyclerView.F> list = this.f18240u;
        if (list == null) {
            this.f18240u = new ArrayList();
            this.f18241v = new ArrayList();
        } else {
            list.clear();
            this.f18241v.clear();
        }
        int h4 = this.f18232m.h();
        int round = Math.round(this.f18229j + this.f18227h) - h4;
        int round2 = Math.round(this.f18230k + this.f18228i) - h4;
        int i4 = h4 * 2;
        int width = f5.f17770a.getWidth() + round + i4;
        int height = f5.f17770a.getHeight() + round2 + i4;
        int i5 = (round + width) / 2;
        int i6 = (round2 + height) / 2;
        RecyclerView.o layoutManager = this.f18237r.getLayoutManager();
        int Q3 = layoutManager.Q();
        int i7 = 0;
        while (i7 < Q3) {
            View P3 = layoutManager.P(i7);
            if (P3 != f5.f17770a && P3.getBottom() >= round2 && P3.getTop() <= height && P3.getRight() >= round && P3.getLeft() <= width) {
                RecyclerView.F t02 = this.f18237r.t0(P3);
                if (this.f18232m.a(this.f18237r, this.f18222c, t02)) {
                    int abs = Math.abs(i5 - ((P3.getLeft() + P3.getRight()) / 2));
                    int abs2 = Math.abs(i6 - ((P3.getTop() + P3.getBottom()) / 2));
                    int i8 = (abs * abs) + (abs2 * abs2);
                    int size = this.f18240u.size();
                    int i9 = 0;
                    for (int i10 = 0; i10 < size && i8 > this.f18241v.get(i10).intValue(); i10++) {
                        i9++;
                    }
                    this.f18240u.add(i9, t02);
                    this.f18241v.add(i9, Integer.valueOf(i8));
                }
            }
            i7++;
            f5 = f4;
        }
        return this.f18240u;
    }

    private RecyclerView.F v(MotionEvent motionEvent) {
        View t3;
        RecyclerView.o layoutManager = this.f18237r.getLayoutManager();
        int i4 = this.f18231l;
        if (i4 == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i4);
        float x3 = motionEvent.getX(findPointerIndex) - this.f18223d;
        float y3 = motionEvent.getY(findPointerIndex) - this.f18224e;
        float abs = Math.abs(x3);
        float abs2 = Math.abs(y3);
        int i5 = this.f18236q;
        if (abs < i5 && abs2 < i5) {
            return null;
        }
        if (abs > abs2 && layoutManager.n()) {
            return null;
        }
        if ((abs2 > abs && layoutManager.o()) || (t3 = t(motionEvent)) == null) {
            return null;
        }
        return this.f18237r.t0(t3);
    }

    private void w(float[] fArr) {
        if ((this.f18234o & 12) != 0) {
            fArr[0] = (this.f18229j + this.f18227h) - this.f18222c.f17770a.getLeft();
        } else {
            fArr[0] = this.f18222c.f17770a.getTranslationX();
        }
        if ((this.f18234o & 3) != 0) {
            fArr[1] = (this.f18230k + this.f18228i) - this.f18222c.f17770a.getTop();
        } else {
            fArr[1] = this.f18222c.f17770a.getTranslationY();
        }
    }

    private static boolean y(View view, float f4, float f5, float f6, float f7) {
        if (f4 >= f6 && f4 <= f6 + view.getWidth() && f5 >= f7 && f5 <= f7 + view.getHeight()) {
            return true;
        }
        return false;
    }

    void A() {
        VelocityTracker velocityTracker = this.f18239t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f18239t = VelocityTracker.obtain();
    }

    void B(h hVar, int i4) {
        this.f18237r.post(new d(hVar, i4));
    }

    void D(View view) {
        if (view == this.f18243x) {
            this.f18243x = null;
            if (this.f18242w != null) {
                this.f18237r.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        if (r1 > 0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean E() {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.n.E():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void F(@androidx.annotation.P androidx.recyclerview.widget.RecyclerView.F r24, int r25) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.n.F(androidx.recyclerview.widget.RecyclerView$F, int):void");
    }

    public void H(@N RecyclerView.F f4) {
        if (!this.f18232m.p(this.f18237r, f4)) {
            Log.e(f18208Q, "Start drag has been called but dragging is not enabled");
            return;
        }
        if (f4.f17770a.getParent() != this.f18237r) {
            Log.e(f18208Q, "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        A();
        this.f18228i = 0.0f;
        this.f18227h = 0.0f;
        F(f4, 2);
    }

    public void J(@N RecyclerView.F f4) {
        if (!this.f18232m.q(this.f18237r, f4)) {
            Log.e(f18208Q, "Start swipe has been called but swiping is not enabled");
            return;
        }
        if (f4.f17770a.getParent() != this.f18237r) {
            Log.e(f18208Q, "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.");
            return;
        }
        A();
        this.f18228i = 0.0f;
        this.f18227h = 0.0f;
        F(f4, 1);
    }

    void M(MotionEvent motionEvent, int i4, int i5) {
        float x3 = motionEvent.getX(i5);
        float y3 = motionEvent.getY(i5);
        float f4 = x3 - this.f18223d;
        this.f18227h = f4;
        this.f18228i = y3 - this.f18224e;
        if ((i4 & 4) == 0) {
            this.f18227h = Math.max(0.0f, f4);
        }
        if ((i4 & 8) == 0) {
            this.f18227h = Math.min(0.0f, this.f18227h);
        }
        if ((i4 & 1) == 0) {
            this.f18228i = Math.max(0.0f, this.f18228i);
        }
        if ((i4 & 2) == 0) {
            this.f18228i = Math.min(0.0f, this.f18228i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void b(@N View view) {
        D(view);
        RecyclerView.F t02 = this.f18237r.t0(view);
        if (t02 == null) {
            return;
        }
        RecyclerView.F f4 = this.f18222c;
        if (f4 != null && t02 == f4) {
            F(null, 0);
            return;
        }
        r(t02, false);
        if (this.f18220a.remove(t02.f17770a)) {
            this.f18232m.c(this.f18237r, t02);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void d(@N View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C c4) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C c4) {
        float f4;
        float f5;
        this.f18244y = -1;
        if (this.f18222c != null) {
            w(this.f18221b);
            float[] fArr = this.f18221b;
            float f6 = fArr[0];
            f5 = fArr[1];
            f4 = f6;
        } else {
            f4 = 0.0f;
            f5 = 0.0f;
        }
        this.f18232m.y(canvas, recyclerView, this.f18222c, this.f18235p, this.f18233n, f4, f5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.C c4) {
        float f4;
        float f5;
        if (this.f18222c != null) {
            w(this.f18221b);
            float[] fArr = this.f18221b;
            float f6 = fArr[0];
            f5 = fArr[1];
            f4 = f6;
        } else {
            f4 = 0.0f;
            f5 = 0.0f;
        }
        this.f18232m.z(canvas, recyclerView, this.f18222c, this.f18235p, this.f18233n, f4, f5);
    }

    public void m(@P RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f18237r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            q();
        }
        this.f18237r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f18225f = resources.getDimension(C1002a.c.f20986m);
            this.f18226g = resources.getDimension(C1002a.c.f20985l);
            G();
        }
    }

    void o(int i4, MotionEvent motionEvent, int i5) {
        RecyclerView.F v3;
        int f4;
        if (this.f18222c != null || i4 != 2 || this.f18233n == 2 || !this.f18232m.s() || this.f18237r.getScrollState() == 1 || (v3 = v(motionEvent)) == null || (f4 = (this.f18232m.f(this.f18237r, v3) & 65280) >> 8) == 0) {
            return;
        }
        float x3 = motionEvent.getX(i5);
        float y3 = motionEvent.getY(i5);
        float f5 = x3 - this.f18223d;
        float f6 = y3 - this.f18224e;
        float abs = Math.abs(f5);
        float abs2 = Math.abs(f6);
        int i6 = this.f18236q;
        if (abs < i6 && abs2 < i6) {
            return;
        }
        if (abs > abs2) {
            if (f5 < 0.0f && (f4 & 4) == 0) {
                return;
            }
            if (f5 > 0.0f && (f4 & 8) == 0) {
                return;
            }
        } else {
            if (f6 < 0.0f && (f4 & 1) == 0) {
                return;
            }
            if (f6 > 0.0f && (f4 & 2) == 0) {
                return;
            }
        }
        this.f18228i = 0.0f;
        this.f18227h = 0.0f;
        this.f18231l = motionEvent.getPointerId(0);
        F(v3, 1);
    }

    void r(RecyclerView.F f4, boolean z3) {
        for (int size = this.f18235p.size() - 1; size >= 0; size--) {
            h hVar = this.f18235p.get(size);
            if (hVar.f18269e == f4) {
                hVar.f18276l |= z3;
                if (!hVar.f18277m) {
                    hVar.a();
                }
                this.f18235p.remove(size);
                return;
            }
        }
    }

    h s(MotionEvent motionEvent) {
        if (this.f18235p.isEmpty()) {
            return null;
        }
        View t3 = t(motionEvent);
        for (int size = this.f18235p.size() - 1; size >= 0; size--) {
            h hVar = this.f18235p.get(size);
            if (hVar.f18269e.f17770a == t3) {
                return hVar;
            }
        }
        return null;
    }

    View t(MotionEvent motionEvent) {
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        RecyclerView.F f4 = this.f18222c;
        if (f4 != null) {
            View view = f4.f17770a;
            if (y(view, x3, y3, this.f18229j + this.f18227h, this.f18230k + this.f18228i)) {
                return view;
            }
        }
        for (int size = this.f18235p.size() - 1; size >= 0; size--) {
            h hVar = this.f18235p.get(size);
            View view2 = hVar.f18269e.f17770a;
            if (y(view2, x3, y3, hVar.f18274j, hVar.f18275k)) {
                return view2;
            }
        }
        return this.f18237r.a0(x3, y3);
    }

    boolean x() {
        int size = this.f18235p.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!this.f18235p.get(i4).f18277m) {
                return true;
            }
        }
        return false;
    }

    void z(RecyclerView.F f4) {
        if (this.f18237r.isLayoutRequested() || this.f18233n != 2) {
            return;
        }
        float k4 = this.f18232m.k(f4);
        int i4 = (int) (this.f18229j + this.f18227h);
        int i5 = (int) (this.f18230k + this.f18228i);
        if (Math.abs(i5 - f4.f17770a.getTop()) < f4.f17770a.getHeight() * k4 && Math.abs(i4 - f4.f17770a.getLeft()) < f4.f17770a.getWidth() * k4) {
            return;
        }
        List<RecyclerView.F> u3 = u(f4);
        if (u3.size() == 0) {
            return;
        }
        RecyclerView.F b4 = this.f18232m.b(f4, u3, i4, i5);
        if (b4 == null) {
            this.f18240u.clear();
            this.f18241v.clear();
            return;
        }
        int j4 = b4.j();
        int j5 = f4.j();
        if (this.f18232m.A(this.f18237r, f4, b4)) {
            this.f18232m.B(this.f18237r, f4, j5, b4, j4, i4, i5);
        }
    }
}
