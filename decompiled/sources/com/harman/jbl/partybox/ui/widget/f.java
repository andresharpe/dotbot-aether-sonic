package com.harman.jbl.partybox.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public class f extends FrameLayout {

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    public static final a f46118I = new a(null);

    /* renamed from: J, reason: collision with root package name */
    private static final float f46119J = 8.0f;

    /* renamed from: K, reason: collision with root package name */
    private static final int f46120K = -1;

    /* renamed from: L, reason: collision with root package name */
    private static final int f46121L = 419430400;

    /* renamed from: E, reason: collision with root package name */
    private int f46122E;

    /* renamed from: F, reason: collision with root package name */
    private float f46123F;

    /* renamed from: G, reason: collision with root package name */
    private float f46124G;

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final Paint f46125H;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@l3.d Context context) {
        super(context);
        F.p(context, "context");
        this.f46122E = -1;
        this.f46125H = new Paint(1);
        b(null);
    }

    private final float a(float f4) {
        return TypedValue.applyDimension(1, f4, getResources().getDisplayMetrics());
    }

    private final void b(AttributeSet attributeSet) {
        this.f46123F = a(f46119J);
        this.f46125H.setColor(this.f46122E);
        this.f46125H.setShadowLayer(this.f46123F, 0.0f, 0.0f, f46121L);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@l3.d Canvas canvas) {
        F.p(canvas, "canvas");
        float f4 = this.f46123F;
        float width = getWidth() - this.f46123F;
        float height = getHeight() - this.f46123F;
        float f5 = this.f46124G;
        canvas.drawRoundRect(f4, f4, width, height, f5, f5, this.f46125H);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        int i6;
        super.onMeasure(i4, i5);
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int childCount = getChildCount();
        if (childCount <= 1) {
            int i7 = 0;
            if (childCount > 0) {
                View childAt = getChildAt(0);
                measureChild(childAt, i4, i5);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    measuredWidth += marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
                    measuredHeight += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                }
                float f4 = this.f46123F;
                float f5 = 2;
                int i8 = measuredWidth + ((int) (f4 * f5));
                int i9 = measuredHeight + ((int) (f4 * f5));
                if (mode == Integer.MIN_VALUE) {
                    i8 += getPaddingStart() + getPaddingEnd();
                }
                if (mode2 == Integer.MIN_VALUE) {
                    i9 += getPaddingTop() + getPaddingBottom();
                }
                i6 = i9;
                i7 = i8;
            } else {
                i6 = 0;
            }
            if (mode != 1073741824) {
                size = i7;
            }
            if (mode2 != 1073741824) {
                size2 = i6;
            }
            setMeasuredDimension(size, size2);
            return;
        }
        throw new IllegalStateException("CardLayout cannot have more than one child");
    }

    public final void setCardBackgroundColor(int i4) {
        this.f46122E = i4;
        invalidate();
    }

    public final void setCornerRadius(float f4) {
        this.f46124G = a(f4);
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@l3.d Context context, @l3.e AttributeSet attributeSet) {
        super(context, attributeSet);
        F.p(context, "context");
        this.f46122E = -1;
        this.f46125H = new Paint(1);
        b(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@l3.d Context context, @l3.e AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        F.p(context, "context");
        this.f46122E = -1;
        this.f46125H = new Paint(1);
        b(attributeSet);
    }
}
