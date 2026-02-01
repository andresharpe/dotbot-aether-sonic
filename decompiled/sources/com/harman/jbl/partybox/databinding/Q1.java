package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;

/* loaded from: classes2.dex */
public abstract class Q1 extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final LottieAnimationView f38988j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f38989k0;

    /* JADX INFO: Access modifiers changed from: protected */
    public Q1(Object obj, View view, int i4, LottieAnimationView lottieAnimationView, HmCustomFontTextView hmCustomFontTextView) {
        super(obj, view, i4);
        this.f38988j0 = lottieAnimationView;
        this.f38989k0 = hmCustomFontTextView;
    }

    public static Q1 o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static Q1 p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (Q1) ViewDataBinding.r(obj, view, j.i.f41552u1);
    }

    @androidx.annotation.N
    public static Q1 q1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return t1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static Q1 r1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return s1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static Q1 s1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (Q1) ViewDataBinding.i0(layoutInflater, j.i.f41552u1, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static Q1 t1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (Q1) ViewDataBinding.i0(layoutInflater, j.i.f41552u1, null, false, obj);
    }
}
