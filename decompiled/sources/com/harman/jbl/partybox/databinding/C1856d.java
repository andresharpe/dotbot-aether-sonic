package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1856d implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39447E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final F1 f39448F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ListView f39449G;

    private C1856d(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N F1 f12, @androidx.annotation.N ListView listView) {
        this.f39447E = constraintLayout;
        this.f39448F = f12;
        this.f39449G = listView;
    }

    @androidx.annotation.N
    public static C1856d a(@androidx.annotation.N View view) {
        int i4 = j.h.x5;
        View a4 = C2067c.a(view, i4);
        if (a4 != null) {
            F1 a5 = F1.a(a4);
            int i5 = j.h.Ca;
            ListView listView = (ListView) C2067c.a(view, i5);
            if (listView != null) {
                return new C1856d((ConstraintLayout) view, a5, listView);
            }
            i4 = i5;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1856d c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1856d e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41482d, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39447E;
    }
}
