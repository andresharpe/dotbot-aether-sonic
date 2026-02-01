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
public abstract class F2 extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38614j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f38615k0;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f38616l0;

    /* renamed from: m0, reason: collision with root package name */
    @InterfaceC0878c
    protected AuracastViewModel f38617m0;

    /* renamed from: n0, reason: collision with root package name */
    @InterfaceC0878c
    protected AuracastFragment f38618n0;

    /* JADX INFO: Access modifiers changed from: protected */
    public F2(Object obj, View view, int i4, ImageView imageView, ConstraintLayout constraintLayout, HmCustomFontTextView hmCustomFontTextView) {
        super(obj, view, i4);
        this.f38614j0 = imageView;
        this.f38615k0 = constraintLayout;
        this.f38616l0 = hmCustomFontTextView;
    }

    public static F2 o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static F2 p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (F2) ViewDataBinding.r(obj, view, j.i.f41468Z1);
    }

    @androidx.annotation.N
    public static F2 s1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return v1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static F2 t1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return u1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static F2 u1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (F2) ViewDataBinding.i0(layoutInflater, j.i.f41468Z1, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static F2 v1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (F2) ViewDataBinding.i0(layoutInflater, j.i.f41468Z1, null, false, obj);
    }

    @androidx.annotation.P
    public AuracastViewModel q1() {
        return this.f38617m0;
    }

    @androidx.annotation.P
    public AuracastFragment r1() {
        return this.f38618n0;
    }

    public abstract void w1(@androidx.annotation.P AuracastViewModel auracastViewModel);

    public abstract void x1(@androidx.annotation.P AuracastFragment auracastFragment);
}
