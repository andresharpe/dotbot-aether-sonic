package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1847b0 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final FrameLayout f39359E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39360F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final FrameLayout f39361G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39362H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39363I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39364J;

    private C1847b0(@androidx.annotation.N FrameLayout frameLayout, @androidx.annotation.N TextView textView, @androidx.annotation.N FrameLayout frameLayout2, @androidx.annotation.N TextView textView2, @androidx.annotation.N TextView textView3, @androidx.annotation.N TextView textView4) {
        this.f39359E = frameLayout;
        this.f39360F = textView;
        this.f39361G = frameLayout2;
        this.f39362H = textView2;
        this.f39363I = textView3;
        this.f39364J = textView4;
    }

    @androidx.annotation.N
    public static C1847b0 a(@androidx.annotation.N View view) {
        int i4 = j.h.f41246a2;
        TextView textView = (TextView) C2067c.a(view, i4);
        if (textView != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            i4 = j.h.gg;
            TextView textView2 = (TextView) C2067c.a(view, i4);
            if (textView2 != null) {
                i4 = j.h.Vg;
                TextView textView3 = (TextView) C2067c.a(view, i4);
                if (textView3 != null) {
                    i4 = j.h.Ij;
                    TextView textView4 = (TextView) C2067c.a(view, i4);
                    if (textView4 != null) {
                        return new C1847b0(frameLayout, textView, frameLayout, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1847b0 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1847b0 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41438S, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout d() {
        return this.f39359E;
    }
}
