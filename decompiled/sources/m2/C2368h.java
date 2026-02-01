package m2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import com.airbnb.lottie.LottieAnimationView;
import com.harman.jbl.cd_biz_comm.widget.HmTextViewWithImage;
import com.harman.jbl.partylight.lib.g;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: m2.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2368h implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final FrameLayout f55127E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final TextView f55128F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final FrameLayout f55129G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final ImageView f55130H;

    /* renamed from: I, reason: collision with root package name */
    @N
    public final LottieAnimationView f55131I;

    /* renamed from: J, reason: collision with root package name */
    @N
    public final TextView f55132J;

    /* renamed from: K, reason: collision with root package name */
    @N
    public final HmTextViewWithImage f55133K;

    private C2368h(@N FrameLayout frameLayout, @N TextView textView, @N FrameLayout frameLayout2, @N ImageView imageView, @N LottieAnimationView lottieAnimationView, @N TextView textView2, @N HmTextViewWithImage hmTextViewWithImage) {
        this.f55127E = frameLayout;
        this.f55128F = textView;
        this.f55129G = frameLayout2;
        this.f55130H = imageView;
        this.f55131I = lottieAnimationView;
        this.f55132J = textView2;
        this.f55133K = hmTextViewWithImage;
    }

    @N
    public static C2368h a(@N View view) {
        int i4 = g.C0418g.f46966s;
        TextView textView = (TextView) C2067c.a(view, i4);
        if (textView != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            i4 = g.C0418g.f46907d0;
            ImageView imageView = (ImageView) C2067c.a(view, i4);
            if (imageView != null) {
                i4 = g.C0418g.f46911e0;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) C2067c.a(view, i4);
                if (lottieAnimationView != null) {
                    i4 = g.C0418g.f46944m1;
                    TextView textView2 = (TextView) C2067c.a(view, i4);
                    if (textView2 != null) {
                        i4 = g.C0418g.f46925h2;
                        HmTextViewWithImage hmTextViewWithImage = (HmTextViewWithImage) C2067c.a(view, i4);
                        if (hmTextViewWithImage != null) {
                            return new C2368h(frameLayout, textView, frameLayout, imageView, lottieAnimationView, textView2, hmTextViewWithImage);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static C2368h c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static C2368h e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(g.h.f47008h, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout d() {
        return this.f55127E;
    }
}
