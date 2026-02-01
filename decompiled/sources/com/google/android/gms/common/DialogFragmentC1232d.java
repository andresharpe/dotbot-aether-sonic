package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.C1285y;

/* renamed from: com.google.android.gms.common.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogFragmentC1232d extends DialogFragment {

    /* renamed from: E, reason: collision with root package name */
    private Dialog f28504E;

    /* renamed from: F, reason: collision with root package name */
    private DialogInterface.OnCancelListener f28505F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.P
    private Dialog f28506G;

    @androidx.annotation.N
    public static DialogFragmentC1232d a(@androidx.annotation.N Dialog dialog) {
        return b(dialog, null);
    }

    @androidx.annotation.N
    public static DialogFragmentC1232d b(@androidx.annotation.N Dialog dialog, @androidx.annotation.P DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC1232d dialogFragmentC1232d = new DialogFragmentC1232d();
        Dialog dialog2 = (Dialog) C1285y.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC1232d.f28504E = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC1232d.f28505F = onCancelListener;
        }
        return dialogFragmentC1232d;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@androidx.annotation.N DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f28505F;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    @androidx.annotation.N
    public Dialog onCreateDialog(@androidx.annotation.P Bundle bundle) {
        Dialog dialog = this.f28504E;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f28506G == null) {
                this.f28506G = new AlertDialog.Builder((Context) C1285y.l(getActivity())).create();
            }
            return this.f28506G;
        }
        return dialog;
    }

    @Override // android.app.DialogFragment
    public void show(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.P String str) {
        super.show(fragmentManager, str);
    }
}
