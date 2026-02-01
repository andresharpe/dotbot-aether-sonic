package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.h;
import com.google.firebase.remoteconfig.l;

/* loaded from: classes.dex */
public class e extends androidx.constraintlayout.widget.a {

    /* renamed from: j0, reason: collision with root package name */
    private static final String f8385j0 = "Layer";

    /* renamed from: O, reason: collision with root package name */
    private float f8386O;

    /* renamed from: P, reason: collision with root package name */
    private float f8387P;

    /* renamed from: Q, reason: collision with root package name */
    private float f8388Q;

    /* renamed from: R, reason: collision with root package name */
    ConstraintLayout f8389R;

    /* renamed from: S, reason: collision with root package name */
    private float f8390S;

    /* renamed from: T, reason: collision with root package name */
    private float f8391T;

    /* renamed from: U, reason: collision with root package name */
    protected float f8392U;

    /* renamed from: V, reason: collision with root package name */
    protected float f8393V;

    /* renamed from: W, reason: collision with root package name */
    protected float f8394W;

    /* renamed from: a0, reason: collision with root package name */
    protected float f8395a0;

    /* renamed from: b0, reason: collision with root package name */
    protected float f8396b0;

    /* renamed from: c0, reason: collision with root package name */
    protected float f8397c0;

    /* renamed from: d0, reason: collision with root package name */
    boolean f8398d0;

    /* renamed from: e0, reason: collision with root package name */
    View[] f8399e0;

    /* renamed from: f0, reason: collision with root package name */
    private float f8400f0;

    /* renamed from: g0, reason: collision with root package name */
    private float f8401g0;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f8402h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f8403i0;

    public e(Context context) {
        super(context);
        this.f8386O = Float.NaN;
        this.f8387P = Float.NaN;
        this.f8388Q = Float.NaN;
        this.f8390S = 1.0f;
        this.f8391T = 1.0f;
        this.f8392U = Float.NaN;
        this.f8393V = Float.NaN;
        this.f8394W = Float.NaN;
        this.f8395a0 = Float.NaN;
        this.f8396b0 = Float.NaN;
        this.f8397c0 = Float.NaN;
        this.f8398d0 = true;
        this.f8399e0 = null;
        this.f8400f0 = 0.0f;
        this.f8401g0 = 0.0f;
    }

    private void M() {
        int i4;
        if (this.f8389R == null || (i4 = this.f9640F) == 0) {
            return;
        }
        View[] viewArr = this.f8399e0;
        if (viewArr == null || viewArr.length != i4) {
            this.f8399e0 = new View[i4];
        }
        for (int i5 = 0; i5 < this.f9640F; i5++) {
            this.f8399e0[i5] = this.f8389R.q(this.f9639E[i5]);
        }
    }

