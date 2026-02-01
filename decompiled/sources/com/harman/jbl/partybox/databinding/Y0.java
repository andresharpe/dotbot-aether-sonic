package com.harman.jbl.partybox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.j;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class Y0 implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private final RecyclerView f39242E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public final RecyclerView f39243F;

    private Y0(@androidx.annotation.N RecyclerView recyclerView, @androidx.annotation.N RecyclerView recyclerView2) {
        this.f39242E = recyclerView;
        this.f39243F = recyclerView2;
    }

    @androidx.annotation.N
    public static Y0 a(@androidx.annotation.N View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new Y0(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    @androidx.annotation.N
    public static Y0 c(@androidx.annotation.N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @androidx.annotation.N
    public static Y0 e(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(j.i.f41415M0, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @androidx.annotation.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RecyclerView d() {
        return this.f39242E;
    }
}
