package com.harman.jbl.partylight.lib.dashboard;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.C0669d;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m0;
import com.harman.jbl.partylight.lib.biz.Color;
import com.harman.jbl.partylight.lib.dashboard.widget.ColorPickerView;
import com.harman.jbl.partylight.lib.g;
import kotlin.A;
import kotlin.C;
import kotlin.E;
import kotlin.H0;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;
import m2.C2370j;

@E(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 +2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b*\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0004J-\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u0004R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006-"}, d2 = {"Lcom/harman/jbl/partylight/lib/dashboard/PickerSelectDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lkotlin/H0;", "v0", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "onResume", "Lm2/j;", "k1", "Lm2/j;", "binding", "Landroid/graphics/drawable/BitmapDrawable;", "l1", "Landroid/graphics/drawable/BitmapDrawable;", "backgroundImage", "Lcom/harman/jbl/partylight/lib/dashboard/m;", "m1", "Lkotlin/A;", "t0", "()Lcom/harman/jbl/partylight/lib/dashboard/m;", "viewModel", "<init>", "Companion", "a", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nPickerSelectDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickerSelectDialogFragment.kt\ncom/harman/jbl/partylight/lib/dashboard/PickerSelectDialogFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
/* loaded from: classes2.dex */
public final class PickerSelectDialogFragment extends DialogFragment {

    @l3.d
    public static final a Companion = new a(null);

    @l3.d
    public static final String TAG = "PickerSelectDialogFragment";

    /* renamed from: k1, reason: collision with root package name */
    @l3.e
    private C2370j f46314k1;

    /* renamed from: l1, reason: collision with root package name */
    private BitmapDrawable f46315l1;

    /* renamed from: m1, reason: collision with root package name */
    @l3.d
    private final A f46316m1;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final PickerSelectDialogFragment a(int i4, int i5, int i6) {
            PickerSelectDialogFragment pickerSelectDialogFragment = new PickerSelectDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("red", i4);
            bundle.putInt("green", i5);
            bundle.putInt("blue", i6);
            pickerSelectDialogFragment.setArguments(bundle);
            return pickerSelectDialogFragment;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements X2.l<Color, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ ColorPickerView f46317F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ PickerSelectDialogFragment f46318G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ColorPickerView colorPickerView, PickerSelectDialogFragment pickerSelectDialogFragment) {
            super(1);
            this.f46317F = colorPickerView;
            this.f46318G = pickerSelectDialogFragment;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Color color) {
            c(color);
            return H0.f51801a;
        }

        public final void c(@l3.d Color updatedColor) {
            F.p(updatedColor, "updatedColor");
            this.f46317F.setColor(updatedColor);
            Log.d(PickerSelectDialogFragment.TAG, "LightShowController onColorSelected: " + updatedColor);
            this.f46318G.t0().U(updatedColor);
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends Lambda implements X2.a<m> {
        c() {
            super(0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final m n() {
            Fragment parentFragment = PickerSelectDialogFragment.this.getParentFragment();
            F.m(parentFragment);
            return (m) new m0(parentFragment).a(m.class);
        }
    }

    public PickerSelectDialogFragment() {
        A a4;
        a4 = C.a(new c());
        this.f46316m1 = a4;
    }

    @W2.n
    @l3.d
    public static final PickerSelectDialogFragment newInstance(int i4, int i5, int i6) {
        return Companion.a(i4, i5, i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m t0() {
        return (m) this.f46316m1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(PickerSelectDialogFragment this$0) {
        ImageView imageView;
        FrameLayout frameLayout;
        F.p(this$0, "this$0");
        C2370j c2370j = this$0.f46314k1;
        BitmapDrawable bitmapDrawable = null;
        if (c2370j != null) {
            imageView = c2370j.f55144H;
        } else {
            imageView = null;
        }
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        C2370j c2370j2 = this$0.f46314k1;
        if (c2370j2 != null) {
            frameLayout = c2370j2.f55143G;
        } else {
            frameLayout = null;
        }
        if (frameLayout != null) {
            BitmapDrawable bitmapDrawable2 = this$0.f46315l1;
            if (bitmapDrawable2 == null) {
                F.S("backgroundImage");
            } else {
                bitmapDrawable = bitmapDrawable2;
            }
            frameLayout.setBackground(bitmapDrawable);
        }
    }

    private final void v0() {
        C2370j c2370j = this.f46314k1;
        if (c2370j != null) {
            c2370j.f55145I.setText(getString(g.l.f47126m));
            c2370j.f55146J.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.dashboard.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PickerSelectDialogFragment.w0(PickerSelectDialogFragment.this, view);
                }
            });
            ColorPickerView colorPickerView = c2370j.f55142F;
            colorPickerView.setListener(new b(colorPickerView, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(PickerSelectDialogFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@l3.d Context context) {
        F.p(context, "context");
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
    @l3.e
    public View onCreateView(@l3.d LayoutInflater inflater, @l3.e ViewGroup viewGroup, @l3.e Bundle bundle) {
        Resources resources;
        F.p(inflater, "inflater");
        this.f46314k1 = C2370j.c(inflater);
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            resources = activity.getResources();
        } else {
            resources = null;
        }
        this.f46315l1 = new BitmapDrawable(resources, com.harman.jbl.cd_biz_comm.utils.a.f37864a.a(getActivity()));
        C2370j c2370j = this.f46314k1;
        if (c2370j == null) {
            return null;
        }
        return c2370j.d();
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
        Color color;
        ColorPickerView colorPickerView;
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.harman.jbl.partylight.lib.dashboard.n
            @Override // java.lang.Runnable
            public final void run() {
                PickerSelectDialogFragment.u0(PickerSelectDialogFragment.this);
            }
        }, 200L);
        v0();
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i4 = arguments.getInt("red", 255);
            int i5 = arguments.getInt("green", 255);
            int i6 = arguments.getInt("blue", 255);
            if (i4 == 0 && i5 == 0 && i6 == 0) {
                color = new Color(255, 255, 255);
            } else {
                color = new Color(i4, i5, i6);
            }
            C2370j c2370j = this.f46314k1;
            if (c2370j != null && (colorPickerView = c2370j.f55142F) != null) {
                colorPickerView.setColor(color);
            }
        }
    }
}
