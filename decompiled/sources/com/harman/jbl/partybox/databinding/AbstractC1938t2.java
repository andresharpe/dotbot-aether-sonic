package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.InterfaceC0878c;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel;
import com.harman.sdk.device.HmDevice;

/* renamed from: com.harman.jbl.partybox.databinding.t2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1938t2 extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40170j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40171k0;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40172l0;

    /* renamed from: m0, reason: collision with root package name */
    @InterfaceC0878c
    protected HmDevice f40173m0;

    /* renamed from: n0, reason: collision with root package name */
    @InterfaceC0878c
    protected int f40174n0;

    /* renamed from: o0, reason: collision with root package name */
    @InterfaceC0878c
    protected AuracastViewModel f40175o0;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1938t2(Object obj, View view, int i4, ImageView imageView, ImageView imageView2, ImageView imageView3) {
        super(obj, view, i4);
        this.f40170j0 = imageView;
        this.f40171k0 = imageView2;
        this.f40172l0 = imageView3;
    }

    public static AbstractC1938t2 o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static AbstractC1938t2 p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (AbstractC1938t2) ViewDataBinding.r(obj, view, j.i.f41432Q1);
    }

    @androidx.annotation.N
    public static AbstractC1938t2 t1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return w1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static AbstractC1938t2 u1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return v1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1938t2 v1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (AbstractC1938t2) ViewDataBinding.i0(layoutInflater, j.i.f41432Q1, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1938t2 w1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (AbstractC1938t2) ViewDataBinding.i0(layoutInflater, j.i.f41432Q1, null, false, obj);
    }

    @androidx.annotation.P
    public AuracastViewModel q1() {
        return this.f40175o0;
    }

    public int r1() {
        return this.f40174n0;
    }

    @androidx.annotation.P
    public HmDevice s1() {
        return this.f40173m0;
    }

    public abstract void x1(@androidx.annotation.P AuracastViewModel auracastViewModel);

    public abstract void y1(int i4);

    public abstract void z1(@androidx.annotation.P HmDevice hmDevice);
}
