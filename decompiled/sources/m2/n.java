package m2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.harman.jbl.cd_biz_comm.widget.DonutProgress;
import com.harman.jbl.partylight.lib.g;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class n implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final ConstraintLayout f55168E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final ConstraintLayout f55169F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final CircularProgressIndicator f55170G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final C2360A f55171H;

    /* renamed from: I, reason: collision with root package name */
    @N
    public final ImageView f55172I;

    /* renamed from: J, reason: collision with root package name */
    @N
    public final LinearLayout f55173J;

    /* renamed from: K, reason: collision with root package name */
    @N
    public final DonutProgress f55174K;

    /* renamed from: L, reason: collision with root package name */
    @N
    public final TextView f55175L;

    /* renamed from: M, reason: collision with root package name */
    @N
    public final TextView f55176M;

    /* renamed from: N, reason: collision with root package name */
    @N
    public final TextView f55177N;

    private n(@N ConstraintLayout constraintLayout, @N ConstraintLayout constraintLayout2, @N CircularProgressIndicator circularProgressIndicator, @N C2360A c2360a, @N ImageView imageView, @N LinearLayout linearLayout, @N DonutProgress donutProgress, @N TextView textView, @N TextView textView2, @N TextView textView3) {
        this.f55168E = constraintLayout;
        this.f55169F = constraintLayout2;
        this.f55170G = circularProgressIndicator;
        this.f55171H = c2360a;
        this.f55172I = imageView;
        this.f55173J = linearLayout;
        this.f55174K = donutProgress;
        this.f55175L = textView;
        this.f55176M = textView2;
        this.f55177N = textView3;
    }

    @N
    public static n a(@N View view) {
        View a4;
        int i4 = g.C0418g.f46825D;
        ConstraintLayout constraintLayout = (ConstraintLayout) C2067c.a(view, i4);
        if (constraintLayout != null) {
            i4 = g.C0418g.f46840I;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C2067c.a(view, i4);
            if (circularProgressIndicator != null && (a4 = C2067c.a(view, (i4 = g.C0418g.f46891Z))) != null) {
                C2360A a5 = C2360A.a(a4);
                i4 = g.C0418g.f46927i0;
                ImageView imageView = (ImageView) C2067c.a(view, i4);
                if (imageView != null) {
                    i4 = g.C0418g.f46832F0;
                    LinearLayout linearLayout = (LinearLayout) C2067c.a(view, i4);
                    if (linearLayout != null) {
                        i4 = g.C0418g.f46865Q0;
                        DonutProgress donutProgress = (DonutProgress) C2067c.a(view, i4);
                        if (donutProgress != null) {
                            i4 = g.C0418g.f46990z1;
                            TextView textView = (TextView) C2067c.a(view, i4);
                            if (textView != null) {
                                i4 = g.C0418g.f46821B1;
                                TextView textView2 = (TextView) C2067c.a(view, i4);
                                if (textView2 != null) {
                                    i4 = g.C0418g.f46854M1;
                                    TextView textView3 = (TextView) C2067c.a(view, i4);
                                    if (textView3 != null) {
                                        return new n((ConstraintLayout) view, constraintLayout, circularProgressIndicator, a5, imageView, linearLayout, donutProgress, textView, textView2, textView3);
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
    public static n c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static n e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(g.h.f47014n, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f55168E;
    }
}
