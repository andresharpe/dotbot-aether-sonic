package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class W3 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39185E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39186F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39187G;

    private W3(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView) {
        this.f39185E = constraintLayout;
        this.f39186F = constraintLayout2;
        this.f39187G = hmCustomFontTextView;
    }

    @androidx.annotation.N
    public static W3 a(@androidx.annotation.N View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i4 = j.h.Vg;
        HmCustomFontTextView hmCustomFontTextView = (HmCustomFontTextView) C2067c.a(view, i4);
        if (hmCustomFontTextView != null) {
            return new W3(constraintLayout, constraintLayout, hmCustomFontTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static W3 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static W3 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41465Y2, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39185E;
    }
}
