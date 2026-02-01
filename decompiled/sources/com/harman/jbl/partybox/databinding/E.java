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

/* loaded from: classes2.dex */
public final class E implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final FrameLayout f38559E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final FrameLayout f38560F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38561G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38562H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38563I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38564J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38565K;

    private E(@androidx.annotation.N FrameLayout frameLayout, @androidx.annotation.N FrameLayout frameLayout2, @androidx.annotation.N TextView textView, @androidx.annotation.N ImageView imageView, @androidx.annotation.N TextView textView2, @androidx.annotation.N TextView textView3, @androidx.annotation.N TextView textView4) {
        this.f38559E = frameLayout;
        this.f38560F = frameLayout2;
        this.f38561G = textView;
        this.f38562H = imageView;
        this.f38563I = textView2;
        this.f38564J = textView3;
        this.f38565K = textView4;
    }

    @androidx.annotation.N
    public static E a(@androidx.annotation.N View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i4 = j.h.f41267e3;
        TextView textView = (TextView) C2067c.a(view, i4);
        if (textView != null) {
            i4 = j.h.q6;
            ImageView imageView = (ImageView) C2067c.a(view, i4);
            if (imageView != null) {
                i4 = j.h.Vg;
                TextView textView2 = (TextView) C2067c.a(view, i4);
                if (textView2 != null) {
                    i4 = j.h.th;
                    TextView textView3 = (TextView) C2067c.a(view, i4);
                    if (textView3 != null) {
                        i4 = j.h.wh;
                        TextView textView4 = (TextView) C2067c.a(view, i4);
                        if (textView4 != null) {
                            return new E(frameLayout, frameLayout, textView, imageView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static E c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static E e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41366A, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout d() {
        return this.f38559E;
    }
}
