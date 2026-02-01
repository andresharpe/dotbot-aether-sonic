package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.preference.q;

/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {

    /* renamed from: C0, reason: collision with root package name */
    private final a f16835C0;

    /* renamed from: D0, reason: collision with root package name */
    private CharSequence f16836D0;

    /* renamed from: E0, reason: collision with root package name */
    private CharSequence f16837E0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
            if (!SwitchPreference.this.e(Boolean.valueOf(z3))) {
                compoundButton.setChecked(!z3);
            } else {
                SwitchPreference.this.q1(z3);
            }
        }
    }

    public SwitchPreference(@N Context context, @P AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f16835C0 = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.k.f17218o1, i4, i5);
        v1(androidx.core.content.res.n.o(obtainStyledAttributes, q.k.f17242w1, q.k.f17221p1));
        t1(androidx.core.content.res.n.o(obtainStyledAttributes, q.k.f17239v1, q.k.f17224q1));
        D1(androidx.core.content.res.n.o(obtainStyledAttributes, q.k.f17248y1, q.k.f17230s1));
        B1(androidx.core.content.res.n.o(obtainStyledAttributes, q.k.f17245x1, q.k.f17233t1));
        r1(androidx.core.content.res.n.b(obtainStyledAttributes, q.k.f17236u1, q.k.f17227r1, false));
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void E1(View view) {
        boolean z3 = view instanceof Switch;
        if (z3) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f16845x0);
        }
        if (z3) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.f16836D0);
            r4.setTextOff(this.f16837E0);
            r4.setOnCheckedChangeListener(this.f16835C0);
        }
    }

    private void F1(View view) {
        if (!((AccessibilityManager) m().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        E1(view.findViewById(R.id.switch_widget));
        w1(view.findViewById(R.id.summary));
    }

    public void A1(int i4) {
        B1(m().getString(i4));
    }

    public void B1(@P CharSequence charSequence) {
        this.f16837E0 = charSequence;
        X();
    }

    public void C1(int i4) {
        D1(m().getString(i4));
    }

    public void D1(@P CharSequence charSequence) {
        this.f16836D0 = charSequence;
        X();
    }

    @Override // androidx.preference.Preference
    public void d0(@N p pVar) {
        super.d0(pVar);
        E1(pVar.S(R.id.switch_widget));
        x1(pVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void r0(@N View view) {
        super.r0(view);
        F1(view);
    }

    @P
    public CharSequence y1() {
        return this.f16837E0;
    }

    @P
    public CharSequence z1() {
        return this.f16836D0;
    }

    public SwitchPreference(@N Context context, @P AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public SwitchPreference(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.n.a(context, q.a.f17004d0, R.attr.switchPreferenceStyle));
    }

    public SwitchPreference(@N Context context) {
        this(context, null);
    }
}
