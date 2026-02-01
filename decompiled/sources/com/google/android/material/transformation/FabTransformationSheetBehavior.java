package com.google.android.material.transformation;

import T0.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.InterfaceC0566i;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0823k0;
import com.google.android.material.animation.h;
import com.google.android.material.animation.j;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: l, reason: collision with root package name */
    @P
    private Map<View, Integer> f34026l;

    public FabTransformationSheetBehavior() {
    }

    private void j0(@N View view, boolean z3) {
        boolean z4;
        ViewParent parent = view.getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z3) {
            this.f34026l = new HashMap(childCount);
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = coordinatorLayout.getChildAt(i4);
            if ((childAt.getLayoutParams() instanceof CoordinatorLayout.g) && (((CoordinatorLayout.g) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (childAt != view && !z4) {
                if (!z3) {
                    Map<View, Integer> map = this.f34026l;
                    if (map != null && map.containsKey(childAt)) {
                        C0823k0.R1(childAt, this.f34026l.get(childAt).intValue());
                    }
                } else {
                    this.f34026l.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    C0823k0.R1(childAt, 4);
                }
            }
        }
        if (!z3) {
            this.f34026l = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    @InterfaceC0566i
    public boolean K(@N View view, @N View view2, boolean z3, boolean z4) {
        j0(view2, z3);
        return super.K(view, view2, z3, z4);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    @N
    protected FabTransformationBehavior.e h0(Context context, boolean z3) {
        int i4;
        if (z3) {
            i4 = a.b.f1800z;
        } else {
            i4 = a.b.f1799y;
        }
        FabTransformationBehavior.e eVar = new FabTransformationBehavior.e();
        eVar.f34015a = h.d(context, i4);
        eVar.f34016b = new j(17, 0.0f, 0.0f);
        return eVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
