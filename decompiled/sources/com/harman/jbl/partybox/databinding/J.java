package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC0878c;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontEditText;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.party.stereo.ui.DevRenameDialog;

/* loaded from: classes2.dex */
public abstract class J extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f38750j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f38751k0;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontEditText f38752l0;

    /* renamed from: m0, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f38753m0;

    /* renamed from: n0, reason: collision with root package name */
    @InterfaceC0878c
    protected DevRenameDialog f38754n0;

    /* JADX INFO: Access modifiers changed from: protected */
    public J(Object obj, View view, int i4, HmCustomFontTextView hmCustomFontTextView, ConstraintLayout constraintLayout, HmCustomFontEditText hmCustomFontEditText, LinearLayout linearLayout) {
        super(obj, view, i4);
        this.f38750j0 = hmCustomFontTextView;
        this.f38751k0 = constraintLayout;
        this.f38752l0 = hmCustomFontEditText;
        this.f38753m0 = linearLayout;
    }

    public static J o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static J p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (J) ViewDataBinding.r(obj, view, j.i.f41378D);
    }

    @androidx.annotation.N
    public static J r1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return u1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static J s1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return t1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static J t1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (J) ViewDataBinding.i0(layoutInflater, j.i.f41378D, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static J u1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (J) ViewDataBinding.i0(layoutInflater, j.i.f41378D, null, false, obj);
    }

    @androidx.annotation.P
    public DevRenameDialog q1() {
        return this.f38754n0;
    }

    public abstract void v1(@androidx.annotation.P DevRenameDialog devRenameDialog);
}
