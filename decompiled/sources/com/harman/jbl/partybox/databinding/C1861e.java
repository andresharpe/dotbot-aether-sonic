package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1861e implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39495E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final FrameLayout f39496F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final C1850b3 f39497G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final TabLayout f39498H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final TabItem f39499I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final TabItem f39500J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final TabItem f39501K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39502L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.N
    public final ViewPager2 f39503M;

    private C1861e(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N FrameLayout frameLayout, @androidx.annotation.N C1850b3 c1850b3, @androidx.annotation.N TabLayout tabLayout, @androidx.annotation.N TabItem tabItem, @androidx.annotation.N TabItem tabItem2, @androidx.annotation.N TabItem tabItem3, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView, @androidx.annotation.N ViewPager2 viewPager2) {
        this.f39495E = constraintLayout;
        this.f39496F = frameLayout;
        this.f39497G = c1850b3;
        this.f39498H = tabLayout;
        this.f39499I = tabItem;
        this.f39500J = tabItem2;
        this.f39501K = tabItem3;
        this.f39502L = hmCustomFontTextView;
        this.f39503M = viewPager2;
    }

    @androidx.annotation.N
    public static C1861e a(@androidx.annotation.N View view) {
        View a4;
        int i4 = j.h.f41238Y2;
        FrameLayout frameLayout = (FrameLayout) C2067c.a(view, i4);
        if (frameLayout != null && (a4 = C2067c.a(view, (i4 = j.h.Lc))) != null) {
            C1850b3 a5 = C1850b3.a(a4);
            i4 = j.h.wg;
            TabLayout tabLayout = (TabLayout) C2067c.a(view, i4);
            if (tabLayout != null) {
                i4 = j.h.xg;
                TabItem tabItem = (TabItem) C2067c.a(view, i4);
                if (tabItem != null) {
                    i4 = j.h.yg;
                    TabItem tabItem2 = (TabItem) C2067c.a(view, i4);
                    if (tabItem2 != null) {
                        i4 = j.h.zg;
                        TabItem tabItem3 = (TabItem) C2067c.a(view, i4);
                        if (tabItem3 != null) {
                            i4 = j.h.hi;
                            HmCustomFontTextView hmCustomFontTextView = (HmCustomFontTextView) C2067c.a(view, i4);
                            if (hmCustomFontTextView != null) {
                                i4 = j.h.Cj;
                                ViewPager2 viewPager2 = (ViewPager2) C2067c.a(view, i4);
                                if (viewPager2 != null) {
                                    return new C1861e((ConstraintLayout) view, frameLayout, a5, tabLayout, tabItem, tabItem2, tabItem3, hmCustomFontTextView, viewPager2);
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
    public static C1861e c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1861e e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41486e, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39495E;
    }
}
