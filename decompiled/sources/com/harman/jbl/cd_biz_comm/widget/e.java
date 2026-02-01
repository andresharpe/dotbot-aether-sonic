package com.harman.jbl.cd_biz_comm.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class e extends RecyclerView.n {

    /* renamed from: a, reason: collision with root package name */
    private final int f38049a;

    /* renamed from: b, reason: collision with root package name */
    private final int f38050b;

    /* renamed from: c, reason: collision with root package name */
    private final int f38051c;

    public e(int i4, int i5, int i6) {
        this.f38049a = i4;
        this.f38050b = i5;
        this.f38051c = i6;
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
            i4 = this.f38049a;
        } else {
            i4 = this.f38051c;
        }
        outRect.left = i4;
        if (p02 == state.d() - 1) {
            outRect.right = this.f38050b;
        }
    }
}
