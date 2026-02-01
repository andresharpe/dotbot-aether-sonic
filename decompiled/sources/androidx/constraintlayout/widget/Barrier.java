package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.h;

/* loaded from: classes.dex */
public class Barrier extends a {

    /* renamed from: R, reason: collision with root package name */
    public static final int f9414R = 0;

    /* renamed from: S, reason: collision with root package name */
    public static final int f9415S = 2;

    /* renamed from: T, reason: collision with root package name */
    public static final int f9416T = 1;

    /* renamed from: U, reason: collision with root package name */
    public static final int f9417U = 3;

    /* renamed from: V, reason: collision with root package name */
    public static final int f9418V = 5;

    /* renamed from: W, reason: collision with root package name */
    public static final int f9419W = 6;

    /* renamed from: O, reason: collision with root package name */
    private int f9420O;

    /* renamed from: P, reason: collision with root package name */
    private int f9421P;

    /* renamed from: Q, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.a f9422Q;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void M(ConstraintWidget constraintWidget, int i4, boolean z3) {
        this.f9421P = i4;
        if (z3) {
            int i5 = this.f9420O;
            if (i5 == 5) {
                this.f9421P = 1;
            } else if (i5 == 6) {
                this.f9421P = 0;
            }
        } else {
            int i6 = this.f9420O;
            if (i6 == 5) {
                this.f9421P = 0;
            } else if (i6 == 6) {
                this.f9421P = 1;
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            ((androidx.constraintlayout.core.widgets.a) constraintWidget).u2(this.f9421P);
        }
    }

    @Override // androidx.constraintlayout.widget.a
    public void B(d.a aVar, androidx.constraintlayout.core.widgets.h hVar, ConstraintLayout.b bVar, SparseArray<ConstraintWidget> sparseArray) {
        super.B(aVar, hVar, bVar, sparseArray);
        if (hVar instanceof androidx.constraintlayout.core.widgets.a) {
            androidx.constraintlayout.core.widgets.a aVar2 = (androidx.constraintlayout.core.widgets.a) hVar;
            M(aVar2, aVar.f9840e.f9972h0, ((androidx.constraintlayout.core.widgets.d) hVar.U()).O2());
            aVar2.t2(aVar.f9840e.f9988p0);
            aVar2.v2(aVar.f9840e.f9974i0);
        }
    }

    @Override // androidx.constraintlayout.widget.a
    public void D(ConstraintWidget constraintWidget, boolean z3) {
        M(constraintWidget, this.f9420O, z3);
    }

    @Deprecated
    public boolean L() {
        return this.f9422Q.o2();
    }

    public boolean getAllowsGoneWidget() {
        return this.f9422Q.o2();
    }

    public int getMargin() {
        return this.f9422Q.q2();
    }

    public int getType() {
        return this.f9420O;
    }

    public void setAllowsGoneWidget(boolean z3) {
        this.f9422Q.t2(z3);
    }

    public void setDpMargin(int i4) {
        this.f9422Q.v2((int) ((i4 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i4) {
        this.f9422Q.v2(i4);
    }

    public void setType(int i4) {
        this.f9420O = i4;
    }

    @Override // androidx.constraintlayout.widget.a
    protected void z(AttributeSet attributeSet) {
        super.z(attributeSet);
        this.f9422Q = new androidx.constraintlayout.core.widgets.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.m.x6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == h.m.Y6) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == h.m.X6) {
                    this.f9422Q.t2(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == h.m.Z6) {
                    this.f9422Q.v2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f9642H = this.f9422Q;
        K();
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        super.setVisibility(8);
    }
}
