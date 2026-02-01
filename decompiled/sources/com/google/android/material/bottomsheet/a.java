package com.google.android.material.bottomsheet;

import T0.a;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.I;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.d0;
import androidx.appcompat.app.t;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0771a;
import androidx.core.view.C0823k0;
import androidx.core.view.InterfaceC0772a0;
import androidx.core.view.Y0;
import androidx.core.view.accessibility.M;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.color.s;
import com.google.android.material.shape.j;

/* loaded from: classes2.dex */
public class a extends t {

    /* renamed from: I, reason: collision with root package name */
    private BottomSheetBehavior<FrameLayout> f31647I;

    /* renamed from: J, reason: collision with root package name */
    private FrameLayout f31648J;

    /* renamed from: K, reason: collision with root package name */
    private CoordinatorLayout f31649K;

    /* renamed from: L, reason: collision with root package name */
    private FrameLayout f31650L;

    /* renamed from: M, reason: collision with root package name */
    boolean f31651M;

    /* renamed from: N, reason: collision with root package name */
    boolean f31652N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f31653O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f31654P;

    /* renamed from: Q, reason: collision with root package name */
    private BottomSheetBehavior.f f31655Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f31656R;

    /* renamed from: S, reason: collision with root package name */
    @N
    private BottomSheetBehavior.f f31657S;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomsheet.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0278a implements InterfaceC0772a0 {
        C0278a() {
        }

        @Override // androidx.core.view.InterfaceC0772a0
        public Y0 a(View view, Y0 y02) {
            if (a.this.f31655Q != null) {
                a.this.f31647I.D0(a.this.f31655Q);
            }
            if (y02 != null) {
                a aVar = a.this;
                aVar.f31655Q = new f(aVar.f31650L, y02, null);
                a.this.f31647I.Y(a.this.f31655Q);
            }
            return y02;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.f31652N && aVar.isShowing() && a.this.z()) {
                a.this.cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c extends C0771a {
        c() {
        }

        @Override // androidx.core.view.C0771a
        public void g(View view, @N M m4) {
            super.g(view, m4);
            if (a.this.f31652N) {
                m4.a(1048576);
                m4.g1(true);
            } else {
                m4.g1(false);
            }
        }

        @Override // androidx.core.view.C0771a
        public boolean j(View view, int i4, Bundle bundle) {
            if (i4 == 1048576) {
                a aVar = a.this;
                if (aVar.f31652N) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.j(view, i4, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d implements View.OnTouchListener {
        d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* loaded from: classes2.dex */
    class e extends BottomSheetBehavior.f {
        e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(@N View view, float f4) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(@N View view, int i4) {
            if (i4 == 5) {
                a.this.cancel();
            }
        }
    }

    /* loaded from: classes2.dex */
    private static class f extends BottomSheetBehavior.f {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f31663a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f31664b;

        /* renamed from: c, reason: collision with root package name */
        private final Y0 f31665c;

        /* synthetic */ f(View view, Y0 y02, C0278a c0278a) {
            this(view, y02);
        }

        private void d(View view) {
            if (view.getTop() < this.f31665c.r()) {
                a.y(view, this.f31663a);
                view.setPadding(view.getPaddingLeft(), this.f31665c.r() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                a.y(view, this.f31664b);
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        void a(@N View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(@N View view, float f4) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(@N View view, int i4) {
            d(view);
        }

        private f(@N View view, @N Y0 y02) {
            ColorStateList N3;
            this.f31665c = y02;
            boolean z3 = (view.getSystemUiVisibility() & 8192) != 0;
            this.f31664b = z3;
            j n02 = BottomSheetBehavior.i0(view).n0();
            if (n02 != null) {
                N3 = n02.y();
            } else {
                N3 = C0823k0.N(view);
            }
            if (N3 != null) {
                this.f31663a = s.k(N3.getDefaultColor());
            } else if (view.getBackground() instanceof ColorDrawable) {
                this.f31663a = s.k(((ColorDrawable) view.getBackground()).getColor());
            } else {
                this.f31663a = z3;
            }
        }
    }

    public a(@N Context context) {
        this(context, 0);
        this.f31656R = getContext().getTheme().obtainStyledAttributes(new int[]{a.c.t5}).getBoolean(0, false);
    }

    private View A(int i4, @P View view, @P ViewGroup.LayoutParams layoutParams) {
        r();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f31648J.findViewById(a.h.f2720X0);
        if (i4 != 0 && view == null) {
            view = getLayoutInflater().inflate(i4, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f31656R) {
            C0823k0.a2(this.f31650L, new C0278a());
        }
        this.f31650L.removeAllViews();
        if (layoutParams == null) {
            this.f31650L.addView(view);
        } else {
            this.f31650L.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(a.h.X5).setOnClickListener(new b());
        C0823k0.B1(this.f31650L, new c());
        this.f31650L.setOnTouchListener(new d());
        return this.f31648J;
    }

    private static int k(@N Context context, int i4) {
        if (i4 == 0) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(a.c.f1866Q0, typedValue, true)) {
                return typedValue.resourceId;
            }
            return a.n.fb;
        }
        return i4;
    }

    private FrameLayout r() {
        if (this.f31648J == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), a.k.f2926E, null);
            this.f31648J = frameLayout;
            this.f31649K = (CoordinatorLayout) frameLayout.findViewById(a.h.f2720X0);
            FrameLayout frameLayout2 = (FrameLayout) this.f31648J.findViewById(a.h.f2778j1);
            this.f31650L = frameLayout2;
            BottomSheetBehavior<FrameLayout> i02 = BottomSheetBehavior.i0(frameLayout2);
            this.f31647I = i02;
            i02.Y(this.f31657S);
            this.f31647I.O0(this.f31652N);
        }
        return this.f31648J;
    }

    public static void y(@N View view, boolean z3) {
        int i4;
        int systemUiVisibility = view.getSystemUiVisibility();
        if (z3) {
            i4 = systemUiVisibility | 8192;
        } else {
            i4 = systemUiVisibility & (-8193);
        }
        view.setSystemUiVisibility(i4);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> t3 = t();
        if (this.f31651M && t3.u0() != 5) {
            t3.W0(5);
        } else {
            super.cancel();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        boolean z3;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            if (this.f31656R && Color.alpha(window.getNavigationBarColor()) < 255) {
                z3 = true;
            } else {
                z3 = false;
            }
            FrameLayout frameLayout = this.f31648J;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z3);
            }
            CoordinatorLayout coordinatorLayout = this.f31649K;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z3);
            }
            if (z3) {
                window.getDecorView().setSystemUiVisibility(768);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.t, androidx.activity.i, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.i, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f31647I;
        if (bottomSheetBehavior != null && bottomSheetBehavior.u0() == 5) {
            this.f31647I.W0(4);
        }
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z3) {
        super.setCancelable(z3);
        if (this.f31652N != z3) {
            this.f31652N = z3;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f31647I;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.O0(z3);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z3) {
        super.setCanceledOnTouchOutside(z3);
        if (z3 && !this.f31652N) {
            this.f31652N = true;
        }
        this.f31653O = z3;
        this.f31654P = true;
    }

    @Override // androidx.appcompat.app.t, androidx.activity.i, android.app.Dialog
    public void setContentView(@I int i4) {
        super.setContentView(A(i4, null, null));
    }

    @N
    public BottomSheetBehavior<FrameLayout> t() {
        if (this.f31647I == null) {
            r();
        }
        return this.f31647I;
    }

    public boolean u() {
        return this.f31651M;
    }

    public boolean v() {
        return this.f31656R;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w() {
        this.f31647I.D0(this.f31657S);
    }

    public void x(boolean z3) {
        this.f31651M = z3;
    }

    boolean z() {
        if (!this.f31654P) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.f31653O = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f31654P = true;
        }
        return this.f31653O;
    }

    @Override // androidx.appcompat.app.t, androidx.activity.i, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(A(0, view, null));
    }

    @Override // androidx.appcompat.app.t, androidx.activity.i, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(A(0, view, layoutParams));
    }

    public a(@N Context context, @d0 int i4) {
        super(context, k(context, i4));
        this.f31652N = true;
        this.f31653O = true;
        this.f31657S = new e();
        m(1);
        this.f31656R = getContext().getTheme().obtainStyledAttributes(new int[]{a.c.t5}).getBoolean(0, false);
    }

    protected a(@N Context context, boolean z3, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z3, onCancelListener);
        this.f31652N = true;
        this.f31653O = true;
        this.f31657S = new e();
        m(1);
        this.f31652N = z3;
        this.f31656R = getContext().getTheme().obtainStyledAttributes(new int[]{a.c.t5}).getBoolean(0, false);
    }
}
