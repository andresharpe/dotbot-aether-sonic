package com.harman.jbl.partybox.ui.colorpicker;

import W2.n;
import X2.l;
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
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0669d;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.Q;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.X;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.utils.Color;
import com.harman.sdk.utils.ColorMode;
import kotlin.A;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.Pair;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.U;

@E(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 92\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b8\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J-\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00132\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u0004R\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106¨\u0006;"}, d2 = {"Lcom/harman/jbl/partybox/ui/colorpicker/ColorPickerFragment;", "Landroidx/fragment/app/DialogFragment;", "Lkotlin/H0;", "initView", "()V", "z0", "Lcom/harman/sdk/utils/Color;", v.b.f7402d, "v0", "(Lcom/harman/sdk/utils/Color;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lcom/harman/jbl/partybox/ui/main/o;", "k1", "Lkotlin/A;", "x0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/ui/colorpicker/e;", "l1", "y0", "()Lcom/harman/jbl/partybox/ui/colorpicker/e;", "viewModel", "", "m1", "J", "delayTime", "Landroid/os/Handler;", "n1", "Landroid/os/Handler;", "colorPickingDelayHandler", "Lcom/harman/jbl/partybox/databinding/X;", "o1", "Lcom/harman/jbl/partybox/databinding/X;", "binding", "Landroid/graphics/drawable/BitmapDrawable;", "p1", "Landroid/graphics/drawable/BitmapDrawable;", "backgroundImage", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nColorPickerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorPickerFragment.kt\ncom/harman/jbl/partybox/ui/colorpicker/ColorPickerFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n66#2,4:160\n56#3,10:164\n1#4:174\n*S KotlinDebug\n*F\n+ 1 ColorPickerFragment.kt\ncom/harman/jbl/partybox/ui/colorpicker/ColorPickerFragment\n*L\n25#1:160,4\n26#1:164,10\n*E\n"})
/* loaded from: classes2.dex */
public final class ColorPickerFragment extends DialogFragment {

    @l3.d
    public static final a Companion = new a(null);

    @l3.d
    public static final String TAG = "ColorPickerFragment";

