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
public final class w implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final ConstraintLayout f55252E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final LottieAnimationView f55253F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final TextView f55254G;

    private w(@N ConstraintLayout constraintLayout, @N LottieAnimationView lottieAnimationView, @N TextView textView) {
        this.f55252E = constraintLayout;
        this.f55253F = lottieAnimationView;
        this.f55254G = textView;
    }

    @N
    public static w a(@N View view) {
        int i4 = g.C0418g.f46859O0;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C2067c.a(view, i4);
        if (lottieAnimationView != null) {
            i4 = g.C0418g.f46862P0;
            TextView textView = (TextView) C2067c.a(view, i4);
            if (textView != null) {
                return new w((ConstraintLayout) view, lottieAnimationView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static w c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static w e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(g.h.f47023w, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f55252E;
    }
}
