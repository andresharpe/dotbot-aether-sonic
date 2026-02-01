package com.harman.jbl.partybox.ui.party.stereo.ui;

import android.content.Context;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.utils.j;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class d extends RecyclerView.n {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final c f45364a;

    public d(@l3.d c adapter) {
        F.p(adapter, "adapter");
        this.f45364a = adapter;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void f(@l3.d Rect outRect, int i4, @l3.d RecyclerView parent) {
        float f4;
        F.p(outRect, "outRect");
        F.p(parent, "parent");
        Context context = parent.getContext();
        float f5 = 12.0f;
        if (i4 == 0) {
            f4 = 0.0f;
        } else {
            f4 = 12.0f;
        }
        outRect.left = j.a(context, f4);
        Context context2 = parent.getContext();
        if (this.f45364a.l() == i4 + 1) {
            f5 = 0.0f;
        }
        outRect.right = j.a(context2, f5);
    }
}