    private void N() {
        double radians;
        if (this.f8389R == null) {
            return;
        }
        if (this.f8399e0 == null) {
            M();
        }
        L();
        if (Float.isNaN(this.f8388Q)) {
            radians = l.f37524n;
        } else {
            radians = Math.toRadians(this.f8388Q);
        }
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        float f4 = this.f8390S;
        float f5 = f4 * cos;
        float f6 = this.f8391T;
        float f7 = (-f6) * sin;
        float f8 = f4 * sin;
        float f9 = f6 * cos;
        for (int i4 = 0; i4 < this.f9640F; i4++) {
            View view = this.f8399e0[i4];
            int left = (view.getLeft() + view.getRight()) / 2;
            int top = (view.getTop() + view.getBottom()) / 2;
            float f10 = left - this.f8392U;
            float f11 = top - this.f8393V;
            float f12 = (((f5 * f10) + (f7 * f11)) - f10) + this.f8400f0;
            float f13 = (((f10 * f8) + (f9 * f11)) - f11) + this.f8401g0;
            view.setTranslationX(f12);
            view.setTranslationY(f13);
            view.setScaleY(this.f8391T);
            view.setScaleX(this.f8390S);
            if (!Float.isNaN(this.f8388Q)) {
                view.setRotation(this.f8388Q);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.a
    public void F(ConstraintLayout constraintLayout) {
        M();
        this.f8392U = Float.NaN;
        this.f8393V = Float.NaN;
        ConstraintWidget b4 = ((ConstraintLayout.b) getLayoutParams()).b();
        b4.c2(0);
        b4.y1(0);
        L();
        layout(((int) this.f8396b0) - getPaddingLeft(), ((int) this.f8397c0) - getPaddingTop(), ((int) this.f8394W) + getPaddingRight(), ((int) this.f8395a0) + getPaddingBottom());
        N();
    }

    @Override // androidx.constraintlayout.widget.a
    public void H(ConstraintLayout constraintLayout) {
        this.f8389R = constraintLayout;
        float rotation = getRotation();
        if (rotation == 0.0f) {
            if (!Float.isNaN(this.f8388Q)) {
                this.f8388Q = rotation;
                return;
            }
            return;
        }
        this.f8388Q = rotation;
    }

    protected void L() {
        if (this.f8389R == null) {
            return;
        }
        if (!this.f8398d0 && !Float.isNaN(this.f8392U) && !Float.isNaN(this.f8393V)) {
            return;
        }
        if (!Float.isNaN(this.f8386O) && !Float.isNaN(this.f8387P)) {
            this.f8393V = this.f8387P;
            this.f8392U = this.f8386O;
            return;
        }
        View[] x3 = x(this.f8389R);
        int left = x3[0].getLeft();
        int top = x3[0].getTop();
        int right = x3[0].getRight();
        int bottom = x3[0].getBottom();
        for (int i4 = 0; i4 < this.f9640F; i4++) {
            View view = x3[i4];
            left = Math.min(left, view.getLeft());
            top = Math.min(top, view.getTop());
            right = Math.max(right, view.getRight());
            bottom = Math.max(bottom, view.getBottom());
        }
        this.f8394W = right;
        this.f8395a0 = bottom;
        this.f8396b0 = left;
        this.f8397c0 = top;
        if (Float.isNaN(this.f8386O)) {
            this.f8392U = (left + right) / 2;
        } else {
            this.f8392U = this.f8386O;
        }
        if (Float.isNaN(this.f8387P)) {
            this.f8393V = (top + bottom) / 2;
        } else {
            this.f8393V = this.f8387P;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.a, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8389R = (ConstraintLayout) getParent();
        if (this.f8402h0 || this.f8403i0) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i4 = 0; i4 < this.f9640F; i4++) {
                View q4 = this.f8389R.q(this.f9639E[i4]);
                if (q4 != null) {
                    if (this.f8402h0) {
                        q4.setVisibility(visibility);
                    }
                    if (this.f8403i0 && elevation > 0.0f) {
                        q4.setTranslationZ(q4.getTranslationZ() + elevation);
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
    public void setPivotX(float f4) {
        this.f8386O = f4;
        N();
    }

    @Override // android.view.View
    public void setPivotY(float f4) {
        this.f8387P = f4;
        N();
    }

    @Override // android.view.View
    public void setRotation(float f4) {
        this.f8388Q = f4;
        N();
    }

    @Override // android.view.View
    public void setScaleX(float f4) {
        this.f8390S = f4;
        N();
    }

    @Override // android.view.View
    public void setScaleY(float f4) {
        this.f8391T = f4;
        N();
    }

    @Override // android.view.View
    public void setTranslationX(float f4) {
        this.f8400f0 = f4;
        N();
    }

    @Override // android.view.View
    public void setTranslationY(float f4) {
        this.f8401g0 = f4;
        N();
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
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.m.x6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == h.m.E6) {
                    this.f8402h0 = true;
                } else if (index == h.m.U6) {
                    this.f8403i0 = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8386O = Float.NaN;
        this.f8387P = Float.NaN;
        this.f8388Q = Float.NaN;
        this.f8390S = 1.0f;
        this.f8391T = 1.0f;
        this.f8392U = Float.NaN;
        this.f8393V = Float.NaN;
        this.f8394W = Float.NaN;
        this.f8395a0 = Float.NaN;
        this.f8396b0 = Float.NaN;
        this.f8397c0 = Float.NaN;
        this.f8398d0 = true;
        this.f8399e0 = null;
        this.f8400f0 = 0.0f;
        this.f8401g0 = 0.0f;
    }

    public e(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f8386O = Float.NaN;
        this.f8387P = Float.NaN;
        this.f8388Q = Float.NaN;
        this.f8390S = 1.0f;
        this.f8391T = 1.0f;
        this.f8392U = Float.NaN;
        this.f8393V = Float.NaN;
        this.f8394W = Float.NaN;
        this.f8395a0 = Float.NaN;
        this.f8396b0 = Float.NaN;
        this.f8397c0 = Float.NaN;
        this.f8398d0 = true;
        this.f8399e0 = null;
        this.f8400f0 = 0.0f;
        this.f8401g0 = 0.0f;
    }
}
