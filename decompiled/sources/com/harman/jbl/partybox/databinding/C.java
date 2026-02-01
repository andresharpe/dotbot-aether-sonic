package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class C implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f38502E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f38503F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38504G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38505H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38506I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final ProgressBar f38507J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38508K;

    private C(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N TextView textView, @androidx.annotation.N ImageView imageView, @androidx.annotation.N TextView textView2, @androidx.annotation.N ProgressBar progressBar, @androidx.annotation.N TextView textView3) {
        this.f38502E = constraintLayout;
        this.f38503F = constraintLayout2;
        this.f38504G = textView;
        this.f38505H = imageView;
        this.f38506I = textView2;
        this.f38507J = progressBar;
        this.f38508K = textView3;
    }

    @androidx.annotation.N
    public static C a(@androidx.annotation.N View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i4 = j.h.f41267e3;
        TextView textView = (TextView) C2067c.a(view, i4);
        if (textView != null) {
            i4 = j.h.q6;
            ImageView imageView = (ImageView) C2067c.a(view, i4);
            if (imageView != null) {
                i4 = j.h.yb;
                TextView textView2 = (TextView) C2067c.a(view, i4);
                if (textView2 != null) {
                    i4 = j.h.gd;
                    ProgressBar progressBar = (ProgressBar) C2067c.a(view, i4);
                    if (progressBar != null) {
                        i4 = j.h.Ai;
                        TextView textView3 = (TextView) C2067c.a(view, i4);
                        if (textView3 != null) {
                            return new C(constraintLayout, constraintLayout, textView, imageView, textView2, progressBar, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41566y, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f38502E;
    }
}
