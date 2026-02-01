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
import com.harman.jbl.partybox.ui.party.stereo.GroupSettingFragment;

/* renamed from: com.harman.jbl.partybox.databinding.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1922q0 extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40035j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40036k0;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f40037l0;

    /* renamed from: m0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f40038m0;

    /* renamed from: n0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f40039n0;

    /* renamed from: o0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f40040o0;

    /* renamed from: p0, reason: collision with root package name */
    @InterfaceC0878c
    protected GroupSettingFragment f40041p0;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1922q0(Object obj, View view, int i4, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, HmCustomFontTextView hmCustomFontTextView, HmCustomFontTextView hmCustomFontTextView2, HmCustomFontTextView hmCustomFontTextView3) {
        super(obj, view, i4);
        this.f40035j0 = imageView;
        this.f40036k0 = imageView2;
        this.f40037l0 = constraintLayout;
        this.f40038m0 = hmCustomFontTextView;
        this.f40039n0 = hmCustomFontTextView2;
        this.f40040o0 = hmCustomFontTextView3;
    }

    public static AbstractC1922q0 o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static AbstractC1922q0 p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (AbstractC1922q0) ViewDataBinding.r(obj, view, j.i.f41495g0);
    }

    @androidx.annotation.N
    public static AbstractC1922q0 r1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return u1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static AbstractC1922q0 s1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return t1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1922q0 t1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (AbstractC1922q0) ViewDataBinding.i0(layoutInflater, j.i.f41495g0, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1922q0 u1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (AbstractC1922q0) ViewDataBinding.i0(layoutInflater, j.i.f41495g0, null, false, obj);
    }

    @androidx.annotation.P
    public GroupSettingFragment q1() {
        return this.f40041p0;
    }

    public abstract void v1(@androidx.annotation.P GroupSettingFragment groupSettingFragment);
}
