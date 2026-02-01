package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.customviews.HmTriggerCustomizationCard;
import com.harman.jbl.partybox.ui.widget.ElasticScrollView;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class F3 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f38619E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f38620F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final FrameLayout f38621G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38622H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final ElasticScrollView f38623I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final FrameLayout f38624J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f38625K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final HmTriggerCustomizationCard f38626L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f38627M;

    private F3(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N LinearLayout linearLayout, @androidx.annotation.N FrameLayout frameLayout, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ElasticScrollView elasticScrollView, @androidx.annotation.N FrameLayout frameLayout2, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView, @androidx.annotation.N HmTriggerCustomizationCard hmTriggerCustomizationCard, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView2) {
        this.f38619E = constraintLayout;
        this.f38620F = linearLayout;
        this.f38621G = frameLayout;
        this.f38622H = imageView;
        this.f38623I = elasticScrollView;
        this.f38624J = frameLayout2;
        this.f38625K = hmCustomFontTextView;
        this.f38626L = hmTriggerCustomizationCard;
        this.f38627M = hmCustomFontTextView2;
    }

    @androidx.annotation.N
    public static F3 a(@androidx.annotation.N View view) {
        int i4 = j.h.f41301l2;
        LinearLayout linearLayout = (LinearLayout) C2067c.a(view, i4);
        if (linearLayout != null) {
            i4 = j.h.S6;
            FrameLayout frameLayout = (FrameLayout) C2067c.a(view, i4);
            if (frameLayout != null) {
                i4 = j.h.d7;
                ImageView imageView = (ImageView) C2067c.a(view, i4);
                if (imageView != null) {
                    i4 = j.h.Zd;
                    ElasticScrollView elasticScrollView = (ElasticScrollView) C2067c.a(view, i4);
                    if (elasticScrollView != null) {
                        i4 = j.h.mg;
                        FrameLayout frameLayout2 = (FrameLayout) C2067c.a(view, i4);
                        if (frameLayout2 != null) {
                            i4 = j.h.Vg;
                            HmCustomFontTextView hmCustomFontTextView = (HmCustomFontTextView) C2067c.a(view, i4);
                            if (hmCustomFontTextView != null) {
                                i4 = j.h.rh;
                                HmTriggerCustomizationCard hmTriggerCustomizationCard = (HmTriggerCustomizationCard) C2067c.a(view, i4);
                                if (hmTriggerCustomizationCard != null) {
                                    i4 = j.h.Ai;
                                    HmCustomFontTextView hmCustomFontTextView2 = (HmCustomFontTextView) C2067c.a(view, i4);
                                    if (hmCustomFontTextView2 != null) {
                                        return new F3((ConstraintLayout) view, linearLayout, frameLayout, imageView, elasticScrollView, frameLayout2, hmCustomFontTextView, hmTriggerCustomizationCard, hmCustomFontTextView2);
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

    @androidx.annotation.N
    public static F3 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static F3 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41397H2, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f38619E;
    }
}
