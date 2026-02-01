package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC0878c;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.license.AgreementFragment;

/* renamed from: com.harman.jbl.partybox.databinding.z0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1965z0 extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40361j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f40362k0;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40363l0;

    /* renamed from: m0, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40364m0;

    /* renamed from: n0, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40365n0;

    /* renamed from: o0, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40366o0;

    /* renamed from: p0, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40367p0;

    /* renamed from: q0, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40368q0;

    /* renamed from: r0, reason: collision with root package name */
    @InterfaceC0878c
    protected AgreementFragment f40369r0;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1965z0(Object obj, View view, int i4, TextView textView, ConstraintLayout constraintLayout, ImageView imageView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        super(obj, view, i4);
        this.f40361j0 = textView;
        this.f40362k0 = constraintLayout;
        this.f40363l0 = imageView;
        this.f40364m0 = textView2;
        this.f40365n0 = textView3;
        this.f40366o0 = textView4;
        this.f40367p0 = textView5;
        this.f40368q0 = textView6;
    }

    public static AbstractC1965z0 o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static AbstractC1965z0 p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (AbstractC1965z0) ViewDataBinding.r(obj, view, j.i.f41531p0);
    }

    @androidx.annotation.N
    public static AbstractC1965z0 r1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return u1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static AbstractC1965z0 s1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return t1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1965z0 t1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (AbstractC1965z0) ViewDataBinding.i0(layoutInflater, j.i.f41531p0, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1965z0 u1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (AbstractC1965z0) ViewDataBinding.i0(layoutInflater, j.i.f41531p0, null, false, obj);
    }

    @androidx.annotation.P
    public AgreementFragment q1() {
        return this.f40369r0;
    }

    public abstract void v1(@androidx.annotation.P AgreementFragment agreementFragment);
}
