package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class O3 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final LinearLayout f38940E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38941F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f38942G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38943H;

    private O3(@androidx.annotation.N LinearLayout linearLayout, @androidx.annotation.N ImageView imageView, @androidx.annotation.N LinearLayout linearLayout2, @androidx.annotation.N TextView textView) {
        this.f38940E = linearLayout;
        this.f38941F = imageView;
        this.f38942G = linearLayout2;
        this.f38943H = textView;
    }

    @androidx.annotation.N
    public static O3 a(@androidx.annotation.N View view) {
        int i4 = j.h.A7;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i5 = j.h.ci;
            TextView textView = (TextView) C2067c.a(view, i5);
            if (textView != null) {
                return new O3(linearLayout, imageView, linearLayout, textView);
            }
            i4 = i5;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static O3 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static O3 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41433Q2, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout d() {
        return this.f38940E;
    }
}
