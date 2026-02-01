package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class C0 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final CardView f38509E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final CardView f38510F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38511G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38512H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayoutCompat f38513I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38514J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final View f38515K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final RecyclerView f38516L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38517M;

    private C0(@androidx.annotation.N CardView cardView, @androidx.annotation.N CardView cardView2, @androidx.annotation.N ImageView imageView, @androidx.annotation.N TextView textView, @androidx.annotation.N LinearLayoutCompat linearLayoutCompat, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N View view, @androidx.annotation.N RecyclerView recyclerView, @androidx.annotation.N TextView textView2) {
        this.f38509E = cardView;
        this.f38510F = cardView2;
        this.f38511G = imageView;
        this.f38512H = textView;
        this.f38513I = linearLayoutCompat;
        this.f38514J = imageView2;
        this.f38515K = view;
        this.f38516L = recyclerView;
        this.f38517M = textView2;
    }

    @androidx.annotation.N
    public static C0 a(@androidx.annotation.N View view) {
        View a4;
        int i4 = j.h.f41361y2;
        CardView cardView = (CardView) C2067c.a(view, i4);
        if (cardView != null) {
            i4 = j.h.f41365z2;
            ImageView imageView = (ImageView) C2067c.a(view, i4);
            if (imageView != null) {
                i4 = j.h.f41142A2;
                TextView textView = (TextView) C2067c.a(view, i4);
                if (textView != null) {
                    i4 = j.h.f41277g3;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) C2067c.a(view, i4);
                    if (linearLayoutCompat != null) {
                        i4 = j.h.f41332r3;
                        ImageView imageView2 = (ImageView) C2067c.a(view, i4);
                        if (imageView2 != null && (a4 = C2067c.a(view, (i4 = j.h.M3))) != null) {
                            i4 = j.h.la;
                            RecyclerView recyclerView = (RecyclerView) C2067c.a(view, i4);
                            if (recyclerView != null) {
                                i4 = j.h.Vg;
                                TextView textView2 = (TextView) C2067c.a(view, i4);
                                if (textView2 != null) {
                                    return new C0((CardView) view, cardView, imageView, textView, linearLayoutCompat, imageView2, a4, recyclerView, textView2);
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
    public static C0 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C0 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41535q0, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CardView d() {
        return this.f38509E;
    }
}
