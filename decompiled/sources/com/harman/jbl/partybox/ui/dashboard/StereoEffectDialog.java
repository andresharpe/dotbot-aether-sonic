package com.harman.jbl.partybox.ui.dashboard;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.content.C0669d;
import androidx.fragment.app.DialogFragment;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.widget.GroupSpeakerView;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import java.util.ArrayList;
import kotlin.jvm.internal.C2197u;

@kotlin.E(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 02\u00020\u0001:\u00011B+\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001a¢\u0006\u0004\b.\u0010/B\t\b\u0016¢\u0006\u0004\b.\u0010\u000bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ-\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001c\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u00062"}, d2 = {"Lcom/harman/jbl/partybox/ui/dashboard/StereoEffectDialog;", "Landroidx/fragment/app/DialogFragment;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/H0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onStart", "()V", "dismiss", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "k1", "Ljava/lang/String;", "pid", "l1", "mid", "Lkotlin/Function0;", "m1", "LX2/a;", "clickListener", "Ljava/util/ArrayList;", "Lcom/harman/sdk/device/PartyBoxDevice;", "Lkotlin/collections/ArrayList;", "n1", "Ljava/util/ArrayList;", "selectedList", "Lcom/harman/jbl/partybox/databinding/B;", "o1", "Lcom/harman/jbl/partybox/databinding/B;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "p1", "Lkotlin/A;", "t0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "<init>", "(Ljava/lang/String;Ljava/lang/String;LX2/a;)V", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@kotlin.jvm.internal.U({"SMAP\nStereoEffectDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StereoEffectDialog.kt\ncom/harman/jbl/partybox/ui/dashboard/StereoEffectDialog\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n66#2,4:109\n1#3:113\n*S KotlinDebug\n*F\n+ 1 StereoEffectDialog.kt\ncom/harman/jbl/partybox/ui/dashboard/StereoEffectDialog\n*L\n31#1:109,4\n*E\n"})
/* loaded from: classes2.dex */
public final class StereoEffectDialog extends DialogFragment {

    @l3.d
    public static final a Companion = new a(null);

    @l3.d
    public static final String TAG = "StereoEffectDialog";

    /* renamed from: k1, reason: collision with root package name */
    @l3.e
    private final String f43161k1;

    /* renamed from: l1, reason: collision with root package name */
    @l3.e
    private final String f43162l1;

    /* renamed from: m1, reason: collision with root package name */
    @l3.e
    private final X2.a<kotlin.H0> f43163m1;

    /* renamed from: n1, reason: collision with root package name */
    @l3.d
    private final ArrayList<PartyBoxDevice> f43164n1;

    /* renamed from: o1, reason: collision with root package name */
    @l3.e
    private com.harman.jbl.partybox.databinding.B f43165o1;

    /* renamed from: p1, reason: collision with root package name */
    @l3.d
    private final kotlin.A f43166p1;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public StereoEffectDialog(@l3.e String str, @l3.e String str2, @l3.e X2.a<kotlin.H0> aVar) {
        this.f43161k1 = str;
        this.f43162l1 = str2;
        this.f43163m1 = aVar;
        this.f43164n1 = new ArrayList<>();
        this.f43166p1 = ApplicationViewModelLazyKt.f(this, kotlin.jvm.internal.N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
    }

    private final com.harman.jbl.partybox.ui.main.o t0() {
        return (com.harman.jbl.partybox.ui.main.o) this.f43166p1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(StereoEffectDialog this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        this$0.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(StereoEffectDialog this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        T1.a.a("StereoEffectDialog,start set up stereo group" + this$0.f43164n1.size());
        this$0.dismiss();
        X2.a<kotlin.H0> aVar = this$0.f43163m1;
        if (aVar != null) {
            aVar.n();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
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
        PartyBoxDevice partyBoxDevice;
        Integer num;
        Integer num2;
        kotlin.jvm.internal.F.p(inflater, "inflater");
        com.harman.jbl.partybox.databinding.B e4 = com.harman.jbl.partybox.databinding.B.e(inflater, viewGroup, false);
        this.f43165o1 = e4;
        if (e4 != null) {
            e4.f38471J.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.F0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StereoEffectDialog.u0(StereoEffectDialog.this, view);
                }
            });
            e4.f38473L.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.G0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StereoEffectDialog.v0(StereoEffectDialog.this, view);
                }
            });
            HmDevice k12 = t0().k1();
            if (k12 instanceof PartyBoxDevice) {
                partyBoxDevice = (PartyBoxDevice) k12;
            } else {
                partyBoxDevice = null;
            }
            if (partyBoxDevice != null) {
                Context context = getContext();
                if (context != null) {
                    num = Integer.valueOf(com.harman.sdk.utils.d.r(context, partyBoxDevice.q(), partyBoxDevice.o()));
                } else {
                    num = null;
                }
                Context context2 = getContext();
                if (context2 != null) {
                    num2 = Integer.valueOf(com.harman.sdk.utils.d.r(context2, partyBoxDevice.q(), this.f43162l1));
                } else {
                    num2 = null;
                }
                if (num != null && num2 != null) {
                    e4.f38469H.b(GroupSpeakerView.f45773P, num.intValue(), num2.intValue());
                } else {
                    com.harman.log.f.a(TAG, "imgScr or imgScr2 is null, so return ");
                }
            }
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            kotlin.jvm.internal.F.m(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            dialog.setCanceledOnTouchOutside(false);
        }
        com.harman.jbl.partybox.databinding.B b4 = this.f43165o1;
        if (b4 == null) {
            return null;
        }
        return b4.d();
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

    public StereoEffectDialog() {
        this(null, null, null);
    }
}
