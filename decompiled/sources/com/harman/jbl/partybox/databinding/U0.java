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
public final class U0 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39111E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39112F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39113G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39114H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39115I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39116J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39117K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39118L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39119M;

    /* renamed from: N, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39120N;

    private U0(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N TextView textView, @androidx.annotation.N TextView textView2, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N TextView textView3, @androidx.annotation.N TextView textView4, @androidx.annotation.N TextView textView5, @androidx.annotation.N TextView textView6) {
        this.f39111E = constraintLayout;
        this.f39112F = imageView;
        this.f39113G = constraintLayout2;
        this.f39114H = textView;
        this.f39115I = textView2;
        this.f39116J = imageView2;
        this.f39117K = textView3;
        this.f39118L = textView4;
        this.f39119M = textView5;
        this.f39120N = textView6;
    }

    @androidx.annotation.N
    public static U0 a(@androidx.annotation.N View view) {
        int i4 = j.h.f41352w1;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = j.h.f41356x1;
            ConstraintLayout constraintLayout = (ConstraintLayout) C2067c.a(view, i4);
            if (constraintLayout != null) {
                i4 = j.h.f41360y1;
                TextView textView = (TextView) C2067c.a(view, i4);
                if (textView != null) {
                    i4 = j.h.f41364z1;
                    TextView textView2 = (TextView) C2067c.a(view, i4);
                    if (textView2 != null) {
                        i4 = j.h.Na;
                        ImageView imageView2 = (ImageView) C2067c.a(view, i4);
                        if (imageView2 != null) {
                            i4 = j.h.Oa;
                            TextView textView3 = (TextView) C2067c.a(view, i4);
                            if (textView3 != null) {
                                i4 = j.h.Pa;
                                TextView textView4 = (TextView) C2067c.a(view, i4);
                                if (textView4 != null) {
                                    i4 = j.h.tc;
                                    TextView textView5 = (TextView) C2067c.a(view, i4);
                                    if (textView5 != null) {
                                        i4 = j.h.wc;
                                        TextView textView6 = (TextView) C2067c.a(view, i4);
                                        if (textView6 != null) {
                                            return new U0((ConstraintLayout) view, imageView, constraintLayout, textView, textView2, imageView2, textView3, textView4, textView5, textView6);
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
    public static U0 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static U0 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41399I0, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39111E;
    }
}
