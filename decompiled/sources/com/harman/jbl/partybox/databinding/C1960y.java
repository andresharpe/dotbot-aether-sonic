package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1960y implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final FrameLayout f40319E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final FrameLayout f40320F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40321G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40322H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40323I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40324J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40325K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40326L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40327M;

    private C1960y(@androidx.annotation.N FrameLayout frameLayout, @androidx.annotation.N FrameLayout frameLayout2, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N TextView textView, @androidx.annotation.N TextView textView2, @androidx.annotation.N TextView textView3, @androidx.annotation.N TextView textView4, @androidx.annotation.N TextView textView5) {
        this.f40319E = frameLayout;
        this.f40320F = frameLayout2;
        this.f40321G = imageView;
        this.f40322H = imageView2;
        this.f40323I = textView;
        this.f40324J = textView2;
        this.f40325K = textView3;
        this.f40326L = textView4;
        this.f40327M = textView5;
    }

    @androidx.annotation.N
    public static C1960y a(@androidx.annotation.N View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i4 = j.h.q6;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = j.h.q7;
            ImageView imageView2 = (ImageView) C2067c.a(view, i4);
            if (imageView2 != null) {
                i4 = j.h.Qf;
                TextView textView = (TextView) C2067c.a(view, i4);
                if (textView != null) {
                    i4 = j.h.gg;
                    TextView textView2 = (TextView) C2067c.a(view, i4);
                    if (textView2 != null) {
                        i4 = j.h.hg;
                        TextView textView3 = (TextView) C2067c.a(view, i4);
                        if (textView3 != null) {
                            i4 = j.h.Vg;
                            TextView textView4 = (TextView) C2067c.a(view, i4);
                            if (textView4 != null) {
                                i4 = j.h.sh;
                                TextView textView5 = (TextView) C2067c.a(view, i4);
                                if (textView5 != null) {
                                    return new C1960y(frameLayout, frameLayout, imageView, imageView2, textView, textView2, textView3, textView4, textView5);
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
    public static C1960y c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1960y e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41550u, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout d() {
        return this.f40319E;
    }
}
