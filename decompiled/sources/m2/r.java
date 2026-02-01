package m2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.harman.jbl.partylight.lib.g;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class r implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final ConstraintLayout f55219E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final TextView f55220F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final C2360A f55221G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final LottieAnimationView f55222H;

    /* renamed from: I, reason: collision with root package name */
    @N
    public final TextView f55223I;

    private r(@N ConstraintLayout constraintLayout, @N TextView textView, @N C2360A c2360a, @N LottieAnimationView lottieAnimationView, @N TextView textView2) {
        this.f55219E = constraintLayout;
        this.f55220F = textView;
        this.f55221G = c2360a;
        this.f55222H = lottieAnimationView;
        this.f55223I = textView2;
    }

    @N
    public static r a(@N View view) {
        View a4;
        int i4 = g.C0418g.f46976v;
        TextView textView = (TextView) C2067c.a(view, i4);
        if (textView != null && (a4 = C2067c.a(view, (i4 = g.C0418g.f46891Z))) != null) {
            C2360A a5 = C2360A.a(a4);
            i4 = g.C0418g.f46911e0;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) C2067c.a(view, i4);
            if (lottieAnimationView != null) {
                i4 = g.C0418g.f46937k2;
                TextView textView2 = (TextView) C2067c.a(view, i4);
                if (textView2 != null) {
                    return new r((ConstraintLayout) view, textView, a5, lottieAnimationView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static r c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static r e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(g.h.f47018r, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f55219E;
    }
}
