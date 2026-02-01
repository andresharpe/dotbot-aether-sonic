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

/* renamed from: com.harman.jbl.partybox.databinding.m2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1904m2 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final LinearLayout f39851E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39852F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39853G;

    private C1904m2(@androidx.annotation.N LinearLayout linearLayout, @androidx.annotation.N ImageView imageView, @androidx.annotation.N TextView textView) {
        this.f39851E = linearLayout;
        this.f39852F = imageView;
        this.f39853G = textView;
    }

    @androidx.annotation.N
    public static C1904m2 a(@androidx.annotation.N View view) {
        int i4 = j.h.h7;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = j.h.Kh;
            TextView textView = (TextView) C2067c.a(view, i4);
            if (textView != null) {
                return new C1904m2((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1904m2 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1904m2 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41408K1, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout d() {
        return this.f39851E;
    }
}
