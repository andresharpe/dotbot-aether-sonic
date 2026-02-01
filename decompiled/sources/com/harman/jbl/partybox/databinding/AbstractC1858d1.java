package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.InterfaceC0878c;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.j;

/* renamed from: com.harman.jbl.partybox.databinding.d1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1858d1 extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39467j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final SurfaceView f39468k0;

    /* renamed from: l0, reason: collision with root package name */
    @InterfaceC0878c
    protected Boolean f39469l0;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1858d1(Object obj, View view, int i4, ImageView imageView, SurfaceView surfaceView) {
        super(obj, view, i4);
        this.f39467j0 = imageView;
        this.f39468k0 = surfaceView;
    }

    public static AbstractC1858d1 o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static AbstractC1858d1 p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (AbstractC1858d1) ViewDataBinding.r(obj, view, j.i.f41431Q0);
    }

    @androidx.annotation.N
    public static AbstractC1858d1 r1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return u1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static AbstractC1858d1 s1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return t1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1858d1 t1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (AbstractC1858d1) ViewDataBinding.i0(layoutInflater, j.i.f41431Q0, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1858d1 u1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (AbstractC1858d1) ViewDataBinding.i0(layoutInflater, j.i.f41431Q0, null, false, obj);
    }

    @androidx.annotation.P
    public Boolean q1() {
        return this.f39469l0;
    }

    public abstract void v1(@androidx.annotation.P Boolean bool);
}
