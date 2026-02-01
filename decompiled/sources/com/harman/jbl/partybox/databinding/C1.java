package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.harman.jbl.partybox.j;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class C1 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final TextView f38518E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final TextView f38519F;

    private C1(@androidx.annotation.N TextView textView, @androidx.annotation.N TextView textView2) {
        this.f38518E = textView;
        this.f38519F = textView2;
    }

    @androidx.annotation.N
    public static C1 a(@androidx.annotation.N View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C1(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @androidx.annotation.N
    public static C1 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static C1 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41508j1, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public TextView d() {
        return this.f38518E;
    }
}
