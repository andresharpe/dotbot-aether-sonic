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
import com.harman.jbl.partybox.databinding.C1950w;
import com.harman.jbl.partybox.j;
import kotlin.jvm.internal.C2197u;

@kotlin.E(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 %2\u00020\u0001:\u0001&B\u0015\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017¢\u0006\u0004\b#\u0010$J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u0004J-\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!¨\u0006'"}, d2 = {"Lcom/harman/jbl/partybox/ui/dashboard/HowToFindSpeakerDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lkotlin/H0;", "u0", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lkotlin/Function0;", "k1", "LX2/a;", "clickListener", "Lcom/harman/jbl/partybox/databinding/w;", "l1", "Lcom/harman/jbl/partybox/databinding/w;", "binding", "Landroid/graphics/drawable/BitmapDrawable;", "m1", "Landroid/graphics/drawable/BitmapDrawable;", "backgroundImage", "<init>", "(LX2/a;)V", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@kotlin.jvm.internal.U({"SMAP\nHowToFindSpeakerDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HowToFindSpeakerDialogFragment.kt\ncom/harman/jbl/partybox/ui/dashboard/HowToFindSpeakerDialogFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n1#2:83\n*E\n"})
/* loaded from: classes2.dex */
public final class HowToFindSpeakerDialogFragment extends DialogFragment {

    @l3.d
    public static final a Companion = new a(null);

    @l3.d
    public static final String TAG = "HowToFindSpeakerDialogFragment";

    /* renamed from: k1, reason: collision with root package name */
    @l3.d
    private final X2.a<kotlin.H0> f42988k1;

    /* renamed from: l1, reason: collision with root package name */
    @l3.e
    private C1950w f42989l1;

    /* renamed from: m1, reason: collision with root package name */
    private BitmapDrawable f42990m1;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public HowToFindSpeakerDialogFragment(@l3.d X2.a<kotlin.H0> clickListener) {
        kotlin.jvm.internal.F.p(clickListener, "clickListener");
        this.f42988k1 = clickListener;
    }

    private final void u0() {
        ConstraintLayout constraintLayout;
        C1950w c1950w = this.f42989l1;
        ImageView imageView = null;
        if (c1950w != null) {
            constraintLayout = c1950w.f40249G;
        } else {
            constraintLayout = null;
        }
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        C1950w c1950w2 = this.f42989l1;
        if (c1950w2 != null) {
            imageView = c1950w2.f40250H;
        }
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(HowToFindSpeakerDialogFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        this$0.u0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(HowToFindSpeakerDialogFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        this$0.f42988k1.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(HowToFindSpeakerDialogFragment this$0) {
        ImageView imageView;
        ConstraintLayout constraintLayout;
        kotlin.jvm.internal.F.p(this$0, "this$0");
        C1950w c1950w = this$0.f42989l1;
        BitmapDrawable bitmapDrawable = null;
        if (c1950w != null) {
            imageView = c1950w.f40250H;
        } else {
            imageView = null;
        }
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        C1950w c1950w2 = this$0.f42989l1;
        if (c1950w2 != null) {
            constraintLayout = c1950w2.f40249G;
        } else {
            constraintLayout = null;
        }
        if (constraintLayout != null) {
            BitmapDrawable bitmapDrawable2 = this$0.f42990m1;
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
        this.f42989l1 = C1950w.c(inflater);
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            resources = activity.getResources();
        } else {
            resources = null;
        }
        this.f42990m1 = new BitmapDrawable(resources, com.harman.jbl.partybox.utils.d.f46171a.b(getActivity()));
        C1950w c1950w = this.f42989l1;
        if (c1950w != null) {
            c1950w.f40248F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.G
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HowToFindSpeakerDialogFragment.v0(HowToFindSpeakerDialogFragment.this, view);
                }
            });
            c1950w.f40256N.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.H
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HowToFindSpeakerDialogFragment.w0(HowToFindSpeakerDialogFragment.this, view);
                }
            });
        }
        C1950w c1950w2 = this.f42989l1;
        if (c1950w2 == null) {
            return null;
        }
        return c1950w2.d();
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
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.harman.jbl.partybox.ui.dashboard.F
            @Override // java.lang.Runnable
            public final void run() {
                HowToFindSpeakerDialogFragment.x0(HowToFindSpeakerDialogFragment.this);
            }
        }, 200L);
    }
}
