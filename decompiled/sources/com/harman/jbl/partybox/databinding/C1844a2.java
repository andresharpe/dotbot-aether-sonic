package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.a2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1844a2 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39335E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39336F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39337G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39338H;

    private C1844a2(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N TextView textView, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView, @androidx.annotation.N ImageView imageView) {
        this.f39335E = constraintLayout;
        this.f39336F = textView;
        this.f39337G = hmCustomFontTextView;
        this.f39338H = imageView;
    }

    @androidx.annotation.N
    public static C1844a2 a(@androidx.annotation.N View view) {
        int i4 = j.h.f41266e2;
        TextView textView = (TextView) C2067c.a(view, i4);
        if (textView != null) {
            i4 = j.h.f41286i2;
            HmCustomFontTextView hmCustomFontTextView = (HmCustomFontTextView) C2067c.a(view, i4);
            if (hmCustomFontTextView != null) {
                i4 = j.h.J4;
                ImageView imageView = (ImageView) C2067c.a(view, i4);
                if (imageView != null) {
                    return new C1844a2((ConstraintLayout) view, textView, hmCustomFontTextView, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1844a2 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1844a2 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41368A1, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39335E;
    }
}
