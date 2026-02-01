package com.google.android.material.timepicker;

import T0.a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.InterfaceC0569l;
import androidx.core.content.C0669d;
import androidx.core.view.accessibility.M;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.v;
import com.google.android.material.timepicker.TimePickerView;
import e.C2046a;
import java.lang.reflect.Field;
import java.util.Locale;

/* loaded from: classes2.dex */
class j implements TimePickerView.g, h {

    /* renamed from: E, reason: collision with root package name */
    private final LinearLayout f33950E;

    /* renamed from: F, reason: collision with root package name */
    private final com.google.android.material.timepicker.e f33951F;

    /* renamed from: G, reason: collision with root package name */
    private final TextWatcher f33952G = new a();

    /* renamed from: H, reason: collision with root package name */
    private final TextWatcher f33953H = new b();

    /* renamed from: I, reason: collision with root package name */
    private final ChipTextInputComboView f33954I;

    /* renamed from: J, reason: collision with root package name */
    private final ChipTextInputComboView f33955J;

    /* renamed from: K, reason: collision with root package name */
    private final i f33956K;

    /* renamed from: L, reason: collision with root package name */
    private final EditText f33957L;

    /* renamed from: M, reason: collision with root package name */
    private final EditText f33958M;

    /* renamed from: N, reason: collision with root package name */
    private MaterialButtonToggleGroup f33959N;

    /* loaded from: classes2.dex */
    class a extends v {
        a() {
        }

        @Override // com.google.android.material.internal.v, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    j.this.f33951F.l(0);
                } else {
                    j.this.f33951F.l(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* loaded from: classes2.dex */
    class b extends v {
        b() {
        }

        @Override // com.google.android.material.internal.v, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    j.this.f33951F.h(0);
                } else {
                    j.this.f33951F.h(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* loaded from: classes2.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j.this.g(((Integer) view.getTag(a.h.M4)).intValue());
        }
    }

    /* loaded from: classes2.dex */
    class d extends com.google.android.material.timepicker.a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.timepicker.e f33963e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, int i4, com.google.android.material.timepicker.e eVar) {
            super(context, i4);
            this.f33963e = eVar;
        }

        @Override // com.google.android.material.timepicker.a, androidx.core.view.C0771a
        public void g(View view, M m4) {
            super.g(view, m4);
            m4.d1(view.getResources().getString(a.m.f3117j0, String.valueOf(this.f33963e.c())));
        }
    }

