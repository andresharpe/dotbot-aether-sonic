package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.harman.jbl.partybox.j;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class B1 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final CheckBox f38489E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final CheckBox f38490F;

    private B1(@androidx.annotation.N CheckBox checkBox, @androidx.annotation.N CheckBox checkBox2) {
        this.f38489E = checkBox;
        this.f38490F = checkBox2;
    }

    @androidx.annotation.N
    public static B1 a(@androidx.annotation.N View view) {
        if (view != null) {
            CheckBox checkBox = (CheckBox) view;
            return new B1(checkBox, checkBox);
        }
        throw new NullPointerException("rootView");
    }

    @androidx.annotation.N
    public static B1 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static B1 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41504i1, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CheckBox d() {
        return this.f38489E;
    }
}
