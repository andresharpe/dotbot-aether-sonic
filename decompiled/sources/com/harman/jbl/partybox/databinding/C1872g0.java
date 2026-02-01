package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.widget.CollapsingToolBar;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1872g0 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final CoordinatorLayout f39593E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final CollapsingToolBar f39594F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final RecyclerView f39595G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final CoordinatorLayout f39596H;

    private C1872g0(@androidx.annotation.N CoordinatorLayout coordinatorLayout, @androidx.annotation.N CollapsingToolBar collapsingToolBar, @androidx.annotation.N RecyclerView recyclerView, @androidx.annotation.N CoordinatorLayout coordinatorLayout2) {
        this.f39593E = coordinatorLayout;
        this.f39594F = collapsingToolBar;
        this.f39595G = recyclerView;
        this.f39596H = coordinatorLayout2;
    }

    @androidx.annotation.N
    public static C1872g0 a(@androidx.annotation.N View view) {
        int i4 = j.h.f41357x2;
        CollapsingToolBar collapsingToolBar = (CollapsingToolBar) C2067c.a(view, i4);
        if (collapsingToolBar != null) {
            i4 = j.h.o5;
            RecyclerView recyclerView = (RecyclerView) C2067c.a(view, i4);
            if (recyclerView != null) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                return new C1872g0(coordinatorLayout, collapsingToolBar, recyclerView, coordinatorLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1872g0 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1872g0 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41458X, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout d() {
        return this.f39593E;
    }
}
