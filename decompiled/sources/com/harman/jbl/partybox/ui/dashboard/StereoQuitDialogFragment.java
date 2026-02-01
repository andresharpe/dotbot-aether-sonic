package com.harman.jbl.partybox.ui.dashboard;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.C0669d;
import androidx.fragment.app.DialogFragment;
import com.harman.jbl.partybox.j;
import kotlin.jvm.internal.C2197u;

@kotlin.E(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u000bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ-\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/harman/jbl/partybox/ui/dashboard/StereoQuitDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/H0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onStart", "()V", "dismiss", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/harman/jbl/partybox/databinding/C;", "k1", "Lcom/harman/jbl/partybox/databinding/C;", "binding", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@kotlin.jvm.internal.U({"SMAP\nStereoQuitDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StereoQuitDialogFragment.kt\ncom/harman/jbl/partybox/ui/dashboard/StereoQuitDialogFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,89:1\n262#2,2:90\n262#2,2:92\n*S KotlinDebug\n*F\n+ 1 StereoQuitDialogFragment.kt\ncom/harman/jbl/partybox/ui/dashboard/StereoQuitDialogFragment\n*L\n55#1:90,2\n56#1:92,2\n*E\n"})
/* loaded from: classes2.dex */
public final class StereoQuitDialogFragment extends DialogFragment {

    @l3.d
    public static final a Companion = new a(null);

    @l3.d
    public static final String TAG = "StereoQuitDialogFragment";

    /* renamed from: k1, reason: collision with root package name */
    @l3.e
    private com.harman.jbl.partybox.databinding.C f43167k1;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(StereoQuitDialogFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        if (com.harman.jbl.partybox.utils.g.b()) {
            return;
        }
        T1.a.a("StereoQuitDialogFragment,start stereo group quit");
        this$0.dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        TextView textView;
        com.harman.jbl.partybox.databinding.C c4 = this.f43167k1;
        ProgressBar progressBar = null;
        if (c4 != null) {
            textView = c4.f38506I;
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setVisibility(0);
        }
        com.harman.jbl.partybox.databinding.C c5 = this.f43167k1;
        if (c5 != null) {
            progressBar = c5.f38507J;
        }
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        if (getFragmentManager() != null) {
            super.dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@l3.e Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, j.n.f41887i);
    }

    @Override // androidx.fragment.app.DialogFragment
    @l3.d
    public Dialog onCreateDialog(@l3.e Bundle bundle) {
        Window window;
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        kotlin.jvm.internal.F.o(onCreateDialog, "onCreateDialog(...)");
        Context context = getContext();
        if (context != null && (window = onCreateDialog.getWindow()) != null) {
            window.setNavigationBarColor(C0669d.f(context, j.d.f40732a));
        }
        onCreateDialog.setCanceledOnTouchOutside(false);
        onCreateDialog.setCancelable(true);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @l3.e
    public View onCreateView(@l3.d LayoutInflater inflater, @l3.e ViewGroup viewGroup, @l3.e Bundle bundle) {
        kotlin.jvm.internal.F.p(inflater, "inflater");
        com.harman.jbl.partybox.databinding.C e4 = com.harman.jbl.partybox.databinding.C.e(inflater, viewGroup, false);
        this.f43167k1 = e4;
        if (e4 != null) {
            e4.f38506I.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.K0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StereoQuitDialogFragment.s0(StereoQuitDialogFragment.this, view);
                }
            });
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            kotlin.jvm.internal.F.m(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            dialog.setCanceledOnTouchOutside(false);
        }
        com.harman.jbl.partybox.databinding.C c4 = this.f43167k1;
        if (c4 != null) {
            return c4.d();
        }
        return null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
            window.setGravity(80);
        }
    }
}
