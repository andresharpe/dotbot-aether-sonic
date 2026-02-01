package com.harman.jbl.partybox.ui.widget;

import N0.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.blankj.utilcode.util.C1115z;
import com.harman.jbl.partybox.j;
import kotlin.A;
import kotlin.C2122h0;
import kotlin.E;
import kotlin.H0;
import kotlin.Pair;
import kotlin.Result;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.L0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.U;
import o.InterfaceMenuC2377a;

@SuppressLint({"UseCompatLoadingForDrawables"})
@E(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 °\u00012\u00020\u00012\u00020\u0002:\u0004±\u0001²\u0001B\u0013\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001B\u001d\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\t\u0010¯\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0005\b\u00ad\u0001\u0010\tJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u000bJ\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J7\u0010*\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\rH\u0014¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\r¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u001b2\u0006\u00101\u001a\u000200H\u0017¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b4\u0010$J\u000f\u00105\u001a\u00020\u0007H\u0014¢\u0006\u0004\b5\u0010\u000bR\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R\u0016\u0010A\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010;R\u0016\u0010C\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010;R\u0016\u0010E\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010;R\u0016\u0010G\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010;R\u0016\u0010I\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010;R\u0016\u0010K\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010BR\u0016\u0010M\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010BR\u0016\u0010O\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010BR\u0016\u0010R\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u001b\u0010V\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010/R\u0016\u0010X\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010;R\u0016\u0010Z\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010;R\u0016\u0010\\\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010;R\u0016\u0010^\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010;R\u0016\u0010`\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010;R\u0016\u0010b\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010;R\u001d\u0010g\u001a\u0004\u0018\u00010c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010T\u001a\u0004\be\u0010fR\u001d\u0010j\u001a\u0004\u0018\u00010c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010T\u001a\u0004\bi\u0010fR\u0014\u0010n\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010p\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010mR\u0016\u0010t\u001a\u00020q8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010v\u001a\u00020q8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bu\u0010sR\u0016\u0010x\u001a\u00020q8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bw\u0010sR\u0016\u0010{\u001a\u00020y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010DR\u0018\u0010\u007f\u001a\u0004\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u0018\u0010\u0081\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010BR\u0018\u0010\u0083\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010;R\u0018\u0010\u0085\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010QR \u0010\u008a\u0001\u001a\u00030\u0086\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0087\u0001\u0010T\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R \u0010\u008f\u0001\u001a\u00030\u008b\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008c\u0001\u0010T\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0016\u0010\u0091\u0001\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010BRI\u0010\u009b\u0001\u001a\"\u0012\u0015\u0012\u00130\r¢\u0006\u000e\b\u0093\u0001\u0012\t\b\u0094\u0001\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0092\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R.\u0010\u009f\u0001\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u009c\u0001\u0010B\u001a\u0005\b\u009d\u0001\u0010/\"\u0005\b\u009e\u0001\u0010-R&\u0010£\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b \u0001\u0010B\u001a\u0005\b¡\u0001\u0010/\"\u0005\b¢\u0001\u0010-RJ\u0010¨\u0001\u001a#\u0012\u0015\u0012\u00130\r¢\u0006\u000e\b\u0093\u0001\u0012\t\b\u0094\u0001\u0012\u0004\b\b(\u000e\u0012\u0005\u0012\u00030¤\u0001\u0018\u00010\u0092\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¥\u0001\u0010\u0096\u0001\u001a\u0006\b¦\u0001\u0010\u0098\u0001\"\u0006\b§\u0001\u0010\u009a\u0001R\u0018\u0010¬\u0001\u001a\u00030©\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001¨\u0006³\u0001"}, d2 = {"Lcom/harman/jbl/partybox/ui/widget/HorizontalScaleView;", "Landroid/view/View;", "Lkotlinx/coroutines/U;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Lkotlin/H0;", "r", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "s", "()V", "w", "", "value", "", "x", "(I)F", "offsetx", "u", "(F)I", "Lkotlin/Pair;", "getMinMaxOffsetX", "()Lkotlin/Pair;", "v", "downx", "upx", "", "q", "(FF)Z", "downy", "t", "(II)V", "Landroid/graphics/Canvas;", "canvas", "p", "(Landroid/graphics/Canvas;)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "setValue", "(I)V", "o", "()I", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onDraw", "onDetachedFromWindow", "Lkotlinx/coroutines/C;", androidx.exifinterface.media.a.U4, "Lkotlinx/coroutines/C;", "viewJob", "Landroid/graphics/Paint;", "F", "Landroid/graphics/Paint;", "paintVerticalLine", "G", "paintDebug", "H", "centerX", "I", "centerY", "J", "offsetX", "K", "downX", "L", "downY", "M", "maxValue", "N", "minValue", "O", "currentValue", "P", "Z", "debug", "Q", "Lkotlin/A;", "getIconSize", "iconSize", "R", "verticalLineWidth", androidx.exifinterface.media.a.T4, "verticalLineHeight", androidx.exifinterface.media.a.f5, "verticalMiddleLineHeight", "U", "verticalMiddleLineWidth", androidx.exifinterface.media.a.Z4, "spaceWidth", androidx.exifinterface.media.a.V4, "circlePointRadius", "Landroid/graphics/drawable/Drawable;", "a0", "getLeftIcon", "()Landroid/graphics/drawable/Drawable;", "leftIcon", "b0", "getRightIcon", "rightIcon", "Landroid/graphics/Rect;", "c0", "Landroid/graphics/Rect;", "leftIconRect", "d0", "rightIconRect", "Lcom/harman/jbl/partybox/ui/widget/HorizontalScaleView$a;", "e0", "Lcom/harman/jbl/partybox/ui/widget/HorizontalScaleView$a;", "normalColorProperties", "f0", "pressColorProperties", "g0", "currentColorProperties", "", "h0", "actionDownTime", "Lkotlinx/coroutines/L0;", "i0", "Lkotlinx/coroutines/L0;", "flingJob", "j0", "lastValue", "k0", "lastX", "l0", "inOperation", "Landroid/text/TextPaint;", "m0", "getLabelPaint", "()Landroid/text/TextPaint;", "labelPaint", "Landroid/graphics/drawable/GradientDrawable;", "n0", "getMaskDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "maskDrawable", "o0", "horizontalPadding", "Lkotlin/Function1;", "Lkotlin/O;", a.C0015a.f1688b, "p0", "LX2/l;", "getOnValueChange", "()LX2/l;", "setOnValueChange", "(LX2/l;)V", "onValueChange", "q0", "getInitialValue", "setInitialValue", "initialValue", "r0", "getScaleSize", "setScaleSize", "scaleSize", "", "s0", "getOnScaleLineLabel", "setOnScaleLineLabel", "onScaleLineLabel", "Lkotlin/coroutines/f;", "getCoroutineContext", "()Lkotlin/coroutines/f;", "coroutineContext", "<init>", "(Landroid/content/Context;)V", "attributeSet", "t0", "a", com.harman.log.b.f47574c, "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class HorizontalScaleView extends View implements U {

    /* renamed from: t0, reason: collision with root package name */
    @l3.d
    public static final b f45792t0 = new b(null);

    /* renamed from: u0, reason: collision with root package name */
    @l3.d
    public static final String f45793u0 = "HorizontalScaleView";

    /* renamed from: v0, reason: collision with root package name */
    public static final int f45794v0 = 10;

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final C f45795E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final Paint f45796F;

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    private final Paint f45797G;

    /* renamed from: H, reason: collision with root package name */
    private float f45798H;

    /* renamed from: I, reason: collision with root package name */
    private float f45799I;

    /* renamed from: J, reason: collision with root package name */
    private volatile float f45800J;

    /* renamed from: K, reason: collision with root package name */
    private float f45801K;

    /* renamed from: L, reason: collision with root package name */
    private float f45802L;

    /* renamed from: M, reason: collision with root package name */
    private int f45803M;

    /* renamed from: N, reason: collision with root package name */
    private int f45804N;

    /* renamed from: O, reason: collision with root package name */
    private int f45805O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f45806P;

    /* renamed from: Q, reason: collision with root package name */
    @l3.d
    private final A f45807Q;

    /* renamed from: R, reason: collision with root package name */
    private float f45808R;

    /* renamed from: S, reason: collision with root package name */
    private float f45809S;

    /* renamed from: T, reason: collision with root package name */
    private float f45810T;

    /* renamed from: U, reason: collision with root package name */
    private float f45811U;

    /* renamed from: V, reason: collision with root package name */
    private float f45812V;

    /* renamed from: W, reason: collision with root package name */
    private float f45813W;

    /* renamed from: a0, reason: collision with root package name */
    @l3.d
    private final A f45814a0;

    /* renamed from: b0, reason: collision with root package name */
    @l3.d
    private final A f45815b0;

    /* renamed from: c0, reason: collision with root package name */
    @l3.d
    private final Rect f45816c0;

    /* renamed from: d0, reason: collision with root package name */
    @l3.d
    private final Rect f45817d0;

    /* renamed from: e0, reason: collision with root package name */
    private a f45818e0;

    /* renamed from: f0, reason: collision with root package name */
    private a f45819f0;

    /* renamed from: g0, reason: collision with root package name */
    private a f45820g0;

    /* renamed from: h0, reason: collision with root package name */
    private long f45821h0;

    /* renamed from: i0, reason: collision with root package name */
    @l3.e
    private L0 f45822i0;

    /* renamed from: j0, reason: collision with root package name */
    private int f45823j0;

    /* renamed from: k0, reason: collision with root package name */
    private float f45824k0;

    /* renamed from: l0, reason: collision with root package name */
    private volatile boolean f45825l0;

    /* renamed from: m0, reason: collision with root package name */
    @l3.d
    private final A f45826m0;

    /* renamed from: n0, reason: collision with root package name */
    @l3.d
    private final A f45827n0;

    /* renamed from: o0, reason: collision with root package name */
    private final int f45828o0;

    /* renamed from: p0, reason: collision with root package name */
    @l3.e
    private X2.l<? super Integer, H0> f45829p0;

    /* renamed from: q0, reason: collision with root package name */
    private int f45830q0;

    /* renamed from: r0, reason: collision with root package name */
    private int f45831r0;

    /* renamed from: s0, reason: collision with root package name */
    @l3.e
    private X2.l<? super Integer, String> f45832s0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f45833a;

        /* renamed from: b, reason: collision with root package name */
        private final int f45834b;

        /* renamed from: c, reason: collision with root package name */
        private final int f45835c;

        public a(int i4, int i5, int i6) {
            this.f45833a = i4;
            this.f45834b = i5;
            this.f45835c = i6;
        }

        public static /* synthetic */ a e(a aVar, int i4, int i5, int i6, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                i4 = aVar.f45833a;
            }
            if ((i7 & 2) != 0) {
                i5 = aVar.f45834b;
            }
            if ((i7 & 4) != 0) {
                i6 = aVar.f45835c;
            }
            return aVar.d(i4, i5, i6);
        }

        public final int a() {
            return this.f45833a;
        }

        public final int b() {
            return this.f45834b;
        }

        public final int c() {
            return this.f45835c;
        }

        @l3.d
        public final a d(int i4, int i5, int i6) {
            return new a(i4, i5, i6);
        }

        public boolean equals(@l3.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f45833a == aVar.f45833a && this.f45834b == aVar.f45834b && this.f45835c == aVar.f45835c;
        }

        public final int f() {
            return this.f45833a;
        }

        public final int g() {
            return this.f45835c;
        }

        public final int h() {
            return this.f45834b;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f45833a) * 31) + Integer.hashCode(this.f45834b)) * 31) + Integer.hashCode(this.f45835c);
        }

        @l3.d
        public String toString() {
            return "ColorProperties(middleBaseVerticalLineColor=" + this.f45833a + ", verticalLineColor=" + this.f45834b + ", verticalLineActiveColor=" + this.f45835c + ")";
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C2197u c2197u) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.widget.HorizontalScaleView$fling$1", f = "HorizontalScaleView.kt", i = {0, 0, 0}, l = {247}, m = "invokeSuspend", n = {"$this$launch", "animy", "t"}, s = {"L$0", "F$0", "I$0"})
    /* loaded from: classes2.dex */
    public static final class c extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        float f45836I;

        /* renamed from: J, reason: collision with root package name */
        int f45837J;

        /* renamed from: K, reason: collision with root package name */
        int f45838K;

        /* renamed from: L, reason: collision with root package name */
        private /* synthetic */ Object f45839L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ float f45840M;

        /* renamed from: N, reason: collision with root package name */
        final /* synthetic */ HorizontalScaleView f45841N;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(float f4, HorizontalScaleView horizontalScaleView, kotlin.coroutines.c<? super c> cVar) {
            super(2, cVar);
            this.f45840M = f4;
            this.f45841N = horizontalScaleView;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x009e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0043 -> B:5:0x0046). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r9.f45838K
                r2 = 1
                if (r1 == 0) goto L1f
                if (r1 != r2) goto L17
                int r1 = r9.f45837J
                float r3 = r9.f45836I
                java.lang.Object r4 = r9.f45839L
                kotlinx.coroutines.U r4 = (kotlinx.coroutines.U) r4
                kotlin.W.n(r10)
                goto L46
            L17:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1f:
                kotlin.W.n(r10)
                java.lang.Object r10 = r9.f45839L
                kotlinx.coroutines.U r10 = (kotlinx.coroutines.U) r10
                float r1 = r9.f45840M
                r3 = 10
                float r3 = (float) r3
                float r1 = r1 / r3
                r4 = r10
                r3 = r1
                r1 = r2
            L2f:
                boolean r10 = kotlinx.coroutines.V.k(r4)
                if (r10 == 0) goto Lca
                r9.f45839L = r4
                r9.f45836I = r3
                r9.f45837J = r1
                r9.f45838K = r2
                r5 = 50
                java.lang.Object r10 = kotlinx.coroutines.C2269d0.b(r5, r9)
                if (r10 != r0) goto L46
                return r0
            L46:
                int r1 = r1 + 2
                float r10 = (float) r1
                float r10 = r3 / r10
                com.harman.jbl.partybox.ui.widget.HorizontalScaleView r5 = r9.f45841N
                kotlin.Pair r5 = com.harman.jbl.partybox.ui.widget.HorizontalScaleView.e(r5)
                java.lang.Object r6 = r5.e()
                java.lang.Number r6 = (java.lang.Number) r6
                float r6 = r6.floatValue()
                java.lang.Object r5 = r5.f()
                java.lang.Number r5 = (java.lang.Number) r5
                float r5 = r5.floatValue()
                com.harman.jbl.partybox.ui.widget.HorizontalScaleView r7 = r9.f45841N
                float r8 = com.harman.jbl.partybox.ui.widget.HorizontalScaleView.g(r7)
                float r8 = r8 + r10
                float r5 = kotlin.ranges.s.H(r8, r6, r5)
                com.harman.jbl.partybox.ui.widget.HorizontalScaleView.n(r7, r5)
                com.harman.jbl.partybox.ui.widget.HorizontalScaleView r5 = r9.f45841N
                float r6 = com.harman.jbl.partybox.ui.widget.HorizontalScaleView.g(r5)
                int r6 = com.harman.jbl.partybox.ui.widget.HorizontalScaleView.i(r5, r6)
                com.harman.jbl.partybox.ui.widget.HorizontalScaleView r7 = r9.f45841N
                int r7 = com.harman.jbl.partybox.ui.widget.HorizontalScaleView.f(r7)
                com.harman.jbl.partybox.ui.widget.HorizontalScaleView r8 = r9.f45841N
                int r8 = com.harman.jbl.partybox.ui.widget.HorizontalScaleView.d(r8)
                int r6 = kotlin.ranges.s.I(r6, r7, r8)
                com.harman.jbl.partybox.ui.widget.HorizontalScaleView.l(r5, r6)
                com.harman.jbl.partybox.ui.widget.HorizontalScaleView r5 = r9.f45841N
                int r5 = com.harman.jbl.partybox.ui.widget.HorizontalScaleView.c(r5)
                com.harman.jbl.partybox.ui.widget.HorizontalScaleView r6 = r9.f45841N
                int r6 = com.harman.jbl.partybox.ui.widget.HorizontalScaleView.a(r6)
                if (r5 == r6) goto La5
                com.harman.jbl.partybox.ui.widget.w$a r5 = com.harman.jbl.partybox.ui.widget.w.f46160a
                com.harman.jbl.partybox.ui.widget.HorizontalScaleView r6 = r9.f45841N
                r5.a(r6)
            La5:
                com.harman.jbl.partybox.ui.widget.HorizontalScaleView r5 = r9.f45841N
                int r6 = r5.o()
                com.harman.jbl.partybox.ui.widget.HorizontalScaleView.m(r5, r6)
                com.harman.jbl.partybox.ui.widget.HorizontalScaleView r5 = r9.f45841N
                com.harman.jbl.partybox.ui.widget.HorizontalScaleView.j(r5)
                com.harman.jbl.partybox.ui.widget.HorizontalScaleView r5 = r9.f45841N
                r5.invalidate()
                int r10 = (int) r10
                int r10 = java.lang.Math.abs(r10)
                r5 = 8
                if (r10 > r5) goto L2f
                com.harman.jbl.partybox.ui.widget.HorizontalScaleView r10 = r9.f45841N
                com.harman.jbl.partybox.ui.widget.HorizontalScaleView.k(r10)
                r10 = 0
                kotlinx.coroutines.V.f(r4, r10, r2, r10)
            Lca:
                kotlin.H0 r10 = kotlin.H0.f51801a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.widget.HorizontalScaleView.c.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((c) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            c cVar2 = new c(this.f45840M, this.f45841N, cVar);
            cVar2.f45839L = obj;
            return cVar2;
        }
    }

    /* loaded from: classes2.dex */
    static final class d extends Lambda implements X2.a<Integer> {

        /* renamed from: F, reason: collision with root package name */
        public static final d f45842F = new d();

        d() {
            super(0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Integer n() {
            return Integer.valueOf(C1115z.w(24.0f));
        }
    }

    /* loaded from: classes2.dex */
    static final class e extends Lambda implements X2.a<TextPaint> {
        e() {
            super(0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final TextPaint n() {
            TextPaint textPaint = new TextPaint();
            HorizontalScaleView horizontalScaleView = HorizontalScaleView.this;
            textPaint.setTextSize(horizontalScaleView.getContext().getResources().getDimensionPixelSize(j.e.f40812I0));
            textPaint.setTypeface(androidx.core.content.res.i.j(horizontalScaleView.getContext(), j.g.f41136e));
            textPaint.setColor(horizontalScaleView.getContext().getColor(j.d.f40681A0));
            return textPaint;
        }
    }

    /* loaded from: classes2.dex */
    static final class f extends Lambda implements X2.a<Drawable> {
        f() {
            super(0);
        }

        @Override // X2.a
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Drawable n() {
            return HorizontalScaleView.this.getContext().getDrawable(j.f.Q3);
        }
    }

    /* loaded from: classes2.dex */
    static final class g extends Lambda implements X2.a<GradientDrawable> {
        g() {
            super(0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final GradientDrawable n() {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{HorizontalScaleView.this.getContext().getColor(j.d.f40738c), HorizontalScaleView.this.getContext().getColor(j.d.f40738c), HorizontalScaleView.this.getContext().getColor(j.d.f40738c), 0});
            HorizontalScaleView horizontalScaleView = HorizontalScaleView.this;
            gradientDrawable.setSize(C1115z.w(72.0f) + horizontalScaleView.f45828o0, horizontalScaleView.getHeight());
            return gradientDrawable;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.widget.HorizontalScaleView$onValueChange$1", f = "HorizontalScaleView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class h extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f45846I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f45847J;

        h(kotlin.coroutines.c<? super h> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object b4;
            H0 h02;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f45846I == 0) {
                W.n(obj);
                HorizontalScaleView horizontalScaleView = HorizontalScaleView.this;
                try {
                    Result.a aVar = Result.f51807F;
                    X2.l<Integer, H0> onValueChange = horizontalScaleView.getOnValueChange();
                    if (onValueChange != null) {
                        onValueChange.C(kotlin.coroutines.jvm.internal.a.f(horizontalScaleView.f45805O));
                        h02 = H0.f51801a;
                    } else {
                        h02 = null;
                    }
                    b4 = Result.b(h02);
                } catch (Throwable th) {
                    Result.a aVar2 = Result.f51807F;
                    b4 = Result.b(W.a(th));
                }
                Throwable e4 = Result.e(b4);
                if (e4 != null) {
                    e4.printStackTrace();
                }
                return H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((h) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            h hVar = new h(cVar);
            hVar.f45847J = obj;
            return hVar;
        }
    }

    /* loaded from: classes2.dex */
    static final class i extends Lambda implements X2.a<Drawable> {
        i() {
            super(0);
        }

        @Override // X2.a
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Drawable n() {
            return HorizontalScaleView.this.getContext().getDrawable(j.f.P3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalScaleView(@l3.d Context context) {
        super(context);
        C c4;
        A a4;
        A a5;
        A a6;
        A a7;
        A a8;
        F.p(context, "context");
        c4 = Q0.c(null, 1, null);
        this.f45795E = c4;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        this.f45796F = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStrokeCap(cap);
        paint2.setStyle(style);
        this.f45797G = paint2;
        this.f45803M = 10;
        a4 = kotlin.C.a(d.f45842F);
        this.f45807Q = a4;
        a5 = kotlin.C.a(new f());
        this.f45814a0 = a5;
        a6 = kotlin.C.a(new i());
        this.f45815b0 = a6;
        this.f45816c0 = new Rect();
        this.f45817d0 = new Rect();
        this.f45821h0 = System.currentTimeMillis();
        a7 = kotlin.C.a(new e());
        this.f45826m0 = a7;
        a8 = kotlin.C.a(new g());
        this.f45827n0 = a8;
        this.f45828o0 = C1115z.w(20.0f);
        this.f45831r0 = -1;
        r(context, null);
    }

    private final int getIconSize() {
        return ((Number) this.f45807Q.getValue()).intValue();
    }

    private final TextPaint getLabelPaint() {
        return (TextPaint) this.f45826m0.getValue();
    }

    private final Drawable getLeftIcon() {
        return (Drawable) this.f45814a0.getValue();
    }

    private final GradientDrawable getMaskDrawable() {
        return (GradientDrawable) this.f45827n0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<Float, Float> getMinMaxOffsetX() {
        return C2122h0.a(Float.valueOf(x(this.f45803M)), Float.valueOf(x(this.f45804N)));
    }

    private final Drawable getRightIcon() {
        return (Drawable) this.f45815b0.getValue();
    }

    private final void p(Canvas canvas) {
        int i4;
        int i5;
        int i6 = this.f45828o0;
        float height = (getHeight() - getIconSize()) / 2.0f;
        int i7 = (int) height;
        this.f45816c0.set(i6, i7, getIconSize() + i6, (int) (getIconSize() + height));
        Drawable leftIcon = getLeftIcon();
        if (leftIcon != null) {
            leftIcon.setBounds(i6, i7, getIconSize() + i6, (int) (getIconSize() + height));
        }
        Drawable leftIcon2 = getLeftIcon();
        if (leftIcon2 != null) {
            Context context = getContext();
            if (this.f45805O == this.f45804N) {
                i5 = j.d.f40790x0;
            } else {
                i5 = j.d.f40794z0;
            }
            leftIcon2.setTint(context.getColor(i5));
        }
        Drawable leftIcon3 = getLeftIcon();
        if (leftIcon3 != null) {
            leftIcon3.draw(canvas);
        }
        int width = (getWidth() - getIconSize()) - this.f45828o0;
        this.f45817d0.set(width, i7, getIconSize() + width, (int) (getIconSize() + height));
        Drawable rightIcon = getRightIcon();
        if (rightIcon != null) {
            rightIcon.setBounds(width, i7, getIconSize() + width, (int) (height + getIconSize()));
        }
        Drawable rightIcon2 = getRightIcon();
        if (rightIcon2 != null) {
            Context context2 = getContext();
            if (this.f45805O == this.f45803M) {
                i4 = j.d.f40790x0;
            } else {
                i4 = j.d.f40794z0;
            }
            rightIcon2.setTint(context2.getColor(i4));
        }
        Drawable rightIcon3 = getRightIcon();
        if (rightIcon3 != null) {
            rightIcon3.draw(canvas);
        }
        if (this.f45806P) {
            this.f45797G.setColor(InterfaceMenuC2377a.f55290c);
            canvas.drawRect(this.f45816c0, this.f45797G);
            canvas.drawRect(this.f45817d0, this.f45797G);
        }
    }

    private final boolean q(float f4, float f5) {
        int i4;
        L0 f6;
        float currentTimeMillis = ((f5 - f4) / ((float) (System.currentTimeMillis() - this.f45821h0))) * ((float) 1000);
        if (Math.abs(currentTimeMillis) > 1500.0f && (i4 = this.f45805O) != this.f45804N && i4 != this.f45803M) {
            L0 l02 = this.f45822i0;
            if (l02 != null) {
                L0.a.b(l02, null, 1, null);
            }
            f6 = C2323l.f(this, null, null, new c(currentTimeMillis, this, null), 3, null);
            this.f45822i0 = f6;
            return true;
        }
        w();
        v();
        return false;
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    private final void r(Context context, AttributeSet attributeSet) {
        Object b4;
        try {
            Result.a aVar = Result.f51807F;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.o.f41927L);
            F.o(obtainStyledAttributes, "obtainStyledAttributes(...)");
            this.f45805O = obtainStyledAttributes.getInt(j.o.f41939R, 0);
            this.f45803M = Math.abs(obtainStyledAttributes.getInt(j.o.f41933O, 10));
            this.f45804N = 0;
            this.f45806P = obtainStyledAttributes.getBoolean(j.o.f41929M, false);
            this.f45812V = obtainStyledAttributes.getDimensionPixelSize(j.o.f41937Q, C1115z.w(23.0f));
            this.f45808R = obtainStyledAttributes.getDimensionPixelSize(j.o.f41931N, C1115z.w(1.0f));
            this.f45831r0 = obtainStyledAttributes.getInt(j.o.f41935P, -1);
            obtainStyledAttributes.recycle();
            this.f45809S = C1115z.w(24.0f);
            this.f45810T = C1115z.w(30.0f);
            this.f45811U = C1115z.w(2.0f);
            this.f45813W = C1115z.w(1.5f);
            a aVar2 = new a(context.getColor(j.d.f40788w0), context.getColor(j.d.f40790x0), context.getColor(j.d.f40794z0));
            this.f45818e0 = aVar2;
            this.f45819f0 = a.e(aVar2, 0, 0, 0, 7, null);
            a aVar3 = this.f45818e0;
            if (aVar3 == null) {
                F.S("normalColorProperties");
                aVar3 = null;
            }
            this.f45820g0 = aVar3;
            b4 = Result.b(H0.f51801a);
        } catch (Throwable th) {
            Result.a aVar4 = Result.f51807F;
            b4 = Result.b(W.a(th));
        }
        Throwable e4 = Result.e(b4);
        if (e4 != null) {
            e4.printStackTrace();
        }
    }

    private final void s() {
        this.f45798H = getWidth() / 2.0f;
        this.f45799I = getHeight() / 2.0f;
        com.harman.log.f.d(f45793u0, "initData value=[" + this.f45804N + "," + this.f45803M + "]");
        v();
        w();
    }

    private final void t(int i4, int i5) {
        int i6;
        int i7;
        if (this.f45816c0.contains(i4, i5) && (i7 = this.f45805O) != this.f45804N) {
            setValue(i7 - 1);
            v();
            w.f46160a.a(this);
        }
        if (this.f45817d0.contains(i4, i5) && (i6 = this.f45805O) != this.f45803M) {
            setValue(i6 + 1);
            v();
            w.f46160a.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int u(float f4) {
        int L02;
        L02 = kotlin.math.d.L0((-f4) / (this.f45808R + this.f45812V));
        return L02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        C2323l.f(this, C2322k0.e(), null, new h(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        this.f45800J = x(this.f45805O);
        invalidate();
    }

    private final float x(int i4) {
        return -(i4 * (this.f45808R + this.f45812V));
    }

    @Override // kotlinx.coroutines.U
    @l3.d
    public kotlin.coroutines.f getCoroutineContext() {
        return C2322k0.e().A(this.f45795E);
    }

    public final int getInitialValue() {
        return this.f45830q0;
    }

    @l3.e
    public final X2.l<Integer, String> getOnScaleLineLabel() {
        return this.f45832s0;
    }

    @l3.e
    public final X2.l<Integer, H0> getOnValueChange() {
        return this.f45829p0;
    }

    public final int getScaleSize() {
        return this.f45831r0;
    }

    public final int o() {
        return this.f45805O;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        L0 l02 = this.f45822i0;
        if (l02 != null) {
            L0.a.b(l02, null, 1, null);
        }
        L0.a.b(this.f45795E, null, 1, null);
        this.f45829p0 = null;
    }

    @Override // android.view.View
    protected void onDraw(@l3.d Canvas canvas) {
        a aVar;
        boolean z3;
        float f4;
        float f5;
        X2.l<? super Integer, String> lVar;
        F.p(canvas, "canvas");
        super.onDraw(canvas);
        float f6 = this.f45798H;
        int i4 = this.f45803M;
        float f7 = 2;
        float height = (getHeight() - this.f45809S) / f7;
        int w3 = C1115z.w(56.0f);
        float f8 = 2.0f;
        float height2 = (getHeight() - w3) / 2.0f;
        if (i4 >= 0) {
            float f9 = f6;
            int i5 = 0;
            while (true) {
                float f10 = f9 + this.f45800J;
                if (this.f45806P) {
                    this.f45797G.setColor(InterfaceMenuC2377a.f55290c);
                    this.f45797G.setTextSize(18.0f);
                    canvas.drawText(String.valueOf(i5), f10, height - 20.0f, this.f45797G);
                }
                int i6 = this.f45831r0;
                if (i6 > 0 && i5 % i6 == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    f4 = height - 20.0f;
                } else {
                    f4 = height;
                }
                if (z3) {
                    f5 = this.f45809S + f4 + 40.0f;
                } else {
                    f5 = this.f45809S + f4;
                }
                float f11 = f5;
                Paint paint = this.f45796F;
                if (i5 == this.f45830q0) {
                    paint.setStrokeWidth(C1115z.w(f8));
                    a aVar2 = this.f45820g0;
                    if (aVar2 == null) {
                        F.S("currentColorProperties");
                        aVar2 = null;
                    }
                    paint.setColor(aVar2.g());
                } else {
                    paint.setStrokeWidth(this.f45808R);
                    a aVar3 = this.f45820g0;
                    if (aVar3 == null) {
                        F.S("currentColorProperties");
                        aVar3 = null;
                    }
                    paint.setColor(aVar3.h());
                }
                if (z3 && (lVar = this.f45832s0) != null) {
                    F.m(lVar);
                    String C3 = lVar.C(Integer.valueOf(i5));
                    canvas.drawText(C3, f10 - (getLabelPaint().measureText(C3) / f7), w3 + height2 + Math.abs(getLabelPaint().getFontMetrics().ascent) + 8, getLabelPaint());
                }
                int i7 = i5;
                canvas.drawLine(f10, f4, f10, f11, this.f45796F);
                f9 += this.f45808R + this.f45812V;
                if (i7 == i4) {
                    break;
                }
                i5 = i7 + 1;
                f8 = 2.0f;
            }
        }
        Paint paint2 = this.f45796F;
        a aVar4 = this.f45820g0;
        if (aVar4 == null) {
            F.S("currentColorProperties");
            aVar = null;
        } else {
            aVar = aVar4;
        }
        paint2.setColor(aVar.f());
        this.f45796F.setStrokeWidth(C1115z.w(2.0f));
        float f12 = this.f45798H;
        canvas.drawLine(f12, height2, f12, height2 + w3, this.f45796F);
        if (this.f45806P) {
            this.f45797G.setColor(-16711936);
            this.f45797G.setStrokeWidth(2.0f);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f45797G);
        }
        p(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r2 != 3) goto L25;
     */
    @Override // android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(@l3.d android.view.MotionEvent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.F.p(r7, r0)
            float r0 = r7.getX()
            float r1 = r7.getY()
            int r2 = r7.getAction()
            r3 = 1
            if (r2 == 0) goto Lad
            if (r2 == r3) goto L94
            r1 = 2
            if (r2 == r1) goto L1e
            r7 = 3
            if (r2 == r7) goto L94
            goto Lca
        L1e:
            android.graphics.Rect r0 = r6.f45816c0
            float r1 = r6.f45801K
            int r1 = (int) r1
            float r2 = r6.f45802L
            int r2 = (int) r2
            boolean r0 = r0.contains(r1, r2)
            if (r0 != 0) goto L93
            android.graphics.Rect r0 = r6.f45817d0
            float r1 = r6.f45801K
            int r1 = (int) r1
            float r2 = r6.f45802L
            int r2 = (int) r2
            boolean r0 = r0.contains(r1, r2)
            if (r0 == 0) goto L3b
            goto L93
        L3b:
            float r0 = r7.getX()
            float r1 = r6.f45824k0
            float r0 = r0 - r1
            float r1 = r6.f45800J
            float r1 = r1 + r0
            r6.f45800J = r1
            r6.f45825l0 = r3
            kotlin.Pair r0 = r6.getMinMaxOffsetX()
            java.lang.Object r1 = r0.e()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Object r0 = r0.f()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r2 = r6.f45800J
            float r0 = kotlin.ranges.s.H(r2, r1, r0)
            r6.f45800J = r0
            float r0 = r6.f45800J
            int r0 = r6.u(r0)
            int r1 = r6.f45804N
            int r2 = r6.f45803M
            int r0 = kotlin.ranges.s.I(r0, r1, r2)
            r6.f45805O = r0
            int r1 = r6.f45823j0
            if (r1 == r0) goto L82
            com.harman.jbl.partybox.ui.widget.w$a r0 = com.harman.jbl.partybox.ui.widget.w.f46160a
            r0.a(r6)
        L82:
            int r0 = r6.f45805O
            r6.f45823j0 = r0
            float r7 = r7.getX()
            r6.f45824k0 = r7
            r6.invalidate()
            r6.v()
            goto Lca
        L93:
            return r3
        L94:
            r7 = 0
            r6.f45825l0 = r7
            float r7 = r6.f45801K
            int r7 = (int) r7
            float r1 = r6.f45802L
            int r1 = (int) r1
            r6.t(r7, r1)
            float r7 = r6.f45801K
            r6.q(r7, r0)
            r7 = 0
            r6.f45801K = r7
            r6.f45802L = r7
            r6.f45824k0 = r7
            goto Lca
        Lad:
            kotlinx.coroutines.L0 r2 = r6.f45822i0
            if (r2 == 0) goto Lb5
            r4 = 0
            kotlinx.coroutines.L0.a.b(r2, r4, r3, r4)
        Lb5:
            long r4 = java.lang.System.currentTimeMillis()
            r6.f45821h0 = r4
            r6.f45801K = r0
            r6.f45802L = r1
            float r7 = r7.getX()
            r6.f45824k0 = r7
            r6.f45825l0 = r3
            r6.invalidate()
        Lca:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.widget.HorizontalScaleView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setInitialValue(int i4) {
        if (i4 != this.f45830q0) {
            postInvalidate();
        }
        this.f45830q0 = i4;
    }

    public final void setOnScaleLineLabel(@l3.e X2.l<? super Integer, String> lVar) {
        this.f45832s0 = lVar;
    }

    public final void setOnValueChange(@l3.e X2.l<? super Integer, H0> lVar) {
        this.f45829p0 = lVar;
    }

    public final void setScaleSize(int i4) {
        this.f45831r0 = i4;
    }

    public final void setValue(int i4) {
        int I3;
        I3 = kotlin.ranges.u.I(i4, this.f45804N, this.f45803M);
        this.f45805O = I3;
        if (!this.f45825l0) {
            w();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalScaleView(@l3.d Context context, @l3.e AttributeSet attributeSet) {
        super(context, attributeSet);
        C c4;
        A a4;
        A a5;
        A a6;
        A a7;
        A a8;
        F.p(context, "context");
        c4 = Q0.c(null, 1, null);
        this.f45795E = c4;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        this.f45796F = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStrokeCap(cap);
        paint2.setStyle(style);
        this.f45797G = paint2;
        this.f45803M = 10;
        a4 = kotlin.C.a(d.f45842F);
        this.f45807Q = a4;
        a5 = kotlin.C.a(new f());
        this.f45814a0 = a5;
        a6 = kotlin.C.a(new i());
        this.f45815b0 = a6;
        this.f45816c0 = new Rect();
        this.f45817d0 = new Rect();
        this.f45821h0 = System.currentTimeMillis();
        a7 = kotlin.C.a(new e());
        this.f45826m0 = a7;
        a8 = kotlin.C.a(new g());
        this.f45827n0 = a8;
        this.f45828o0 = C1115z.w(20.0f);
        this.f45831r0 = -1;
        r(context, attributeSet);
    }
}
