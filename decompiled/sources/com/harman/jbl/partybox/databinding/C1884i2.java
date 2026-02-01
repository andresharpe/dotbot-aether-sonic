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

/* renamed from: com.harman.jbl.partybox.databinding.i2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1884i2 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39689E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39690F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39691G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39692H;

    private C1884i2(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N ImageView imageView, @androidx.annotation.N TextView textView) {
        this.f39689E = constraintLayout;
        this.f39690F = constraintLayout2;
        this.f39691G = imageView;
        this.f39692H = textView;
    }

    @androidx.annotation.N
    public static C1884i2 a(@androidx.annotation.N View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i4 = j.h.Y3;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = j.h.U3;
            TextView textView = (TextView) C2067c.a(view, i4);
            if (textView != null) {
                return new C1884i2(constraintLayout, constraintLayout, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1884i2 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1884i2 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41396H1, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39689E;
    }
}
