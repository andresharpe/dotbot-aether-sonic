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

/* renamed from: com.harman.jbl.partybox.databinding.n2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1909n2 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39902E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39903F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39904G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39905H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39906I;

    private C1909n2(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N TextView textView, @androidx.annotation.N TextView textView2) {
        this.f39902E = constraintLayout;
        this.f39903F = imageView;
        this.f39904G = constraintLayout2;
        this.f39905H = textView;
        this.f39906I = textView2;
    }

    @androidx.annotation.N
    public static C1909n2 a(@androidx.annotation.N View view) {
        int i4 = j.h.a7;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = j.h.X8;
            ConstraintLayout constraintLayout = (ConstraintLayout) C2067c.a(view, i4);
            if (constraintLayout != null) {
                i4 = j.h.Ph;
                TextView textView = (TextView) C2067c.a(view, i4);
                if (textView != null) {
                    i4 = j.h.ii;
                    TextView textView2 = (TextView) C2067c.a(view, i4);
                    if (textView2 != null) {
                        return new C1909n2((ConstraintLayout) view, imageView, constraintLayout, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1909n2 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1909n2 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41412L1, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39902E;
    }
}
