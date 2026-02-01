package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class T3 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39094E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39095F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final RecyclerView f39096G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39097H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39098I;

    private T3(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ImageView imageView, @androidx.annotation.N RecyclerView recyclerView, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView2) {
        this.f39094E = constraintLayout;
        this.f39095F = imageView;
        this.f39096G = recyclerView;
        this.f39097H = hmCustomFontTextView;
        this.f39098I = hmCustomFontTextView2;
    }

    @androidx.annotation.N
    public static T3 a(@androidx.annotation.N View view) {
        int i4 = j.h.d7;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = j.h.Fd;
            RecyclerView recyclerView = (RecyclerView) C2067c.a(view, i4);
            if (recyclerView != null) {
                i4 = j.h.Ih;
                HmCustomFontTextView hmCustomFontTextView = (HmCustomFontTextView) C2067c.a(view, i4);
                if (hmCustomFontTextView != null) {
                    i4 = j.h.Ai;
                    HmCustomFontTextView hmCustomFontTextView2 = (HmCustomFontTextView) C2067c.a(view, i4);
                    if (hmCustomFontTextView2 != null) {
                        return new T3((ConstraintLayout) view, imageView, recyclerView, hmCustomFontTextView, hmCustomFontTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static T3 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static T3 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41453V2, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39094E;
    }
}
