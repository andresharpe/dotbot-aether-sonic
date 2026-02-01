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
public final class O0 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f38924E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38925F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38926G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final I1 f38927H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38928I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38929J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f38930K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38931L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38932M;

    private O0(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ImageView imageView, @androidx.annotation.N TextView textView, @androidx.annotation.N I1 i12, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N ImageView imageView3, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N TextView textView2, @androidx.annotation.N TextView textView3) {
        this.f38924E = constraintLayout;
        this.f38925F = imageView;
        this.f38926G = textView;
        this.f38927H = i12;
        this.f38928I = imageView2;
        this.f38929J = imageView3;
        this.f38930K = constraintLayout2;
        this.f38931L = textView2;
        this.f38932M = textView3;
    }

    @androidx.annotation.N
    public static O0 a(@androidx.annotation.N View view) {
        View a4;
        int i4 = j.h.f41141A1;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = j.h.c5;
            TextView textView = (TextView) C2067c.a(view, i4);
            if (textView != null && (a4 = C2067c.a(view, (i4 = j.h.x5))) != null) {
                I1 a5 = I1.a(a4);
                i4 = j.h.a7;
                ImageView imageView2 = (ImageView) C2067c.a(view, i4);
                if (imageView2 != null) {
                    i4 = j.h.F7;
                    ImageView imageView3 = (ImageView) C2067c.a(view, i4);
                    if (imageView3 != null) {
                        i4 = j.h.w9;
                        ConstraintLayout constraintLayout = (ConstraintLayout) C2067c.a(view, i4);
                        if (constraintLayout != null) {
                            i4 = j.h.ub;
                            TextView textView2 = (TextView) C2067c.a(view, i4);
                            if (textView2 != null) {
                                i4 = j.h.Uh;
                                TextView textView3 = (TextView) C2067c.a(view, i4);
                                if (textView3 != null) {
                                    return new O0((ConstraintLayout) view, imageView, textView, a5, imageView2, imageView3, constraintLayout, textView2, textView3);
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
    public static O0 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static O0 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41375C0, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f38924E;
    }
}
