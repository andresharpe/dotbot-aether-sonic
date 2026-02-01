package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.customviews.HmTextViewWithImage;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class U3 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39136E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39137F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39138G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final LottieAnimationView f39139H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final HmTextViewWithImage f39140I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39141J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final View f39142K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39143L;

    private U3(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N LottieAnimationView lottieAnimationView, @androidx.annotation.N HmTextViewWithImage hmTextViewWithImage, @androidx.annotation.N ImageView imageView3, @androidx.annotation.N View view, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView) {
        this.f39136E = constraintLayout;
        this.f39137F = imageView;
        this.f39138G = imageView2;
        this.f39139H = lottieAnimationView;
        this.f39140I = hmTextViewWithImage;
        this.f39141J = imageView3;
        this.f39142K = view;
        this.f39143L = hmCustomFontTextView;
    }

    @androidx.annotation.N
    public static U3 a(@androidx.annotation.N View view) {
        View a4;
        int i4 = j.h.Sa;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = j.h.yc;
            ImageView imageView2 = (ImageView) C2067c.a(view, i4);
            if (imageView2 != null) {
                i4 = j.h.Hc;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) C2067c.a(view, i4);
                if (lottieAnimationView != null) {
                    i4 = j.h.Ic;
                    HmTextViewWithImage hmTextViewWithImage = (HmTextViewWithImage) C2067c.a(view, i4);
                    if (hmTextViewWithImage != null) {
                        i4 = j.h.Jc;
                        ImageView imageView3 = (ImageView) C2067c.a(view, i4);
                        if (imageView3 != null && (a4 = C2067c.a(view, (i4 = j.h.Ce))) != null) {
                            i4 = j.h.sf;
                            HmCustomFontTextView hmCustomFontTextView = (HmCustomFontTextView) C2067c.a(view, i4);
                            if (hmCustomFontTextView != null) {
                                return new U3((ConstraintLayout) view, imageView, imageView2, lottieAnimationView, hmTextViewWithImage, imageView3, a4, hmCustomFontTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static U3 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static U3 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41457W2, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39136E;
    }
}
