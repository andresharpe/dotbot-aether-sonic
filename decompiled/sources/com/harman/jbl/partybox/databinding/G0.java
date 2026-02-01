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
import com.harman.jbl.partybox.ui.widget.ProgressLayout;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class G0 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final LinearLayoutCompat f38635E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final I1 f38636F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f38637G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38638H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final ProgressLayout f38639I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38640J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final FrameLayout f38641K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38642L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38643M;

    /* renamed from: N, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38644N;

    /* renamed from: O, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38645O;

    private G0(@androidx.annotation.N LinearLayoutCompat linearLayoutCompat, @androidx.annotation.N I1 i12, @androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ProgressLayout progressLayout, @androidx.annotation.N TextView textView, @androidx.annotation.N FrameLayout frameLayout, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N TextView textView2, @androidx.annotation.N TextView textView3, @androidx.annotation.N TextView textView4) {
        this.f38635E = linearLayoutCompat;
        this.f38636F = i12;
        this.f38637G = constraintLayout;
        this.f38638H = imageView;
        this.f38639I = progressLayout;
        this.f38640J = textView;
        this.f38641K = frameLayout;
        this.f38642L = imageView2;
        this.f38643M = textView2;
        this.f38644N = textView3;
        this.f38645O = textView4;
    }

    @androidx.annotation.N
    public static G0 a(@androidx.annotation.N View view) {
        int i4 = j.h.x5;
        View a4 = C2067c.a(view, i4);
        if (a4 != null) {
            I1 a5 = I1.a(a4);
            i4 = j.h.P6;
            ConstraintLayout constraintLayout = (ConstraintLayout) C2067c.a(view, i4);
            if (constraintLayout != null) {
                i4 = j.h.X7;
                ImageView imageView = (ImageView) C2067c.a(view, i4);
                if (imageView != null) {
                    i4 = j.h.jd;
                    ProgressLayout progressLayout = (ProgressLayout) C2067c.a(view, i4);
                    if (progressLayout != null) {
                        i4 = j.h.Sd;
                        TextView textView = (TextView) C2067c.a(view, i4);
                        if (textView != null) {
                            i4 = j.h.Vd;
                            FrameLayout frameLayout = (FrameLayout) C2067c.a(view, i4);
                            if (frameLayout != null) {
                                i4 = j.h.ij;
                                ImageView imageView2 = (ImageView) C2067c.a(view, i4);
                                if (imageView2 != null) {
                                    i4 = j.h.nj;
                                    TextView textView2 = (TextView) C2067c.a(view, i4);
                                    if (textView2 != null) {
                                        i4 = j.h.oj;
                                        TextView textView3 = (TextView) C2067c.a(view, i4);
                                        if (textView3 != null) {
                                            i4 = j.h.pj;
                                            TextView textView4 = (TextView) C2067c.a(view, i4);
                                            if (textView4 != null) {
                                                return new G0((LinearLayoutCompat) view, a5, constraintLayout, imageView, progressLayout, textView, frameLayout, imageView2, textView2, textView3, textView4);
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
    public static G0 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static G0 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41551u0, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat d() {
        return this.f38635E;
    }
}
