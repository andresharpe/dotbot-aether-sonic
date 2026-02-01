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
public final class N0 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f38894E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final F1 f38895F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38896G;

    private N0(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N F1 f12, @androidx.annotation.N ImageView imageView) {
        this.f38894E = constraintLayout;
        this.f38895F = f12;
        this.f38896G = imageView;
    }

    @androidx.annotation.N
    public static N0 a(@androidx.annotation.N View view) {
        int i4 = j.h.x5;
        View a4 = C2067c.a(view, i4);
        if (a4 != null) {
            F1 a5 = F1.a(a4);
            int i5 = j.h.J7;
            ImageView imageView = (ImageView) C2067c.a(view, i5);
            if (imageView != null) {
                return new N0((ConstraintLayout) view, a5, imageView);
            }
            i4 = i5;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static N0 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static N0 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41371B0, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f38894E;
    }
}
