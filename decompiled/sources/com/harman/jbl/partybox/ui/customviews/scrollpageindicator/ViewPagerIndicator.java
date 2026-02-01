package com.harman.jbl.partybox.ui.customviews.scrollpageindicator;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.viewpager2.widget.ViewPager2;
import com.harman.jbl.partybox.j;

/* loaded from: classes2.dex */
public class ViewPagerIndicator extends View {

    /* renamed from: d0, reason: collision with root package name */
    public static final String f42794d0 = "ViewPagerIndicator";

    /* renamed from: E, reason: collision with root package name */
    private final int f42795E;

    /* renamed from: F, reason: collision with root package name */
    private final int f42796F;

    /* renamed from: G, reason: collision with root package name */
    private final int f42797G;

    /* renamed from: H, reason: collision with root package name */
    private final int f42798H;

    /* renamed from: I, reason: collision with root package name */
    private final Paint f42799I;

    /* renamed from: J, reason: collision with root package name */
    private final ArgbEvaluator f42800J;

    /* renamed from: K, reason: collision with root package name */
    private int f42801K;

    /* renamed from: L, reason: collision with root package name */
    private int f42802L;

    /* renamed from: M, reason: collision with root package name */
    private int f42803M;

    /* renamed from: N, reason: collision with root package name */
    private int f42804N;

    /* renamed from: O, reason: collision with root package name */
    private float f42805O;

    /* renamed from: P, reason: collision with root package name */
    private float f42806P;

    /* renamed from: Q, reason: collision with root package name */
    private float f42807Q;

    /* renamed from: R, reason: collision with root package name */
    private SparseArray<Float> f42808R;

    /* renamed from: S, reason: collision with root package name */
    private int f42809S;

    /* renamed from: T, reason: collision with root package name */
    @InterfaceC0569l
    private int f42810T;

    /* renamed from: U, reason: collision with root package name */
    @InterfaceC0569l
    private int f42811U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f42812V;

    /* renamed from: W, reason: collision with root package name */
    private Runnable f42813W;

    /* renamed from: a0, reason: collision with root package name */
    private c<?> f42814a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f42815b0;

    /* renamed from: c0, reason: collision with root package name */
    private final com.harman.jbl.partybox.ui.customviews.scrollpageindicator.b f42816c0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Object f42817E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ c f42818F;

