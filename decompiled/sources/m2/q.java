package m2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.harman.jbl.partylight.lib.g;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class q implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final ConstraintLayout f55216E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final CircularProgressIndicator f55217F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final TextView f55218G;

    private q(@N ConstraintLayout constraintLayout, @N CircularProgressIndicator circularProgressIndicator, @N TextView textView) {
        this.f55216E = constraintLayout;
        this.f55217F = circularProgressIndicator;
        this.f55218G = textView;
    }

    @N
    public static q a(@N View view) {
        int i4 = g.C0418g.f46840I;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C2067c.a(view, i4);
        if (circularProgressIndicator != null) {
            i4 = g.C0418g.f46987y1;
            TextView textView = (TextView) C2067c.a(view, i4);
            if (textView != null) {
                return new q((ConstraintLayout) view, circularProgressIndicator, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static q c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static q e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(g.h.f47017q, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f55216E;
    }
}
