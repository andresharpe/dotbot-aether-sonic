package com.harman.jbl.partybox.ui.toneshifter;

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
import com.harman.jbl.partybox.databinding.D;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import kotlin.A;
import kotlin.C;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.U;

@E(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 02\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b/\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0004J-\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u0004R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010-¨\u00062"}, d2 = {"Lcom/harman/jbl/partybox/ui/toneshifter/ToneShifterConfirmDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lkotlin/H0;", "x0", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "onResume", "Lcom/harman/jbl/partybox/databinding/D;", "k1", "Lcom/harman/jbl/partybox/databinding/D;", "binding", "Landroid/graphics/drawable/BitmapDrawable;", "l1", "Landroid/graphics/drawable/BitmapDrawable;", "backgroundImage", "Lcom/harman/jbl/partybox/ui/main/o;", "m1", "Lkotlin/A;", "u0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/ui/toneshifter/i;", "n1", "v0", "()Lcom/harman/jbl/partybox/ui/toneshifter/i;", "vm", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nToneShifterConfirmDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToneShifterConfirmDialogFragment.kt\ncom/harman/jbl/partybox/ui/toneshifter/ToneShifterConfirmDialogFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n66#2,4:120\n1#3:124\n*S KotlinDebug\n*F\n+ 1 ToneShifterConfirmDialogFragment.kt\ncom/harman/jbl/partybox/ui/toneshifter/ToneShifterConfirmDialogFragment\n*L\n30#1:120,4\n*E\n"})
/* loaded from: classes2.dex */
public final class ToneShifterConfirmDialogFragment extends DialogFragment {

    @l3.d
    public static final a Companion = new a(null);
    public static final long POPUP_SHOW_DELAY = 200;

    @l3.d
    public static final String TAG = "ToneShifterConfirmDialogFragment";

    /* renamed from: k1, reason: collision with root package name */
    @l3.e
    private D f45659k1;

    /* renamed from: l1, reason: collision with root package name */
    private BitmapDrawable f45660l1;

    /* renamed from: m1, reason: collision with root package name */
    @l3.d
    private final A f45661m1 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));

    /* renamed from: n1, reason: collision with root package name */
    @l3.d
    private final A f45662n1;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @n
        @l3.d
        public final ToneShifterConfirmDialogFragment a() {
            return new ToneShifterConfirmDialogFragment();
        }

        private a() {
        }
    }

    public ToneShifterConfirmDialogFragment() {
        A a4;
        a4 = C.a(new X2.a<i>() { // from class: com.harman.jbl.partybox.ui.toneshifter.ToneShifterConfirmDialogFragment$vm$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final i n() {
                o u02;
                final ToneShifterConfirmDialogFragment toneShifterConfirmDialogFragment = ToneShifterConfirmDialogFragment.this;
                final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.toneshifter.ToneShifterConfirmDialogFragment$vm$2$invoke$$inlined$viewModels$default$1
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
                i iVar = (i) FragmentViewModelLazyKt.c(toneShifterConfirmDialogFragment, N.d(i.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.toneshifter.ToneShifterConfirmDialogFragment$vm$2$invoke$$inlined$viewModels$default$2
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
                }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.toneshifter.ToneShifterConfirmDialogFragment$vm$2$invoke$$inlined$viewModels$default$3
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
                            bVar = toneShifterConfirmDialogFragment.getDefaultViewModelProviderFactory();
                        }
                        F.o(bVar, "(ownerProducer() as? Has…tViewModelProviderFactory");
                        return bVar;
                    }
                }).getValue();
                u02 = ToneShifterConfirmDialogFragment.this.u0();
                HmDevice k12 = u02.k1();
                F.n(k12, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
                iVar.A((PartyBoxDevice) k12);
                return iVar;
            }
        });
        this.f45662n1 = a4;
    }

    @n
    @l3.d
    public static final ToneShifterConfirmDialogFragment newInstance() {
        return Companion.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o u0() {
        return (o) this.f45661m1.getValue();
    }

    private final i v0() {
        return (i) this.f45662n1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(ToneShifterConfirmDialogFragment this$0) {
        ImageView imageView;
        FrameLayout frameLayout;
        F.p(this$0, "this$0");
        D d4 = this$0.f45659k1;
        BitmapDrawable bitmapDrawable = null;
        if (d4 != null) {
            imageView = d4.f38531G;
        } else {
            imageView = null;
        }
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        D d5 = this$0.f45659k1;
        if (d5 != null) {
            frameLayout = d5.f38530F;
        } else {
            frameLayout = null;
        }
        if (frameLayout != null) {
            BitmapDrawable bitmapDrawable2 = this$0.f45660l1;
            if (bitmapDrawable2 == null) {
                F.S("backgroundImage");
            } else {
                bitmapDrawable = bitmapDrawable2;
            }
            frameLayout.setBackground(bitmapDrawable);
        }
    }

    private final void x0() {
        D d4 = this.f45659k1;
        if (d4 != null) {
            d4.f38535K.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.toneshifter.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ToneShifterConfirmDialogFragment.y0(ToneShifterConfirmDialogFragment.this, view);
                }
            });
            d4.f38532H.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.toneshifter.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ToneShifterConfirmDialogFragment.z0(ToneShifterConfirmDialogFragment.this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y0(ToneShifterConfirmDialogFragment this$0, View view) {
        F.p(this$0, "this$0");
        if (!com.harman.jbl.partybox.utils.g.c(1000L)) {
            this$0.dismissAllowingStateLoss();
            this$0.v0().B(0);
            this$0.v0().u();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z0(ToneShifterConfirmDialogFragment this$0, View view) {
        F.p(this$0, "this$0");
        if (!com.harman.jbl.partybox.utils.g.c(1000L)) {
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
        this.f45659k1 = D.c(inflater);
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            resources = activity.getResources();
        } else {
            resources = null;
        }
        this.f45660l1 = new BitmapDrawable(resources, com.harman.jbl.partybox.utils.d.f46171a.b(getActivity()));
        D d4 = this.f45659k1;
        if (d4 == null) {
            return null;
        }
        return d4.d();
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
        T1.a.a("page:$90TAG onViewCreated");
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.harman.jbl.partybox.ui.toneshifter.e
            @Override // java.lang.Runnable
            public final void run() {
                ToneShifterConfirmDialogFragment.w0(ToneShifterConfirmDialogFragment.this);
            }
        }, 200L);
        x0();
    }
}
