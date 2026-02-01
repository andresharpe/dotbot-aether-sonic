package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmTextViewWithImage;
import com.harman.jbl.partybox.ui.widget.ElasticScrollView;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.q1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1923q1 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f40042E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40043F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final F1 f40044G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f40045H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f40046I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final S3 f40047J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final ElasticScrollView f40048K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40049L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f40050M;

    /* renamed from: N, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f40051N;

    /* renamed from: O, reason: collision with root package name */
    @androidx.annotation.N
    public final HmTextViewWithImage f40052O;

    private C1923q1(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N TextView textView, @androidx.annotation.N F1 f12, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N S3 s32, @androidx.annotation.N ElasticScrollView elasticScrollView, @androidx.annotation.N TextView textView2, @androidx.annotation.N TextView textView3, @androidx.annotation.N ConstraintLayout constraintLayout3, @androidx.annotation.N HmTextViewWithImage hmTextViewWithImage) {
        this.f40042E = constraintLayout;
        this.f40043F = textView;
        this.f40044G = f12;
        this.f40045H = imageView;
        this.f40046I = constraintLayout2;
        this.f40047J = s32;
        this.f40048K = elasticScrollView;
        this.f40049L = textView2;
        this.f40050M = textView3;
        this.f40051N = constraintLayout3;
        this.f40052O = hmTextViewWithImage;
    }

    @androidx.annotation.N
    public static C1923q1 a(@androidx.annotation.N View view) {
        View a4;
        View a5;
        int i4 = j.h.f41337s3;
        TextView textView = (TextView) C2067c.a(view, i4);
        if (textView != null && (a4 = C2067c.a(view, (i4 = j.h.x5))) != null) {
            F1 a6 = F1.a(a4);
            i4 = j.h.a7;
            ImageView imageView = (ImageView) C2067c.a(view, i4);
            if (imageView != null) {
                i4 = j.h.X8;
                ConstraintLayout constraintLayout = (ConstraintLayout) C2067c.a(view, i4);
                if (constraintLayout != null && (a5 = C2067c.a(view, (i4 = j.h.ng))) != null) {
                    S3 a7 = S3.a(a5);
                    i4 = j.h.og;
                    ElasticScrollView elasticScrollView = (ElasticScrollView) C2067c.a(view, i4);
                    if (elasticScrollView != null) {
                        i4 = j.h.Ph;
                        TextView textView2 = (TextView) C2067c.a(view, i4);
                        if (textView2 != null) {
                            i4 = j.h.ii;
                            TextView textView3 = (TextView) C2067c.a(view, i4);
                            if (textView3 != null) {
                                i4 = j.h.dj;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) C2067c.a(view, i4);
                                if (constraintLayout2 != null) {
                                    i4 = j.h.ej;
                                    HmTextViewWithImage hmTextViewWithImage = (HmTextViewWithImage) C2067c.a(view, i4);
                                    if (hmTextViewWithImage != null) {
                                        return new C1923q1((ConstraintLayout) view, textView, a6, imageView, constraintLayout, a7, elasticScrollView, textView2, textView3, constraintLayout2, hmTextViewWithImage);
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
    public static C1923q1 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1923q1 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41463Y0, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f40042E;
    }
}
