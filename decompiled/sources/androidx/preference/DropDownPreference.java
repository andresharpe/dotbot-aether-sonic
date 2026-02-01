package androidx.preference;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.preference.q;

/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* renamed from: J0, reason: collision with root package name */
    private final Context f16669J0;

    /* renamed from: K0, reason: collision with root package name */
    private final ArrayAdapter f16670K0;

    /* renamed from: L0, reason: collision with root package name */
    private Spinner f16671L0;

    /* renamed from: M0, reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f16672M0;

    /* loaded from: classes.dex */
    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i4, long j4) {
            if (i4 >= 0) {
                String charSequence = DropDownPreference.this.G1()[i4].toString();
                if (!charSequence.equals(DropDownPreference.this.H1()) && DropDownPreference.this.e(charSequence)) {
                    DropDownPreference.this.N1(charSequence);
                }
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(@N Context context) {
        this(context, null);
    }

    private int Q1(String str) {
        CharSequence[] G12 = G1();
        if (str != null && G12 != null) {
            for (int length = G12.length - 1; length >= 0; length--) {
                if (TextUtils.equals(G12[length].toString(), str)) {
                    return length;
                }
            }
            return -1;
        }
        return -1;
    }

    private void R1() {
        this.f16670K0.clear();
        if (E1() != null) {
            for (CharSequence charSequence : E1()) {
                this.f16670K0.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.ListPreference
    public void K1(@N CharSequence[] charSequenceArr) {
        super.K1(charSequenceArr);
        R1();
    }

    @Override // androidx.preference.ListPreference
    public void O1(int i4) {
        N1(G1()[i4].toString());
    }

    @N
    protected ArrayAdapter P1() {
        return new ArrayAdapter(this.f16669J0, R.layout.simple_spinner_dropdown_item);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void X() {
        super.X();
        ArrayAdapter arrayAdapter = this.f16670K0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public void d0(@N p pVar) {
        Spinner spinner = (Spinner) pVar.f17770a.findViewById(q.f.f17051h);
        this.f16671L0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.f16670K0);
        this.f16671L0.setOnItemSelectedListener(this.f16672M0);
        this.f16671L0.setSelection(Q1(H1()));
        super.d0(pVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public void e0() {
        this.f16671L0.performClick();
    }

    public DropDownPreference(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, q.a.f17020n);
    }

    public DropDownPreference(@N Context context, @P AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public DropDownPreference(@N Context context, @P AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f16672M0 = new a();
        this.f16669J0 = context;
        this.f16670K0 = P1();
        R1();
    }
}
