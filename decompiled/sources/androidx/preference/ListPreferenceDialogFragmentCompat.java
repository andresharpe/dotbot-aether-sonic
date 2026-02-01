package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.appcompat.app.DialogInterfaceC0586d;

/* loaded from: classes.dex */
public class ListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {

    /* renamed from: C1, reason: collision with root package name */
    private static final String f16693C1 = "ListPreferenceDialogFragment.index";

    /* renamed from: D1, reason: collision with root package name */
    private static final String f16694D1 = "ListPreferenceDialogFragment.entries";

    /* renamed from: E1, reason: collision with root package name */
    private static final String f16695E1 = "ListPreferenceDialogFragment.entryValues";

    /* renamed from: A1, reason: collision with root package name */
    private CharSequence[] f16696A1;

    /* renamed from: B1, reason: collision with root package name */
    private CharSequence[] f16697B1;

    /* renamed from: z1, reason: collision with root package name */
    int f16698z1;

    /* loaded from: classes.dex */
    class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i4) {
            ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = ListPreferenceDialogFragmentCompat.this;
            listPreferenceDialogFragmentCompat.f16698z1 = i4;
            listPreferenceDialogFragmentCompat.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    @N
    public static ListPreferenceDialogFragmentCompat newInstance(String str) {
        ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = new ListPreferenceDialogFragmentCompat();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        listPreferenceDialogFragmentCompat.setArguments(bundle);
        return listPreferenceDialogFragmentCompat;
    }

    private ListPreference x0() {
        return (ListPreference) getPreference();
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@P Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ListPreference x02 = x0();
            if (x02.E1() != null && x02.G1() != null) {
                this.f16698z1 = x02.D1(x02.H1());
                this.f16696A1 = x02.E1();
                this.f16697B1 = x02.G1();
                return;
            }
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f16698z1 = bundle.getInt(f16693C1, 0);
        this.f16696A1 = bundle.getCharSequenceArray(f16694D1);
        this.f16697B1 = bundle.getCharSequenceArray(f16695E1);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void onDialogClosed(boolean z3) {
        int i4;
        if (z3 && (i4 = this.f16698z1) >= 0) {
            String charSequence = this.f16697B1[i4].toString();
            ListPreference x02 = x0();
            if (x02.e(charSequence)) {
                x02.N1(charSequence);
            }
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@N Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(f16693C1, this.f16698z1);
        bundle.putCharSequenceArray(f16694D1, this.f16696A1);
        bundle.putCharSequenceArray(f16695E1, this.f16697B1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void u0(@N DialogInterfaceC0586d.a aVar) {
        super.u0(aVar);
        aVar.I(this.f16696A1, this.f16698z1, new a());
        aVar.C(null, null);
    }
}
