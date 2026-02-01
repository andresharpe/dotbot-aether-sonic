package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.InterfaceC0878c;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.party.auracast.AuracastFragment;
import com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel;

/* loaded from: classes2.dex */
public abstract class Y2 extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final AbstractC1948v2 f39254j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final AbstractC1948v2 f39255k0;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.N
    public final AbstractC1948v2 f39256l0;

    /* renamed from: m0, reason: collision with root package name */
    @androidx.annotation.N
    public final AbstractC1948v2 f39257m0;

    /* renamed from: n0, reason: collision with root package name */
    @androidx.annotation.N
    public final AbstractC1948v2 f39258n0;

    /* renamed from: o0, reason: collision with root package name */
    @androidx.annotation.N
    public final Guideline f39259o0;

    /* renamed from: p0, reason: collision with root package name */
    @androidx.annotation.N
    public final Guideline f39260p0;

    /* renamed from: q0, reason: collision with root package name */
    @androidx.annotation.N
    public final H2 f39261q0;

    /* renamed from: r0, reason: collision with root package name */
    @InterfaceC0878c
    protected AuracastViewModel f39262r0;

    /* renamed from: s0, reason: collision with root package name */
    @InterfaceC0878c
    protected AuracastFragment f39263s0;

    /* JADX INFO: Access modifiers changed from: protected */
    public Y2(Object obj, View view, int i4, AbstractC1948v2 abstractC1948v2, AbstractC1948v2 abstractC1948v22, AbstractC1948v2 abstractC1948v23, AbstractC1948v2 abstractC1948v24, AbstractC1948v2 abstractC1948v25, Guideline guideline, Guideline guideline2, H2 h22) {
        super(obj, view, i4);
        this.f39254j0 = abstractC1948v2;
        this.f39255k0 = abstractC1948v22;
        this.f39256l0 = abstractC1948v23;
        this.f39257m0 = abstractC1948v24;
        this.f39258n0 = abstractC1948v25;
        this.f39259o0 = guideline;
        this.f39260p0 = guideline2;
        this.f39261q0 = h22;
    }

    public static Y2 o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static Y2 p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (Y2) ViewDataBinding.r(obj, view, j.i.f41509j2);
    }

    @androidx.annotation.N
    public static Y2 s1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return v1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static Y2 t1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return u1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static Y2 u1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (Y2) ViewDataBinding.i0(layoutInflater, j.i.f41509j2, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static Y2 v1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (Y2) ViewDataBinding.i0(layoutInflater, j.i.f41509j2, null, false, obj);
    }

    @androidx.annotation.P
    public AuracastViewModel q1() {
        return this.f39262r0;
    }

    @androidx.annotation.P
    public AuracastFragment r1() {
        return this.f39263s0;
    }

    public abstract void w1(@androidx.annotation.P AuracastViewModel auracastViewModel);

    public abstract void x1(@androidx.annotation.P AuracastFragment auracastFragment);
}
