package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class J3 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f38785E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final Guideline f38786F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final I1 f38787G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38788H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f38789I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38790J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38791K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38792L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38793M;

    /* renamed from: N, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38794N;

    /* renamed from: O, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38795O;

    /* renamed from: P, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38796P;

    private J3(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N Guideline guideline, @androidx.annotation.N I1 i12, @androidx.annotation.N ImageView imageView, @androidx.annotation.N LinearLayout linearLayout, @androidx.annotation.N TextView textView, @androidx.annotation.N TextView textView2, @androidx.annotation.N TextView textView3, @androidx.annotation.N TextView textView4, @androidx.annotation.N TextView textView5, @androidx.annotation.N TextView textView6, @androidx.annotation.N TextView textView7) {
        this.f38785E = constraintLayout;
        this.f38786F = guideline;
        this.f38787G = i12;
        this.f38788H = imageView;
        this.f38789I = linearLayout;
        this.f38790J = textView;
        this.f38791K = textView2;
        this.f38792L = textView3;
        this.f38793M = textView4;
        this.f38794N = textView5;
        this.f38795O = textView6;
        this.f38796P = textView7;
    }

    @androidx.annotation.N
    public static J3 a(@androidx.annotation.N View view) {
        View a4;
        int i4 = j.h.u5;
        Guideline guideline = (Guideline) C2067c.a(view, i4);
        if (guideline != null && (a4 = C2067c.a(view, (i4 = j.h.x5))) != null) {
            I1 a5 = I1.a(a4);
            i4 = j.h.u6;
            ImageView imageView = (ImageView) C2067c.a(view, i4);
            if (imageView != null) {
                i4 = j.h.C8;
                LinearLayout linearLayout = (LinearLayout) C2067c.a(view, i4);
                if (linearLayout != null) {
                    i4 = j.h.Q9;
                    TextView textView = (TextView) C2067c.a(view, i4);
                    if (textView != null) {
                        i4 = j.h.Kd;
                        TextView textView2 = (TextView) C2067c.a(view, i4);
                        if (textView2 != null) {
                            i4 = j.h.jj;
                            TextView textView3 = (TextView) C2067c.a(view, i4);
                            if (textView3 != null) {
                                i4 = j.h.mj;
                                TextView textView4 = (TextView) C2067c.a(view, i4);
                                if (textView4 != null) {
                                    i4 = j.h.vj;
                                    TextView textView5 = (TextView) C2067c.a(view, i4);
                                    if (textView5 != null) {
                                        i4 = j.h.wj;
                                        TextView textView6 = (TextView) C2067c.a(view, i4);
                                        if (textView6 != null) {
                                            i4 = j.h.Sj;
                                            TextView textView7 = (TextView) C2067c.a(view, i4);
                                            if (textView7 != null) {
                                                return new J3((ConstraintLayout) view, guideline, a5, imageView, linearLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
    public static J3 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static J3 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41413L2, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f38785E;
    }
}