    /* renamed from: k1, reason: collision with root package name */
    @l3.d
    private final A f42276k1 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));

    /* renamed from: l1, reason: collision with root package name */
    @l3.d
    private final A f42277l1;

    /* renamed from: m1, reason: collision with root package name */
    private final long f42278m1;

    /* renamed from: n1, reason: collision with root package name */
    @l3.e
    private Handler f42279n1;

    /* renamed from: o1, reason: collision with root package name */
    @l3.e
    private X f42280o1;

    /* renamed from: p1, reason: collision with root package name */
    private BitmapDrawable f42281p1;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @n
        @l3.d
        public final ColorPickerFragment a() {
            return new ColorPickerFragment();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements l<Pair<? extends Color, ? extends ColorMode>, H0> {
        b() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Pair<? extends Color, ? extends ColorMode> pair) {
            c(pair);
            return H0.f51801a;
        }

        public final void c(Pair<Color, ? extends ColorMode> pair) {
            Color a4 = pair.a();
            ColorMode b4 = pair.b();
            X x3 = ColorPickerFragment.this.f42280o1;
            if (x3 != null) {
                if (b4 == ColorMode.COLOR_LOOP) {
                    x3.f39191H.m();
                    x3.f39190G.setChecked(true);
                } else {
                    x3.f39191H.setColor(a4);
                    x3.f39190G.setChecked(false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements l<Color, H0> {

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ X f42288G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(X x3) {
            super(1);
            this.f42288G = x3;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Color color) {
            c(color);
            return H0.f51801a;
        }

        public final void c(@l3.d Color updatedColor) {
            CheckBox checkBox;
            F.p(updatedColor, "updatedColor");
            ColorPickerFragment.this.v0(updatedColor);
            this.f42288G.f39191H.setColor(updatedColor);
            X x3 = ColorPickerFragment.this.f42280o1;
            if (x3 != null) {
                checkBox = x3.f39190G;
            } else {
                checkBox = null;
            }
            if (checkBox != null) {
                checkBox.setChecked(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class d implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f42289a;

        d(l function) {
            F.p(function, "function");
            this.f42289a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f42289a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f42289a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public ColorPickerFragment() {
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.colorpicker.ColorPickerFragment$special$$inlined$viewModels$default$1
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
        this.f42277l1 = FragmentViewModelLazyKt.c(this, N.d(e.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.colorpicker.ColorPickerFragment$special$$inlined$viewModels$default$2
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
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.colorpicker.ColorPickerFragment$special$$inlined$viewModels$default$3
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
        this.f42278m1 = 300L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A0(ColorPickerFragment this$0, View view) {
        F.p(this$0, "this$0");
        X x3 = this$0.f42280o1;
        if (x3 != null) {
            x3.f39193J.setVisibility(8);
            x3.f39195L.setVisibility(8);
        }
        this$0.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B0(X this_run, ColorPickerFragment this$0, CompoundButton compoundButton, boolean z3) {
        F.p(this_run, "$this_run");
        F.p(this$0, "this$0");
        if (z3) {
            this_run.f39191H.m();
            this$0.y0().C(this$0.x0().k1());
            this$0.x0().b3(this$0.y0().v(), ColorMode.COLOR_LOOP);
        } else if (compoundButton.isPressed()) {
            this_run.f39191H.setColor(this$0.y0().v());
            this$0.v0(this$0.y0().v());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C0(ColorPickerFragment this$0) {
        ImageView imageView;
        ConstraintLayout constraintLayout;
        F.p(this$0, "this$0");
        X x3 = this$0.f42280o1;
        BitmapDrawable bitmapDrawable = null;
        if (x3 != null) {
            imageView = x3.f39195L;
        } else {
            imageView = null;
        }
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        X x4 = this$0.f42280o1;
        if (x4 != null) {
            constraintLayout = x4.f39193J;
        } else {
            constraintLayout = null;
        }
        if (constraintLayout != null) {
            BitmapDrawable bitmapDrawable2 = this$0.f42281p1;
            if (bitmapDrawable2 == null) {
                F.S("backgroundImage");
            } else {
                bitmapDrawable = bitmapDrawable2;
            }
            constraintLayout.setBackground(bitmapDrawable);
        }
    }

    private final void initView() {
        final X x3 = this.f42280o1;
        if (x3 != null) {
            x3.f39194K.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.colorpicker.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ColorPickerFragment.A0(ColorPickerFragment.this, view);
                }
            });
            x3.f39190G.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.harman.jbl.partybox.ui.colorpicker.c
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                    ColorPickerFragment.B0(X.this, this, compoundButton, z3);
                }
            });
            x3.f39191H.setListener(new c(x3));
        }
    }

    @n
    @l3.d
    public static final ColorPickerFragment newInstance() {
        return Companion.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(final Color color) {
        if (this.f42279n1 == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            this.f42279n1 = handler;
            handler.postDelayed(new Runnable() { // from class: com.harman.jbl.partybox.ui.colorpicker.a
                @Override // java.lang.Runnable
                public final void run() {
                    ColorPickerFragment.w0(ColorPickerFragment.this, color);
                }
            }, this.f42278m1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(ColorPickerFragment this$0, Color color) {
        F.p(this$0, "this$0");
        F.p(color, "$color");
        this$0.y0().A(this$0.x0().k1(), color);
        this$0.x0().b3(color, ColorMode.STATIC_COLOR);
        this$0.f42279n1 = null;
    }

    private final o x0() {
        return (o) this.f42276k1.getValue();
    }

    private final e y0() {
        return (e) this.f42277l1.getValue();
    }

    private final void z0() {
        y0().w().k(getViewLifecycleOwner(), new d(new b()));
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
        this.f42280o1 = X.c(inflater);
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            resources = activity.getResources();
        } else {
            resources = null;
        }
        this.f42281p1 = new BitmapDrawable(resources, com.harman.jbl.partybox.utils.d.f46171a.b(getActivity()));
        X x3 = this.f42280o1;
        if (x3 == null) {
            return null;
        }
        return x3.d();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f42280o1 = null;
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
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.harman.jbl.partybox.ui.colorpicker.d
            @Override // java.lang.Runnable
            public final void run() {
                ColorPickerFragment.C0(ColorPickerFragment.this);
            }
        }, 200L);
        initView();
        z0();
        HmDevice k12 = x0().k1();
        if (k12 != null) {
            y0().y(k12);
        }
    }
}
