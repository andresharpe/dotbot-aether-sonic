package com.google.android.material.timepicker;

import T0.a;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.c0;
import androidx.core.view.C0771a;
import androidx.core.view.C0823k0;
import androidx.core.view.accessibility.M;
import com.google.android.material.timepicker.ClockHandView;
import e.C2046a;
import java.util.Arrays;

/* loaded from: classes2.dex */
class ClockFaceView extends c implements ClockHandView.d {

    /* renamed from: H0, reason: collision with root package name */
    private static final float f33819H0 = 0.001f;

    /* renamed from: I0, reason: collision with root package name */
    private static final int f33820I0 = 12;

    /* renamed from: J0, reason: collision with root package name */
    private static final String f33821J0 = "";

    /* renamed from: A0, reason: collision with root package name */
    private final int f33822A0;

    /* renamed from: B0, reason: collision with root package name */
    private final int f33823B0;

    /* renamed from: C0, reason: collision with root package name */
    private final int f33824C0;

    /* renamed from: D0, reason: collision with root package name */
    private final int f33825D0;

    /* renamed from: E0, reason: collision with root package name */
    private String[] f33826E0;

    /* renamed from: F0, reason: collision with root package name */
    private float f33827F0;

    /* renamed from: G0, reason: collision with root package name */
    private final ColorStateList f33828G0;

    /* renamed from: t0, reason: collision with root package name */
    private final ClockHandView f33829t0;

    /* renamed from: u0, reason: collision with root package name */
    private final Rect f33830u0;

    /* renamed from: v0, reason: collision with root package name */
    private final RectF f33831v0;

    /* renamed from: w0, reason: collision with root package name */
    private final SparseArray<TextView> f33832w0;

    /* renamed from: x0, reason: collision with root package name */
    private final C0771a f33833x0;

    /* renamed from: y0, reason: collision with root package name */
    private final int[] f33834y0;

    /* renamed from: z0, reason: collision with root package name */
    private final float[] f33835z0;

