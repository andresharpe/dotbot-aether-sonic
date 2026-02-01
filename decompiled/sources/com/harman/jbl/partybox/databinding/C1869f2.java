package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.f2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1869f2 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final RelativeLayout f39578E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final View f39579F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final View f39580G;

    private C1869f2(@androidx.annotation.N RelativeLayout relativeLayout, @androidx.annotation.N View view, @androidx.annotation.N View view2) {
        this.f39578E = relativeLayout;
        this.f39579F = view;
        this.f39580G = view2;
    }

    @androidx.annotation.N
    public static C1869f2 a(@androidx.annotation.N View view) {
        View a4;
        int i4 = j.h.y3;
        View a5 = C2067c.a(view, i4);
        if (a5 != null && (a4 = C2067c.a(view, (i4 = j.h.z3))) != null) {
            return new C1869f2((RelativeLayout) view, a5, a4);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1869f2 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1869f2 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41384E1, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout d() {
        return this.f39578E;
    }
}
