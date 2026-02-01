package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.InterfaceC0878c;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.party.stereo.StereoScanFragment;
import com.harman.sdk.device.HmDevice;

/* renamed from: com.harman.jbl.partybox.databinding.t3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1939t3 extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40176j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f40177k0;

    /* renamed from: l0, reason: collision with root package name */
    @InterfaceC0878c
    protected HmDevice f40178l0;

    /* renamed from: m0, reason: collision with root package name */
    @InterfaceC0878c
    protected StereoScanFragment f40179m0;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1939t3(Object obj, View view, int i4, ImageView imageView, HmCustomFontTextView hmCustomFontTextView) {
        super(obj, view, i4);
        this.f40176j0 = imageView;
        this.f40177k0 = hmCustomFontTextView;
    }

    public static AbstractC1939t3 o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static AbstractC1939t3 p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (AbstractC1939t3) ViewDataBinding.r(obj, view, j.i.f41569y2);
    }

    @androidx.annotation.N
    public static AbstractC1939t3 s1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return v1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static AbstractC1939t3 t1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return u1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1939t3 u1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (AbstractC1939t3) ViewDataBinding.i0(layoutInflater, j.i.f41569y2, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1939t3 v1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (AbstractC1939t3) ViewDataBinding.i0(layoutInflater, j.i.f41569y2, null, false, obj);
    }

    @androidx.annotation.P
    public HmDevice q1() {
        return this.f40178l0;
    }

    @androidx.annotation.P
    public StereoScanFragment r1() {
        return this.f40179m0;
    }

    public abstract void w1(@androidx.annotation.P HmDevice hmDevice);

    public abstract void x1(@androidx.annotation.P StereoScanFragment stereoScanFragment);
}
