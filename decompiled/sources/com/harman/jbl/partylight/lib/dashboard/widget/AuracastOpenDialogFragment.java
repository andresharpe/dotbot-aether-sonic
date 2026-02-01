package com.harman.jbl.partylight.lib.dashboard.widget;

import W2.n;
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
import com.harman.jbl.cd_biz_comm.utils.h;
import com.harman.jbl.cd_biz_comm.widget.HmTextViewWithImage;
import com.harman.jbl.partylight.lib.g;
import kotlin.A;
import kotlin.C;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;
import kotlin.text.z;
import l3.e;
import m2.C2367g;

@E(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b&\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0004J-\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u0004R\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcom/harman/jbl/partylight/lib/dashboard/widget/AuracastOpenDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lkotlin/H0;", "v0", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "onResume", "Lm2/g;", "k1", "Lkotlin/A;", "t0", "()Lm2/g;", "binding", "Landroid/graphics/drawable/BitmapDrawable;", "l1", "Landroid/graphics/drawable/BitmapDrawable;", "backgroundImage", "<init>", "Companion", "a", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nAuracastOpenDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuracastOpenDialogFragment.kt\ncom/harman/jbl/partylight/lib/dashboard/widget/AuracastOpenDialogFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1#2:108\n*E\n"})
/* loaded from: classes2.dex */
public final class AuracastOpenDialogFragment extends DialogFragment {

    @l3.d
    public static final a Companion = new a(null);
    public static final long POPUP_SHOW_DELAY = 200;

    @l3.d
    public static final String TAG = "AuracastOpenDialogFragment";

    /* renamed from: k1, reason: collision with root package name */
    @l3.d
    private final A f46403k1;

    /* renamed from: l1, reason: collision with root package name */
    private BitmapDrawable f46404l1;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @n
        @l3.d
        public final AuracastOpenDialogFragment a() {
            return new AuracastOpenDialogFragment();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends Lambda implements X2.a<C2367g> {
        b() {
            super(0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C2367g n() {
            return C2367g.c(AuracastOpenDialogFragment.this.getLayoutInflater());
        }
    }

    public AuracastOpenDialogFragment() {
        A a4;
        a4 = C.a(new b());
        this.f46403k1 = a4;
    }

    @n
    @l3.d
    public static final AuracastOpenDialogFragment newInstance() {
        return Companion.a();
    }

    private final C2367g t0() {
        return (C2367g) this.f46403k1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(AuracastOpenDialogFragment this$0) {
        F.p(this$0, "this$0");
        this$0.t0().f55124H.setVisibility(0);
        FrameLayout frameLayout = this$0.t0().f55123G;
        BitmapDrawable bitmapDrawable = this$0.f46404l1;
        if (bitmapDrawable == null) {
            F.S("backgroundImage");
            bitmapDrawable = null;
        }
        frameLayout.setBackground(bitmapDrawable);
        this$0.t0().f55126J.setText(this$0.getString(g.l.f47062A0) + "\n" + h.a());
    }

    private final void v0() {
        String i22;
        C2367g t02 = t0();
        if (t02 != null) {
            HmTextViewWithImage hmTextViewWithImage = t02.f55125I;
            String string = getString(g.l.f47066C0);
            F.o(string, "getString(...)");
            i22 = z.i2(string, "[img]", "[img src=ptl_qa_ic_auracast/]", false, 4, null);
            hmTextViewWithImage.setText(i22);
            t02.f55122F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.dashboard.widget.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AuracastOpenDialogFragment.w0(AuracastOpenDialogFragment.this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(AuracastOpenDialogFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@l3.d Context context) {
        F.p(context, "context");
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@e Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, g.m.f47159f);
    }

    @Override // androidx.fragment.app.DialogFragment
    @l3.d
    public Dialog onCreateDialog(@e Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        F.o(onCreateDialog, "onCreateDialog(...)");
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
    @e
    public View onCreateView(@l3.d LayoutInflater inflater, @e ViewGroup viewGroup, @e Bundle bundle) {
        Resources resources;
        F.p(inflater, "inflater");
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            resources = activity.getResources();
        } else {
            resources = null;
        }
        this.f46404l1 = new BitmapDrawable(resources, com.harman.jbl.cd_biz_comm.utils.a.f37864a.a(getActivity()));
        return t0().d();
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
    @SuppressLint({"SetTextI18n"})
    public void onViewCreated(@l3.d View view, @e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.harman.jbl.partylight.lib.dashboard.widget.a
            @Override // java.lang.Runnable
            public final void run() {
                AuracastOpenDialogFragment.u0(AuracastOpenDialogFragment.this);
            }
        }, 200L);
        v0();
    }
}
