package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.widget.ColorPickerView;
import com.harman.jbl.partybox.ui.widget.ForegroundMaskLayout;
import com.harman.jbl.partylight.lib.dashboard.widget.LightColorSelectView;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1964z implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final FrameLayout f40348E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ColorPickerView f40349F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final FrameLayout f40350G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40351H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final ForegroundMaskLayout f40352I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final RelativeLayout f40353J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final LightColorSelectView f40354K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final RecyclerView f40355L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.N
    public final RecyclerView f40356M;

    /* renamed from: N, reason: collision with root package name */
    @androidx.annotation.N
    public final Switch f40357N;

    /* renamed from: O, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40358O;

    /* renamed from: P, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40359P;

    /* renamed from: Q, reason: collision with root package name */
    @androidx.annotation.N
    public final View f40360Q;

    private C1964z(@androidx.annotation.N FrameLayout frameLayout, @androidx.annotation.N ColorPickerView colorPickerView, @androidx.annotation.N FrameLayout frameLayout2, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ForegroundMaskLayout foregroundMaskLayout, @androidx.annotation.N RelativeLayout relativeLayout, @androidx.annotation.N LightColorSelectView lightColorSelectView, @androidx.annotation.N RecyclerView recyclerView, @androidx.annotation.N RecyclerView recyclerView2, @androidx.annotation.N Switch r10, @androidx.annotation.N TextView textView, @androidx.annotation.N TextView textView2, @androidx.annotation.N View view) {
        this.f40348E = frameLayout;
        this.f40349F = colorPickerView;
        this.f40350G = frameLayout2;
        this.f40351H = imageView;
        this.f40352I = foregroundMaskLayout;
        this.f40353J = relativeLayout;
        this.f40354K = lightColorSelectView;
        this.f40355L = recyclerView;
        this.f40356M = recyclerView2;
        this.f40357N = r10;
        this.f40358O = textView;
        this.f40359P = textView2;
        this.f40360Q = view;
    }

    @androidx.annotation.N
    public static C1964z a(@androidx.annotation.N View view) {
        View a4;
        int i4 = j.h.f41162F2;
        ColorPickerView colorPickerView = (ColorPickerView) C2067c.a(view, i4);
        if (colorPickerView != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            i4 = j.h.q6;
            ImageView imageView = (ImageView) C2067c.a(view, i4);
            if (imageView != null) {
                i4 = j.h.e9;
                ForegroundMaskLayout foregroundMaskLayout = (ForegroundMaskLayout) C2067c.a(view, i4);
                if (foregroundMaskLayout != null) {
                    i4 = j.h.I9;
                    RelativeLayout relativeLayout = (RelativeLayout) C2067c.a(view, i4);
                    if (relativeLayout != null) {
                        i4 = j.h.qd;
                        LightColorSelectView lightColorSelectView = (LightColorSelectView) C2067c.a(view, i4);
                        if (lightColorSelectView != null) {
                            i4 = j.h.Bd;
                            RecyclerView recyclerView = (RecyclerView) C2067c.a(view, i4);
                            if (recyclerView != null) {
                                i4 = j.h.Cd;
                                RecyclerView recyclerView2 = (RecyclerView) C2067c.a(view, i4);
                                if (recyclerView2 != null) {
                                    i4 = j.h.tg;
                                    Switch r13 = (Switch) C2067c.a(view, i4);
                                    if (r13 != null) {
                                        i4 = j.h.Vg;
                                        TextView textView = (TextView) C2067c.a(view, i4);
                                        if (textView != null) {
                                            i4 = j.h.Ch;
                                            TextView textView2 = (TextView) C2067c.a(view, i4);
                                            if (textView2 != null && (a4 = C2067c.a(view, (i4 = j.h.uj))) != null) {
                                                return new C1964z(frameLayout, colorPickerView, frameLayout, imageView, foregroundMaskLayout, relativeLayout, lightColorSelectView, recyclerView, recyclerView2, r13, textView, textView2, a4);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1964z c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1964z e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41554v, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout d() {
        return this.f40348E;
    }
}
