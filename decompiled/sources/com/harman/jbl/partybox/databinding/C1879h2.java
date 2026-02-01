package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomVerticalSeekBar;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.h2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1879h2 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39664E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f39665F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f39666G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomVerticalSeekBar f39667H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39668I;

    private C1879h2(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N LinearLayout linearLayout, @androidx.annotation.N LinearLayout linearLayout2, @androidx.annotation.N HmCustomVerticalSeekBar hmCustomVerticalSeekBar, @androidx.annotation.N TextView textView) {
        this.f39664E = constraintLayout;
        this.f39665F = linearLayout;
        this.f39666G = linearLayout2;
        this.f39667H = hmCustomVerticalSeekBar;
        this.f39668I = textView;
    }

    @androidx.annotation.N
    public static C1879h2 a(@androidx.annotation.N View view) {
        int i4 = j.h.H8;
        LinearLayout linearLayout = (LinearLayout) C2067c.a(view, i4);
        if (linearLayout != null) {
            i4 = j.h.J9;
            LinearLayout linearLayout2 = (LinearLayout) C2067c.a(view, i4);
            if (linearLayout2 != null) {
                i4 = j.h.je;
                HmCustomVerticalSeekBar hmCustomVerticalSeekBar = (HmCustomVerticalSeekBar) C2067c.a(view, i4);
                if (hmCustomVerticalSeekBar != null) {
                    i4 = j.h.Ai;
                    TextView textView = (TextView) C2067c.a(view, i4);
                    if (textView != null) {
                        return new C1879h2((ConstraintLayout) view, linearLayout, linearLayout2, hmCustomVerticalSeekBar, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1879h2 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1879h2 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41388F1, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39664E;
    }
}
