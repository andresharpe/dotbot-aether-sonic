package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class Y implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39229E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39230F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39231G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39232H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final I1 f39233I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayoutCompat f39234J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39235K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39236L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39237M;

    /* renamed from: N, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39238N;

    /* renamed from: O, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39239O;

    /* renamed from: P, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39240P;

    /* renamed from: Q, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39241Q;

    private Y(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ImageView imageView, @androidx.annotation.N TextView textView, @androidx.annotation.N TextView textView2, @androidx.annotation.N I1 i12, @androidx.annotation.N LinearLayoutCompat linearLayoutCompat, @androidx.annotation.N TextView textView3, @androidx.annotation.N TextView textView4, @androidx.annotation.N TextView textView5, @androidx.annotation.N TextView textView6, @androidx.annotation.N TextView textView7, @androidx.annotation.N TextView textView8, @androidx.annotation.N TextView textView9) {
        this.f39229E = constraintLayout;
        this.f39230F = imageView;
        this.f39231G = textView;
        this.f39232H = textView2;
        this.f39233I = i12;
        this.f39234J = linearLayoutCompat;
        this.f39235K = textView3;
        this.f39236L = textView4;
        this.f39237M = textView5;
        this.f39238N = textView6;
        this.f39239O = textView7;
        this.f39240P = textView8;
        this.f39241Q = textView9;
    }

    @androidx.annotation.N
    public static Y a(@androidx.annotation.N View view) {
        View a4;
        int i4 = j.h.f41170H2;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = j.h.f41174I2;
            TextView textView = (TextView) C2067c.a(view, i4);
            if (textView != null) {
                i4 = j.h.r4;
                TextView textView2 = (TextView) C2067c.a(view, i4);
                if (textView2 != null && (a4 = C2067c.a(view, (i4 = j.h.x5))) != null) {
                    I1 a5 = I1.a(a4);
                    i4 = j.h.fg;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) C2067c.a(view, i4);
                    if (linearLayoutCompat != null) {
                        i4 = j.h.Lg;
                        TextView textView3 = (TextView) C2067c.a(view, i4);
                        if (textView3 != null) {
                            i4 = j.h.Mg;
                            TextView textView4 = (TextView) C2067c.a(view, i4);
                            if (textView4 != null) {
                                i4 = j.h.Ng;
                                TextView textView5 = (TextView) C2067c.a(view, i4);
                                if (textView5 != null) {
                                    i4 = j.h.Rg;
                                    TextView textView6 = (TextView) C2067c.a(view, i4);
                                    if (textView6 != null) {
                                        i4 = j.h.Sg;
                                        TextView textView7 = (TextView) C2067c.a(view, i4);
                                        if (textView7 != null) {
                                            i4 = j.h.Tg;
                                            TextView textView8 = (TextView) C2067c.a(view, i4);
                                            if (textView8 != null) {
                                                i4 = j.h.Ug;
                                                TextView textView9 = (TextView) C2067c.a(view, i4);
                                                if (textView9 != null) {
                                                    return new Y((ConstraintLayout) view, imageView, textView, textView2, a5, linearLayoutCompat, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
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
    public static Y c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static Y e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41426P, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39229E;
    }
}
