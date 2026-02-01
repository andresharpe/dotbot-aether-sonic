package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.y0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1961y0 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f40328E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f40329F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f40330G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final F1 f40331H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final AppCompatImageView f40332I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f40333J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f40334K;

    private C1961y0(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView, @androidx.annotation.N F1 f12, @androidx.annotation.N AppCompatImageView appCompatImageView, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView2, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView3) {
        this.f40328E = constraintLayout;
        this.f40329F = constraintLayout2;
        this.f40330G = hmCustomFontTextView;
        this.f40331H = f12;
        this.f40332I = appCompatImageView;
        this.f40333J = hmCustomFontTextView2;
        this.f40334K = hmCustomFontTextView3;
    }

    @androidx.annotation.N
    public static C1961y0 a(@androidx.annotation.N View view) {
        View a4;
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i4 = j.h.f41322p3;
        HmCustomFontTextView hmCustomFontTextView = (HmCustomFontTextView) C2067c.a(view, i4);
        if (hmCustomFontTextView != null && (a4 = C2067c.a(view, (i4 = j.h.x5))) != null) {
            F1 a5 = F1.a(a4);
            i4 = j.h.C6;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2067c.a(view, i4);
            if (appCompatImageView != null) {
                i4 = j.h.Bb;
                HmCustomFontTextView hmCustomFontTextView2 = (HmCustomFontTextView) C2067c.a(view, i4);
                if (hmCustomFontTextView2 != null) {
                    i4 = j.h.Vg;
                    HmCustomFontTextView hmCustomFontTextView3 = (HmCustomFontTextView) C2067c.a(view, i4);
                    if (hmCustomFontTextView3 != null) {
                        return new C1961y0(constraintLayout, constraintLayout, hmCustomFontTextView, a5, appCompatImageView, hmCustomFontTextView2, hmCustomFontTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1961y0 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1961y0 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41523n0, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f40328E;
    }
}
