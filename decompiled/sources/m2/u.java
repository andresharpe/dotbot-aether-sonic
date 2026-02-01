package m2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.harman.jbl.partylight.lib.g;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class u implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final ConstraintLayout f55236E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final LinearLayout f55237F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final TextView f55238G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final TextView f55239H;

    /* renamed from: I, reason: collision with root package name */
    @N
    public final Group f55240I;

    /* renamed from: J, reason: collision with root package name */
    @N
    public final C2360A f55241J;

    /* renamed from: K, reason: collision with root package name */
    @N
    public final LottieAnimationView f55242K;

    /* renamed from: L, reason: collision with root package name */
    @N
    public final CircularProgressIndicator f55243L;

    /* renamed from: M, reason: collision with root package name */
    @N
    public final AppCompatTextView f55244M;

    private u(@N ConstraintLayout constraintLayout, @N LinearLayout linearLayout, @N TextView textView, @N TextView textView2, @N Group group, @N C2360A c2360a, @N LottieAnimationView lottieAnimationView, @N CircularProgressIndicator circularProgressIndicator, @N AppCompatTextView appCompatTextView) {
        this.f55236E = constraintLayout;
        this.f55237F = linearLayout;
        this.f55238G = textView;
        this.f55239H = textView2;
        this.f55240I = group;
        this.f55241J = c2360a;
        this.f55242K = lottieAnimationView;
        this.f55243L = circularProgressIndicator;
        this.f55244M = appCompatTextView;
    }

    @N
    public static u a(@N View view) {
        View a4;
        int i4 = g.C0418g.f46962r;
        LinearLayout linearLayout = (LinearLayout) C2067c.a(view, i4);
        if (linearLayout != null) {
            i4 = g.C0418g.f46973u;
            TextView textView = (TextView) C2067c.a(view, i4);
            if (textView != null) {
                i4 = g.C0418g.f46979w;
                TextView textView2 = (TextView) C2067c.a(view, i4);
                if (textView2 != null) {
                    i4 = g.C0418g.f46882W;
                    Group group = (Group) C2067c.a(view, i4);
                    if (group != null && (a4 = C2067c.a(view, (i4 = g.C0418g.f46891Z))) != null) {
                        C2360A a5 = C2360A.a(a4);
                        i4 = g.C0418g.f46911e0;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) C2067c.a(view, i4);
                        if (lottieAnimationView != null) {
                            i4 = g.C0418g.f46883W0;
                            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C2067c.a(view, i4);
                            if (circularProgressIndicator != null) {
                                i4 = g.C0418g.f46937k2;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) C2067c.a(view, i4);
                                if (appCompatTextView != null) {
                                    return new u((ConstraintLayout) view, linearLayout, textView, textView2, group, a5, lottieAnimationView, circularProgressIndicator, appCompatTextView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static u c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static u e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(g.h.f47021u, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f55236E;
    }
}
