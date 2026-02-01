package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.InterfaceC0878c;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.party.auracast.AuracastFragment;
import com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel;

/* renamed from: com.harman.jbl.partybox.databinding.x2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1958x2 extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final W2 f40308j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final Y2 f40309k0;

    /* renamed from: l0, reason: collision with root package name */
    @InterfaceC0878c
    protected AuracastViewModel f40310l0;

    /* renamed from: m0, reason: collision with root package name */
    @InterfaceC0878c
    protected AuracastFragment f40311m0;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1958x2(Object obj, View view, int i4, W2 w22, Y2 y22) {
        super(obj, view, i4);
        this.f40308j0 = w22;
        this.f40309k0 = y22;
    }

    public static AbstractC1958x2 o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static AbstractC1958x2 p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (AbstractC1958x2) ViewDataBinding.r(obj, view, j.i.f41440S1);
    }

    @androidx.annotation.N
    public static AbstractC1958x2 s1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return v1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static AbstractC1958x2 t1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return u1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1958x2 u1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (AbstractC1958x2) ViewDataBinding.i0(layoutInflater, j.i.f41440S1, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1958x2 v1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (AbstractC1958x2) ViewDataBinding.i0(layoutInflater, j.i.f41440S1, null, false, obj);
    }

    @androidx.annotation.P
    public AuracastViewModel q1() {
        return this.f40310l0;
    }

    @androidx.annotation.P
    public AuracastFragment r1() {
        return this.f40311m0;
    }

    public abstract void w1(@androidx.annotation.P AuracastViewModel auracastViewModel);

    public abstract void x1(@androidx.annotation.P AuracastFragment auracastFragment);
}
