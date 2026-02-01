package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1930s implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final FrameLayout f40103E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final FrameLayout f40104F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40105G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40106H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40107I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40108J;

    private C1930s(@androidx.annotation.N FrameLayout frameLayout, @androidx.annotation.N FrameLayout frameLayout2, @androidx.annotation.N TextView textView, @androidx.annotation.N TextView textView2, @androidx.annotation.N TextView textView3, @androidx.annotation.N TextView textView4) {
        this.f40103E = frameLayout;
        this.f40104F = frameLayout2;
        this.f40105G = textView;
        this.f40106H = textView2;
        this.f40107I = textView3;
        this.f40108J = textView4;
    }

    @androidx.annotation.N
    public static C1930s a(@androidx.annotation.N View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i4 = j.h.f41272f3;
        TextView textView = (TextView) C2067c.a(view, i4);
        if (textView != null) {
            i4 = j.h.od;
            TextView textView2 = (TextView) C2067c.a(view, i4);
            if (textView2 != null) {
                i4 = j.h.Eg;
                TextView textView3 = (TextView) C2067c.a(view, i4);
                if (textView3 != null) {
                    i4 = j.h.Gg;
                    TextView textView4 = (TextView) C2067c.a(view, i4);
                    if (textView4 != null) {
                        return new C1930s(frameLayout, frameLayout, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1930s c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1930s e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41530p, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout d() {
        return this.f40103E;
    }
}
