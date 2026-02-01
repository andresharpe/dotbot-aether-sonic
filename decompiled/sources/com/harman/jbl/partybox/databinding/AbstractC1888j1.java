package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.InterfaceC0878c;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.party.stereo.StereoCreateFragment;

/* renamed from: com.harman.jbl.partybox.databinding.j1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1888j1 extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final Guideline f39706j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final Guideline f39707k0;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39708l0;

    /* renamed from: m0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39709m0;

    /* renamed from: n0, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39710n0;

    /* renamed from: o0, reason: collision with root package name */
    @androidx.annotation.N
    public final AbstractC1905m3 f39711o0;

    /* renamed from: p0, reason: collision with root package name */
    @androidx.annotation.N
    public final AbstractC1925q3 f39712p0;

    /* renamed from: q0, reason: collision with root package name */
    @androidx.annotation.N
    public final LottieAnimationView f39713q0;

    /* renamed from: r0, reason: collision with root package name */
    @androidx.annotation.N
    public final View f39714r0;

    /* renamed from: s0, reason: collision with root package name */
    @androidx.annotation.N
    public final View f39715s0;

    /* renamed from: t0, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39716t0;

    /* renamed from: u0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39717u0;

    /* renamed from: v0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39718v0;

    /* renamed from: w0, reason: collision with root package name */
    @InterfaceC0878c
    protected StereoCreateFragment f39719w0;

    /* renamed from: x0, reason: collision with root package name */
    @InterfaceC0878c
    protected com.harman.jbl.partybox.ui.party.stereo.s f39720x0;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1888j1(Object obj, View view, int i4, Guideline guideline, Guideline guideline2, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, AbstractC1905m3 abstractC1905m3, AbstractC1925q3 abstractC1925q3, LottieAnimationView lottieAnimationView, View view2, View view3, ConstraintLayout constraintLayout2, HmCustomFontTextView hmCustomFontTextView, HmCustomFontTextView hmCustomFontTextView2) {
        super(obj, view, i4);
        this.f39706j0 = guideline;
        this.f39707k0 = guideline2;
        this.f39708l0 = imageView;
        this.f39709m0 = imageView2;
        this.f39710n0 = constraintLayout;
        this.f39711o0 = abstractC1905m3;
        this.f39712p0 = abstractC1925q3;
        this.f39713q0 = lottieAnimationView;
        this.f39714r0 = view2;
        this.f39715s0 = view3;
        this.f39716t0 = constraintLayout2;
        this.f39717u0 = hmCustomFontTextView;
        this.f39718v0 = hmCustomFontTextView2;
    }

    public static AbstractC1888j1 o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static AbstractC1888j1 p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (AbstractC1888j1) ViewDataBinding.r(obj, view, j.i.f41447U0);
    }

    @androidx.annotation.N
    public static AbstractC1888j1 s1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return v1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static AbstractC1888j1 t1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return u1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1888j1 u1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (AbstractC1888j1) ViewDataBinding.i0(layoutInflater, j.i.f41447U0, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1888j1 v1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (AbstractC1888j1) ViewDataBinding.i0(layoutInflater, j.i.f41447U0, null, false, obj);
    }

    @androidx.annotation.P
    public StereoCreateFragment q1() {
        return this.f39719w0;
    }

    @androidx.annotation.P
    public com.harman.jbl.partybox.ui.party.stereo.s r1() {
        return this.f39720x0;
    }

    public abstract void w1(@androidx.annotation.P StereoCreateFragment stereoCreateFragment);

    public abstract void x1(@androidx.annotation.P com.harman.jbl.partybox.ui.party.stereo.s sVar);
}
