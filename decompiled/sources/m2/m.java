package m2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.harman.jbl.partylight.lib.g;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class m implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final ConstraintLayout f55156E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final CircularProgressIndicator f55157F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final Group f55158G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final Group f55159H;

    /* renamed from: I, reason: collision with root package name */
    @N
    public final Group f55160I;

    /* renamed from: J, reason: collision with root package name */
    @N
    public final C2360A f55161J;

    /* renamed from: K, reason: collision with root package name */
    @N
    public final AppCompatImageView f55162K;

    /* renamed from: L, reason: collision with root package name */
    @N
    public final RecyclerView f55163L;

    /* renamed from: M, reason: collision with root package name */
    @N
    public final TextView f55164M;

    /* renamed from: N, reason: collision with root package name */
    @N
    public final TextView f55165N;

    /* renamed from: O, reason: collision with root package name */
    @N
    public final TextView f55166O;

    /* renamed from: P, reason: collision with root package name */
    @N
    public final TextView f55167P;

    private m(@N ConstraintLayout constraintLayout, @N CircularProgressIndicator circularProgressIndicator, @N Group group, @N Group group2, @N Group group3, @N C2360A c2360a, @N AppCompatImageView appCompatImageView, @N RecyclerView recyclerView, @N TextView textView, @N TextView textView2, @N TextView textView3, @N TextView textView4) {
        this.f55156E = constraintLayout;
        this.f55157F = circularProgressIndicator;
        this.f55158G = group;
        this.f55159H = group2;
        this.f55160I = group3;
        this.f55161J = c2360a;
        this.f55162K = appCompatImageView;
        this.f55163L = recyclerView;
        this.f55164M = textView;
        this.f55165N = textView2;
        this.f55166O = textView3;
        this.f55167P = textView4;
    }

    @N
    public static m a(@N View view) {
        View a4;
        int i4 = g.C0418g.f46840I;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C2067c.a(view, i4);
        if (circularProgressIndicator != null) {
            i4 = g.C0418g.f46873T;
            Group group = (Group) C2067c.a(view, i4);
            if (group != null) {
                i4 = g.C0418g.f46876U;
                Group group2 = (Group) C2067c.a(view, i4);
                if (group2 != null) {
                    i4 = g.C0418g.f46879V;
                    Group group3 = (Group) C2067c.a(view, i4);
                    if (group3 != null && (a4 = C2067c.a(view, (i4 = g.C0418g.f46891Z))) != null) {
                        C2360A a5 = C2360A.a(a4);
                        i4 = g.C0418g.f46923h0;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) C2067c.a(view, i4);
                        if (appCompatImageView != null) {
                            i4 = g.C0418g.f46900b1;
                            RecyclerView recyclerView = (RecyclerView) C2067c.a(view, i4);
                            if (recyclerView != null) {
                                i4 = g.C0418g.f46987y1;
                                TextView textView = (TextView) C2067c.a(view, i4);
                                if (textView != null) {
                                    i4 = g.C0418g.f46990z1;
                                    TextView textView2 = (TextView) C2067c.a(view, i4);
                                    if (textView2 != null) {
                                        i4 = g.C0418g.f46836G1;
                                        TextView textView3 = (TextView) C2067c.a(view, i4);
                                        if (textView3 != null) {
                                            i4 = g.C0418g.f46893Z1;
                                            TextView textView4 = (TextView) C2067c.a(view, i4);
                                            if (textView4 != null) {
                                                return new m((ConstraintLayout) view, circularProgressIndicator, group, group2, group3, a5, appCompatImageView, recyclerView, textView, textView2, textView3, textView4);
                                            }
                                        }
                                    }
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
    public static m c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static m e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(g.h.f47013m, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f55156E;
    }
}
