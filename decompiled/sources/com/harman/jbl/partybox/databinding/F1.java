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
public final class F1 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f38609E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38610F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38611G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f38612H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f38613I;

    private F1(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView) {
        this.f38609E = constraintLayout;
        this.f38610F = imageView;
        this.f38611G = imageView2;
        this.f38612H = constraintLayout2;
        this.f38613I = hmCustomFontTextView;
    }

    @androidx.annotation.N
    public static F1 a(@androidx.annotation.N View view) {
        int i4 = j.h.f41253c;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = j.h.f41265e1;
            ImageView imageView2 = (ImageView) C2067c.a(view, i4);
            if (imageView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i4 = j.h.z5;
                HmCustomFontTextView hmCustomFontTextView = (HmCustomFontTextView) C2067c.a(view, i4);
                if (hmCustomFontTextView != null) {
                    return new F1(constraintLayout, imageView, imageView2, constraintLayout, hmCustomFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static F1 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static F1 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41520m1, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f38609E;
    }
}
