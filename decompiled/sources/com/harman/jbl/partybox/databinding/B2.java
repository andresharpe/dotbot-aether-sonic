package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class B2 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final CardView f38491E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38492F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f38493G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38494H;

    private B2(@androidx.annotation.N CardView cardView, @androidx.annotation.N ImageView imageView, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView, @androidx.annotation.N ImageView imageView2) {
        this.f38491E = cardView;
        this.f38492F = imageView;
        this.f38493G = hmCustomFontTextView;
        this.f38494H = imageView2;
    }

    @androidx.annotation.N
    public static B2 a(@androidx.annotation.N View view) {
        int i4 = j.h.mc;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = j.h.nc;
            HmCustomFontTextView hmCustomFontTextView = (HmCustomFontTextView) C2067c.a(view, i4);
            if (hmCustomFontTextView != null) {
                i4 = j.h.oc;
                ImageView imageView2 = (ImageView) C2067c.a(view, i4);
                if (imageView2 != null) {
                    return new B2((CardView) view, imageView, hmCustomFontTextView, imageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static B2 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static B2 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41452V1, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CardView d() {
        return this.f38491E;
    }
}
