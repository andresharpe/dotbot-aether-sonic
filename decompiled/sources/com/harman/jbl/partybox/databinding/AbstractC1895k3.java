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
import com.harman.sdk.device.HmDevice;

/* renamed from: com.harman.jbl.partybox.databinding.k3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1895k3 extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39773j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39774k0;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39775l0;

    /* renamed from: m0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39776m0;

    /* renamed from: n0, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39777n0;

    /* renamed from: o0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39778o0;

    /* renamed from: p0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39779p0;

    /* renamed from: q0, reason: collision with root package name */
    @InterfaceC0878c
    protected AuracastFragment f39780q0;

    /* renamed from: r0, reason: collision with root package name */
    @InterfaceC0878c
    protected AuracastViewModel f39781r0;

    /* renamed from: s0, reason: collision with root package name */
    @InterfaceC0878c
    protected HmDevice f39782s0;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1895k3(Object obj, View view, int i4, HmCustomFontTextView hmCustomFontTextView, HmCustomFontTextView hmCustomFontTextView2, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, HmCustomFontTextView hmCustomFontTextView3, HmCustomFontTextView hmCustomFontTextView4) {
        super(obj, view, i4);
        this.f39773j0 = hmCustomFontTextView;
        this.f39774k0 = hmCustomFontTextView2;
        this.f39775l0 = imageView;
        this.f39776m0 = imageView2;
        this.f39777n0 = constraintLayout;
        this.f39778o0 = hmCustomFontTextView3;
        this.f39779p0 = hmCustomFontTextView4;
    }

    public static AbstractC1895k3 o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static AbstractC1895k3 p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (AbstractC1895k3) ViewDataBinding.r(obj, view, j.i.f41549t2);
    }

    @androidx.annotation.N
    public static AbstractC1895k3 t1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return w1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static AbstractC1895k3 u1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return v1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1895k3 v1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (AbstractC1895k3) ViewDataBinding.i0(layoutInflater, j.i.f41549t2, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1895k3 w1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (AbstractC1895k3) ViewDataBinding.i0(layoutInflater, j.i.f41549t2, null, false, obj);
    }

    @androidx.annotation.P
    public HmDevice q1() {
        return this.f39782s0;
    }

    @androidx.annotation.P
    public AuracastFragment r1() {
        return this.f39780q0;
    }

    @androidx.annotation.P
    public AuracastViewModel s1() {
        return this.f39781r0;
    }

    public abstract void x1(@androidx.annotation.P HmDevice hmDevice);

    public abstract void y1(@androidx.annotation.P AuracastFragment auracastFragment);

    public abstract void z1(@androidx.annotation.P AuracastViewModel auracastViewModel);
}
