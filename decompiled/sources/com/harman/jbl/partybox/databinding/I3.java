package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.customviews.HmUpgradingCircleIndicator;
import com.harman.jbl.partybox.ui.widget.ProgressLayout;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class I3 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final LinearLayoutCompat f38740E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38741F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final HmUpgradingCircleIndicator f38742G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f38743H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final I1 f38744I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f38745J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final ProgressLayout f38746K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final FrameLayout f38747L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f38748M;

    /* renamed from: N, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f38749N;

    private I3(@androidx.annotation.N LinearLayoutCompat linearLayoutCompat, @androidx.annotation.N TextView textView, @androidx.annotation.N HmUpgradingCircleIndicator hmUpgradingCircleIndicator, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView, @androidx.annotation.N I1 i12, @androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ProgressLayout progressLayout, @androidx.annotation.N FrameLayout frameLayout, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView2, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView3) {
        this.f38740E = linearLayoutCompat;
        this.f38741F = textView;
        this.f38742G = hmUpgradingCircleIndicator;
        this.f38743H = hmCustomFontTextView;
        this.f38744I = i12;
        this.f38745J = constraintLayout;
        this.f38746K = progressLayout;
        this.f38747L = frameLayout;
        this.f38748M = hmCustomFontTextView2;
        this.f38749N = hmCustomFontTextView3;
    }

    @androidx.annotation.N
    public static I3 a(@androidx.annotation.N View view) {
        View a4;
        int i4 = j.h.f41246a2;
        TextView textView = (TextView) C2067c.a(view, i4);
        if (textView != null) {
            i4 = j.h.f41316o2;
            HmUpgradingCircleIndicator hmUpgradingCircleIndicator = (HmUpgradingCircleIndicator) C2067c.a(view, i4);
            if (hmUpgradingCircleIndicator != null) {
                i4 = j.h.z4;
                HmCustomFontTextView hmCustomFontTextView = (HmCustomFontTextView) C2067c.a(view, i4);
                if (hmCustomFontTextView != null && (a4 = C2067c.a(view, (i4 = j.h.x5))) != null) {
                    I1 a5 = I1.a(a4);
                    i4 = j.h.P6;
                    ConstraintLayout constraintLayout = (ConstraintLayout) C2067c.a(view, i4);
                    if (constraintLayout != null) {
                        i4 = j.h.jd;
                        ProgressLayout progressLayout = (ProgressLayout) C2067c.a(view, i4);
                        if (progressLayout != null) {
                            i4 = j.h.Vd;
                            FrameLayout frameLayout = (FrameLayout) C2067c.a(view, i4);
                            if (frameLayout != null) {
                                i4 = j.h.nj;
                                HmCustomFontTextView hmCustomFontTextView2 = (HmCustomFontTextView) C2067c.a(view, i4);
                                if (hmCustomFontTextView2 != null) {
                                    i4 = j.h.pj;
                                    HmCustomFontTextView hmCustomFontTextView3 = (HmCustomFontTextView) C2067c.a(view, i4);
                                    if (hmCustomFontTextView3 != null) {
                                        return new I3((LinearLayoutCompat) view, textView, hmUpgradingCircleIndicator, hmCustomFontTextView, a5, constraintLayout, progressLayout, frameLayout, hmCustomFontTextView2, hmCustomFontTextView3);
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
    public static I3 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static I3 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41409K2, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat d() {
        return this.f38740E;
    }
}
