package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class X3 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final RelativeLayout f39217E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39218F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39219G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39220H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39221I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39222J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final RelativeLayout f39223K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39224L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39225M;

    /* renamed from: N, reason: collision with root package name */
    @androidx.annotation.N
    public final RelativeLayout f39226N;

    /* renamed from: O, reason: collision with root package name */
    @androidx.annotation.N
    public final RelativeLayout f39227O;

    /* renamed from: P, reason: collision with root package name */
    @androidx.annotation.N
    public final View f39228P;

    private X3(@androidx.annotation.N RelativeLayout relativeLayout, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N ImageView imageView3, @androidx.annotation.N ImageView imageView4, @androidx.annotation.N TextView textView, @androidx.annotation.N RelativeLayout relativeLayout2, @androidx.annotation.N ImageView imageView5, @androidx.annotation.N ImageView imageView6, @androidx.annotation.N RelativeLayout relativeLayout3, @androidx.annotation.N RelativeLayout relativeLayout4, @androidx.annotation.N View view) {
        this.f39217E = relativeLayout;
        this.f39218F = imageView;
        this.f39219G = imageView2;
        this.f39220H = imageView3;
        this.f39221I = imageView4;
        this.f39222J = textView;
        this.f39223K = relativeLayout2;
        this.f39224L = imageView5;
        this.f39225M = imageView6;
        this.f39226N = relativeLayout3;
        this.f39227O = relativeLayout4;
        this.f39228P = view;
    }

    @androidx.annotation.N
    public static X3 a(@androidx.annotation.N View view) {
        View a4;
        int i4 = j.h.vf;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = j.h.wf;
            ImageView imageView2 = (ImageView) C2067c.a(view, i4);
            if (imageView2 != null) {
                i4 = j.h.xf;
                ImageView imageView3 = (ImageView) C2067c.a(view, i4);
                if (imageView3 != null) {
                    i4 = j.h.Af;
                    ImageView imageView4 = (ImageView) C2067c.a(view, i4);
                    if (imageView4 != null) {
                        i4 = j.h.Bf;
                        TextView textView = (TextView) C2067c.a(view, i4);
                        if (textView != null) {
                            i4 = j.h.Cf;
                            RelativeLayout relativeLayout = (RelativeLayout) C2067c.a(view, i4);
                            if (relativeLayout != null) {
                                i4 = j.h.Ff;
                                ImageView imageView5 = (ImageView) C2067c.a(view, i4);
                                if (imageView5 != null) {
                                    i4 = j.h.Gf;
                                    ImageView imageView6 = (ImageView) C2067c.a(view, i4);
                                    if (imageView6 != null) {
                                        i4 = j.h.Hf;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) C2067c.a(view, i4);
                                        if (relativeLayout2 != null) {
                                            i4 = j.h.Ii;
                                            RelativeLayout relativeLayout3 = (RelativeLayout) C2067c.a(view, i4);
                                            if (relativeLayout3 != null && (a4 = C2067c.a(view, (i4 = j.h.zj))) != null) {
                                                return new X3((RelativeLayout) view, imageView, imageView2, imageView3, imageView4, textView, relativeLayout, imageView5, imageView6, relativeLayout2, relativeLayout3, a4);
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
    public static X3 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static X3 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41469Z2, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout d() {
        return this.f39217E;
    }
}
