package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.s;
import androidx.constraintlayout.widget.h;

/* loaded from: classes.dex */
public class f extends c {

    /* renamed from: W, reason: collision with root package name */
    private static final String f9406W = "MotionTelltales";

    /* renamed from: P, reason: collision with root package name */
    private Paint f9407P;

    /* renamed from: Q, reason: collision with root package name */
    s f9408Q;

    /* renamed from: R, reason: collision with root package name */
    float[] f9409R;

    /* renamed from: S, reason: collision with root package name */
    Matrix f9410S;

    /* renamed from: T, reason: collision with root package name */
    int f9411T;

    /* renamed from: U, reason: collision with root package name */
    int f9412U;

    /* renamed from: V, reason: collision with root package name */
    float f9413V;

    public f(Context context) {
        super(context);
        this.f9407P = new Paint();
        this.f9409R = new float[2];
        this.f9410S = new Matrix();
        this.f9411T = 0;
        this.f9412U = -65281;
        this.f9413V = 0.25f;
        a(context, null);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.m.Fk);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == h.m.Gk) {
                    this.f9412U = obtainStyledAttributes.getColor(index, this.f9412U);
                } else if (index == h.m.Ik) {
                    this.f9411T = obtainStyledAttributes.getInt(index, this.f9411T);
                } else if (index == h.m.Hk) {
                    this.f9413V = obtainStyledAttributes.getFloat(index, this.f9413V);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f9407P.setColor(this.f9412U);
        this.f9407P.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.c, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.f9410S);
        if (this.f9408Q == null) {
            ViewParent parent = getParent();
            if (parent instanceof s) {
                this.f9408Q = (s) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i4 = 0; i4 < 5; i4++) {
            float f4 = fArr[i4];
            for (int i5 = 0; i5 < 5; i5++) {
                float f5 = fArr[i5];
                this.f9408Q.J0(this, f5, f4, this.f9409R, this.f9411T);
                this.f9410S.mapVectors(this.f9409R);
                float f6 = width * f5;
                float f7 = height * f4;
                float[] fArr2 = this.f9409R;
                float f8 = fArr2[0];
                float f9 = this.f9413V;
                float f10 = f7 - (fArr2[1] * f9);
                this.f9410S.mapVectors(fArr2);
                canvas.drawLine(f6, f7, f6 - (f8 * f9), f10, this.f9407P);
            }
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.f9339J = charSequence.toString();
        requestLayout();
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9407P = new Paint();
        this.f9409R = new float[2];
        this.f9410S = new Matrix();
        this.f9411T = 0;
        this.f9412U = -65281;
        this.f9413V = 0.25f;
        a(context, attributeSet);
    }

    public f(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f9407P = new Paint();
        this.f9409R = new float[2];
        this.f9410S = new Matrix();
        this.f9411T = 0;
        this.f9412U = -65281;
        this.f9413V = 0.25f;
        a(context, attributeSet);
    }
}
