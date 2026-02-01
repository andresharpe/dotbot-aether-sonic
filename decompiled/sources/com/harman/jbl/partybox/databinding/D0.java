package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class D0 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f38536E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final CardView f38537F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final RecyclerView f38538G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final F1 f38539H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38540I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38541J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final RecyclerView f38542K;

    private D0(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N CardView cardView, @androidx.annotation.N RecyclerView recyclerView, @androidx.annotation.N F1 f12, @androidx.annotation.N TextView textView, @androidx.annotation.N TextView textView2, @androidx.annotation.N RecyclerView recyclerView2) {
        this.f38536E = constraintLayout;
        this.f38537F = cardView;
        this.f38538G = recyclerView;
        this.f38539H = f12;
        this.f38540I = textView;
        this.f38541J = textView2;
        this.f38542K = recyclerView2;
    }

    @androidx.annotation.N
    public static D0 a(@androidx.annotation.N View view) {
        View a4;
        int i4 = j.h.f41172I0;
        CardView cardView = (CardView) C2067c.a(view, i4);
        if (cardView != null) {
            i4 = j.h.f41176J0;
            RecyclerView recyclerView = (RecyclerView) C2067c.a(view, i4);
            if (recyclerView != null && (a4 = C2067c.a(view, (i4 = j.h.x5))) != null) {
                F1 a5 = F1.a(a4);
                i4 = j.h.pa;
                TextView textView = (TextView) C2067c.a(view, i4);
                if (textView != null) {
                    i4 = j.h.ra;
                    TextView textView2 = (TextView) C2067c.a(view, i4);
                    if (textView2 != null) {
                        i4 = j.h.sa;
                        RecyclerView recyclerView2 = (RecyclerView) C2067c.a(view, i4);
                        if (recyclerView2 != null) {
                            return new D0((ConstraintLayout) view, cardView, recyclerView, a5, textView, textView2, recyclerView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static D0 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static D0 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41539r0, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f38536E;
    }
}
