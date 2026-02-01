package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class M0 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final LinearLayout f38878E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final I1 f38879F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38880G;

    private M0(@androidx.annotation.N LinearLayout linearLayout, @androidx.annotation.N I1 i12, @androidx.annotation.N TextView textView) {
        this.f38878E = linearLayout;
        this.f38879F = i12;
        this.f38880G = textView;
    }

    @androidx.annotation.N
    public static M0 a(@androidx.annotation.N View view) {
        int i4 = j.h.x5;
        View a4 = C2067c.a(view, i4);
        if (a4 != null) {
            I1 a5 = I1.a(a4);
            int i5 = j.h.Gb;
            TextView textView = (TextView) C2067c.a(view, i5);
            if (textView != null) {
                return new M0((LinearLayout) view, a5, textView);
            }
            i4 = i5;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static M0 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static M0 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41367A0, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout d() {
        return this.f38878E;
    }
}
