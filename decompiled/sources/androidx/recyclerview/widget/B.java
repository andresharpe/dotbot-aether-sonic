package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class B {
    private B() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(RecyclerView.C c4, y yVar, View view, View view2, RecyclerView.o oVar, boolean z3) {
        if (oVar.Q() != 0 && c4.d() != 0 && view != null && view2 != null) {
            if (!z3) {
                return Math.abs(oVar.s0(view) - oVar.s0(view2)) + 1;
            }
            return Math.min(yVar.o(), yVar.d(view2) - yVar.g(view));
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(RecyclerView.C c4, y yVar, View view, View view2, RecyclerView.o oVar, boolean z3, boolean z4) {
        int max;
        if (oVar.Q() == 0 || c4.d() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(oVar.s0(view), oVar.s0(view2));
        int max2 = Math.max(oVar.s0(view), oVar.s0(view2));
        if (z4) {
            max = Math.max(0, (c4.d() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z3) {
            return max;
        }
        return Math.round((max * (Math.abs(yVar.d(view2) - yVar.g(view)) / (Math.abs(oVar.s0(view) - oVar.s0(view2)) + 1))) + (yVar.n() - yVar.g(view)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(RecyclerView.C c4, y yVar, View view, View view2, RecyclerView.o oVar, boolean z3) {
        if (oVar.Q() != 0 && c4.d() != 0 && view != null && view2 != null) {
            if (!z3) {
                return c4.d();
            }
            return (int) (((yVar.d(view2) - yVar.g(view)) / (Math.abs(oVar.s0(view) - oVar.s0(view2)) + 1)) * c4.d());
        }
        return 0;
    }
}
