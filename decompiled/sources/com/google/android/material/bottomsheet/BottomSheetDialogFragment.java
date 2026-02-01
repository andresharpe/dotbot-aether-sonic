package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes2.dex */
public class BottomSheetDialogFragment extends AppCompatDialogFragment {

    /* renamed from: k1, reason: collision with root package name */
    private boolean f31645k1;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class b extends BottomSheetBehavior.f {
        private b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(@N View view, float f4) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(@N View view, int i4) {
            if (i4 == 5) {
                BottomSheetDialogFragment.this.s0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0() {
        if (this.f31645k1) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    private void t0(@N BottomSheetBehavior<?> bottomSheetBehavior, boolean z3) {
        this.f31645k1 = z3;
        if (bottomSheetBehavior.u0() == 5) {
            s0();
            return;
        }
        if (getDialog() instanceof com.google.android.material.bottomsheet.a) {
            ((com.google.android.material.bottomsheet.a) getDialog()).w();
        }
        bottomSheetBehavior.Y(new b());
        bottomSheetBehavior.W0(5);
    }

    private boolean u0(boolean z3) {
        Dialog dialog = getDialog();
        if (dialog instanceof com.google.android.material.bottomsheet.a) {
            com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) dialog;
            BottomSheetBehavior<FrameLayout> t3 = aVar.t();
            if (t3.A0() && aVar.u()) {
                t0(t3, z3);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        if (!u0(false)) {
            super.dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        if (!u0(true)) {
            super.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @N
    public Dialog onCreateDialog(@P Bundle bundle) {
        return new com.google.android.material.bottomsheet.a(getContext(), getTheme());
    }
}
