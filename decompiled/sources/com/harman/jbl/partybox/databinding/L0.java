package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class L0 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final FrameLayout f38850E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final FrameLayout f38851F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38852G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38853H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f38854I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final ViewPager2 f38855J;

    private L0(@androidx.annotation.N FrameLayout frameLayout, @androidx.annotation.N FrameLayout frameLayout2, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N LinearLayout linearLayout, @androidx.annotation.N ViewPager2 viewPager2) {
        this.f38850E = frameLayout;
        this.f38851F = frameLayout2;
        this.f38852G = imageView;
        this.f38853H = imageView2;
        this.f38854I = linearLayout;
        this.f38855J = viewPager2;
    }

    @androidx.annotation.N
    public static L0 a(@androidx.annotation.N View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i4 = j.h.F4;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = j.h.q6;
            ImageView imageView2 = (ImageView) C2067c.a(view, i4);
            if (imageView2 != null) {
                i4 = j.h.N6;
                LinearLayout linearLayout = (LinearLayout) C2067c.a(view, i4);
                if (linearLayout != null) {
                    i4 = j.h.Ab;
                    ViewPager2 viewPager2 = (ViewPager2) C2067c.a(view, i4);
                    if (viewPager2 != null) {
                        return new L0(frameLayout, frameLayout, imageView, imageView2, linearLayout, viewPager2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static L0 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static L0 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41571z0, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout d() {
        return this.f38850E;
    }
}
