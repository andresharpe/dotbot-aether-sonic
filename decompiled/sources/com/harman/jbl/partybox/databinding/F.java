package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC0878c;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.party.stereo.ui.FindAnotherSpeakerDialog;

/* loaded from: classes2.dex */
public abstract class F extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38585j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38586k0;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38587l0;

    /* renamed from: m0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38588m0;

    /* renamed from: n0, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f38589n0;

    /* renamed from: o0, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f38590o0;

    /* renamed from: p0, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f38591p0;

    /* renamed from: q0, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f38592q0;

    /* renamed from: r0, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f38593r0;

    /* renamed from: s0, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f38594s0;

    /* renamed from: t0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f38595t0;

    /* renamed from: u0, reason: collision with root package name */
    @InterfaceC0878c
    protected FindAnotherSpeakerDialog f38596u0;

    /* JADX INFO: Access modifiers changed from: protected */
    public F(Object obj, View view, int i4, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ConstraintLayout constraintLayout, LinearLayout linearLayout, ConstraintLayout constraintLayout2, LinearLayout linearLayout2, ConstraintLayout constraintLayout3, LinearLayout linearLayout3, HmCustomFontTextView hmCustomFontTextView) {
        super(obj, view, i4);
        this.f38585j0 = imageView;
        this.f38586k0 = imageView2;
        this.f38587l0 = imageView3;
        this.f38588m0 = imageView4;
        this.f38589n0 = constraintLayout;
        this.f38590o0 = linearLayout;
        this.f38591p0 = constraintLayout2;
        this.f38592q0 = linearLayout2;
        this.f38593r0 = constraintLayout3;
        this.f38594s0 = linearLayout3;
        this.f38595t0 = hmCustomFontTextView;
    }

    public static F o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static F p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (F) ViewDataBinding.r(obj, view, j.i.f41370B);
    }

    @androidx.annotation.N
    public static F r1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return u1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static F s1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return t1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static F t1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (F) ViewDataBinding.i0(layoutInflater, j.i.f41370B, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static F u1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (F) ViewDataBinding.i0(layoutInflater, j.i.f41370B, null, false, obj);
    }

    @androidx.annotation.P
    public FindAnotherSpeakerDialog q1() {
        return this.f38596u0;
    }

    public abstract void v1(@androidx.annotation.P FindAnotherSpeakerDialog findAnotherSpeakerDialog);
}
