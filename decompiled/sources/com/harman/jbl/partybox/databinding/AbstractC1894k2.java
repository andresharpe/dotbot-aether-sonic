package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.InterfaceC0878c;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.party.auracast.AuracastFragment;

/* renamed from: com.harman.jbl.partybox.databinding.k2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1894k2 extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39769j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39770k0;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39771l0;

    /* renamed from: m0, reason: collision with root package name */
    @InterfaceC0878c
    protected AuracastFragment f39772m0;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1894k2(Object obj, View view, int i4, TextView textView, ImageView imageView, TextView textView2) {
        super(obj, view, i4);
        this.f39769j0 = textView;
        this.f39770k0 = imageView;
        this.f39771l0 = textView2;
    }

    public static AbstractC1894k2 o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static AbstractC1894k2 p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (AbstractC1894k2) ViewDataBinding.r(obj, view, j.i.f41404J1);
    }

    @androidx.annotation.N
    public static AbstractC1894k2 r1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return u1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static AbstractC1894k2 s1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return t1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1894k2 t1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (AbstractC1894k2) ViewDataBinding.i0(layoutInflater, j.i.f41404J1, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1894k2 u1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (AbstractC1894k2) ViewDataBinding.i0(layoutInflater, j.i.f41404J1, null, false, obj);
    }

    @androidx.annotation.P
    public AuracastFragment q1() {
        return this.f39772m0;
    }

    public abstract void v1(@androidx.annotation.P AuracastFragment auracastFragment);
}
