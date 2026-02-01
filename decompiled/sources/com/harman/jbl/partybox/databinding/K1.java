package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC0878c;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.party.auracast.AuracastFragment;
import com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel;

/* loaded from: classes2.dex */
public abstract class K1 extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final AbstractC1859d2 f38816j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final AbstractC1958x2 f38817k0;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.N
    public final S1 f38818l0;

    /* renamed from: m0, reason: collision with root package name */
    @androidx.annotation.N
    public final W1 f38819m0;

    /* renamed from: n0, reason: collision with root package name */
    @androidx.annotation.N
    public final F2 f38820n0;

    /* renamed from: o0, reason: collision with root package name */
    @androidx.annotation.N
    public final O1 f38821o0;

    /* renamed from: p0, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f38822p0;

    /* renamed from: q0, reason: collision with root package name */
    @androidx.annotation.N
    public final Q1 f38823q0;

    /* renamed from: r0, reason: collision with root package name */
    @androidx.annotation.N
    public final LottieAnimationView f38824r0;

    /* renamed from: s0, reason: collision with root package name */
    @androidx.annotation.N
    public final L2 f38825s0;

    /* renamed from: t0, reason: collision with root package name */
    @androidx.annotation.N
    public final U1 f38826t0;

    /* renamed from: u0, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f38827u0;

    /* renamed from: v0, reason: collision with root package name */
    @InterfaceC0878c
    protected AuracastFragment f38828v0;

    /* renamed from: w0, reason: collision with root package name */
    @InterfaceC0878c
    protected AuracastViewModel f38829w0;

    /* renamed from: x0, reason: collision with root package name */
    @InterfaceC0878c
    protected com.harman.jbl.partybox.ui.party.auracast.ui.e f38830x0;

    /* renamed from: y0, reason: collision with root package name */
    @InterfaceC0878c
    protected com.harman.jbl.partybox.ui.party.auracast.ui.c f38831y0;

    /* JADX INFO: Access modifiers changed from: protected */
    public K1(Object obj, View view, int i4, AbstractC1859d2 abstractC1859d2, AbstractC1958x2 abstractC1958x2, S1 s12, W1 w12, F2 f22, O1 o12, ConstraintLayout constraintLayout, Q1 q12, LottieAnimationView lottieAnimationView, L2 l22, U1 u12, ConstraintLayout constraintLayout2) {
        super(obj, view, i4);
        this.f38816j0 = abstractC1859d2;
        this.f38817k0 = abstractC1958x2;
        this.f38818l0 = s12;
        this.f38819m0 = w12;
        this.f38820n0 = f22;
        this.f38821o0 = o12;
        this.f38822p0 = constraintLayout;
        this.f38823q0 = q12;
        this.f38824r0 = lottieAnimationView;
        this.f38825s0 = l22;
        this.f38826t0 = u12;
        this.f38827u0 = constraintLayout2;
    }

    public static K1 o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static K1 p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (K1) ViewDataBinding.r(obj, view, j.i.f41540r1);
    }

    @androidx.annotation.N
    public static K1 u1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return x1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static K1 v1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return w1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static K1 w1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (K1) ViewDataBinding.i0(layoutInflater, j.i.f41540r1, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static K1 x1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (K1) ViewDataBinding.i0(layoutInflater, j.i.f41540r1, null, false, obj);
    }

    public abstract void A1(@androidx.annotation.P com.harman.jbl.partybox.ui.party.auracast.ui.c cVar);

    public abstract void B1(@androidx.annotation.P com.harman.jbl.partybox.ui.party.auracast.ui.e eVar);

    @androidx.annotation.P
    public AuracastViewModel q1() {
        return this.f38829w0;
    }

    @androidx.annotation.P
    public AuracastFragment r1() {
        return this.f38828v0;
    }

    @androidx.annotation.P
    public com.harman.jbl.partybox.ui.party.auracast.ui.c s1() {
        return this.f38831y0;
    }

    @androidx.annotation.P
    public com.harman.jbl.partybox.ui.party.auracast.ui.e t1() {
        return this.f38830x0;
    }

    public abstract void y1(@androidx.annotation.P AuracastViewModel auracastViewModel);

    public abstract void z1(@androidx.annotation.P AuracastFragment auracastFragment);
}
