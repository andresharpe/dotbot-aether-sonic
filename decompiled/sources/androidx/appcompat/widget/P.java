package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class P implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: E, reason: collision with root package name */
    private final float f5717E;

    /* renamed from: F, reason: collision with root package name */
    private final int f5718F;

    /* renamed from: G, reason: collision with root package name */
    private final int f5719G;

    /* renamed from: H, reason: collision with root package name */
    final View f5720H;

    /* renamed from: I, reason: collision with root package name */
    private Runnable f5721I;

    /* renamed from: J, reason: collision with root package name */
    private Runnable f5722J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f5723K;

    /* renamed from: L, reason: collision with root package name */
    private int f5724L;

    /* renamed from: M, reason: collision with root package name */
    private final int[] f5725M = new int[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = P.this.f5720H.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            P.this.e();
        }
    }

    public P(View view) {
        this.f5720H = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f5717E = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f5718F = tapTimeout;
        this.f5719G = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f5722J;
        if (runnable != null) {
            this.f5720H.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f5721I;
        if (runnable2 != null) {
            this.f5720H.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        M m4;
        boolean z3;
        View view = this.f5720H;
        androidx.appcompat.view.menu.q b4 = b();
        if (b4 == null || !b4.c() || (m4 = (M) b4.k()) == null || !m4.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, obtainNoHistory);
        j(m4, obtainNoHistory);
        boolean f4 = m4.f(obtainNoHistory, this.f5724L);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1 && actionMasked != 3) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!f4 || !z3) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r1 != 3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f5720H
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f5724L
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f5717E
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f5724L = r6
            java.lang.Runnable r6 = r5.f5721I
            if (r6 != 0) goto L52
            androidx.appcompat.widget.P$a r6 = new androidx.appcompat.widget.P$a
            r6.<init>()
            r5.f5721I = r6
        L52:
            java.lang.Runnable r6 = r5.f5721I
            int r1 = r5.f5718F
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f5722J
            if (r6 != 0) goto L65
            androidx.appcompat.widget.P$b r6 = new androidx.appcompat.widget.P$b
            r6.<init>()
            r5.f5722J = r6
        L65:
            java.lang.Runnable r6 = r5.f5722J
            int r1 = r5.f5719G
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.P.g(android.view.MotionEvent):boolean");
    }

    private static boolean h(View view, float f4, float f5, float f6) {
        float f7 = -f6;
        if (f4 >= f7 && f5 >= f7 && f4 < (view.getRight() - view.getLeft()) + f6 && f5 < (view.getBottom() - view.getTop()) + f6) {
            return true;
        }
        return false;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f5725M);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f5725M);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    public abstract androidx.appcompat.view.menu.q b();

    protected boolean c() {
        androidx.appcompat.view.menu.q b4 = b();
        if (b4 != null && !b4.c()) {
            b4.a();
            return true;
        }
        return true;
    }

    protected boolean d() {
        androidx.appcompat.view.menu.q b4 = b();
        if (b4 != null && b4.c()) {
            b4.dismiss();
            return true;
        }
        return true;
    }

    void e() {
        a();
        View view = this.f5720H;
        if (!view.isEnabled() || view.isLongClickable() || !c()) {
            return;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        view.onTouchEvent(obtain);
        obtain.recycle();
        this.f5723K = true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z3;
        boolean z4 = this.f5723K;
        if (z4) {
            if (!f(motionEvent) && d()) {
                z3 = false;
            } else {
                z3 = true;
            }
        } else {
            if (g(motionEvent) && c()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f5720H.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f5723K = z3;
        if (z3 || z4) {
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f5723K = false;
        this.f5724L = -1;
        Runnable runnable = this.f5721I;
        if (runnable != null) {
            this.f5720H.removeCallbacks(runnable);
        }
    }
}
