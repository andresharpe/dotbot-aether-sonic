package com.harman.jbl.partybox.ui.group;

import W2.n;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0669d;
import androidx.core.os.C0741d;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.C1955x;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.utils.EnumIdentifyDevice;
import kotlin.A;
import kotlin.C2122h0;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.U;

@E(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 42\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b3\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u0004J-\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J!\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00066"}, d2 = {"Lcom/harman/jbl/partybox/ui/group/IdentityDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lkotlin/H0;", "t0", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "onDismiss", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/harman/jbl/partybox/databinding/x;", "k1", "Lcom/harman/jbl/partybox/databinding/x;", "binding", "Landroid/graphics/drawable/BitmapDrawable;", "l1", "Landroid/graphics/drawable/BitmapDrawable;", "backgroundImage", "Lcom/harman/jbl/partybox/ui/group/l;", "m1", "Lkotlin/A;", "v0", "()Lcom/harman/jbl/partybox/ui/group/l;", "viewModel", "Lcom/harman/jbl/partybox/ui/main/o;", "n1", "u0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "", "o1", "I", IdentityDialogFragment.f43724p1, "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nIdentityDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityDialogFragment.kt\ncom/harman/jbl/partybox/ui/group/IdentityDialogFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,150:1\n56#2,10:151\n66#3,4:161\n1#4:165\n*S KotlinDebug\n*F\n+ 1 IdentityDialogFragment.kt\ncom/harman/jbl/partybox/ui/group/IdentityDialogFragment\n*L\n33#1:151,10\n35#1:161,4\n*E\n"})
/* loaded from: classes2.dex */
public final class IdentityDialogFragment extends DialogFragment {

    @l3.d
    public static final a Companion = new a(null);

    @l3.d
    public static final String TAG = "IdentityDialogFragment";

    /* renamed from: p1, reason: collision with root package name */
    @l3.d
    private static final String f43724p1 = "currentIndex";

    /* renamed from: k1, reason: collision with root package name */
    @l3.e
    private C1955x f43725k1;

    /* renamed from: l1, reason: collision with root package name */
    private BitmapDrawable f43726l1;

    /* renamed from: m1, reason: collision with root package name */
    @l3.d
    private final A f43727m1;

    /* renamed from: n1, reason: collision with root package name */
    @l3.d
    private final A f43728n1;

    /* renamed from: o1, reason: collision with root package name */
    private int f43729o1;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @n
        @l3.d
        public final IdentityDialogFragment a(int i4) {
            IdentityDialogFragment identityDialogFragment = new IdentityDialogFragment();
            identityDialogFragment.setArguments(C0741d.b(C2122h0.a(IdentityDialogFragment.f43724p1, Integer.valueOf(i4))));
            return identityDialogFragment;
        }

        private a() {
        }
    }

    public IdentityDialogFragment() {
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.group.IdentityDialogFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Fragment n() {
                return Fragment.this;
            }
        };
        this.f43727m1 = FragmentViewModelLazyKt.c(this, N.d(l.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.group.IdentityDialogFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final p0 n() {
                p0 viewModelStore = ((q0) X2.a.this.n()).getViewModelStore();
                F.o(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.group.IdentityDialogFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final m0.b n() {
                InterfaceC0919v interfaceC0919v;
                Object n4 = X2.a.this.n();
                m0.b bVar = null;
                if (n4 instanceof InterfaceC0919v) {
                    interfaceC0919v = (InterfaceC0919v) n4;
                } else {
                    interfaceC0919v = null;
                }
                if (interfaceC0919v != null) {
                    bVar = interfaceC0919v.getDefaultViewModelProviderFactory();
                }
                if (bVar == null) {
                    bVar = this.getDefaultViewModelProviderFactory();
                }
                F.o(bVar, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return bVar;
            }
        });
        this.f43728n1 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
    }

    @n
    @l3.d
    public static final IdentityDialogFragment newInstance(int i4) {
        return Companion.a(i4);
    }

    private final void t0() {
        ConstraintLayout constraintLayout;
        C1955x c1955x = this.f43725k1;
        ImageView imageView = null;
        if (c1955x != null) {
            constraintLayout = c1955x.f40292G;
        } else {
            constraintLayout = null;
        }
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        C1955x c1955x2 = this.f43725k1;
        if (c1955x2 != null) {
            imageView = c1955x2.f40294I;
        }
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        dismiss();
    }

    private final o u0() {
        return (o) this.f43728n1.getValue();
    }

    private final l v0() {
        return (l) this.f43727m1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(IdentityDialogFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(IdentityDialogFragment this$0) {
        ImageView imageView;
        ConstraintLayout constraintLayout;
        F.p(this$0, "this$0");
        C1955x c1955x = this$0.f43725k1;
        BitmapDrawable bitmapDrawable = null;
        if (c1955x != null) {
            imageView = c1955x.f40294I;
        } else {
            imageView = null;
        }
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        C1955x c1955x2 = this$0.f43725k1;
        if (c1955x2 != null) {
            constraintLayout = c1955x2.f40292G;
        } else {
            constraintLayout = null;
        }
        if (constraintLayout != null) {
            BitmapDrawable bitmapDrawable2 = this$0.f43726l1;
            if (bitmapDrawable2 == null) {
                F.S("backgroundImage");
            } else {
                bitmapDrawable = bitmapDrawable2;
            }
            constraintLayout.setBackground(bitmapDrawable);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@l3.d DialogInterface dialog) {
        F.p(dialog, "dialog");
        super.onCancel(dialog);
        com.harman.log.f.a(TAG, "onCancel");
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

    /* JADX WARN: Removed duplicated region for block: B:25:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0172  */
    @Override // androidx.fragment.app.Fragment
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onCreateView(@l3.d android.view.LayoutInflater r11, @l3.e android.view.ViewGroup r12, @l3.e android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.group.IdentityDialogFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@l3.d DialogInterface dialog) {
        F.p(dialog, "dialog");
        super.onDismiss(dialog);
        com.harman.log.f.a(TAG, "onDismiss");
        HmDevice k12 = u0().k1();
        if (k12 != null) {
            l v02 = v0();
            EnumIdentifyDevice enumIdentifyDevice = EnumIdentifyDevice.NORMAL;
            v02.W(k12, enumIdentifyDevice, enumIdentifyDevice);
        }
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
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.harman.jbl.partybox.ui.group.b
            @Override // java.lang.Runnable
            public final void run() {
                IdentityDialogFragment.x0(IdentityDialogFragment.this);
            }
        }, 200L);
    }
}
