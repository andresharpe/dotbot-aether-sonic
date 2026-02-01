package m2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partylight.lib.g;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: m2.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2360A implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final ConstraintLayout f55029E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final ImageView f55030F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final ImageView f55031G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final ConstraintLayout f55032H;

    /* renamed from: I, reason: collision with root package name */
    @N
    public final AppCompatTextView f55033I;

    private C2360A(@N ConstraintLayout constraintLayout, @N ImageView imageView, @N ImageView imageView2, @N ConstraintLayout constraintLayout2, @N AppCompatTextView appCompatTextView) {
        this.f55029E = constraintLayout;
        this.f55030F = imageView;
        this.f55031G = imageView2;
        this.f55032H = constraintLayout2;
        this.f55033I = appCompatTextView;
    }

    @N
    public static C2360A a(@N View view) {
        int i4 = g.C0418g.f46894a;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = g.C0418g.f46926i;
            ImageView imageView2 = (ImageView) C2067c.a(view, i4);
            if (imageView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i4 = g.C0418g.f46899b0;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C2067c.a(view, i4);
                if (appCompatTextView != null) {
                    return new C2360A(constraintLayout, imageView, imageView2, constraintLayout, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static C2360A c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static C2360A e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(g.h.f46991A, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f55029E;
    }
}
