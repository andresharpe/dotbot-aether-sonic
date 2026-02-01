package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1862e0 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39504E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39505F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39506G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final RecyclerView f39507H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39508I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39509J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39510K;

    private C1862e0(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N TextView textView, @androidx.annotation.N RecyclerView recyclerView, @androidx.annotation.N TextView textView2, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ImageView imageView2) {
        this.f39504E = constraintLayout;
        this.f39505F = constraintLayout2;
        this.f39506G = textView;
        this.f39507H = recyclerView;
        this.f39508I = textView2;
        this.f39509J = imageView;
        this.f39510K = imageView2;
    }

    @androidx.annotation.N
    public static C1862e0 a(@androidx.annotation.N View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i4 = j.h.R3;
        TextView textView = (TextView) C2067c.a(view, i4);
        if (textView != null) {
            i4 = j.h.T3;
            RecyclerView recyclerView = (RecyclerView) C2067c.a(view, i4);
            if (recyclerView != null) {
                i4 = j.h.V3;
                TextView textView2 = (TextView) C2067c.a(view, i4);
                if (textView2 != null) {
                    i4 = j.h.H4;
                    ImageView imageView = (ImageView) C2067c.a(view, i4);
                    if (imageView != null) {
                        i4 = j.h.q6;
                        ImageView imageView2 = (ImageView) C2067c.a(view, i4);
                        if (imageView2 != null) {
                            return new C1862e0(constraintLayout, constraintLayout, textView, recyclerView, textView2, imageView, imageView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1862e0 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1862e0 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41450V, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39504E;
    }
}
