package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import com.harman.jbl.partybox.j;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1876h implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final FragmentContainerView f39618E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final FragmentContainerView f39619F;

    private C1876h(@androidx.annotation.N FragmentContainerView fragmentContainerView, @androidx.annotation.N FragmentContainerView fragmentContainerView2) {
        this.f39618E = fragmentContainerView;
        this.f39619F = fragmentContainerView2;
    }

    @androidx.annotation.N
    public static C1876h a(@androidx.annotation.N View view) {
        if (view != null) {
            FragmentContainerView fragmentContainerView = (FragmentContainerView) view;
            return new C1876h(fragmentContainerView, fragmentContainerView);
        }
        throw new NullPointerException("rootView");
    }

    @androidx.annotation.N
    public static C1876h c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1876h e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41498h, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FragmentContainerView d() {
        return this.f39618E;
    }
}
