package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class h extends ConstraintWidget implements g {

    /* renamed from: B1, reason: collision with root package name */
    public ConstraintWidget[] f8265B1 = new ConstraintWidget[4];

    /* renamed from: C1, reason: collision with root package name */
    public int f8266C1 = 0;

    @Override // androidx.constraintlayout.core.widgets.g
    public void a() {
        this.f8266C1 = 0;
        Arrays.fill(this.f8265B1, (Object) null);
    }

    @Override // androidx.constraintlayout.core.widgets.g
    public void b(ConstraintWidget constraintWidget) {
        if (constraintWidget != this && constraintWidget != null) {
            int i4 = this.f8266C1 + 1;
            ConstraintWidget[] constraintWidgetArr = this.f8265B1;
            if (i4 > constraintWidgetArr.length) {
                this.f8265B1 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
            }
            ConstraintWidget[] constraintWidgetArr2 = this.f8265B1;
            int i5 = this.f8266C1;
            constraintWidgetArr2[i5] = constraintWidget;
            this.f8266C1 = i5 + 1;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.g
    public void c(d dVar) {
    }

    public void k2(ArrayList<o> arrayList, int i4, o oVar) {
        for (int i5 = 0; i5 < this.f8266C1; i5++) {
            oVar.a(this.f8265B1[i5]);
        }
        for (int i6 = 0; i6 < this.f8266C1; i6++) {
            androidx.constraintlayout.core.widgets.analyzer.i.a(this.f8265B1[i6], i4, arrayList, oVar);
        }
    }

    public int l2(int i4) {
        int i5;
        int i6;
        for (int i7 = 0; i7 < this.f8266C1; i7++) {
            ConstraintWidget constraintWidget = this.f8265B1[i7];
            if (i4 == 0 && (i6 = constraintWidget.f7960S0) != -1) {
                return i6;
            }
            if (i4 == 1 && (i5 = constraintWidget.f7962T0) != -1) {
                return i5;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.n(constraintWidget, hashMap);
        h hVar = (h) constraintWidget;
        this.f8266C1 = 0;
        int i4 = hVar.f8266C1;
        for (int i5 = 0; i5 < i4; i5++) {
            b(hashMap.get(hVar.f8265B1[i5]));
        }
    }
}
