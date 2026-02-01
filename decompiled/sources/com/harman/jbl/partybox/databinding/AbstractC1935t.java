package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.InterfaceC0878c;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.dashboard.DashboardBannerDialogFragment;
import com.harman.jbl.partybox.ui.dashboard.DashboardBannerViewModel;

/* renamed from: com.harman.jbl.partybox.databinding.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1935t extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40133j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40134k0;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40135l0;

    /* renamed from: m0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40136m0;

    /* renamed from: n0, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f40137n0;

    /* renamed from: o0, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f40138o0;

    /* renamed from: p0, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f40139p0;

    /* renamed from: q0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f40140q0;

    /* renamed from: r0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f40141r0;

    /* renamed from: s0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f40142s0;

    /* renamed from: t0, reason: collision with root package name */
    @InterfaceC0878c
    protected DashboardBannerDialogFragment f40143t0;

    /* renamed from: u0, reason: collision with root package name */
    @InterfaceC0878c
    protected com.harman.jbl.partybox.ui.party.stereo.g f40144u0;

    /* renamed from: v0, reason: collision with root package name */
    @InterfaceC0878c
    protected DashboardBannerViewModel f40145v0;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1935t(Object obj, View view, int i4, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, HmCustomFontTextView hmCustomFontTextView, HmCustomFontTextView hmCustomFontTextView2, HmCustomFontTextView hmCustomFontTextView3) {
        super(obj, view, i4);
        this.f40133j0 = imageView;
        this.f40134k0 = imageView2;
        this.f40135l0 = imageView3;
        this.f40136m0 = imageView4;
        this.f40137n0 = linearLayout;
        this.f40138o0 = linearLayout2;
        this.f40139p0 = linearLayout3;
        this.f40140q0 = hmCustomFontTextView;
        this.f40141r0 = hmCustomFontTextView2;
        this.f40142s0 = hmCustomFontTextView3;
    }

    public static AbstractC1935t o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static AbstractC1935t p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (AbstractC1935t) ViewDataBinding.r(obj, view, j.i.f41534q);
    }

    @androidx.annotation.N
    public static AbstractC1935t t1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return w1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static AbstractC1935t u1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return v1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1935t v1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (AbstractC1935t) ViewDataBinding.i0(layoutInflater, j.i.f41534q, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1935t w1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (AbstractC1935t) ViewDataBinding.i0(layoutInflater, j.i.f41534q, null, false, obj);
    }

    @androidx.annotation.P
    public DashboardBannerDialogFragment q1() {
        return this.f40143t0;
    }

    @androidx.annotation.P
    public com.harman.jbl.partybox.ui.party.stereo.g r1() {
        return this.f40144u0;
    }

    @androidx.annotation.P
    public DashboardBannerViewModel s1() {
        return this.f40145v0;
    }

    public abstract void x1(@androidx.annotation.P DashboardBannerDialogFragment dashboardBannerDialogFragment);

    public abstract void y1(@androidx.annotation.P com.harman.jbl.partybox.ui.party.stereo.g gVar);

    public abstract void z1(@androidx.annotation.P DashboardBannerViewModel dashboardBannerViewModel);
}
