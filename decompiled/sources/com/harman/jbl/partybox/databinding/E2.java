package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class E2 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f38576E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f38577F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38578G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38579H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f38580I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f38581J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f38582K;

    private E2(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N LinearLayout linearLayout, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView2, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView3) {
        this.f38576E = constraintLayout;
        this.f38577F = hmCustomFontTextView;
        this.f38578G = imageView;
        this.f38579H = imageView2;
        this.f38580I = linearLayout;
        this.f38581J = hmCustomFontTextView2;
        this.f38582K = hmCustomFontTextView3;
    }

    @androidx.annotation.N
    public static E2 a(@androidx.annotation.N View view) {
        int i4 = j.h.f41216T0;
        HmCustomFontTextView hmCustomFontTextView = (HmCustomFontTextView) C2067c.a(view, i4);
        if (hmCustomFontTextView != null) {
            i4 = j.h.f41282h3;
            ImageView imageView = (ImageView) C2067c.a(view, i4);
            if (imageView != null) {
                i4 = j.h.H7;
                ImageView imageView2 = (ImageView) C2067c.a(view, i4);
                if (imageView2 != null) {
                    i4 = j.h.ob;
                    LinearLayout linearLayout = (LinearLayout) C2067c.a(view, i4);
                    if (linearLayout != null) {
                        i4 = j.h.vb;
                        HmCustomFontTextView hmCustomFontTextView2 = (HmCustomFontTextView) C2067c.a(view, i4);
                        if (hmCustomFontTextView2 != null) {
                            i4 = j.h.tf;
                            HmCustomFontTextView hmCustomFontTextView3 = (HmCustomFontTextView) C2067c.a(view, i4);
                            if (hmCustomFontTextView3 != null) {
                                return new E2((ConstraintLayout) view, hmCustomFontTextView, imageView, imageView2, linearLayout, hmCustomFontTextView2, hmCustomFontTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static E2 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static E2 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41464Y1, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f38576E;
    }
}
