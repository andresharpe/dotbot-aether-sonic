package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmTextViewWithImage;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.o2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1914o2 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39934E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final HmTextViewWithImage f39935F;

    private C1914o2(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N HmTextViewWithImage hmTextViewWithImage) {
        this.f39934E = constraintLayout;
        this.f39935F = hmTextViewWithImage;
    }

    @androidx.annotation.N
    public static C1914o2 a(@androidx.annotation.N View view) {
        int i4 = j.h.ej;
        HmTextViewWithImage hmTextViewWithImage = (HmTextViewWithImage) C2067c.a(view, i4);
        if (hmTextViewWithImage != null) {
            return new C1914o2((ConstraintLayout) view, hmTextViewWithImage);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1914o2 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1914o2 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41416M1, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39934E;
    }
}
