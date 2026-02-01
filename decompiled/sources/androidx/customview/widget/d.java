package androidx.customview.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.F;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.U;
import androidx.core.view.C0823k0;
import java.util.Arrays;

/* loaded from: classes.dex */
public class d {

    /* renamed from: A, reason: collision with root package name */
    public static final int f13889A = 1;

    /* renamed from: B, reason: collision with root package name */
    public static final int f13890B = 2;

    /* renamed from: C, reason: collision with root package name */
    public static final int f13891C = 1;

    /* renamed from: D, reason: collision with root package name */
    public static final int f13892D = 2;

    /* renamed from: E, reason: collision with root package name */
    public static final int f13893E = 4;

    /* renamed from: F, reason: collision with root package name */
    public static final int f13894F = 8;

    /* renamed from: G, reason: collision with root package name */
    public static final int f13895G = 15;

    /* renamed from: H, reason: collision with root package name */
    public static final int f13896H = 1;

    /* renamed from: I, reason: collision with root package name */
    public static final int f13897I = 2;

    /* renamed from: J, reason: collision with root package name */
    public static final int f13898J = 3;

    /* renamed from: K, reason: collision with root package name */
    private static final int f13899K = 20;

    /* renamed from: L, reason: collision with root package name */
    private static final int f13900L = 256;

    /* renamed from: M, reason: collision with root package name */
    private static final int f13901M = 600;

    /* renamed from: N, reason: collision with root package name */
    private static final Interpolator f13902N = new a();

    /* renamed from: x, reason: collision with root package name */
    private static final String f13903x = "ViewDragHelper";

    /* renamed from: y, reason: collision with root package name */
    public static final int f13904y = -1;

    /* renamed from: z, reason: collision with root package name */
    public static final int f13905z = 0;

    /* renamed from: a, reason: collision with root package name */
    private int f13906a;

    /* renamed from: b, reason: collision with root package name */
    private int f13907b;

    /* renamed from: d, reason: collision with root package name */
    private float[] f13909d;

    /* renamed from: e, reason: collision with root package name */
    private float[] f13910e;

    /* renamed from: f, reason: collision with root package name */
    private float[] f13911f;

    /* renamed from: g, reason: collision with root package name */
    private float[] f13912g;

    /* renamed from: h, reason: collision with root package name */
    private int[] f13913h;

    /* renamed from: i, reason: collision with root package name */
    private int[] f13914i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f13915j;

    /* renamed from: k, reason: collision with root package name */
    private int f13916k;

    /* renamed from: l, reason: collision with root package name */
    private VelocityTracker f13917l;

    /* renamed from: m, reason: collision with root package name */
    private float f13918m;

    /* renamed from: n, reason: collision with root package name */
    private float f13919n;

    /* renamed from: o, reason: collision with root package name */
    private int f13920o;

    /* renamed from: p, reason: collision with root package name */
    private final int f13921p;

    /* renamed from: q, reason: collision with root package name */
    private int f13922q;

    /* renamed from: r, reason: collision with root package name */
    private OverScroller f13923r;

    /* renamed from: s, reason: collision with root package name */
    private final c f13924s;

    /* renamed from: t, reason: collision with root package name */
    private View f13925t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f13926u;

    /* renamed from: v, reason: collision with root package name */
    private final ViewGroup f13927v;

    /* renamed from: c, reason: collision with root package name */
    private int f13908c = -1;

    /* renamed from: w, reason: collision with root package name */
    private final Runnable f13928w = new b();

    /* loaded from: classes.dex */
    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            float f5 = f4 - 1.0f;
            return (f5 * f5 * f5 * f5 * f5) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.R(0);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public int a(@N View view, int i4, int i5) {
            return 0;
        }

        public int b(@N View view, int i4, int i5) {
            return 0;
        }

        public int c(int i4) {
            return i4;
        }

        public int d(@N View view) {
            return 0;
        }

        public int e(@N View view) {
            return 0;
        }

        public void f(int i4, int i5) {
        }

        public boolean g(int i4) {
            return false;
        }

        public void h(int i4, int i5) {
        }

        public void i(@N View view, int i4) {
        }

        public void j(int i4) {
        }

        public void k(@N View view, int i4, int i5, @U int i6, @U int i7) {
        }

        public void l(@N View view, float f4, float f5) {
        }

