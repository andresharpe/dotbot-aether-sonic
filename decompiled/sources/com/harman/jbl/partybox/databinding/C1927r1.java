package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.r1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1927r1 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f40075E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f40076F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40077G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f40078H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40079I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f40080J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final AppCompatRadioButton f40081K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final AppCompatRadioButton f40082L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.N
    public final AppCompatRadioButton f40083M;

    /* renamed from: N, reason: collision with root package name */
    @androidx.annotation.N
    public final AppCompatRadioButton f40084N;

    /* renamed from: O, reason: collision with root package name */
    @androidx.annotation.N
    public final AppCompatRadioButton f40085O;

    /* renamed from: P, reason: collision with root package name */
    @androidx.annotation.N
    public final AppCompatRadioButton f40086P;

    /* renamed from: Q, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f40087Q;

    private C1927r1(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N ImageView imageView, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView2, @androidx.annotation.N AppCompatRadioButton appCompatRadioButton, @androidx.annotation.N AppCompatRadioButton appCompatRadioButton2, @androidx.annotation.N AppCompatRadioButton appCompatRadioButton3, @androidx.annotation.N AppCompatRadioButton appCompatRadioButton4, @androidx.annotation.N AppCompatRadioButton appCompatRadioButton5, @androidx.annotation.N AppCompatRadioButton appCompatRadioButton6, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView3) {
        this.f40075E = constraintLayout;
        this.f40076F = constraintLayout2;
        this.f40077G = imageView;
        this.f40078H = hmCustomFontTextView;
        this.f40079I = imageView2;
        this.f40080J = hmCustomFontTextView2;
        this.f40081K = appCompatRadioButton;
        this.f40082L = appCompatRadioButton2;
        this.f40083M = appCompatRadioButton3;
        this.f40084N = appCompatRadioButton4;
        this.f40085O = appCompatRadioButton5;
        this.f40086P = appCompatRadioButton6;
        this.f40087Q = hmCustomFontTextView3;
    }

    @androidx.annotation.N
    public static C1927r1 a(@androidx.annotation.N View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i4 = j.h.na;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = j.h.xa;
            HmCustomFontTextView hmCustomFontTextView = (HmCustomFontTextView) C2067c.a(view, i4);
            if (hmCustomFontTextView != null) {
                i4 = j.h.zc;
                ImageView imageView2 = (ImageView) C2067c.a(view, i4);
                if (imageView2 != null) {
                    i4 = j.h.Dc;
                    HmCustomFontTextView hmCustomFontTextView2 = (HmCustomFontTextView) C2067c.a(view, i4);
                    if (hmCustomFontTextView2 != null) {
                        i4 = j.h.rd;
                        AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) C2067c.a(view, i4);
                        if (appCompatRadioButton != null) {
                            i4 = j.h.sd;
                            AppCompatRadioButton appCompatRadioButton2 = (AppCompatRadioButton) C2067c.a(view, i4);
                            if (appCompatRadioButton2 != null) {
                                i4 = j.h.td;
                                AppCompatRadioButton appCompatRadioButton3 = (AppCompatRadioButton) C2067c.a(view, i4);
                                if (appCompatRadioButton3 != null) {
                                    i4 = j.h.ud;
                                    AppCompatRadioButton appCompatRadioButton4 = (AppCompatRadioButton) C2067c.a(view, i4);
                                    if (appCompatRadioButton4 != null) {
                                        i4 = j.h.vd;
                                        AppCompatRadioButton appCompatRadioButton5 = (AppCompatRadioButton) C2067c.a(view, i4);
                                        if (appCompatRadioButton5 != null) {
                                            i4 = j.h.wd;
                                            AppCompatRadioButton appCompatRadioButton6 = (AppCompatRadioButton) C2067c.a(view, i4);
                                            if (appCompatRadioButton6 != null) {
                                                i4 = j.h.Vg;
                                                HmCustomFontTextView hmCustomFontTextView3 = (HmCustomFontTextView) C2067c.a(view, i4);
                                                if (hmCustomFontTextView3 != null) {
                                                    return new C1927r1(constraintLayout, constraintLayout, imageView, hmCustomFontTextView, imageView2, hmCustomFontTextView2, appCompatRadioButton, appCompatRadioButton2, appCompatRadioButton3, appCompatRadioButton4, appCompatRadioButton5, appCompatRadioButton6, hmCustomFontTextView3);
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
    public static C1927r1 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1927r1 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41467Z0, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f40075E;
    }
}
