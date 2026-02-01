package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;

/* loaded from: classes2.dex */
public abstract class S1 extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final LottieAnimationView f39032j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39033k0;

    /* JADX INFO: Access modifiers changed from: protected */
    public S1(Object obj, View view, int i4, LottieAnimationView lottieAnimationView, HmCustomFontTextView hmCustomFontTextView) {
        super(obj, view, i4);
        this.f39032j0 = lottieAnimationView;
        this.f39033k0 = hmCustomFontTextView;
    }

    public static S1 o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static S1 p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (S1) ViewDataBinding.r(obj, view, j.i.f41556v1);
    }

    @androidx.annotation.N
    public static S1 q1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return t1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static S1 r1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return s1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static S1 s1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (S1) ViewDataBinding.i0(layoutInflater, j.i.f41556v1, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static S1 t1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (S1) ViewDataBinding.i0(layoutInflater, j.i.f41556v1, null, false, obj);
    }
}
