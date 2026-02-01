package androidx.preference;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;

/* loaded from: classes.dex */
public class EditTextPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {

    /* renamed from: D1, reason: collision with root package name */
    private static final String f16678D1 = "EditTextPreferenceDialogFragment.text";

    /* renamed from: E1, reason: collision with root package name */
    private static final int f16679E1 = 1000;

    /* renamed from: A1, reason: collision with root package name */
    private CharSequence f16680A1;

    /* renamed from: B1, reason: collision with root package name */
    private final Runnable f16681B1 = new a();

    /* renamed from: C1, reason: collision with root package name */
    private long f16682C1 = -1;

    /* renamed from: z1, reason: collision with root package name */
    private EditText f16683z1;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            EditTextPreferenceDialogFragmentCompat.this.z0();
        }
    }

    private void A0(boolean z3) {
        long j4;
        if (z3) {
            j4 = SystemClock.currentThreadTimeMillis();
        } else {
            j4 = -1;
        }
        this.f16682C1 = j4;
    }

    @N
    public static EditTextPreferenceDialogFragmentCompat newInstance(String str) {
        EditTextPreferenceDialogFragmentCompat editTextPreferenceDialogFragmentCompat = new EditTextPreferenceDialogFragmentCompat();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        editTextPreferenceDialogFragmentCompat.setArguments(bundle);
        return editTextPreferenceDialogFragmentCompat;
    }

    private EditTextPreference x0() {
        return (EditTextPreference) getPreference();
    }

    private boolean y0() {
        long j4 = this.f16682C1;
        if (j4 != -1 && j4 + 1000 > SystemClock.currentThreadTimeMillis()) {
            return true;
        }
        return false;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@P Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f16680A1 = x0().E1();
        } else {
            this.f16680A1 = bundle.getCharSequence(f16678D1);
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void onDialogClosed(boolean z3) {
        if (z3) {
            String obj = this.f16683z1.getText().toString();
            EditTextPreference x02 = x0();
            if (x02.e(obj)) {
                x02.G1(obj);
            }
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@N Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence(f16678D1, this.f16680A1);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    protected boolean r0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void s0(@N View view) {
        super.s0(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.f16683z1 = editText;
        if (editText != null) {
            editText.requestFocus();
            this.f16683z1.setText(this.f16680A1);
            EditText editText2 = this.f16683z1;
            editText2.setSelection(editText2.getText().length());
            if (x0().D1() != null) {
                x0().D1().a(this.f16683z1);
                return;
            }
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    protected void w0() {
        A0(true);
        z0();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    void z0() {
        if (y0()) {
            EditText editText = this.f16683z1;
            if (editText != null && editText.isFocused()) {
                if (((InputMethodManager) this.f16683z1.getContext().getSystemService("input_method")).showSoftInput(this.f16683z1, 0)) {
                    A0(false);
                    return;
                } else {
                    this.f16683z1.removeCallbacks(this.f16681B1);
                    this.f16683z1.postDelayed(this.f16681B1, 50L);
                    return;
                }
            }
            A0(false);
        }
    }
}
