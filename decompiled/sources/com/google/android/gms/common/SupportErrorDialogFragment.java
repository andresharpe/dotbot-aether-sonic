package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.C1285y;

/* loaded from: classes.dex */
public class SupportErrorDialogFragment extends DialogFragment {

    /* renamed from: k1, reason: collision with root package name */
    private Dialog f27982k1;

    /* renamed from: l1, reason: collision with root package name */
    private DialogInterface.OnCancelListener f27983l1;

    /* renamed from: m1, reason: collision with root package name */
    @androidx.annotation.P
    private Dialog f27984m1;

    @androidx.annotation.N
    public static SupportErrorDialogFragment newInstance(@androidx.annotation.N Dialog dialog) {
        return newInstance(dialog, null);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@androidx.annotation.N DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f27983l1;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    @androidx.annotation.N
    public Dialog onCreateDialog(@androidx.annotation.P Bundle bundle) {
        Dialog dialog = this.f27982k1;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f27984m1 == null) {
                this.f27984m1 = new AlertDialog.Builder((Context) C1285y.l(getContext())).create();
            }
            return this.f27984m1;
        }
        return dialog;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.P String str) {
        super.show(fragmentManager, str);
    }

    @androidx.annotation.N
    public static SupportErrorDialogFragment newInstance(@androidx.annotation.N Dialog dialog, @androidx.annotation.P DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        Dialog dialog2 = (Dialog) C1285y.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        supportErrorDialogFragment.f27982k1 = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.f27983l1 = onCancelListener;
        }
        return supportErrorDialogFragment;
    }
}
