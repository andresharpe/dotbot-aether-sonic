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

/* renamed from: com.harman.jbl.partybox.databinding.x1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1957x1 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final CardView f40301E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f40302F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40303G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f40304H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final CardView f40305I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40306J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f40307K;

    private C1957x1(@androidx.annotation.N CardView cardView, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView, @androidx.annotation.N ImageView imageView, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView2, @androidx.annotation.N CardView cardView2, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N ConstraintLayout constraintLayout) {
        this.f40301E = cardView;
        this.f40302F = hmCustomFontTextView;
        this.f40303G = imageView;
        this.f40304H = hmCustomFontTextView2;
        this.f40305I = cardView2;
        this.f40306J = imageView2;
        this.f40307K = constraintLayout;
    }

    @androidx.annotation.N
    public static C1957x1 a(@androidx.annotation.N View view) {
        int i4 = j.h.f41258d;
        HmCustomFontTextView hmCustomFontTextView = (HmCustomFontTextView) C2067c.a(view, i4);
        if (hmCustomFontTextView != null) {
            i4 = j.h.f41208R0;
            ImageView imageView = (ImageView) C2067c.a(view, i4);
            if (imageView != null) {
                i4 = j.h.f41225V1;
                HmCustomFontTextView hmCustomFontTextView2 = (HmCustomFontTextView) C2067c.a(view, i4);
                if (hmCustomFontTextView2 != null) {
                    CardView cardView = (CardView) view;
                    i4 = j.h.na;
                    ImageView imageView2 = (ImageView) C2067c.a(view, i4);
                    if (imageView2 != null) {
                        i4 = j.h.xc;
                        ConstraintLayout constraintLayout = (ConstraintLayout) C2067c.a(view, i4);
                        if (constraintLayout != null) {
                            return new C1957x1(cardView, hmCustomFontTextView, imageView, hmCustomFontTextView2, cardView, imageView2, constraintLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1957x1 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1957x1 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41488e1, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CardView d() {
        return this.f40301E;
    }
}
