package androidx.preference;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;

@Deprecated
/* loaded from: classes.dex */
public class b extends h {

    /* renamed from: V, reason: collision with root package name */
    private static final String f16853V = "EditTextPreferenceDialogFragment.text";

    /* renamed from: T, reason: collision with root package name */
    private EditText f16854T;

    /* renamed from: U, reason: collision with root package name */
    private CharSequence f16855U;

    @Deprecated
    public b() {
    }

    private EditTextPreference h() {
        return (EditTextPreference) a();
    }

    @N
    @Deprecated
    public static b i(String str) {
        b bVar = new b();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        bVar.setArguments(bundle);
        return bVar;
    }

    @Override // androidx.preference.h
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    protected boolean b() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.h
    public void c(@N View view) {
        super.c(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.f16854T = editText;
        editText.requestFocus();
        EditText editText2 = this.f16854T;
        if (editText2 != null) {
            editText2.setText(this.f16855U);
            EditText editText3 = this.f16854T;
            editText3.setSelection(editText3.getText().length());
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }

    @Override // androidx.preference.h
    @Deprecated
    public void e(boolean z3) {
        if (z3) {
            String obj = this.f16854T.getText().toString();
            if (h().e(obj)) {
                h().G1(obj);
            }
        }
    }

    @Override // androidx.preference.h, android.app.DialogFragment, android.app.Fragment
    public void onCreate(@P Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f16855U = h().E1();
        } else {
            this.f16855U = bundle.getCharSequence(f16853V);
        }
    }

    @Override // androidx.preference.h, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(@N Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence(f16853V, this.f16855U);
    }
}
