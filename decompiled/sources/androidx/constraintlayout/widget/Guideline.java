package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class Guideline extends View {

    /* renamed from: E, reason: collision with root package name */
    private boolean f9637E;

    public Guideline(Context context) {
        super(context);
        this.f9637E = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z3) {
        this.f9637E = z3;
    }

    public void setGuidelineBegin(int i4) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f9637E && bVar.f9519a == i4) {
            return;
        }
        bVar.f9519a = i4;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int i4) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f9637E && bVar.f9521b == i4) {
            return;
        }
        bVar.f9521b = i4;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float f4) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f9637E && bVar.f9523c == f4) {
            return;
        }
        bVar.f9523c = f4;
        setLayoutParams(bVar);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9637E = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f9637E = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4);
        this.f9637E = true;
        super.setVisibility(8);
    }
}
