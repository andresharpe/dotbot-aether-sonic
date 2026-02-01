package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class Group extends a {
    public Group(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.a
    public void F(ConstraintLayout constraintLayout) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f9562v0.c2(0);
        bVar.f9562v0.y1(0);
    }

    @Override // androidx.constraintlayout.widget.a, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        q();
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
        this.f9643I = false;
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