    /* loaded from: classes2.dex */
    class e extends com.google.android.material.timepicker.a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.timepicker.e f33965e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, int i4, com.google.android.material.timepicker.e eVar) {
            super(context, i4);
            this.f33965e = eVar;
        }

        @Override // com.google.android.material.timepicker.a, androidx.core.view.C0771a
        public void g(View view, M m4) {
            super.g(view, m4);
            m4.d1(view.getResources().getString(a.m.f3123l0, String.valueOf(this.f33965e.f33931I)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class f implements MaterialButtonToggleGroup.d {
        f() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i4, boolean z3) {
            int i5;
            if (i4 == a.h.f2650F2) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            j.this.f33951F.m(i5);
        }
    }

    public j(LinearLayout linearLayout, com.google.android.material.timepicker.e eVar) {
        this.f33950E = linearLayout;
        this.f33951F = eVar;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(a.h.f2670K2);
        this.f33954I = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(a.h.f2658H2);
        this.f33955J = chipTextInputComboView2;
        TextView textView = (TextView) chipTextInputComboView.findViewById(a.h.f2666J2);
        TextView textView2 = (TextView) chipTextInputComboView2.findViewById(a.h.f2666J2);
        textView.setText(resources.getString(a.m.f3151w0));
        textView2.setText(resources.getString(a.m.f3149v0));
        chipTextInputComboView.setTag(a.h.M4, 12);
        chipTextInputComboView2.setTag(a.h.M4, 10);
        if (eVar.f33929G == 0) {
            m();
        }
        c cVar = new c();
        chipTextInputComboView2.setOnClickListener(cVar);
        chipTextInputComboView.setOnClickListener(cVar);
        chipTextInputComboView2.c(eVar.d());
        chipTextInputComboView.c(eVar.e());
        this.f33957L = chipTextInputComboView2.e().getEditText();
        this.f33958M = chipTextInputComboView.e().getEditText();
        this.f33956K = new i(chipTextInputComboView2, chipTextInputComboView, eVar);
        chipTextInputComboView2.f(new d(linearLayout.getContext(), a.m.f3114i0, eVar));
        chipTextInputComboView.f(new e(linearLayout.getContext(), a.m.f3120k0, eVar));
        b();
    }

    private void e() {
        this.f33957L.addTextChangedListener(this.f33953H);
        this.f33958M.addTextChangedListener(this.f33952G);
    }

    private void i() {
        this.f33957L.removeTextChangedListener(this.f33953H);
        this.f33958M.removeTextChangedListener(this.f33952G);
    }

    private static void k(EditText editText, @InterfaceC0569l int i4) {
        try {
            Context context = editText.getContext();
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i5 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable b4 = C2046a.b(context, i5);
            b4.setColorFilter(i4, PorterDuff.Mode.SRC_IN);
            declaredField3.set(obj, new Drawable[]{b4, b4});
        } catch (Throwable unused) {
        }
    }

    private void l(com.google.android.material.timepicker.e eVar) {
        i();
        Locale locale = this.f33950E.getResources().getConfiguration().locale;
        String format = String.format(locale, com.google.android.material.timepicker.e.f33925L, Integer.valueOf(eVar.f33931I));
        String format2 = String.format(locale, com.google.android.material.timepicker.e.f33925L, Integer.valueOf(eVar.c()));
        this.f33954I.i(format);
        this.f33955J.i(format2);
        e();
        n();
    }

    private void m() {
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f33950E.findViewById(a.h.f2654G2);
        this.f33959N = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new f());
        this.f33959N.setVisibility(0);
        n();
    }

    private void n() {
        int i4;
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f33959N;
        if (materialButtonToggleGroup == null) {
            return;
        }
        if (this.f33951F.f33933K == 0) {
            i4 = a.h.f2646E2;
        } else {
            i4 = a.h.f2650F2;
        }
        materialButtonToggleGroup.e(i4);
    }

    @Override // com.google.android.material.timepicker.h
    public void a() {
        this.f33950E.setVisibility(0);
    }

    @Override // com.google.android.material.timepicker.h
    public void b() {
        e();
        l(this.f33951F);
        this.f33956K.a();
    }

    @Override // com.google.android.material.timepicker.h
    public void c() {
        l(this.f33951F);
    }

    public void f() {
        this.f33954I.setChecked(false);
        this.f33955J.setChecked(false);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.g
    public void g(int i4) {
        boolean z3;
        this.f33951F.f33932J = i4;
        ChipTextInputComboView chipTextInputComboView = this.f33954I;
        boolean z4 = false;
        if (i4 == 12) {
            z3 = true;
        } else {
            z3 = false;
        }
        chipTextInputComboView.setChecked(z3);
        ChipTextInputComboView chipTextInputComboView2 = this.f33955J;
        if (i4 == 10) {
            z4 = true;
        }
        chipTextInputComboView2.setChecked(z4);
        n();
    }

    @Override // com.google.android.material.timepicker.h
    public void h() {
        View focusedChild = this.f33950E.getFocusedChild();
        if (focusedChild == null) {
            this.f33950E.setVisibility(8);
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) C0669d.o(this.f33950E.getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(focusedChild.getWindowToken(), 0);
        }
        this.f33950E.setVisibility(8);
    }

    public void j() {
        boolean z3;
        ChipTextInputComboView chipTextInputComboView = this.f33954I;
        boolean z4 = false;
        if (this.f33951F.f33932J == 12) {
            z3 = true;
        } else {
            z3 = false;
        }
        chipTextInputComboView.setChecked(z3);
        ChipTextInputComboView chipTextInputComboView2 = this.f33955J;
        if (this.f33951F.f33932J == 10) {
            z4 = true;
        }
        chipTextInputComboView2.setChecked(z4);
    }
}
