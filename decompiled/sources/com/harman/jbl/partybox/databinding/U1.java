package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.InterfaceC0878c;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.party.auracast.AuracastFragment;
import com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel;

/* loaded from: classes2.dex */
public abstract class U1 extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39121j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39122k0;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.N
    public final NestedScrollView f39123l0;

    /* renamed from: m0, reason: collision with root package name */
    @androidx.annotation.N
    public final RecyclerView f39124m0;

    /* renamed from: n0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39125n0;

    /* renamed from: o0, reason: collision with root package name */
    @InterfaceC0878c
    protected com.harman.jbl.partybox.ui.party.auracast.ui.e f39126o0;

    /* renamed from: p0, reason: collision with root package name */
    @InterfaceC0878c
    protected AuracastViewModel f39127p0;

    /* renamed from: q0, reason: collision with root package name */
    @InterfaceC0878c
    protected AuracastFragment f39128q0;

    /* JADX INFO: Access modifiers changed from: protected */
    public U1(Object obj, View view, int i4, ImageView imageView, ConstraintLayout constraintLayout, NestedScrollView nestedScrollView, RecyclerView recyclerView, HmCustomFontTextView hmCustomFontTextView) {
        super(obj, view, i4);
        this.f39121j0 = imageView;
        this.f39122k0 = constraintLayout;
        this.f39123l0 = nestedScrollView;
        this.f39124m0 = recyclerView;
        this.f39125n0 = hmCustomFontTextView;
    }

    public static U1 o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static U1 p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (U1) ViewDataBinding.r(obj, view, j.i.f41560w1);
    }

    @androidx.annotation.N
    public static U1 t1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return w1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static U1 u1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return v1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static U1 v1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (U1) ViewDataBinding.i0(layoutInflater, j.i.f41560w1, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static U1 w1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (U1) ViewDataBinding.i0(layoutInflater, j.i.f41560w1, null, false, obj);
    }

    @androidx.annotation.P
    public AuracastViewModel q1() {
        return this.f39127p0;
    }

    @androidx.annotation.P
    public AuracastFragment r1() {
        return this.f39128q0;
    }

    @androidx.annotation.P
    public com.harman.jbl.partybox.ui.party.auracast.ui.e s1() {
        return this.f39126o0;
    }

    public abstract void x1(@androidx.annotation.P AuracastViewModel auracastViewModel);

    public abstract void y1(@androidx.annotation.P AuracastFragment auracastFragment);

    public abstract void z1(@androidx.annotation.P com.harman.jbl.partybox.ui.party.auracast.ui.e eVar);
}
