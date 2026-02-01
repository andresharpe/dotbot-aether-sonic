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

/* loaded from: classes2.dex */
public abstract class N2 extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38901j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38902k0;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38903l0;

    /* renamed from: m0, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f38904m0;

    /* renamed from: n0, reason: collision with root package name */
    @androidx.annotation.N
    public final View f38905n0;

    /* renamed from: o0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f38906o0;

    /* renamed from: p0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f38907p0;

    /* renamed from: q0, reason: collision with root package name */
    @InterfaceC0878c
    protected HmDevice f38908q0;

    /* renamed from: r0, reason: collision with root package name */
    @InterfaceC0878c
    protected AuracastViewModel f38909r0;

    /* renamed from: s0, reason: collision with root package name */
    @InterfaceC0878c
    protected AuracastFragment f38910s0;

    /* JADX INFO: Access modifiers changed from: protected */
    public N2(Object obj, View view, int i4, ImageView imageView, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout, View view2, HmCustomFontTextView hmCustomFontTextView, HmCustomFontTextView hmCustomFontTextView2) {
        super(obj, view, i4);
        this.f38901j0 = imageView;
        this.f38902k0 = imageView2;
        this.f38903l0 = imageView3;
        this.f38904m0 = constraintLayout;
        this.f38905n0 = view2;
        this.f38906o0 = hmCustomFontTextView;
        this.f38907p0 = hmCustomFontTextView2;
    }

    public static N2 o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static N2 p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (N2) ViewDataBinding.r(obj, view, j.i.f41485d2);
    }

    @androidx.annotation.N
    public static N2 t1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return w1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static N2 u1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return v1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static N2 v1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (N2) ViewDataBinding.i0(layoutInflater, j.i.f41485d2, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static N2 w1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (N2) ViewDataBinding.i0(layoutInflater, j.i.f41485d2, null, false, obj);
    }

    @androidx.annotation.P
    public HmDevice q1() {
        return this.f38908q0;
    }

    @androidx.annotation.P
    public AuracastFragment r1() {
        return this.f38910s0;
    }

    @androidx.annotation.P
    public AuracastViewModel s1() {
        return this.f38909r0;
    }

    public abstract void x1(@androidx.annotation.P HmDevice hmDevice);

    public abstract void y1(@androidx.annotation.P AuracastFragment auracastFragment);

    public abstract void z1(@androidx.annotation.P AuracastViewModel auracastViewModel);
}
