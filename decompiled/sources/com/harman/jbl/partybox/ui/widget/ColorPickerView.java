package com.harman.jbl.partybox.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.core.content.C0669d;
import androidx.core.view.C0823k0;
import androidx.core.view.D;
import com.harman.jbl.partybox.j;
import com.harman.sdk.utils.Color;
import kotlin.E;
import kotlin.H0;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import o.InterfaceMenuC2377a;

@E(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010w\u001a\u00020v\u0012\n\b\u0002\u0010y\u001a\u0004\u0018\u00010x¢\u0006\u0004\bz\u0010{J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0015H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0015H\u0002¢\u0006\u0004\b$\u0010\"J\u0017\u0010&\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0002¢\u0006\u0004\b&\u0010\"J\u0015\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J!\u0010,\u001a\u00020\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00040+¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0004¢\u0006\u0004\b.\u0010\u0014J\u001f\u00102\u001a\u00020\u00042\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/H\u0014¢\u0006\u0004\b2\u00103J/\u00108\u001a\u00020\u00042\u0006\u00104\u001a\u00020/2\u0006\u00105\u001a\u00020/2\u0006\u00106\u001a\u00020/2\u0006\u00107\u001a\u00020/H\u0014¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b:\u0010\u0006J\u0017\u0010;\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u001dH\u0016¢\u0006\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010AR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010GR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010P\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010MR\u0014\u0010R\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010MR\u0014\u0010V\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010LR\u0016\u0010Z\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010LR\u0016\u0010\\\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010LR\u0016\u0010^\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010CR\u0016\u0010`\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010CR\u0016\u0010b\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010CR\u0016\u0010d\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010CR\u0016\u0010f\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010CR\u0014\u0010h\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010CR\u0016\u0010j\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010CR$\u0010m\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010p\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR$\u0010q\u001a\u00020/2\u0006\u0010q\u001a\u00020/8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\br\u0010s\"\u0004\bt\u0010u¨\u0006|"}, d2 = {"Lcom/harman/jbl/partybox/ui/widget/ColorPickerView;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "Lkotlin/H0;", "e", "(Landroid/graphics/Canvas;)V", "d", "f", "h", "g", "c", "Landroid/view/MotionEvent;", "event", "k", "(Landroid/view/MotionEvent;)V", "l", "q", "a", "i", "()V", "", "hue", "saturation", "n", "(FF)V", "lastEvent", "initialX", "initialY", "", "j", "(Landroid/view/MotionEvent;FF)Z", "degrees", "p", "(F)F", "radians", "o", "dp", com.harman.log.b.f47574c, "Lcom/harman/sdk/utils/Color;", v.b.f7402d, "setColor", "(Lcom/harman/sdk/utils/Color;)V", "Lkotlin/Function1;", "setListener", "(LX2/l;)V", "m", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "width", "height", "oldWidth", "oldHeight", "onSizeChanged", "(IIII)V", "onDraw", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "performClick", "()Z", "", androidx.exifinterface.media.a.U4, "[I", "hueColors", "F", "saturationColors", "Landroid/graphics/drawable/GradientDrawable;", "G", "Landroid/graphics/drawable/GradientDrawable;", "hueGradient", "H", "saturationGradient", "Landroid/graphics/Paint;", "I", "Landroid/graphics/Paint;", "pickerBorderPaint", "J", "thumbBorderPaint", "K", "colorPaint", "", "L", "[F", "hsv", "M", "wheelCenterX", "N", "wheelCenterY", "O", "wheelRadius", "P", "borderRadius", "Q", "downX", "R", "downY", androidx.exifinterface.media.a.T4, "thumbXCoordinate", androidx.exifinterface.media.a.f5, "thumbYCoordinate", "U", "thumbRadius", androidx.exifinterface.media.a.Z4, "thumbStrokeSize", androidx.exifinterface.media.a.V4, "LX2/l;", "colorChangeListener", "a0", "Z", "isThumbShown", "rgb", "getRgb", "()I", "setRgb", "(I)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ColorPickerView extends View {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final int[] f45731E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final int[] f45732F;

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    private final GradientDrawable f45733G;

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final GradientDrawable f45734H;

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final Paint f45735I;

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private final Paint f45736J;

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private final Paint f45737K;

    /* renamed from: L, reason: collision with root package name */
    @l3.d
    private final float[] f45738L;

    /* renamed from: M, reason: collision with root package name */
    private int f45739M;

    /* renamed from: N, reason: collision with root package name */
    private int f45740N;

    /* renamed from: O, reason: collision with root package name */
    private int f45741O;

    /* renamed from: P, reason: collision with root package name */
    private float f45742P;

    /* renamed from: Q, reason: collision with root package name */
    private float f45743Q;

    /* renamed from: R, reason: collision with root package name */
    private float f45744R;

    /* renamed from: S, reason: collision with root package name */
    private float f45745S;

    /* renamed from: T, reason: collision with root package name */
    private float f45746T;

    /* renamed from: U, reason: collision with root package name */
    private final float f45747U;

    /* renamed from: V, reason: collision with root package name */
    private float f45748V;

    /* renamed from: W, reason: collision with root package name */
    @l3.e
    private X2.l<? super Color, H0> f45749W;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f45750a0;

    public /* synthetic */ ColorPickerView(Context context, AttributeSet attributeSet, int i4, C2197u c2197u) {
        this(context, (i4 & 2) != 0 ? null : attributeSet);
    }

    private final void a(MotionEvent motionEvent) {
        double x3 = motionEvent.getX() - this.f45739M;
        double y3 = motionEvent.getY() - this.f45740N;
        float f4 = 360;
        n((o((float) Math.atan2(y3, x3)) + f4) % f4, Math.min((float) Math.hypot(x3, y3), this.f45741O) / this.f45741O);
    }

    private final float b(float f4) {
        return TypedValue.applyDimension(1, f4, getContext().getResources().getDisplayMetrics());
    }

    private final void c(Canvas canvas) {
        float f4 = this.f45747U - this.f45748V;
        this.f45737K.setColor(getRgb());
        canvas.drawCircle(this.f45745S, this.f45746T, f4, this.f45737K);
    }

    private final void d(Canvas canvas) {
        this.f45733G.draw(canvas);
        this.f45734H.draw(canvas);
    }

    private final void e(Canvas canvas) {
        canvas.drawCircle(this.f45739M, this.f45740N, this.f45742P, this.f45735I);
    }

    private final void f(Canvas canvas) {
        float[] fArr = this.f45738L;
        float f4 = fArr[1] * this.f45741O;
        double p4 = p(fArr[0]);
        this.f45745S = (((float) Math.cos(p4)) * f4) + this.f45739M;
        this.f45746T = (((float) Math.sin(p4)) * f4) + this.f45740N;
        h(canvas);
    }

    private final void g(Canvas canvas) {
        canvas.drawCircle(this.f45745S, this.f45746T, this.f45747U, this.f45736J);
    }

    private final void h(Canvas canvas) {
        g(canvas);
        c(canvas);
    }

    private final void i() {
        Color color = new Color(android.graphics.Color.red(getRgb()), android.graphics.Color.green(getRgb()), android.graphics.Color.blue(getRgb()));
        X2.l<? super Color, H0> lVar = this.f45749W;
        if (lVar != null) {
            lVar.C(color);
        }
    }

    private final boolean j(MotionEvent motionEvent, float f4, float f5) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        long eventTime = motionEvent.getEventTime() - motionEvent.getDownTime();
        float hypot = (float) Math.hypot(motionEvent.getX() - f4, motionEvent.getY() - f5);
        if (eventTime < ViewConfiguration.getTapTimeout() && hypot < viewConfiguration.getScaledTouchSlop()) {
            return true;
        }
        return false;
    }

    private final void k(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        q(motionEvent);
        this.f45743Q = motionEvent.getX();
        this.f45744R = motionEvent.getY();
    }

    private final void l(MotionEvent motionEvent) {
        q(motionEvent);
    }

    private final void n(float f4, float f5) {
        float H3;
        float H4;
        float[] fArr = this.f45738L;
        H3 = kotlin.ranges.u.H(f4, 0.0f, 360.0f);
        fArr[0] = H3;
        float[] fArr2 = this.f45738L;
        H4 = kotlin.ranges.u.H(f5, 0.0f, 1.0f);
        fArr2[1] = H4;
    }

    private final float o(float f4) {
        return (f4 * 180.0f) / 3.1415927f;
    }

    private final float p(float f4) {
        return (f4 / 180.0f) * 3.1415927f;
    }

    private final void q(MotionEvent motionEvent) {
        this.f45748V = b(9.0f);
        a(motionEvent);
        invalidate();
    }

    public final int getRgb() {
        return android.graphics.Color.HSVToColor(this.f45738L);
    }

    public final void m() {
        this.f45750a0 = false;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(@l3.d Canvas canvas) {
        F.p(canvas, "canvas");
        e(canvas);
        d(canvas);
        if (this.f45750a0) {
            f(canvas);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int min = Math.min(View.MeasureSpec.getSize(i4), View.MeasureSpec.getSize(i5));
        setMeasuredDimension(View.resolveSize(min, i4), View.resolveSize(min, i5));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        int paddingLeft = (i4 - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (i5 - getPaddingTop()) - getPaddingBottom();
        this.f45739M = getPaddingLeft() + (paddingLeft / 2);
        this.f45740N = getPaddingTop() + (paddingTop / 2);
        int max = Math.max(Math.min(paddingLeft, paddingTop) / 2, 0) - ((int) this.f45747U);
        this.f45741O = max;
        int i8 = this.f45739M;
        int i9 = i8 - max;
        int i10 = this.f45740N;
        int i11 = i10 - max;
        int i12 = i8 + max;
        int i13 = i10 + max;
        this.f45733G.setBounds(i9, i11, i12, i13);
        this.f45734H.setBounds(i9, i11, i12, i13);
        this.f45734H.setGradientRadius(this.f45741O);
        this.f45742P = this.f45741O + b(10.85f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r0 != 3) goto L15;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(@l3.d android.view.MotionEvent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.F.p(r4, r0)
            int r0 = r4.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 == r1) goto L19
            r2 = 2
            if (r0 == r2) goto L15
            r2 = 3
            if (r0 == r2) goto L19
            goto L38
        L15:
            r3.l(r4)
            goto L38
        L19:
            r3.q(r4)
            r3.i()
            r0 = 1084227584(0x40a00000, float:5.0)
            float r0 = r3.b(r0)
            r3.f45748V = r0
            float r0 = r3.f45743Q
            float r2 = r3.f45744R
            boolean r4 = r3.j(r4, r0, r2)
            if (r4 == 0) goto L38
            r3.performClick()
            goto L38
        L35:
            r3.k(r4)
        L38:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.widget.ColorPickerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean performClick() {
        getParent().requestDisallowInterceptTouchEvent(false);
        return super.performClick();
    }

    public final void setColor(@l3.d Color color) {
        F.p(color, "color");
        setRgb(android.graphics.Color.rgb(color.h(), color.g(), color.f()));
        this.f45750a0 = true;
        invalidate();
    }

    public final void setListener(@l3.d X2.l<? super Color, H0> l4) {
        F.p(l4, "l");
        this.f45749W = l4;
    }

    public final void setRgb(int i4) {
        android.graphics.Color.colorToHSV(i4, this.f45738L);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorPickerView(@l3.d Context context, @l3.e AttributeSet attributeSet) {
        super(context, attributeSet);
        F.p(context, "context");
        int[] iArr = {InterfaceMenuC2377a.f55290c, D.f13124u, -16711936, -16711681, -16776961, -65281, InterfaceMenuC2377a.f55290c};
        this.f45731E = iArr;
        int[] iArr2 = {-1, C0823k0.f13588s};
        this.f45732F = iArr2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(2);
        gradientDrawable.setShape(1);
        gradientDrawable.setColors(iArr);
        this.f45733G = gradientDrawable;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setGradientType(1);
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColors(iArr2);
        this.f45734H = gradientDrawable2;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(C0669d.f(context, j.d.f40689E0));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f45735I = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(C0669d.f(context, j.d.f40749f1));
        paint2.setStyle(style);
        this.f45736J = paint2;
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setStyle(style);
        this.f45737K = paint3;
        this.f45738L = new float[]{0.0f, 0.0f, 1.0f};
        this.f45747U = b(24.0f);
        this.f45748V = b(5.0f);
        this.f45750a0 = true;
    }
}
