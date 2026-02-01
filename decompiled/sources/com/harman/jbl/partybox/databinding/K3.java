package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class K3 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f38837E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final LottieAnimationView f38838F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38839G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38840H;

    private K3(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N LottieAnimationView lottieAnimationView, @androidx.annotation.N TextView textView, @androidx.annotation.N TextView textView2) {
        this.f38837E = constraintLayout;
        this.f38838F = lottieAnimationView;
        this.f38839G = textView;
        this.f38840H = textView2;
    }

    @androidx.annotation.N
    public static K3 a(@androidx.annotation.N View view) {
        int i4 = j.h.Kb;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C2067c.a(view, i4);
        if (lottieAnimationView != null) {
            i4 = j.h.Lb;
            TextView textView = (TextView) C2067c.a(view, i4);
            if (textView != null) {
                i4 = j.h.Mb;
                TextView textView2 = (TextView) C2067c.a(view, i4);
                if (textView2 != null) {
                    return new K3((ConstraintLayout) view, lottieAnimationView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static K3 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static K3 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41417M2, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f38837E;
    }
}
