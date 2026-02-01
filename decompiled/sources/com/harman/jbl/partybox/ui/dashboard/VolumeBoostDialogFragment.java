package com.harman.jbl.partybox.ui.dashboard;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.content.C0669d;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.DialogFragment;
import com.harman.jbl.partybox.databinding.C1847b0;
import com.harman.jbl.partylight.lib.g;
import kotlin.jvm.internal.C2197u;

@kotlin.E(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 -2\u00020\u0001:\u0001.B\u0019\u0012\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d¢\u0006\u0004\b+\u0010,J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0004J-\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u0004R\u001f\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006/"}, d2 = {"Lcom/harman/jbl/partybox/ui/dashboard/VolumeBoostDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lkotlin/H0;", "v0", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "onResume", "onDestroyView", "Lkotlin/Function0;", "k1", "LX2/a;", "getOnGotIt", "()LX2/a;", "onGotIt", "Lcom/harman/jbl/partybox/databinding/b0;", "l1", "Lcom/harman/jbl/partybox/databinding/b0;", "binding", "Landroid/graphics/drawable/BitmapDrawable;", "m1", "Landroid/graphics/drawable/BitmapDrawable;", "backgroundImage", "<init>", "(LX2/a;)V", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@kotlin.jvm.internal.U({"SMAP\nVolumeBoostDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VolumeBoostDialogFragment.kt\ncom/harman/jbl/partybox/ui/dashboard/VolumeBoostDialogFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"})
/* loaded from: classes2.dex */
public final class VolumeBoostDialogFragment extends DialogFragment {

    @l3.d
    public static final a Companion = new a(null);

    @l3.d
    public static final String TAG = "VolumeBoostDialogFragment";

    /* renamed from: k1, reason: collision with root package name */
    @l3.e
    private final X2.a<kotlin.H0> f43171k1;

    /* renamed from: l1, reason: collision with root package name */
    @l3.e
    private C1847b0 f43172l1;

    /* renamed from: m1, reason: collision with root package name */
    private BitmapDrawable f43173m1;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VolumeBoostDialogFragment() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(VolumeBoostDialogFragment this$0) {
        FrameLayout frameLayout;
        kotlin.jvm.internal.F.p(this$0, "this$0");
        C1847b0 c1847b0 = this$0.f43172l1;
        BitmapDrawable bitmapDrawable = null;
        if (c1847b0 != null) {
            frameLayout = c1847b0.f39361G;
        } else {
            frameLayout = null;
        }
        if (frameLayout != null) {
            BitmapDrawable bitmapDrawable2 = this$0.f43173m1;
            if (bitmapDrawable2 == null) {
                kotlin.jvm.internal.F.S("backgroundImage");
            } else {
                bitmapDrawable = bitmapDrawable2;
            }
            frameLayout.setBackground(bitmapDrawable);
        }
    }

    private final void v0() {
        C1847b0 c1847b0 = this.f43172l1;
        if (c1847b0 != null) {
            c1847b0.f39364J.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.M0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VolumeBoostDialogFragment.w0(VolumeBoostDialogFragment.this, view);
                }
            });
            c1847b0.f39360F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.N0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VolumeBoostDialogFragment.x0(VolumeBoostDialogFragment.this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(VolumeBoostDialogFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        this$0.dismissAllowingStateLoss();
        X2.a<kotlin.H0> aVar = this$0.f43171k1;
        if (aVar != null) {
            aVar.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(VolumeBoostDialogFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        this$0.dismissAllowingStateLoss();
    }

    @l3.e
    public final X2.a<kotlin.H0> getOnGotIt() {
        return this.f43171k1;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@l3.d Context context) {
        kotlin.jvm.internal.F.p(context, "context");
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@l3.e Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, g.m.f47159f);
    }

    @Override // androidx.fragment.app.DialogFragment
    @l3.d
    public Dialog onCreateDialog(@l3.e Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        kotlin.jvm.internal.F.o(onCreateDialog, "onCreateDialog(...)");
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            int f4 = C0669d.f(activity, g.c.f46623a);
            Window window = onCreateDialog.getWindow();
            if (window != null) {
                window.setNavigationBarColor(f4);
            }
        }
        onCreateDialog.setCanceledOnTouchOutside(false);
        onCreateDialog.setCancelable(false);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @l3.e
    public View onCreateView(@l3.d LayoutInflater inflater, @l3.e ViewGroup viewGroup, @l3.e Bundle bundle) {
        Resources resources;
        kotlin.jvm.internal.F.p(inflater, "inflater");
        this.f43172l1 = C1847b0.c(inflater);
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            resources = activity.getResources();
        } else {
            resources = null;
        }
        this.f43173m1 = new BitmapDrawable(resources, com.harman.jbl.cd_biz_comm.utils.a.f37864a.a(getActivity()));
        C1847b0 c1847b0 = this.f43172l1;
        if (c1847b0 == null) {
            return null;
        }
        return c1847b0.d();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"StringFormatInvalid"})
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        kotlin.jvm.internal.F.p(view, "view");
        super.onViewCreated(view, bundle);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.harman.jbl.partybox.ui.dashboard.L0
            @Override // java.lang.Runnable
            public final void run() {
                VolumeBoostDialogFragment.u0(VolumeBoostDialogFragment.this);
            }
        }, 200L);
        v0();
    }

    public /* synthetic */ VolumeBoostDialogFragment(X2.a aVar, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? null : aVar);
    }

    public VolumeBoostDialogFragment(@l3.e X2.a<kotlin.H0> aVar) {
        this.f43171k1 = aVar;
    }
}
