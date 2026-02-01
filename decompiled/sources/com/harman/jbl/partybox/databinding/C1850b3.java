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

/* renamed from: com.harman.jbl.partybox.databinding.b3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1850b3 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39374E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39375F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39376G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final CardView f39377H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39378I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39379J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39380K;

    private C1850b3(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N ImageView imageView, @androidx.annotation.N CardView cardView, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView2) {
        this.f39374E = constraintLayout;
        this.f39375F = constraintLayout2;
        this.f39376G = imageView;
        this.f39377H = cardView;
        this.f39378I = imageView2;
        this.f39379J = hmCustomFontTextView;
        this.f39380K = hmCustomFontTextView2;
    }

    @androidx.annotation.N
    public static C1850b3 a(@androidx.annotation.N View view) {
        int i4 = j.h.f41226V2;
        ConstraintLayout constraintLayout = (ConstraintLayout) C2067c.a(view, i4);
        if (constraintLayout != null) {
            i4 = j.h.d7;
            ImageView imageView = (ImageView) C2067c.a(view, i4);
            if (imageView != null) {
                i4 = j.h.Kc;
                CardView cardView = (CardView) C2067c.a(view, i4);
                if (cardView != null) {
                    i4 = j.h.bd;
                    ImageView imageView2 = (ImageView) C2067c.a(view, i4);
                    if (imageView2 != null) {
                        i4 = j.h.ed;
                        HmCustomFontTextView hmCustomFontTextView = (HmCustomFontTextView) C2067c.a(view, i4);
                        if (hmCustomFontTextView != null) {
                            i4 = j.h.mi;
                            HmCustomFontTextView hmCustomFontTextView2 = (HmCustomFontTextView) C2067c.a(view, i4);
                            if (hmCustomFontTextView2 != null) {
                                return new C1850b3((ConstraintLayout) view, constraintLayout, imageView, cardView, imageView2, hmCustomFontTextView, hmCustomFontTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1850b3 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1850b3 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41517l2, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39374E;
    }
}
