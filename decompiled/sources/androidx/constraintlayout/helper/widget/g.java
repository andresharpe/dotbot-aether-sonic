package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.j;
import androidx.constraintlayout.widget.l;

/* loaded from: classes.dex */
public class g extends l {

    /* renamed from: R, reason: collision with root package name */
    private static final String f8419R = "MotionPlaceholder";

    /* renamed from: Q, reason: collision with root package name */
    j f8420Q;

    public g(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.a
    public void I(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.core.widgets.g gVar, SparseArray<ConstraintWidget> sparseArray) {
    }

    @Override // androidx.constraintlayout.widget.l
    public void L(androidx.constraintlayout.core.widgets.l lVar, int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        if (lVar != null) {
            lVar.v2(mode, size, mode2, size2);
            setMeasuredDimension(lVar.q2(), lVar.p2());
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    @Override // androidx.constraintlayout.widget.a, android.view.View
    @SuppressLint({"WrongCall"})
    protected void onMeasure(int i4, int i5) {
        L(this.f8420Q, i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.l, androidx.constraintlayout.widget.a
    public void z(AttributeSet attributeSet) {
        super.z(attributeSet);
        this.f9642H = new j();
        K();
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public g(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }

    public g(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4);
    }
}
