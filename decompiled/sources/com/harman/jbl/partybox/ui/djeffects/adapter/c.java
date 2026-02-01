package com.harman.jbl.partybox.ui.djeffects.adapter;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class c extends RecyclerView.n {

    /* renamed from: a, reason: collision with root package name */
    private final int f43384a;

    public c(int i4) {
        this.f43384a = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void g(@l3.d Rect outRect, @l3.d View view, @l3.d RecyclerView parent, @l3.d RecyclerView.C state) {
        F.p(outRect, "outRect");
        F.p(view, "view");
        F.p(parent, "parent");
        F.p(state, "state");
        int i4 = this.f43384a;
        outRect.left = i4;
        outRect.right = i4;
        outRect.top = i4;
    }
}
