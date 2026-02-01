package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.InterfaceC0878c;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.welcome.WelcomeFragment;

/* renamed from: com.harman.jbl.partybox.databinding.u1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1942u1 extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40192j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40193k0;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40194l0;

    /* renamed from: m0, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40195m0;

    /* renamed from: n0, reason: collision with root package name */
    @InterfaceC0878c
    protected WelcomeFragment f40196n0;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1942u1(Object obj, View view, int i4, TextView textView, ImageView imageView, TextView textView2, TextView textView3) {
        super(obj, view, i4);
        this.f40192j0 = textView;
        this.f40193k0 = imageView;
        this.f40194l0 = textView2;
        this.f40195m0 = textView3;
    }

    public static AbstractC1942u1 o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static AbstractC1942u1 p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (AbstractC1942u1) ViewDataBinding.r(obj, view, j.i.f41480c1);
    }

    @androidx.annotation.N
    public static AbstractC1942u1 r1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return u1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static AbstractC1942u1 s1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return t1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1942u1 t1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (AbstractC1942u1) ViewDataBinding.i0(layoutInflater, j.i.f41480c1, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1942u1 u1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (AbstractC1942u1) ViewDataBinding.i0(layoutInflater, j.i.f41480c1, null, false, obj);
    }

    @androidx.annotation.P
    public WelcomeFragment q1() {
        return this.f40196n0;
    }

    public abstract void v1(@androidx.annotation.P WelcomeFragment welcomeFragment);
}
