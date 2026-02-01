package com.harman.jbl.partylight.lib.ota;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class j extends RecyclerView.n {

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    public static final a f47289c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f47290d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f47291e = 2;

    /* renamed from: a, reason: collision with root package name */
    private int f47292a;

    /* renamed from: b, reason: collision with root package name */
    private int f47293b;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public j(int i4, int i5) {
        this.f47292a = i4;
        this.f47293b = i5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void g(@l3.d Rect outRect, @l3.d View view, @l3.d RecyclerView parent, @l3.d RecyclerView.C state) {
        F.p(outRect, "outRect");
        F.p(view, "view");
        F.p(parent, "parent");
        F.p(state, "state");
        super.g(outRect, view, parent, state);
        int p02 = parent.p0(view);
        int d4 = state.d() - 1;
        int i4 = this.f47293b;
        int i5 = 0;
        if (i4 != 1) {
            if (i4 == 2) {
                if (p02 == d4) {
                    outRect.left = this.f47292a;
                    outRect.right = 0;
                    return;
                } else if (p02 % 2 == 1) {
                    int i6 = this.f47292a;
                    outRect.left = i6;
                    outRect.right = i6;
                    return;
                } else {
                    if (p02 != 0) {
                        i5 = this.f47292a;
                    }
                    outRect.left = i5;
                    outRect.right = this.f47292a;
                    return;
                }
            }
            return;
        }
        if (p02 == d4) {
            outRect.bottom = 0;
            outRect.top = this.f47292a;
        } else if (p02 % 2 == 1) {
            int i7 = this.f47292a;
            outRect.bottom = i7;
            outRect.top = i7;
        } else {
            if (p02 != 0) {
                i5 = this.f47292a;
            }
            outRect.top = i5;
            outRect.bottom = this.f47292a;
        }
    }
}
