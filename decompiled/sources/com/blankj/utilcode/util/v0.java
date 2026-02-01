package com.blankj.utilcode.util;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0578v;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.Snackbar;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: k, reason: collision with root package name */
    public static final int f25186k = -2;

    /* renamed from: l, reason: collision with root package name */
    public static final int f25187l = -1;

    /* renamed from: m, reason: collision with root package name */
    public static final int f25188m = 0;

    /* renamed from: n, reason: collision with root package name */
    private static final int f25189n = -16777217;

    /* renamed from: o, reason: collision with root package name */
    private static final int f25190o = -13912576;

    /* renamed from: p, reason: collision with root package name */
    private static final int f25191p = -16128;

    /* renamed from: q, reason: collision with root package name */
    private static final int f25192q = -65536;

    /* renamed from: r, reason: collision with root package name */
    private static final int f25193r = -1;

    /* renamed from: s, reason: collision with root package name */
    private static WeakReference<Snackbar> f25194s;

    /* renamed from: a, reason: collision with root package name */
    private View f25195a;

    /* renamed from: b, reason: collision with root package name */
    private CharSequence f25196b;

    /* renamed from: c, reason: collision with root package name */
    private int f25197c;

    /* renamed from: d, reason: collision with root package name */
    private int f25198d;

    /* renamed from: e, reason: collision with root package name */
    private int f25199e;

    /* renamed from: f, reason: collision with root package name */
    private int f25200f;

    /* renamed from: g, reason: collision with root package name */
    private CharSequence f25201g;

    /* renamed from: h, reason: collision with root package name */
    private int f25202h;

    /* renamed from: i, reason: collision with root package name */
    private View.OnClickListener f25203i;

    /* renamed from: j, reason: collision with root package name */
    private int f25204j;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    private v0(View view) {
        k();
        this.f25195a = view;
    }

    public static void a(@androidx.annotation.I int i4, @androidx.annotation.N ViewGroup.LayoutParams layoutParams) {
        View e4 = e();
        if (e4 != null) {
            e4.setPadding(0, 0, 0, 0);
            ((Snackbar.SnackbarLayout) e4).addView(LayoutInflater.from(e4.getContext()).inflate(i4, (ViewGroup) null), -1, layoutParams);
        }
    }

    public static void b(@androidx.annotation.N View view, @androidx.annotation.N ViewGroup.LayoutParams layoutParams) {
        View e4 = e();
        if (e4 != null) {
            e4.setPadding(0, 0, 0, 0);
            ((Snackbar.SnackbarLayout) e4).addView(view, layoutParams);
        }
    }

    public static void c() {
        WeakReference<Snackbar> weakReference = f25194s;
        if (weakReference != null && weakReference.get() != null) {
            f25194s.get().t();
            f25194s = null;
        }
    }

    private static ViewGroup d(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    public static View e() {
        Snackbar snackbar = f25194s.get();
        if (snackbar == null) {
            return null;
        }
        return snackbar.G();
    }

    private void k() {
        this.f25196b = "";
        this.f25197c = f25189n;
        this.f25198d = f25189n;
        this.f25199e = -1;
        this.f25200f = -1;
        this.f25201g = "";
        this.f25202h = f25189n;
        this.f25204j = 0;
    }

    public static v0 w(@androidx.annotation.N View view) {
        return new v0(view);
    }

    public v0 f(@androidx.annotation.N CharSequence charSequence, @InterfaceC0569l int i4, @androidx.annotation.N View.OnClickListener onClickListener) {
        this.f25201g = charSequence;
        this.f25202h = i4;
        this.f25203i = onClickListener;
        return this;
    }

    public v0 g(@androidx.annotation.N CharSequence charSequence, @androidx.annotation.N View.OnClickListener onClickListener) {
        return f(charSequence, f25189n, onClickListener);
    }

    public v0 h(@InterfaceC0569l int i4) {
        this.f25198d = i4;
        return this;
    }

    public v0 i(@InterfaceC0578v int i4) {
        this.f25199e = i4;
        return this;
    }

    public v0 j(@androidx.annotation.F(from = 1) int i4) {
        this.f25204j = i4;
        return this;
    }

    public v0 l(int i4) {
        this.f25200f = i4;
        return this;
    }

    public v0 m(@androidx.annotation.N CharSequence charSequence) {
        this.f25196b = charSequence;
        return this;
    }

    public v0 n(@InterfaceC0569l int i4) {
        this.f25197c = i4;
        return this;
    }

    public Snackbar o() {
        return p(false);
    }

    public Snackbar p(boolean z3) {
        View view = this.f25195a;
        if (view == null) {
            return null;
        }
        if (z3) {
            ViewGroup d4 = d(view);
            View findViewWithTag = d4.findViewWithTag("topSnackBarCoordinatorLayout");
            if (findViewWithTag == null) {
                findViewWithTag = new CoordinatorLayout(view.getContext());
                findViewWithTag.setTag("topSnackBarCoordinatorLayout");
                findViewWithTag.setRotation(180.0f);
                findViewWithTag.setElevation(100.0f);
                d4.addView(findViewWithTag, -1, -1);
            }
            view = findViewWithTag;
        }
        if (this.f25197c != f25189n) {
            SpannableString spannableString = new SpannableString(this.f25196b);
            spannableString.setSpan(new ForegroundColorSpan(this.f25197c), 0, spannableString.length(), 33);
            f25194s = new WeakReference<>(Snackbar.w0(view, spannableString, this.f25200f));
        } else {
            f25194s = new WeakReference<>(Snackbar.w0(view, this.f25196b, this.f25200f));
        }
        Snackbar snackbar = f25194s.get();
        Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) snackbar.G();
        if (z3) {
            for (int i4 = 0; i4 < snackbarLayout.getChildCount(); i4++) {
                snackbarLayout.getChildAt(i4).setRotation(180.0f);
            }
        }
        int i5 = this.f25199e;
        if (i5 != -1) {
            snackbarLayout.setBackgroundResource(i5);
        } else {
            int i6 = this.f25198d;
            if (i6 != f25189n) {
                snackbarLayout.setBackgroundColor(i6);
            }
        }
        if (this.f25204j != 0) {
            ((ViewGroup.MarginLayoutParams) snackbarLayout.getLayoutParams()).bottomMargin = this.f25204j;
        }
        if (this.f25201g.length() > 0 && this.f25203i != null) {
            int i7 = this.f25202h;
            if (i7 != f25189n) {
                snackbar.A0(i7);
            }
            snackbar.z0(this.f25201g, this.f25203i);
        }
        snackbar.g0();
        return snackbar;
    }

    public void q() {
        r(false);
    }

    public void r(boolean z3) {
        this.f25198d = -65536;
        this.f25197c = -1;
        this.f25202h = -1;
        p(z3);
    }

    public void s() {
        t(false);
    }

    public void t(boolean z3) {
        this.f25198d = f25190o;
        this.f25197c = -1;
        this.f25202h = -1;
        p(z3);
    }

    public void u() {
        v(false);
    }

    public void v(boolean z3) {
        this.f25198d = f25191p;
        this.f25197c = -1;
        this.f25202h = -1;
        p(z3);
    }
}
