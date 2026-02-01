package m2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partylight.lib.g;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class v implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final ConstraintLayout f55245E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final ImageView f55246F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final ImageView f55247G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final ProgressBar f55248H;

    /* renamed from: I, reason: collision with root package name */
    @N
    public final ConstraintLayout f55249I;

    /* renamed from: J, reason: collision with root package name */
    @N
    public final TextView f55250J;

    /* renamed from: K, reason: collision with root package name */
    @N
    public final WebView f55251K;

    private v(@N ConstraintLayout constraintLayout, @N ImageView imageView, @N ImageView imageView2, @N ProgressBar progressBar, @N ConstraintLayout constraintLayout2, @N TextView textView, @N WebView webView) {
        this.f55245E = constraintLayout;
        this.f55246F = imageView;
        this.f55247G = imageView2;
        this.f55248H = progressBar;
        this.f55249I = constraintLayout2;
        this.f55250J = textView;
        this.f55251K = webView;
    }

    @N
    public static v a(@N View view) {
        int i4 = g.C0418g.f46980w0;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = g.C0418g.f46983x0;
            ImageView imageView2 = (ImageView) C2067c.a(view, i4);
            if (imageView2 != null) {
                i4 = g.C0418g.f46868R0;
                ProgressBar progressBar = (ProgressBar) C2067c.a(view, i4);
                if (progressBar != null) {
                    i4 = g.C0418g.f46952o1;
                    ConstraintLayout constraintLayout = (ConstraintLayout) C2067c.a(view, i4);
                    if (constraintLayout != null) {
                        i4 = g.C0418g.f46949n2;
                        TextView textView = (TextView) C2067c.a(view, i4);
                        if (textView != null) {
                            i4 = g.C0418g.f46965r2;
                            WebView webView = (WebView) C2067c.a(view, i4);
                            if (webView != null) {
                                return new v((ConstraintLayout) view, imageView, imageView2, progressBar, constraintLayout, textView, webView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static v c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static v e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(g.h.f47022v, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f55245E;
    }
}
