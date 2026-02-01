package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.InterfaceC0878c;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.party.stereo.StereoRenameFragment;

/* renamed from: com.harman.jbl.partybox.databinding.l1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1898l1 extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final Guideline f39808j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final Guideline f39809k0;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39810l0;

    /* renamed from: m0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39811m0;

    /* renamed from: n0, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39812n0;

    /* renamed from: o0, reason: collision with root package name */
    @androidx.annotation.N
    public final AbstractC1915o3 f39813o0;

    /* renamed from: p0, reason: collision with root package name */
    @androidx.annotation.N
    public final View f39814p0;

    /* renamed from: q0, reason: collision with root package name */
    @androidx.annotation.N
    public final View f39815q0;

    /* renamed from: r0, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39816r0;

    /* renamed from: s0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39817s0;

    /* renamed from: t0, reason: collision with root package name */
    @InterfaceC0878c
    protected StereoRenameFragment f39818t0;

    /* renamed from: u0, reason: collision with root package name */
    @InterfaceC0878c
    protected com.harman.jbl.partybox.ui.party.stereo.w f39819u0;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1898l1(Object obj, View view, int i4, Guideline guideline, Guideline guideline2, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, AbstractC1915o3 abstractC1915o3, View view2, View view3, ConstraintLayout constraintLayout2, HmCustomFontTextView hmCustomFontTextView) {
        super(obj, view, i4);
        this.f39808j0 = guideline;
        this.f39809k0 = guideline2;
        this.f39810l0 = imageView;
        this.f39811m0 = imageView2;
        this.f39812n0 = constraintLayout;
        this.f39813o0 = abstractC1915o3;
        this.f39814p0 = view2;
        this.f39815q0 = view3;
        this.f39816r0 = constraintLayout2;
        this.f39817s0 = hmCustomFontTextView;
    }

    public static AbstractC1898l1 o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static AbstractC1898l1 p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (AbstractC1898l1) ViewDataBinding.r(obj, view, j.i.f41451V0);
    }

    @androidx.annotation.N
    public static AbstractC1898l1 s1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return v1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static AbstractC1898l1 t1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return u1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1898l1 u1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (AbstractC1898l1) ViewDataBinding.i0(layoutInflater, j.i.f41451V0, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1898l1 v1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (AbstractC1898l1) ViewDataBinding.i0(layoutInflater, j.i.f41451V0, null, false, obj);
    }

    @androidx.annotation.P
    public StereoRenameFragment q1() {
        return this.f39818t0;
    }

    @androidx.annotation.P
    public com.harman.jbl.partybox.ui.party.stereo.w r1() {
        return this.f39819u0;
    }

    public abstract void w1(@androidx.annotation.P StereoRenameFragment stereoRenameFragment);

    public abstract void x1(@androidx.annotation.P com.harman.jbl.partybox.ui.party.stereo.w wVar);
}
