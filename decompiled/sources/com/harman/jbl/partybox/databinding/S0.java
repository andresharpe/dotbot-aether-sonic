package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class S0 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39025E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39026F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39027G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final F1 f39028H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39029I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39030J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39031K;

    private S0(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N TextView textView, @androidx.annotation.N TextView textView2, @androidx.annotation.N F1 f12, @androidx.annotation.N TextView textView3, @androidx.annotation.N TextView textView4, @androidx.annotation.N TextView textView5) {
        this.f39025E = constraintLayout;
        this.f39026F = textView;
        this.f39027G = textView2;
        this.f39028H = f12;
        this.f39029I = textView3;
        this.f39030J = textView4;
        this.f39031K = textView5;
    }

    @androidx.annotation.N
    public static S0 a(@androidx.annotation.N View view) {
        View a4;
        int i4 = j.h.b5;
        TextView textView = (TextView) C2067c.a(view, i4);
        if (textView != null) {
            i4 = j.h.c5;
            TextView textView2 = (TextView) C2067c.a(view, i4);
            if (textView2 != null && (a4 = C2067c.a(view, (i4 = j.h.x5))) != null) {
                F1 a5 = F1.a(a4);
                i4 = j.h.kb;
                TextView textView3 = (TextView) C2067c.a(view, i4);
                if (textView3 != null) {
                    i4 = j.h.xb;
                    TextView textView4 = (TextView) C2067c.a(view, i4);
                    if (textView4 != null) {
                        i4 = j.h.kg;
                        TextView textView5 = (TextView) C2067c.a(view, i4);
                        if (textView5 != null) {
                            return new S0((ConstraintLayout) view, textView, textView2, a5, textView3, textView4, textView5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static S0 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static S0 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41391G0, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39025E;
    }
}
