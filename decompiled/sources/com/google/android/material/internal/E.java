package com.google.android.material.internal;

import T0.a;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.core.view.C0823k0;
import androidx.core.view.InterfaceC0772a0;
import androidx.core.view.Y0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class E {

    /* loaded from: classes2.dex */
    class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ View f32508E;

        a(View view) {
            this.f32508E = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) this.f32508E.getContext().getSystemService("input_method")).showSoftInput(this.f32508E, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f32509a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f32510b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f32511c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f32512d;

        b(boolean z3, boolean z4, boolean z5, e eVar) {
            this.f32509a = z3;
            this.f32510b = z4;
            this.f32511c = z5;
            this.f32512d = eVar;
        }

        @Override // com.google.android.material.internal.E.e
        @N
        public Y0 a(View view, @N Y0 y02, @N f fVar) {
            if (this.f32509a) {
                fVar.f32518d += y02.o();
            }
            boolean k4 = E.k(view);
            if (this.f32510b) {
                if (k4) {
                    fVar.f32517c += y02.p();
                } else {
                    fVar.f32515a += y02.p();
                }
            }
            if (this.f32511c) {
                if (k4) {
                    fVar.f32515a += y02.q();
                } else {
                    fVar.f32517c += y02.q();
                }
            }
            fVar.a(view);
            e eVar = this.f32512d;
            if (eVar != null) {
                return eVar.a(view, y02, fVar);
            }
            return y02;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements InterfaceC0772a0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f32513a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f32514b;

        c(e eVar, f fVar) {
            this.f32513a = eVar;
            this.f32514b = fVar;
        }

        @Override // androidx.core.view.InterfaceC0772a0
        public Y0 a(View view, Y0 y02) {
            return this.f32513a.a(view, y02, new f(this.f32514b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d implements View.OnAttachStateChangeListener {
        d() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@N View view) {
            view.removeOnAttachStateChangeListener(this);
            C0823k0.v1(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes2.dex */
    public interface e {
        Y0 a(View view, Y0 y02, f fVar);
    }

    private E() {
    }

    public static void a(@P View view, @N ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void b(@N View view, @P AttributeSet attributeSet, int i4, int i5) {
        c(view, attributeSet, i4, i5, null);
    }

    public static void c(@N View view, @P AttributeSet attributeSet, int i4, int i5, @P e eVar) {
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, a.o.Ug, i4, i5);
        boolean z3 = obtainStyledAttributes.getBoolean(a.o.Yg, false);
        boolean z4 = obtainStyledAttributes.getBoolean(a.o.Zg, false);
        boolean z5 = obtainStyledAttributes.getBoolean(a.o.ah, false);
        obtainStyledAttributes.recycle();
        d(view, new b(z3, z4, z5, eVar));
    }

    public static void d(@N View view, @N e eVar) {
        C0823k0.a2(view, new c(eVar, new f(C0823k0.k0(view), view.getPaddingTop(), C0823k0.j0(view), view.getPaddingBottom())));
        o(view);
    }

    public static float e(@N Context context, @androidx.annotation.r(unit = 0) int i4) {
        return TypedValue.applyDimension(1, i4, context.getResources().getDisplayMetrics());
    }

    @P
    public static Integer f(@N View view) {
        if (view.getBackground() instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) view.getBackground()).getColor());
        }
        return null;
    }

    @P
    public static ViewGroup g(@P View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    @P
    public static D h(@N View view) {
        return i(g(view));
    }

    @P
    public static D i(@P View view) {
        if (view == null) {
            return null;
        }
        return new C(view);
    }

    public static float j(@N View view) {
        float f4 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f4 += C0823k0.R((View) parent);
        }
        return f4;
    }

    public static boolean k(View view) {
        if (C0823k0.Z(view) == 1) {
            return true;
        }
        return false;
    }

    public static PorterDuff.Mode l(int i4, PorterDuff.Mode mode) {
        if (i4 != 3) {
            if (i4 != 5) {
                if (i4 != 9) {
                    switch (i4) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static void m(@P View view, @N ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            n(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void n(@N ViewTreeObserver viewTreeObserver, @N ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void o(@N View view) {
        if (C0823k0.O0(view)) {
            C0823k0.v1(view);
        } else {
            view.addOnAttachStateChangeListener(new d());
        }
    }

    public static void p(@N View view) {
        view.requestFocus();
        view.post(new a(view));
    }

    /* loaded from: classes2.dex */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public int f32515a;

        /* renamed from: b, reason: collision with root package name */
        public int f32516b;

        /* renamed from: c, reason: collision with root package name */
        public int f32517c;

        /* renamed from: d, reason: collision with root package name */
        public int f32518d;

        public f(int i4, int i5, int i6, int i7) {
            this.f32515a = i4;
            this.f32516b = i5;
            this.f32517c = i6;
            this.f32518d = i7;
        }

        public void a(View view) {
            C0823k0.d2(view, this.f32515a, this.f32516b, this.f32517c, this.f32518d);
        }

        public f(@N f fVar) {
            this.f32515a = fVar.f32515a;
            this.f32516b = fVar.f32516b;
            this.f32517c = fVar.f32517c;
            this.f32518d = fVar.f32518d;
        }
    }
}
