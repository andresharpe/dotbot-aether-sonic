package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.InterfaceC0878c;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.party.auracast.AuracastFragment;
import com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel;

/* loaded from: classes2.dex */
public abstract class H extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @InterfaceC0878c
    protected AuracastFragment f38669j0;

    /* renamed from: k0, reason: collision with root package name */
    @InterfaceC0878c
    protected AuracastViewModel f38670k0;

    /* JADX INFO: Access modifiers changed from: protected */
    public H(Object obj, View view, int i4) {
        super(obj, view, i4);
    }

    public static H o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static H p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (H) ViewDataBinding.r(obj, view, j.i.f41374C);
    }

    @androidx.annotation.N
    public static H s1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return v1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static H t1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return u1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static H u1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (H) ViewDataBinding.i0(layoutInflater, j.i.f41374C, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static H v1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (H) ViewDataBinding.i0(layoutInflater, j.i.f41374C, null, false, obj);
    }

    @androidx.annotation.P
    public AuracastFragment q1() {
        return this.f38669j0;
    }

    @androidx.annotation.P
    public AuracastViewModel r1() {
        return this.f38670k0;
    }

    public abstract void w1(@androidx.annotation.P AuracastFragment auracastFragment);

    public abstract void x1(@androidx.annotation.P AuracastViewModel auracastViewModel);
}
