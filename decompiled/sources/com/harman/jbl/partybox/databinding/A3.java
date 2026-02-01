package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class A3 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f38461E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f38462F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38463G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38464H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f38465I;

    private A3(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView) {
        this.f38461E = constraintLayout;
        this.f38462F = constraintLayout2;
        this.f38463G = imageView;
        this.f38464H = imageView2;
        this.f38465I = hmCustomFontTextView;
    }

    @androidx.annotation.N
    public static A3 a(@androidx.annotation.N View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i4 = j.h.q7;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = j.h.B7;
            ImageView imageView2 = (ImageView) C2067c.a(view, i4);
            if (imageView2 != null) {
                i4 = j.h.Ai;
                HmCustomFontTextView hmCustomFontTextView = (HmCustomFontTextView) C2067c.a(view, i4);
                if (hmCustomFontTextView != null) {
                    return new A3(constraintLayout, constraintLayout, imageView, imageView2, hmCustomFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static A3 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static A3 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41377C2, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f38461E;
    }
}
