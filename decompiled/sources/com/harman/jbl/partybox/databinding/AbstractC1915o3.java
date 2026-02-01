package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.InterfaceC0878c;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.party.stereo.StereoRenameFragment;

/* renamed from: com.harman.jbl.partybox.databinding.o3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1915o3 extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39936j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39937k0;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39938l0;

    /* renamed from: m0, reason: collision with root package name */
    @InterfaceC0878c
    protected StereoRenameFragment f39939m0;

    /* renamed from: n0, reason: collision with root package name */
    @InterfaceC0878c
    protected com.harman.jbl.partybox.ui.party.stereo.w f39940n0;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1915o3(Object obj, View view, int i4, HmCustomFontTextView hmCustomFontTextView, ImageView imageView, HmCustomFontTextView hmCustomFontTextView2) {
        super(obj, view, i4);
        this.f39936j0 = hmCustomFontTextView;
        this.f39937k0 = imageView;
        this.f39938l0 = hmCustomFontTextView2;
    }

    public static AbstractC1915o3 o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static AbstractC1915o3 p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (AbstractC1915o3) ViewDataBinding.r(obj, view, j.i.f41557v2);
    }

    @androidx.annotation.N
    public static AbstractC1915o3 s1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return v1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static AbstractC1915o3 t1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return u1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1915o3 u1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (AbstractC1915o3) ViewDataBinding.i0(layoutInflater, j.i.f41557v2, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1915o3 v1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (AbstractC1915o3) ViewDataBinding.i0(layoutInflater, j.i.f41557v2, null, false, obj);
    }

    @androidx.annotation.P
    public StereoRenameFragment q1() {
        return this.f39939m0;
    }

    @androidx.annotation.P
    public com.harman.jbl.partybox.ui.party.stereo.w r1() {
        return this.f39940n0;
    }

    public abstract void w1(@androidx.annotation.P StereoRenameFragment stereoRenameFragment);

    public abstract void x1(@androidx.annotation.P com.harman.jbl.partybox.ui.party.stereo.w wVar);
}
