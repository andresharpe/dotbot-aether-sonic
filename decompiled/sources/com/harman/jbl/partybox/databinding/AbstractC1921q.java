package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.InterfaceC0878c;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.party.auracast.ui.AuracastWelcomeDialog;

/* renamed from: com.harman.jbl.partybox.databinding.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1921q extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f40031j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40032k0;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f40033l0;

    /* renamed from: m0, reason: collision with root package name */
    @InterfaceC0878c
    protected AuracastWelcomeDialog f40034m0;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1921q(Object obj, View view, int i4, HmCustomFontTextView hmCustomFontTextView, ImageView imageView, HmCustomFontTextView hmCustomFontTextView2) {
        super(obj, view, i4);
        this.f40031j0 = hmCustomFontTextView;
        this.f40032k0 = imageView;
        this.f40033l0 = hmCustomFontTextView2;
    }

    public static AbstractC1921q o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static AbstractC1921q p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (AbstractC1921q) ViewDataBinding.r(obj, view, j.i.f41526o);
    }

    @androidx.annotation.N
    public static AbstractC1921q r1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return u1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static AbstractC1921q s1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return t1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1921q t1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (AbstractC1921q) ViewDataBinding.i0(layoutInflater, j.i.f41526o, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1921q u1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (AbstractC1921q) ViewDataBinding.i0(layoutInflater, j.i.f41526o, null, false, obj);
    }

    @androidx.annotation.P
    public AuracastWelcomeDialog q1() {
        return this.f40034m0;
    }

    public abstract void v1(@androidx.annotation.P AuracastWelcomeDialog auracastWelcomeDialog);
}
