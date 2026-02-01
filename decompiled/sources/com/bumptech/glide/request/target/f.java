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
import androidx.annotation.D;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import com.bumptech.glide.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f<T extends View, Z> implements p<Z> {

    /* renamed from: J, reason: collision with root package name */
    private static final String f26843J = "CustomViewTarget";

    /* renamed from: K, reason: collision with root package name */
    @D
    private static final int f26844K = h.e.f25652l;

    /* renamed from: E, reason: collision with root package name */
    private final b f26845E;

    /* renamed from: F, reason: collision with root package name */
    protected final T f26846F;

    /* renamed from: G, reason: collision with root package name */
    @P
    private View.OnAttachStateChangeListener f26847G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f26848H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f26849I;

    /* loaded from: classes.dex */
    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            f.this.t();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            f.this.o();
        }
    }

    @i0
    /* loaded from: classes.dex */
    static final class b {

        /* renamed from: e, reason: collision with root package name */
        private static final int f26851e = 0;

        /* renamed from: f, reason: collision with root package name */
        @P
        @i0
        static Integer f26852f;

        /* renamed from: a, reason: collision with root package name */
        private final View f26853a;

        /* renamed from: b, reason: collision with root package name */
        private final List<o> f26854b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        boolean f26855c;

        /* renamed from: d, reason: collision with root package name */
        @P
        private a f26856d;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: E, reason: collision with root package name */
            private final WeakReference<b> f26857E;

            a(@N b bVar) {
                this.f26857E = new WeakReference<>(bVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable(f.f26843J, 2)) {
                    Log.v(f.f26843J, "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                b bVar = this.f26857E.get();
                if (bVar != null) {
                    bVar.a();
                    return true;
                }
                return true;
            }
        }

        b(@N View view) {
            this.f26853a = view;
        }

        private static int c(@N Context context) {
            if (f26852f == null) {
                Display defaultDisplay = ((WindowManager) com.bumptech.glide.util.l.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f26852f = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f26852f.intValue();
        }

        private int e(int i4, int i5, int i6) {
            int i7 = i5 - i6;
            if (i7 > 0) {
                return i7;
            }
            if (this.f26855c && this.f26853a.isLayoutRequested()) {
                return 0;
            }
            int i8 = i4 - i6;
            if (i8 > 0) {
                return i8;
            }
            if (this.f26853a.isLayoutRequested() || i5 != -2) {
                return 0;
            }
            if (Log.isLoggable(f.f26843J, 4)) {
                Log.i(f.f26843J, "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f26853a.getContext());
        }

        private int f() {
            int i4;
            int paddingTop = this.f26853a.getPaddingTop() + this.f26853a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f26853a.getLayoutParams();
            if (layoutParams != null) {
                i4 = layoutParams.height;
            } else {
                i4 = 0;
            }
            return e(this.f26853a.getHeight(), i4, paddingTop);
        }

        private int g() {
            int i4;
            int paddingLeft = this.f26853a.getPaddingLeft() + this.f26853a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f26853a.getLayoutParams();
            if (layoutParams != null) {
                i4 = layoutParams.width;
            } else {
                i4 = 0;
            }
            return e(this.f26853a.getWidth(), i4, paddingLeft);
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
            Iterator it = new ArrayList(this.f26854b).iterator();
            while (it.hasNext()) {
                ((o) it.next()).f(i4, i5);
            }
        }

        void a() {
            if (this.f26854b.isEmpty()) {
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
            ViewTreeObserver viewTreeObserver = this.f26853a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f26856d);
            }
            this.f26856d = null;
            this.f26854b.clear();
        }

        void d(@N o oVar) {
            int g4 = g();
            int f4 = f();
            if (i(g4, f4)) {
                oVar.f(g4, f4);
                return;
            }
            if (!this.f26854b.contains(oVar)) {
                this.f26854b.add(oVar);
            }
            if (this.f26856d == null) {
                ViewTreeObserver viewTreeObserver = this.f26853a.getViewTreeObserver();
                a aVar = new a(this);
                this.f26856d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        void k(@N o oVar) {
            this.f26854b.remove(oVar);
        }
    }

    public f(@N T t3) {
        this.f26846F = (T) com.bumptech.glide.util.l.d(t3);
        this.f26845E = new b(t3);
    }

    @P
    private Object g() {
        return this.f26846F.getTag(f26844K);
    }

    private void i() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f26847G;
        if (onAttachStateChangeListener != null && !this.f26849I) {
            this.f26846F.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f26849I = true;
        }
    }

    private void j() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f26847G;
        if (onAttachStateChangeListener != null && this.f26849I) {
            this.f26846F.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f26849I = false;
        }
    }

    private void u(@P Object obj) {
        this.f26846F.setTag(f26844K, obj);
    }

    @Override // com.bumptech.glide.manager.m
    public void a() {
    }

    @Override // com.bumptech.glide.manager.m
    public void b() {
    }

    @Override // com.bumptech.glide.request.target.p
    public final void c(@N o oVar) {
        this.f26845E.k(oVar);
    }

    @Override // com.bumptech.glide.manager.m
    public void d() {
    }

    @N
    public final f<T, Z> f() {
        if (this.f26847G != null) {
            return this;
        }
        this.f26847G = new a();
        i();
        return this;
    }

    @N
    public final T h() {
        return this.f26846F;
    }

    protected abstract void k(@P Drawable drawable);

    @Override // com.bumptech.glide.request.target.p
    public final void l(@P com.bumptech.glide.request.e eVar) {
        u(eVar);
    }

    protected void n(@P Drawable drawable) {
    }

    final void o() {
        com.bumptech.glide.request.e q4 = q();
        if (q4 != null) {
            this.f26848H = true;
            q4.clear();
            this.f26848H = false;
        }
    }

    @Override // com.bumptech.glide.request.target.p
    public final void p(@P Drawable drawable) {
        i();
        n(drawable);
    }

    @Override // com.bumptech.glide.request.target.p
    @P
    public final com.bumptech.glide.request.e q() {
        Object g4 = g();
        if (g4 != null) {
            if (g4 instanceof com.bumptech.glide.request.e) {
                return (com.bumptech.glide.request.e) g4;
            }
            throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
        }
        return null;
    }

    @Override // com.bumptech.glide.request.target.p
    public final void r(@P Drawable drawable) {
        this.f26845E.b();
        k(drawable);
        if (!this.f26848H) {
            j();
        }
    }

    @Override // com.bumptech.glide.request.target.p
    public final void s(@N o oVar) {
        this.f26845E.d(oVar);
    }

    final void t() {
        com.bumptech.glide.request.e q4 = q();
        if (q4 != null && q4.g()) {
            q4.i();
        }
    }

    public String toString() {
        return "Target for: " + this.f26846F;
    }

    @Deprecated
    public final f<T, Z> v(@D int i4) {
        return this;
    }

    @N
    public final f<T, Z> w() {
        this.f26845E.f26855c = true;
        return this;
    }
}
