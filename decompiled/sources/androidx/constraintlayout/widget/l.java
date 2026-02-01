package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.h;

/* loaded from: classes.dex */
public abstract class l extends a {

    /* renamed from: O, reason: collision with root package name */
    private boolean f11449O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f11450P;

    public l(Context context) {
        super(context);
    }

    public void L(androidx.constraintlayout.core.widgets.l lVar, int i4, int i5) {
    }

    @Override // androidx.constraintlayout.widget.a, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f11449O || this.f11450P) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i4 = 0; i4 < this.f9640F; i4++) {
                    View q4 = constraintLayout.q(this.f9639E[i4]);
                    if (q4 != null) {
                        if (this.f11449O) {
                            q4.setVisibility(visibility);
                        }
                        if (this.f11450P && elevation > 0.0f) {
                            q4.setTranslationZ(q4.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.a
    public void s(ConstraintLayout constraintLayout) {
        r(constraintLayout);
    }

    @Override // android.view.View
    public void setElevation(float f4) {
        super.setElevation(f4);
        q();
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.a
    public void z(AttributeSet attributeSet) {
        super.z(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.m.x6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == h.m.E6) {
                    this.f11449O = true;
                } else if (index == h.m.U6) {
                    this.f11450P = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public l(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
