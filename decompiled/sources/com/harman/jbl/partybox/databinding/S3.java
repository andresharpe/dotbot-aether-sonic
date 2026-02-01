package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class S3 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final LinearLayout f39041E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final GridLayout f39042F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f39043G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f39044H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f39045I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f39046J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f39047K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f39048L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.N
    public final LinearLayout f39049M;

    private S3(@androidx.annotation.N LinearLayout linearLayout, @androidx.annotation.N GridLayout gridLayout, @androidx.annotation.N LinearLayout linearLayout2, @androidx.annotation.N LinearLayout linearLayout3, @androidx.annotation.N LinearLayout linearLayout4, @androidx.annotation.N LinearLayout linearLayout5, @androidx.annotation.N LinearLayout linearLayout6, @androidx.annotation.N LinearLayout linearLayout7, @androidx.annotation.N LinearLayout linearLayout8) {
        this.f39041E = linearLayout;
        this.f39042F = gridLayout;
        this.f39043G = linearLayout2;
        this.f39044H = linearLayout3;
        this.f39045I = linearLayout4;
        this.f39046J = linearLayout5;
        this.f39047K = linearLayout6;
        this.f39048L = linearLayout7;
        this.f39049M = linearLayout8;
    }

    @androidx.annotation.N
    public static S3 a(@androidx.annotation.N View view) {
        int i4 = j.h.v3;
        GridLayout gridLayout = (GridLayout) C2067c.a(view, i4);
        if (gridLayout != null) {
            i4 = j.h.ec;
            LinearLayout linearLayout = (LinearLayout) C2067c.a(view, i4);
            if (linearLayout != null) {
                i4 = j.h.hc;
                LinearLayout linearLayout2 = (LinearLayout) C2067c.a(view, i4);
                if (linearLayout2 != null) {
                    i4 = j.h.fc;
                    LinearLayout linearLayout3 = (LinearLayout) C2067c.a(view, i4);
                    if (linearLayout3 != null) {
                        i4 = j.h.ic;
                        LinearLayout linearLayout4 = (LinearLayout) C2067c.a(view, i4);
                        if (linearLayout4 != null) {
                            i4 = j.h.gc;
                            LinearLayout linearLayout5 = (LinearLayout) C2067c.a(view, i4);
                            if (linearLayout5 != null) {
                                i4 = j.h.jc;
                                LinearLayout linearLayout6 = (LinearLayout) C2067c.a(view, i4);
                                if (linearLayout6 != null) {
                                    i4 = j.h.kc;
                                    LinearLayout linearLayout7 = (LinearLayout) C2067c.a(view, i4);
                                    if (linearLayout7 != null) {
                                        return new S3((LinearLayout) view, gridLayout, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7);
                                    }
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
    public static S3 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static S3 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41449U2, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout d() {
        return this.f39041E;
    }
}
