package androidx.preference;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.N;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* loaded from: classes.dex */
public class e extends h {

    /* renamed from: X, reason: collision with root package name */
    private static final String f16864X = "MultiSelectListPreferenceDialogFragment.values";

    /* renamed from: Y, reason: collision with root package name */
    private static final String f16865Y = "MultiSelectListPreferenceDialogFragment.changed";

    /* renamed from: Z, reason: collision with root package name */
    private static final String f16866Z = "MultiSelectListPreferenceDialogFragment.entries";

    /* renamed from: a0, reason: collision with root package name */
    private static final String f16867a0 = "MultiSelectListPreferenceDialogFragment.entryValues";

    /* renamed from: T, reason: collision with root package name */
    Set<String> f16868T = new HashSet();

    /* renamed from: U, reason: collision with root package name */
    boolean f16869U;

    /* renamed from: V, reason: collision with root package name */
    CharSequence[] f16870V;

    /* renamed from: W, reason: collision with root package name */
    CharSequence[] f16871W;

    /* loaded from: classes.dex */
    class a implements DialogInterface.OnMultiChoiceClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(DialogInterface dialogInterface, int i4, boolean z3) {
            if (z3) {
                e eVar = e.this;
                eVar.f16869U = eVar.f16868T.add(eVar.f16871W[i4].toString()) | eVar.f16869U;
            } else {
                e eVar2 = e.this;
                eVar2.f16869U = eVar2.f16868T.remove(eVar2.f16871W[i4].toString()) | eVar2.f16869U;
            }
        }
    }

    @Deprecated
    public e() {
    }

    private MultiSelectListPreference h() {
        return (MultiSelectListPreference) a();
    }

    @N
    @Deprecated
    public static e i(String str) {
        e eVar = new e();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        eVar.setArguments(bundle);
        return eVar;
    }

    @Override // androidx.preference.h
    @Deprecated
    public void e(boolean z3) {
        MultiSelectListPreference h4 = h();
        if (z3 && this.f16869U) {
            Set<String> set = this.f16868T;
            if (h4.e(set)) {
                h4.M1(set);
            }
        }
        this.f16869U = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.h
    public void f(@N AlertDialog.Builder builder) {
        super.f(builder);
        int length = this.f16871W.length;
        boolean[] zArr = new boolean[length];
        for (int i4 = 0; i4 < length; i4++) {
            zArr[i4] = this.f16868T.contains(this.f16871W[i4].toString());
        }
        builder.setMultiChoiceItems(this.f16870V, zArr, new a());
    }

    @Override // androidx.preference.h, android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            MultiSelectListPreference h4 = h();
            if (h4.E1() != null && h4.F1() != null) {
                this.f16868T.clear();
                this.f16868T.addAll(h4.H1());
                this.f16869U = false;
                this.f16870V = h4.E1();
                this.f16871W = h4.F1();
                return;
            }
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.f16868T.clear();
        this.f16868T.addAll(bundle.getStringArrayList(f16864X));
        this.f16869U = bundle.getBoolean(f16865Y, false);
        this.f16870V = bundle.getCharSequenceArray(f16866Z);
        this.f16871W = bundle.getCharSequenceArray(f16867a0);
    }

    @Override // androidx.preference.h, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(@N Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList(f16864X, new ArrayList<>(this.f16868T));
        bundle.putBoolean(f16865Y, this.f16869U);
        bundle.putCharSequenceArray(f16866Z, this.f16870V);
        bundle.putCharSequenceArray(f16867a0, this.f16871W);
    }
}
