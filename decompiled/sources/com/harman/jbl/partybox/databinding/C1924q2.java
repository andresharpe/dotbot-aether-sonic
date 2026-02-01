package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.harman.jbl.partybox.j;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.q2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1924q2 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final View f40053E;

    private C1924q2(@androidx.annotation.N View view) {
        this.f40053E = view;
    }

    @androidx.annotation.N
    public static C1924q2 a(@androidx.annotation.N View view) {
        if (view != null) {
            return new C1924q2(view);
        }
        throw new NullPointerException("rootView");
    }

    @androidx.annotation.N
    public static C1924q2 b(@androidx.annotation.N LayoutInflater layoutInflater) {
        return c(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1924q2 c(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41424O1, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    public View d() {
        return this.f40053E;
    }
}
