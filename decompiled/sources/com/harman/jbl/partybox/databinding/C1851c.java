package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1851c implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39381E;

    private C1851c(@androidx.annotation.N ConstraintLayout constraintLayout) {
        this.f39381E = constraintLayout;
    }

    @androidx.annotation.N
    public static C1851c a(@androidx.annotation.N View view) {
        if (view != null) {
            return new C1851c((ConstraintLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @androidx.annotation.N
    public static C1851c c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1851c e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41478c, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39381E;
    }
}
