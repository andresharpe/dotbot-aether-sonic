package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.s;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.h;
import androidx.constraintlayout.widget.j;

/* loaded from: classes.dex */
public class i extends View implements j.a {

    /* renamed from: E, reason: collision with root package name */
    private int f11422E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f11423F;

    /* renamed from: G, reason: collision with root package name */
    private int f11424G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f11425H;

    public i(Context context) {
        super(context);
        this.f11422E = -1;
        this.f11423F = false;
        this.f11424G = 0;
        this.f11425H = true;
        super.setVisibility(8);
        c(null);
    }

    private void b(int i4, int i5, s sVar, int i6) {
        d E02 = sVar.E0(i6);
        E02.g1(i5, i4);
        sVar.o1(i6, E02);
    }

    private void c(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.m.J8);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == h.m.N8) {
                    this.f11422E = obtainStyledAttributes.getResourceId(index, this.f11422E);
                } else if (index == h.m.K8) {
                    this.f11423F = obtainStyledAttributes.getBoolean(index, this.f11423F);
                } else if (index == h.m.M8) {
                    this.f11424G = obtainStyledAttributes.getResourceId(index, this.f11424G);
                } else if (index == h.m.L8) {
                    this.f11425H = obtainStyledAttributes.getBoolean(index, this.f11425H);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f11422E != -1) {
            ConstraintLayout.getSharedValues().a(this.f11422E, this);
        }
    }

    @Override // androidx.constraintlayout.widget.j.a
    public void a(int i4, int i5, int i6) {
        setGuidelineBegin(i5);
        int id = getId();
        if (id > 0 && (getParent() instanceof s)) {
            s sVar = (s) getParent();
            int currentState = sVar.getCurrentState();
            int i7 = this.f11424G;
            if (i7 != 0) {
                currentState = i7;
            }
            int i8 = 0;
            if (this.f11423F) {
                if (this.f11425H) {
                    int[] constraintSetIds = sVar.getConstraintSetIds();
                    while (i8 < constraintSetIds.length) {
                        int i9 = constraintSetIds[i8];
                        if (i9 != currentState) {
                            b(i5, id, sVar, i9);
                        }
                        i8++;
                    }
                }
                d q02 = sVar.q0(currentState);
                q02.g1(id, i5);
                sVar.p1(currentState, q02, 1000);
                return;
            }
            if (this.f11425H) {
                int[] constraintSetIds2 = sVar.getConstraintSetIds();
                while (i8 < constraintSetIds2.length) {
                    b(i5, id, sVar, constraintSetIds2[i8]);
                    i8++;
                }
                return;
            }
            b(i5, id, sVar, currentState);
        }
    }

    public boolean d() {
        return this.f11423F;
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getApplyToConstraintSetId() {
        return this.f11424G;
    }

    public int getAttributeId() {
        return this.f11422E;
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setAnimateChange(boolean z3) {
        this.f11423F = z3;
    }

    public void setApplyToConstraintSetId(int i4) {
        this.f11424G = i4;
    }

    public void setAttributeId(int i4) {
        j sharedValues = ConstraintLayout.getSharedValues();
        int i5 = this.f11422E;
        if (i5 != -1) {
            sharedValues.e(i5, this);
        }
        this.f11422E = i4;
        if (i4 != -1) {
            sharedValues.a(i4, this);
        }
    }

    public void setGuidelineBegin(int i4) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f9519a = i4;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int i4) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f9521b = i4;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float f4) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f9523c = f4;
        setLayoutParams(bVar);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
    }

    public i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11422E = -1;
        this.f11423F = false;
        this.f11424G = 0;
        this.f11425H = true;
        super.setVisibility(8);
        c(attributeSet);
    }

    public i(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f11422E = -1;
        this.f11423F = false;
        this.f11424G = 0;
        this.f11425H = true;
        super.setVisibility(8);
        c(attributeSet);
    }

    public i(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4);
        this.f11422E = -1;
        this.f11423F = false;
        this.f11424G = 0;
        this.f11425H = true;
        super.setVisibility(8);
        c(attributeSet);
    }
}
