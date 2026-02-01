package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.widget.HorizontalScaleView;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class L implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final FrameLayout f38841E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final AppCompatTextView f38842F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final FrameLayout f38843G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final HorizontalScaleView f38844H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38845I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38846J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final AppCompatTextView f38847K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38848L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.N
    public final View f38849M;

    private L(@androidx.annotation.N FrameLayout frameLayout, @androidx.annotation.N AppCompatTextView appCompatTextView, @androidx.annotation.N FrameLayout frameLayout2, @androidx.annotation.N HorizontalScaleView horizontalScaleView, @androidx.annotation.N ImageView imageView, @androidx.annotation.N TextView textView, @androidx.annotation.N AppCompatTextView appCompatTextView2, @androidx.annotation.N TextView textView2, @androidx.annotation.N View view) {
        this.f38841E = frameLayout;
        this.f38842F = appCompatTextView;
        this.f38843G = frameLayout2;
        this.f38844H = horizontalScaleView;
        this.f38845I = imageView;
        this.f38846J = textView;
        this.f38847K = appCompatTextView2;
        this.f38848L = textView2;
        this.f38849M = view;
    }

    @androidx.annotation.N
    public static L a(@androidx.annotation.N View view) {
        View a4;
        int i4 = j.h.f41157E1;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C2067c.a(view, i4);
        if (appCompatTextView != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            i4 = j.h.G5;
            HorizontalScaleView horizontalScaleView = (HorizontalScaleView) C2067c.a(view, i4);
            if (horizontalScaleView != null) {
                i4 = j.h.q6;
                ImageView imageView = (ImageView) C2067c.a(view, i4);
                if (imageView != null) {
                    i4 = j.h.Ch;
                    TextView textView = (TextView) C2067c.a(view, i4);
                    if (textView != null) {
                        i4 = j.h.uh;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2067c.a(view, i4);
                        if (appCompatTextView2 != null) {
                            i4 = j.h.zh;
                            TextView textView2 = (TextView) C2067c.a(view, i4);
                            if (textView2 != null && (a4 = C2067c.a(view, (i4 = j.h.uj))) != null) {
                                return new L(frameLayout, appCompatTextView, frameLayout, horizontalScaleView, imageView, textView, appCompatTextView2, textView2, a4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static L c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static L e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41382E, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout d() {
        return this.f38841E;
    }
}
