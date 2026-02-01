package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class S implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39018E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39019F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39020G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final ProgressBar f39021H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39022I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final HmCustomFontTextView f39023J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final WebView f39024K;

    private S(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ImageView imageView2, @androidx.annotation.N ProgressBar progressBar, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N HmCustomFontTextView hmCustomFontTextView, @androidx.annotation.N WebView webView) {
        this.f39018E = constraintLayout;
        this.f39019F = imageView;
        this.f39020G = imageView2;
        this.f39021H = progressBar;
        this.f39022I = constraintLayout2;
        this.f39023J = hmCustomFontTextView;
        this.f39024K = webView;
    }

    @androidx.annotation.N
    public static S a(@androidx.annotation.N View view) {
        int i4 = j.h.S7;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = j.h.T7;
            ImageView imageView2 = (ImageView) C2067c.a(view, i4);
            if (imageView2 != null) {
                i4 = j.h.pc;
                ProgressBar progressBar = (ProgressBar) C2067c.a(view, i4);
                if (progressBar != null) {
                    i4 = j.h.Yg;
                    ConstraintLayout constraintLayout = (ConstraintLayout) C2067c.a(view, i4);
                    if (constraintLayout != null) {
                        i4 = j.h.Ai;
                        HmCustomFontTextView hmCustomFontTextView = (HmCustomFontTextView) C2067c.a(view, i4);
                        if (hmCustomFontTextView != null) {
                            i4 = j.h.Oj;
                            WebView webView = (WebView) C2067c.a(view, i4);
                            if (webView != null) {
                                return new S((ConstraintLayout) view, imageView, imageView2, progressBar, constraintLayout, hmCustomFontTextView, webView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static S c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static S e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41402J, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39018E;
    }
}
