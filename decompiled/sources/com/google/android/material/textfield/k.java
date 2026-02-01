package com.google.android.material.textfield;

import T0.a;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import com.google.android.material.internal.v;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class k extends f {

    /* renamed from: e, reason: collision with root package name */
    private final TextWatcher f33795e;

    /* renamed from: f, reason: collision with root package name */
    private final TextInputLayout.h f33796f;

    /* renamed from: g, reason: collision with root package name */
    private final TextInputLayout.i f33797g;

    /* loaded from: classes2.dex */
    class a extends v {
        a() {
        }

        @Override // com.google.android.material.internal.v, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            k.this.f33752c.setChecked(!r1.g());
        }
    }

    /* loaded from: classes2.dex */
    class b implements TextInputLayout.h {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.h
        public void a(@N TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            k.this.f33752c.setChecked(!r0.g());
            editText.removeTextChangedListener(k.this.f33795e);
            editText.addTextChangedListener(k.this.f33795e);
        }
    }

    /* loaded from: classes2.dex */
    class c implements TextInputLayout.i {

        /* loaded from: classes2.dex */
        class a implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ EditText f33801E;

            a(EditText editText) {
                this.f33801E = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f33801E.removeTextChangedListener(k.this.f33795e);
            }
        }

        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.i
        public void a(@N TextInputLayout textInputLayout, int i4) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i4 == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.post(new a(editText));
            }
        }
    }

    /* loaded from: classes2.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = k.this.f33750a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (k.this.g()) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            k.this.f33750a.i0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(@N TextInputLayout textInputLayout, @InterfaceC0578v int i4) {
        super(textInputLayout, i4);
        this.f33795e = new a();
        this.f33796f = new b();
        this.f33797g = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        EditText editText = this.f33750a.getEditText();
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            return true;
        }
        return false;
    }

    private static boolean h(EditText editText) {
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
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
            i4 = a.g.f2513J0;
        }
        textInputLayout.setEndIconDrawable(i4);
        TextInputLayout textInputLayout2 = this.f33750a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(a.m.f3121k1));
        this.f33750a.setEndIconVisible(true);
        this.f33750a.setEndIconCheckable(true);
        this.f33750a.setEndIconOnClickListener(new d());
        this.f33750a.g(this.f33796f);
        this.f33750a.h(this.f33797g);
        EditText editText = this.f33750a.getEditText();
        if (h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
