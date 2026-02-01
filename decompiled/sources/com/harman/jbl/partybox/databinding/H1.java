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
public final class H1 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f38688E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38689F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final ConstraintLayout f38690G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38691H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f38692I;

    private H1(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N ImageView imageView, @androidx.annotation.N ConstraintLayout constraintLayout2, @androidx.annotation.N TextView textView, @androidx.annotation.N ImageView imageView2) {
        this.f38688E = constraintLayout;
        this.f38689F = imageView;
        this.f38690G = constraintLayout2;
        this.f38691H = textView;
        this.f38692I = imageView2;
    }

    @androidx.annotation.N
    public static H1 a(@androidx.annotation.N View view) {
        int i4 = j.h.f41204Q0;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i4 = j.h.f41337s3;
            TextView textView = (TextView) C2067c.a(view, i4);
            if (textView != null) {
                i4 = j.h.sh;
                ImageView imageView2 = (ImageView) C2067c.a(view, i4);
                if (imageView2 != null) {
                    return new H1(constraintLayout, imageView, constraintLayout, textView, imageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static H1 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static H1 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41528o1, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f38688E;
    }
}
