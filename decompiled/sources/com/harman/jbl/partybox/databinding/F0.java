package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.widget.ProgressLayout;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class F0 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final LinearLayoutCompat f38597E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38598F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38599G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final I1 f38600H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f38601I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final ProgressLayout f38602J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38603K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38604L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.N
    public final FrameLayout f38605M;

    /* renamed from: N, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38606N;

    /* renamed from: O, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38607O;

    /* renamed from: P, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f38608P;

    private F0(@androidx.annotation.N LinearLayoutCompat linearLayoutCompat, @androidx.annotation.N TextView textView, @androidx.annotation.N TextView textView2, @androidx.annotation.N I1 i12, @androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ProgressLayout progressLayout, @androidx.annotation.N ImageView imageView, @androidx.annotation.N TextView textView3, @androidx.annotation.N FrameLayout frameLayout, @androidx.annotation.N TextView textView4, @androidx.annotation.N TextView textView5, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView) {
        this.f38597E = linearLayoutCompat;
        this.f38598F = textView;
        this.f38599G = textView2;
        this.f38600H = i12;
        this.f38601I = constraintLayout;
        this.f38602J = progressLayout;
        this.f38603K = imageView;
        this.f38604L = textView3;
        this.f38605M = frameLayout;
        this.f38606N = textView4;
        this.f38607O = textView5;
        this.f38608P = hmCustomFontTextView;
    }

    @androidx.annotation.N
    public static F0 a(@androidx.annotation.N View view) {
        View a4;
        int i4 = j.h.f41237Y1;
        TextView textView = (TextView) C2067c.a(view, i4);
        if (textView != null) {
            i4 = j.h.z4;
            TextView textView2 = (TextView) C2067c.a(view, i4);
            if (textView2 != null && (a4 = C2067c.a(view, (i4 = j.h.x5))) != null) {
                I1 a5 = I1.a(a4);
                i4 = j.h.P6;
                ConstraintLayout constraintLayout = (ConstraintLayout) C2067c.a(view, i4);
                if (constraintLayout != null) {
                    i4 = j.h.jd;
                    ProgressLayout progressLayout = (ProgressLayout) C2067c.a(view, i4);
                    if (progressLayout != null) {
                        i4 = j.h.kd;
                        ImageView imageView = (ImageView) C2067c.a(view, i4);
                        if (imageView != null) {
                            i4 = j.h.Ld;
                            TextView textView3 = (TextView) C2067c.a(view, i4);
                            if (textView3 != null) {
                                i4 = j.h.Vd;
                                FrameLayout frameLayout = (FrameLayout) C2067c.a(view, i4);
                                if (frameLayout != null) {
                                    i4 = j.h.nj;
                                    TextView textView4 = (TextView) C2067c.a(view, i4);
                                    if (textView4 != null) {
                                        i4 = j.h.oj;
                                        TextView textView5 = (TextView) C2067c.a(view, i4);
                                        if (textView5 != null) {
                                            i4 = j.h.pj;
                                            HmCustomFontTextView hmCustomFontTextView = (HmCustomFontTextView) C2067c.a(view, i4);
                                            if (hmCustomFontTextView != null) {
                                                return new F0((LinearLayoutCompat) view, textView, textView2, a5, constraintLayout, progressLayout, imageView, textView3, frameLayout, textView4, textView5, hmCustomFontTextView);
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
    public static F0 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static F0 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41547t0, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat d() {
        return this.f38597E;
    }
}
