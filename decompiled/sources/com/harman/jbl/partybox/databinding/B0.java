package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class B0 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f38475E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f38476F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38477G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38478H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final I1 f38479I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f38480J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38481K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38482L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f38483M;

    /* renamed from: N, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38484N;

    /* renamed from: O, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38485O;

    /* renamed from: P, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f38486P;

    /* renamed from: Q, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38487Q;

    /* renamed from: R, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38488R;

    private B0(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N ImageView imageView, @androidx.annotation.N TextView textView, @androidx.annotation.N I1 i12, @androidx.annotation.N ConstraintLayout constraintLayout3, @androidx.annotation.N TextView textView2, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N ConstraintLayout constraintLayout4, @androidx.annotation.N ImageView imageView3, @androidx.annotation.N TextView textView3, @androidx.annotation.N ConstraintLayout constraintLayout5, @androidx.annotation.N ImageView imageView4, @androidx.annotation.N TextView textView4) {
        this.f38475E = constraintLayout;
        this.f38476F = constraintLayout2;
        this.f38477G = imageView;
        this.f38478H = textView;
        this.f38479I = i12;
        this.f38480J = constraintLayout3;
        this.f38481K = textView2;
        this.f38482L = imageView2;
        this.f38483M = constraintLayout4;
        this.f38484N = imageView3;
        this.f38485O = textView3;
        this.f38486P = constraintLayout5;
        this.f38487Q = imageView4;
        this.f38488R = textView4;
    }

    @androidx.annotation.N
    public static B0 a(@androidx.annotation.N View view) {
        View a4;
        int i4 = j.h.B4;
        ConstraintLayout constraintLayout = (ConstraintLayout) C2067c.a(view, i4);
        if (constraintLayout != null) {
            i4 = j.h.D4;
            ImageView imageView = (ImageView) C2067c.a(view, i4);
            if (imageView != null) {
                i4 = j.h.E4;
                TextView textView = (TextView) C2067c.a(view, i4);
                if (textView != null && (a4 = C2067c.a(view, (i4 = j.h.x5))) != null) {
                    I1 a5 = I1.a(a4);
                    i4 = j.h.Cb;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) C2067c.a(view, i4);
                    if (constraintLayout2 != null) {
                        i4 = j.h.Eb;
                        TextView textView2 = (TextView) C2067c.a(view, i4);
                        if (textView2 != null) {
                            i4 = j.h.Fb;
                            ImageView imageView2 = (ImageView) C2067c.a(view, i4);
                            if (imageView2 != null) {
                                i4 = j.h.Uc;
                                ConstraintLayout constraintLayout3 = (ConstraintLayout) C2067c.a(view, i4);
                                if (constraintLayout3 != null) {
                                    i4 = j.h.Vc;
                                    ImageView imageView3 = (ImageView) C2067c.a(view, i4);
                                    if (imageView3 != null) {
                                        i4 = j.h.Yc;
                                        TextView textView3 = (TextView) C2067c.a(view, i4);
                                        if (textView3 != null) {
                                            i4 = j.h.xd;
                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) C2067c.a(view, i4);
                                            if (constraintLayout4 != null) {
                                                i4 = j.h.zd;
                                                ImageView imageView4 = (ImageView) C2067c.a(view, i4);
                                                if (imageView4 != null) {
                                                    i4 = j.h.Ad;
                                                    TextView textView4 = (TextView) C2067c.a(view, i4);
                                                    if (textView4 != null) {
                                                        return new B0((ConstraintLayout) view, constraintLayout, imageView, textView, a5, constraintLayout2, textView2, imageView2, constraintLayout3, imageView3, textView3, constraintLayout4, imageView4, textView4);
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
    public static B0 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static B0 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41527o0, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f38475E;
    }
}
