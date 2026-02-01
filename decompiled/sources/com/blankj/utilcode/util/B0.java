package com.blankj.utilcode.util;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class B0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f24698a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f24699b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f24700c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f24701d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f24702e = 8;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    /* loaded from: classes.dex */
    public static abstract class b implements View.OnTouchListener {

        /* renamed from: O, reason: collision with root package name */
        private static final int f24703O = 0;

        /* renamed from: P, reason: collision with root package name */
        private static final int f24704P = 1;

        /* renamed from: Q, reason: collision with root package name */
        private static final int f24705Q = 2;

        /* renamed from: R, reason: collision with root package name */
        private static final int f24706R = 1000;

        /* renamed from: E, reason: collision with root package name */
        private int f24707E;

        /* renamed from: F, reason: collision with root package name */
        private int f24708F;

        /* renamed from: G, reason: collision with root package name */
        private int f24709G;

        /* renamed from: H, reason: collision with root package name */
        private int f24710H;

        /* renamed from: I, reason: collision with root package name */
        private int f24711I;

        /* renamed from: J, reason: collision with root package name */
        private int f24712J;

        /* renamed from: K, reason: collision with root package name */
        private int f24713K;

        /* renamed from: L, reason: collision with root package name */
        private VelocityTracker f24714L;

        /* renamed from: M, reason: collision with root package name */
        private int f24715M;

        /* renamed from: N, reason: collision with root package name */
        private int f24716N;

        public b() {
            g(-1, -1);
        }

        private void g(int i4, int i5) {
            this.f24708F = i4;
            this.f24709G = i5;
            this.f24710H = i4;
            this.f24711I = i5;
            this.f24712J = 0;
            this.f24713K = 0;
            VelocityTracker velocityTracker = this.f24714L;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }

        public abstract boolean a(View view, int i4, int i5, MotionEvent motionEvent);

        public abstract boolean b(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, MotionEvent motionEvent);

        public abstract boolean c(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, MotionEvent motionEvent);

        public boolean d(View view, MotionEvent motionEvent) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            g(rawX, rawY);
            view.setPressed(true);
            return a(view, rawX, rawY, motionEvent);
        }

        public boolean e(View view, MotionEvent motionEvent) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            if (this.f24708F == -1) {
                g(rawX, rawY);
                view.setPressed(true);
            }
            if (this.f24712J != 1) {
                if (Math.abs(rawX - this.f24710H) < this.f24707E && Math.abs(rawY - this.f24711I) < this.f24707E) {
                    return true;
                }
                this.f24712J = 1;
                if (Math.abs(rawX - this.f24710H) >= Math.abs(rawY - this.f24711I)) {
                    if (rawX - this.f24710H < 0) {
                        this.f24713K = 1;
                    } else {
                        this.f24713K = 4;
                    }
                } else if (rawY - this.f24711I < 0) {
                    this.f24713K = 2;
                } else {
                    this.f24713K = 8;
                }
            }
            boolean b4 = b(view, this.f24713K, rawX, rawY, rawX - this.f24710H, rawY - this.f24711I, rawX - this.f24708F, rawY - this.f24709G, motionEvent);
            this.f24710H = rawX;
            this.f24711I = rawY;
            return b4;
        }

        public boolean f(View view, MotionEvent motionEvent) {
            int i4;
            int i5;
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            VelocityTracker velocityTracker = this.f24714L;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(1000, this.f24715M);
                int xVelocity = (int) this.f24714L.getXVelocity();
                int yVelocity = (int) this.f24714L.getYVelocity();
                this.f24714L.recycle();
                if (Math.abs(xVelocity) < this.f24716N) {
                    xVelocity = 0;
                }
                if (Math.abs(yVelocity) < this.f24716N) {
                    yVelocity = 0;
                }
                this.f24714L = null;
                i4 = xVelocity;
                i5 = yVelocity;
            } else {
                i4 = 0;
                i5 = 0;
            }
            view.setPressed(false);
            boolean c4 = c(view, this.f24713K, rawX, rawY, rawX - this.f24708F, rawY - this.f24709G, i4, i5, motionEvent);
            if (motionEvent.getAction() == 1 && this.f24712J == 0) {
                if (motionEvent.getEventTime() - motionEvent.getDownTime() <= 1000) {
                    view.performClick();
                } else {
                    view.performLongClick();
                }
            }
            g(-1, -1);
            return c4;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f24707E == 0) {
                this.f24707E = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            }
            if (this.f24715M == 0) {
                this.f24715M = ViewConfiguration.get(view.getContext()).getScaledMaximumFlingVelocity();
            }
            if (this.f24716N == 0) {
                this.f24716N = ViewConfiguration.get(view.getContext()).getScaledMinimumFlingVelocity();
            }
            if (this.f24714L == null) {
                this.f24714L = VelocityTracker.obtain();
            }
            this.f24714L.addMovement(motionEvent);
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                            return false;
                        }
                    } else {
                        return e(view, motionEvent);
                    }
                }
                return f(view, motionEvent);
            }
            return d(view, motionEvent);
        }
    }

    private B0() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void a(View view, b bVar) {
        if (view != null && bVar != null) {
            view.setOnTouchListener(bVar);
        }
    }
}
