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
public final class Q implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f38976E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38977F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final F1 f38978G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38979H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38980I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38981J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f38982K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f38983L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38984M;

    /* renamed from: N, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38985N;

    private Q(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N TextView textView, @androidx.annotation.N F1 f12, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N ImageView imageView3, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N ConstraintLayout constraintLayout3, @androidx.annotation.N TextView textView2, @androidx.annotation.N TextView textView3) {
        this.f38976E = constraintLayout;
        this.f38977F = textView;
        this.f38978G = f12;
        this.f38979H = imageView;
        this.f38980I = imageView2;
        this.f38981J = imageView3;
        this.f38982K = constraintLayout2;
        this.f38983L = constraintLayout3;
        this.f38984M = textView2;
        this.f38985N = textView3;
    }

    @androidx.annotation.N
    public static Q a(@androidx.annotation.N View view) {
        View a4;
        int i4 = j.h.f41182K2;
        TextView textView = (TextView) C2067c.a(view, i4);
        if (textView != null && (a4 = C2067c.a(view, (i4 = j.h.x5))) != null) {
            F1 a5 = F1.a(a4);
            i4 = j.h.a7;
            ImageView imageView = (ImageView) C2067c.a(view, i4);
            if (imageView != null) {
                i4 = j.h.F7;
                ImageView imageView2 = (ImageView) C2067c.a(view, i4);
                if (imageView2 != null) {
                    i4 = j.h.R7;
                    ImageView imageView3 = (ImageView) C2067c.a(view, i4);
                    if (imageView3 != null) {
                        i4 = j.h.a9;
                        ConstraintLayout constraintLayout = (ConstraintLayout) C2067c.a(view, i4);
                        if (constraintLayout != null) {
                            i4 = j.h.b9;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) C2067c.a(view, i4);
                            if (constraintLayout2 != null) {
                                i4 = j.h.wi;
                                TextView textView2 = (TextView) C2067c.a(view, i4);
                                if (textView2 != null) {
                                    i4 = j.h.xi;
                                    TextView textView3 = (TextView) C2067c.a(view, i4);
                                    if (textView3 != null) {
                                        return new Q((ConstraintLayout) view, textView, a5, imageView, imageView2, imageView3, constraintLayout, constraintLayout2, textView2, textView3);
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
    public static Q c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static Q e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41398I, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f38976E;
    }
}
