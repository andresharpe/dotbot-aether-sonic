package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1945v implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final FrameLayout f40205E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final FrameLayout f40206F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40207G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40208H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40209I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40210J;

    private C1945v(@androidx.annotation.N FrameLayout frameLayout, @androidx.annotation.N FrameLayout frameLayout2, @androidx.annotation.N TextView textView, @androidx.annotation.N ImageView imageView, @androidx.annotation.N TextView textView2, @androidx.annotation.N TextView textView3) {
        this.f40205E = frameLayout;
        this.f40206F = frameLayout2;
        this.f40207G = textView;
        this.f40208H = imageView;
        this.f40209I = textView2;
        this.f40210J = textView3;
    }

    @androidx.annotation.N
    public static C1945v a(@androidx.annotation.N View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i4 = j.h.f41267e3;
        TextView textView = (TextView) C2067c.a(view, i4);
        if (textView != null) {
            i4 = j.h.q6;
            ImageView imageView = (ImageView) C2067c.a(view, i4);
            if (imageView != null) {
                i4 = j.h.th;
                TextView textView2 = (TextView) C2067c.a(view, i4);
                if (textView2 != null) {
                    i4 = j.h.wh;
                    TextView textView3 = (TextView) C2067c.a(view, i4);
                    if (textView3 != null) {
                        return new C1945v(frameLayout, frameLayout, textView, imageView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1945v c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1945v e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41538r, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout d() {
        return this.f40205E;
    }
}
