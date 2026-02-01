package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.core.view.C0823k0;
import androidx.core.widget.r;
import androidx.viewpager.widget.d;
import java.lang.ref.WeakReference;
import java.util.Locale;

@d.e
/* loaded from: classes.dex */
public class c extends ViewGroup {

    /* renamed from: S, reason: collision with root package name */
    private static final int[] f20488S = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};

    /* renamed from: T, reason: collision with root package name */
    private static final int[] f20489T = {R.attr.textAllCaps};

    /* renamed from: U, reason: collision with root package name */
    private static final float f20490U = 0.6f;

    /* renamed from: V, reason: collision with root package name */
    private static final int f20491V = 16;

    /* renamed from: E, reason: collision with root package name */
    d f20492E;

    /* renamed from: F, reason: collision with root package name */
    TextView f20493F;

    /* renamed from: G, reason: collision with root package name */
    TextView f20494G;

    /* renamed from: H, reason: collision with root package name */
    TextView f20495H;

    /* renamed from: I, reason: collision with root package name */
    private int f20496I;

    /* renamed from: J, reason: collision with root package name */
    float f20497J;

    /* renamed from: K, reason: collision with root package name */
    private int f20498K;

    /* renamed from: L, reason: collision with root package name */
    private int f20499L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f20500M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f20501N;

    /* renamed from: O, reason: collision with root package name */
    private final a f20502O;

    /* renamed from: P, reason: collision with root package name */
    private WeakReference<androidx.viewpager.widget.a> f20503P;

    /* renamed from: Q, reason: collision with root package name */
    private int f20504Q;

    /* renamed from: R, reason: collision with root package name */
    int f20505R;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends DataSetObserver implements d.j, d.i {

        /* renamed from: a, reason: collision with root package name */
        private int f20506a;

        a() {
        }

        @Override // androidx.viewpager.widget.d.j
        public void a(int i4, float f4, int i5) {
            if (f4 > 0.5f) {
                i4++;
            }
            c.this.d(i4, f4, false);
        }

        @Override // androidx.viewpager.widget.d.i
        public void b(d dVar, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
            c.this.b(aVar, aVar2);
        }

        @Override // androidx.viewpager.widget.d.j
        public void c(int i4) {
            this.f20506a = i4;
        }

        @Override // androidx.viewpager.widget.d.j
        public void d(int i4) {
            if (this.f20506a == 0) {
                c cVar = c.this;
                cVar.c(cVar.f20492E.getCurrentItem(), c.this.f20492E.getAdapter());
                c cVar2 = c.this;
                float f4 = cVar2.f20497J;
                if (f4 < 0.0f) {
                    f4 = 0.0f;
                }
                cVar2.d(cVar2.f20492E.getCurrentItem(), f4, true);
            }
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            c cVar = c.this;
            cVar.c(cVar.f20492E.getCurrentItem(), c.this.f20492E.getAdapter());
            c cVar2 = c.this;
            float f4 = cVar2.f20497J;
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            cVar2.d(cVar2.f20492E.getCurrentItem(), f4, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends SingleLineTransformationMethod {

        /* renamed from: a, reason: collision with root package name */
        private Locale f20508a;

        b(Context context) {
            this.f20508a = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f20508a);
            }
            return null;
        }
    }

    public c(@N Context context) {
        this(context, null);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new b(textView.getContext()));
    }

    public void a(int i4, float f4) {
        this.f20493F.setTextSize(i4, f4);
        this.f20494G.setTextSize(i4, f4);
        this.f20495H.setTextSize(i4, f4);
    }

    void b(androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
        if (aVar != null) {
            aVar.u(this.f20502O);
            this.f20503P = null;
        }
        if (aVar2 != null) {
            aVar2.m(this.f20502O);
            this.f20503P = new WeakReference<>(aVar2);
        }
        d dVar = this.f20492E;
        if (dVar != null) {
            this.f20496I = -1;
            this.f20497J = -1.0f;
            c(dVar.getCurrentItem(), aVar2);
            requestLayout();
        }
    }

    void c(int i4, androidx.viewpager.widget.a aVar) {
        int i5;
        CharSequence charSequence;
        CharSequence charSequence2;
        if (aVar != null) {
            i5 = aVar.e();
        } else {
            i5 = 0;
        }
        this.f20500M = true;
        CharSequence charSequence3 = null;
        if (i4 >= 1 && aVar != null) {
            charSequence = aVar.g(i4 - 1);
        } else {
            charSequence = null;
        }
        this.f20493F.setText(charSequence);
        TextView textView = this.f20494G;
        if (aVar != null && i4 < i5) {
            charSequence2 = aVar.g(i4);
        } else {
            charSequence2 = null;
        }
        textView.setText(charSequence2);
        int i6 = i4 + 1;
        if (i6 < i5 && aVar != null) {
            charSequence3 = aVar.g(i6);
        }
        this.f20495H.setText(charSequence3);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f20493F.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f20494G.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f20495H.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f20496I = i4;
        if (!this.f20501N) {
            d(i4, this.f20497J, false);
        }
        this.f20500M = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(int i4, float f4, boolean z3) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (i4 != this.f20496I) {
            c(i4, this.f20492E.getAdapter());
        } else if (!z3 && f4 == this.f20497J) {
            return;
        }
        this.f20501N = true;
        int measuredWidth = this.f20493F.getMeasuredWidth();
        int measuredWidth2 = this.f20494G.getMeasuredWidth();
        int measuredWidth3 = this.f20495H.getMeasuredWidth();
        int i9 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i10 = paddingRight + i9;
        int i11 = (width - (paddingLeft + i9)) - i10;
        float f5 = 0.5f + f4;
        if (f5 > 1.0f) {
            f5 -= 1.0f;
        }
        int i12 = ((width - i10) - ((int) (i11 * f5))) - i9;
        int i13 = measuredWidth2 + i12;
        int baseline = this.f20493F.getBaseline();
        int baseline2 = this.f20494G.getBaseline();
        int baseline3 = this.f20495H.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i14 = max - baseline;
        int i15 = max - baseline2;
        int i16 = max - baseline3;
        int max2 = Math.max(Math.max(this.f20493F.getMeasuredHeight() + i14, this.f20494G.getMeasuredHeight() + i15), this.f20495H.getMeasuredHeight() + i16);
        int i17 = this.f20499L & 112;
        if (i17 != 16) {
            if (i17 != 80) {
                i6 = i14 + paddingTop;
                i7 = i15 + paddingTop;
                i8 = paddingTop + i16;
                TextView textView = this.f20494G;
                textView.layout(i12, i7, i13, textView.getMeasuredHeight() + i7);
                int min = Math.min(paddingLeft, (i12 - this.f20498K) - measuredWidth);
                TextView textView2 = this.f20493F;
                textView2.layout(min, i6, measuredWidth + min, textView2.getMeasuredHeight() + i6);
                int max3 = Math.max((width - paddingRight) - measuredWidth3, i13 + this.f20498K);
                TextView textView3 = this.f20495H;
                textView3.layout(max3, i8, max3 + measuredWidth3, textView3.getMeasuredHeight() + i8);
                this.f20497J = f4;
                this.f20501N = false;
            }
            i5 = (height - paddingBottom) - max2;
        } else {
            i5 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        }
        i6 = i14 + i5;
        i7 = i15 + i5;
        i8 = i5 + i16;
        TextView textView4 = this.f20494G;
        textView4.layout(i12, i7, i13, textView4.getMeasuredHeight() + i7);
        int min2 = Math.min(paddingLeft, (i12 - this.f20498K) - measuredWidth);
        TextView textView22 = this.f20493F;
        textView22.layout(min2, i6, measuredWidth + min2, textView22.getMeasuredHeight() + i6);
        int max32 = Math.max((width - paddingRight) - measuredWidth3, i13 + this.f20498K);
        TextView textView32 = this.f20495H;
        textView32.layout(max32, i8, max32 + measuredWidth3, textView32.getMeasuredHeight() + i8);
        this.f20497J = f4;
        this.f20501N = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f20498K;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        androidx.viewpager.widget.a aVar;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof d) {
            d dVar = (d) parent;
            androidx.viewpager.widget.a adapter = dVar.getAdapter();
            dVar.V(this.f20502O);
            dVar.b(this.f20502O);
            this.f20492E = dVar;
            WeakReference<androidx.viewpager.widget.a> weakReference = this.f20503P;
            if (weakReference != null) {
                aVar = weakReference.get();
            } else {
                aVar = null;
            }
            b(aVar, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d dVar = this.f20492E;
        if (dVar != null) {
            b(dVar.getAdapter(), null);
            this.f20492E.V(null);
            this.f20492E.N(this.f20502O);
            this.f20492E = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        if (this.f20492E != null) {
            float f4 = this.f20497J;
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            d(this.f20496I, f4, true);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int max;
        if (View.MeasureSpec.getMode(i4) == 1073741824) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, paddingTop, -2);
            int size = View.MeasureSpec.getSize(i4);
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, (int) (size * 0.2f), -2);
            this.f20493F.measure(childMeasureSpec2, childMeasureSpec);
            this.f20494G.measure(childMeasureSpec2, childMeasureSpec);
            this.f20495H.measure(childMeasureSpec2, childMeasureSpec);
            if (View.MeasureSpec.getMode(i5) == 1073741824) {
                max = View.MeasureSpec.getSize(i5);
            } else {
                max = Math.max(getMinHeight(), this.f20494G.getMeasuredHeight() + paddingTop);
            }
            setMeasuredDimension(size, View.resolveSizeAndState(max, i5, this.f20494G.getMeasuredState() << 16));
            return;
        }
        throw new IllegalStateException("Must measure with an exact width");
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.f20500M) {
            super.requestLayout();
        }
    }

    public void setGravity(int i4) {
        this.f20499L = i4;
        requestLayout();
    }

    public void setNonPrimaryAlpha(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        int i4 = ((int) (f4 * 255.0f)) & 255;
        this.f20504Q = i4;
        int i5 = (i4 << 24) | (this.f20505R & C0823k0.f13588s);
        this.f20493F.setTextColor(i5);
        this.f20495H.setTextColor(i5);
    }

    public void setTextColor(@InterfaceC0569l int i4) {
        this.f20505R = i4;
        this.f20494G.setTextColor(i4);
        int i5 = (this.f20504Q << 24) | (this.f20505R & C0823k0.f13588s);
        this.f20493F.setTextColor(i5);
        this.f20495H.setTextColor(i5);
    }

    public void setTextSpacing(int i4) {
        this.f20498K = i4;
        requestLayout();
    }

    public c(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20496I = -1;
        this.f20497J = -1.0f;
        this.f20502O = new a();
        TextView textView = new TextView(context);
        this.f20493F = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f20494G = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f20495H = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f20488S);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            r.E(this.f20493F, resourceId);
            r.E(this.f20494G, resourceId);
            r.E(this.f20495H, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            a(0, dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.f20493F.setTextColor(color);
            this.f20494G.setTextColor(color);
            this.f20495H.setTextColor(color);
        }
        this.f20499L = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.f20505R = this.f20494G.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(f20490U);
        TextView textView4 = this.f20493F;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView4.setEllipsize(truncateAt);
        this.f20494G.setEllipsize(truncateAt);
        this.f20495H.setEllipsize(truncateAt);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f20489T);
            boolean z3 = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
            if (z3) {
                setSingleLineAllCaps(this.f20493F);
                setSingleLineAllCaps(this.f20494G);
                setSingleLineAllCaps(this.f20495H);
                this.f20498K = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
            }
        }
        this.f20493F.setSingleLine();
        this.f20494G.setSingleLine();
        this.f20495H.setSingleLine();
        this.f20498K = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}
