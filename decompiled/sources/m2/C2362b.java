package m2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import com.harman.jbl.partylight.lib.g;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: m2.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2362b implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final LinearLayout f55079E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final C2360A f55080F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final ImageView f55081G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final ImageView f55082H;

    /* renamed from: I, reason: collision with root package name */
    @N
    public final LinearLayout f55083I;

    /* renamed from: J, reason: collision with root package name */
    @N
    public final TextView f55084J;

    /* renamed from: K, reason: collision with root package name */
    @N
    public final TextView f55085K;

    /* renamed from: L, reason: collision with root package name */
    @N
    public final TextView f55086L;

    /* renamed from: M, reason: collision with root package name */
    @N
    public final TextView f55087M;

    private C2362b(@N LinearLayout linearLayout, @N C2360A c2360a, @N ImageView imageView, @N ImageView imageView2, @N LinearLayout linearLayout2, @N TextView textView, @N TextView textView2, @N TextView textView3, @N TextView textView4) {
        this.f55079E = linearLayout;
        this.f55080F = c2360a;
        this.f55081G = imageView;
        this.f55082H = imageView2;
        this.f55083I = linearLayout2;
        this.f55084J = textView;
        this.f55085K = textView2;
        this.f55086L = textView3;
        this.f55087M = textView4;
    }

    @N
    public static C2362b a(@N View view) {
        int i4 = g.C0418g.f46910e;
        View a4 = C2067c.a(view, i4);
        if (a4 != null) {
            C2360A a5 = C2360A.a(a4);
            i4 = g.C0418g.f46931j0;
            ImageView imageView = (ImageView) C2067c.a(view, i4);
            if (imageView != null) {
                i4 = g.C0418g.f46935k0;
                ImageView imageView2 = (ImageView) C2067c.a(view, i4);
                if (imageView2 != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i4 = g.C0418g.f46866Q1;
                    TextView textView = (TextView) C2067c.a(view, i4);
                    if (textView != null) {
                        i4 = g.C0418g.f46869R1;
                        TextView textView2 = (TextView) C2067c.a(view, i4);
                        if (textView2 != null) {
                            i4 = g.C0418g.f46872S1;
                            TextView textView3 = (TextView) C2067c.a(view, i4);
                            if (textView3 != null) {
                                i4 = g.C0418g.f46875T1;
                                TextView textView4 = (TextView) C2067c.a(view, i4);
                                if (textView4 != null) {
                                    return new C2362b(linearLayout, a5, imageView, imageView2, linearLayout, textView, textView2, textView3, textView4);
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
    public static C2362b c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static C2362b e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(g.h.f47002b, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout d() {
        return this.f55079E;
    }
}
