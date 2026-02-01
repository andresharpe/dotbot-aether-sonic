package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.y1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1962y1 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f40335E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final RecyclerView f40336F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f40337G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f40338H;

    private C1962y1(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N RecyclerView recyclerView, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView2) {
        this.f40335E = constraintLayout;
        this.f40336F = recyclerView;
        this.f40337G = hmCustomFontTextView;
        this.f40338H = hmCustomFontTextView2;
    }

    @androidx.annotation.N
    public static C1962y1 a(@androidx.annotation.N View view) {
        int i4 = j.h.Fd;
        RecyclerView recyclerView = (RecyclerView) C2067c.a(view, i4);
        if (recyclerView != null) {
            i4 = j.h.Vg;
            HmCustomFontTextView hmCustomFontTextView = (HmCustomFontTextView) C2067c.a(view, i4);
            if (hmCustomFontTextView != null) {
                i4 = j.h.Ih;
                HmCustomFontTextView hmCustomFontTextView2 = (HmCustomFontTextView) C2067c.a(view, i4);
                if (hmCustomFontTextView2 != null) {
                    return new C1962y1((ConstraintLayout) view, recyclerView, hmCustomFontTextView, hmCustomFontTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1962y1 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1962y1 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41492f1, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f40335E;
    }
}
