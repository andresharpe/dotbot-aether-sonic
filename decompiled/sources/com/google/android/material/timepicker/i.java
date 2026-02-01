package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
class i implements TextView.OnEditorActionListener, View.OnKeyListener {

    /* renamed from: E, reason: collision with root package name */
    private final ChipTextInputComboView f33946E;

    /* renamed from: F, reason: collision with root package name */
    private final ChipTextInputComboView f33947F;

    /* renamed from: G, reason: collision with root package name */
    private final e f33948G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f33949H = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, e eVar) {
        this.f33946E = chipTextInputComboView;
        this.f33947F = chipTextInputComboView2;
        this.f33948G = eVar;
    }

    private void b(int i4) {
        boolean z3;
        ChipTextInputComboView chipTextInputComboView = this.f33947F;
        boolean z4 = false;
        if (i4 == 12) {
            z3 = true;
        } else {
            z3 = false;
        }
        chipTextInputComboView.setChecked(z3);
        ChipTextInputComboView chipTextInputComboView2 = this.f33946E;
        if (i4 == 10) {
            z4 = true;
        }
        chipTextInputComboView2.setChecked(z4);
        this.f33948G.f33932J = i4;
    }

    private boolean c(int i4, KeyEvent keyEvent, EditText editText) {
        Editable text = editText.getText();
        if (text == null || i4 < 7 || i4 > 16 || keyEvent.getAction() != 1 || editText.getSelectionStart() != 2 || text.length() != 2) {
            return false;
        }
        b(12);
        return true;
    }

    private boolean d(int i4, KeyEvent keyEvent, EditText editText) {
        if (i4 == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
            b(10);
            return true;
        }
        return false;
    }

    public void a() {
        TextInputLayout e4 = this.f33946E.e();
        TextInputLayout e5 = this.f33947F.e();
        EditText editText = e4.getEditText();
        EditText editText2 = e5.getEditText();
        editText.setImeOptions(268435461);
        editText2.setImeOptions(268435462);
        editText.setOnEditorActionListener(this);
        editText.setOnKeyListener(this);
        editText2.setOnKeyListener(this);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
        boolean z3;
        if (i4 == 5) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            b(12);
        }
        return z3;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i4, KeyEvent keyEvent) {
        boolean c4;
        if (this.f33949H) {
            return false;
        }
        this.f33949H = true;
        EditText editText = (EditText) view;
        if (this.f33948G.f33932J == 12) {
            c4 = d(i4, keyEvent, editText);
        } else {
            c4 = c(i4, keyEvent, editText);
        }
        this.f33949H = false;
        return c4;
    }
}
