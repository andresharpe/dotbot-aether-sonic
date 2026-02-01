package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0571n;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.core.content.C0669d;
import androidx.core.view.C0823k0;

/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: p0, reason: collision with root package name */
    private static final String f20462p0 = "PagerTabStrip";

    /* renamed from: q0, reason: collision with root package name */
    private static final int f20463q0 = 3;

    /* renamed from: r0, reason: collision with root package name */
    private static final int f20464r0 = 6;

    /* renamed from: s0, reason: collision with root package name */
    private static final int f20465s0 = 16;

    /* renamed from: t0, reason: collision with root package name */
    private static final int f20466t0 = 32;

    /* renamed from: u0, reason: collision with root package name */
    private static final int f20467u0 = 64;

    /* renamed from: v0, reason: collision with root package name */
    private static final int f20468v0 = 1;

    /* renamed from: w0, reason: collision with root package name */
    private static final int f20469w0 = 32;

    /* renamed from: W, reason: collision with root package name */
    private int f20470W;

    /* renamed from: a0, reason: collision with root package name */
    private int f20471a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f20472b0;

    /* renamed from: c0, reason: collision with root package name */
    private int f20473c0;

    /* renamed from: d0, reason: collision with root package name */
    private int f20474d0;

    /* renamed from: e0, reason: collision with root package name */
    private int f20475e0;

    /* renamed from: f0, reason: collision with root package name */
    private final Paint f20476f0;

    /* renamed from: g0, reason: collision with root package name */
    private final Rect f20477g0;

    /* renamed from: h0, reason: collision with root package name */
    private int f20478h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f20479i0;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f20480j0;

    /* renamed from: k0, reason: collision with root package name */
    private int f20481k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f20482l0;

    /* renamed from: m0, reason: collision with root package name */
    private float f20483m0;

    /* renamed from: n0, reason: collision with root package name */
    private float f20484n0;

    /* renamed from: o0, reason: collision with root package name */
    private int f20485o0;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.f20492E.setCurrentItem(r2.getCurrentItem() - 1);
        }
    }

    /* renamed from: androidx.viewpager.widget.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class ViewOnClickListenerC0185b implements View.OnClickListener {
        ViewOnClickListenerC0185b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = b.this.f20492E;
            dVar.setCurrentItem(dVar.getCurrentItem() + 1);
        }
    }

    public b(@N Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.viewpager.widget.c
    public void d(int i4, float f4, boolean z3) {
        Rect rect = this.f20477g0;
        int height = getHeight();
        int left = this.f20494G.getLeft() - this.f20475e0;
        int right = this.f20494G.getRight() + this.f20475e0;
        int i5 = height - this.f20471a0;
        rect.set(left, i5, right, height);
        super.d(i4, f4, z3);
        this.f20478h0 = (int) (Math.abs(f4 - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f20494G.getLeft() - this.f20475e0, i5, this.f20494G.getRight() + this.f20475e0, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.f20479i0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.viewpager.widget.c
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f20474d0);
    }

    @InterfaceC0569l
    public int getTabIndicatorColor() {
        return this.f20470W;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f20494G.getLeft() - this.f20475e0;
        int right = this.f20494G.getRight() + this.f20475e0;
        int i4 = height - this.f20471a0;
        this.f20476f0.setColor((this.f20478h0 << 24) | (this.f20470W & C0823k0.f13588s));
        float f4 = height;
        canvas.drawRect(left, i4, right, f4, this.f20476f0);
        if (this.f20479i0) {
            this.f20476f0.setColor((this.f20470W & C0823k0.f13588s) | C0823k0.f13589t);
            canvas.drawRect(getPaddingLeft(), height - this.f20481k0, getWidth() - getPaddingRight(), f4, this.f20476f0);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f20482l0) {
            return false;
        }
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (action != 0) {
            if (action != 1) {
                if (action == 2 && (Math.abs(x3 - this.f20483m0) > this.f20485o0 || Math.abs(y3 - this.f20484n0) > this.f20485o0)) {
                    this.f20482l0 = true;
                }
            } else if (x3 < this.f20494G.getLeft() - this.f20475e0) {
                d dVar = this.f20492E;
                dVar.setCurrentItem(dVar.getCurrentItem() - 1);
            } else if (x3 > this.f20494G.getRight() + this.f20475e0) {
                d dVar2 = this.f20492E;
                dVar2.setCurrentItem(dVar2.getCurrentItem() + 1);
            }
        } else {
            this.f20483m0 = x3;
            this.f20484n0 = y3;
            this.f20482l0 = false;
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(@InterfaceC0569l int i4) {
        boolean z3;
        super.setBackgroundColor(i4);
        if (!this.f20480j0) {
            if ((i4 & C0823k0.f13589t) == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f20479i0 = z3;
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        boolean z3;
        super.setBackgroundDrawable(drawable);
        if (!this.f20480j0) {
            if (drawable == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f20479i0 = z3;
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@InterfaceC0578v int i4) {
        boolean z3;
        super.setBackgroundResource(i4);
        if (!this.f20480j0) {
            if (i4 == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f20479i0 = z3;
        }
    }

    public void setDrawFullUnderline(boolean z3) {
        this.f20479i0 = z3;
        this.f20480j0 = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i4, int i5, int i6, int i7) {
        int i8 = this.f20472b0;
        if (i7 < i8) {
            i7 = i8;
        }
        super.setPadding(i4, i5, i6, i7);
    }

    public void setTabIndicatorColor(@InterfaceC0569l int i4) {
        this.f20470W = i4;
        this.f20476f0.setColor(i4);
        invalidate();
    }

    public void setTabIndicatorColorResource(@InterfaceC0571n int i4) {
        setTabIndicatorColor(C0669d.f(getContext(), i4));
    }

    @Override // androidx.viewpager.widget.c
    public void setTextSpacing(int i4) {
        int i5 = this.f20473c0;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setTextSpacing(i4);
    }

    public b(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f20476f0 = paint;
        this.f20477g0 = new Rect();
        this.f20478h0 = 255;
        this.f20479i0 = false;
        this.f20480j0 = false;
        int i4 = this.f20505R;
        this.f20470W = i4;
        paint.setColor(i4);
        float f4 = context.getResources().getDisplayMetrics().density;
        this.f20471a0 = (int) ((3.0f * f4) + 0.5f);
        this.f20472b0 = (int) ((6.0f * f4) + 0.5f);
        this.f20473c0 = (int) (64.0f * f4);
        this.f20475e0 = (int) ((16.0f * f4) + 0.5f);
        this.f20481k0 = (int) ((1.0f * f4) + 0.5f);
        this.f20474d0 = (int) ((f4 * 32.0f) + 0.5f);
        this.f20485o0 = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f20493F.setFocusable(true);
        this.f20493F.setOnClickListener(new a());
        this.f20495H.setFocusable(true);
        this.f20495H.setOnClickListener(new ViewOnClickListenerC0185b());
        if (getBackground() == null) {
            this.f20479i0 = true;
        }
    }
}
