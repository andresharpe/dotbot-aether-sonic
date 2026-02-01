package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class V implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39144E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final RecyclerView f39145F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39146G;

    private V(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N RecyclerView recyclerView, @androidx.annotation.N TextView textView) {
        this.f39144E = constraintLayout;
        this.f39145F = recyclerView;
        this.f39146G = textView;
    }

    @androidx.annotation.N
    public static V a(@androidx.annotation.N View view) {
        int i4 = j.h.f41241Z1;
        RecyclerView recyclerView = (RecyclerView) C2067c.a(view, i4);
        if (recyclerView != null) {
            i4 = j.h.Nb;
            TextView textView = (TextView) C2067c.a(view, i4);
            if (textView != null) {
                return new V((ConstraintLayout) view, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static V c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static V e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41414M, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39144E;
    }
}
