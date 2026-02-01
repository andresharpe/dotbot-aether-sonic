package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.b2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1849b2 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39370E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39371F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39372G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39373H;

    private C1849b2(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N ConstraintLayout constraintLayout2) {
        this.f39370E = constraintLayout;
        this.f39371F = imageView;
        this.f39372G = imageView2;
        this.f39373H = constraintLayout2;
    }

    @androidx.annotation.N
    public static C1849b2 a(@androidx.annotation.N View view) {
        int i4 = j.h.W6;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = j.h.a7;
            ImageView imageView2 = (ImageView) C2067c.a(view, i4);
            if (imageView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                return new C1849b2(constraintLayout, imageView, imageView2, constraintLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1849b2 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1849b2 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41372B1, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39370E;
    }
}
