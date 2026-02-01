package com.harman.jbl.partybox.ui.customviews;

import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
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
import androidx.core.os.C0741d;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.DialogFragment;
import com.harman.jbl.partybox.databinding.M;
import com.harman.jbl.partybox.j;
import kotlin.C2122h0;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@E(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\"\u0010\u0015J-\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/harman/jbl/partybox/ui/customviews/HmTurnOnSpeakerDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Lkotlin/H0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "()V", "Lcom/harman/jbl/partybox/databinding/M;", "k1", "Lcom/harman/jbl/partybox/databinding/M;", "binding", "Landroid/graphics/drawable/BitmapDrawable;", "l1", "Landroid/graphics/drawable/BitmapDrawable;", "backgroundImage", "Lcom/harman/jbl/partybox/ui/customviews/DialogType;", "m1", "Lcom/harman/jbl/partybox/ui/customviews/DialogType;", "type", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nHmTurnOnSpeakerDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HmTurnOnSpeakerDialogFragment.kt\ncom/harman/jbl/partybox/ui/customviews/HmTurnOnSpeakerDialogFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n1#2:115\n*E\n"})
/* loaded from: classes2.dex */
public final class HmTurnOnSpeakerDialogFragment extends DialogFragment {

    @l3.d
    public static final a Companion = new a(null);

    /* renamed from: n1, reason: collision with root package name */
    @l3.d
    private static final String f42598n1 = "args";

    /* renamed from: k1, reason: collision with root package name */
    @l3.e
    private M f42599k1;

    /* renamed from: l1, reason: collision with root package name */
    private BitmapDrawable f42600l1;

    /* renamed from: m1, reason: collision with root package name */
    @l3.d
    private DialogType f42601m1 = DialogType.DISCOVERY;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final HmTurnOnSpeakerDialogFragment a(@l3.d DialogType type) {
            F.p(type, "type");
            HmTurnOnSpeakerDialogFragment hmTurnOnSpeakerDialogFragment = new HmTurnOnSpeakerDialogFragment();
            hmTurnOnSpeakerDialogFragment.setArguments(C0741d.b(C2122h0.a(HmTurnOnSpeakerDialogFragment.f42598n1, type)));
            return hmTurnOnSpeakerDialogFragment;
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42602a;

        static {
            int[] iArr = new int[DialogType.values().length];
            try {
                iArr[DialogType.DISCOVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DialogType.TWS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f42602a = iArr;
        }
    }

    @W2.n
    @l3.d
    public static final HmTurnOnSpeakerDialogFragment newInstance(@l3.d DialogType dialogType) {
        return Companion.a(dialogType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(HmTurnOnSpeakerDialogFragment this$0) {
        ImageView imageView;
        ConstraintLayout constraintLayout;
        F.p(this$0, "this$0");
        M m4 = this$0.f42599k1;
        BitmapDrawable bitmapDrawable = null;
        if (m4 != null) {
            imageView = m4.f38874I;
        } else {
            imageView = null;
        }
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        M m5 = this$0.f42599k1;
        if (m5 != null) {
            constraintLayout = m5.f38872G;
        } else {
            constraintLayout = null;
        }
        if (constraintLayout != null) {
            BitmapDrawable bitmapDrawable2 = this$0.f42600l1;
            if (bitmapDrawable2 == null) {
                F.S("backgroundImage");
            } else {
                bitmapDrawable = bitmapDrawable2;
            }
            constraintLayout.setBackground(bitmapDrawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(final HmTurnOnSpeakerDialogFragment this$0, View view) {
        ConstraintLayout constraintLayout;
        Window window;
        F.p(this$0, "this$0");
        Dialog dialog = this$0.getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        M m4 = this$0.f42599k1;
        ImageView imageView = null;
        if (m4 != null) {
            constraintLayout = m4.f38872G;
        } else {
            constraintLayout = null;
        }
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        M m5 = this$0.f42599k1;
        if (m5 != null) {
            imageView = m5.f38874I;
        }
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.harman.jbl.partybox.ui.customviews.p
            @Override // java.lang.Runnable
            public final void run() {
                HmTurnOnSpeakerDialogFragment.w0(HmTurnOnSpeakerDialogFragment.this);
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(HmTurnOnSpeakerDialogFragment this$0) {
        F.p(this$0, "this$0");
        this$0.dismiss();
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
        this.f42599k1 = M.c(inflater);
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            resources = activity.getResources();
        } else {
            resources = null;
        }
        this.f42600l1 = new BitmapDrawable(resources, com.harman.jbl.partybox.utils.d.f46171a.b(getActivity()));
        M m4 = this.f42599k1;
        if (m4 == null) {
            return null;
        }
        return m4.d();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setLayout(-1, -1);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setGravity(80);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        Object obj;
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.harman.jbl.partybox.ui.customviews.n
            @Override // java.lang.Runnable
            public final void run() {
                HmTurnOnSpeakerDialogFragment.u0(HmTurnOnSpeakerDialogFragment.this);
            }
        }, 200L);
        M m4 = this.f42599k1;
        if (m4 != null) {
            m4.f38875J.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.customviews.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    HmTurnOnSpeakerDialogFragment.v0(HmTurnOnSpeakerDialogFragment.this, view2);
                }
            });
            Bundle arguments = getArguments();
            if (arguments != null) {
                obj = arguments.get(f42598n1);
            } else {
                obj = null;
            }
            F.n(obj, "null cannot be cast to non-null type com.harman.jbl.partybox.ui.customviews.DialogType");
            DialogType dialogType = (DialogType) obj;
            this.f42601m1 = dialogType;
            int i4 = b.f42602a[dialogType.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    m4.f38877L.setText(j.m.Pa);
                    m4.f38871F.setImageResource(j.f.Yb);
                    return;
                }
                return;
            }
            m4.f38871F.setAnimation(j.l.f41596b);
            m4.f38871F.B();
            m4.f38877L.setText(j.m.Qa);
        }
    }
}
