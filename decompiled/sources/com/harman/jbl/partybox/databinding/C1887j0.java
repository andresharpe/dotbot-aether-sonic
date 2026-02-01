package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.EqualizerView;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1887j0 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final LinearLayout f39699E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39700F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final EqualizerView f39701G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f39702H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final RelativeLayout f39703I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39704J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39705K;

    private C1887j0(@androidx.annotation.N LinearLayout linearLayout, @androidx.annotation.N TextView textView, @androidx.annotation.N EqualizerView equalizerView, @androidx.annotation.N LinearLayout linearLayout2, @androidx.annotation.N RelativeLayout relativeLayout, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ConstraintLayout constraintLayout) {
        this.f39699E = linearLayout;
        this.f39700F = textView;
        this.f39701G = equalizerView;
        this.f39702H = linearLayout2;
        this.f39703I = relativeLayout;
        this.f39704J = imageView;
        this.f39705K = constraintLayout;
    }

    @androidx.annotation.N
    public static C1887j0 a(@androidx.annotation.N View view) {
        int i4 = j.h.f41296k2;
        TextView textView = (TextView) C2067c.a(view, i4);
        if (textView != null) {
            i4 = j.h.f41302l3;
            EqualizerView equalizerView = (EqualizerView) C2067c.a(view, i4);
            if (equalizerView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i4 = j.h.n5;
                RelativeLayout relativeLayout = (RelativeLayout) C2067c.a(view, i4);
                if (relativeLayout != null) {
                    i4 = j.h.Pd;
                    ImageView imageView = (ImageView) C2067c.a(view, i4);
                    if (imageView != null) {
                        i4 = j.h.Qd;
                        ConstraintLayout constraintLayout = (ConstraintLayout) C2067c.a(view, i4);
                        if (constraintLayout != null) {
                            return new C1887j0(linearLayout, textView, equalizerView, linearLayout, relativeLayout, imageView, constraintLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1887j0 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1887j0 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41471a0, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout d() {
        return this.f39699E;
    }
}
