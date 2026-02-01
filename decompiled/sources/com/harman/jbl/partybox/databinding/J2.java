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
import com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel;
import com.harman.sdk.device.HmDevice;

/* loaded from: classes2.dex */
public abstract class J2 extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38778j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38779k0;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f38780l0;

    /* renamed from: m0, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f38781m0;

    /* renamed from: n0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f38782n0;

    /* renamed from: o0, reason: collision with root package name */
    @InterfaceC0878c
    protected HmDevice f38783o0;

    /* renamed from: p0, reason: collision with root package name */
    @InterfaceC0878c
    protected AuracastViewModel f38784p0;

    /* JADX INFO: Access modifiers changed from: protected */
    public J2(Object obj, View view, int i4, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, HmCustomFontTextView hmCustomFontTextView) {
        super(obj, view, i4);
        this.f38778j0 = imageView;
        this.f38779k0 = imageView2;
        this.f38780l0 = constraintLayout;
        this.f38781m0 = constraintLayout2;
        this.f38782n0 = hmCustomFontTextView;
    }

    public static J2 o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static J2 p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (J2) ViewDataBinding.r(obj, view, j.i.f41477b2);
    }

    @androidx.annotation.N
    public static J2 s1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return v1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static J2 t1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return u1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static J2 u1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (J2) ViewDataBinding.i0(layoutInflater, j.i.f41477b2, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static J2 v1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (J2) ViewDataBinding.i0(layoutInflater, j.i.f41477b2, null, false, obj);
    }

    @androidx.annotation.P
    public AuracastViewModel q1() {
        return this.f38784p0;
    }

    @androidx.annotation.P
    public HmDevice r1() {
        return this.f38783o0;
    }

    public abstract void w1(@androidx.annotation.P AuracastViewModel auracastViewModel);

    public abstract void x1(@androidx.annotation.P HmDevice hmDevice);
}
