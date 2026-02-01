package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.I;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.DialogFragment;

/* loaded from: classes.dex */
public class AppCompatDialogFragment extends DialogFragment {
    public AppCompatDialogFragment() {
    }

    @Override // androidx.fragment.app.DialogFragment
    @N
    public Dialog onCreateDialog(@P Bundle bundle) {
        return new t(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.DialogFragment
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setupDialog(@N Dialog dialog, int i4) {
        if (dialog instanceof t) {
            t tVar = (t) dialog;
            if (i4 != 1 && i4 != 2) {
                if (i4 == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            tVar.m(1);
            return;
        }
        super.setupDialog(dialog, i4);
    }

    public AppCompatDialogFragment(@I int i4) {
        super(i4);
    }
}
