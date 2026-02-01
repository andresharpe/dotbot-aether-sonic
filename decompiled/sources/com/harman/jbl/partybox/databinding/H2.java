package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.InterfaceC0878c;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.j;

/* loaded from: classes2.dex */
public abstract class H2 extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38693j0;

    /* renamed from: k0, reason: collision with root package name */
    @InterfaceC0878c
    protected int f38694k0;

    /* JADX INFO: Access modifiers changed from: protected */
    public H2(Object obj, View view, int i4, ImageView imageView) {
        super(obj, view, i4);
        this.f38693j0 = imageView;
    }

    public static H2 o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static H2 p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (H2) ViewDataBinding.r(obj, view, j.i.f41473a2);
    }

    @androidx.annotation.N
    public static H2 r1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return u1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static H2 s1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return t1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static H2 t1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (H2) ViewDataBinding.i0(layoutInflater, j.i.f41473a2, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static H2 u1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (H2) ViewDataBinding.i0(layoutInflater, j.i.f41473a2, null, false, obj);
    }

    public int q1() {
        return this.f38694k0;
    }

    public abstract void v1(int i4);
}
