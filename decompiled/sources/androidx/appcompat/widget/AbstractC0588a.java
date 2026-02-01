package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0823k0;
import androidx.core.view.C0850t0;
import androidx.core.view.InterfaceC0852u0;
import d.C2042a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0588a extends ViewGroup {

    /* renamed from: M, reason: collision with root package name */
    private static final int f6059M = 200;

    /* renamed from: E, reason: collision with root package name */
    protected final b f6060E;

    /* renamed from: F, reason: collision with root package name */
    protected final Context f6061F;

    /* renamed from: G, reason: collision with root package name */
    protected ActionMenuView f6062G;

    /* renamed from: H, reason: collision with root package name */
    protected C0590c f6063H;

    /* renamed from: I, reason: collision with root package name */
    protected int f6064I;

    /* renamed from: J, reason: collision with root package name */
    protected C0850t0 f6065J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f6066K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f6067L;

    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0048a implements Runnable {
        RunnableC0048a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0588a.this.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.appcompat.widget.a$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC0852u0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f6069a = false;

        /* renamed from: b, reason: collision with root package name */
        int f6070b;

        protected b() {
        }

        @Override // androidx.core.view.InterfaceC0852u0
        public void a(View view) {
            this.f6069a = true;
        }

        @Override // androidx.core.view.InterfaceC0852u0
        public void b(View view) {
            if (this.f6069a) {
                return;
            }
            AbstractC0588a abstractC0588a = AbstractC0588a.this;
            abstractC0588a.f6065J = null;
            AbstractC0588a.super.setVisibility(this.f6070b);
        }

        @Override // androidx.core.view.InterfaceC0852u0
        public void c(View view) {
            AbstractC0588a.super.setVisibility(0);
            this.f6069a = false;
        }

        public b d(C0850t0 c0850t0, int i4) {
            AbstractC0588a.this.f6065J = c0850t0;
            this.f6070b = i4;
            return this;
        }
    }

    AbstractC0588a(@androidx.annotation.N Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int k(int i4, int i5, boolean z3) {
        return z3 ? i4 - i5 : i4 + i5;
    }

    public void c(int i4) {
        n(i4, 200L).y();
    }

    public boolean d() {
        if (i() && getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void e() {
        C0590c c0590c = this.f6063H;
        if (c0590c != null) {
            c0590c.B();
        }
    }

    public boolean f() {
        C0590c c0590c = this.f6063H;
        if (c0590c != null) {
            return c0590c.E();
        }
        return false;
    }

    public boolean g() {
        C0590c c0590c = this.f6063H;
        if (c0590c != null) {
            return c0590c.G();
        }
        return false;
    }

    public int getAnimatedVisibility() {
        if (this.f6065J != null) {
            return this.f6060E.f6070b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f6064I;
    }

    public boolean h() {
        C0590c c0590c = this.f6063H;
        if (c0590c != null) {
            return c0590c.H();
        }
        return false;
    }

    public boolean i() {
        C0590c c0590c = this.f6063H;
        if (c0590c != null && c0590c.I()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int j(View view, int i4, int i5, int i6) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i5);
        return Math.max(0, (i4 - view.getMeasuredWidth()) - i6);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int l(View view, int i4, int i5, int i6, boolean z3) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i7 = i5 + ((i6 - measuredHeight) / 2);
        if (z3) {
            view.layout(i4 - measuredWidth, i7, i4, measuredHeight + i7);
        } else {
            view.layout(i4, i7, i4 + measuredWidth, measuredHeight + i7);
        }
        if (z3) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public void m() {
        post(new RunnableC0048a());
    }

    public C0850t0 n(int i4, long j4) {
        C0850t0 c0850t0 = this.f6065J;
        if (c0850t0 != null) {
            c0850t0.d();
        }
        if (i4 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C0850t0 b4 = C0823k0.g(this).b(1.0f);
            b4.s(j4);
            b4.u(this.f6060E.d(b4, i4));
            return b4;
        }
        C0850t0 b5 = C0823k0.g(this).b(0.0f);
        b5.s(j4);
        b5.u(this.f6060E.d(b5, i4));
        return b5;
    }

    public boolean o() {
        C0590c c0590c = this.f6063H;
        if (c0590c != null) {
            return c0590c.Q();
        }
        return false;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C2042a.m.f50070a, C2042a.b.f49220f, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C2042a.m.f50140o, 0));
        obtainStyledAttributes.recycle();
        C0590c c0590c = this.f6063H;
        if (c0590c != null) {
            c0590c.J(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f6067L = false;
        }
        if (!this.f6067L) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f6067L = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f6067L = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f6066K = false;
        }
        if (!this.f6066K) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f6066K = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f6066K = false;
        }
        return true;
    }

    public void setContentHeight(int i4) {
        this.f6064I = i4;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        if (i4 != getVisibility()) {
            C0850t0 c0850t0 = this.f6065J;
            if (c0850t0 != null) {
                c0850t0.d();
            }
            super.setVisibility(i4);
        }
    }

    AbstractC0588a(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0588a(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f6060E = new b();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C2042a.b.f49205c, typedValue, true) && typedValue.resourceId != 0) {
            this.f6061F = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f6061F = context;
        }
    }
}
