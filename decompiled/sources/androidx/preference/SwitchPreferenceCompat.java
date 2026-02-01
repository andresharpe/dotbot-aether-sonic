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
import androidx.appcompat.widget.SwitchCompat;
import androidx.preference.q;

/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: C0, reason: collision with root package name */
    private final a f16839C0;

    /* renamed from: D0, reason: collision with root package name */
    private CharSequence f16840D0;

    /* renamed from: E0, reason: collision with root package name */
    private CharSequence f16841E0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
            if (!SwitchPreferenceCompat.this.e(Boolean.valueOf(z3))) {
                compoundButton.setChecked(!z3);
            } else {
                SwitchPreferenceCompat.this.q1(z3);
            }
        }
    }

    public SwitchPreferenceCompat(@N Context context, @P AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f16839C0 = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.k.f17251z1, i4, i5);
        v1(androidx.core.content.res.n.o(obtainStyledAttributes, q.k.f17135H1, q.k.f17114A1));
        t1(androidx.core.content.res.n.o(obtainStyledAttributes, q.k.f17132G1, q.k.f17117B1));
        D1(androidx.core.content.res.n.o(obtainStyledAttributes, q.k.f17141J1, q.k.f17123D1));
        B1(androidx.core.content.res.n.o(obtainStyledAttributes, q.k.f17138I1, q.k.f17126E1));
        r1(androidx.core.content.res.n.b(obtainStyledAttributes, q.k.f17129F1, q.k.f17120C1, false));
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void E1(View view) {
        boolean z3 = view instanceof SwitchCompat;
        if (z3) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f16845x0);
        }
        if (z3) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f16840D0);
            switchCompat.setTextOff(this.f16841E0);
            switchCompat.setOnCheckedChangeListener(this.f16839C0);
        }
    }

    private void F1(View view) {
        if (!((AccessibilityManager) m().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        E1(view.findViewById(q.f.f17052i));
        w1(view.findViewById(R.id.summary));
    }

    public void A1(int i4) {
        B1(m().getString(i4));
    }

    public void B1(@P CharSequence charSequence) {
        this.f16841E0 = charSequence;
        X();
    }

    public void C1(int i4) {
        D1(m().getString(i4));
    }

    public void D1(@P CharSequence charSequence) {
        this.f16840D0 = charSequence;
        X();
    }

    @Override // androidx.preference.Preference
    public void d0(@N p pVar) {
        super.d0(pVar);
        E1(pVar.S(q.f.f17052i));
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
        return this.f16841E0;
    }

    @P
    public CharSequence z1() {
        return this.f16840D0;
    }

    public SwitchPreferenceCompat(@N Context context, @P AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public SwitchPreferenceCompat(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, q.a.f17002c0);
    }

    public SwitchPreferenceCompat(@N Context context) {
        this(context, null);
    }
}
