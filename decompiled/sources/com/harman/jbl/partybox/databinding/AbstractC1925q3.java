package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.InterfaceC0878c;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.party.stereo.StereoCreateFragment;

/* renamed from: com.harman.jbl.partybox.databinding.q3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1925q3 extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f40054j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f40055k0;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f40056l0;

    /* renamed from: m0, reason: collision with root package name */
    @androidx.annotation.N
    public final Guideline f40057m0;

    /* renamed from: n0, reason: collision with root package name */
    @InterfaceC0878c
    protected StereoCreateFragment f40058n0;

    /* renamed from: o0, reason: collision with root package name */
    @InterfaceC0878c
    protected com.harman.jbl.partybox.ui.party.stereo.s f40059o0;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1925q3(Object obj, View view, int i4, HmCustomFontTextView hmCustomFontTextView, HmCustomFontTextView hmCustomFontTextView2, HmCustomFontTextView hmCustomFontTextView3, Guideline guideline) {
        super(obj, view, i4);
        this.f40054j0 = hmCustomFontTextView;
        this.f40055k0 = hmCustomFontTextView2;
        this.f40056l0 = hmCustomFontTextView3;
        this.f40057m0 = guideline;
    }

    public static AbstractC1925q3 o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static AbstractC1925q3 p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (AbstractC1925q3) ViewDataBinding.r(obj, view, j.i.f41561w2);
    }

    @androidx.annotation.N
    public static AbstractC1925q3 s1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return v1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static AbstractC1925q3 t1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return u1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1925q3 u1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (AbstractC1925q3) ViewDataBinding.i0(layoutInflater, j.i.f41561w2, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1925q3 v1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (AbstractC1925q3) ViewDataBinding.i0(layoutInflater, j.i.f41561w2, null, false, obj);
    }

    @androidx.annotation.P
    public StereoCreateFragment q1() {
        return this.f40058n0;
    }

    @androidx.annotation.P
    public com.harman.jbl.partybox.ui.party.stereo.s r1() {
        return this.f40059o0;
    }

    public abstract void w1(@androidx.annotation.P StereoCreateFragment stereoCreateFragment);

    public abstract void x1(@androidx.annotation.P com.harman.jbl.partybox.ui.party.stereo.s sVar);
}
