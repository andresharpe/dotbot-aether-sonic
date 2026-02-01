package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.appcompat.app.u;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0592e;
import androidx.appcompat.widget.C0594g;
import androidx.appcompat.widget.C0595h;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.a;
import com.google.android.material.textfield.i;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends u {
    @Override // androidx.appcompat.app.u
    @N
    protected C0592e c(@N Context context, @P AttributeSet attributeSet) {
        return new i(context, attributeSet);
    }

    @Override // androidx.appcompat.app.u
    @N
    protected C0594g d(@N Context context, @N AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.u
    @N
    protected C0595h e(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.u
    @N
    protected AppCompatRadioButton k(Context context, AttributeSet attributeSet) {
        return new com.google.android.material.radiobutton.a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.u
    @N
    protected AppCompatTextView o(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
