package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class E3 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f38583E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38584F;

    private E3(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ImageView imageView) {
        this.f38583E = constraintLayout;
        this.f38584F = imageView;
    }

    @androidx.annotation.N
    public static E3 a(@androidx.annotation.N View view) {
        int i4 = j.h.f41332r3;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            return new E3((ConstraintLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static E3 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static E3 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41393G2, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f38583E;
    }
}
