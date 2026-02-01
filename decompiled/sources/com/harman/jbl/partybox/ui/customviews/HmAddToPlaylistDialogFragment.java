package com.harman.jbl.partybox.ui.customviews;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.fragment.app.DialogFragment;
import com.google.android.gms.common.internal.C;
import com.harman.jbl.partybox.j;
import kotlin.E;
import kotlin.jvm.internal.F;
import kotlin.text.z;

@E(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b*\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ-\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\bR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u0018\u0010)\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/harman/jbl/partybox/ui/customviews/HmAddToPlaylistDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroid/view/View;", "rootView", "Lkotlin/H0;", "u0", "(Landroid/view/View;)V", "y0", "()V", "Lcom/harman/jbl/partybox/ui/customviews/HmAddToPlaylistDialogFragment$a;", C.a.f28602a, "setListener", "(Lcom/harman/jbl/partybox/ui/customviews/HmAddToPlaylistDialogFragment$a;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onResume", "Lcom/harman/jbl/partybox/ui/customviews/HmTextViewWithImage;", "k1", "Lcom/harman/jbl/partybox/ui/customviews/HmTextViewWithImage;", "button1", "l1", "button2", "Landroid/widget/ImageView;", "m1", "Landroid/widget/ImageView;", "closeButton", "Lcom/harman/jbl/partybox/ui/customviews/HmCustomFontTextView;", "n1", "Lcom/harman/jbl/partybox/ui/customviews/HmCustomFontTextView;", "title", "o1", "desc", "p1", "Lcom/harman/jbl/partybox/ui/customviews/HmAddToPlaylistDialogFragment$a;", "mListener", "<init>", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class HmAddToPlaylistDialogFragment extends DialogFragment {

    /* renamed from: k1, reason: collision with root package name */
    @l3.e
    private HmTextViewWithImage f42485k1;

    /* renamed from: l1, reason: collision with root package name */
    @l3.e
    private HmTextViewWithImage f42486l1;

    /* renamed from: m1, reason: collision with root package name */
    @l3.e
    private ImageView f42487m1;

    /* renamed from: n1, reason: collision with root package name */
    @l3.e
    private HmCustomFontTextView f42488n1;

    /* renamed from: o1, reason: collision with root package name */
    @l3.e
    private HmTextViewWithImage f42489o1;

    /* renamed from: p1, reason: collision with root package name */
    @l3.e
    private a f42490p1;

    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void b();

        void onCancel();
    }

    private final void u0(View view) {
        this.f42485k1 = (HmTextViewWithImage) view.findViewById(j.h.f41213S1);
        this.f42486l1 = (HmTextViewWithImage) view.findViewById(j.h.f41217T1);
        this.f42487m1 = (ImageView) view.findViewById(j.h.f41336s2);
        this.f42488n1 = (HmCustomFontTextView) view.findViewById(j.h.Vg);
        this.f42489o1 = (HmTextViewWithImage) view.findViewById(j.h.Ta);
        y0();
        HmTextViewWithImage hmTextViewWithImage = this.f42485k1;
        if (hmTextViewWithImage != null) {
            hmTextViewWithImage.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.customviews.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    HmAddToPlaylistDialogFragment.v0(HmAddToPlaylistDialogFragment.this, view2);
                }
            });
        }
        HmTextViewWithImage hmTextViewWithImage2 = this.f42486l1;
        if (hmTextViewWithImage2 != null) {
            hmTextViewWithImage2.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.customviews.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    HmAddToPlaylistDialogFragment.w0(HmAddToPlaylistDialogFragment.this, view2);
                }
            });
        }
        ImageView imageView = this.f42487m1;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.customviews.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    HmAddToPlaylistDialogFragment.x0(HmAddToPlaylistDialogFragment.this, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(HmAddToPlaylistDialogFragment this$0, View view) {
        F.p(this$0, "this$0");
        a aVar = this$0.f42490p1;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(HmAddToPlaylistDialogFragment this$0, View view) {
        F.p(this$0, "this$0");
        a aVar = this$0.f42490p1;
        if (aVar != null) {
            aVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(HmAddToPlaylistDialogFragment this$0, View view) {
        F.p(this$0, "this$0");
        a aVar = this$0.f42490p1;
        if (aVar != null) {
            aVar.onCancel();
        }
    }

    private final void y0() {
        String str;
        boolean L12;
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString(com.harman.jbl.partybox.constants.a.f38369l0);
        } else {
            str = null;
        }
        L12 = z.L1(str, com.harman.jbl.partybox.constants.a.f38359g0, false, 2, null);
        if (L12) {
            HmCustomFontTextView hmCustomFontTextView = this.f42488n1;
            if (hmCustomFontTextView != null) {
                hmCustomFontTextView.setText(getString(j.m.f41760h));
            }
            HmTextViewWithImage hmTextViewWithImage = this.f42489o1;
            if (hmTextViewWithImage != null) {
                hmTextViewWithImage.setText(getString(j.m.f41755g));
            }
            HmTextViewWithImage hmTextViewWithImage2 = this.f42485k1;
            if (hmTextViewWithImage2 != null) {
                hmTextViewWithImage2.setText(getString(j.m.f41622A0));
            }
            HmTextViewWithImage hmTextViewWithImage3 = this.f42486l1;
            if (hmTextViewWithImage3 != null) {
                hmTextViewWithImage3.setText(getString(j.m.T5));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    @l3.e
    public View onCreateView(@l3.d LayoutInflater inflater, @l3.e ViewGroup viewGroup, @l3.e Bundle bundle) {
        WindowManager.LayoutParams layoutParams;
        Window window;
        Window window2;
        Window window3;
        F.p(inflater, "inflater");
        View inflate = inflater.inflate(j.i.f41503i0, viewGroup, false);
        Dialog dialog = getDialog();
        if (dialog != null && (window3 = dialog.getWindow()) != null) {
            window3.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window2 = dialog2.getWindow()) != null) {
            window2.setGravity(80);
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null && (window = dialog3.getWindow()) != null) {
            layoutParams = window.getAttributes();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.windowAnimations = j.n.f41876b;
        }
        Dialog dialog4 = getDialog();
        if (dialog4 != null) {
            dialog4.setCanceledOnTouchOutside(false);
        }
        Dialog dialog5 = getDialog();
        if (dialog5 != null) {
            dialog5.setCancelable(false);
        }
        F.m(inflate);
        u0(inflate);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        y0();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(com.harman.jbl.partybox.utils.n.d(getActivity()), -2);
        }
    }

    public final void setListener(@l3.d a listener) {
        F.p(listener, "listener");
        this.f42490p1 = listener;
    }
}
