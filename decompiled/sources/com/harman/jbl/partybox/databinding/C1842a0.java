package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1842a0 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39321E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39322F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final F1 f39323G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f39324H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39325I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39326J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39327K;

    private C1842a0(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N TextView textView, @androidx.annotation.N F1 f12, @androidx.annotation.N LinearLayout linearLayout, @androidx.annotation.N TextView textView2, @androidx.annotation.N TextView textView3, @androidx.annotation.N TextView textView4) {
        this.f39321E = constraintLayout;
        this.f39322F = textView;
        this.f39323G = f12;
        this.f39324H = linearLayout;
        this.f39325I = textView2;
        this.f39326J = textView3;
        this.f39327K = textView4;
    }

    @androidx.annotation.N
    public static C1842a0 a(@androidx.annotation.N View view) {
        View a4;
        int i4 = j.h.h5;
        TextView textView = (TextView) C2067c.a(view, i4);
        if (textView != null && (a4 = C2067c.a(view, (i4 = j.h.x5))) != null) {
            F1 a5 = F1.a(a4);
            i4 = j.h.Ec;
            LinearLayout linearLayout = (LinearLayout) C2067c.a(view, i4);
            if (linearLayout != null) {
                i4 = j.h.ad;
                TextView textView2 = (TextView) C2067c.a(view, i4);
                if (textView2 != null) {
                    i4 = j.h.ji;
                    TextView textView3 = (TextView) C2067c.a(view, i4);
                    if (textView3 != null) {
                        i4 = j.h.ki;
                        TextView textView4 = (TextView) C2067c.a(view, i4);
                        if (textView4 != null) {
                            return new C1842a0((ConstraintLayout) view, textView, a5, linearLayout, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1842a0 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1842a0 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41434R, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39321E;
    }
}
