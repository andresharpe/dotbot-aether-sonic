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
import com.harman.jbl.partybox.ui.support.FactoryResetFragment;

/* renamed from: com.harman.jbl.partybox.databinding.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1897l0 extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final Guideline f39801j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39802k0;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39803l0;

    /* renamed from: m0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39804m0;

    /* renamed from: n0, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39805n0;

    /* renamed from: o0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39806o0;

    /* renamed from: p0, reason: collision with root package name */
    @InterfaceC0878c
    protected FactoryResetFragment f39807p0;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1897l0(Object obj, View view, int i4, Guideline guideline, ImageView imageView, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout, HmCustomFontTextView hmCustomFontTextView) {
        super(obj, view, i4);
        this.f39801j0 = guideline;
        this.f39802k0 = imageView;
        this.f39803l0 = imageView2;
        this.f39804m0 = imageView3;
        this.f39805n0 = constraintLayout;
        this.f39806o0 = hmCustomFontTextView;
    }

    public static AbstractC1897l0 o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static AbstractC1897l0 p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (AbstractC1897l0) ViewDataBinding.r(obj, view, j.i.f41479c0);
    }

    @androidx.annotation.N
    public static AbstractC1897l0 r1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return u1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static AbstractC1897l0 s1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return t1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1897l0 t1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (AbstractC1897l0) ViewDataBinding.i0(layoutInflater, j.i.f41479c0, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1897l0 u1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (AbstractC1897l0) ViewDataBinding.i0(layoutInflater, j.i.f41479c0, null, false, obj);
    }

    @androidx.annotation.P
    public FactoryResetFragment q1() {
        return this.f39807p0;
    }

    public abstract void v1(@androidx.annotation.P FactoryResetFragment factoryResetFragment);
}
