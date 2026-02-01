package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.t1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1937t1 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f40156E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f40157F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final View f40158G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final AppCompatImageView f40159H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f40160I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40161J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final C1855c3 f40162K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final AppCompatImageView f40163L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f40164M;

    /* renamed from: N, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f40165N;

    /* renamed from: O, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40166O;

    /* renamed from: P, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40167P;

    /* renamed from: Q, reason: collision with root package name */
    @androidx.annotation.N
    public final View f40168Q;

    /* renamed from: R, reason: collision with root package name */
    @androidx.annotation.N
    public final View f40169R;

    private C1937t1(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N View view, @androidx.annotation.N AppCompatImageView appCompatImageView, @androidx.annotation.N ConstraintLayout constraintLayout3, @androidx.annotation.N TextView textView, @androidx.annotation.N C1855c3 c1855c3, @androidx.annotation.N AppCompatImageView appCompatImageView2, @androidx.annotation.N ConstraintLayout constraintLayout4, @androidx.annotation.N ConstraintLayout constraintLayout5, @androidx.annotation.N TextView textView2, @androidx.annotation.N TextView textView3, @androidx.annotation.N View view2, @androidx.annotation.N View view3) {
        this.f40156E = constraintLayout;
        this.f40157F = constraintLayout2;
        this.f40158G = view;
        this.f40159H = appCompatImageView;
        this.f40160I = constraintLayout3;
        this.f40161J = textView;
        this.f40162K = c1855c3;
        this.f40163L = appCompatImageView2;
        this.f40164M = constraintLayout4;
        this.f40165N = constraintLayout5;
        this.f40166O = textView2;
        this.f40167P = textView3;
        this.f40168Q = view2;
        this.f40169R = view3;
    }

    @androidx.annotation.N
    public static C1937t1 a(@androidx.annotation.N View view) {
        View a4;
        View a5;
        View a6;
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i4 = j.h.tb;
        View a7 = C2067c.a(view, i4);
        if (a7 != null) {
            i4 = j.h.Tb;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2067c.a(view, i4);
            if (appCompatImageView != null) {
                i4 = j.h.Vb;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) C2067c.a(view, i4);
                if (constraintLayout2 != null) {
                    i4 = j.h.pd;
                    TextView textView = (TextView) C2067c.a(view, i4);
                    if (textView != null && (a4 = C2067c.a(view, (i4 = j.h.zf))) != null) {
                        C1855c3 a8 = C1855c3.a(a4);
                        i4 = j.h.bg;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) C2067c.a(view, i4);
                        if (appCompatImageView2 != null) {
                            i4 = j.h.eg;
                            ConstraintLayout constraintLayout3 = (ConstraintLayout) C2067c.a(view, i4);
                            if (constraintLayout3 != null) {
                                i4 = j.h.Mi;
                                ConstraintLayout constraintLayout4 = (ConstraintLayout) C2067c.a(view, i4);
                                if (constraintLayout4 != null) {
                                    i4 = j.h.Ui;
                                    TextView textView2 = (TextView) C2067c.a(view, i4);
                                    if (textView2 != null) {
                                        i4 = j.h.Xi;
                                        TextView textView3 = (TextView) C2067c.a(view, i4);
                                        if (textView3 != null && (a5 = C2067c.a(view, (i4 = j.h.yj))) != null && (a6 = C2067c.a(view, (i4 = j.h.Bj))) != null) {
                                            return new C1937t1(constraintLayout, constraintLayout, a7, appCompatImageView, constraintLayout2, textView, a8, appCompatImageView2, constraintLayout3, constraintLayout4, textView2, textView3, a5, a6);
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
    public static C1937t1 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1937t1 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41476b1, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f40156E;
    }
}
