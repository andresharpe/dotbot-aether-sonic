package com.harman.jbl.partybox.ui.dashboard;

import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0669d;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.DialogFragment;
import com.harman.jbl.partybox.databinding.Z0;
import com.harman.jbl.partybox.j;

@kotlin.E(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017¢\u0006\u0004\b#\u0010$J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u0004J-\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/harman/jbl/partybox/ui/dashboard/RemoveProductDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lkotlin/H0;", "u0", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lkotlin/Function0;", "k1", "LX2/a;", "clickListener", "Lcom/harman/jbl/partybox/databinding/Z0;", "l1", "Lcom/harman/jbl/partybox/databinding/Z0;", "binding", "Landroid/graphics/drawable/BitmapDrawable;", "m1", "Landroid/graphics/drawable/BitmapDrawable;", "backgroundImage", "<init>", "(LX2/a;)V", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@kotlin.jvm.internal.U({"SMAP\nRemoveProductDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoveProductDialogFragment.kt\ncom/harman/jbl/partybox/ui/dashboard/RemoveProductDialogFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n1#2:85\n*E\n"})
/* loaded from: classes2.dex */
public final class RemoveProductDialogFragment extends DialogFragment {

    /* renamed from: k1, reason: collision with root package name */
    @l3.d
    private final X2.a<kotlin.H0> f43071k1;

    /* renamed from: l1, reason: collision with root package name */
    @l3.e
    private Z0 f43072l1;

    /* renamed from: m1, reason: collision with root package name */
    private BitmapDrawable f43073m1;

    public RemoveProductDialogFragment(@l3.d X2.a<kotlin.H0> clickListener) {
        kotlin.jvm.internal.F.p(clickListener, "clickListener");
        this.f43071k1 = clickListener;
    }

    private final void u0() {
        ConstraintLayout constraintLayout;
        Z0 z02 = this.f43072l1;
        ImageView imageView = null;
        if (z02 != null) {
            constraintLayout = z02.f39289G;
        } else {
            constraintLayout = null;
        }
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        Z0 z03 = this.f43072l1;
        if (z03 != null) {
            imageView = z03.f39291I;
        }
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(RemoveProductDialogFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        this$0.u0();
        this$0.f43071k1.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(RemoveProductDialogFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        this$0.u0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(RemoveProductDialogFragment this$0) {
        ImageView imageView;
        ConstraintLayout constraintLayout;
        kotlin.jvm.internal.F.p(this$0, "this$0");
        Z0 z02 = this$0.f43072l1;
        BitmapDrawable bitmapDrawable = null;
        if (z02 != null) {
            imageView = z02.f39291I;
        } else {
            imageView = null;
        }
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        Z0 z03 = this$0.f43072l1;
        if (z03 != null) {
            constraintLayout = z03.f39289G;
        } else {
            constraintLayout = null;
        }
        if (constraintLayout != null) {
            BitmapDrawable bitmapDrawable2 = this$0.f43073m1;
            if (bitmapDrawable2 == null) {
                kotlin.jvm.internal.F.S("backgroundImage");
            } else {
                bitmapDrawable = bitmapDrawable2;
            }
            constraintLayout.setBackground(bitmapDrawable);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@l3.e Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, j.n.f41884f);
    }

    @Override // androidx.fragment.app.DialogFragment
    @l3.d
    public Dialog onCreateDialog(@l3.e Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        kotlin.jvm.internal.F.o(onCreateDialog, "onCreateDialog(...)");
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            int f4 = C0669d.f(activity, j.d.f40732a);
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
        this.f43072l1 = Z0.c(inflater);
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            resources = activity.getResources();
        } else {
            resources = null;
        }
        this.f43073m1 = new BitmapDrawable(resources, com.harman.jbl.partybox.utils.d.f46171a.b(getActivity()));
        Z0 z02 = this.f43072l1;
        if (z02 != null) {
            z02.f39293K.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.U
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RemoveProductDialogFragment.v0(RemoveProductDialogFragment.this, view);
                }
            });
            z02.f39288F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.V
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RemoveProductDialogFragment.w0(RemoveProductDialogFragment.this, view);
                }
            });
        }
        Z0 z03 = this.f43072l1;
        if (z03 == null) {
            return null;
        }
        return z03.d();
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
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        kotlin.jvm.internal.F.p(view, "view");
        super.onViewCreated(view, bundle);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.harman.jbl.partybox.ui.dashboard.T
            @Override // java.lang.Runnable
            public final void run() {
                RemoveProductDialogFragment.x0(RemoveProductDialogFragment.this);
            }
        }, 200L);
    }
}
