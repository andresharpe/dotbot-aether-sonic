package com.google.android.material.textfield;

import T0.a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class a extends com.google.android.material.textfield.f {

    /* renamed from: k, reason: collision with root package name */
    private static final int f33693k = 100;

    /* renamed from: l, reason: collision with root package name */
    private static final int f33694l = 150;

    /* renamed from: m, reason: collision with root package name */
    private static final float f33695m = 0.8f;

    /* renamed from: e, reason: collision with root package name */
    private final TextWatcher f33696e;

    /* renamed from: f, reason: collision with root package name */
    private final View.OnFocusChangeListener f33697f;

    /* renamed from: g, reason: collision with root package name */
    private final TextInputLayout.h f33698g;

    /* renamed from: h, reason: collision with root package name */
    private final TextInputLayout.i f33699h;

    /* renamed from: i, reason: collision with root package name */
    private AnimatorSet f33700i;

    /* renamed from: j, reason: collision with root package name */
    private ValueAnimator f33701j;

    /* renamed from: com.google.android.material.textfield.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0300a implements TextWatcher {
        C0300a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@N Editable editable) {
            if (a.this.f33750a.getSuffixText() != null) {
                return;
            }
            a aVar = a.this;
            aVar.i(aVar.m());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }
    }

    /* loaded from: classes2.dex */
    class b implements View.OnFocusChangeListener {
        b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z3) {
            a aVar = a.this;
            aVar.i(aVar.m());
        }
    }

    /* loaded from: classes2.dex */
    class c implements TextInputLayout.h {
        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.h
        public void a(@N TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(a.this.m());
            editText.setOnFocusChangeListener(a.this.f33697f);
            a aVar = a.this;
            aVar.f33752c.setOnFocusChangeListener(aVar.f33697f);
            editText.removeTextChangedListener(a.this.f33696e);
            editText.addTextChangedListener(a.this.f33696e);
        }
    }

    /* loaded from: classes2.dex */
    class d implements TextInputLayout.i {

        /* renamed from: com.google.android.material.textfield.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0301a implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ EditText f33706E;

            RunnableC0301a(EditText editText) {
                this.f33706E = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f33706E.removeTextChangedListener(a.this.f33696e);
                a.this.i(true);
            }
        }

        d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.i
        public void a(@N TextInputLayout textInputLayout, int i4) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i4 == 2) {
                editText.post(new RunnableC0301a(editText));
                if (editText.getOnFocusChangeListener() == a.this.f33697f) {
                    editText.setOnFocusChangeListener(null);
                }
                if (a.this.f33752c.getOnFocusChangeListener() == a.this.f33697f) {
                    a.this.f33752c.setOnFocusChangeListener(null);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = a.this.f33750a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            a.this.f33750a.i0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f33750a.setEndIconVisible(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f33750a.setEndIconVisible(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class h implements ValueAnimator.AnimatorUpdateListener {
        h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@N ValueAnimator valueAnimator) {
            a.this.f33752c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class i implements ValueAnimator.AnimatorUpdateListener {
        i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@N ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f33752c.setScaleX(floatValue);
            a.this.f33752c.setScaleY(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(@N TextInputLayout textInputLayout, @InterfaceC0578v int i4) {
        super(textInputLayout, i4);
        this.f33696e = new C0300a();
        this.f33697f = new b();
        this.f33698g = new c();
        this.f33699h = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(boolean z3) {
        boolean z4;
        if (this.f33750a.P() == z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 && !this.f33700i.isRunning()) {
            this.f33701j.cancel();
            this.f33700i.start();
            if (z4) {
                this.f33700i.end();
                return;
            }
            return;
        }
        if (!z3) {
            this.f33700i.cancel();
            this.f33701j.start();
            if (z4) {
                this.f33701j.end();
            }
        }
    }

    private ValueAnimator j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(com.google.android.material.animation.a.f31207a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new h());
        return ofFloat;
    }

    private ValueAnimator k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f33695m, 1.0f);
        ofFloat.setInterpolator(com.google.android.material.animation.a.f31210d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new i());
        return ofFloat;
    }

    private void l() {
        ValueAnimator k4 = k();
        ValueAnimator j4 = j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f33700i = animatorSet;
        animatorSet.playTogether(k4, j4);
        this.f33700i.addListener(new f());
        ValueAnimator j5 = j(1.0f, 0.0f);
        this.f33701j = j5;
        j5.addListener(new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m() {
        EditText editText = this.f33750a.getEditText();
        if (editText != null && ((editText.hasFocus() || this.f33752c.hasFocus()) && editText.getText().length() > 0)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.f
    public void a() {
        TextInputLayout textInputLayout = this.f33750a;
        int i4 = this.f33753d;
        if (i4 == 0) {
            i4 = a.g.f2599q1;
        }
        textInputLayout.setEndIconDrawable(i4);
        TextInputLayout textInputLayout2 = this.f33750a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(a.m.f3053I));
        this.f33750a.setEndIconCheckable(false);
        this.f33750a.setEndIconOnClickListener(new e());
        this.f33750a.g(this.f33698g);
        this.f33750a.h(this.f33699h);
        l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.f
    public void c(boolean z3) {
        if (this.f33750a.getSuffixText() == null) {
            return;
        }
        i(z3);
    }
}
