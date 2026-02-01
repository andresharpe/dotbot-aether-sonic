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
import com.harman.sdk.device.HmDevice;

/* loaded from: classes2.dex */
public abstract class S2 extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39034j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39035k0;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39036l0;

    /* renamed from: m0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39037m0;

    /* renamed from: n0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39038n0;

    /* renamed from: o0, reason: collision with root package name */
    @InterfaceC0878c
    protected AuracastFragment f39039o0;

    /* renamed from: p0, reason: collision with root package name */
    @InterfaceC0878c
    protected HmDevice f39040p0;

    /* JADX INFO: Access modifiers changed from: protected */
    public S2(Object obj, View view, int i4, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, HmCustomFontTextView hmCustomFontTextView, HmCustomFontTextView hmCustomFontTextView2) {
        super(obj, view, i4);
        this.f39034j0 = imageView;
        this.f39035k0 = imageView2;
        this.f39036l0 = constraintLayout;
        this.f39037m0 = hmCustomFontTextView;
        this.f39038n0 = hmCustomFontTextView2;
    }

    public static S2 o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static S2 p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (S2) ViewDataBinding.r(obj, view, j.i.f41497g2);
    }

    @androidx.annotation.N
    public static S2 s1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return v1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static S2 t1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return u1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static S2 u1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (S2) ViewDataBinding.i0(layoutInflater, j.i.f41497g2, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static S2 v1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (S2) ViewDataBinding.i0(layoutInflater, j.i.f41497g2, null, false, obj);
    }

    @androidx.annotation.P
    public HmDevice q1() {
        return this.f39040p0;
    }

    @androidx.annotation.P
    public AuracastFragment r1() {
        return this.f39039o0;
    }

    public abstract void w1(@androidx.annotation.P HmDevice hmDevice);

    public abstract void x1(@androidx.annotation.P AuracastFragment auracastFragment);
}
