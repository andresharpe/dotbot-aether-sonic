package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1931s0 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f40109E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f40110F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40111G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f40112H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final F1 f40113I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f40114J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40115K;

    private C1931s0(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N TextView textView, @androidx.annotation.N ConstraintLayout constraintLayout3, @androidx.annotation.N F1 f12, @androidx.annotation.N ConstraintLayout constraintLayout4, @androidx.annotation.N TextView textView2) {
        this.f40109E = constraintLayout;
        this.f40110F = constraintLayout2;
        this.f40111G = textView;
        this.f40112H = constraintLayout3;
        this.f40113I = f12;
        this.f40114J = constraintLayout4;
        this.f40115K = textView2;
    }

    @androidx.annotation.N
    public static C1931s0 a(@androidx.annotation.N View view) {
        int i4 = j.h.f41194N2;
        ConstraintLayout constraintLayout = (ConstraintLayout) C2067c.a(view, i4);
        if (constraintLayout != null) {
            i4 = j.h.f41198O2;
            TextView textView = (TextView) C2067c.a(view, i4);
            if (textView != null) {
                ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                i4 = j.h.x5;
                View a4 = C2067c.a(view, i4);
                if (a4 != null) {
                    F1 a5 = F1.a(a4);
                    i4 = j.h.ld;
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) C2067c.a(view, i4);
                    if (constraintLayout3 != null) {
                        i4 = j.h.md;
                        TextView textView2 = (TextView) C2067c.a(view, i4);
                        if (textView2 != null) {
                            return new C1931s0(constraintLayout2, constraintLayout, textView, constraintLayout2, a5, constraintLayout3, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1931s0 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1931s0 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41499h0, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f40109E;
    }
}
