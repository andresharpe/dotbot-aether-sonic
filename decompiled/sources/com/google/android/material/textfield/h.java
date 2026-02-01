package com.google.android.material.textfield;

import T0.a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0574q;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.d0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.C0823k0;
import androidx.core.widget.r;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: A, reason: collision with root package name */
    private static final int f33754A = 0;

    /* renamed from: B, reason: collision with root package name */
    private static final int f33755B = 1;

    /* renamed from: C, reason: collision with root package name */
    private static final int f33756C = 2;

    /* renamed from: v, reason: collision with root package name */
    private static final int f33757v = 217;

    /* renamed from: w, reason: collision with root package name */
    private static final int f33758w = 167;

    /* renamed from: x, reason: collision with root package name */
    static final int f33759x = 0;

    /* renamed from: y, reason: collision with root package name */
    static final int f33760y = 1;

    /* renamed from: z, reason: collision with root package name */
    static final int f33761z = 2;

    /* renamed from: a, reason: collision with root package name */
    private final Context f33762a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final TextInputLayout f33763b;

    /* renamed from: c, reason: collision with root package name */
    private LinearLayout f33764c;

    /* renamed from: d, reason: collision with root package name */
    private int f33765d;

    /* renamed from: e, reason: collision with root package name */
    private FrameLayout f33766e;

    /* renamed from: f, reason: collision with root package name */
    @P
    private Animator f33767f;

    /* renamed from: g, reason: collision with root package name */
    private final float f33768g;

    /* renamed from: h, reason: collision with root package name */
    private int f33769h;

    /* renamed from: i, reason: collision with root package name */
    private int f33770i;

    /* renamed from: j, reason: collision with root package name */
    @P
    private CharSequence f33771j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f33772k;

    /* renamed from: l, reason: collision with root package name */
    @P
    private TextView f33773l;

    /* renamed from: m, reason: collision with root package name */
    @P
    private CharSequence f33774m;

    /* renamed from: n, reason: collision with root package name */
    private int f33775n;

    /* renamed from: o, reason: collision with root package name */
    @P
    private ColorStateList f33776o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f33777p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f33778q;

    /* renamed from: r, reason: collision with root package name */
    @P
    private TextView f33779r;

    /* renamed from: s, reason: collision with root package name */
    private int f33780s;

    /* renamed from: t, reason: collision with root package name */
    @P
    private ColorStateList f33781t;

    /* renamed from: u, reason: collision with root package name */
    private Typeface f33782u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f33783a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f33784b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f33785c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f33786d;

        a(int i4, TextView textView, int i5, TextView textView2) {
            this.f33783a = i4;
            this.f33784b = textView;
            this.f33785c = i5;
            this.f33786d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            h.this.f33769h = this.f33783a;
            h.this.f33767f = null;
            TextView textView = this.f33784b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f33785c == 1 && h.this.f33773l != null) {
                    h.this.f33773l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f33786d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f33786d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f33786d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends View.AccessibilityDelegate {
        b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = h.this.f33763b.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public h(@N TextInputLayout textInputLayout) {
        this.f33762a = textInputLayout.getContext();
        this.f33763b = textInputLayout;
        this.f33768g = r0.getResources().getDimensionPixelSize(a.f.f2300K1);
    }

    private boolean B(int i4) {
        if (i4 == 1 && this.f33773l != null && !TextUtils.isEmpty(this.f33771j)) {
            return true;
        }
        return false;
    }

    private boolean C(int i4) {
        if (i4 == 2 && this.f33779r != null && !TextUtils.isEmpty(this.f33777p)) {
            return true;
        }
        return false;
    }

    private void H(int i4, int i5) {
        TextView n4;
        TextView n5;
        if (i4 == i5) {
            return;
        }
        if (i5 != 0 && (n5 = n(i5)) != null) {
            n5.setVisibility(0);
            n5.setAlpha(1.0f);
        }
        if (i4 != 0 && (n4 = n(i4)) != null) {
            n4.setVisibility(4);
            if (i4 == 1) {
                n4.setText((CharSequence) null);
            }
        }
        this.f33769h = i5;
    }

    private void P(@P TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void R(@N ViewGroup viewGroup, int i4) {
        if (i4 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean S(@P TextView textView, @N CharSequence charSequence) {
        if (C0823k0.U0(this.f33763b) && this.f33763b.isEnabled() && (this.f33770i != this.f33769h || textView == null || !TextUtils.equals(textView.getText(), charSequence))) {
            return true;
        }
        return false;
    }

    private void V(int i4, int i5, boolean z3) {
        if (i4 == i5) {
            return;
        }
        if (z3) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f33767f = animatorSet;
            ArrayList arrayList = new ArrayList();
            i(arrayList, this.f33778q, this.f33779r, 2, i4, i5);
            i(arrayList, this.f33772k, this.f33773l, 1, i4, i5);
            com.google.android.material.animation.b.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i5, n(i4), i4, n(i5)));
            animatorSet.start();
        } else {
            H(i4, i5);
        }
        this.f33763b.I0();
        this.f33763b.N0(z3);
        this.f33763b.V0();
    }

    private boolean g() {
        if (this.f33764c != null && this.f33763b.getEditText() != null) {
            return true;
        }
        return false;
    }

    private void i(@N List<Animator> list, boolean z3, @P TextView textView, int i4, int i5, int i6) {
        boolean z4;
        if (textView != null && z3) {
            if (i4 == i6 || i4 == i5) {
                if (i6 == i4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                list.add(j(textView, z4));
                if (i6 == i4) {
                    list.add(k(textView));
                }
            }
        }
    }

    private ObjectAnimator j(TextView textView, boolean z3) {
        float f4;
        if (z3) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, f4);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(com.google.android.material.animation.a.f31207a);
        return ofFloat;
    }

    private ObjectAnimator k(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f33768g, 0.0f);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(com.google.android.material.animation.a.f31210d);
        return ofFloat;
    }

    @P
    private TextView n(int i4) {
        if (i4 != 1) {
            if (i4 != 2) {
                return null;
            }
            return this.f33779r;
        }
        return this.f33773l;
    }

    private int w(boolean z3, @InterfaceC0574q int i4, int i5) {
        if (z3) {
            return this.f33762a.getResources().getDimensionPixelSize(i4);
        }
        return i5;
    }

    void A() {
        h();
        int i4 = this.f33769h;
        if (i4 == 2) {
            this.f33770i = 0;
        }
        V(i4, this.f33770i, S(this.f33779r, ""));
    }

    boolean D(int i4) {
        return i4 == 0 || i4 == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean E() {
        return this.f33772k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean F() {
        return this.f33778q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G(TextView textView, int i4) {
        FrameLayout frameLayout;
        if (this.f33764c == null) {
            return;
        }
        if (D(i4) && (frameLayout = this.f33766e) != null) {
            frameLayout.removeView(textView);
        } else {
            this.f33764c.removeView(textView);
        }
        int i5 = this.f33765d - 1;
        this.f33765d = i5;
        R(this.f33764c, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I(@P CharSequence charSequence) {
        this.f33774m = charSequence;
        TextView textView = this.f33773l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(boolean z3) {
        if (this.f33772k == z3) {
            return;
        }
        h();
        if (z3) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f33762a);
            this.f33773l = appCompatTextView;
            appCompatTextView.setId(a.h.M5);
            this.f33773l.setTextAlignment(5);
            Typeface typeface = this.f33782u;
            if (typeface != null) {
                this.f33773l.setTypeface(typeface);
            }
            K(this.f33775n);
            L(this.f33776o);
            I(this.f33774m);
            this.f33773l.setVisibility(4);
            C0823k0.D1(this.f33773l, 1);
            e(this.f33773l, 0);
        } else {
            z();
            G(this.f33773l, 0);
            this.f33773l = null;
            this.f33763b.I0();
            this.f33763b.V0();
        }
        this.f33772k = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(@d0 int i4) {
        this.f33775n = i4;
        TextView textView = this.f33773l;
        if (textView != null) {
            this.f33763b.u0(textView, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L(@P ColorStateList colorStateList) {
        this.f33776o = colorStateList;
        TextView textView = this.f33773l;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M(@d0 int i4) {
        this.f33780s = i4;
        TextView textView = this.f33779r;
        if (textView != null) {
            r.E(textView, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N(boolean z3) {
        if (this.f33778q == z3) {
            return;
        }
        h();
        if (z3) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f33762a);
            this.f33779r = appCompatTextView;
            appCompatTextView.setId(a.h.N5);
            this.f33779r.setTextAlignment(5);
            Typeface typeface = this.f33782u;
            if (typeface != null) {
                this.f33779r.setTypeface(typeface);
            }
            this.f33779r.setVisibility(4);
            C0823k0.D1(this.f33779r, 1);
            M(this.f33780s);
            O(this.f33781t);
            e(this.f33779r, 1);
            this.f33779r.setAccessibilityDelegate(new b());
        } else {
            A();
            G(this.f33779r, 1);
            this.f33779r = null;
            this.f33763b.I0();
            this.f33763b.V0();
        }
        this.f33778q = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O(@P ColorStateList colorStateList) {
        this.f33781t = colorStateList;
        TextView textView = this.f33779r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q(Typeface typeface) {
        if (typeface != this.f33782u) {
            this.f33782u = typeface;
            P(this.f33773l, typeface);
            P(this.f33779r, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(CharSequence charSequence) {
        h();
        this.f33771j = charSequence;
        this.f33773l.setText(charSequence);
        int i4 = this.f33769h;
        if (i4 != 1) {
            this.f33770i = 1;
        }
        V(i4, this.f33770i, S(this.f33773l, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U(CharSequence charSequence) {
        h();
        this.f33777p = charSequence;
        this.f33779r.setText(charSequence);
        int i4 = this.f33769h;
        if (i4 != 2) {
            this.f33770i = 2;
        }
        V(i4, this.f33770i, S(this.f33779r, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(TextView textView, int i4) {
        if (this.f33764c == null && this.f33766e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f33762a);
            this.f33764c = linearLayout;
            linearLayout.setOrientation(0);
            this.f33763b.addView(this.f33764c, -1, -2);
            this.f33766e = new FrameLayout(this.f33762a);
            this.f33764c.addView(this.f33766e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f33763b.getEditText() != null) {
                f();
            }
        }
        if (D(i4)) {
            this.f33766e.setVisibility(0);
            this.f33766e.addView(textView);
        } else {
            this.f33764c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f33764c.setVisibility(0);
        this.f33765d++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        if (g()) {
            EditText editText = this.f33763b.getEditText();
            boolean i4 = com.google.android.material.resources.c.i(this.f33762a);
            C0823k0.d2(this.f33764c, w(i4, a.f.E5, C0823k0.k0(editText)), w(i4, a.f.F5, this.f33762a.getResources().getDimensionPixelSize(a.f.D5)), w(i4, a.f.E5, C0823k0.j0(editText)), 0);
        }
    }

    void h() {
        Animator animator = this.f33767f;
        if (animator != null) {
            animator.cancel();
        }
    }

    boolean l() {
        return B(this.f33769h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m() {
        return B(this.f33770i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public CharSequence o() {
        return this.f33774m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public CharSequence p() {
        return this.f33771j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC0569l
    public int q() {
        TextView textView = this.f33773l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public ColorStateList r() {
        TextView textView = this.f33773l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence s() {
        return this.f33777p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public View t() {
        return this.f33779r;
    }

    @P
    ColorStateList u() {
        TextView textView = this.f33779r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC0569l
    public int v() {
        TextView textView = this.f33779r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x() {
        return C(this.f33769h);
    }

    boolean y() {
        return C(this.f33770i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z() {
        this.f33771j = null;
        h();
        if (this.f33769h == 1) {
            if (this.f33778q && !TextUtils.isEmpty(this.f33777p)) {
                this.f33770i = 2;
            } else {
                this.f33770i = 0;
            }
        }
        V(this.f33769h, this.f33770i, S(this.f33773l, ""));
    }
}
