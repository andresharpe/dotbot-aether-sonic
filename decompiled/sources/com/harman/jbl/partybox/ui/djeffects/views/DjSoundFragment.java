package com.harman.jbl.partybox.ui.djeffects.views;

import W2.n;
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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.navigation.fragment.f;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.c;
import com.google.android.gms.common.internal.C;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.C1862e0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.djeffects.adapter.b;
import com.harman.jbl.partybox.ui.djeffects.model.DjEffectToneId;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.sdk.device.HmDevice;
import kotlin.A;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.U;
import l3.d;
import l3.e;

@E(d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\b*\u0001:\u0018\u0000 ?2\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b>\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J-\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u0015\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006A"}, d2 = {"Lcom/harman/jbl/partybox/ui/djeffects/views/DjSoundFragment;", "Landroidx/fragment/app/DialogFragment;", "Lkotlin/H0;", "initView", "()V", "x0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lcom/harman/jbl/partybox/ui/djeffects/adapter/d;", C.a.f28602a, "setListener", "(Lcom/harman/jbl/partybox/ui/djeffects/adapter/d;)V", "Lcom/harman/jbl/partybox/databinding/e0;", "k1", "Lcom/harman/jbl/partybox/databinding/e0;", "binding", "Landroid/graphics/drawable/BitmapDrawable;", "l1", "Landroid/graphics/drawable/BitmapDrawable;", "backgroundImage", "m1", "Lcom/harman/jbl/partybox/ui/djeffects/adapter/d;", "Lcom/harman/jbl/partybox/ui/djeffects/adapter/b;", "n1", "Lcom/harman/jbl/partybox/ui/djeffects/adapter/b;", "mAdapter", "", "o1", "I", "gridSpace", "Lcom/harman/jbl/partybox/ui/djeffects/viewmodel/a;", "p1", "Lkotlin/A;", "u0", "()Lcom/harman/jbl/partybox/ui/djeffects/viewmodel/a;", "viewModel", "Lcom/harman/jbl/partybox/ui/main/o;", "q1", "t0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "com/harman/jbl/partybox/ui/djeffects/views/DjSoundFragment$b", "r1", "Lcom/harman/jbl/partybox/ui/djeffects/views/DjSoundFragment$b;", "adapterCallback", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nDjSoundFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DjSoundFragment.kt\ncom/harman/jbl/partybox/ui/djeffects/views/DjSoundFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n56#2,10:148\n66#3,4:158\n1#4:162\n*S KotlinDebug\n*F\n+ 1 DjSoundFragment.kt\ncom/harman/jbl/partybox/ui/djeffects/views/DjSoundFragment\n*L\n40#1:148,10\n41#1:158,4\n*E\n"})
/* loaded from: classes2.dex */
public final class DjSoundFragment extends DialogFragment {

    @d
    public static final a Companion = new a(null);

    @d
    public static final String TAG = "DjSoundFragment";

    /* renamed from: k1, reason: collision with root package name */
    @e
    private C1862e0 f43403k1;

    /* renamed from: l1, reason: collision with root package name */
    private BitmapDrawable f43404l1;

    /* renamed from: m1, reason: collision with root package name */
    @e
    private com.harman.jbl.partybox.ui.djeffects.adapter.d f43405m1;

    /* renamed from: n1, reason: collision with root package name */
    @e
    private com.harman.jbl.partybox.ui.djeffects.adapter.b f43406n1;

    /* renamed from: o1, reason: collision with root package name */
    private int f43407o1 = 40;

    /* renamed from: p1, reason: collision with root package name */
    @d
    private final A f43408p1;

    /* renamed from: q1, reason: collision with root package name */
    @d
    private final A f43409q1;

    /* renamed from: r1, reason: collision with root package name */
    @d
    private final b f43410r1;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @n
        @d
        public final DjSoundFragment a() {
            return new DjSoundFragment();
        }

        private a() {
        }
    }

    @U({"SMAP\nDjSoundFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DjSoundFragment.kt\ncom/harman/jbl/partybox/ui/djeffects/views/DjSoundFragment$adapterCallback$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class b implements b.InterfaceC0373b {
        b() {
        }

        @Override // com.harman.jbl.partybox.ui.djeffects.adapter.b.InterfaceC0373b
        public void a(@d DjEffectToneId tone) {
            F.p(tone, "tone");
            HmDevice k12 = DjSoundFragment.this.t0().k1();
            if (k12 != null) {
                DjSoundFragment.this.u0().g0(tone.g(), k12);
            }
        }
    }

    public DjSoundFragment() {
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.djeffects.views.DjSoundFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // X2.a
            @d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Fragment n() {
                return Fragment.this;
            }
        };
        this.f43408p1 = FragmentViewModelLazyKt.c(this, N.d(com.harman.jbl.partybox.ui.djeffects.viewmodel.a.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.djeffects.views.DjSoundFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // X2.a
            @d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final p0 n() {
                p0 viewModelStore = ((q0) X2.a.this.n()).getViewModelStore();
                F.o(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.djeffects.views.DjSoundFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // X2.a
            @d
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
        this.f43409q1 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        this.f43410r1 = new b();
    }

    private final void initView() {
        ImageView imageView;
        C1862e0 c1862e0 = this.f43403k1;
        if (c1862e0 != null && (imageView = c1862e0.f39509J) != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.djeffects.views.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DjSoundFragment.v0(DjSoundFragment.this, view);
                }
            });
        }
    }

    @n
    @d
    public static final DjSoundFragment newInstance() {
        return Companion.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o t0() {
        return (o) this.f43409q1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.harman.jbl.partybox.ui.djeffects.viewmodel.a u0() {
        return (com.harman.jbl.partybox.ui.djeffects.viewmodel.a) this.f43408p1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(DjSoundFragment this$0, View view) {
        F.p(this$0, "this$0");
        C1862e0 c1862e0 = this$0.f43403k1;
        if (c1862e0 != null) {
            c1862e0.f39505F.setVisibility(8);
            c1862e0.f39510K.setVisibility(8);
        }
        f.a(this$0).r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(DjSoundFragment this$0) {
        ImageView imageView;
        ConstraintLayout constraintLayout;
        F.p(this$0, "this$0");
        C1862e0 c1862e0 = this$0.f43403k1;
        BitmapDrawable bitmapDrawable = null;
        if (c1862e0 != null) {
            imageView = c1862e0.f39510K;
        } else {
            imageView = null;
        }
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        C1862e0 c1862e02 = this$0.f43403k1;
        if (c1862e02 != null) {
            constraintLayout = c1862e02.f39505F;
        } else {
            constraintLayout = null;
        }
        if (constraintLayout != null) {
            BitmapDrawable bitmapDrawable2 = this$0.f43404l1;
            if (bitmapDrawable2 == null) {
                F.S("backgroundImage");
            } else {
                bitmapDrawable = bitmapDrawable2;
            }
            constraintLayout.setBackground(bitmapDrawable);
        }
    }

    private final void x0() {
        RecyclerView recyclerView;
        this.f43406n1 = new com.harman.jbl.partybox.ui.djeffects.adapter.b(new com.harman.jbl.partybox.ui.djeffects.adapter.e().a(), this.f43410r1);
        C1862e0 c1862e0 = this.f43403k1;
        if (c1862e0 != null && (recyclerView = c1862e0.f39507H) != null) {
            recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
            recyclerView.setAdapter(this.f43406n1);
            recyclerView.n(new com.harman.jbl.partybox.ui.djeffects.adapter.c(this.f43407o1));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@e Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, j.n.f41884f);
    }

    @Override // androidx.fragment.app.DialogFragment
    @d
    public Dialog onCreateDialog(@e Bundle bundle) {
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
    @e
    public View onCreateView(@d LayoutInflater inflater, @e ViewGroup viewGroup, @e Bundle bundle) {
        Resources resources;
        F.p(inflater, "inflater");
        this.f43403k1 = C1862e0.c(inflater);
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            resources = activity.getResources();
        } else {
            resources = null;
        }
        this.f43404l1 = new BitmapDrawable(resources, com.harman.jbl.partybox.utils.d.f46171a.b(getActivity()));
        initView();
        C1862e0 c1862e0 = this.f43403k1;
        if (c1862e0 == null) {
            return null;
        }
        return c1862e0.d();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f43403k1 = null;
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
    public void onViewCreated(@d View view, @e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.harman.jbl.partybox.ui.djeffects.views.a
            @Override // java.lang.Runnable
            public final void run() {
                DjSoundFragment.w0(DjSoundFragment.this);
            }
        }, 200L);
        this.f43407o1 = (int) (com.harman.jbl.partybox.utils.n.c(getActivity()).widthPixels * 0.05d);
        x0();
    }

    public final void setListener(@d com.harman.jbl.partybox.ui.djeffects.adapter.d listener) {
        F.p(listener, "listener");
        this.f43405m1 = listener;
    }
}
