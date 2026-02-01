package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.h;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.h;
import androidx.constraintlayout.widget.l;

/* loaded from: classes.dex */
public class Flow extends l {

    /* renamed from: R, reason: collision with root package name */
    private static final String f8302R = "Flow";

    /* renamed from: S, reason: collision with root package name */
    public static final int f8303S = 0;

    /* renamed from: T, reason: collision with root package name */
    public static final int f8304T = 1;

    /* renamed from: U, reason: collision with root package name */
    public static final int f8305U = 0;

    /* renamed from: V, reason: collision with root package name */
    public static final int f8306V = 1;

    /* renamed from: W, reason: collision with root package name */
    public static final int f8307W = 2;

    /* renamed from: a0, reason: collision with root package name */
    public static final int f8308a0 = 0;

    /* renamed from: b0, reason: collision with root package name */
    public static final int f8309b0 = 1;

    /* renamed from: c0, reason: collision with root package name */
    public static final int f8310c0 = 2;

    /* renamed from: d0, reason: collision with root package name */
    public static final int f8311d0 = 0;

    /* renamed from: e0, reason: collision with root package name */
    public static final int f8312e0 = 1;

    /* renamed from: f0, reason: collision with root package name */
    public static final int f8313f0 = 2;

    /* renamed from: g0, reason: collision with root package name */
    public static final int f8314g0 = 0;

    /* renamed from: h0, reason: collision with root package name */
    public static final int f8315h0 = 1;

    /* renamed from: i0, reason: collision with root package name */
    public static final int f8316i0 = 2;

    /* renamed from: j0, reason: collision with root package name */
    public static final int f8317j0 = 3;

    /* renamed from: Q, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.e f8318Q;

    public Flow(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.a
    public void B(d.a aVar, h hVar, ConstraintLayout.b bVar, SparseArray<ConstraintWidget> sparseArray) {
        super.B(aVar, hVar, bVar, sparseArray);
        if (hVar instanceof androidx.constraintlayout.core.widgets.e) {
            androidx.constraintlayout.core.widgets.e eVar = (androidx.constraintlayout.core.widgets.e) hVar;
            int i4 = bVar.f9518Z;
            if (i4 != -1) {
                eVar.x3(i4);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.a
    public void D(ConstraintWidget constraintWidget, boolean z3) {
        this.f8318Q.m2(z3);
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
        L(this.f8318Q, i4, i5);
    }

    public void setFirstHorizontalBias(float f4) {
        this.f8318Q.k3(f4);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i4) {
        this.f8318Q.l3(i4);
        requestLayout();
    }

    public void setFirstVerticalBias(float f4) {
        this.f8318Q.m3(f4);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i4) {
        this.f8318Q.n3(i4);
        requestLayout();
    }

    public void setHorizontalAlign(int i4) {
        this.f8318Q.o3(i4);
        requestLayout();
    }

    public void setHorizontalBias(float f4) {
        this.f8318Q.p3(f4);
        requestLayout();
    }

    public void setHorizontalGap(int i4) {
        this.f8318Q.q3(i4);
        requestLayout();
    }

    public void setHorizontalStyle(int i4) {
        this.f8318Q.r3(i4);
        requestLayout();
    }

    public void setLastHorizontalBias(float f4) {
        this.f8318Q.s3(f4);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i4) {
        this.f8318Q.t3(i4);
        requestLayout();
    }

    public void setLastVerticalBias(float f4) {
        this.f8318Q.u3(f4);
        requestLayout();
    }

    public void setLastVerticalStyle(int i4) {
        this.f8318Q.v3(i4);
        requestLayout();
    }

    public void setMaxElementsWrap(int i4) {
        this.f8318Q.w3(i4);
        requestLayout();
    }

    public void setOrientation(int i4) {
        this.f8318Q.x3(i4);
        requestLayout();
    }

    public void setPadding(int i4) {
        this.f8318Q.B2(i4);
        requestLayout();
    }

    public void setPaddingBottom(int i4) {
        this.f8318Q.C2(i4);
        requestLayout();
    }

    public void setPaddingLeft(int i4) {
        this.f8318Q.E2(i4);
        requestLayout();
    }

    public void setPaddingRight(int i4) {
        this.f8318Q.F2(i4);
        requestLayout();
    }

    public void setPaddingTop(int i4) {
        this.f8318Q.H2(i4);
        requestLayout();
    }

    public void setVerticalAlign(int i4) {
        this.f8318Q.y3(i4);
        requestLayout();
    }

    public void setVerticalBias(float f4) {
        this.f8318Q.z3(f4);
        requestLayout();
    }

    public void setVerticalGap(int i4) {
        this.f8318Q.A3(i4);
        requestLayout();
    }

    public void setVerticalStyle(int i4) {
        this.f8318Q.B3(i4);
        requestLayout();
    }

    public void setWrapMode(int i4) {
        this.f8318Q.C3(i4);
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.l, androidx.constraintlayout.widget.a
    public void z(AttributeSet attributeSet) {
        super.z(attributeSet);
        this.f8318Q = new androidx.constraintlayout.core.widgets.e();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.m.x6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == h.m.y6) {
                    this.f8318Q.x3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == h.m.z6) {
                    this.f8318Q.B2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == h.m.Q6) {
                    this.f8318Q.G2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == h.m.R6) {
                    this.f8318Q.D2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == h.m.A6) {
                    this.f8318Q.E2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == h.m.B6) {
                    this.f8318Q.H2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == h.m.C6) {
                    this.f8318Q.F2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == h.m.D6) {
                    this.f8318Q.C2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == h.m.A7) {
                    this.f8318Q.C3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == h.m.q7) {
                    this.f8318Q.r3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == h.m.z7) {
                    this.f8318Q.B3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == h.m.k7) {
                    this.f8318Q.l3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == h.m.s7) {
                    this.f8318Q.t3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == h.m.m7) {
                    this.f8318Q.n3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == h.m.u7) {
                    this.f8318Q.v3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == h.m.o7) {
                    this.f8318Q.p3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == h.m.j7) {
                    this.f8318Q.k3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == h.m.r7) {
                    this.f8318Q.s3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == h.m.l7) {
                    this.f8318Q.m3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == h.m.t7) {
                    this.f8318Q.u3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == h.m.x7) {
                    this.f8318Q.z3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == h.m.n7) {
                    this.f8318Q.o3(obtainStyledAttributes.getInt(index, 2));
                } else if (index == h.m.w7) {
                    this.f8318Q.y3(obtainStyledAttributes.getInt(index, 2));
                } else if (index == h.m.p7) {
                    this.f8318Q.q3(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == h.m.y7) {
                    this.f8318Q.A3(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == h.m.v7) {
                    this.f8318Q.w3(obtainStyledAttributes.getInt(index, -1));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f9642H = this.f8318Q;
        K();
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
