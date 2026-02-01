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
import com.harman.jbl.partybox.ui.customviews.HmTextViewWithImage;
import com.harman.jbl.partybox.ui.party.auracast.ui.AuracastStopGuideDialog;

/* renamed from: com.harman.jbl.partybox.databinding.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1911o extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39912j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39913k0;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.N
    public final Guideline f39914l0;

    /* renamed from: m0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39915m0;

    /* renamed from: n0, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39916n0;

    /* renamed from: o0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmTextViewWithImage f39917o0;

    /* renamed from: p0, reason: collision with root package name */
    @InterfaceC0878c
    protected AuracastStopGuideDialog f39918p0;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1911o(Object obj, View view, int i4, ImageView imageView, HmCustomFontTextView hmCustomFontTextView, Guideline guideline, ImageView imageView2, ConstraintLayout constraintLayout, HmTextViewWithImage hmTextViewWithImage) {
        super(obj, view, i4);
        this.f39912j0 = imageView;
        this.f39913k0 = hmCustomFontTextView;
        this.f39914l0 = guideline;
        this.f39915m0 = imageView2;
        this.f39916n0 = constraintLayout;
        this.f39917o0 = hmTextViewWithImage;
    }

    public static AbstractC1911o o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static AbstractC1911o p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (AbstractC1911o) ViewDataBinding.r(obj, view, j.i.f41522n);
    }

    @androidx.annotation.N
    public static AbstractC1911o r1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return u1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static AbstractC1911o s1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return t1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1911o t1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (AbstractC1911o) ViewDataBinding.i0(layoutInflater, j.i.f41522n, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1911o u1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (AbstractC1911o) ViewDataBinding.i0(layoutInflater, j.i.f41522n, null, false, obj);
    }

    @androidx.annotation.P
    public AuracastStopGuideDialog q1() {
        return this.f39918p0;
    }

    public abstract void v1(@androidx.annotation.P AuracastStopGuideDialog auracastStopGuideDialog);
}
