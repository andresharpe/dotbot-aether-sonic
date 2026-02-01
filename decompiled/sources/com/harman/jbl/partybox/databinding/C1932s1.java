package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.s1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1932s1 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f40116E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final FrameLayout f40117F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final F1 f40118G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40119H;

    private C1932s1(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N FrameLayout frameLayout, @androidx.annotation.N F1 f12, @androidx.annotation.N TextView textView) {
        this.f40116E = constraintLayout;
        this.f40117F = frameLayout;
        this.f40118G = f12;
        this.f40119H = textView;
    }

    @androidx.annotation.N
    public static C1932s1 a(@androidx.annotation.N View view) {
        View a4;
        int i4 = j.h.f41238Y2;
        FrameLayout frameLayout = (FrameLayout) C2067c.a(view, i4);
        if (frameLayout != null && (a4 = C2067c.a(view, (i4 = j.h.x5))) != null) {
            F1 a5 = F1.a(a4);
            int i5 = j.h.ah;
            TextView textView = (TextView) C2067c.a(view, i5);
            if (textView != null) {
                return new C1932s1((ConstraintLayout) view, frameLayout, a5, textView);
            }
            i4 = i5;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1932s1 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1932s1 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41472a1, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f40116E;
    }
}
