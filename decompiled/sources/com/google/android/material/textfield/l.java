package com.google.android.material.textfield;

import T0.a;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.d0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.g0;
import androidx.core.view.C;
import androidx.core.view.C0823k0;
import androidx.core.view.H;
import androidx.core.view.accessibility.M;
import androidx.core.widget.r;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.E;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public class l extends LinearLayout {

    /* renamed from: E, reason: collision with root package name */
    private final TextInputLayout f33804E;

    /* renamed from: F, reason: collision with root package name */
    private final TextView f33805F;

    /* renamed from: G, reason: collision with root package name */
    @P
    private CharSequence f33806G;

    /* renamed from: H, reason: collision with root package name */
    private final CheckableImageButton f33807H;

    /* renamed from: I, reason: collision with root package name */
    private ColorStateList f33808I;

    /* renamed from: J, reason: collision with root package name */
    private PorterDuff.Mode f33809J;

    /* renamed from: K, reason: collision with root package name */
    private View.OnLongClickListener f33810K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f33811L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(TextInputLayout textInputLayout, g0 g0Var) {
        super(textInputLayout.getContext());
        this.f33804E = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, C.f13101b));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(a.k.f2952R, (ViewGroup) this, false);
        this.f33807H = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f33805F = appCompatTextView;
        g(g0Var);
        f(g0Var);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private void f(g0 g0Var) {
        this.f33805F.setVisibility(8);
        this.f33805F.setId(a.h.P5);
        this.f33805F.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        C0823k0.D1(this.f33805F, 1);
        m(g0Var.u(a.o.Uu, 0));
        if (g0Var.C(a.o.Vu)) {
            n(g0Var.d(a.o.Vu));
        }
        l(g0Var.x(a.o.Tu));
    }

    private void g(g0 g0Var) {
        if (com.google.android.material.resources.c.i(getContext())) {
            H.g((ViewGroup.MarginLayoutParams) this.f33807H.getLayoutParams(), 0);
        }
        r(null);
        s(null);
        if (g0Var.C(a.o.bv)) {
            this.f33808I = com.google.android.material.resources.c.b(getContext(), g0Var, a.o.bv);
        }
        if (g0Var.C(a.o.cv)) {
            this.f33809J = E.l(g0Var.o(a.o.cv, -1), null);
        }
        if (g0Var.C(a.o.av)) {
            q(g0Var.h(a.o.av));
            if (g0Var.C(a.o.Zu)) {
                p(g0Var.x(a.o.Zu));
            }
            o(g0Var.a(a.o.Yu, true));
        }
    }

    private void y() {
        int i4;
        int i5 = 8;
        if (this.f33806G != null && !this.f33811L) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        if (this.f33807H.getVisibility() == 0 || i4 == 0) {
            i5 = 0;
        }
        setVisibility(i5);
        this.f33805F.setVisibility(i4);
        this.f33804E.H0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public CharSequence a() {
        return this.f33806G;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public ColorStateList b() {
        return this.f33805F.getTextColors();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public TextView c() {
        return this.f33805F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public CharSequence d() {
        return this.f33807H.getContentDescription();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public Drawable e() {
        return this.f33807H.getDrawable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h() {
        return this.f33807H.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i() {
        if (this.f33807H.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(boolean z3) {
        this.f33811L = z3;
        y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        g.c(this.f33804E, this.f33807H, this.f33808I);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(@P CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f33806G = charSequence2;
        this.f33805F.setText(charSequence);
        y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(@d0 int i4) {
        r.E(this.f33805F, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(@N ColorStateList colorStateList) {
        this.f33805F.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(boolean z3) {
        this.f33807H.setCheckable(z3);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(@P CharSequence charSequence) {
        if (d() != charSequence) {
            this.f33807H.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(@P Drawable drawable) {
        this.f33807H.setImageDrawable(drawable);
        if (drawable != null) {
            g.a(this.f33804E, this.f33807H, this.f33808I, this.f33809J);
            v(true);
            k();
        } else {
            v(false);
            r(null);
            s(null);
            p(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(@P View.OnClickListener onClickListener) {
        g.e(this.f33807H, onClickListener, this.f33810K);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(@P View.OnLongClickListener onLongClickListener) {
        this.f33810K = onLongClickListener;
        g.f(this.f33807H, onLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(@P ColorStateList colorStateList) {
        if (this.f33808I != colorStateList) {
            this.f33808I = colorStateList;
            g.a(this.f33804E, this.f33807H, colorStateList, this.f33809J);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(@P PorterDuff.Mode mode) {
        if (this.f33809J != mode) {
            this.f33809J = mode;
            g.a(this.f33804E, this.f33807H, this.f33808I, mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(boolean z3) {
        int i4;
        if (i() != z3) {
            CheckableImageButton checkableImageButton = this.f33807H;
            if (z3) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            checkableImageButton.setVisibility(i4);
            x();
            y();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(@N M m4) {
        if (this.f33805F.getVisibility() == 0) {
            m4.r1(this.f33805F);
            m4.U1(this.f33805F);
        } else {
            m4.U1(this.f33807H);
        }
    }

    void x() {
        int k02;
        EditText editText = this.f33804E.f33612I;
        if (editText == null) {
            return;
        }
        if (i()) {
            k02 = 0;
        } else {
            k02 = C0823k0.k0(editText);
        }
        C0823k0.d2(this.f33805F, k02, editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(a.f.G5), editText.getCompoundPaddingBottom());
    }
}
