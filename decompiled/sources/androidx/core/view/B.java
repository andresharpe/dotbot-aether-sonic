package androidx.core.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    private final a f13071a;

    /* loaded from: classes.dex */
    interface a {
        boolean a(MotionEvent motionEvent);

        void b(GestureDetector.OnDoubleTapListener onDoubleTapListener);

        void c(boolean z3);

        boolean d();
    }

    /* loaded from: classes.dex */
    static class b implements a {

        /* renamed from: v, reason: collision with root package name */
        private static final int f13072v = ViewConfiguration.getTapTimeout();

        /* renamed from: w, reason: collision with root package name */
        private static final int f13073w = ViewConfiguration.getDoubleTapTimeout();

        /* renamed from: x, reason: collision with root package name */
        private static final int f13074x = 1;

        /* renamed from: y, reason: collision with root package name */
        private static final int f13075y = 2;

        /* renamed from: z, reason: collision with root package name */
        private static final int f13076z = 3;

        /* renamed from: a, reason: collision with root package name */
        private int f13077a;

        /* renamed from: b, reason: collision with root package name */
        private int f13078b;

        /* renamed from: c, reason: collision with root package name */
        private int f13079c;

        /* renamed from: d, reason: collision with root package name */
        private int f13080d;

        /* renamed from: e, reason: collision with root package name */
        private final Handler f13081e;

        /* renamed from: f, reason: collision with root package name */
        final GestureDetector.OnGestureListener f13082f;

        /* renamed from: g, reason: collision with root package name */
        GestureDetector.OnDoubleTapListener f13083g;

        /* renamed from: h, reason: collision with root package name */
        boolean f13084h;

        /* renamed from: i, reason: collision with root package name */
        boolean f13085i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f13086j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f13087k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f13088l;

        /* renamed from: m, reason: collision with root package name */
        MotionEvent f13089m;

        /* renamed from: n, reason: collision with root package name */
        private MotionEvent f13090n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f13091o;

        /* renamed from: p, reason: collision with root package name */
        private float f13092p;

        /* renamed from: q, reason: collision with root package name */
        private float f13093q;

        /* renamed from: r, reason: collision with root package name */
        private float f13094r;

        /* renamed from: s, reason: collision with root package name */
        private float f13095s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f13096t;

        /* renamed from: u, reason: collision with root package name */
        private VelocityTracker f13097u;

        b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f13081e = new a(handler);
            } else {
                this.f13081e = new a();
            }
            this.f13082f = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                b((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            h(context);
        }

        private void e() {
            this.f13081e.removeMessages(1);
            this.f13081e.removeMessages(2);
            this.f13081e.removeMessages(3);
            this.f13097u.recycle();
            this.f13097u = null;
            this.f13091o = false;
            this.f13084h = false;
            this.f13087k = false;
            this.f13088l = false;
            this.f13085i = false;
            if (this.f13086j) {
                this.f13086j = false;
            }
        }

        private void f() {
            this.f13081e.removeMessages(1);
            this.f13081e.removeMessages(2);
            this.f13081e.removeMessages(3);
            this.f13091o = false;
            this.f13087k = false;
            this.f13088l = false;
            this.f13085i = false;
            if (this.f13086j) {
                this.f13086j = false;
            }
        }

        private void h(Context context) {
            if (context != null) {
                if (this.f13082f != null) {
                    this.f13096t = true;
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                    int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                    int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                    this.f13079c = viewConfiguration.getScaledMinimumFlingVelocity();
                    this.f13080d = viewConfiguration.getScaledMaximumFlingVelocity();
                    this.f13077a = scaledTouchSlop * scaledTouchSlop;
                    this.f13078b = scaledDoubleTapSlop * scaledDoubleTapSlop;
                    return;
                }
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
            throw new IllegalArgumentException("Context must not be null");
        }

        private boolean i(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (!this.f13088l || motionEvent3.getEventTime() - motionEvent2.getEventTime() > f13073w) {
                return false;
            }
            int x3 = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y3 = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            if ((x3 * x3) + (y3 * y3) >= this.f13078b) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:114:0x0201  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x0218  */
        @Override // androidx.core.view.B.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(android.view.MotionEvent r13) {
            /*
                Method dump skipped, instructions count: 586
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.B.b.a(android.view.MotionEvent):boolean");
        }

        @Override // androidx.core.view.B.a
        public void b(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f13083g = onDoubleTapListener;
        }

        @Override // androidx.core.view.B.a
        public void c(boolean z3) {
            this.f13096t = z3;
        }

        @Override // androidx.core.view.B.a
        public boolean d() {
            return this.f13096t;
        }

        void g() {
            this.f13081e.removeMessages(3);
            this.f13085i = false;
            this.f13086j = true;
            this.f13082f.onLongPress(this.f13089m);
        }

        /* loaded from: classes.dex */
        private class a extends Handler {
            a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i4 = message.what;
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 == 3) {
                            b bVar = b.this;
                            GestureDetector.OnDoubleTapListener onDoubleTapListener = bVar.f13083g;
                            if (onDoubleTapListener != null) {
                                if (!bVar.f13084h) {
                                    onDoubleTapListener.onSingleTapConfirmed(bVar.f13089m);
                                    return;
                                } else {
                                    bVar.f13085i = true;
                                    return;
                                }
                            }
                            return;
                        }
                        throw new RuntimeException("Unknown message " + message);
                    }
                    b.this.g();
                    return;
                }
                b bVar2 = b.this;
                bVar2.f13082f.onShowPress(bVar2.f13089m);
            }

            a(Handler handler) {
                super(handler.getLooper());
            }
        }
    }

    /* loaded from: classes.dex */
    static class c implements a {

        /* renamed from: a, reason: collision with root package name */
        private final GestureDetector f13099a;

        c(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f13099a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // androidx.core.view.B.a
        public boolean a(MotionEvent motionEvent) {
            return this.f13099a.onTouchEvent(motionEvent);
        }

        @Override // androidx.core.view.B.a
        public void b(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f13099a.setOnDoubleTapListener(onDoubleTapListener);
        }

        @Override // androidx.core.view.B.a
        public void c(boolean z3) {
            this.f13099a.setIsLongpressEnabled(z3);
        }

        @Override // androidx.core.view.B.a
        public boolean d() {
            return this.f13099a.isLongpressEnabled();
        }
    }

    public B(@androidx.annotation.N Context context, @androidx.annotation.N GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public boolean a() {
        return this.f13071a.d();
    }

    public boolean b(@androidx.annotation.N MotionEvent motionEvent) {
        return this.f13071a.a(motionEvent);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void c(boolean z3) {
        this.f13071a.c(z3);
    }

    public void d(@androidx.annotation.P GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f13071a.b(onDoubleTapListener);
    }

    public B(@androidx.annotation.N Context context, @androidx.annotation.N GestureDetector.OnGestureListener onGestureListener, @androidx.annotation.P Handler handler) {
        this.f13071a = new c(context, onGestureListener, handler);
    }
}
