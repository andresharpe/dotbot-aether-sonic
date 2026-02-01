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

/* loaded from: classes2.dex */
public final class T implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39050E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final View f39051F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39052G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39053H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final View f39054I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39055J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39056K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final View f39057L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39058M;

    /* renamed from: N, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39059N;

    private T(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N View view, @androidx.annotation.N ImageView imageView, @androidx.annotation.N TextView textView, @androidx.annotation.N View view2, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N TextView textView2, @androidx.annotation.N View view3, @androidx.annotation.N ImageView imageView3, @androidx.annotation.N TextView textView3) {
        this.f39050E = constraintLayout;
        this.f39051F = view;
        this.f39052G = imageView;
        this.f39053H = textView;
        this.f39054I = view2;
        this.f39055J = imageView2;
        this.f39056K = textView2;
        this.f39057L = view3;
        this.f39058M = imageView3;
        this.f39059N = textView3;
    }

    @androidx.annotation.N
    public static T a(@androidx.annotation.N View view) {
        View a4;
        View a5;
        int i4 = j.h.f41290j1;
        View a6 = C2067c.a(view, i4);
        if (a6 != null) {
            i4 = j.h.f41295k1;
            ImageView imageView = (ImageView) C2067c.a(view, i4);
            if (imageView != null) {
                i4 = j.h.f41300l1;
                TextView textView = (TextView) C2067c.a(view, i4);
                if (textView != null && (a4 = C2067c.a(view, (i4 = j.h.f41305m1))) != null) {
                    i4 = j.h.f41310n1;
                    ImageView imageView2 = (ImageView) C2067c.a(view, i4);
                    if (imageView2 != null) {
                        i4 = j.h.f41315o1;
                        TextView textView2 = (TextView) C2067c.a(view, i4);
                        if (textView2 != null && (a5 = C2067c.a(view, (i4 = j.h.f41320p1))) != null) {
                            i4 = j.h.f41325q1;
                            ImageView imageView3 = (ImageView) C2067c.a(view, i4);
                            if (imageView3 != null) {
                                i4 = j.h.f41330r1;
                                TextView textView3 = (TextView) C2067c.a(view, i4);
                                if (textView3 != null) {
                                    return new T((ConstraintLayout) view, a6, imageView, textView, a4, imageView2, textView2, a5, imageView3, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static T c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static T e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41406K, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39050E;
    }
}
