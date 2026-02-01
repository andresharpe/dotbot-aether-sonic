package m2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partylight.lib.g;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class l implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final ConstraintLayout f55150E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final C2360A f55151F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final AppCompatImageView f55152G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final ImageView f55153H;

    /* renamed from: I, reason: collision with root package name */
    @N
    public final TextView f55154I;

    /* renamed from: J, reason: collision with root package name */
    @N
    public final TextView f55155J;

    private l(@N ConstraintLayout constraintLayout, @N C2360A c2360a, @N AppCompatImageView appCompatImageView, @N ImageView imageView, @N TextView textView, @N TextView textView2) {
        this.f55150E = constraintLayout;
        this.f55151F = c2360a;
        this.f55152G = appCompatImageView;
        this.f55153H = imageView;
        this.f55154I = textView;
        this.f55155J = textView2;
    }

    @N
    public static l a(@N View view) {
        int i4 = g.C0418g.f46891Z;
        View a4 = C2067c.a(view, i4);
        if (a4 != null) {
            C2360A a5 = C2360A.a(a4);
            i4 = g.C0418g.f46915f0;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2067c.a(view, i4);
            if (appCompatImageView != null) {
                i4 = g.C0418g.f46939l0;
                ImageView imageView = (ImageView) C2067c.a(view, i4);
                if (imageView != null) {
                    i4 = g.C0418g.f46821B1;
                    TextView textView = (TextView) C2067c.a(view, i4);
                    if (textView != null) {
                        i4 = g.C0418g.f46824C1;
                        TextView textView2 = (TextView) C2067c.a(view, i4);
                        if (textView2 != null) {
                            return new l((ConstraintLayout) view, a5, appCompatImageView, imageView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static l c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static l e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(g.h.f47012l, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f55150E;
    }
}
