package androidx.preference;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.N;
import androidx.annotation.P;

@Deprecated
/* loaded from: classes.dex */
public class d extends h {

    /* renamed from: W, reason: collision with root package name */
    private static final String f16857W = "ListPreferenceDialogFragment.index";

    /* renamed from: X, reason: collision with root package name */
    private static final String f16858X = "ListPreferenceDialogFragment.entries";

    /* renamed from: Y, reason: collision with root package name */
    private static final String f16859Y = "ListPreferenceDialogFragment.entryValues";

    /* renamed from: T, reason: collision with root package name */
    int f16860T;

    /* renamed from: U, reason: collision with root package name */
    private CharSequence[] f16861U;

    /* renamed from: V, reason: collision with root package name */
    private CharSequence[] f16862V;

    /* loaded from: classes.dex */
    class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i4) {
            d dVar = d.this;
            dVar.f16860T = i4;
            dVar.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    @Deprecated
    public d() {
    }

    private ListPreference h() {
        return (ListPreference) a();
    }

    @N
    @Deprecated
    public static d i(String str) {
        d dVar = new d();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        dVar.setArguments(bundle);
        return dVar;
    }

    @Override // androidx.preference.h
    @Deprecated
    public void e(boolean z3) {
        int i4;
        ListPreference h4 = h();
        if (z3 && (i4 = this.f16860T) >= 0) {
            String charSequence = this.f16862V[i4].toString();
            if (h4.e(charSequence)) {
                h4.N1(charSequence);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.h
    public void f(@N AlertDialog.Builder builder) {
        super.f(builder);
        builder.setSingleChoiceItems(this.f16861U, this.f16860T, new a());
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    @Override // androidx.preference.h, android.app.DialogFragment, android.app.Fragment
    public void onCreate(@P Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ListPreference h4 = h();
            if (h4.E1() != null && h4.G1() != null) {
                this.f16860T = h4.D1(h4.H1());
                this.f16861U = h4.E1();
                this.f16862V = h4.G1();
                return;
            }
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f16860T = bundle.getInt(f16857W, 0);
        this.f16861U = bundle.getCharSequenceArray(f16858X);
        this.f16862V = bundle.getCharSequenceArray(f16859Y);
    }

    @Override // androidx.preference.h, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(@N Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(f16857W, this.f16860T);
        bundle.putCharSequenceArray(f16858X, this.f16861U);
        bundle.putCharSequenceArray(f16859Y, this.f16862V);
    }
}
