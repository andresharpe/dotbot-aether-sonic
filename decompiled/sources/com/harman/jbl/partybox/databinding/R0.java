package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.widget.ShapeTextButton;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class R0 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f38998E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final RecyclerView f38999F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ViewPager2 f39000G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final F1 f39001H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f39002I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39003J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final ShapeTextButton f39004K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final ShapeTextButton f39005L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.N
    public final ShapeTextButton f39006M;

    private R0(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N RecyclerView recyclerView, @androidx.annotation.N ViewPager2 viewPager2, @androidx.annotation.N F1 f12, @androidx.annotation.N LinearLayout linearLayout, @androidx.annotation.N TextView textView, @androidx.annotation.N ShapeTextButton shapeTextButton, @androidx.annotation.N ShapeTextButton shapeTextButton2, @androidx.annotation.N ShapeTextButton shapeTextButton3) {
        this.f38998E = constraintLayout;
        this.f38999F = recyclerView;
        this.f39000G = viewPager2;
        this.f39001H = f12;
        this.f39002I = linearLayout;
        this.f39003J = textView;
        this.f39004K = shapeTextButton;
        this.f39005L = shapeTextButton2;
        this.f39006M = shapeTextButton3;
    }

    @androidx.annotation.N
    public static R0 a(@androidx.annotation.N View view) {
        View a4;
        int i4 = j.h.f41241Z1;
        RecyclerView recyclerView = (RecyclerView) C2067c.a(view, i4);
        if (recyclerView != null) {
            i4 = j.h.f41229W1;
            ViewPager2 viewPager2 = (ViewPager2) C2067c.a(view, i4);
            if (viewPager2 != null && (a4 = C2067c.a(view, (i4 = j.h.x5))) != null) {
                F1 a5 = F1.a(a4);
                i4 = j.h.J8;
                LinearLayout linearLayout = (LinearLayout) C2067c.a(view, i4);
                if (linearLayout != null) {
                    i4 = j.h.Nb;
                    TextView textView = (TextView) C2067c.a(view, i4);
                    if (textView != null) {
                        i4 = j.h.Ag;
                        ShapeTextButton shapeTextButton = (ShapeTextButton) C2067c.a(view, i4);
                        if (shapeTextButton != null) {
                            i4 = j.h.Bg;
                            ShapeTextButton shapeTextButton2 = (ShapeTextButton) C2067c.a(view, i4);
                            if (shapeTextButton2 != null) {
                                i4 = j.h.Cg;
                                ShapeTextButton shapeTextButton3 = (ShapeTextButton) C2067c.a(view, i4);
                                if (shapeTextButton3 != null) {
                                    return new R0((ConstraintLayout) view, recyclerView, viewPager2, a5, linearLayout, textView, shapeTextButton, shapeTextButton2, shapeTextButton3);
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
    public static R0 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static R0 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41387F0, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f38998E;
    }
}
