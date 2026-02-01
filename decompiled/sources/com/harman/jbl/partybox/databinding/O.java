package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC0878c;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.party.auracast.AuracastFragment;
import com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel;

/* loaded from: classes2.dex */
public abstract class O extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f38913j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38914k0;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.N
    public final K1 f38915l0;

    /* renamed from: m0, reason: collision with root package name */
    @androidx.annotation.N
    public final AbstractC1894k2 f38916m0;

    /* renamed from: n0, reason: collision with root package name */
    @androidx.annotation.N
    public final P2 f38917n0;

    /* renamed from: o0, reason: collision with root package name */
    @androidx.annotation.N
    public final K2.g f38918o0;

    /* renamed from: p0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f38919p0;

    /* renamed from: q0, reason: collision with root package name */
    @InterfaceC0878c
    protected AuracastFragment f38920q0;

    /* renamed from: r0, reason: collision with root package name */
    @InterfaceC0878c
    protected AuracastViewModel f38921r0;

    /* renamed from: s0, reason: collision with root package name */
    @InterfaceC0878c
    protected com.harman.jbl.partybox.ui.party.auracast.ui.e f38922s0;

    /* renamed from: t0, reason: collision with root package name */
    @InterfaceC0878c
    protected com.harman.jbl.partybox.ui.party.auracast.ui.c f38923t0;

    /* JADX INFO: Access modifiers changed from: protected */
    public O(Object obj, View view, int i4, ConstraintLayout constraintLayout, ImageView imageView, K1 k12, AbstractC1894k2 abstractC1894k2, P2 p22, K2.g gVar, HmCustomFontTextView hmCustomFontTextView) {
        super(obj, view, i4);
        this.f38913j0 = constraintLayout;
        this.f38914k0 = imageView;
        this.f38915l0 = k12;
        this.f38916m0 = abstractC1894k2;
        this.f38917n0 = p22;
        this.f38918o0 = gVar;
        this.f38919p0 = hmCustomFontTextView;
    }

    public static O o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static O p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (O) ViewDataBinding.r(obj, view, j.i.f41394H);
    }

    @androidx.annotation.N
    public static O u1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return x1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static O v1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return w1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static O w1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (O) ViewDataBinding.i0(layoutInflater, j.i.f41394H, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static O x1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (O) ViewDataBinding.i0(layoutInflater, j.i.f41394H, null, false, obj);
    }

    public abstract void A1(@androidx.annotation.P com.harman.jbl.partybox.ui.party.auracast.ui.c cVar);

    public abstract void B1(@androidx.annotation.P com.harman.jbl.partybox.ui.party.auracast.ui.e eVar);

    @androidx.annotation.P
    public AuracastViewModel q1() {
        return this.f38921r0;
    }

    @androidx.annotation.P
    public AuracastFragment r1() {
        return this.f38920q0;
    }

    @androidx.annotation.P
    public com.harman.jbl.partybox.ui.party.auracast.ui.c s1() {
        return this.f38923t0;
    }

    @androidx.annotation.P
    public com.harman.jbl.partybox.ui.party.auracast.ui.e t1() {
        return this.f38922s0;
    }

    public abstract void y1(@androidx.annotation.P AuracastViewModel auracastViewModel);

    public abstract void z1(@androidx.annotation.P AuracastFragment auracastFragment);
}
