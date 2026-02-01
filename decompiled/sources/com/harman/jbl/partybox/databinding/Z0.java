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
public final class Z0 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39287E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39288F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f39289G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39290H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39291I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39292J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39293K;

    private Z0(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N TextView textView, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N TextView textView2, @androidx.annotation.N ImageView imageView, @androidx.annotation.N TextView textView3, @androidx.annotation.N TextView textView4) {
        this.f39287E = constraintLayout;
        this.f39288F = textView;
        this.f39289G = constraintLayout2;
        this.f39290H = textView2;
        this.f39291I = imageView;
        this.f39292J = textView3;
        this.f39293K = textView4;
    }

    @androidx.annotation.N
    public static Z0 a(@androidx.annotation.N View view) {
        int i4 = j.h.f41251b2;
        TextView textView = (TextView) C2067c.a(view, i4);
        if (textView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i4 = j.h.f41267e3;
            TextView textView2 = (TextView) C2067c.a(view, i4);
            if (textView2 != null) {
                i4 = j.h.q6;
                ImageView imageView = (ImageView) C2067c.a(view, i4);
                if (imageView != null) {
                    i4 = j.h.Ob;
                    TextView textView3 = (TextView) C2067c.a(view, i4);
                    if (textView3 != null) {
                        i4 = j.h.Md;
                        TextView textView4 = (TextView) C2067c.a(view, i4);
                        if (textView4 != null) {
                            return new Z0(constraintLayout, textView, constraintLayout, textView2, imageView, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static Z0 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static Z0 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41419N0, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39287E;
    }
}
