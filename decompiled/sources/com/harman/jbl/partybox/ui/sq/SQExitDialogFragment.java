package com.harman.jbl.partybox.ui.sq;

import W2.n;
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
import android.widget.ImageView;
import androidx.core.content.C0669d;
import androidx.core.os.C0741d;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.harman.jbl.partybox.databinding.C1945v;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.utils.g;
import kotlin.E;
import kotlin.Pair;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@E(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b$\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0004J-\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u0004R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/harman/jbl/partybox/ui/sq/SQExitDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lkotlin/H0;", "v0", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "onResume", "Lcom/harman/jbl/partybox/databinding/v;", "k1", "Lcom/harman/jbl/partybox/databinding/v;", "binding", "Landroid/graphics/drawable/BitmapDrawable;", "l1", "Landroid/graphics/drawable/BitmapDrawable;", "backgroundImage", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nSQExitDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SQExitDialogFragment.kt\ncom/harman/jbl/partybox/ui/sq/SQExitDialogFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,111:1\n1#2:112\n*E\n"})
/* loaded from: classes2.dex */
public final class SQExitDialogFragment extends DialogFragment {

    @l3.d
    public static final String ARG_BACK_UP = "backUp";

    @l3.d
    public static final a Companion = new a(null);
    public static final long POPUP_SHOW_DELAY = 200;

    @l3.d
    public static final String TAG = "SQExitDialogFragment";

    /* renamed from: k1, reason: collision with root package name */
    @l3.e
    private C1945v f45547k1;

    /* renamed from: l1, reason: collision with root package name */
    private BitmapDrawable f45548l1;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @n
        @l3.d
        public final SQExitDialogFragment a(boolean z3) {
            SQExitDialogFragment sQExitDialogFragment = new SQExitDialogFragment();
            sQExitDialogFragment.setArguments(C0741d.b(new Pair(SQExitDialogFragment.ARG_BACK_UP, Boolean.valueOf(z3))));
            return sQExitDialogFragment;
        }

        private a() {
        }
    }

    @n
    @l3.d
    public static final SQExitDialogFragment newInstance(boolean z3) {
        return Companion.a(z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(SQExitDialogFragment this$0) {
        ImageView imageView;
        FrameLayout frameLayout;
        F.p(this$0, "this$0");
        C1945v c1945v = this$0.f45547k1;
        BitmapDrawable bitmapDrawable = null;
        if (c1945v != null) {
            imageView = c1945v.f40208H;
        } else {
            imageView = null;
        }
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        C1945v c1945v2 = this$0.f45547k1;
        if (c1945v2 != null) {
            frameLayout = c1945v2.f40206F;
        } else {
            frameLayout = null;
        }
        if (frameLayout != null) {
            BitmapDrawable bitmapDrawable2 = this$0.f45548l1;
            if (bitmapDrawable2 == null) {
                F.S("backgroundImage");
            } else {
                bitmapDrawable = bitmapDrawable2;
            }
            frameLayout.setBackground(bitmapDrawable);
        }
    }

    private final void v0() {
        C1945v c1945v = this.f45547k1;
        if (c1945v != null) {
            c1945v.f40210J.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.sq.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SQExitDialogFragment.w0(SQExitDialogFragment.this, view);
                }
            });
            c1945v.f40209I.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.sq.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SQExitDialogFragment.x0(SQExitDialogFragment.this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(SQExitDialogFragment this$0, View view) {
        F.p(this$0, "this$0");
        if (!g.c(1000L)) {
            this$0.dismissAllowingStateLoss();
            Bundle arguments = this$0.getArguments();
            boolean z3 = false;
            if (arguments != null) {
                z3 = arguments.getBoolean(ARG_BACK_UP, false);
            }
            if (this$0.getParentFragment() instanceof AuracastSQFragment) {
                Fragment parentFragment = this$0.getParentFragment();
                F.n(parentFragment, "null cannot be cast to non-null type com.harman.jbl.partybox.ui.sq.AuracastSQFragment");
                ((AuracastSQFragment) parentFragment).closeSQ(z3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(SQExitDialogFragment this$0, View view) {
        F.p(this$0, "this$0");
        if (!g.c(1000L)) {
            this$0.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@l3.d Context context) {
        F.p(context, "context");
        super.onAttach(context);
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
        F.o(onCreateDialog, "onCreateDialog(...)");
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
        F.p(inflater, "inflater");
        this.f45547k1 = C1945v.c(inflater);
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            resources = activity.getResources();
        } else {
            resources = null;
        }
        this.f45548l1 = new BitmapDrawable(resources, com.harman.jbl.partybox.utils.d.f46171a.b(getActivity()));
        C1945v c1945v = this.f45547k1;
        if (c1945v == null) {
            return null;
        }
        return c1945v.d();
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
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        T1.a.a("page:SQExitDialogFragment onViewCreated");
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.harman.jbl.partybox.ui.sq.d
            @Override // java.lang.Runnable
            public final void run() {
                SQExitDialogFragment.u0(SQExitDialogFragment.this);
            }
        }, 200L);
        v0();
    }
}
