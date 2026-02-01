package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.g1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1873g1 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39597E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39598F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39599G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39600H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39601I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39602J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39603K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39604L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39605M;

    /* renamed from: N, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39606N;

    /* renamed from: O, reason: collision with root package name */
    @androidx.annotation.N
    public final CardView f39607O;

    /* renamed from: P, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39608P;

    /* renamed from: Q, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39609Q;

    /* renamed from: R, reason: collision with root package name */
    @androidx.annotation.N
    public final SeekBar f39610R;

    private C1873g1(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N ImageView imageView3, @androidx.annotation.N ImageView imageView4, @androidx.annotation.N ConstraintLayout constraintLayout3, @androidx.annotation.N ImageView imageView5, @androidx.annotation.N ImageView imageView6, @androidx.annotation.N ImageView imageView7, @androidx.annotation.N CardView cardView, @androidx.annotation.N TextView textView, @androidx.annotation.N ImageView imageView8, @androidx.annotation.N SeekBar seekBar) {
        this.f39597E = constraintLayout;
        this.f39598F = constraintLayout2;
        this.f39599G = imageView;
        this.f39600H = imageView2;
        this.f39601I = imageView3;
        this.f39602J = imageView4;
        this.f39603K = constraintLayout3;
        this.f39604L = imageView5;
        this.f39605M = imageView6;
        this.f39606N = imageView7;
        this.f39607O = cardView;
        this.f39608P = textView;
        this.f39609Q = imageView8;
        this.f39610R = seekBar;
    }

    @androidx.annotation.N
    public static C1873g1 a(@androidx.annotation.N View view) {
        int i4 = j.h.f41262d3;
        ConstraintLayout constraintLayout = (ConstraintLayout) C2067c.a(view, i4);
        if (constraintLayout != null) {
            i4 = j.h.J5;
            ImageView imageView = (ImageView) C2067c.a(view, i4);
            if (imageView != null) {
                i4 = j.h.N5;
                ImageView imageView2 = (ImageView) C2067c.a(view, i4);
                if (imageView2 != null) {
                    i4 = j.h.Z5;
                    ImageView imageView3 = (ImageView) C2067c.a(view, i4);
                    if (imageView3 != null) {
                        i4 = j.h.j6;
                        ImageView imageView4 = (ImageView) C2067c.a(view, i4);
                        if (imageView4 != null) {
                            i4 = j.h.z6;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) C2067c.a(view, i4);
                            if (constraintLayout2 != null) {
                                i4 = j.h.Ac;
                                ImageView imageView5 = (ImageView) C2067c.a(view, i4);
                                if (imageView5 != null) {
                                    i4 = j.h.Bc;
                                    ImageView imageView6 = (ImageView) C2067c.a(view, i4);
                                    if (imageView6 != null) {
                                        i4 = j.h.Cc;
                                        ImageView imageView7 = (ImageView) C2067c.a(view, i4);
                                        if (imageView7 != null) {
                                            i4 = j.h.Tc;
                                            CardView cardView = (CardView) C2067c.a(view, i4);
                                            if (cardView != null) {
                                                i4 = j.h.Ai;
                                                TextView textView = (TextView) C2067c.a(view, i4);
                                                if (textView != null) {
                                                    i4 = j.h.Fj;
                                                    ImageView imageView8 = (ImageView) C2067c.a(view, i4);
                                                    if (imageView8 != null) {
                                                        i4 = j.h.Hj;
                                                        SeekBar seekBar = (SeekBar) C2067c.a(view, i4);
                                                        if (seekBar != null) {
                                                            return new C1873g1((ConstraintLayout) view, constraintLayout, imageView, imageView2, imageView3, imageView4, constraintLayout2, imageView5, imageView6, imageView7, cardView, textView, imageView8, seekBar);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1873g1 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1873g1 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41439S0, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39597E;
    }
}
