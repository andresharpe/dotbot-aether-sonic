package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.widget.CollapsingToolBar;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1892k0 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final CoordinatorLayout f39759E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final CollapsingToolBar f39760F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final CoordinatorLayout f39761G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39762H;

    private C1892k0(@androidx.annotation.N CoordinatorLayout coordinatorLayout, @androidx.annotation.N CollapsingToolBar collapsingToolBar, @androidx.annotation.N CoordinatorLayout coordinatorLayout2, @androidx.annotation.N TextView textView) {
        this.f39759E = coordinatorLayout;
        this.f39760F = collapsingToolBar;
        this.f39761G = coordinatorLayout2;
        this.f39762H = textView;
    }

    @androidx.annotation.N
    public static C1892k0 a(@androidx.annotation.N View view) {
        int i4 = j.h.f41357x2;
        CollapsingToolBar collapsingToolBar = (CollapsingToolBar) C2067c.a(view, i4);
        if (collapsingToolBar != null) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
            int i5 = j.h.Jg;
            TextView textView = (TextView) C2067c.a(view, i5);
            if (textView != null) {
                return new C1892k0(coordinatorLayout, collapsingToolBar, coordinatorLayout, textView);
            }
            i4 = i5;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1892k0 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1892k0 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41475b0, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout d() {
        return this.f39759E;
    }
}
