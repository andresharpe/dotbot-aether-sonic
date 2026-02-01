package com.google.android.material.timepicker;

import T0.a;
import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.core.view.C0771a;
import androidx.core.view.C0823k0;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.E;
import com.google.android.material.internal.v;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: E, reason: collision with root package name */
    private final Chip f33812E;

    /* renamed from: F, reason: collision with root package name */
    private final TextInputLayout f33813F;

    /* renamed from: G, reason: collision with root package name */
    private final EditText f33814G;

    /* renamed from: H, reason: collision with root package name */
    private TextWatcher f33815H;

    /* renamed from: I, reason: collision with root package name */
    private TextView f33816I;

    /* loaded from: classes2.dex */
    private class b extends v {

        /* renamed from: F, reason: collision with root package name */
        private static final String f33817F = "00";

        private b() {
        }

        @Override // com.google.android.material.internal.v, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f33812E.setText(ChipTextInputComboView.this.d(f33817F));
            } else {
                ChipTextInputComboView.this.f33812E.setText(ChipTextInputComboView.this.d(editable));
            }
        }
    }

    public ChipTextInputComboView(@N Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(CharSequence charSequence) {
        return e.a(getResources(), charSequence);
    }

    private void j() {
        this.f33814G.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    public void c(InputFilter inputFilter) {
        InputFilter[] filters = this.f33814G.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.f33814G.setFilters(inputFilterArr);
    }

    public TextInputLayout e() {
        return this.f33813F;
    }

    public void f(C0771a c0771a) {
        C0823k0.B1(this.f33812E, c0771a);
    }

    public void g(boolean z3) {
        this.f33814G.setCursorVisible(z3);
    }

    public void h(CharSequence charSequence) {
        this.f33816I.setText(charSequence);
    }

    public void i(CharSequence charSequence) {
        this.f33812E.setText(d(charSequence));
        if (!TextUtils.isEmpty(this.f33814G.getText())) {
            this.f33814G.removeTextChangedListener(this.f33815H);
            this.f33814G.setText((CharSequence) null);
            this.f33814G.addTextChangedListener(this.f33815H);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f33812E.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        j();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z3) {
        int i4;
        this.f33812E.setChecked(z3);
        EditText editText = this.f33814G;
        int i5 = 0;
        if (z3) {
            i4 = 0;
        } else {
            i4 = 4;
        }
        editText.setVisibility(i4);
        Chip chip = this.f33812E;
        if (z3) {
            i5 = 8;
        }
        chip.setVisibility(i5);
        if (isChecked()) {
            E.p(this.f33814G);
            if (!TextUtils.isEmpty(this.f33814G.getText())) {
                EditText editText2 = this.f33814G;
                editText2.setSelection(editText2.getText().length());
            }
        }
    }

    @Override // android.view.View
    public void setOnClickListener(@P View.OnClickListener onClickListener) {
        this.f33812E.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i4, Object obj) {
        this.f33812E.setTag(i4, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f33812E.toggle();
    }

    public ChipTextInputComboView(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(@N Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(a.k.f2986f0, (ViewGroup) this, false);
        this.f33812E = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(a.k.f2989g0, (ViewGroup) this, false);
        this.f33813F = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f33814G = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f33815H = bVar;
        editText.addTextChangedListener(bVar);
        j();
        addView(chip);
        addView(textInputLayout);
        this.f33816I = (TextView) findViewById(a.h.f2666J2);
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
