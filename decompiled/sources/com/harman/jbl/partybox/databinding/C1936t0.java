package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.customviews.HmTextViewWithImage;
import com.harman.jbl.partybox.ui.customviews.ShadowLayout;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1936t0 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f40146E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final HmTextViewWithImage f40147F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final HmTextViewWithImage f40148G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40149H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f40150I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final View f40151J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final View f40152K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final HmTextViewWithImage f40153L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.N
    public final ShadowLayout f40154M;

    /* renamed from: N, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f40155N;

    private C1936t0(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N HmTextViewWithImage hmTextViewWithImage, @androidx.annotation.N HmTextViewWithImage hmTextViewWithImage2, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N View view, @androidx.annotation.N View view2, @androidx.annotation.N HmTextViewWithImage hmTextViewWithImage3, @androidx.annotation.N ShadowLayout shadowLayout, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView) {
        this.f40146E = constraintLayout;
        this.f40147F = hmTextViewWithImage;
        this.f40148G = hmTextViewWithImage2;
        this.f40149H = imageView;
        this.f40150I = constraintLayout2;
        this.f40151J = view;
        this.f40152K = view2;
        this.f40153L = hmTextViewWithImage3;
        this.f40154M = shadowLayout;
        this.f40155N = hmCustomFontTextView;
    }

    @androidx.annotation.N
    public static C1936t0 a(@androidx.annotation.N View view) {
        View a4;
        int i4 = j.h.f41213S1;
        HmTextViewWithImage hmTextViewWithImage = (HmTextViewWithImage) C2067c.a(view, i4);
        if (hmTextViewWithImage != null) {
            i4 = j.h.f41217T1;
            HmTextViewWithImage hmTextViewWithImage2 = (HmTextViewWithImage) C2067c.a(view, i4);
            if (hmTextViewWithImage2 != null) {
                i4 = j.h.f41336s2;
                ImageView imageView = (ImageView) C2067c.a(view, i4);
                if (imageView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i4 = j.h.I3;
                    View a5 = C2067c.a(view, i4);
                    if (a5 != null && (a4 = C2067c.a(view, (i4 = j.h.M3))) != null) {
                        i4 = j.h.Ta;
                        HmTextViewWithImage hmTextViewWithImage3 = (HmTextViewWithImage) C2067c.a(view, i4);
                        if (hmTextViewWithImage3 != null) {
                            i4 = j.h.Ge;
                            ShadowLayout shadowLayout = (ShadowLayout) C2067c.a(view, i4);
                            if (shadowLayout != null) {
                                i4 = j.h.Vg;
                                HmCustomFontTextView hmCustomFontTextView = (HmCustomFontTextView) C2067c.a(view, i4);
                                if (hmCustomFontTextView != null) {
                                    return new C1936t0(constraintLayout, hmTextViewWithImage, hmTextViewWithImage2, imageView, constraintLayout, a5, a4, hmTextViewWithImage3, shadowLayout, hmCustomFontTextView);
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
    public static C1936t0 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1936t0 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41503i0, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f40146E;
    }
}
