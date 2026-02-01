package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.d3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1860d3 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39483E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39484F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39485G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39486H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39487I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final Guideline f39488J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final Guideline f39489K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final Guideline f39490L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.N
    public final Guideline f39491M;

    /* renamed from: N, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39492N;

    /* renamed from: O, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39493O;

    /* renamed from: P, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39494P;

    private C1860d3(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ImageView imageView, @androidx.annotation.N TextView textView, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N TextView textView2, @androidx.annotation.N Guideline guideline, @androidx.annotation.N Guideline guideline2, @androidx.annotation.N Guideline guideline3, @androidx.annotation.N Guideline guideline4, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N ImageView imageView3, @androidx.annotation.N TextView textView3) {
        this.f39483E = constraintLayout;
        this.f39484F = imageView;
        this.f39485G = textView;
        this.f39486H = imageView2;
        this.f39487I = textView2;
        this.f39488J = guideline;
        this.f39489K = guideline2;
        this.f39490L = guideline3;
        this.f39491M = guideline4;
        this.f39492N = constraintLayout2;
        this.f39493O = imageView3;
        this.f39494P = textView3;
    }

    @androidx.annotation.N
    public static C1860d3 a(@androidx.annotation.N View view) {
        int i4 = j.h.f41255c1;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = j.h.f41260d1;
            TextView textView = (TextView) C2067c.a(view, i4);
            if (textView != null) {
                i4 = j.h.f41348v1;
                ImageView imageView2 = (ImageView) C2067c.a(view, i4);
                if (imageView2 != null) {
                    i4 = j.h.f41364z1;
                    TextView textView2 = (TextView) C2067c.a(view, i4);
                    if (textView2 != null) {
                        i4 = j.h.Q6;
                        Guideline guideline = (Guideline) C2067c.a(view, i4);
                        if (guideline != null) {
                            i4 = j.h.R6;
                            Guideline guideline2 = (Guideline) C2067c.a(view, i4);
                            if (guideline2 != null) {
                                i4 = j.h.Ib;
                                Guideline guideline3 = (Guideline) C2067c.a(view, i4);
                                if (guideline3 != null) {
                                    i4 = j.h.Jb;
                                    Guideline guideline4 = (Guideline) C2067c.a(view, i4);
                                    if (guideline4 != null) {
                                        i4 = j.h.ze;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) C2067c.a(view, i4);
                                        if (constraintLayout != null) {
                                            i4 = j.h.rj;
                                            ImageView imageView3 = (ImageView) C2067c.a(view, i4);
                                            if (imageView3 != null) {
                                                i4 = j.h.sj;
                                                TextView textView3 = (TextView) C2067c.a(view, i4);
                                                if (textView3 != null) {
                                                    return new C1860d3((ConstraintLayout) view, imageView, textView, imageView2, textView2, guideline, guideline2, guideline3, guideline4, constraintLayout, imageView3, textView3);
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
    public static C1860d3 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1860d3 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41525n2, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39483E;
    }
}
