package com.harman.jbl.partybox.ui.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class n extends RecyclerView.n {

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    public static final a f46138d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private static final String f46139e = "GridSpaceItemDecoration";

    /* renamed from: a, reason: collision with root package name */
    private final int f46140a;

    /* renamed from: b, reason: collision with root package name */
    private final int f46141b;

    /* renamed from: c, reason: collision with root package name */
    private final int f46142c;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public n(int i4, int i5, int i6) {
        this.f46140a = i4;
        this.f46141b = i5;
        this.f46142c = i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void g(@l3.d Rect outRect, @l3.d View view, @l3.d RecyclerView parent, @l3.d RecyclerView.C state) {
        F.p(outRect, "outRect");
        F.p(view, "view");
        F.p(parent, "parent");
        F.p(state, "state");
        int p02 = parent.p0(view);
        int i4 = this.f46140a;
        int i5 = p02 % i4;
        int i6 = this.f46142c;
        int i7 = (i5 * i6) / i4;
        outRect.left = i7;
        int i8 = i6 - (((i5 + 1) * i6) / i4);
        outRect.right = i8;
        Log.d(f46139e, "position: " + p02 + ", columnIndex: " + i5 + ", left,right -> " + i7 + ", " + i8);
        if (p02 >= this.f46140a) {
            outRect.top = this.f46141b;
        }
    }
}
