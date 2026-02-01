package m2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partylight.lib.g;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: m2.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2365e implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final ConstraintLayout f55106E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final TextView f55107F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final TextView f55108G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final TextView f55109H;

    /* renamed from: I, reason: collision with root package name */
    @N
    public final TextView f55110I;

    /* renamed from: J, reason: collision with root package name */
    @N
    public final TextView f55111J;

    /* renamed from: K, reason: collision with root package name */
    @N
    public final TextView f55112K;

    /* renamed from: L, reason: collision with root package name */
    @N
    public final TextView f55113L;

    /* renamed from: M, reason: collision with root package name */
    @N
    public final View f55114M;

    private C2365e(@N ConstraintLayout constraintLayout, @N TextView textView, @N TextView textView2, @N TextView textView3, @N TextView textView4, @N TextView textView5, @N TextView textView6, @N TextView textView7, @N View view) {
        this.f55106E = constraintLayout;
        this.f55107F = textView;
        this.f55108G = textView2;
        this.f55109H = textView3;
        this.f55110I = textView4;
        this.f55111J = textView5;
        this.f55112K = textView6;
        this.f55113L = textView7;
        this.f55114M = view;
    }

    @N
    public static C2365e a(@N View view) {
        View a4;
        int i4 = g.C0418g.f46978v1;
        TextView textView = (TextView) C2067c.a(view, i4);
        if (textView != null) {
            i4 = g.C0418g.f46981w1;
            TextView textView2 = (TextView) C2067c.a(view, i4);
            if (textView2 != null) {
                i4 = g.C0418g.f46818A1;
                TextView textView3 = (TextView) C2067c.a(view, i4);
                if (textView3 != null) {
                    i4 = g.C0418g.f46854M1;
                    TextView textView4 = (TextView) C2067c.a(view, i4);
                    if (textView4 != null) {
                        i4 = g.C0418g.f46881V1;
                        TextView textView5 = (TextView) C2067c.a(view, i4);
                        if (textView5 != null) {
                            i4 = g.C0418g.f46884W1;
                            TextView textView6 = (TextView) C2067c.a(view, i4);
                            if (textView6 != null) {
                                i4 = g.C0418g.f46901b2;
                                TextView textView7 = (TextView) C2067c.a(view, i4);
                                if (textView7 != null && (a4 = C2067c.a(view, (i4 = g.C0418g.f46961q2))) != null) {
                                    return new C2365e((ConstraintLayout) view, textView, textView2, textView3, textView4, textView5, textView6, textView7, a4);
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
    public static C2365e c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static C2365e e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(g.h.f47005e, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f55106E;
    }
}