    /* loaded from: classes2.dex */
    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.N(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f33829t0.g()) - ClockFaceView.this.f33822A0);
            return true;
        }
    }

    /* loaded from: classes2.dex */
    class b extends C0771a {
        b() {
        }

        @Override // androidx.core.view.C0771a
        public void g(View view, @N M m4) {
            super.g(view, m4);
            int intValue = ((Integer) view.getTag(a.h.f2706T2)).intValue();
            if (intValue > 0) {
                m4.U1((View) ClockFaceView.this.f33832w0.get(intValue - 1));
            }
            m4.c1(M.d.h(0, 1, intValue, 1, false, view.isSelected()));
            m4.a1(true);
            m4.b(M.a.f13375j);
        }

        @Override // androidx.core.view.C0771a
        public boolean j(View view, int i4, Bundle bundle) {
            if (i4 == 16) {
                long uptimeMillis = SystemClock.uptimeMillis();
                float x3 = view.getX() + (view.getWidth() / 2.0f);
                float height = (view.getHeight() / 2.0f) + view.getY();
                ClockFaceView.this.f33829t0.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, x3, height, 0));
                ClockFaceView.this.f33829t0.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, x3, height, 0));
                return true;
            }
            return super.j(view, i4, bundle);
        }
    }

    public ClockFaceView(@N Context context) {
        this(context, null);
    }

    private void U() {
        RectF d4 = this.f33829t0.d();
        for (int i4 = 0; i4 < this.f33832w0.size(); i4++) {
            TextView textView = this.f33832w0.get(i4);
            if (textView != null) {
                textView.getDrawingRect(this.f33830u0);
                offsetDescendantRectToMyCoords(textView, this.f33830u0);
                textView.setSelected(d4.contains(this.f33830u0.centerX(), this.f33830u0.centerY()));
                textView.getPaint().setShader(V(d4, this.f33830u0, textView));
                textView.invalidate();
            }
        }
    }

    @P
    private RadialGradient V(RectF rectF, Rect rect, TextView textView) {
        this.f33831v0.set(rect);
        this.f33831v0.offset(textView.getPaddingLeft(), textView.getPaddingTop());
        if (!RectF.intersects(rectF, this.f33831v0)) {
            return null;
        }
        return new RadialGradient(rectF.centerX() - this.f33831v0.left, rectF.centerY() - this.f33831v0.top, rectF.width() * 0.5f, this.f33834y0, this.f33835z0, Shader.TileMode.CLAMP);
    }

    private static float W(float f4, float f5, float f6) {
        return Math.max(Math.max(f4, f5), f6);
    }

    private void X(@c0 int i4) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f33832w0.size();
        for (int i5 = 0; i5 < Math.max(this.f33826E0.length, size); i5++) {
            TextView textView = this.f33832w0.get(i5);
            if (i5 >= this.f33826E0.length) {
                removeView(textView);
                this.f33832w0.remove(i5);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(a.k.f2974b0, (ViewGroup) this, false);
                    this.f33832w0.put(i5, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f33826E0[i5]);
                textView.setTag(a.h.f2706T2, Integer.valueOf(i5));
                C0823k0.B1(textView, this.f33833x0);
                textView.setTextColor(this.f33828G0);
                if (i4 != 0) {
                    textView.setContentDescription(getResources().getString(i4, this.f33826E0[i5]));
                }
            }
        }
    }

    @Override // com.google.android.material.timepicker.c
    public void N(int i4) {
        if (i4 != M()) {
            super.N(i4);
            this.f33829t0.k(M());
        }
    }

    public void c(String[] strArr, @c0 int i4) {
        this.f33826E0 = strArr;
        X(i4);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.d
    public void d(float f4, boolean z3) {
        if (Math.abs(this.f33827F0 - f4) > f33819H0) {
            this.f33827F0 = f4;
            U();
        }
    }

    public void f(@InterfaceC0580x(from = 0.0d, to = 360.0d) float f4) {
        this.f33829t0.l(f4);
        U();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@N AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        M.c2(accessibilityNodeInfo).b1(M.c.f(1, this.f33826E0.length, false, 1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        U();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i4, int i5) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int W3 = (int) (this.f33825D0 / W(this.f33823B0 / displayMetrics.heightPixels, this.f33824C0 / displayMetrics.widthPixels, 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(W3, 1073741824);
        setMeasuredDimension(W3, W3);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public ClockFaceView(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, a.c.gb);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(@N Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f33830u0 = new Rect();
        this.f33831v0 = new RectF();
        this.f33832w0 = new SparseArray<>();
        this.f33835z0 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.z6, i4, a.n.Zi);
        Resources resources = getResources();
        ColorStateList a4 = com.google.android.material.resources.c.a(context, obtainStyledAttributes, a.o.B6);
        this.f33828G0 = a4;
        LayoutInflater.from(context).inflate(a.k.f2977c0, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(a.h.f2642D2);
        this.f33829t0 = clockHandView;
        this.f33822A0 = resources.getDimensionPixelSize(a.f.h5);
        int colorForState = a4.getColorForState(new int[]{R.attr.state_selected}, a4.getDefaultColor());
        this.f33834y0 = new int[]{colorForState, colorForState, a4.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = C2046a.a(context, a.e.U8).getDefaultColor();
        ColorStateList a5 = com.google.android.material.resources.c.a(context, obtainStyledAttributes, a.o.A6);
        setBackgroundColor(a5 != null ? a5.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f33833x0 = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        c(strArr, 0);
        this.f33823B0 = resources.getDimensionPixelSize(a.f.O5);
        this.f33824C0 = resources.getDimensionPixelSize(a.f.P5);
        this.f33825D0 = resources.getDimensionPixelSize(a.f.o5);
    }
}
