package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;

/* loaded from: classes2.dex */
public abstract class O1 extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38933j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f38934k0;

    /* JADX INFO: Access modifiers changed from: protected */
    public O1(Object obj, View view, int i4, ImageView imageView, HmCustomFontTextView hmCustomFontTextView) {
        super(obj, view, i4);
        this.f38933j0 = imageView;
        this.f38934k0 = hmCustomFontTextView;
    }

    public static O1 o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static O1 p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (O1) ViewDataBinding.r(obj, view, j.i.f41548t1);
    }

    @androidx.annotation.N
    public static O1 q1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return t1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static O1 r1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return s1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static O1 s1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (O1) ViewDataBinding.i0(layoutInflater, j.i.f41548t1, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static O1 t1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (O1) ViewDataBinding.i0(layoutInflater, j.i.f41548t1, null, false, obj);
    }
}
