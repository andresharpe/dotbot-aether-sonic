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

/* renamed from: com.harman.jbl.partybox.databinding.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1955x implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f40290E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40291F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f40292G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40293H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40294I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40295J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40296K;

    private C1955x(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N ImageView imageView3, @androidx.annotation.N TextView textView, @androidx.annotation.N TextView textView2) {
        this.f40290E = constraintLayout;
        this.f40291F = imageView;
        this.f40292G = constraintLayout2;
        this.f40293H = imageView2;
        this.f40294I = imageView3;
        this.f40295J = textView;
        this.f40296K = textView2;
    }

    @androidx.annotation.N
    public static C1955x a(@androidx.annotation.N View view) {
        int i4 = j.h.f41349v2;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i4 = j.h.e6;
            ImageView imageView2 = (ImageView) C2067c.a(view, i4);
            if (imageView2 != null) {
                i4 = j.h.q6;
                ImageView imageView3 = (ImageView) C2067c.a(view, i4);
                if (imageView3 != null) {
                    i4 = j.h.Xh;
                    TextView textView = (TextView) C2067c.a(view, i4);
                    if (textView != null) {
                        i4 = j.h.Ai;
                        TextView textView2 = (TextView) C2067c.a(view, i4);
                        if (textView2 != null) {
                            return new C1955x(constraintLayout, imageView, constraintLayout, imageView2, imageView3, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1955x c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1955x e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41546t, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f40290E;
    }
}
