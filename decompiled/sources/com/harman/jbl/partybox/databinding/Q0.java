package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class Q0 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f38986E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final FragmentContainerView f38987F;

    private Q0(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N FragmentContainerView fragmentContainerView) {
        this.f38986E = constraintLayout;
        this.f38987F = fragmentContainerView;
    }

    @androidx.annotation.N
    public static Q0 a(@androidx.annotation.N View view) {
        int i4 = j.h.pb;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) C2067c.a(view, i4);
        if (fragmentContainerView != null) {
            return new Q0((ConstraintLayout) view, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static Q0 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static Q0 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41383E0, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f38986E;
    }
}
