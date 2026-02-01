package com.xiaoming.party.auracast.dialog;

import J2.a;
import android.R;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.os.C0741d;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.Fragment;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.C2122h0;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.e;

@E(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/xiaoming/party/auracast/dialog/AuracastPagerFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/H0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "<init>", "()V", "Companion", "a", "party_auracast_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AuracastPagerFragment extends Fragment {

    @l3.d
    public static final a Companion = new a(null);

    /* renamed from: N0, reason: collision with root package name */
    @l3.d
    private static final String f49052N0 = "ARGS_ANIMATION";

    /* renamed from: O0, reason: collision with root package name */
    @l3.d
    private static final String f49053O0 = "ARGS_ICON";

    /* renamed from: P0, reason: collision with root package name */
    @l3.d
    private static final String f49054P0 = "ARGS_TIPS";

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final AuracastPagerFragment a(int i4, int i5, int i6) {
            AuracastPagerFragment auracastPagerFragment = new AuracastPagerFragment();
            auracastPagerFragment.setArguments(C0741d.b(C2122h0.a(AuracastPagerFragment.f49052N0, Integer.valueOf(i4)), C2122h0.a(AuracastPagerFragment.f49053O0, Integer.valueOf(i5)), C2122h0.a(AuracastPagerFragment.f49054P0, Integer.valueOf(i6))));
            return auracastPagerFragment;
        }

        private a() {
        }
    }

    public AuracastPagerFragment() {
        super(a.f.f1326j);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @e Bundle bundle) {
        Integer num;
        Integer num2;
        Window window;
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        Integer num3 = null;
        if (arguments != null) {
            num = Integer.valueOf(arguments.getInt(f49052N0, -1));
        } else {
            num = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            num2 = Integer.valueOf(arguments2.getInt(f49053O0, -1));
        } else {
            num2 = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            num3 = Integer.valueOf(arguments3.getInt(f49054P0, -1));
        }
        if (num != null) {
            int intValue = num.intValue();
            LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(a.e.f1309s);
            if (lottieAnimationView != null) {
                lottieAnimationView.setImageResource(intValue);
            }
        }
        if (num2 != null) {
            int intValue2 = num2.intValue();
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(a.e.f1305o);
            if (appCompatImageView != null) {
                appCompatImageView.setImageResource(intValue2);
            }
        }
        if (num3 != null) {
            int intValue3 = num3.intValue();
            TextView textView = (TextView) view.findViewById(a.e.f1290C);
            if (textView != null) {
                textView.setText(getString(intValue3));
            }
        }
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            int color = activity.getColor(R.color.black);
            ActivityC0889g activity2 = getActivity();
            if (activity2 != null && (window = activity2.getWindow()) != null) {
                window.setStatusBarColor(color);
            }
        }
    }
}
