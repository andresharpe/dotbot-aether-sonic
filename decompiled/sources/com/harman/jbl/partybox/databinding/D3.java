package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class D3 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final FrameLayout f38556E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38557F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38558G;

    private D3(@androidx.annotation.N FrameLayout frameLayout, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ImageView imageView2) {
        this.f38556E = frameLayout;
        this.f38557F = imageView;
        this.f38558G = imageView2;
    }

    @androidx.annotation.N
    public static D3 a(@androidx.annotation.N View view) {
        int i4 = j.h.L7;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = j.h.M7;
            ImageView imageView2 = (ImageView) C2067c.a(view, i4);
            if (imageView2 != null) {
                return new D3((FrameLayout) view, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static D3 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static D3 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41389F2, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout d() {
        return this.f38556E;
    }
}
