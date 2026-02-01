package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class V0 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39147E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39148F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39149G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39150H;

    private V0(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N TextView textView, @androidx.annotation.N ImageView imageView, @androidx.annotation.N TextView textView2) {
        this.f39147E = constraintLayout;
        this.f39148F = textView;
        this.f39149G = imageView;
        this.f39150H = textView2;
    }

    @androidx.annotation.N
    public static V0 a(@androidx.annotation.N View view) {
        int i4 = j.h.f41185L1;
        TextView textView = (TextView) C2067c.a(view, i4);
        if (textView != null) {
            i4 = j.h.G6;
            ImageView imageView = (ImageView) C2067c.a(view, i4);
            if (imageView != null) {
                i4 = j.h.Yi;
                TextView textView2 = (TextView) C2067c.a(view, i4);
                if (textView2 != null) {
                    return new V0((ConstraintLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static V0 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static V0 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41403J0, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39147E;
    }
}
