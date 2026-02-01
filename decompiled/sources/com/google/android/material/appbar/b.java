package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0823k0;
import q.C2394a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class b<V extends View> extends d<V> {

    /* renamed from: k, reason: collision with root package name */
    private static final int f31352k = -1;

    /* renamed from: d, reason: collision with root package name */
    @P
    private Runnable f31353d;

    /* renamed from: e, reason: collision with root package name */
    OverScroller f31354e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f31355f;

    /* renamed from: g, reason: collision with root package name */
    private int f31356g;

    /* renamed from: h, reason: collision with root package name */
    private int f31357h;

    /* renamed from: i, reason: collision with root package name */
    private int f31358i;

    /* renamed from: j, reason: collision with root package name */
    @P
    private VelocityTracker f31359j;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        private final CoordinatorLayout f31360E;

        /* renamed from: F, reason: collision with root package name */
        private final V f31361F;

        a(CoordinatorLayout coordinatorLayout, V v3) {
            this.f31360E = coordinatorLayout;
            this.f31361F = v3;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f31361F != null && (overScroller = b.this.f31354e) != null) {
                if (overScroller.computeScrollOffset()) {
                    b bVar = b.this;
                    bVar.X(this.f31360E, this.f31361F, bVar.f31354e.getCurrY());
                    C0823k0.p1(this.f31361F, this);
                    return;
                }
                b.this.V(this.f31360E, this.f31361F);
            }
        }
    }

    public b() {
        this.f31356g = -1;
        this.f31358i = -1;
    }

    private void Q() {
        if (this.f31359j == null) {
            this.f31359j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean E(@androidx.annotation.N androidx.coordinatorlayout.widget.CoordinatorLayout r12, @androidx.annotation.N V r13, @androidx.annotation.N android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L4e
            r4 = 2
            if (r0 == r4) goto L2d
            r12 = 3
            if (r0 == r12) goto L72
            r12 = 6
            if (r0 == r12) goto L13
            goto L4c
        L13:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L1b
            r12 = r2
            goto L1c
        L1b:
            r12 = r3
        L1c:
            int r13 = r14.getPointerId(r12)
            r11.f31356g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f31357h = r12
            goto L4c
        L2d:
            int r0 = r11.f31356g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f31357h
            int r7 = r1 - r0
            r11.f31357h = r0
            int r8 = r11.S(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.W(r5, r6, r7, r8, r9)
        L4c:
            r12 = r3
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.f31359j
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f31359j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f31359j
            int r4 = r11.f31356g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.T(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.R(r6, r7, r8, r9, r10)
            r12 = r2
            goto L73
        L72:
            r12 = r3
        L73:
            r11.f31355f = r3
            r11.f31356g = r1
            android.view.VelocityTracker r13 = r11.f31359j
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.f31359j = r13
        L81:
            android.view.VelocityTracker r13 = r11.f31359j
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.f31355f
            if (r13 != 0) goto L90
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r2 = r3
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.b.E(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    boolean P(V v3) {
        return false;
    }

    final boolean R(CoordinatorLayout coordinatorLayout, @N V v3, int i4, int i5, float f4) {
        Runnable runnable = this.f31353d;
        if (runnable != null) {
            v3.removeCallbacks(runnable);
            this.f31353d = null;
        }
        if (this.f31354e == null) {
            this.f31354e = new OverScroller(v3.getContext());
        }
        this.f31354e.fling(0, H(), 0, Math.round(f4), 0, 0, i4, i5);
        if (this.f31354e.computeScrollOffset()) {
            a aVar = new a(coordinatorLayout, v3);
            this.f31353d = aVar;
            C0823k0.p1(v3, aVar);
            return true;
        }
        V(coordinatorLayout, v3);
        return false;
    }

    int S(@N V v3) {
        return -v3.getHeight();
    }

    int T(@N V v3) {
        return v3.getHeight();
    }

    int U() {
        return H();
    }

    void V(CoordinatorLayout coordinatorLayout, V v3) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int W(CoordinatorLayout coordinatorLayout, V v3, int i4, int i5, int i6) {
        return Y(coordinatorLayout, v3, U() - i4, i5, i6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int X(CoordinatorLayout coordinatorLayout, V v3, int i4) {
        return Y(coordinatorLayout, v3, i4, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    int Y(CoordinatorLayout coordinatorLayout, V v3, int i4, int i5, int i6) {
        int e4;
        int H3 = H();
        if (i5 != 0 && H3 >= i5 && H3 <= i6 && H3 != (e4 = C2394a.e(i4, i5, i6))) {
            N(e4);
            return H3 - e4;
        }
        return 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(@N CoordinatorLayout coordinatorLayout, @N V v3, @N MotionEvent motionEvent) {
        boolean z3;
        int findPointerIndex;
        if (this.f31358i < 0) {
            this.f31358i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f31355f) {
            int i4 = this.f31356g;
            if (i4 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i4)) == -1) {
                return false;
            }
            int y3 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y3 - this.f31357h) > this.f31358i) {
                this.f31357h = y3;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f31356g = -1;
            int x3 = (int) motionEvent.getX();
            int y4 = (int) motionEvent.getY();
            if (P(v3) && coordinatorLayout.H(v3, x3, y4)) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f31355f = z3;
            if (z3) {
                this.f31357h = y4;
                this.f31356g = motionEvent.getPointerId(0);
                Q();
                OverScroller overScroller = this.f31354e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f31354e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f31359j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31356g = -1;
        this.f31358i = -1;
    }
}
