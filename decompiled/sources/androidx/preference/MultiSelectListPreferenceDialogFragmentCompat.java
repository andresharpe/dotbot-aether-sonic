package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.appcompat.app.DialogInterfaceC0586d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class MultiSelectListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {

    /* renamed from: D1, reason: collision with root package name */
    private static final String f16704D1 = "MultiSelectListPreferenceDialogFragmentCompat.values";

    /* renamed from: E1, reason: collision with root package name */
    private static final String f16705E1 = "MultiSelectListPreferenceDialogFragmentCompat.changed";

    /* renamed from: F1, reason: collision with root package name */
    private static final String f16706F1 = "MultiSelectListPreferenceDialogFragmentCompat.entries";

    /* renamed from: G1, reason: collision with root package name */
    private static final String f16707G1 = "MultiSelectListPreferenceDialogFragmentCompat.entryValues";

    /* renamed from: A1, reason: collision with root package name */
    boolean f16708A1;

    /* renamed from: B1, reason: collision with root package name */
    CharSequence[] f16709B1;

    /* renamed from: C1, reason: collision with root package name */
    CharSequence[] f16710C1;

    /* renamed from: z1, reason: collision with root package name */
    Set<String> f16711z1 = new HashSet();

    /* loaded from: classes.dex */
    class a implements DialogInterface.OnMultiChoiceClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(DialogInterface dialogInterface, int i4, boolean z3) {
            if (z3) {
                MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = MultiSelectListPreferenceDialogFragmentCompat.this;
                multiSelectListPreferenceDialogFragmentCompat.f16708A1 = multiSelectListPreferenceDialogFragmentCompat.f16711z1.add(multiSelectListPreferenceDialogFragmentCompat.f16710C1[i4].toString()) | multiSelectListPreferenceDialogFragmentCompat.f16708A1;
            } else {
                MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat2 = MultiSelectListPreferenceDialogFragmentCompat.this;
                multiSelectListPreferenceDialogFragmentCompat2.f16708A1 = multiSelectListPreferenceDialogFragmentCompat2.f16711z1.remove(multiSelectListPreferenceDialogFragmentCompat2.f16710C1[i4].toString()) | multiSelectListPreferenceDialogFragmentCompat2.f16708A1;
            }
        }
    }

    @N
    public static MultiSelectListPreferenceDialogFragmentCompat newInstance(String str) {
        MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = new MultiSelectListPreferenceDialogFragmentCompat();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        multiSelectListPreferenceDialogFragmentCompat.setArguments(bundle);
        return multiSelectListPreferenceDialogFragmentCompat;
    }

    private MultiSelectListPreference x0() {
        return (MultiSelectListPreference) getPreference();
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@P Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            MultiSelectListPreference x02 = x0();
            if (x02.E1() != null && x02.F1() != null) {
                this.f16711z1.clear();
                this.f16711z1.addAll(x02.H1());
                this.f16708A1 = false;
                this.f16709B1 = x02.E1();
                this.f16710C1 = x02.F1();
                return;
            }
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.f16711z1.clear();
        this.f16711z1.addAll(bundle.getStringArrayList(f16704D1));
        this.f16708A1 = bundle.getBoolean(f16705E1, false);
        this.f16709B1 = bundle.getCharSequenceArray(f16706F1);
        this.f16710C1 = bundle.getCharSequenceArray(f16707G1);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void onDialogClosed(boolean z3) {
        if (z3 && this.f16708A1) {
            MultiSelectListPreference x02 = x0();
            if (x02.e(this.f16711z1)) {
                x02.M1(this.f16711z1);
            }
        }
        this.f16708A1 = false;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@N Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList(f16704D1, new ArrayList<>(this.f16711z1));
        bundle.putBoolean(f16705E1, this.f16708A1);
        bundle.putCharSequenceArray(f16706F1, this.f16709B1);
        bundle.putCharSequenceArray(f16707G1, this.f16710C1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void u0(@N DialogInterfaceC0586d.a aVar) {
        super.u0(aVar);
        int length = this.f16710C1.length;
        boolean[] zArr = new boolean[length];
        for (int i4 = 0; i4 < length; i4++) {
            zArr[i4] = this.f16711z1.contains(this.f16710C1[i4].toString());
        }
        aVar.q(this.f16709B1, zArr, new a());
    }
}
