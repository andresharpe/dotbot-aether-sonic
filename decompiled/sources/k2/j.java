package K2;

import J2.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class j implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final ConstraintLayout f1434E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final AppCompatImageView f1435F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final LottieAnimationView f1436G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final TextView f1437H;

    private j(@N ConstraintLayout constraintLayout, @N AppCompatImageView appCompatImageView, @N LottieAnimationView lottieAnimationView, @N TextView textView) {
        this.f1434E = constraintLayout;
        this.f1435F = appCompatImageView;
        this.f1436G = lottieAnimationView;
        this.f1437H = textView;
    }

    @N
    public static j a(@N View view) {
        int i4 = a.e.f1305o;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2067c.a(view, i4);
        if (appCompatImageView != null) {
            i4 = a.e.f1309s;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) C2067c.a(view, i4);
            if (lottieAnimationView != null) {
                i4 = a.e.f1290C;
                TextView textView = (TextView) C2067c.a(view, i4);
                if (textView != null) {
                    return new j((ConstraintLayout) view, appCompatImageView, lottieAnimationView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static j c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static j e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(a.f.f1326j, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f1434E;
    }
}
