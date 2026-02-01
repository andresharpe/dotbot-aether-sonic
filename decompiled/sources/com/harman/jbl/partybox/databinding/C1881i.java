package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1881i implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39671E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39672F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39673G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final CardView f39674H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39675I;

    private C1881i(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N ImageView imageView, @androidx.annotation.N CardView cardView, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView) {
        this.f39671E = constraintLayout;
        this.f39672F = constraintLayout2;
        this.f39673G = imageView;
        this.f39674H = cardView;
        this.f39675I = hmCustomFontTextView;
    }

    @androidx.annotation.N
    public static C1881i a(@androidx.annotation.N View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i4 = j.h.Sa;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = j.h.yc;
            CardView cardView = (CardView) C2067c.a(view, i4);
            if (cardView != null) {
                i4 = j.h.sf;
                HmCustomFontTextView hmCustomFontTextView = (HmCustomFontTextView) C2067c.a(view, i4);
                if (hmCustomFontTextView != null) {
                    return new C1881i(constraintLayout, constraintLayout, imageView, cardView, hmCustomFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1881i c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1881i e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41502i, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39671E;
    }
}
