package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class E0 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f38566E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38567F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f38568G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38569H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final RecyclerView f38570I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38571J;

    private E0(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N TextView textView, @androidx.annotation.N LinearLayout linearLayout, @androidx.annotation.N TextView textView2, @androidx.annotation.N RecyclerView recyclerView, @androidx.annotation.N TextView textView3) {
        this.f38566E = constraintLayout;
        this.f38567F = textView;
        this.f38568G = linearLayout;
        this.f38569H = textView2;
        this.f38570I = recyclerView;
        this.f38571J = textView3;
    }

    @androidx.annotation.N
    public static E0 a(@androidx.annotation.N View view) {
        int i4 = j.h.J3;
        TextView textView = (TextView) C2067c.a(view, i4);
        if (textView != null) {
            i4 = j.h.d5;
            LinearLayout linearLayout = (LinearLayout) C2067c.a(view, i4);
            if (linearLayout != null) {
                i4 = j.h.e5;
                TextView textView2 = (TextView) C2067c.a(view, i4);
                if (textView2 != null) {
                    i4 = j.h.ua;
                    RecyclerView recyclerView = (RecyclerView) C2067c.a(view, i4);
                    if (recyclerView != null) {
                        i4 = j.h.va;
                        TextView textView3 = (TextView) C2067c.a(view, i4);
                        if (textView3 != null) {
                            return new E0((ConstraintLayout) view, textView, linearLayout, textView2, recyclerView, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static E0 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static E0 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41543s0, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f38566E;
    }
}
