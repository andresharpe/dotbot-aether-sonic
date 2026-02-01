package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class Z1 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39294E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39295F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39296G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final ProgressBar f39297H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39298I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39299J;

    private Z1(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ProgressBar progressBar, @androidx.annotation.N TextView textView, @androidx.annotation.N TextView textView2) {
        this.f39294E = constraintLayout;
        this.f39295F = constraintLayout2;
        this.f39296G = imageView;
        this.f39297H = progressBar;
        this.f39298I = textView;
        this.f39299J = textView2;
    }

    @androidx.annotation.N
    public static Z1 a(@androidx.annotation.N View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i4 = j.h.Z6;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = j.h.id;
            ProgressBar progressBar = (ProgressBar) C2067c.a(view, i4);
            if (progressBar != null) {
                i4 = j.h.Dh;
                TextView textView = (TextView) C2067c.a(view, i4);
                if (textView != null) {
                    i4 = j.h.Gh;
                    TextView textView2 = (TextView) C2067c.a(view, i4);
                    if (textView2 != null) {
                        return new Z1(constraintLayout, constraintLayout, imageView, progressBar, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static Z1 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static Z1 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41572z1, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39294E;
    }
}
