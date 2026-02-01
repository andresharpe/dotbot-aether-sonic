package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.widget.eq.Equalizer2View;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1882i0 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39676E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final Equalizer2View f39677F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final J1 f39678G;

    private C1882i0(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N Equalizer2View equalizer2View, @androidx.annotation.N J1 j12) {
        this.f39676E = constraintLayout;
        this.f39677F = equalizer2View;
        this.f39678G = j12;
    }

    @androidx.annotation.N
    public static C1882i0 a(@androidx.annotation.N View view) {
        View a4;
        int i4 = j.h.w4;
        Equalizer2View equalizer2View = (Equalizer2View) C2067c.a(view, i4);
        if (equalizer2View != null && (a4 = C2067c.a(view, (i4 = j.h.x5))) != null) {
            return new C1882i0((ConstraintLayout) view, equalizer2View, J1.a(a4));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1882i0 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1882i0 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41466Z, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39676E;
    }
}
