package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.AppButton;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class N implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f38892E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final AppButton f38893F;

    private N(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N AppButton appButton) {
        this.f38892E = constraintLayout;
        this.f38893F = appButton;
    }

    @androidx.annotation.N
    public static N a(@androidx.annotation.N View view) {
        int i4 = j.h.K3;
        AppButton appButton = (AppButton) C2067c.a(view, i4);
        if (appButton != null) {
            return new N((ConstraintLayout) view, appButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static N c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static N e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41390G, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f38892E;
    }
}
