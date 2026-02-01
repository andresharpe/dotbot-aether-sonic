package com.harman.jbl.partybox.ui.customviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.C0669d;
import androidx.core.view.C0823k0;
import com.harman.jbl.partybox.j;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class HmSegmentedButton extends View {

    /* renamed from: C0, reason: collision with root package name */
    @l3.d
    public static final a f42541C0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    private boolean f42542A0;

    /* renamed from: B0, reason: collision with root package name */
    private boolean f42543B0;

    /* renamed from: E, reason: collision with root package name */
    private Context f42544E;

    /* renamed from: F, reason: collision with root package name */
    private float f42545F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f42546G;

    /* renamed from: H, reason: collision with root package name */
    @l3.e
    private TextPaint f42547H;

    /* renamed from: I, reason: collision with root package name */
    @l3.e
    private StaticLayout f42548I;

    /* renamed from: J, reason: collision with root package name */
    @l3.e
    private StaticLayout f42549J;

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private final Rect f42550K;

    /* renamed from: L, reason: collision with root package name */
    private int f42551L;

    /* renamed from: M, reason: collision with root package name */
    private int f42552M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f42553N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f42554O;

    /* renamed from: P, reason: collision with root package name */
    @l3.e
    private RectF f42555P;

    /* renamed from: Q, reason: collision with root package name */
    @l3.e
    private Paint f42556Q;

    /* renamed from: R, reason: collision with root package name */
    private float f42557R;

    /* renamed from: S, reason: collision with root package name */
    private float f42558S;

    /* renamed from: T, reason: collision with root package name */
    private float f42559T;

    /* renamed from: U, reason: collision with root package name */
    private float f42560U;

    /* renamed from: V, reason: collision with root package name */
    @l3.e
    private PorterDuffColorFilter f42561V;

    /* renamed from: W, reason: collision with root package name */
    @l3.e
    private PorterDuffColorFilter f42562W;

    /* renamed from: a0, reason: collision with root package name */
    @l3.e
    private Drawable f42563a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f42564b0;

    /* renamed from: c0, reason: collision with root package name */
    private int f42565c0;

    /* renamed from: d0, reason: collision with root package name */
    private int f42566d0;

    /* renamed from: e0, reason: collision with root package name */
    private int f42567e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f42568f0;

    /* renamed from: g0, reason: collision with root package name */
    private int f42569g0;

    /* renamed from: h0, reason: collision with root package name */
    private int f42570h0;

    /* renamed from: i0, reason: collision with root package name */
    private int f42571i0;

    /* renamed from: j0, reason: collision with root package name */
    private int f42572j0;

    /* renamed from: k0, reason: collision with root package name */
    private int f42573k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f42574l0;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f42575m0;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f42576n0;

    /* renamed from: o0, reason: collision with root package name */
    private boolean f42577o0;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f42578p0;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f42579q0;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f42580r0;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f42581s0;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f42582t0;

    /* renamed from: u0, reason: collision with root package name */
    private float f42583u0;

    /* renamed from: v0, reason: collision with root package name */
    private float f42584v0;

    /* renamed from: w0, reason: collision with root package name */
    @l3.e
    private String f42585w0;

    /* renamed from: x0, reason: collision with root package name */
    @l3.e
    private String f42586x0;

    /* renamed from: y0, reason: collision with root package name */
    @l3.e
    private Typeface f42587y0;

    /* renamed from: z0, reason: collision with root package name */
    @l3.e
    private DrawableGravity f42588z0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0011\u0010\b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/harman/jbl/partybox/ui/customviews/HmSegmentedButton$DrawableGravity;", "", "", "intValue", "I", "", "g", "()Z", "isHorizontal", "<init>", "(Ljava/lang/String;II)V", "Companion", "a", "LEFT", "TOP", "RIGHT", "BOTTOM", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class DrawableGravity {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ DrawableGravity[] $VALUES;

        @l3.d
        public static final a Companion;
        private final int intValue;
        public static final DrawableGravity LEFT = new DrawableGravity("LEFT", 0, 0);
        public static final DrawableGravity TOP = new DrawableGravity("TOP", 1, 1);
        public static final DrawableGravity RIGHT = new DrawableGravity("RIGHT", 2, 2);
        public static final DrawableGravity BOTTOM = new DrawableGravity("BOTTOM", 3, 3);

        /* loaded from: classes2.dex */
        public static final class a {
            public /* synthetic */ a(C2197u c2197u) {
                this();
            }

            @l3.e
            public final DrawableGravity a(int i4) {
                for (DrawableGravity drawableGravity : DrawableGravity.values()) {
                    if (drawableGravity.intValue == i4) {
                        return drawableGravity;
                    }
                }
                return null;
            }

            private a() {
            }
        }

        static {
            DrawableGravity[] b4 = b();
            $VALUES = b4;
            $ENTRIES = kotlin.enums.c.c(b4);
            Companion = new a(null);
        }

        private DrawableGravity(String str, int i4, int i5) {
            this.intValue = i5;
        }

        private static final /* synthetic */ DrawableGravity[] b() {
            return new DrawableGravity[]{LEFT, TOP, RIGHT, BOTTOM};
        }

        @l3.d
        public static kotlin.enums.a<DrawableGravity> f() {
            return $ENTRIES;
        }

        public static DrawableGravity valueOf(String str) {
            return (DrawableGravity) Enum.valueOf(DrawableGravity.class, str);
        }

        public static DrawableGravity[] values() {
            return (DrawableGravity[]) $VALUES.clone();
        }

        public final boolean g() {
            int i4 = this.intValue;
            if (i4 != 0 && i4 != 2) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        public final float a(@l3.d Context context, int i4) {
            F.p(context, "context");
            return i4 * context.getResources().getDisplayMetrics().scaledDensity;
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HmSegmentedButton(@l3.d Context context) {
        super(context);
        F.p(context, "context");
        this.f42550K = new Rect();
        h(context, null);
    }

    private final void a(int i4, int i5) {
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        if (this.f42543B0) {
            StaticLayout staticLayout = this.f42548I;
            F.m(staticLayout);
            f4 = staticLayout.getHeight();
            StaticLayout staticLayout2 = this.f42548I;
            F.m(staticLayout2);
            f5 = staticLayout2.getWidth();
            f6 = this.f42550K.width();
        } else {
            f4 = 0.0f;
            f5 = 0.0f;
            f6 = 0.0f;
        }
        if (this.f42542A0) {
            Drawable drawable = this.f42563a0;
            F.m(drawable);
            f7 = drawable.getIntrinsicHeight();
            Drawable drawable2 = this.f42563a0;
            F.m(drawable2);
            f8 = drawable2.getIntrinsicWidth();
        } else {
            f7 = 0.0f;
            f8 = 0.0f;
        }
        DrawableGravity drawableGravity = this.f42588z0;
        F.m(drawableGravity);
        if (drawableGravity.g()) {
            float f9 = i5;
            if (f9 > Math.max(f4, f7)) {
                float f10 = f9 / 2.0f;
                this.f42558S = ((f10 - (f4 / 2.0f)) + getPaddingTop()) - getPaddingBottom();
                this.f42560U = ((f10 - (f7 / 2.0f)) + getPaddingTop()) - getPaddingBottom();
            } else if (f4 > f7) {
                float paddingTop = getPaddingTop();
                this.f42558S = paddingTop;
                this.f42560U = (paddingTop + (f4 / 2.0f)) - (f7 / 2.0f);
            } else {
                float paddingTop2 = getPaddingTop();
                this.f42560U = paddingTop2;
                this.f42558S = (paddingTop2 + (f7 / 2.0f)) - (f4 / 2.0f);
            }
            this.f42557R = getPaddingLeft();
            this.f42559T = f5;
            float f11 = i4 - (f6 + f8);
            if (f11 > 0.0f) {
                f11 /= 2.0f;
            }
            DrawableGravity drawableGravity2 = this.f42588z0;
            if (drawableGravity2 == DrawableGravity.RIGHT) {
                int i6 = this.f42573k0;
                float paddingLeft = ((f11 + getPaddingLeft()) - getPaddingRight()) - (i6 / 2.0f);
                this.f42557R = paddingLeft;
                this.f42559T = paddingLeft + f6 + i6;
                return;
            }
            if (drawableGravity2 == DrawableGravity.LEFT) {
                int i7 = this.f42573k0;
                float paddingLeft2 = ((f11 + getPaddingLeft()) - getPaddingRight()) - (i7 / 2.0f);
                this.f42559T = paddingLeft2;
                this.f42557R = paddingLeft2 + f8 + i7;
                return;
            }
            return;
        }
        DrawableGravity drawableGravity3 = this.f42588z0;
        if (drawableGravity3 == DrawableGravity.TOP) {
            int i8 = this.f42573k0;
            float paddingTop3 = (getPaddingTop() - getPaddingBottom()) - (i8 / 2.0f);
            this.f42560U = paddingTop3;
            float f12 = (i5 - (f4 + f7)) / 2.0f;
            if (f12 > 0.0f) {
                this.f42560U = paddingTop3 + f12;
            }
            this.f42558S = this.f42560U + f7 + i8;
        } else if (drawableGravity3 == DrawableGravity.BOTTOM) {
            int i9 = this.f42573k0;
            float paddingTop4 = (getPaddingTop() - getPaddingBottom()) - (i9 / 2.0f);
            this.f42558S = paddingTop4;
            float f13 = i5 - (f7 + f4);
            if (f13 > 0.0f) {
                this.f42558S = paddingTop4 + (f13 / 2.0f);
            }
            this.f42560U = this.f42558S + f4 + i9;
        }
        float f14 = i4;
        if (f14 > Math.max(f6, f8)) {
            float f15 = f14 / 2.0f;
            this.f42557R = ((f15 - (f6 / 2.0f)) + getPaddingLeft()) - getPaddingRight();
            this.f42559T = ((f15 - (f8 / 2.0f)) + getPaddingLeft()) - getPaddingRight();
        } else if (f6 > f8) {
            float paddingLeft3 = getPaddingLeft();
            this.f42557R = paddingLeft3;
            this.f42559T = (paddingLeft3 + (f6 / 2.0f)) - (f8 / 2.0f);
        } else {
            float paddingLeft4 = getPaddingLeft();
            this.f42559T = paddingLeft4;
            this.f42557R = (paddingLeft4 + (f8 / 2.0f)) - (f6 / 2.0f);
        }
    }

    private final void d(Canvas canvas, ColorFilter colorFilter) {
        int i4 = (int) this.f42559T;
        int i5 = (int) this.f42560U;
        Drawable drawable = this.f42563a0;
        F.m(drawable);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (this.f42579q0) {
            intrinsicWidth = this.f42571i0;
        }
        Drawable drawable2 = this.f42563a0;
        F.m(drawable2);
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        if (this.f42580r0) {
            intrinsicHeight = this.f42572j0;
        }
        Drawable drawable3 = this.f42563a0;
        F.m(drawable3);
        drawable3.setColorFilter(colorFilter);
        Drawable drawable4 = this.f42563a0;
        F.m(drawable4);
        drawable4.setBounds(i4, i5, intrinsicWidth + i4, intrinsicHeight + i5);
        Drawable drawable5 = this.f42563a0;
        F.m(drawable5);
        drawable5.draw(canvas);
    }

    private final void e(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.o.f42020y0);
        F.o(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f42564b0 = obtainStyledAttributes.getColor(j.o.f41922I0, -1);
        this.f42578p0 = obtainStyledAttributes.hasValue(j.o.f41922I0);
        this.f42565c0 = obtainStyledAttributes.getColor(j.o.f41932N0, -1);
        this.f42574l0 = obtainStyledAttributes.hasValue(j.o.f41932N0);
        this.f42567e0 = obtainStyledAttributes.getColor(j.o.f41926K0, 0);
        this.f42575m0 = obtainStyledAttributes.hasValue(j.o.f41926K0);
        this.f42586x0 = obtainStyledAttributes.getString(j.o.f41928L0);
        this.f42543B0 = obtainStyledAttributes.hasValue(j.o.f41928L0);
        int i4 = j.o.f41938Q0;
        a aVar = f42541C0;
        Context context = getContext();
        F.o(context, "getContext(...)");
        this.f42584v0 = obtainStyledAttributes.getDimension(i4, aVar.a(context, 14));
        this.f42566d0 = obtainStyledAttributes.getColor(j.o.f41930M0, -7829368);
        this.f42585w0 = obtainStyledAttributes.getString(j.o.f41944T0);
        this.f42582t0 = obtainStyledAttributes.hasValue(j.o.f41944T0);
        boolean z3 = true;
        int i5 = obtainStyledAttributes.getInt(j.o.f41942S0, 1);
        Typeface typeface = Typeface.DEFAULT;
        if (i5 == 0 || i5 == 1 || i5 == 2 || i5 == 3) {
            this.f42587y0 = typeface;
        }
        try {
            this.f42577o0 = obtainStyledAttributes.hasValue(j.o.f41908B0);
            this.f42583u0 = obtainStyledAttributes.getFloat(j.o.f41908B0, 0.0f);
            this.f42568f0 = obtainStyledAttributes.getDimensionPixelSize(j.o.f42022z0, 0);
        } catch (Exception unused) {
            this.f42577o0 = true;
            this.f42583u0 = 1.0f;
        }
        if (this.f42577o0 || this.f42568f0 <= 0) {
            z3 = false;
        }
        this.f42576n0 = z3;
        this.f42569g0 = obtainStyledAttributes.getResourceId(j.o.f41910C0, 0);
        this.f42570h0 = obtainStyledAttributes.getColor(j.o.f41920H0, -1);
        this.f42571i0 = obtainStyledAttributes.getDimensionPixelSize(j.o.f41924J0, -1);
        this.f42572j0 = obtainStyledAttributes.getDimensionPixelSize(j.o.f41914E0, -1);
        this.f42573k0 = obtainStyledAttributes.getDimensionPixelSize(j.o.f41918G0, 0);
        this.f42542A0 = obtainStyledAttributes.hasValue(j.o.f41910C0);
        this.f42581s0 = obtainStyledAttributes.hasValue(j.o.f41920H0);
        this.f42579q0 = obtainStyledAttributes.hasValue(j.o.f41924J0);
        this.f42580r0 = obtainStyledAttributes.hasValue(j.o.f41914E0);
        this.f42588z0 = DrawableGravity.Companion.a(obtainStyledAttributes.getInteger(j.o.f41912D0, 0));
        obtainStyledAttributes.recycle();
    }

    private final void h(Context context, AttributeSet attributeSet) {
        this.f42544E = context;
        e(attributeSet);
        j();
        i();
        this.f42555P = new RectF();
        Paint paint = new Paint();
        this.f42556Q = paint;
        F.m(paint);
        paint.setColor(C0823k0.f13589t);
        Paint paint2 = this.f42556Q;
        F.m(paint2);
        paint2.setAntiAlias(true);
    }

    private final void i() {
        if (this.f42542A0) {
            Context context = this.f42544E;
            if (context == null) {
                F.S("context1");
                context = null;
            }
            this.f42563a0 = C0669d.i(context, this.f42569g0);
        }
        if (this.f42581s0) {
            this.f42561V = new PorterDuffColorFilter(this.f42570h0, PorterDuff.Mode.SRC_IN);
        }
        if (this.f42578p0) {
            this.f42562W = new PorterDuffColorFilter(this.f42564b0, PorterDuff.Mode.SRC_IN);
        }
    }

    private final void j() {
        if (!this.f42543B0) {
            return;
        }
        TextPaint textPaint = new TextPaint();
        this.f42547H = textPaint;
        F.m(textPaint);
        textPaint.setAntiAlias(true);
        TextPaint textPaint2 = this.f42547H;
        F.m(textPaint2);
        textPaint2.setTextSize(this.f42584v0);
        TextPaint textPaint3 = this.f42547H;
        F.m(textPaint3);
        textPaint3.setColor(this.f42566d0);
        if (this.f42582t0) {
            setTypeface(this.f42585w0);
        } else {
            Typeface typeface = this.f42587y0;
            if (typeface != null) {
                F.m(typeface);
                setTypeface(typeface);
            }
        }
        TextPaint textPaint4 = this.f42547H;
        F.m(textPaint4);
        int measureText = (int) textPaint4.measureText(this.f42586x0);
        setStaticLayout(measureText);
        setStaticLayoutOverLay(measureText);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void k(int r3) {
        /*
            r2 = this;
            boolean r0 = r2.f42543B0
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r2.f42542A0
            if (r0 == 0) goto L1e
            com.harman.jbl.partybox.ui.customviews.HmSegmentedButton$DrawableGravity r0 = r2.f42588z0
            kotlin.jvm.internal.F.m(r0)
            boolean r0 = r0.g()
            if (r0 == 0) goto L1e
            android.graphics.drawable.Drawable r0 = r2.f42563a0
            kotlin.jvm.internal.F.m(r0)
            int r0 = r0.getIntrinsicWidth()
            goto L1f
        L1e:
            r0 = 0
        L1f:
            int r1 = r2.getPaddingLeft()
            int r0 = r0 + r1
            int r1 = r2.getPaddingRight()
            int r0 = r0 + r1
            int r3 = r3 - r0
            if (r3 >= 0) goto L2d
            return
        L2d:
            r2.setStaticLayout(r3)
            r2.setStaticLayoutOverLay(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.customviews.HmSegmentedButton.k(int):void");
    }

    private final void setStaticLayout(int i4) {
        StaticLayout.Builder builder;
        String str = this.f42586x0;
        StaticLayout staticLayout = null;
        if (str != null) {
            TextPaint textPaint = this.f42547H;
            F.m(textPaint);
            builder = StaticLayout.Builder.obtain(str, 0, 0, textPaint, i4).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(false);
        } else {
            builder = null;
        }
        if (builder != null) {
            staticLayout = builder.build();
        }
        this.f42548I = staticLayout;
    }

    private final void setStaticLayoutOverLay(int i4) {
        StaticLayout.Builder builder;
        String str = this.f42586x0;
        StaticLayout staticLayout = null;
        if (str != null) {
            TextPaint textPaint = this.f42547H;
            F.m(textPaint);
            builder = StaticLayout.Builder.obtain(str, 0, 0, textPaint, i4).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(false);
        } else {
            builder = null;
        }
        if (builder != null) {
            staticLayout = builder.build();
        }
        this.f42549J = staticLayout;
    }

    public final void b(float f4) {
        this.f42546G = false;
        this.f42545F = 1.0f - f4;
        invalidate();
    }

    public final void c(float f4) {
        this.f42546G = true;
        this.f42545F = f4;
        invalidate();
    }

    public final void f(boolean z3) {
        this.f42553N = z3;
    }

    public final void g(boolean z3) {
        this.f42554O = z3;
    }

    @Override // android.view.View
    protected void onDraw(@l3.d Canvas canvas) {
        int i4;
        int i5;
        F.p(canvas, "canvas");
        super.onDraw(canvas);
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        canvas.save();
        if (this.f42546G) {
            canvas.translate((-width) * (this.f42545F - 1), 0.0f);
        } else {
            canvas.translate(width * (this.f42545F - 1), 0.0f);
        }
        RectF rectF = this.f42555P;
        F.m(rectF);
        if (this.f42553N) {
            i4 = this.f42552M;
        } else {
            i4 = 0;
        }
        float f4 = i4;
        int i6 = this.f42552M;
        float f5 = i6;
        if (this.f42554O) {
            i5 = width - i6;
        } else {
            i5 = width;
        }
        rectF.set(f4, f5, i5, height - i6);
        RectF rectF2 = this.f42555P;
        F.m(rectF2);
        int i7 = this.f42551L;
        Paint paint = this.f42556Q;
        F.m(paint);
        canvas.drawRoundRect(rectF2, i7, i7, paint);
        canvas.restore();
        canvas.save();
        if (this.f42543B0) {
            canvas.translate(this.f42557R, this.f42558S);
            if (this.f42574l0) {
                TextPaint textPaint = this.f42547H;
                F.m(textPaint);
                textPaint.setColor(this.f42566d0);
            }
            StaticLayout staticLayout = this.f42548I;
            F.m(staticLayout);
            staticLayout.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        if (this.f42542A0) {
            d(canvas, this.f42561V);
        }
        if (this.f42546G) {
            float f6 = width;
            canvas.clipRect((1 - this.f42545F) * f6, 0.0f, f6, height);
        } else {
            canvas.clipRect(0.0f, 0.0f, width * this.f42545F, height);
        }
        canvas.save();
        if (this.f42543B0) {
            canvas.translate(this.f42557R, this.f42558S);
            if (this.f42574l0) {
                TextPaint textPaint2 = this.f42547H;
                F.m(textPaint2);
                textPaint2.setColor(this.f42565c0);
            }
            StaticLayout staticLayout2 = this.f42549J;
            F.m(staticLayout2);
            staticLayout2.draw(canvas);
            canvas.restore();
        }
        if (this.f42542A0) {
            d(canvas, this.f42562W);
        }
        canvas.restore();
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int max;
        int i10;
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        if (this.f42542A0) {
            Drawable drawable = this.f42563a0;
            F.m(drawable);
            i6 = drawable.getIntrinsicWidth();
        } else {
            i6 = 0;
        }
        if (this.f42543B0) {
            StaticLayout staticLayout = this.f42548I;
            F.m(staticLayout);
            i7 = staticLayout.getWidth();
        } else {
            i7 = 0;
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f42542A0) {
            Drawable drawable2 = this.f42563a0;
            F.m(drawable2);
            i8 = drawable2.getIntrinsicHeight();
        } else {
            i8 = 0;
        }
        if (this.f42543B0) {
            StaticLayout staticLayout2 = this.f42548I;
            F.m(staticLayout2);
            i9 = staticLayout2.getHeight();
        } else {
            i9 = 0;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && size > 0) {
                    k(size);
                } else {
                    size = 0;
                }
            } else {
                size = i7 + i6;
            }
        } else {
            DrawableGravity drawableGravity = this.f42588z0;
            F.m(drawableGravity);
            if (drawableGravity.g()) {
                max = i7 + i6 + this.f42573k0;
            } else {
                max = Math.max(i6, i7);
            }
            size = (getPaddingLeft() * 2) + (getPaddingRight() * 2) + max;
        }
        if (this.f42543B0) {
            TextPaint textPaint = this.f42547H;
            F.m(textPaint);
            String str = this.f42586x0;
            F.m(str);
            textPaint.getTextBounds(str, 0, str.length(), this.f42550K);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 1073741824) {
                size2 = paddingTop;
            } else {
                DrawableGravity drawableGravity2 = this.f42588z0;
                F.m(drawableGravity2);
                if (drawableGravity2.g()) {
                    int max2 = Math.max(i9, i8) + getPaddingTop() + getPaddingBottom();
                    if (size2 < max2) {
                        size2 = max2;
                    }
                } else {
                    int paddingTop2 = i9 + i8 + getPaddingTop() + getPaddingBottom();
                    if (size2 < paddingTop2) {
                        size2 = paddingTop2;
                    } else {
                        size2 = (size2 + getPaddingTop()) - getPaddingBottom();
                    }
                }
            }
        } else {
            DrawableGravity drawableGravity3 = this.f42588z0;
            F.m(drawableGravity3);
            if (drawableGravity3.g()) {
                i10 = Math.max(i9, i8);
            } else {
                i10 = this.f42573k0 + i9 + i8;
            }
            size2 = i10 + (getPaddingTop() * 2) + (getPaddingBottom() * 2);
        }
        a(size, size2);
        setMeasuredDimension(size, size2);
    }

    public final void setBorderSize$JBL_Partybox_3_12_20_release_2025_09_15_11_35_release(int i4) {
        this.f42552M = i4;
    }

    public final void setDrawable(int i4) {
        Context context = this.f42544E;
        if (context == null) {
            F.S("context1");
            context = null;
        }
        Drawable i5 = C0669d.i(context, i4);
        F.m(i5);
        setDrawable(i5);
    }

    public final void setGravity(@l3.d DrawableGravity gravity) {
        F.p(gravity, "gravity");
        this.f42588z0 = gravity;
    }

    public final void setSelectorColor$JBL_Partybox_3_12_20_release_2025_09_15_11_35_release(int i4) {
        Paint paint = this.f42556Q;
        F.m(paint);
        paint.setColor(i4);
    }

    public final void setSelectorRadius$JBL_Partybox_3_12_20_release_2025_09_15_11_35_release(int i4) {
        this.f42551L = i4;
    }

    public final void setTypeface(@l3.d Typeface typeface) {
        F.p(typeface, "typeface");
        TextPaint textPaint = this.f42547H;
        F.m(textPaint);
        textPaint.setTypeface(typeface);
    }

    public final void setDrawable(@l3.d Drawable drawable) {
        F.p(drawable, "drawable");
        this.f42563a0 = drawable;
        this.f42542A0 = true;
        requestLayout();
    }

    public final void setTypeface(@l3.e String str) {
        if (str == null || F.g(str, "")) {
            return;
        }
        Typeface createFromAsset = Typeface.createFromAsset(getContext().getAssets(), str);
        TextPaint textPaint = this.f42547H;
        F.m(textPaint);
        textPaint.setTypeface(createFromAsset);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HmSegmentedButton(@l3.d Context context, @l3.d AttributeSet attrs) {
        super(context, attrs);
        F.p(context, "context");
        F.p(attrs, "attrs");
        this.f42550K = new Rect();
        h(context, attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HmSegmentedButton(@l3.d Context context, @l3.d AttributeSet attrs, int i4) {
        super(context, attrs, i4);
        F.p(context, "context");
        F.p(attrs, "attrs");
        this.f42550K = new Rect();
        h(context, attrs);
    }
}
