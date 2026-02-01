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
import com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment;

/* renamed from: com.harman.jbl.partybox.databinding.r2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1928r2 extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f40088j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40089k0;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40090l0;

    /* renamed from: m0, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f40091m0;

    /* renamed from: n0, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f40092n0;

    /* renamed from: o0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f40093o0;

    /* renamed from: p0, reason: collision with root package name */
    @InterfaceC0878c
    protected StageDashboardFragment f40094p0;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1928r2(Object obj, View view, int i4, HmCustomFontTextView hmCustomFontTextView, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, HmCustomFontTextView hmCustomFontTextView2) {
        super(obj, view, i4);
        this.f40088j0 = hmCustomFontTextView;
        this.f40089k0 = imageView;
        this.f40090l0 = imageView2;
        this.f40091m0 = constraintLayout;
        this.f40092n0 = constraintLayout2;
        this.f40093o0 = hmCustomFontTextView2;
    }

    public static AbstractC1928r2 o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static AbstractC1928r2 p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (AbstractC1928r2) ViewDataBinding.r(obj, view, j.i.f41428P1);
    }

    @androidx.annotation.N
    public static AbstractC1928r2 r1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return u1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static AbstractC1928r2 s1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return t1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1928r2 t1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (AbstractC1928r2) ViewDataBinding.i0(layoutInflater, j.i.f41428P1, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1928r2 u1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (AbstractC1928r2) ViewDataBinding.i0(layoutInflater, j.i.f41428P1, null, false, obj);
    }

    @androidx.annotation.P
    public StageDashboardFragment q1() {
        return this.f40094p0;
    }

    public abstract void v1(@androidx.annotation.P StageDashboardFragment stageDashboardFragment);
}
