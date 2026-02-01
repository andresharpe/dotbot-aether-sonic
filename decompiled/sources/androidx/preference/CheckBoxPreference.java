package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.preference.q;

/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: C0, reason: collision with root package name */
    private final a f16661C0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
            if (!CheckBoxPreference.this.e(Boolean.valueOf(z3))) {
                compoundButton.setChecked(!z3);
            } else {
                CheckBoxPreference.this.q1(z3);
            }
        }
    }

    public CheckBoxPreference(@N Context context, @P AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void y1(View view) {
        boolean z3 = view instanceof CompoundButton;
        if (z3) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f16845x0);
        }
        if (z3) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f16661C0);
        }
    }

    private void z1(@N View view) {
        if (!((AccessibilityManager) m().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        y1(view.findViewById(R.id.checkbox));
        w1(view.findViewById(R.id.summary));
    }

    @Override // androidx.preference.Preference
    public void d0(@N p pVar) {
        super.d0(pVar);
        y1(pVar.S(R.id.checkbox));
        x1(pVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void r0(@N View view) {
        super.r0(view);
        z1(view);
    }

    public CheckBoxPreference(@N Context context, @P AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f16661C0 = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.k.f17183d, i4, i5);
        v1(androidx.core.content.res.n.o(obtainStyledAttributes, q.k.f17201j, q.k.f17186e));
        t1(androidx.core.content.res.n.o(obtainStyledAttributes, q.k.f17198i, q.k.f17189f));
        r1(androidx.core.content.res.n.b(obtainStyledAttributes, q.k.f17195h, q.k.f17192g, false));
        obtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.n.a(context, q.a.f17005e, R.attr.checkBoxPreferenceStyle));
    }

    public CheckBoxPreference(@N Context context) {
        this(context, null);
    }
}
