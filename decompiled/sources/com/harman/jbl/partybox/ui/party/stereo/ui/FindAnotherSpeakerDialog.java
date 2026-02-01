package com.harman.jbl.partybox.ui.party.stereo.ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0669d;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.P;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoType;
import com.harman.sdk.device.HmDevice;
import kotlin.A;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.U;

@E(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b#\u0010\u0012J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/harman/jbl/partybox/ui/party/stereo/ui/FindAnotherSpeakerDialog;", "Landroidx/fragment/app/DialogFragment;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/H0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onStart", "()V", "dismiss", "Landroidx/lifecycle/P;", "Lcom/harman/jbl/partybox/ui/party/stereo/define/EnumStereoType;", "k1", "Landroidx/lifecycle/P;", "_enumStereoType", "Lcom/harman/jbl/partybox/ui/main/o;", "l1", "Lkotlin/A;", "r0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Landroidx/lifecycle/LiveData;", "getEnumStereoType", "()Landroidx/lifecycle/LiveData;", "enumStereoType", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nFindAnotherSpeakerDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindAnotherSpeakerDialog.kt\ncom/harman/jbl/partybox/ui/party/stereo/ui/FindAnotherSpeakerDialog\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,91:1\n66#2,4:92\n262#3,2:96\n*S KotlinDebug\n*F\n+ 1 FindAnotherSpeakerDialog.kt\ncom/harman/jbl/partybox/ui/party/stereo/ui/FindAnotherSpeakerDialog\n*L\n37#1:92,4\n56#1:96,2\n*E\n"})
/* loaded from: classes2.dex */
public final class FindAnotherSpeakerDialog extends DialogFragment {

    @l3.d
    public static final String BundleEnumStereoType = "EnumStereoType";

    @l3.d
    public static final a Companion = new a(null);

    /* renamed from: m1, reason: collision with root package name */
    @l3.d
    private static final String f45348m1 = "Stereo.FindAnotherSpeakerDialog";

    /* renamed from: k1, reason: collision with root package name */
    @l3.d
    private final P<EnumStereoType> f45349k1 = new P<>();

    /* renamed from: l1, reason: collision with root package name */
    @l3.d
    private final A f45350l1 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    private final o r0() {
        return (o) this.f45350l1.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        if (getFragmentManager() != null) {
            super.dismiss();
        }
    }

    @l3.d
    public final LiveData<EnumStereoType> getEnumStereoType() {
        return this.f45349k1;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@l3.e Bundle bundle) {
        EnumStereoType enumStereoType;
        super.onCreate(bundle);
        setStyle(0, j.n.f41884f);
        P<EnumStereoType> p4 = this.f45349k1;
        Bundle arguments = getArguments();
        if (arguments != null) {
            enumStereoType = EnumStereoType.Companion.a(arguments.getInt(BundleEnumStereoType));
        } else {
            enumStereoType = null;
        }
        p4.r(enumStereoType);
        com.harman.log.f.d(f45348m1, "onCreate() >>> enumStereoType[" + getEnumStereoType() + "]");
    }

    @Override // androidx.fragment.app.DialogFragment
    @l3.d
    public Dialog onCreateDialog(@l3.e Bundle bundle) {
        Window window;
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        F.o(onCreateDialog, "onCreateDialog(...)");
        Context context = getContext();
        if (context != null && (window = onCreateDialog.getWindow()) != null) {
            window.setNavigationBarColor(C0669d.f(context, j.d.f40732a));
        }
        onCreateDialog.setCanceledOnTouchOutside(true);
        onCreateDialog.setCancelable(true);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @l3.d
    public View onCreateView(@l3.d LayoutInflater inflater, @l3.e ViewGroup viewGroup, @l3.e Bundle bundle) {
        String str;
        F.p(inflater, "inflater");
        int i4 = 0;
        com.harman.jbl.partybox.databinding.F s12 = com.harman.jbl.partybox.databinding.F.s1(inflater, viewGroup, false);
        F.o(s12, "inflate(...)");
        ConstraintLayout layoutPlugOutDaisyChain = s12.f38589n0;
        F.o(layoutPlugOutDaisyChain, "layoutPlugOutDaisyChain");
        HmDevice k12 = r0().k1();
        if (k12 != null) {
            str = k12.q();
        } else {
            str = null;
        }
        if (!com.harman.sdk.utils.d.c0(str)) {
            i4 = 8;
        }
        layoutPlugOutDaisyChain.setVisibility(i4);
        s12.M0(this);
        s12.v1(this);
        View d4 = s12.d();
        F.o(d4, "getRoot(...)");
        return d4;
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
