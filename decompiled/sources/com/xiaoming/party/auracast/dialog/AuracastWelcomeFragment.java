package com.xiaoming.party.auracast.dialog;

import J2.a;
import K2.k;
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
import androidx.viewpager2.widget.ViewPager2;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.E;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import l3.e;

@E(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b,\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0004J-\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00142\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006/"}, d2 = {"Lcom/xiaoming/party/auracast/dialog/AuracastWelcomeFragment;", "Landroidx/fragment/app/DialogFragment;", "Lkotlin/H0;", "w0", "()V", "y0", "v0", "", FirebaseAnalytics.b.f34777X, "u0", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "Lcom/xiaoming/party/auracast/dialog/d;", "k1", "Ljava/util/List;", "getSlides", "()Ljava/util/List;", "slides", "LK2/k;", "l1", "LK2/k;", "binding", "Landroid/graphics/drawable/BitmapDrawable;", "m1", "Landroid/graphics/drawable/BitmapDrawable;", "backgroundImage", "<init>", "Companion", "a", "party_auracast_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nAuracastWelcomeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuracastWelcomeFragment.kt\ncom/xiaoming/party/auracast/dialog/AuracastWelcomeFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,223:1\n1#2:224\n*E\n"})
/* loaded from: classes2.dex */
public final class AuracastWelcomeFragment extends DialogFragment {

    @l3.d
    public static final a Companion = new a(null);
    public static final long POPUP_SHOW_DELAY = 200;

    @l3.d
    public static final String TAG = "AuracastWelcomeFragment";

    /* renamed from: k1, reason: collision with root package name */
    @l3.d
    private final List<d> f49055k1;

    /* renamed from: l1, reason: collision with root package name */
    @e
    private k f49056l1;

    /* renamed from: m1, reason: collision with root package name */
    private BitmapDrawable f49057m1;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @n
        @l3.d
        public final AuracastWelcomeFragment a() {
            return new AuracastWelcomeFragment();
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
            AuracastWelcomeFragment.this.u0(i4);
        }
    }

    public AuracastWelcomeFragment() {
        List<d> O3;
        O3 = CollectionsKt__CollectionsKt.O(new d(a.g.f1333d, a.c.f1267h, a.i.f1380l), new d(a.g.f1334e, a.c.f1268i, a.i.f1381m));
        this.f49055k1 = O3;
    }

    @n
    @l3.d
    public static final AuracastWelcomeFragment newInstance() {
        return Companion.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(AuracastWelcomeFragment this$0) {
        ImageView imageView;
        FrameLayout frameLayout;
        F.p(this$0, "this$0");
        k kVar = this$0.f49056l1;
        BitmapDrawable bitmapDrawable = null;
        if (kVar != null) {
            imageView = kVar.f1441H;
        } else {
            imageView = null;
        }
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        k kVar2 = this$0.f49056l1;
        if (kVar2 != null) {
            frameLayout = kVar2.f1440G;
        } else {
            frameLayout = null;
        }
        if (frameLayout != null) {
            BitmapDrawable bitmapDrawable2 = this$0.f49057m1;
            if (bitmapDrawable2 == null) {
                F.S("backgroundImage");
            } else {
                bitmapDrawable = bitmapDrawable2;
            }
            frameLayout.setBackground(bitmapDrawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u0(int i4) {
        Integer num;
        View view;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        k kVar = this.f49056l1;
        if (kVar != null && (linearLayout2 = kVar.f1442I) != null) {
            num = Integer.valueOf(linearLayout2.getChildCount());
        } else {
            num = null;
        }
        if (num != null) {
            int intValue = num.intValue();
            for (int i5 = 0; i5 < intValue; i5++) {
                k kVar2 = this.f49056l1;
                if (kVar2 != null && (linearLayout = kVar2.f1442I) != null) {
                    view = linearLayout.getChildAt(i5);
                } else {
                    view = null;
                }
                F.n(view, "null cannot be cast to non-null type android.widget.ImageView");
                ImageView imageView = (ImageView) view;
                if (i5 == i4) {
                    imageView.setImageDrawable(C0669d.i(requireContext(), a.c.f1279t));
                } else {
                    imageView.setImageDrawable(C0669d.i(requireContext(), a.c.f1280u));
                }
            }
        }
    }

    private final void v0() {
        LinearLayout linearLayout;
        int size = this.f49055k1.size();
        View[] viewArr = new ImageView[size];
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(8, 0, 8, 0);
        for (int i4 = 0; i4 < size; i4++) {
            ImageView imageView = new ImageView(requireContext());
            viewArr[i4] = imageView;
            imageView.setImageDrawable(C0669d.i(requireContext(), a.c.f1280u));
            View view = viewArr[i4];
            if (view != null) {
                view.setLayoutParams(layoutParams);
            }
            k kVar = this.f49056l1;
            if (kVar != null && (linearLayout = kVar.f1442I) != null) {
                linearLayout.addView(viewArr[i4]);
            }
        }
    }

    private final void w0() {
        k kVar = this.f49056l1;
        if (kVar != null) {
            kVar.f1439F.setOnClickListener(new View.OnClickListener() { // from class: com.xiaoming.party.auracast.dialog.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AuracastWelcomeFragment.x0(AuracastWelcomeFragment.this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(AuracastWelcomeFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.dismiss();
    }

    private final void y0() {
        ViewPager2 viewPager2;
        ViewPager2 viewPager22;
        ActivityC0889g activity = getActivity();
        F.n(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        c cVar = new c((ActivityC0587e) activity, this.f49055k1);
        k kVar = this.f49056l1;
        if (kVar != null) {
            viewPager2 = kVar.f1443J;
        } else {
            viewPager2 = null;
        }
        if (viewPager2 != null) {
            viewPager2.setAdapter(cVar);
        }
        k kVar2 = this.f49056l1;
        if (kVar2 != null && (viewPager22 = kVar2.f1443J) != null) {
            viewPager22.n(new b());
        }
    }

    @l3.d
    public final List<d> getSlides() {
        return this.f49055k1;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@e Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, a.j.f1395a);
    }

    @Override // androidx.fragment.app.DialogFragment
    @l3.d
    public Dialog onCreateDialog(@e Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        F.o(onCreateDialog, "onCreateDialog(...)");
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            int f4 = C0669d.f(activity, a.C0013a.f1111a);
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
        this.f49056l1 = k.c(inflater);
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            resources = activity.getResources();
        } else {
            resources = null;
        }
        this.f49057m1 = new BitmapDrawable(resources, L2.a.f1679a.a(getActivity()));
        k kVar = this.f49056l1;
        if (kVar == null) {
            return null;
        }
        return kVar.d();
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
    public void onViewCreated(@l3.d View view, @e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.xiaoming.party.auracast.dialog.b
            @Override // java.lang.Runnable
            public final void run() {
                AuracastWelcomeFragment.t0(AuracastWelcomeFragment.this);
            }
        }, 200L);
        w0();
        v0();
        u0(0);
        y0();
    }
}
