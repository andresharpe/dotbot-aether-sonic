package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.RestrictTo;
import androidx.core.view.C0823k0;
import androidx.core.view.C0832m0;

/* JADX INFO: Access modifiers changed from: package-private */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class n0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: O, reason: collision with root package name */
    private static final String f6275O = "TooltipCompatHandler";

    /* renamed from: P, reason: collision with root package name */
    private static final long f6276P = 2500;

    /* renamed from: Q, reason: collision with root package name */
    private static final long f6277Q = 15000;

    /* renamed from: R, reason: collision with root package name */
    private static final long f6278R = 3000;

    /* renamed from: S, reason: collision with root package name */
    private static n0 f6279S;

    /* renamed from: T, reason: collision with root package name */
    private static n0 f6280T;

    /* renamed from: E, reason: collision with root package name */
    private final View f6281E;

    /* renamed from: F, reason: collision with root package name */
    private final CharSequence f6282F;

    /* renamed from: G, reason: collision with root package name */
    private final int f6283G;

    /* renamed from: H, reason: collision with root package name */
    private final Runnable f6284H = new Runnable() { // from class: androidx.appcompat.widget.l0
        @Override // java.lang.Runnable
        public final void run() {
            n0.this.e();
        }
    };

    /* renamed from: I, reason: collision with root package name */
    private final Runnable f6285I = new Runnable() { // from class: androidx.appcompat.widget.m0
        @Override // java.lang.Runnable
        public final void run() {
            n0.this.d();
        }
    };

    /* renamed from: J, reason: collision with root package name */
    private int f6286J;

    /* renamed from: K, reason: collision with root package name */
    private int f6287K;

    /* renamed from: L, reason: collision with root package name */
    private o0 f6288L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f6289M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f6290N;

    private n0(View view, CharSequence charSequence) {
        this.f6281E = view;
        this.f6282F = charSequence;
        this.f6283G = C0832m0.c(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void b() {
        this.f6281E.removeCallbacks(this.f6284H);
    }

    private void c() {
        this.f6290N = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        i(false);
    }

    private void f() {
        this.f6281E.postDelayed(this.f6284H, ViewConfiguration.getLongPressTimeout());
    }

    private static void g(n0 n0Var) {
        n0 n0Var2 = f6279S;
        if (n0Var2 != null) {
            n0Var2.b();
        }
        f6279S = n0Var;
        if (n0Var != null) {
            n0Var.f();
        }
    }

    public static void h(View view, CharSequence charSequence) {
        n0 n0Var = f6279S;
        if (n0Var != null && n0Var.f6281E == view) {
            g(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            n0 n0Var2 = f6280T;
            if (n0Var2 != null && n0Var2.f6281E == view) {
                n0Var2.d();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new n0(view, charSequence);
    }

    private boolean j(MotionEvent motionEvent) {
        int x3 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        if (!this.f6290N && Math.abs(x3 - this.f6286J) <= this.f6283G && Math.abs(y3 - this.f6287K) <= this.f6283G) {
            return false;
        }
        this.f6286J = x3;
        this.f6287K = y3;
        this.f6290N = false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        if (f6280T == this) {
            f6280T = null;
            o0 o0Var = this.f6288L;
            if (o0Var != null) {
                o0Var.c();
                this.f6288L = null;
                c();
                this.f6281E.removeOnAttachStateChangeListener(this);
            } else {
                Log.e(f6275O, "sActiveHandler.mPopup == null");
            }
        }
        if (f6279S == this) {
            g(null);
        }
        this.f6281E.removeCallbacks(this.f6285I);
    }

    void i(boolean z3) {
        long longPressTimeout;
        long j4;
        long j5;
        if (!C0823k0.O0(this.f6281E)) {
            return;
        }
        g(null);
        n0 n0Var = f6280T;
        if (n0Var != null) {
            n0Var.d();
        }
        f6280T = this;
        this.f6289M = z3;
        o0 o0Var = new o0(this.f6281E.getContext());
        this.f6288L = o0Var;
        o0Var.e(this.f6281E, this.f6286J, this.f6287K, this.f6289M, this.f6282F);
        this.f6281E.addOnAttachStateChangeListener(this);
        if (this.f6289M) {
            j5 = 2500;
        } else {
            if ((C0823k0.C0(this.f6281E) & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j4 = f6278R;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j4 = f6277Q;
            }
            j5 = j4 - longPressTimeout;
        }
        this.f6281E.removeCallbacks(this.f6285I);
        this.f6281E.postDelayed(this.f6285I, j5);
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f6288L != null && this.f6289M) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f6281E.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.f6281E.isEnabled() && this.f6288L == null && j(motionEvent)) {
            g(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f6286J = view.getWidth() / 2;
        this.f6287K = view.getHeight() / 2;
        i(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }
}
