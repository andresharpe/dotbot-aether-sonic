package com.harman.jbl.partybox.ui.widget;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.harman.jbl.partybox.j;
import kotlin.E;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@E(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OB\u001b\b\u0016\u0012\u0006\u0010M\u001a\u00020L\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bN\u0010PB#\b\u0016\u0012\u0006\u0010M\u001a\u00020L\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bN\u0010QJ!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\nJ\r\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\nJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001e\u0010\nJ7\u0010#\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0004H\u0014¢\u0006\u0004\b#\u0010$J/\u0010(\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0004H\u0014¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010-R\u0014\u00103\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u00108\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00107R\u0016\u0010;\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010=\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010:R\u0016\u0010?\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010/R\u0016\u0010A\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00102R\u0016\u0010C\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010/R\u0016\u0010E\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010/R$\u0010K\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u00048B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J¨\u0006R"}, d2 = {"Lcom/harman/jbl/partybox/ui/widget/RippleLayout;", "Landroid/widget/FrameLayout;", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "Lkotlin/H0;", "e", "(Landroid/util/AttributeSet;I)V", "h", "()V", "i", "Landroid/graphics/RectF;", "bounds", "", "percent", "f", "(Landroid/graphics/RectF;F)V", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Paint;", "paint", "d", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "c", "l", "m", "", "g", "()Z", "onDetachedFromWindow", "changed", "t", "r", com.harman.log.b.f47574c, "onLayout", "(ZIIII)V", "w", "oldw", "oldh", "onSizeChanged", "(IIII)V", "onDraw", "(Landroid/graphics/Canvas;)V", androidx.exifinterface.media.a.U4, "Landroid/graphics/Paint;", "outerRipplePaint", "F", "innerRipplePaint", "G", "I", "shaderColor0", "H", "shaderColor1", "Landroid/animation/AnimatorSet;", "Landroid/animation/AnimatorSet;", "animatorSet", "J", "Landroid/graphics/RectF;", "outerRippleBounds", "K", "innerRippleBounds", "L", "radius", "M", "_pulseDuration", "N", "rippleStartRadiusPercent", "O", "rippleEndRadiusPercent", "value", "getPulseDuration", "()I", "setPulseDuration", "(I)V", "pulseDuration", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nRippleLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleLayout.kt\ncom/harman/jbl/partybox/ui/widget/RippleLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,223:1\n1#2:224\n*E\n"})
/* loaded from: classes2.dex */
public final class RippleLayout extends FrameLayout {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final Paint f45859E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final Paint f45860F;

    /* renamed from: G, reason: collision with root package name */
    private final int f45861G;

    /* renamed from: H, reason: collision with root package name */
    private final int f45862H;

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final AnimatorSet f45863I;

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private RectF f45864J;

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private RectF f45865K;

    /* renamed from: L, reason: collision with root package name */
    private float f45866L;

    /* renamed from: M, reason: collision with root package name */
    private int f45867M;

    /* renamed from: N, reason: collision with root package name */
    private float f45868N;

    /* renamed from: O, reason: collision with root package name */
    private float f45869O;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RippleLayout(@l3.d Context context) {
        this(context, null);
        F.p(context, "context");
    }

    private final void c(Canvas canvas, RectF rectF, Paint paint) {
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2, paint);
    }

    private final void d(Canvas canvas, RectF rectF, Paint paint) {
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2, paint);
    }

    private final void e(AttributeSet attributeSet, int i4) {
        int pulseDuration;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.o.f41997n0, i4, 0);
        F.o(obtainStyledAttributes, "obtainStyledAttributes(...)");
        TypedValue a4 = v.a(obtainStyledAttributes, new TypedValue(), j.o.f42000o0);
        if (a4 != null) {
            pulseDuration = a4.data;
        } else {
            pulseDuration = getPulseDuration();
        }
        this.f45867M = pulseDuration;
        obtainStyledAttributes.recycle();
    }

    private final void f(RectF rectF, float f4) {
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        float f5 = width;
        float f6 = f4 / 100.0f;
        float f7 = f5 * f6;
        rectF.left = f5 - f7;
        float f8 = height;
        float f9 = f6 * f8;
        rectF.top = f8 - f9;
        rectF.right = f5 + f7;
        rectF.bottom = f8 + f9;
    }

    private final int getPulseDuration() {
        return this.f45867M;
    }

    private final void h() {
        m();
        l();
    }

    private final void i() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f45868N, this.f45869O * 0.8f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.harman.jbl.partybox.ui.widget.t
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                RippleLayout.j(RippleLayout.this, valueAnimator);
            }
        });
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(2);
        ofFloat.setStartDelay(0L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f45868N, this.f45869O * 0.9f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.harman.jbl.partybox.ui.widget.u
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                RippleLayout.k(RippleLayout.this, valueAnimator);
            }
        });
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setStartDelay(200L);
        AnimatorSet animatorSet = this.f45863I;
        animatorSet.setDuration(getPulseDuration());
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f45863I.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(RippleLayout this$0, ValueAnimator it) {
        F.p(this$0, "this$0");
        F.p(it, "it");
        Object animatedValue = it.getAnimatedValue();
        F.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        this$0.f45866L = floatValue;
        if (floatValue > 0.0f) {
            this$0.f(this$0.f45864J, floatValue);
            this$0.f45859E.setShader(new LinearGradient(0.0f, 0.0f, this$0.f45864J.width(), this$0.f45864J.height(), this$0.f45862H, this$0.f45861G, Shader.TileMode.CLAMP));
            this$0.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(RippleLayout this$0, ValueAnimator it) {
        F.p(this$0, "this$0");
        F.p(it, "it");
        Object animatedValue = it.getAnimatedValue();
        F.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        this$0.f45866L = floatValue;
        if (floatValue > 0.0f) {
            this$0.f(this$0.f45865K, floatValue);
            this$0.f45860F.setShader(new LinearGradient(0.0f, 0.0f, this$0.f45865K.width(), this$0.f45865K.height(), this$0.f45862H, this$0.f45861G, Shader.TileMode.CLAMP));
            this$0.invalidate();
        }
    }

    private final void setPulseDuration(int i4) {
        this.f45867M = i4;
        h();
    }

    public final boolean g() {
        return this.f45863I.isRunning();
    }

    public final void l() {
        if (!this.f45863I.isRunning()) {
            i();
        }
    }

    public final void m() {
        this.f45863I.end();
        this.f45863I.removeAllListeners();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m();
    }

    @Override // android.view.View
    protected void onDraw(@l3.d Canvas canvas) {
        F.p(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f45863I.isRunning() || isInEditMode()) {
            d(canvas, this.f45864J, this.f45859E);
            c(canvas, this.f45865K, this.f45860F);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        if (isInEditMode()) {
            f(this.f45864J, this.f45868N);
            f(this.f45865K, this.f45868N);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        ViewGroup viewGroup;
        super.onSizeChanged(i4, i5, i6, i7);
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            if (!viewGroup.isInLayout()) {
                viewGroup.requestLayout();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RippleLayout(@l3.d Context context, @l3.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        F.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleLayout(@l3.d Context context, @l3.e AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        F.p(context, "context");
        Paint paint = new Paint();
        paint.setFlags(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f45859E = paint;
        Paint paint2 = new Paint();
        paint2.setFlags(1);
        paint2.setStyle(style);
        this.f45860F = paint2;
        this.f45861G = Color.parseColor("#40278EFF");
        this.f45862H = Color.parseColor("#80278EFF");
        this.f45863I = new AnimatorSet();
        this.f45864J = new RectF();
        this.f45865K = new RectF();
        this.f45869O = 100.0f;
        this.f45867M = 1000;
        setWillNotDraw(false);
        if (attributeSet != null) {
            e(attributeSet, i4);
        }
    }
}
