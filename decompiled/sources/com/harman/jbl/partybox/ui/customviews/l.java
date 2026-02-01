package com.harman.jbl.partybox.ui.customviews;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.C0823k0;
import com.harman.jbl.partybox.j;
import java.util.ArrayList;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class l extends LinearLayout {

    /* renamed from: E, reason: collision with root package name */
    @l3.e
    private LinearLayout f42746E;

    /* renamed from: F, reason: collision with root package name */
    @l3.e
    private final LinearLayout f42747F;

    /* renamed from: G, reason: collision with root package name */
    @l3.e
    private final LinearLayout f42748G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f42749H;

    /* renamed from: I, reason: collision with root package name */
    private final float f42750I;

    /* renamed from: J, reason: collision with root package name */
    private final float f42751J;

    /* renamed from: K, reason: collision with root package name */
    private final float f42752K;

    /* renamed from: L, reason: collision with root package name */
    @l3.e
    private RectF f42753L;

    /* renamed from: M, reason: collision with root package name */
    @l3.e
    private Paint f42754M;

    /* renamed from: N, reason: collision with root package name */
    private int f42755N;

    /* renamed from: O, reason: collision with root package name */
    @l3.e
    private ArrayList<HmSegmentedButton> f42756O;

    /* renamed from: P, reason: collision with root package name */
    private int f42757P;

    /* renamed from: Q, reason: collision with root package name */
    private int f42758Q;

    /* renamed from: R, reason: collision with root package name */
    private int f42759R;

    /* renamed from: S, reason: collision with root package name */
    private int f42760S;

    /* renamed from: T, reason: collision with root package name */
    private int f42761T;

    /* renamed from: U, reason: collision with root package name */
    private int f42762U;

    /* renamed from: V, reason: collision with root package name */
    private int f42763V;

    /* renamed from: W, reason: collision with root package name */
    private int f42764W;

    /* renamed from: a0, reason: collision with root package name */
    private final int f42765a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f42766b0;

    /* renamed from: c0, reason: collision with root package name */
    private int f42767c0;

    /* renamed from: d0, reason: collision with root package name */
    private int f42768d0;

    /* renamed from: e0, reason: collision with root package name */
    private int f42769e0;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f42770f0;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f42771g0;

    /* renamed from: h0, reason: collision with root package name */
    private final boolean f42772h0;

    /* renamed from: i0, reason: collision with root package name */
    private final boolean f42773i0;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f42774j0;

    /* renamed from: k0, reason: collision with root package name */
    @l3.e
    private Drawable f42775k0;

    /* renamed from: l0, reason: collision with root package name */
    @l3.e
    private Drawable f42776l0;

    /* renamed from: m0, reason: collision with root package name */
    @l3.e
    private final Interpolator f42777m0;

    /* renamed from: n0, reason: collision with root package name */
    @l3.e
    private final c f42778n0;

    /* renamed from: o0, reason: collision with root package name */
    @l3.e
    private b f42779o0;

    /* renamed from: p0, reason: collision with root package name */
    private int f42780p0;

    /* renamed from: q0, reason: collision with root package name */
    private float f42781q0;

    /* renamed from: r0, reason: collision with root package name */
    private int f42782r0;

    /* renamed from: s0, reason: collision with root package name */
    private float f42783s0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public final class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(@l3.d View view, @l3.d Outline outline) {
            F.p(view, "view");
            F.p(outline, "outline");
            outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), l.this.f42763V);
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(int i4);
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a(int i4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@l3.d Context context) {
        super(context);
        F.p(context, "context");
        e(null);
    }

    private final void c(int i4, float f4) {
        float f5 = i4 + f4;
        int i5 = this.f42782r0;
        float f6 = this.f42783s0;
        float f7 = i5 + f6;
        if ((i5 == 1 && i4 >= 1) || f5 == f7) {
            return;
        }
        int i6 = i4 + 1;
        if (f4 == 0.0f && f7 <= f5) {
            i6 = i4 - 1;
        }
        if (i5 > i4 && f6 > 0.0f) {
            g(i6 + 1, 1.0f);
        }
        if (this.f42782r0 < i4 && this.f42783s0 < 1.0f) {
            h(i4 - 1, 0.0f);
        }
        float f8 = 1.0f - f4;
        g(i6, f8);
        h(i4, f8);
        this.f42782r0 = i4;
        this.f42783s0 = f4;
    }

    private final void d(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.o.f42003q);
        F.o(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f42774j0 = obtainStyledAttributes.hasValue(j.o.f41909C);
        this.f42764W = obtainStyledAttributes.getDimensionPixelSize(j.o.f41909C, 0);
        this.f42762U = obtainStyledAttributes.getColor(j.o.f42021z, -1);
        this.f42766b0 = obtainStyledAttributes.getDimensionPixelSize(j.o.f41905A, 0);
        this.f42767c0 = obtainStyledAttributes.getDimensionPixelSize(j.o.f41907B, 0);
        this.f42757P = obtainStyledAttributes.getColor(j.o.f41925K, -7829368);
        this.f42758Q = obtainStyledAttributes.getInt(j.o.f42007s, 0);
        this.f42759R = obtainStyledAttributes.getInt(j.o.f42009t, 500);
        this.f42763V = obtainStyledAttributes.getDimensionPixelSize(j.o.f41917G, 0);
        this.f42760S = obtainStyledAttributes.getInt(j.o.f41915F, 0);
        this.f42761T = obtainStyledAttributes.getColor(j.o.f42011u, 0);
        this.f42768d0 = obtainStyledAttributes.getDimensionPixelSize(j.o.f42017x, 0);
        this.f42769e0 = obtainStyledAttributes.getColor(j.o.f42015w, C0823k0.f13589t);
        this.f42775k0 = obtainStyledAttributes.getDrawable(j.o.f42013v);
        this.f42776l0 = obtainStyledAttributes.getDrawable(j.o.f41923J);
        this.f42771g0 = obtainStyledAttributes.getBoolean(j.o.f41913E, true);
        this.f42749H = obtainStyledAttributes.getBoolean(j.o.f41911D, false);
        try {
            this.f42770f0 = obtainStyledAttributes.getBoolean(j.o.f42005r, true);
        } catch (Exception e4) {
            T1.a.a("HmSegmentedBtGroup Exception " + e4);
        }
        obtainStyledAttributes.recycle();
    }

    private final void e(AttributeSet attributeSet) {
        d(attributeSet);
        setWillNotDraw(false);
        setOutlineProvider(new a());
        setClickable(true);
        this.f42756O = new ArrayList<>();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f42746E = linearLayout;
        F.m(linearLayout);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout2 = this.f42746E;
        F.m(linearLayout2);
        linearLayout2.setOrientation(0);
        frameLayout.addView(this.f42746E);
        f();
        this.f42753L = new RectF();
        this.f42754M = new Paint(1);
    }

    private final void f() {
        if (isInEditMode()) {
            LinearLayout linearLayout = this.f42746E;
            F.m(linearLayout);
            linearLayout.setBackgroundColor(this.f42761T);
        }
    }

    private final void g(int i4, float f4) {
        if (i4 >= 0 && i4 < this.f42755N) {
            ArrayList<HmSegmentedButton> arrayList = this.f42756O;
            F.m(arrayList);
            arrayList.get(i4).b(f4);
        }
    }

    private final void h(int i4, float f4) {
        if (i4 >= 0 && i4 < this.f42755N) {
            ArrayList<HmSegmentedButton> arrayList = this.f42756O;
            F.m(arrayList);
            arrayList.get(i4).c(f4);
        }
    }

    private final void i(int i4, int i5, boolean z3) {
        b bVar;
        if (this.f42780p0 == i4 && (bVar = this.f42779o0) != null && z3) {
            F.m(bVar);
            bVar.a(i4);
        }
        if (!this.f42749H && this.f42780p0 == i4) {
            return;
        }
        this.f42780p0 = i4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f42781q0, i4);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.harman.jbl.partybox.ui.customviews.k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                l.j(l.this, valueAnimator);
            }
        });
        ofFloat.setInterpolator(this.f42777m0);
        ofFloat.setDuration(i5);
        ofFloat.start();
        b bVar2 = this.f42779o0;
        if (bVar2 != null && z3) {
            F.m(bVar2);
            bVar2.a(i4);
        }
        c cVar = this.f42778n0;
        if (cVar != null) {
            cVar.a(i4);
        }
        this.f42760S = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(l this$0, ValueAnimator animation) {
        F.p(this$0, "this$0");
        F.p(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        F.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        this$0.f42781q0 = floatValue;
        int i4 = (int) floatValue;
        this$0.c(i4, floatValue - i4);
        this$0.invalidate();
    }

    private final void setEnabledAlpha(boolean z3) {
        float f4;
        if (!z3) {
            f4 = 0.5f;
        } else {
            f4 = 1.0f;
        }
        setAlpha(f4);
    }

    @Override // android.view.ViewGroup
    public void addView(@l3.d View child, int i4, @l3.d ViewGroup.LayoutParams params) {
        F.p(child, "child");
        F.p(params, "params");
        if (child instanceof HmSegmentedButton) {
            int i5 = this.f42755N;
            this.f42755N = i5 + 1;
            HmSegmentedButton hmSegmentedButton = (HmSegmentedButton) child;
            hmSegmentedButton.setSelectorColor$JBL_Partybox_3_12_20_release_2025_09_15_11_35_release(this.f42757P);
            hmSegmentedButton.setSelectorRadius$JBL_Partybox_3_12_20_release_2025_09_15_11_35_release(this.f42763V);
            hmSegmentedButton.setBorderSize$JBL_Partybox_3_12_20_release_2025_09_15_11_35_release(this.f42768d0);
            if (i5 == 0) {
                hmSegmentedButton.f(true);
            }
            if (i5 > 0) {
                ArrayList<HmSegmentedButton> arrayList = this.f42756O;
                F.m(arrayList);
                arrayList.get(i5 - 1).g(false);
            }
            hmSegmentedButton.g(true);
            LinearLayout linearLayout = this.f42746E;
            F.m(linearLayout);
            linearLayout.addView(child, params);
            ArrayList<HmSegmentedButton> arrayList2 = this.f42756O;
            F.m(arrayList2);
            arrayList2.add(child);
            if (this.f42760S == i5) {
                hmSegmentedButton.c(1.0f);
                this.f42780p0 = i5;
                this.f42782r0 = i5;
                float f4 = i5;
                this.f42781q0 = f4;
                this.f42783s0 = f4;
                return;
            }
            return;
        }
        super.addView(child, i4, params);
    }

    public final int getPosition() {
        return this.f42760S;
    }

    public final float getRadius() {
        return this.f42763V;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(@l3.d Canvas canvas) {
        F.p(canvas, "canvas");
        super.onDraw(canvas);
        float width = canvas.getWidth();
        float height = canvas.getHeight();
        RectF rectF = this.f42753L;
        F.m(rectF);
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = this.f42754M;
        F.m(paint);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = this.f42754M;
        F.m(paint2);
        paint2.setColor(this.f42761T);
        RectF rectF2 = this.f42753L;
        F.m(rectF2);
        int i4 = this.f42763V;
        Paint paint3 = this.f42754M;
        F.m(paint3);
        canvas.drawRoundRect(rectF2, i4, i4, paint3);
        int i5 = this.f42768d0;
        if (i5 > 0) {
            float f4 = i5 / 2.0f;
            RectF rectF3 = this.f42753L;
            F.m(rectF3);
            float f5 = 0 + f4;
            rectF3.set(f5, f5, width - f4, height - f4);
            Paint paint4 = this.f42754M;
            F.m(paint4);
            paint4.setStyle(Paint.Style.STROKE);
            Paint paint5 = this.f42754M;
            F.m(paint5);
            paint5.setColor(this.f42769e0);
            Paint paint6 = this.f42754M;
            F.m(paint6);
            paint6.setStrokeWidth(this.f42768d0);
            RectF rectF4 = this.f42753L;
            F.m(rectF4);
            int i6 = this.f42763V;
            Paint paint7 = this.f42754M;
            F.m(paint7);
            canvas.drawRoundRect(rectF4, i6, i6, paint7);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@l3.e Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f42760S = bundle.getInt("position");
            parcelable = bundle.getParcelable("state");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    @l3.e
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state", super.onSaveInstanceState());
        bundle.putInt("position", this.f42760S);
        return bundle;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@l3.d MotionEvent event) {
        int i4;
        F.p(event, "event");
        if (event.getAction() == 1) {
            if (((int) Math.floor((((event.getX() - ((getWidth() / this.f42755N) / 2.0f)) * this.f42755N) / getWidth()) + 0.5d)) >= 1) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            i(i4, this.f42759R, true);
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        this.f42761T = i4;
    }

    @Override // android.view.View
    public void setClickable(boolean z3) {
        this.f42770f0 = z3;
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        this.f42771g0 = z3;
        setEnabledAlpha(z3);
    }

    public final void setOnClickedButtonListener(@l3.d b onClickedButtonListener) {
        F.p(onClickedButtonListener, "onClickedButtonListener");
        this.f42779o0 = onClickedButtonListener;
    }

    public final void setPosition(int i4) {
        this.f42760S = i4;
        if (this.f42756O == null) {
            this.f42780p0 = i4;
            this.f42782r0 = i4;
            float f4 = i4;
            this.f42781q0 = f4;
            this.f42783s0 = f4;
            return;
        }
        i(i4, this.f42759R, true);
    }

    public final void setRadius(int i4) {
        this.f42763V = i4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@l3.d Context context, @l3.d AttributeSet attrs) {
        super(context, attrs);
        F.p(context, "context");
        F.p(attrs, "attrs");
        e(attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@l3.d Context context, @l3.d AttributeSet attrs, int i4) {
        super(context, attrs, i4);
        F.p(context, "context");
        F.p(attrs, "attrs");
        e(attrs);
    }
}
