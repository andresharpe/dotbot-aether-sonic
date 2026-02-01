package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class X0 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final FrameLayout f39197E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final FrameLayout f39198F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39199G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39200H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39201I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39202J;

    private X0(@androidx.annotation.N FrameLayout frameLayout, @androidx.annotation.N FrameLayout frameLayout2, @androidx.annotation.N TextView textView, @androidx.annotation.N TextView textView2, @androidx.annotation.N TextView textView3, @androidx.annotation.N TextView textView4) {
        this.f39197E = frameLayout;
        this.f39198F = frameLayout2;
        this.f39199G = textView;
        this.f39200H = textView2;
        this.f39201I = textView3;
        this.f39202J = textView4;
    }

    @androidx.annotation.N
    public static X0 a(@androidx.annotation.N View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i4 = j.h.Qf;
        TextView textView = (TextView) C2067c.a(view, i4);
        if (textView != null) {
            i4 = j.h.gg;
            TextView textView2 = (TextView) C2067c.a(view, i4);
            if (textView2 != null) {
                i4 = j.h.Vg;
                TextView textView3 = (TextView) C2067c.a(view, i4);
                if (textView3 != null) {
                    i4 = j.h.sh;
                    TextView textView4 = (TextView) C2067c.a(view, i4);
                    if (textView4 != null) {
                        return new X0(frameLayout, frameLayout, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static X0 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static X0 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41411L0, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout d() {
        return this.f39197E;
    }
}
