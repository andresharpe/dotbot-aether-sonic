package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.widget.eq.SCardView;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.w1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1952w1 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final SCardView f40275E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final SCardView f40276F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f40277G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final RecyclerView f40278H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f40279I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f40280J;

    private C1952w1(@androidx.annotation.N SCardView sCardView, @androidx.annotation.N SCardView sCardView2, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView, @androidx.annotation.N RecyclerView recyclerView, @androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView2) {
        this.f40275E = sCardView;
        this.f40276F = sCardView2;
        this.f40277G = hmCustomFontTextView;
        this.f40278H = recyclerView;
        this.f40279I = constraintLayout;
        this.f40280J = hmCustomFontTextView2;
    }

    @androidx.annotation.N
    public static C1952w1 a(@androidx.annotation.N View view) {
        SCardView sCardView = (SCardView) view;
        int i4 = j.h.e4;
        HmCustomFontTextView hmCustomFontTextView = (HmCustomFontTextView) C2067c.a(view, i4);
        if (hmCustomFontTextView != null) {
            i4 = j.h.u4;
            RecyclerView recyclerView = (RecyclerView) C2067c.a(view, i4);
            if (recyclerView != null) {
                i4 = j.h.La;
                ConstraintLayout constraintLayout = (ConstraintLayout) C2067c.a(view, i4);
                if (constraintLayout != null) {
                    i4 = j.h.Ai;
                    HmCustomFontTextView hmCustomFontTextView2 = (HmCustomFontTextView) C2067c.a(view, i4);
                    if (hmCustomFontTextView2 != null) {
                        return new C1952w1(sCardView, sCardView, hmCustomFontTextView, recyclerView, constraintLayout, hmCustomFontTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1952w1 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1952w1 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41484d1, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public SCardView d() {
        return this.f40275E;
    }
}
