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

/* renamed from: com.harman.jbl.partybox.databinding.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1912o0 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39919E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39920F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39921G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final I1 f39922H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.N
    public final ImageView f39923I;

    private C1912o0(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N TextView textView, @androidx.annotation.N TextView textView2, @androidx.annotation.N I1 i12, @androidx.annotation.N ImageView imageView) {
        this.f39919E = constraintLayout;
        this.f39920F = textView;
        this.f39921G = textView2;
        this.f39922H = i12;
        this.f39923I = imageView;
    }

    @androidx.annotation.N
    public static C1912o0 a(@androidx.annotation.N View view) {
        View a4;
        int i4 = j.h.O4;
        TextView textView = (TextView) C2067c.a(view, i4);
        if (textView != null) {
            i4 = j.h.c5;
            TextView textView2 = (TextView) C2067c.a(view, i4);
            if (textView2 != null && (a4 = C2067c.a(view, (i4 = j.h.x5))) != null) {
                I1 a5 = I1.a(a4);
                i4 = j.h.D6;
                ImageView imageView = (ImageView) C2067c.a(view, i4);
                if (imageView != null) {
                    return new C1912o0((ConstraintLayout) view, textView, textView2, a5, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1912o0 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1912o0 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41487e0, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39919E;
    }
}
