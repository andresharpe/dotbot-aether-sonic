package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.harman.jbl.partybox.j;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: com.harman.jbl.partybox.databinding.h3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1880h3 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final LinearLayout f39669E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f39670F;

    private C1880h3(@androidx.annotation.N LinearLayout linearLayout, @androidx.annotation.N TextView textView) {
        this.f39669E = linearLayout;
        this.f39670F = textView;
    }

    @androidx.annotation.N
    public static C1880h3 a(@androidx.annotation.N View view) {
        int i4 = j.h.Ie;
        TextView textView = (TextView) C2067c.a(view, i4);
        if (textView != null) {
            return new C1880h3((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @androidx.annotation.N
    public static C1880h3 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1880h3 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41537q2, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout d() {
        return this.f39669E;
    }
}
