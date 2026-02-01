package m2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partylight.lib.g;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: m2.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2364d implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final ConstraintLayout f55102E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final ConstraintLayout f55103F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final AppCompatImageButton f55104G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final RecyclerView f55105H;

    private C2364d(@N ConstraintLayout constraintLayout, @N ConstraintLayout constraintLayout2, @N AppCompatImageButton appCompatImageButton, @N RecyclerView recyclerView) {
        this.f55102E = constraintLayout;
        this.f55103F = constraintLayout2;
        this.f55104G = appCompatImageButton;
        this.f55105H = recyclerView;
    }

    @N
    public static C2364d a(@N View view) {
        int i4 = g.C0418g.f46828E;
        ConstraintLayout constraintLayout = (ConstraintLayout) C2067c.a(view, i4);
        if (constraintLayout != null) {
            i4 = g.C0418g.f46903c0;
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) C2067c.a(view, i4);
            if (appCompatImageButton != null) {
                i4 = g.C0418g.f46900b1;
                RecyclerView recyclerView = (RecyclerView) C2067c.a(view, i4);
                if (recyclerView != null) {
                    return new C2364d((ConstraintLayout) view, constraintLayout, appCompatImageButton, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static C2364d c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static C2364d e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(g.h.f47004d, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f55102E;
    }
}
