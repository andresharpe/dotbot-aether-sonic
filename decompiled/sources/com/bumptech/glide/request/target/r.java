package com.bumptech.glide.request.target;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.InterfaceC0566i;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import com.bumptech.glide.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public abstract class r<T extends View, Z> extends com.bumptech.glide.request.target.b<Z> {

    /* renamed from: K, reason: collision with root package name */
    private static final String f26880K = "ViewTarget";

    /* renamed from: L, reason: collision with root package name */
    private static boolean f26881L;

    /* renamed from: M, reason: collision with root package name */
    private static int f26882M = h.e.f25652l;

    /* renamed from: F, reason: collision with root package name */
    protected final T f26883F;

    /* renamed from: G, reason: collision with root package name */
    private final b f26884G;

    /* renamed from: H, reason: collision with root package name */
    @P
    private View.OnAttachStateChangeListener f26885H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f26886I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f26887J;

    /* loaded from: classes.dex */
    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            r.this.t();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            r.this.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: e, reason: collision with root package name */
        private static final int f26889e = 0;

        /* renamed from: f, reason: collision with root package name */
        @P
        @i0
        static Integer f26890f;

        /* renamed from: a, reason: collision with root package name */
        private final View f26891a;

        /* renamed from: b, reason: collision with root package name */
        private final List<o> f26892b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        boolean f26893c;

        /* renamed from: d, reason: collision with root package name */
        @P
        private a f26894d;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: E, reason: collision with root package name */
            private final WeakReference<b> f26895E;

            a(@N b bVar) {
                this.f26895E = new WeakReference<>(bVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable(r.f26880K, 2)) {
                    Log.v(r.f26880K, "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                b bVar = this.f26895E.get();
                if (bVar != null) {
                    bVar.a();
                    return true;
                }
                return true;
            }
        }

        b(@N View view) {
            this.f26891a = view;
        }

        private static int c(@N Context context) {
            if (f26890f == null) {
                Display defaultDisplay = ((WindowManager) com.bumptech.glide.util.l.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f26890f = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f26890f.intValue();
        }

        private int e(int i4, int i5, int i6) {
            int i7 = i5 - i6;
            if (i7 > 0) {
                return i7;
            }
            if (this.f26893c && this.f26891a.isLayoutRequested()) {
                return 0;
            }
            int i8 = i4 - i6;
            if (i8 > 0) {
                return i8;
            }
            if (this.f26891a.isLayoutRequested() || i5 != -2) {
                return 0;
            }
            if (Log.isLoggable(r.f26880K, 4)) {
                Log.i(r.f26880K, "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f26891a.getContext());
        }

        private int f() {
            int i4;
            int paddingTop = this.f26891a.getPaddingTop() + this.f26891a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f26891a.getLayoutParams();
            if (layoutParams != null) {
                i4 = layoutParams.height;
            } else {
                i4 = 0;
            }
            return e(this.f26891a.getHeight(), i4, paddingTop);
        }

        private int g() {
            int i4;
            int paddingLeft = this.f26891a.getPaddingLeft() + this.f26891a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f26891a.getLayoutParams();
            if (layoutParams != null) {
                i4 = layoutParams.width;
            } else {
                i4 = 0;
            }
            return e(this.f26891a.getWidth(), i4, paddingLeft);
        }

        private boolean h(int i4) {
            return i4 > 0 || i4 == Integer.MIN_VALUE;
        }

        private boolean i(int i4, int i5) {
            if (h(i4) && h(i5)) {
                return true;
            }
            return false;
        }

        private void j(int i4, int i5) {
            Iterator it = new ArrayList(this.f26892b).iterator();
            while (it.hasNext()) {
                ((o) it.next()).f(i4, i5);
            }
        }

        void a() {
            if (this.f26892b.isEmpty()) {
                return;
            }
            int g4 = g();
            int f4 = f();
            if (!i(g4, f4)) {
                return;
            }
            j(g4, f4);
            b();
        }

        void b() {
            ViewTreeObserver viewTreeObserver = this.f26891a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f26894d);
            }
            this.f26894d = null;
            this.f26892b.clear();
        }

        void d(@N o oVar) {
            int g4 = g();
            int f4 = f();
            if (i(g4, f4)) {
                oVar.f(g4, f4);
                return;
            }
            if (!this.f26892b.contains(oVar)) {
                this.f26892b.add(oVar);
            }
            if (this.f26894d == null) {
                ViewTreeObserver viewTreeObserver = this.f26891a.getViewTreeObserver();
                a aVar = new a(this);
                this.f26894d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        void k(@N o oVar) {
            this.f26892b.remove(oVar);
        }
    }

    public r(@N T t3) {
        this.f26883F = (T) com.bumptech.glide.util.l.d(t3);
        this.f26884G = new b(t3);
    }

    @P
    private Object j() {
        return this.f26883F.getTag(f26882M);
    }

    private void k() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f26885H;
        if (onAttachStateChangeListener != null && !this.f26887J) {
            this.f26883F.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f26887J = true;
        }
    }

    private void n() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f26885H;
        if (onAttachStateChangeListener != null && this.f26887J) {
            this.f26883F.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f26887J = false;
        }
    }

    private void u(@P Object obj) {
        f26881L = true;
        this.f26883F.setTag(f26882M, obj);
    }

    @Deprecated
    public static void v(int i4) {
        if (!f26881L) {
            f26882M = i4;
            return;
        }
        throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
    }

    @Override // com.bumptech.glide.request.target.p
    @InterfaceC0566i
    public void c(@N o oVar) {
        this.f26884G.k(oVar);
    }

    @N
    public T g() {
        return this.f26883F;
    }

    @N
    public final r<T, Z> i() {
        if (this.f26885H != null) {
            return this;
        }
        this.f26885H = new a();
        k();
        return this;
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    public void l(@P com.bumptech.glide.request.e eVar) {
        u(eVar);
    }

    void o() {
        com.bumptech.glide.request.e q4 = q();
        if (q4 != null) {
            this.f26886I = true;
            q4.clear();
            this.f26886I = false;
        }
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    @InterfaceC0566i
    public void p(@P Drawable drawable) {
        super.p(drawable);
        k();
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    @P
    public com.bumptech.glide.request.e q() {
        Object j4 = j();
        if (j4 != null) {
            if (j4 instanceof com.bumptech.glide.request.e) {
                return (com.bumptech.glide.request.e) j4;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    @InterfaceC0566i
    public void r(@P Drawable drawable) {
        super.r(drawable);
        this.f26884G.b();
        if (!this.f26886I) {
            n();
        }
    }

    @Override // com.bumptech.glide.request.target.p
    @InterfaceC0566i
    public void s(@N o oVar) {
        this.f26884G.d(oVar);
    }

    void t() {
        com.bumptech.glide.request.e q4 = q();
        if (q4 != null && q4.g()) {
            q4.i();
        }
    }

    public String toString() {
        return "Target for: " + this.f26883F;
    }

    @N
    public final r<T, Z> w() {
        this.f26884G.f26893c = true;
        return this;
    }

    @Deprecated
    public r(@N T t3, boolean z3) {
        this(t3);
        if (z3) {
            w();
        }
    }
}
