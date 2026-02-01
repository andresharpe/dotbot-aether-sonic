package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class B3 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final FrameLayout f38495E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final View f38496F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f38497G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final FrameLayout f38498H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38499I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38500J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38501K;

    private B3(@androidx.annotation.N FrameLayout frameLayout, @androidx.annotation.N View view, @androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N FrameLayout frameLayout2, @androidx.annotation.N ImageView imageView, @androidx.annotation.N TextView textView, @androidx.annotation.N TextView textView2) {
        this.f38495E = frameLayout;
        this.f38496F = view;
        this.f38497G = constraintLayout;
        this.f38498H = frameLayout2;
        this.f38499I = imageView;
        this.f38500J = textView;
        this.f38501K = textView2;
    }

    @androidx.annotation.N
    public static B3 a(@androidx.annotation.N View view) {
        int i4 = j.h.a6;
        View a4 = C2067c.a(view, i4);
        if (a4 != null) {
            i4 = j.h.N9;
            ConstraintLayout constraintLayout = (ConstraintLayout) C2067c.a(view, i4);
            if (constraintLayout != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                i4 = j.h.Ni;
                ImageView imageView = (ImageView) C2067c.a(view, i4);
                if (imageView != null) {
                    i4 = j.h.Oi;
                    TextView textView = (TextView) C2067c.a(view, i4);
                    if (textView != null) {
                        i4 = j.h.Qi;
                        TextView textView2 = (TextView) C2067c.a(view, i4);
                        if (textView2 != null) {
                            return new B3(frameLayout, a4, constraintLayout, frameLayout, imageView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static B3 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static B3 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41381D2, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout d() {
        return this.f38495E;
    }
}
