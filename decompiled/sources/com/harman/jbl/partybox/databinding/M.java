package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class M implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f38870E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final LottieAnimationView f38871F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f38872G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final View f38873H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38874I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38875J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38876K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38877L;

    private M(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N LottieAnimationView lottieAnimationView, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N View view, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N TextView textView, @androidx.annotation.N TextView textView2) {
        this.f38870E = constraintLayout;
        this.f38871F = lottieAnimationView;
        this.f38872G = constraintLayout2;
        this.f38873H = view;
        this.f38874I = imageView;
        this.f38875J = imageView2;
        this.f38876K = textView;
        this.f38877L = textView2;
    }

    @androidx.annotation.N
    public static M a(@androidx.annotation.N View view) {
        int i4 = j.h.f41222U2;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C2067c.a(view, i4);
        if (lottieAnimationView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i4 = j.h.I3;
            View a4 = C2067c.a(view, i4);
            if (a4 != null) {
                i4 = j.h.q6;
                ImageView imageView = (ImageView) C2067c.a(view, i4);
                if (imageView != null) {
                    i4 = j.h.y6;
                    ImageView imageView2 = (ImageView) C2067c.a(view, i4);
                    if (imageView2 != null) {
                        i4 = j.h.Ti;
                        TextView textView = (TextView) C2067c.a(view, i4);
                        if (textView != null) {
                            i4 = j.h.Zi;
                            TextView textView2 = (TextView) C2067c.a(view, i4);
                            if (textView2 != null) {
                                return new M(constraintLayout, lottieAnimationView, constraintLayout, a4, imageView, imageView2, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static M c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static M e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41386F, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f38870E;
    }
}
