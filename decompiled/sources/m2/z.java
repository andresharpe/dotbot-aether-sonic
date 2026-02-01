package m2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.harman.jbl.cd_biz_comm.widget.DonutProgress;
import com.harman.jbl.partylight.lib.g;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class z implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final ConstraintLayout f55259E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final Barrier f55260F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final ConstraintLayout f55261G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final CircularProgressIndicator f55262H;

    /* renamed from: I, reason: collision with root package name */
    @N
    public final ImageView f55263I;

    /* renamed from: J, reason: collision with root package name */
    @N
    public final LottieAnimationView f55264J;

    /* renamed from: K, reason: collision with root package name */
    @N
    public final DonutProgress f55265K;

    /* renamed from: L, reason: collision with root package name */
    @N
    public final TextView f55266L;

    /* renamed from: M, reason: collision with root package name */
    @N
    public final TextView f55267M;

    /* renamed from: N, reason: collision with root package name */
    @N
    public final TextView f55268N;

    /* renamed from: O, reason: collision with root package name */
    @N
    public final TextView f55269O;

    /* renamed from: P, reason: collision with root package name */
    @N
    public final TextView f55270P;

    private z(@N ConstraintLayout constraintLayout, @N Barrier barrier, @N ConstraintLayout constraintLayout2, @N CircularProgressIndicator circularProgressIndicator, @N ImageView imageView, @N LottieAnimationView lottieAnimationView, @N DonutProgress donutProgress, @N TextView textView, @N TextView textView2, @N TextView textView3, @N TextView textView4, @N TextView textView5) {
        this.f55259E = constraintLayout;
        this.f55260F = barrier;
        this.f55261G = constraintLayout2;
        this.f55262H = circularProgressIndicator;
        this.f55263I = imageView;
        this.f55264J = lottieAnimationView;
        this.f55265K = donutProgress;
        this.f55266L = textView;
        this.f55267M = textView2;
        this.f55268N = textView3;
        this.f55269O = textView4;
        this.f55270P = textView5;
    }

    @N
    public static z a(@N View view) {
        int i4 = g.C0418g.f46934k;
        Barrier barrier = (Barrier) C2067c.a(view, i4);
        if (barrier != null) {
            i4 = g.C0418g.f46825D;
            ConstraintLayout constraintLayout = (ConstraintLayout) C2067c.a(view, i4);
            if (constraintLayout != null) {
                i4 = g.C0418g.f46840I;
                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C2067c.a(view, i4);
                if (circularProgressIndicator != null) {
                    i4 = g.C0418g.f46927i0;
                    ImageView imageView = (ImageView) C2067c.a(view, i4);
                    if (imageView != null) {
                        i4 = g.C0418g.f46986y0;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) C2067c.a(view, i4);
                        if (lottieAnimationView != null) {
                            i4 = g.C0418g.f46865Q0;
                            DonutProgress donutProgress = (DonutProgress) C2067c.a(view, i4);
                            if (donutProgress != null) {
                                i4 = g.C0418g.f46821B1;
                                TextView textView = (TextView) C2067c.a(view, i4);
                                if (textView != null) {
                                    i4 = g.C0418g.f46842I1;
                                    TextView textView2 = (TextView) C2067c.a(view, i4);
                                    if (textView2 != null) {
                                        i4 = g.C0418g.f46851L1;
                                        TextView textView3 = (TextView) C2067c.a(view, i4);
                                        if (textView3 != null) {
                                            i4 = g.C0418g.f46854M1;
                                            TextView textView4 = (TextView) C2067c.a(view, i4);
                                            if (textView4 != null) {
                                                i4 = g.C0418g.f46878U1;
                                                TextView textView5 = (TextView) C2067c.a(view, i4);
                                                if (textView5 != null) {
                                                    return new z((ConstraintLayout) view, barrier, constraintLayout, circularProgressIndicator, imageView, lottieAnimationView, donutProgress, textView, textView2, textView3, textView4, textView5);
                                                }
                                            }
                                        }
                                    }
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
    public static z c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static z e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(g.h.f47026z, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f55259E;
    }
}
