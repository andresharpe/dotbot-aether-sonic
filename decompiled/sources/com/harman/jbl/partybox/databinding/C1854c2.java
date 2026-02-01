package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.c2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1854c2 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final CollapsingToolbarLayout f39419E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final CollapsingToolbarLayout f39420F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39421G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39422H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39423I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f39424J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final Toolbar f39425K;

    private C1854c2(@androidx.annotation.N CollapsingToolbarLayout collapsingToolbarLayout, @androidx.annotation.N CollapsingToolbarLayout collapsingToolbarLayout2, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N ImageView imageView3, @androidx.annotation.N LinearLayout linearLayout, @androidx.annotation.N Toolbar toolbar) {
        this.f39419E = collapsingToolbarLayout;
        this.f39420F = collapsingToolbarLayout2;
        this.f39421G = imageView;
        this.f39422H = imageView2;
        this.f39423I = imageView3;
        this.f39424J = linearLayout;
        this.f39425K = toolbar;
    }

    @androidx.annotation.N
    public static C1854c2 a(@androidx.annotation.N View view) {
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) view;
        int i4 = j.h.Y6;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = j.h.e7;
            ImageView imageView2 = (ImageView) C2067c.a(view, i4);
            if (imageView2 != null) {
                i4 = j.h.E7;
                ImageView imageView3 = (ImageView) C2067c.a(view, i4);
                if (imageView3 != null) {
                    i4 = j.h.g9;
                    LinearLayout linearLayout = (LinearLayout) C2067c.a(view, i4);
                    if (linearLayout != null) {
                        i4 = j.h.ph;
                        Toolbar toolbar = (Toolbar) C2067c.a(view, i4);
                        if (toolbar != null) {
                            return new C1854c2(collapsingToolbarLayout, collapsingToolbarLayout, imageView, imageView2, imageView3, linearLayout, toolbar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1854c2 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1854c2 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41376C1, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CollapsingToolbarLayout d() {
        return this.f39419E;
    }
}
