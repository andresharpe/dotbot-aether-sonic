package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class D1 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final LinearLayout f38543E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38544F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final RelativeLayout f38545G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38546H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38547I;

    private D1(@androidx.annotation.N LinearLayout linearLayout, @androidx.annotation.N ImageView imageView, @androidx.annotation.N RelativeLayout relativeLayout, @androidx.annotation.N TextView textView, @androidx.annotation.N TextView textView2) {
        this.f38543E = linearLayout;
        this.f38544F = imageView;
        this.f38545G = relativeLayout;
        this.f38546H = textView;
        this.f38547I = textView2;
    }

    @androidx.annotation.N
    public static D1 a(@androidx.annotation.N View view) {
        int i4 = j.h.E6;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = j.h.He;
            RelativeLayout relativeLayout = (RelativeLayout) C2067c.a(view, i4);
            if (relativeLayout != null) {
                i4 = j.h.Si;
                TextView textView = (TextView) C2067c.a(view, i4);
                if (textView != null) {
                    i4 = j.h.Vi;
                    TextView textView2 = (TextView) C2067c.a(view, i4);
                    if (textView2 != null) {
                        return new D1((LinearLayout) view, imageView, relativeLayout, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static D1 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static D1 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41512k1, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout d() {
        return this.f38543E;
    }
}
