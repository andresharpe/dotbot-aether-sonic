package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.widget.RippleLayout;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class K0 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f38805E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38806F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38807G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f38808H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final RecyclerView f38809I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final RippleLayout f38810J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38811K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38812L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f38813M;

    /* renamed from: N, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38814N;

    /* renamed from: O, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38815O;

    private K0(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N TextView textView, @androidx.annotation.N ImageView imageView, @androidx.annotation.N LinearLayout linearLayout, @androidx.annotation.N RecyclerView recyclerView, @androidx.annotation.N RippleLayout rippleLayout, @androidx.annotation.N TextView textView2, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N LinearLayout linearLayout2, @androidx.annotation.N TextView textView3, @androidx.annotation.N TextView textView4) {
        this.f38805E = constraintLayout;
        this.f38806F = textView;
        this.f38807G = imageView;
        this.f38808H = linearLayout;
        this.f38809I = recyclerView;
        this.f38810J = rippleLayout;
        this.f38811K = textView2;
        this.f38812L = imageView2;
        this.f38813M = linearLayout2;
        this.f38814N = textView3;
        this.f38815O = textView4;
    }

    @androidx.annotation.N
    public static K0 a(@androidx.annotation.N View view) {
        int i4 = j.h.a5;
        TextView textView = (TextView) C2067c.a(view, i4);
        if (textView != null) {
            i4 = j.h.F6;
            ImageView imageView = (ImageView) C2067c.a(view, i4);
            if (imageView != null) {
                i4 = j.h.rb;
                LinearLayout linearLayout = (LinearLayout) C2067c.a(view, i4);
                if (linearLayout != null) {
                    i4 = j.h.Hd;
                    RecyclerView recyclerView = (RecyclerView) C2067c.a(view, i4);
                    if (recyclerView != null) {
                        i4 = j.h.be;
                        RippleLayout rippleLayout = (RippleLayout) C2067c.a(view, i4);
                        if (rippleLayout != null) {
                            i4 = j.h.Ef;
                            TextView textView2 = (TextView) C2067c.a(view, i4);
                            if (textView2 != null) {
                                i4 = j.h.Ji;
                                ImageView imageView2 = (ImageView) C2067c.a(view, i4);
                                if (imageView2 != null) {
                                    i4 = j.h.Pi;
                                    LinearLayout linearLayout2 = (LinearLayout) C2067c.a(view, i4);
                                    if (linearLayout2 != null) {
                                        i4 = j.h.Ri;
                                        TextView textView3 = (TextView) C2067c.a(view, i4);
                                        if (textView3 != null) {
                                            i4 = j.h.Wi;
                                            TextView textView4 = (TextView) C2067c.a(view, i4);
                                            if (textView4 != null) {
                                                return new K0((ConstraintLayout) view, textView, imageView, linearLayout, recyclerView, rippleLayout, textView2, imageView2, linearLayout2, textView3, textView4);
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
    public static K0 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static K0 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41567y0, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f38805E;
    }
}
