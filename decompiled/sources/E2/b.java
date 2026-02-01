package e2;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.F;
import l3.d;

/* loaded from: classes2.dex */
public final class b extends RecyclerView.n {

    /* renamed from: a, reason: collision with root package name */
    private final int f50208a;

    public b(int i4) {
        this.f50208a = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void g(@d Rect outRect, @d View view, @d RecyclerView parent, @d RecyclerView.C state) {
        F.p(outRect, "outRect");
        F.p(view, "view");
        F.p(parent, "parent");
        F.p(state, "state");
        int p02 = parent.p0(view);
        if (p02 == 0) {
            outRect.top = this.f50208a;
        }
        int i4 = this.f50208a;
        outRect.left = i4;
        outRect.right = i4;
        if (p02 != state.d() - 1) {
            outRect.bottom = this.f50208a;
        }
    }
}
