package com.harman.jbl.partybox.ui.party.auracast.ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.content.C0669d;
import androidx.fragment.app.DialogFragment;
import com.harman.jbl.partybox.databinding.H;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.party.auracast.AuracastFragment;
import com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel;
import kotlin.E;
import kotlin.jvm.internal.F;

@E(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/harman/jbl/partybox/ui/party/auracast/ui/SelectDeviceTipDialog;", "Landroidx/fragment/app/DialogFragment;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/H0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onStart", "()V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Lcom/harman/jbl/partybox/ui/party/auracast/AuracastFragment;", "k1", "Lcom/harman/jbl/partybox/ui/party/auracast/AuracastFragment;", "fragment", "Lcom/harman/jbl/partybox/ui/party/auracast/AuracastViewModel;", "l1", "Lcom/harman/jbl/partybox/ui/party/auracast/AuracastViewModel;", "viewModel", "<init>", "(Lcom/harman/jbl/partybox/ui/party/auracast/AuracastFragment;Lcom/harman/jbl/partybox/ui/party/auracast/AuracastViewModel;)V", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SelectDeviceTipDialog extends DialogFragment {

    /* renamed from: k1, reason: collision with root package name */
    @l3.d
    private final AuracastFragment f44867k1;

    /* renamed from: l1, reason: collision with root package name */
    @l3.d
    private final AuracastViewModel f44868l1;

    public SelectDeviceTipDialog(@l3.d AuracastFragment fragment, @l3.d AuracastViewModel viewModel) {
        F.p(fragment, "fragment");
        F.p(viewModel, "viewModel");
        this.f44867k1 = fragment;
        this.f44868l1 = viewModel;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@l3.e Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, j.n.f41884f);
    }

    @Override // androidx.fragment.app.DialogFragment
    @l3.d
    public Dialog onCreateDialog(@l3.e Bundle bundle) {
        Window window;
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        F.o(onCreateDialog, "onCreateDialog(...)");
        Context context = getContext();
        if (context != null && (window = onCreateDialog.getWindow()) != null) {
            window.setNavigationBarColor(C0669d.f(context, j.d.f40743d1));
        }
        onCreateDialog.setCanceledOnTouchOutside(false);
        onCreateDialog.setCancelable(false);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @l3.d
    public View onCreateView(@l3.d LayoutInflater inflater, @l3.e ViewGroup viewGroup, @l3.e Bundle bundle) {
        F.p(inflater, "inflater");
        H t12 = H.t1(inflater, viewGroup, false);
        F.o(t12, "inflate(...)");
        t12.M0(this);
        t12.w1(this.f44867k1);
        t12.x1(this.f44868l1);
        View d4 = t12.d();
        F.o(d4, "getRoot(...)");
        return d4;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        com.harman.jbl.partybox.ui.party.b.f44881a.u(this);
    }
}
