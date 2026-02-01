package com.harman.jbl.partybox.ui.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class o extends RecyclerView.n {

    /* renamed from: a, reason: collision with root package name */
    private final int f46143a;

    /* renamed from: b, reason: collision with root package name */
    private final int f46144b;

    /* renamed from: c, reason: collision with root package name */
    private final int f46145c;

    public o(int i4, int i5, int i6) {
        this.f46143a = i4;
        this.f46144b = i5;
        this.f46145c = i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void g(@l3.d Rect outRect, @l3.d View view, @l3.d RecyclerView parent, @l3.d RecyclerView.C state) {
        int i4;
        F.p(outRect, "outRect");
        F.p(view, "view");
        F.p(parent, "parent");
        F.p(state, "state");
        int p02 = parent.p0(view);
        if (p02 == 0) {
            i4 = this.f46143a;
        } else {
            i4 = this.f46145c;
        }
        outRect.left = i4;
        if (p02 == state.d() - 1) {
            outRect.right = this.f46144b;
        }
    }
}
