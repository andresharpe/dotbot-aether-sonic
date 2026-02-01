package com.harman.jbl.partybox.ui.dashboard;

import T0.a;
import android.app.Dialog;
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
import com.harman.jbl.partybox.databinding.X0;
import com.harman.jbl.partybox.j;
import kotlin.jvm.internal.C2197u;

@kotlin.E(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001fB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006 "}, d2 = {"Lcom/harman/jbl/partybox/ui/dashboard/PowerOffDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/H0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/harman/jbl/partybox/databinding/X0;", "l1", "Lcom/harman/jbl/partybox/databinding/X0;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "m1", "Lkotlin/A;", "y0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "<init>", "()V", "Companion", "a", com.harman.log.b.f47574c, "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@kotlin.jvm.internal.U({"SMAP\nPowerOffDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PowerOffDialogFragment.kt\ncom/harman/jbl/partybox/ui/dashboard/PowerOffDialogFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n*L\n1#1,106:1\n66#2,4:107\n*S KotlinDebug\n*F\n+ 1 PowerOffDialogFragment.kt\ncom/harman/jbl/partybox/ui/dashboard/PowerOffDialogFragment\n*L\n36#1:107,4\n*E\n"})
/* loaded from: classes2.dex */
public final class PowerOffDialogFragment extends BottomSheetDialogFragment {

    @l3.d
    public static final a Companion = new a(null);

    /* renamed from: n1, reason: collision with root package name */
    @l3.d
    private static final String f43003n1 = "PowerOffDialogFragment";

    /* renamed from: l1, reason: collision with root package name */
    @l3.e
    private X0 f43004l1;

    /* renamed from: m1, reason: collision with root package name */
    @l3.d
    private final kotlin.A f43005m1 = ApplicationViewModelLazyKt.f(this, kotlin.jvm.internal.N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A0(PowerOffDialogFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        if (this$0.y0().k1() != null) {
            this$0.y0().C2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B0(PowerOffDialogFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        androidx.navigation.fragment.f.a(this$0).r0();
    }

    private final com.harman.jbl.partybox.ui.main.o y0() {
        return (com.harman.jbl.partybox.ui.main.o) this.f43005m1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z0(PowerOffDialogFragment this$0, DialogInterface dialogInterface) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        kotlin.jvm.internal.F.n(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) dialogInterface;
        FrameLayout frameLayout = (FrameLayout) aVar.findViewById(a.h.f2778j1);
        if (frameLayout != null) {
            BottomSheetBehavior.i0(frameLayout).W0(3);
            BottomSheetBehavior.i0(frameLayout).V0(false);
            BottomSheetBehavior.i0(frameLayout).O0(false);
        }
        Window window = aVar.getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
        }
        Window window2 = aVar.getWindow();
        if (window2 != null) {
            window2.setNavigationBarColor(C0669d.f(this$0.requireContext(), j.d.f40753h));
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
        aVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.harman.jbl.partybox.ui.dashboard.K
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                PowerOffDialogFragment.z0(PowerOffDialogFragment.this, dialogInterface);
            }
        });
        aVar.x(false);
        aVar.t().J0(false);
        return aVar;
    }

    @Override // androidx.fragment.app.Fragment
    @l3.e
    public View onCreateView(@l3.d LayoutInflater inflater, @l3.e ViewGroup viewGroup, @l3.e Bundle bundle) {
        FrameLayout frameLayout;
        Resources resources;
        TextView textView;
        TextView textView2;
        kotlin.jvm.internal.F.p(inflater, "inflater");
        X0 e4 = X0.e(inflater, viewGroup, false);
        this.f43004l1 = e4;
        if (e4 != null && (textView2 = e4.f39202J) != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.I
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PowerOffDialogFragment.A0(PowerOffDialogFragment.this, view);
                }
            });
        }
        X0 x02 = this.f43004l1;
        if (x02 != null && (textView = x02.f39199G) != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.J
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PowerOffDialogFragment.B0(PowerOffDialogFragment.this, view);
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
        X0 x03 = this.f43004l1;
        if (x03 != null) {
            frameLayout = x03.f39198F;
        } else {
            frameLayout = null;
        }
        if (frameLayout != null) {
            ActivityC0889g activity = getActivity();
            if (activity != null) {
                resources = activity.getResources();
            } else {
                resources = null;
            }
            frameLayout.setBackground(new BitmapDrawable(resources, com.harman.jbl.partybox.utils.d.f46171a.b(getActivity())));
        }
        X0 x04 = this.f43004l1;
        if (x04 == null) {
            return null;
        }
        return x04.d();
    }
}
