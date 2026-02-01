package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.a3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1845a3 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39339E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39340F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39341G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f39342H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39343I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39344J;

    private C1845a3(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N LinearLayout linearLayout, @androidx.annotation.N TextView textView, @androidx.annotation.N TextView textView2) {
        this.f39339E = constraintLayout;
        this.f39340F = imageView;
        this.f39341G = imageView2;
        this.f39342H = linearLayout;
        this.f39343I = textView;
        this.f39344J = textView2;
    }

    @androidx.annotation.N
    public static C1845a3 a(@androidx.annotation.N View view) {
        int i4 = j.h.p7;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = j.h.y7;
            ImageView imageView2 = (ImageView) C2067c.a(view, i4);
            if (imageView2 != null) {
                i4 = j.h.l8;
                LinearLayout linearLayout = (LinearLayout) C2067c.a(view, i4);
                if (linearLayout != null) {
                    i4 = j.h.Ph;
                    TextView textView = (TextView) C2067c.a(view, i4);
                    if (textView != null) {
                        i4 = j.h.Ai;
                        TextView textView2 = (TextView) C2067c.a(view, i4);
                        if (textView2 != null) {
                            return new C1845a3((ConstraintLayout) view, imageView, imageView2, linearLayout, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1845a3 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1845a3 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41513k2, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39339E;
    }
}
