package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.widget.TickProgressView;
import com.harman.jbl.partybox.ui.widget.TickView;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class z3 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f40380E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40381F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40382G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final TickProgressView f40383H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final TickView f40384I;

    private z3(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N TickProgressView tickProgressView, @androidx.annotation.N TickView tickView) {
        this.f40380E = constraintLayout;
        this.f40381F = imageView;
        this.f40382G = imageView2;
        this.f40383H = tickProgressView;
        this.f40384I = tickView;
    }

    @androidx.annotation.N
    public static z3 a(@androidx.annotation.N View view) {
        int i4 = j.h.c7;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = j.h.u7;
            ImageView imageView2 = (ImageView) C2067c.a(view, i4);
            if (imageView2 != null) {
                i4 = j.h.Pg;
                TickProgressView tickProgressView = (TickProgressView) C2067c.a(view, i4);
                if (tickProgressView != null) {
                    i4 = j.h.Qg;
                    TickView tickView = (TickView) C2067c.a(view, i4);
                    if (tickView != null) {
                        return new z3((ConstraintLayout) view, imageView, imageView2, tickProgressView, tickView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static z3 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static z3 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41373B2, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f40380E;
    }
}
