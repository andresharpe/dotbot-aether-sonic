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

/* renamed from: com.harman.jbl.partybox.databinding.s3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1934s3 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f40125E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f40126F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40127G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40128H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f40129I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f40130J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f40131K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f40132L;

    private C1934s3(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N ConstraintLayout constraintLayout3, @androidx.annotation.N ConstraintLayout constraintLayout4, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView2) {
        this.f40125E = constraintLayout;
        this.f40126F = hmCustomFontTextView;
        this.f40127G = imageView;
        this.f40128H = imageView2;
        this.f40129I = constraintLayout2;
        this.f40130J = constraintLayout3;
        this.f40131K = constraintLayout4;
        this.f40132L = hmCustomFontTextView2;
    }

    @androidx.annotation.N
    public static C1934s3 a(@androidx.annotation.N View view) {
        int i4 = j.h.x3;
        HmCustomFontTextView hmCustomFontTextView = (HmCustomFontTextView) C2067c.a(view, i4);
        if (hmCustomFontTextView != null) {
            i4 = j.h.H5;
            ImageView imageView = (ImageView) C2067c.a(view, i4);
            if (imageView != null) {
                i4 = j.h.b6;
                ImageView imageView2 = (ImageView) C2067c.a(view, i4);
                if (imageView2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i4 = j.h.L8;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) C2067c.a(view, i4);
                    if (constraintLayout2 != null) {
                        i4 = j.h.Z8;
                        ConstraintLayout constraintLayout3 = (ConstraintLayout) C2067c.a(view, i4);
                        if (constraintLayout3 != null) {
                            i4 = j.h.Yh;
                            HmCustomFontTextView hmCustomFontTextView2 = (HmCustomFontTextView) C2067c.a(view, i4);
                            if (hmCustomFontTextView2 != null) {
                                return new C1934s3(constraintLayout, hmCustomFontTextView, imageView, imageView2, constraintLayout, constraintLayout2, constraintLayout3, hmCustomFontTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1934s3 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1934s3 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41565x2, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f40125E;
    }
}
