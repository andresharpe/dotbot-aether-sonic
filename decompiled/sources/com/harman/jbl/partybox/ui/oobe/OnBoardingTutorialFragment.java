package com.harman.jbl.partybox.ui.oobe;

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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.ActivityC0587e;
import androidx.core.content.C0669d;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.viewpager2.widget.ViewPager2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.harman.jbl.partybox.databinding.L0;
import com.harman.jbl.partybox.j;
import kotlin.A;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.U;

@E(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ,2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b+\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0004J-\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00142\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006."}, d2 = {"Lcom/harman/jbl/partybox/ui/oobe/OnBoardingTutorialFragment;", "Landroidx/fragment/app/DialogFragment;", "Lkotlin/H0;", "x0", "()V", "z0", "w0", "", FirebaseAnalytics.b.f34777X, "v0", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/harman/jbl/partybox/databinding/L0;", "k1", "Lcom/harman/jbl/partybox/databinding/L0;", "binding", "Landroid/graphics/drawable/BitmapDrawable;", "l1", "Landroid/graphics/drawable/BitmapDrawable;", "backgroundImage", "Lcom/harman/jbl/partybox/ui/oobe/f;", "m1", "Lkotlin/A;", "t0", "()Lcom/harman/jbl/partybox/ui/oobe/f;", "viewModel", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nOnBoardingTutorialFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBoardingTutorialFragment.kt\ncom/harman/jbl/partybox/ui/oobe/OnBoardingTutorialFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,149:1\n84#2,6:150\n1#3:156\n*S KotlinDebug\n*F\n+ 1 OnBoardingTutorialFragment.kt\ncom/harman/jbl/partybox/ui/oobe/OnBoardingTutorialFragment\n*L\n28#1:150,6\n*E\n"})
/* loaded from: classes2.dex */
public final class OnBoardingTutorialFragment extends DialogFragment {

    @l3.d
    public static final a Companion = new a(null);

    @l3.d
    public static final String TAG = "OnBoardingTutorialFragment";

    /* renamed from: k1, reason: collision with root package name */
    @l3.e
    private L0 f44382k1;

    /* renamed from: l1, reason: collision with root package name */
    private BitmapDrawable f44383l1;

    /* renamed from: m1, reason: collision with root package name */
    @l3.d
    private final A f44384m1 = FragmentViewModelLazyKt.c(this, N.d(f.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.oobe.OnBoardingTutorialFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final p0 n() {
            p0 viewModelStore = Fragment.this.requireActivity().getViewModelStore();
            F.o(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.oobe.OnBoardingTutorialFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final m0.b n() {
            m0.b defaultViewModelProviderFactory = Fragment.this.requireActivity().getDefaultViewModelProviderFactory();
            F.o(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    });

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @n
        @l3.d
        public final OnBoardingTutorialFragment a() {
            return new OnBoardingTutorialFragment();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends ViewPager2.j {
        b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void c(int i4) {
            super.c(i4);
            OnBoardingTutorialFragment.this.v0(i4);
        }
    }

    @n
    @l3.d
    public static final OnBoardingTutorialFragment newInstance() {
        return Companion.a();
    }

    private final f t0() {
        return (f) this.f44384m1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(OnBoardingTutorialFragment this$0) {
        ImageView imageView;
        FrameLayout frameLayout;
        F.p(this$0, "this$0");
        L0 l02 = this$0.f44382k1;
        BitmapDrawable bitmapDrawable = null;
        if (l02 != null) {
            imageView = l02.f38853H;
        } else {
            imageView = null;
        }
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        L0 l03 = this$0.f44382k1;
        if (l03 != null) {
            frameLayout = l03.f38851F;
        } else {
            frameLayout = null;
        }
        if (frameLayout != null) {
            BitmapDrawable bitmapDrawable2 = this$0.f44383l1;
            if (bitmapDrawable2 == null) {
                F.S("backgroundImage");
            } else {
                bitmapDrawable = bitmapDrawable2;
            }
            frameLayout.setBackground(bitmapDrawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(int i4) {
        Integer num;
        View view;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        L0 l02 = this.f44382k1;
        if (l02 != null && (linearLayout2 = l02.f38854I) != null) {
            num = Integer.valueOf(linearLayout2.getChildCount());
        } else {
            num = null;
        }
        if (num != null) {
            int intValue = num.intValue();
            for (int i5 = 0; i5 < intValue; i5++) {
                L0 l03 = this.f44382k1;
                if (l03 != null && (linearLayout = l03.f38854I) != null) {
                    view = linearLayout.getChildAt(i5);
                } else {
                    view = null;
                }
                F.n(view, "null cannot be cast to non-null type android.widget.ImageView");
                ImageView imageView = (ImageView) view;
                if (i5 == i4) {
                    imageView.setImageDrawable(C0669d.i(requireContext(), j.f.f41127y2));
                } else {
                    imageView.setImageDrawable(C0669d.i(requireContext(), j.f.f41131z2));
                }
            }
        }
    }

    private final void w0() {
        LinearLayout linearLayout;
        int x3 = t0().x();
        View[] viewArr = new ImageView[x3];
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(8, 0, 8, 0);
        for (int i4 = 0; i4 < x3; i4++) {
            ImageView imageView = new ImageView(requireContext());
            viewArr[i4] = imageView;
            imageView.setImageDrawable(C0669d.i(requireContext(), j.f.f41131z2));
            View view = viewArr[i4];
            if (view != null) {
                view.setLayoutParams(layoutParams);
            }
            L0 l02 = this.f44382k1;
            if (l02 != null && (linearLayout = l02.f38854I) != null) {
                linearLayout.addView(viewArr[i4]);
            }
        }
    }

    private final void x0() {
        L0 l02 = this.f44382k1;
        if (l02 != null) {
            l02.f38852G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.oobe.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OnBoardingTutorialFragment.y0(OnBoardingTutorialFragment.this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y0(OnBoardingTutorialFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.dismiss();
    }

    private final void z0() {
        ViewPager2 viewPager2;
        ViewPager2 viewPager22;
        ActivityC0889g activity = getActivity();
        F.n(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        com.harman.jbl.partybox.ui.oobe.a aVar = new com.harman.jbl.partybox.ui.oobe.a((ActivityC0587e) activity, t0().x());
        L0 l02 = this.f44382k1;
        if (l02 != null) {
            viewPager2 = l02.f38855J;
        } else {
            viewPager2 = null;
        }
        if (viewPager2 != null) {
            viewPager2.setAdapter(aVar);
        }
        L0 l03 = this.f44382k1;
        if (l03 != null && (viewPager22 = l03.f38855J) != null) {
            viewPager22.n(new b());
        }
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
        this.f44382k1 = L0.c(inflater);
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            resources = activity.getResources();
        } else {
            resources = null;
        }
        this.f44383l1 = new BitmapDrawable(resources, com.harman.jbl.partybox.utils.d.f46171a.b(getActivity()));
        L0 l02 = this.f44382k1;
        if (l02 == null) {
            return null;
        }
        return l02.d();
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
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.harman.jbl.partybox.ui.oobe.d
            @Override // java.lang.Runnable
            public final void run() {
                OnBoardingTutorialFragment.u0(OnBoardingTutorialFragment.this);
            }
        }, 200L);
        x0();
        w0();
        v0(0);
        z0();
    }
}
