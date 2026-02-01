package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.harman.jbl.partybox.j;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1886j implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final CheckBox f39697E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final CheckBox f39698F;

    private C1886j(@androidx.annotation.N CheckBox checkBox, @androidx.annotation.N CheckBox checkBox2) {
        this.f39697E = checkBox;
        this.f39698F = checkBox2;
    }

    @androidx.annotation.N
    public static C1886j a(@androidx.annotation.N View view) {
        if (view != null) {
            CheckBox checkBox = (CheckBox) view;
            return new C1886j(checkBox, checkBox);
        }
        throw new NullPointerException("rootView");
    }

    @androidx.annotation.N
    public static C1886j c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1886j e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41506j, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CheckBox d() {
        return this.f39697E;
    }
}
