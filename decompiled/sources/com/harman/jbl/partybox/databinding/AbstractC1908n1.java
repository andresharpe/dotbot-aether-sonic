package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.InterfaceC0878c;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.customviews.scrollpageindicator.ViewPagerIndicator;
import com.harman.jbl.partybox.ui.party.stereo.StereoScanFragment;
import com.harman.jbl.partybox.ui.party.stereo.StereoScanViewModel;

/* renamed from: com.harman.jbl.partybox.databinding.n1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1908n1 extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39885j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final ViewPagerIndicator f39886k0;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.N
    public final Guideline f39887l0;

    /* renamed from: m0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39888m0;

    /* renamed from: n0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39889n0;

    /* renamed from: o0, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f39890o0;

    /* renamed from: p0, reason: collision with root package name */
    @androidx.annotation.N
    public final LottieAnimationView f39891p0;

    /* renamed from: q0, reason: collision with root package name */
    @androidx.annotation.N
    public final View f39892q0;

    /* renamed from: r0, reason: collision with root package name */
    @androidx.annotation.N
    public final View f39893r0;

    /* renamed from: s0, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39894s0;

    /* renamed from: t0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39895t0;

    /* renamed from: u0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39896u0;

    /* renamed from: v0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39897v0;

    /* renamed from: w0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39898w0;

    /* renamed from: x0, reason: collision with root package name */
    @androidx.annotation.N
    public final ViewPager2 f39899x0;

    /* renamed from: y0, reason: collision with root package name */
    @InterfaceC0878c
    protected StereoScanFragment f39900y0;

    /* renamed from: z0, reason: collision with root package name */
    @InterfaceC0878c
    protected StereoScanViewModel f39901z0;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1908n1(Object obj, View view, int i4, HmCustomFontTextView hmCustomFontTextView, ViewPagerIndicator viewPagerIndicator, Guideline guideline, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, LottieAnimationView lottieAnimationView, View view2, View view3, ConstraintLayout constraintLayout, HmCustomFontTextView hmCustomFontTextView2, HmCustomFontTextView hmCustomFontTextView3, HmCustomFontTextView hmCustomFontTextView4, HmCustomFontTextView hmCustomFontTextView5, ViewPager2 viewPager2) {
        super(obj, view, i4);
        this.f39885j0 = hmCustomFontTextView;
        this.f39886k0 = viewPagerIndicator;
        this.f39887l0 = guideline;
        this.f39888m0 = imageView;
        this.f39889n0 = imageView2;
        this.f39890o0 = linearLayout;
        this.f39891p0 = lottieAnimationView;
        this.f39892q0 = view2;
        this.f39893r0 = view3;
        this.f39894s0 = constraintLayout;
        this.f39895t0 = hmCustomFontTextView2;
        this.f39896u0 = hmCustomFontTextView3;
        this.f39897v0 = hmCustomFontTextView4;
        this.f39898w0 = hmCustomFontTextView5;
        this.f39899x0 = viewPager2;
    }

    public static AbstractC1908n1 o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static AbstractC1908n1 p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (AbstractC1908n1) ViewDataBinding.r(obj, view, j.i.f41455W0);
    }

    @androidx.annotation.N
    public static AbstractC1908n1 s1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return v1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static AbstractC1908n1 t1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return u1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1908n1 u1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (AbstractC1908n1) ViewDataBinding.i0(layoutInflater, j.i.f41455W0, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1908n1 v1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (AbstractC1908n1) ViewDataBinding.i0(layoutInflater, j.i.f41455W0, null, false, obj);
    }

    @androidx.annotation.P
    public StereoScanFragment q1() {
        return this.f39900y0;
    }

    @androidx.annotation.P
    public StereoScanViewModel r1() {
        return this.f39901z0;
    }

    public abstract void w1(@androidx.annotation.P StereoScanFragment stereoScanFragment);

    public abstract void x1(@androidx.annotation.P StereoScanViewModel stereoScanViewModel);
}
