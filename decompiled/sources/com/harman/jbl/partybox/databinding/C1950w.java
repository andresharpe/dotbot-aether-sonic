package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmAppImageView;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1950w implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f40247E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final HmAppImageView f40248F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f40249G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40250H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40251I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40252J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f40253K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f40254L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f40255M;

    /* renamed from: N, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f40256N;

    /* renamed from: O, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f40257O;

    /* renamed from: P, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f40258P;

    private C1950w(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N HmAppImageView hmAppImageView, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N ImageView imageView3, @androidx.annotation.N ConstraintLayout constraintLayout3, @androidx.annotation.N ConstraintLayout constraintLayout4, @androidx.annotation.N ConstraintLayout constraintLayout5, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView2, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView3) {
        this.f40247E = constraintLayout;
        this.f40248F = hmAppImageView;
        this.f40249G = constraintLayout2;
        this.f40250H = imageView;
        this.f40251I = imageView2;
        this.f40252J = imageView3;
        this.f40253K = constraintLayout3;
        this.f40254L = constraintLayout4;
        this.f40255M = constraintLayout5;
        this.f40256N = hmCustomFontTextView;
        this.f40257O = hmCustomFontTextView2;
        this.f40258P = hmCustomFontTextView3;
    }

    @androidx.annotation.N
    public static C1950w a(@androidx.annotation.N View view) {
        int i4 = j.h.f41341t2;
        HmAppImageView hmAppImageView = (HmAppImageView) C2067c.a(view, i4);
        if (hmAppImageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i4 = j.h.q6;
            ImageView imageView = (ImageView) C2067c.a(view, i4);
            if (imageView != null) {
                i4 = j.h.a7;
                ImageView imageView2 = (ImageView) C2067c.a(view, i4);
                if (imageView2 != null) {
                    i4 = j.h.N7;
                    ImageView imageView3 = (ImageView) C2067c.a(view, i4);
                    if (imageView3 != null) {
                        i4 = j.h.v8;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) C2067c.a(view, i4);
                        if (constraintLayout2 != null) {
                            i4 = j.h.w8;
                            ConstraintLayout constraintLayout3 = (ConstraintLayout) C2067c.a(view, i4);
                            if (constraintLayout3 != null) {
                                i4 = j.h.y8;
                                ConstraintLayout constraintLayout4 = (ConstraintLayout) C2067c.a(view, i4);
                                if (constraintLayout4 != null) {
                                    i4 = j.h.nd;
                                    HmCustomFontTextView hmCustomFontTextView = (HmCustomFontTextView) C2067c.a(view, i4);
                                    if (hmCustomFontTextView != null) {
                                        i4 = j.h.Xg;
                                        HmCustomFontTextView hmCustomFontTextView2 = (HmCustomFontTextView) C2067c.a(view, i4);
                                        if (hmCustomFontTextView2 != null) {
                                            i4 = j.h.Nj;
                                            HmCustomFontTextView hmCustomFontTextView3 = (HmCustomFontTextView) C2067c.a(view, i4);
                                            if (hmCustomFontTextView3 != null) {
                                                return new C1950w(constraintLayout, hmAppImageView, constraintLayout, imageView, imageView2, imageView3, constraintLayout2, constraintLayout3, constraintLayout4, hmCustomFontTextView, hmCustomFontTextView2, hmCustomFontTextView3);
                                            }
                                        }
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
    public static C1950w c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1950w e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41542s, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f40247E;
    }
}
