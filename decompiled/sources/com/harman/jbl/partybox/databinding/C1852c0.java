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

/* renamed from: com.harman.jbl.partybox.databinding.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1852c0 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39382E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39383F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39384G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39385H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39386I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39387J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39388K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39389L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39390M;

    /* renamed from: N, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39391N;

    /* renamed from: O, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39392O;

    private C1852c0(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N TextView textView, @androidx.annotation.N TextView textView2, @androidx.annotation.N TextView textView3, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N ImageView imageView3, @androidx.annotation.N ImageView imageView4, @androidx.annotation.N TextView textView4, @androidx.annotation.N TextView textView5) {
        this.f39382E = constraintLayout;
        this.f39383F = textView;
        this.f39384G = textView2;
        this.f39385H = textView3;
        this.f39386I = constraintLayout2;
        this.f39387J = imageView;
        this.f39388K = imageView2;
        this.f39389L = imageView3;
        this.f39390M = imageView4;
        this.f39391N = textView4;
        this.f39392O = textView5;
    }

    @androidx.annotation.N
    public static C1852c0 a(@androidx.annotation.N View view) {
        int i4 = j.h.f41233X1;
        TextView textView = (TextView) C2067c.a(view, i4);
        if (textView != null) {
            i4 = j.h.f41256c2;
            TextView textView2 = (TextView) C2067c.a(view, i4);
            if (textView2 != null) {
                i4 = j.h.f41261d2;
                TextView textView3 = (TextView) C2067c.a(view, i4);
                if (textView3 != null) {
                    i4 = j.h.f41230W2;
                    ConstraintLayout constraintLayout = (ConstraintLayout) C2067c.a(view, i4);
                    if (constraintLayout != null) {
                        i4 = j.h.j5;
                        ImageView imageView = (ImageView) C2067c.a(view, i4);
                        if (imageView != null) {
                            i4 = j.h.k5;
                            ImageView imageView2 = (ImageView) C2067c.a(view, i4);
                            if (imageView2 != null) {
                                i4 = j.h.l5;
                                ImageView imageView3 = (ImageView) C2067c.a(view, i4);
                                if (imageView3 != null) {
                                    i4 = j.h.w6;
                                    ImageView imageView4 = (ImageView) C2067c.a(view, i4);
                                    if (imageView4 != null) {
                                        i4 = j.h.ti;
                                        TextView textView4 = (TextView) C2067c.a(view, i4);
                                        if (textView4 != null) {
                                            i4 = j.h.ui;
                                            TextView textView5 = (TextView) C2067c.a(view, i4);
                                            if (textView5 != null) {
                                                return new C1852c0((ConstraintLayout) view, textView, textView2, textView3, constraintLayout, imageView, imageView2, imageView3, imageView4, textView4, textView5);
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
    public static C1852c0 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1852c0 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41442T, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39382E;
    }
}
