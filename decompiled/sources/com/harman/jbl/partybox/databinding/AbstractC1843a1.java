package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC0878c;
import androidx.databinding.ViewDataBinding;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.support.RenameDeviceFragment;

/* renamed from: com.harman.jbl.partybox.databinding.a1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1843a1 extends ViewDataBinding {

    /* renamed from: j0, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39328j0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39329k0;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.N
    public final F1 f39330l0;

    /* renamed from: m0, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f39331m0;

    /* renamed from: n0, reason: collision with root package name */
    @androidx.annotation.N
    public final ScrollView f39332n0;

    /* renamed from: o0, reason: collision with root package name */
    @androidx.annotation.N
    public final EditText f39333o0;

    /* renamed from: p0, reason: collision with root package name */
    @InterfaceC0878c
    protected RenameDeviceFragment f39334p0;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1843a1(Object obj, View view, int i4, ConstraintLayout constraintLayout, ImageView imageView, F1 f12, LinearLayout linearLayout, ScrollView scrollView, EditText editText) {
        super(obj, view, i4);
        this.f39328j0 = constraintLayout;
        this.f39329k0 = imageView;
        this.f39330l0 = f12;
        this.f39331m0 = linearLayout;
        this.f39332n0 = scrollView;
        this.f39333o0 = editText;
    }

    public static AbstractC1843a1 o1(@androidx.annotation.N View view) {
        return p1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static AbstractC1843a1 p1(@androidx.annotation.N View view, @androidx.annotation.P Object obj) {
        return (AbstractC1843a1) ViewDataBinding.r(obj, view, j.i.f41423O0);
    }

    @androidx.annotation.N
    public static AbstractC1843a1 r1(@androidx.annotation.N LayoutInflater layoutInflater) {
        return u1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    public static AbstractC1843a1 s1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        return t1(layoutInflater, viewGroup, z3, androidx.databinding.m.i());
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1843a1 t1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3, @androidx.annotation.P Object obj) {
        return (AbstractC1843a1) ViewDataBinding.i0(layoutInflater, j.i.f41423O0, viewGroup, z3, obj);
    }

    @androidx.annotation.N
    @Deprecated
    public static AbstractC1843a1 u1(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P Object obj) {
        return (AbstractC1843a1) ViewDataBinding.i0(layoutInflater, j.i.f41423O0, null, false, obj);
    }

    @androidx.annotation.P
    public RenameDeviceFragment q1() {
        return this.f39334p0;
    }

    public abstract void v1(@androidx.annotation.P RenameDeviceFragment renameDeviceFragment);
}
