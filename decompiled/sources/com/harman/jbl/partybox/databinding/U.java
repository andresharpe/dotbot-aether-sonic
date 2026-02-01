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
public final class U implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39099E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39100F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39101G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39102H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39103I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39104J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39105K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39106L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39107M;

    /* renamed from: N, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39108N;

    /* renamed from: O, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39109O;

    /* renamed from: P, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39110P;

    private U(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N ImageView imageView3, @androidx.annotation.N ImageView imageView4, @androidx.annotation.N TextView textView, @androidx.annotation.N ImageView imageView5, @androidx.annotation.N ConstraintLayout constraintLayout3, @androidx.annotation.N ConstraintLayout constraintLayout4, @androidx.annotation.N TextView textView2, @androidx.annotation.N TextView textView3) {
        this.f39099E = constraintLayout;
        this.f39100F = imageView;
        this.f39101G = constraintLayout2;
        this.f39102H = imageView2;
        this.f39103I = imageView3;
        this.f39104J = imageView4;
        this.f39105K = textView;
        this.f39106L = imageView5;
        this.f39107M = constraintLayout3;
        this.f39108N = constraintLayout4;
        this.f39109O = textView2;
        this.f39110P = textView3;
    }

    @androidx.annotation.N
    public static U a(@androidx.annotation.N View view) {
        int i4 = j.h.f41349v2;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i4 = j.h.q6;
            ImageView imageView2 = (ImageView) C2067c.a(view, i4);
            if (imageView2 != null) {
                i4 = j.h.j7;
                ImageView imageView3 = (ImageView) C2067c.a(view, i4);
                if (imageView3 != null) {
                    i4 = j.h.l7;
                    ImageView imageView4 = (ImageView) C2067c.a(view, i4);
                    if (imageView4 != null) {
                        i4 = j.h.K7;
                        TextView textView = (TextView) C2067c.a(view, i4);
                        if (textView != null) {
                            i4 = j.h.N7;
                            ImageView imageView5 = (ImageView) C2067c.a(view, i4);
                            if (imageView5 != null) {
                                i4 = j.h.R8;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) C2067c.a(view, i4);
                                if (constraintLayout2 != null) {
                                    i4 = j.h.U8;
                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) C2067c.a(view, i4);
                                    if (constraintLayout3 != null) {
                                        i4 = j.h.Ob;
                                        TextView textView2 = (TextView) C2067c.a(view, i4);
                                        if (textView2 != null) {
                                            i4 = j.h.qi;
                                            TextView textView3 = (TextView) C2067c.a(view, i4);
                                            if (textView3 != null) {
                                                return new U(constraintLayout, imageView, constraintLayout, imageView2, imageView3, imageView4, textView, imageView5, constraintLayout2, constraintLayout3, textView2, textView3);
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
    public static U c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static U e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41410L, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39099E;
    }
}
