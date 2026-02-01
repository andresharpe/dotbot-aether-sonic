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

/* renamed from: com.harman.jbl.partybox.databinding.g2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1874g2 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39611E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f39612F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f39613G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39614H;

    private C1874g2(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N LinearLayout linearLayout, @androidx.annotation.N LinearLayout linearLayout2, @androidx.annotation.N TextView textView) {
        this.f39611E = constraintLayout;
        this.f39612F = linearLayout;
        this.f39613G = linearLayout2;
        this.f39614H = textView;
    }

    @androidx.annotation.N
    public static C1874g2 a(@androidx.annotation.N View view) {
        int i4 = j.h.H8;
        LinearLayout linearLayout = (LinearLayout) C2067c.a(view, i4);
        if (linearLayout != null) {
            i4 = j.h.J9;
            LinearLayout linearLayout2 = (LinearLayout) C2067c.a(view, i4);
            if (linearLayout2 != null) {
                i4 = j.h.Ai;
                TextView textView = (TextView) C2067c.a(view, i4);
                if (textView != null) {
                    return new C1874g2((ConstraintLayout) view, linearLayout, linearLayout2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1874g2 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1874g2 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41392G1, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39611E;
    }
}
