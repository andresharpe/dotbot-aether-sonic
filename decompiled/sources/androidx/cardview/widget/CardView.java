package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.U;
import k.C2075a;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: L, reason: collision with root package name */
    private static final int[] f6406L = {R.attr.colorBackground};

    /* renamed from: M, reason: collision with root package name */
    private static final e f6407M;

    /* renamed from: E, reason: collision with root package name */
    private boolean f6408E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f6409F;

    /* renamed from: G, reason: collision with root package name */
    int f6410G;

    /* renamed from: H, reason: collision with root package name */
    int f6411H;

    /* renamed from: I, reason: collision with root package name */
    final Rect f6412I;

    /* renamed from: J, reason: collision with root package name */
    final Rect f6413J;

    /* renamed from: K, reason: collision with root package name */
    private final d f6414K;

    /* loaded from: classes.dex */
    class a implements d {

        /* renamed from: a, reason: collision with root package name */
        private Drawable f6415a;

        a() {
        }

        @Override // androidx.cardview.widget.d
        public void a(int i4, int i5, int i6, int i7) {
            CardView.this.f6413J.set(i4, i5, i6, i7);
            CardView cardView = CardView.this;
            Rect rect = cardView.f6412I;
            CardView.super.setPadding(i4 + rect.left, i5 + rect.top, i6 + rect.right, i7 + rect.bottom);
        }

        @Override // androidx.cardview.widget.d
        public void b(int i4, int i5) {
            CardView cardView = CardView.this;
            if (i4 > cardView.f6410G) {
                CardView.super.setMinimumWidth(i4);
            }
            CardView cardView2 = CardView.this;
            if (i5 > cardView2.f6411H) {
                CardView.super.setMinimumHeight(i5);
            }
        }

        @Override // androidx.cardview.widget.d
        public void c(Drawable drawable) {
            this.f6415a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.d
        public boolean d() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.d
        public boolean e() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.d
        public Drawable f() {
            return this.f6415a;
        }

        @Override // androidx.cardview.widget.d
        public View g() {
            return CardView.this;
        }
    }

    static {
        b bVar = new b();
        f6407M = bVar;
        bVar.j();
    }

    public CardView(@N Context context) {
        this(context, null);
    }

    @N
    public ColorStateList getCardBackgroundColor() {
        return f6407M.h(this.f6414K);
    }

    public float getCardElevation() {
        return f6407M.c(this.f6414K);
    }

    @U
    public int getContentPaddingBottom() {
        return this.f6412I.bottom;
    }

    @U
    public int getContentPaddingLeft() {
        return this.f6412I.left;
    }

    @U
    public int getContentPaddingRight() {
        return this.f6412I.right;
    }

    @U
    public int getContentPaddingTop() {
        return this.f6412I.top;
    }

    public float getMaxCardElevation() {
        return f6407M.g(this.f6414K);
    }

    public boolean getPreventCornerOverlap() {
        return this.f6409F;
    }

    public float getRadius() {
        return f6407M.d(this.f6414K);
    }

    public boolean getUseCompatPadding() {
        return this.f6408E;
    }

    public void h(@U int i4, @U int i5, @U int i6, @U int i7) {
        this.f6412I.set(i4, i5, i6, i7);
        f6407M.i(this.f6414K);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i4, int i5) {
        if (!(f6407M instanceof b)) {
            int mode = View.MeasureSpec.getMode(i4);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i4 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.l(this.f6414K)), View.MeasureSpec.getSize(i4)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i5);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i5 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.k(this.f6414K)), View.MeasureSpec.getSize(i5)), mode2);
            }
            super.onMeasure(i4, i5);
            return;
        }
        super.onMeasure(i4, i5);
    }

    public void setCardBackgroundColor(@InterfaceC0569l int i4) {
        f6407M.n(this.f6414K, ColorStateList.valueOf(i4));
    }

    public void setCardElevation(float f4) {
        f6407M.f(this.f6414K, f4);
    }

    public void setMaxCardElevation(float f4) {
        f6407M.o(this.f6414K, f4);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i4) {
        this.f6411H = i4;
        super.setMinimumHeight(i4);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i4) {
        this.f6410G = i4;
        super.setMinimumWidth(i4);
    }

    @Override // android.view.View
    public void setPadding(int i4, int i5, int i6, int i7) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i4, int i5, int i6, int i7) {
    }

    public void setPreventCornerOverlap(boolean z3) {
        if (z3 != this.f6409F) {
            this.f6409F = z3;
            f6407M.m(this.f6414K);
        }
    }

    public void setRadius(float f4) {
        f6407M.b(this.f6414K, f4);
    }

    public void setUseCompatPadding(boolean z3) {
        if (this.f6408E != z3) {
            this.f6408E = z3;
            f6407M.e(this.f6414K);
        }
    }

    public CardView(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, C2075a.C0451a.f51543g);
    }

    public void setCardBackgroundColor(@P ColorStateList colorStateList) {
        f6407M.n(this.f6414K, colorStateList);
    }

    public CardView(@N Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f6412I = rect;
        this.f6413J = new Rect();
        a aVar = new a();
        this.f6414K = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2075a.e.f51560a, i4, C2075a.d.f51557b);
        if (obtainStyledAttributes.hasValue(C2075a.e.f51563d)) {
            valueOf = obtainStyledAttributes.getColorStateList(C2075a.e.f51563d);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f6406L);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(C2075a.b.f51550b);
            } else {
                color = getResources().getColor(C2075a.b.f51549a);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(C2075a.e.f51564e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(C2075a.e.f51565f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(C2075a.e.f51566g, 0.0f);
        this.f6408E = obtainStyledAttributes.getBoolean(C2075a.e.f51568i, false);
        this.f6409F = obtainStyledAttributes.getBoolean(C2075a.e.f51567h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C2075a.e.f51569j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(C2075a.e.f51571l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(C2075a.e.f51573n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(C2075a.e.f51572m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(C2075a.e.f51570k, dimensionPixelSize);
        float f4 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f6410G = obtainStyledAttributes.getDimensionPixelSize(C2075a.e.f51561b, 0);
        this.f6411H = obtainStyledAttributes.getDimensionPixelSize(C2075a.e.f51562c, 0);
        obtainStyledAttributes.recycle();
        f6407M.a(aVar, context, colorStateList, dimension, dimension2, f4);
    }
}
