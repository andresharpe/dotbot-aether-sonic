package K2;

import J2.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class l implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final ConstraintLayout f1444E;

    private l(@N ConstraintLayout constraintLayout) {
        this.f1444E = constraintLayout;
    }

    @N
    public static l a(@N View view) {
        if (view != null) {
            return new l((ConstraintLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @N
    public static l c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static l e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(a.f.f1328l, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f1444E;
    }
}
