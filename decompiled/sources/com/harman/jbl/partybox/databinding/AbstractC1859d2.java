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
import com.harman.jbl.partybox.ui.widget.BatteryView;

/* renamed from: com.harman.jbl.partybox.databinding.d2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1859d2 extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final BatteryView f39470j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39471k0;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39472l0;

    /* renamed from: m0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39473m0;

    /* renamed from: n0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39474n0;

    /* renamed from: o0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39475o0;

    /* renamed from: p0, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39476p0;

    /* renamed from: q0, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39477q0;

    /* renamed from: r0, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39478r0;

    /* renamed from: s0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39479s0;

    /* renamed from: t0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39480t0;

    /* renamed from: u0, reason: collision with root package name */
    @InterfaceC0878c
    protected AuracastViewModel f39481u0;

    /* renamed from: v0, reason: collision with root package name */
    @InterfaceC0878c
    protected AuracastFragment f39482v0;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1859d2(Object obj, View view, int i4, BatteryView batteryView, ImageView imageView, HmCustomFontTextView hmCustomFontTextView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, HmCustomFontTextView hmCustomFontTextView2, HmCustomFontTextView hmCustomFontTextView3) {
        super(obj, view, i4);
        this.f39470j0 = batteryView;
        this.f39471k0 = imageView;
        this.f39472l0 = hmCustomFontTextView;
        this.f39473m0 = imageView2;
        this.f39474n0 = imageView3;
        this.f39475o0 = imageView4;
        this.f39476p0 = constraintLayout;
        this.f39477q0 = constraintLayout2;
        this.f39478r0 = constraintLayout3;
        this.f39479s0 = hmCustomFontTextView2;
        this.f39480t0 = hmCustomFontTextView3;
    }

    public static AbstractC1859d2 o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static AbstractC1859d2 p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (AbstractC1859d2) ViewDataBinding.r(obj, view, j.i.f41380D1);
    }

    @androidx.annotation.N
    public static AbstractC1859d2 s1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return v1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static AbstractC1859d2 t1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return u1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1859d2 u1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (AbstractC1859d2) ViewDataBinding.i0(layoutInflater, j.i.f41380D1, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1859d2 v1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (AbstractC1859d2) ViewDataBinding.i0(layoutInflater, j.i.f41380D1, null, false, obj);
    }

    @androidx.annotation.P
    public AuracastViewModel q1() {
        return this.f39481u0;
    }

    @androidx.annotation.P
    public AuracastFragment r1() {
        return this.f39482v0;
    }

    public abstract void w1(@androidx.annotation.P AuracastViewModel auracastViewModel);

    public abstract void x1(@androidx.annotation.P AuracastFragment auracastFragment);
}
