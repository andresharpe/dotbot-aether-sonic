package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC0878c;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.party.auracast.AuracastFragment;
import com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel;

/* loaded from: classes2.dex */
public abstract class L2 extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38860j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f38861k0;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.N
    public final RecyclerView f38862l0;

    /* renamed from: m0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f38863m0;

    /* renamed from: n0, reason: collision with root package name */
    @InterfaceC0878c
    protected com.harman.jbl.partybox.ui.party.auracast.ui.c f38864n0;

    /* renamed from: o0, reason: collision with root package name */
    @InterfaceC0878c
    protected AuracastViewModel f38865o0;

    /* renamed from: p0, reason: collision with root package name */
    @InterfaceC0878c
    protected AuracastFragment f38866p0;

    /* JADX INFO: Access modifiers changed from: protected */
    public L2(Object obj, View view, int i4, ImageView imageView, ConstraintLayout constraintLayout, RecyclerView recyclerView, HmCustomFontTextView hmCustomFontTextView) {
        super(obj, view, i4);
        this.f38860j0 = imageView;
        this.f38861k0 = constraintLayout;
        this.f38862l0 = recyclerView;
        this.f38863m0 = hmCustomFontTextView;
    }

    public static L2 o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static L2 p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (L2) ViewDataBinding.r(obj, view, j.i.f41481c2);
    }

    @androidx.annotation.N
    public static L2 t1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return w1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static L2 u1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return v1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static L2 v1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (L2) ViewDataBinding.i0(layoutInflater, j.i.f41481c2, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static L2 w1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (L2) ViewDataBinding.i0(layoutInflater, j.i.f41481c2, null, false, obj);
    }

    @androidx.annotation.P
    public com.harman.jbl.partybox.ui.party.auracast.ui.c q1() {
        return this.f38864n0;
    }

    @androidx.annotation.P
    public AuracastViewModel r1() {
        return this.f38865o0;
    }

    @androidx.annotation.P
    public AuracastFragment s1() {
        return this.f38866p0;
    }

    public abstract void x1(@androidx.annotation.P com.harman.jbl.partybox.ui.party.auracast.ui.c cVar);

    public abstract void y1(@androidx.annotation.P AuracastViewModel auracastViewModel);

    public abstract void z1(@androidx.annotation.P AuracastFragment auracastFragment);
}
