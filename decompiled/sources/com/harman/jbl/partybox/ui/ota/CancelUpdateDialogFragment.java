package com.harman.jbl.partybox.ui.ota;

import T0.a;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.C0669d;
import androidx.fragment.app.ActivityC0889g;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.j;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import kotlin.jvm.internal.U;

@kotlin.E(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b%\u0010&J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/harman/jbl/partybox/ui/ota/CancelUpdateDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/H0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Lcom/harman/jbl/partybox/ui/ota/CancelUpdateDialogFragment$a;", "l1", "Lcom/harman/jbl/partybox/ui/ota/CancelUpdateDialogFragment$a;", "cancelListener", "Landroid/widget/TextView;", "m1", "Landroid/widget/TextView;", "continueTextView", "n1", "quitTextView", "Lcom/harman/jbl/partybox/ui/main/o;", "o1", "Lkotlin/A;", "y0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "", "p1", "Z", "isOTACancelEventSent", "<init>", "(Lcom/harman/jbl/partybox/ui/ota/CancelUpdateDialogFragment$a;)V", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nCancelUpdateDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancelUpdateDialogFragment.kt\ncom/harman/jbl/partybox/ui/ota/CancelUpdateDialogFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n*L\n1#1,97:1\n66#2,4:98\n*S KotlinDebug\n*F\n+ 1 CancelUpdateDialogFragment.kt\ncom/harman/jbl/partybox/ui/ota/CancelUpdateDialogFragment\n*L\n32#1:98,4\n*E\n"})
/* loaded from: classes2.dex */
public final class CancelUpdateDialogFragment extends BottomSheetDialogFragment {

    /* renamed from: l1, reason: collision with root package name */
    @l3.d
    private final a f44404l1;

    /* renamed from: m1, reason: collision with root package name */
    @l3.e
    private TextView f44405m1;

    /* renamed from: n1, reason: collision with root package name */
    @l3.e
    private TextView f44406n1;

    /* renamed from: o1, reason: collision with root package name */
    @l3.d
    private final kotlin.A f44407o1;

    /* renamed from: p1, reason: collision with root package name */
    private boolean f44408p1;

    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    public CancelUpdateDialogFragment(@l3.d a cancelListener) {
        kotlin.jvm.internal.F.p(cancelListener, "cancelListener");
        this.f44404l1 = cancelListener;
        this.f44407o1 = ApplicationViewModelLazyKt.f(this, kotlin.jvm.internal.N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A0(CancelUpdateDialogFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        this$0.f44404l1.a();
        if (!this$0.f44408p1) {
            this$0.f44408p1 = true;
            HmDevice k12 = this$0.y0().k1();
            kotlin.jvm.internal.F.n(k12, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
            this$0.y0().t2(0, partyBoxDevice.w(), partyBoxDevice.p1(), L1.a.f1620m3);
        }
        this$0.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B0(CancelUpdateDialogFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        this$0.dismiss();
    }

    private final com.harman.jbl.partybox.ui.main.o y0() {
        return (com.harman.jbl.partybox.ui.main.o) this.f44407o1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z0(CancelUpdateDialogFragment this$0, DialogInterface dialogInterface) {
        Window window;
        kotlin.jvm.internal.F.p(this$0, "this$0");
        kotlin.jvm.internal.F.n(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) dialogInterface;
        FrameLayout frameLayout = (FrameLayout) aVar.findViewById(a.h.f2778j1);
        if (frameLayout != null) {
            BottomSheetBehavior.i0(frameLayout).W0(3);
            BottomSheetBehavior.i0(frameLayout).V0(false);
            BottomSheetBehavior.i0(frameLayout).O0(false);
        }
        Window window2 = aVar.getWindow();
        if (window2 != null) {
            window2.addFlags(Integer.MIN_VALUE);
        }
        Context context = this$0.getContext();
        if (context != null && (window = aVar.getWindow()) != null) {
            window.setNavigationBarColor(C0669d.f(context, j.d.f40753h));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@l3.e Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, j.n.f41887i);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @l3.d
    public Dialog onCreateDialog(@l3.e Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        kotlin.jvm.internal.F.n(onCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) onCreateDialog;
        aVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.harman.jbl.partybox.ui.ota.a
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                CancelUpdateDialogFragment.z0(CancelUpdateDialogFragment.this, dialogInterface);
            }
        });
        aVar.x(false);
        aVar.t().J0(false);
        return aVar;
    }

    @Override // androidx.fragment.app.Fragment
    @l3.e
    public View onCreateView(@l3.d LayoutInflater inflater, @l3.e ViewGroup viewGroup, @l3.e Bundle bundle) {
        Resources resources;
        kotlin.jvm.internal.F.p(inflater, "inflater");
        View inflate = inflater.inflate(j.i.f41530p, viewGroup, false);
        Dialog dialog = getDialog();
        kotlin.jvm.internal.F.m(dialog);
        Window window = dialog.getWindow();
        kotlin.jvm.internal.F.m(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Dialog dialog2 = getDialog();
        kotlin.jvm.internal.F.m(dialog2);
        dialog2.setCanceledOnTouchOutside(false);
        View findViewById = inflate.findViewById(j.h.od);
        kotlin.jvm.internal.F.n(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById;
        this.f44406n1 = textView;
        kotlin.jvm.internal.F.m(textView);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.ota.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CancelUpdateDialogFragment.A0(CancelUpdateDialogFragment.this, view);
            }
        });
        View findViewById2 = inflate.findViewById(j.h.f41272f3);
        kotlin.jvm.internal.F.n(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById2;
        this.f44405m1 = textView2;
        kotlin.jvm.internal.F.m(textView2);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.ota.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CancelUpdateDialogFragment.B0(CancelUpdateDialogFragment.this, view);
            }
        });
        View findViewById3 = inflate.findViewById(j.h.f41238Y2);
        kotlin.jvm.internal.F.n(findViewById3, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) findViewById3;
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            resources = activity.getResources();
        } else {
            resources = null;
        }
        frameLayout.setBackground(new BitmapDrawable(resources, com.harman.jbl.partybox.utils.d.f46171a.b(getActivity())));
        return inflate;
    }
}
