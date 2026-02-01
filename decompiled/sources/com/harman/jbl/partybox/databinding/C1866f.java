package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1866f implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39528E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final FragmentContainerView f39529F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final View f39530G;

    private C1866f(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N FragmentContainerView fragmentContainerView, @androidx.annotation.N View view) {
        this.f39528E = constraintLayout;
        this.f39529F = fragmentContainerView;
        this.f39530G = view;
    }

    @androidx.annotation.N
    public static C1866f a(@androidx.annotation.N View view) {
        View a4;
        int i4 = j.h.pb;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) C2067c.a(view, i4);
        if (fragmentContainerView != null && (a4 = C2067c.a(view, (i4 = j.h.tj))) != null) {
            return new C1866f((ConstraintLayout) view, fragmentContainerView, a4);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1866f c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1866f e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41490f, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39528E;
    }
}
