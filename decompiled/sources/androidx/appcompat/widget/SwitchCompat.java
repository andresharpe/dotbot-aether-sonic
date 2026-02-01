package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.InterfaceC0580x;
import androidx.core.view.C0823k0;
import androidx.emoji2.text.g;
import d.C2042a;
import e.C2046a;
import g.C2055a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton implements N {

    /* renamed from: A0, reason: collision with root package name */
    private static final int f5860A0 = 0;

    /* renamed from: B0, reason: collision with root package name */
    private static final int f5861B0 = 1;

    /* renamed from: C0, reason: collision with root package name */
    private static final int f5862C0 = 2;

    /* renamed from: D0, reason: collision with root package name */
    private static final String f5863D0 = "android.widget.Switch";

    /* renamed from: E0, reason: collision with root package name */
    private static final int f5864E0 = 1;

    /* renamed from: F0, reason: collision with root package name */
    private static final int f5865F0 = 2;

    /* renamed from: G0, reason: collision with root package name */
    private static final int f5866G0 = 3;

    /* renamed from: H0, reason: collision with root package name */
    private static final Property<SwitchCompat, Float> f5867H0 = new a(Float.class, "thumbPos");

    /* renamed from: I0, reason: collision with root package name */
    private static final int[] f5868I0 = {R.attr.state_checked};

    /* renamed from: z0, reason: collision with root package name */
    private static final int f5869z0 = 250;

    /* renamed from: E, reason: collision with root package name */
    private Drawable f5870E;

    /* renamed from: F, reason: collision with root package name */
    private ColorStateList f5871F;

    /* renamed from: G, reason: collision with root package name */
    private PorterDuff.Mode f5872G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f5873H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f5874I;

    /* renamed from: J, reason: collision with root package name */
    private Drawable f5875J;

    /* renamed from: K, reason: collision with root package name */
    private ColorStateList f5876K;

    /* renamed from: L, reason: collision with root package name */
    private PorterDuff.Mode f5877L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f5878M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f5879N;

    /* renamed from: O, reason: collision with root package name */
    private int f5880O;

    /* renamed from: P, reason: collision with root package name */
    private int f5881P;

    /* renamed from: Q, reason: collision with root package name */
    private int f5882Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f5883R;

    /* renamed from: S, reason: collision with root package name */
    private CharSequence f5884S;

    /* renamed from: T, reason: collision with root package name */
    private CharSequence f5885T;

    /* renamed from: U, reason: collision with root package name */
    private CharSequence f5886U;

    /* renamed from: V, reason: collision with root package name */
    private CharSequence f5887V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f5888W;

    /* renamed from: a0, reason: collision with root package name */
    private int f5889a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f5890b0;

    /* renamed from: c0, reason: collision with root package name */
    private float f5891c0;

    /* renamed from: d0, reason: collision with root package name */
    private float f5892d0;

    /* renamed from: e0, reason: collision with root package name */
    private VelocityTracker f5893e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f5894f0;

    /* renamed from: g0, reason: collision with root package name */
    float f5895g0;

    /* renamed from: h0, reason: collision with root package name */
    private int f5896h0;

    /* renamed from: i0, reason: collision with root package name */
    private int f5897i0;

    /* renamed from: j0, reason: collision with root package name */
    private int f5898j0;

    /* renamed from: k0, reason: collision with root package name */
    private int f5899k0;

    /* renamed from: l0, reason: collision with root package name */
    private int f5900l0;

    /* renamed from: m0, reason: collision with root package name */
    private int f5901m0;

    /* renamed from: n0, reason: collision with root package name */
    private int f5902n0;

    /* renamed from: o0, reason: collision with root package name */
    private boolean f5903o0;

    /* renamed from: p0, reason: collision with root package name */
    private final TextPaint f5904p0;

    /* renamed from: q0, reason: collision with root package name */
    private ColorStateList f5905q0;

    /* renamed from: r0, reason: collision with root package name */
    private Layout f5906r0;

    /* renamed from: s0, reason: collision with root package name */
    private Layout f5907s0;

    /* renamed from: t0, reason: collision with root package name */
    @androidx.annotation.P
    private TransformationMethod f5908t0;

    /* renamed from: u0, reason: collision with root package name */
    ObjectAnimator f5909u0;

    /* renamed from: v0, reason: collision with root package name */
    private final A f5910v0;

    /* renamed from: w0, reason: collision with root package name */
    @androidx.annotation.N
    private C0602o f5911w0;

    /* renamed from: x0, reason: collision with root package name */
    @androidx.annotation.P
    private c f5912x0;

    /* renamed from: y0, reason: collision with root package name */
    private final Rect f5913y0;

    /* loaded from: classes.dex */
    class a extends Property<SwitchCompat, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f5895g0);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f4) {
            switchCompat.setThumbPosition(f4.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(18)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @InterfaceC0577u
        static void a(ObjectAnimator objectAnimator, boolean z3) {
            objectAnimator.setAutoCancel(z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends g.f {

        /* renamed from: a, reason: collision with root package name */
        private final Reference<SwitchCompat> f5914a;

        c(SwitchCompat switchCompat) {
            this.f5914a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.g.f
        public void a(@androidx.annotation.P Throwable th) {
            SwitchCompat switchCompat = this.f5914a.get();
            if (switchCompat != null) {
                switchCompat.k();
            }
        }

        @Override // androidx.emoji2.text.g.f
        public void b() {
            SwitchCompat switchCompat = this.f5914a.get();
            if (switchCompat != null) {
                switchCompat.k();
            }
        }
    }

    public SwitchCompat(@androidx.annotation.N Context context) {
        this(context, null);
    }

    private void a(boolean z3) {
        float f4;
        if (z3) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f5867H0, f4);
        this.f5909u0 = ofFloat;
        ofFloat.setDuration(250L);
        b.a(this.f5909u0, true);
        this.f5909u0.start();
    }

    private void c() {
        Drawable drawable = this.f5870E;
        if (drawable != null) {
            if (this.f5873H || this.f5874I) {
                Drawable mutate = androidx.core.graphics.drawable.d.r(drawable).mutate();
                this.f5870E = mutate;
                if (this.f5873H) {
                    androidx.core.graphics.drawable.d.o(mutate, this.f5871F);
                }
                if (this.f5874I) {
                    androidx.core.graphics.drawable.d.p(this.f5870E, this.f5872G);
                }
                if (this.f5870E.isStateful()) {
                    this.f5870E.setState(getDrawableState());
                }
            }
        }
    }

    private void d() {
        Drawable drawable = this.f5875J;
        if (drawable != null) {
            if (this.f5878M || this.f5879N) {
                Drawable mutate = androidx.core.graphics.drawable.d.r(drawable).mutate();
                this.f5875J = mutate;
                if (this.f5878M) {
                    androidx.core.graphics.drawable.d.o(mutate, this.f5876K);
                }
                if (this.f5879N) {
                    androidx.core.graphics.drawable.d.p(this.f5875J, this.f5877L);
                }
                if (this.f5875J.isStateful()) {
                    this.f5875J.setState(getDrawableState());
                }
            }
        }
    }

    private void e() {
        ObjectAnimator objectAnimator = this.f5909u0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void f(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    private static float g(float f4, float f5, float f6) {
        return f4 < f5 ? f5 : f4 > f6 ? f6 : f4;
    }

    @androidx.annotation.N
    private C0602o getEmojiTextViewHelper() {
        if (this.f5911w0 == null) {
            this.f5911w0 = new C0602o(this);
        }
        return this.f5911w0;
    }

    private boolean getTargetCheckedState() {
        if (this.f5895g0 > 0.5f) {
            return true;
        }
        return false;
    }

    private int getThumbOffset() {
        float f4;
        if (q0.b(this)) {
            f4 = 1.0f - this.f5895g0;
        } else {
            f4 = this.f5895g0;
        }
        return (int) ((f4 * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f5875J;
        if (drawable != null) {
            Rect rect2 = this.f5913y0;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.f5870E;
            if (drawable2 != null) {
                rect = L.d(drawable2);
            } else {
                rect = L.f5661c;
            }
            return ((((this.f5896h0 - this.f5898j0) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    @androidx.annotation.P
    private CharSequence h(@androidx.annotation.P CharSequence charSequence) {
        TransformationMethod f4 = getEmojiTextViewHelper().f(this.f5908t0);
        if (f4 != null) {
            return f4.getTransformation(charSequence, this);
        }
        return charSequence;
    }

    private boolean i(float f4, float f5) {
        if (this.f5870E == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f5870E.getPadding(this.f5913y0);
        int i4 = this.f5900l0;
        int i5 = this.f5890b0;
        int i6 = i4 - i5;
        int i7 = (this.f5899k0 + thumbOffset) - i5;
        int i8 = this.f5898j0 + i7;
        Rect rect = this.f5913y0;
        int i9 = i8 + rect.left + rect.right + i5;
        int i10 = this.f5902n0 + i5;
        if (f4 <= i7 || f4 >= i9 || f5 <= i6 || f5 >= i10) {
            return false;
        }
        return true;
    }

    private Layout j(CharSequence charSequence) {
        int i4;
        TextPaint textPaint = this.f5904p0;
        if (charSequence != null) {
            i4 = (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
        } else {
            i4 = 0;
        }
        return new StaticLayout(charSequence, textPaint, i4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f5886U;
            if (charSequence == null) {
                charSequence = getResources().getString(C2042a.k.f49719g);
            }
            C0823k0.q2(this, charSequence);
        }
    }

    private void m() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f5884S;
            if (charSequence == null) {
                charSequence = getResources().getString(C2042a.k.f49720h);
            }
            C0823k0.q2(this, charSequence);
        }
    }

    private void p(int i4, int i5) {
        Typeface typeface;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    typeface = null;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
            } else {
                typeface = Typeface.SERIF;
            }
        } else {
            typeface = Typeface.SANS_SERIF;
        }
        o(typeface, i5);
    }

    private void q() {
        if (this.f5912x0 == null && this.f5911w0.b() && androidx.emoji2.text.g.n()) {
            androidx.emoji2.text.g b4 = androidx.emoji2.text.g.b();
            int f4 = b4.f();
            if (f4 == 3 || f4 == 0) {
                c cVar = new c(this);
                this.f5912x0 = cVar;
                b4.y(cVar);
            }
        }
    }

    private void r(MotionEvent motionEvent) {
        boolean z3;
        this.f5889a0 = 0;
        boolean z4 = true;
        if (motionEvent.getAction() == 1 && isEnabled()) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean isChecked = isChecked();
        if (z3) {
            this.f5893e0.computeCurrentVelocity(1000);
            float xVelocity = this.f5893e0.getXVelocity();
            if (Math.abs(xVelocity) > this.f5894f0) {
                if (!q0.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                    z4 = false;
                }
            } else {
                z4 = getTargetCheckedState();
            }
        } else {
            z4 = isChecked;
        }
        if (z4 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z4);
        f(motionEvent);
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f5886U = charSequence;
        this.f5887V = h(charSequence);
        this.f5907s0 = null;
        if (this.f5888W) {
            q();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f5884S = charSequence;
        this.f5885T = h(charSequence);
        this.f5906r0 = null;
        if (this.f5888W) {
            q();
        }
    }

    @Override // androidx.appcompat.widget.N
    public boolean b() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Rect rect;
        int i4;
        int i5;
        Rect rect2 = this.f5913y0;
        int i6 = this.f5899k0;
        int i7 = this.f5900l0;
        int i8 = this.f5901m0;
        int i9 = this.f5902n0;
        int thumbOffset = getThumbOffset() + i6;
        Drawable drawable = this.f5870E;
        if (drawable != null) {
            rect = L.d(drawable);
        } else {
            rect = L.f5661c;
        }
        Drawable drawable2 = this.f5875J;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i10 = rect2.left;
            thumbOffset += i10;
            if (rect != null) {
                int i11 = rect.left;
                if (i11 > i10) {
                    i6 += i11 - i10;
                }
                int i12 = rect.top;
                int i13 = rect2.top;
                if (i12 > i13) {
                    i4 = (i12 - i13) + i7;
                } else {
                    i4 = i7;
                }
                int i14 = rect.right;
                int i15 = rect2.right;
                if (i14 > i15) {
                    i8 -= i14 - i15;
                }
                int i16 = rect.bottom;
                int i17 = rect2.bottom;
                if (i16 > i17) {
                    i5 = i9 - (i16 - i17);
                    this.f5875J.setBounds(i6, i4, i8, i5);
                }
            } else {
                i4 = i7;
            }
            i5 = i9;
            this.f5875J.setBounds(i6, i4, i8, i5);
        }
        Drawable drawable3 = this.f5870E;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i18 = thumbOffset - rect2.left;
            int i19 = thumbOffset + this.f5898j0 + rect2.right;
            this.f5870E.setBounds(i18, i7, i19, i9);
            Drawable background = getBackground();
            if (background != null) {
                androidx.core.graphics.drawable.d.l(background, i18, i7, i19, i9);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f4, float f5) {
        super.drawableHotspotChanged(f4, f5);
        Drawable drawable = this.f5870E;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.k(drawable, f4, f5);
        }
        Drawable drawable2 = this.f5875J;
        if (drawable2 != null) {
            androidx.core.graphics.drawable.d.k(drawable2, f4, f5);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        boolean z3;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f5870E;
        if (drawable != null && drawable.isStateful()) {
            z3 = drawable.setState(drawableState);
        } else {
            z3 = false;
        }
        Drawable drawable2 = this.f5875J;
        if (drawable2 != null && drawable2.isStateful()) {
            z3 |= drawable2.setState(drawableState);
        }
        if (z3) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!q0.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f5896h0;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.f5882Q;
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (q0.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f5896h0;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.f5882Q;
        }
        return compoundPaddingRight;
    }

    @Override // android.widget.TextView
    @androidx.annotation.P
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.r.G(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f5888W;
    }

    public boolean getSplitTrack() {
        return this.f5883R;
    }

    public int getSwitchMinWidth() {
        return this.f5881P;
    }

    public int getSwitchPadding() {
        return this.f5882Q;
    }

    public CharSequence getTextOff() {
        return this.f5886U;
    }

    public CharSequence getTextOn() {
        return this.f5884S;
    }

    public Drawable getThumbDrawable() {
        return this.f5870E;
    }

    @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n, to = 1.0d)
    protected final float getThumbPosition() {
        return this.f5895g0;
    }

    public int getThumbTextPadding() {
        return this.f5880O;
    }

    @androidx.annotation.P
    public ColorStateList getThumbTintList() {
        return this.f5871F;
    }

    @androidx.annotation.P
    public PorterDuff.Mode getThumbTintMode() {
        return this.f5872G;
    }

    public Drawable getTrackDrawable() {
        return this.f5875J;
    }

    @androidx.annotation.P
    public ColorStateList getTrackTintList() {
        return this.f5876K;
    }

    @androidx.annotation.P
    public PorterDuff.Mode getTrackTintMode() {
        return this.f5877L;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f5870E;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f5875J;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f5909u0;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f5909u0.end();
            this.f5909u0 = null;
        }
    }

    void k() {
        setTextOnInternal(this.f5884S);
        setTextOffInternal(this.f5886U);
        requestLayout();
    }

    public void n(Context context, int i4) {
        g0 E3 = g0.E(context, i4, C2042a.m.O5);
        ColorStateList d4 = E3.d(C2042a.m.S5);
        if (d4 != null) {
            this.f5905q0 = d4;
        } else {
            this.f5905q0 = getTextColors();
        }
        int g4 = E3.g(C2042a.m.P5, 0);
        if (g4 != 0) {
            float f4 = g4;
            if (f4 != this.f5904p0.getTextSize()) {
                this.f5904p0.setTextSize(f4);
                requestLayout();
            }
        }
        p(E3.o(C2042a.m.Q5, -1), E3.o(C2042a.m.R5, -1));
        if (E3.a(C2042a.m.d6, false)) {
            this.f5908t0 = new C2055a(getContext());
        } else {
            this.f5908t0 = null;
        }
        setTextOnInternal(this.f5884S);
        setTextOffInternal(this.f5886U);
        E3.I();
    }

    public void o(Typeface typeface, int i4) {
        Typeface create;
        int i5;
        float f4 = 0.0f;
        boolean z3 = false;
        if (i4 > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i4);
            } else {
                create = Typeface.create(typeface, i4);
            }
            setSwitchTypeface(create);
            if (create != null) {
                i5 = create.getStyle();
            } else {
                i5 = 0;
            }
            int i6 = (~i5) & i4;
            TextPaint textPaint = this.f5904p0;
            if ((i6 & 1) != 0) {
                z3 = true;
            }
            textPaint.setFakeBoldText(z3);
            TextPaint textPaint2 = this.f5904p0;
            if ((i6 & 2) != 0) {
                f4 = -0.25f;
            }
            textPaint2.setTextSkewX(f4);
            return;
        }
        this.f5904p0.setFakeBoldText(false);
        this.f5904p0.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f5868I0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Layout layout;
        int width;
        super.onDraw(canvas);
        Rect rect = this.f5913y0;
        Drawable drawable = this.f5875J;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i4 = this.f5900l0;
        int i5 = this.f5902n0;
        int i6 = i4 + rect.top;
        int i7 = i5 - rect.bottom;
        Drawable drawable2 = this.f5870E;
        if (drawable != null) {
            if (this.f5883R && drawable2 != null) {
                Rect d4 = L.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d4.left;
                rect.right -= d4.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            layout = this.f5906r0;
        } else {
            layout = this.f5907s0;
        }
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f5905q0;
            if (colorStateList != null) {
                this.f5904p0.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f5904p0.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i6 + i7) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(f5863D0);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(f5863D0);
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.f5884S;
            } else {
                charSequence = this.f5886U;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int i8;
        int width;
        int i9;
        int i10;
        int i11;
        int i12;
        super.onLayout(z3, i4, i5, i6, i7);
        int i13 = 0;
        if (this.f5870E != null) {
            Rect rect = this.f5913y0;
            Drawable drawable = this.f5875J;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d4 = L.d(this.f5870E);
            i8 = Math.max(0, d4.left - rect.left);
            i13 = Math.max(0, d4.right - rect.right);
        } else {
            i8 = 0;
        }
        if (q0.b(this)) {
            i9 = getPaddingLeft() + i8;
            width = ((this.f5896h0 + i9) - i8) - i13;
        } else {
            width = (getWidth() - getPaddingRight()) - i13;
            i9 = (width - this.f5896h0) + i8 + i13;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                i11 = getPaddingTop();
                i10 = this.f5897i0;
            } else {
                i12 = getHeight() - getPaddingBottom();
                i11 = i12 - this.f5897i0;
                this.f5899k0 = i9;
                this.f5900l0 = i11;
                this.f5902n0 = i12;
                this.f5901m0 = width;
            }
        } else {
            int paddingTop = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i10 = this.f5897i0;
            i11 = paddingTop - (i10 / 2);
        }
        i12 = i10 + i11;
        this.f5899k0 = i9;
        this.f5900l0 = i11;
        this.f5902n0 = i12;
        this.f5901m0 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        if (this.f5888W) {
            if (this.f5906r0 == null) {
                this.f5906r0 = j(this.f5885T);
            }
            if (this.f5907s0 == null) {
                this.f5907s0 = j(this.f5887V);
            }
        }
        Rect rect = this.f5913y0;
        Drawable drawable = this.f5870E;
        int i10 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i6 = (this.f5870E.getIntrinsicWidth() - rect.left) - rect.right;
            i7 = this.f5870E.getIntrinsicHeight();
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (this.f5888W) {
            i8 = Math.max(this.f5906r0.getWidth(), this.f5907s0.getWidth()) + (this.f5880O * 2);
        } else {
            i8 = 0;
        }
        this.f5898j0 = Math.max(i8, i6);
        Drawable drawable2 = this.f5875J;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i10 = this.f5875J.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i11 = rect.left;
        int i12 = rect.right;
        Drawable drawable3 = this.f5870E;
        if (drawable3 != null) {
            Rect d4 = L.d(drawable3);
            i11 = Math.max(i11, d4.left);
            i12 = Math.max(i12, d4.right);
        }
        if (this.f5903o0) {
            i9 = Math.max(this.f5881P, (this.f5898j0 * 2) + i11 + i12);
        } else {
            i9 = this.f5881P;
        }
        int max = Math.max(i10, i7);
        this.f5896h0 = i9;
        this.f5897i0 = max;
        super.onMeasure(i4, i5);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.f5884S;
        } else {
            charSequence = this.f5886U;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r0 != 3) goto L44;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f5893e0
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9d
            r2 = 2
            if (r0 == r1) goto L89
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L89
            goto Lb7
        L16:
            int r0 = r6.f5889a0
            if (r0 == r1) goto L55
            if (r0 == r2) goto L1e
            goto Lb7
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f5891c0
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3b
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L38
            r2 = r3
            goto L3b
        L38:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L3b:
            boolean r0 = androidx.appcompat.widget.q0.b(r6)
            if (r0 == 0) goto L42
            float r2 = -r2
        L42:
            float r0 = r6.f5895g0
            float r0 = r0 + r2
            float r0 = g(r0, r4, r3)
            float r2 = r6.f5895g0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L54
            r6.f5891c0 = r7
            r6.setThumbPosition(r0)
        L54:
            return r1
        L55:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f5891c0
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f5890b0
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7b
            float r4 = r6.f5892d0
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f5890b0
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb7
        L7b:
            r6.f5889a0 = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f5891c0 = r0
            r6.f5892d0 = r3
            return r1
        L89:
            int r0 = r6.f5889a0
            if (r0 != r2) goto L94
            r6.r(r7)
            super.onTouchEvent(r7)
            return r1
        L94:
            r0 = 0
            r6.f5889a0 = r0
            android.view.VelocityTracker r0 = r6.f5893e0
            r0.clear()
            goto Lb7
        L9d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb7
            boolean r3 = r6.i(r0, r2)
            if (r3 == 0) goto Lb7
            r6.f5889a0 = r1
            r6.f5891c0 = r0
            r6.f5892d0 = r2
        Lb7:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().d(z3);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z3) {
        float f4;
        super.setChecked(z3);
        boolean isChecked = isChecked();
        if (isChecked) {
            m();
        } else {
            l();
        }
        if (getWindowToken() != null && C0823k0.U0(this)) {
            a(isChecked);
            return;
        }
        e();
        if (isChecked) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        setThumbPosition(f4);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@androidx.annotation.P ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.r.H(this, callback));
    }

    @Override // androidx.appcompat.widget.N
    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().e(z3);
        setTextOnInternal(this.f5884S);
        setTextOffInternal(this.f5886U);
        requestLayout();
    }

    protected final void setEnforceSwitchWidth(boolean z3) {
        this.f5903o0 = z3;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(@androidx.annotation.N InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z3) {
        if (this.f5888W != z3) {
            this.f5888W = z3;
            requestLayout();
            if (z3) {
                q();
            }
        }
    }

    public void setSplitTrack(boolean z3) {
        this.f5883R = z3;
        invalidate();
    }

    public void setSwitchMinWidth(int i4) {
        this.f5881P = i4;
        requestLayout();
    }

    public void setSwitchPadding(int i4) {
        this.f5882Q = i4;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f5904p0.getTypeface() != null && !this.f5904p0.getTypeface().equals(typeface)) || (this.f5904p0.getTypeface() == null && typeface != null)) {
            this.f5904p0.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked()) {
            l();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            m();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f5870E;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f5870E = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f4) {
        this.f5895g0 = f4;
        invalidate();
    }

    public void setThumbResource(int i4) {
        setThumbDrawable(C2046a.b(getContext(), i4));
    }

    public void setThumbTextPadding(int i4) {
        this.f5880O = i4;
        requestLayout();
    }

    public void setThumbTintList(@androidx.annotation.P ColorStateList colorStateList) {
        this.f5871F = colorStateList;
        this.f5873H = true;
        c();
    }

    public void setThumbTintMode(@androidx.annotation.P PorterDuff.Mode mode) {
        this.f5872G = mode;
        this.f5874I = true;
        c();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f5875J;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f5875J = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i4) {
        setTrackDrawable(C2046a.b(getContext(), i4));
    }

    public void setTrackTintList(@androidx.annotation.P ColorStateList colorStateList) {
        this.f5876K = colorStateList;
        this.f5878M = true;
        d();
    }

    public void setTrackTintMode(@androidx.annotation.P PorterDuff.Mode mode) {
        this.f5877L = mode;
        this.f5879N = true;
        d();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f5870E && drawable != this.f5875J) {
            return false;
        }
        return true;
    }

    public SwitchCompat(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet) {
        this(context, attributeSet, C2042a.b.f49254l3);
    }

    public SwitchCompat(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f5871F = null;
        this.f5872G = null;
        this.f5873H = false;
        this.f5874I = false;
        this.f5876K = null;
        this.f5877L = null;
        this.f5878M = false;
        this.f5879N = false;
        this.f5893e0 = VelocityTracker.obtain();
        this.f5903o0 = true;
        this.f5913y0 = new Rect();
        b0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f5904p0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        g0 G3 = g0.G(context, attributeSet, C2042a.m.z5, i4, 0);
        C0823k0.z1(this, context, C2042a.m.z5, attributeSet, G3.B(), i4, 0);
        Drawable h4 = G3.h(C2042a.m.C5);
        this.f5870E = h4;
        if (h4 != null) {
            h4.setCallback(this);
        }
        Drawable h5 = G3.h(C2042a.m.L5);
        this.f5875J = h5;
        if (h5 != null) {
            h5.setCallback(this);
        }
        setTextOnInternal(G3.x(C2042a.m.A5));
        setTextOffInternal(G3.x(C2042a.m.B5));
        this.f5888W = G3.a(C2042a.m.D5, true);
        this.f5880O = G3.g(C2042a.m.I5, 0);
        this.f5881P = G3.g(C2042a.m.F5, 0);
        this.f5882Q = G3.g(C2042a.m.G5, 0);
        this.f5883R = G3.a(C2042a.m.E5, false);
        ColorStateList d4 = G3.d(C2042a.m.J5);
        if (d4 != null) {
            this.f5871F = d4;
            this.f5873H = true;
        }
        PorterDuff.Mode e4 = L.e(G3.o(C2042a.m.K5, -1), null);
        if (this.f5872G != e4) {
            this.f5872G = e4;
            this.f5874I = true;
        }
        if (this.f5873H || this.f5874I) {
            c();
        }
        ColorStateList d5 = G3.d(C2042a.m.M5);
        if (d5 != null) {
            this.f5876K = d5;
            this.f5878M = true;
        }
        PorterDuff.Mode e5 = L.e(G3.o(C2042a.m.N5, -1), null);
        if (this.f5877L != e5) {
            this.f5877L = e5;
            this.f5879N = true;
        }
        if (this.f5878M || this.f5879N) {
            d();
        }
        int u3 = G3.u(C2042a.m.H5, 0);
        if (u3 != 0) {
            n(context, u3);
        }
        A a4 = new A(this);
        this.f5910v0 = a4;
        a4.m(attributeSet, i4);
        G3.I();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f5890b0 = viewConfiguration.getScaledTouchSlop();
        this.f5894f0 = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i4);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
