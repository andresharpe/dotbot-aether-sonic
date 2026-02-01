package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class R2 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final ConstraintLayout f39011E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39012F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39013G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39014H;

    private R2(@androidx.annotation.N ConstraintLayout constraintLayout, @androidx.annotation.N TextView textView, @androidx.annotation.N TextView textView2, @androidx.annotation.N TextView textView3) {
        this.f39011E = constraintLayout;
        this.f39012F = textView;
        this.f39013G = textView2;
        this.f39014H = textView3;
    }

    @androidx.annotation.N
    public static R2 a(@androidx.annotation.N View view) {
        int i4 = j.h.Q9;
        TextView textView = (TextView) C2067c.a(view, i4);
        if (textView != null) {
            i4 = j.h.Kd;
            TextView textView2 = (TextView) C2067c.a(view, i4);
            if (textView2 != null) {
                i4 = j.h.Sj;
                TextView textView3 = (TextView) C2067c.a(view, i4);
                if (textView3 != null) {
                    return new R2((ConstraintLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static R2 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static R2 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41493f2, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f39011E;
    }
}