        public abstract boolean m(@N View view, int i4);
    }

    private d(@N Context context, @N ViewGroup viewGroup, @N c cVar) {
        if (viewGroup != null) {
            if (cVar != null) {
                this.f13927v = viewGroup;
                this.f13924s = cVar;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int i4 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
                this.f13921p = i4;
                this.f13920o = i4;
                this.f13907b = viewConfiguration.getScaledTouchSlop();
                this.f13918m = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f13919n = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f13923r = new OverScroller(context, f13902N);
                return;
            }
            throw new IllegalArgumentException("Callback may not be null");
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    private int C(int i4, int i5) {
        int i6;
        if (i4 < this.f13927v.getLeft() + this.f13920o) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        if (i5 < this.f13927v.getTop() + this.f13920o) {
            i6 |= 4;
        }
        if (i4 > this.f13927v.getRight() - this.f13920o) {
            i6 |= 2;
        }
        if (i5 > this.f13927v.getBottom() - this.f13920o) {
            return i6 | 8;
        }
        return i6;
    }

    private boolean K(int i4) {
        if (!J(i4)) {
            Log.e(f13903x, "Ignoring pointerId=" + i4 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
            return false;
        }
        return true;
    }

    private void N() {
        this.f13917l.computeCurrentVelocity(1000, this.f13918m);
        r(i(this.f13917l.getXVelocity(this.f13908c), this.f13919n, this.f13918m), i(this.f13917l.getYVelocity(this.f13908c), this.f13919n, this.f13918m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.customview.widget.d$c] */
    private void O(float f4, float f5, int i4) {
        boolean e4 = e(f4, f5, i4, 1);
        boolean z3 = e4;
        if (e(f5, f4, i4, 4)) {
            z3 = (e4 ? 1 : 0) | 4;
        }
        boolean z4 = z3;
        if (e(f4, f5, i4, 2)) {
            z4 = (z3 ? 1 : 0) | 2;
        }
        ?? r02 = z4;
        if (e(f5, f4, i4, 8)) {
            r02 = (z4 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f13914i;
            iArr[i4] = iArr[i4] | r02;
            this.f13924s.f(r02, i4);
        }
    }

    private void P(float f4, float f5, int i4) {
        u(i4);
        float[] fArr = this.f13909d;
        this.f13911f[i4] = f4;
        fArr[i4] = f4;
        float[] fArr2 = this.f13910e;
        this.f13912g[i4] = f5;
        fArr2[i4] = f5;
        this.f13913h[i4] = C((int) f4, (int) f5);
        this.f13916k |= 1 << i4;
    }

    private void Q(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i4 = 0; i4 < pointerCount; i4++) {
            int pointerId = motionEvent.getPointerId(i4);
            if (K(pointerId)) {
                float x3 = motionEvent.getX(i4);
                float y3 = motionEvent.getY(i4);
                this.f13911f[pointerId] = x3;
                this.f13912g[pointerId] = y3;
            }
        }
    }

    private boolean e(float f4, float f5, int i4, int i5) {
        float abs = Math.abs(f4);
        float abs2 = Math.abs(f5);
        if ((this.f13913h[i4] & i5) != i5 || (this.f13922q & i5) == 0 || (this.f13915j[i4] & i5) == i5 || (this.f13914i[i4] & i5) == i5) {
            return false;
        }
        int i6 = this.f13907b;
        if (abs <= i6 && abs2 <= i6) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.f13924s.g(i5)) {
            int[] iArr = this.f13915j;
            iArr[i4] = iArr[i4] | i5;
            return false;
        }
        if ((this.f13914i[i4] & i5) != 0 || abs <= this.f13907b) {
            return false;
        }
        return true;
    }

    private boolean h(View view, float f4, float f5) {
        boolean z3;
        boolean z4;
        if (view == null) {
            return false;
        }
        if (this.f13924s.d(view) > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f13924s.e(view) > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 && z4) {
            float f6 = (f4 * f4) + (f5 * f5);
            int i4 = this.f13907b;
            if (f6 <= i4 * i4) {
                return false;
            }
            return true;
        }
        if (z3) {
            if (Math.abs(f4) <= this.f13907b) {
                return false;
            }
            return true;
        }
        if (!z4 || Math.abs(f5) <= this.f13907b) {
            return false;
        }
        return true;
    }

    private float i(float f4, float f5, float f6) {
        float abs = Math.abs(f4);
        if (abs < f5) {
            return 0.0f;
        }
        if (abs > f6) {
            if (f4 <= 0.0f) {
                return -f6;
            }
            return f6;
        }
        return f4;
    }

    private int j(int i4, int i5, int i6) {
        int abs = Math.abs(i4);
        if (abs < i5) {
            return 0;
        }
        if (abs > i6) {
            if (i4 <= 0) {
                return -i6;
            }
            return i6;
        }
        return i4;
    }

    private void k() {
        float[] fArr = this.f13909d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f13910e, 0.0f);
        Arrays.fill(this.f13911f, 0.0f);
        Arrays.fill(this.f13912g, 0.0f);
        Arrays.fill(this.f13913h, 0);
        Arrays.fill(this.f13914i, 0);
        Arrays.fill(this.f13915j, 0);
        this.f13916k = 0;
    }

    private void l(int i4) {
        if (this.f13909d != null && J(i4)) {
            this.f13909d[i4] = 0.0f;
            this.f13910e[i4] = 0.0f;
            this.f13911f[i4] = 0.0f;
            this.f13912g[i4] = 0.0f;
            this.f13913h[i4] = 0;
            this.f13914i[i4] = 0;
            this.f13915j[i4] = 0;
            this.f13916k = (~(1 << i4)) & this.f13916k;
        }
    }

    private int m(int i4, int i5, int i6) {
        int abs;
        if (i4 == 0) {
            return 0;
        }
        int width = this.f13927v.getWidth();
        float f4 = width / 2;
        float s4 = f4 + (s(Math.min(1.0f, Math.abs(i4) / width)) * f4);
        int abs2 = Math.abs(i5);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(s4 / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i4) / i6) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    private int n(View view, int i4, int i5, int i6, int i7) {
        float f4;
        float f5;
        float f6;
        float f7;
        int j4 = j(i6, (int) this.f13919n, (int) this.f13918m);
        int j5 = j(i7, (int) this.f13919n, (int) this.f13918m);
        int abs = Math.abs(i4);
        int abs2 = Math.abs(i5);
        int abs3 = Math.abs(j4);
        int abs4 = Math.abs(j5);
        int i8 = abs3 + abs4;
        int i9 = abs + abs2;
        if (j4 != 0) {
            f4 = abs3;
            f5 = i8;
        } else {
            f4 = abs;
            f5 = i9;
        }
        float f8 = f4 / f5;
        if (j5 != 0) {
            f6 = abs4;
            f7 = i8;
        } else {
            f6 = abs2;
            f7 = i9;
        }
        return (int) ((m(i4, j4, this.f13924s.d(view)) * f8) + (m(i5, j5, this.f13924s.e(view)) * (f6 / f7)));
    }

    public static d p(@N ViewGroup viewGroup, float f4, @N c cVar) {
        d q4 = q(viewGroup, cVar);
        q4.f13907b = (int) (q4.f13907b * (1.0f / f4));
        return q4;
    }

    public static d q(@N ViewGroup viewGroup, @N c cVar) {
        return new d(viewGroup.getContext(), viewGroup, cVar);
    }

    private void r(float f4, float f5) {
        this.f13926u = true;
        this.f13924s.l(this.f13925t, f4, f5);
        this.f13926u = false;
        if (this.f13906a == 1) {
            R(0);
        }
    }

    private float s(float f4) {
        return (float) Math.sin((f4 - 0.5f) * 0.47123894f);
    }

    private void t(int i4, int i5, int i6, int i7) {
        int left = this.f13925t.getLeft();
        int top = this.f13925t.getTop();
        if (i6 != 0) {
            i4 = this.f13924s.a(this.f13925t, i4, i6);
            C0823k0.e1(this.f13925t, i4 - left);
        }
        int i8 = i4;
        if (i7 != 0) {
            i5 = this.f13924s.b(this.f13925t, i5, i7);
            C0823k0.f1(this.f13925t, i5 - top);
        }
        int i9 = i5;
        if (i6 != 0 || i7 != 0) {
            this.f13924s.k(this.f13925t, i8, i9, i8 - left, i9 - top);
        }
    }

    private void u(int i4) {
        float[] fArr = this.f13909d;
        if (fArr == null || fArr.length <= i4) {
            int i5 = i4 + 1;
            float[] fArr2 = new float[i5];
            float[] fArr3 = new float[i5];
            float[] fArr4 = new float[i5];
            float[] fArr5 = new float[i5];
            int[] iArr = new int[i5];
            int[] iArr2 = new int[i5];
            int[] iArr3 = new int[i5];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f13910e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f13911f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f13912g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f13913h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f13914i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f13915j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f13909d = fArr2;
            this.f13910e = fArr3;
            this.f13911f = fArr4;
            this.f13912g = fArr5;
            this.f13913h = iArr;
            this.f13914i = iArr2;
            this.f13915j = iArr3;
        }
    }

    private boolean x(int i4, int i5, int i6, int i7) {
        int left = this.f13925t.getLeft();
        int top = this.f13925t.getTop();
        int i8 = i4 - left;
        int i9 = i5 - top;
        if (i8 == 0 && i9 == 0) {
            this.f13923r.abortAnimation();
            R(0);
            return false;
        }
        this.f13923r.startScroll(left, top, i8, i9, n(this.f13925t, i8, i9, i6, i7));
        R(2);
        return true;
    }

    @U
    public int A() {
        return this.f13921p;
    }

    @U
    public int B() {
        return this.f13920o;
    }

    public float D() {
        return this.f13919n;
    }

    @U
    public int E() {
        return this.f13907b;
    }

    public int F() {
        return this.f13906a;
    }

    public boolean G(int i4, int i5) {
        return L(this.f13925t, i4, i5);
    }

    public boolean H(int i4) {
        int length = this.f13913h.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (I(i4, i5)) {
                return true;
            }
        }
        return false;
    }

    public boolean I(int i4, int i5) {
        if (J(i5) && (i4 & this.f13913h[i5]) != 0) {
            return true;
        }
        return false;
    }

    public boolean J(int i4) {
        if (((1 << i4) & this.f13916k) != 0) {
            return true;
        }
        return false;
    }

    public boolean L(@P View view, int i4, int i5) {
        if (view == null || i4 < view.getLeft() || i4 >= view.getRight() || i5 < view.getTop() || i5 >= view.getBottom()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        if (r9.f13908c == (-1)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
    
        N();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M(@androidx.annotation.N android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.d.M(android.view.MotionEvent):void");
    }

    void R(int i4) {
        this.f13927v.removeCallbacks(this.f13928w);
        if (this.f13906a != i4) {
            this.f13906a = i4;
            this.f13924s.j(i4);
            if (this.f13906a == 0) {
                this.f13925t = null;
            }
        }
    }

    public void S(@U @F(from = 0) int i4) {
        this.f13920o = i4;
    }

    public void T(int i4) {
        this.f13922q = i4;
    }

    public void U(float f4) {
        this.f13919n = f4;
    }

    public boolean V(int i4, int i5) {
        if (this.f13926u) {
            return x(i4, i5, (int) this.f13917l.getXVelocity(this.f13908c), (int) this.f13917l.getYVelocity(this.f13908c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dd, code lost:
    
        if (r12 != r11) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean W(@androidx.annotation.N android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.d.W(android.view.MotionEvent):boolean");
    }

    public boolean X(@N View view, int i4, int i5) {
        this.f13925t = view;
        this.f13908c = -1;
        boolean x3 = x(i4, i5, 0, 0);
        if (!x3 && this.f13906a == 0 && this.f13925t != null) {
            this.f13925t = null;
        }
        return x3;
    }

    boolean Y(View view, int i4) {
        if (view == this.f13925t && this.f13908c == i4) {
            return true;
        }
        if (view != null && this.f13924s.m(view, i4)) {
            this.f13908c = i4;
            d(view, i4);
            return true;
        }
        return false;
    }

    public void a() {
        c();
        if (this.f13906a == 2) {
            int currX = this.f13923r.getCurrX();
            int currY = this.f13923r.getCurrY();
            this.f13923r.abortAnimation();
            int currX2 = this.f13923r.getCurrX();
            int currY2 = this.f13923r.getCurrY();
            this.f13924s.k(this.f13925t, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        R(0);
    }

    protected boolean b(@N View view, boolean z3, int i4, int i5, int i6, int i7) {
        int i8;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i9 = i6 + scrollX;
                if (i9 >= childAt.getLeft() && i9 < childAt.getRight() && (i8 = i7 + scrollY) >= childAt.getTop() && i8 < childAt.getBottom() && b(childAt, true, i4, i5, i9 - childAt.getLeft(), i8 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z3 && (view.canScrollHorizontally(-i4) || view.canScrollVertically(-i5))) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f13908c = -1;
        k();
        VelocityTracker velocityTracker = this.f13917l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f13917l = null;
        }
    }

    public void d(@N View view, int i4) {
        if (view.getParent() == this.f13927v) {
            this.f13925t = view;
            this.f13908c = i4;
            this.f13924s.i(view, i4);
            R(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f13927v + ")");
    }

    public boolean f(int i4) {
        int length = this.f13909d.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (g(i4, i5)) {
                return true;
            }
        }
        return false;
    }

    public boolean g(int i4, int i5) {
        boolean z3;
        boolean z4;
        if (!J(i5)) {
            return false;
        }
        if ((i4 & 1) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i4 & 2) == 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        float f4 = this.f13911f[i5] - this.f13909d[i5];
        float f5 = this.f13912g[i5] - this.f13910e[i5];
        if (z3 && z4) {
            float f6 = (f4 * f4) + (f5 * f5);
            int i6 = this.f13907b;
            if (f6 <= i6 * i6) {
                return false;
            }
            return true;
        }
        if (z3) {
            if (Math.abs(f4) <= this.f13907b) {
                return false;
            }
            return true;
        }
        if (!z4 || Math.abs(f5) <= this.f13907b) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (r0 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o(boolean r12) {
        /*
            r11 = this;
            int r0 = r11.f13906a
            r1 = 0
            r2 = 2
            if (r0 != r2) goto L6a
            android.widget.OverScroller r0 = r11.f13923r
            boolean r0 = r0.computeScrollOffset()
            android.widget.OverScroller r3 = r11.f13923r
            int r3 = r3.getCurrX()
            android.widget.OverScroller r4 = r11.f13923r
            int r10 = r4.getCurrY()
            android.view.View r4 = r11.f13925t
            int r4 = r4.getLeft()
            int r8 = r3 - r4
            android.view.View r4 = r11.f13925t
            int r4 = r4.getTop()
            int r9 = r10 - r4
            if (r8 == 0) goto L2f
            android.view.View r4 = r11.f13925t
            androidx.core.view.C0823k0.e1(r4, r8)
        L2f:
            if (r9 == 0) goto L36
            android.view.View r4 = r11.f13925t
            androidx.core.view.C0823k0.f1(r4, r9)
        L36:
            if (r8 != 0) goto L3a
            if (r9 == 0) goto L43
        L3a:
            androidx.customview.widget.d$c r4 = r11.f13924s
            android.view.View r5 = r11.f13925t
            r6 = r3
            r7 = r10
            r4.k(r5, r6, r7, r8, r9)
        L43:
            if (r0 == 0) goto L5b
            android.widget.OverScroller r4 = r11.f13923r
            int r4 = r4.getFinalX()
            if (r3 != r4) goto L5b
            android.widget.OverScroller r3 = r11.f13923r
            int r3 = r3.getFinalY()
            if (r10 != r3) goto L5b
            android.widget.OverScroller r0 = r11.f13923r
            r0.abortAnimation()
            goto L5d
        L5b:
            if (r0 != 0) goto L6a
        L5d:
            if (r12 == 0) goto L67
            android.view.ViewGroup r12 = r11.f13927v
            java.lang.Runnable r0 = r11.f13928w
            r12.post(r0)
            goto L6a
        L67:
            r11.R(r1)
        L6a:
            int r12 = r11.f13906a
            if (r12 != r2) goto L6f
            r1 = 1
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.d.o(boolean):boolean");
    }

    @P
    public View v(int i4, int i5) {
        for (int childCount = this.f13927v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f13927v.getChildAt(this.f13924s.c(childCount));
            if (i4 >= childAt.getLeft() && i4 < childAt.getRight() && i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void w(int i4, int i5, int i6, int i7) {
        if (this.f13926u) {
            this.f13923r.fling(this.f13925t.getLeft(), this.f13925t.getTop(), (int) this.f13917l.getXVelocity(this.f13908c), (int) this.f13917l.getYVelocity(this.f13908c), i4, i6, i5, i7);
            R(2);
            return;
        }
        throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
    }

    public int y() {
        return this.f13908c;
    }

    @P
    public View z() {
        return this.f13925t;
    }
}
