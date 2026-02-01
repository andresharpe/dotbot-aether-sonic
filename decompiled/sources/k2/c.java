package K2;

import J2.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class c implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final ConstraintLayout f1410E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final RecyclerView f1411F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final AppCompatTextView f1412G;

    private c(@N ConstraintLayout constraintLayout, @N RecyclerView recyclerView, @N AppCompatTextView appCompatTextView) {
        this.f1410E = constraintLayout;
        this.f1411F = recyclerView;
        this.f1412G = appCompatTextView;
    }

    @N
    public static c a(@N View view) {
        int i4 = a.e.f1311u;
        RecyclerView recyclerView = (RecyclerView) C2067c.a(view, i4);
        if (recyclerView != null) {
            i4 = a.e.f1312v;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C2067c.a(view, i4);
            if (appCompatTextView != null) {
                return new c((ConstraintLayout) view, recyclerView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static c c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static c e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(a.f.f1319c, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f1410E;
    }
}