        a(Object obj, c cVar) {
            this.f42817E = obj;
            this.f42818F = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPagerIndicator.this.f42809S = -1;
            ViewPagerIndicator.this.d(this.f42817E, this.f42818F);
        }
    }

    /* loaded from: classes2.dex */
    public @interface b {
    }

    /* loaded from: classes2.dex */
    public interface c<T> {
        void a();

        void b(@N ViewPagerIndicator viewPagerIndicator, @N T t3);
    }

    public ViewPagerIndicator(Context context) {
        this(context, null);
    }

    private void b(float f4, int i4) {
        int i5 = this.f42809S;
        int i6 = this.f42802L;
        if (i5 <= i6) {
            this.f42805O = 0.0f;
            return;
        }
        if (!this.f42812V && i5 > i6) {
            this.f42805O = (g(i4) + (this.f42798H * f4)) - (this.f42806P / 2.0f);
            int i7 = this.f42802L / 2;
            float g4 = g((getDotCount() - 1) - i7);
            if (this.f42805O + (this.f42806P / 2.0f) < g(i7)) {
                this.f42805O = g(i7) - (this.f42806P / 2.0f);
                return;
            }
            float f5 = this.f42805O;
            float f6 = this.f42806P;
            if (f5 + (f6 / 2.0f) > g4) {
                this.f42805O = g4 - (f6 / 2.0f);
                return;
            }
            return;
        }
        this.f42805O = (g(this.f42801K / 2) + (this.f42798H * f4)) - (this.f42806P / 2.0f);
    }

    @InterfaceC0569l
    private int e(float f4) {
        return ((Integer) this.f42800J.evaluate(f4, Integer.valueOf(this.f42810T), Integer.valueOf(this.f42811U))).intValue();
    }

    private float g(int i4) {
        return this.f42807Q + (i4 * this.f42798H);
    }

    private int getDotCount() {
        if (this.f42812V && this.f42809S > this.f42802L) {
            return this.f42801K;
        }
        return this.f42809S;
    }

    private float h(int i4) {
        Float f4 = this.f42808R.get(i4);
        if (f4 != null) {
            return f4.floatValue();
        }
        return 0.0f;
    }

    private void i(int i4) {
        float f4;
        if (this.f42809S == i4 && this.f42815b0) {
            return;
        }
        this.f42809S = i4;
        this.f42815b0 = true;
        this.f42808R = new SparseArray<>();
        if (i4 < this.f42803M) {
            requestLayout();
            invalidate();
            return;
        }
        if (this.f42812V && this.f42809S > this.f42802L) {
            f4 = 0.0f;
        } else {
            f4 = this.f42797G / 2;
        }
        this.f42807Q = f4;
        this.f42806P = ((this.f42802L - 1) * this.f42798H) + this.f42797G;
        requestLayout();
        invalidate();
    }

    private void l(int i4, float f4) {
        if (this.f42808R != null && getDotCount() != 0) {
            m(i4, 1.0f - Math.abs(f4));
        }
    }

    private void m(int i4, float f4) {
        if (f4 == 0.0f) {
            this.f42808R.remove(i4);
        } else {
            this.f42808R.put(i4, Float.valueOf(f4));
        }
    }

    private void o(int i4) {
        if (!this.f42812V || this.f42809S < this.f42802L) {
            this.f42808R.clear();
            this.f42808R.put(i4, Float.valueOf(1.0f));
            invalidate();
        }
    }

    public void c(@N ViewPager2 viewPager2) {
        d(viewPager2, this.f42816c0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void d(@N T t3, @N c<T> cVar) {
        f();
        cVar.b(this, t3);
        this.f42814a0 = cVar;
        this.f42813W = new a(t3, cVar);
    }

    public void f() {
        c<?> cVar = this.f42814a0;
        if (cVar != null) {
            cVar.a();
            this.f42814a0 = null;
            this.f42813W = null;
        }
        this.f42815b0 = false;
    }

    @InterfaceC0569l
    public int getDotColor() {
        return this.f42810T;
    }

    @b
    public int getOrientation() {
        return this.f42804N;
    }

    @InterfaceC0569l
    public int getSelectedDotColor() {
        return this.f42811U;
    }

    public int getVisibleDotThreshold() {
        return this.f42803M;
    }

    public void j(int i4, float f4) {
        int i5;
        if (f4 >= 0.0f && f4 <= 1.0f && i4 >= 0) {
            if (i4 == 0 || i4 < this.f42809S) {
                if (!this.f42812V || ((i5 = this.f42809S) <= this.f42802L && i5 > 1)) {
                    this.f42808R.clear();
                    if (this.f42804N == 0) {
                        l(i4, f4);
                        int i6 = this.f42809S;
                        if (i4 < i6 - 1) {
                            l(i4 + 1, 1.0f - f4);
                        } else if (i6 > 1) {
                            l(0, 1.0f - f4);
                        }
                    } else {
                        l(i4 - 1, f4);
                        l(i4, 1.0f - f4);
                    }
                    invalidate();
                }
                if (this.f42804N == 0) {
                    b(f4, i4);
                } else {
                    b(f4, i4 - 1);
                }
                invalidate();
            }
        }
    }

    public void k() {
        Runnable runnable = this.f42813W;
        if (runnable != null) {
            runnable.run();
            invalidate();
        }
    }

    public void n() {
        this.f42816c0.f(this);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float h4;
        float f4;
        int i4;
        int dotCount = getDotCount();
        if (dotCount < this.f42803M) {
            return;
        }
        int i5 = this.f42798H;
        float f5 = (((r4 - this.f42796F) / 2) + i5) * 0.7f;
        float f6 = this.f42797G / 2;
        float f7 = i5 * 0.85714287f;
        float f8 = this.f42805O;
        int i6 = ((int) (f8 - this.f42807Q)) / i5;
        int g4 = (((int) ((f8 + this.f42806P) - g(i6))) / this.f42798H) + i6;
        if (i6 == 0 && g4 + 1 > dotCount) {
            g4 = dotCount - 1;
        }
        while (i6 <= g4) {
            float g5 = g(i6);
            float f9 = this.f42805O;
            if (g5 >= f9) {
                float f10 = this.f42806P;
                if (g5 < f9 + f10) {
                    if (this.f42812V && this.f42809S > this.f42802L) {
                        float f11 = f9 + (f10 / 2.0f);
                        if (g5 >= f11 - f7 && g5 <= f11) {
                            h4 = ((g5 - f11) + f7) / f7;
                        } else if (g5 > f11 && g5 < f11 + f7) {
                            h4 = 1.0f - ((g5 - f11) / f7);
                        } else {
                            h4 = 0.0f;
                        }
                    } else {
                        h4 = h(i6);
                    }
                    float f12 = this.f42796F + ((this.f42797G - r10) * h4);
                    if (this.f42809S > this.f42802L) {
                        if (!this.f42812V && (i6 == 0 || i6 == dotCount - 1)) {
                            f4 = f6;
                        } else {
                            f4 = f5;
                        }
                        int width = getWidth();
                        if (this.f42804N == 1) {
                            width = getHeight();
                        }
                        float f13 = this.f42805O;
                        if (g5 - f13 < f4) {
                            float f14 = ((g5 - f13) * f12) / f4;
                            i4 = this.f42795E;
                            if (f14 > i4) {
                                if (f14 < f12) {
                                    f12 = f14;
                                }
                            }
                            f12 = i4;
                        } else {
                            float f15 = width;
                            if (g5 - f13 > f15 - f4) {
                                float f16 = ((((-g5) + f13) + f15) * f12) / f4;
                                i4 = this.f42795E;
                                if (f16 > i4) {
                                    if (f16 < f12) {
                                        f12 = f16;
                                    }
                                }
                                f12 = i4;
                            }
                        }
                    }
                    this.f42799I.setColor(e(h4));
                    if (this.f42804N == 0) {
                        canvas.drawCircle(g5 - this.f42805O, getMeasuredHeight() / 2, f12 / 2.0f, this.f42799I);
                    } else {
                        canvas.drawCircle(getMeasuredWidth() / 2, g5 - this.f42805O, f12 / 2.0f, this.f42799I);
                    }
                }
            }
            i6++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.f42804N
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L40
            boolean r5 = r4.isInEditMode()
            if (r5 == 0) goto L19
            int r5 = r4.f42802L
            int r5 = r5 + (-1)
            int r0 = r4.f42798H
            int r5 = r5 * r0
            int r0 = r4.f42797G
        L17:
            int r5 = r5 + r0
            goto L2b
        L19:
            int r5 = r4.f42809S
            int r0 = r4.f42802L
            if (r5 < r0) goto L23
            float r5 = r4.f42806P
            int r5 = (int) r5
            goto L2b
        L23:
            int r5 = r5 + (-1)
            int r0 = r4.f42798H
            int r5 = r5 * r0
            int r0 = r4.f42797G
            goto L17
        L2b:
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r3 = r4.f42797G
            if (r0 == r2) goto L3b
            if (r0 == r1) goto L77
            r6 = r3
            goto L77
        L3b:
            int r6 = java.lang.Math.min(r3, r6)
            goto L77
        L40:
            boolean r6 = r4.isInEditMode()
            if (r6 == 0) goto L51
            int r6 = r4.f42802L
            int r6 = r6 + (-1)
            int r0 = r4.f42798H
            int r6 = r6 * r0
            int r0 = r4.f42797G
        L4f:
            int r6 = r6 + r0
            goto L63
        L51:
            int r6 = r4.f42809S
            int r0 = r4.f42802L
            if (r6 < r0) goto L5b
            float r6 = r4.f42806P
            int r6 = (int) r6
            goto L63
        L5b:
            int r6 = r6 + (-1)
            int r0 = r4.f42798H
            int r6 = r6 * r0
            int r0 = r4.f42797G
            goto L4f
        L63:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r3 = r4.f42797G
            if (r0 == r2) goto L73
            if (r0 == r1) goto L77
            r5 = r3
            goto L77
        L73:
            int r5 = java.lang.Math.min(r3, r5)
        L77:
            r4.setMeasuredDimension(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.customviews.scrollpageindicator.ViewPagerIndicator.onMeasure(int, int):void");
    }

    public void setCurrentPosition(int i4) {
        if (this.f42809S == 0) {
            return;
        }
        b(0.0f, i4);
        o(i4);
    }

    public void setDotColor(@InterfaceC0569l int i4) {
        this.f42810T = i4;
        invalidate();
    }

    public void setDotCount(int i4) {
        i(i4);
    }

    public void setLooped(boolean z3) {
        this.f42812V = z3;
        k();
        invalidate();
    }

    public void setOrientation(@b int i4) {
        this.f42804N = i4;
        if (this.f42813W != null) {
            k();
        } else {
            requestLayout();
        }
    }

    public void setSelectedDotColor(@InterfaceC0569l int i4) {
        this.f42811U = i4;
        invalidate();
    }

    public void setVisibleDotCount(int i4) {
        if (i4 % 2 != 0) {
            this.f42802L = i4;
            this.f42801K = i4 + 2;
            if (this.f42813W != null) {
                k();
                return;
            } else {
                requestLayout();
                return;
            }
        }
        throw new IllegalArgumentException("visibleDotCount must be odd");
    }

    public void setVisibleDotThreshold(int i4) {
        this.f42803M = i4;
        if (this.f42813W != null) {
            k();
        } else {
            requestLayout();
        }
    }

    public ViewPagerIndicator(Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewPagerIndicator(Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f42800J = new ArgbEvaluator();
        this.f42816c0 = new com.harman.jbl.partybox.ui.customviews.scrollpageindicator.b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.o.f41968d1, i4, j.n.f41898t);
        int color = obtainStyledAttributes.getColor(j.o.f41971e1, 0);
        this.f42810T = color;
        this.f42811U = obtainStyledAttributes.getColor(j.o.f41977g1, color);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(j.o.f41983i1, 0);
        this.f42796F = dimensionPixelSize;
        this.f42797G = obtainStyledAttributes.getDimensionPixelSize(j.o.f41980h1, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(j.o.f41974f1, -1);
        this.f42795E = dimensionPixelSize2 <= dimensionPixelSize ? dimensionPixelSize2 : -1;
        this.f42798H = obtainStyledAttributes.getDimensionPixelSize(j.o.f41986j1, 0) + dimensionPixelSize;
        this.f42812V = obtainStyledAttributes.getBoolean(j.o.f41989k1, false);
        int i5 = obtainStyledAttributes.getInt(j.o.f41995m1, 0);
        setVisibleDotCount(i5);
        this.f42803M = obtainStyledAttributes.getInt(j.o.f41998n1, 2);
        this.f42804N = obtainStyledAttributes.getInt(j.o.f41992l1, 0);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f42799I = paint;
        paint.setAntiAlias(true);
        if (isInEditMode()) {
            setDotCount(i5);
            j(i5 / 2, 0.0f);
        }
    }
}
