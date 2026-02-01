package m2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.harman.jbl.partylight.lib.g;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: m2.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2361a implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final ConstraintLayout f55074E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final ImageView f55075F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final FragmentContainerView f55076G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final G f55077H;

    /* renamed from: I, reason: collision with root package name */
    @N
    public final View f55078I;

    private C2361a(@N ConstraintLayout constraintLayout, @N ImageView imageView, @N FragmentContainerView fragmentContainerView, @N G g4, @N View view) {
        this.f55074E = constraintLayout;
        this.f55075F = imageView;
        this.f55076G = fragmentContainerView;
        this.f55077H = g4;
        this.f55078I = view;
    }

    @N
    public static C2361a a(@N View view) {
        View a4;
        int i4 = g.C0418g.f46861P;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = g.C0418g.f46844J0;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) C2067c.a(view, i4);
            if (fragmentContainerView != null && (a4 = C2067c.a(view, (i4 = g.C0418g.f46953o2))) != null) {
                G a5 = G.a(a4);
                i4 = g.C0418g.f46957p2;
                View a6 = C2067c.a(view, i4);
                if (a6 != null) {
                    return new C2361a((ConstraintLayout) view, imageView, fragmentContainerView, a5, a6);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static C2361a c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static C2361a e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(g.h.f47001a, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f55074E;
    }
}
