package com.harman.jbl.partybox.ui.toneshifter;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.d0;
import androidx.fragment.app.DialogFragment;
import com.blankj.utilcode.util.q0;
import com.harman.jbl.partybox.j;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

@E(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B/\u0012\u0006\u00106\u001a\u000205\u0012\b\b\u0003\u0010$\u001a\u00020\u000b\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010+\u001a\u00020(¢\u0006\u0004\b7\u00108J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0012H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0012H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H&¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u0002H&¢\u0006\u0004\b\u001d\u0010\u0004J\u0017\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010.\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010\rR\u001a\u00102\u001a\u00020(8\u0016X\u0096D¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u00101R\u0018\u00104\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010&¨\u00069"}, d2 = {"Lcom/harman/jbl/partybox/ui/toneshifter/BottomPopUpDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lkotlin/H0;", "t0", "()V", "w0", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "", "getTheme", "()I", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "getContentView", "()Landroid/view/View;", "buildContentView", "(Landroid/view/View;)V", "observeModel", "prepareData", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "k1", "I", "anim", "l1", "Landroid/view/View;", "activityRootView", "", "m1", "Z", "cancelable", "n1", "getBackgroundRes", "backgroundRes", "o1", "getDecoOverlayBg", "()Z", "decoOverlayBg", "p1", "fullScreenBgView", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;ILandroid/view/View;Z)V", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class BottomPopUpDialogFragment extends DialogFragment {

    /* renamed from: k1, reason: collision with root package name */
    private final int f45653k1;

    /* renamed from: l1, reason: collision with root package name */
    @l3.e
    private final View f45654l1;

    /* renamed from: m1, reason: collision with root package name */
    private final boolean f45655m1;

    /* renamed from: n1, reason: collision with root package name */
    @InterfaceC0578v
    private final int f45656n1;

    /* renamed from: o1, reason: collision with root package name */
    private final boolean f45657o1;

    /* renamed from: p1, reason: collision with root package name */
    @l3.e
    private View f45658p1;

    public /* synthetic */ BottomPopUpDialogFragment(Context context, int i4, View view, boolean z3, int i5, C2197u c2197u) {
        this(context, (i5 & 2) != 0 ? j.n.f41900v : i4, (i5 & 4) != 0 ? (!(context instanceof Activity) || (r3 = ((Activity) context).getWindow()) == null || (r3 = r3.getDecorView()) == null) ? null : r3.getRootView() : view, (i5 & 8) != 0 ? true : z3);
        Window window;
        View decorView;
    }

    private final void t0() {
        if (this.f45654l1 instanceof ViewGroup) {
            this.f45658p1 = new ImageView(((ViewGroup) this.f45654l1).getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            View view = this.f45658p1;
            if (view != null) {
                view.setLayoutParams(layoutParams);
            }
            View view2 = this.f45658p1;
            if (view2 != null) {
                view2.setBackgroundResource(getBackgroundRes());
            }
            ((ViewGroup) this.f45654l1).addView(this.f45658p1);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.5f);
            alphaAnimation.setDuration(500L);
            alphaAnimation.setFillAfter(true);
            View view3 = this.f45658p1;
            if (view3 != null) {
                view3.startAnimation(alphaAnimation);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(BottomPopUpDialogFragment this$0, DialogInterface dialogInterface) {
        F.p(this$0, "this$0");
        this$0.t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(BottomPopUpDialogFragment this$0, View view) {
        F.p(this$0, "this$0");
        if (this$0.f45655m1) {
            this$0.dismiss();
        }
    }

    private final void w0() {
        if (this.f45654l1 instanceof ViewGroup) {
            View view = this.f45658p1;
            if (view != null) {
                view.setBackgroundResource(j.d.f40743d1);
            }
            View view2 = this.f45658p1;
            if (view2 != null) {
                view2.setAlpha(0.0f);
            }
            ((ViewGroup) this.f45654l1).removeView(this.f45658p1);
        }
    }

    public abstract void buildContentView(@l3.d View view);

    public int getBackgroundRes() {
        return this.f45656n1;
    }

    @l3.d
    public abstract View getContentView();

    public boolean getDecoOverlayBg() {
        return this.f45657o1;
    }

    @Override // androidx.fragment.app.DialogFragment
    public int getTheme() {
        return this.f45653k1;
    }

    public abstract void observeModel();

    @Override // androidx.fragment.app.DialogFragment
    @l3.d
    public Dialog onCreateDialog(@l3.e Bundle bundle) {
        WindowManager.LayoutParams layoutParams;
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        F.o(onCreateDialog, "onCreateDialog(...)");
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        Window window2 = onCreateDialog.getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawableResource(j.d.f40743d1);
        }
        onCreateDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.harman.jbl.partybox.ui.toneshifter.a
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                BottomPopUpDialogFragment.u0(BottomPopUpDialogFragment.this, dialogInterface);
            }
        });
        Window window3 = onCreateDialog.getWindow();
        if (window3 != null) {
            window3.clearFlags(2);
        }
        Window window4 = onCreateDialog.getWindow();
        if (window4 != null) {
            Window window5 = onCreateDialog.getWindow();
            if (window5 != null) {
                layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(window5.getAttributes());
                layoutParams.width = -1;
                layoutParams.height = -1;
            } else {
                layoutParams = null;
            }
            window4.setAttributes(layoutParams);
        }
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @l3.e
    public View onCreateView(@l3.d LayoutInflater inflater, @l3.e ViewGroup viewGroup, @l3.e Bundle bundle) {
        F.p(inflater, "inflater");
        setCancelable(this.f45655m1);
        View contentView = getContentView();
        if (getDecoOverlayBg()) {
            FrameLayout frameLayout = new FrameLayout(requireContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(q0.i(), -2);
            layoutParams.gravity = 80;
            contentView.setLayoutParams(layoutParams);
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.toneshifter.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BottomPopUpDialogFragment.v0(BottomPopUpDialogFragment.this, view);
                }
            });
            contentView.setOnClickListener(null);
            frameLayout.addView(contentView);
            return frameLayout;
        }
        return contentView;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@l3.d DialogInterface dialog) {
        F.p(dialog, "dialog");
        super.onDismiss(dialog);
        w0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        buildContentView(getContentView());
        prepareData();
        observeModel();
    }

    public abstract void prepareData();

    public BottomPopUpDialogFragment(@l3.d Context context, @d0 int i4, @l3.e View view, boolean z3) {
        F.p(context, "context");
        this.f45653k1 = i4;
        this.f45654l1 = view;
        this.f45655m1 = z3;
        this.f45656n1 = j.d.f40747f;
        this.f45657o1 = true;
    }
}
